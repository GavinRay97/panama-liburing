// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$84 {

    static final FunctionDescriptor io_uring_buf_ring_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_buf_ring_init$MH = RuntimeHelper.downcallHandle(
        "io_uring_buf_ring_init",
        constants$84.io_uring_buf_ring_init$FUNC
    );
    static final FunctionDescriptor io_uring_buf_ring_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_buf_ring_add$MH = RuntimeHelper.downcallHandle(
        "io_uring_buf_ring_add",
        constants$84.io_uring_buf_ring_add$FUNC
    );
    static final FunctionDescriptor io_uring_buf_ring_advance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_buf_ring_advance$MH = RuntimeHelper.downcallHandle(
        "io_uring_buf_ring_advance",
        constants$84.io_uring_buf_ring_advance$FUNC
    );
    static final FunctionDescriptor io_uring_buf_ring_cq_advance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_buf_ring_cq_advance$MH = RuntimeHelper.downcallHandle(
        "io_uring_buf_ring_cq_advance",
        constants$84.io_uring_buf_ring_cq_advance$FUNC
    );
    static final FunctionDescriptor io_uring_get_sqe$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_get_sqe$MH = RuntimeHelper.downcallHandle(
        "io_uring_get_sqe",
        constants$84.io_uring_get_sqe$FUNC
    );
    static final FunctionDescriptor io_uring_mlock_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_mlock_size$MH = RuntimeHelper.downcallHandle(
        "io_uring_mlock_size",
        constants$84.io_uring_mlock_size$FUNC
    );
}


