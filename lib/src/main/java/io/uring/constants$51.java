// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$51 {

    static final FunctionDescriptor fchmodat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fchmodat$MH = RuntimeHelper.downcallHandle(
        "fchmodat",
        constants$51.fchmodat$FUNC
    );
    static final FunctionDescriptor umask$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle umask$MH = RuntimeHelper.downcallHandle(
        "umask",
        constants$51.umask$FUNC
    );
    static final FunctionDescriptor getumask$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getumask$MH = RuntimeHelper.downcallHandle(
        "getumask",
        constants$51.getumask$FUNC
    );
    static final FunctionDescriptor mkdir$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle mkdir$MH = RuntimeHelper.downcallHandle(
        "mkdir",
        constants$51.mkdir$FUNC
    );
    static final FunctionDescriptor mkdirat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle mkdirat$MH = RuntimeHelper.downcallHandle(
        "mkdirat",
        constants$51.mkdirat$FUNC
    );
    static final FunctionDescriptor mknod$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mknod$MH = RuntimeHelper.downcallHandle(
        "mknod",
        constants$51.mknod$FUNC
    );
}

