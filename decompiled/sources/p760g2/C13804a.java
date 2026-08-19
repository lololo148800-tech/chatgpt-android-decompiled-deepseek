package p760g2;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p571X9.AbstractC9306j0;
import p655b2.C11218b;
import p655b2.C11219c;
import p655b2.C11221e;

/* JADX INFO: renamed from: g2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13804a extends AbstractC13812i {

    /* JADX INFO: renamed from: t0 */
    public int f43599t0 = 0;

    /* JADX INFO: renamed from: u0 */
    public boolean f43600u0 = true;

    /* JADX INFO: renamed from: v0 */
    public int f43601v0 = 0;

    /* JADX INFO: renamed from: w0 */
    public boolean f43602w0 = false;

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: B */
    public final boolean mo15336B() {
        return this.f43602w0;
    }

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: C */
    public final boolean mo15337C() {
        return this.f43602w0;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m15338X() {
        int i10;
        int i11;
        int i12;
        boolean z6 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f43781s0;
            if (i13 >= i10) {
                break;
            }
            C13807d c13807d = this.f43780r0[i13];
            if ((this.f43600u0 || c13807d.mo15341d()) && ((((i11 = this.f43599t0) == 0 || i11 == 1) && !c13807d.mo15336B()) || (((i12 = this.f43599t0) == 2 || i12 == 3) && !c13807d.mo15337C()))) {
                z6 = false;
            }
            i13++;
        }
        if (!z6 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z10 = false;
        for (int i14 = 0; i14 < this.f43781s0; i14++) {
            C13807d c13807d2 = this.f43780r0[i14];
            if (this.f43600u0 || c13807d2.mo15341d()) {
                if (!z10) {
                    int i15 = this.f43599t0;
                    if (i15 == 0) {
                        iMax = c13807d2.mo15381j(2).m15345d();
                    } else if (i15 == 1) {
                        iMax = c13807d2.mo15381j(4).m15345d();
                    } else if (i15 == 2) {
                        iMax = c13807d2.mo15381j(3).m15345d();
                    } else if (i15 == 3) {
                        iMax = c13807d2.mo15381j(5).m15345d();
                    }
                    z10 = true;
                }
                int i16 = this.f43599t0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, c13807d2.mo15381j(2).m15345d());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, c13807d2.mo15381j(4).m15345d());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, c13807d2.mo15381j(3).m15345d());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, c13807d2.mo15381j(5).m15345d());
                }
            }
        }
        int i17 = iMax + this.f43601v0;
        int i18 = this.f43599t0;
        if (i18 == 0 || i18 == 1) {
            m15364K(i17, i17);
        } else {
            m15365L(i17, i17);
        }
        this.f43602w0 = true;
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public final int m15339Y() {
        int i10 = this.f43599t0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: c */
    public final void mo15340c(C11219c c11219c, boolean z6) {
        boolean z10;
        int i10;
        int i11;
        C13806c[] c13806cArr = this.f43646R;
        C13806c c13806c = this.f43638J;
        c13806cArr[0] = c13806c;
        C13806c c13806c2 = this.f43639K;
        int i12 = 2;
        c13806cArr[2] = c13806c2;
        C13806c c13806c3 = this.f43640L;
        c13806cArr[1] = c13806c3;
        C13806c c13806c4 = this.f43641M;
        c13806cArr[3] = c13806c4;
        for (C13806c c13806c5 : c13806cArr) {
            c13806c5.f43628i = c11219c.m12467k(c13806c5);
        }
        int i13 = this.f43599t0;
        if (i13 < 0 || i13 >= 4) {
            return;
        }
        C13806c c13806c6 = c13806cArr[i13];
        if (!this.f43602w0) {
            m15338X();
        }
        if (this.f43602w0) {
            this.f43602w0 = false;
            int i14 = this.f43599t0;
            if (i14 == 0 || i14 == 1) {
                c11219c.m12460d(c13806c.f43628i, this.f43654Z);
                c11219c.m12460d(c13806c3.f43628i, this.f43654Z);
                return;
            } else {
                if (i14 == 2 || i14 == 3) {
                    c11219c.m12460d(c13806c2.f43628i, this.f43656a0);
                    c11219c.m12460d(c13806c4.f43628i, this.f43656a0);
                    return;
                }
                return;
            }
        }
        int i15 = 0;
        while (true) {
            if (i15 >= this.f43781s0) {
                z10 = false;
                break;
            }
            C13807d c13807d = this.f43780r0[i15];
            if ((this.f43600u0 || c13807d.mo15341d()) && ((((i11 = this.f43599t0) == 0 || i11 == 1) && c13807d.f43688q0[0] == 3 && c13807d.f43638J.f43625f != null && c13807d.f43640L.f43625f != null) || ((i11 == 2 || i11 == 3) && c13807d.f43688q0[1] == 3 && c13807d.f43639K.f43625f != null && c13807d.f43641M.f43625f != null))) {
                z10 = true;
                break;
            }
            i15++;
        }
        boolean z11 = c13806c.m15348g() || c13806c3.m15348g();
        boolean z12 = c13806c2.m15348g() || c13806c4.m15348g();
        int i16 = (z10 || !(((i10 = this.f43599t0) == 0 && z11) || ((i10 == 2 && z12) || ((i10 == 1 && z11) || (i10 == 3 && z12))))) ? 4 : 5;
        int i17 = 0;
        while (i17 < this.f43781s0) {
            C13807d c13807d2 = this.f43780r0[i17];
            if (this.f43600u0 || c13807d2.mo15341d()) {
                C11221e c11221eM12467k = c11219c.m12467k(c13807d2.f43646R[this.f43599t0]);
                int i18 = this.f43599t0;
                C13806c c13806c7 = c13807d2.f43646R[i18];
                c13806c7.f43628i = c11221eM12467k;
                C13806c c13806c8 = c13806c7.f43625f;
                int i19 = (c13806c8 == null || c13806c8.f43623d != this) ? 0 : c13806c7.f43626g;
                if (i18 == 0 || i18 == i12) {
                    C11221e c11221e = c13806c6.f43628i;
                    int i20 = this.f43601v0 - i19;
                    C11218b c11218bM12468l = c11219c.m12468l();
                    C11221e c11221eM12469m = c11219c.m12469m();
                    c11221eM12469m.f33970p0 = 0;
                    c11218bM12468l.m12449c(c11221e, c11221eM12467k, c11221eM12469m, i20);
                    c11219c.m12459c(c11218bM12468l);
                } else {
                    C11221e c11221e2 = c13806c6.f43628i;
                    int i21 = this.f43601v0 + i19;
                    C11218b c11218bM12468l2 = c11219c.m12468l();
                    C11221e c11221eM12469m2 = c11219c.m12469m();
                    c11221eM12469m2.f33970p0 = 0;
                    c11218bM12468l2.m12448b(c11221e2, c11221eM12467k, c11221eM12469m2, i21);
                    c11219c.m12459c(c11218bM12468l2);
                }
                c11219c.m12461e(c13806c6.f43628i, c11221eM12467k, this.f43601v0 + i19, i16);
            }
            i17++;
            i12 = 2;
        }
        int i22 = this.f43599t0;
        if (i22 == 0) {
            c11219c.m12461e(c13806c3.f43628i, c13806c.f43628i, 0, 8);
            c11219c.m12461e(c13806c.f43628i, this.f43649U.f43640L.f43628i, 0, 4);
            c11219c.m12461e(c13806c.f43628i, this.f43649U.f43638J.f43628i, 0, 0);
            return;
        }
        if (i22 == 1) {
            c11219c.m12461e(c13806c.f43628i, c13806c3.f43628i, 0, 8);
            c11219c.m12461e(c13806c.f43628i, this.f43649U.f43638J.f43628i, 0, 4);
            c11219c.m12461e(c13806c.f43628i, this.f43649U.f43640L.f43628i, 0, 0);
        } else if (i22 == 2) {
            c11219c.m12461e(c13806c4.f43628i, c13806c2.f43628i, 0, 8);
            c11219c.m12461e(c13806c2.f43628i, this.f43649U.f43641M.f43628i, 0, 4);
            c11219c.m12461e(c13806c2.f43628i, this.f43649U.f43639K.f43628i, 0, 0);
        } else if (i22 == 3) {
            c11219c.m12461e(c13806c2.f43628i, c13806c4.f43628i, 0, 8);
            c11219c.m12461e(c13806c2.f43628i, this.f43649U.f43639K.f43628i, 0, 4);
            c11219c.m12461e(c13806c2.f43628i, this.f43649U.f43641M.f43628i, 0, 0);
        }
    }

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: d */
    public final boolean mo15341d() {
        return true;
    }

    @Override // p760g2.C13807d
    public final String toString() {
        String strM9891j = AbstractC9306j0.m9891j(this.f43672i0, " {", new StringBuilder("[Barrier] "));
        for (int i10 = 0; i10 < this.f43781s0; i10++) {
            C13807d c13807d = this.f43780r0[i10];
            if (i10 > 0) {
                strM9891j = AbstractC10763a.m11052j(strM9891j, ", ");
            }
            StringBuilder sbM9893l = AbstractC9306j0.m9893l(strM9891j);
            sbM9893l.append(c13807d.f43672i0);
            strM9891j = sbM9893l.toString();
        }
        return AbstractC10763a.m11052j(strM9891j, "}");
    }
}
