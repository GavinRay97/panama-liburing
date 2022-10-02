// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$46 {

    static final FunctionDescriptor getsockname$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
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
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getsockname$MH = RuntimeHelper.downcallHandle(
        "getsockname",
        constants$46.getsockname$FUNC
    );
    static final FunctionDescriptor connect$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
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
    static final MethodHandle connect$MH = RuntimeHelper.downcallHandle(
        "connect",
        constants$46.connect$FUNC
    );
    static final FunctionDescriptor getpeername$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
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
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getpeername$MH = RuntimeHelper.downcallHandle(
        "getpeername",
        constants$46.getpeername$FUNC
    );
    static final FunctionDescriptor send$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle send$MH = RuntimeHelper.downcallHandle(
        "send",
        constants$46.send$FUNC
    );
    static final FunctionDescriptor recv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle recv$MH = RuntimeHelper.downcallHandle(
        "recv",
        constants$46.recv$FUNC
    );
    static final FunctionDescriptor sendto$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
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
    static final MethodHandle sendto$MH = RuntimeHelper.downcallHandle(
        "sendto",
        constants$46.sendto$FUNC
    );
}

