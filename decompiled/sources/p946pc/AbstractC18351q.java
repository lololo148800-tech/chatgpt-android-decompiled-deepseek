package p946pc;

import androidx.compose.foundation.layout.AbstractC10842a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p080D0.AbstractC1807h0;
import p080D0.C1834v;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2452G;
import p229J0.C4108p0;
import p254K0.C4515l;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6037x;
import p349O0.C6042z0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p382Pf.C6401d;
import p492U1.C7548m;
import p492U1.InterfaceC7537b;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p571X9.AbstractC9119D4;
import p635a1.C10456n;
import p911o0.C17767k0;
import p988rc.C18918f;

/* JADX INFO: renamed from: pc.q */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18351q {

    /* JADX INFO: renamed from: a */
    public static final long f58590a = AbstractC9119D4.m9650c(8);

    /* JADX INFO: renamed from: b */
    public static final long f58591b = AbstractC9119D4.m9650c(4);

    /* JADX INFO: renamed from: c */
    public static final long f58592c = AbstractC9119D4.m9650c(4);

    /* JADX INFO: renamed from: d */
    public static final C18335a f58593d = C18335a.f58530s0;

    /* JADX INFO: renamed from: e */
    public static final C18335a f58594e = C18335a.f58531t0;

    /* JADX INFO: renamed from: f */
    public static final C6037x f58595f = new C6037x(C18346l.f58568Z, C5975S.f19448r0);

    /* JADX INFO: renamed from: a */
    public static final void m19857a(C18320E c18320e, EnumC18358x enumC18358x, InterfaceC5985X interfaceC5985X, C18918f c18918f, List list, C8410b c8410b, C6021p c6021p, int i10) {
        AbstractC16544l.m18094g(c18320e, "<this>");
        c6021p.m6526U(2050937183);
        C18357w c18357w = AbstractC18322G.m19850c(AbstractC18322G.m19849b(c18320e, c6021p)).f58483c;
        AbstractC16544l.m18091d(c18357w);
        InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
        C7548m c7548m = c18357w.f58612a;
        AbstractC16544l.m18091d(c7548m);
        float fMo7870w = interfaceC7537b.mo7870w(c7548m.f23910a);
        C7548m c7548m2 = c18357w.f58613b;
        AbstractC16544l.m18091d(c7548m2);
        float fMo7870w2 = interfaceC7537b.mo7870w(c7548m2.f23910a);
        C7548m c7548m3 = c18357w.f58614c;
        AbstractC16544l.m18091d(c7548m3);
        float fMo7870w3 = interfaceC7537b.mo7870w(c7548m3.f23910a);
        int iIntValue = ((Number) c6021p.m6548k(f58595f)).intValue();
        m19858b(list.size(), fMo7870w3, AbstractC10842a.m11225c(fMo7870w, 0.0f, fMo7870w2, 0.0f, 10), AbstractC8411c.m8968b(1428257390, c6021p, new C18345k(c18918f, interfaceC5985X, enumC18358x, c18357w, c18320e, iIntValue)), AbstractC8411c.m8968b(676708237, c6021p, new C4515l(iIntValue, 1, c18320e, c18357w, c8410b, list)), c6021p, 27648);
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2452G(c18320e, enumC18358x, interfaceC5985X, c18918f, list, c8410b, i10, 15);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19858b(int i10, float f10, C17767k0 c17767k0, C8410b c8410b, C8410b c8410b2, C6021p c6021p, int i11) {
        c6021p.m6526U(-1676804316);
        int i12 = (i11 & 14) == 0 ? (c6021p.m6538d(i10) ? 4 : 2) | i11 : i11;
        if ((i11 & 112) == 0) {
            i12 |= c6021p.m6536c(f10) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= c6021p.m6542f(c17767k0) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= c6021p.m6545h(c8410b) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= c6021p.m6545h(c8410b2) ? 16384 : 8192;
        }
        if ((46811 & i12) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6525T(1580663618);
            boolean zM6538d = c6021p.m6538d(i10) | c6021p.m6536c(f10);
            Object objM6514H = c6021p.m6514H();
            if (zM6538d || objM6514H == C6013l.f19514a) {
                objM6514H = new C18348n(i10, f10);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC21057K interfaceC21057K = (InterfaceC21057K) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6525T(-1323940314);
            C10456n c10456n = C10456n.f30959Y;
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            C8410b c8410bM21570k = AbstractC21075b0.m21570k(c10456n);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057K);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            c8410bM21570k.invoke(new C6042z0(c6021p), c6021p, 0);
            c6021p.m6525T(2058660585);
            AbstractC1807h0.m2612a(AbstractC8411c.m8968b(-1982761748, c6021p, new C6401d(i10, c17767k0, c8410b)), c6021p, 6);
            c6021p.m6525T(-387431213);
            for (int i14 = 0; i14 < i10; i14++) {
                c8410b2.invoke(Integer.valueOf(i14), c6021p, Integer.valueOf((i12 >> 9) & 112));
            }
            c6021p.m6553p(false);
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            c6021p.m6553p(false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18349o(i10, f10, c17767k0, c8410b, c8410b2, i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m19859c(C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-258482833);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6545h(c8410b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C5997d.m6440a(f58595f.mo6405a(0), AbstractC8411c.m8968b(-1707728721, c6021p, new C4108p0(c8410b, 15)), c6021p, 56);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1834v(c8410b, i10, 6);
        }
    }
}
