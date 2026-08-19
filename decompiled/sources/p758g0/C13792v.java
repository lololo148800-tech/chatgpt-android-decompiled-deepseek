package p758g0;

import com.google.protobuf.AbstractC12107L1;
import p594Y9.AbstractC9930m3;
import p774h1.AbstractC14334L;

/* JADX INFO: renamed from: g0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C13792v implements InterfaceC13798z {

    /* JADX INFO: renamed from: Y */
    public final float f43563Y;

    /* JADX INFO: renamed from: Z */
    public final float f43564Z;

    /* JADX INFO: renamed from: o0 */
    public final float f43565o0;

    /* JADX INFO: renamed from: p0 */
    public final float f43566p0;

    /* JADX INFO: renamed from: q0 */
    public final float f43567q0;

    /* JADX INFO: renamed from: r0 */
    public final float f43568r0;

    public C13792v(float f10, float f11, float f12, float f13) {
        int iM15622K;
        this.f43563Y = f10;
        this.f43564Z = f11;
        this.f43565o0 = f12;
        this.f43566p0 = f13;
        if (Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) {
            throw new IllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        float[] fArr = new float[5];
        float f14 = (f11 - 0.0f) * 3.0f;
        float f15 = (f13 - f11) * 3.0f;
        float f16 = (1.0f - f13) * 3.0f;
        double d10 = f14;
        double d11 = f15;
        double d12 = f16;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            iM15622K = d11 == d12 ? 0 : AbstractC14334L.m15622K((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), 0, fArr);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
            double d16 = (-d10) + d11;
            int iM15622K2 = AbstractC14334L.m15622K((float) ((-(d15 + d16)) / d14), 0, fArr);
            iM15622K = AbstractC14334L.m15622K((float) ((d15 - d16) / d14), iM15622K2, fArr) + iM15622K2;
            if (iM15622K > 1) {
                float f17 = fArr[0];
                float f18 = fArr[1];
                if (f17 > f18) {
                    fArr[0] = f18;
                    fArr[1] = f17;
                } else if (f17 == f18) {
                    iM15622K--;
                }
            }
        }
        float f19 = (f15 - f14) * 2.0f;
        int iM15622K3 = AbstractC14334L.m15622K((-f19) / (((f16 - f15) * 2.0f) - f19), iM15622K, fArr) + iM15622K;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i10 = 0; i10 < iM15622K3; i10++) {
            float f20 = fArr[i10];
            float f21 = (((((((((f11 - f13) * 3.0f) + 1.0f) - 0.0f) * f20) + (((f13 - (f11 * 2.0f)) + 0.0f) * 3.0f)) * f20) + f14) * f20) + 0.0f;
            fMin = Math.min(fMin, f21);
            fMax = Math.max(fMax, f21);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f43567q0 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f43568r0 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:124:0x0215 A[PHI: r3
      0x0215: PHI (r3v5 float) = (r3v4 float), (r3v3 float) binds: [B:128:0x0220, B:123:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0073  */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0171  */
    @Override // p758g0.InterfaceC13798z
    /* JADX INFO: renamed from: a */
    public final float mo9579a(float f10) {
        float fM10587a;
        float fCos;
        if (f10 <= 0.0f || f10 >= 1.0f) {
            return f10;
        }
        float f11 = 0.0f - f10;
        float f12 = this.f43563Y;
        float f13 = f12 - f10;
        float f14 = this.f43565o0;
        float f15 = f14 - f10;
        double d10 = f11;
        double d11 = ((d10 - (((double) f13) * 2.0d)) + ((double) f15)) * 3.0d;
        double d12 = ((double) (f13 - f11)) * 3.0d;
        double d13 = (((double) (f13 - f15)) * 3.0d) + ((double) (-f11)) + ((double) (1.0f - f10));
        float f16 = Float.NaN;
        if (Math.abs(d13 - 0.0d) >= 1.0E-7d) {
            double d14 = d11 / d13;
            double d15 = d12 / d13;
            double d16 = ((d15 * 3.0d) - (d14 * d14)) / 9.0d;
            double d17 = (((d10 / d13) * 27.0d) + ((((2.0d * d14) * d14) * d14) - ((9.0d * d14) * d15))) / 54.0d;
            double d18 = d16 * d16 * d16;
            double d19 = (d17 * d17) + d18;
            double d20 = d14 / 3.0d;
            if (d19 < 0.0d) {
                double dSqrt = Math.sqrt(-d18);
                double d21 = (-d17) / dSqrt;
                if (d21 < -1.0d) {
                    d21 = -1.0d;
                }
                if (d21 > 1.0d) {
                    d21 = 1.0d;
                }
                double dAcos = Math.acos(d21);
                double dM10587a = AbstractC9930m3.m10587a((float) dSqrt) * 2.0f;
                fCos = (float) ((Math.cos(dAcos / 3.0d) * dM10587a) - d20);
                if (fCos < 0.0f) {
                    if (fCos >= -8.34465E-7f) {
                        fCos = 0.0f;
                    } else {
                        fCos = Float.NaN;
                    }
                } else if (fCos > 1.0f) {
                    if (fCos <= 1.0000008f) {
                        fCos = 1.0f;
                    } else {
                        fCos = Float.NaN;
                    }
                }
                if (Float.isNaN(fCos)) {
                    fCos = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dM10587a) - d20);
                    if (fCos < 0.0f) {
                        if (fCos >= -8.34465E-7f) {
                            fCos = 0.0f;
                        } else {
                            fCos = Float.NaN;
                        }
                    } else if (fCos > 1.0f) {
                        if (fCos <= 1.0000008f) {
                            fCos = 1.0f;
                        } else {
                            fCos = Float.NaN;
                        }
                    }
                    if (Float.isNaN(fCos)) {
                        fM10587a = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dM10587a) - d20);
                        if (fM10587a < 0.0f) {
                            if (fM10587a >= -8.34465E-7f) {
                                fM10587a = 0.0f;
                            }
                            f16 = fM10587a;
                        } else {
                            if (fM10587a > 1.0f) {
                                if (fM10587a <= 1.0000008f) {
                                    fM10587a = 1.0f;
                                }
                            }
                            f16 = fM10587a;
                        }
                        fM10587a = Float.NaN;
                        f16 = fM10587a;
                    }
                }
                f16 = fCos;
            } else if (d19 == 0.0d) {
                float f17 = -AbstractC9930m3.m10587a((float) d17);
                float f18 = (float) d20;
                float f19 = (f17 * 2.0f) - f18;
                if (f19 < 0.0f) {
                    if (f19 >= -8.34465E-7f) {
                        f19 = 0.0f;
                    } else {
                        f19 = Float.NaN;
                    }
                } else if (f19 > 1.0f) {
                    if (f19 <= 1.0000008f) {
                        f19 = 1.0f;
                    } else {
                        f19 = Float.NaN;
                    }
                }
                if (Float.isNaN(f19)) {
                    fM10587a = (-f17) - f18;
                    if (fM10587a < 0.0f) {
                        if (fM10587a >= -8.34465E-7f) {
                            fM10587a = 0.0f;
                        }
                        f16 = fM10587a;
                    } else {
                        if (fM10587a > 1.0f) {
                            if (fM10587a <= 1.0000008f) {
                                fM10587a = 1.0f;
                            }
                        }
                        f16 = fM10587a;
                    }
                    fM10587a = Float.NaN;
                    f16 = fM10587a;
                } else {
                    f16 = f19;
                }
            } else {
                double dSqrt2 = Math.sqrt(d19);
                fM10587a = (float) (((double) (AbstractC9930m3.m10587a((float) ((-d17) + dSqrt2)) - AbstractC9930m3.m10587a((float) (d17 + dSqrt2)))) - d20);
                float f20 = 0.0f;
                if (fM10587a >= 0.0f) {
                    f20 = 1.0f;
                    if (fM10587a > 1.0f) {
                        if (fM10587a <= 1.0000008f) {
                            fM10587a = f20;
                        } else {
                            fM10587a = Float.NaN;
                        }
                    }
                } else if (fM10587a >= -8.34465E-7f) {
                    fM10587a = f20;
                } else {
                    fM10587a = Float.NaN;
                }
                f16 = fM10587a;
            }
        } else if (Math.abs(d11 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d22 = d11 * 2.0d;
            fCos = (float) ((dSqrt3 - d12) / d22);
            if (fCos < 0.0f) {
                if (fCos >= -8.34465E-7f) {
                    fCos = 0.0f;
                } else {
                    fCos = Float.NaN;
                }
            } else if (fCos > 1.0f) {
                if (fCos <= 1.0000008f) {
                    fCos = 1.0f;
                } else {
                    fCos = Float.NaN;
                }
            }
            if (Float.isNaN(fCos)) {
                fM10587a = (float) (((-d12) - dSqrt3) / d22);
                if (fM10587a < 0.0f) {
                    if (fM10587a >= -8.34465E-7f) {
                        fM10587a = 0.0f;
                    }
                    f16 = fM10587a;
                } else {
                    if (fM10587a > 1.0f) {
                        if (fM10587a <= 1.0000008f) {
                            fM10587a = 1.0f;
                        }
                    }
                    f16 = fM10587a;
                }
                fM10587a = Float.NaN;
                f16 = fM10587a;
            } else {
                f16 = fCos;
            }
        } else if (Math.abs(d12 - 0.0d) >= 1.0E-7d) {
            fM10587a = (float) ((-d10) / d12);
            if (fM10587a < 0.0f) {
                if (fM10587a >= -8.34465E-7f) {
                    fM10587a = 0.0f;
                }
                f16 = fM10587a;
            } else {
                if (fM10587a > 1.0f) {
                    if (fM10587a <= 1.0000008f) {
                        fM10587a = 1.0f;
                    }
                }
                f16 = fM10587a;
            }
            fM10587a = Float.NaN;
            f16 = fM10587a;
        }
        boolean zIsNaN = Float.isNaN(f16);
        float f21 = this.f43566p0;
        float f22 = this.f43564Z;
        if (!zIsNaN) {
            float f23 = ((((((f22 - f21) + 0.33333334f) * f16) + (f21 - (2.0f * f22))) * f16) + f22) * 3.0f * f16;
            float f24 = this.f43567q0;
            if (f23 < f24) {
                f23 = f24;
            }
            float f25 = this.f43568r0;
            return f23 > f25 ? f25 : f23;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f12 + ", " + f22 + ", " + f14 + ", " + f21 + ") has no solution at " + f10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13792v) {
            C13792v c13792v = (C13792v) obj;
            if (this.f43563Y == c13792v.f43563Y && this.f43564Z == c13792v.f43564Z && this.f43565o0 == c13792v.f43565o0 && this.f43566p0 == c13792v.f43566p0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f43566p0) + AbstractC12107L1.m13819j(this.f43565o0, AbstractC12107L1.m13819j(this.f43564Z, Float.floatToIntBits(this.f43563Y) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CubicBezierEasing(a=");
        sb2.append(this.f43563Y);
        sb2.append(", b=");
        sb2.append(this.f43564Z);
        sb2.append(", c=");
        sb2.append(this.f43565o0);
        sb2.append(", d=");
        return AbstractC12107L1.m13825p(sb2, this.f43566p0, ')');
    }
}
