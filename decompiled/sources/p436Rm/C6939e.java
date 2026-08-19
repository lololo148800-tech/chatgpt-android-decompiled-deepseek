package p436Rm;

import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* JADX INFO: renamed from: Rm.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C6939e extends NonReportingOverrideStrategy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LinkedHashSet f22223a;

    public C6939e(LinkedHashSet linkedHashSet) {
        this.f22223a = linkedHashSet;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m7324b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
    /* JADX INFO: renamed from: a */
    public final void mo7325a(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        if (callableMemberDescriptor == null) {
            m7324b(1);
            throw null;
        }
        if (callableMemberDescriptor2 != null) {
            return;
        }
        m7324b(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public final void addFakeOverride(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            m7324b(0);
            throw null;
        }
        OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
        this.f22223a.add(callableMemberDescriptor);
    }
}
