// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$42 {

    static final FunctionDescriptor sigaltstack$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigaltstack$MH = RuntimeHelper.downcallHandle(
        "sigaltstack",
        constants$42.sigaltstack$FUNC
    );
    static final FunctionDescriptor sigstack$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigstack$MH = RuntimeHelper.downcallHandle(
        "sigstack",
        constants$42.sigstack$FUNC
    );
    static final FunctionDescriptor sighold$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sighold$MH = RuntimeHelper.downcallHandle(
        "sighold",
        constants$42.sighold$FUNC
    );
    static final FunctionDescriptor sigrelse$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sigrelse$MH = RuntimeHelper.downcallHandle(
        "sigrelse",
        constants$42.sigrelse$FUNC
    );
    static final FunctionDescriptor sigignore$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sigignore$MH = RuntimeHelper.downcallHandle(
        "sigignore",
        constants$42.sigignore$FUNC
    );
    static final FunctionDescriptor sigset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigset$MH = RuntimeHelper.downcallHandle(
        "sigset",
        constants$42.sigset$FUNC
    );
}

