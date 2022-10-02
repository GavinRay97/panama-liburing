// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class fstrim_range {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("start"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("len"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("minlen")
    ).withName("fstrim_range");
    public static MemoryLayout $LAYOUT() {
        return fstrim_range.$struct$LAYOUT;
    }
    static final VarHandle start$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("start"));
    public static VarHandle start$VH() {
        return fstrim_range.start$VH;
    }
    public static long start$get(MemorySegment seg) {
        return (long)fstrim_range.start$VH.get(seg);
    }
    public static void start$set( MemorySegment seg, long x) {
        fstrim_range.start$VH.set(seg, x);
    }
    public static long start$get(MemorySegment seg, long index) {
        return (long)fstrim_range.start$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void start$set(MemorySegment seg, long index, long x) {
        fstrim_range.start$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle len$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("len"));
    public static VarHandle len$VH() {
        return fstrim_range.len$VH;
    }
    public static long len$get(MemorySegment seg) {
        return (long)fstrim_range.len$VH.get(seg);
    }
    public static void len$set( MemorySegment seg, long x) {
        fstrim_range.len$VH.set(seg, x);
    }
    public static long len$get(MemorySegment seg, long index) {
        return (long)fstrim_range.len$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void len$set(MemorySegment seg, long index, long x) {
        fstrim_range.len$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle minlen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("minlen"));
    public static VarHandle minlen$VH() {
        return fstrim_range.minlen$VH;
    }
    public static long minlen$get(MemorySegment seg) {
        return (long)fstrim_range.minlen$VH.get(seg);
    }
    public static void minlen$set( MemorySegment seg, long x) {
        fstrim_range.minlen$VH.set(seg, x);
    }
    public static long minlen$get(MemorySegment seg, long index) {
        return (long)fstrim_range.minlen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void minlen$set(MemorySegment seg, long index, long x) {
        fstrim_range.minlen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


