// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$18 {

    static final FunctionDescriptor sigaction$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigaction$MH = RuntimeHelper.downcallHandle(
        "sigaction",
        constants$18.sigaction$FUNC
    );
    static final FunctionDescriptor sigpending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigpending$MH = RuntimeHelper.downcallHandle(
        "sigpending",
        constants$18.sigpending$FUNC
    );
    static final FunctionDescriptor sigwait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigwait$MH = RuntimeHelper.downcallHandle(
        "sigwait",
        constants$18.sigwait$FUNC
    );
    static final FunctionDescriptor sigwaitinfo$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigwaitinfo$MH = RuntimeHelper.downcallHandle(
        "sigwaitinfo",
        constants$18.sigwaitinfo$FUNC
    );
    static final FunctionDescriptor sigtimedwait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigtimedwait$MH = RuntimeHelper.downcallHandle(
        "sigtimedwait",
        constants$18.sigtimedwait$FUNC
    );
    static final FunctionDescriptor sigqueue$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        MemoryLayout.unionLayout(
            Constants$root.C_INT$LAYOUT.withName("sival_int"),
            Constants$root.C_POINTER$LAYOUT.withName("sival_ptr")
        ).withName("sigval")
    );
    static final MethodHandle sigqueue$MH = RuntimeHelper.downcallHandle(
        "sigqueue",
        constants$18.sigqueue$FUNC
    );
}


