// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1 {

    static final FunctionDescriptor io_uring_queue_mmap$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_queue_mmap$MH = RuntimeHelper.downcallHandle(
        "io_uring_queue_mmap",
        constants$1.io_uring_queue_mmap$FUNC
    );
    static final FunctionDescriptor io_uring_ring_dontfork$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_ring_dontfork$MH = RuntimeHelper.downcallHandle(
        "io_uring_ring_dontfork",
        constants$1.io_uring_ring_dontfork$FUNC
    );
    static final FunctionDescriptor io_uring_queue_exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_queue_exit$MH = RuntimeHelper.downcallHandle(
        "io_uring_queue_exit",
        constants$1.io_uring_queue_exit$FUNC
    );
    static final FunctionDescriptor io_uring_peek_batch_cqe$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_peek_batch_cqe$MH = RuntimeHelper.downcallHandle(
        "io_uring_peek_batch_cqe",
        constants$1.io_uring_peek_batch_cqe$FUNC
    );
    static final FunctionDescriptor io_uring_wait_cqes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_wait_cqes$MH = RuntimeHelper.downcallHandle(
        "io_uring_wait_cqes",
        constants$1.io_uring_wait_cqes$FUNC
    );
    static final FunctionDescriptor io_uring_wait_cqe_timeout$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_wait_cqe_timeout$MH = RuntimeHelper.downcallHandle(
        "io_uring_wait_cqe_timeout",
        constants$1.io_uring_wait_cqe_timeout$FUNC
    );
}

