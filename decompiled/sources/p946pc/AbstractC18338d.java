package p946pc;

import androidx.compose.foundation.layout.AbstractC10842a;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p1095x1.AbstractC21075b0;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p228J.AbstractC3794B0;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6042z0;
import p349O0.InterfaceC6008i0;
import p382Pf.C6401d;
import p492U1.C7548m;
import p492U1.InterfaceC7537b;
import p537W0.C8410b;
import p635a1.C10456n;
import p658b5.AbstractC11235f;

/* JADX INFO: renamed from: pc.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18338d {

    /* JADX INFO: renamed from: a */
    public static final C18336b f58540a = new C18336b();

    /* JADX INFO: renamed from: a */
    public static final void m19854a(C18320E c18320e, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(c18320e, "<this>");
        c6021p.m6526U(1874604858);
        if ((i10 & 14) == 0) {
            i11 = (c6021p.m6542f(c18320e) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int i12 = i11 & 14;
            C18336b c18336b = AbstractC18322G.m19850c(AbstractC18322G.m19849b(c18320e, c6021p)).f58484d;
            AbstractC16544l.m18091d(c18336b);
            c6021p.m6525T(831269728);
            InterfaceC7537b interfaceC7537b = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            C7548m c7548m = AbstractC18322G.m19850c(AbstractC18322G.m19849b(c18320e, c6021p)).f58481a;
            AbstractC16544l.m18091d(c7548m);
            float fMo7870w = interfaceC7537b.mo7870w(c7548m.f23910a) / 2;
            c6021p.m6553p(false);
            C18337c c18337c = C18337c.f58539a;
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
            C5997d.m6439Z(C21698j.f68873f, c6021p, c18337c);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            c8410bM21570k.invoke(new C6042z0(c6021p), c6021p, 0);
            c6021p.m6525T(2058660585);
            c6021p.m6525T(-927654523);
            c18336b.m19853a(c18320e, c6021p, i12);
            c6021p.m6553p(false);
            AbstractC11235f.m12525a(AbstractC10842a.m11237o(c10456n, 0.0f, fMo7870w, 0.0f, fMo7870w, 5), null, c8410b, c6021p, (i11 << 3) & 896, 2);
            AbstractC3794B0.m4471F(c6021p, false, true, false);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(c18320e, c8410b, i10, 25);
        }
    }
}
