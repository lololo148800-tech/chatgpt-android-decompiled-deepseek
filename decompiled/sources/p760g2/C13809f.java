package p760g2;

/* JADX INFO: renamed from: g2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C13809f {

    /* JADX INFO: renamed from: a */
    public int f43720a;

    /* JADX INFO: renamed from: d */
    public C13806c f43723d;

    /* JADX INFO: renamed from: e */
    public C13806c f43724e;

    /* JADX INFO: renamed from: f */
    public C13806c f43725f;

    /* JADX INFO: renamed from: g */
    public C13806c f43726g;

    /* JADX INFO: renamed from: h */
    public int f43727h;

    /* JADX INFO: renamed from: i */
    public int f43728i;

    /* JADX INFO: renamed from: j */
    public int f43729j;

    /* JADX INFO: renamed from: k */
    public int f43730k;

    /* JADX INFO: renamed from: q */
    public int f43736q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C13810g f43737r;

    /* JADX INFO: renamed from: b */
    public C13807d f43721b = null;

    /* JADX INFO: renamed from: c */
    public int f43722c = 0;

    /* JADX INFO: renamed from: l */
    public int f43731l = 0;

    /* JADX INFO: renamed from: m */
    public int f43732m = 0;

    /* JADX INFO: renamed from: n */
    public int f43733n = 0;

    /* JADX INFO: renamed from: o */
    public int f43734o = 0;

    /* JADX INFO: renamed from: p */
    public int f43735p = 0;

    public C13809f(C13810g c13810g, int i10, C13806c c13806c, C13806c c13806c2, C13806c c13806c3, C13806c c13806c4, int i11) {
        this.f43737r = c13810g;
        this.f43727h = 0;
        this.f43728i = 0;
        this.f43729j = 0;
        this.f43730k = 0;
        this.f43736q = 0;
        this.f43720a = i10;
        this.f43723d = c13806c;
        this.f43724e = c13806c2;
        this.f43725f = c13806c3;
        this.f43726g = c13806c4;
        this.f43727h = c13810g.f43771x0;
        this.f43728i = c13810g.f43767t0;
        this.f43729j = c13810g.f43772y0;
        this.f43730k = c13810g.f43768u0;
        this.f43736q = i11;
    }

    /* JADX INFO: renamed from: a */
    public final void m15403a(C13807d c13807d) {
        int i10 = this.f43720a;
        C13810g c13810g = this.f43737r;
        if (i10 == 0) {
            int iM15411Y = c13810g.m15411Y(c13807d, this.f43736q);
            if (c13807d.f43688q0[0] == 3) {
                this.f43735p++;
                iM15411Y = 0;
            }
            this.f43731l = iM15411Y + (c13807d.f43670h0 != 8 ? c13810g.f43754Q0 : 0) + this.f43731l;
            int iM15410X = c13810g.m15410X(c13807d, this.f43736q);
            if (this.f43721b == null || this.f43722c < iM15410X) {
                this.f43721b = c13807d;
                this.f43722c = iM15410X;
                this.f43732m = iM15410X;
            }
        } else {
            int iM15411Y2 = c13810g.m15411Y(c13807d, this.f43736q);
            int iM15410X2 = c13810g.m15410X(c13807d, this.f43736q);
            if (c13807d.f43688q0[1] == 3) {
                this.f43735p++;
                iM15410X2 = 0;
            }
            this.f43732m = iM15410X2 + (c13807d.f43670h0 != 8 ? c13810g.f43755R0 : 0) + this.f43732m;
            if (this.f43721b == null || this.f43722c < iM15411Y2) {
                this.f43721b = c13807d;
                this.f43722c = iM15411Y2;
                this.f43731l = iM15411Y2;
            }
        }
        this.f43734o++;
    }

    /* JADX INFO: renamed from: b */
    public final void m15404b(int i10, boolean z6, boolean z10) {
        C13810g c13810g;
        int i11;
        int i12;
        C13807d c13807d;
        char c9;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16 = this.f43734o;
        int i17 = 0;
        while (true) {
            c13810g = this.f43737r;
            if (i17 >= i16 || (i15 = this.f43733n + i17) >= c13810g.f43766c1) {
                break;
            }
            C13807d c13807d2 = c13810g.f43765b1[i15];
            if (c13807d2 != null) {
                c13807d2.m15360E();
            }
            i17++;
        }
        if (i16 == 0 || this.f43721b == null) {
            return;
        }
        boolean z11 = z10 && i10 == 0;
        int i18 = -1;
        int i19 = -1;
        for (int i20 = 0; i20 < i16; i20++) {
            int i21 = this.f43733n + (z6 ? (i16 - 1) - i20 : i20);
            if (i21 >= c13810g.f43766c1) {
                break;
            }
            C13807d c13807d3 = c13810g.f43765b1[i21];
            if (c13807d3 != null && c13807d3.f43670h0 == 0) {
                if (i18 == -1) {
                    i18 = i20;
                }
                i19 = i20;
            }
        }
        if (this.f43720a != 0) {
            C13807d c13807d4 = this.f43721b;
            c13807d4.f43674j0 = c13810g.f43742E0;
            int i22 = this.f43727h;
            if (i10 > 0) {
                i22 += c13810g.f43754Q0;
            }
            C13806c c13806c = c13807d4.f43638J;
            C13806c c13806c2 = c13807d4.f43640L;
            if (z6) {
                c13806c2.m15342a(this.f43725f, i22);
                if (z10) {
                    c13806c.m15342a(this.f43723d, this.f43729j);
                }
                if (i10 > 0) {
                    this.f43725f.f43623d.f43638J.m15342a(c13806c2, 0);
                }
            } else {
                c13806c.m15342a(this.f43723d, i22);
                if (z10) {
                    c13806c2.m15342a(this.f43725f, this.f43729j);
                }
                if (i10 > 0) {
                    this.f43723d.f43623d.f43640L.m15342a(c13806c, 0);
                }
            }
            C13807d c13807d5 = null;
            for (int i23 = 0; i23 < i16; i23++) {
                int i24 = this.f43733n + i23;
                if (i24 >= c13810g.f43766c1) {
                    return;
                }
                C13807d c13807d6 = c13810g.f43765b1[i24];
                if (c13807d6 != null) {
                    C13806c c13806c3 = c13807d6.f43639K;
                    if (i23 == 0) {
                        c13807d6.m15378g(c13806c3, this.f43724e, this.f43728i);
                        int i25 = c13810g.f43743F0;
                        float f11 = c13810g.f43749L0;
                        if (this.f43733n == 0) {
                            i12 = c13810g.f43745H0;
                            i11 = -1;
                            if (i12 != -1) {
                                f11 = c13810g.f43751N0;
                            }
                            c13807d6.f43676k0 = i12;
                            c13807d6.f43666f0 = f11;
                        } else {
                            i11 = -1;
                        }
                        if (!z10 || (i12 = c13810g.f43747J0) == i11) {
                            i12 = i25;
                        } else {
                            f11 = c13810g.f43753P0;
                        }
                        c13807d6.f43676k0 = i12;
                        c13807d6.f43666f0 = f11;
                    }
                    if (i23 == i16 - 1) {
                        c13807d6.m15378g(c13807d6.f43641M, this.f43726g, this.f43730k);
                    }
                    if (c13807d5 != null) {
                        int i26 = c13810g.f43755R0;
                        C13806c c13806c4 = c13807d5.f43641M;
                        c13806c3.m15342a(c13806c4, i26);
                        if (i23 == i18) {
                            int i27 = this.f43728i;
                            if (c13806c3.m15349h()) {
                                c13806c3.f43627h = i27;
                            }
                        }
                        c13806c4.m15342a(c13806c3, 0);
                        if (i23 == i19 + 1) {
                            int i28 = this.f43730k;
                            if (c13806c4.m15349h()) {
                                c13806c4.f43627h = i28;
                            }
                        }
                    }
                    if (c13807d6 != c13807d4) {
                        C13806c c13806c5 = c13807d6.f43640L;
                        C13806c c13806c6 = c13807d6.f43638J;
                        if (z6) {
                            int i29 = c13810g.f43756S0;
                            if (i29 == 0) {
                                c13806c5.m15342a(c13806c2, 0);
                            } else if (i29 == 1) {
                                c13806c6.m15342a(c13806c, 0);
                            } else if (i29 == 2) {
                                c13806c6.m15342a(c13806c, 0);
                                c13806c5.m15342a(c13806c2, 0);
                            }
                        } else {
                            int i30 = c13810g.f43756S0;
                            if (i30 == 0) {
                                c13806c6.m15342a(c13806c, 0);
                            } else if (i30 == 1) {
                                c13806c5.m15342a(c13806c2, 0);
                            } else if (i30 == 2) {
                                if (z11) {
                                    c13806c6.m15342a(this.f43723d, this.f43727h);
                                    c13806c5.m15342a(this.f43725f, this.f43729j);
                                } else {
                                    c13806c6.m15342a(c13806c, 0);
                                    c13806c5.m15342a(c13806c2, 0);
                                }
                            }
                        }
                    }
                    c13807d5 = c13807d6;
                }
            }
            return;
        }
        C13807d c13807d7 = this.f43721b;
        c13807d7.f43676k0 = c13810g.f43743F0;
        int i31 = this.f43728i;
        if (i10 > 0) {
            i31 += c13810g.f43755R0;
        }
        C13806c c13806c7 = this.f43724e;
        C13806c c13806c8 = c13807d7.f43639K;
        c13806c8.m15342a(c13806c7, i31);
        C13806c c13806c9 = c13807d7.f43641M;
        if (z10) {
            c13806c9.m15342a(this.f43726g, this.f43730k);
        }
        if (i10 > 0) {
            this.f43724e.f43623d.f43641M.m15342a(c13806c8, 0);
        }
        if (c13810g.f43757T0 != 3 || c13807d7.f43634F) {
            c13807d = c13807d7;
            break;
        }
        int i32 = 0;
        while (true) {
            if (i32 < i16) {
                int i33 = this.f43733n + (z6 ? (i16 - 1) - i32 : i32);
                if (i33 < c13810g.f43766c1) {
                    c13807d = c13810g.f43765b1[i33];
                    if (c13807d.f43634F) {
                        break;
                    } else {
                        i32++;
                    }
                }
            }
            c13807d = c13807d7;
            break;
        }
        int i34 = 0;
        C13807d c13807d8 = null;
        while (i34 < i16) {
            int i35 = z6 ? (i16 - 1) - i34 : i34;
            int i36 = this.f43733n + i35;
            if (i36 >= c13810g.f43766c1) {
                return;
            }
            C13807d c13807d9 = c13810g.f43765b1[i36];
            if (c13807d9 == null) {
                i16 = i16;
                c9 = 3;
            } else {
                C13806c c13806c10 = c13807d9.f43638J;
                if (i34 == 0) {
                    c13807d9.m15378g(c13806c10, this.f43723d, this.f43727h);
                }
                if (i35 == 0) {
                    int i37 = c13810g.f43742E0;
                    float f12 = z6 ? 1.0f - c13810g.f43748K0 : c13810g.f43748K0;
                    if (this.f43733n == 0 && (i14 = c13810g.f43744G0) != -1) {
                        f10 = z6 ? 1.0f - c13810g.f43750M0 : c13810g.f43750M0;
                        i13 = i14;
                    } else if (!z10 || (i13 = c13810g.f43746I0) == -1) {
                        i13 = i37;
                        f10 = f12;
                    } else {
                        f10 = z6 ? 1.0f - c13810g.f43752O0 : c13810g.f43752O0;
                    }
                    c13807d9.f43674j0 = i13;
                    c13807d9.f43664e0 = f10;
                }
                if (i34 == i16 - 1) {
                    c13807d9.m15378g(c13807d9.f43640L, this.f43725f, this.f43729j);
                }
                if (c13807d8 != null) {
                    int i38 = c13810g.f43754Q0;
                    C13806c c13806c11 = c13807d8.f43640L;
                    c13806c10.m15342a(c13806c11, i38);
                    if (i34 == i18) {
                        int i39 = this.f43727h;
                        if (c13806c10.m15349h()) {
                            c13806c10.f43627h = i39;
                        }
                    }
                    c13806c11.m15342a(c13806c10, 0);
                    if (i34 == i19 + 1) {
                        int i40 = this.f43729j;
                        if (c13806c11.m15349h()) {
                            c13806c11.f43627h = i40;
                        }
                    }
                }
                if (c13807d9 != c13807d7) {
                    int i41 = c13810g.f43757T0;
                    c9 = 3;
                    if (i41 == 3 && c13807d.f43634F && c13807d9 != c13807d && c13807d9.f43634F) {
                        c13807d9.f43642N.m15342a(c13807d.f43642N, 0);
                    } else {
                        C13806c c13806c12 = c13807d9.f43639K;
                        if (i41 != 0) {
                            C13806c c13806c13 = c13807d9.f43641M;
                            if (i41 == 1) {
                                c13806c13.m15342a(c13806c9, 0);
                            } else if (z11) {
                                c13806c12.m15342a(this.f43724e, this.f43728i);
                                c13806c13.m15342a(this.f43726g, this.f43730k);
                            } else {
                                c13806c12.m15342a(c13806c8, 0);
                                c13806c13.m15342a(c13806c9, 0);
                            }
                        } else {
                            c13806c12.m15342a(c13806c8, 0);
                        }
                    }
                } else {
                    c9 = 3;
                }
                c13807d8 = c13807d9;
            }
            i34++;
            i16 = i16;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m15405c() {
        return this.f43720a == 1 ? this.f43732m - this.f43737r.f43755R0 : this.f43732m;
    }

    /* JADX INFO: renamed from: d */
    public final int m15406d() {
        return this.f43720a == 0 ? this.f43731l - this.f43737r.f43754Q0 : this.f43731l;
    }

    /* JADX INFO: renamed from: e */
    public final void m15407e(int i10) {
        C13810g c13810g;
        int i11;
        int i12 = this.f43735p;
        if (i12 == 0) {
            return;
        }
        int i13 = this.f43734o;
        int i14 = i10 / i12;
        int i15 = 0;
        while (true) {
            c13810g = this.f43737r;
            if (i15 >= i13 || (i11 = this.f43733n + i15) >= c13810g.f43766c1) {
                break;
            }
            C13807d c13807d = c13810g.f43765b1[i11];
            if (this.f43720a == 0) {
                if (c13807d != null) {
                    int[] iArr = c13807d.f43688q0;
                    if (iArr[0] == 3 && c13807d.f43690s == 0) {
                        c13810g.m15412Z(1, i14, iArr[1], c13807d.m15383l(), c13807d);
                    }
                }
            } else if (c13807d != null) {
                int[] iArr2 = c13807d.f43688q0;
                if (iArr2[1] == 3 && c13807d.f43691t == 0) {
                    c13810g.m15412Z(iArr2[0], c13807d.m15387r(), 1, i14, c13807d);
                }
            }
            i15++;
        }
        this.f43731l = 0;
        this.f43732m = 0;
        this.f43721b = null;
        this.f43722c = 0;
        int i16 = this.f43734o;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = this.f43733n + i17;
            if (i18 >= c13810g.f43766c1) {
                return;
            }
            C13807d c13807d2 = c13810g.f43765b1[i18];
            if (this.f43720a == 0) {
                int iM15387r = c13807d2.m15387r();
                int i19 = c13810g.f43754Q0;
                if (c13807d2.f43670h0 == 8) {
                    i19 = 0;
                }
                this.f43731l = iM15387r + i19 + this.f43731l;
                int iM15410X = c13810g.m15410X(c13807d2, this.f43736q);
                if (this.f43721b == null || this.f43722c < iM15410X) {
                    this.f43721b = c13807d2;
                    this.f43722c = iM15410X;
                    this.f43732m = iM15410X;
                }
            } else {
                int iM15411Y = c13810g.m15411Y(c13807d2, this.f43736q);
                int iM15410X2 = c13810g.m15410X(c13807d2, this.f43736q);
                int i20 = c13810g.f43755R0;
                if (c13807d2.f43670h0 == 8) {
                    i20 = 0;
                }
                this.f43732m = iM15410X2 + i20 + this.f43732m;
                if (this.f43721b == null || this.f43722c < iM15411Y) {
                    this.f43721b = c13807d2;
                    this.f43722c = iM15411Y;
                    this.f43731l = iM15411Y;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15408f(int i10, C13806c c13806c, C13806c c13806c2, C13806c c13806c3, C13806c c13806c4, int i11, int i12, int i13, int i14, int i15) {
        this.f43720a = i10;
        this.f43723d = c13806c;
        this.f43724e = c13806c2;
        this.f43725f = c13806c3;
        this.f43726g = c13806c4;
        this.f43727h = i11;
        this.f43728i = i12;
        this.f43729j = i13;
        this.f43730k = i14;
        this.f43736q = i15;
    }
}
