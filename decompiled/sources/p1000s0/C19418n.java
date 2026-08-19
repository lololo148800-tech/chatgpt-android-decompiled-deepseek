package p1000s0;

import p530Vi.AbstractC8301I;
import p758g0.InterfaceC13772l;
import p860l0.InterfaceC16794y;

/* JADX INFO: renamed from: s0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C19418n implements InterfaceC16794y {

    /* JADX INFO: renamed from: b */
    public final C19408d f61538b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC16794y f61539c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13772l f61540d;

    public C19418n(C19408d c19408d, InterfaceC16794y interfaceC16794y) {
        this.f61538b = c19408d;
        this.f61539c = interfaceC16794y;
        this.f61540d = interfaceC16794y.mo18557b();
    }

    @Override // p860l0.InterfaceC16794y
    /* JADX INFO: renamed from: a */
    public final float mo18556a(float f10, float f11, float f12) {
        float fMo18556a = this.f61539c.mo18556a(f10, f11, f12);
        C19408d c19408d = this.f61538b;
        if (fMo18556a == 0.0f) {
            int i10 = c19408d.f61442e;
            if (i10 == 0) {
                return 0.0f;
            }
            float fM20502n = i10 * (-1.0f);
            if (((Boolean) c19408d.f61436E.getValue()).booleanValue()) {
                fM20502n += c19408d.m20502n();
            }
            return AbstractC8301I.m8920k(fM20502n, -f12, f12);
        }
        float fM20502n2 = c19408d.f61442e * (-1);
        while (fMo18556a > 0.0f && fM20502n2 < fMo18556a) {
            fM20502n2 += c19408d.m20502n();
        }
        float fM20502n3 = fM20502n2;
        while (fMo18556a < 0.0f && fM20502n3 > fMo18556a) {
            fM20502n3 -= c19408d.m20502n();
        }
        return fM20502n3;
    }

    @Override // p860l0.InterfaceC16794y
    /* JADX INFO: renamed from: b */
    public final InterfaceC13772l mo18557b() {
        return this.f61540d;
    }
}
