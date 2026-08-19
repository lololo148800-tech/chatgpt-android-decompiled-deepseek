package p544W9;

import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p006A4.C0350k;
import p017Af.C0492w;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p045Bj.C1307e;
import p1014t1.AbstractC19744u;
import p1014t1.C19738o;
import p1030u1.C20097d;
import p153Fn.C2925c;
import p321Mk.C5466d;
import p321Mk.C5470h;
import p321Mk.C5471i;
import p321Mk.C5472j;
import p321Mk.C5476n;
import p321Mk.EnumC5477o;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.InterfaceC5985X;
import p492U1.C7550o;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8079e5;
import p571X9.AbstractC9125E4;
import p635a1.InterfaceC10459q;
import p658b5.C11238i;
import p759g1.C13801c;
import p911o0.InterfaceC17763i0;
import p953q0.AbstractC18551I;

/* JADX INFO: renamed from: W9.H3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8489H3 {
    /* JADX INFO: renamed from: a */
    public static final void m9143a(InterfaceC10459q interfaceC10459q, C11238i c11238i, InterfaceC17763i0 interfaceC17763i0, EnumC5477o enumC5477o, C1307e c1307e, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-925251078);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= c6021p.m6542f(c11238i) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c6021p.m6542f(interfaceC17763i0) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c6021p.m6542f(enumC5477o) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= c6021p.m6545h(c1307e) ? 16384 : 8192;
        }
        if ((i11 & 46811) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6519N();
            int i12 = i10 & 1;
            C5975S c5975s = C6013l.f19514a;
            if (i12 != 0 && !c6021p.m6561x()) {
                c6021p.m6517L();
            }
            c6021p.m6554q();
            c6021p.m6525T(773894976);
            c6021p.m6525T(-492369756);
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == c5975s) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            c6021p.m6553p(false);
            C2925c c2925c = ((C6035w) objM6514H).f19668Y;
            c6021p.m6553p(false);
            c6021p.m6525T(266535486);
            EnumC7546k enumC7546k = (EnumC7546k) c6021p.m6548k(AbstractC0187M0.f710l);
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            C13801c c13801c = new C13801c(interfaceC7537b.mo7864b0(interfaceC17763i0.mo19474c(enumC7546k)), interfaceC7537b.mo7864b0(interfaceC17763i0.mo19475d()), interfaceC7537b.mo7864b0(interfaceC17763i0.mo19472a(enumC7546k)), interfaceC7537b.mo7864b0(interfaceC17763i0.mo19473b()));
            c6021p.m6553p(false);
            c6021p.m6525T(-207387068);
            C5476n c5476n = new C5476n();
            c1307e.invoke(c5476n);
            C5466d c5466d = new C5466d(c5476n.f17883b);
            c6021p.m6553p(false);
            c6021p.m6525T(1383608144);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = C5997d.m6430Q(null, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC18551I.m19921b(c5466d, AbstractC19744u.m20694b(AbstractC8079e5.m8502b(interfaceC10459q), C17296C.f55119a, new C5470h(enumC5477o, c11238i, null)), null, new C0350k(c11238i, c5466d, c13801c, c2925c, (InterfaceC5985X) objM6514H2, 6), c6021p, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(interfaceC10459q, c11238i, interfaceC17763i0, enumC5477o, c1307e, i10, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9144b(C11238i c11238i, C19738o c19738o, long j10, C20097d c20097d, InterfaceC0571F interfaceC0571F) {
        c19738o.m20691a();
        c20097d.m20928a(c19738o.f62479b, c19738o.f62480c);
        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C5471i(c11238i, j10, null), 3);
    }

    /* JADX INFO: renamed from: c */
    public static final void m9145c(C11238i c11238i, C20097d c20097d, EnumC5477o enumC5477o, InterfaceC0571F interfaceC0571F) {
        long jM7900a;
        C16524A c16524a = new C16524A();
        c16524a.f51261Y = c20097d.m20929b(AbstractC9125E4.m9659a(Float.MAX_VALUE, Float.MAX_VALUE));
        int iOrdinal = enumC5477o.ordinal();
        if (iOrdinal == 0) {
            jM7900a = c16524a.f51261Y;
        } else if (iOrdinal == 1) {
            jM7900a = C7550o.m7900a(C7550o.m7902c(c16524a.f51261Y), 0.0f);
        } else {
            if (iOrdinal != 2) {
                throw new C0644w();
            }
            jM7900a = C7550o.m7900a(0.0f, C7550o.m7903d(c16524a.f51261Y));
        }
        c16524a.f51261Y = jM7900a;
        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C5472j(c11238i, c16524a, null), 3);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9146d(Double d10, boolean z6) {
        if (d10 == null) {
            return z6;
        }
        return !d10.isNaN() && d10.doubleValue() >= 0.0d && d10.doubleValue() <= 1.0d;
    }
}
