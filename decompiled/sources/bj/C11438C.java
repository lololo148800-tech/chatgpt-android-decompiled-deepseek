package bj;

import android.gov.nist.core.Separators;
import p026Ao.C0665N;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p026Ao.InterfaceC0663L;
import p026Ao.InterfaceC0677k;
import p959q8.C18639a;

/* JADX INFO: renamed from: bj.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C11438C implements InterfaceC0663L {

    /* JADX INFO: renamed from: t0 */
    public static final C0678l f34556t0;

    /* JADX INFO: renamed from: u0 */
    public static final C0678l f34557u0;

    /* JADX INFO: renamed from: v0 */
    public static final C0678l f34558v0;

    /* JADX INFO: renamed from: w0 */
    public static final C0678l f34559w0;

    /* JADX INFO: renamed from: x0 */
    public static final C0678l f34560x0;

    /* JADX INFO: renamed from: y0 */
    public static final C0678l f34561y0;

    /* JADX INFO: renamed from: Y */
    public final InterfaceC0677k f34562Y;

    /* JADX INFO: renamed from: Z */
    public final C0675i f34563Z;

    /* JADX INFO: renamed from: o0 */
    public final C0675i f34564o0;

    /* JADX INFO: renamed from: p0 */
    public C0678l f34565p0;

    /* JADX INFO: renamed from: q0 */
    public int f34566q0;

    /* JADX INFO: renamed from: r0 */
    public long f34567r0 = 0;

    /* JADX INFO: renamed from: s0 */
    public boolean f34568s0 = false;

    static {
        C0678l c0678l = C0678l.f1971p0;
        f34556t0 = C18639a.m19996n("[]{}\"'/#");
        f34557u0 = C18639a.m19996n("'\\");
        f34558v0 = C18639a.m19996n("\"\\");
        f34559w0 = C18639a.m19996n(Separators.NEWLINE);
        f34560x0 = C18639a.m19996n(Separators.STAR);
        f34561y0 = C0678l.f1971p0;
    }

    public C11438C(InterfaceC0677k interfaceC0677k, C0675i c0675i, C0678l c0678l, int i10) {
        this.f34562Y = interfaceC0677k;
        this.f34563Z = interfaceC0677k.mo1353b();
        this.f34564o0 = c0675i;
        this.f34565p0 = c0678l;
        this.f34566q0 = i10;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: H */
    public final long mo1325H(C0675i c0675i, long j10) {
        if (this.f34568s0) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        C0675i c0675i2 = this.f34564o0;
        boolean zMo1356g = c0675i2.mo1356g();
        C0675i c0675i3 = this.f34563Z;
        if (!zMo1356g) {
            long jMo1325H = c0675i2.mo1325H(c0675i, j10);
            long j11 = j10 - jMo1325H;
            if (c0675i3.mo1356g()) {
                return jMo1325H;
            }
            long jMo1325H2 = mo1325H(c0675i, j11);
            return jMo1325H2 != -1 ? jMo1325H + jMo1325H2 : jMo1325H;
        }
        m12821a(j10);
        long j12 = this.f34567r0;
        if (j12 == 0) {
            if (this.f34565p0 == f34561y0) {
                return -1L;
            }
            throw new AssertionError();
        }
        long jMin = Math.min(j10, j12);
        c0675i.mo1338n0(c0675i3, jMin);
        this.f34567r0 -= jMin;
        return jMin;
    }

    /* JADX INFO: renamed from: a */
    public final void m12821a(long j10) {
        while (true) {
            long j11 = this.f34567r0;
            if (j11 >= j10) {
                return;
            }
            C0678l c0678l = this.f34565p0;
            C0678l c0678l2 = f34561y0;
            if (c0678l == c0678l2) {
                return;
            }
            C0675i c0675i = this.f34563Z;
            long j12 = c0675i.f1970Z;
            InterfaceC0677k interfaceC0677k = this.f34562Y;
            if (j11 == j12) {
                if (j11 > 0) {
                    return;
                } else {
                    interfaceC0677k.mo1362s(1L);
                }
            }
            long jM1440j0 = c0675i.m1440j0(this.f34567r0, this.f34565p0);
            if (jM1440j0 == -1) {
                this.f34567r0 = c0675i.f1970Z;
            } else {
                byte bM1422T = c0675i.m1422T(jM1440j0);
                C0678l c0678l3 = this.f34565p0;
                C0678l c0678l4 = f34556t0;
                C0678l c0678l5 = f34558v0;
                C0678l c0678l6 = f34557u0;
                C0678l c0678l7 = f34560x0;
                C0678l c0678l8 = f34559w0;
                if (c0678l3 == c0678l4) {
                    if (bM1422T == 34) {
                        this.f34565p0 = c0678l5;
                        this.f34567r0 = jM1440j0 + 1;
                    } else if (bM1422T == 35) {
                        this.f34565p0 = c0678l8;
                        this.f34567r0 = jM1440j0 + 1;
                    } else if (bM1422T == 39) {
                        this.f34565p0 = c0678l6;
                        this.f34567r0 = jM1440j0 + 1;
                    } else if (bM1422T != 47) {
                        if (bM1422T != 91) {
                            if (bM1422T != 93) {
                                if (bM1422T != 123) {
                                    if (bM1422T != 125) {
                                    }
                                }
                            }
                            int i10 = this.f34566q0 - 1;
                            this.f34566q0 = i10;
                            if (i10 == 0) {
                                this.f34565p0 = c0678l2;
                            }
                            this.f34567r0 = jM1440j0 + 1;
                        }
                        this.f34566q0++;
                        this.f34567r0 = jM1440j0 + 1;
                    } else {
                        long j13 = 2 + jM1440j0;
                        interfaceC0677k.mo1362s(j13);
                        long j14 = jM1440j0 + 1;
                        byte bM1422T2 = c0675i.m1422T(j14);
                        if (bM1422T2 == 47) {
                            this.f34565p0 = c0678l8;
                            this.f34567r0 = j13;
                        } else if (bM1422T2 == 42) {
                            this.f34565p0 = c0678l7;
                            this.f34567r0 = j13;
                        } else {
                            this.f34567r0 = j14;
                        }
                    }
                } else if (c0678l3 == c0678l6 || c0678l3 == c0678l5) {
                    if (bM1422T == 92) {
                        long j15 = jM1440j0 + 2;
                        interfaceC0677k.mo1362s(j15);
                        this.f34567r0 = j15;
                    } else {
                        if (this.f34566q0 > 0) {
                            c0678l2 = c0678l4;
                        }
                        this.f34565p0 = c0678l2;
                        this.f34567r0 = jM1440j0 + 1;
                    }
                } else if (c0678l3 == c0678l7) {
                    long j16 = 2 + jM1440j0;
                    interfaceC0677k.mo1362s(j16);
                    long j17 = jM1440j0 + 1;
                    if (c0675i.m1422T(j17) == 47) {
                        this.f34567r0 = j16;
                        this.f34565p0 = c0678l4;
                    } else {
                        this.f34567r0 = j17;
                    }
                } else {
                    if (c0678l3 != c0678l8) {
                        throw new AssertionError();
                    }
                    this.f34567r0 = jM1440j0 + 1;
                    this.f34565p0 = c0678l4;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34568s0 = true;
    }

    @Override // p026Ao.InterfaceC0663L
    /* JADX INFO: renamed from: h */
    public final C0665N mo1326h() {
        return this.f34562Y.mo1326h();
    }
}
