package p298Lm;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import mm.EnumC17307j;
import p225Im.InterfaceC3760h;
import p225Im.InterfaceC3776x;
import p323Mm.InterfaceC5500g;
import p544W9.AbstractC8716t3;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Lm.s0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5201s0 extends AbstractC5193o0 implements InterfaceC3760h {

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ InterfaceC3776x[] f16900u0 = {AbstractC16526C.f51263a.mo5699h(new C16553u(AbstractC5201s0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

    /* JADX INFO: renamed from: s0 */
    public final C5135D0 f16901s0 = AbstractC8716t3.m9425b(null, new C5199r0(this, 0));

    /* JADX INFO: renamed from: t0 */
    public final Object f16902t0 = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C5199r0(this, 1));

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC5201s0) && AbstractC16544l.m18089b(mo5743r(), ((AbstractC5201s0) obj).mo5743r());
    }

    @Override // p225Im.InterfaceC3755c
    public final String getName() {
        return AbstractC9306j0.m9892k(new StringBuilder("<set-"), mo5743r().f16911t0, '>');
    }

    public final int hashCode() {
        return mo5743r().hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: i */
    public final InterfaceC5500g mo5735i() {
        return (InterfaceC5500g) this.f16902t0.getValue();
    }

    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: m */
    public final CallableMemberDescriptor mo5738m() {
        InterfaceC3776x interfaceC3776x = f16900u0[0];
        Object objInvoke = this.f16901s0.invoke();
        AbstractC16544l.m18093f(objInvoke, "getValue(...)");
        return (PropertySetterDescriptor) objInvoke;
    }

    @Override // p298Lm.AbstractC5193o0
    /* JADX INFO: renamed from: q */
    public final PropertyAccessorDescriptor mo5752q() {
        InterfaceC3776x interfaceC3776x = f16900u0[0];
        Object objInvoke = this.f16901s0.invoke();
        AbstractC16544l.m18093f(objInvoke, "getValue(...)");
        return (PropertySetterDescriptor) objInvoke;
    }

    public final String toString() {
        return "setter of " + mo5743r();
    }
}
