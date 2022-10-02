// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class flock64 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("l_type"),
        Constants$root.C_SHORT$LAYOUT.withName("l_whence"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("l_start"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("l_len"),
        Constants$root.C_INT$LAYOUT.withName("l_pid"),
        MemoryLayout.paddingLayout(32)
    ).withName("flock64");
    public static MemoryLayout $LAYOUT() {
        return flock64.$struct$LAYOUT;
    }
    static final VarHandle l_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("l_type"));
    public static VarHandle l_type$VH() {
        return flock64.l_type$VH;
    }
    public static short l_type$get(MemorySegment seg) {
        return (short)flock64.l_type$VH.get(seg);
    }
    public static void l_type$set( MemorySegment seg, short x) {
        flock64.l_type$VH.set(seg, x);
    }
    public static short l_type$get(MemorySegment seg, long index) {
        return (short)flock64.l_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void l_type$set(MemorySegment seg, long index, short x) {
        flock64.l_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle l_whence$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("l_whence"));
    public static VarHandle l_whence$VH() {
        return flock64.l_whence$VH;
    }
    public static short l_whence$get(MemorySegment seg) {
        return (short)flock64.l_whence$VH.get(seg);
    }
    public static void l_whence$set( MemorySegment seg, short x) {
        flock64.l_whence$VH.set(seg, x);
    }
    public static short l_whence$get(MemorySegment seg, long index) {
        return (short)flock64.l_whence$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void l_whence$set(MemorySegment seg, long index, short x) {
        flock64.l_whence$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle l_start$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("l_start"));
    public static VarHandle l_start$VH() {
        return flock64.l_start$VH;
    }
    public static long l_start$get(MemorySegment seg) {
        return (long)flock64.l_start$VH.get(seg);
    }
    public static void l_start$set( MemorySegment seg, long x) {
        flock64.l_start$VH.set(seg, x);
    }
    public static long l_start$get(MemorySegment seg, long index) {
        return (long)flock64.l_start$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void l_start$set(MemorySegment seg, long index, long x) {
        flock64.l_start$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle l_len$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("l_len"));
    public static VarHandle l_len$VH() {
        return flock64.l_len$VH;
    }
    public static long l_len$get(MemorySegment seg) {
        return (long)flock64.l_len$VH.get(seg);
    }
    public static void l_len$set( MemorySegment seg, long x) {
        flock64.l_len$VH.set(seg, x);
    }
    public static long l_len$get(MemorySegment seg, long index) {
        return (long)flock64.l_len$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void l_len$set(MemorySegment seg, long index, long x) {
        flock64.l_len$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle l_pid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("l_pid"));
    public static VarHandle l_pid$VH() {
        return flock64.l_pid$VH;
    }
    public static int l_pid$get(MemorySegment seg) {
        return (int)flock64.l_pid$VH.get(seg);
    }
    public static void l_pid$set( MemorySegment seg, int x) {
        flock64.l_pid$VH.set(seg, x);
    }
    public static int l_pid$get(MemorySegment seg, long index) {
        return (int)flock64.l_pid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void l_pid$set(MemorySegment seg, long index, int x) {
        flock64.l_pid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


