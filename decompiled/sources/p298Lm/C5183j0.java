package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import mm.EnumC17307j;
import p225Im.InterfaceC3769q;
import p225Im.InterfaceC3772t;
import p225Im.InterfaceC3773u;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Lm.j0 */
/* JADX INFO: loaded from: classes2.dex */
public class C5183j0 extends AbstractC5203t0 implements InterfaceC3773u {

    /* JADX INFO: renamed from: z0 */
    public final Object f16865z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183j0(AbstractC5148K container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(signature, "signature");
        EnumC17307j enumC17307j = EnumC17307j.f55133Y;
        this.f16865z0 = AbstractC9227W.m9799b(enumC17307j, new C5179h0(this, 0));
        AbstractC9227W.m9799b(enumC17307j, new C5179h0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p225Im.InterfaceC3773u
    public final Object get(Object obj) {
        return ((C5181i0) this.f16865z0.getValue()).call(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p225Im.InterfaceC3776x
    public final InterfaceC3769q getGetter() {
        return (C5181i0) this.f16865z0.getValue();
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p298Lm.AbstractC5203t0
    /* JADX INFO: renamed from: s */
    public final AbstractC5197q0 mo5749s() {
        return (C5181i0) this.f16865z0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p225Im.InterfaceC3776x
    public final InterfaceC3772t getGetter() {
        return (C5181i0) this.f16865z0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183j0(AbstractC5148K container, PropertyDescriptor descriptor) {
        super(container, descriptor);
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(descriptor, "descriptor");
        EnumC17307j enumC17307j = EnumC17307j.f55133Y;
        this.f16865z0 = AbstractC9227W.m9799b(enumC17307j, new C5179h0(this, 0));
        AbstractC9227W.m9799b(enumC17307j, new C5179h0(this, 1));
    }
}
