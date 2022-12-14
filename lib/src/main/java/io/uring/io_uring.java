// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class io_uring {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("khead"),
            Constants$root.C_POINTER$LAYOUT.withName("ktail"),
            Constants$root.C_POINTER$LAYOUT.withName("kring_mask"),
            Constants$root.C_POINTER$LAYOUT.withName("kring_entries"),
            Constants$root.C_POINTER$LAYOUT.withName("kflags"),
            Constants$root.C_POINTER$LAYOUT.withName("kdropped"),
            Constants$root.C_POINTER$LAYOUT.withName("array"),
            Constants$root.C_POINTER$LAYOUT.withName("sqes"),
            Constants$root.C_INT$LAYOUT.withName("sqe_head"),
            Constants$root.C_INT$LAYOUT.withName("sqe_tail"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("ring_sz"),
            Constants$root.C_POINTER$LAYOUT.withName("ring_ptr"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_INT$LAYOUT).withName("pad")
        ).withName("sq"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("khead"),
            Constants$root.C_POINTER$LAYOUT.withName("ktail"),
            Constants$root.C_POINTER$LAYOUT.withName("kring_mask"),
            Constants$root.C_POINTER$LAYOUT.withName("kring_entries"),
            Constants$root.C_POINTER$LAYOUT.withName("kflags"),
            Constants$root.C_POINTER$LAYOUT.withName("koverflow"),
            Constants$root.C_POINTER$LAYOUT.withName("cqes"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("ring_sz"),
            Constants$root.C_POINTER$LAYOUT.withName("ring_ptr"),
            MemoryLayout.sequenceLayout(4, Constants$root.C_INT$LAYOUT).withName("pad")
        ).withName("cq"),
        Constants$root.C_INT$LAYOUT.withName("flags"),
        Constants$root.C_INT$LAYOUT.withName("ring_fd"),
        Constants$root.C_INT$LAYOUT.withName("features"),
        Constants$root.C_INT$LAYOUT.withName("enter_ring_fd"),
        Constants$root.C_CHAR$LAYOUT.withName("int_flags"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_CHAR$LAYOUT).withName("pad"),
        Constants$root.C_INT$LAYOUT.withName("pad2")
    ).withName("io_uring");
    public static MemoryLayout $LAYOUT() {
        return io_uring.$struct$LAYOUT;
    }
    public static MemorySegment sq$slice(MemorySegment seg) {
        return seg.asSlice(0, 104);
    }
    public static MemorySegment cq$slice(MemorySegment seg) {
        return seg.asSlice(104, 88);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return io_uring.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)io_uring.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        io_uring.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)io_uring.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        io_uring.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ring_fd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ring_fd"));
    public static VarHandle ring_fd$VH() {
        return io_uring.ring_fd$VH;
    }
    public static int ring_fd$get(MemorySegment seg) {
        return (int)io_uring.ring_fd$VH.get(seg);
    }
    public static void ring_fd$set( MemorySegment seg, int x) {
        io_uring.ring_fd$VH.set(seg, x);
    }
    public static int ring_fd$get(MemorySegment seg, long index) {
        return (int)io_uring.ring_fd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ring_fd$set(MemorySegment seg, long index, int x) {
        io_uring.ring_fd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle features$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("features"));
    public static VarHandle features$VH() {
        return io_uring.features$VH;
    }
    public static int features$get(MemorySegment seg) {
        return (int)io_uring.features$VH.get(seg);
    }
    public static void features$set( MemorySegment seg, int x) {
        io_uring.features$VH.set(seg, x);
    }
    public static int features$get(MemorySegment seg, long index) {
        return (int)io_uring.features$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void features$set(MemorySegment seg, long index, int x) {
        io_uring.features$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle enter_ring_fd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("enter_ring_fd"));
    public static VarHandle enter_ring_fd$VH() {
        return io_uring.enter_ring_fd$VH;
    }
    public static int enter_ring_fd$get(MemorySegment seg) {
        return (int)io_uring.enter_ring_fd$VH.get(seg);
    }
    public static void enter_ring_fd$set( MemorySegment seg, int x) {
        io_uring.enter_ring_fd$VH.set(seg, x);
    }
    public static int enter_ring_fd$get(MemorySegment seg, long index) {
        return (int)io_uring.enter_ring_fd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void enter_ring_fd$set(MemorySegment seg, long index, int x) {
        io_uring.enter_ring_fd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle int_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("int_flags"));
    public static VarHandle int_flags$VH() {
        return io_uring.int_flags$VH;
    }
    public static byte int_flags$get(MemorySegment seg) {
        return (byte)io_uring.int_flags$VH.get(seg);
    }
    public static void int_flags$set( MemorySegment seg, byte x) {
        io_uring.int_flags$VH.set(seg, x);
    }
    public static byte int_flags$get(MemorySegment seg, long index) {
        return (byte)io_uring.int_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void int_flags$set(MemorySegment seg, long index, byte x) {
        io_uring.int_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment pad$slice(MemorySegment seg) {
        return seg.asSlice(209, 3);
    }
    static final VarHandle pad2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pad2"));
    public static VarHandle pad2$VH() {
        return io_uring.pad2$VH;
    }
    public static int pad2$get(MemorySegment seg) {
        return (int)io_uring.pad2$VH.get(seg);
    }
    public static void pad2$set( MemorySegment seg, int x) {
        io_uring.pad2$VH.set(seg, x);
    }
    public static int pad2$get(MemorySegment seg, long index) {
        return (int)io_uring.pad2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pad2$set(MemorySegment seg, long index, int x) {
        io_uring.pad2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


