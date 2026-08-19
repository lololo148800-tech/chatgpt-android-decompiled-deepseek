package p229J0;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.layout.AbstractC10868a;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p003A1.C0257i0;
import p039Bc.C0882p;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1029u0.C20090a;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2509g;
import p156G1.AbstractC2965l;
import p302M0.AbstractC5273y;
import p302M0.EnumC5246M;
import p349O0.C5975S;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8449B;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p773h0.C14311u;
import p774h1.C14365u;
import p774h1.InterfaceC14339Q;
import p894n0.InterfaceC17406l;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.C17781r0;
import p911o0.C17785t0;

/* JADX INFO: renamed from: J0.n3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4099n3 {

    /* JADX INFO: renamed from: a */
    public static final float f13140a = 8;

    /* JADX INFO: renamed from: a */
    public static final void m4757a(C3892C3 c3892c3, boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC14339Q interfaceC14339Q, InterfaceC10459q interfaceC10459q, boolean z10, C4051f3 c4051f3, C14311u c14311u, InterfaceC17406l interfaceC17406l, InterfaceC1439n interfaceC1439n, C8410b c8410b, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        C4051f3 c4051f4;
        long j10;
        int i14;
        C14311u c14311uM9060a;
        InterfaceC1439n interfaceC1439nM8969c;
        InterfaceC10459q interfaceC10459q2;
        boolean z11;
        InterfaceC17406l interfaceC17406l2;
        InterfaceC17406l interfaceC17406l3;
        long j11;
        long j12;
        boolean z12;
        C14311u c14311u2;
        InterfaceC17406l interfaceC17406l4;
        InterfaceC10459q interfaceC10459q3;
        C4051f3 c4051f5;
        InterfaceC1439n interfaceC1439n2;
        c6021p.m6526U(-1016574361);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(c3892c3) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(interfaceC1426a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6542f(interfaceC14339Q) ? 2048 : 1024;
        }
        int i15 = 221184 | i12;
        if ((1572864 & i10) == 0) {
            i15 = 745472 | i12;
        }
        if ((12582912 & i10) == 0) {
            i15 |= 4194304;
        }
        int i16 = 905969664 | i15;
        if ((i11 & 6) == 0) {
            i13 = i11 | (c6021p.m6545h(c8410b) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((306783379 & i16) == 306783378 && (i13 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            z12 = z10;
            c4051f5 = c4051f3;
            c14311u2 = c14311u;
            interfaceC17406l4 = interfaceC17406l;
            interfaceC1439n2 = interfaceC1439n;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                C4075j3 c4075j3 = C4075j3.f12983a;
                C3949M0 c3949m0 = (C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a);
                c4051f4 = c3949m0.f12218c0;
                if (c4051f4 == null) {
                    float f10 = AbstractC5273y.f17303a;
                    long jM4661c = AbstractC3959O0.m4661c(c3949m0, 32);
                    long jM4661c2 = AbstractC3959O0.m4661c(c3949m0, 15);
                    long jM4661c3 = AbstractC3959O0.m4661c(c3949m0, 24);
                    long jM4661c4 = AbstractC3959O0.m4661c(c3949m0, 18);
                    long jM4661c5 = AbstractC3959O0.m4661c(c3949m0, 24);
                    long jM4661c6 = AbstractC3959O0.m4661c(c3949m0, 32);
                    long jM15774b = C14365u.m15774b(0.38f, AbstractC3959O0.m4661c(c3949m0, 18));
                    long jM15774b2 = C14365u.m15774b(0.12f, AbstractC3959O0.m4661c(c3949m0, 24));
                    long jM4661c7 = AbstractC3959O0.m4661c(c3949m0, 18);
                    long jM4661c8 = AbstractC3959O0.m4661c(c3949m0, 24);
                    long j13 = c3949m0.f12234p;
                    c4051f4 = new C4051f3(jM4661c, jM4661c2, jM4661c3, j13, jM4661c4, jM4661c5, jM4661c6, jM15774b, jM15774b2, j13, jM4661c7, jM4661c8);
                    c3949m0.f12218c0 = c4051f4;
                }
                if (z6) {
                    j10 = c4051f4.f12782c;
                } else {
                    j10 = !z6 ? c4051f4.f12785f : c4051f4.f12791l;
                }
                i14 = i16 & (-33030145);
                c14311uM9060a = AbstractC8449B.m9060a(C4075j3.f12984b, j10);
                interfaceC1439nM8969c = AbstractC8411c.m8969c(1235063168, c6021p, new C2509g(z6, 1));
                interfaceC10459q2 = c10456n;
                z11 = true;
                interfaceC17406l2 = null;
            } else {
                c6021p.m6517L();
                i14 = i16 & (-33030145);
                interfaceC10459q2 = interfaceC10459q;
                z11 = z10;
                c4051f4 = c4051f3;
                c14311uM9060a = c14311u;
                interfaceC17406l2 = interfaceC17406l;
                interfaceC1439nM8969c = interfaceC1439n;
            }
            c6021p.m6554q();
            c6021p.m6524S(1788214045);
            C5975S c5975s = C6013l.f19514a;
            if (interfaceC17406l2 == null) {
                Object objM6514H = c6021p.m6514H();
                if (objM6514H == c5975s) {
                    objM6514H = AbstractC0168G.m536y(c6021p);
                }
                interfaceC17406l3 = (InterfaceC17406l) objM6514H;
            } else {
                interfaceC17406l3 = interfaceC17406l2;
            }
            c6021p.m6553p(false);
            c4051f4.getClass();
            if (z11 && z6) {
                j11 = c4051f4.f12780a;
            } else if (!z11 || z6) {
                j11 = (z11 || !z6) ? c4051f4.f12789j : c4051f4.f12786g;
            } else {
                j11 = c4051f4.f12783d;
            }
            long j14 = j11;
            if (z11 && z6) {
                j12 = c4051f4.f12781b;
            } else if (!z11 || z6) {
                j12 = (z11 || !z6) ? c4051f4.f12790k : c4051f4.f12787h;
            } else {
                j12 = c4051f4.f12784e;
            }
            long j15 = j12;
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = C5997d.m6429P(0);
                c6021p.m6537c0(objM6514H2);
            }
            C5996c0 c5996c0 = (C5996c0) objM6514H2;
            boolean zM6542f = c6021p.m6542f(interfaceC17406l3);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f || objM6514H3 == c5975s) {
                objM6514H3 = new C4093m3(interfaceC17406l3, c5996c0, null);
                c6021p.m6537c0(objM6514H3);
            }
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, interfaceC17406l3);
            c3892c3.getClass();
            InterfaceC1439n interfaceC1439n3 = interfaceC1439nM8969c;
            C4051f3 c4051f6 = c4051f4;
            AbstractC4034c4.m4726b(z6, interfaceC1426a, AbstractC2965l.m3789a(AbstractC10844c.m11241a(AbstractC10868a.m11316b(C17785t0.f56761a.m19513a(interfaceC10459q2, 1.0f, true), new C0882p(c5996c0, z6, 2)), AbstractC4048f0.f12771c, AbstractC4048f0.f12772d), false, C4161y.f13489C0), z11, interfaceC14339Q, j14, j15, 0.0f, c14311uM9060a, interfaceC17406l3, AbstractC8411c.m8969c(383378045, c6021p, new C4047f(interfaceC1439nM8969c, c8410b, 2)), c6021p, ((i14 >> 3) & 126) | ((i14 >> 6) & 7168) | ((i14 << 3) & 57344), 384);
            z12 = z11;
            c14311u2 = c14311uM9060a;
            interfaceC17406l4 = interfaceC17406l2;
            interfaceC10459q3 = interfaceC10459q2;
            c4051f5 = c4051f6;
            interfaceC1439n2 = interfaceC1439n3;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4081k3(c3892c3, z6, interfaceC1426a, interfaceC14339Q, interfaceC10459q3, z12, c4051f5, c14311u2, interfaceC17406l4, interfaceC1439n2, c8410b, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4758b(InterfaceC10459q interfaceC10459q, float f10, C8410b c8410b, C6021p c6021p, int i10) {
        c6021p.m6526U(-1520863498);
        int i11 = i10 | 54;
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            f10 = C4075j3.f12984b;
            InterfaceC10459q interfaceC10459qM11239q = AbstractC10842a.m11239q(AbstractC10844c.m11242b(AbstractC2965l.m3789a(interfaceC10459q, false, C20090a.f63616Y), 0.0f, AbstractC5273y.f17303a, 1), 1);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(-f10), C10444b.f30944w0, c6021p, 48);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11239q);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = new C3892C3();
                c6021p.m6537c0(objM6514H);
            }
            c8410b.invoke((C3892C3) objM6514H, c6021p, Integer.valueOf(((i11 >> 3) & 112) | 6));
            c6021p.m6553p(true);
        }
        InterfaceC10459q interfaceC10459q2 = interfaceC10459q;
        float f11 = f10;
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4087l3(interfaceC10459q2, f11, c8410b, i10, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4759c(InterfaceC1439n interfaceC1439n, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        int i12 = 19;
        c6021p.m6526U(1464121570);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1439n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c8410b) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10451i c10451i = C10444b.f30938q0;
            InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(C10456n.f30959Y, AbstractC4048f0.f12770b);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11232j);
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
            float f10 = AbstractC5273y.f17303a;
            AbstractC4124r4.m4767a(AbstractC3947L4.m4655a(EnumC5246M.f17115r0, c6021p), AbstractC8411c.m8969c(1420592651, c6021p, new C4047f(interfaceC1439n, c8410b, 3)), c6021p, 48);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(interfaceC1439n, c8410b, i10, i12);
        }
    }
}
