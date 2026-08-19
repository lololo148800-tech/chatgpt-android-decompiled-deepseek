package p1140z1;

import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.C0150A;
import p025An.C0644w;
import p045Bj.C1313k;
import p1036u9.C20168n;
import p392Q0.C6546d;
import p492U1.C7536a;
import p523V9.AbstractC8111i5;
import p582Xk.HXHG.bQBnquXS;
import p635a1.AbstractC10458p;
import p658b5.C11241l;
import p774h1.C14336N;
import sk.C19665d;

/* JADX INFO: renamed from: z1.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C21671Q {

    /* JADX INFO: renamed from: a */
    public final C21658D f68771a;

    /* JADX INFO: renamed from: c */
    public boolean f68773c;

    /* JADX INFO: renamed from: d */
    public boolean f68774d;

    /* JADX INFO: renamed from: i */
    public C7536a f68779i;

    /* JADX INFO: renamed from: b */
    public final C11241l f68772b = new C11241l(20);

    /* JADX INFO: renamed from: e */
    public final C20168n f68775e = new C20168n();

    /* JADX INFO: renamed from: f */
    public final C6546d f68776f = new C6546d(new C21658D[16]);

    /* JADX INFO: renamed from: g */
    public final long f68777g = 1;

    /* JADX INFO: renamed from: h */
    public final C6546d f68778h = new C6546d(new C21670P[16]);

    public C21671Q(C21658D c21658d) {
        this.f68771a = c21658d;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m22132b(C21658D c21658d, C7536a c7536a) {
        if (c21658d.f68652o0 == null) {
            return false;
        }
        boolean zM22028Z = c7536a != null ? c21658d.m22028Z(c7536a) : C21658D.m21998a0(c21658d);
        C21658D c21658dM22009G = c21658d.m22009G();
        if (zM22028Z && c21658dM22009G != null) {
            if (c21658dM22009G.f68652o0 == null) {
                C21658D.m22001s0(c21658dM22009G, false, 3);
            } else if (c21658d.m22006D() == 1) {
                C21658D.m22000q0(c21658dM22009G, false, 3);
            } else if (c21658d.m22006D() == 2) {
                c21658dM22009G.m22055p0(false);
            }
        }
        return zM22028Z;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m22133c(C21658D c21658d, C7536a c7536a) {
        boolean zM22046k0 = c7536a != null ? c21658d.m22046k0(c7536a) : C21658D.m21999l0(c21658d);
        C21658D c21658dM22009G = c21658d.m22009G();
        if (zM22046k0 && c21658dM22009G != null) {
            if (c21658d.m22005C() == 1) {
                C21658D.m22001s0(c21658dM22009G, false, 3);
            } else if (c21658d.m22005C() == 2) {
                c21658dM22009G.m22058r0(false);
            }
        }
        return zM22046k0;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m22134h(C21658D c21658d) {
        return c21658d.m22005C() == 1 || c21658d.m22060t().f68746r.f68706G0.m22076e();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m22135i(C21658D c21658d) {
        C21659E c21659e;
        if (c21658d.m22006D() == 1) {
            return true;
        }
        C21663I c21663i = c21658d.m22060t().f68747s;
        return (c21663i == null || (c21659e = c21663i.f68683D0) == null || !c21659e.m22076e()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m22136a(boolean z6) {
        Object[] objArr;
        C20168n c20168n = this.f68775e;
        if (z6) {
            C6546d c6546d = (C6546d) c20168n.f63875Z;
            c6546d.m7104i();
            C21658D c21658d = this.f68771a;
            c6546d.m7099c(c21658d);
            c21658d.f68646Q0 = true;
        }
        C21685c0 c21685c0 = C21685c0.f68829Z;
        C6546d c6546d2 = (C6546d) c20168n.f63875Z;
        c6546d2.m7113r(c21685c0);
        int i10 = c6546d2.f21184o0;
        C21658D[] c21658dArr = (C21658D[]) c20168n.f63876o0;
        if (c21658dArr == null || c21658dArr.length < i10) {
            objArr = c21658dArr;
            objArr = new C21658D[Math.max(16, i10)];
        }
        objArr = c21658dArr;
        c20168n.f63876o0 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c6546d2.f21182Y[i11];
        }
        c6546d2.m7104i();
        for (int i12 = i10 - 1; -1 < i12; i12--) {
            C21658D c21658d2 = objArr[i12];
            AbstractC16544l.m18091d(c21658d2);
            if (c21658d2.f68646Q0) {
                C20168n.m20986f(c21658d2);
            }
        }
        c20168n.f63876o0 = objArr;
    }

    /* JADX INFO: renamed from: d */
    public final void m22137d() {
        C6546d c6546d = this.f68778h;
        if (c6546d.m7109n()) {
            int i10 = c6546d.f21184o0;
            if (i10 > 0) {
                Object[] objArr = c6546d.f21182Y;
                int i11 = 0;
                do {
                    C21670P c21670p = (C21670P) objArr[i11];
                    if (c21670p.f68768a.m22024V()) {
                        boolean z6 = c21670p.f68769b;
                        boolean z10 = c21670p.f68770c;
                        C21658D c21658d = c21670p.f68768a;
                        if (z6) {
                            C21658D.m22000q0(c21658d, z10, 2);
                        } else {
                            C21658D.m22001s0(c21658d, z10, 2);
                        }
                    }
                    i11++;
                } while (i11 < i10);
            }
            c6546d.m7104i();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m22138e(C21658D c21658d) {
        C6546d c6546dM22014L = c21658d.m22014L();
        int i10 = c6546dM22014L.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                C21658D c21658d2 = (C21658D) objArr[i11];
                if (AbstractC16544l.m18089b(c21658d2.m22027Y(), Boolean.TRUE) && !c21658d2.f68647R0) {
                    if (this.f68772b.m12585A(c21658d2, true)) {
                        c21658d2.m22029b0();
                    }
                    m22138e(c21658d2);
                }
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m22139f(C21658D c21658d, boolean z6) {
        C11241l c11241l = this.f68772b;
        if (((C21709o0) ((C19665d) (z6 ? c11241l.f34016Y : c11241l.f34017Z)).f62330o0).isEmpty()) {
            return;
        }
        if (!this.f68773c) {
            AbstractC8111i5.m8592c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw null;
        }
        if (z6 ? c21658d.m22068y() : c21658d.m22004B()) {
            AbstractC8111i5.m8591b("node not yet measured");
            throw null;
        }
        m22140g(c21658d, z6);
    }

    /* JADX INFO: renamed from: g */
    public final void m22140g(C21658D c21658d, boolean z6) {
        C6546d c6546dM22014L = c21658d.m22014L();
        int i10 = c6546dM22014L.f21184o0;
        C11241l c11241l = this.f68772b;
        if (i10 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                C21658D c21658d2 = (C21658D) objArr[i11];
                if ((!z6 && m22134h(c21658d2)) || (z6 && m22135i(c21658d2))) {
                    if (AbstractC21690f.m22213r(c21658d2) && !z6) {
                        if (c21658d2.m22068y() && c11241l.m12585A(c21658d2, true)) {
                            m22144m(c21658d2, true, false);
                        } else {
                            m22139f(c21658d2, true);
                        }
                    }
                    if ((z6 ? c21658d2.m22068y() : c21658d2.m22004B()) && c11241l.m12585A(c21658d2, z6)) {
                        m22144m(c21658d2, z6, false);
                    }
                    if (!(z6 ? c21658d2.m22068y() : c21658d2.m22004B())) {
                        m22140g(c21658d2, z6);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
        if ((z6 ? c21658d.m22068y() : c21658d.m22004B()) && c11241l.m12585A(c21658d, z6)) {
            m22144m(c21658d, z6, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0123 A[LOOP:0: B:38:0x009c->B:80:0x0123, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0126 A[EDGE_INSN: B:93:0x0126->B:81:0x0126 BREAK  A[LOOP:0: B:38:0x009c->B:80:0x0123], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, z1.D] */
    /* JADX INFO: renamed from: k */
    public final void m22142k(C21658D c21658d, long j10) {
        AbstractC10458p abstractC10458p;
        ?? M22201f;
        if (c21658d.f68647R0) {
            return;
        }
        C21658D c21658d2 = this.f68771a;
        if (c21658d.equals(c21658d2)) {
            AbstractC8111i5.m8591b("measureAndLayout called on root");
            throw null;
        }
        if (!c21658d2.m22024V()) {
            AbstractC8111i5.m8591b("performMeasureAndLayout called with unattached root");
            throw null;
        }
        if (!c21658d2.m22025W()) {
            AbstractC8111i5.m8591b("performMeasureAndLayout called with unplaced root");
            throw null;
        }
        if (this.f68773c) {
            AbstractC8111i5.m8591b("performMeasureAndLayout called during measure layout");
            throw null;
        }
        int i10 = 0;
        if (this.f68779i != null) {
            this.f68773c = true;
            this.f68774d = false;
            try {
                C11241l c11241l = this.f68772b;
                ((C19665d) c11241l.f34016Y).m20643g(c21658d);
                ((C19665d) c11241l.f34017Z).m20643g(c21658d);
                if (m22132b(c21658d, new C7536a(j10)) || c21658d.m22066x()) {
                    if (AbstractC16544l.m18089b(c21658d.m22027Y(), Boolean.TRUE)) {
                        c21658d.m22029b0();
                    }
                }
                m22138e(c21658d);
                m22133c(c21658d, new C7536a(j10));
                if (c21658d.m22062v() && c21658d.m22025W()) {
                    c21658d.m22053o0();
                    ((C6546d) this.f68775e.f63875Z).m7099c(c21658d);
                    c21658d.f68646Q0 = true;
                }
                m22137d();
                this.f68773c = false;
                this.f68774d = false;
            } catch (Throwable th2) {
                this.f68773c = false;
                this.f68774d = false;
                throw th2;
            }
        }
        C6546d c6546d = this.f68776f;
        int i11 = c6546d.f21184o0;
        if (i11 > 0) {
            Object[] objArr = c6546d.f21182Y;
            int i12 = 0;
            while (true) {
                C1313k c1313k = ((C21658D) objArr[i12]).f68638I0;
                C21715t c21715t = (C21715t) c1313k.f3468c;
                boolean zM22191h = AbstractC21679Z.m22191h(128);
                if (zM22191h) {
                    abstractC10458p = c21715t.f68892W0;
                } else {
                    abstractC10458p = c21715t.f68892W0.f30964q0;
                    if (abstractC10458p != null) {
                    }
                    i12++;
                    if (i12 >= i11) {
                        break;
                    } else {
                        i10 = 0;
                    }
                }
                C14336N c14336n = AbstractC21678Y.f68797R0;
                AbstractC10458p abstractC10458pM22161L0 = c21715t.m22161L0(zM22191h);
                while (abstractC10458pM22161L0 != null && (abstractC10458pM22161L0.f30963p0 & 128) != 0) {
                    if ((abstractC10458pM22161L0.f30962o0 & 128) != 0) {
                        ?? c6546d2 = 0;
                        ?? r11 = abstractC10458pM22161L0;
                        while (r11 != 0) {
                            if (r11 instanceof InterfaceC21717v) {
                                ((InterfaceC21717v) r11).mo11280l0((C21715t) c1313k.f3468c);
                            } else {
                                if ((r11.f30962o0 & 128) != 0 && (r11 instanceof AbstractC21706n)) {
                                    AbstractC10458p abstractC10458p2 = ((AbstractC21706n) r11).f68881A0;
                                    int i13 = i10;
                                    while (abstractC10458p2 != null) {
                                        if ((abstractC10458p2.f30962o0 & 128) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                M22201f = r11;
                                                c6546d2 = c6546d2;
                                                c6546d2 = c6546d2;
                                                M22201f = abstractC10458p2;
                                            } else {
                                                if (c6546d2 == 0) {
                                                    c6546d2 = new C6546d(new AbstractC10458p[16]);
                                                }
                                                if (M22201f != 0) {
                                                    c6546d2.m7099c(M22201f);
                                                    M22201f = 0;
                                                }
                                                c6546d2.m7099c(abstractC10458p2);
                                            }
                                        } else {
                                            M22201f = r11;
                                            c6546d2 = c6546d2;
                                        }
                                        abstractC10458p2 = abstractC10458p2.f30965r0;
                                        M22201f = M22201f;
                                        c6546d2 = c6546d2;
                                    }
                                    if (i13 == 1) {
                                        M22201f = r11;
                                        c6546d2 = c6546d2;
                                    }
                                }
                                i10 = 0;
                                r11 = M22201f;
                                c6546d2 = c6546d2;
                            }
                            M22201f = r11;
                            c6546d2 = c6546d2;
                            M22201f = AbstractC21690f.m22201f(c6546d2);
                            i10 = 0;
                            r11 = M22201f;
                            c6546d2 = c6546d2;
                        }
                    }
                    if (abstractC10458pM22161L0 == abstractC10458p) {
                        break;
                    }
                    abstractC10458pM22161L0 = abstractC10458pM22161L0.f30965r0;
                    i10 = 0;
                }
                i12++;
                if (i12 >= i11) {
                    break;
                    break;
                }
                i10 = 0;
            }
        }
        c6546d.m7104i();
    }

    /* JADX INFO: renamed from: l */
    public final void m22143l() {
        C11241l c11241l = this.f68772b;
        if (c11241l.m12588G()) {
            C21658D c21658d = this.f68771a;
            if (!c21658d.m22024V()) {
                AbstractC8111i5.m8591b("performMeasureAndLayout called with unattached root");
                throw null;
            }
            if (!c21658d.m22025W()) {
                AbstractC8111i5.m8591b("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            if (this.f68773c) {
                AbstractC8111i5.m8591b("performMeasureAndLayout called during measure layout");
                throw null;
            }
            if (this.f68779i != null) {
                this.f68773c = true;
                this.f68774d = false;
                try {
                    if (!((C21709o0) ((C19665d) c11241l.f34016Y).f62330o0).isEmpty()) {
                        if (c21658d.f68652o0 != null) {
                            m22146o(c21658d, true);
                        } else {
                            m22145n(c21658d);
                        }
                    }
                    m22146o(c21658d, false);
                } finally {
                    this.f68773c = false;
                    this.f68774d = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m22144m(C21658D c21658d, boolean z6, boolean z10) {
        C7536a c7536a;
        C21658D c21658dM22009G;
        boolean zM22133c = false;
        if (c21658d.f68647R0) {
            return false;
        }
        if (c21658d.m22025W() || c21658d.m22026X() || ((c21658d.m22004B() && m22134h(c21658d)) || AbstractC16544l.m18089b(c21658d.m22027Y(), Boolean.TRUE) || ((c21658d.m22068y() && m22135i(c21658d)) || c21658d.m22048m()))) {
            C21658D c21658d2 = this.f68771a;
            if (c21658d == c21658d2) {
                c7536a = this.f68779i;
                AbstractC16544l.m18091d(c7536a);
            } else {
                c7536a = null;
            }
            if (z6) {
                zM22133c = c21658d.m22068y() ? m22132b(c21658d, c7536a) : false;
                if (z10 && ((zM22133c || c21658d.m22066x()) && AbstractC16544l.m18089b(c21658d.m22027Y(), Boolean.TRUE))) {
                    c21658d.m22029b0();
                }
            } else {
                zM22133c = c21658d.m22004B() ? m22133c(c21658d, c7536a) : false;
                if (z10 && c21658d.m22062v() && (c21658d == c21658d2 || ((c21658dM22009G = c21658d.m22009G()) != null && c21658dM22009G.m22025W() && c21658d.m22026X()))) {
                    if (c21658d == c21658d2) {
                        c21658d.m22044j0();
                    } else {
                        c21658d.m22053o0();
                    }
                    ((C6546d) this.f68775e.f63875Z).m7099c(c21658d);
                    c21658d.f68646Q0 = true;
                }
            }
            m22137d();
        }
        return zM22133c;
    }

    /* JADX INFO: renamed from: n */
    public final void m22145n(C21658D c21658d) {
        C6546d c6546dM22014L = c21658d.m22014L();
        int i10 = c6546dM22014L.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                C21658D c21658d2 = (C21658D) objArr[i11];
                if (m22134h(c21658d2)) {
                    if (AbstractC21690f.m22213r(c21658d2)) {
                        m22146o(c21658d2, true);
                    } else {
                        m22145n(c21658d2);
                    }
                }
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m22146o(C21658D c21658d, boolean z6) {
        C7536a c7536a;
        if (c21658d.f68647R0) {
            return;
        }
        if (c21658d == this.f68771a) {
            c7536a = this.f68779i;
            AbstractC16544l.m18091d(c7536a);
        } else {
            c7536a = null;
        }
        if (z6) {
            m22132b(c21658d, c7536a);
        } else {
            m22133c(c21658d, c7536a);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22147p(C21658D c21658d, boolean z6) {
        int iM24h = AbstractC0010F.m24h(c21658d.m22064w());
        if (iM24h == 0 || iM24h == 1) {
            return false;
        }
        if (iM24h == 2 || iM24h == 3) {
            this.f68778h.m7099c(new C21670P(c21658d, false, z6));
            return false;
        }
        if (iM24h != 4) {
            throw new C0644w();
        }
        if (c21658d.m22004B() && !z6) {
            return false;
        }
        c21658d.m22037f0();
        if (c21658d.f68647R0) {
            return false;
        }
        if (!c21658d.m22025W() && (!c21658d.m22004B() || !m22134h(c21658d))) {
            return false;
        }
        C21658D c21658dM22009G = c21658d.m22009G();
        if (c21658dM22009G == null || !c21658dM22009G.m22004B()) {
            this.f68772b.m12598y(c21658d, false);
        }
        return !this.f68774d;
    }

    /* JADX INFO: renamed from: q */
    public final void m22148q(long j10) {
        C7536a c7536a = this.f68779i;
        if (c7536a == null ? false : C7536a.m7848c(c7536a.f23888a, j10)) {
            return;
        }
        if (this.f68773c) {
            AbstractC8111i5.m8591b("updateRootConstraints called while measuring");
            throw null;
        }
        this.f68779i = new C7536a(j10);
        C21658D c21658d = this.f68771a;
        if (c21658d.f68652o0 != null) {
            c21658d.m22035e0();
        }
        c21658d.m22037f0();
        this.f68772b.m12598y(c21658d, c21658d.f68652o0 != null);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0109 A[LOOP:1: B:38:0x0084->B:80:0x0109, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x010c A[EDGE_INSN: B:98:0x010c->B:81:0x010c BREAK  A[LOOP:1: B:38:0x0084->B:80:0x0109], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX INFO: renamed from: j */
    public final boolean m22141j(C0150A c0150a) {
        boolean z6;
        AbstractC10458p abstractC10458p;
        ?? M22201f;
        C21658D c21658d;
        C11241l c11241l = this.f68772b;
        C21658D c21658d2 = this.f68771a;
        if (!c21658d2.m22024V()) {
            AbstractC8111i5.m8591b("performMeasureAndLayout called with unattached root");
            throw null;
        }
        if (!c21658d2.m22025W()) {
            AbstractC8111i5.m8591b(bQBnquXS.zCTdox);
            throw null;
        }
        if (this.f68773c) {
            AbstractC8111i5.m8591b("performMeasureAndLayout called during measure layout");
            throw null;
        }
        int i10 = 0;
        if (this.f68779i != null) {
            this.f68773c = true;
            this.f68774d = true;
            try {
                if (c11241l.m12588G()) {
                    z6 = false;
                    while (true) {
                        boolean zM12588G = c11241l.m12588G();
                        C19665d c19665d = (C19665d) c11241l.f34016Y;
                        if (!zM12588G) {
                            break;
                        }
                        boolean zIsEmpty = ((C21709o0) c19665d.f62330o0).isEmpty();
                        boolean z10 = !zIsEmpty;
                        if (zIsEmpty) {
                            C19665d c19665d2 = (C19665d) c11241l.f34017Z;
                            C21658D c21658d3 = (C21658D) ((C21709o0) c19665d2.f62330o0).first();
                            c19665d2.m20643g(c21658d3);
                            c21658d = c21658d3;
                        } else {
                            c21658d = (C21658D) ((C21709o0) c19665d.f62330o0).first();
                            c19665d.m20643g(c21658d);
                        }
                        boolean zM22144m = m22144m(c21658d, z10, true);
                        if (c21658d == c21658d2 && zM22144m) {
                            z6 = true;
                        }
                    }
                    if (c0150a != null) {
                        c0150a.invoke();
                    }
                } else {
                    z6 = false;
                }
                this.f68773c = false;
                this.f68774d = false;
            } catch (Throwable th2) {
                this.f68773c = false;
                this.f68774d = false;
                throw th2;
            }
        } else {
            z6 = false;
        }
        C6546d c6546d = this.f68776f;
        int i11 = c6546d.f21184o0;
        if (i11 > 0) {
            Object[] objArr = c6546d.f21182Y;
            int i12 = 0;
            while (true) {
                C1313k c1313k = ((C21658D) objArr[i12]).f68638I0;
                C21715t c21715t = (C21715t) c1313k.f3468c;
                boolean zM22191h = AbstractC21679Z.m22191h(128);
                if (zM22191h) {
                    abstractC10458p = c21715t.f68892W0;
                } else {
                    abstractC10458p = c21715t.f68892W0.f30964q0;
                    if (abstractC10458p != null) {
                    }
                    i12++;
                    if (i12 >= i11) {
                        break;
                    }
                    i10 = 0;
                }
                C14336N c14336n = AbstractC21678Y.f68797R0;
                AbstractC10458p abstractC10458pM22161L0 = c21715t.m22161L0(zM22191h);
                while (abstractC10458pM22161L0 != null && (abstractC10458pM22161L0.f30963p0 & 128) != 0) {
                    if ((abstractC10458pM22161L0.f30962o0 & 128) != 0) {
                        ?? r12 = abstractC10458pM22161L0;
                        ?? c6546d2 = 0;
                        while (r12 != 0) {
                            if (r12 instanceof InterfaceC21717v) {
                                ((InterfaceC21717v) r12).mo11280l0((C21715t) c1313k.f3468c);
                            } else {
                                if ((r12.f30962o0 & 128) != 0 && (r12 instanceof AbstractC21706n)) {
                                    AbstractC10458p abstractC10458p2 = ((AbstractC21706n) r12).f68881A0;
                                    while (abstractC10458p2 != null) {
                                        if ((abstractC10458p2.f30962o0 & 128) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                M22201f = r12;
                                                c6546d2 = c6546d2;
                                                c6546d2 = c6546d2;
                                                M22201f = abstractC10458p2;
                                            } else {
                                                if (c6546d2 == 0) {
                                                    c6546d2 = new C6546d(new AbstractC10458p[16]);
                                                }
                                                if (M22201f != 0) {
                                                    c6546d2.m7099c(M22201f);
                                                    M22201f = 0;
                                                }
                                                c6546d2.m7099c(abstractC10458p2);
                                            }
                                        } else {
                                            M22201f = r12;
                                            c6546d2 = c6546d2;
                                        }
                                        abstractC10458p2 = abstractC10458p2.f30965r0;
                                        M22201f = M22201f;
                                        c6546d2 = c6546d2;
                                    }
                                    if (i10 == 1) {
                                        M22201f = r12;
                                        c6546d2 = c6546d2;
                                    }
                                }
                                i10 = 0;
                                r12 = M22201f;
                                c6546d2 = c6546d2;
                            }
                            M22201f = r12;
                            c6546d2 = c6546d2;
                            M22201f = AbstractC21690f.m22201f(c6546d2);
                            i10 = 0;
                            r12 = M22201f;
                            c6546d2 = c6546d2;
                        }
                    }
                    if (abstractC10458pM22161L0 == abstractC10458p) {
                        break;
                    }
                    abstractC10458pM22161L0 = abstractC10458pM22161L0.f30965r0;
                    i10 = 0;
                }
                i12++;
                if (i12 >= i11) {
                    break;
                    break;
                }
                i10 = 0;
            }
        }
        c6546d.m7104i();
        return z6;
    }
}
