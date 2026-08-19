package p911o0;

import p054C0.C1501n;
import p1095x1.AbstractC21069X;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1140z1.AbstractC21668N;
import p1140z1.InterfaceC21718w;
import p492U1.C7536a;
import p492U1.C7545j;
import p571X9.AbstractC9113C4;
import p571X9.AbstractC9388w4;
import p571X9.AbstractC9406z4;
import p635a1.AbstractC10458p;
import p909nm.C17690x;

/* JADX INFO: renamed from: o0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C17772n extends AbstractC10458p implements InterfaceC21718w {

    /* JADX INFO: renamed from: A0 */
    public boolean f56731A0;

    /* JADX INFO: renamed from: z0 */
    public float f56732z0;

    /* JADX INFO: renamed from: K0 */
    public final long m19501K0(long j10, boolean z6) {
        int iRound;
        int iM7853h = C7536a.m7853h(j10);
        if (iM7853h == Integer.MAX_VALUE || (iRound = Math.round(iM7853h * this.f56732z0)) <= 0) {
            return 0L;
        }
        long jM9643a = AbstractC9113C4.m9643a(iRound, iM7853h);
        if (!z6 || AbstractC9388w4.m9968k(j10, jM9643a)) {
            return jM9643a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: L0 */
    public final long m19502L0(long j10, boolean z6) {
        int iRound;
        int iM7854i = C7536a.m7854i(j10);
        if (iM7854i == Integer.MAX_VALUE || (iRound = Math.round(iM7854i / this.f56732z0)) <= 0) {
            return 0L;
        }
        long jM9643a = AbstractC9113C4.m9643a(iM7854i, iRound);
        if (!z6 || AbstractC9388w4.m9968k(j10, jM9643a)) {
            return jM9643a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: M0 */
    public final long m19503M0(long j10, boolean z6) {
        int iM7855j = C7536a.m7855j(j10);
        int iRound = Math.round(iM7855j * this.f56732z0);
        if (iRound <= 0) {
            return 0L;
        }
        long jM9643a = AbstractC9113C4.m9643a(iRound, iM7855j);
        if (!z6 || AbstractC9388w4.m9968k(j10, jM9643a)) {
            return jM9643a;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: N0 */
    public final long m19504N0(long j10, boolean z6) {
        int iM7856k = C7536a.m7856k(j10);
        int iRound = Math.round(iM7856k / this.f56732z0);
        if (iRound <= 0) {
            return 0L;
        }
        long jM9643a = AbstractC9113C4.m9643a(iM7856k, iRound);
        if (!z6 || AbstractC9388w4.m9968k(j10, jM9643a)) {
            return jM9643a;
        }
        return 0L;
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: d */
    public final int mo2144d(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f56732z0) : interfaceC21056J.mo21532o(i10);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: f */
    public final InterfaceC21058L mo2145f(InterfaceC21059M interfaceC21059M, InterfaceC21056J interfaceC21056J, long j10) {
        long jM19501K0;
        if (this.f56731A0) {
            jM19501K0 = m19501K0(j10, true);
            if (C7545j.m7886a(jM19501K0, 0L)) {
                jM19501K0 = m19502L0(j10, true);
                if (C7545j.m7886a(jM19501K0, 0L)) {
                    jM19501K0 = m19503M0(j10, true);
                    if (C7545j.m7886a(jM19501K0, 0L)) {
                        jM19501K0 = m19504N0(j10, true);
                        if (C7545j.m7886a(jM19501K0, 0L)) {
                            jM19501K0 = m19501K0(j10, false);
                            if (C7545j.m7886a(jM19501K0, 0L)) {
                                jM19501K0 = m19502L0(j10, false);
                                if (C7545j.m7886a(jM19501K0, 0L)) {
                                    jM19501K0 = m19503M0(j10, false);
                                    if (C7545j.m7886a(jM19501K0, 0L)) {
                                        jM19501K0 = m19504N0(j10, false);
                                        if (C7545j.m7886a(jM19501K0, 0L)) {
                                            jM19501K0 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jM19501K0 = m19502L0(j10, true);
            if (C7545j.m7886a(jM19501K0, 0L)) {
                jM19501K0 = m19501K0(j10, true);
                if (C7545j.m7886a(jM19501K0, 0L)) {
                    jM19501K0 = m19504N0(j10, true);
                    if (C7545j.m7886a(jM19501K0, 0L)) {
                        jM19501K0 = m19503M0(j10, true);
                        if (C7545j.m7886a(jM19501K0, 0L)) {
                            jM19501K0 = m19502L0(j10, false);
                            if (C7545j.m7886a(jM19501K0, 0L)) {
                                jM19501K0 = m19501K0(j10, false);
                                if (C7545j.m7886a(jM19501K0, 0L)) {
                                    jM19501K0 = m19504N0(j10, false);
                                    if (C7545j.m7886a(jM19501K0, 0L)) {
                                        jM19501K0 = m19503M0(j10, false);
                                        if (C7545j.m7886a(jM19501K0, 0L)) {
                                            jM19501K0 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!C7545j.m7886a(jM19501K0, 0L)) {
            int i10 = (int) (jM19501K0 >> 32);
            int i11 = (int) (4294967295L & jM19501K0);
            if (i10 < 0 || i11 < 0) {
                AbstractC9406z4.m9983b("width(" + i10 + ") and height(" + i11 + ") must be >= 0");
                throw null;
            }
            j10 = AbstractC9388w4.m9966i(i10, i10, i11, i11);
        }
        AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(j10);
        return interfaceC21059M.mo19936R(abstractC21069XMo21533p.f66981Y, abstractC21069XMo21533p.f66982Z, C17690x.f56481Y, new C1501n(abstractC21069XMo21533p, 8));
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: g */
    public final int mo2146g(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f56732z0) : interfaceC21056J.mo21530b(i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: h */
    public final int mo2147h(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f56732z0) : interfaceC21056J.mo21529G(i10);
    }

    @Override // p1140z1.InterfaceC21718w
    /* JADX INFO: renamed from: k */
    public final int mo2148k(AbstractC21668N abstractC21668N, InterfaceC21056J interfaceC21056J, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f56732z0) : interfaceC21056J.mo21531l(i10);
    }
}
