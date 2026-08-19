package p840jn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: jn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C16274c implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final boolean f50403Y;

    public C16274c(boolean z6) {
        this.f50403Y = z6;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        int i10 = DescriptorUtilsKt.f52893a;
        AbstractC16544l.m18091d(callableMemberDescriptor);
        return DescriptorUtilsKt.overriddenTreeAsSequence(callableMemberDescriptor, this.f50403Y);
    }
}
