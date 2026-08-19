package p775h2;

import java.util.ArrayList;
import p001A.AbstractC0010F;
import p760g2.AbstractC13812i;
import p760g2.C13806c;
import p760g2.C13807d;
import p760g2.C13808e;

/* JADX INFO: renamed from: h2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C14382l extends AbstractC14386p {

    /* JADX INFO: renamed from: k */
    public static final int[] f45093k = new int[2];

    /* JADX INFO: renamed from: m */
    public static void m15875m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0267  */
    /* JADX WARN: Code duplicated, block: B:120:0x0276  */
    @Override // p775h2.InterfaceC14375e
    /* JADX INFO: renamed from: a */
    public final void mo15814a(InterfaceC14375e interfaceC14375e) {
        int iM15887g;
        int i10;
        int iM15887g2;
        float f10;
        float f11;
        float f12;
        int i11;
        if (AbstractC0010F.m24h(this.f45113j) == 3) {
            C13807d c13807d = this.f45105b;
            m15888l(c13807d.f43638J, c13807d.f43640L, 0);
            return;
        }
        C14378h c14378h = this.f45108e;
        boolean z6 = c14378h.f45088j;
        C14377g c14377g = this.f45111h;
        C14377g c14377g2 = this.f45112i;
        if (!z6 && this.f45107d == 3) {
            C13807d c13807d2 = this.f45105b;
            int i12 = c13807d2.f43690s;
            if (i12 == 2) {
                C13808e c13808e = c13807d2.f43649U;
                if (c13808e != null) {
                    C14378h c14378h2 = c13808e.f43661d.f45108e;
                    if (c14378h2.f45088j) {
                        c14378h.mo15863d((int) ((c14378h2.f45085g * c13807d2.f43695x) + 0.5f));
                    }
                }
            } else if (i12 == 3) {
                int i13 = c13807d2.f43691t;
                if (i13 == 0 || i13 == 3) {
                    C14384n c14384n = c13807d2.f43663e;
                    C14377g c14377g3 = c14384n.f45111h;
                    C14377g c14377g4 = c14384n.f45112i;
                    boolean z10 = c13807d2.f43638J.f43625f != null;
                    boolean z11 = c13807d2.f43639K.f43625f != null;
                    boolean z12 = c13807d2.f43640L.f43625f != null;
                    boolean z13 = c13807d2.f43641M.f43625f != null;
                    int i14 = c13807d2.f43653Y;
                    if (z10 && z11 && z12 && z13) {
                        float f13 = c13807d2.f43652X;
                        boolean z14 = c14377g3.f45088j;
                        int[] iArr = f45093k;
                        if (z14 && c14377g4.f45088j) {
                            if (c14377g.f45081c && c14377g2.f45081c) {
                                m15875m(iArr, ((C14377g) c14377g.f45090l.get(0)).f45085g + c14377g.f45084f, ((C14377g) c14377g2.f45090l.get(0)).f45085g - c14377g2.f45084f, c14377g3.f45085g + c14377g3.f45084f, c14377g4.f45085g - c14377g4.f45084f, f13, i14);
                                c14378h.mo15863d(iArr[0]);
                                this.f45105b.f43663e.f45108e.mo15863d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z15 = c14377g.f45088j;
                        ArrayList arrayList = c14377g3.f45090l;
                        if (z15 && c14377g2.f45088j) {
                            if (!c14377g3.f45081c || !c14377g4.f45081c) {
                                return;
                            }
                            m15875m(iArr, c14377g.f45085g + c14377g.f45084f, c14377g2.f45085g - c14377g2.f45084f, ((C14377g) arrayList.get(0)).f45085g + c14377g3.f45084f, ((C14377g) c14377g4.f45090l.get(0)).f45085g - c14377g4.f45084f, f13, i14);
                            c14378h.mo15863d(iArr[0]);
                            this.f45105b.f43663e.f45108e.mo15863d(iArr[1]);
                        }
                        if (!c14377g.f45081c || !c14377g2.f45081c || !c14377g3.f45081c || !c14377g4.f45081c) {
                            return;
                        }
                        m15875m(iArr, ((C14377g) c14377g.f45090l.get(0)).f45085g + c14377g.f45084f, ((C14377g) c14377g2.f45090l.get(0)).f45085g - c14377g2.f45084f, ((C14377g) arrayList.get(0)).f45085g + c14377g3.f45084f, ((C14377g) c14377g4.f45090l.get(0)).f45085g - c14377g4.f45084f, f13, i14);
                        c14378h.mo15863d(iArr[0]);
                        this.f45105b.f43663e.f45108e.mo15863d(iArr[1]);
                    } else if (z10 && z12) {
                        if (!c14377g.f45081c || !c14377g2.f45081c) {
                            return;
                        }
                        float f14 = c13807d2.f43652X;
                        int i15 = ((C14377g) c14377g.f45090l.get(0)).f45085g + c14377g.f45084f;
                        int i16 = ((C14377g) c14377g2.f45090l.get(0)).f45085g - c14377g2.f45084f;
                        if (i14 == -1 || i14 == 0) {
                            int iM15887g3 = m15887g(i16 - i15, 0);
                            int i17 = (int) ((iM15887g3 * f14) + 0.5f);
                            int iM15887g4 = m15887g(i17, 1);
                            if (i17 != iM15887g4) {
                                iM15887g3 = (int) ((iM15887g4 / f14) + 0.5f);
                            }
                            c14378h.mo15863d(iM15887g3);
                            this.f45105b.f43663e.f45108e.mo15863d(iM15887g4);
                        } else if (i14 == 1) {
                            int iM15887g5 = m15887g(i16 - i15, 0);
                            int i18 = (int) ((iM15887g5 / f14) + 0.5f);
                            int iM15887g6 = m15887g(i18, 1);
                            if (i18 != iM15887g6) {
                                iM15887g5 = (int) ((iM15887g6 * f14) + 0.5f);
                            }
                            c14378h.mo15863d(iM15887g5);
                            this.f45105b.f43663e.f45108e.mo15863d(iM15887g6);
                        }
                    } else if (z11 && z13) {
                        if (!c14377g3.f45081c || !c14377g4.f45081c) {
                            return;
                        }
                        float f15 = c13807d2.f43652X;
                        int i19 = ((C14377g) c14377g3.f45090l.get(0)).f45085g + c14377g3.f45084f;
                        int i20 = ((C14377g) c14377g4.f45090l.get(0)).f45085g - c14377g4.f45084f;
                        if (i14 == -1) {
                            iM15887g = m15887g(i20 - i19, 1);
                            i10 = (int) ((iM15887g / f15) + 0.5f);
                            iM15887g2 = m15887g(i10, 0);
                            if (i10 != iM15887g2) {
                                iM15887g = (int) ((iM15887g2 * f15) + 0.5f);
                            }
                            c14378h.mo15863d(iM15887g2);
                            this.f45105b.f43663e.f45108e.mo15863d(iM15887g);
                        } else if (i14 == 0) {
                            int iM15887g7 = m15887g(i20 - i19, 1);
                            int i21 = (int) ((iM15887g7 * f15) + 0.5f);
                            int iM15887g8 = m15887g(i21, 0);
                            if (i21 != iM15887g8) {
                                iM15887g7 = (int) ((iM15887g8 / f15) + 0.5f);
                            }
                            c14378h.mo15863d(iM15887g8);
                            this.f45105b.f43663e.f45108e.mo15863d(iM15887g7);
                        } else if (i14 == 1) {
                            iM15887g = m15887g(i20 - i19, 1);
                            i10 = (int) ((iM15887g / f15) + 0.5f);
                            iM15887g2 = m15887g(i10, 0);
                            if (i10 != iM15887g2) {
                                iM15887g = (int) ((iM15887g2 * f15) + 0.5f);
                            }
                            c14378h.mo15863d(iM15887g2);
                            this.f45105b.f43663e.f45108e.mo15863d(iM15887g);
                        }
                    }
                } else {
                    int i22 = c13807d2.f43653Y;
                    if (i22 != -1) {
                        if (i22 == 0) {
                            f12 = c13807d2.f43663e.f45108e.f45085g / c13807d2.f43652X;
                            i11 = (int) (f12 + 0.5f);
                        } else if (i22 != 1) {
                            i11 = 0;
                        } else {
                            f10 = c13807d2.f43663e.f45108e.f45085g;
                            f11 = c13807d2.f43652X;
                        }
                        c14378h.mo15863d(i11);
                    } else {
                        f10 = c13807d2.f43663e.f45108e.f45085g;
                        f11 = c13807d2.f43652X;
                    }
                    f12 = f10 * f11;
                    i11 = (int) (f12 + 0.5f);
                    c14378h.mo15863d(i11);
                }
            }
        }
        if (c14377g.f45081c && c14377g2.f45081c) {
            if (c14377g.f45088j && c14377g2.f45088j && c14378h.f45088j) {
                return;
            }
            if (!c14378h.f45088j && this.f45107d == 3) {
                C13807d c13807d3 = this.f45105b;
                if (c13807d3.f43690s == 0 && !c13807d3.m15394y()) {
                    C14377g c14377g5 = (C14377g) c14377g.f45090l.get(0);
                    C14377g c14377g6 = (C14377g) c14377g2.f45090l.get(0);
                    int i23 = c14377g5.f45085g + c14377g.f45084f;
                    int i24 = c14377g6.f45085g + c14377g2.f45084f;
                    c14377g.mo15863d(i23);
                    c14377g2.mo15863d(i24);
                    c14378h.mo15863d(i24 - i23);
                    return;
                }
            }
            if (!c14378h.f45088j && this.f45107d == 3 && this.f45104a == 1 && c14377g.f45090l.size() > 0 && c14377g2.f45090l.size() > 0) {
                int iMin = Math.min((((C14377g) c14377g2.f45090l.get(0)).f45085g + c14377g2.f45084f) - (((C14377g) c14377g.f45090l.get(0)).f45085g + c14377g.f45084f), c14378h.f45091m);
                C13807d c13807d4 = this.f45105b;
                int i25 = c13807d4.f43694w;
                int iMax = Math.max(c13807d4.f43693v, iMin);
                if (i25 > 0) {
                    iMax = Math.min(i25, iMax);
                }
                c14378h.mo15863d(iMax);
            }
            if (c14378h.f45088j) {
                C14377g c14377g7 = (C14377g) c14377g.f45090l.get(0);
                C14377g c14377g8 = (C14377g) c14377g2.f45090l.get(0);
                int i26 = c14377g7.f45085g;
                int i27 = c14377g.f45084f + i26;
                int i28 = c14377g8.f45085g;
                int i29 = c14377g2.f45084f + i28;
                float f16 = this.f45105b.f43664e0;
                if (c14377g7 == c14377g8) {
                    f16 = 0.5f;
                } else {
                    i26 = i27;
                    i28 = i29;
                }
                c14377g.mo15863d((int) ((((i28 - i26) - c14378h.f45085g) * f16) + i26 + 0.5f));
                c14377g2.mo15863d(c14377g.f45085g + c14378h.f45085g);
            }
        }
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: d */
    public final void mo15815d() {
        C13807d c13807d;
        C13808e c13808e;
        int i10;
        C13808e c13808e2;
        C13808e c13808e3;
        int i11;
        C13807d c13807d2 = this.f45105b;
        boolean z6 = c13807d2.f43655a;
        C14378h c14378h = this.f45108e;
        if (z6) {
            c14378h.mo15863d(c13807d2.m15387r());
        }
        boolean z10 = c14378h.f45088j;
        C14377g c14377g = this.f45112i;
        C14377g c14377g2 = this.f45111h;
        if (!z10) {
            C13807d c13807d3 = this.f45105b;
            int i12 = c13807d3.f43688q0[0];
            this.f45107d = i12;
            if (i12 != 3) {
                if (i12 == 4 && (c13808e3 = c13807d3.f43649U) != null && ((i11 = c13808e3.f43688q0[0]) == 1 || i11 == 4)) {
                    int iM15387r = (c13808e3.m15387r() - this.f45105b.f43638J.m15346e()) - this.f45105b.f43640L.m15346e();
                    AbstractC14386p.m15883b(c14377g2, c13808e3.f43661d.f45111h, this.f45105b.f43638J.m15346e());
                    AbstractC14386p.m15883b(c14377g, c13808e3.f43661d.f45112i, -this.f45105b.f43640L.m15346e());
                    c14378h.mo15863d(iM15387r);
                    return;
                }
                if (i12 == 1) {
                    c14378h.mo15863d(c13807d3.m15387r());
                }
            }
        } else if (this.f45107d == 4 && (c13808e = (c13807d = this.f45105b).f43649U) != null && ((i10 = c13808e.f43688q0[0]) == 1 || i10 == 4)) {
            AbstractC14386p.m15883b(c14377g2, c13808e.f43661d.f45111h, c13807d.f43638J.m15346e());
            AbstractC14386p.m15883b(c14377g, c13808e.f43661d.f45112i, -this.f45105b.f43640L.m15346e());
            return;
        }
        if (c14378h.f45088j) {
            C13807d c13807d4 = this.f45105b;
            if (c13807d4.f43655a) {
                C13806c[] c13806cArr = c13807d4.f43646R;
                C13806c c13806c = c13806cArr[0];
                C13806c c13806c2 = c13806c.f43625f;
                if (c13806c2 != null && c13806cArr[1].f43625f != null) {
                    if (c13807d4.m15394y()) {
                        c14377g2.f45084f = this.f45105b.f43646R[0].m15346e();
                        c14377g.f45084f = -this.f45105b.f43646R[1].m15346e();
                        return;
                    }
                    C14377g c14377gM15884h = AbstractC14386p.m15884h(this.f45105b.f43646R[0]);
                    if (c14377gM15884h != null) {
                        AbstractC14386p.m15883b(c14377g2, c14377gM15884h, this.f45105b.f43646R[0].m15346e());
                    }
                    C14377g c14377gM15884h2 = AbstractC14386p.m15884h(this.f45105b.f43646R[1]);
                    if (c14377gM15884h2 != null) {
                        AbstractC14386p.m15883b(c14377g, c14377gM15884h2, -this.f45105b.f43646R[1].m15346e());
                    }
                    c14377g2.f45080b = true;
                    c14377g.f45080b = true;
                    return;
                }
                if (c13806c2 != null) {
                    C14377g c14377gM15884h3 = AbstractC14386p.m15884h(c13806c);
                    if (c14377gM15884h3 != null) {
                        AbstractC14386p.m15883b(c14377g2, c14377gM15884h3, this.f45105b.f43646R[0].m15346e());
                        AbstractC14386p.m15883b(c14377g, c14377g2, c14378h.f45085g);
                        return;
                    }
                    return;
                }
                C13806c c13806c3 = c13806cArr[1];
                if (c13806c3.f43625f != null) {
                    C14377g c14377gM15884h4 = AbstractC14386p.m15884h(c13806c3);
                    if (c14377gM15884h4 != null) {
                        AbstractC14386p.m15883b(c14377g, c14377gM15884h4, -this.f45105b.f43646R[1].m15346e());
                        AbstractC14386p.m15883b(c14377g2, c14377g, -c14378h.f45085g);
                        return;
                    }
                    return;
                }
                if ((c13807d4 instanceof AbstractC13812i) || c13807d4.f43649U == null || c13807d4.mo15381j(7).f43625f != null) {
                    return;
                }
                C13807d c13807d5 = this.f45105b;
                AbstractC14386p.m15883b(c14377g2, c13807d5.f43649U.f43661d.f45111h, c13807d5.m15388s());
                AbstractC14386p.m15883b(c14377g, c14377g2, c14378h.f45085g);
                return;
            }
        }
        if (this.f45107d == 3) {
            C13807d c13807d6 = this.f45105b;
            int i13 = c13807d6.f43690s;
            if (i13 == 2) {
                C13808e c13808e4 = c13807d6.f43649U;
                if (c13808e4 != null) {
                    C14378h c14378h2 = c13808e4.f43663e.f45108e;
                    c14378h.f45090l.add(c14378h2);
                    c14378h2.f45089k.add(c14378h);
                    c14378h.f45080b = true;
                    c14378h.f45089k.add(c14377g2);
                    c14378h.f45089k.add(c14377g);
                }
            } else if (i13 == 3) {
                if (c13807d6.f43691t == 3) {
                    c14377g2.f45079a = this;
                    c14377g.f45079a = this;
                    C14384n c14384n = c13807d6.f43663e;
                    c14384n.f45111h.f45079a = this;
                    c14384n.f45112i.f45079a = this;
                    c14378h.f45079a = this;
                    if (c13807d6.m15395z()) {
                        c14378h.f45090l.add(this.f45105b.f43663e.f45108e);
                        this.f45105b.f43663e.f45108e.f45089k.add(c14378h);
                        C14384n c14384n2 = this.f45105b.f43663e;
                        c14384n2.f45108e.f45079a = this;
                        c14378h.f45090l.add(c14384n2.f45111h);
                        c14378h.f45090l.add(this.f45105b.f43663e.f45112i);
                        this.f45105b.f43663e.f45111h.f45089k.add(c14378h);
                        this.f45105b.f43663e.f45112i.f45089k.add(c14378h);
                    } else if (this.f45105b.m15394y()) {
                        this.f45105b.f43663e.f45108e.f45090l.add(c14378h);
                        c14378h.f45089k.add(this.f45105b.f43663e.f45108e);
                    } else {
                        this.f45105b.f43663e.f45108e.f45090l.add(c14378h);
                    }
                } else {
                    C14378h c14378h3 = c13807d6.f43663e.f45108e;
                    c14378h.f45090l.add(c14378h3);
                    c14378h3.f45089k.add(c14378h);
                    this.f45105b.f43663e.f45111h.f45089k.add(c14378h);
                    this.f45105b.f43663e.f45112i.f45089k.add(c14378h);
                    c14378h.f45080b = true;
                    c14378h.f45089k.add(c14377g2);
                    c14378h.f45089k.add(c14377g);
                    c14377g2.f45090l.add(c14378h);
                    c14377g.f45090l.add(c14378h);
                }
            }
        }
        C13807d c13807d7 = this.f45105b;
        C13806c[] c13806cArr2 = c13807d7.f43646R;
        C13806c c13806c4 = c13806cArr2[0];
        C13806c c13806c5 = c13806c4.f43625f;
        if (c13806c5 != null && c13806cArr2[1].f43625f != null) {
            if (c13807d7.m15394y()) {
                c14377g2.f45084f = this.f45105b.f43646R[0].m15346e();
                c14377g.f45084f = -this.f45105b.f43646R[1].m15346e();
                return;
            }
            C14377g c14377gM15884h5 = AbstractC14386p.m15884h(this.f45105b.f43646R[0]);
            C14377g c14377gM15884h6 = AbstractC14386p.m15884h(this.f45105b.f43646R[1]);
            if (c14377gM15884h5 != null) {
                c14377gM15884h5.m15861b(this);
            }
            if (c14377gM15884h6 != null) {
                c14377gM15884h6.m15861b(this);
            }
            this.f45113j = 4;
            return;
        }
        if (c13806c5 != null) {
            C14377g c14377gM15884h7 = AbstractC14386p.m15884h(c13806c4);
            if (c14377gM15884h7 != null) {
                AbstractC14386p.m15883b(c14377g2, c14377gM15884h7, this.f45105b.f43646R[0].m15346e());
                m15886c(c14377g, c14377g2, 1, c14378h);
                return;
            }
            return;
        }
        C13806c c13806c6 = c13806cArr2[1];
        if (c13806c6.f43625f != null) {
            C14377g c14377gM15884h8 = AbstractC14386p.m15884h(c13806c6);
            if (c14377gM15884h8 != null) {
                AbstractC14386p.m15883b(c14377g, c14377gM15884h8, -this.f45105b.f43646R[1].m15346e());
                m15886c(c14377g2, c14377g, -1, c14378h);
                return;
            }
            return;
        }
        if ((c13807d7 instanceof AbstractC13812i) || (c13808e2 = c13807d7.f43649U) == null) {
            return;
        }
        AbstractC14386p.m15883b(c14377g2, c13808e2.f43661d.f45111h, c13807d7.m15388s());
        m15886c(c14377g, c14377g2, 1, c14378h);
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: e */
    public final void mo15816e() {
        C14377g c14377g = this.f45111h;
        if (c14377g.f45088j) {
            this.f45105b.f43654Z = c14377g.f45085g;
        }
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: f */
    public final void mo15817f() {
        this.f45106c = null;
        this.f45111h.m15862c();
        this.f45112i.m15862c();
        this.f45108e.m15862c();
        this.f45110g = false;
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: k */
    public final boolean mo15819k() {
        return this.f45107d != 3 || this.f45105b.f43690s == 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m15876n() {
        this.f45110g = false;
        C14377g c14377g = this.f45111h;
        c14377g.m15862c();
        c14377g.f45088j = false;
        C14377g c14377g2 = this.f45112i;
        c14377g2.m15862c();
        c14377g2.f45088j = false;
        this.f45108e.f45088j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f45105b.f43672i0;
    }
}
