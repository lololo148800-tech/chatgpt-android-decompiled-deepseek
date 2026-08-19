package p955q2;

/* JADX INFO: renamed from: q2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C18620l {

    /* JADX INFO: renamed from: k */
    public static final C18620l f59302k;

    /* JADX INFO: renamed from: a */
    public final float f59303a;

    /* JADX INFO: renamed from: b */
    public final float f59304b;

    /* JADX INFO: renamed from: c */
    public final float f59305c;

    /* JADX INFO: renamed from: d */
    public final float f59306d;

    /* JADX INFO: renamed from: e */
    public final float f59307e;

    /* JADX INFO: renamed from: f */
    public final float f59308f;

    /* JADX INFO: renamed from: g */
    public final float[] f59309g;

    /* JADX INFO: renamed from: h */
    public final float f59310h;

    /* JADX INFO: renamed from: i */
    public final float f59311i;

    /* JADX INFO: renamed from: j */
    public final float f59312j;

    static {
        float[] fArr = AbstractC18610b.f59276c;
        float fM19968n = (float) ((((double) AbstractC18610b.m19968n()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC18610b.f59274a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        float f18 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM19968n) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp};
        float f19 = 1.0f / ((5.0f * fM19968n) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float fCbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(((double) fM19968n) * 5.0d))) + (f20 * fM19968n);
        float fM19968n2 = AbstractC18610b.m19968n() / fArr[1];
        double d11 = fM19968n2;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f15)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f16)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f17)) / 100.0d, 0.42d)};
        float f22 = fArr7[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[2];
        float[] fArr8 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        f59302k = new C18620l(fM19968n2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f18, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public C18620l(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f59308f = f10;
        this.f59303a = f11;
        this.f59304b = f12;
        this.f59305c = f13;
        this.f59306d = f14;
        this.f59307e = f15;
        this.f59309g = fArr;
        this.f59310h = f16;
        this.f59311i = f17;
        this.f59312j = f18;
    }
}
