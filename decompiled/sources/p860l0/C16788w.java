package p860l0;

import p758g0.InterfaceC13772l;

/* JADX INFO: renamed from: l0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C16788w implements InterfaceC16794y {
    @Override // p860l0.InterfaceC16794y
    /* JADX INFO: renamed from: a */
    public final float mo18556a(float f10, float f11, float f12) {
        InterfaceC16794y.f53901a.getClass();
        float f13 = f11 + f10;
        if ((f10 >= 0.0f && f13 <= f12) || (f10 < 0.0f && f13 > f12)) {
            return 0.0f;
        }
        float f14 = f13 - f12;
        return Math.abs(f10) < Math.abs(f14) ? f10 : f14;
    }

    @Override // p860l0.InterfaceC16794y
    /* JADX INFO: renamed from: b */
    public final InterfaceC13772l mo18557b() {
        InterfaceC16794y.f53901a.getClass();
        return C16791x.f53891b;
    }
}
