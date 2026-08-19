package p544W9;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p042Bf.C1275q;
import p042Bf.C1282x;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p069Cf.C1648g;
import p069Cf.C1650i;
import p1051v0.AbstractC20417e;
import p1071w0.C20748f0;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p204I1.C3582M;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p291Lf.AbstractC5005b;
import p291Lf.AbstractC5028y;
import p291Lf.C5009f;
import p291Lf.C5026w;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6016m0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p479Td.EnumC7359j0;
import p523V9.AbstractC8098h0;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9119D4;
import p571X9.AbstractC9262b4;
import p594Y9.AbstractC9781O3;
import p594Y9.AbstractC9818V;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10445c;
import p635a1.InterfaceC10459q;
import p654b1.EnumC11216j;
import p810ig.C14987f;
import p810ig.C14988g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17790w;

/* JADX INFO: renamed from: W9.e3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8626e3 {
    /* JADX INFO: renamed from: a */
    public static final void m9272a(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-722616011);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i11 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                AbstractC0168G.m537z(i11, c6021p, i11, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC5028y.m5652a(EnumC7359j0.f23343Z, null, AbstractC5005b.f16331a, c6021p, 390, 2);
            AbstractC5028y.m5652a(EnumC7359j0.f23344o0, null, AbstractC5005b.f16332b, c6021p, 390, 2);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q2, i10, 10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9273b(int i10, int i11, C6021p c6021p, InterfaceC10459q interfaceC10459q, String str) {
        int i12;
        String str2;
        c6021p.m6526U(312869846);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | 48;
        if ((i11 & 384) == 0) {
            i13 |= c6021p.m6538d(i10) ? 256 : 128;
        }
        int i14 = i13;
        if ((i14 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            str2 = str;
        } else {
            AbstractC4124r4.m4768b("", AbstractC9818V.m10458b(AbstractC9262b4.m9836a(AbstractC10844c.m11244d(interfaceC10459q, 1.0f), "".length() > 0), "".length() == 0, false, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, i10, i10, null, null, c6021p, 0, ((i14 << 3) & 7168) | ((i14 << 6) & 57344), 106492);
            str2 = null;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5009f(interfaceC10459q, str2, i10, i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9274c(InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, String str, int i10, C6021p c6021p, int i11) {
        int i12;
        boolean z6;
        int i13;
        int i14;
        c6021p.m6526U(-981663930);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6545h(interfaceC1426a) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c6021p.m6542f(str) ? 2048 : 1024;
        }
        int i15 = i12 | 24576;
        if ((i15 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            i14 = i10;
        } else {
            EnumC11216j enumC11216j = EnumC11216j.f33915V0;
            c6021p.m6524S(-1200403582);
            int i16 = i15 & 112;
            int i17 = 57344 & i15;
            boolean z10 = (i16 == 32) | (i17 == 16384);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            int i18 = 6;
            if (z10 || objM6514H == c5975s) {
                objM6514H = new C1650i(interfaceC1436k, i18, 4);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM8577i = AbstractC8098h0.m8577i(interfaceC10459q, enumC11216j, (InterfaceC1436k) objM6514H);
            C20748f0 c20748f0M21288a = C20748f0.m21288a(0, 3, 123);
            C3582M c3582mM4274b = C3582M.m4274b((C3582M) c6021p.m6548k(AbstractC4124r4.f13310a), 0L, AbstractC9119D4.m9650c(0), null, null, 0L, null, 0, 0, 0L, null, null, 16777213);
            c6021p.m6524S(-1200399547);
            if (i17 == 16384) {
                i13 = 32;
                z6 = true;
            } else {
                z6 = false;
                i13 = 32;
            }
            boolean z11 = (i16 == i13) | z6 | ((i15 & 896) == 256);
            Object objM6514H2 = c6021p.m6514H();
            if (z11 || objM6514H2 == c5975s) {
                objM6514H2 = new C6016m0(i18, interfaceC1436k, interfaceC1426a, 2);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC9781O3.m10394b(str, (InterfaceC1436k) objM6514H2, interfaceC10459qM8577i, false, false, c3582mM4274b, c20748f0M21288a, null, false, 0, 0, null, null, null, null, AbstractC8411c.m8969c(-227143692, c6021p, new C14988g(i18, 0, str)), c6021p, (i15 >> 9) & 14, 196608, 32664);
            i14 = 6;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1275q(interfaceC10459q, (Object) interfaceC1436k, (Object) interfaceC1426a, (Object) str, i14, i11, 11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9275d(char c9, boolean z6, C6021p c6021p, int i10) {
        int i11;
        long j10;
        long j11;
        int i12;
        c6021p.m6526U(1384899476);
        if ((i10 & 6) == 0) {
            Object objM6507A = c6021p.m6507A();
            if ((objM6507A instanceof Character) && c9 == ((Character) objM6507A).charValue()) {
                i12 = 2;
            } else {
                c6021p.m6539d0(Character.valueOf(c9));
                i12 = 4;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC10459q interfaceC10459qM11252l = AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7313q.f23205j);
            float f10 = 1;
            if (z6) {
                c6021p.m6524S(-1455451859);
                j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12213a;
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-1455373274);
                j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12188B;
                c6021p.m6553p(false);
            }
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(AbstractC8443A.m9045a(interfaceC10459qM11252l, f10, j10, AbstractC20417e.m21079a(AbstractC7313q.f23199d)), AbstractC7313q.f23198c);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30938q0, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11233k);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            String strValueOf = z6 ? "|" : String.valueOf(c9);
            if (z6) {
                c6021p.m6524S(782098038);
                j11 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12213a;
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(782168532);
                j11 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12235q;
                c6021p.m6553p(false);
            }
            AbstractC4124r4.m4768b(strValueOf, null, j11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131066);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C14987f(c9, z6, i10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9276e(int i10, int i11, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-792683381);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6538d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | 48;
        if ((i13 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            C5026w c5026w = (C5026w) c6021p.m6548k(AbstractC5028y.f16440a);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            InterfaceC10445c interfaceC10445c = c5026w.f16437e;
            InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(AbstractC10844c.m11244d(interfaceC10459q2, 1.0f), AbstractC7313q.f23201f, AbstractC7313q.f23199d);
            C17790w c17790wM19515a2 = AbstractC17788v.m19515a(c5026w.f16438f, interfaceC10445c, c6021p, 0);
            int i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11234l);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a2);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            m9273b(i10, (i13 << 6) & 896, c6021p, AbstractC10844c.m11244d(AbstractC10842a.m11237o(interfaceC10459q2, c5026w.f16433a, 0.0f, 0.0f, 0.0f, 14), c5026w.f16435c ? 0.78f : 1.0f), null);
            c6021p.m6553p(true);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1648g(i10, interfaceC10459q2, i11, 1);
        }
    }
}
