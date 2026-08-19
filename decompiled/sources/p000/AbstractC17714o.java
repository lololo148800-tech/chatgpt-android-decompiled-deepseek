package p000;

import android.content.Context;
import androidx.camera.view.PreviewView;
import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.p650ui.graphics.AbstractC10864a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p650ui.viewinterop.AbstractC10869a;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p002A0.C0122V;
import p003A1.AbstractC0168G;
import p003A1.C0248f0;
import p003A1.C0254h0;
import p003A1.C0286s;
import p017Af.C0478i;
import p017Af.C0494y;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p153Fn.C2925c;
import p155G.C2953e;
import p178H.C3123P;
import p178H.C3142e0;
import p178H.C3163p;
import p195Hh.C3430e;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4141u3;
import p229J0.C3949M0;
import p229J0.C4135t3;
import p349O0.C5975S;
import p349O0.C5994b0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8087f5;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8168p6;
import p536W.C8408d;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8455C;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9183O2;
import p594Y9.AbstractC9900h3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p720e6.C13287b;
import p736f0.AbstractC13508z;
import p736f0.C13467E;
import p736f0.C13468F;
import p747fb.InterfaceFutureC13608b;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13764h;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p882m1.AbstractC17140a;
import p894n0.InterfaceC17406l;
import p911o0.AbstractC17780r;
import p914o3.AbstractC17814e;

/* JADX INFO: renamed from: o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17714o {

    /* JADX INFO: renamed from: a */
    public static final long f56551a = AbstractC14334L.m15625c(1714434096);

    /* JADX INFO: renamed from: b */
    public static final C3430e f56552b = AbstractC8168p6.m8749b("CameraPreviewContent", null);

    /* JADX INFO: renamed from: a */
    public static final void m19451a(AbstractC17140a abstractC17140a, String str, boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, long j10, long j11, C6021p c6021p, int i10) {
        int i11;
        long j12;
        long j13;
        c6021p.m6526U(-1467168067);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(abstractC17140a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        int i12 = i11 | 1769472;
        if ((599187 & i12) == 599186 && c6021p.m6562y()) {
            c6021p.m6517L();
            j13 = j10;
            j12 = j11;
        } else {
            j12 = C14365u.f45055e;
            C13467E c13467eM15013e = AbstractC13508z.m15013e(AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6), 2);
            C13468F c13468fM15014f = AbstractC13508z.m15014f(AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6), 2);
            long j14 = f56551a;
            AbstractC10831a.m11201d(z6, interfaceC10459q, c13467eM15013e, c13468fM15014f, null, AbstractC8411c.m8969c(1181851029, c6021p, new C11205b(j14, interfaceC1426a, abstractC17140a, str, j12)), c6021p, ((i12 >> 6) & 14) | 200064 | ((i12 >> 9) & 112), 16);
            j13 = j14;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C11540c(abstractC17140a, str, z6, interfaceC1426a, interfaceC10459q, j13, j12, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19452b(int i10, InterfaceC1426a interfaceC1426a, InterfaceC1439n onImageCapture, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        InterfaceC5985X interfaceC5985X;
        AbstractC16544l.m18094g(onImageCapture, "onImageCapture");
        c6021p.m6526U(1676616573);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onImageCapture) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            InterfaceC11112u interfaceC11112u = (InterfaceC11112u) c6021p.m6548k(AbstractC17814e.f56807a);
            c6021p.m6524S(-741049502);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            C5975S c5975s = C5975S.f19448r0;
            if (objM6514H == obj) {
                objM6514H = C5997d.m6430Q(C3163p.f9512c, c5975s);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM6514H;
            Object objM530s = AbstractC0168G.m530s(-741046470, c6021p, false);
            if (objM530s == obj) {
                C8408d c8408d = C8408d.f26139g;
                objM530s = AbstractC9900h3.m10565b(context);
                c6021p.m6537c0(objM530s);
            }
            InterfaceFutureC13608b interfaceFutureC13608b = (InterfaceFutureC13608b) objM530s;
            Object objM530s2 = AbstractC0168G.m530s(-741043100, c6021p, false);
            if (objM530s2 == obj) {
                objM530s2 = C5997d.m6430Q(null, c5975s);
                c6021p.m6537c0(objM530s2);
            }
            InterfaceC5985X interfaceC5985X3 = (InterfaceC5985X) objM530s2;
            Object objM530s3 = AbstractC0168G.m530s(-741039959, c6021p, false);
            if (objM530s3 == obj) {
                objM530s3 = new C2953e(2).m3778a();
                c6021p.m6537c0(objM530s3);
            }
            C3142e0 c3142e0 = (C3142e0) objM530s3;
            c6021p.m6553p(false);
            AbstractC16544l.m18091d(c3142e0);
            c6021p.m6524S(-741037970);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                objM6514H2 = new C13287b(11).m14901e();
                c6021p.m6537c0(objM6514H2);
            }
            C3123P c3123p = (C3123P) objM6514H2;
            c6021p.m6553p(false);
            AbstractC16544l.m18091d(c3123p);
            c6021p.m6524S(-741034457);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == obj) {
                objM6514H3 = C5997d.m6428O(0.0f);
                c6021p.m6537c0(objM6514H3);
            }
            C5994b0 c5994b0 = (C5994b0) objM6514H3;
            c6021p.m6553p(false);
            InterfaceC5982V0 interfaceC5982V0M15261b = AbstractC13764h.m15261b(c5994b0.m6409g(), AbstractC13758e.m15254s(1.0f, 50.0f, null, 4), "", c6021p, 3120, 20);
            C8408d c8408d2 = (C8408d) interfaceC5985X3.getValue();
            c6021p.m6524S(-741023280);
            Object objM6514H4 = c6021p.m6514H();
            if (objM6514H4 == obj) {
                objM6514H4 = new C0248f0(interfaceC5985X3, 5);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            C5997d.m6444c(c8408d2, (InterfaceC1436k) objM6514H4, c6021p);
            c6021p.m6524S(-741018208);
            boolean zM6545h = c6021p.m6545h(interfaceFutureC13608b) | c6021p.m6545h(context);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6545h || objM6514H5 == obj) {
                objM6514H5 = new C13192e(interfaceFutureC13608b, context, interfaceC5985X3, null);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H5, c6021p, interfaceFutureC13608b);
            c6021p.m6524S(-741007867);
            Object objM6514H6 = c6021p.m6514H();
            if (objM6514H6 == obj) {
                objM6514H6 = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM6514H6);
            }
            InterfaceC5985X interfaceC5985X4 = (InterfaceC5985X) objM6514H6;
            c6021p.m6553p(false);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(-741005898);
            Object objM6514H7 = c6021p.m6514H();
            if (objM6514H7 == obj) {
                objM6514H7 = new C13459f(interfaceC5985X4, null);
                c6021p.m6537c0(objM6514H7);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H7, c6021p, c17296c);
            InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(AbstractC8079e5.m8501a(interfaceC10459q, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13378b), C14365u.m15774b(0.38f, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12189C), AbstractC14334L.f44973a);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11207b);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a2 = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a2);
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
            C8408d c8408d3 = (C8408d) interfaceC5985X3.getValue();
            C3163p c3163p = (C3163p) interfaceC5985X2.getValue();
            AbstractC16544l.m18093f(c3163p, "CameraPreview$lambda$1(...)");
            boolean zBooleanValue = ((Boolean) interfaceC5985X4.getValue()).booleanValue();
            float fFloatValue = ((Number) interfaceC5982V0M15261b.getValue()).floatValue();
            c6021p.m6524S(2146947110);
            Object objM6514H8 = c6021p.m6514H();
            if (objM6514H8 == obj) {
                interfaceC5985X = interfaceC5985X2;
                objM6514H8 = new C0286s(c5994b0, 14, interfaceC5985X);
                c6021p.m6537c0(objM6514H8);
            } else {
                interfaceC5985X = interfaceC5985X2;
            }
            InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H8;
            c6021p.m6553p(false);
            c6021p.m6524S(2146961219);
            boolean z6 = (i12 & 896) == 256;
            Object objM6514H9 = c6021p.m6514H();
            if (z6 || objM6514H9 == obj) {
                objM6514H9 = new C0122V(onImageCapture, 15, interfaceC5985X);
                c6021p.m6537c0(objM6514H9);
            }
            c6021p.m6553p(false);
            m19453c(context, interfaceC11112u, c8408d3, c3163p, zBooleanValue, c3142e0, c3123p, fFloatValue, interfaceC1426a3, (InterfaceC1436k) objM6514H9, interfaceC1426a, AbstractC10844c.f32512c, c6021p, 100663296, ((i12 >> 3) & 14) | 48);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C13721g(interfaceC10459q, interfaceC1426a, onImageCapture, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m19453c(Context context, InterfaceC11112u interfaceC11112u, C8408d c8408d, C3163p c3163p, boolean z6, C3142e0 c3142e0, C3123P c3123p, float f10, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a2, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        C6021p c6021p2;
        c6021p.m6526U(-2031760427);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(context) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(interfaceC11112u) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(c8408d) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(c3163p) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6544g(z6) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= c6021p.m6545h(c3142e0) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c6021p.m6545h(c3123p) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c6021p.m6536c(f10) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c6021p.m6545h(interfaceC1426a) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 536870912 : 268435456;
        }
        int i14 = i12;
        if ((i11 & 6) == 0) {
            i13 = i11 | (c6021p.m6545h(interfaceC1426a2) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        int i15 = i13;
        if ((i14 & 306783379) == 306783378 && (i15 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            C2925c c2925c = ((C6035w) objM6514H).f19668Y;
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i16 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            C10843b c10843b = C10843b.f32509a;
            c6021p.m6524S(-2097808682);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == c5975s) {
                objM6514H2 = new PreviewView(context, null);
                c6021p.m6537c0(objM6514H2);
            }
            PreviewView previewView = (PreviewView) objM6514H2;
            c6021p.m6553p(false);
            C10456n c10456n = C10456n.f30959Y;
            FillElement fillElement = AbstractC10844c.f32512c;
            c6021p.m6524S(-2097803868);
            boolean zM6545h = c6021p.m6545h(previewView);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h || objM6514H3 == c5975s) {
                objM6514H3 = new C0254h0(previewView, 11);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC10869a.m11356b((InterfaceC1436k) objM6514H3, fillElement, null, c6021p, 48, 4);
            c6021p.m6524S(-2097800243);
            boolean zM6545h2 = c6021p.m6545h(c8408d) | c6021p.m6545h(c3142e0) | c6021p.m6545h(previewView) | c6021p.m6545h(interfaceC11112u) | c6021p.m6545h(c3163p) | c6021p.m6545h(c3123p) | c6021p.m6545h(c8870f) | c6021p.m6545h(context);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6545h2 || objM6514H4 == c5975s) {
                C14209h c14209h = new C14209h(c8408d, c3142e0, previewView, interfaceC11112u, c3163p, c3123p, c8870f, context, null);
                c6021p2 = c6021p;
                c6021p2.m6537c0(c14209h);
                objM6514H4 = c14209h;
            } else {
                c6021p2 = c6021p;
            }
            c6021p2.m6553p(false);
            C5997d.m6451g(c3163p, c8408d, (InterfaceC1439n) objM6514H4, c6021p2);
            InterfaceC10459q interfaceC10459qM11240a = r20.m11240a(c10456n, C10444b.f30941t0);
            float f11 = AbstractC7313q.f23201f;
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(interfaceC10459qM11240a, f11);
            c6021p2.m6524S(-2097768276);
            boolean zM6545h3 = c6021p2.m6545h(context) | c6021p2.m6545h(c2925c) | c6021p2.m6545h(c3123p) | ((i14 & 1879048192) == 536870912);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6545h3 || objM6514H5 == c5975s) {
                objM6514H5 = new C0494y(context, c2925c, c3123p, interfaceC1436k);
                c6021p2.m6537c0(objM6514H5);
            }
            c6021p2.m6553p(false);
            m19454d(z6, (InterfaceC1426a) objM6514H5, interfaceC10459qM11233k, 0L, c6021p, (i14 >> 12) & 14);
            int i17 = (i14 >> 6) & 896;
            m19451a(AbstractC8126k4.m8631b(R.drawable.rotate_image, c6021p2, 0), AbstractC8142m4.m8676d(R.string.voice_switch_cameras, c6021p2), z6, interfaceC1426a, AbstractC8087f5.m8534c(AbstractC10842a.m11233k(r20.m11240a(c10456n, C10444b.f30942u0), f11), f10), 0L, 0L, c6021p, i17 | ((i14 >> 15) & 7168));
            m19451a(AbstractC8126k4.m8631b(R.drawable.close_lg, c6021p2, 0), AbstractC8142m4.m8676d(R.string.close_camera, c6021p2), z6, interfaceC1426a2, AbstractC10842a.m11233k(c10843b.m11240a(c10456n, C10444b.f30936o0), AbstractC7313q.f23199d), 0L, 0L, c6021p, i17 | ((i15 << 9) & 7168));
            c6021p2.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C15528j(context, interfaceC11112u, c8408d, c3163p, z6, c3142e0, c3123p, f10, interfaceC1426a, interfaceC1436k, interfaceC1426a2, interfaceC10459q, i10, i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m19454d(boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, long j10, C6021p c6021p, int i10) {
        int i11;
        long j11;
        c6021p.m6526U(962879037);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            j11 = j10;
        } else {
            long j12 = C14365u.f45055e;
            AbstractC10831a.m11201d(z6, interfaceC10459q, AbstractC13508z.m15013e(AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6), 2), AbstractC13508z.m15014f(AbstractC13758e.m15255t(RCHTTPStatusCodes.UNSUCCESSFUL, 0, null, 6), 2), null, AbstractC8411c.m8969c(2030339685, c6021p, new C16280k(j12, interfaceC1426a, 0)), c6021p, (i12 & 14) | 200064 | ((i12 >> 3) & 112), 16);
            j11 = j12;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C16649l(z6, interfaceC1426a, interfaceC10459q, j11, i10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m19455e(long j10, InterfaceC1426a onClick, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(503192911);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6540e(j10) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onClick) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-1024969016);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = AbstractC0168G.m536y(c6021p);
            }
            InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H;
            c6021p.m6553p(false);
            InterfaceC5982V0 interfaceC5982V0M15261b = AbstractC13764h.m15261b(((Boolean) AbstractC9183O2.m9739b(interfaceC17406l, c6021p).getValue()).booleanValue() ? 0.9f : 1.0f, AbstractC13758e.m15255t(100, 0, null, 6), "", c6021p, 3120, 20);
            InterfaceC10459q interfaceC10459qM11252l = AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7313q.f23206k);
            c6021p.m6524S(-1024957282);
            boolean zM6542f = c6021p.m6542f(interfaceC5982V0M15261b);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                objM6514H2 = new C17122m(interfaceC5982V0M15261b, 0);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11208c = AbstractC10833a.m11208c(AbstractC10864a.m11305a(interfaceC10459qM11252l, (InterfaceC1436k) objM6514H2), interfaceC17406l, null, false, null, onClick, 28);
            c6021p.m6524S(-1024948422);
            boolean z6 = (i12 & 14) == 4;
            Object objM6514H3 = c6021p.m6514H();
            if (z6 || objM6514H3 == obj) {
                objM6514H3 = new C0478i(j10, 2);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC8455C.m9069a(0, (InterfaceC1436k) objM6514H3, c6021p, interfaceC10459qM11208c);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C17363n(j10, onClick, i10, 0);
        }
    }
}
