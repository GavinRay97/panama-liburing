// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class stack_t {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ss_sp"),
        Constants$root.C_INT$LAYOUT.withName("ss_flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ss_size")
    );
    public static MemoryLayout $LAYOUT() {
        return stack_t.$struct$LAYOUT;
    }
    static final VarHandle ss_sp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ss_sp"));
    public static VarHandle ss_sp$VH() {
        return stack_t.ss_sp$VH;
    }
    public static MemoryAddress ss_sp$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)stack_t.ss_sp$VH.get(seg);
    }
    public static void ss_sp$set( MemorySegment seg, MemoryAddress x) {
        stack_t.ss_sp$VH.set(seg, x);
    }
    public static MemoryAddress ss_sp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)stack_t.ss_sp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_sp$set(MemorySegment seg, long index, MemoryAddress x) {
        stack_t.ss_sp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ss_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ss_flags"));
    public static VarHandle ss_flags$VH() {
        return stack_t.ss_flags$VH;
    }
    public static int ss_flags$get(MemorySegment seg) {
        return (int)stack_t.ss_flags$VH.get(seg);
    }
    public static void ss_flags$set( MemorySegment seg, int x) {
        stack_t.ss_flags$VH.set(seg, x);
    }
    public static int ss_flags$get(MemorySegment seg, long index) {
        return (int)stack_t.ss_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_flags$set(MemorySegment seg, long index, int x) {
        stack_t.ss_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ss_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ss_size"));
    public static VarHandle ss_size$VH() {
        return stack_t.ss_size$VH;
    }
    public static long ss_size$get(MemorySegment seg) {
        return (long)stack_t.ss_size$VH.get(seg);
    }
    public static void ss_size$set( MemorySegment seg, long x) {
        stack_t.ss_size$VH.set(seg, x);
    }
    public static long ss_size$get(MemorySegment seg, long index) {
        return (long)stack_t.ss_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_size$set(MemorySegment seg, long index, long x) {
        stack_t.ss_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


