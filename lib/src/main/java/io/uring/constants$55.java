// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$55 {

    static final FunctionDescriptor clock_adjtime$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clock_adjtime$MH = RuntimeHelper.downcallHandle(
        "clock_adjtime",
        constants$55.clock_adjtime$FUNC
    );
    static final FunctionDescriptor clock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle clock$MH = RuntimeHelper.downcallHandle(
        "clock",
        constants$55.clock$FUNC
    );
    static final FunctionDescriptor time$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle time$MH = RuntimeHelper.downcallHandle(
        "time",
        constants$55.time$FUNC
    );
    static final FunctionDescriptor difftime$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle difftime$MH = RuntimeHelper.downcallHandle(
        "difftime",
        constants$55.difftime$FUNC
    );
    static final FunctionDescriptor mktime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mktime$MH = RuntimeHelper.downcallHandle(
        "mktime",
        constants$55.mktime$FUNC
    );
    static final FunctionDescriptor strftime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strftime$MH = RuntimeHelper.downcallHandle(
        "strftime",
        constants$55.strftime$FUNC
    );
}


