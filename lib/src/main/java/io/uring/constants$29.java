// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$29 {

    static final FunctionDescriptor getsid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle getsid$MH = RuntimeHelper.downcallHandle(
        "getsid",
        constants$29.getsid$FUNC
    );
    static final FunctionDescriptor getuid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getuid$MH = RuntimeHelper.downcallHandle(
        "getuid",
        constants$29.getuid$FUNC
    );
    static final FunctionDescriptor geteuid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle geteuid$MH = RuntimeHelper.downcallHandle(
        "geteuid",
        constants$29.geteuid$FUNC
    );
    static final FunctionDescriptor getgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getgid$MH = RuntimeHelper.downcallHandle(
        "getgid",
        constants$29.getgid$FUNC
    );
    static final FunctionDescriptor getegid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getegid$MH = RuntimeHelper.downcallHandle(
        "getegid",
        constants$29.getegid$FUNC
    );
    static final FunctionDescriptor getgroups$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getgroups$MH = RuntimeHelper.downcallHandle(
        "getgroups",
        constants$29.getgroups$FUNC
    );
}

