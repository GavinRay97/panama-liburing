// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$64 {

    static final FunctionDescriptor io_uring_wait_cqe_timeout$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_wait_cqe_timeout$MH = RuntimeHelper.downcallHandle(
        "io_uring_wait_cqe_timeout",
        constants$64.io_uring_wait_cqe_timeout$FUNC
    );
    static final FunctionDescriptor io_uring_submit$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_submit$MH = RuntimeHelper.downcallHandle(
        "io_uring_submit",
        constants$64.io_uring_submit$FUNC
    );
    static final FunctionDescriptor io_uring_submit_and_wait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_submit_and_wait$MH = RuntimeHelper.downcallHandle(
        "io_uring_submit_and_wait",
        constants$64.io_uring_submit_and_wait$FUNC
    );
    static final FunctionDescriptor io_uring_submit_and_wait_timeout$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_submit_and_wait_timeout$MH = RuntimeHelper.downcallHandle(
        "io_uring_submit_and_wait_timeout",
        constants$64.io_uring_submit_and_wait_timeout$FUNC
    );
    static final FunctionDescriptor io_uring_register_buffers$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_buffers$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_buffers",
        constants$64.io_uring_register_buffers$FUNC
    );
    static final FunctionDescriptor io_uring_register_buffers_tags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_buffers_tags$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_buffers_tags",
        constants$64.io_uring_register_buffers_tags$FUNC
    );
}


