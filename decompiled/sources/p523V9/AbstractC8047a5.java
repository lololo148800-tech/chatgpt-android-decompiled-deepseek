package p523V9;

import af.C10561Q;
import android.content.Context;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.AbstractC10839g;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bf.C11377e;
import bf.InterfaceC11374b0;
import cd.C11709i;
import com.openai.chatgpt.R;
import com.openai.feature.gizmoshome.details.SnorlaxHomeViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0178J0;
import p006A4.C0362w;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1006s6.C19461k;
import p1051v0.AbstractC20417e;
import p1057v6.C20462b;
import p1057v6.C20463c;
import p1057v6.C20468h;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2446D;
import p196Hi.C3449s;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4084l0;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p437Rn.C6959q;
import p467T1.C7199i;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p478Tc.C7299c;
import p482Tg.C7445b0;
import p527Ve.C8275l;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p537W0.C8410b;
import p544W9.AbstractC8443A;
import p552Wg.C8847i;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9160K3;
import p571X9.AbstractC9256a4;
import p594Y9.AbstractC9746I4;
import p594Y9.AbstractC9818V;
import p623Zf.C10312h;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p706df.AbstractC13084d;
import p706df.C13087g;
import p706df.C13097q;
import p706df.C13098r;
import p706df.C13099s;
import p706df.C13100t;
import p706df.C13101u;
import p706df.C13102v;
import p706df.C13104x;
import p773h0.InterfaceC14267W;
import p895n1.C17425e;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import p909nm.C17691y;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import p917o6.C17859l;
import p917o6.C17867t;
import p917o6.InterfaceC17841I;
import p917o6.InterfaceC17842J;
import p951pp.AbstractC18539i;
import p989rd.EnumC18945g;
import sk.C19665d;

/* JADX INFO: renamed from: V9.a5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8047a5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25355a;

    /* JADX INFO: renamed from: a */
    public static final void m8428a(C11377e file, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(file, "file");
        c6021p.m6526U(1697183009);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(file) : c6021p.m6545h(file) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C5984W0 c5984w0 = AbstractC3959O0.f12302a;
            long j10 = ((C3949M0) c6021p.m6548k(c5984w0)).f12234p;
            float f10 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(AbstractC8443A.m9045a(AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7312p.f23187d), 2, j10, AbstractC20417e.m21079a(f10)), 1);
            String str = file.f34384d;
            AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(AbstractC9256a4.m9830c(str), c6021p, 0), null, AbstractC10842a.m11233k(AbstractC10833a.m11207b(interfaceC10459qM11233k, AbstractC9256a4.m9828a(str), AbstractC20417e.m21079a(f10)), AbstractC7313q.f23198c), ((C3949M0) c6021p.m6548k(c5984w0)).f12234p, c6021p, 48, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(file, i10, 17);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8429b(List items, InterfaceC10459q interfaceC10459q, float f10, int i10, C6021p c6021p, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        float f11;
        C8410b c8410b = AbstractC13084d.f41574c;
        AbstractC16544l.m18094g(items, "items");
        c6021p.m6526U(1706302643);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6545h(items) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i14 = i12 | 3504;
        if ((i11 & 24576) == 0) {
            i14 |= c6021p.m6545h(c8410b) ? 16384 : 8192;
        }
        if ((i14 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            f11 = f10;
            i13 = i10;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-957110678);
            boolean z6 = (i14 & 896) == 256;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C13097q(0.5f);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC21057K interfaceC21057K = (InterfaceC21057K) objM6514H;
            c6021p.m6553p(false);
            int i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057K);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(623634530);
            Iterator it = AbstractC17680n.m19373w0(items, 8).iterator();
            while (it.hasNext()) {
                c8410b.invoke((C11377e) it.next(), c6021p, Integer.valueOf((i14 >> 9) & 112));
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
            i13 = 8;
            f11 = 0.5f;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C13098r(items, interfaceC10459q2, f11, i13, i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8430c(C13087g c13087g, boolean z6, boolean z10, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, C6021p c6021p, int i10) {
        int i11;
        C13087g c13087g2;
        InterfaceC1436k interfaceC1436k3;
        c6021p.m6526U(-216551514);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c13087g) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k2) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            Object obj = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            c6021p.m6524S(-1638693059);
            Object objM6514H = c6021p.m6514H();
            Object obj2 = C6013l.f19514a;
            if (objM6514H == obj2) {
                objM6514H = new C11709i(null, 3);
                c6021p.m6537c0(objM6514H);
            }
            C11709i c11709i = (C11709i) objM6514H;
            Object objM530s = AbstractC0168G.m530s(-1638691191, c6021p, false);
            if (objM530s == obj2) {
                objM530s = new C7299c();
                c6021p.m6537c0(objM530s);
            }
            C7299c c7299c = (C7299c) objM530s;
            c6021p.m6553p(false);
            Object objM19906b = AbstractC18539i.m19906b(c6021p);
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
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
            InterfaceC10459q interfaceC10459qM10458b = AbstractC9818V.m10458b(c10456n, z6, false, 0.0f, 14);
            InterfaceC14267W interfaceC14267W = (InterfaceC14267W) c6021p.m6548k(AbstractC10839g.f32446a);
            c6021p.m6524S(1122064395);
            boolean zM6545h = c6021p.m6545h(objM19906b) | c6021p.m6545h(c11709i);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == obj2) {
                objM6514H2 = new C6959q(c7299c, objM19906b, c11709i, 15);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(1122054048);
            int i14 = i12 & 14;
            boolean zM6545h2 = c6021p.m6545h(obj) | ((i12 & 7168) == 2048) | (i14 == 4);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h2 || objM6514H3 == obj2) {
                c13087g2 = c13087g;
                objM6514H3 = new C6959q(obj, interfaceC1436k, c13087g2, 16);
                c6021p.m6537c0(objM6514H3);
            } else {
                c13087g2 = c13087g;
            }
            c6021p.m6553p(false);
            C13087g c13087g3 = c13087g2;
            AbstractC3914G1.m4611a(AbstractC8411c.m8969c(-144156734, c6021p, new C13099s(c13087g2, 0)), AbstractC10833a.m11210e(interfaceC10459qM10458b, c7299c, interfaceC14267W, false, interfaceC1426a2, (InterfaceC1426a) objM6514H3, 188), null, AbstractC8411c.m8969c(-1598992481, c6021p, new C13099s(c13087g2, 1)), AbstractC13084d.f41575d, null, null, 0.0f, 0.0f, c6021p, 27654, 484);
            EnumC18945g enumC18945g = EnumC18945g.f60491Z;
            c6021p.m6524S(1122097682);
            int i15 = i12 & 57344;
            boolean z11 = (i15 == 16384) | (i14 == 4);
            Object objM6514H4 = c6021p.m6514H();
            if (z11 || objM6514H4 == obj2) {
                interfaceC1436k3 = interfaceC1436k2;
                objM6514H4 = new C8847i(interfaceC1436k3, 18, c13087g3);
                c6021p.m6537c0(objM6514H4);
            } else {
                interfaceC1436k3 = interfaceC1436k2;
            }
            InterfaceC1436k interfaceC1436k4 = (InterfaceC1436k) objM6514H4;
            c6021p.m6553p(false);
            c6021p.m6524S(1122101167);
            boolean z12 = (i15 == 16384) | (i14 == 4);
            Object objM6514H5 = c6021p.m6514H();
            if (z12 || objM6514H5 == obj2) {
                objM6514H5 = new C13100t(interfaceC1436k3, c13087g3, 0);
                c6021p.m6537c0(objM6514H5);
            }
            InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H5;
            c6021p.m6553p(false);
            c6021p.m6524S(1122104526);
            boolean z13 = (i14 == 4) | (i15 == 16384);
            Object objM6514H6 = c6021p.m6514H();
            if (z13 || objM6514H6 == obj2) {
                objM6514H6 = new C13100t(interfaceC1436k3, c13087g3, 1);
                c6021p.m6537c0(objM6514H6);
            }
            InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) objM6514H6;
            c6021p.m6553p(false);
            c6021p.m6524S(1122107883);
            boolean z14 = i15 == 16384;
            Object objM6514H7 = c6021p.m6514H();
            if (z14 || objM6514H7 == obj2) {
                objM6514H7 = new C10312h(8, interfaceC1436k3);
                c6021p.m6537c0(objM6514H7);
            }
            c6021p.m6553p(false);
            AbstractC8082f0.m8512d(c11709i, c13087g3.f41579a, c13087g3.f41580b, z10, enumC18945g, interfaceC1436k4, interfaceC1426a3, interfaceC1426a4, (InterfaceC1426a) objM6514H7, null, false, c6021p, 24576 | ((i12 << 3) & 7168), 0);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C13101u(c13087g, z6, z10, interfaceC1436k, interfaceC1436k2, i10, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8431d(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(170259008);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56728e, C10444b.f30947z0, c6021p, 54);
            int i12 = c6021p.f19564P;
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
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC3878A1.m4596a(AbstractC8126k4.m8631b(R.drawable.chats, c6021p, 0), null, null, 0L, c6021p, 48, 12);
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.snorlax_no_chats_yet, c6021p), AbstractC10844c.m11257q(c10456n, 0.0f, RCHTTPStatusCodes.SUCCESS, 1), 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12154j, c6021p, 48, 0, 65020);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q, i10, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x010c  */
    /* JADX WARN: Code duplicated, block: B:49:0x013c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0142  */
    /* JADX WARN: Code duplicated, block: B:53:0x0153  */
    /* JADX WARN: Code duplicated, block: B:55:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0167  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x01de  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x0201  */
    /* JADX WARN: Code duplicated, block: B:76:0x0209  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m8432e(InterfaceC1436k onConversationSelect, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        Context context;
        boolean zBooleanValue;
        List list;
        InterfaceC2062k interfaceC2062k;
        ViewModelStoreOwner viewModelStoreOwnerM12165a;
        C16527D c16527d;
        boolean zM6542f;
        Object objM6514H;
        SnorlaxHomeViewModel snorlaxHomeViewModel;
        boolean zM6542f2;
        Object objM6514H2;
        InterfaceC3759g interfaceC3759g;
        C13104x c13104x;
        Object obj;
        boolean zM6542f3;
        Object objM6514H3;
        Object obj2;
        boolean zM6545h;
        Object objM6514H4;
        InterfaceC10459q interfaceC10459q4;
        C6018n0 c6018n0M6555r;
        C6018n0 c6018n0M6555r2;
        AbstractC16544l.m18094g(onConversationSelect, "onConversationSelect");
        c6021p.m6526U(1867465193);
        if ((i10 & 6) == 0) {
            i12 = i10 | (c6021p.m6545h(onConversationSelect) ? 4 : 2);
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 == 0) {
            if ((i10 & 48) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 32 : 16;
            }
            if ((i12 & 19) == 18 || !c6021p.m6562y()) {
                if (i13 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                c6021p.m6524S(-1020152108);
                context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C13104x.class));
                } else {
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    interfaceC2062k = null;
                }
                c6021p.m6553p(false);
                LocalViewModelStoreOwner.f33491a.getClass();
                viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                c16527d = AbstractC16526C.f51263a;
                Object objMo5693b = c16527d.mo5693b(SnorlaxHomeViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C13104x.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                Object obj3 = C6013l.f19514a;
                if (zM6542f || objM6514H == obj3) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C13104x.class), c16527d.mo5693b(SnorlaxHomeViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxHomeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                snorlaxHomeViewModel = (SnorlaxHomeViewModel) baseViewModel;
                c6021p.m6524S(763390056);
                zM6542f2 = c6021p.m6542f(snorlaxHomeViewModel);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == obj3) {
                    objM6514H2 = new C7445b0(1, snorlaxHomeViewModel, SnorlaxHomeViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 15);
                    c6021p.m6537c0(objM6514H2);
                }
                interfaceC3759g = (InterfaceC3759g) objM6514H2;
                c6021p.m6553p(false);
                c13104x = (C13104x) AbstractC9112C3.m9642d(snorlaxHomeViewModel.f40343c, c6021p).getValue();
                obj = c13104x.f41613a;
                if (obj == null) {
                    c6018n0M6555r = c6021p.m6555r();
                    if (c6018n0M6555r != null) {
                        c6018n0M6555r.f19536d = new C3449s(onConversationSelect, interfaceC10459q3, i10, i11, 2);
                        return;
                    }
                    return;
                }
                C17296C c17296c = C17296C.f55119a;
                c6021p.m6524S(763397346);
                zM6542f3 = c6021p.m6542f(interfaceC3759g);
                objM6514H3 = c6021p.m6514H();
                if (zM6542f3 || objM6514H3 == obj3) {
                    objM6514H3 = new C13102v(interfaceC3759g, null);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, c17296c);
                InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(interfaceC10459q3, AbstractC7313q.f23199d);
                C10449g c10449g = C10444b.f30946y0;
                c6021p.m6524S(763405880);
                boolean zM6545h2 = c6021p.m6545h(obj) | c6021p.m6542f(interfaceC3759g);
                obj2 = c13104x.f41614b;
                zM6545h = zM6545h2 | c6021p.m6545h(obj2) | c6021p.m6542f(c13104x) | ((i12 & 14) == 4);
                objM6514H4 = c6021p.m6514H();
                if (zM6545h || objM6514H4 == obj3) {
                    Object c0362w = new C0362w(obj, obj2, (Object) c13104x, (Object) interfaceC3759g, onConversationSelect, 10);
                    c6021p.m6537c0(c0362w);
                    objM6514H4 = c0362w;
                }
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H4;
                c6021p.m6553p(false);
                interfaceC10459q4 = interfaceC10459q3;
                AbstractC9746I4.m10337a(interfaceC10459qM11233k, null, null, false, null, c10449g, null, false, interfaceC1436k, c6021p, 196608, 222);
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r2 = c6021p.m6555r();
            if (c6018n0M6555r2 != null) {
                c6018n0M6555r2.f19536d = new C3449s(onConversationSelect, interfaceC10459q4, i10, i11, 1);
            }
        }
        i12 |= 48;
        interfaceC10459q2 = interfaceC10459q;
        if ((i12 & 19) == 18) {
            if (i13 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c6021p.m6524S(-1020152108);
            context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C13104x.class));
            } else {
                if (zBooleanValue) {
                    throw new C0644w();
                }
                interfaceC2062k = null;
            }
            c6021p.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            c16527d = AbstractC16526C.f51263a;
            Object objMo5693b3 = c16527d.mo5693b(SnorlaxHomeViewModel.class);
            Object objMo5693b4 = c16527d.mo5693b(C13104x.class);
            c6021p.m6524S(-1395498839);
            zM6542f = c6021p.m6542f(objMo5693b3) | c6021p.m6542f(objMo5693b4) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            objM6514H = c6021p.m6514H();
            Object obj4 = C6013l.f19514a;
            if (zM6542f) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C13104x.class), c16527d.mo5693b(SnorlaxHomeViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxHomeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            } else {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C13104x.class), c16527d.mo5693b(SnorlaxHomeViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxHomeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
            c6021p.m6553p(false);
            snorlaxHomeViewModel = (SnorlaxHomeViewModel) baseViewModel2;
            c6021p.m6524S(763390056);
            zM6542f2 = c6021p.m6542f(snorlaxHomeViewModel);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f2) {
                objM6514H2 = new C7445b0(1, snorlaxHomeViewModel, SnorlaxHomeViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 15);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C7445b0(1, snorlaxHomeViewModel, SnorlaxHomeViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 15);
                c6021p.m6537c0(objM6514H2);
            }
            interfaceC3759g = (InterfaceC3759g) objM6514H2;
            c6021p.m6553p(false);
            c13104x = (C13104x) AbstractC9112C3.m9642d(snorlaxHomeViewModel.f40343c, c6021p).getValue();
            obj = c13104x.f41613a;
            if (obj == null) {
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C3449s(onConversationSelect, interfaceC10459q3, i10, i11, 2);
                    return;
                }
                return;
            }
            C17296C c17296c2 = C17296C.f55119a;
            c6021p.m6524S(763397346);
            zM6542f3 = c6021p.m6542f(interfaceC3759g);
            objM6514H3 = c6021p.m6514H();
            if (zM6542f3) {
                objM6514H3 = new C13102v(interfaceC3759g, null);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C13102v(interfaceC3759g, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, c17296c2);
            InterfaceC10459q interfaceC10459qM11233k2 = AbstractC10842a.m11233k(interfaceC10459q3, AbstractC7313q.f23199d);
            C10449g c10449g2 = C10444b.f30946y0;
            c6021p.m6524S(763405880);
            boolean zM6545h3 = c6021p.m6545h(obj) | c6021p.m6542f(interfaceC3759g);
            obj2 = c13104x.f41614b;
            zM6545h = zM6545h3 | c6021p.m6545h(obj2) | c6021p.m6542f(c13104x) | ((i12 & 14) == 4);
            objM6514H4 = c6021p.m6514H();
            if (zM6545h) {
                Object c0362w2 = new C0362w(obj, obj2, (Object) c13104x, (Object) interfaceC3759g, onConversationSelect, 10);
                c6021p.m6537c0(c0362w2);
                objM6514H4 = c0362w2;
            } else {
                Object c0362w3 = new C0362w(obj, obj2, (Object) c13104x, (Object) interfaceC3759g, onConversationSelect, 10);
                c6021p.m6537c0(c0362w3);
                objM6514H4 = c0362w3;
            }
            InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H4;
            c6021p.m6553p(false);
            interfaceC10459q4 = interfaceC10459q3;
            AbstractC9746I4.m10337a(interfaceC10459qM11233k2, null, null, false, null, c10449g2, null, false, interfaceC1436k2, c6021p, 196608, 222);
        } else {
            if (i13 != 0) {
                interfaceC10459q3 = C10456n.f30959Y;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c6021p.m6524S(-1020152108);
            context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C13104x.class));
            } else {
                if (zBooleanValue) {
                    throw new C0644w();
                }
                interfaceC2062k = null;
            }
            c6021p.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            c16527d = AbstractC16526C.f51263a;
            Object objMo5693b5 = c16527d.mo5693b(SnorlaxHomeViewModel.class);
            Object objMo5693b6 = c16527d.mo5693b(C13104x.class);
            c6021p.m6524S(-1395498839);
            zM6542f = c6021p.m6542f(objMo5693b5) | c6021p.m6542f(objMo5693b6) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            objM6514H = c6021p.m6514H();
            Object obj5 = C6013l.f19514a;
            if (zM6542f) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C13104x.class), c16527d.mo5693b(SnorlaxHomeViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxHomeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            } else {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C13104x.class), c16527d.mo5693b(SnorlaxHomeViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxHomeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel3 = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel3, c6021p, 0);
            c6021p.m6553p(false);
            snorlaxHomeViewModel = (SnorlaxHomeViewModel) baseViewModel3;
            c6021p.m6524S(763390056);
            zM6542f2 = c6021p.m6542f(snorlaxHomeViewModel);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f2) {
                objM6514H2 = new C7445b0(1, snorlaxHomeViewModel, SnorlaxHomeViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 15);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C7445b0(1, snorlaxHomeViewModel, SnorlaxHomeViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 15);
                c6021p.m6537c0(objM6514H2);
            }
            interfaceC3759g = (InterfaceC3759g) objM6514H2;
            c6021p.m6553p(false);
            c13104x = (C13104x) AbstractC9112C3.m9642d(snorlaxHomeViewModel.f40343c, c6021p).getValue();
            obj = c13104x.f41613a;
            if (obj == null) {
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C3449s(onConversationSelect, interfaceC10459q3, i10, i11, 2);
                    return;
                }
                return;
            }
            C17296C c17296c3 = C17296C.f55119a;
            c6021p.m6524S(763397346);
            zM6542f3 = c6021p.m6542f(interfaceC3759g);
            objM6514H3 = c6021p.m6514H();
            if (zM6542f3) {
                objM6514H3 = new C13102v(interfaceC3759g, null);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C13102v(interfaceC3759g, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, c17296c3);
            InterfaceC10459q interfaceC10459qM11233k3 = AbstractC10842a.m11233k(interfaceC10459q3, AbstractC7313q.f23199d);
            C10449g c10449g3 = C10444b.f30946y0;
            c6021p.m6524S(763405880);
            boolean zM6545h4 = c6021p.m6545h(obj) | c6021p.m6542f(interfaceC3759g);
            obj2 = c13104x.f41614b;
            zM6545h = zM6545h4 | c6021p.m6545h(obj2) | c6021p.m6542f(c13104x) | ((i12 & 14) == 4);
            objM6514H4 = c6021p.m6514H();
            if (zM6545h) {
                Object c0362w4 = new C0362w(obj, obj2, (Object) c13104x, (Object) interfaceC3759g, onConversationSelect, 10);
                c6021p.m6537c0(c0362w4);
                objM6514H4 = c0362w4;
            } else {
                Object c0362w5 = new C0362w(obj, obj2, (Object) c13104x, (Object) interfaceC3759g, onConversationSelect, 10);
                c6021p.m6537c0(c0362w5);
                objM6514H4 = c0362w5;
            }
            InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) objM6514H4;
            c6021p.m6553p(false);
            interfaceC10459q4 = interfaceC10459q3;
            AbstractC9746I4.m10337a(interfaceC10459qM11233k3, null, null, false, null, c10449g3, null, false, interfaceC1436k3, c6021p, 196608, 222);
        }
        c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C3449s(onConversationSelect, interfaceC10459q4, i10, i11, 1);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8433f(InterfaceC11374b0 snorlax, InterfaceC1426a onClick, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(snorlax, "snorlax");
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(570310071);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6545h(snorlax) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onClick) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            float f10 = AbstractC7313q.f23201f;
            AbstractC3984T1.m4686e(onClick, AbstractC10842a.m11234l(c10456n, f10, AbstractC7313q.f23199d), false, AbstractC20417e.m21079a(f10), C4084l0.m4752a(AbstractC3984T1.m4707z(c6021p), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12234p), AbstractC3984T1.m4673A(), null, null, AbstractC8411c.m8969c(172268204, c6021p, new C8275l(snorlax, 3)), c6021p, ((i12 >> 3) & 14) | 100663296, 196);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(snorlax, onClick, interfaceC10459q2, i10, 11);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8434g(int i10, C6021p c6021p) {
        c6021p.m6526U(-539400283);
        if (i10 == 0 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC3914G1.m4611a(AbstractC13084d.f41576e, null, null, null, AbstractC13084d.f41577f, null, null, 0.0f, 0.0f, c6021p, 24582, 494);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2446D(i10, 19);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Set m8435h(Collection collection) {
        if (collection == null) {
            return C17691y.f56482Y;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(((C20468h) it.next()).m21112a(), arrayList);
        }
        return AbstractC17680n.m19328G0(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public static final LinkedHashMap m8436i(InterfaceC17842J interfaceC17842J, InterfaceC17841I data, C17867t customScalarAdapters, C20463c c20463c) {
        AbstractC16544l.m18094g(interfaceC17842J, "<this>");
        AbstractC16544l.m18094g(data, "data");
        AbstractC16544l.m18094g(customScalarAdapters, "customScalarAdapters");
        String rootKey = C20462b.f64955c.f64956a;
        AbstractC16544l.m18094g(rootKey, "rootKey");
        C19461k c19461k = new C19461k();
        interfaceC17842J.mo19589b().mo369f(c19461k, customScalarAdapters, data);
        C19665d c19665d = new C19665d(AbstractC9160K3.m9710c(interfaceC17842J, customScalarAdapters), rootKey, c20463c);
        Object objM20589e = c19461k.m20589e();
        AbstractC16544l.m18092e(objM20589e, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        C17859l c17859lMo19588a = interfaceC17842J.mo19588a();
        String str = interfaceC17842J.mo19588a().f56948b.mo9703b().f56956a;
        List selections = c17859lMo19588a.f56951e;
        AbstractC16544l.m18094g(selections, "selections");
        c19665d.m20641d(rootKey, str, (Map) objM20589e, selections);
        return (LinkedHashMap) c19665d.f62330o0;
    }
}
