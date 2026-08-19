package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import mm.EnumC17307j;
import p225Im.InterfaceC3760h;
import p225Im.InterfaceC3765m;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Lm.U */
/* JADX INFO: loaded from: classes2.dex */
public final class C5158U extends C5189m0 implements InterfaceC3765m {

    /* JADX INFO: renamed from: A0 */
    public final Object f16807A0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5158U(AbstractC5148K container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(descriptor, "descriptor");
        this.f16807A0 = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C5140G(this, 3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p225Im.InterfaceC3765m
    public final InterfaceC3760h getSetter() {
        return (C5157T) this.f16807A0.getValue();
    }
}
