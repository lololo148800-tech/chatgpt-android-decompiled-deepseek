package p797i1;

import p774h1.AbstractC14334L;

/* JADX INFO: renamed from: i1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C14909k extends AbstractC14901c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f46439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14909k(long j10, String str, int i10, int i11) {
        super(j10, str, i10);
        this.f46439d = i11;
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: a */
    public final float mo16069a(int i10) {
        switch (this.f46439d) {
            case 0:
                return i10 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: b */
    public final float mo16070b(int i10) {
        switch (this.f46439d) {
            case 0:
                return i10 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: d */
    public final long mo16072d(float f10, float f11, float f12) {
        switch (this.f46439d) {
            case 0:
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f10 > 100.0f) {
                    f10 = 100.0f;
                }
                if (f11 < -128.0f) {
                    f11 = -128.0f;
                }
                if (f11 > 128.0f) {
                    f11 = 128.0f;
                }
                float f13 = (f10 + 16.0f) / 116.0f;
                float f14 = (f11 * 0.002f) + f13;
                float f15 = f14 > 0.20689656f ? f14 * f14 * f14 : (f14 - 0.13793103f) * 0.12841855f;
                float f16 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
                float[] fArr = AbstractC14908j.f46438e;
                return (((long) Float.floatToRawIntBits(f16 * fArr[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f15 * fArr[0])) << 32);
            default:
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 > 2.0f) {
                    f10 = 2.0f;
                }
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11 <= 2.0f ? f11 : 2.0f)) & 4294967295L);
        }
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: e */
    public final float mo16073e(float f10, float f11, float f12) {
        switch (this.f46439d) {
            case 0:
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f10 > 100.0f) {
                    f10 = 100.0f;
                }
                if (f12 < -128.0f) {
                    f12 = -128.0f;
                }
                if (f12 > 128.0f) {
                    f12 = 128.0f;
                }
                float f13 = ((f10 + 16.0f) / 116.0f) - (f12 * 0.005f);
                return (f13 > 0.20689656f ? f13 * f13 * f13 : 0.12841855f * (f13 - 0.13793103f)) * AbstractC14908j.f46438e[2];
            default:
                if (f12 < -2.0f) {
                    f12 = -2.0f;
                }
                if (f12 > 2.0f) {
                    return 2.0f;
                }
                return f12;
        }
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: f */
    public final long mo16074f(float f10, float f11, float f12, float f13, AbstractC14901c abstractC14901c) {
        switch (this.f46439d) {
            case 0:
                float[] fArr = AbstractC14908j.f46438e;
                float f14 = f10 / fArr[0];
                float f15 = f11 / fArr[1];
                float f16 = f12 / fArr[2];
                float fCbrt = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f;
                float f17 = (116.0f * fCbrt2) - 16.0f;
                float f18 = (fCbrt - fCbrt2) * 500.0f;
                float fCbrt3 = (fCbrt2 - (f16 > 0.008856452f ? (float) Math.cbrt(f16) : (f16 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f17 < 0.0f) {
                    f17 = 0.0f;
                }
                if (f17 > 100.0f) {
                    f17 = 100.0f;
                }
                if (f18 < -128.0f) {
                    f18 = -128.0f;
                }
                if (f18 > 128.0f) {
                    f18 = 128.0f;
                }
                if (fCbrt3 < -128.0f) {
                    fCbrt3 = -128.0f;
                }
                return AbstractC14334L.m15624b(f17, f18, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f13, abstractC14901c);
            default:
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 > 2.0f) {
                    f10 = 2.0f;
                }
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 > 2.0f) {
                    f11 = 2.0f;
                }
                if (f12 < -2.0f) {
                    f12 = -2.0f;
                }
                return AbstractC14334L.m15624b(f10, f11, f12 <= 2.0f ? f12 : 2.0f, f13, abstractC14901c);
        }
    }
}
