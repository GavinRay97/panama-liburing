// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class io_uring_probe_op {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("op"),
        Constants$root.C_CHAR$LAYOUT.withName("resv"),
        Constants$root.C_SHORT$LAYOUT.withName("flags"),
        Constants$root.C_INT$LAYOUT.withName("resv2")
    ).withName("io_uring_probe_op");
    public static MemoryLayout $LAYOUT() {
        return io_uring_probe_op.$struct$LAYOUT;
    }
    static final VarHandle op$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("op"));
    public static VarHandle op$VH() {
        return io_uring_probe_op.op$VH;
    }
    public static byte op$get(MemorySegment seg) {
        return (byte)io_uring_probe_op.op$VH.get(seg);
    }
    public static void op$set( MemorySegment seg, byte x) {
        io_uring_probe_op.op$VH.set(seg, x);
    }
    public static byte op$get(MemorySegment seg, long index) {
        return (byte)io_uring_probe_op.op$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void op$set(MemorySegment seg, long index, byte x) {
        io_uring_probe_op.op$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("resv"));
    public static VarHandle resv$VH() {
        return io_uring_probe_op.resv$VH;
    }
    public static byte resv$get(MemorySegment seg) {
        return (byte)io_uring_probe_op.resv$VH.get(seg);
    }
    public static void resv$set( MemorySegment seg, byte x) {
        io_uring_probe_op.resv$VH.set(seg, x);
    }
    public static byte resv$get(MemorySegment seg, long index) {
        return (byte)io_uring_probe_op.resv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv$set(MemorySegment seg, long index, byte x) {
        io_uring_probe_op.resv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return io_uring_probe_op.flags$VH;
    }
    public static short flags$get(MemorySegment seg) {
        return (short)io_uring_probe_op.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, short x) {
        io_uring_probe_op.flags$VH.set(seg, x);
    }
    public static short flags$get(MemorySegment seg, long index) {
        return (short)io_uring_probe_op.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, short x) {
        io_uring_probe_op.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle resv2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("resv2"));
    public static VarHandle resv2$VH() {
        return io_uring_probe_op.resv2$VH;
    }
    public static int resv2$get(MemorySegment seg) {
        return (int)io_uring_probe_op.resv2$VH.get(seg);
    }
    public static void resv2$set( MemorySegment seg, int x) {
        io_uring_probe_op.resv2$VH.set(seg, x);
    }
    public static int resv2$get(MemorySegment seg, long index) {
        return (int)io_uring_probe_op.resv2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void resv2$set(MemorySegment seg, long index, int x) {
        io_uring_probe_op.resv2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


