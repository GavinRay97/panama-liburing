// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$40 {

    static final FunctionDescriptor ftruncate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ftruncate$MH = RuntimeHelper.downcallHandle(
        "ftruncate",
        constants$40.ftruncate$FUNC
    );
    static final FunctionDescriptor ftruncate64$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ftruncate64$MH = RuntimeHelper.downcallHandle(
        "ftruncate64",
        constants$40.ftruncate64$FUNC
    );
    static final FunctionDescriptor brk$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle brk$MH = RuntimeHelper.downcallHandle(
        "brk",
        constants$40.brk$FUNC
    );
    static final FunctionDescriptor sbrk$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle sbrk$MH = RuntimeHelper.downcallHandle(
        "sbrk",
        constants$40.sbrk$FUNC
    );
    static final FunctionDescriptor syscall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle syscall$MH = RuntimeHelper.downcallHandleVariadic(
        "syscall",
        constants$40.syscall$FUNC
    );
    static final FunctionDescriptor copy_file_range$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle copy_file_range$MH = RuntimeHelper.downcallHandle(
        "copy_file_range",
        constants$40.copy_file_range$FUNC
    );
}


