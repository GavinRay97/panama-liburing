// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class __locale_struct {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(13, Constants$root.C_POINTER$LAYOUT).withName("__locales"),
        Constants$root.C_POINTER$LAYOUT.withName("__ctype_b"),
        Constants$root.C_POINTER$LAYOUT.withName("__ctype_tolower"),
        Constants$root.C_POINTER$LAYOUT.withName("__ctype_toupper"),
        MemoryLayout.sequenceLayout(13, Constants$root.C_POINTER$LAYOUT).withName("__names")
    ).withName("__locale_struct");
    public static MemoryLayout $LAYOUT() {
        return __locale_struct.$struct$LAYOUT;
    }
    public static MemorySegment __locales$slice(MemorySegment seg) {
        return seg.asSlice(0, 104);
    }
    static final VarHandle __ctype_b$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__ctype_b"));
    public static VarHandle __ctype_b$VH() {
        return __locale_struct.__ctype_b$VH;
    }
    public static MemoryAddress __ctype_b$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)__locale_struct.__ctype_b$VH.get(seg);
    }
    public static void __ctype_b$set( MemorySegment seg, MemoryAddress x) {
        __locale_struct.__ctype_b$VH.set(seg, x);
    }
    public static MemoryAddress __ctype_b$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)__locale_struct.__ctype_b$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __ctype_b$set(MemorySegment seg, long index, MemoryAddress x) {
        __locale_struct.__ctype_b$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __ctype_tolower$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__ctype_tolower"));
    public static VarHandle __ctype_tolower$VH() {
        return __locale_struct.__ctype_tolower$VH;
    }
    public static MemoryAddress __ctype_tolower$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)__locale_struct.__ctype_tolower$VH.get(seg);
    }
    public static void __ctype_tolower$set( MemorySegment seg, MemoryAddress x) {
        __locale_struct.__ctype_tolower$VH.set(seg, x);
    }
    public static MemoryAddress __ctype_tolower$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)__locale_struct.__ctype_tolower$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __ctype_tolower$set(MemorySegment seg, long index, MemoryAddress x) {
        __locale_struct.__ctype_tolower$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __ctype_toupper$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__ctype_toupper"));
    public static VarHandle __ctype_toupper$VH() {
        return __locale_struct.__ctype_toupper$VH;
    }
    public static MemoryAddress __ctype_toupper$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)__locale_struct.__ctype_toupper$VH.get(seg);
    }
    public static void __ctype_toupper$set( MemorySegment seg, MemoryAddress x) {
        __locale_struct.__ctype_toupper$VH.set(seg, x);
    }
    public static MemoryAddress __ctype_toupper$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)__locale_struct.__ctype_toupper$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __ctype_toupper$set(MemorySegment seg, long index, MemoryAddress x) {
        __locale_struct.__ctype_toupper$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __names$slice(MemorySegment seg) {
        return seg.asSlice(128, 104);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

