// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$81 {

    static final FunctionDescriptor io_uring_prep_setxattr$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle io_uring_prep_setxattr$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_setxattr",
        constants$81.io_uring_prep_setxattr$FUNC
    );
    static final FunctionDescriptor io_uring_prep_fgetxattr$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle io_uring_prep_fgetxattr$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_fgetxattr",
        constants$81.io_uring_prep_fgetxattr$FUNC
    );
    static final FunctionDescriptor io_uring_prep_fsetxattr$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle io_uring_prep_fsetxattr$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_fsetxattr",
        constants$81.io_uring_prep_fsetxattr$FUNC
    );
    static final FunctionDescriptor io_uring_prep_socket$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_socket$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_socket",
        constants$81.io_uring_prep_socket$FUNC
    );
    static final FunctionDescriptor io_uring_prep_socket_direct$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_socket_direct$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_socket_direct",
        constants$81.io_uring_prep_socket_direct$FUNC
    );
    static final FunctionDescriptor io_uring_prep_socket_direct_alloc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_socket_direct_alloc$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_socket_direct_alloc",
        constants$81.io_uring_prep_socket_direct_alloc$FUNC
    );
}

