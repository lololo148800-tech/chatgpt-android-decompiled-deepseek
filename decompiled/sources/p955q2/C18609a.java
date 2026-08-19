package p955q2;

import android.graphics.Color;
import p979r2.AbstractC18861b;

/* JADX INFO: renamed from: q2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18609a {

    /* JADX INFO: renamed from: a */
    public final float f59268a;

    /* JADX INFO: renamed from: b */
    public final float f59269b;

    /* JADX INFO: renamed from: c */
    public final float f59270c;

    /* JADX INFO: renamed from: d */
    public final float f59271d;

    /* JADX INFO: renamed from: e */
    public final float f59272e;

    /* JADX INFO: renamed from: f */
    public final float f59273f;

    public C18609a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f59268a = f10;
        this.f59269b = f11;
        this.f59270c = f12;
        this.f59271d = f13;
        this.f59272e = f14;
        this.f59273f = f15;
    }

    /* JADX INFO: renamed from: a */
    public static C18609a m19955a(int i10) {
        C18620l c18620l = C18620l.f59302k;
        float fM19963g = AbstractC18610b.m19963g(Color.red(i10));
        float fM19963g2 = AbstractC18610b.m19963g(Color.green(i10));
        float fM19963g3 = AbstractC18610b.m19963g(Color.blue(i10));
        float[][] fArr = AbstractC18610b.f59277d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * fM19963g3) + (fArr2[1] * fM19963g2) + (fArr2[0] * fM19963g);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * fM19963g3) + (fArr3[1] * fM19963g2) + (fArr3[0] * fM19963g);
        float[] fArr4 = fArr[2];
        float f12 = (fM19963g3 * fArr4[2]) + (fM19963g2 * fArr4[1]) + (fM19963g * fArr4[0]);
        float[][] fArr5 = AbstractC18610b.f59274a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f10);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = c18620l.f59309g;
        float f16 = fArr9[0] * f13;
        float f17 = fArr9[1] * f14;
        float f18 = fArr9[2] * f15;
        float fAbs = Math.abs(f16);
        float f19 = c18620l.f59310h;
        float fPow = (float) Math.pow(((double) (fAbs * f19)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f17) * f19)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f18) * f19)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f16) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f17) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f18) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f20 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d10)) / 11.0f;
        float f21 = ((float) (((double) (fSignum + fSignum2)) - (d10 * 2.0d))) / 9.0f;
        float f22 = fSignum2 * 20.0f;
        float f23 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f22)) / 20.0f;
        float f24 = (((fSignum * 40.0f) + f22) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f25 = fAtan2;
        float f26 = (3.1415927f * f25) / 180.0f;
        float f27 = f24 * c18620l.f59304b;
        float f28 = c18620l.f59303a;
        float f29 = c18620l.f59306d;
        float fPow4 = ((float) Math.pow(f27 / f28, c18620l.f59312j * f29)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f30 = f28 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c18620l.f59308f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f25) < 20.14d ? 360.0f + f25 : f25)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c18620l.f59307e) * c18620l.f59305c) * ((float) Math.sqrt((f21 * f21) + (f20 * f20)))) / (f23 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f31 = c18620l.f59311i * fSqrt;
        Math.sqrt((fPow5 * f29) / f30);
        float f32 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f31 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f26;
        return new C18609a(f25, fSqrt, fPow4, f32, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    /* JADX INFO: renamed from: b */
    public static C18609a m19956b(float f10, float f11, float f12) {
        C18620l c18620l = C18620l.f59302k;
        float f13 = c18620l.f59306d;
        double d10 = ((double) f10) / 100.0d;
        Math.sqrt(d10);
        float f14 = c18620l.f59303a + 4.0f;
        float f15 = c18620l.f59311i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(d10))) * c18620l.f59306d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((((double) f15) * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f12) / 180.0f;
        return new C18609a(f12, f11, f10, f16, fLog * ((float) Math.cos(d11)), fLog * ((float) Math.sin(d11)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX INFO: renamed from: c */
    public final int m19957c(C18620l c18620l) {
        float fSqrt;
        float f10 = this.f59269b;
        double d10 = f10;
        float f11 = this.f59270c;
        if (d10 != 0.0d) {
            double d11 = f11;
            if (d11 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f10 / ((float) Math.sqrt(d11 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, c18620l.f59308f), 0.73d), 1.1111111111111112d);
        double d12 = (this.f59268a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d12) + 3.8d)) * 0.25f;
        float fPow2 = c18620l.f59303a * ((float) Math.pow(((double) f11) / 100.0d, (1.0d / ((double) c18620l.f59306d)) / ((double) c18620l.f59312j)));
        float f12 = fCos * 3846.1538f * c18620l.f59307e * c18620l.f59305c;
        float f13 = fPow2 / c18620l.f59304b;
        float fSin = (float) Math.sin(d12);
        float fCos2 = (float) Math.cos(d12);
        float f14 = (((0.305f + f13) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f12 * 23.0f)));
        float f15 = fCos2 * f14;
        float f16 = f14 * fSin;
        float f17 = f13 * 460.0f;
        float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
        float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
        float f20 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f18)) * 27.13d) / (400.0d - ((double) Math.abs(f18))));
        float fSignum = Math.signum(f18);
        float f21 = 100.0f / c18620l.f59310h;
        float fPow3 = fSignum * f21 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(f19) * f21 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f19)) * 27.13d) / (400.0d - ((double) Math.abs(f19)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f20) * f21 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f20)) * 27.13d) / (400.0d - ((double) Math.abs(f20)))), 2.380952380952381d));
        float[] fArr = c18620l.f59309g;
        float f22 = fPow3 / fArr[0];
        float f23 = fSignum2 / fArr[1];
        float f24 = fSignum3 / fArr[2];
        float[][] fArr2 = AbstractC18610b.f59275b;
        float[] fArr3 = fArr2[0];
        float f25 = (fArr3[2] * f24) + (fArr3[1] * f23) + (fArr3[0] * f22);
        float[] fArr4 = fArr2[1];
        float f26 = (fArr4[2] * f24) + (fArr4[1] * f23) + (fArr4[0] * f22);
        float[] fArr5 = fArr2[2];
        return AbstractC18861b.m20163a(f25, f26, (f24 * fArr5[2]) + (f23 * fArr5[1]) + (f22 * fArr5[0]));
    }
}
