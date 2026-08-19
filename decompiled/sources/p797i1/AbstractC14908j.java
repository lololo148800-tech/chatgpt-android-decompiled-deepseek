package p797i1;

/* JADX INFO: renamed from: i1.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14908j {

    /* JADX INFO: renamed from: a */
    public static final C14917s f46434a = new C14917s(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: b */
    public static final C14917s f46435b = new C14917s(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: c */
    public static final C14917s f46436c = new C14917s(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: d */
    public static final C14917s f46437d = new C14917s(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: e */
    public static final float[] f46438e = {0.964212f, 1.0f, 0.825188f};

    /* JADX INFO: renamed from: a */
    public static AbstractC14901c m16076a(AbstractC14901c abstractC14901c) {
        C14917s c14917s = f46435b;
        C14899a c14899a = C14899a.f46395b;
        if (!AbstractC14900b.m16067a(abstractC14901c.f46403b, AbstractC14900b.f46397a)) {
            return abstractC14901c;
        }
        C14915q c14915q = (C14915q) abstractC14901c;
        C14917s c14917s2 = c14915q.f46453d;
        if (m16079d(c14917s2, c14917s)) {
            return abstractC14901c;
        }
        return new C14915q(c14915q.f46402a, c14915q.f46457h, c14917s, m16083h(m16078c(c14899a.f46396a, c14917s2.m16086a(), c14917s.m16086a()), c14915q.f46458i), c14915q.f46460k, c14915q.f46463n, c14915q.f46454e, c14915q.f46455f, c14915q.f46456g, -1);
    }

    /* JADX INFO: renamed from: b */
    public static float m16077b(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = (((((f12 * f15) + ((f11 * f14) + (f10 * f13))) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
        return f16 < 0.0f ? -f16 : f16;
    }

    /* JADX INFO: renamed from: c */
    public static final float[] m16078c(float[] fArr, float[] fArr2, float[] fArr3) {
        m16085j(fArr, fArr2);
        m16085j(fArr, fArr3);
        return m16083h(m16082g(fArr), m16084i(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m16079d(C14917s c14917s, C14917s c14917s2) {
        if (c14917s == c14917s2) {
            return true;
        }
        return Math.abs(c14917s.f46474a - c14917s2.f46474a) < 0.001f && Math.abs(c14917s.f46475b - c14917s2.f46475b) < 0.001f;
    }

    /* JADX INFO: renamed from: e */
    public static final C14905g m16080e(AbstractC14901c abstractC14901c, AbstractC14901c abstractC14901c2, int i10) {
        if (abstractC14901c == abstractC14901c2) {
            return new C14903e(abstractC14901c, abstractC14901c, 1);
        }
        long j10 = AbstractC14900b.f46397a;
        return (AbstractC14900b.m16067a(abstractC14901c.f46403b, j10) && AbstractC14900b.m16067a(abstractC14901c2.f46403b, j10)) ? new C14904f((C14915q) abstractC14901c, (C14915q) abstractC14901c2, i10) : new C14905g(abstractC14901c, abstractC14901c2, i10);
    }

    /* JADX INFO: renamed from: f */
    public static float m16081f(float f10, float f11, float f12, float f13) {
        return (f10 * f13) - (f11 * f12);
    }

    /* JADX INFO: renamed from: g */
    public static final float[] m16082g(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f12 * f21) + (f11 * f20) + (f10 * f19);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr2[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr2[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr2[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr2[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr2[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr2;
    }

    /* JADX INFO: renamed from: h */
    public static final float[] m16083h(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0];
        float f12 = fArr[3];
        float f13 = fArr2[1];
        float f14 = fArr[6];
        float f15 = fArr2[2];
        float f16 = (f14 * f15) + (f12 * f13) + (f10 * f11);
        float f17 = fArr[1];
        float f18 = fArr[4];
        float f19 = fArr[7];
        float f20 = (f19 * f15) + (f18 * f13) + (f17 * f11);
        float f21 = fArr[2];
        float f22 = fArr[5];
        float f23 = fArr[8];
        float f24 = (f15 * f23) + (f13 * f22) + (f11 * f21);
        float f25 = fArr2[3];
        float f26 = fArr2[4];
        float f27 = fArr2[5];
        float f28 = (f14 * f27) + (f12 * f26) + (f10 * f25);
        float f29 = (f19 * f27) + (f18 * f26) + (f17 * f25);
        float f30 = (f27 * f23) + (f26 * f22) + (f25 * f21);
        float f31 = fArr2[6];
        float f32 = fArr2[7];
        float f33 = (f12 * f32) + (f10 * f31);
        float f34 = fArr2[8];
        return new float[]{f16, f20, f24, f28, f29, f30, (f14 * f34) + f33, (f19 * f34) + (f18 * f32) + (f17 * f31), (f23 * f34) + (f22 * f32) + (f21 * f31)};
    }

    /* JADX INFO: renamed from: i */
    public static final float[] m16084i(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0] * f10;
        float f12 = fArr[1];
        float f13 = fArr2[1] * f12;
        float f14 = fArr[2];
        return new float[]{f11, f13, fArr2[2] * f14, fArr2[3] * f10, fArr2[4] * f12, fArr2[5] * f14, f10 * fArr2[6], f12 * fArr2[7], f14 * fArr2[8]};
    }

    /* JADX INFO: renamed from: j */
    public static final void m16085j(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        fArr2[1] = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        fArr2[2] = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
    }
}
