package tf;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.disclosure.DisclosureViewModelKt;
import com.openai.feature.messages.image.ImageDetailScreenKt$ImageDetailScreen$$inlined$injectViewModel$1;
import com.openai.feature.messages.image.ImageDetailViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import ge.C14089m0;
import ge.C14099r0;
import io.C15050f;
import io.C15105o;
import io.sentry.android.replay.capture.C15272c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import ni.C17632f;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p033B5.InterfaceC0832p;
import p035B7.C0846c;
import p042Bf.C1267i;
import p042Bf.C1276r;
import p042Bf.C1281w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p092Dc.C1996m;
import p098Di.InterfaceC2062k;
import p1000s0.AbstractC19402K;
import p1000s0.C19408d;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1139z0.C21585H;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21907E;
import p1155zi.C21952P1;
import p124Ei.C2446D;
import p124Ei.C2463L0;
import p153Fn.C2925c;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4005X2;
import p229J0.AbstractC4048f0;
import p229J0.C4042e0;
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
import p406Qg.C6703N;
import p429Re.C6877k;
import p454Se.C7112f;
import p478Tc.AbstractC7300d;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC7853B4;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8190s4;
import p525Vb.C8258a;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8449B;
import p544W9.AbstractC8650i3;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9236X2;
import p571X9.AbstractC9237X3;
import p579Xh.InterfaceC9514a;
import p594Y9.AbstractC9834X3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p749fd.AbstractC13627l;
import p749fd.C13623h;
import p749fd.C13624i;
import p749fd.C13625j;
import p772h.C14215F;
import p772h.InterfaceC14216G;
import p773h0.C14311u;
import p774h1.AbstractC14334L;
import p774h1.C14327E;
import p774h1.C14365u;
import p795i.AbstractC14892f;
import p810ig.C14988g;
import p823j3.C16084f;
import p870le.C16863U;
import p870le.C16886i0;
import p894n0.InterfaceC17406l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17724E0;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17792x;
import p911o0.C17718B0;
import p911o0.C17756f;
import p911o0.C17767k0;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p926of.C18173j;
import p953q0.C18557O;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: tf.J */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19905J {

    /* JADX INFO: renamed from: a */
    public static final C14327E f63074a;

    /* JADX INFO: renamed from: b */
    public static final C14327E f63075b;

    static {
        long j10 = C14365u.f45059i;
        C14365u c14365u = new C14365u(j10);
        long j11 = AbstractC7300d.f23111a;
        f63074a = C8258a.m8896j(AbstractC17681o.m19382k(c14365u, new C14365u(C14365u.m15774b(0.5f, j11)), new C14365u(C14365u.m15774b(0.5f, j11))));
        f63075b = C8258a.m8896j(AbstractC17681o.m19382k(new C14365u(C14365u.m15774b(0.5f, j11)), new C14365u(C14365u.m15774b(0.5f, j11)), new C14365u(j10)));
    }

    /* JADX INFO: renamed from: a */
    public static final void m20788a(String text, int i10, InterfaceC1426a onClick, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i11) {
        int i12;
        AbstractC16544l.m18094g(text, "text");
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(-173990131);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6542f(text) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6538d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6545h(onClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        int i13 = i12;
        if ((i13 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-715629475);
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = AbstractC0168G.m536y(c6021p);
            }
            InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H;
            c6021p.m6553p(false);
            AbstractC3984T1.m4700s(onClick, AbstractC10833a.m11208c(interfaceC10459q, interfaceC17406l, AbstractC4005X2.m4716a(false, AbstractC7312p.f23187d, C14365u.f45055e), false, null, onClick, 28), false, null, null, null, null, null, interfaceC17406l, AbstractC8411c.m8969c(-818682998, c6021p, new C14988g(i10, 1, text)), c6021p, ((i13 >> 6) & 14) | 905969664, 252);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1276r(onClick, text, interfaceC10459q, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m20789b(boolean z6, boolean z10, InterfaceC1436k onInputIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C5975S c5975s;
        float f10;
        boolean z11;
        boolean z12;
        AbstractC16544l.m18094g(onInputIntent, "onInputIntent");
        c6021p.m6526U(-1060341345);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onInputIntent) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            if (!z6 && !z10) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C19939x(z6, z10, onInputIntent, interfaceC10459q, i10, 0);
                    return;
                }
                return;
            }
            InterfaceC10459q interfaceC10459qM11206a = AbstractC10833a.m11206a(AbstractC10844c.m11244d(interfaceC10459q, 1.0f), f63074a, null, 6);
            WeakHashMap weakHashMap = C17718B0.f56555v;
            InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(AbstractC17724E0.m19459a(interfaceC10459qM11206a, C17756f.m19480f(c6021p).f56566k), AbstractC7313q.f23199d, AbstractC7313q.f23198c);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56729f, C10444b.f30944w0, c6021p, 54);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11234l);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            C17785t0 c17785t0 = C17785t0.f56761a;
            c6021p.m6524S(898443050);
            C5975S c5975s2 = C6013l.f19514a;
            if (z6) {
                String strM8676d = AbstractC8142m4.m8676d(R.string.image_action_edit, c6021p);
                c6021p.m6524S(898448685);
                int i14 = i12 & 896;
                boolean z13 = i14 == 256;
                Object objM6514H = c6021p.m6514H();
                if (z13 || objM6514H == c5975s2) {
                    objM6514H = new C16886i0(4, onInputIntent);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                c5975s = c5975s2;
                m20788a(strM8676d, R.drawable.transform, (InterfaceC1426a) objM6514H, c17785t0.m19513a(c10456n, 1.0f, true), c6021p, 0);
                String strM8676d2 = AbstractC8142m4.m8676d(R.string.image_action_select, c6021p);
                c6021p.m6524S(898457372);
                boolean z14 = i14 == 256;
                Object objM6514H2 = c6021p.m6514H();
                if (z14 || objM6514H2 == c5975s) {
                    objM6514H2 = new C16886i0(5, onInputIntent);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                f10 = 1.0f;
                m20788a(strM8676d2, R.drawable.inpaint, (InterfaceC1426a) objM6514H2, c17785t0.m19513a(c10456n, 1.0f, true), c6021p, 0);
                z11 = false;
            } else {
                c5975s = c5975s2;
                f10 = 1.0f;
                z11 = false;
            }
            c6021p.m6553p(z11);
            c6021p.m6524S(898462292);
            if (z10) {
                String strM8676d3 = AbstractC8142m4.m8676d(R.string.image_action_save, c6021p);
                c6021p.m6524S(898467980);
                int i15 = i12 & 896;
                boolean z15 = i15 == 256;
                Object objM6514H3 = c6021p.m6514H();
                if (z15 || objM6514H3 == c5975s) {
                    objM6514H3 = new C16886i0(6, onInputIntent);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                z12 = true;
                m20788a(strM8676d3, R.drawable.download, (InterfaceC1426a) objM6514H3, c17785t0.m19513a(c10456n, f10, true), c6021p, 0);
                String strM8676d4 = AbstractC8142m4.m8676d(R.string.image_action_Share, c6021p);
                c6021p.m6524S(898476521);
                boolean z16 = i15 == 256;
                Object objM6514H4 = c6021p.m6514H();
                if (z16 || objM6514H4 == c5975s) {
                    objM6514H4 = new C16886i0(7, onInputIntent);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                m20788a(strM8676d4, R.drawable.share, (InterfaceC1426a) objM6514H4, c17785t0.m19513a(c10456n, f10, true), c6021p, 0);
            } else {
                z12 = true;
            }
            c6021p.m6553p(false);
            c6021p.m6553p(z12);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C19939x(z6, z10, onInputIntent, interfaceC10459q, i10, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m20790c(C15105o c15105o, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1948254924);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c15105o) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC14216G interfaceC14216GM16066a = AbstractC14892f.m16066a(c6021p);
            C14215F c14215fMo10191a = interfaceC14216GM16066a != null ? interfaceC14216GM16066a.mo10191a() : null;
            Object objM16229b = c15105o.m16229b();
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            if (objM16229b instanceof C15050f) {
                C17296C c17296c = C17296C.f55119a;
                c6021p.m6524S(1551782919);
                boolean zM6545h = c6021p.m6545h(c8870f) | c6021p.m6542f(objM16229b) | c6021p.m6545h(c14215fMo10191a);
                Object objM6514H = c6021p.m6514H();
                if (zM6545h || objM6514H == C6013l.f19514a) {
                    objM6514H = new C19940y(c8870f, (C15050f) objM16229b, c14215fMo10191a, null);
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C19941z(c15105o, i10, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m20791d(int i10, C6021p c6021p) {
        InterfaceC2062k interfaceC2062k;
        c6021p.m6526U(-983750976);
        if (i10 == 0 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC9237X3.m9812a(0, c6021p);
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c6021p.m6524S(-154170543);
            boolean zM6545h = c6021p.m6545h(c8870f);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6545h || objM6514H == obj) {
                objM6514H = new C6703N(c8870f, 7);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19906K.class));
            } else {
                if (zBooleanValue) {
                    throw new C0644w();
                }
                interfaceC2062k = null;
            }
            c6021p.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            C16527D c16527d = AbstractC16526C.f51263a;
            Object objMo5693b = c16527d.mo5693b(ImageDetailViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C19906K.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19906K.class), c16527d.mo5693b(ImageDetailViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ImageDetailViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            boolean zM6545h2 = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h2 || objM6514H3 == obj) {
                objM6514H3 = new ImageDetailScreenKt$ImageDetailScreen$$inlined$injectViewModel$1(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            ImageDetailViewModel imageDetailViewModel = (ImageDetailViewModel) baseViewModel;
            C19906K c19906k = (C19906K) AbstractC9112C3.m9642d(imageDetailViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(-154160241);
            if (c19906k.f63079d) {
                C6877k c6877kM14275b = DisclosureViewModelKt.m14275b(c8870f.f27152e);
                c6021p.m6524S(-154155382);
                boolean zM6542f2 = c6021p.m6542f(imageDetailViewModel);
                Object objM6514H4 = c6021p.m6514H();
                if (zM6542f2 || objM6514H4 == obj) {
                    objM6514H4 = new C19896A(imageDetailViewModel, 0);
                    c6021p.m6537c0(objM6514H4);
                }
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H4;
                c6021p.m6553p(false);
                c6021p.m6524S(-154152446);
                boolean zM6542f3 = c6021p.m6542f(imageDetailViewModel);
                Object objM6514H5 = c6021p.m6514H();
                if (zM6542f3 || objM6514H5 == obj) {
                    objM6514H5 = new C19896A(imageDetailViewModel, 1);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(false);
                AbstractC9236X2.m9809b(c6877kM14275b, interfaceC1426a, (InterfaceC1426a) objM6514H5, null, c6021p, 0, 8);
            }
            c6021p.m6553p(false);
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(-154147897);
            boolean zM6545h3 = c6021p.m6545h(interfaceC20904w);
            Object objM6514H6 = c6021p.m6514H();
            if (zM6545h3 || objM6514H6 == obj) {
                objM6514H6 = new C19897B(interfaceC20904w, null);
                c6021p.m6537c0(objM6514H6);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p, c17296c);
            c6021p.m6524S(-154145182);
            boolean zM6542f4 = c6021p.m6542f(imageDetailViewModel);
            Object objM6514H7 = c6021p.m6514H();
            if (zM6542f4 || objM6514H7 == obj) {
                objM6514H7 = new C16863U(1, imageDetailViewModel, ImageDetailViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 14);
                c6021p.m6537c0(objM6514H7);
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H7;
            c6021p.m6553p(false);
            List list2 = c19906k.f63076a;
            List list3 = list2;
            if (list3 == null || list3.isEmpty()) {
                ((InterfaceC1436k) interfaceC3759g).invoke(C19926k.f63183a);
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C2446D(i10, 25);
                    return;
                }
                return;
            }
            c6021p.m6524S(-154137511);
            boolean zM6545h4 = c6021p.m6545h(list2);
            Object objM6514H8 = c6021p.m6514H();
            if (zM6545h4 || objM6514H8 == obj) {
                objM6514H8 = new C1267i(8, list2);
                c6021p.m6537c0(objM6514H8);
            }
            c6021p.m6553p(false);
            C19408d c19408dM20508b = AbstractC19402K.m20508b(c19906k.f63077b, (InterfaceC1426a) objM6514H8, c6021p, 2);
            Integer numValueOf = Integer.valueOf(c19408dM20508b.m20498j());
            c6021p.m6524S(-154133534);
            boolean zM6542f5 = c6021p.m6542f(interfaceC3759g) | c6021p.m6542f(c19408dM20508b);
            Object objM6514H9 = c6021p.m6514H();
            if (zM6542f5 || objM6514H9 == obj) {
                objM6514H9 = new C19898C(interfaceC3759g, c19408dM20508b, null);
                c6021p.m6537c0(objM6514H9);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H9, c6021p, numValueOf);
            m20792e(c19906k, c19408dM20508b, (InterfaceC1436k) interfaceC3759g, list2, c6021p, 0);
            AbstractC8662k3.m9352c(null, null, c6021p, 0, 3);
            c6021p.m6524S(-154123060);
            boolean zM6545h5 = c6021p.m6545h(c8870f);
            Object objM6514H10 = c6021p.m6514H();
            if (zM6545h5 || objM6514H10 == obj) {
                objM6514H10 = new C6703N(c8870f, 6);
                c6021p.m6537c0(objM6514H10);
            }
            c6021p.m6553p(false);
            C5997d.m6444c(c17296c, (InterfaceC1436k) objM6514H10, c6021p);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C2446D(i10, 26);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m20792e(C19906K c19906k, C19408d c19408d, InterfaceC1436k onInputIntent, List imagesSelection, C6021p c6021p, int i10) {
        int i11;
        InterfaceC1436k interfaceC1436k;
        Object obj;
        int i12;
        int i13;
        boolean z6;
        AbstractC16544l.m18094g(onInputIntent, "onInputIntent");
        AbstractC16544l.m18094g(imagesSelection, "imagesSelection");
        c6021p.m6526U(-746916259);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c19906k) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c19408d) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onInputIntent) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(imagesSelection) ? 2048 : 1024;
        }
        int i14 = i11;
        if ((i14 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-1746092335);
            Object objM6514H = c6021p.m6514H();
            Object obj2 = C6013l.f19514a;
            if (objM6514H == obj2) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            C5994b0 c5994b0 = (C5994b0) AbstractC9834X3.m10481d(new Object[0], null, null, C19901F.f63058Y, c6021p, 3072, 6);
            List list = imagesSelection;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C21907E(((C18173j) it.next()).f57968a));
            }
            String image = ((C21907E) arrayList.get(c19408d.m20498j())).f69451a;
            float f10 = AbstractC13627l.f43058a;
            AbstractC16544l.m18094g(image, "image");
            c6021p.m6524S(1898901869);
            Object[] objArr = {new C21907E(image)};
            C21585H c21585h = AbstractC13627l.f43060c;
            c6021p.m6524S(-482676137);
            boolean zM6542f = c6021p.m6542f(image);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj2) {
                objM6514H2 = new C0846c(image, 20);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C13625j c13625j = (C13625j) AbstractC9834X3.m10481d(objArr, c21585h, null, (InterfaceC1426a) objM6514H2, c6021p, 0, 4);
            c6021p.m6553p(false);
            long j10 = c19906k.f63082g.f43013Y;
            c13625j.getClass();
            c13625j.f43054g.setValue(new C14365u(j10));
            c6021p.m6525T(2083083587);
            c6021p.m6525T(99280652);
            boolean zM6536c = c6021p.m6536c(0.2f);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6536c || objM6514H3 == obj2) {
                objM6514H3 = new C15105o(0.2f, false);
                c6021p.m6537c0(objM6514H3);
            }
            C15105o c15105o = (C15105o) objM6514H3;
            c6021p.m6553p(false);
            c6021p.m6553p(false);
            c6021p.m6524S(-1831853806);
            long jM15774b = C14365u.m15774b(1 - ((Number) c15105o.f46991f.getValue()).floatValue(), AbstractC7300d.f23111a);
            c6021p.m6553p(false);
            m20790c(c15105o, c6021p, 0);
            AbstractC8650i3.m9321a(c15105o, AbstractC10833a.m11207b(C10456n.f30959Y, jM15774b, AbstractC14334L.f44973a).mo428M(AbstractC10844c.f32512c), AbstractC8411c.m8969c(1459893619, c6021p, new C19900E(c19408d, c15105o, c13625j, arrayList, imagesSelection, c19906k, interfaceC5985X, onInputIntent, c5994b0)), c6021p, 384);
            String str = ((C18173j) imagesSelection.get(c19408d.m20498j())).f57972e;
            c6021p.m6524S(-1745883006);
            if (!c19906k.f63080e || str == null) {
                interfaceC1436k = onInputIntent;
                obj = obj2;
                i12 = i14;
                i13 = 256;
                z6 = false;
            } else {
                c6021p.m6524S(-1745878960);
                i12 = i14;
                i13 = 256;
                boolean z10 = (i12 & 896) == 256;
                Object objM6514H4 = c6021p.m6514H();
                obj = obj2;
                if (z10 || objM6514H4 == obj) {
                    interfaceC1436k = onInputIntent;
                    objM6514H4 = new C16886i0(9, interfaceC1436k);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    interfaceC1436k = onInputIntent;
                }
                z6 = false;
                c6021p.m6553p(false);
                AbstractC19908M.m20797a((InterfaceC1426a) objM6514H4, str, null, null, c6021p, 0);
            }
            c6021p.m6553p(z6);
            if (c19906k.f63081f) {
                c6021p.m6524S(-1745871867);
                int i15 = i12 & 896;
                boolean z11 = i15 == i13 ? true : z6;
                Object objM6514H5 = c6021p.m6514H();
                if (z11 || objM6514H5 == obj) {
                    objM6514H5 = new C16886i0(10, interfaceC1436k);
                    c6021p.m6537c0(objM6514H5);
                }
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H5;
                c6021p.m6553p(z6);
                c6021p.m6524S(-1745869372);
                boolean z12 = i15 == i13 ? true : z6;
                Object objM6514H6 = c6021p.m6514H();
                if (z12 || objM6514H6 == obj) {
                    objM6514H6 = new C14089m0(11, interfaceC1436k);
                    c6021p.m6537c0(objM6514H6);
                }
                InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H6;
                c6021p.m6553p(z6);
                c6021p.m6524S(-1745866749);
                boolean z13 = i15 == i13 ? true : z6;
                Object objM6514H7 = c6021p.m6514H();
                if (z13 || objM6514H7 == obj) {
                    objM6514H7 = new C16886i0(11, interfaceC1436k);
                    c6021p.m6537c0(objM6514H7);
                }
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H7;
                c6021p.m6553p(z6);
                AbstractC7853B4.m8109a(interfaceC1426a, interfaceC1436k2, interfaceC1426a2, c19906k.f63091p, c19906k.f63090o != null ? true : z6, c19906k.f63089n, ((C21907E) arrayList.get(c19408d.m20498j())).f69451a, null, null, c6021p, 0);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18557O(i10, 6, c19906k, c19408d, onInputIntent, imagesSelection);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m20793f(C13625j c13625j, C19906K c19906k, InterfaceC10459q interfaceC10459q, InterfaceC1436k onInputIntent, C6021p c6021p, int i10) {
        int i11;
        Object next;
        Object objM19235b;
        InterfaceC0832p interfaceC0832pMo3165c;
        boolean z6;
        Object obj;
        Object next2;
        Object objM19235b2;
        int i12 = 1;
        int i13 = 2;
        AbstractC16544l.m18094g(onInputIntent, "onInputIntent");
        c6021p.m6526U(-1527341845);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(c13625j) : c6021p.m6545h(c13625j) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c19906k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onInputIntent) ? 2048 : 1024;
        }
        int i14 = i11;
        if ((i14 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-1892601241);
            Object objM6514H = c6021p.m6514H();
            Object obj2 = C6013l.f19514a;
            Object obj3 = objM6514H;
            if (objM6514H == obj2) {
                Object objM6421H = C5997d.m6421H(new C19902G(c13625j, i13));
                c6021p.m6537c0(objM6421H);
                obj3 = objM6421H;
            }
            InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) obj3;
            Object objM530s = AbstractC0168G.m530s(-1892598532, c6021p, false);
            Object obj4 = objM530s;
            if (objM530s == obj2) {
                Object objM6421H2 = C5997d.m6421H(new C19902G(c13625j, i12));
                c6021p.m6537c0(objM6421H2);
                obj4 = objM6421H2;
            }
            InterfaceC5982V0 interfaceC5982V1 = (InterfaceC5982V0) obj4;
            c6021p.m6553p(false);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            Object objM6514H2 = c6021p.m6514H();
            Object objM529r = objM6514H2;
            if (objM6514H2 == obj2) {
                objM529r = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            C2925c c2925c = ((C6035w) objM529r).f19668Y;
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            c6021p.m6524S(617413469);
            Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof InterfaceC9514a));
            if (next != null) {
                objM19235b = (InterfaceC9514a) next;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                c6021p.m6553p(false);
            }
            InterfaceC9514a interfaceC9514a = (InterfaceC9514a) objM19235b;
            if (interfaceC9514a == null || (interfaceC0832pMo3165c = interfaceC9514a.mo3165c()) == null) {
                throw new IllegalStateException("No ImageLoader");
            }
            InterfaceC10459q interfaceC10459qM11206a = AbstractC10833a.m11206a(AbstractC10844c.m11244d(interfaceC10459q, 1.0f), f63074a, null, 6);
            WeakHashMap weakHashMap = C17718B0.f56555v;
            InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(AbstractC17724E0.m19459a(interfaceC10459qM11206a, C17756f.m19480f(c6021p).f56566k), AbstractC7313q.f23201f, AbstractC7313q.f23198c);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56729f, C10444b.f30944w0, c6021p, 54);
            int i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11234l);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            C14311u c14311uM9060a = AbstractC8449B.m9060a(1, C14365u.f45053c);
            C17767k0 c17767k0 = AbstractC4048f0.f12769a;
            C4042e0 c4042e0M4733b = AbstractC4048f0.m4733b(C14365u.f45059i, AbstractC7300d.f23112b, c6021p, 12);
            c6021p.m6524S(-165385383);
            int i16 = i14 & 7168;
            int i17 = i14 & 14;
            boolean zM6545h = c6021p.m6545h(c19906k) | (i16 == 2048) | (i17 == 4 || ((i14 & 8) != 0 && c6021p.m6545h(c13625j)));
            Object objM6514H3 = c6021p.m6514H();
            Object obj5 = objM6514H3;
            if (zM6545h || objM6514H3 == obj2) {
                Object c15272c = new C15272c(c19906k, onInputIntent, c13625j, 24);
                c6021p.m6537c0(c15272c);
                obj5 = c15272c;
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4685d((InterfaceC1426a) obj5, null, false, null, c4042e0M4733b, null, c14311uM9060a, null, null, AbstractC19918c.f63171k, c6021p, 806879232, 430);
            c6021p.m6524S(-165360985);
            boolean zM6545h2 = c6021p.m6545h(interfaceC20904w) | (i17 == 4 || ((i14 & 8) != 0 && c6021p.m6545h(c13625j)));
            Object objM6514H4 = c6021p.m6514H();
            Object obj6 = objM6514H4;
            if (zM6545h2 || objM6514H4 == obj2) {
                Object c16084f = new C16084f(c13625j, 16, interfaceC20904w);
                c6021p.m6537c0(c16084f);
                obj6 = c16084f;
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4693l((InterfaceC1426a) obj6, null, ((Boolean) interfaceC5982V0.getValue()).booleanValue(), AbstractC7300d.m7771a(c6021p), null, AbstractC19918c.f63172l, c6021p, 196608, 18);
            c6021p.m6524S(-165348194);
            boolean z10 = i17 == 4 || ((i14 & 8) != 0 && c6021p.m6545h(c13625j));
            Object objM6514H5 = c6021p.m6514H();
            if (z10 || objM6514H5 == obj2) {
                z6 = false;
                Object c19902g = new C19902G(c13625j, false ? 1 : 0);
                c6021p.m6537c0(c19902g);
                obj = c19902g;
            } else {
                z6 = false;
                obj = objM6514H5;
            }
            c6021p.m6553p(z6);
            AbstractC3984T1.m4693l((InterfaceC1426a) obj, null, ((Boolean) interfaceC5982V1.getValue()).booleanValue(), AbstractC7300d.m7771a(c6021p), null, AbstractC19918c.f63173m, c6021p, 196608, 18);
            c6021p.m6524S(617413469);
            Iterator it2 = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!(next2 instanceof C1996m));
            if (next2 != null) {
                objM19235b2 = (C1996m) next2;
                c6021p.m6553p(false);
            } else {
                objM19235b2 = C17632f.f56419a.m19235b(C1996m.class);
                c6021p.m6553p(false);
            }
            C1996m c1996m = (C1996m) objM19235b2;
            C7112f c7112f = c1996m != null ? (C7112f) c1996m.f5898A.get() : null;
            c6021p.m6524S(-165333322);
            boolean zM6545h3 = c6021p.m6545h(interfaceC20904w) | c6021p.m6545h(c7112f) | c6021p.m6545h(c2925c) | (i17 == 4 || ((i14 & 8) != 0 && c6021p.m6545h(c13625j))) | c6021p.m6545h(context) | c6021p.m6545h(interfaceC0832pMo3165c) | (i16 == 2048);
            Object objM6514H6 = c6021p.m6514H();
            if (zM6545h3 || objM6514H6 == obj2) {
                Object c14099r0 = new C14099r0(interfaceC20904w, c7112f, c2925c, interfaceC5982V0, c13625j, context, interfaceC0832pMo3165c, onInputIntent);
                c6021p.m6537c0(c14099r0);
                objM6514H6 = c14099r0;
            }
            c6021p.m6553p(false);
            boolean zBooleanValue = ((Boolean) interfaceC5982V0.getValue()).booleanValue();
            int i18 = AbstractC7300d.f23118h;
            c6021p.m6524S(2067067316);
            C4042e0 c4042e0M4731a = AbstractC4048f0.m4732a(c6021p).m4731a(AbstractC7300d.f23113c, AbstractC7300d.f23114d, AbstractC7300d.f23116f, AbstractC7300d.f23117g);
            c6021p.m6553p(false);
            AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H6, null, zBooleanValue, null, c4042e0M4731a, null, null, null, null, AbstractC19918c.f63174n, c6021p, 805306368, 490);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18557O(c13625j, c19906k, interfaceC10459q, onInputIntent, i10, 7);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m20794g(C19906K c19906k, boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(712218504);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c19906k) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC8190s4.m8770a(z6, interfaceC1426a, null, 0L, null, null, AbstractC8411c.m8969c(-1451722693, c6021p, new C1281w(c19906k, interfaceC1426a, interfaceC1436k, 29)), c6021p, ((i11 >> 3) & 14) | 1572864 | ((i11 >> 6) & 112), 60);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2463L0(c19906k, z6, interfaceC1436k, interfaceC1426a, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: h */
    public static final Object m20795h(C7112f c7112f, C13625j c13625j, Context context, InterfaceC0832p interfaceC0832p, InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) throws Throwable {
        C19904I c19904i;
        InterfaceC0832p interfaceC0832p2;
        Uri uri;
        C13625j c13625j2;
        Context context2;
        InterfaceC1436k interfaceC1436k2;
        AbstractC21955Q1 abstractC21955Q1;
        InterfaceC1436k interfaceC1436k3 = interfaceC1436k;
        if (abstractC19687c instanceof C19904I) {
            c19904i = (C19904I) abstractC19687c;
            int i10 = c19904i.f63073s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c19904i.f63073s0 = i10 - Integer.MIN_VALUE;
            } else {
                c19904i = new C19904I(abstractC19687c);
            }
        } else {
            c19904i = new C19904I(abstractC19687c);
        }
        Object obj = c19904i.f63072r0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c19904i.f63073s0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                Uri uri2 = c19904i.f63071q0;
                InterfaceC1436k interfaceC1436k4 = c19904i.f63070p0;
                InterfaceC0832p interfaceC0832p3 = c19904i.f63069o0;
                Context context3 = (Context) c19904i.f63068Z;
                C13625j c13625j3 = (C13625j) c19904i.f63067Y;
                AbstractC9233X.m9807c(obj);
                uri = uri2;
                interfaceC1436k3 = interfaceC1436k4;
                interfaceC0832p2 = interfaceC0832p3;
                c13625j2 = c13625j3;
                context2 = context3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q1 = (AbstractC21955Q1) c19904i.f63068Z;
                interfaceC1436k2 = (InterfaceC1436k) c19904i.f63067Y;
                AbstractC9233X.m9807c(obj);
            }
            interfaceC1436k2.invoke(new C19930o(abstractC21955Q1, (AbstractC21955Q1) obj));
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        AbstractC21955Q1 abstractC21955Q1M7521m = c7112f.m7521m();
        if (!(abstractC21955Q1M7521m instanceof C21952P1)) {
            interfaceC1436k3.invoke(new C19930o(abstractC21955Q1M7521m, null));
            return c17296c;
        }
        Uri uri3 = (Uri) ((C21952P1) abstractC21955Q1M7521m).f69511a;
        AbstractC21955Q1 abstractC21955Q1M7521m2 = c7112f.m7521m();
        if (!(abstractC21955Q1M7521m2 instanceof C21952P1)) {
            interfaceC1436k3.invoke(new C19930o(abstractC21955Q1M7521m2, null));
            return c17296c;
        }
        Uri uri4 = (Uri) ((C21952P1) abstractC21955Q1M7521m2).f69511a;
        c19904i.f63067Y = c13625j;
        c19904i.f63068Z = context;
        c19904i.f63069o0 = interfaceC0832p;
        c19904i.f63070p0 = interfaceC1436k3;
        c19904i.f63071q0 = uri4;
        c19904i.f63073s0 = 1;
        c13625j.getClass();
        C3516e c3516e = AbstractC0593T.f1824a;
        Object objM1168P = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C13624i(context, c13625j, interfaceC0832p, uri3, null), c19904i);
        if (objM1168P == enumC19250a) {
            return enumC19250a;
        }
        interfaceC0832p2 = interfaceC0832p;
        uri = uri4;
        c13625j2 = c13625j;
        obj = objM1168P;
        context2 = context;
        AbstractC21955Q1 abstractC21955Q2 = (AbstractC21955Q1) obj;
        c19904i.f63067Y = interfaceC1436k3;
        c19904i.f63068Z = abstractC21955Q2;
        c19904i.f63069o0 = null;
        c19904i.f63070p0 = null;
        c19904i.f63071q0 = null;
        c19904i.f63073s0 = 2;
        c13625j2.getClass();
        C3516e c3516e2 = AbstractC0593T.f1824a;
        Object objM1168P2 = AbstractC0575H.m1168P(ExecutorC3515d.f10633Z, new C13623h(context2, c13625j2, interfaceC0832p2, uri, null), c19904i);
        if (objM1168P2 == enumC19250a) {
            return enumC19250a;
        }
        interfaceC1436k2 = interfaceC1436k3;
        abstractC21955Q1 = abstractC21955Q2;
        obj = objM1168P2;
        interfaceC1436k2.invoke(new C19930o(abstractC21955Q1, (AbstractC21955Q1) obj));
        return c17296c;
    }
}
