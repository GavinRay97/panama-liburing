// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$27 {

    static final FunctionDescriptor pathconf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pathconf$MH = RuntimeHelper.downcallHandle(
        "pathconf",
        constants$27.pathconf$FUNC
    );
    static final FunctionDescriptor fpathconf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fpathconf$MH = RuntimeHelper.downcallHandle(
        "fpathconf",
        constants$27.fpathconf$FUNC
    );
    static final FunctionDescriptor sysconf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sysconf$MH = RuntimeHelper.downcallHandle(
        "sysconf",
        constants$27.sysconf$FUNC
    );
    static final FunctionDescriptor confstr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle confstr$MH = RuntimeHelper.downcallHandle(
        "confstr",
        constants$27.confstr$FUNC
    );
    static final FunctionDescriptor getpid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getpid$MH = RuntimeHelper.downcallHandle(
        "getpid",
        constants$27.getpid$FUNC
    );
    static final FunctionDescriptor getppid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getppid$MH = RuntimeHelper.downcallHandle(
        "getppid",
        constants$27.getppid$FUNC
    );
}


