// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$45 {

    static final FunctionDescriptor select$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle select$MH = RuntimeHelper.downcallHandle(
        "select",
        constants$45.select$FUNC
    );
    static final FunctionDescriptor pselect$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pselect$MH = RuntimeHelper.downcallHandle(
        "pselect",
        constants$45.pselect$FUNC
    );
    static final FunctionDescriptor __cmsg_nxthdr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __cmsg_nxthdr$MH = RuntimeHelper.downcallHandle(
        "__cmsg_nxthdr",
        constants$45.__cmsg_nxthdr$FUNC
    );
    static final FunctionDescriptor socket$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle socket$MH = RuntimeHelper.downcallHandle(
        "socket",
        constants$45.socket$FUNC
    );
    static final FunctionDescriptor socketpair$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle socketpair$MH = RuntimeHelper.downcallHandle(
        "socketpair",
        constants$45.socketpair$FUNC
    );
    static final FunctionDescriptor bind$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_at__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_ax25__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_dl__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_eon__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_in__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_in6__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_inarp__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_ipx__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_iso__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_ns__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_un__"),
            Constants$root.C_POINTER$LAYOUT.withName("__sockaddr_x25__")
        ),
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle bind$MH = RuntimeHelper.downcallHandle(
        "bind",
        constants$45.bind$FUNC
    );
}


