package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OverridingStrategy {
    public abstract void addFakeOverride(CallableMemberDescriptor callableMemberDescriptor);

    public abstract void inheritanceConflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    public abstract void overrideConflict(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    public void setOverriddenDescriptors(CallableMemberDescriptor member, Collection<? extends CallableMemberDescriptor> overridden) {
        AbstractC16544l.m18094g(member, "member");
        AbstractC16544l.m18094g(overridden, "overridden");
        member.setOverriddenDescriptors(overridden);
    }
}
