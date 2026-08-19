package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import p225Im.InterfaceC3770r;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: Lm.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5175f0 extends AbstractC5197q0 implements InterfaceC3770r {

    /* JADX INFO: renamed from: v0 */
    public final C5177g0 f16855v0;

    public C5175f0(C5177g0 property) {
        AbstractC16544l.m18094g(property, "property");
        this.f16855v0 = property;
    }

    @Override // p225Im.InterfaceC3768p
    /* JADX INFO: renamed from: f */
    public final InterfaceC3776x mo4451f() {
        return this.f16855v0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return this.f16855v0.get();
    }

    @Override // p298Lm.AbstractC5193o0
    /* JADX INFO: renamed from: r */
    public final AbstractC5203t0 mo5743r() {
        return this.f16855v0;
    }
}
