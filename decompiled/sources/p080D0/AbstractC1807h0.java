package p080D0;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.input.pointer.SuspendPointerInputElement;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16524A;
import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import mm.EnumC17307j;
import mm.InterfaceC17302e;
import mm.InterfaceC17306i;
import p001A.AbstractC0010F;
import p002A0.C0122V;
import p002A0.C0138o;
import p002A0.C0139p;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.C0184L0;
import p003A1.C0248f0;
import p003A1.C0280q;
import p003A1.InterfaceC0161D1;
import p003A1.InterfaceC0172H0;
import p003A1.InterfaceC0303x1;
import p013Ab.C0420b;
import p025An.C0644w;
import p039Bc.C0882p;
import p039Bc.C0886t;
import p042Bf.C1268j;
import p042Bf.C1269k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p054C0.C1494g;
import p1014t1.AbstractC19736m;
import p1014t1.C19729f;
import p1014t1.C19738o;
import p1014t1.C19748y;
import p1071w0.AbstractC20740b0;
import p1071w0.C20750g0;
import p1071w0.InterfaceC20772r0;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21098s;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p156G1.AbstractC2965l;
import p204I1.C3577H;
import p204I1.C3578I;
import p204I1.C3581L;
import p204I1.C3599o;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p467T1.EnumC7198h;
import p492U1.C7545j;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p530Vi.AbstractC8301I;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8676n;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p587Y1.AbstractC9582h;
import p587Y1.C9596v;
import p594Y9.AbstractC9834X3;
import p635a1.AbstractC10443a;
import p635a1.C10448f;
import p635a1.InterfaceC10446d;
import p635a1.InterfaceC10459q;
import p715e1.C13257c;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.C14347c;
import p774h1.C14351g;
import p774h1.C14365u;
import p774h1.InterfaceC14362r;
import p775h2.AbstractC14376f;
import p821j1.C16036a;
import p821j1.C16037b;
import p821j1.C16042g;
import p860l0.AbstractC16750j0;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17792x;
import p937p1.InterfaceC18285a;
import p996rm.EnumC19250a;
import sm.AbstractC19685a;

/* JADX INFO: renamed from: D0.h0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1807h0 {

    /* JADX INFO: renamed from: a */
    public static final C13801c f5201a = new C13801c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: b */
    public static C14351g f5202b;

    /* JADX INFO: renamed from: c */
    public static C14347c f5203c;

    /* JADX INFO: renamed from: d */
    public static C16037b f5204d;

    /* JADX INFO: renamed from: A */
    public static final EnumC7198h m2606A(C3578I c3578i, int i10) {
        C3577H c3577h = c3578i.f10892a;
        if (c3577h.f10882a.f10934Y.length() != 0) {
            int iM4257g = c3578i.m4257g(i10);
            if ((i10 != 0 && iM4257g == c3578i.m4257g(i10 - 1)) || (i10 != c3577h.f10882a.f10934Y.length() && iM4257g == c3578i.m4257g(i10 + 1))) {
                return c3578i.m4251a(i10);
            }
        }
        return c3578i.m4261k(i10);
    }

    /* JADX INFO: renamed from: B */
    public static final C1829s0 m2607B(C3578I c3578i, int i10, int i11, int i12, long j10, boolean z6, boolean z10) {
        C1824q c1824q;
        if (z6) {
            c1824q = null;
        } else {
            int i13 = C3581L.f10907c;
            int i14 = (int) (j10 >> 32);
            int i15 = (int) (4294967295L & j10);
            c1824q = new C1824q(new C1822p(m2606A(c3578i, i14), i14, 1L), new C1822p(m2606A(c3578i, i15), i15, 1L), C3581L.m4271g(j10));
        }
        return new C1829s0(z10, 1, 1, c1824q, new C1820o(1L, 1, i10, i11, i12, c3578i));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: C */
    public static final boolean m2608C(C19729f c19729f) {
        ?? r6 = c19729f.f62460a;
        int size = r6.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!AbstractC19736m.m20683e(((C19738o) r6.get(i10)).f62486i, 2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m2609D(C1837w0 c1837w0, boolean z6) {
        InterfaceC21098s interfaceC21098sM21293c;
        C20750g0 c20750g0 = c1837w0.f5308d;
        if (c20750g0 == null || (interfaceC21098sM21293c = c20750g0.m21293c()) == null) {
            return false;
        }
        return m2631t(c1837w0.m2685i(z6), m2611F(interfaceC21098sM21293c));
    }

    /* JADX INFO: renamed from: E */
    public static final int m2610E(int i10, int i11) {
        int iM24h = AbstractC0010F.m24h(i11);
        if (iM24h == 0) {
            return 1;
        }
        if (iM24h == 1) {
            int iM24h2 = AbstractC0010F.m24h(i10);
            if (iM24h2 == 0) {
                return 1;
            }
            if (iM24h2 == 1) {
                return 2;
            }
            if (iM24h2 != 2) {
                throw new C0644w();
            }
        } else if (iM24h != 2) {
            throw new C0644w();
        }
        return 3;
    }

    /* JADX INFO: renamed from: F */
    public static final C13801c m2611F(InterfaceC21098s interfaceC21098s) {
        C13801c c13801cM21565f = AbstractC21075b0.m21565f(interfaceC21098s);
        long jMo21526q = interfaceC21098s.mo21526q(c13801cM21565f.m15320g());
        long jMo21526q2 = interfaceC21098s.mo21526q(AbstractC8088f6.m8536b(c13801cM21565f.f43588c, c13801cM21565f.f43589d));
        return new C13801c(C13800b.m15306g(jMo21526q), C13800b.m15307h(jMo21526q), C13800b.m15306g(jMo21526q2), C13800b.m15307h(jMo21526q2));
    }

    /* JADX INFO: renamed from: a */
    public static final void m2612a(C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(336063542);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c8410b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C5997d.m6440a(AbstractC1823p0.f5256a.mo6405a(null), c8410b, c6021p, ((i11 << 3) & 112) | 8);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1834v(c8410b, i10, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2613b(InterfaceC1818n interfaceC1818n, InterfaceC10446d interfaceC10446d, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(476043083);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(interfaceC1818n) : c6021p.m6545h(interfaceC1818n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10446d) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            boolean z6 = false;
            boolean z10 = (i11 & 112) == 32;
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && c6021p.m6542f(interfaceC1818n))) {
                z6 = true;
            }
            boolean z11 = z10 | z6;
            Object objM6514H = c6021p.m6514H();
            if (z11 || objM6514H == C6013l.f19514a) {
                objM6514H = new C1810j(interfaceC10446d, interfaceC1818n);
                c6021p.m6537c0(objM6514H);
            }
            AbstractC9582h.m10129a((C1810j) objM6514H, null, new C9596v(false, true, true, 1, true, false), c8410b, c6021p, ((i11 << 3) & 7168) | 384, 2);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(interfaceC1818n, interfaceC10446d, c8410b, i10, 11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m2614c(InterfaceC10459q interfaceC10459q, C1824q c1824q, InterfaceC1436k interfaceC1436k, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(2078139907);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c1824q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C1821o0 c1821o0 = (C1821o0) AbstractC9834X3.m10481d(new Object[0], C1821o0.f5241l, null, C1763A.f5033Z, c6021p, 3072, 4);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = new C1803f0(c1821o0);
                c6021p.m6537c0(objM6514H);
            }
            C1803f0 c1803f0 = (C1803f0) objM6514H;
            c1803f0.f5182e = (InterfaceC18285a) c6021p.m6548k(AbstractC0187M0.f708j);
            c1803f0.f5183f = (InterfaceC0172H0) c6021p.m6548k(AbstractC0187M0.f702d);
            c1803f0.f5184g = (InterfaceC0303x1) c6021p.m6548k(AbstractC0187M0.f713o);
            c1803f0.f5181d = new C0122V(c1803f0, 21, interfaceC1436k);
            c1803f0.m2601m(c1824q);
            AbstractC20740b0.m21263d(c1803f0, AbstractC8411c.m8969c(-123806316, c6021p, new C1268j((Object) c1821o0, interfaceC10459q, (Object) c1803f0, (InterfaceC17302e) c8410b, 2)), c6021p, 48);
            boolean zM6545h = c6021p.m6545h(c1803f0);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == obj) {
                objM6514H2 = new C1842z(c1803f0, 0);
                c6021p.m6537c0(objM6514H2);
            }
            C5997d.m6444c(c1803f0, (InterfaceC1436k) objM6514H2, c6021p);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(interfaceC10459q, c1824q, interfaceC1436k, c8410b, i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m2615d(InterfaceC10459q interfaceC10459q, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1075498320);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(null, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            C1824q c1824q = (C1824q) interfaceC5985X.getValue();
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = new C0248f0(interfaceC5985X, 8);
                c6021p.m6537c0(objM6514H2);
            }
            m2614c(interfaceC10459q, c1824q, (InterfaceC1436k) objM6514H2, c8410b, c6021p, (i11 & 14) | 384 | ((i11 << 6) & 7168));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1836w(interfaceC10459q, c8410b, i10, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m2616e(InterfaceC1818n interfaceC1818n, boolean z6, EnumC7198h enumC7198h, boolean z10, long j10, SuspendPointerInputElement suspendPointerInputElement, C6021p c6021p, int i10, int i11) {
        int i12;
        long j11;
        boolean z11;
        c6021p.m6526U(-843755800);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c6021p.m6542f(interfaceC1818n) : c6021p.m6545h(interfaceC1818n) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(enumC7198h) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6544g(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            j11 = j10;
            i12 |= ((i11 & 16) == 0 && c6021p.m6540e(j11)) ? 16384 : 8192;
        } else {
            j11 = j10;
        }
        if ((196608 & i10) == 0) {
            i12 |= c6021p.m6542f(suspendPointerInputElement) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0 && !c6021p.m6561x()) {
                c6021p.m6517L();
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                }
            } else if ((i11 & 16) != 0) {
                i12 &= -57345;
                j11 = 9205357640488583168L;
            }
            c6021p.m6554q();
            EnumC7198h enumC7198h2 = EnumC7198h.f22860Z;
            EnumC7198h enumC7198h3 = EnumC7198h.f22859Y;
            if (z6) {
                float f10 = AbstractC1783Q.f5104a;
                z11 = (enumC7198h == enumC7198h3 && !z10) || (enumC7198h == enumC7198h2 && z10);
            } else {
                float f11 = AbstractC1783Q.f5104a;
                z11 = !((enumC7198h == enumC7198h3 && !z10) || (enumC7198h == enumC7198h2 && z10));
            }
            C10448f c10448f = z11 ? AbstractC10443a.f30928b : AbstractC10443a.f30927a;
            int i13 = i12 & 14;
            boolean zM6544g = ((i12 & 112) == 32) | (i13 == 4 || ((i12 & 8) != 0 && c6021p.m6545h(interfaceC1818n))) | c6021p.m6544g(z11);
            Object objM6514H = c6021p.m6514H();
            if (zM6544g || objM6514H == C6013l.f19514a) {
                objM6514H = new C1800e(interfaceC1818n, z6, z11);
                c6021p.m6537c0(objM6514H);
            }
            m2613b(interfaceC1818n, c10448f, AbstractC8411c.m8969c(280174801, c6021p, new C1796c((InterfaceC0161D1) c6021p.m6548k(AbstractC0187M0.f715q), j11, z11, AbstractC2965l.m3789a(suspendPointerInputElement, false, (InterfaceC1436k) objM6514H), interfaceC1818n)), c6021p, i13 | 384);
        }
        long j12 = j11;
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1798d(interfaceC1818n, z6, enumC7198h, z10, j12, suspendPointerInputElement, i10, i11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m2617f(int i10, InterfaceC1426a interfaceC1426a, C6021p c6021p, InterfaceC10459q interfaceC10459q, boolean z6) {
        int i11;
        c6021p.m6526U(2111672474);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC17758g.m19482b(c6021p, AbstractC10443a.m10921b(AbstractC10844c.m11253m(interfaceC10459q, AbstractC1783Q.f5104a, AbstractC1783Q.f5105b), C0280q.f1030t0, new C0882p(interfaceC1426a, z6, 1)));
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1802f(interfaceC10459q, interfaceC1426a, z6, i10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m2618g(InterfaceC10459q interfaceC10459q, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-2105228848);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C1827r0 c1827r0 = C1827r0.f5263a;
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            int i13 = (((((i11 << 3) & 112) | (((i11 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c1827r0);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC17792x.m19538u((i13 >> 6) & 14, c8410b, c6021p, true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1836w(interfaceC10459q, c8410b, i10, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m2619h(boolean z6, EnumC7198h enumC7198h, C1837w0 c1837w0, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1344558920);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(enumC7198h) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c1837w0) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int i12 = i11 & 14;
            boolean zM6542f = (i12 == 4) | c6021p.m6542f(c1837w0);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                objM6514H = new C1799d0(c1837w0, z6);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC20772r0 interfaceC20772r0 = (InterfaceC20772r0) objM6514H;
            boolean zM6545h = c6021p.m6545h(c1837w0) | (i12 == 4);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == obj) {
                objM6514H2 = new C1839x0(c1837w0, z6);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC1818n interfaceC1818n = (InterfaceC1818n) objM6514H2;
            boolean zM4271g = C3581L.m4271g(c1837w0.m2686j().f19683b);
            boolean zM6545h2 = c6021p.m6545h(interfaceC20772r0);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h2 || objM6514H3 == obj) {
                objM6514H3 = new C1841y0(interfaceC20772r0, null);
                c6021p.m6537c0(objM6514H3);
            }
            m2616e(interfaceC1818n, z6, enumC7198h, zM4271g, 0L, new SuspendPointerInputElement(interfaceC20772r0, null, (InterfaceC1439n) objM6514H3, 6), c6021p, (i11 << 3) & 1008, 16);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0886t(z6, enumC7198h, c1837w0, i10, 1);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final C1824q m2620i(InterfaceC1784S interfaceC1784S, InterfaceC1806h interfaceC1806h) {
        boolean z6 = interfaceC1784S.mo2582j() == 1;
        return new C1824q(m2628q(interfaceC1784S.mo2584l(), z6, true, interfaceC1784S.mo2585m(), interfaceC1806h), m2628q(interfaceC1784S.mo2581i(), z6, false, interfaceC1784S.mo2580h(), interfaceC1806h), z6);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[LOOP:0: B:19:0x004a->B:23:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: j */
    public static final java.lang.Object m2621j(p1014t1.C19748y r7, sm.AbstractC19685a r8) {
        /*
            boolean r0 = r8 instanceof p080D0.C1767C
            if (r0 == 0) goto L13
            r0 = r8
            D0.C r0 = (p080D0.C1767C) r0
            int r1 = r0.f5044o0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5044o0 = r1
            goto L18
        L13:
            D0.C r0 = new D0.C
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5043Z
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f5044o0
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            t1.y r7 = r0.f5042Y
            p571X9.AbstractC9233X.m9807c(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            p571X9.AbstractC9233X.m9807c(r8)
        L34:
            t1.g r8 = p1014t1.EnumC19730g.f62466Z
            r0.f5042Y = r7
            r0.f5044o0 = r3
            java.lang.Object r8 = r7.m20695a(r8, r0)
            if (r8 != r1) goto L41
            goto L5d
        L41:
            t1.f r8 = (p1014t1.C19729f) r8
            java.lang.Object r2 = r8.f62460a
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L5c
            java.lang.Object r6 = r2.get(r5)
            t1.o r6 = (p1014t1.C19738o) r6
            boolean r6 = p1014t1.AbstractC19736m.m20679a(r6)
            if (r6 != 0) goto L59
            goto L34
        L59:
            int r5 = r5 + 1
            goto L4a
        L5c:
            r1 = r8
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p080D0.AbstractC1807h0.m2621j(t1.y, sm.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: k */
    public static final Object m2622k(C19748y c19748y, InterfaceC1812k interfaceC1812k, C0420b c0420b, C19729f c19729f, AbstractC19685a abstractC19685a) {
        C1769D c1769d;
        C1826r c1826r;
        ?? r6;
        int size;
        C19738o c19738o;
        if (abstractC19685a instanceof C1769D) {
            c1769d = (C1769D) abstractC19685a;
            int i10 = c1769d.f5050p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1769d.f5050p0 = i10 - Integer.MIN_VALUE;
            } else {
                c1769d = new C1769D(abstractC19685a);
            }
        } else {
            c1769d = new C1769D(abstractC19685a);
        }
        Object objM18526j = c1769d.f5049o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c1769d.f5050p0;
        int i12 = 0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM18526j);
            c0420b.m1043F(c19729f);
            C19738o c19738o2 = (C19738o) c19729f.f62460a.get(0);
            int i13 = c0420b.f1381Z;
            if (i13 != 1) {
                c1826r = i13 != 2 ? C1828s.f5269g : C1828s.f5268f;
            } else {
                c1826r = C1828s.f5266d;
            }
            if (interfaceC1812k.mo463p(c19738o2.f62480c, c1826r)) {
                C0122V c0122v = new C0122V(interfaceC1812k, 19, c1826r);
                c1769d.f5047Y = c19748y;
                c1769d.f5048Z = interfaceC1812k;
                c1769d.f5050p0 = 2;
                objM18526j = AbstractC16750j0.m18526j(c19748y, c19738o2.f62478a, c0122v, c1769d);
                if (objM18526j == enumC19250a) {
                    return enumC19250a;
                }
                if (((Boolean) objM18526j).booleanValue()) {
                    r6 = c19748y.f62527q0.f62440E0.f62460a;
                    size = r6.size();
                    while (i12 < size) {
                        c19738o = (C19738o) r6.get(i12);
                        if (AbstractC19736m.m20680b(c19738o)) {
                            c19738o.m20691a();
                        }
                        i12++;
                    }
                }
                interfaceC1812k.mo462o();
            }
        } else if (i11 == 1) {
            InterfaceC1812k interfaceC1812k2 = c1769d.f5048Z;
            C19748y c19748y2 = c1769d.f5047Y;
            AbstractC9233X.m9807c(objM18526j);
            if (((Boolean) objM18526j).booleanValue()) {
                ?? r10 = c19748y2.f62527q0.f62440E0.f62460a;
                int size2 = r10.size();
                while (i12 < size2) {
                    C19738o c19738o3 = (C19738o) r10.get(i12);
                    if (AbstractC19736m.m20680b(c19738o3)) {
                        c19738o3.m20691a();
                    }
                    i12++;
                }
            }
            interfaceC1812k2.mo462o();
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1812k = c1769d.f5048Z;
            c19748y = c1769d.f5047Y;
            AbstractC9233X.m9807c(objM18526j);
            if (((Boolean) objM18526j).booleanValue()) {
                r6 = c19748y.f62527q0.f62440E0.f62460a;
                size = r6.size();
                while (i12 < size) {
                    c19738o = (C19738o) r6.get(i12);
                    if (AbstractC19736m.m20680b(c19738o)) {
                        c19738o.m20691a();
                    }
                    i12++;
                }
            }
            interfaceC1812k.mo462o();
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b6 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:45:0x00ae, B:47:0x00b6, B:49:0x00c2, B:51:0x00ce, B:42:0x0095), top: B:58:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:45:0x00ae, B:47:0x00b6, B:49:0x00c2, B:51:0x00ce, B:42:0x0095), top: B:58:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:45:0x00ae, B:47:0x00b6, B:49:0x00c2, B:51:0x00ce, B:42:0x0095), top: B:58:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [A0.o, D0.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [D0.k] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [D0.k] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: l */
    public static final Object m2623l(C19748y c19748y, C0138o c0138o, C0420b c0420b, C19729f c19729f, AbstractC19685a abstractC19685a) {
        C1771E c1771e;
        C1826r c1826r;
        ?? r6;
        int size;
        C19738o c19738o;
        if (abstractC19685a instanceof C1771E) {
            c1771e = (C1771E) abstractC19685a;
            int i10 = c1771e.f5056p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1771e.f5056p0 = i10 - Integer.MIN_VALUE;
            } else {
                c1771e = new C1771E(abstractC19685a);
            }
        } else {
            c1771e = new C1771E(abstractC19685a);
        }
        Object objM18526j = c1771e.f5055o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c1771e.f5056p0;
        int i12 = 0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(objM18526j);
                C19738o c19738o2 = (C19738o) c19729f.f62460a.get(0);
                int i13 = c0420b.f1381Z;
                if (i13 != 1) {
                    c1826r = i13 != 2 ? C1828s.f5269g : C1828s.f5268f;
                } else {
                    c1826r = C1828s.f5266d;
                }
                if (c0138o.mo463p(c19738o2.f62480c, c1826r)) {
                    c19738o2.m20691a();
                    long j10 = c19738o2.f62478a;
                    C0122V c0122v = new C0122V(c0138o, 20, c1826r);
                    c1771e.f5053Y = c19748y;
                    c1771e.f5054Z = c0138o;
                    c1771e.f5056p0 = 2;
                    objM18526j = AbstractC16750j0.m18526j(c19748y, j10, c0122v, c1771e);
                    if (objM18526j == enumC19250a) {
                        c0138o = c0138o;
                        return enumC19250a;
                    }
                    c0138o = c0138o;
                    if (((Boolean) objM18526j).booleanValue()) {
                        r6 = c19748y.f62527q0.f62440E0.f62460a;
                        size = r6.size();
                        while (i12 < size) {
                            c19738o = (C19738o) r6.get(i12);
                            if (AbstractC19736m.m20680b(c19738o)) {
                                c19738o.m20691a();
                            }
                            i12++;
                        }
                    }
                    c0138o.mo462o();
                }
            } else if (i11 == 1) {
                InterfaceC1812k interfaceC1812k = c1771e.f5054Z;
                C19748y c19748y2 = c1771e.f5053Y;
                try {
                    AbstractC9233X.m9807c(objM18526j);
                    if (((Boolean) objM18526j).booleanValue()) {
                        ?? r10 = c19748y2.f62527q0.f62440E0.f62460a;
                        int size2 = r10.size();
                        while (i12 < size2) {
                            C19738o c19738o3 = (C19738o) r10.get(i12);
                            if (AbstractC19736m.m20680b(c19738o3)) {
                                c19738o3.m20691a();
                            }
                            i12++;
                        }
                    }
                } finally {
                    interfaceC1812k.mo462o();
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC1812k interfaceC1812k2 = c1771e.f5054Z;
                c19748y = c1771e.f5053Y;
                AbstractC9233X.m9807c(objM18526j);
                c0138o = interfaceC1812k2;
                c0138o = c0138o;
                if (((Boolean) objM18526j).booleanValue()) {
                    r6 = c19748y.f62527q0.f62440E0.f62460a;
                    size = r6.size();
                    while (i12 < size) {
                        c19738o = (C19738o) r6.get(i12);
                        if (AbstractC19736m.m20680b(c19738o)) {
                            c19738o.m20691a();
                        }
                        i12++;
                    }
                }
                c0138o.mo462o();
            }
            return C17296C.f55119a;
        } catch (Throwable th2) {
            c0138o.mo462o();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095 A[Catch: CancellationException -> 0x002e, TryCatch #0 {CancellationException -> 0x002e, blocks: (B:13:0x002a, B:33:0x008d, B:35:0x0095, B:37:0x00a2, B:39:0x00ae, B:40:0x00b1, B:41:0x00b4, B:42:0x00b8, B:20:0x003f, B:26:0x0062, B:28:0x0066, B:30:0x0070, B:23:0x0049), top: B:47:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[Catch: CancellationException -> 0x002e, TryCatch #0 {CancellationException -> 0x002e, blocks: (B:13:0x002a, B:33:0x008d, B:35:0x0095, B:37:0x00a2, B:39:0x00ae, B:40:0x00b1, B:41:0x00b4, B:42:0x00b8, B:20:0x003f, B:26:0x0062, B:28:0x0066, B:30:0x0070, B:23:0x0049), top: B:47:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae A[Catch: CancellationException -> 0x002e, TryCatch #0 {CancellationException -> 0x002e, blocks: (B:13:0x002a, B:33:0x008d, B:35:0x0095, B:37:0x00a2, B:39:0x00ae, B:40:0x00b1, B:41:0x00b4, B:42:0x00b8, B:20:0x003f, B:26:0x0062, B:28:0x0066, B:30:0x0070, B:23:0x0049), top: B:47:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8 A[Catch: CancellationException -> 0x002e, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x002e, blocks: (B:13:0x002a, B:33:0x008d, B:35:0x0095, B:37:0x00a2, B:39:0x00ae, B:40:0x00b1, B:41:0x00b4, B:42:0x00b8, B:20:0x003f, B:26:0x0062, B:28:0x0066, B:30:0x0070, B:23:0x0049), top: B:47:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: m */
    public static final Object m2624m(C19748y c19748y, InterfaceC20772r0 interfaceC20772r0, C19729f c19729f, AbstractC19685a abstractC19685a) {
        C1775I c1775i;
        C19738o c19738o;
        ?? r10;
        int size;
        int i10;
        C19738o c19738o2;
        if (abstractC19685a instanceof C1775I) {
            c1775i = (C1775I) abstractC19685a;
            int i11 = c1775i.f5075q0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1775i.f5075q0 = i11 - Integer.MIN_VALUE;
            } else {
                c1775i = new C1775I(abstractC19685a);
            }
        } else {
            c1775i = new C1775I(abstractC19685a);
        }
        Object objM18519c = c1775i.f5074p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c1775i.f5075q0;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    C19738o c19738o3 = c1775i.f5073o0;
                    interfaceC20772r0 = c1775i.f5072Z;
                    C19748y c19748y2 = c1775i.f5071Y;
                    AbstractC9233X.m9807c(objM18519c);
                    c19738o = c19738o3;
                    c19748y = c19748y2;
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC20772r0 = c1775i.f5072Z;
                    c19748y = c1775i.f5071Y;
                    AbstractC9233X.m9807c(objM18519c);
                }
                if (((Boolean) objM18519c).booleanValue()) {
                    r10 = c19748y.f62527q0.f62440E0.f62460a;
                    size = r10.size();
                    for (i10 = 0; i10 < size; i10++) {
                        c19738o2 = (C19738o) r10.get(i10);
                        if (AbstractC19736m.m20680b(c19738o2)) {
                            c19738o2.m20691a();
                        }
                    }
                    interfaceC20772r0.mo464a();
                } else {
                    interfaceC20772r0.onCancel();
                }
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(objM18519c);
            c19738o = (C19738o) AbstractC17680n.m19341Q(c19729f.f62460a);
            long j10 = c19738o.f62478a;
            c1775i.f5071Y = c19748y;
            c1775i.f5072Z = interfaceC20772r0;
            c1775i.f5073o0 = c19738o;
            c1775i.f5075q0 = 1;
            objM18519c = AbstractC16750j0.m18519c(c19748y, j10, c1775i);
            if (objM18519c == enumC19250a) {
                return enumC19250a;
            }
            C19738o c19738o4 = (C19738o) objM18519c;
            if (c19738o4 != null && m2633v(c19748y.m20697d(), c19738o, c19738o4)) {
                interfaceC20772r0.mo465b(c19738o4.f62480c);
                long j11 = c19738o4.f62478a;
                C1776J c1776j = new C1776J(interfaceC20772r0, 0);
                c1775i.f5071Y = c19748y;
                c1775i.f5072Z = interfaceC20772r0;
                c1775i.f5073o0 = null;
                c1775i.f5075q0 = 2;
                objM18519c = AbstractC16750j0.m18526j(c19748y, j11, c1776j, c1775i);
                if (objM18519c == enumC19250a) {
                    return enumC19250a;
                }
                if (((Boolean) objM18519c).booleanValue()) {
                    r10 = c19748y.f62527q0.f62440E0.f62460a;
                    size = r10.size();
                    while (i10 < size) {
                        c19738o2 = (C19738o) r10.get(i10);
                        if (AbstractC19736m.m20680b(c19738o2)) {
                            c19738o2.m20691a();
                        }
                    }
                    interfaceC20772r0.mo464a();
                } else {
                    interfaceC20772r0.onCancel();
                }
            }
            return C17296C.f55119a;
        } catch (CancellationException e10) {
            interfaceC20772r0.onCancel();
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095 A[Catch: CancellationException -> 0x002e, TryCatch #0 {CancellationException -> 0x002e, blocks: (B:13:0x002a, B:33:0x008d, B:35:0x0095, B:37:0x00a2, B:39:0x00ae, B:40:0x00b1, B:41:0x00b4, B:42:0x00b8, B:20:0x003f, B:26:0x0062, B:28:0x0066, B:30:0x0070, B:23:0x0049), top: B:47:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[Catch: CancellationException -> 0x002e, TryCatch #0 {CancellationException -> 0x002e, blocks: (B:13:0x002a, B:33:0x008d, B:35:0x0095, B:37:0x00a2, B:39:0x00ae, B:40:0x00b1, B:41:0x00b4, B:42:0x00b8, B:20:0x003f, B:26:0x0062, B:28:0x0066, B:30:0x0070, B:23:0x0049), top: B:47:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae A[Catch: CancellationException -> 0x002e, TryCatch #0 {CancellationException -> 0x002e, blocks: (B:13:0x002a, B:33:0x008d, B:35:0x0095, B:37:0x00a2, B:39:0x00ae, B:40:0x00b1, B:41:0x00b4, B:42:0x00b8, B:20:0x003f, B:26:0x0062, B:28:0x0066, B:30:0x0070, B:23:0x0049), top: B:47:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8 A[Catch: CancellationException -> 0x002e, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x002e, blocks: (B:13:0x002a, B:33:0x008d, B:35:0x0095, B:37:0x00a2, B:39:0x00ae, B:40:0x00b1, B:41:0x00b4, B:42:0x00b8, B:20:0x003f, B:26:0x0062, B:28:0x0066, B:30:0x0070, B:23:0x0049), top: B:47:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: n */
    public static final Object m2625n(C19748y c19748y, C0139p c0139p, C19729f c19729f, AbstractC19685a abstractC19685a) {
        C1777K c1777k;
        C19738o c19738o;
        InterfaceC20772r0 interfaceC20772r0;
        InterfaceC20772r0 interfaceC20772r1;
        ?? r10;
        int size;
        int i10;
        C19738o c19738o2;
        if (abstractC19685a instanceof C1777K) {
            c1777k = (C1777K) abstractC19685a;
            int i11 = c1777k.f5082q0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1777k.f5082q0 = i11 - Integer.MIN_VALUE;
            } else {
                c1777k = new C1777K(abstractC19685a);
            }
        } else {
            c1777k = new C1777K(abstractC19685a);
        }
        Object objM18519c = c1777k.f5081p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c1777k.f5082q0;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    C19738o c19738o3 = c1777k.f5080o0;
                    InterfaceC20772r0 interfaceC20772r2 = c1777k.f5079Z;
                    C19748y c19748y2 = c1777k.f5078Y;
                    AbstractC9233X.m9807c(objM18519c);
                    c19738o = c19738o3;
                    c19748y = c19748y2;
                    interfaceC20772r0 = interfaceC20772r2;
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC20772r0 interfaceC20772r3 = c1777k.f5079Z;
                    c19748y = c1777k.f5078Y;
                    AbstractC9233X.m9807c(objM18519c);
                    interfaceC20772r1 = interfaceC20772r3;
                }
                interfaceC20772r1 = interfaceC20772r0;
                if (((Boolean) objM18519c).booleanValue()) {
                    r10 = c19748y.f62527q0.f62440E0.f62460a;
                    size = r10.size();
                    for (i10 = 0; i10 < size; i10++) {
                        c19738o2 = (C19738o) r10.get(i10);
                        if (AbstractC19736m.m20680b(c19738o2)) {
                            c19738o2.m20691a();
                        }
                    }
                    interfaceC20772r1.mo464a();
                } else {
                    interfaceC20772r1.onCancel();
                }
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(objM18519c);
            c19738o = (C19738o) AbstractC17680n.m19341Q(c19729f.f62460a);
            long j10 = c19738o.f62478a;
            c1777k.f5078Y = c19748y;
            c1777k.f5079Z = c0139p;
            c1777k.f5080o0 = c19738o;
            c1777k.f5082q0 = 1;
            objM18519c = AbstractC16750j0.m18519c(c19748y, j10, c1777k);
            interfaceC20772r0 = c0139p;
            if (objM18519c == enumC19250a) {
                return enumC19250a;
            }
            C19738o c19738o4 = (C19738o) objM18519c;
            if (c19738o4 != null && m2633v(c19748y.m20697d(), c19738o, c19738o4)) {
                interfaceC20772r0.mo465b(c19738o4.f62480c);
                long j11 = c19738o4.f62478a;
                C1776J c1776j = new C1776J(interfaceC20772r0, 1);
                c1777k.f5078Y = c19748y;
                c1777k.f5079Z = interfaceC20772r0;
                c1777k.f5080o0 = null;
                c1777k.f5082q0 = 2;
                objM18519c = AbstractC16750j0.m18526j(c19748y, j11, c1776j, c1777k);
                if (objM18519c == enumC19250a) {
                    interfaceC20772r1 = interfaceC20772r0;
                    return enumC19250a;
                }
                interfaceC20772r1 = interfaceC20772r0;
                if (((Boolean) objM18519c).booleanValue()) {
                    r10 = c19748y.f62527q0.f62440E0.f62460a;
                    size = r10.size();
                    while (i10 < size) {
                        c19738o2 = (C19738o) r10.get(i10);
                        if (AbstractC19736m.m20680b(c19738o2)) {
                            c19738o2.m20691a();
                        }
                    }
                    interfaceC20772r1.mo464a();
                } else {
                    interfaceC20772r1.onCancel();
                }
            }
            return C17296C.f55119a;
        } catch (CancellationException e10) {
            c0139p.onCancel();
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009b A[Catch: CancellationException -> 0x009e, TryCatch #0 {CancellationException -> 0x009e, blocks: (B:47:0x00d3, B:49:0x00db, B:51:0x00e8, B:53:0x00f4, B:54:0x00f7, B:55:0x00fa, B:56:0x00fe, B:30:0x0097, B:32:0x009b, B:35:0x00a0, B:38:0x00a6, B:40:0x00af, B:41:0x00b3, B:43:0x00b7, B:44:0x00bc, B:27:0x0085), top: B:63:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6 A[Catch: CancellationException -> 0x009e, TryCatch #0 {CancellationException -> 0x009e, blocks: (B:47:0x00d3, B:49:0x00db, B:51:0x00e8, B:53:0x00f4, B:54:0x00f7, B:55:0x00fa, B:56:0x00fe, B:30:0x0097, B:32:0x009b, B:35:0x00a0, B:38:0x00a6, B:40:0x00af, B:41:0x00b3, B:43:0x00b7, B:44:0x00bc, B:27:0x0085), top: B:63:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00af A[Catch: CancellationException -> 0x009e, TryCatch #0 {CancellationException -> 0x009e, blocks: (B:47:0x00d3, B:49:0x00db, B:51:0x00e8, B:53:0x00f4, B:54:0x00f7, B:55:0x00fa, B:56:0x00fe, B:30:0x0097, B:32:0x009b, B:35:0x00a0, B:38:0x00a6, B:40:0x00af, B:41:0x00b3, B:43:0x00b7, B:44:0x00bc, B:27:0x0085), top: B:63:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3 A[Catch: CancellationException -> 0x009e, TryCatch #0 {CancellationException -> 0x009e, blocks: (B:47:0x00d3, B:49:0x00db, B:51:0x00e8, B:53:0x00f4, B:54:0x00f7, B:55:0x00fa, B:56:0x00fe, B:30:0x0097, B:32:0x009b, B:35:0x00a0, B:38:0x00a6, B:40:0x00af, B:41:0x00b3, B:43:0x00b7, B:44:0x00bc, B:27:0x0085), top: B:63:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7 A[Catch: CancellationException -> 0x009e, TryCatch #0 {CancellationException -> 0x009e, blocks: (B:47:0x00d3, B:49:0x00db, B:51:0x00e8, B:53:0x00f4, B:54:0x00f7, B:55:0x00fa, B:56:0x00fe, B:30:0x0097, B:32:0x009b, B:35:0x00a0, B:38:0x00a6, B:40:0x00af, B:41:0x00b3, B:43:0x00b7, B:44:0x00bc, B:27:0x0085), top: B:63:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db A[Catch: CancellationException -> 0x009e, TryCatch #0 {CancellationException -> 0x009e, blocks: (B:47:0x00d3, B:49:0x00db, B:51:0x00e8, B:53:0x00f4, B:54:0x00f7, B:55:0x00fa, B:56:0x00fe, B:30:0x0097, B:32:0x009b, B:35:0x00a0, B:38:0x00a6, B:40:0x00af, B:41:0x00b3, B:43:0x00b7, B:44:0x00bc, B:27:0x0085), top: B:63:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8 A[Catch: CancellationException -> 0x009e, TryCatch #0 {CancellationException -> 0x009e, blocks: (B:47:0x00d3, B:49:0x00db, B:51:0x00e8, B:53:0x00f4, B:54:0x00f7, B:55:0x00fa, B:56:0x00fe, B:30:0x0097, B:32:0x009b, B:35:0x00a0, B:38:0x00a6, B:40:0x00af, B:41:0x00b3, B:43:0x00b7, B:44:0x00bc, B:27:0x0085), top: B:63:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4 A[Catch: CancellationException -> 0x009e, TryCatch #0 {CancellationException -> 0x009e, blocks: (B:47:0x00d3, B:49:0x00db, B:51:0x00e8, B:53:0x00f4, B:54:0x00f7, B:55:0x00fa, B:56:0x00fe, B:30:0x0097, B:32:0x009b, B:35:0x00a0, B:38:0x00a6, B:40:0x00af, B:41:0x00b3, B:43:0x00b7, B:44:0x00bc, B:27:0x0085), top: B:63:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fe A[Catch: CancellationException -> 0x009e, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x009e, blocks: (B:47:0x00d3, B:49:0x00db, B:51:0x00e8, B:53:0x00f4, B:54:0x00f7, B:55:0x00fa, B:56:0x00fe, B:30:0x0097, B:32:0x009b, B:35:0x00a0, B:38:0x00a6, B:40:0x00af, B:41:0x00b3, B:43:0x00b7, B:44:0x00bc, B:27:0x0085), top: B:63:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: o */
    public static final Object m2626o(C19748y c19748y, C0139p c0139p, C19729f c19729f, AbstractC19685a abstractC19685a) {
        C1778L c1778l;
        InterfaceC20772r0 interfaceC20772r0;
        C19738o c19738o;
        long j10;
        C16524A c16524a;
        Object objM20699f;
        EnumC1808i enumC1808i;
        ?? r6;
        int size;
        int i10;
        C19738o c19738o2;
        C19748y c19748y2 = c19748y;
        if (abstractC19685a instanceof C1778L) {
            c1778l = (C1778L) abstractC19685a;
            int i11 = c1778l.f5089s0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1778l.f5089s0 = i11 - Integer.MIN_VALUE;
            } else {
                c1778l = new C1778L(abstractC19685a);
            }
        } else {
            c1778l = new C1778L(abstractC19685a);
        }
        Object objM18526j = c1778l.f5088r0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c1778l.f5089s0;
        C17296C c17296c = C17296C.f55119a;
        if (i12 != 0) {
            if (i12 == 1) {
                j10 = c1778l.f5087q0;
                C16524A c16524a2 = c1778l.f5086p0;
                c19738o = c1778l.f5085o0;
                InterfaceC20772r0 interfaceC20772r1 = c1778l.f5084Z;
                C19748y c19748y3 = c1778l.f5083Y;
                try {
                    AbstractC9233X.m9807c(objM18526j);
                    interfaceC20772r0 = interfaceC20772r1;
                    objM20699f = objM18526j;
                    c16524a = c16524a2;
                    c19748y2 = c19748y3;
                    enumC1808i = (EnumC1808i) objM20699f;
                    if (enumC1808i == null) {
                        enumC1808i = EnumC1808i.f5207o0;
                    }
                    if (enumC1808i != EnumC1808i.f5208p0) {
                        interfaceC20772r0.mo465b(c19738o.f62480c);
                        if (enumC1808i == EnumC1808i.f5205Y) {
                            interfaceC20772r0.mo464a();
                        } else {
                            if (enumC1808i == EnumC1808i.f5206Z) {
                                interfaceC20772r0.mo468e(c16524a.f51261Y);
                            }
                            C1776J c1776j = new C1776J(interfaceC20772r0, 2);
                            c1778l.f5083Y = c19748y2;
                            c1778l.f5084Z = interfaceC20772r0;
                            c1778l.f5085o0 = null;
                            c1778l.f5086p0 = null;
                            c1778l.f5089s0 = 2;
                            objM18526j = AbstractC16750j0.m18526j(c19748y2, j10, c1776j, c1778l);
                            if (objM18526j == enumC19250a) {
                                return enumC19250a;
                            }
                            if (((Boolean) objM18526j).booleanValue()) {
                                r6 = c19748y2.f62527q0.f62440E0.f62460a;
                                size = r6.size();
                                for (i10 = 0; i10 < size; i10++) {
                                    c19738o2 = (C19738o) r6.get(i10);
                                    if (AbstractC19736m.m20680b(c19738o2)) {
                                        c19738o2.m20691a();
                                    }
                                }
                                interfaceC20772r0.mo464a();
                            } else {
                                interfaceC20772r0.onCancel();
                            }
                        }
                    }
                } catch (CancellationException e10) {
                    e = e10;
                    interfaceC20772r0 = interfaceC20772r1;
                }
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC20772r0 interfaceC20772r2 = c1778l.f5084Z;
                c19748y2 = c1778l.f5083Y;
                try {
                    AbstractC9233X.m9807c(objM18526j);
                    interfaceC20772r0 = interfaceC20772r2;
                    if (((Boolean) objM18526j).booleanValue()) {
                        r6 = c19748y2.f62527q0.f62440E0.f62460a;
                        size = r6.size();
                        while (i10 < size) {
                            c19738o2 = (C19738o) r6.get(i10);
                            if (AbstractC19736m.m20680b(c19738o2)) {
                                c19738o2.m20691a();
                            }
                        }
                        interfaceC20772r0.mo464a();
                    } else {
                        interfaceC20772r0.onCancel();
                    }
                } catch (CancellationException e11) {
                    e = e11;
                    interfaceC20772r0 = interfaceC20772r2;
                }
            }
            interfaceC20772r0.onCancel();
            throw e;
        }
        AbstractC9233X.m9807c(objM18526j);
        try {
            c19738o = (C19738o) AbstractC17680n.m19341Q(c19729f.f62460a);
            j10 = c19738o.f62478a;
            c16524a = new C16524A();
            c16524a.f51261Y = 9205357640488583168L;
            long jMo499b = c19748y.m20697d().mo499b();
            C1779M c1779m = new C1779M(j10, c16524a, null);
            c1778l.f5083Y = c19748y2;
            interfaceC20772r0 = c0139p;
            try {
                c1778l.f5084Z = interfaceC20772r0;
                c1778l.f5085o0 = c19738o;
                c1778l.f5086p0 = c16524a;
                c1778l.f5087q0 = j10;
                c1778l.f5089s0 = 1;
                objM20699f = c19748y.m20699f(jMo499b, c1779m, c1778l);
                if (objM20699f == enumC19250a) {
                    return enumC19250a;
                }
                enumC1808i = (EnumC1808i) objM20699f;
                if (enumC1808i == null) {
                    enumC1808i = EnumC1808i.f5207o0;
                }
                if (enumC1808i != EnumC1808i.f5208p0) {
                    interfaceC20772r0.mo465b(c19738o.f62480c);
                    if (enumC1808i == EnumC1808i.f5205Y) {
                        interfaceC20772r0.mo464a();
                    } else {
                        if (enumC1808i == EnumC1808i.f5206Z) {
                            interfaceC20772r0.mo468e(c16524a.f51261Y);
                        }
                        C1776J c1776j2 = new C1776J(interfaceC20772r0, 2);
                        c1778l.f5083Y = c19748y2;
                        c1778l.f5084Z = interfaceC20772r0;
                        c1778l.f5085o0 = null;
                        c1778l.f5086p0 = null;
                        c1778l.f5089s0 = 2;
                        objM18526j = AbstractC16750j0.m18526j(c19748y2, j10, c1776j2, c1778l);
                        if (objM18526j == enumC19250a) {
                            return enumC19250a;
                        }
                        if (((Boolean) objM18526j).booleanValue()) {
                            r6 = c19748y2.f62527q0.f62440E0.f62460a;
                            size = r6.size();
                            while (i10 < size) {
                                c19738o2 = (C19738o) r6.get(i10);
                                if (AbstractC19736m.m20680b(c19738o2)) {
                                    c19738o2.m20691a();
                                }
                            }
                            interfaceC20772r0.mo464a();
                        } else {
                            interfaceC20772r0.onCancel();
                        }
                    }
                }
            } catch (CancellationException e12) {
                e = e12;
            }
        } catch (CancellationException e13) {
            e = e13;
            interfaceC20772r0 = c0139p;
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: p */
    public static final C1822p m2627p(InterfaceC1784S interfaceC1784S, C1820o c1820o, C1822p c1822p) {
        int i10 = 0;
        int i11 = interfaceC1784S.mo2573a() ? c1820o.f5237c : c1820o.f5238d;
        if ((interfaceC1784S.mo2573a() ? interfaceC1784S.mo2585m() : interfaceC1784S.mo2580h()) != c1820o.f5236b) {
            return c1820o.m2646a(i11);
        }
        EnumC17307j enumC17307j = EnumC17307j.f55134Z;
        InterfaceC17306i interfaceC17306iM9799b = AbstractC9227W.m9799b(enumC17307j, new C1832u(c1820o, i11, i10));
        InterfaceC17306i interfaceC17306iM9799b2 = AbstractC9227W.m9799b(enumC17307j, new C1830t(c1820o, i11, interfaceC1784S.mo2573a() ? c1820o.f5238d : c1820o.f5237c, interfaceC1784S, interfaceC17306iM9799b));
        if (c1820o.f5235a != c1822p.f5255c) {
            return (C1822p) interfaceC17306iM9799b2.getValue();
        }
        int i12 = c1820o.f5239e;
        if (i11 == i12) {
            return c1822p;
        }
        C3578I c3578i = c1820o.f5240f;
        if (((Number) interfaceC17306iM9799b.getValue()).intValue() != c3578i.m4257g(i12)) {
            return (C1822p) interfaceC17306iM9799b2.getValue();
        }
        int i13 = c1822p.f5254b;
        long jM4263m = c3578i.m4263m(i13);
        boolean zMo2573a = interfaceC1784S.mo2573a();
        if (i12 != -1) {
            if (i11 != i12) {
                if (((zMo2573a ? 1 : 0) ^ (c1820o.m2647b() == 1 ? 1 : 0)) == 0) {
                }
            }
            return c1820o.m2646a(i11);
        }
        int i14 = C3581L.f10907c;
        return (i13 == ((int) (jM4263m >> 32)) || i13 == ((int) (jM4263m & 4294967295L))) ? (C1822p) interfaceC17306iM9799b2.getValue() : c1820o.m2646a(i11);
    }

    /* JADX INFO: renamed from: q */
    public static final C1822p m2628q(C1820o c1820o, boolean z6, boolean z10, int i10, InterfaceC1806h interfaceC1806h) {
        long j10;
        int i11 = z10 ? c1820o.f5237c : c1820o.f5238d;
        if (i10 != c1820o.f5236b) {
            return c1820o.m2646a(i11);
        }
        long jMo2605a = interfaceC1806h.mo2605a(c1820o, i11);
        if (z6 ^ z10) {
            int i12 = C3581L.f10907c;
            j10 = jMo2605a >> 32;
        } else {
            int i13 = C3581L.f10907c;
            j10 = 4294967295L & jMo2605a;
        }
        return c1820o.m2646a((int) j10);
    }

    /* JADX INFO: renamed from: r */
    public static final int m2629r(int i10, int i11, C1785T c1785t, long j10, C1822p c1822p) {
        if (c1822p == null) {
            return m2610E(i10, i11);
        }
        int iCompare = c1785t.f5112f.compare(Long.valueOf(c1822p.f5255c), Long.valueOf(j10));
        if (iCompare < 0) {
            return 1;
        }
        return iCompare > 0 ? 3 : 2;
    }

    /* JADX INFO: renamed from: s */
    public static final C1822p m2630s(C1822p c1822p, C1820o c1820o, int i10) {
        return new C1822p(c1820o.f5240f.m4251a(i10), i10, c1822p.f5255c);
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m2631t(long j10, C13801c c13801c) {
        float fM15306g = C13800b.m15306g(j10);
        if (c13801c.f43586a <= fM15306g && fM15306g <= c13801c.f43588c) {
            float fM15307h = C13800b.m15307h(j10);
            if (c13801c.f43587b <= fM15307h && fM15307h <= c13801c.f43589d) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX INFO: renamed from: u */
    public static final C14351g m2632u(C13257c c13257c, float f10) {
        C16037b c16037b;
        int iCeil = ((int) Math.ceil(f10)) * 2;
        C14351g c14351gM15628f = f5202b;
        C14347c c14347cM15623a = f5203c;
        C16037b c16037b2 = f5204d;
        if (c14351gM15628f == null || c14347cM15623a == null) {
            c14351gM15628f = AbstractC14334L.m15628f(iCeil, iCeil, 1);
            f5202b = c14351gM15628f;
            c14347cM15623a = AbstractC14334L.m15623a(c14351gM15628f);
            f5203c = c14347cM15623a;
        } else {
            Bitmap bitmap = c14351gM15628f.f45036a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                c14351gM15628f = AbstractC14334L.m15628f(iCeil, iCeil, 1);
                f5202b = c14351gM15628f;
                c14347cM15623a = AbstractC14334L.m15623a(c14351gM15628f);
                f5203c = c14347cM15623a;
            }
        }
        C14351g c14351g = c14351gM15628f;
        C14347c c14347c = c14347cM15623a;
        if (c16037b2 == null) {
            c16037b = new C16037b();
            f5204d = c16037b;
        } else {
            c16037b = c16037b2;
        }
        EnumC7546k layoutDirection = c13257c.f41873Y.getLayoutDirection();
        Bitmap bitmap2 = c14351g.f45036a;
        long jM8603a = AbstractC8112i6.m8603a(bitmap2.getWidth(), bitmap2.getHeight());
        C16036a c16036a = c16037b.f49478Y;
        InterfaceC7537b interfaceC7537b = c16036a.f49474a;
        EnumC7546k enumC7546k = c16036a.f49475b;
        InterfaceC14362r interfaceC14362r = c16036a.f49476c;
        long j10 = c16036a.f49477d;
        c16036a.f49474a = c13257c;
        c16036a.f49475b = layoutDirection;
        c16036a.f49476c = c14347c;
        c16036a.f49477d = jM8603a;
        c14347c.mo15706e();
        C16037b c16037b3 = c16037b;
        AbstractC14376f.m15850p(c16037b3, C14365u.f45052b, 0L, c16037b.f49479Z.m15202x(), 0.0f, 58);
        AbstractC14376f.m15850p(c16037b3, AbstractC14334L.m15626d(4278190080L), 0L, AbstractC8112i6.m8603a(f10, f10), 0.0f, 120);
        C16037b c16037b4 = c16037b;
        c16037b4.mo17591U(AbstractC14334L.m15626d(4278190080L), (112 & 2) != 0 ? C13803e.m15332d(c16037b4.mo17602i()) / 2.0f : f10, (112 & 4) != 0 ? c16037b4.mo17604o0() : AbstractC8088f6.m8536b(f10, f10), (112 & 8) != 0 ? 1.0f : 0.0f, (112 & 16) != 0 ? C16042g.f49483a : null, null, 3);
        c14347c.mo15719r();
        c16036a.f49474a = interfaceC7537b;
        c16036a.f49475b = enumC7546k;
        c16036a.f49476c = interfaceC14362r;
        c16036a.f49477d = j10;
        return c14351g;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m2633v(InterfaceC0161D1 interfaceC0161D1, C19738o c19738o, C19738o c19738o2) {
        return C13800b.m15304e(C13800b.m15310k(c19738o.f62480c, c19738o2.f62480c)) < AbstractC16750j0.m18529m(interfaceC0161D1, c19738o.f62486i);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0004  */
    /* JADX INFO: renamed from: w */
    public static final C1824q m2634w(C1824q c1824q, InterfaceC1784S interfaceC1784S) {
        boolean z6;
        boolean z10 = false;
        if (c1824q == null) {
            z6 = true;
        } else {
            C1822p c1822p = c1824q.f5257a;
            long j10 = c1822p.f5255c;
            C1822p c1822p2 = c1824q.f5258b;
            if (j10 != c1822p2.f5255c) {
                boolean z11 = c1824q.f5259c;
                if ((z11 ? c1822p : c1822p2).f5254b == 0) {
                    if (z11) {
                        c1822p = c1822p2;
                    }
                    if (interfaceC1784S.mo2577e().f5240f.f10892a.f10882a.f10934Y.length() == c1822p.f5254b) {
                        C16556x c16556x = new C16556x();
                        c16556x.f51285Y = true;
                        interfaceC1784S.mo2579g(new C1786U(c16556x, 0));
                        z6 = c16556x.f51285Y;
                    }
                }
            } else if (c1822p.f5254b == c1822p2.f5254b) {
                z6 = true;
            }
            z6 = false;
        }
        if (!z6) {
            return c1824q;
        }
        String str = interfaceC1784S.mo2575c().f5240f.f10892a.f10882a.f10934Y;
        if (interfaceC1784S.mo2574b() > 1 || interfaceC1784S.mo2576d() == null) {
            return c1824q;
        }
        if (str.length() == 0) {
            return c1824q;
        }
        C1820o c1820oMo2575c = interfaceC1784S.mo2575c();
        String str2 = c1820oMo2575c.f5240f.f10892a.f10882a.f10934Y;
        int length = str2.length();
        int i10 = c1820oMo2575c.f5237c;
        if (i10 == 0) {
            int iM21278s = AbstractC20740b0.m21278s(0, str2);
            return interfaceC1784S.mo2573a() ? C1824q.m2653a(c1824q, m2630s(c1824q.f5257a, c1820oMo2575c, iM21278s), null, true, 2) : C1824q.m2653a(c1824q, null, m2630s(c1824q.f5258b, c1820oMo2575c, iM21278s), false, 1);
        }
        if (i10 == length) {
            int iM21281v = AbstractC20740b0.m21281v(length, str2);
            return interfaceC1784S.mo2573a() ? C1824q.m2653a(c1824q, m2630s(c1824q.f5257a, c1820oMo2575c, iM21281v), null, false, 2) : C1824q.m2653a(c1824q, null, m2630s(c1824q.f5258b, c1820oMo2575c, iM21281v), true, 1);
        }
        C1824q c1824qMo2576d = interfaceC1784S.mo2576d();
        if (c1824qMo2576d != null && c1824qMo2576d.f5259c) {
            z10 = true;
        }
        int iM21281v2 = interfaceC1784S.mo2573a() ^ z10 ? AbstractC20740b0.m21281v(i10, str2) : AbstractC20740b0.m21278s(i10, str2);
        return interfaceC1784S.mo2573a() ? C1824q.m2653a(c1824q, m2630s(c1824q.f5257a, c1820oMo2575c, iM21281v2), null, z10, 2) : C1824q.m2653a(c1824q, null, m2630s(c1824q.f5258b, c1820oMo2575c, iM21281v2), z10, 1);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0115  */
    /* JADX INFO: renamed from: x */
    public static final long m2635x(C1803f0 c1803f0, long j10, C1822p c1822p) {
        InterfaceC21098s interfaceC21098s;
        InterfaceC21098s interfaceC21098sM2644c;
        int iM2643b;
        long jM9365b;
        int iM4257g;
        int iM4257g2;
        float fM8920k;
        float fM4310b;
        int iM4257g3;
        C1816m c1816m = (C1816m) c1803f0.f5178a.f5244c.m14712e(c1822p.f5255c);
        if (c1816m == null || (interfaceC21098s = c1803f0.f5188k) == null || (interfaceC21098sM2644c = c1816m.m2644c()) == null) {
            return 9205357640488583168L;
        }
        C1494g c1494g = c1816m.f5229c;
        C3578I c3578i = (C3578I) c1494g.invoke();
        int iM2643b2 = c3578i == null ? 0 : c1816m.m2643b(c3578i);
        int i10 = c1822p.f5254b;
        if (i10 > iM2643b2) {
            return 9205357640488583168L;
        }
        C13800b c13800b = (C13800b) c1803f0.f5194q.getValue();
        AbstractC16544l.m18091d(c13800b);
        float fM15306g = C13800b.m15306g(interfaceC21098sM2644c.mo21521e(interfaceC21098s, c13800b.f43584a));
        C3578I c3578i2 = (C3578I) c1494g.invoke();
        if (c3578i2 != null && (iM2643b = c1816m.m2643b(c3578i2)) >= 1) {
            int iM4257g4 = c3578i2.m4257g(AbstractC8301I.m8921l(i10, 0, iM2643b - 1));
            jM9365b = AbstractC8676n.m9365b(c3578i2.m4260j(iM4257g4), c3578i2.m4256f(iM4257g4, true));
        } else {
            jM9365b = C3581L.f10906b;
        }
        if (C3581L.m4267c(jM9365b)) {
            C3578I c3578i3 = (C3578I) c1494g.invoke();
            fM8920k = (c3578i3 != null && (iM4257g3 = c3578i3.m4257g(i10)) < c3578i3.f10893b.f10963f) ? c3578i3.m4258h(iM4257g3) : -1.0f;
        } else {
            int i11 = (int) (jM9365b >> 32);
            C3578I c3578i4 = (C3578I) c1494g.invoke();
            float fM4258h = (c3578i4 != null && (iM4257g = c3578i4.m4257g(i11)) < c3578i4.f10893b.f10963f) ? c3578i4.m4258h(iM4257g) : -1.0f;
            int i12 = ((int) (4294967295L & jM9365b)) - 1;
            C3578I c3578i5 = (C3578I) c1494g.invoke();
            float fM4259i = (c3578i5 != null && (iM4257g2 = c3578i5.m4257g(i12)) < c3578i5.f10893b.f10963f) ? c3578i5.m4259i(iM4257g2) : -1.0f;
            fM8920k = AbstractC8301I.m8920k(fM15306g, Math.min(fM4258h, fM4259i), Math.max(fM4258h, fM4259i));
        }
        if (fM8920k == -1.0f) {
            return 9205357640488583168L;
        }
        if (!C7545j.m7886a(j10, 0L) && Math.abs(fM15306g - fM8920k) > ((int) (j10 >> 32)) / 2) {
            return 9205357640488583168L;
        }
        C3578I c3578i6 = (C3578I) c1494g.invoke();
        if (c3578i6 == null) {
            fM4310b = -1.0f;
        } else {
            int iM4257g5 = c3578i6.m4257g(i10);
            C3599o c3599o = c3578i6.f10893b;
            if (iM4257g5 >= c3599o.f10963f) {
                fM4310b = -1.0f;
            } else {
                float fM4312d = c3599o.m4312d(iM4257g5);
                fM4310b = ((c3599o.m4310b(iM4257g5) - fM4312d) / 2) + fM4312d;
            }
        }
        if (fM4310b == -1.0f) {
            return 9205357640488583168L;
        }
        return interfaceC21098s.mo21521e(interfaceC21098sM2644c, AbstractC8088f6.m8536b(fM8920k, fM4310b));
    }

    /* JADX INFO: renamed from: y */
    public static final int m2636y(long j10, C3578I c3578i) {
        if (C13800b.m15307h(j10) <= 0.0f) {
            return 0;
        }
        float fM15307h = C13800b.m15307h(j10);
        C3599o c3599o = c3578i.f10893b;
        return fM15307h >= c3599o.f10962e ? c3578i.f10892a.f10882a.f10934Y.length() : c3599o.m4313e(j10);
    }

    /* JADX INFO: renamed from: z */
    public static final long m2637z(C3578I c3578i, int i10, boolean z6, boolean z10) {
        int iM4257g = c3578i.m4257g(i10);
        C3599o c3599o = c3578i.f10893b;
        if (iM4257g >= c3599o.f10963f) {
            return 9205357640488583168L;
        }
        float fM4255e = c3578i.m4255e(i10, c3578i.m4251a(((!z6 || z10) && (z6 || !z10)) ? Math.max(i10 + (-1), 0) : i10) == c3578i.m4261k(i10));
        long j10 = c3578i.f10894c;
        return AbstractC8088f6.m8536b(AbstractC8301I.m8920k(fM4255e, 0.0f, (int) (j10 >> 32)), AbstractC8301I.m8920k(c3599o.m4310b(iM4257g), 0.0f, (int) (j10 & 4294967295L)));
    }
}
