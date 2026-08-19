package p523V9;

import af.C10561Q;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import bf.C11349D;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17348o;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1051v0.AbstractC20417e;
import p1095x1.InterfaceC21057K;
import p1113xn.AbstractC21329w;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p130Eo.InterfaceC2621f;
import p228J.C3847l0;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p343Nk.C5817a;
import p349O0.AbstractC6012k0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p363Og.C6207k;
import p467T1.C7199i;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p527Ve.C8272i;
import p527Ve.C8273j;
import p582Xk.HXHG.bQBnquXS;
import p594Y9.AbstractC9809T2;
import p594Y9.AbstractC9815U2;
import p594Y9.AbstractC9818V;
import p594Y9.AbstractC9834X3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p706df.C13088h;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17790w;

/* JADX INFO: renamed from: V9.Z4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8039Z4 {
    /* JADX INFO: renamed from: a */
    public static final void m8399a(C11349D c11349d, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        C10843b c10843b = C10843b.f32509a;
        c6021p.m6526U(1851997696);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c10843b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c11349d) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11240a = c10843b.m11240a(c10456n, C10444b.f30938q0);
            C17756f c17756f = AbstractC17770m.f56724a;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23201f), C10444b.f30947z0, c6021p, 48);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11240a);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC9815U2.m10443b(c11349d, AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23188e), c6021p, (i12 >> 3) & 14);
            String str = c11349d != null ? c11349d.f34320c : null;
            if (str == null) {
                str = "";
            }
            AbstractC4124r4.m4768b(str, AbstractC10842a.m11235m(c10456n, AbstractC7313q.f23199d, 0.0f, 2), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 5, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12154j, c6021p, 0, 3072, 56824);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8273j(c11349d, interfaceC10459q2, i10, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8400b(int i10, InterfaceC1436k interfaceC1436k, C6021p c6021p, InterfaceC10459q interfaceC10459q, C11349D c11349d) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        C10843b c10843b = C10843b.f32509a;
        c6021p.m6526U(-787102735);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c10843b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c11349d) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        int i13 = i12;
        if ((i13 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            if (c11349d == null) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C8272i(c11349d, c10456n, interfaceC1436k, i10, 1);
                    return;
                }
                return;
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C13088h.f41582Y, c6021p, 3072, 6);
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(c10843b.m11240a(c10456n, C10444b.f30938q0), AbstractC7313q.f23201f);
            C17756f c17756f = AbstractC17770m.f56724a;
            float f10 = AbstractC7313q.f23199d;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(f10), C10444b.f30947z0, c6021p, 48);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11233k);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            int i15 = i13 >> 3;
            int i16 = i15 & 14;
            AbstractC9815U2.m10444c(c11349d, AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23190g), c6021p, i16);
            AbstractC6012k0 abstractC6012k0 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b(c11349d.f34319b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(abstractC6012k0)).f12151g, c6021p, 0, 0, 65534);
            AbstractC9809T2.m10433a(i15 & 910, interfaceC1436k, c6021p, null, c11349d);
            c6021p.m6524S(-315580051);
            String str = c11349d.f34320c;
            if (str != null) {
                float f11 = AbstractC7313q.f23198c;
                AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11252l(c10456n, f11));
                AbstractC4124r4.m4768b(str, AbstractC10842a.m11235m(c10456n, f10, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 5, 0, null, ((C3941K4) c6021p.m6548k(abstractC6012k0)).f12154j, c6021p, 0, 3072, 56828);
                interfaceC10459q2 = c10456n;
                AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11252l(interfaceC10459q2, f11));
            } else {
                interfaceC10459q2 = c10456n;
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-315566306);
            if (c11349d.f34337t) {
                interfaceC10459q3 = null;
                AbstractC9809T2.m10434b(c11349d, null, c6021p, i16);
            } else {
                interfaceC10459q3 = null;
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            c6021p.m6524S(895758460);
            if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                c6021p.m6524S(909818265);
                boolean zM6542f = c6021p.m6542f(interfaceC5985X);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    objM6514H = new C6207k(interfaceC5985X, 27);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                AbstractC8086f4.m8517d(0, (InterfaceC1426a) objM6514H, c6021p, interfaceC10459q3, c11349d.f34318a);
            }
            c6021p.m6553p(false);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C8272i(c11349d, interfaceC10459q2, interfaceC1436k, i10, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8401c(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        C10843b c10843b = C10843b.f32509a;
        c6021p.m6526U(-864795724);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c10843b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (((i11 | 48) & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(c10843b.m11240a(c10456n, C10444b.f30938q0), AbstractC7313q.f23201f);
            C17756f c17756f = AbstractC17770m.f56724a;
            float f10 = AbstractC7313q.f23199d;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(f10), C10444b.f30947z0, c6021p, 48);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11233k);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            InterfaceC10459q interfaceC10459qM10458b = AbstractC9818V.m10458b(AbstractC8079e5.m8501a(AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23190g), AbstractC20417e.f64539a), true, false, 0.0f, 14);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM10458b);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            c6021p.m6553p(true);
            AbstractC6012k0 abstractC6012k0 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b("Gizmo Name", AbstractC9818V.m10458b(c10456n, true, false, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(abstractC6012k0)).f12151g, c6021p, 6, 0, 65532);
            AbstractC4124r4.m4768b("This is a gizmo subtitle", AbstractC9818V.m10458b(c10456n, true, false, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 6, 0, 131068);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11252l(c10456n, f10));
            AbstractC4124r4.m4768b("Multi-line description of a gizmo for loading purposes but don't think too much about it", AbstractC9818V.m10458b(c10456n, true, false, 0.0f, 14), 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 5, 0, null, ((C3941K4) c6021p.m6548k(abstractC6012k0)).f12154j, c6021p, 6, 3072, 56828);
            interfaceC10459q2 = c10456n;
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11252l(interfaceC10459q2, f10));
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q2, i10, 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Object m8403e(InterfaceC2621f interfaceC2621f, Object obj, Object obj2, C5817a evaluator, InterfaceC1439n interfaceC1439n) {
        AbstractC16544l.m18094g(evaluator, "evaluator");
        return interfaceC1439n.invoke(interfaceC2621f.mo3618d(AbstractC8038Z3.m8396e(obj), obj2, evaluator), evaluator);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8404f(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || SIPHeaderNames.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || SIPHeaderNames.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static C17348o m8402d(C17348o c17348o, C17348o c17348o2) {
        String str;
        C3847l0 c3847l0 = new C3847l0(3);
        int size = c17348o.size();
        int i10 = 0;
        while (true) {
            str = bQBnquXS.eCdC;
            if (i10 >= size) {
                break;
            }
            String strM19014m = c17348o.m19014m(i10);
            String strM19018s = c17348o.m19018s(i10);
            if ((!SIPHeaderNames.WARNING.equalsIgnoreCase(strM19014m) || !AbstractC21329w.m21734u(strM19018s, "1", false)) && (str.equalsIgnoreCase(strM19014m) || SIPHeaderNames.CONTENT_ENCODING.equalsIgnoreCase(strM19014m) || SIPHeaderNames.CONTENT_TYPE.equalsIgnoreCase(strM19014m) || !m8404f(strM19014m) || c17348o2.m19012f(strM19014m) == null)) {
                c3847l0.m4576c(strM19014m, strM19018s);
            }
            i10++;
        }
        int size2 = c17348o2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            String strM19014m2 = c17348o2.m19014m(i11);
            if (!str.equalsIgnoreCase(strM19014m2) && !SIPHeaderNames.CONTENT_ENCODING.equalsIgnoreCase(strM19014m2) && !SIPHeaderNames.CONTENT_TYPE.equalsIgnoreCase(strM19014m2) && m8404f(strM19014m2)) {
                c3847l0.m4576c(strM19014m2, c17348o2.m19018s(i11));
            }
        }
        return c3847l0.m4577d();
    }
}
