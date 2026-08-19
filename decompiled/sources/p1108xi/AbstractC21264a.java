package p1108xi;

import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import com.openai.chatgpt.R;
import io.sentry.hints.C15370i;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p002A0.C0136m;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.AbstractC0233b1;
import p003A1.InterfaceC0172H0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2463L0;
import p195Hh.C3430e;
import p204I1.C3573D;
import p204I1.C3582M;
import p204I1.C3587c;
import p204I1.C3590f;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.C3941K4;
import p229J0.C4135t3;
import p328N1.AbstractC5599o;
import p349O0.AbstractC6012k0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6037x;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8071d5;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8473F;
import p571X9.AbstractC9183O2;
import p571X9.AbstractC9239Y;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13764h;
import p774h1.AbstractC14334L;
import p774h1.C14356l;
import p774h1.C14358n;
import p774h1.C14365u;
import p823j3.C16084f;
import p882m1.AbstractC17140a;
import p894n0.InterfaceC17406l;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17781r0;
import p911o0.C17790w;
import ph.C18416d;
import tf.C19941z;

/* JADX INFO: renamed from: xi.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21264a {

    /* JADX INFO: renamed from: a */
    public static final long f67635a = AbstractC14334L.m15626d(4280295715L);

    /* JADX INFO: renamed from: b */
    public static final long f67636b = AbstractC14334L.m15626d(4292467171L);

    /* JADX WARN: Code duplicated, block: B:107:0x0274  */
    /* JADX INFO: renamed from: a */
    public static final void m21617a(String language, String code, boolean z6, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        List list;
        int i12;
        boolean z10;
        boolean z11;
        Object objM4297i;
        InterfaceC10459q interfaceC10459q2;
        C14365u c14365u;
        AbstractC16544l.m18094g(language, "language");
        AbstractC16544l.m18094g(code, "code");
        c6021p.m6526U(-1699239227);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(language) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(code) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        int i13 = i11 | 3072;
        if ((i13 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(1325755732);
            C5975S c5975s = C6013l.f19514a;
            C21270g c21270g = null;
            if (z6) {
                c6021p.m6524S(1232041189);
                if (((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue()) {
                    c6021p.m6553p(false);
                    list = null;
                    c5975s = c5975s;
                    i13 = i13;
                    i12 = 32;
                    z10 = false;
                } else {
                    C3430e c3430eM9814a = AbstractC9239Y.m9814a("rememberCodeBlockMetadata", c6021p);
                    c6021p.m6524S(2125469765);
                    int i14 = (i13 & 14) ^ 6;
                    int i15 = (i13 & 112) ^ 48;
                    boolean z12 = ((i14 > 4 && c6021p.m6542f(language)) || (i13 & 6) == 4) | ((i15 > 32 && c6021p.m6542f(code)) || (i13 & 48) == 32);
                    Object objM6514H = c6021p.m6514H();
                    C5975S c5975s2 = C5975S.f19448r0;
                    if (z12 || objM6514H == c5975s) {
                        objM6514H = C5997d.m6430Q(null, c5975s2);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
                    Object objM530s = AbstractC0168G.m530s(2125471990, c6021p, false);
                    if (objM530s == c5975s) {
                        objM530s = C5997d.m6430Q(Boolean.FALSE, c5975s2);
                        c6021p.m6537c0(objM530s);
                    }
                    InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM530s;
                    c6021p.m6553p(false);
                    Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                    c6021p.m6524S(2125475381);
                    Object objM6514H2 = c6021p.m6514H();
                    if (objM6514H2 == c5975s) {
                        objM6514H2 = C5997d.m6430Q(null, c5975s2);
                        c6021p.m6537c0(objM6514H2);
                    }
                    InterfaceC5985X interfaceC5985X3 = (InterfaceC5985X) objM6514H2;
                    Object objM530s2 = AbstractC0168G.m530s(2125477621, c6021p, false);
                    if (objM530s2 == c5975s) {
                        objM530s2 = C5997d.m6430Q(null, c5975s2);
                        c6021p.m6537c0(objM530s2);
                    }
                    InterfaceC5985X interfaceC5985X4 = (InterfaceC5985X) objM530s2;
                    c6021p.m6553p(false);
                    c6021p.m6524S(2125480513);
                    boolean zM6542f = c6021p.m6542f(context);
                    Object objM6514H3 = c6021p.m6514H();
                    Object obj = objM6514H3;
                    if (zM6542f || objM6514H3 == c5975s) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        WebView webView = new WebView(context);
                        WebSettings settings = webView.getSettings();
                        settings.setJavaScriptEnabled(true);
                        settings.setBlockNetworkLoads(true);
                        settings.setBlockNetworkImage(true);
                        webView.setWebViewClient(new C21276m(jCurrentTimeMillis, interfaceC5985X3, interfaceC5985X2, c3430eM9814a));
                        webView.loadUrl("file:///android_asset/syntax_highlighting.html");
                        c6021p.m6537c0(webView);
                        obj = webView;
                    }
                    WebView webView2 = (WebView) obj;
                    c6021p.m6553p(false);
                    Boolean bool = (Boolean) interfaceC5985X2.getValue();
                    bool.getClass();
                    Object[] objArr = {bool, webView2, language, code};
                    c6021p.m6524S(2125522367);
                    boolean zM6545h = ((i15 > 32 && c6021p.m6542f(code)) || (i13 & 48) == 32) | c6021p.m6545h(webView2) | ((i14 > 4 && c6021p.m6542f(language)) || (i13 & 6) == 4) | c6021p.m6545h(c3430eM9814a) | c6021p.m6542f(interfaceC5985X);
                    Object objM6514H4 = c6021p.m6514H();
                    if (zM6545h || objM6514H4 == c5975s) {
                        i12 = 32;
                        Object c21274k = new C21274k(code, webView2, language, interfaceC5985X2, c3430eM9814a, interfaceC5985X4, interfaceC5985X, null);
                        c6021p.m6537c0(c21274k);
                        objM6514H4 = c21274k;
                    } else {
                        i12 = 32;
                    }
                    c6021p.m6553p(false);
                    C5997d.m6453i(objArr, (InterfaceC1439n) objM6514H4, c6021p);
                    InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                    Long l4 = (Long) interfaceC5985X3.getValue();
                    Long l10 = (Long) interfaceC5985X4.getValue();
                    c6021p.m6524S(2125555952);
                    boolean zM6545h2 = c6021p.m6545h(interfaceC20904w);
                    Object objM6514H5 = c6021p.m6514H();
                    if (zM6545h2 || objM6514H5 == c5975s) {
                        list = null;
                        objM6514H5 = new C21275l(interfaceC20904w, interfaceC5985X3, interfaceC5985X4, null);
                        c6021p.m6537c0(objM6514H5);
                    } else {
                        list = null;
                    }
                    z10 = false;
                    c6021p.m6553p(false);
                    C5997d.m6451g(l4, l10, (InterfaceC1439n) objM6514H5, c6021p);
                    c21270g = (C21270g) interfaceC5985X.getValue();
                    c6021p.m6553p(false);
                }
            } else {
                list = null;
                c5975s = c5975s;
                i13 = i13;
                i12 = 32;
                z10 = false;
            }
            c6021p.m6553p(z10);
            int i16 = AbstractC21272i.f67650b;
            c6021p.m6524S(-285084666);
            long j10 = AbstractC21272i.f67649a;
            c6021p.m6524S(1770253194);
            boolean zM6542f2 = c6021p.m6542f(c21270g);
            if (((i13 & 112) ^ 48) > i12 && c6021p.m6542f(code)) {
                z11 = true;
            } else if ((i13 & 48) == i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z13 = zM6542f2 | z11;
            Object objM6514H6 = c6021p.m6514H();
            if (z13 || objM6514H6 == c5975s) {
                List list2 = c21270g != null ? c21270g.f67646c : list;
                List list3 = list2;
                if (list3 == null || list3.isEmpty()) {
                    C3587c c3587c = new C3587c();
                    int iM4296h = c3587c.m4296h(new C3573D(j10, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        c3587c.m4291c(code);
                        c3587c.m4293e(iM4296h);
                        objM4297i = c3587c.m4297i();
                    } catch (Throwable th2) {
                        c3587c.m4293e(iM4296h);
                        throw th2;
                    }
                } else {
                    C3587c c3587c2 = new C3587c();
                    C14365u c14365u2 = c21270g.f67645b;
                    int iM4296h2 = c3587c2.m4296h(new C3573D(c14365u2 != null ? c14365u2.f45062a : j10, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            AbstractC21272i.m21619a(c3587c2, (C21269f) it.next());
                        }
                        c3587c2.m4293e(iM4296h2);
                        objM4297i = c3587c2.m4297i();
                    } catch (Throwable th3) {
                        c3587c2.m4293e(iM4296h2);
                        throw th3;
                    }
                }
                objM6514H6 = objM4297i;
                c6021p.m6537c0(objM6514H6);
            }
            C3590f c3590f = (C3590f) objM6514H6;
            c6021p.m6553p(false);
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM8501a = AbstractC8079e5.m8501a(c10456n, ((C4135t3) c6021p.m6548k(AbstractC4141u3.f13417a)).f13378b);
            long j11 = (c21270g == null || (c14365u = c21270g.f67644a) == null) ? C14365u.f45052b : c14365u.f45062a;
            C15370i c15370i = AbstractC14334L.f44973a;
            InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(interfaceC10459qM8501a, j11, c15370i);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i17 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11207b);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i17))) {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            C0136m c0136m = AbstractC17770m.f56729f;
            C10450h c10450h = C10444b.f30944w0;
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(AbstractC10833a.m11207b(c10456n, f67635a, c15370i), 1.0f);
            float f10 = AbstractC7313q.f23201f;
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM11244d, f10, 0.0f, AbstractC7313q.f23199d, 0.0f, 10);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c0136m, c10450h, c6021p, 54);
            int i18 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i18))) {
                AbstractC0168G.m537z(i18, c6021p, i18, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            C6037x c6037x = AbstractC4124r4.f13310a;
            AbstractC6012k0 abstractC6012k0 = AbstractC3947L4.f12183a;
            C5997d.m6440a(c6037x.mo6405a(C3582M.m4274b(((C3941K4) c6021p.m6548k(abstractC6012k0)).f12158n, f67636b, 0L, null, null, 0L, null, 0, 0, 0L, null, null, 16777214)), AbstractC8411c.m8969c(510214239, c6021p, new C18416d(language, 13, c3590f)), c6021p, 56);
            c6021p.m6553p(true);
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(c10456n, f10);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i19 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11233k);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m3);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i19))) {
                AbstractC0168G.m537z(i19, c6021p, i19, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d3);
            AbstractC4124r4.m4769c(c3590f, null, 0L, 0L, null, null, AbstractC5599o.f18133o0, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((C3941K4) c6021p.m6548k(abstractC6012k0)).f12156l, c6021p, 0, 0, 131006);
            c6021p.m6553p(true);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(language, code, z6, interfaceC10459q2, i10, 14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m21618b(C3590f c3590f, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1682296480);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c3590f) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC0172H0 interfaceC0172H0 = (InterfaceC0172H0) c6021p.m6548k(AbstractC0187M0.f702d);
            c6021p.m6524S(2146012700);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = AbstractC0168G.m536y(c6021p);
            }
            InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H;
            c6021p.m6553p(false);
            InterfaceC5982V0 interfaceC5982V0M15261b = AbstractC13764h.m15261b(((Boolean) AbstractC9183O2.m9739b(interfaceC17406l, c6021p).getValue()).booleanValue() ? 0.5f : 1.0f, null, "Copy code", c6021p, 3072, 22);
            C17756f c17756f = AbstractC17770m.f56724a;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(AbstractC7313q.f23198c);
            C10450h c10450h = C10444b.f30944w0;
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(2146027472);
            boolean zM6545h = c6021p.m6545h(interfaceC0172H0) | ((i11 & 14) == 4);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == c5975s) {
                objM6514H2 = new C16084f(interfaceC0172H0, 27, c3590f);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(AbstractC8071d5.m8483b(AbstractC10833a.m11208c(c10456n, interfaceC17406l, null, false, null, (InterfaceC1426a) objM6514H2, 28), ((Number) interfaceC5982V0M15261b.getValue()).floatValue()), AbstractC7313q.f23199d);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(c17764jM19500g, c10450h, c6021p, 48);
            int i12 = c6021p.f19564P;
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
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.ic_copy, c6021p, 0);
            String strM8676d = AbstractC8142m4.m8676d(R.string.copy_code, c6021p);
            int i13 = Build.VERSION.SDK_INT;
            long j10 = f67636b;
            AbstractC8473F.m9106a(abstractC17140aM8631b, strM8676d, AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23185b), null, null, 0.0f, new C14356l(j10, 5, i13 >= 29 ? C14358n.f45047a.m15769a(j10, 5) : new PorterDuffColorFilter(AbstractC14334L.m15617F(j10), AbstractC14334L.m15621J(5))), c6021p, 1572864, 56);
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.copy_code, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C19941z(c3590f, i10, 4);
        }
    }
}
