// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$33 {

    static final FunctionDescriptor link$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle link$MH = RuntimeHelper.downcallHandle(
        "link",
        constants$33.link$FUNC
    );
    static final FunctionDescriptor linkat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle linkat$MH = RuntimeHelper.downcallHandle(
        "linkat",
        constants$33.linkat$FUNC
    );
    static final FunctionDescriptor symlink$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle symlink$MH = RuntimeHelper.downcallHandle(
        "symlink",
        constants$33.symlink$FUNC
    );
    static final FunctionDescriptor readlink$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle readlink$MH = RuntimeHelper.downcallHandle(
        "readlink",
        constants$33.readlink$FUNC
    );
    static final FunctionDescriptor symlinkat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle symlinkat$MH = RuntimeHelper.downcallHandle(
        "symlinkat",
        constants$33.symlinkat$FUNC
    );
    static final FunctionDescriptor readlinkat$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle readlinkat$MH = RuntimeHelper.downcallHandle(
        "readlinkat",
        constants$33.readlinkat$FUNC
    );
}


