// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$43 {

    static final FunctionDescriptor pthread_sigmask$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_sigmask$MH = RuntimeHelper.downcallHandle(
        "pthread_sigmask",
        constants$43.pthread_sigmask$FUNC
    );
    static final FunctionDescriptor pthread_kill$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_kill$MH = RuntimeHelper.downcallHandle(
        "pthread_kill",
        constants$43.pthread_kill$FUNC
    );
    static final FunctionDescriptor pthread_sigqueue$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        MemoryLayout.unionLayout(
            Constants$root.C_INT$LAYOUT.withName("sival_int"),
            Constants$root.C_POINTER$LAYOUT.withName("sival_ptr")
        ).withName("sigval")
    );
    static final MethodHandle pthread_sigqueue$MH = RuntimeHelper.downcallHandle(
        "pthread_sigqueue",
        constants$43.pthread_sigqueue$FUNC
    );
    static final FunctionDescriptor __libc_current_sigrtmin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle __libc_current_sigrtmin$MH = RuntimeHelper.downcallHandle(
        "__libc_current_sigrtmin",
        constants$43.__libc_current_sigrtmin$FUNC
    );
    static final FunctionDescriptor __libc_current_sigrtmax$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle __libc_current_sigrtmax$MH = RuntimeHelper.downcallHandle(
        "__libc_current_sigrtmax",
        constants$43.__libc_current_sigrtmax$FUNC
    );
    static final FunctionDescriptor tgkill$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle tgkill$MH = RuntimeHelper.downcallHandle(
        "tgkill",
        constants$43.tgkill$FUNC
    );
}


