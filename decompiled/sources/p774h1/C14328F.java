package p774h1;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21323q;
import p523V9.AbstractC8088f6;
import p615Z6.C10235r;
import p759g1.C13800b;

/* JADX INFO: renamed from: h1.F */
/* JADX INFO: loaded from: classes.dex */
public final class C14328F {

    /* JADX INFO: renamed from: a */
    public final float[] f44968a;

    /* JADX INFO: renamed from: a */
    public static float[] m15602a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* JADX INFO: renamed from: b */
    public static final long m15603b(long j10, float[] fArr) {
        float fM15306g = C13800b.m15306g(j10);
        float fM15307h = C13800b.m15307h(j10);
        float f10 = 1 / (((fArr[7] * fM15307h) + (fArr[3] * fM15306g)) + fArr[15]);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        return AbstractC8088f6.m8536b(((fArr[4] * fM15307h) + (fArr[0] * fM15306g) + fArr[12]) * f10, ((fArr[5] * fM15307h) + (fArr[1] * fM15306g) + fArr[13]) * f10);
    }

    /* JADX INFO: renamed from: c */
    public static final void m15604c(float[] fArr, C10235r c10235r) {
        long jM15603b = m15603b(AbstractC8088f6.m8536b(c10235r.f30390b, c10235r.f30391c), fArr);
        long jM15603b2 = m15603b(AbstractC8088f6.m8536b(c10235r.f30390b, c10235r.f30393e), fArr);
        long jM15603b3 = m15603b(AbstractC8088f6.m8536b(c10235r.f30392d, c10235r.f30391c), fArr);
        long jM15603b4 = m15603b(AbstractC8088f6.m8536b(c10235r.f30392d, c10235r.f30393e), fArr);
        c10235r.f30390b = Math.min(Math.min(C13800b.m15306g(jM15603b), C13800b.m15306g(jM15603b2)), Math.min(C13800b.m15306g(jM15603b3), C13800b.m15306g(jM15603b4)));
        c10235r.f30391c = Math.min(Math.min(C13800b.m15307h(jM15603b), C13800b.m15307h(jM15603b2)), Math.min(C13800b.m15307h(jM15603b3), C13800b.m15307h(jM15603b4)));
        c10235r.f30392d = Math.max(Math.max(C13800b.m15306g(jM15603b), C13800b.m15306g(jM15603b2)), Math.max(C13800b.m15306g(jM15603b3), C13800b.m15306g(jM15603b4)));
        c10235r.f30393e = Math.max(Math.max(C13800b.m15307h(jM15603b), C13800b.m15307h(jM15603b2)), Math.max(C13800b.m15307h(jM15603b3), C13800b.m15307h(jM15603b4)));
    }

    /* JADX INFO: renamed from: d */
    public static final void m15605d(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                fArr[(i11 * 4) + i10] = i10 == i11 ? 1.0f : 0.0f;
                i11++;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m15606e(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = (fSin * f12) + (fCos * f11);
        float f14 = -fSin;
        float f15 = (f12 * fCos) + (f11 * f14);
        float f16 = fArr[1];
        float f17 = fArr[5];
        float f18 = (fSin * f17) + (fCos * f16);
        float f19 = (f17 * fCos) + (f16 * f14);
        float f20 = fArr[2];
        float f21 = fArr[6];
        float f22 = (fSin * f21) + (fCos * f20);
        float f23 = (f21 * fCos) + (f20 * f14);
        float f24 = fArr[3];
        float f25 = fArr[7];
        float f26 = (fSin * f25) + (fCos * f24);
        fArr[0] = f13;
        fArr[1] = f18;
        fArr[2] = f22;
        fArr[3] = f26;
        fArr[4] = f15;
        fArr[5] = f19;
        fArr[6] = f23;
        fArr[7] = (fCos * f25) + (f14 * f24);
    }

    /* JADX INFO: renamed from: f */
    public static final void m15607f(float[] fArr, float f10, float f11, float f12) {
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * f12;
        fArr[9] = fArr[9] * f12;
        fArr[10] = fArr[10] * f12;
        fArr[11] = fArr[11] * f12;
    }

    /* JADX INFO: renamed from: g */
    public static final void m15608g(float[] fArr, float[] fArr2) {
        float fM15634l = AbstractC14334L.m15634l(fArr, 0, fArr2, 0);
        float fM15634l2 = AbstractC14334L.m15634l(fArr, 0, fArr2, 1);
        float fM15634l3 = AbstractC14334L.m15634l(fArr, 0, fArr2, 2);
        float fM15634l4 = AbstractC14334L.m15634l(fArr, 0, fArr2, 3);
        float fM15634l5 = AbstractC14334L.m15634l(fArr, 1, fArr2, 0);
        float fM15634l6 = AbstractC14334L.m15634l(fArr, 1, fArr2, 1);
        float fM15634l7 = AbstractC14334L.m15634l(fArr, 1, fArr2, 2);
        float fM15634l8 = AbstractC14334L.m15634l(fArr, 1, fArr2, 3);
        float fM15634l9 = AbstractC14334L.m15634l(fArr, 2, fArr2, 0);
        float fM15634l10 = AbstractC14334L.m15634l(fArr, 2, fArr2, 1);
        float fM15634l11 = AbstractC14334L.m15634l(fArr, 2, fArr2, 2);
        float fM15634l12 = AbstractC14334L.m15634l(fArr, 2, fArr2, 3);
        float fM15634l13 = AbstractC14334L.m15634l(fArr, 3, fArr2, 0);
        float fM15634l14 = AbstractC14334L.m15634l(fArr, 3, fArr2, 1);
        float fM15634l15 = AbstractC14334L.m15634l(fArr, 3, fArr2, 2);
        float fM15634l16 = AbstractC14334L.m15634l(fArr, 3, fArr2, 3);
        fArr[0] = fM15634l;
        fArr[1] = fM15634l2;
        fArr[2] = fM15634l3;
        fArr[3] = fM15634l4;
        fArr[4] = fM15634l5;
        fArr[5] = fM15634l6;
        fArr[6] = fM15634l7;
        fArr[7] = fM15634l8;
        fArr[8] = fM15634l9;
        fArr[9] = fM15634l10;
        fArr[10] = fM15634l11;
        fArr[11] = fM15634l12;
        fArr[12] = fM15634l13;
        fArr[13] = fM15634l14;
        fArr[14] = fM15634l15;
        fArr[15] = fM15634l16;
    }

    /* JADX INFO: renamed from: h */
    public static final void m15609h(float[] fArr, float f10, float f11, float f12) {
        float f13 = (fArr[8] * f12) + (fArr[4] * f11) + (fArr[0] * f10) + fArr[12];
        float f14 = (fArr[9] * f12) + (fArr[5] * f11) + (fArr[1] * f10) + fArr[13];
        float f15 = (fArr[10] * f12) + (fArr[6] * f11) + (fArr[2] * f10) + fArr[14];
        float f16 = (fArr[11] * f12) + (fArr[7] * f11) + (fArr[3] * f10) + fArr[15];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14328F) {
            return AbstractC16544l.m18089b(this.f44968a, ((C14328F) obj).f44968a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44968a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |");
        float[] fArr = this.f44968a;
        sb2.append(fArr[0]);
        sb2.append(' ');
        sb2.append(fArr[1]);
        sb2.append(' ');
        sb2.append(fArr[2]);
        sb2.append(' ');
        sb2.append(fArr[3]);
        sb2.append("|\n            |");
        sb2.append(fArr[4]);
        sb2.append(' ');
        sb2.append(fArr[5]);
        sb2.append(' ');
        sb2.append(fArr[6]);
        sb2.append(' ');
        sb2.append(fArr[7]);
        sb2.append("|\n            |");
        sb2.append(fArr[8]);
        sb2.append(' ');
        sb2.append(fArr[9]);
        sb2.append(' ');
        sb2.append(fArr[10]);
        sb2.append(' ');
        sb2.append(fArr[11]);
        sb2.append("|\n            |");
        sb2.append(fArr[12]);
        sb2.append(' ');
        sb2.append(fArr[13]);
        sb2.append(' ');
        sb2.append(fArr[14]);
        sb2.append(' ');
        sb2.append(fArr[15]);
        sb2.append("|\n        ");
        return AbstractC21323q.m21717d(sb2.toString());
    }
}
