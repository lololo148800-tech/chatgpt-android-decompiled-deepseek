package p758g0;

import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import p658b5.C11238i;

/* JADX INFO: renamed from: g0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C13729E implements InterfaceC13727C {

    /* JADX INFO: renamed from: a */
    public final float f43292a;

    /* JADX INFO: renamed from: b */
    public final C13745V f43293b;

    @Override // p758g0.InterfaceC13772l
    /* JADX INFO: renamed from: a */
    public final InterfaceC13787s0 mo15214a(C13783q0 c13783q0) {
        return new C11238i(this);
    }

    @Override // p758g0.InterfaceC13727C
    /* JADX INFO: renamed from: b */
    public final float mo15210b(long j10, float f10, float f11, float f12) {
        C13745V c13745v = this.f43293b;
        c13745v.f43345a = f11;
        return Float.intBitsToFloat((int) (c13745v.m15219a(f10, f12, j10 / 1000000) & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0144  */
    @Override // p758g0.InterfaceC13727C
    /* JADX INFO: renamed from: c */
    public final long mo15211c(float f10, float f11, float f12) {
        double d10;
        double d11;
        double dLog;
        long j10;
        double d12;
        long j11;
        C13745V c13745v = this.f43293b;
        double d13 = c13745v.f43346b;
        float f13 = (float) (d13 * d13);
        float f14 = c13745v.f43351g;
        float f15 = this.f43292a;
        float f16 = (f10 - f11) / f15;
        float f17 = f12 / f15;
        if (f14 == 0.0f) {
            j11 = 9223372036854L;
        } else {
            double d14 = f13;
            double d15 = f14;
            double d16 = f17;
            double d17 = f16;
            double d18 = 1.0f;
            double dSqrt = d15 * 2.0d * Math.sqrt(d14);
            double d19 = (dSqrt * dSqrt) - (d14 * 4.0d);
            double d20 = -dSqrt;
            C13790u c13790u = d19 < 0.0d ? new C13790u(0.0d, Math.sqrt(Math.abs(d19))) : new C13790u(Math.sqrt(d19), 0.0d);
            c13790u.f43556a = (c13790u.f43556a + d20) * 0.5d;
            c13790u.f43557b *= 0.5d;
            C13790u c13790u2 = d19 < 0.0d ? new C13790u(0.0d, Math.sqrt(Math.abs(d19))) : new C13790u(Math.sqrt(d19), 0.0d);
            double d21 = -1;
            double d22 = c13790u2.f43556a * d21;
            double d23 = c13790u2.f43557b * d21;
            c13790u2.f43556a = (d22 + d20) * 0.5d;
            c13790u2.f43557b = d23 * 0.5d;
            if (d17 == 0.0d && d16 == 0.0d) {
                j10 = 0;
            } else {
                if (d17 < 0.0d) {
                    d16 = -d16;
                }
                double dAbs = Math.abs(d17);
                if (d15 > 1.0d) {
                    double d24 = c13790u.f43556a;
                    double d25 = c13790u2.f43556a;
                    double d26 = (d24 * dAbs) - d16;
                    double d27 = d24 - d25;
                    double d28 = d26 / d27;
                    double d29 = dAbs - d28;
                    double dLog2 = Math.log(Math.abs(d18 / d29)) / d24;
                    double dLog3 = Math.log(Math.abs(d18 / d28)) / d25;
                    if (Double.isInfinite(dLog2) || Double.isNaN(dLog2)) {
                        dLog2 = dLog3;
                    } else if (!Double.isInfinite(dLog3) && !Double.isNaN(dLog3)) {
                        dLog2 = Math.max(dLog2, dLog3);
                    }
                    double d30 = d29 * d24;
                    double d31 = dLog2;
                    double dLog4 = Math.log(d30 / ((-d28) * d25)) / (d25 - d24);
                    if (Double.isNaN(dLog4) || dLog4 <= 0.0d) {
                        d12 = -d18;
                        dLog = d31;
                    } else if (dLog4 <= 0.0d) {
                        d12 = d18;
                        dLog = Math.log((-((d28 * d25) * d25)) / (d30 * d24)) / d27;
                    } else if ((-((Math.exp(dLog4 * d25) * d28) + (Math.exp(d24 * dLog4) * d29))) < d18) {
                        dLog = (d28 <= 0.0d || d29 >= 0.0d) ? d31 : 0.0d;
                        d12 = -d18;
                    } else {
                        d12 = d18;
                        dLog = Math.log((-((d28 * d25) * d25)) / (d30 * d24)) / d27;
                    }
                    double d32 = d28 * d25;
                    if (Math.abs((Math.exp(d25 * dLog) * d32) + (Math.exp(d24 * dLog) * d30)) >= 1.0E-4d) {
                        int i10 = 0;
                        double dAbs2 = Double.MAX_VALUE;
                        for (double d33 = 0.001d; dAbs2 > d33 && i10 < 100; d33 = 0.001d) {
                            i10++;
                            double d34 = d24 * dLog;
                            double d35 = d25 * dLog;
                            double dExp = dLog - ((((Math.exp(d35) * d28) + (Math.exp(d34) * d29)) + d12) / ((Math.exp(d35) * d32) + (Math.exp(d34) * d30)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else {
                    C13790u c13790u3 = c13790u;
                    if (d15 < 1.0d) {
                        d10 = d18;
                        double d36 = c13790u3.f43556a;
                        double d37 = (d16 - (d36 * dAbs)) / c13790u3.f43557b;
                        dLog = Math.log(d10 / Math.sqrt((d37 * d37) + (dAbs * dAbs))) / d36;
                    } else {
                        d10 = d18;
                        double d38 = c13790u3.f43556a;
                        double d39 = d38 * dAbs;
                        double d40 = d16 - d39;
                        double dLog5 = Math.log(Math.abs(d10 / dAbs)) / d38;
                        double dLog6 = Math.log(Math.abs(d10 / d40));
                        double dLog7 = dLog6;
                        for (int i11 = 0; i11 < 6; i11++) {
                            dLog7 = dLog6 - Math.log(Math.abs(dLog7 / d38));
                        }
                        double d41 = dLog7 / d38;
                        if (Double.isInfinite(dLog5) || Double.isNaN(dLog5)) {
                            dLog5 = d41;
                        } else if (!Double.isInfinite(d41) && !Double.isNaN(d41)) {
                            dLog5 = Math.max(dLog5, d41);
                        }
                        double d42 = (-(d39 + d40)) / (d38 * d40);
                        double d43 = d38 * d42;
                        double d44 = dLog5;
                        double dExp2 = (Math.exp(d43) * d40 * d42) + (Math.exp(d43) * dAbs);
                        if (Double.isNaN(d42) || d42 <= 0.0d) {
                            d10 = -d10;
                            d11 = d44;
                        } else if (d42 <= 0.0d || (-dExp2) >= d10) {
                            d11 = (-(2.0d / d38)) - (dAbs / d40);
                        } else {
                            d10 = -d10;
                            d11 = (d40 >= 0.0d || dAbs <= 0.0d) ? d44 : 0.0d;
                        }
                        dLog = d11;
                        int i12 = 0;
                        double dAbs3 = Double.MAX_VALUE;
                        while (dAbs3 > 0.001d && i12 < 100) {
                            i12++;
                            double d45 = d38 * dLog;
                            double dExp3 = dLog - (((Math.exp(d45) * ((d40 * dLog) + dAbs)) + d10) / (Math.exp(d45) * (((d45 + ((double) 1)) * d40) + d39)));
                            dAbs3 = Math.abs(dLog - dExp3);
                            dLog = dExp3;
                        }
                    }
                }
                j10 = (long) (1000.0d * dLog);
            }
            j11 = j10;
        }
        return j11 * 1000000;
    }

    @Override // p758g0.InterfaceC13727C
    /* JADX INFO: renamed from: d */
    public final float mo15212d(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // p758g0.InterfaceC13727C
    /* JADX INFO: renamed from: e */
    public final float mo15213e(long j10, float f10, float f11, float f12) {
        C13745V c13745v = this.f43293b;
        c13745v.f43345a = f11;
        return Float.intBitsToFloat((int) (c13745v.m15219a(f10, f12, j10 / 1000000) >> 32));
    }

    public C13729E(float f10, float f11, float f12) {
        this.f43292a = f12;
        C13745V c13745v = new C13745V();
        c13745v.f43345a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        c13745v.f43346b = dSqrt;
        c13745v.f43351g = 1.0f;
        if (f10 >= 0.0f) {
            c13745v.f43351g = f10;
            c13745v.f43347c = false;
            if (((float) (dSqrt * dSqrt)) > 0.0f) {
                c13745v.f43346b = Math.sqrt(f11);
                c13745v.f43347c = false;
                this.f43293b = c13745v;
                return;
            }
            throw new IllegalArgumentException(lZYtIbClQJm.bbrt);
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }
}
