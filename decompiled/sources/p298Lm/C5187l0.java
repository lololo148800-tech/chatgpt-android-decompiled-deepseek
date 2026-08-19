package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import p225Im.InterfaceC3774v;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: Lm.l0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5187l0 extends AbstractC5197q0 implements InterfaceC3774v {

    /* JADX INFO: renamed from: v0 */
    public final C5189m0 f16872v0;

    public C5187l0(C5189m0 property) {
        AbstractC16544l.m18094g(property, "property");
        this.f16872v0 = property;
    }

    @Override // p225Im.InterfaceC3768p
    /* JADX INFO: renamed from: f */
    public final InterfaceC3776x mo4451f() {
        return this.f16872v0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5187l0) this.f16872v0.f16874z0.getValue()).call(obj, obj2);
    }

    @Override // p298Lm.AbstractC5193o0
    /* JADX INFO: renamed from: r */
    public final AbstractC5203t0 mo5743r() {
        return this.f16872v0;
    }
}
