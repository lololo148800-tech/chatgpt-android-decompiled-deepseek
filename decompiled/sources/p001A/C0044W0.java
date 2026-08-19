package p001A;

import p178H.InterfaceC3180x0;

/* JADX INFO: renamed from: A.W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0044W0 implements InterfaceC3180x0 {

    /* JADX INFO: renamed from: a */
    public float f211a;

    /* JADX INFO: renamed from: b */
    public final float f212b;

    /* JADX INFO: renamed from: c */
    public final float f213c;

    /* JADX INFO: renamed from: d */
    public float f214d;

    public C0044W0(float f10, float f11) {
        this.f212b = f10;
        this.f213c = f11;
    }

    @Override // p178H.InterfaceC3180x0
    /* JADX INFO: renamed from: a */
    public final float mo227a() {
        return this.f212b;
    }

    @Override // p178H.InterfaceC3180x0
    /* JADX INFO: renamed from: b */
    public final float mo228b() {
        return this.f213c;
    }

    @Override // p178H.InterfaceC3180x0
    /* JADX INFO: renamed from: c */
    public final float mo229c() {
        return this.f211a;
    }

    @Override // p178H.InterfaceC3180x0
    /* JADX INFO: renamed from: d */
    public final float mo230d() {
        return this.f214d;
    }

    /* JADX INFO: renamed from: e */
    public final void m231e(float f10) {
        float f11 = this.f212b;
        float f12 = this.f213c;
        if (f10 > f11 || f10 < f12) {
            throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + f12 + " , " + f11 + "]");
        }
        this.f211a = f10;
        float f13 = 0.0f;
        if (f11 != f12) {
            if (f10 == f11) {
                f13 = 1.0f;
            } else if (f10 != f12) {
                float f14 = 1.0f / f12;
                f13 = ((1.0f / f10) - f14) / ((1.0f / f11) - f14);
            }
        }
        this.f214d = f13;
    }
}
