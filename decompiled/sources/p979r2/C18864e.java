package p979r2;

import android.graphics.Path;
import io.sentry.android.core.AbstractC15256t;
import p499U9.AbstractC7589s;

/* JADX INFO: renamed from: r2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C18864e {

    /* JADX INFO: renamed from: a */
    public char f60091a;

    /* JADX INFO: renamed from: b */
    public final float[] f60092b;

    public C18864e(char c9, float[] fArr) {
        this.f60091a = c9;
        this.f60092b = fArr;
    }

    /* JADX INFO: renamed from: a */
    public static void m20174a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z6, boolean z10) {
        double d10;
        double d11;
        double radians = Math.toRadians(f16);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d12 = f10;
        double d13 = f11;
        double d14 = (d13 * dSin) + (d12 * dCos);
        double d15 = d12;
        double d16 = f14;
        double d17 = d14 / d16;
        double d18 = f15;
        double d19 = ((d13 * dCos) + (((double) (-f10)) * dSin)) / d18;
        double d20 = d13;
        double d21 = f13;
        double d22 = ((d21 * dSin) + (((double) f12) * dCos)) / d16;
        double d23 = ((d21 * dCos) + (((double) (-f12)) * dSin)) / d18;
        double d24 = d17 - d22;
        double d25 = d19 - d23;
        double d26 = (d17 + d22) / 2.0d;
        double d27 = (d19 + d23) / 2.0d;
        double d28 = (d25 * d25) + (d24 * d24);
        if (d28 == 0.0d) {
            AbstractC15256t.m16482t("PathParser", " Points are coincident");
            return;
        }
        double d29 = (1.0d / d28) - 0.25d;
        if (d29 < 0.0d) {
            AbstractC15256t.m16482t("PathParser", "Points are too far apart " + d28);
            float fSqrt = (float) (Math.sqrt(d28) / 1.99999d);
            m20174a(path, f10, f11, f12, f13, f14 * fSqrt, f15 * fSqrt, f16, z6, z10);
            return;
        }
        double dSqrt = Math.sqrt(d29);
        double d30 = d24 * dSqrt;
        double d31 = dSqrt * d25;
        if (z6 == z10) {
            d10 = d26 - d31;
            d11 = d27 + d30;
        } else {
            d10 = d26 + d31;
            d11 = d27 - d30;
        }
        double dAtan2 = Math.atan2(d19 - d11, d17 - d10);
        double dAtan3 = Math.atan2(d23 - d11, d22 - d10) - dAtan2;
        if (z10 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d32 = d10 * d16;
        double d33 = d11 * d18;
        double d34 = (d32 * dCos) - (d33 * dSin);
        double d35 = (d33 * dCos) + (d32 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d36 = -d16;
        double d37 = d36 * dCos2;
        double d38 = d18 * dSin2;
        double d39 = (d37 * dSin3) - (d38 * dCos3);
        double d40 = d36 * dSin2;
        double d41 = d18 * dCos2;
        double d42 = (dCos3 * d41) + (dSin3 * d40);
        double d43 = d41;
        double d44 = dAtan3 / ((double) iCeil);
        int i10 = 0;
        while (i10 < iCeil) {
            double d45 = dAtan2 + d44;
            double dSin4 = Math.sin(d45);
            double dCos4 = Math.cos(d45);
            double d46 = d44;
            double d47 = (((d16 * dCos2) * dCos4) + d34) - (d38 * dSin4);
            double d48 = d43;
            double d49 = d34;
            double d50 = (d48 * dSin4) + (d16 * dSin2 * dCos4) + d35;
            double d51 = (d37 * dSin4) - (d38 * dCos4);
            double d52 = (dCos4 * d48) + (dSin4 * d40);
            double d53 = d45 - dAtan2;
            double dTan = Math.tan(d53 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d53)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d39 * dSqrt2) + d15), (float) ((d42 * dSqrt2) + d20), (float) (d47 - (dSqrt2 * d51)), (float) (d50 - (dSqrt2 * d52)), (float) d47, (float) d50);
            i10++;
            dAtan2 = d45;
            d40 = d40;
            dCos2 = dCos2;
            iCeil = iCeil;
            d42 = d52;
            d16 = d16;
            d39 = d51;
            d15 = d47;
            d20 = d50;
            d34 = d49;
            d44 = d46;
            d43 = d48;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m20175b(C18864e[] c18864eArr, Path path) {
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        C18864e[] c18864eArr2 = c18864eArr;
        int i12 = 6;
        float[] fArr = new float[6];
        int length = c18864eArr2.length;
        int i13 = 0;
        char c9 = 'm';
        while (i13 < length) {
            C18864e c18864e = c18864eArr2[i13];
            char c10 = c18864e.f60091a;
            float f22 = fArr[0];
            float f23 = fArr[1];
            float f24 = fArr[2];
            float f25 = fArr[3];
            float f26 = fArr[4];
            float f27 = fArr[5];
            switch (c10) {
                case 'A':
                case 'a':
                    i10 = 7;
                    break;
                case 'C':
                case 'c':
                    i10 = i12;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i10 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i10 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f26, f27);
                    f22 = f26;
                    f24 = f22;
                    f23 = f27;
                    f25 = f23;
                default:
                    i10 = 2;
                    break;
            }
            float f28 = f26;
            float f29 = f27;
            float f30 = f22;
            float f31 = f23;
            int i14 = 0;
            while (true) {
                float[] fArr2 = c18864e.f60092b;
                if (i14 < fArr2.length) {
                    if (c10 != 'A') {
                        if (c10 != 'C') {
                            if (c10 == 'H') {
                                i11 = i14;
                                c10 = c10;
                                i13 = i13;
                                length = length;
                                c18864e = c18864e;
                                path.lineTo(fArr2[i11], f31);
                                f30 = fArr2[i11];
                            } else if (c10 == 'Q') {
                                i11 = i14;
                                float f32 = fArr2[i11];
                                int i15 = i11 + 1;
                                float f33 = fArr2[i15];
                                int i16 = i11 + 2;
                                int i17 = i11 + 3;
                                path.quadTo(f32, f33, fArr2[i16], fArr2[i17]);
                                f10 = fArr2[i11];
                                f11 = fArr2[i15];
                                f30 = fArr2[i16];
                                f31 = fArr2[i17];
                            } else if (c10 == 'V') {
                                i11 = i14;
                                c10 = c10;
                                i13 = i13;
                                length = length;
                                c18864e = c18864e;
                                path.lineTo(f30, fArr2[i11]);
                                f31 = fArr2[i11];
                            } else if (c10 != 'a') {
                                if (c10 != 'c') {
                                    if (c10 != 'h') {
                                        if (c10 == 'q') {
                                            i11 = i14;
                                            float f34 = f31;
                                            float f35 = f30;
                                            int i18 = i11 + 1;
                                            int i19 = i11 + 2;
                                            int i20 = i11 + 3;
                                            path.rQuadTo(fArr2[i11], fArr2[i18], fArr2[i19], fArr2[i20]);
                                            float f36 = f35 + fArr2[i11];
                                            float f37 = fArr2[i18] + f34;
                                            float f38 = f35 + fArr2[i19];
                                            f31 = f34 + fArr2[i20];
                                            f25 = f37;
                                            f24 = f36;
                                            f30 = f38;
                                        } else if (c10 == 'v') {
                                            i11 = i14;
                                            path.rLineTo(0.0f, fArr2[i11]);
                                            f31 += fArr2[i11];
                                        } else if (c10 == 'L') {
                                            i11 = i14;
                                            int i21 = i11 + 1;
                                            path.lineTo(fArr2[i11], fArr2[i21]);
                                            f30 = fArr2[i11];
                                            f31 = fArr2[i21];
                                        } else if (c10 == 'M') {
                                            i11 = i14;
                                            f30 = fArr2[i11];
                                            f31 = fArr2[i11 + 1];
                                            if (i11 > 0) {
                                                path.lineTo(f30, f31);
                                            } else {
                                                path.moveTo(f30, f31);
                                                f29 = f31;
                                                f28 = f30;
                                            }
                                        } else if (c10 == 'S') {
                                            i11 = i14;
                                            float f39 = f31;
                                            float f40 = f30;
                                            if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                                f16 = (f39 * 2.0f) - f25;
                                                f17 = (f40 * 2.0f) - f24;
                                            } else {
                                                f17 = f40;
                                                f16 = f39;
                                            }
                                            int i22 = i11 + 1;
                                            int i23 = i11 + 2;
                                            int i24 = i11 + 3;
                                            path.cubicTo(f17, f16, fArr2[i11], fArr2[i22], fArr2[i23], fArr2[i24]);
                                            float f41 = fArr2[i11];
                                            float f42 = fArr2[i22];
                                            f30 = fArr2[i23];
                                            f31 = fArr2[i24];
                                            f25 = f42;
                                            f24 = f41;
                                        } else if (c10 == 'T') {
                                            i11 = i14;
                                            float f43 = f31;
                                            float f44 = f30;
                                            if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                f12 = (f44 * 2.0f) - f24;
                                                f13 = (f43 * 2.0f) - f25;
                                            } else {
                                                f12 = f44;
                                                f13 = f43;
                                            }
                                            int i25 = i11 + 1;
                                            path.quadTo(f12, f13, fArr2[i11], fArr2[i25]);
                                            f14 = fArr2[i11];
                                            f15 = fArr2[i25];
                                        } else if (c10 == 'l') {
                                            i11 = i14;
                                            int i26 = i11 + 1;
                                            path.rLineTo(fArr2[i11], fArr2[i26]);
                                            f30 += fArr2[i11];
                                            f31 += fArr2[i26];
                                        } else if (c10 == 'm') {
                                            i11 = i14;
                                            float f45 = fArr2[i11];
                                            f30 += f45;
                                            float f46 = fArr2[i11 + 1];
                                            f31 += f46;
                                            if (i11 > 0) {
                                                path.rLineTo(f45, f46);
                                            } else {
                                                path.rMoveTo(f45, f46);
                                                f29 = f31;
                                                f28 = f30;
                                            }
                                        } else if (c10 == 's') {
                                            if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                                float f47 = f30 - f24;
                                                f18 = f31 - f25;
                                                f19 = f47;
                                            } else {
                                                f18 = 0.0f;
                                                f19 = 0.0f;
                                            }
                                            int i27 = i14 + 1;
                                            int i28 = i14 + 2;
                                            int i29 = i14 + 3;
                                            i11 = i14;
                                            float f48 = f31;
                                            float f49 = f30;
                                            path.rCubicTo(f19, f18, fArr2[i14], fArr2[i27], fArr2[i28], fArr2[i29]);
                                            f12 = f49 + fArr2[i11];
                                            f13 = f48 + fArr2[i27];
                                            f14 = f49 + fArr2[i28];
                                            f15 = fArr2[i29] + f48;
                                        } else if (c10 != 't') {
                                            i11 = i14;
                                        } else {
                                            if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                f20 = f30 - f24;
                                                f21 = f31 - f25;
                                            } else {
                                                f21 = 0.0f;
                                                f20 = 0.0f;
                                            }
                                            int i30 = i14 + 1;
                                            path.rQuadTo(f20, f21, fArr2[i14], fArr2[i30]);
                                            float f50 = f20 + f30;
                                            float f51 = f21 + f31;
                                            f30 += fArr2[i14];
                                            f31 += fArr2[i30];
                                            f25 = f51;
                                            i11 = i14;
                                            f24 = f50;
                                        }
                                        c18864e = c18864e;
                                    } else {
                                        i11 = i14;
                                        path.rLineTo(fArr2[i11], 0.0f);
                                        f30 += fArr2[i11];
                                    }
                                    c18864e = c18864e;
                                } else {
                                    i11 = i14;
                                    float f52 = f31;
                                    float f53 = f30;
                                    int i31 = i11 + 2;
                                    int i32 = i11 + 3;
                                    int i33 = i11 + 4;
                                    int i34 = i11 + 5;
                                    path.rCubicTo(fArr2[i11], fArr2[i11 + 1], fArr2[i31], fArr2[i32], fArr2[i33], fArr2[i34]);
                                    f12 = f53 + fArr2[i31];
                                    f13 = f52 + fArr2[i32];
                                    f14 = f53 + fArr2[i33];
                                    f15 = fArr2[i34] + f52;
                                }
                                f25 = f13;
                                f24 = f12;
                                f30 = f14;
                                f31 = f15;
                                c18864e = c18864e;
                            } else {
                                i11 = i14;
                                float f54 = f31;
                                float f55 = f30;
                                int i35 = i11 + 5;
                                int i36 = i11 + 6;
                                m20174a(path, f55, f54, fArr2[i35] + f55, fArr2[i36] + f54, fArr2[i11], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f, fArr2[i11 + 4] != 0.0f);
                                f30 = f55 + fArr2[i35];
                                f31 = f54 + fArr2[i36];
                            }
                            i14 = i11 + i10;
                            c18864e = c18864e;
                            length = length;
                            c9 = c10;
                            c10 = c9;
                            i13 = i13;
                        } else {
                            i11 = i14;
                            int i37 = i11 + 2;
                            int i38 = i11 + 3;
                            int i39 = i11 + 4;
                            int i40 = i11 + 5;
                            path.cubicTo(fArr2[i11], fArr2[i11 + 1], fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                            f30 = fArr2[i39];
                            f31 = fArr2[i40];
                            f10 = fArr2[i37];
                            f11 = fArr2[i38];
                        }
                        f24 = f10;
                        f25 = f11;
                        i14 = i11 + i10;
                        c18864e = c18864e;
                        length = length;
                        c9 = c10;
                        c10 = c9;
                        i13 = i13;
                    } else {
                        i11 = i14;
                        int i41 = i11 + 5;
                        int i42 = i11 + 6;
                        m20174a(path, f30, f31, fArr2[i41], fArr2[i42], fArr2[i11], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f, fArr2[i11 + 4] != 0.0f);
                        f30 = fArr2[i41];
                        f31 = fArr2[i42];
                    }
                    f25 = f31;
                    f24 = f30;
                    i14 = i11 + i10;
                    c18864e = c18864e;
                    length = length;
                    c9 = c10;
                    c10 = c9;
                    i13 = i13;
                }
            }
            fArr[0] = f30;
            fArr[1] = f31;
            fArr[2] = f24;
            fArr[3] = f25;
            fArr[4] = f28;
            fArr[5] = f29;
            c9 = c18864e.f60091a;
            i13++;
            c18864eArr2 = c18864eArr;
            length = length;
            i12 = 6;
        }
    }

    public C18864e(C18864e c18864e) {
        this.f60091a = c18864e.f60091a;
        float[] fArr = c18864e.f60092b;
        this.f60092b = AbstractC7589s.m7927b(fArr, fArr.length);
    }
}
