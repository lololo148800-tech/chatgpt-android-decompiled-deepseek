package p775h2;

import p001A.AbstractC0010F;
import p760g2.AbstractC13812i;
import p760g2.C13806c;
import p760g2.C13807d;
import p760g2.C13808e;

/* JADX INFO: renamed from: h2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C14384n extends AbstractC14386p {

    /* JADX INFO: renamed from: k */
    public C14377g f45096k;

    /* JADX INFO: renamed from: l */
    public C14371a f45097l;

    @Override // p775h2.InterfaceC14375e
    /* JADX INFO: renamed from: a */
    public final void mo15814a(InterfaceC14375e interfaceC14375e) {
        float f10;
        float f11;
        float f12;
        int i10;
        if (AbstractC0010F.m24h(this.f45113j) == 3) {
            C13807d c13807d = this.f45105b;
            m15888l(c13807d.f43639K, c13807d.f43641M, 1);
            return;
        }
        C14378h c14378h = this.f45108e;
        if (c14378h.f45081c && !c14378h.f45088j && this.f45107d == 3) {
            C13807d c13807d2 = this.f45105b;
            int i11 = c13807d2.f43691t;
            if (i11 == 2) {
                C13808e c13808e = c13807d2.f43649U;
                if (c13808e != null) {
                    C14378h c14378h2 = c13808e.f43663e.f45108e;
                    if (c14378h2.f45088j) {
                        c14378h.mo15863d((int) ((c14378h2.f45085g * c13807d2.f43629A) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                C14378h c14378h3 = c13807d2.f43661d.f45108e;
                if (c14378h3.f45088j) {
                    int i12 = c13807d2.f43653Y;
                    if (i12 != -1) {
                        if (i12 == 0) {
                            f12 = c14378h3.f45085g * c13807d2.f43652X;
                            i10 = (int) (f12 + 0.5f);
                        } else if (i12 != 1) {
                            i10 = 0;
                        } else {
                            f10 = c14378h3.f45085g;
                            f11 = c13807d2.f43652X;
                        }
                        c14378h.mo15863d(i10);
                    } else {
                        f10 = c14378h3.f45085g;
                        f11 = c13807d2.f43652X;
                    }
                    f12 = f10 / f11;
                    i10 = (int) (f12 + 0.5f);
                    c14378h.mo15863d(i10);
                }
            }
        }
        C14377g c14377g = this.f45111h;
        if (c14377g.f45081c) {
            C14377g c14377g2 = this.f45112i;
            if (c14377g2.f45081c) {
                if (c14377g.f45088j && c14377g2.f45088j && c14378h.f45088j) {
                    return;
                }
                if (!c14378h.f45088j && this.f45107d == 3) {
                    C13807d c13807d3 = this.f45105b;
                    if (c13807d3.f43690s == 0 && !c13807d3.m15395z()) {
                        C14377g c14377g3 = (C14377g) c14377g.f45090l.get(0);
                        C14377g c14377g4 = (C14377g) c14377g2.f45090l.get(0);
                        int i13 = c14377g3.f45085g + c14377g.f45084f;
                        int i14 = c14377g4.f45085g + c14377g2.f45084f;
                        c14377g.mo15863d(i13);
                        c14377g2.mo15863d(i14);
                        c14378h.mo15863d(i14 - i13);
                        return;
                    }
                }
                if (!c14378h.f45088j && this.f45107d == 3 && this.f45104a == 1 && c14377g.f45090l.size() > 0 && c14377g2.f45090l.size() > 0) {
                    C14377g c14377g5 = (C14377g) c14377g.f45090l.get(0);
                    int i15 = (((C14377g) c14377g2.f45090l.get(0)).f45085g + c14377g2.f45084f) - (c14377g5.f45085g + c14377g.f45084f);
                    int i16 = c14378h.f45091m;
                    if (i15 < i16) {
                        c14378h.mo15863d(i15);
                    } else {
                        c14378h.mo15863d(i16);
                    }
                }
                if (c14378h.f45088j && c14377g.f45090l.size() > 0 && c14377g2.f45090l.size() > 0) {
                    C14377g c14377g6 = (C14377g) c14377g.f45090l.get(0);
                    C14377g c14377g7 = (C14377g) c14377g2.f45090l.get(0);
                    int i17 = c14377g6.f45085g;
                    int i18 = c14377g.f45084f + i17;
                    int i19 = c14377g7.f45085g;
                    int i20 = c14377g2.f45084f + i19;
                    float f13 = this.f45105b.f43666f0;
                    if (c14377g6 == c14377g7) {
                        f13 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    c14377g.mo15863d((int) ((((i19 - i17) - c14378h.f45085g) * f13) + i17 + 0.5f));
                    c14377g2.mo15863d(c14377g.f45085g + c14378h.f45085g);
                }
            }
        }
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: d */
    public final void mo15815d() {
        C13807d c13807d;
        C13808e c13808e;
        C13808e c13808e2;
        C13808e c13808e3;
        C13807d c13807d2 = this.f45105b;
        boolean z6 = c13807d2.f43655a;
        C14378h c14378h = this.f45108e;
        if (z6) {
            c14378h.mo15863d(c13807d2.m15383l());
        }
        boolean z10 = c14378h.f45088j;
        C14377g c14377g = this.f45112i;
        C14377g c14377g2 = this.f45111h;
        if (!z10) {
            C13807d c13807d3 = this.f45105b;
            this.f45107d = c13807d3.f43688q0[1];
            if (c13807d3.f43634F) {
                this.f45097l = new C14371a(this);
            }
            int i10 = this.f45107d;
            if (i10 != 3) {
                if (i10 == 4 && (c13808e3 = this.f45105b.f43649U) != null && c13808e3.f43688q0[1] == 1) {
                    int iM15383l = (c13808e3.m15383l() - this.f45105b.f43639K.m15346e()) - this.f45105b.f43641M.m15346e();
                    AbstractC14386p.m15883b(c14377g2, c13808e3.f43663e.f45111h, this.f45105b.f43639K.m15346e());
                    AbstractC14386p.m15883b(c14377g, c13808e3.f43663e.f45112i, -this.f45105b.f43641M.m15346e());
                    c14378h.mo15863d(iM15383l);
                    return;
                }
                if (i10 == 1) {
                    c14378h.mo15863d(this.f45105b.m15383l());
                }
            }
        } else if (this.f45107d == 4 && (c13808e = (c13807d = this.f45105b).f43649U) != null && c13808e.f43688q0[1] == 1) {
            AbstractC14386p.m15883b(c14377g2, c13808e.f43663e.f45111h, c13807d.f43639K.m15346e());
            AbstractC14386p.m15883b(c14377g, c13808e.f43663e.f45112i, -this.f45105b.f43641M.m15346e());
            return;
        }
        boolean z11 = c14378h.f45088j;
        C14377g c14377g3 = this.f45096k;
        if (z11) {
            C13807d c13807d4 = this.f45105b;
            if (c13807d4.f43655a) {
                C13806c[] c13806cArr = c13807d4.f43646R;
                C13806c c13806c = c13806cArr[2];
                C13806c c13806c2 = c13806c.f43625f;
                if (c13806c2 != null && c13806cArr[3].f43625f != null) {
                    if (c13807d4.m15395z()) {
                        c14377g2.f45084f = this.f45105b.f43646R[2].m15346e();
                        c14377g.f45084f = -this.f45105b.f43646R[3].m15346e();
                    } else {
                        C14377g c14377gM15884h = AbstractC14386p.m15884h(this.f45105b.f43646R[2]);
                        if (c14377gM15884h != null) {
                            AbstractC14386p.m15883b(c14377g2, c14377gM15884h, this.f45105b.f43646R[2].m15346e());
                        }
                        C14377g c14377gM15884h2 = AbstractC14386p.m15884h(this.f45105b.f43646R[3]);
                        if (c14377gM15884h2 != null) {
                            AbstractC14386p.m15883b(c14377g, c14377gM15884h2, -this.f45105b.f43646R[3].m15346e());
                        }
                        c14377g2.f45080b = true;
                        c14377g.f45080b = true;
                    }
                    C13807d c13807d5 = this.f45105b;
                    if (c13807d5.f43634F) {
                        AbstractC14386p.m15883b(c14377g3, c14377g2, c13807d5.f43658b0);
                        return;
                    }
                    return;
                }
                if (c13806c2 != null) {
                    C14377g c14377gM15884h3 = AbstractC14386p.m15884h(c13806c);
                    if (c14377gM15884h3 != null) {
                        AbstractC14386p.m15883b(c14377g2, c14377gM15884h3, this.f45105b.f43646R[2].m15346e());
                        AbstractC14386p.m15883b(c14377g, c14377g2, c14378h.f45085g);
                        C13807d c13807d6 = this.f45105b;
                        if (c13807d6.f43634F) {
                            AbstractC14386p.m15883b(c14377g3, c14377g2, c13807d6.f43658b0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C13806c c13806c3 = c13806cArr[3];
                if (c13806c3.f43625f != null) {
                    C14377g c14377gM15884h4 = AbstractC14386p.m15884h(c13806c3);
                    if (c14377gM15884h4 != null) {
                        AbstractC14386p.m15883b(c14377g, c14377gM15884h4, -this.f45105b.f43646R[3].m15346e());
                        AbstractC14386p.m15883b(c14377g2, c14377g, -c14378h.f45085g);
                    }
                    C13807d c13807d7 = this.f45105b;
                    if (c13807d7.f43634F) {
                        AbstractC14386p.m15883b(c14377g3, c14377g2, c13807d7.f43658b0);
                        return;
                    }
                    return;
                }
                C13806c c13806c4 = c13806cArr[4];
                if (c13806c4.f43625f != null) {
                    C14377g c14377gM15884h5 = AbstractC14386p.m15884h(c13806c4);
                    if (c14377gM15884h5 != null) {
                        AbstractC14386p.m15883b(c14377g3, c14377gM15884h5, 0);
                        AbstractC14386p.m15883b(c14377g2, c14377g3, -this.f45105b.f43658b0);
                        AbstractC14386p.m15883b(c14377g, c14377g2, c14378h.f45085g);
                        return;
                    }
                    return;
                }
                if ((c13807d4 instanceof AbstractC13812i) || c13807d4.f43649U == null || c13807d4.mo15381j(7).f43625f != null) {
                    return;
                }
                C13807d c13807d8 = this.f45105b;
                AbstractC14386p.m15883b(c14377g2, c13807d8.f43649U.f43663e.f45111h, c13807d8.m15389t());
                AbstractC14386p.m15883b(c14377g, c14377g2, c14378h.f45085g);
                C13807d c13807d9 = this.f45105b;
                if (c13807d9.f43634F) {
                    AbstractC14386p.m15883b(c14377g3, c14377g2, c13807d9.f43658b0);
                    return;
                }
                return;
            }
        }
        if (z11 || this.f45107d != 3) {
            c14378h.m15861b(this);
        } else {
            C13807d c13807d10 = this.f45105b;
            int i11 = c13807d10.f43691t;
            if (i11 == 2) {
                C13808e c13808e4 = c13807d10.f43649U;
                if (c13808e4 != null) {
                    C14378h c14378h2 = c13808e4.f43663e.f45108e;
                    c14378h.f45090l.add(c14378h2);
                    c14378h2.f45089k.add(c14378h);
                    c14378h.f45080b = true;
                    c14378h.f45089k.add(c14377g2);
                    c14378h.f45089k.add(c14377g);
                }
            } else if (i11 == 3 && !c13807d10.m15395z()) {
                C13807d c13807d11 = this.f45105b;
                if (c13807d11.f43690s != 3) {
                    C14378h c14378h3 = c13807d11.f43661d.f45108e;
                    c14378h.f45090l.add(c14378h3);
                    c14378h3.f45089k.add(c14378h);
                    c14378h.f45080b = true;
                    c14378h.f45089k.add(c14377g2);
                    c14378h.f45089k.add(c14377g);
                }
            }
        }
        C13807d c13807d12 = this.f45105b;
        C13806c[] c13806cArr2 = c13807d12.f43646R;
        C13806c c13806c5 = c13806cArr2[2];
        C13806c c13806c6 = c13806c5.f43625f;
        if (c13806c6 != null && c13806cArr2[3].f43625f != null) {
            if (c13807d12.m15395z()) {
                c14377g2.f45084f = this.f45105b.f43646R[2].m15346e();
                c14377g.f45084f = -this.f45105b.f43646R[3].m15346e();
            } else {
                C14377g c14377gM15884h6 = AbstractC14386p.m15884h(this.f45105b.f43646R[2]);
                C14377g c14377gM15884h7 = AbstractC14386p.m15884h(this.f45105b.f43646R[3]);
                if (c14377gM15884h6 != null) {
                    c14377gM15884h6.m15861b(this);
                }
                if (c14377gM15884h7 != null) {
                    c14377gM15884h7.m15861b(this);
                }
                this.f45113j = 4;
            }
            if (this.f45105b.f43634F) {
                m15886c(c14377g3, c14377g2, 1, this.f45097l);
            }
        } else if (c13806c6 != null) {
            C14377g c14377gM15884h8 = AbstractC14386p.m15884h(c13806c5);
            if (c14377gM15884h8 != null) {
                AbstractC14386p.m15883b(c14377g2, c14377gM15884h8, this.f45105b.f43646R[2].m15346e());
                m15886c(c14377g, c14377g2, 1, c14378h);
                if (this.f45105b.f43634F) {
                    m15886c(c14377g3, c14377g2, 1, this.f45097l);
                }
                if (this.f45107d == 3) {
                    C13807d c13807d13 = this.f45105b;
                    if (c13807d13.f43652X > 0.0f) {
                        C14382l c14382l = c13807d13.f43661d;
                        if (c14382l.f45107d == 3) {
                            c14382l.f45108e.f45089k.add(c14378h);
                            c14378h.f45090l.add(this.f45105b.f43661d.f45108e);
                            c14378h.f45079a = this;
                        }
                    }
                }
            }
        } else {
            C13806c c13806c7 = c13806cArr2[3];
            if (c13806c7.f43625f != null) {
                C14377g c14377gM15884h9 = AbstractC14386p.m15884h(c13806c7);
                if (c14377gM15884h9 != null) {
                    AbstractC14386p.m15883b(c14377g, c14377gM15884h9, -this.f45105b.f43646R[3].m15346e());
                    m15886c(c14377g2, c14377g, -1, c14378h);
                    if (this.f45105b.f43634F) {
                        m15886c(c14377g3, c14377g2, 1, this.f45097l);
                    }
                }
            } else {
                C13806c c13806c8 = c13806cArr2[4];
                if (c13806c8.f43625f != null) {
                    C14377g c14377gM15884h10 = AbstractC14386p.m15884h(c13806c8);
                    if (c14377gM15884h10 != null) {
                        AbstractC14386p.m15883b(c14377g3, c14377gM15884h10, 0);
                        m15886c(c14377g2, c14377g3, -1, this.f45097l);
                        m15886c(c14377g, c14377g2, 1, c14378h);
                    }
                } else if (!(c13807d12 instanceof AbstractC13812i) && (c13808e2 = c13807d12.f43649U) != null) {
                    AbstractC14386p.m15883b(c14377g2, c13808e2.f43663e.f45111h, c13807d12.m15389t());
                    m15886c(c14377g, c14377g2, 1, c14378h);
                    if (this.f45105b.f43634F) {
                        m15886c(c14377g3, c14377g2, 1, this.f45097l);
                    }
                    if (this.f45107d == 3) {
                        C13807d c13807d14 = this.f45105b;
                        if (c13807d14.f43652X > 0.0f) {
                            C14382l c14382l2 = c13807d14.f43661d;
                            if (c14382l2.f45107d == 3) {
                                c14382l2.f45108e.f45089k.add(c14378h);
                                c14378h.f45090l.add(this.f45105b.f43661d.f45108e);
                                c14378h.f45079a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c14378h.f45090l.size() == 0) {
            c14378h.f45081c = true;
        }
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: e */
    public final void mo15816e() {
        C14377g c14377g = this.f45111h;
        if (c14377g.f45088j) {
            this.f45105b.f43656a0 = c14377g.f45085g;
        }
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: f */
    public final void mo15817f() {
        this.f45106c = null;
        this.f45111h.m15862c();
        this.f45112i.m15862c();
        this.f45096k.m15862c();
        this.f45108e.m15862c();
        this.f45110g = false;
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: k */
    public final boolean mo15819k() {
        return this.f45107d != 3 || this.f45105b.f43691t == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m15879m() {
        this.f45110g = false;
        C14377g c14377g = this.f45111h;
        c14377g.m15862c();
        c14377g.f45088j = false;
        C14377g c14377g2 = this.f45112i;
        c14377g2.m15862c();
        c14377g2.f45088j = false;
        C14377g c14377g3 = this.f45096k;
        c14377g3.m15862c();
        c14377g3.f45088j = false;
        this.f45108e.f45088j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f45105b.f43672i0;
    }
}
