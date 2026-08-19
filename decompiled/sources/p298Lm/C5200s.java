package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Lm.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C5200s implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final CallableMemberDescriptor f16898Y;

    /* JADX INFO: renamed from: Z */
    public final int f16899Z;

    public C5200s(CallableMemberDescriptor callableMemberDescriptor, int i10) {
        this.f16898Y = callableMemberDescriptor;
        this.f16899Z = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        ValueParameterDescriptor valueParameterDescriptor = this.f16898Y.getValueParameters().get(this.f16899Z);
        AbstractC16544l.m18093f(valueParameterDescriptor, "get(...)");
        return valueParameterDescriptor;
    }
}
