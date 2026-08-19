package gn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: gn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C14198c implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final CallableDescriptor f44610Y;

    /* JADX INFO: renamed from: Z */
    public final CallableDescriptor f44611Z;

    public C14198c(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f44610Y = callableDescriptor;
        this.f44611Z = callableDescriptor2;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(AbstractC16544l.m18089b((DeclarationDescriptor) obj, this.f44610Y) && AbstractC16544l.m18089b((DeclarationDescriptor) obj2, this.f44611Z));
    }
}
