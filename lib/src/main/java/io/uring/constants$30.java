// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$30 {

    static final FunctionDescriptor group_member$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle group_member$MH = RuntimeHelper.downcallHandle(
        "group_member",
        constants$30.group_member$FUNC
    );
    static final FunctionDescriptor setuid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setuid$MH = RuntimeHelper.downcallHandle(
        "setuid",
        constants$30.setuid$FUNC
    );
    static final FunctionDescriptor setreuid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setreuid$MH = RuntimeHelper.downcallHandle(
        "setreuid",
        constants$30.setreuid$FUNC
    );
    static final FunctionDescriptor seteuid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle seteuid$MH = RuntimeHelper.downcallHandle(
        "seteuid",
        constants$30.seteuid$FUNC
    );
    static final FunctionDescriptor setgid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setgid$MH = RuntimeHelper.downcallHandle(
        "setgid",
        constants$30.setgid$FUNC
    );
    static final FunctionDescriptor setregid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setregid$MH = RuntimeHelper.downcallHandle(
        "setregid",
        constants$30.setregid$FUNC
    );
}


