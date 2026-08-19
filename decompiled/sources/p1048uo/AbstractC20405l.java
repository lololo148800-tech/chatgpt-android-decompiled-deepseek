package p1048uo;

import android.app.Activity;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.Bundle;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import ga.C13833a;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0235c;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1081wc.AbstractC20875V;
import p1081wc.C20889h;
import p1081wc.InterfaceC20904w;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1149zc.C21839a;
import p1149zc.C21840b;
import p1149zc.C21841c;
import p132F2.C2649m;
import p132F2.C2650n;
import p132F2.C2651o;
import p153Fn.C2925c;
import p157G2.C2977c;
import p178H.C3152j0;
import p195Hh.C3430e;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4048f0;
import p229J0.C3949M0;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.InterfaceC6008i0;
import p363Og.C6218v;
import p468T2.C7224p;
import p478Tc.AbstractC7308l;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC8144m6;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p523V9.AbstractC8218w0;
import p562X0.C9007b;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9751J3;
import p623Zf.AbstractC10309e;
import p623Zf.C10312h;
import p623Zf.C10313i;
import p623Zf.C10324t;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17767k0;
import p911o0.C17790w;
import p959q8.C18639a;
import p978r1.AbstractC18857c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: uo.l */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC20405l {
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:64:0x010d  */
    /* JADX WARN: Code duplicated, block: B:67:0x015d  */
    /* JADX WARN: Code duplicated, block: B:68:0x015f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x016d  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0204  */
    /* JADX WARN: Code duplicated, block: B:92:0x023c  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m21070a(C10324t state, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, boolean z6, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        boolean z10;
        int i14;
        int i15;
        C10456n c10456n;
        InterfaceC10459q interfaceC10459q3;
        boolean z11;
        Object objM6514H;
        C5975S c5975s;
        int i16;
        C21696i c21696i;
        C21694h c21694h;
        int i17;
        boolean z12;
        Object objM6514H2;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM6514H3;
        boolean z16;
        InterfaceC10459q interfaceC10459q4;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-261777045);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(onIntent) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z10 = z6;
                    if (c6021p.m6544g(z10)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i12;
                if ((i15 & 1171) == 1170 || !c6021p.m6562y()) {
                    c10456n = C10456n.f30959Y;
                    if (i18 != 0) {
                        interfaceC10459q3 = c10456n;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
                    C16525B c16525b = new C16525B();
                    objM6514H = c6021p.m6514H();
                    c5975s = C6013l.f19514a;
                    if (objM6514H == c5975s) {
                        objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                    }
                    C2925c c2925c = ((C6035w) objM6514H).f19668Y;
                    InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30946y0, c6021p, 0);
                    i16 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                    InterfaceC21700k.f68875m0.getClass();
                    c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                        AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    InterfaceC10459q interfaceC10459q5 = interfaceC10459q3;
                    AbstractC9751J3.m10349b(new C9007b(c16525b, c2925c, onIntent, abstractActivityC17375g, state, interfaceC20904w, 1), AbstractC10844c.m11244d(c10456n, 1.0f), null, state.m10882f(C21841c.f69307c), false, AbstractC10309e.f30608a, c6021p, 196656, 20);
                    c6021p.m6524S(165044215);
                    i17 = i15 & 112;
                    if (i17 == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objM6514H2 = c6021p.m6514H();
                    if (!z12 || objM6514H2 == c5975s) {
                        z13 = false;
                        objM6514H2 = new C10312h(0 == true ? 1 : 0, onIntent);
                        c6021p.m6537c0(objM6514H2);
                    } else {
                        z13 = false;
                    }
                    InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H2;
                    c6021p.m6553p(z13);
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
                    C17767k0 c17767k0 = AbstractC4048f0.f12769a;
                    C5984W0 c5984w0 = AbstractC3959O0.f12302a;
                    z14 = z13;
                    AbstractC9751J3.m10349b(interfaceC1426a, interfaceC10459qM11244d, AbstractC4048f0.m4733b(((C3949M0) c6021p.m6548k(c5984w0)).f12236r, ((C3949M0) c6021p.m6548k(c5984w0)).f12213a, c6021p, 12), state.m10882f(C21839a.f69305c), false, AbstractC10309e.f30609b, c6021p, 196656, 16);
                    c6021p.m6524S(165060362);
                    if (z11) {
                        AbstractC3984T1.m4692k(AbstractC10842a.m11234l(c10456n, AbstractC7313q.f23201f, AbstractC7313q.f23198c), 0.0f, 0L, c6021p, 0, 6);
                    }
                    r5.m6553p(z14);
                    r5.m6524S(165067373);
                    if (i17 == 32) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    objM6514H3 = c6021p.m6514H();
                    if (!z15 || objM6514H3 == c5975s) {
                        z16 = true;
                        objM6514H3 = new C10312h(1 == true ? 1 : 0, onIntent);
                        r5.m6537c0(objM6514H3);
                    } else {
                        z16 = true;
                    }
                    r5.m6553p(z14);
                    AbstractC9751J3.m10348a((InterfaceC1426a) objM6514H3, AbstractC10844c.m11244d(c10456n, 1.0f), null, state.m10882f(C21840b.f69306c), false, AbstractC10309e.f30610c, c6021p, 196656, 20);
                    c6021p.m6553p(z16);
                    z10 = z11;
                    interfaceC10459q4 = interfaceC10459q5;
                } else {
                    c6021p.m6517L();
                    interfaceC10459q4 = interfaceC10459q2;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C6218v(state, onIntent, interfaceC10459q4, z10, i10, i11);
                }
            }
            i12 |= 3072;
            z10 = z6;
            i15 = i12;
            if ((i15 & 1171) == 1170) {
                c10456n = C10456n.f30959Y;
                if (i18 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                AbstractActivityC17375g abstractActivityC17375g2 = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
                C16525B c16525b2 = new C16525B();
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                C2925c c2925c2 = ((C6035w) objM6514H).f19668Y;
                InterfaceC20904w interfaceC20904w2 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                C17756f c17756f2 = AbstractC17770m.f56724a;
                C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30946y0, c6021p, 0);
                i16 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a2);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                } else {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
                InterfaceC10459q interfaceC10459q6 = interfaceC10459q3;
                AbstractC9751J3.m10349b(new C9007b(c16525b2, c2925c2, onIntent, abstractActivityC17375g2, state, interfaceC20904w2, 1), AbstractC10844c.m11244d(c10456n, 1.0f), null, state.m10882f(C21841c.f69307c), false, AbstractC10309e.f30608a, c6021p, 196656, 20);
                c6021p.m6524S(165044215);
                i17 = i15 & 112;
                if (i17 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z12) {
                    z13 = false;
                    objM6514H2 = new C10312h(0 == true ? 1 : 0, onIntent);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    z13 = false;
                    objM6514H2 = new C10312h(0 == true ? 1 : 0, onIntent);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H2;
                c6021p.m6553p(z13);
                InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(c10456n, 1.0f);
                C17767k0 c17767k1 = AbstractC4048f0.f12769a;
                C5984W0 c5984w1 = AbstractC3959O0.f12302a;
                z14 = z13;
                AbstractC9751J3.m10349b(interfaceC1426a2, interfaceC10459qM11244d2, AbstractC4048f0.m4733b(((C3949M0) c6021p.m6548k(c5984w1)).f12236r, ((C3949M0) c6021p.m6548k(c5984w1)).f12213a, c6021p, 12), state.m10882f(C21839a.f69305c), false, AbstractC10309e.f30609b, c6021p, 196656, 16);
                c6021p.m6524S(165060362);
                if (z11) {
                    AbstractC3984T1.m4692k(AbstractC10842a.m11234l(c10456n, AbstractC7313q.f23201f, AbstractC7313q.f23198c), 0.0f, 0L, c6021p, 0, 6);
                }
                r5.m6553p(z14);
                r5.m6524S(165067373);
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                objM6514H3 = c6021p.m6514H();
                if (z15) {
                    z16 = true;
                    objM6514H3 = new C10312h(1 == true ? 1 : 0, onIntent);
                    r5.m6537c0(objM6514H3);
                } else {
                    z16 = true;
                    objM6514H3 = new C10312h(1 == true ? 1 : 0, onIntent);
                    r5.m6537c0(objM6514H3);
                }
                r5.m6553p(z14);
                AbstractC9751J3.m10348a((InterfaceC1426a) objM6514H3, AbstractC10844c.m11244d(c10456n, 1.0f), null, state.m10882f(C21840b.f69306c), false, AbstractC10309e.f30610c, c6021p, 196656, 20);
                c6021p.m6553p(z16);
                z10 = z11;
                interfaceC10459q4 = interfaceC10459q6;
            } else {
                c10456n = C10456n.f30959Y;
                if (i18 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                AbstractActivityC17375g abstractActivityC17375g3 = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
                C16525B c16525b3 = new C16525B();
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                C2925c c2925c3 = ((C6035w) objM6514H).f19668Y;
                InterfaceC20904w interfaceC20904w3 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                C17756f c17756f3 = AbstractC17770m.f56724a;
                C17790w c17790wM19515a3 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30946y0, c6021p, 0);
                i16 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a3);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                } else {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
                InterfaceC10459q interfaceC10459q7 = interfaceC10459q3;
                AbstractC9751J3.m10349b(new C9007b(c16525b3, c2925c3, onIntent, abstractActivityC17375g3, state, interfaceC20904w3, 1), AbstractC10844c.m11244d(c10456n, 1.0f), null, state.m10882f(C21841c.f69307c), false, AbstractC10309e.f30608a, c6021p, 196656, 20);
                c6021p.m6524S(165044215);
                i17 = i15 & 112;
                if (i17 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z12) {
                    z13 = false;
                    objM6514H2 = new C10312h(0 == true ? 1 : 0, onIntent);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    z13 = false;
                    objM6514H2 = new C10312h(0 == true ? 1 : 0, onIntent);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H2;
                c6021p.m6553p(z13);
                InterfaceC10459q interfaceC10459qM11244d3 = AbstractC10844c.m11244d(c10456n, 1.0f);
                C17767k0 c17767k2 = AbstractC4048f0.f12769a;
                C5984W0 c5984w2 = AbstractC3959O0.f12302a;
                z14 = z13;
                AbstractC9751J3.m10349b(interfaceC1426a3, interfaceC10459qM11244d3, AbstractC4048f0.m4733b(((C3949M0) c6021p.m6548k(c5984w2)).f12236r, ((C3949M0) c6021p.m6548k(c5984w2)).f12213a, c6021p, 12), state.m10882f(C21839a.f69305c), false, AbstractC10309e.f30609b, c6021p, 196656, 16);
                c6021p.m6524S(165060362);
                if (z11) {
                    AbstractC3984T1.m4692k(AbstractC10842a.m11234l(c10456n, AbstractC7313q.f23201f, AbstractC7313q.f23198c), 0.0f, 0L, c6021p, 0, 6);
                }
                r5.m6553p(z14);
                r5.m6524S(165067373);
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                objM6514H3 = c6021p.m6514H();
                if (z15) {
                    z16 = true;
                    objM6514H3 = new C10312h(1 == true ? 1 : 0, onIntent);
                    r5.m6537c0(objM6514H3);
                } else {
                    z16 = true;
                    objM6514H3 = new C10312h(1 == true ? 1 : 0, onIntent);
                    r5.m6537c0(objM6514H3);
                }
                r5.m6553p(z14);
                AbstractC9751J3.m10348a((InterfaceC1426a) objM6514H3, AbstractC10844c.m11244d(c10456n, 1.0f), null, state.m10882f(C21840b.f69306c), false, AbstractC10309e.f30610c, c6021p, 196656, 20);
                c6021p.m6553p(z16);
                z10 = z11;
                interfaceC10459q4 = interfaceC10459q7;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C6218v(state, onIntent, interfaceC10459q4, z10, i10, i11);
            }
        }
        i12 |= 384;
        interfaceC10459q2 = interfaceC10459q;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z10 = z6;
                if (c6021p.m6544g(z10)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i12;
            if ((i15 & 1171) == 1170) {
                c10456n = C10456n.f30959Y;
                if (i18 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                AbstractActivityC17375g abstractActivityC17375g4 = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
                C16525B c16525b4 = new C16525B();
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                C2925c c2925c4 = ((C6035w) objM6514H).f19668Y;
                InterfaceC20904w interfaceC20904w4 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                C17756f c17756f4 = AbstractC17770m.f56724a;
                C17790w c17790wM19515a4 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30946y0, c6021p, 0);
                i16 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a4);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m4);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                } else {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d4);
                InterfaceC10459q interfaceC10459q8 = interfaceC10459q3;
                AbstractC9751J3.m10349b(new C9007b(c16525b4, c2925c4, onIntent, abstractActivityC17375g4, state, interfaceC20904w4, 1), AbstractC10844c.m11244d(c10456n, 1.0f), null, state.m10882f(C21841c.f69307c), false, AbstractC10309e.f30608a, c6021p, 196656, 20);
                c6021p.m6524S(165044215);
                i17 = i15 & 112;
                if (i17 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z12) {
                    z13 = false;
                    objM6514H2 = new C10312h(0 == true ? 1 : 0, onIntent);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    z13 = false;
                    objM6514H2 = new C10312h(0 == true ? 1 : 0, onIntent);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) objM6514H2;
                c6021p.m6553p(z13);
                InterfaceC10459q interfaceC10459qM11244d4 = AbstractC10844c.m11244d(c10456n, 1.0f);
                C17767k0 c17767k3 = AbstractC4048f0.f12769a;
                C5984W0 c5984w3 = AbstractC3959O0.f12302a;
                z14 = z13;
                AbstractC9751J3.m10349b(interfaceC1426a4, interfaceC10459qM11244d4, AbstractC4048f0.m4733b(((C3949M0) c6021p.m6548k(c5984w3)).f12236r, ((C3949M0) c6021p.m6548k(c5984w3)).f12213a, c6021p, 12), state.m10882f(C21839a.f69305c), false, AbstractC10309e.f30609b, c6021p, 196656, 16);
                c6021p.m6524S(165060362);
                if (z11) {
                    AbstractC3984T1.m4692k(AbstractC10842a.m11234l(c10456n, AbstractC7313q.f23201f, AbstractC7313q.f23198c), 0.0f, 0L, c6021p, 0, 6);
                }
                r5.m6553p(z14);
                r5.m6524S(165067373);
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                objM6514H3 = c6021p.m6514H();
                if (z15) {
                    z16 = true;
                    objM6514H3 = new C10312h(1 == true ? 1 : 0, onIntent);
                    r5.m6537c0(objM6514H3);
                } else {
                    z16 = true;
                    objM6514H3 = new C10312h(1 == true ? 1 : 0, onIntent);
                    r5.m6537c0(objM6514H3);
                }
                r5.m6553p(z14);
                AbstractC9751J3.m10348a((InterfaceC1426a) objM6514H3, AbstractC10844c.m11244d(c10456n, 1.0f), null, state.m10882f(C21840b.f69306c), false, AbstractC10309e.f30610c, c6021p, 196656, 20);
                c6021p.m6553p(z16);
                z10 = z11;
                interfaceC10459q4 = interfaceC10459q8;
            } else {
                c10456n = C10456n.f30959Y;
                if (i18 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                AbstractActivityC17375g abstractActivityC17375g5 = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
                C16525B c16525b5 = new C16525B();
                objM6514H = c6021p.m6514H();
                c5975s = C6013l.f19514a;
                if (objM6514H == c5975s) {
                    objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                C2925c c2925c5 = ((C6035w) objM6514H).f19668Y;
                InterfaceC20904w interfaceC20904w5 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                C17756f c17756f5 = AbstractC17770m.f56724a;
                C17790w c17790wM19515a5 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30946y0, c6021p, 0);
                i16 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a5);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m5);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                } else {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d5);
                InterfaceC10459q interfaceC10459q9 = interfaceC10459q3;
                AbstractC9751J3.m10349b(new C9007b(c16525b5, c2925c5, onIntent, abstractActivityC17375g5, state, interfaceC20904w5, 1), AbstractC10844c.m11244d(c10456n, 1.0f), null, state.m10882f(C21841c.f69307c), false, AbstractC10309e.f30608a, c6021p, 196656, 20);
                c6021p.m6524S(165044215);
                i17 = i15 & 112;
                if (i17 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objM6514H2 = c6021p.m6514H();
                if (z12) {
                    z13 = false;
                    objM6514H2 = new C10312h(0 == true ? 1 : 0, onIntent);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    z13 = false;
                    objM6514H2 = new C10312h(0 == true ? 1 : 0, onIntent);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC1426a interfaceC1426a5 = (InterfaceC1426a) objM6514H2;
                c6021p.m6553p(z13);
                InterfaceC10459q interfaceC10459qM11244d5 = AbstractC10844c.m11244d(c10456n, 1.0f);
                C17767k0 c17767k4 = AbstractC4048f0.f12769a;
                C5984W0 c5984w4 = AbstractC3959O0.f12302a;
                z14 = z13;
                AbstractC9751J3.m10349b(interfaceC1426a5, interfaceC10459qM11244d5, AbstractC4048f0.m4733b(((C3949M0) c6021p.m6548k(c5984w4)).f12236r, ((C3949M0) c6021p.m6548k(c5984w4)).f12213a, c6021p, 12), state.m10882f(C21839a.f69305c), false, AbstractC10309e.f30609b, c6021p, 196656, 16);
                c6021p.m6524S(165060362);
                if (z11) {
                    AbstractC3984T1.m4692k(AbstractC10842a.m11234l(c10456n, AbstractC7313q.f23201f, AbstractC7313q.f23198c), 0.0f, 0L, c6021p, 0, 6);
                }
                r5.m6553p(z14);
                r5.m6524S(165067373);
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                objM6514H3 = c6021p.m6514H();
                if (z15) {
                    z16 = true;
                    objM6514H3 = new C10312h(1 == true ? 1 : 0, onIntent);
                    r5.m6537c0(objM6514H3);
                } else {
                    z16 = true;
                    objM6514H3 = new C10312h(1 == true ? 1 : 0, onIntent);
                    r5.m6537c0(objM6514H3);
                }
                r5.m6553p(z14);
                AbstractC9751J3.m10348a((InterfaceC1426a) objM6514H3, AbstractC10844c.m11244d(c10456n, 1.0f), null, state.m10882f(C21840b.f69306c), false, AbstractC10309e.f30610c, c6021p, 196656, 20);
                c6021p.m6553p(z16);
                z10 = z11;
                interfaceC10459q4 = interfaceC10459q9;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C6218v(state, onIntent, interfaceC10459q4, z10, i10, i11);
            }
        }
        i12 |= 3072;
        z10 = z6;
        i15 = i12;
        if ((i15 & 1171) == 1170) {
            c10456n = C10456n.f30959Y;
            if (i18 != 0) {
                interfaceC10459q3 = c10456n;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            if (i13 != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            AbstractActivityC17375g abstractActivityC17375g6 = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            C16525B c16525b6 = new C16525B();
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            C2925c c2925c6 = ((C6035w) objM6514H).f19668Y;
            InterfaceC20904w interfaceC20904w6 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C17756f c17756f6 = AbstractC17770m.f56724a;
            C17790w c17790wM19515a6 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30946y0, c6021p, 0);
            i16 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a6);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m6);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            } else {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d6);
            InterfaceC10459q interfaceC10459q10 = interfaceC10459q3;
            AbstractC9751J3.m10349b(new C9007b(c16525b6, c2925c6, onIntent, abstractActivityC17375g6, state, interfaceC20904w6, 1), AbstractC10844c.m11244d(c10456n, 1.0f), null, state.m10882f(C21841c.f69307c), false, AbstractC10309e.f30608a, c6021p, 196656, 20);
            c6021p.m6524S(165044215);
            i17 = i15 & 112;
            if (i17 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            objM6514H2 = c6021p.m6514H();
            if (z12) {
                z13 = false;
                objM6514H2 = new C10312h(0 == true ? 1 : 0, onIntent);
                c6021p.m6537c0(objM6514H2);
            } else {
                z13 = false;
                objM6514H2 = new C10312h(0 == true ? 1 : 0, onIntent);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC1426a interfaceC1426a6 = (InterfaceC1426a) objM6514H2;
            c6021p.m6553p(z13);
            InterfaceC10459q interfaceC10459qM11244d6 = AbstractC10844c.m11244d(c10456n, 1.0f);
            C17767k0 c17767k5 = AbstractC4048f0.f12769a;
            C5984W0 c5984w5 = AbstractC3959O0.f12302a;
            z14 = z13;
            AbstractC9751J3.m10349b(interfaceC1426a6, interfaceC10459qM11244d6, AbstractC4048f0.m4733b(((C3949M0) c6021p.m6548k(c5984w5)).f12236r, ((C3949M0) c6021p.m6548k(c5984w5)).f12213a, c6021p, 12), state.m10882f(C21839a.f69305c), false, AbstractC10309e.f30609b, c6021p, 196656, 16);
            c6021p.m6524S(165060362);
            if (z11) {
                AbstractC3984T1.m4692k(AbstractC10842a.m11234l(c10456n, AbstractC7313q.f23201f, AbstractC7313q.f23198c), 0.0f, 0L, c6021p, 0, 6);
            }
            r5.m6553p(z14);
            r5.m6524S(165067373);
            if (i17 == 32) {
                z15 = true;
            } else {
                z15 = z14;
            }
            objM6514H3 = c6021p.m6514H();
            if (z15) {
                z16 = true;
                objM6514H3 = new C10312h(1 == true ? 1 : 0, onIntent);
                r5.m6537c0(objM6514H3);
            } else {
                z16 = true;
                objM6514H3 = new C10312h(1 == true ? 1 : 0, onIntent);
                r5.m6537c0(objM6514H3);
            }
            r5.m6553p(z14);
            AbstractC9751J3.m10348a((InterfaceC1426a) objM6514H3, AbstractC10844c.m11244d(c10456n, 1.0f), null, state.m10882f(C21840b.f69306c), false, AbstractC10309e.f30610c, c6021p, 196656, 20);
            c6021p.m6553p(z16);
            z10 = z11;
            interfaceC10459q4 = interfaceC10459q10;
        } else {
            c10456n = C10456n.f30959Y;
            if (i18 != 0) {
                interfaceC10459q3 = c10456n;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            if (i13 != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            AbstractActivityC17375g abstractActivityC17375g7 = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            C16525B c16525b7 = new C16525B();
            objM6514H = c6021p.m6514H();
            c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            C2925c c2925c7 = ((C6035w) objM6514H).f19668Y;
            InterfaceC20904w interfaceC20904w7 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C17756f c17756f7 = AbstractC17770m.f56724a;
            C17790w c17790wM19515a7 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30946y0, c6021p, 0);
            i16 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m7 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d7 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a7);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m7);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            } else {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d7);
            InterfaceC10459q interfaceC10459q11 = interfaceC10459q3;
            AbstractC9751J3.m10349b(new C9007b(c16525b7, c2925c7, onIntent, abstractActivityC17375g7, state, interfaceC20904w7, 1), AbstractC10844c.m11244d(c10456n, 1.0f), null, state.m10882f(C21841c.f69307c), false, AbstractC10309e.f30608a, c6021p, 196656, 20);
            c6021p.m6524S(165044215);
            i17 = i15 & 112;
            if (i17 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            objM6514H2 = c6021p.m6514H();
            if (z12) {
                z13 = false;
                objM6514H2 = new C10312h(0 == true ? 1 : 0, onIntent);
                c6021p.m6537c0(objM6514H2);
            } else {
                z13 = false;
                objM6514H2 = new C10312h(0 == true ? 1 : 0, onIntent);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC1426a interfaceC1426a7 = (InterfaceC1426a) objM6514H2;
            c6021p.m6553p(z13);
            InterfaceC10459q interfaceC10459qM11244d7 = AbstractC10844c.m11244d(c10456n, 1.0f);
            C17767k0 c17767k6 = AbstractC4048f0.f12769a;
            C5984W0 c5984w6 = AbstractC3959O0.f12302a;
            z14 = z13;
            AbstractC9751J3.m10349b(interfaceC1426a7, interfaceC10459qM11244d7, AbstractC4048f0.m4733b(((C3949M0) c6021p.m6548k(c5984w6)).f12236r, ((C3949M0) c6021p.m6548k(c5984w6)).f12213a, c6021p, 12), state.m10882f(C21839a.f69305c), false, AbstractC10309e.f30609b, c6021p, 196656, 16);
            c6021p.m6524S(165060362);
            if (z11) {
                AbstractC3984T1.m4692k(AbstractC10842a.m11234l(c10456n, AbstractC7313q.f23201f, AbstractC7313q.f23198c), 0.0f, 0L, c6021p, 0, 6);
            }
            r5.m6553p(z14);
            r5.m6524S(165067373);
            if (i17 == 32) {
                z15 = true;
            } else {
                z15 = z14;
            }
            objM6514H3 = c6021p.m6514H();
            if (z15) {
                z16 = true;
                objM6514H3 = new C10312h(1 == true ? 1 : 0, onIntent);
                r5.m6537c0(objM6514H3);
            } else {
                z16 = true;
                objM6514H3 = new C10312h(1 == true ? 1 : 0, onIntent);
                r5.m6537c0(objM6514H3);
            }
            r5.m6553p(z14);
            AbstractC9751J3.m10348a((InterfaceC1426a) objM6514H3, AbstractC10844c.m11244d(c10456n, 1.0f), null, state.m10882f(C21840b.f69306c), false, AbstractC10309e.f30610c, c6021p, 196656, 20);
            c6021p.m6553p(z16);
            z10 = z11;
            interfaceC10459q4 = interfaceC10459q11;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6218v(state, onIntent, interfaceC10459q4, z10, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096 A[Catch: Exception -> 0x0030, c -> 0x0033, CancellationException -> 0x0036, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002c, B:29:0x008d, B:31:0x0096, B:34:0x00b9, B:36:0x00c1, B:37:0x00c9), top: B:49:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c1 A[Catch: Exception -> 0x0030, c -> 0x0033, CancellationException -> 0x0036, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002c, B:29:0x008d, B:31:0x0096, B:34:0x00b9, B:36:0x00c1, B:37:0x00c9), top: B:49:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9 A[Catch: Exception -> 0x0030, c -> 0x0033, CancellationException -> 0x0036, TRY_LEAVE, TryCatch #0 {Exception -> 0x0030, blocks: (B:12:0x002c, B:29:0x008d, B:31:0x0096, B:34:0x00b9, B:36:0x00c1, B:37:0x00c9), top: B:49:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0096, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public static final Object m21071b(Activity context, String serverClientId, InterfaceC20904w interfaceC20904w, AbstractC19687c abstractC19687c) {
        C10313i c10313i;
        C3430e c3430e;
        AbstractC0235c abstractC0235c;
        String str;
        if (abstractC19687c instanceof C10313i) {
            c10313i = (C10313i) abstractC19687c;
            int i10 = c10313i.f30623p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c10313i.f30623p0 = i10 - Integer.MIN_VALUE;
            } else {
                c10313i = new C10313i(abstractC19687c);
            }
        } else {
            c10313i = new C10313i(abstractC19687c);
        }
        Object obj = c10313i.f30622o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c10313i.f30623p0;
        try {
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj);
                C3430e c3430eM8749b = AbstractC8168p6.m8749b("googleCredentialMangerLogin", null);
                AbstractC16544l.m18094g(context, "context");
                C18639a c18639a = new C18639a(4);
                String strM8846a = AbstractC8218w0.m8846a(32);
                AbstractC16544l.m18094g(serverClientId, "serverClientId");
                if (serverClientId.length() <= 0) {
                    throw new IllegalArgumentException("serverClientId should not be empty");
                }
                C13833a c13833a = new C13833a(serverClientId, strM8846a);
                ArrayList arrayList = new ArrayList();
                arrayList.add(c13833a);
                C2650n c2650n = new C2650n(AbstractC17680n.m19322C0(arrayList));
                try {
                    c10313i.f30620Y = interfaceC20904w;
                    c10313i.f30621Z = c3430eM8749b;
                    c10313i.f30623p0 = 1;
                    Object objM20001p = c18639a.m20001p(context, c2650n, c10313i);
                    if (objM20001p == enumC19250a) {
                        return enumC19250a;
                    }
                    obj = objM20001p;
                    c3430e = c3430eM8749b;
                    abstractC0235c = ((C2651o) obj).f8165a;
                    if (abstractC0235c instanceof C2649m) {
                        str = (String) abstractC0235c.f878b;
                        if (!str.equals("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
                            return AbstractC8144m6.m8682c((Bundle) abstractC0235c.f879c);
                        }
                        AbstractC8160o6.m8731f(c3430e, "Unexpected credential type: ".concat(str), null, null, 6);
                    } else {
                        AbstractC8160o6.m8731f(c3430e, "Unexpected credential class: " + AbstractC16526C.f51263a.mo5693b(abstractC0235c.getClass()).mo4448c(), null, null, 6);
                    }
                } catch (Exception e10) {
                    e = e10;
                    c3430e = c3430eM8749b;
                    interfaceC20904w.mo21447a(C20889h.f66548d, AbstractC17660E.m19258c(new C17309l("error_message", String.valueOf(e.getMessage()))));
                    AbstractC8160o6.m8728c(c3430e, "Google Credential Manager login failed", e, null, 4);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3430e = c10313i.f30621Z;
                interfaceC20904w = c10313i.f30620Y;
                try {
                    AbstractC9233X.m9807c(obj);
                    abstractC0235c = ((C2651o) obj).f8165a;
                    if (abstractC0235c instanceof C2649m) {
                        AbstractC8160o6.m8731f(c3430e, "Unexpected credential class: " + AbstractC16526C.f51263a.mo5693b(abstractC0235c.getClass()).mo4448c(), null, null, 6);
                    } else {
                        str = (String) abstractC0235c.f878b;
                        if (!str.equals("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
                            return AbstractC8144m6.m8682c((Bundle) abstractC0235c.f879c);
                        }
                        AbstractC8160o6.m8731f(c3430e, "Unexpected credential type: ".concat(str), null, null, 6);
                    }
                } catch (Exception e11) {
                    e = e11;
                    interfaceC20904w.mo21447a(C20889h.f66548d, AbstractC17660E.m19258c(new C17309l("error_message", String.valueOf(e.getMessage()))));
                    AbstractC8160o6.m8728c(c3430e, "Google Credential Manager login failed", e, null, 4);
                }
            }
            return null;
        } catch (C2977c e12) {
            throw AbstractC0575H.m1172a("User cancelled login", e12);
        } catch (CancellationException e13) {
            throw e13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.graphics.YuvImage] */
    /* JADX INFO: renamed from: c */
    public static final Bitmap m21072c(Image image, int i10) {
        ?? size;
        AbstractC16544l.m18094g(image, "<this>");
        int width = image.getWidth();
        int height = image.getHeight();
        Image.Plane[] planes = image.getPlanes();
        if (planes == null) {
            return null;
        }
        int width2 = image.getWidth();
        int height2 = image.getHeight();
        int i11 = width2 * height2;
        byte[] bArr = new byte[AbstractC10763a.m11068z(i11, 4, 2, i11)];
        ByteBuffer buffer = planes[1].getBuffer();
        ByteBuffer buffer2 = planes[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i12 = (i11 * 2) / 4;
        ?? r10 = buffer2.remaining() == i12 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (r10 == true) {
            planes[0].getBuffer().rewind();
            planes[0].getBuffer().get(bArr, 0, i11);
            ByteBuffer buffer3 = planes[1].getBuffer();
            planes[2].getBuffer().get(bArr, i11, 1);
            buffer3.get(bArr, i11 + 1, i12 - 1);
        } else {
            AbstractC18857c.m20159f(planes[0], width2, height2, bArr, 0, 1);
            AbstractC18857c.m20159f(planes[1], width2, height2, bArr, i11 + 1, 2);
            AbstractC18857c.m20159f(planes[2], width2, height2, bArr, i11, 2);
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        AbstractC16544l.m18093f(byteBufferWrap, "wrap(...)");
        byteBufferWrap.rewind();
        int iLimit2 = byteBufferWrap.limit();
        byte[] bArr2 = new byte[iLimit2];
        byteBufferWrap.get(bArr2, 0, iLimit2);
        try {
            size = bArr2;
            ?? yuvImage = new YuvImage(size, 17, width, height, null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    yuvImage.compressToJpeg(new Rect(0, 0, width, height), 80, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    size = byteArrayOutputStream.size();
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, size);
                    AbstractC7942M5.m8232a(byteArrayOutputStream, null);
                    AbstractC16544l.m18091d(bitmapDecodeByteArray);
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i10);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                    AbstractC16544l.m18093f(bitmapCreateBitmap, "createBitmap(...)");
                    if (!bitmapCreateBitmap.equals(bitmapDecodeByteArray)) {
                        bitmapDecodeByteArray.recycle();
                    }
                    return bitmapCreateBitmap;
                } catch (Throwable th2) {
                    size = 0;
                    size = 0;
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC7942M5.m8232a(byteArrayOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Exception unused) {
                return size;
            }
        } catch (Exception unused2) {
            size = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C7224p m21073d(C3152j0 c3152j0) {
        try {
            Image imageMo3971w0 = c3152j0.f9591Z.mo3971w0();
            if (imageMo3971w0 == null) {
                return null;
            }
            return new C7224p(imageMo3971w0, c3152j0.f9489q0.mo3967g());
        } catch (IllegalStateException | NullPointerException unused) {
            return null;
        }
    }
}
