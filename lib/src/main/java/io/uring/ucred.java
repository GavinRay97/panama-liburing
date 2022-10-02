// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class ucred {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("pid"),
        Constants$root.C_INT$LAYOUT.withName("uid"),
        Constants$root.C_INT$LAYOUT.withName("gid")
    ).withName("ucred");
    public static MemoryLayout $LAYOUT() {
        return ucred.$struct$LAYOUT;
    }
    static final VarHandle pid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pid"));
    public static VarHandle pid$VH() {
        return ucred.pid$VH;
    }
    public static int pid$get(MemorySegment seg) {
        return (int)ucred.pid$VH.get(seg);
    }
    public static void pid$set( MemorySegment seg, int x) {
        ucred.pid$VH.set(seg, x);
    }
    public static int pid$get(MemorySegment seg, long index) {
        return (int)ucred.pid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pid$set(MemorySegment seg, long index, int x) {
        ucred.pid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uid"));
    public static VarHandle uid$VH() {
        return ucred.uid$VH;
    }
    public static int uid$get(MemorySegment seg) {
        return (int)ucred.uid$VH.get(seg);
    }
    public static void uid$set( MemorySegment seg, int x) {
        ucred.uid$VH.set(seg, x);
    }
    public static int uid$get(MemorySegment seg, long index) {
        return (int)ucred.uid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uid$set(MemorySegment seg, long index, int x) {
        ucred.uid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle gid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gid"));
    public static VarHandle gid$VH() {
        return ucred.gid$VH;
    }
    public static int gid$get(MemorySegment seg) {
        return (int)ucred.gid$VH.get(seg);
    }
    public static void gid$set( MemorySegment seg, int x) {
        ucred.gid$VH.set(seg, x);
    }
    public static int gid$get(MemorySegment seg, long index) {
        return (int)ucred.gid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gid$set(MemorySegment seg, long index, int x) {
        ucred.gid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


