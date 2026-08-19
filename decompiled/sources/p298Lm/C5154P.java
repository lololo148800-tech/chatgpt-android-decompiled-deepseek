package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import mm.EnumC17307j;
import p225Im.InterfaceC3760h;
import p225Im.InterfaceC3761i;
import p225Im.InterfaceC3762j;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Lm.P */
/* JADX INFO: loaded from: classes2.dex */
public final class C5154P extends C5177g0 implements InterfaceC3762j {

    /* JADX INFO: renamed from: B0 */
    public final Object f16803B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5154P(AbstractC5148K container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(descriptor, "descriptor");
        this.f16803B0 = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C5140G(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p225Im.InterfaceC3765m
    public final InterfaceC3760h getSetter() {
        return (C5153O) this.f16803B0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p225Im.InterfaceC3762j, p225Im.InterfaceC3765m
    public final InterfaceC3761i getSetter() {
        return (C5153O) this.f16803B0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5154P(AbstractC5148K container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(signature, "signature");
        this.f16803B0 = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C5140G(this, 1));
    }
}
