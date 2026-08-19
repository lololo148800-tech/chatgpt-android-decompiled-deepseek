package p760g2;

import java.util.ArrayList;
import p655b2.C11219c;
import p775h2.C14372b;
import p775h2.InterfaceC14373c;

/* JADX INFO: renamed from: g2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C13810g extends AbstractC13812i {

    /* JADX INFO: renamed from: A0 */
    public int f43738A0;

    /* JADX INFO: renamed from: B0 */
    public int f43739B0;

    /* JADX INFO: renamed from: C0 */
    public C14372b f43740C0;

    /* JADX INFO: renamed from: D0 */
    public InterfaceC14373c f43741D0;

    /* JADX INFO: renamed from: E0 */
    public int f43742E0;

    /* JADX INFO: renamed from: F0 */
    public int f43743F0;

    /* JADX INFO: renamed from: G0 */
    public int f43744G0;

    /* JADX INFO: renamed from: H0 */
    public int f43745H0;

    /* JADX INFO: renamed from: I0 */
    public int f43746I0;

    /* JADX INFO: renamed from: J0 */
    public int f43747J0;

    /* JADX INFO: renamed from: K0 */
    public float f43748K0;

    /* JADX INFO: renamed from: L0 */
    public float f43749L0;

    /* JADX INFO: renamed from: M0 */
    public float f43750M0;

    /* JADX INFO: renamed from: N0 */
    public float f43751N0;

    /* JADX INFO: renamed from: O0 */
    public float f43752O0;

    /* JADX INFO: renamed from: P0 */
    public float f43753P0;

    /* JADX INFO: renamed from: Q0 */
    public int f43754Q0;

    /* JADX INFO: renamed from: R0 */
    public int f43755R0;

    /* JADX INFO: renamed from: S0 */
    public int f43756S0;

    /* JADX INFO: renamed from: T0 */
    public int f43757T0;

    /* JADX INFO: renamed from: U0 */
    public int f43758U0;

    /* JADX INFO: renamed from: V0 */
    public int f43759V0;

    /* JADX INFO: renamed from: W0 */
    public int f43760W0;

    /* JADX INFO: renamed from: X0 */
    public ArrayList f43761X0;

    /* JADX INFO: renamed from: Y0 */
    public C13807d[] f43762Y0;

    /* JADX INFO: renamed from: Z0 */
    public C13807d[] f43763Z0;

    /* JADX INFO: renamed from: a1 */
    public int[] f43764a1;

    /* JADX INFO: renamed from: b1 */
    public C13807d[] f43765b1;

    /* JADX INFO: renamed from: c1 */
    public int f43766c1;

    /* JADX INFO: renamed from: t0 */
    public int f43767t0;

    /* JADX INFO: renamed from: u0 */
    public int f43768u0;

    /* JADX INFO: renamed from: v0 */
    public int f43769v0;

    /* JADX INFO: renamed from: w0 */
    public int f43770w0;

    /* JADX INFO: renamed from: x0 */
    public int f43771x0;

    /* JADX INFO: renamed from: y0 */
    public int f43772y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f43773z0;

    @Override // p760g2.AbstractC13812i
    /* JADX INFO: renamed from: W */
    public final void mo15409W() {
        for (int i10 = 0; i10 < this.f43781s0; i10++) {
            C13807d c13807d = this.f43780r0[i10];
            if (c13807d != null) {
                c13807d.f43635G = true;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final int m15410X(C13807d c13807d, int i10) {
        if (c13807d == null) {
            return 0;
        }
        int[] iArr = c13807d.f43688q0;
        if (iArr[1] == 3) {
            int i11 = c13807d.f43691t;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (c13807d.f43629A * i10);
                if (i12 != c13807d.m15383l()) {
                    c13807d.f43667g = true;
                    m15412Z(iArr[0], c13807d.m15387r(), 1, i12, c13807d);
                }
                return i12;
            }
            if (i11 == 1) {
                return c13807d.m15383l();
            }
            if (i11 == 3) {
                return (int) ((c13807d.m15387r() * c13807d.f43652X) + 0.5f);
            }
        }
        return c13807d.m15383l();
    }

    /* JADX INFO: renamed from: Y */
    public final int m15411Y(C13807d c13807d, int i10) {
        if (c13807d == null) {
            return 0;
        }
        int[] iArr = c13807d.f43688q0;
        if (iArr[0] == 3) {
            int i11 = c13807d.f43690s;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (c13807d.f43695x * i10);
                if (i12 != c13807d.m15387r()) {
                    c13807d.f43667g = true;
                    m15412Z(1, i12, iArr[1], c13807d.m15383l(), c13807d);
                }
                return i12;
            }
            if (i11 == 1) {
                return c13807d.m15387r();
            }
            if (i11 == 3) {
                return (int) ((c13807d.m15383l() * c13807d.f43652X) + 0.5f);
            }
        }
        return c13807d.m15387r();
    }

    /* JADX INFO: renamed from: Z */
    public final void m15412Z(int i10, int i11, int i12, int i13, C13807d c13807d) {
        InterfaceC14373c interfaceC14373c;
        C13808e c13808e;
        while (true) {
            interfaceC14373c = this.f43741D0;
            if (interfaceC14373c != null || (c13808e = this.f43649U) == null) {
                break;
            } else {
                this.f43741D0 = c13808e.f43715v0;
            }
        }
        C14372b c14372b = this.f43740C0;
        c14372b.f45067a = i10;
        c14372b.f45068b = i12;
        c14372b.f45069c = i11;
        c14372b.f45070d = i13;
        interfaceC14373c.mo10946b(c13807d, c14372b);
        c13807d.m15371R(c14372b.f45071e);
        c13807d.m15366M(c14372b.f45072f);
        c13807d.f43634F = c14372b.f45074h;
        c13807d.m15363J(c14372b.f45073g);
    }

    @Override // p760g2.C13807d
    /* JADX INFO: renamed from: c */
    public final void mo15340c(C11219c c11219c, boolean z6) {
        C13807d c13807d;
        float f10;
        int i10;
        super.mo15340c(c11219c, z6);
        C13808e c13808e = this.f43649U;
        boolean z10 = c13808e != null && c13808e.f43716w0;
        int i11 = this.f43758U0;
        ArrayList arrayList = this.f43761X0;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    ((C13809f) arrayList.get(i12)).m15404b(i12, z10, i12 == size + (-1));
                    i12++;
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        ((C13809f) arrayList.get(i13)).m15404b(i13, z10, i13 == size2 + (-1));
                        i13++;
                    }
                }
            } else if (this.f43764a1 != null && this.f43763Z0 != null && this.f43762Y0 != null) {
                for (int i14 = 0; i14 < this.f43766c1; i14++) {
                    this.f43765b1[i14].m15360E();
                }
                int[] iArr = this.f43764a1;
                int i15 = iArr[0];
                int i16 = iArr[1];
                float f11 = this.f43748K0;
                C13807d c13807d2 = null;
                int i17 = 0;
                while (i17 < i15) {
                    if (z10) {
                        i10 = (i15 - i17) - 1;
                        f10 = 1.0f - this.f43748K0;
                    } else {
                        f10 = f11;
                        i10 = i17;
                    }
                    C13807d c13807d3 = this.f43763Z0[i10];
                    if (c13807d3 != null && c13807d3.f43670h0 != 8) {
                        C13806c c13806c = c13807d3.f43638J;
                        if (i17 == 0) {
                            c13807d3.m15378g(c13806c, this.f43638J, this.f43771x0);
                            c13807d3.f43674j0 = this.f43742E0;
                            c13807d3.f43664e0 = f10;
                        }
                        if (i17 == i15 - 1) {
                            c13807d3.m15378g(c13807d3.f43640L, this.f43640L, this.f43772y0);
                        }
                        if (i17 > 0 && c13807d2 != null) {
                            int i18 = this.f43754Q0;
                            C13806c c13806c2 = c13807d2.f43640L;
                            c13807d3.m15378g(c13806c, c13806c2, i18);
                            c13807d2.m15378g(c13806c2, c13806c, 0);
                        }
                        c13807d2 = c13807d3;
                    }
                    i17++;
                    f11 = f10;
                }
                for (int i19 = 0; i19 < i16; i19++) {
                    C13807d c13807d4 = this.f43762Y0[i19];
                    if (c13807d4 != null && c13807d4.f43670h0 != 8) {
                        C13806c c13806c3 = c13807d4.f43639K;
                        if (i19 == 0) {
                            c13807d4.m15378g(c13806c3, this.f43639K, this.f43767t0);
                            c13807d4.f43676k0 = this.f43743F0;
                            c13807d4.f43666f0 = this.f43749L0;
                        }
                        if (i19 == i16 - 1) {
                            c13807d4.m15378g(c13807d4.f43641M, this.f43641M, this.f43768u0);
                        }
                        if (i19 > 0 && c13807d2 != null) {
                            int i20 = this.f43755R0;
                            C13806c c13806c4 = c13807d2.f43641M;
                            c13807d4.m15378g(c13806c3, c13806c4, i20);
                            c13807d2.m15378g(c13806c4, c13806c3, 0);
                        }
                        c13807d2 = c13807d4;
                    }
                }
                for (int i21 = 0; i21 < i15; i21++) {
                    for (int i22 = 0; i22 < i16; i22++) {
                        int i23 = (i22 * i15) + i21;
                        if (this.f43760W0 == 1) {
                            i23 = (i21 * i16) + i22;
                        }
                        C13807d[] c13807dArr = this.f43765b1;
                        if (i23 < c13807dArr.length && (c13807d = c13807dArr[i23]) != null && c13807d.f43670h0 != 8) {
                            C13807d c13807d5 = this.f43763Z0[i21];
                            C13807d c13807d6 = this.f43762Y0[i22];
                            if (c13807d != c13807d5) {
                                c13807d.m15378g(c13807d.f43638J, c13807d5.f43638J, 0);
                                c13807d.m15378g(c13807d.f43640L, c13807d5.f43640L, 0);
                            }
                            if (c13807d != c13807d6) {
                                c13807d.m15378g(c13807d.f43639K, c13807d6.f43639K, 0);
                                c13807d.m15378g(c13807d.f43641M, c13807d6.f43641M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C13809f) arrayList.get(0)).m15404b(0, z10, true);
        }
        this.f43773z0 = false;
    }
}
