// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$24 {

    static final FunctionDescriptor io_uring_wait_cqe_nr$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_wait_cqe_nr$MH = RuntimeHelper.downcallHandle(
        "io_uring_wait_cqe_nr",
        constants$24.io_uring_wait_cqe_nr$FUNC
    );
    static final FunctionDescriptor __io_uring_peek_cqe$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __io_uring_peek_cqe$MH = RuntimeHelper.downcallHandle(
        "__io_uring_peek_cqe",
        constants$24.__io_uring_peek_cqe$FUNC
    );
    static final FunctionDescriptor io_uring_peek_cqe$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_peek_cqe$MH = RuntimeHelper.downcallHandle(
        "io_uring_peek_cqe",
        constants$24.io_uring_peek_cqe$FUNC
    );
    static final FunctionDescriptor io_uring_wait_cqe$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_wait_cqe$MH = RuntimeHelper.downcallHandle(
        "io_uring_wait_cqe",
        constants$24.io_uring_wait_cqe$FUNC
    );
    static final FunctionDescriptor _io_uring_get_sqe$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _io_uring_get_sqe$MH = RuntimeHelper.downcallHandle(
        "_io_uring_get_sqe",
        constants$24._io_uring_get_sqe$FUNC
    );
    static final FunctionDescriptor io_uring_buf_ring_mask$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_buf_ring_mask$MH = RuntimeHelper.downcallHandle(
        "io_uring_buf_ring_mask",
        constants$24.io_uring_buf_ring_mask$FUNC
    );
}

