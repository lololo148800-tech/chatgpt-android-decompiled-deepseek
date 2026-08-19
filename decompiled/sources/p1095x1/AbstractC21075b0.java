package p1095x1;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1071w0.C20714I0;
import p1140z1.AbstractC21669O;
import p1140z1.AbstractC21678Y;
import p1140z1.C21658D;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p293Lh.C5062h;
import p349O0.C5997d;
import p349O0.C6005h;
import p349O0.C6013l;
import p349O0.C6017n;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8112i6;
import p537W0.C8410b;
import p635a1.AbstractC10443a;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p759g1.C13800b;
import p759g1.C13801c;
import p759g1.C13803e;
import p911o0.AbstractC17792x;
import p911o0.C17722D0;
import p963qd.C18680i;
import td.C19843f;

/* JADX INFO: renamed from: x1.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21075b0 {

    /* JADX INFO: renamed from: a */
    public static final C21089j f66993a = new C21089j(3);

    /* JADX INFO: renamed from: a */
    public static final void m21560a(InterfaceC10459q interfaceC10459q, C8410b c8410b, InterfaceC21057K interfaceC21057K, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1949933075);
        int i12 = 2;
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC21057K) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int i13 = c6021p.f19564P;
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            C21696i c21696i = C21696i.f68866p0;
            int i14 = ((i11 << 3) & 896) | 6;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            InterfaceC21700k.f68875m0.getClass();
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057K);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            if (c6021p.f19563O) {
                c6021p.m6534b(C17296C.f55119a, new C6005h(i12, 2));
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            AbstractC17792x.m19538u((i14 >> 6) & 14, c8410b, c6021p, true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C19843f(interfaceC10459q, c8410b, interfaceC21057K, i10, 4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m21561b(float f10, float f11) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i10 = AbstractC21073a0.f66991b;
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: c */
    public static final void m21562c(InterfaceC10459q interfaceC10459q, InterfaceC1439n interfaceC1439n, C6021p c6021p, int i10, int i11) {
        int i12;
        c6021p.m6526U(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(interfaceC1439n) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (i13 != 0) {
                interfaceC10459q = C10456n.f30959Y;
            }
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = new C21081e0(C21089j.f67015r0);
                c6021p.m6537c0(objM6514H);
            }
            m21563d((C21081e0) objM6514H, interfaceC10459q, interfaceC1439n, c6021p, (i12 << 3) & 1008);
        }
        InterfaceC10459q interfaceC10459q2 = interfaceC10459q;
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5062h(interfaceC10459q2, interfaceC1439n, i10, i11, 11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m21563d(C21081e0 c21081e0, InterfaceC10459q interfaceC10459q, InterfaceC1439n interfaceC1439n, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-511989831);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c21081e0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            int i12 = c6021p.f19564P;
            C6017n c6017nM6434U = C5997d.m6434U(c6021p);
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            C21696i c21696i = C21696i.f68866p0;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21081e0.f67003c, c6021p, c21081e0);
            C5997d.m6439Z(c21081e0.f67004d, c6021p, c6017nM6434U);
            C5997d.m6439Z(c21081e0.f67005e, c6021p, interfaceC1439n);
            InterfaceC21700k.f68875m0.getClass();
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            c6021p.m6553p(true);
            if (c6021p.m6562y()) {
                c6021p.m6524S(-26502501);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-26580342);
                boolean zM6545h = c6021p.m6545h(c21081e0);
                Object objM6514H = c6021p.m6514H();
                if (zM6545h || objM6514H == C6013l.f19514a) {
                    objM6514H = new C20714I0(c21081e0, 3);
                    c6021p.m6537c0(objM6514H);
                }
                C5997d.m6454j((InterfaceC1426a) objM6514H, c6021p);
                c6021p.m6553p(false);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C19843f(c21081e0, interfaceC10459q, interfaceC1439n, i10, 5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C13801c m21564e(InterfaceC21098s interfaceC21098s) {
        InterfaceC21098s interfaceC21098sMo21527x = interfaceC21098s.mo21527x();
        return interfaceC21098sMo21527x != null ? interfaceC21098sMo21527x.mo21528y(interfaceC21098s, true) : new C13801c(0.0f, 0.0f, (int) (interfaceC21098s.mo21524k() >> 32), (int) (interfaceC21098s.mo21524k() & 4294967295L));
    }

    /* JADX INFO: renamed from: f */
    public static final C13801c m21565f(InterfaceC21098s interfaceC21098s) {
        InterfaceC21098s interfaceC21098sM21568i = m21568i(interfaceC21098s);
        float fMo21524k = (int) (interfaceC21098sM21568i.mo21524k() >> 32);
        float fMo21524k2 = (int) (interfaceC21098sM21568i.mo21524k() & 4294967295L);
        C13801c c13801cMo21528y = m21568i(interfaceC21098s).mo21528y(interfaceC21098s, true);
        float f10 = c13801cMo21528y.f43586a;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > fMo21524k) {
            f10 = fMo21524k;
        }
        float f11 = c13801cMo21528y.f43587b;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > fMo21524k2) {
            f11 = fMo21524k2;
        }
        float f12 = c13801cMo21528y.f43588c;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 <= fMo21524k) {
            fMo21524k = f12;
        }
        float f13 = c13801cMo21528y.f43589d;
        float f14 = f13 >= 0.0f ? f13 : 0.0f;
        if (f14 <= fMo21524k2) {
            fMo21524k2 = f14;
        }
        if (f10 == fMo21524k || f11 == fMo21524k2) {
            return C13801c.f43585e;
        }
        long jMo21520d = interfaceC21098sM21568i.mo21520d(AbstractC8088f6.m8536b(f10, f11));
        long jMo21520d2 = interfaceC21098sM21568i.mo21520d(AbstractC8088f6.m8536b(fMo21524k, f11));
        long jMo21520d3 = interfaceC21098sM21568i.mo21520d(AbstractC8088f6.m8536b(fMo21524k, fMo21524k2));
        long jMo21520d4 = interfaceC21098sM21568i.mo21520d(AbstractC8088f6.m8536b(f10, fMo21524k2));
        float fM15306g = C13800b.m15306g(jMo21520d);
        float fM15306g2 = C13800b.m15306g(jMo21520d2);
        float fM15306g3 = C13800b.m15306g(jMo21520d4);
        float fM15306g4 = C13800b.m15306g(jMo21520d3);
        float fMin = Math.min(fM15306g, Math.min(fM15306g2, Math.min(fM15306g3, fM15306g4)));
        float fMax = Math.max(fM15306g, Math.max(fM15306g2, Math.max(fM15306g3, fM15306g4)));
        float fM15307h = C13800b.m15307h(jMo21520d);
        float fM15307h2 = C13800b.m15307h(jMo21520d2);
        float fM15307h3 = C13800b.m15307h(jMo21520d4);
        float fM15307h4 = C13800b.m15307h(jMo21520d3);
        return new C13801c(fMin, Math.min(fM15307h, Math.min(fM15307h2, Math.min(fM15307h3, fM15307h4))), fMax, Math.max(fM15307h, Math.max(fM15307h2, Math.max(fM15307h3, fM15307h4))));
    }

    /* JADX INFO: renamed from: g */
    public static final C8410b m21566g(List list) {
        return new C8410b(new C18680i(1, list), true, -1953651383);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m21567h(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC21098s m21568i(InterfaceC21098s interfaceC21098s) {
        InterfaceC21098s interfaceC21098s2;
        InterfaceC21098s interfaceC21098sMo21527x = interfaceC21098s.mo21527x();
        while (true) {
            InterfaceC21098s interfaceC21098s3 = interfaceC21098sMo21527x;
            interfaceC21098s2 = interfaceC21098s;
            interfaceC21098s = interfaceC21098s3;
            if (interfaceC21098s == null) {
                break;
            }
            interfaceC21098sMo21527x = interfaceC21098s.mo21527x();
        }
        AbstractC21678Y abstractC21678Y = interfaceC21098s2 instanceof AbstractC21678Y ? (AbstractC21678Y) interfaceC21098s2 : null;
        if (abstractC21678Y == null) {
            return interfaceC21098s2;
        }
        AbstractC21678Y abstractC21678Y2 = abstractC21678Y.f68821z0;
        while (true) {
            AbstractC21678Y abstractC21678Y3 = abstractC21678Y2;
            AbstractC21678Y abstractC21678Y4 = abstractC21678Y;
            abstractC21678Y = abstractC21678Y3;
            if (abstractC21678Y == null) {
                return abstractC21678Y4;
            }
            abstractC21678Y2 = abstractC21678Y.f68821z0;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final AbstractC21669O m21569j(AbstractC21669O abstractC21669O) {
        C21658D c21658d = abstractC21669O.f68765x0.f68819x0;
        while (true) {
            C21658D c21658dM22009G = c21658d.m22009G();
            C21658D c21658d2 = null;
            if ((c21658dM22009G != null ? c21658dM22009G.f68652o0 : null) == null) {
                AbstractC21669O abstractC21669OMo22157H0 = ((AbstractC21678Y) c21658d.f68638I0.f3469d).mo22157H0();
                AbstractC16544l.m18091d(abstractC21669OMo22157H0);
                return abstractC21669OMo22157H0;
            }
            C21658D c21658dM22009G2 = c21658d.m22009G();
            if (c21658dM22009G2 != null) {
                c21658d2 = c21658dM22009G2.f68652o0;
            }
            AbstractC16544l.m18091d(c21658d2);
            C21658D c21658dM22009G3 = c21658d.m22009G();
            AbstractC16544l.m18091d(c21658dM22009G3);
            c21658d = c21658dM22009G3.f68652o0;
            AbstractC16544l.m18091d(c21658d);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final C8410b m21570k(InterfaceC10459q interfaceC10459q) {
        return new C8410b(new C17722D0(interfaceC10459q, 3), true, -1586257396);
    }

    /* JADX INFO: renamed from: l */
    public static final long m21571l(long j10, long j11) {
        return AbstractC8112i6.m8603a(AbstractC21073a0.m21556b(j11) * C13803e.m15333e(j10), AbstractC21073a0.m21557c(j11) * C13803e.m15331c(j10));
    }
}
