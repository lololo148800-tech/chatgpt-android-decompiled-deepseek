package p775h2;

import java.util.ArrayList;
import java.util.HashSet;
import p760g2.AbstractC13812i;
import p760g2.C13806c;
import p760g2.C13807d;
import p760g2.C13808e;
import p760g2.C13811h;

/* JADX INFO: renamed from: h2.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14379i {

    /* JADX INFO: renamed from: a */
    public static final C14372b f45092a = new C14372b();

    /* JADX INFO: renamed from: a */
    public static boolean m15864a(C13807d c13807d) {
        int[] iArr = c13807d.f43688q0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        C13808e c13808e = c13807d.f43649U;
        if (c13808e == null) {
            c13808e = null;
        }
        if (c13808e != null) {
            int i12 = c13808e.f43688q0[0];
        }
        if (c13808e != null) {
            int i13 = c13808e.f43688q0[1];
        }
        boolean z6 = i10 == 1 || c13807d.mo15336B() || i10 == 2 || (i10 == 3 && c13807d.f43690s == 0 && c13807d.f43652X == 0.0f && c13807d.m15390u(0)) || (i10 == 3 && c13807d.f43690s == 1 && c13807d.m15391v(0, c13807d.m15387r()));
        boolean z10 = i11 == 1 || c13807d.mo15337C() || i11 == 2 || (i11 == 3 && c13807d.f43691t == 0 && c13807d.f43652X == 0.0f && c13807d.m15390u(1)) || (i11 == 3 && c13807d.f43691t == 1 && c13807d.m15391v(1, c13807d.m15383l()));
        if (c13807d.f43652X <= 0.0f || !(z6 || z10)) {
            return z6 && z10;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static C14385o m15865b(C13807d c13807d, int i10, ArrayList arrayList, C14385o c14385o) {
        int i11;
        int i12 = i10 == 0 ? c13807d.f43684o0 : c13807d.f43686p0;
        if (i12 != -1 && (c14385o == null || i12 != c14385o.f45100b)) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                C14385o c14385o2 = (C14385o) arrayList.get(i13);
                if (c14385o2.f45100b == i12) {
                    if (c14385o != null) {
                        c14385o.m15882c(i10, c14385o2);
                        arrayList.remove(c14385o);
                    }
                    c14385o = c14385o2;
                    break;
                }
            }
        } else if (i12 != -1) {
            return c14385o;
        }
        if (c14385o == null) {
            if (c13807d instanceof AbstractC13812i) {
                AbstractC13812i abstractC13812i = (AbstractC13812i) c13807d;
                int i14 = 0;
                while (true) {
                    if (i14 >= abstractC13812i.f43781s0) {
                        i11 = -1;
                        break;
                    }
                    C13807d c13807d2 = abstractC13812i.f43780r0[i14];
                    if ((i10 == 0 && (i11 = c13807d2.f43684o0) != -1) || (i10 == 1 && (i11 = c13807d2.f43686p0) != -1)) {
                        break;
                    }
                    i14++;
                }
                if (i11 != -1) {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        C14385o c14385o3 = (C14385o) arrayList.get(i15);
                        if (c14385o3.f45100b == i11) {
                            c14385o = c14385o3;
                            break;
                        }
                    }
                }
            }
            if (c14385o == null) {
                c14385o = new C14385o();
                c14385o.f45099a = new ArrayList();
                c14385o.f45102d = null;
                c14385o.f45103e = -1;
                int i16 = C14385o.f45098f;
                C14385o.f45098f = i16 + 1;
                c14385o.f45100b = i16;
                c14385o.f45101c = i10;
            }
            arrayList.add(c14385o);
        }
        ArrayList arrayList2 = c14385o.f45099a;
        if (!arrayList2.contains(c13807d)) {
            arrayList2.add(c13807d);
            if (c13807d instanceof C13811h) {
                C13811h c13811h = (C13811h) c13807d;
                c13811h.f43777u0.m15344c(c13811h.f43778v0 == 0 ? 1 : 0, c14385o, arrayList);
            }
            int i17 = c14385o.f45100b;
            if (i10 == 0) {
                c13807d.f43684o0 = i17;
                c13807d.f43638J.m15344c(i10, c14385o, arrayList);
                c13807d.f43640L.m15344c(i10, c14385o, arrayList);
            } else {
                c13807d.f43686p0 = i17;
                c13807d.f43639K.m15344c(i10, c14385o, arrayList);
                c13807d.f43642N.m15344c(i10, c14385o, arrayList);
                c13807d.f43641M.m15344c(i10, c14385o, arrayList);
            }
            c13807d.f43645Q.m15344c(i10, c14385o, arrayList);
        }
        return c14385o;
    }

    /* JADX INFO: renamed from: c */
    public static void m15866c(int i10, C13807d c13807d, InterfaceC14373c interfaceC14373c, boolean z6) {
        C13806c c13806c;
        C13806c c13806c2;
        C13806c c13806c3;
        C13806c c13806c4;
        if (c13807d.f43681n) {
            return;
        }
        if (!(c13807d instanceof C13808e) && c13807d.m15358A() && m15864a(c13807d)) {
            C13808e.m15396Z(c13807d, interfaceC14373c, new C14372b());
        }
        C13806c c13806cMo15381j = c13807d.mo15381j(2);
        C13806c c13806cMo15381j2 = c13807d.mo15381j(4);
        int iM15345d = c13806cMo15381j.m15345d();
        int iM15345d2 = c13806cMo15381j2.m15345d();
        HashSet<C13806c> hashSet = c13806cMo15381j.f43620a;
        char c9 = 0;
        if (hashSet != null && c13806cMo15381j.f43622c) {
            for (C13806c c13806c5 : hashSet) {
                C13807d c13807d2 = c13806c5.f43623d;
                int i11 = i10 + 1;
                boolean zM15864a = m15864a(c13807d2);
                if (c13807d2.m15358A() && zM15864a) {
                    C13808e.m15396Z(c13807d2, interfaceC14373c, new C14372b());
                }
                C13806c c13806c6 = c13807d2.f43638J;
                C13806c c13806c7 = c13807d2.f43640L;
                char c10 = ((c13806c5 == c13806c6 && (c13806c4 = c13806c7.f43625f) != null && c13806c4.f43622c) || (c13806c5 == c13806c7 && (c13806c3 = c13806c6.f43625f) != null && c13806c3.f43622c)) ? (char) 1 : c9;
                int i12 = c13807d2.f43688q0[c9];
                if (i12 != 3 || zM15864a) {
                    if (!c13807d2.m15358A()) {
                        if (c13806c5 == c13806c6 && c13806c7.f43625f == null) {
                            int iM15346e = c13806c6.m15346e() + iM15345d;
                            c13807d2.m15364K(iM15346e, c13807d2.m15387r() + iM15346e);
                            m15866c(i11, c13807d2, interfaceC14373c, z6);
                        } else if (c13806c5 == c13806c7 && c13806c6.f43625f == null) {
                            int iM15346e2 = iM15345d - c13806c7.m15346e();
                            c13807d2.m15364K(iM15346e2 - c13807d2.m15387r(), iM15346e2);
                            m15866c(i11, c13807d2, interfaceC14373c, z6);
                        } else if (c10 != 0 && !c13807d2.m15394y()) {
                            m15867d(i11, c13807d2, interfaceC14373c, z6);
                        }
                    }
                } else if (i12 == 3 && c13807d2.f43694w >= 0 && c13807d2.f43693v >= 0 && ((c13807d2.f43670h0 == 8 || (c13807d2.f43690s == 0 && c13807d2.f43652X == 0.0f)) && !c13807d2.m15394y() && !c13807d2.f43635G && c10 != 0 && !c13807d2.m15394y())) {
                    m15868e(i11, c13807d, interfaceC14373c, c13807d2, z6);
                }
                c9 = 0;
            }
        }
        if (c13807d instanceof C13811h) {
            return;
        }
        HashSet<C13806c> hashSet2 = c13806cMo15381j2.f43620a;
        if (hashSet2 != null && c13806cMo15381j2.f43622c) {
            for (C13806c c13806c8 : hashSet2) {
                C13807d c13807d3 = c13806c8.f43623d;
                int i13 = i10 + 1;
                boolean zM15864a2 = m15864a(c13807d3);
                if (c13807d3.m15358A() && zM15864a2) {
                    C13808e.m15396Z(c13807d3, interfaceC14373c, new C14372b());
                }
                C13806c c13806c9 = c13807d3.f43638J;
                C13806c c13806c10 = c13807d3.f43640L;
                boolean z10 = (c13806c8 == c13806c9 && (c13806c2 = c13806c10.f43625f) != null && c13806c2.f43622c) || (c13806c8 == c13806c10 && (c13806c = c13806c9.f43625f) != null && c13806c.f43622c);
                int i14 = c13807d3.f43688q0[0];
                if (i14 != 3 || zM15864a2) {
                    if (!c13807d3.m15358A()) {
                        if (c13806c8 == c13806c9 && c13806c10.f43625f == null) {
                            int iM15346e3 = c13806c9.m15346e() + iM15345d2;
                            c13807d3.m15364K(iM15346e3, c13807d3.m15387r() + iM15346e3);
                            m15866c(i13, c13807d3, interfaceC14373c, z6);
                        } else if (c13806c8 == c13806c10 && c13806c9.f43625f == null) {
                            int iM15346e4 = iM15345d2 - c13806c10.m15346e();
                            c13807d3.m15364K(iM15346e4 - c13807d3.m15387r(), iM15346e4);
                            m15866c(i13, c13807d3, interfaceC14373c, z6);
                        } else if (z10 && !c13807d3.m15394y()) {
                            m15867d(i13, c13807d3, interfaceC14373c, z6);
                        }
                    }
                } else if (i14 == 3 && c13807d3.f43694w >= 0 && c13807d3.f43693v >= 0) {
                    if (c13807d3.f43670h0 != 8) {
                        if (c13807d3.f43690s == 0) {
                            if (c13807d3.f43652X == 0.0f) {
                            }
                        }
                    }
                    if (!c13807d3.m15394y() && !c13807d3.f43635G && z10 && !c13807d3.m15394y()) {
                        m15868e(i13, c13807d, interfaceC14373c, c13807d3, z6);
                    }
                }
            }
        }
        c13807d.f43681n = true;
    }

    /* JADX INFO: renamed from: d */
    public static void m15867d(int i10, C13807d c13807d, InterfaceC14373c interfaceC14373c, boolean z6) {
        float f10 = c13807d.f43664e0;
        C13806c c13806c = c13807d.f43638J;
        int iM15345d = c13806c.f43625f.m15345d();
        C13806c c13806c2 = c13807d.f43640L;
        int iM15345d2 = c13806c2.f43625f.m15345d();
        int iM15346e = c13806c.m15346e() + iM15345d;
        int iM15346e2 = iM15345d2 - c13806c2.m15346e();
        if (iM15345d == iM15345d2) {
            f10 = 0.5f;
        } else {
            iM15345d = iM15346e;
            iM15345d2 = iM15346e2;
        }
        int iM15387r = c13807d.m15387r();
        int i11 = (iM15345d2 - iM15345d) - iM15387r;
        if (iM15345d > iM15345d2) {
            i11 = (iM15345d - iM15345d2) - iM15387r;
        }
        int i12 = ((int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11)) + iM15345d;
        int i13 = i12 + iM15387r;
        if (iM15345d > iM15345d2) {
            i13 = i12 - iM15387r;
        }
        c13807d.m15364K(i12, i13);
        m15866c(i10 + 1, c13807d, interfaceC14373c, z6);
    }

    /* JADX INFO: renamed from: e */
    public static void m15868e(int i10, C13807d c13807d, InterfaceC14373c interfaceC14373c, C13807d c13807d2, boolean z6) {
        float f10 = c13807d2.f43664e0;
        C13806c c13806c = c13807d2.f43638J;
        int iM15346e = c13806c.m15346e() + c13806c.f43625f.m15345d();
        C13806c c13806c2 = c13807d2.f43640L;
        int iM15345d = c13806c2.f43625f.m15345d() - c13806c2.m15346e();
        if (iM15345d >= iM15346e) {
            int iM15387r = c13807d2.m15387r();
            if (c13807d2.f43670h0 != 8) {
                int i11 = c13807d2.f43690s;
                if (i11 == 2) {
                    iM15387r = (int) (c13807d2.f43664e0 * 0.5f * (c13807d instanceof C13808e ? c13807d.m15387r() : c13807d.f43649U.m15387r()));
                } else if (i11 == 0) {
                    iM15387r = iM15345d - iM15346e;
                }
                iM15387r = Math.max(c13807d2.f43693v, iM15387r);
                int i12 = c13807d2.f43694w;
                if (i12 > 0) {
                    iM15387r = Math.min(i12, iM15387r);
                }
            }
            int i13 = iM15346e + ((int) ((f10 * ((iM15345d - iM15346e) - iM15387r)) + 0.5f));
            c13807d2.m15364K(i13, iM15387r + i13);
            m15866c(i10 + 1, c13807d2, interfaceC14373c, z6);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m15869f(int i10, C13807d c13807d, InterfaceC14373c interfaceC14373c) {
        float f10 = c13807d.f43666f0;
        C13806c c13806c = c13807d.f43639K;
        int iM15345d = c13806c.f43625f.m15345d();
        C13806c c13806c2 = c13807d.f43641M;
        int iM15345d2 = c13806c2.f43625f.m15345d();
        int iM15346e = c13806c.m15346e() + iM15345d;
        int iM15346e2 = iM15345d2 - c13806c2.m15346e();
        if (iM15345d == iM15345d2) {
            f10 = 0.5f;
        } else {
            iM15345d = iM15346e;
            iM15345d2 = iM15346e2;
        }
        int iM15383l = c13807d.m15383l();
        int i11 = (iM15345d2 - iM15345d) - iM15383l;
        if (iM15345d > iM15345d2) {
            i11 = (iM15345d - iM15345d2) - iM15383l;
        }
        int i12 = (int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11);
        int i13 = iM15345d + i12;
        int i14 = i13 + iM15383l;
        if (iM15345d > iM15345d2) {
            i13 = iM15345d - i12;
            i14 = i13 - iM15383l;
        }
        c13807d.m15365L(i13, i14);
        m15872i(i10 + 1, c13807d, interfaceC14373c);
    }

    /* JADX INFO: renamed from: g */
    public static void m15870g(int i10, C13807d c13807d, InterfaceC14373c interfaceC14373c, C13807d c13807d2) {
        float f10 = c13807d2.f43666f0;
        C13806c c13806c = c13807d2.f43639K;
        int iM15346e = c13806c.m15346e() + c13806c.f43625f.m15345d();
        C13806c c13806c2 = c13807d2.f43641M;
        int iM15345d = c13806c2.f43625f.m15345d() - c13806c2.m15346e();
        if (iM15345d >= iM15346e) {
            int iM15383l = c13807d2.m15383l();
            if (c13807d2.f43670h0 != 8) {
                int i11 = c13807d2.f43691t;
                if (i11 == 2) {
                    iM15383l = (int) (f10 * 0.5f * (c13807d instanceof C13808e ? c13807d.m15383l() : c13807d.f43649U.m15383l()));
                } else if (i11 == 0) {
                    iM15383l = iM15345d - iM15346e;
                }
                iM15383l = Math.max(c13807d2.f43696y, iM15383l);
                int i12 = c13807d2.f43697z;
                if (i12 > 0) {
                    iM15383l = Math.min(i12, iM15383l);
                }
            }
            int i13 = iM15346e + ((int) ((f10 * ((iM15345d - iM15346e) - iM15383l)) + 0.5f));
            c13807d2.m15365L(i13, iM15383l + i13);
            m15872i(i10 + 1, c13807d2, interfaceC14373c);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m15871h(int i10, int i11, int i12, int i13) {
        return (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2)) || (i13 == 1 || i13 == 2 || (i13 == 4 && i11 != 2));
    }

    /* JADX INFO: renamed from: i */
    public static void m15872i(int i10, C13807d c13807d, InterfaceC14373c interfaceC14373c) {
        C13806c c13806c;
        C13806c c13806c2;
        C13806c c13806c3;
        C13806c c13806c4;
        C13806c c13806c5;
        if (c13807d.f43683o) {
            return;
        }
        if (!(c13807d instanceof C13808e) && c13807d.m15358A() && m15864a(c13807d)) {
            C13808e.m15396Z(c13807d, interfaceC14373c, new C14372b());
        }
        C13806c c13806cMo15381j = c13807d.mo15381j(3);
        C13806c c13806cMo15381j2 = c13807d.mo15381j(5);
        int iM15345d = c13806cMo15381j.m15345d();
        int iM15345d2 = c13806cMo15381j2.m15345d();
        HashSet<C13806c> hashSet = c13806cMo15381j.f43620a;
        if (hashSet != null && c13806cMo15381j.f43622c) {
            for (C13806c c13806c6 : hashSet) {
                C13807d c13807d2 = c13806c6.f43623d;
                int i11 = i10 + 1;
                boolean zM15864a = m15864a(c13807d2);
                if (c13807d2.m15358A() && zM15864a) {
                    C13808e.m15396Z(c13807d2, interfaceC14373c, new C14372b());
                }
                C13806c c13806c7 = c13807d2.f43639K;
                C13806c c13806c8 = c13807d2.f43641M;
                boolean z6 = (c13806c6 == c13806c7 && (c13806c5 = c13806c8.f43625f) != null && c13806c5.f43622c) || (c13806c6 == c13806c8 && (c13806c4 = c13806c7.f43625f) != null && c13806c4.f43622c);
                int i12 = c13807d2.f43688q0[1];
                if (i12 != 3 || zM15864a) {
                    if (!c13807d2.m15358A()) {
                        if (c13806c6 == c13806c7 && c13806c8.f43625f == null) {
                            int iM15346e = c13806c7.m15346e() + iM15345d;
                            c13807d2.m15365L(iM15346e, c13807d2.m15383l() + iM15346e);
                            m15872i(i11, c13807d2, interfaceC14373c);
                        } else if (c13806c6 == c13806c8 && c13806c7.f43625f == null) {
                            int iM15346e2 = iM15345d - c13806c8.m15346e();
                            c13807d2.m15365L(iM15346e2 - c13807d2.m15383l(), iM15346e2);
                            m15872i(i11, c13807d2, interfaceC14373c);
                        } else if (z6 && !c13807d2.m15395z()) {
                            m15869f(i11, c13807d2, interfaceC14373c);
                        }
                    }
                } else if (i12 == 3 && c13807d2.f43697z >= 0 && c13807d2.f43696y >= 0 && (c13807d2.f43670h0 == 8 || (c13807d2.f43691t == 0 && c13807d2.f43652X == 0.0f))) {
                    if (!c13807d2.m15395z() && !c13807d2.f43635G && z6 && !c13807d2.m15395z()) {
                        m15870g(i11, c13807d, interfaceC14373c, c13807d2);
                    }
                }
            }
        }
        if (c13807d instanceof C13811h) {
            return;
        }
        HashSet<C13806c> hashSet2 = c13806cMo15381j2.f43620a;
        if (hashSet2 != null && c13806cMo15381j2.f43622c) {
            for (C13806c c13806c9 : hashSet2) {
                C13807d c13807d3 = c13806c9.f43623d;
                int i13 = i10 + 1;
                boolean zM15864a2 = m15864a(c13807d3);
                if (c13807d3.m15358A() && zM15864a2) {
                    C13808e.m15396Z(c13807d3, interfaceC14373c, new C14372b());
                }
                C13806c c13806c10 = c13807d3.f43639K;
                C13806c c13806c11 = c13807d3.f43641M;
                boolean z10 = (c13806c9 == c13806c10 && (c13806c3 = c13806c11.f43625f) != null && c13806c3.f43622c) || (c13806c9 == c13806c11 && (c13806c2 = c13806c10.f43625f) != null && c13806c2.f43622c);
                int i14 = c13807d3.f43688q0[1];
                if (i14 != 3 || zM15864a2) {
                    if (!c13807d3.m15358A()) {
                        if (c13806c9 == c13806c10 && c13806c11.f43625f == null) {
                            int iM15346e3 = c13806c10.m15346e() + iM15345d2;
                            c13807d3.m15365L(iM15346e3, c13807d3.m15383l() + iM15346e3);
                            m15872i(i13, c13807d3, interfaceC14373c);
                        } else if (c13806c9 == c13806c11 && c13806c10.f43625f == null) {
                            int iM15346e4 = iM15345d2 - c13806c11.m15346e();
                            c13807d3.m15365L(iM15346e4 - c13807d3.m15383l(), iM15346e4);
                            m15872i(i13, c13807d3, interfaceC14373c);
                        } else if (z10 && !c13807d3.m15395z()) {
                            m15869f(i13, c13807d3, interfaceC14373c);
                        }
                    }
                } else if (i14 == 3 && c13807d3.f43697z >= 0 && c13807d3.f43696y >= 0) {
                    if (c13807d3.f43670h0 != 8) {
                        if (c13807d3.f43691t == 0) {
                            if (c13807d3.f43652X == 0.0f) {
                            }
                        }
                    }
                    if (!c13807d3.m15395z() && !c13807d3.f43635G && z10 && !c13807d3.m15395z()) {
                        m15870g(i13, c13807d, interfaceC14373c, c13807d3);
                    }
                }
            }
        }
        C13806c c13806cMo15381j3 = c13807d.mo15381j(6);
        if (c13806cMo15381j3.f43620a != null && c13806cMo15381j3.f43622c) {
            int iM15345d3 = c13806cMo15381j3.m15345d();
            for (C13806c c13806c12 : c13806cMo15381j3.f43620a) {
                C13807d c13807d4 = c13806c12.f43623d;
                int i15 = i10 + 1;
                boolean zM15864a3 = m15864a(c13807d4);
                if (c13807d4.m15358A() && zM15864a3) {
                    C13808e.m15396Z(c13807d4, interfaceC14373c, new C14372b());
                }
                if (c13807d4.f43688q0[1] != 3 || zM15864a3) {
                    if (!c13807d4.m15358A() && c13806c12 == (c13806c = c13807d4.f43642N)) {
                        int iM15346e5 = c13806c12.m15346e() + iM15345d3;
                        if (c13807d4.f43634F) {
                            int i16 = iM15346e5 - c13807d4.f43658b0;
                            int i17 = c13807d4.f43651W + i16;
                            c13807d4.f43656a0 = i16;
                            c13807d4.f43639K.m15353l(i16);
                            c13807d4.f43641M.m15353l(i17);
                            c13806c.m15353l(iM15346e5);
                            c13807d4.f43679m = true;
                        }
                        m15872i(i15, c13807d4, interfaceC14373c);
                    }
                }
            }
        }
        c13807d.f43683o = true;
    }
}
