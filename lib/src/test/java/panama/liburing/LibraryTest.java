package panama.liburing;

import io.uring.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import java.lang.foreign.*;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;

class Constants {
    static final ValueLayout.OfBoolean C_BOOL = ValueLayout.JAVA_BOOLEAN;
    static final ValueLayout.OfByte C_CHAR = ValueLayout.JAVA_BYTE;
    static final ValueLayout.OfShort C_SHORT = ValueLayout.JAVA_SHORT.withBitAlignment(16);
    static final ValueLayout.OfInt C_INT = ValueLayout.JAVA_INT.withBitAlignment(32);
    static final ValueLayout.OfLong C_LONG = ValueLayout.JAVA_LONG.withBitAlignment(64);
    static final ValueLayout.OfLong C_LONG_LONG = ValueLayout.JAVA_LONG.withBitAlignment(64);
    static final ValueLayout.OfFloat C_FLOAT = ValueLayout.JAVA_FLOAT.withBitAlignment(32);
    static final ValueLayout.OfDouble C_DOUBLE = ValueLayout.JAVA_DOUBLE.withBitAlignment(64);
    static final ValueLayout.OfAddress C_POINTER = ValueLayout.ADDRESS.withBitAlignment(64);
}

class IoUringExample {
    private static final int QUEUE_DEPTH = 8;
    private static final MemorySession session = MemorySession.global();

    private static final GroupLayout myStructLayout = MemoryLayout.structLayout(
            Constants.C_INT.withName("foo"),
            Constants.C_INT.withName("bar"));

    private static final VarHandle myStruct$foo = myStructLayout
            .varHandle(MemoryLayout.PathElement.groupElement("foo"));
    private static final VarHandle myStruct$bar = myStructLayout
            .varHandle(MemoryLayout.PathElement.groupElement("bar"));

    private static final int BLOCK_SIZE = 4096;

    public static void get_completion_and_print(MemoryAddress /* struct io_uring *ring */ io_uring_ptr)
            throws Throwable {
        // struct io_uring_cqe **cqeRef = malloc(sizeof *cqeRef);
        MemorySegment cqeRef = MemorySegment.allocateNative(Constants.C_POINTER, session);
        int ret = liburing.io_uring_wait_cqe(io_uring_ptr, cqeRef);
        if (ret < 0) {
            System.err.println("io_uring_wait_cqe: " + ret);
            return;
        }
        // struct io_uring_cqe *cqe = *cqeRef;
        MemoryAddress cqe = cqeRef.get(Constants.C_POINTER, 0);
        int res = io_uring_cqe.res$get(MemorySegment.ofAddress(cqe, io_uring_cqe.sizeof(), session));
        if (res < 0) {
            System.err.println("Async readv failed.");
            return;
        }

        // struct file_info *fi = io_uring_cqe_get_data(cqe);
        MemoryAddress fi_ptr = liburing.io_uring_cqe_get_data(cqe);
        MemorySegment fi = file_info.ofAddress(fi_ptr, session);

        long file_sz = file_info.file_sz$get(fi);
        int blocks = (int) (file_sz / BLOCK_SIZE);
        if (file_sz % BLOCK_SIZE != 0) blocks++;
        for (int i = 0; i < blocks; i++) {
            MemoryAddress iov_base = fi.address().addOffset(/* offsetof(file_info, iovecs) */ 8 + i * 16);
            MemorySegment iov = MemorySegment.ofAddress(iov_base, 16, session);
            long iov_len = iovec.iov_len$get(iov);
            MemoryAddress iov_base_ptr = iovec.iov_base$get(iov);
            MemorySegment iov_base_seg = MemorySegment.ofAddress(iov_base_ptr, iov_len, session);
            byte[] bytes = iov_base_seg.toArray(ValueLayout.JAVA_BYTE);
            System.out.println("iov_len: " + iov_len);
            System.out.println("iov_base: " + new String(bytes));
        }

        liburing.io_uring_cqe_seen(io_uring_ptr, cqe);
    }

    public static int getFileDescriptorNumber(FileDescriptor fd) {
        try {
            Field fdField = FileDescriptor.class.getDeclaredField("fd");
            fdField.setAccessible(true);
            return fdField.getInt(fd);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int submit_read_request(String file_path, MemoryAddress /* struct io_uring *ring */ ring_ptr)
            throws Throwable {
        RandomAccessFile raf = new RandomAccessFile(file_path, "r");

        int file_fd = getFileDescriptorNumber(raf.getFD());
        if (file_fd < 0) {
            System.err.println("open: " + file_fd);
            return 1;
        }

        long file_sz = raf.length();
        long bytes_remaining = file_sz;
        int current_block = 0;
        int blocks = (int) (file_sz / BLOCK_SIZE);
        if (file_sz % BLOCK_SIZE != 0) {
            blocks++;
        }
        MemorySegment fi = session.allocate(file_info.sizeof() + (iovec.sizeof() * blocks));

        while (bytes_remaining > 0) {
            long bytes_to_read = bytes_remaining;
            if (bytes_to_read > BLOCK_SIZE) {
                bytes_to_read = BLOCK_SIZE;
            }
            MemorySegment buf = session.allocate(BLOCK_SIZE, BLOCK_SIZE);
            MemorySegment iov = fi.asSlice(file_info.sizeof() + (iovec.sizeof() * current_block), iovec.sizeof());
            iovec.iov_len$set(iov, bytes_to_read);
            iovec.iov_base$set(iov, buf.address());
            current_block++;
            bytes_remaining -= bytes_to_read;
        }
        file_info.file_sz$set(fi, file_sz);

        MemoryAddress sqe_ptr = liburing.io_uring_get_sqe(ring_ptr);
        if (sqe_ptr == MemoryAddress.NULL) {
            System.err.println("io_uring_get_sqe: " + sqe_ptr);
            return 1;
        }

        long iovecs_ptr = fi.address().toRawLongValue() + file_info.sizeof();
        liburing.io_uring_prep_readv(sqe_ptr, file_fd, MemoryAddress.ofLong(iovecs_ptr), blocks, 0);
        liburing.io_uring_sqe_set_data(sqe_ptr, fi.address());
        int ret = liburing.io_uring_submit(ring_ptr);
        if (ret < 0) {
            System.err.println("io_uring_submit: " + ret);
            return 1;
        }

        return 0;
    }

    public static void run() {
        MemorySegment ring = session.allocate(io_uring.$LAYOUT());
        int ret = liburing.io_uring_queue_init(QUEUE_DEPTH, ring, 0);
        if (ret < 0) {
            System.out.printf("queue_init: %d", ret);
            return;
        }

        MemoryAddress sqePtr = liburing.io_uring_get_sqe(ring);
        if (sqePtr == MemoryAddress.NULL) {
            System.out.printf("get_sqe failed");
            return;
        }
        liburing.io_uring_prep_nop(sqePtr);

        MemorySegment myStruct = MemorySegment.allocateNative(myStructLayout, session);
        myStruct$foo.set(myStruct, 1);
        myStruct$bar.set(myStruct, 2);
        liburing.io_uring_sqe_set_data(sqePtr, myStruct);

        ret = liburing.io_uring_submit(ring);
        if (ret < 0) {
            System.out.printf("submit: %d", ret);
            return;
        }

        MemorySegment cqes = MemorySegment.allocateNative(io_uring_cqe.$LAYOUT(), session);
        ret = liburing.io_uring_wait_cqe(ring, cqes);
        if (ret < 0) {
            System.out.printf("wait_cqe: %d", ret);
            return;
        }

        // struct io_uring_cqe **cqeRef = malloc(sizeof *cqeRef);
        MemorySegment cqeRef = MemorySegment.allocateNative(Constants.C_POINTER, session);
        liburing.io_uring_wait_cqe(ring, cqeRef);
        // struct io_uring_cqe *cqe = *cqeRef;
        MemoryAddress cqe = cqeRef.get(Constants.C_POINTER, 0);
        MemoryAddress user_data = liburing.io_uring_cqe_get_data(cqe);
        MemorySegment user_data_segment = MemorySegment.ofAddress(user_data, myStructLayout.byteSize(), session);
        int foo = (int) myStruct$foo.get(user_data_segment);
        int bar = (int) myStruct$bar.get(user_data_segment);
        System.out.println("foo: " + foo + ", bar: " + bar);

        liburing.io_uring_cqe_seen(ring, cqe);
    }
}

class LibraryTest {
    private static MemorySession session = MemorySession.global();

    @Test
    void test() {
        Assertions.assertDoesNotThrow(IoUringExample::run);
    }

    @Test
    void testReadAndPrintFile() throws Throwable {
        MemorySegment ring = session.allocate(io_uring.$LAYOUT());
        int ret = liburing.io_uring_queue_init(8, ring, 0);
        if (ret < 0) {
            System.out.printf("queue_init: %d", ret);
            return;
        }

        ret = IoUringExample.submit_read_request("src/test/resources/test.txt", ring.address());
        if (ret < 0) {
            System.out.printf("submit_read_request: %d", ret);
            return;
        }

        IoUringExample.get_completion_and_print(ring.address());
    }
}
