package p775h2;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import p760g2.C13806c;
import p760g2.C13807d;
import p760g2.C13808e;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: h2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C14374d extends AbstractC14386p {

    /* JADX INFO: renamed from: k */
    public final ArrayList f45077k;

    /* JADX INFO: renamed from: l */
    public int f45078l;

    public C14374d(C13807d c13807d, int i10) {
        C13807d c13807d2;
        super(c13807d);
        this.f45077k = new ArrayList();
        this.f45109f = i10;
        C13807d c13807d3 = this.f45105b;
        C13807d c13807dM15385n = c13807d3.m15385n(i10);
        while (true) {
            C13807d c13807d4 = c13807dM15385n;
            c13807d2 = c13807d3;
            c13807d3 = c13807d4;
            if (c13807d3 == null) {
                break;
            } else {
                c13807dM15385n = c13807d3.m15385n(this.f45109f);
            }
        }
        this.f45105b = c13807d2;
        int i11 = this.f45109f;
        InterfaceC14375e interfaceC14375e = i11 == 0 ? c13807d2.f43661d : i11 == 1 ? c13807d2.f43663e : null;
        ArrayList<AbstractC14386p> arrayList = this.f45077k;
        arrayList.add(interfaceC14375e);
        C13807d c13807dM15384m = c13807d2.m15384m(this.f45109f);
        while (c13807dM15384m != null) {
            int i12 = this.f45109f;
            arrayList.add(i12 == 0 ? c13807dM15384m.f43661d : i12 == 1 ? c13807dM15384m.f43663e : null);
            c13807dM15384m = c13807dM15384m.m15384m(this.f45109f);
        }
        for (AbstractC14386p abstractC14386p : arrayList) {
            int i13 = this.f45109f;
            if (i13 == 0) {
                abstractC14386p.f45105b.f43657b = this;
            } else if (i13 == 1) {
                abstractC14386p.f45105b.f43659c = this;
            }
        }
        if (this.f45109f == 0 && this.f45105b.f43649U.f43716w0 && arrayList.size() > 1) {
            this.f45105b = ((AbstractC14386p) AbstractC17792x.m19532o(1, arrayList)).f45105b;
        }
        this.f45078l = this.f45109f == 0 ? this.f45105b.f43674j0 : this.f45105b.f43676k0;
    }

    /* JADX WARN: Code duplicated, block: B:295:0x00e3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0151  */
    @Override // p775h2.InterfaceC14375e
    /* JADX INFO: renamed from: a */
    public final void mo15814a(InterfaceC14375e interfaceC14375e) {
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        boolean z6;
        ArrayList arrayList2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        float f11;
        C14377g c14377g = this.f45111h;
        if (c14377g.f45088j) {
            C14377g c14377g2 = this.f45112i;
            if (c14377g2.f45088j) {
                C13808e c13808e = this.f45105b.f43649U;
                boolean z10 = c13808e instanceof C13808e ? c13808e.f43716w0 : false;
                int i25 = c14377g2.f45085g - c14377g.f45085g;
                ArrayList arrayList3 = this.f45077k;
                int size = arrayList3.size();
                int i26 = 0;
                while (true) {
                    i10 = -1;
                    i11 = 8;
                    if (i26 >= size) {
                        i26 = -1;
                        break;
                    } else if (((AbstractC14386p) arrayList3.get(i26)).f45105b.f43670h0 != 8) {
                        break;
                    } else {
                        i26++;
                    }
                }
                int i27 = size - 1;
                for (int i28 = i27; i28 >= 0; i28--) {
                    if (((AbstractC14386p) arrayList3.get(i28)).f45105b.f43670h0 != 8) {
                        i10 = i28;
                        break;
                    }
                }
                int i29 = 0;
                while (true) {
                    if (i29 >= 2) {
                        arrayList = arrayList3;
                        i12 = i26;
                        i13 = 0;
                        i14 = 0;
                        i15 = 0;
                        f10 = 0.0f;
                        break;
                    }
                    int i30 = 0;
                    i15 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    f10 = 0.0f;
                    while (i30 < size) {
                        AbstractC14386p abstractC14386p = (AbstractC14386p) arrayList3.get(i30);
                        C13807d c13807d = abstractC14386p.f45105b;
                        ArrayList arrayList4 = arrayList3;
                        if (c13807d.f43670h0 == i11) {
                            i23 = i26;
                        } else {
                            i32++;
                            if (i30 > 0 && i30 >= i26) {
                                i15 += abstractC14386p.f45111h.f45084f;
                            }
                            C14378h c14378h = abstractC14386p.f45108e;
                            int i33 = c14378h.f45085g;
                            i23 = i26;
                            boolean z11 = abstractC14386p.f45107d != 3;
                            if (z11) {
                                int i34 = this.f45109f;
                                if (i34 == 0 && !c13807d.f43661d.f45108e.f45088j) {
                                    return;
                                }
                                if (i34 == 1 && !c13807d.f43663e.f45108e.f45088j) {
                                    return;
                                }
                            } else {
                                if (abstractC14386p.f45104a == 1 && i29 == 0) {
                                    i24 = c14378h.f45091m;
                                    i31++;
                                } else {
                                    if (c14378h.f45088j) {
                                        i24 = i33;
                                    }
                                    if (z11) {
                                        i15 += i24;
                                    } else {
                                        i31++;
                                        f11 = c13807d.f43678l0[this.f45109f];
                                        if (f11 >= 0.0f) {
                                            f10 += f11;
                                        }
                                    }
                                    if (i30 >= i27 && i30 < i10) {
                                        i15 += -abstractC14386p.f45112i.f45084f;
                                    }
                                }
                                z11 = true;
                                if (z11) {
                                    i31++;
                                    f11 = c13807d.f43678l0[this.f45109f];
                                    if (f11 >= 0.0f) {
                                        f10 += f11;
                                    }
                                } else {
                                    i15 += i24;
                                }
                                if (i30 >= i27) {
                                }
                            }
                            i24 = i33;
                            if (z11) {
                                i31++;
                                f11 = c13807d.f43678l0[this.f45109f];
                                if (f11 >= 0.0f) {
                                    f10 += f11;
                                }
                            } else {
                                i15 += i24;
                            }
                            if (i30 >= i27) {
                            }
                        }
                        i30++;
                        arrayList3 = arrayList4;
                        i26 = i23;
                        i11 = 8;
                    }
                    arrayList = arrayList3;
                    i12 = i26;
                    if (i15 < i25 || i31 == 0) {
                        i13 = i31;
                        i14 = i32;
                        break;
                    } else {
                        i29++;
                        arrayList3 = arrayList;
                        i26 = i12;
                        i11 = 8;
                    }
                }
                int i35 = c14377g.f45085g;
                if (z10) {
                    i35 = c14377g2.f45085g;
                }
                if (i15 > i25) {
                    i35 = z10 ? i35 + ((int) (((i15 - i25) / 2.0f) + 0.5f)) : i35 - ((int) (((i15 - i25) / 2.0f) + 0.5f));
                }
                if (i13 > 0) {
                    float f12 = i25 - i15;
                    int i36 = (int) ((f12 / i13) + 0.5f);
                    int i37 = 0;
                    int i38 = 0;
                    while (i37 < size) {
                        ArrayList arrayList5 = arrayList;
                        AbstractC14386p abstractC14386p2 = (AbstractC14386p) arrayList5.get(i37);
                        int i39 = i36;
                        C13807d c13807d2 = abstractC14386p2.f45105b;
                        int i40 = i15;
                        int i41 = i35;
                        if (c13807d2.f43670h0 != 8 && abstractC14386p2.f45107d == 3) {
                            C14378h c14378h2 = abstractC14386p2.f45108e;
                            if (c14378h2.f45088j) {
                                z10 = z10;
                            } else {
                                int i42 = f10 > 0.0f ? (int) (((c13807d2.f43678l0[this.f45109f] * f12) / f10) + 0.5f) : i39;
                                if (this.f45109f == 0) {
                                    i21 = c13807d2.f43694w;
                                    i22 = c13807d2.f43693v;
                                } else {
                                    i21 = c13807d2.f43697z;
                                    i22 = c13807d2.f43696y;
                                }
                                int iMax = Math.max(i22, abstractC14386p2.f45104a == 1 ? Math.min(i42, c14378h2.f45091m) : i42);
                                if (i21 > 0) {
                                    iMax = Math.min(i21, iMax);
                                }
                                if (iMax != i42) {
                                    i38++;
                                    i42 = iMax;
                                }
                                c14378h2.mo15863d(i42);
                            }
                        } else {
                            z10 = z10;
                        }
                        i37++;
                        i36 = i39;
                        i15 = i40;
                        i35 = i41;
                        z10 = z10;
                        f12 = f12;
                        arrayList = arrayList5;
                    }
                    i16 = i35;
                    z6 = z10;
                    arrayList2 = arrayList;
                    int i43 = i15;
                    if (i38 > 0) {
                        i13 -= i38;
                        int i44 = 0;
                        i15 = 0;
                        while (i44 < size) {
                            AbstractC14386p abstractC14386p3 = (AbstractC14386p) arrayList2.get(i44);
                            if (abstractC14386p3.f45105b.f43670h0 == 8) {
                                i20 = i12;
                            } else {
                                i20 = i12;
                                if (i44 > 0 && i44 >= i20) {
                                    i15 += abstractC14386p3.f45111h.f45084f;
                                }
                                i15 += abstractC14386p3.f45108e.f45085g;
                                if (i44 < i27 && i44 < i10) {
                                    i15 += -abstractC14386p3.f45112i.f45084f;
                                }
                            }
                            i44++;
                            i12 = i20;
                        }
                        i17 = i12;
                    } else {
                        i17 = i12;
                        i15 = i43;
                    }
                    i19 = 2;
                    if (this.f45078l == 2 && i38 == 0) {
                        i18 = 0;
                        this.f45078l = 0;
                    } else {
                        i18 = 0;
                    }
                } else {
                    i16 = i35;
                    z6 = z10;
                    arrayList2 = arrayList;
                    i17 = i12;
                    i18 = 0;
                    i19 = 2;
                }
                if (i15 > i25) {
                    this.f45078l = i19;
                }
                if (i14 > 0 && i13 == 0 && i17 == i10) {
                    this.f45078l = i19;
                }
                int i45 = this.f45078l;
                if (i45 == 1) {
                    int i46 = i14 > 1 ? (i25 - i15) / (i14 - 1) : i14 == 1 ? (i25 - i15) / 2 : i18;
                    if (i13 > 0) {
                        i46 = i18;
                    }
                    int i47 = i16;
                    for (int i48 = i18; i48 < size; i48++) {
                        AbstractC14386p abstractC14386p4 = (AbstractC14386p) arrayList2.get(z6 ? size - (i48 + 1) : i48);
                        int i49 = abstractC14386p4.f45105b.f43670h0;
                        C14377g c14377g3 = abstractC14386p4.f45112i;
                        C14377g c14377g4 = abstractC14386p4.f45111h;
                        if (i49 == 8) {
                            c14377g4.mo15863d(i47);
                            c14377g3.mo15863d(i47);
                        } else {
                            if (i48 > 0) {
                                i47 = z6 ? i47 - i46 : i47 + i46;
                            }
                            if (i48 > 0 && i48 >= i17) {
                                i47 = z6 ? i47 - c14377g4.f45084f : i47 + c14377g4.f45084f;
                            }
                            if (z6) {
                                c14377g3.mo15863d(i47);
                            } else {
                                c14377g4.mo15863d(i47);
                            }
                            C14378h c14378h3 = abstractC14386p4.f45108e;
                            int i50 = c14378h3.f45085g;
                            if (abstractC14386p4.f45107d == 3 && abstractC14386p4.f45104a == 1) {
                                i50 = c14378h3.f45091m;
                            }
                            i47 = z6 ? i47 - i50 : i47 + i50;
                            if (z6) {
                                c14377g4.mo15863d(i47);
                            } else {
                                c14377g3.mo15863d(i47);
                            }
                            abstractC14386p4.f45110g = true;
                            if (i48 < i27 && i48 < i10) {
                                i47 = z6 ? i47 - (-c14377g3.f45084f) : i47 + (-c14377g3.f45084f);
                            }
                        }
                    }
                    return;
                }
                if (i45 == 0) {
                    int i51 = (i25 - i15) / (i14 + 1);
                    if (i13 > 0) {
                        i51 = i18;
                    }
                    int i52 = i16;
                    for (int i53 = i18; i53 < size; i53++) {
                        AbstractC14386p abstractC14386p5 = (AbstractC14386p) arrayList2.get(z6 ? size - (i53 + 1) : i53);
                        int i54 = abstractC14386p5.f45105b.f43670h0;
                        C14377g c14377g5 = abstractC14386p5.f45112i;
                        C14377g c14377g6 = abstractC14386p5.f45111h;
                        if (i54 == 8) {
                            c14377g6.mo15863d(i52);
                            c14377g5.mo15863d(i52);
                        } else {
                            int i55 = z6 ? i52 - i51 : i52 + i51;
                            if (i53 > 0 && i53 >= i17) {
                                i55 = z6 ? i55 - c14377g6.f45084f : i55 + c14377g6.f45084f;
                            }
                            if (z6) {
                                c14377g5.mo15863d(i55);
                            } else {
                                c14377g6.mo15863d(i55);
                            }
                            C14378h c14378h4 = abstractC14386p5.f45108e;
                            int iMin = c14378h4.f45085g;
                            if (abstractC14386p5.f45107d == 3 && abstractC14386p5.f45104a == 1) {
                                iMin = Math.min(iMin, c14378h4.f45091m);
                            }
                            i52 = z6 ? i55 - iMin : i55 + iMin;
                            if (z6) {
                                c14377g6.mo15863d(i52);
                            } else {
                                c14377g5.mo15863d(i52);
                            }
                            if (i53 < i27 && i53 < i10) {
                                i52 = z6 ? i52 - (-c14377g5.f45084f) : i52 + (-c14377g5.f45084f);
                            }
                        }
                    }
                    return;
                }
                if (i45 == 2) {
                    float f13 = this.f45109f == 0 ? this.f45105b.f43664e0 : this.f45105b.f43666f0;
                    if (z6) {
                        f13 = 1.0f - f13;
                    }
                    int i56 = (int) (((i25 - i15) * f13) + 0.5f);
                    if (i56 < 0 || i13 > 0) {
                        i56 = i18;
                    }
                    int i57 = z6 ? i16 - i56 : i16 + i56;
                    for (int i58 = i18; i58 < size; i58++) {
                        AbstractC14386p abstractC14386p6 = (AbstractC14386p) arrayList2.get(z6 ? size - (i58 + 1) : i58);
                        int i59 = abstractC14386p6.f45105b.f43670h0;
                        C14377g c14377g7 = abstractC14386p6.f45112i;
                        C14377g c14377g8 = abstractC14386p6.f45111h;
                        if (i59 == 8) {
                            c14377g8.mo15863d(i57);
                            c14377g7.mo15863d(i57);
                        } else {
                            if (i58 > 0 && i58 >= i17) {
                                i57 = z6 ? i57 - c14377g8.f45084f : i57 + c14377g8.f45084f;
                            }
                            if (z6) {
                                c14377g7.mo15863d(i57);
                            } else {
                                c14377g8.mo15863d(i57);
                            }
                            C14378h c14378h5 = abstractC14386p6.f45108e;
                            int i60 = c14378h5.f45085g;
                            if (abstractC14386p6.f45107d == 3 && abstractC14386p6.f45104a == 1) {
                                i60 = c14378h5.f45091m;
                            }
                            i57 = z6 ? i57 - i60 : i57 + i60;
                            if (z6) {
                                c14377g8.mo15863d(i57);
                            } else {
                                c14377g7.mo15863d(i57);
                            }
                            if (i58 < i27 && i58 < i10) {
                                i57 = z6 ? i57 - (-c14377g7.f45084f) : i57 + (-c14377g7.f45084f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: d */
    public final void mo15815d() {
        ArrayList arrayList = this.f45077k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC14386p) it.next()).mo15815d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C13807d c13807d = ((AbstractC14386p) arrayList.get(0)).f45105b;
        C13807d c13807d2 = ((AbstractC14386p) arrayList.get(size - 1)).f45105b;
        int i10 = this.f45109f;
        C14377g c14377g = this.f45112i;
        C14377g c14377g2 = this.f45111h;
        if (i10 == 0) {
            C13806c c13806c = c13807d.f43638J;
            C13806c c13806c2 = c13807d2.f43640L;
            C14377g c14377gM15885i = AbstractC14386p.m15885i(c13806c, 0);
            int iM15346e = c13806c.m15346e();
            C13807d c13807dM15820m = m15820m();
            if (c13807dM15820m != null) {
                iM15346e = c13807dM15820m.f43638J.m15346e();
            }
            if (c14377gM15885i != null) {
                AbstractC14386p.m15883b(c14377g2, c14377gM15885i, iM15346e);
            }
            C14377g c14377gM15885i2 = AbstractC14386p.m15885i(c13806c2, 0);
            int iM15346e2 = c13806c2.m15346e();
            C13807d c13807dM15821n = m15821n();
            if (c13807dM15821n != null) {
                iM15346e2 = c13807dM15821n.f43640L.m15346e();
            }
            if (c14377gM15885i2 != null) {
                AbstractC14386p.m15883b(c14377g, c14377gM15885i2, -iM15346e2);
            }
        } else {
            C13806c c13806c3 = c13807d.f43639K;
            C13806c c13806c4 = c13807d2.f43641M;
            C14377g c14377gM15885i3 = AbstractC14386p.m15885i(c13806c3, 1);
            int iM15346e3 = c13806c3.m15346e();
            C13807d c13807dM15820m2 = m15820m();
            if (c13807dM15820m2 != null) {
                iM15346e3 = c13807dM15820m2.f43639K.m15346e();
            }
            if (c14377gM15885i3 != null) {
                AbstractC14386p.m15883b(c14377g2, c14377gM15885i3, iM15346e3);
            }
            C14377g c14377gM15885i4 = AbstractC14386p.m15885i(c13806c4, 1);
            int iM15346e4 = c13806c4.m15346e();
            C13807d c13807dM15821n2 = m15821n();
            if (c13807dM15821n2 != null) {
                iM15346e4 = c13807dM15821n2.f43641M.m15346e();
            }
            if (c14377gM15885i4 != null) {
                AbstractC14386p.m15883b(c14377g, c14377gM15885i4, -iM15346e4);
            }
        }
        c14377g2.f45079a = this;
        c14377g.f45079a = this;
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: e */
    public final void mo15816e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45077k;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((AbstractC14386p) arrayList.get(i10)).mo15816e();
            i10++;
        }
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: f */
    public final void mo15817f() {
        this.f45106c = null;
        Iterator it = this.f45077k.iterator();
        while (it.hasNext()) {
            ((AbstractC14386p) it.next()).mo15817f();
        }
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: j */
    public final long mo15818j() {
        ArrayList arrayList = this.f45077k;
        int size = arrayList.size();
        long jMo15818j = 0;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC14386p abstractC14386p = (AbstractC14386p) arrayList.get(i10);
            jMo15818j = ((long) abstractC14386p.f45112i.f45084f) + abstractC14386p.mo15818j() + jMo15818j + ((long) abstractC14386p.f45111h.f45084f);
        }
        return jMo15818j;
    }

    @Override // p775h2.AbstractC14386p
    /* JADX INFO: renamed from: k */
    public final boolean mo15819k() {
        ArrayList arrayList = this.f45077k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((AbstractC14386p) arrayList.get(i10)).mo15819k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final C13807d m15820m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45077k;
            if (i10 >= arrayList.size()) {
                return null;
            }
            C13807d c13807d = ((AbstractC14386p) arrayList.get(i10)).f45105b;
            if (c13807d.f43670h0 != 8) {
                return c13807d;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final C13807d m15821n() {
        ArrayList arrayList = this.f45077k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C13807d c13807d = ((AbstractC14386p) arrayList.get(size)).f45105b;
            if (c13807d.f43670h0 != 8) {
                return c13807d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f45109f == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC14386p abstractC14386p : this.f45077k) {
            sb2.append(Separators.LESS_THAN);
            sb2.append(abstractC14386p);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
