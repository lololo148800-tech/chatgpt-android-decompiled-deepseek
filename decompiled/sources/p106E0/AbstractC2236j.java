package p106E0;

import androidx.compose.foundation.layout.AbstractC10844c;
import p003A1.AbstractC0187M0;
import p049Bm.InterfaceC1436k;
import p156G1.AbstractC2965l;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p544W9.AbstractC8455C;
import p561X.C8990d;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13725A;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13785r0;
import p758g0.C13733I;
import p758g0.C13736L;
import p758g0.C13737M;
import p758g0.C13738N;
import p758g0.C13739O;
import p758g0.C13783q0;
import p758g0.C13792v;
import p759g1.C13803e;
import p773h0.C14305r;
import p774h1.C14365u;
import p821j1.C16043h;
import p821j1.InterfaceC16039d;

/* JADX INFO: renamed from: E0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2236j {

    /* JADX INFO: renamed from: a */
    public static final float f6854a;

    /* JADX INFO: renamed from: b */
    public static final C13792v f6855b;

    static {
        int i10 = AbstractC2233g.f6837a;
        f6854a = 40;
        new C13792v(0.2f, 0.0f, 0.8f, 1.0f);
        new C13792v(0.4f, 0.0f, 1.0f, 1.0f);
        new C13792v(0.0f, 0.0f, 0.65f, 1.0f);
        new C13792v(0.1f, 0.0f, 0.45f, 1.0f);
        f6855b = new C13792v(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public static final void m3267a(float f10, int i10, int i11, long j10, long j11, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i12;
        int i13;
        long j12;
        int i14;
        int i15;
        int i16;
        long j13;
        c6021p.m6526U(-1119119072);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6540e(j10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6536c(f10) ? 256 : 128;
        }
        int i17 = i12 | 3072;
        if ((i11 & 24576) == 0) {
            i17 = i12 | 11264;
        }
        if ((i17 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            i16 = i10;
            j13 = j11;
        } else {
            c6021p.m6519N();
            if ((i11 & 1) == 0 || c6021p.m6561x()) {
                i13 = i17 & (-57345);
                j12 = C14365u.f45059i;
                i14 = 2;
            } else {
                c6021p.m6517L();
                i14 = i10;
                j12 = j11;
                i13 = i17 & (-57345);
            }
            c6021p.m6554q();
            C16043h c16043h = new C16043h(((InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f)).mo7864b0(f10), 0.0f, i14, 0, 26);
            C13736L c13736lM15253r = AbstractC13758e.m15253r(null, c6021p, 1);
            C13783q0 c13783q0 = AbstractC13785r0.f43529b;
            C8990d c8990d = AbstractC13725A.f43291d;
            int i18 = i13;
            C13733I c13733iM15245j = AbstractC13758e.m15245j(c13736lM15253r, 0, 5, c13783q0, AbstractC13758e.m15252q(AbstractC13758e.m15255t(6660, 0, c8990d, 2), 0, 6), null, c6021p, 33208, 16);
            C13733I c13733iM15242g = AbstractC13758e.m15242g(c13736lM15253r, 0.0f, 286.0f, AbstractC13758e.m15252q(AbstractC13758e.m15255t(1332, 0, c8990d, 2), 0, 6), null, c6021p, 4536, 8);
            C13738N c13738n = new C13738N();
            c13738n.f43326a = 1332;
            C13737M c13737mM15216a = c13738n.m15216a(Float.valueOf(0.0f), 0);
            C13792v c13792v = f6855b;
            c13737mM15216a.f43324b = c13792v;
            c13738n.m15216a(Float.valueOf(290.0f), 666);
            C13733I c13733iM15242g2 = AbstractC13758e.m15242g(c13736lM15253r, 0.0f, 290.0f, AbstractC13758e.m15252q(new C13739O(c13738n), 0, 6), null, c6021p, 4536, 8);
            C13738N c13738n2 = new C13738N();
            c13738n2.f43326a = 1332;
            c13738n2.m15216a(Float.valueOf(0.0f), 666).f43324b = c13792v;
            c13738n2.m15216a(Float.valueOf(290.0f), c13738n2.f43326a);
            C13733I c13733iM15242g3 = AbstractC13758e.m15242g(c13736lM15253r, 0.0f, 290.0f, AbstractC13758e.m15252q(new C13739O(c13738n2), 0, 6), null, c6021p, 4536, 8);
            InterfaceC10459q interfaceC10459qM11252l = AbstractC10844c.m11252l(AbstractC2965l.m3789a(interfaceC10459q, true, C14305r.f44910q0), f6854a);
            boolean zM6545h = ((i18 & 896) == 256) | ((i18 & 7168) == 2048) | c6021p.m6545h(r26) | c6021p.m6542f(c13733iM15245j) | c6021p.m6542f(c13733iM15242g2) | c6021p.m6542f(c13733iM15242g3) | c6021p.m6542f(c13733iM15242g) | ((((i18 & 112) ^ 48) > 32 && c6021p.m6540e(j10)) || (i18 & 48) == 32);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                i15 = 0;
                Object c2234h = new C2234h(j12, c16043h, f10, j10, c13733iM15245j, c13733iM15242g2, c13733iM15242g3, c13733iM15242g);
                c6021p.m6537c0(c2234h);
                objM6514H = c2234h;
            } else {
                i15 = 0;
            }
            AbstractC8455C.m9069a(i15, (InterfaceC1436k) objM6514H, c6021p, interfaceC10459qM11252l);
            i16 = i14;
            j13 = j12;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2235i(interfaceC10459q, j10, f10, j13, i16, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3268b(InterfaceC16039d interfaceC16039d, float f10, float f11, long j10, C16043h c16043h) {
        float f12 = 2;
        float f13 = c16043h.f49484a / f12;
        float fM15333e = C13803e.m15333e(interfaceC16039d.mo17602i()) - (f12 * f13);
        interfaceC16039d.mo17606v(j10, f10, f11, AbstractC8088f6.m8536b(f13, f13), AbstractC8112i6.m8603a(fM15333e, fM15333e), (832 & 64) != 0 ? 1.0f : 0.0f, c16043h, null, 3);
    }
}
