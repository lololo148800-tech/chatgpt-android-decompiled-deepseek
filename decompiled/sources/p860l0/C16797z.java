package p860l0;

import p758g0.AbstractC13758e;
import p758g0.C13781p0;
import p758g0.C13792v;
import p758g0.InterfaceC13772l;

/* JADX INFO: renamed from: l0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C16797z implements InterfaceC16794y {

    /* JADX INFO: renamed from: b */
    public final C13781p0 f53908b = AbstractC13758e.m15255t(125, 0, new C13792v(0.25f, 0.1f, 0.25f, 1.0f), 2);

    @Override // p860l0.InterfaceC16794y
    /* JADX INFO: renamed from: a */
    public final float mo18556a(float f10, float f11, float f12) {
        float fAbs = Math.abs((f11 + f10) - f10);
        float f13 = (0.3f * f12) - (0.0f * fAbs);
        float f14 = f12 - f13;
        if ((fAbs <= f12) && f14 < fAbs) {
            f13 = f12 - fAbs;
        }
        return f10 - f13;
    }

    @Override // p860l0.InterfaceC16794y
    /* JADX INFO: renamed from: b */
    public final InterfaceC13772l mo18557b() {
        return this.f53908b;
    }
}
