// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$73 {

    static final FunctionDescriptor io_uring_prep_poll_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle io_uring_prep_poll_remove$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_poll_remove",
        constants$73.io_uring_prep_poll_remove$FUNC
    );
    static final FunctionDescriptor io_uring_prep_poll_update$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_poll_update$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_poll_update",
        constants$73.io_uring_prep_poll_update$FUNC
    );
    static final FunctionDescriptor io_uring_prep_fsync$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_fsync$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_fsync",
        constants$73.io_uring_prep_fsync$FUNC
    );
    static final FunctionDescriptor io_uring_prep_nop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_prep_nop$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_nop",
        constants$73.io_uring_prep_nop$FUNC
    );
    static final FunctionDescriptor io_uring_prep_timeout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_timeout$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_timeout",
        constants$73.io_uring_prep_timeout$FUNC
    );
    static final FunctionDescriptor io_uring_prep_timeout_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_timeout_remove$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_timeout_remove",
        constants$73.io_uring_prep_timeout_remove$FUNC
    );
}


