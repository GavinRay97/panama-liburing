// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$6 {

    static final FunctionDescriptor strtoimax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strtoimax$MH = RuntimeHelper.downcallHandle(
        "strtoimax",
        constants$6.strtoimax$FUNC
    );
    static final FunctionDescriptor strtoumax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strtoumax$MH = RuntimeHelper.downcallHandle(
        "strtoumax",
        constants$6.strtoumax$FUNC
    );
    static final FunctionDescriptor wcstoimax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle wcstoimax$MH = RuntimeHelper.downcallHandle(
        "wcstoimax",
        constants$6.wcstoimax$FUNC
    );
    static final FunctionDescriptor wcstoumax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle wcstoumax$MH = RuntimeHelper.downcallHandle(
        "wcstoumax",
        constants$6.wcstoumax$FUNC
    );
    static final FunctionDescriptor __arch_swab32$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __arch_swab32$MH = RuntimeHelper.downcallHandle(
        "__arch_swab32",
        constants$6.__arch_swab32$FUNC
    );
    static final FunctionDescriptor __arch_swab64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __arch_swab64$MH = RuntimeHelper.downcallHandle(
        "__arch_swab64",
        constants$6.__arch_swab64$FUNC
    );
}


