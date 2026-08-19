package p1030u1;

import p001A.AbstractC0010F;
import p025An.C0644w;
import p523V9.AbstractC7885F4;
import p523V9.AbstractC8111i5;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: u1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C20096c {

    /* JADX INFO: renamed from: a */
    public final boolean f63626a = false;

    /* JADX INFO: renamed from: b */
    public final int f63627b = 1;

    /* JADX INFO: renamed from: c */
    public final int f63628c;

    /* JADX INFO: renamed from: d */
    public final C20094a[] f63629d;

    /* JADX INFO: renamed from: e */
    public int f63630e;

    /* JADX INFO: renamed from: f */
    public final float[] f63631f;

    /* JADX INFO: renamed from: g */
    public final float[] f63632g;

    /* JADX INFO: renamed from: h */
    public final float[] f63633h;

    public C20096c() {
        int i10;
        int iM24h = AbstractC0010F.m24h(1);
        if (iM24h == 0) {
            i10 = 3;
        } else {
            if (iM24h != 1) {
                throw new C0644w();
            }
            i10 = 2;
        }
        this.f63628c = i10;
        this.f63629d = new C20094a[20];
        this.f63631f = new float[20];
        this.f63632g = new float[20];
        this.f63633h = new float[3];
    }

    /* JADX INFO: renamed from: a */
    public final void m20926a(float f10, long j10) {
        int i10 = (this.f63630e + 1) % 20;
        this.f63630e = i10;
        C20094a[] c20094aArr = this.f63629d;
        C20094a c20094a = c20094aArr[i10];
        if (c20094a != null) {
            c20094a.f63622a = j10;
            c20094a.f63623b = f10;
        } else {
            C20094a c20094a2 = new C20094a();
            c20094a2.f63622a = j10;
            c20094a2.f63623b = f10;
            c20094aArr[i10] = c20094a2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m20927b(float f10) {
        int i10;
        float[] fArr;
        float[] fArr2;
        boolean z6;
        float f11;
        float fSignum;
        float f12 = 0.0f;
        if (f10 <= 0.0f) {
            AbstractC8111i5.m8592c("maximumVelocity should be a positive value. You specified=" + f10);
            throw null;
        }
        int i11 = this.f63630e;
        C20094a[] c20094aArr = this.f63629d;
        C20094a c20094a = c20094aArr[i11];
        if (c20094a == null) {
            f11 = 0.0f;
        } else {
            int i12 = 0;
            C20094a c20094a2 = c20094a;
            do {
                C20094a c20094a3 = c20094aArr[i11];
                boolean z10 = this.f63626a;
                i10 = this.f63627b;
                fArr = this.f63631f;
                fArr2 = this.f63632g;
                if (c20094a3 == null) {
                    z6 = z10;
                    break;
                }
                long j10 = c20094a.f63622a;
                int i13 = i11;
                long j11 = c20094a3.f63622a;
                float f13 = j10 - j11;
                z6 = z10;
                float fAbs = Math.abs(j11 - c20094a2.f63622a);
                c20094a2 = (i10 == 1 || z6) ? c20094a3 : c20094a;
                if (f13 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i12] = c20094a3.f63623b;
                fArr2[i12] = -f13;
                i11 = (i13 == 0 ? 20 : i13) - 1;
                i12++;
            } while (i12 < 20);
            if (i12 >= this.f63628c) {
                int iM24h = AbstractC0010F.m24h(i10);
                if (iM24h == 0) {
                    try {
                        float[] fArr3 = this.f63633h;
                        AbstractC7885F4.m8177e(fArr2, fArr, i12, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = 0.0f;
                    }
                } else {
                    if (iM24h != 1) {
                        throw new C0644w();
                    }
                    int i14 = i12 - 1;
                    float f14 = fArr2[i14];
                    int i15 = i14;
                    float fAbs2 = 0.0f;
                    while (i15 > 0) {
                        int i16 = i15 - 1;
                        float f15 = fArr2[i16];
                        if (f14 != f15) {
                            float f16 = (z6 ? -fArr[i16] : fArr[i15] - fArr[i16]) / (f14 - f15);
                            fAbs2 += Math.abs(f16) * (f16 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i15 == i14) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i15--;
                        f14 = f15;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f12 = fSignum * 1000;
            } else {
                f12 = 0.0f;
            }
            f11 = 0.0f;
        }
        if (f12 == f11 || Float.isNaN(f12)) {
            return f11;
        }
        return f12 > f11 ? AbstractC8301I.m8917h(f12, f10) : AbstractC8301I.m8915f(f12, -f10);
    }
}
