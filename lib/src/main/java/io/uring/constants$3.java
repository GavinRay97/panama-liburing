// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$3 {

    static final FunctionDescriptor io_uring_register_buffers_update_tag$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_buffers_update_tag$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_buffers_update_tag",
        constants$3.io_uring_register_buffers_update_tag$FUNC
    );
    static final FunctionDescriptor io_uring_unregister_buffers$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_unregister_buffers$MH = RuntimeHelper.downcallHandle(
        "io_uring_unregister_buffers",
        constants$3.io_uring_unregister_buffers$FUNC
    );
    static final FunctionDescriptor io_uring_register_files$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_files$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_files",
        constants$3.io_uring_register_files$FUNC
    );
    static final FunctionDescriptor io_uring_register_files_tags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_files_tags$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_files_tags",
        constants$3.io_uring_register_files_tags$FUNC
    );
    static final FunctionDescriptor io_uring_register_files_sparse$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_files_sparse$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_files_sparse",
        constants$3.io_uring_register_files_sparse$FUNC
    );
    static final FunctionDescriptor io_uring_register_files_update_tag$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_files_update_tag$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_files_update_tag",
        constants$3.io_uring_register_files_update_tag$FUNC
    );
}


