package p946pc;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p204I1.C3582M;
import p229J0.C4108p0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6037x;
import p382Pf.C6401d;
import p492U1.C7548m;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p571X9.AbstractC9119D4;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p867l8.C16831c;
import p911o0.C17767k0;
import p911o0.InterfaceC17763i0;
import p988rc.C18930r;

/* JADX INFO: renamed from: pc.G */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18322G {

    /* JADX INFO: renamed from: a */
    public static final C6037x f58489a = new C6037x(C18346l.f58571q0, C5975S.f19448r0);

    /* JADX INFO: renamed from: b */
    public static final long f58490b = AbstractC9119D4.m9650c(8);

    /* JADX INFO: renamed from: a */
    public static final void m19848a(C18321F c18321f, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        C18930r c18930r;
        C18320E c18320e = C18320E.f58479a;
        c6021p.m6526U(-1634189773);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6542f(c18320e) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= c6021p.m6542f(c18321f) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else if (c18321f == null) {
            c6021p.m6525T(1904236957);
            c8410b.invoke(c18320e, c6021p, Integer.valueOf(((i11 >> 3) & 112) | (i11 & 14)));
            c6021p.m6553p(false);
        } else {
            c6021p.m6525T(1904236983);
            C6037x c6037x = f58489a;
            C18321F c18321f2 = (C18321F) c6021p.m6548k(c6037x);
            AbstractC16544l.m18094g(c18321f2, "<this>");
            C7548m c7548m = c18321f.f58481a;
            if (c7548m == null) {
                c7548m = c18321f2.f58481a;
            }
            C7548m c7548m2 = c7548m;
            InterfaceC1439n interfaceC1439n = c18321f.f58482b;
            if (interfaceC1439n == null) {
                interfaceC1439n = c18321f2.f58482b;
            }
            InterfaceC1439n interfaceC1439n2 = interfaceC1439n;
            C18357w c18357w = c18321f.f58483c;
            if (c18357w == null) {
                c18357w = c18321f2.f58483c;
            }
            C18357w c18357w2 = c18357w;
            C18336b c18336b = c18321f.f58484d;
            if (c18336b == null) {
                c18336b = c18321f2.f58484d;
            }
            C18336b c18336b2 = c18336b;
            C18342h c18342h = c18321f.f58485e;
            if (c18342h == null) {
                c18342h = c18321f2.f58485e;
            }
            C18342h c18342h2 = c18342h;
            C18333S c18333s = c18321f.f58486f;
            if (c18333s == null) {
                c18333s = c18321f2.f58486f;
            }
            C18333S c18333s2 = c18333s;
            C18355u c18355u = c18321f.f58487g;
            if (c18355u == null) {
                c18355u = c18321f2.f58487g;
            }
            C18355u c18355u2 = c18355u;
            C18930r c18930r2 = c18321f.f58488h;
            C18930r c18930r3 = c18321f2.f58488h;
            if (c18930r3 != null) {
                if (c18930r2 != null) {
                    c18930r3 = new C18930r(C16831c.m18566c(c18930r3.f60397a, c18930r2.f60397a), C16831c.m18566c(c18930r3.f60398b, c18930r2.f60398b), C16831c.m18566c(c18930r3.f60399c, c18930r2.f60399c), C16831c.m18566c(c18930r3.f60400d, c18930r2.f60400d), C16831c.m18566c(c18930r3.f60401e, c18930r2.f60401e), C16831c.m18566c(c18930r3.f60402f, c18930r2.f60402f), C16831c.m18566c(c18930r3.f60403g, c18930r2.f60403g), C16831c.m18566c(c18930r3.f60404h, c18930r2.f60404h));
                }
                c18930r = c18930r3;
            } else {
                c18930r = c18930r2;
            }
            C5997d.m6440a(c6037x.mo6405a(new C18321F(c7548m2, interfaceC1439n2, c18357w2, c18336b2, c18342h2, c18333s2, c18355u2, c18930r)), AbstractC8411c.m8968b(-1349356393, c6021p, new C4108p0(c8410b, 16)), c6021p, 56);
            c6021p.m6553p(false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(c18321f, c8410b, i10, 27);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C18321F m19849b(C18320E c18320e, C6021p c6021p) {
        AbstractC16544l.m18094g(c18320e, "<this>");
        c6021p.m6525T(1277159346);
        C18321F c18321f = (C18321F) c6021p.m6548k(f58489a);
        c6021p.m6553p(false);
        return c18321f;
    }

    /* JADX INFO: renamed from: c */
    public static final C18321F m19850c(C18321F c18321f) {
        AbstractC16544l.m18094g(c18321f, "<this>");
        C7548m c7548m = c18321f.f58481a;
        C7548m c7548m2 = new C7548m(c7548m != null ? c7548m.f23910a : f58490b);
        InterfaceC1439n interfaceC1439n = c18321f.f58482b;
        if (interfaceC1439n == null) {
            interfaceC1439n = C18352r.f58596Z;
        }
        InterfaceC1439n interfaceC1439n2 = interfaceC1439n;
        C18357w c18357w = c18321f.f58483c;
        if (c18357w == null) {
            c18357w = C18357w.f58611f;
        }
        C18335a c18335a = AbstractC18351q.f58593d;
        C7548m c7548m3 = c18357w.f58612a;
        C7548m c7548m4 = new C7548m(c7548m3 != null ? c7548m3.f23910a : AbstractC18351q.f58590a);
        C7548m c7548m5 = c18357w.f58613b;
        C7548m c7548m6 = new C7548m(c7548m5 != null ? c7548m5.f23910a : AbstractC18351q.f58591b);
        C7548m c7548m7 = c18357w.f58614c;
        C7548m c7548m8 = new C7548m(c7548m7 != null ? c7548m7.f23910a : AbstractC18351q.f58592c);
        InterfaceC1436k interfaceC1436k = c18357w.f58615d;
        if (interfaceC1436k == null) {
            interfaceC1436k = AbstractC18351q.f58593d;
        }
        InterfaceC1436k interfaceC1436k2 = interfaceC1436k;
        InterfaceC1436k interfaceC1436k3 = c18357w.f58616e;
        if (interfaceC1436k3 == null) {
            interfaceC1436k3 = AbstractC18351q.f58594e;
        }
        C18357w c18357w2 = new C18357w(c7548m4, c7548m6, c7548m8, interfaceC1436k2, interfaceC1436k3);
        C18336b c18336b = c18321f.f58484d;
        if (c18336b == null) {
            c18336b = AbstractC18338d.f58540a;
        }
        C18336b c18336b2 = c18336b;
        C18342h c18342h = c18321f.f58485e;
        if (c18342h == null) {
            c18342h = C18342h.f58552e;
        }
        C3582M c3582m = AbstractC18341g.f58548a;
        C3582M c3582m2 = c18342h.f58553a;
        if (c3582m2 == null) {
            c3582m2 = AbstractC18341g.f58548a;
        }
        InterfaceC10459q interfaceC10459q = c18342h.f58554b;
        if (interfaceC10459q == null) {
            interfaceC10459q = AbstractC18341g.f58550c;
        }
        C7548m c7548m9 = c18342h.f58555c;
        C7548m c7548m10 = new C7548m(c7548m9 != null ? c7548m9.f23910a : AbstractC18341g.f58551d);
        Boolean bool = c18342h.f58556d;
        C18342h c18342h2 = new C18342h(c3582m2, interfaceC10459q, c7548m10, Boolean.valueOf(bool != null ? bool.booleanValue() : true));
        C18333S c18333s = c18321f.f58486f;
        if (c18333s == null) {
            c18333s = C18333S.f58519e;
        }
        C3582M c3582m3 = AbstractC18330O.f58513a;
        C3582M c3582m4 = c18333s.f58520a;
        if (c3582m4 == null) {
            c3582m4 = AbstractC18330O.f58513a;
        }
        C7548m c7548m11 = c18333s.f58521b;
        C7548m c7548m12 = new C7548m(c7548m11 != null ? c7548m11.f23910a : AbstractC18330O.f58514b);
        C14365u c14365u = c18333s.f58522c;
        C14365u c14365u2 = new C14365u(c14365u != null ? c14365u.f45062a : AbstractC18330O.f58515c);
        Float f10 = c18333s.f58523d;
        C18333S c18333s2 = new C18333S(c3582m4, c7548m12, c14365u2, Float.valueOf(f10 != null ? f10.floatValue() : 1.0f));
        C18355u c18355u = c18321f.f58487g;
        if (c18355u == null) {
            c18355u = C18355u.f58606d;
        }
        C17767k0 c17767k0 = AbstractC18354t.f58603a;
        InterfaceC17763i0 interfaceC17763i0 = c18355u.f58607a;
        if (interfaceC17763i0 == null) {
            interfaceC17763i0 = AbstractC18354t.f58603a;
        }
        InterfaceC1440o interfaceC1440o = c18355u.f58608b;
        if (interfaceC1440o == null) {
            interfaceC1440o = AbstractC18354t.f58604b;
        }
        InterfaceC1440o interfaceC1440o2 = c18355u.f58609c;
        if (interfaceC1440o2 == null) {
            interfaceC1440o2 = AbstractC18354t.f58605c;
        }
        C18355u c18355u2 = new C18355u(interfaceC17763i0, interfaceC1440o, interfaceC1440o2);
        C18930r c18930r = c18321f.f58488h;
        if (c18930r == null) {
            c18930r = C18930r.f60396i;
        }
        return new C18321F(c7548m2, interfaceC1439n2, c18357w2, c18336b2, c18342h2, c18333s2, c18355u2, c18930r.m20272a());
    }
}
