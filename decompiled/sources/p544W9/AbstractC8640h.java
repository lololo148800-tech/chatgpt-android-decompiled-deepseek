package p544W9;

import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.layout.AbstractC10842a;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import ge.C14060X;
import ge.C14065a0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p021Aj.C0537v;
import p042Bf.C1275q;
import p042Bf.C1281w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1051v0.AbstractC20417e;
import p1051v0.C20416d;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1091wn.AbstractC21031l;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1143z4.AbstractC21790t;
import p1143z4.C21772b;
import p1143z4.C21792v;
import p124Ei.C2497c;
import p204I1.C3581L;
import p204I1.C3582M;
import p204I1.C3601q;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p328N1.C5609y;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p467T1.C7199i;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8071d5;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p547Wc.C8758B;
import p571X9.AbstractC9119D4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.AbstractC13508z;
import p758g0.AbstractC13758e;
import p773h0.C14322z0;
import p774h1.C14365u;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17767k0;
import p911o0.C17790w;
import p990rg.C18983j;

/* JADX INFO: renamed from: W9.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8640h {
    /* JADX WARN: Code duplicated, block: B:60:0x017f  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0191  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:71:0x0201  */
    /* JADX WARN: Code duplicated, block: B:76:0x021f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0230 A[LOOP:0: B:78:0x022e->B:79:0x0230, LOOP_END] */
    /* JADX INFO: renamed from: a */
    public static final void m9302a(InterfaceC1436k onPromptClick, C18983j c18983j, InterfaceC10459q interfaceC10459q, int i10, C14322z0 c14322z0, C6021p c6021p, int i11) {
        C14322z0 c14322z0M9124e;
        InterfaceC20904w interfaceC20904w;
        C21694h c21694h;
        Object objM6514H;
        boolean z6;
        C14322z0 c14322z1;
        int i12;
        int i13;
        AbstractC16544l.m18094g(onPromptClick, "onPromptClick");
        c6021p.m6526U(732496697);
        int i14 = (i11 & 6) == 0 ? (c6021p.m6545h(onPromptClick) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i14 |= c6021p.m6542f(c18983j) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i14 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i14 |= c6021p.m6538d(i10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= 8192;
        }
        if ((i14 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            c14322z1 = c14322z0;
        } else {
            c6021p.m6519N();
            int i15 = i11 & 1;
            C10456n c10456n = C10456n.f30959Y;
            if (i15 == 0 || c6021p.m6561x()) {
                c14322z0M9124e = AbstractC8479G.m9124e(c6021p);
            } else {
                c6021p.m6517L();
                c14322z0M9124e = c14322z0;
            }
            c6021p.m6554q();
            InterfaceC20904w interfaceC20904w2 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C10449g c10449g = C10444b.f30947z0;
            InterfaceC10459q interfaceC10459qM9126g = AbstractC8479G.m9126g(interfaceC10459q, c14322z0M9124e, 14);
            float f10 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM9126g, f10, 0.0f, f10, AbstractC7313q.f23198c, 2);
            C17756f c17756f = AbstractC17770m.f56726c;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c17756f, c10449g, c6021p, 48);
            int i16 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h2 = C21698j.f68873f;
            C5997d.m6439Z(c21694h2, c6021p, c17790wM19515a);
            C21694h c21694h3 = C21698j.f68872e;
            C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h4 = C21698j.f68874g;
            if (c6021p.f19563O) {
                interfaceC20904w = interfaceC20904w2;
            } else {
                interfaceC20904w = interfaceC20904w2;
                if (!AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                }
                c21694h = C21698j.f68871d;
                C5997d.m6439Z(c21694h, c6021p, interfaceC10459qM10923d);
                String strM8676d = AbstractC8142m4.m8676d(R.string.conversations_home_title, c6021p);
                C3582M c3582m = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
                C5609y c5609y = C5609y.f18157t0;
                long jM9650c = AbstractC9119D4.m9650c(24);
                float f11 = AbstractC7313q.f23200e;
                InterfaceC20904w interfaceC20904w3 = interfaceC20904w;
                C14322z0 c14322z2 = c14322z0M9124e;
                AbstractC4124r4.m4768b(strM8676d, AbstractC10842a.m11237o(c10456n, f11, 0.0f, f11, f11, 2), 0L, jM9650c, null, c5609y, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, c3582m, c6021p, 199680, 0, 64980);
                c6021p.m6524S(2121042551);
                objM6514H = c6021p.m6514H();
                if (objM6514H == C6013l.f19514a) {
                    objM6514H = C5997d.m6429P(i10);
                    c6021p.m6537c0(objM6514H);
                }
                C5996c0 c5996c0 = (C5996c0) objM6514H;
                c6021p.m6553p(false);
                if (c18983j != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                AbstractC10831a.m11202e(z6, null, AbstractC13508z.m15021m(new C0537v(22, C14060X.f44206q0), AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6)).m14995a(AbstractC13508z.m15013e(AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6), 2)), null, null, AbstractC8411c.m8969c(1351558315, c6021p, new C2497c(c18983j, c5996c0, interfaceC20904w3, onPromptClick)), c6021p, 1572870, 26);
                c6021p.m6524S(2121098702);
                if (c18983j == null) {
                    InterfaceC10459q interfaceC10459qM8483b = AbstractC8071d5.m8483b(c10456n, 0.0f);
                    C17790w c17790wM19515a2 = AbstractC17788v.m19515a(c17756f, C10444b.f30946y0, c6021p, 0);
                    i12 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM8483b);
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(c21694h2, c6021p, c17790wM19515a2);
                    C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m2);
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                        AbstractC0168G.m537z(i12, c6021p, i12, c21694h4);
                    }
                    C5997d.m6439Z(c21694h, c6021p, interfaceC10459qM10923d2);
                    c6021p.m6524S(-460835053);
                    for (i13 = 0; i13 < i10; i13++) {
                        m9303b(C14065a0.f44249o0, "", null, null, null, c6021p, 54, 28);
                    }
                    c6021p.m6553p(false);
                    c6021p.m6553p(true);
                }
                c6021p.m6553p(false);
                c6021p.m6553p(true);
                c14322z1 = c14322z2;
            }
            AbstractC0168G.m537z(i16, c6021p, i16, c21694h4);
            c21694h = C21698j.f68871d;
            C5997d.m6439Z(c21694h, c6021p, interfaceC10459qM10923d);
            String strM8676d2 = AbstractC8142m4.m8676d(R.string.conversations_home_title, c6021p);
            C3582M c3582m2 = ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12147c;
            C5609y c5609y2 = C5609y.f18157t0;
            long jM9650c2 = AbstractC9119D4.m9650c(24);
            float f12 = AbstractC7313q.f23200e;
            InterfaceC20904w interfaceC20904w4 = interfaceC20904w;
            C14322z0 c14322z3 = c14322z0M9124e;
            AbstractC4124r4.m4768b(strM8676d2, AbstractC10842a.m11237o(c10456n, f12, 0.0f, f12, f12, 2), 0L, jM9650c2, null, c5609y2, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, c3582m2, c6021p, 199680, 0, 64980);
            c6021p.m6524S(2121042551);
            objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = C5997d.m6429P(i10);
                c6021p.m6537c0(objM6514H);
            }
            C5996c0 c5996c1 = (C5996c0) objM6514H;
            c6021p.m6553p(false);
            if (c18983j != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            AbstractC10831a.m11202e(z6, null, AbstractC13508z.m15021m(new C0537v(22, C14060X.f44206q0), AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6)).m14995a(AbstractC13508z.m15013e(AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6), 2)), null, null, AbstractC8411c.m8969c(1351558315, c6021p, new C2497c(c18983j, c5996c1, interfaceC20904w4, onPromptClick)), c6021p, 1572870, 26);
            c6021p.m6524S(2121098702);
            if (c18983j == null) {
                InterfaceC10459q interfaceC10459qM8483b2 = AbstractC8071d5.m8483b(c10456n, 0.0f);
                C17790w c17790wM19515a3 = AbstractC17788v.m19515a(c17756f, C10444b.f30946y0, c6021p, 0);
                i12 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM8483b2);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h2, c6021p, c17790wM19515a3);
                C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m3);
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i12, c6021p, i12, c21694h4);
                } else {
                    AbstractC0168G.m537z(i12, c6021p, i12, c21694h4);
                }
                C5997d.m6439Z(c21694h, c6021p, interfaceC10459qM10923d3);
                c6021p.m6524S(-460835053);
                while (i13 < i10) {
                    m9303b(C14065a0.f44249o0, "", null, null, null, c6021p, 54, 28);
                }
                c6021p.m6553p(false);
                c6021p.m6553p(true);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            c14322z1 = c14322z3;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1275q(onPromptClick, c18983j, interfaceC10459q, i10, c14322z1, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m9303b(InterfaceC1426a interfaceC1426a, String str, InterfaceC10459q interfaceC10459q, Integer num, C14365u c14365u, C6021p c6021p, int i10, int i11) {
        int i12;
        Integer num2;
        int i13;
        C14365u c14365u2;
        int i14;
        Integer num3;
        C14365u c14365u3;
        Integer num4;
        C14365u c14365u4;
        InterfaceC10459q interfaceC10459q2;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(-1224963498);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(str) ? 32 : 16;
        }
        int i15 = i12 | 384;
        int i16 = i11 & 8;
        if (i16 == 0) {
            if ((i10 & 3072) == 0) {
                num2 = num;
                i15 |= c6021p.m6542f(num2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    c14365u2 = c14365u;
                    if (c6021p.m6542f(c14365u2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i15 |= i14;
                }
                if ((i15 & 9363) == 9362 || !c6021p.m6562y()) {
                    C10456n c10456n = C10456n.f30959Y;
                    if (i16 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i13 != 0) {
                        c14365u3 = null;
                    } else {
                        c14365u3 = c14365u2;
                    }
                    C20416d c20416d = AbstractC20417e.f64539a;
                    float f10 = AbstractC7313q.f23201f;
                    float f11 = AbstractC7313q.f23199d;
                    AbstractC3984T1.m4695n(interfaceC1426a, AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23198c), false, c20416d, null, null, null, new C17767k0(f10, f11, f10, f11), null, AbstractC8411c.m8969c(-1285901496, c6021p, new C1281w(num3, c14365u3, str, 19)), c6021p, (i15 & 14) | 805306368, 372);
                    num4 = num3;
                    c14365u4 = c14365u3;
                    interfaceC10459q2 = c10456n;
                } else {
                    c6021p.m6517L();
                    num4 = num2;
                    c14365u4 = c14365u2;
                    interfaceC10459q2 = interfaceC10459q;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C8758B(interfaceC1426a, str, interfaceC10459q2, num4, c14365u4, i10, i11);
                }
            }
            i15 |= 24576;
            c14365u2 = c14365u;
            if ((i15 & 9363) == 9362) {
                C10456n c10456n2 = C10456n.f30959Y;
                if (i16 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    c14365u3 = null;
                } else {
                    c14365u3 = c14365u2;
                }
                C20416d c20416d2 = AbstractC20417e.f64539a;
                float f12 = AbstractC7313q.f23201f;
                float f13 = AbstractC7313q.f23199d;
                AbstractC3984T1.m4695n(interfaceC1426a, AbstractC10842a.m11233k(c10456n2, AbstractC7313q.f23198c), false, c20416d2, null, null, null, new C17767k0(f12, f13, f12, f13), null, AbstractC8411c.m8969c(-1285901496, c6021p, new C1281w(num3, c14365u3, str, 19)), c6021p, (i15 & 14) | 805306368, 372);
                num4 = num3;
                c14365u4 = c14365u3;
                interfaceC10459q2 = c10456n2;
            } else {
                C10456n c10456n3 = C10456n.f30959Y;
                if (i16 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    c14365u3 = null;
                } else {
                    c14365u3 = c14365u2;
                }
                C20416d c20416d3 = AbstractC20417e.f64539a;
                float f14 = AbstractC7313q.f23201f;
                float f15 = AbstractC7313q.f23199d;
                AbstractC3984T1.m4695n(interfaceC1426a, AbstractC10842a.m11233k(c10456n3, AbstractC7313q.f23198c), false, c20416d3, null, null, null, new C17767k0(f14, f15, f14, f15), null, AbstractC8411c.m8969c(-1285901496, c6021p, new C1281w(num3, c14365u3, str, 19)), c6021p, (i15 & 14) | 805306368, 372);
                num4 = num3;
                c14365u4 = c14365u3;
                interfaceC10459q2 = c10456n3;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C8758B(interfaceC1426a, str, interfaceC10459q2, num4, c14365u4, i10, i11);
            }
        }
        i15 = i12 | 3456;
        num2 = num;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                c14365u2 = c14365u;
                if (c6021p.m6542f(c14365u2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i15 |= i14;
            }
            if ((i15 & 9363) == 9362) {
                C10456n c10456n4 = C10456n.f30959Y;
                if (i16 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    c14365u3 = null;
                } else {
                    c14365u3 = c14365u2;
                }
                C20416d c20416d4 = AbstractC20417e.f64539a;
                float f16 = AbstractC7313q.f23201f;
                float f17 = AbstractC7313q.f23199d;
                AbstractC3984T1.m4695n(interfaceC1426a, AbstractC10842a.m11233k(c10456n4, AbstractC7313q.f23198c), false, c20416d4, null, null, null, new C17767k0(f16, f17, f16, f17), null, AbstractC8411c.m8969c(-1285901496, c6021p, new C1281w(num3, c14365u3, str, 19)), c6021p, (i15 & 14) | 805306368, 372);
                num4 = num3;
                c14365u4 = c14365u3;
                interfaceC10459q2 = c10456n4;
            } else {
                C10456n c10456n5 = C10456n.f30959Y;
                if (i16 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i13 != 0) {
                    c14365u3 = null;
                } else {
                    c14365u3 = c14365u2;
                }
                C20416d c20416d5 = AbstractC20417e.f64539a;
                float f18 = AbstractC7313q.f23201f;
                float f19 = AbstractC7313q.f23199d;
                AbstractC3984T1.m4695n(interfaceC1426a, AbstractC10842a.m11233k(c10456n5, AbstractC7313q.f23198c), false, c20416d5, null, null, null, new C17767k0(f18, f19, f18, f19), null, AbstractC8411c.m8969c(-1285901496, c6021p, new C1281w(num3, c14365u3, str, 19)), c6021p, (i15 & 14) | 805306368, 372);
                num4 = num3;
                c14365u4 = c14365u3;
                interfaceC10459q2 = c10456n5;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C8758B(interfaceC1426a, str, interfaceC10459q2, num4, c14365u4, i10, i11);
            }
        }
        i15 |= 24576;
        c14365u2 = c14365u;
        if ((i15 & 9363) == 9362) {
            C10456n c10456n6 = C10456n.f30959Y;
            if (i16 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i13 != 0) {
                c14365u3 = null;
            } else {
                c14365u3 = c14365u2;
            }
            C20416d c20416d6 = AbstractC20417e.f64539a;
            float f110 = AbstractC7313q.f23201f;
            float f111 = AbstractC7313q.f23199d;
            AbstractC3984T1.m4695n(interfaceC1426a, AbstractC10842a.m11233k(c10456n6, AbstractC7313q.f23198c), false, c20416d6, null, null, null, new C17767k0(f110, f111, f110, f111), null, AbstractC8411c.m8969c(-1285901496, c6021p, new C1281w(num3, c14365u3, str, 19)), c6021p, (i15 & 14) | 805306368, 372);
            num4 = num3;
            c14365u4 = c14365u3;
            interfaceC10459q2 = c10456n6;
        } else {
            C10456n c10456n7 = C10456n.f30959Y;
            if (i16 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i13 != 0) {
                c14365u3 = null;
            } else {
                c14365u3 = c14365u2;
            }
            C20416d c20416d7 = AbstractC20417e.f64539a;
            float f112 = AbstractC7313q.f23201f;
            float f113 = AbstractC7313q.f23199d;
            AbstractC3984T1.m4695n(interfaceC1426a, AbstractC10842a.m11233k(c10456n7, AbstractC7313q.f23198c), false, c20416d7, null, null, null, new C17767k0(f112, f113, f112, f113), null, AbstractC8411c.m8969c(-1285901496, c6021p, new C1281w(num3, c14365u3, str, 19)), c6021p, (i15 & 14) | 805306368, 372);
            num4 = num3;
            c14365u4 = c14365u3;
            interfaceC10459q2 = c10456n7;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8758B(interfaceC1426a, str, interfaceC10459q2, num4, c14365u4, i10, i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m9304c(int i10, List list) {
        byte b;
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            C3601q c3601q = (C3601q) list.get(i12);
            if (c3601q.f10969b > i10) {
                b = 1;
            } else {
                b = c3601q.f10970c <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i11 = i12 + 1;
            } else {
                if (b <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: d */
    public static final int m9305d(int i10, List list) {
        byte b;
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            C3601q c3601q = (C3601q) list.get(i12);
            if (c3601q.f10971d > i10) {
                b = 1;
            } else {
                b = c3601q.f10972e <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i11 = i12 + 1;
            } else {
                if (b <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: e */
    public static final int m9306e(ArrayList arrayList, float f10) {
        byte b;
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((C3601q) AbstractC17680n.m19351a0(arrayList)).f10974g) {
            return AbstractC17681o.m19381j(arrayList);
        }
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            C3601q c3601q = (C3601q) arrayList.get(i11);
            if (c3601q.f10973f > f10) {
                b = 1;
            } else {
                b = c3601q.f10974g <= f10 ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i10 = i11 + 1;
            } else {
                if (b <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: renamed from: f */
    public static final void m9307f(ArrayList arrayList, long j10, InterfaceC1436k interfaceC1436k) {
        int size = arrayList.size();
        for (int iM9304c = m9304c(C3581L.m4270f(j10), arrayList); iM9304c < size; iM9304c++) {
            C3601q c3601q = (C3601q) arrayList.get(iM9304c);
            if (c3601q.f10969b >= C3581L.m4269e(j10)) {
                return;
            }
            if (c3601q.f10969b != c3601q.f10970c) {
                interfaceC1436k.invoke(c3601q);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC21790t m9308g(C21792v c21792v) {
        AbstractC16544l.m18094g(c21792v, "<this>");
        return (AbstractC21790t) AbstractC21031l.m21494r(AbstractC21031l.m21492p(C21772b.f69061t0, c21792v.m22284s(c21792v.f69142v0, true)));
    }
}
