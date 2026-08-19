package p534Vm;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import p077Cn.C1756x;

/* JADX INFO: renamed from: Vm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8400a extends NonReportingOverrideStrategy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ErrorReporter f26126a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LinkedHashSet f26127b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f26128c;

    public C8400a(ErrorReporter errorReporter, LinkedHashSet linkedHashSet, boolean z6) {
        this.f26126a = errorReporter;
        this.f26127b = linkedHashSet;
        this.f26128c = z6;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8946b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i10 == 3) {
            objArr[0] = "member";
        } else if (i10 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else if (i10 == 3 || i10 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
    /* JADX INFO: renamed from: a */
    public final void mo7325a(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
        if (callableMemberDescriptor == null) {
            m8946b(1);
            throw null;
        }
        if (callableMemberDescriptor2 != null) {
            return;
        }
        m8946b(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public final void addFakeOverride(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            m8946b(0);
            throw null;
        }
        OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, new C1756x(this, 11));
        this.f26127b.add(callableMemberDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public final void setOverriddenDescriptors(CallableMemberDescriptor callableMemberDescriptor, Collection collection) {
        if (callableMemberDescriptor == null) {
            m8946b(3);
            throw null;
        }
        if (collection == null) {
            m8946b(4);
            throw null;
        }
        if (!this.f26128c || callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            super.setOverriddenDescriptors(callableMemberDescriptor, collection);
        }
    }
}
