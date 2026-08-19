package p758g0;

import com.google.protobuf.AbstractC12107L1;
import java.util.Arrays;
import p959q8.C18639a;

/* JADX INFO: renamed from: g0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C13788t {

    /* JADX INFO: renamed from: s */
    public static float[] f43537s;

    /* JADX INFO: renamed from: a */
    public final float f43538a;

    /* JADX INFO: renamed from: b */
    public final float f43539b;

    /* JADX INFO: renamed from: c */
    public final float f43540c;

    /* JADX INFO: renamed from: d */
    public final float f43541d;

    /* JADX INFO: renamed from: e */
    public final float f43542e;

    /* JADX INFO: renamed from: f */
    public final float f43543f;

    /* JADX INFO: renamed from: g */
    public final float f43544g;

    /* JADX INFO: renamed from: h */
    public float f43545h;

    /* JADX INFO: renamed from: i */
    public float f43546i;

    /* JADX INFO: renamed from: j */
    public final float[] f43547j;

    /* JADX INFO: renamed from: k */
    public final float f43548k;

    /* JADX INFO: renamed from: l */
    public final float f43549l;

    /* JADX INFO: renamed from: m */
    public final float f43550m;

    /* JADX INFO: renamed from: n */
    public final float f43551n;

    /* JADX INFO: renamed from: o */
    public final float f43552o;

    /* JADX INFO: renamed from: p */
    public final float f43553p;

    /* JADX INFO: renamed from: q */
    public final boolean f43554q;

    /* JADX INFO: renamed from: r */
    public final boolean f43555r;

    public C13788t(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z6;
        float f16 = f12;
        this.f43538a = f10;
        this.f43539b = f11;
        this.f43540c = f16;
        this.f43541d = f13;
        this.f43542e = f14;
        this.f43543f = f15;
        float f17 = f14 - f16;
        float f18 = f15 - f13;
        int i11 = 1;
        boolean z10 = i10 == 1 || (i10 == 4 ? f18 > 0.0f : !(i10 != 5 || f18 >= 0.0f));
        this.f43554q = z10;
        float f19 = f11 - f10;
        float f20 = 1 / f19;
        this.f43548k = f20;
        boolean z11 = 3 == i10;
        if (z11 || Math.abs(f17) < 0.001f || Math.abs(f18) < 0.001f) {
            float fHypot = (float) Math.hypot(f18, f17);
            this.f43544g = fHypot;
            this.f43553p = fHypot * f20;
            this.f43551n = f17 / f19;
            this.f43552o = f18 / f19;
            this.f43547j = new float[101];
            this.f43549l = Float.NaN;
            this.f43550m = Float.NaN;
            z6 = true;
        } else {
            this.f43547j = new float[101];
            this.f43549l = (z10 ? -1 : 1) * f17;
            this.f43550m = f18 * (z10 ? 1 : -1);
            this.f43551n = z10 ? f14 : f16;
            this.f43552o = z10 ? f13 : f15;
            float f21 = f13 - f15;
            int length = C18639a.m19993g().length;
            float fHypot2 = 0.0f;
            float f22 = 0.0f;
            float f23 = 0.0f;
            int i12 = 0;
            while (i12 < length) {
                double radians = (float) Math.toRadians((((double) i12) * 90.0d) / ((double) (C18639a.m19993g().length - i11)));
                float fSin = ((float) Math.sin(radians)) * f17;
                float fCos = ((float) Math.cos(radians)) * f21;
                if (i12 > 0) {
                    fHypot2 += (float) Math.hypot(fSin - f22, fCos - f23);
                    C18639a.m19993g()[i12] = fHypot2;
                }
                i12++;
                f21 = f21;
                f23 = fCos;
                f22 = fSin;
                i11 = 1;
            }
            this.f43544g = fHypot2;
            int length2 = C18639a.m19993g().length;
            for (int i13 = 0; i13 < length2; i13++) {
                float[] fArrM19993g = C18639a.m19993g();
                fArrM19993g[i13] = fArrM19993g[i13] / fHypot2;
            }
            float[] fArr = this.f43547j;
            int length3 = fArr.length;
            for (int i14 = 0; i14 < length3; i14++) {
                float length4 = i14 / (fArr.length - 1);
                float[] fArrM19993g2 = C18639a.m19993g();
                int iBinarySearch = Arrays.binarySearch(fArrM19993g2, 0, fArrM19993g2.length, length4);
                if (iBinarySearch >= 0) {
                    fArr[i14] = iBinarySearch / (C18639a.m19993g().length - 1);
                } else if (iBinarySearch == -1) {
                    fArr[i14] = 0.0f;
                } else {
                    int i15 = -iBinarySearch;
                    int i16 = i15 - 2;
                    fArr[i14] = (((length4 - C18639a.m19993g()[i16]) / (C18639a.m19993g()[i15 - 1] - C18639a.m19993g()[i16])) + i16) / (C18639a.m19993g().length - 1);
                }
            }
            this.f43553p = this.f43544g * this.f43548k;
            z6 = z11;
        }
        this.f43555r = z6;
    }

    /* JADX INFO: renamed from: a */
    public final float m15292a() {
        float f10 = this.f43549l * this.f43546i;
        float fHypot = this.f43553p / ((float) Math.hypot(f10, (-this.f43550m) * this.f43545h));
        if (this.f43554q) {
            f10 = -f10;
        }
        return f10 * fHypot;
    }

    /* JADX INFO: renamed from: b */
    public final float m15293b() {
        float f10 = this.f43549l * this.f43546i;
        float f11 = (-this.f43550m) * this.f43545h;
        float fHypot = this.f43553p / ((float) Math.hypot(f10, f11));
        return this.f43554q ? (-f11) * fHypot : f11 * fHypot;
    }

    /* JADX INFO: renamed from: c */
    public final void m15294c(float f10) {
        float f11 = (this.f43554q ? this.f43539b - f10 : f10 - this.f43538a) * this.f43548k;
        float fM13818i = 0.0f;
        if (f11 > 0.0f) {
            fM13818i = 1.0f;
            if (f11 < 1.0f) {
                float[] fArr = this.f43547j;
                float length = f11 * (fArr.length - 1);
                int i10 = (int) length;
                float f12 = fArr[i10];
                fM13818i = AbstractC12107L1.m13818i(fArr[i10 + 1], f12, length - i10, f12);
            }
        }
        double d10 = fM13818i * 1.5707964f;
        this.f43545h = (float) Math.sin(d10);
        this.f43546i = (float) Math.cos(d10);
    }
}
