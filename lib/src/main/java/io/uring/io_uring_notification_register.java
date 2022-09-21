// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class io_uring_notification_register {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("nr_slots"),
        Constants$root.C_INT$LAYOUT.withName("resv"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("resv2"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("data"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("resv3")
    ).withName("io_uring_notification_register");
    public static MemoryLayout $LAYOUT() {
        return io_uring_notification_register.$struct$LAYOUT;
    }
    static final VarHandle nr_slots$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nr_slots"));
    public static VarHandle nr_slots$VH() {
        return io_uring_notification_register.nr_slots$VH;
    }
    public static int nr_slots$get(MemorySegment seg) {
        return (int)io_uring_notification_register.nr_slots$VH.get(seg);
    }
    public static void nr_slots$set( MemorySegment seg, int x) {
        io_uring_notification_register.nr_slots$VH.set(seg, x);
    }
    public static int nr_slots$get(MemorySegment seg, long index) {
        return (int)io_uring_notification_register.nr_slots$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nr_slots$set(MemorySegment seg, long index, int x) {
        io_uring_notification_register.nr_slots$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("resv"));
    public static VarHandle resv$VH() {
        return io_uring_notification_register.resv$VH;
    }
    public static int resv$get(MemorySegment seg) {
        return (int)io_uring_notification_register.resv$VH.get(seg);
    }
    public static void resv$set( MemorySegment seg, int x) {
        io_uring_notification_register.resv$VH.set(seg, x);
    }
    public static int resv$get(MemorySegment seg, long index) {
        return (int)io_uring_notification_register.resv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv$set(MemorySegment seg, long index, int x) {
        io_uring_notification_register.resv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resv2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("resv2"));
    public static VarHandle resv2$VH() {
        return io_uring_notification_register.resv2$VH;
    }
    public static long resv2$get(MemorySegment seg) {
        return (long)io_uring_notification_register.resv2$VH.get(seg);
    }
    public static void resv2$set( MemorySegment seg, long x) {
        io_uring_notification_register.resv2$VH.set(seg, x);
    }
    public static long resv2$get(MemorySegment seg, long index) {
        return (long)io_uring_notification_register.resv2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv2$set(MemorySegment seg, long index, long x) {
        io_uring_notification_register.resv2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return io_uring_notification_register.data$VH;
    }
    public static long data$get(MemorySegment seg) {
        return (long)io_uring_notification_register.data$VH.get(seg);
    }
    public static void data$set( MemorySegment seg, long x) {
        io_uring_notification_register.data$VH.set(seg, x);
    }
    public static long data$get(MemorySegment seg, long index) {
        return (long)io_uring_notification_register.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, long x) {
        io_uring_notification_register.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resv3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("resv3"));
    public static VarHandle resv3$VH() {
        return io_uring_notification_register.resv3$VH;
    }
    public static long resv3$get(MemorySegment seg) {
        return (long)io_uring_notification_register.resv3$VH.get(seg);
    }
    public static void resv3$set( MemorySegment seg, long x) {
        io_uring_notification_register.resv3$VH.set(seg, x);
    }
    public static long resv3$get(MemorySegment seg, long index) {
        return (long)io_uring_notification_register.resv3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv3$set(MemorySegment seg, long index, long x) {
        io_uring_notification_register.resv3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


