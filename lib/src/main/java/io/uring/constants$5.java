// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$5 {

    static final FunctionDescriptor io_uring_register_personality$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_register_personality$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_personality",
        constants$5.io_uring_register_personality$FUNC
    );
    static final FunctionDescriptor io_uring_unregister_personality$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_unregister_personality$MH = RuntimeHelper.downcallHandle(
        "io_uring_unregister_personality",
        constants$5.io_uring_unregister_personality$FUNC
    );
    static final FunctionDescriptor io_uring_register_restrictions$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_restrictions$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_restrictions",
        constants$5.io_uring_register_restrictions$FUNC
    );
    static final FunctionDescriptor io_uring_enable_rings$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_enable_rings$MH = RuntimeHelper.downcallHandle(
        "io_uring_enable_rings",
        constants$5.io_uring_enable_rings$FUNC
    );
    static final FunctionDescriptor __io_uring_sqring_wait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __io_uring_sqring_wait$MH = RuntimeHelper.downcallHandle(
        "__io_uring_sqring_wait",
        constants$5.__io_uring_sqring_wait$FUNC
    );
    static final FunctionDescriptor io_uring_register_iowq_aff$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_register_iowq_aff$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_iowq_aff",
        constants$5.io_uring_register_iowq_aff$FUNC
    );
}

