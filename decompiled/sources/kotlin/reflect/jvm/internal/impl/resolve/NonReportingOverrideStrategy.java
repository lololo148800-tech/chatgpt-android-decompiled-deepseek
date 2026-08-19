package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NonReportingOverrideStrategy extends OverridingStrategy {
    /* JADX INFO: renamed from: a */
    public abstract void mo7325a(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void inheritanceConflict(CallableMemberDescriptor first, CallableMemberDescriptor second) {
        AbstractC16544l.m18094g(first, "first");
        AbstractC16544l.m18094g(second, "second");
        mo7325a(first, second);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void overrideConflict(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
        AbstractC16544l.m18094g(fromSuper, "fromSuper");
        AbstractC16544l.m18094g(fromCurrent, "fromCurrent");
        mo7325a(fromSuper, fromCurrent);
    }
}
