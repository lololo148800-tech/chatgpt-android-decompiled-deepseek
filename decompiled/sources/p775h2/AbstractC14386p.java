package p775h2;

import p001A.AbstractC0010F;
import p760g2.C13806c;
import p760g2.C13807d;
import p760g2.C13808e;

/* JADX INFO: renamed from: h2.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14386p implements InterfaceC14375e {

    /* JADX INFO: renamed from: a */
    public int f45104a;

    /* JADX INFO: renamed from: b */
    public C13807d f45105b;

    /* JADX INFO: renamed from: c */
    public C14383m f45106c;

    /* JADX INFO: renamed from: d */
    public int f45107d;

    /* JADX INFO: renamed from: e */
    public final C14378h f45108e = new C14378h(this);

    /* JADX INFO: renamed from: f */
    public int f45109f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f45110g = false;

    /* JADX INFO: renamed from: h */
    public final C14377g f45111h = new C14377g(this);

    /* JADX INFO: renamed from: i */
    public final C14377g f45112i = new C14377g(this);

    /* JADX INFO: renamed from: j */
    public int f45113j = 1;

    public AbstractC14386p(C13807d c13807d) {
        this.f45105b = c13807d;
    }

    /* JADX INFO: renamed from: b */
    public static void m15883b(C14377g c14377g, C14377g c14377g2, int i10) {
        c14377g.f45090l.add(c14377g2);
        c14377g.f45084f = i10;
        c14377g2.f45089k.add(c14377g);
    }

    /* JADX INFO: renamed from: h */
    public static C14377g m15884h(C13806c c13806c) {
        C13806c c13806c2 = c13806c.f43625f;
        if (c13806c2 == null) {
            return null;
        }
        C13807d c13807d = c13806c2.f43623d;
        int iM24h = AbstractC0010F.m24h(c13806c2.f43624e);
        if (iM24h == 1) {
            return c13807d.f43661d.f45111h;
        }
        if (iM24h == 2) {
            return c13807d.f43663e.f45111h;
        }
        if (iM24h == 3) {
            return c13807d.f43661d.f45112i;
        }
        if (iM24h == 4) {
            return c13807d.f43663e.f45112i;
        }
        if (iM24h != 5) {
            return null;
        }
        return c13807d.f43663e.f45096k;
    }

    /* JADX INFO: renamed from: i */
    public static C14377g m15885i(C13806c c13806c, int i10) {
        C13806c c13806c2 = c13806c.f43625f;
        if (c13806c2 == null) {
            return null;
        }
        C13807d c13807d = c13806c2.f43623d;
        AbstractC14386p abstractC14386p = i10 == 0 ? c13807d.f43661d : c13807d.f43663e;
        int iM24h = AbstractC0010F.m24h(c13806c2.f43624e);
        if (iM24h == 1 || iM24h == 2) {
            return abstractC14386p.f45111h;
        }
        if (iM24h == 3 || iM24h == 4) {
            return abstractC14386p.f45112i;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m15886c(C14377g c14377g, C14377g c14377g2, int i10, C14378h c14378h) {
        c14377g.f45090l.add(c14377g2);
        c14377g.f45090l.add(this.f45108e);
        c14377g.f45086h = i10;
        c14377g.f45087i = c14378h;
        c14377g2.f45089k.add(c14377g);
        c14378h.f45089k.add(c14377g);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo15815d();

    /* JADX INFO: renamed from: e */
    public abstract void mo15816e();

    /* JADX INFO: renamed from: f */
    public abstract void mo15817f();

    /* JADX INFO: renamed from: g */
    public final int m15887g(int i10, int i11) {
        int iMax;
        if (i11 == 0) {
            C13807d c13807d = this.f45105b;
            int i12 = c13807d.f43694w;
            iMax = Math.max(c13807d.f43693v, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        } else {
            C13807d c13807d2 = this.f45105b;
            int i13 = c13807d2.f43697z;
            iMax = Math.max(c13807d2.f43696y, i10);
            if (i13 > 0) {
                iMax = Math.min(i13, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: j */
    public long mo15818j() {
        C14378h c14378h = this.f45108e;
        if (c14378h.f45088j) {
            return c14378h.f45085g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo15819k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX INFO: renamed from: l */
    public final void m15888l(C13806c c13806c, C13806c c13806c2, int i10) {
        C14378h c14378h;
        float f10;
        int i11;
        C14377g c14377gM15884h = m15884h(c13806c);
        C14377g c14377gM15884h2 = m15884h(c13806c2);
        if (c14377gM15884h.f45088j && c14377gM15884h2.f45088j) {
            int iM15346e = c13806c.m15346e() + c14377gM15884h.f45085g;
            int iM15346e2 = c14377gM15884h2.f45085g - c13806c2.m15346e();
            int i12 = iM15346e2 - iM15346e;
            C14378h c14378h2 = this.f45108e;
            if (!c14378h2.f45088j && this.f45107d == 3) {
                int i13 = this.f45104a;
                if (i13 == 0) {
                    c14378h2.mo15863d(m15887g(i12, i10));
                } else if (i13 == 1) {
                    c14378h2.mo15863d(Math.min(m15887g(c14378h2.f45091m, i10), i12));
                } else if (i13 == 2) {
                    C13807d c13807d = this.f45105b;
                    C13808e c13808e = c13807d.f43649U;
                    if (c13808e != null) {
                        C14378h c14378h3 = (i10 == 0 ? c13808e.f43661d : c13808e.f43663e).f45108e;
                        if (c14378h3.f45088j) {
                            c14378h2.mo15863d(m15887g((int) ((c14378h3.f45085g * (i10 == 0 ? c13807d.f43695x : c13807d.f43629A)) + 0.5f), i10));
                        }
                    }
                } else if (i13 == 3) {
                    C13807d c13807d2 = this.f45105b;
                    AbstractC14386p abstractC14386p = c13807d2.f43661d;
                    if (abstractC14386p.f45107d == 3 && abstractC14386p.f45104a == 3) {
                        C14384n c14384n = c13807d2.f43663e;
                        if (c14384n.f45107d != 3 || c14384n.f45104a != 3) {
                            if (i10 == 0) {
                                abstractC14386p = c13807d2.f43663e;
                            }
                            c14378h = abstractC14386p.f45108e;
                            if (c14378h.f45088j) {
                                f10 = c13807d2.f43652X;
                                if (i10 == 1) {
                                    i11 = (int) ((c14378h.f45085g / f10) + 0.5f);
                                } else {
                                    i11 = (int) ((f10 * c14378h.f45085g) + 0.5f);
                                }
                                c14378h2.mo15863d(i11);
                            }
                        }
                    } else {
                        if (i10 == 0) {
                            abstractC14386p = c13807d2.f43663e;
                        }
                        c14378h = abstractC14386p.f45108e;
                        if (c14378h.f45088j) {
                            f10 = c13807d2.f43652X;
                            if (i10 == 1) {
                                i11 = (int) ((c14378h.f45085g / f10) + 0.5f);
                            } else {
                                i11 = (int) ((f10 * c14378h.f45085g) + 0.5f);
                            }
                            c14378h2.mo15863d(i11);
                        }
                    }
                }
            }
            if (c14378h2.f45088j) {
                int i14 = c14378h2.f45085g;
                C14377g c14377g = this.f45112i;
                C14377g c14377g2 = this.f45111h;
                if (i14 == i12) {
                    c14377g2.mo15863d(iM15346e);
                    c14377g.mo15863d(iM15346e2);
                    return;
                }
                C13807d c13807d3 = this.f45105b;
                float f11 = i10 == 0 ? c13807d3.f43664e0 : c13807d3.f43666f0;
                if (c14377gM15884h == c14377gM15884h2) {
                    iM15346e = c14377gM15884h.f45085g;
                    iM15346e2 = c14377gM15884h2.f45085g;
                    f11 = 0.5f;
                }
                c14377g2.mo15863d((int) ((((iM15346e2 - iM15346e) - i14) * f11) + iM15346e + 0.5f));
                c14377g.mo15863d(c14377g2.f45085g + c14378h2.f45085g);
            }
        }
    }
}
