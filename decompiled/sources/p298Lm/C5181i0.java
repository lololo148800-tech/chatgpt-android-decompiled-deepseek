package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import p225Im.InterfaceC3772t;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: Lm.i0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5181i0 extends AbstractC5197q0 implements InterfaceC3772t {

    /* JADX INFO: renamed from: v0 */
    public final C5183j0 f16863v0;

    public C5181i0(C5183j0 property) {
        AbstractC16544l.m18094g(property, "property");
        this.f16863v0 = property;
    }

    @Override // p225Im.InterfaceC3768p
    /* JADX INFO: renamed from: f */
    public final InterfaceC3776x mo4451f() {
        return this.f16863v0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return this.f16863v0.get(obj);
    }

    @Override // p298Lm.AbstractC5193o0
    /* JADX INFO: renamed from: r */
    public final AbstractC5203t0 mo5743r() {
        return this.f16863v0;
    }
}
