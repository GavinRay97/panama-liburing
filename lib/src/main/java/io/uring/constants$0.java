// Generated by jextract

package io.uring;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$0 {

    static final FunctionDescriptor atomic_thread_fence$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atomic_thread_fence$MH = RuntimeHelper.downcallHandle(
        "atomic_thread_fence",
        constants$0.atomic_thread_fence$FUNC
    );
    static final FunctionDescriptor atomic_signal_fence$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atomic_signal_fence$MH = RuntimeHelper.downcallHandle(
        "atomic_signal_fence",
        constants$0.atomic_signal_fence$FUNC
    );
    static final FunctionDescriptor atomic_flag_test_and_set$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atomic_flag_test_and_set$MH = RuntimeHelper.downcallHandle(
        "atomic_flag_test_and_set",
        constants$0.atomic_flag_test_and_set$FUNC
    );
    static final FunctionDescriptor atomic_flag_test_and_set_explicit$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atomic_flag_test_and_set_explicit$MH = RuntimeHelper.downcallHandle(
        "atomic_flag_test_and_set_explicit",
        constants$0.atomic_flag_test_and_set_explicit$FUNC
    );
    static final FunctionDescriptor atomic_flag_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atomic_flag_clear$MH = RuntimeHelper.downcallHandle(
        "atomic_flag_clear",
        constants$0.atomic_flag_clear$FUNC
    );
    static final FunctionDescriptor atomic_flag_clear_explicit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atomic_flag_clear_explicit$MH = RuntimeHelper.downcallHandle(
        "atomic_flag_clear_explicit",
        constants$0.atomic_flag_clear_explicit$FUNC
    );
}


