package p797i1;

import p594Y9.AbstractC9930m3;
import p774h1.AbstractC14334L;

/* JADX INFO: renamed from: i1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C14910l extends AbstractC14901c {

    /* JADX INFO: renamed from: d */
    public static final float[] f46440d;

    /* JADX INFO: renamed from: e */
    public static final float[] f46441e;

    /* JADX INFO: renamed from: f */
    public static final float[] f46442f;

    /* JADX INFO: renamed from: g */
    public static final float[] f46443g;

    static {
        float[] fArrM16083h = AbstractC14908j.m16083h(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC14908j.m16078c(C14899a.f46395b.f46396a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f46440d = fArrM16083h;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f46441e = fArr;
        f46442f = AbstractC14908j.m16082g(fArrM16083h);
        f46443g = AbstractC14908j.m16082g(fArr);
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: a */
    public final float mo16069a(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: b */
    public final float mo16070b(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: d */
    public final long mo16072d(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f46443g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f46442f;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f19) + (fArr2[4] * f18) + (fArr2[1] * f17))) & 4294967295L) | (((long) Float.floatToRawIntBits((fArr2[6] * f19) + ((fArr2[3] * f18) + (fArr2[0] * f17)))) << 32);
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: e */
    public final float mo16073e(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f46443g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f46442f;
        return (fArr2[8] * f19) + (fArr2[5] * f18) + (fArr2[2] * f17);
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: f */
    public final long mo16074f(float f10, float f11, float f12, float f13, AbstractC14901c abstractC14901c) {
        float[] fArr = f46440d;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        float fM10587a = AbstractC9930m3.m10587a(f14);
        float fM10587a2 = AbstractC9930m3.m10587a(f15);
        float fM10587a3 = AbstractC9930m3.m10587a(f16);
        float[] fArr2 = f46441e;
        return AbstractC14334L.m15624b((fArr2[6] * fM10587a3) + (fArr2[3] * fM10587a2) + (fArr2[0] * fM10587a), (fArr2[7] * fM10587a3) + (fArr2[4] * fM10587a2) + (fArr2[1] * fM10587a), (fArr2[8] * fM10587a3) + (fArr2[5] * fM10587a2) + (fArr2[2] * fM10587a), f13, abstractC14901c);
    }
}
