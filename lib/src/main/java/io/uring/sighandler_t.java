// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface sighandler_t {

    void apply(int _x0);
    static MemorySegment allocate(sighandler_t fi, MemorySession session) {
        return RuntimeHelper.upcallStub(sighandler_t.class, fi, constants$15.sighandler_t$FUNC, session);
    }
    static sighandler_t ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0) -> {
            try {
                constants$15.sighandler_t$MH.invokeExact((Addressable)symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

