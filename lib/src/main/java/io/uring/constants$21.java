// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$21 {

    static final FunctionDescriptor write$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle write$MH = RuntimeHelper.downcallHandle(
        "write",
        constants$21.write$FUNC
    );
    static final FunctionDescriptor pread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pread$MH = RuntimeHelper.downcallHandle(
        "pread",
        constants$21.pread$FUNC
    );
    static final FunctionDescriptor pwrite$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pwrite$MH = RuntimeHelper.downcallHandle(
        "pwrite",
        constants$21.pwrite$FUNC
    );
    static final FunctionDescriptor pread64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pread64$MH = RuntimeHelper.downcallHandle(
        "pread64",
        constants$21.pread64$FUNC
    );
    static final FunctionDescriptor pwrite64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pwrite64$MH = RuntimeHelper.downcallHandle(
        "pwrite64",
        constants$21.pwrite64$FUNC
    );
    static final FunctionDescriptor pipe$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pipe$MH = RuntimeHelper.downcallHandle(
        "pipe",
        constants$21.pipe$FUNC
    );
}


