package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractModifierChecks {
    public final CheckResult check(FunctionDescriptor functionDescriptor) {
        AbstractC16544l.m18094g(functionDescriptor, "functionDescriptor");
        for (Checks checks : getChecks$descriptors()) {
            if (checks.isApplicable(functionDescriptor)) {
                return checks.checkAll(functionDescriptor);
            }
        }
        return CheckResult.IllegalFunctionName.INSTANCE;
    }

    public abstract List<Checks> getChecks$descriptors();
}
