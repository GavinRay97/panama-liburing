// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class fscrypt_add_key_arg {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("type"),
            Constants$root.C_INT$LAYOUT.withName("__reserved"),
            MemoryLayout.unionLayout(
                MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("__reserved"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("descriptor"),
                MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("identifier")
            ).withName("u")
        ).withName("key_spec"),
        Constants$root.C_INT$LAYOUT.withName("raw_size"),
        Constants$root.C_INT$LAYOUT.withName("key_id"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_INT$LAYOUT).withName("__reserved"),
        MemoryLayout.sequenceLayout(0, Constants$root.C_CHAR$LAYOUT).withName("raw")
    ).withName("fscrypt_add_key_arg");
    public static MemoryLayout $LAYOUT() {
        return fscrypt_add_key_arg.$struct$LAYOUT;
    }
    public static MemorySegment key_spec$slice(MemorySegment seg) {
        return seg.asSlice(0, 40);
    }
    static final VarHandle raw_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("raw_size"));
    public static VarHandle raw_size$VH() {
        return fscrypt_add_key_arg.raw_size$VH;
    }
    public static int raw_size$get(MemorySegment seg) {
        return (int)fscrypt_add_key_arg.raw_size$VH.get(seg);
    }
    public static void raw_size$set( MemorySegment seg, int x) {
        fscrypt_add_key_arg.raw_size$VH.set(seg, x);
    }
    public static int raw_size$get(MemorySegment seg, long index) {
        return (int)fscrypt_add_key_arg.raw_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void raw_size$set(MemorySegment seg, long index, int x) {
        fscrypt_add_key_arg.raw_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle key_id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("key_id"));
    public static VarHandle key_id$VH() {
        return fscrypt_add_key_arg.key_id$VH;
    }
    public static int key_id$get(MemorySegment seg) {
        return (int)fscrypt_add_key_arg.key_id$VH.get(seg);
    }
    public static void key_id$set( MemorySegment seg, int x) {
        fscrypt_add_key_arg.key_id$VH.set(seg, x);
    }
    public static int key_id$get(MemorySegment seg, long index) {
        return (int)fscrypt_add_key_arg.key_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void key_id$set(MemorySegment seg, long index, int x) {
        fscrypt_add_key_arg.key_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __reserved$slice(MemorySegment seg) {
        return seg.asSlice(48, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


