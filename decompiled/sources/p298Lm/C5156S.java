package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import mm.EnumC17307j;
import p225Im.InterfaceC3760h;
import p225Im.InterfaceC3763k;
import p225Im.InterfaceC3764l;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Lm.S */
/* JADX INFO: loaded from: classes2.dex */
public final class C5156S extends C5183j0 implements InterfaceC3764l {

    /* JADX INFO: renamed from: A0 */
    public final Object f16805A0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5156S(AbstractC5148K container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(signature, "signature");
        this.f16805A0 = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C5140G(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p225Im.InterfaceC3764l
    /* JADX INFO: renamed from: g */
    public final void mo4450g(Object obj, Object obj2) {
        ((C5155Q) this.f16805A0.getValue()).call(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p225Im.InterfaceC3765m
    public final InterfaceC3760h getSetter() {
        return (C5155Q) this.f16805A0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p225Im.InterfaceC3764l, p225Im.InterfaceC3765m
    public final InterfaceC3763k getSetter() {
        return (C5155Q) this.f16805A0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5156S(AbstractC5148K container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(descriptor, "descriptor");
        this.f16805A0 = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C5140G(this, 2));
    }
}
