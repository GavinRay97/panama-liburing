// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$50 {

    static final FunctionDescriptor fstatat64$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fstatat64$MH = RuntimeHelper.downcallHandle(
        "fstatat64",
        constants$50.fstatat64$FUNC
    );
    static final FunctionDescriptor lstat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lstat$MH = RuntimeHelper.downcallHandle(
        "lstat",
        constants$50.lstat$FUNC
    );
    static final FunctionDescriptor lstat64$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lstat64$MH = RuntimeHelper.downcallHandle(
        "lstat64",
        constants$50.lstat64$FUNC
    );
    static final FunctionDescriptor chmod$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle chmod$MH = RuntimeHelper.downcallHandle(
        "chmod",
        constants$50.chmod$FUNC
    );
    static final FunctionDescriptor lchmod$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle lchmod$MH = RuntimeHelper.downcallHandle(
        "lchmod",
        constants$50.lchmod$FUNC
    );
    static final FunctionDescriptor fchmod$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fchmod$MH = RuntimeHelper.downcallHandle(
        "fchmod",
        constants$50.fchmod$FUNC
    );
}


