package p544W9;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.interstitial.FeatureInterstitialViewModel;
import com.openai.feature.onboarding.LoginViewModel;
import com.openai.feature.onboarding.LoginViewModelEffectKt;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0155B1;
import p003A1.C0184L0;
import p006A4.C0350k;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p098Di.InterfaceC2062k;
import p1010sf.AbstractC19536b;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1143z4.C21795y;
import p1155zi.C21908E0;
import p1155zi.C22011h0;
import p1155zi.EnumC21974X0;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4017a;
import p229J0.AbstractC4034c4;
import p229J0.AbstractC4141u3;
import p229J0.C3949M0;
import p291Lf.AbstractC5028y;
import p291Lf.C5026w;
import p302M0.AbstractC5253e;
import p349O0.AbstractC6012k0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8126k4;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9156K;
import p571X9.AbstractC9233X;
import p587Y1.InterfaceC9589o;
import p623Zf.C10324t;
import p635a1.AbstractC10443a;
import p635a1.C10456n;
import p635a1.InterfaceC10445c;
import p635a1.InterfaceC10459q;
import p809if.C14979d;
import p809if.C14980e;
import p809if.C14981f;
import p882m1.AbstractC17140a;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17788v;
import p911o0.C17790w;

/* JADX INFO: renamed from: W9.d3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8620d3 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r26v0, types: [O0.p] */
    /* JADX WARN: Type inference failed for: r4v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX INFO: renamed from: a */
    public static final void m9268a(String str, List attachments, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        boolean z6;
        Object obj;
        AbstractC16544l.m18094g(attachments, "attachments");
        c6021p.m6526U(-1017652907);
        int i12 = 4;
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(attachments) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        int i13 = i11;
        if ((i13 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C5026w c5026w = (C5026w) c6021p.m6548k(AbstractC5028y.f16440a);
            C21795y c21795y = ((C8870f) c6021p.m6548k(AbstractC8873i.f27157a)).f27149b;
            InterfaceC10445c interfaceC10445c = c5026w.f16437e;
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(interfaceC10459q, 1.0f);
            ?? r10 = 0;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c5026w.f16438f, interfaceC10445c, c6021p, 0);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11244d);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(-1025141694);
            Iterator it = attachments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C21908E0 c21908e0 = (C21908E0) it.next();
                boolean zM21725l = AbstractC21329w.m21725l(c21908e0.f69453b, ".csv", r10);
                String str2 = c21908e0.f69453b;
                ?? r6 = (zM21725l || AbstractC21322p.m21667A(str2, ".xls", r10)) ? 1 : r10;
                if (str == null || r6 == 0) {
                    c6021p.m6524S(-2015372507);
                    AbstractC19536b.m20624a(false, AbstractC8126k4.m8631b(R.drawable.file_document, c6021p, r10 == true ? 1 : 0), c21908e0.f69453b, null, null, null, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12235q, 0L, c6021p, 27654, 160);
                    z6 = false;
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-2016187993);
                    AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.ic_spreadsheet, c6021p, r10);
                    String strM9706b = AbstractC9156K.m9706b(str2, AbstractC8012V5.m8334g((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)));
                    c6021p.m6524S(1458991908);
                    int i15 = ((i13 & 14) != i12 ? r10 : 1) | (c6021p.m6545h(c21795y) ? 1 : 0) | (c6021p.m6545h(c21908e0) ? 1 : 0);
                    Object objM6514H = c6021p.m6514H();
                    if (i15 != 0 || objM6514H == C6013l.f19514a) {
                        obj = objM6514H;
                        C0155B1 c0155b1 = new C0155B1(c21795y, str, c21908e0, 23);
                        c6021p.m6537c0(c0155b1);
                        obj = c0155b1;
                    }
                    obj = objM6514H;
                    c6021p.m6553p(r10);
                    AbstractC19536b.m20624a(false, abstractC17140aM8631b, strM9706b, null, (InterfaceC1426a) obj, null, 0L, 0L, c6021p, 3078, 224);
                    c6021p.m6553p(false);
                    z6 = false;
                }
                r10 = z6;
                i13 = i13;
                c21795y = c21795y;
                i12 = i12;
            }
            c6021p.m6553p(r10);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(str, attachments, interfaceC10459q, i10, 17);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9269b(InterfaceC10459q interfaceC10459q, FeatureInterstitialViewModel featureInterstitialViewModel, LoginViewModel loginViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        InterfaceC2062k interfaceC2062k2;
        InterfaceC10459q interfaceC10459q2;
        FeatureInterstitialViewModel featureInterstitialViewModel2;
        LoginViewModel loginViewModel2;
        C14981f c14981f;
        InterfaceC10459q interfaceC10459q3;
        FeatureInterstitialViewModel featureInterstitialViewModel3;
        LoginViewModel loginViewModel3;
        Window windowMo4721a;
        c6021p.m6526U(464380215);
        int i11 = i10 | 6;
        if ((i10 & 48) == 0) {
            i11 = i10 | 22;
        }
        if ((i10 & 384) == 0) {
            i11 |= 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            featureInterstitialViewModel3 = featureInterstitialViewModel;
            loginViewModel3 = loginViewModel;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                Object obj = C6013l.f19514a;
                c6021p.m6524S(-1020152108);
                AbstractC6012k0 abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
                Context context = (Context) c6021p.m6548k(abstractC6012k0);
                AbstractC6012k0 abstractC6012k1 = AbstractC0233b1.f873a;
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                AbstractC6012k0 abstractC6012k2 = AbstractC16421b.f50950a;
                List list = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14979d.class));
                } else {
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    interfaceC2062k = null;
                }
                c6021p.m6553p(false);
                LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.f33491a;
                localViewModelStoreOwner.getClass();
                ViewModelStoreOwner viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                C16527D c16527d = AbstractC16526C.f51263a;
                Object objMo5693b = c16527d.mo5693b(FeatureInterstitialViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C14979d.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14979d.class), c16527d.mo5693b(FeatureInterstitialViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(FeatureInterstitialViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                FeatureInterstitialViewModel featureInterstitialViewModel4 = (FeatureInterstitialViewModel) baseViewModel;
                c6021p.m6524S(-1020152108);
                Context context2 = (Context) c6021p.m6548k(abstractC6012k0);
                boolean zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                List list2 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue2) {
                    interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C10324t.class));
                } else {
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    interfaceC2062k2 = null;
                }
                c6021p.m6553p(false);
                localViewModelStoreOwner.getClass();
                ViewModelStoreOwner viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a2 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                Object objMo5693b3 = c16527d.mo5693b(LoginViewModel.class);
                Object objMo5693b4 = c16527d.mo5693b(C10324t.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f2 = c6021p.m6542f(objMo5693b3) | c6021p.m6542f(objMo5693b4) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == obj) {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C10324t.class), c16527d.mo5693b(LoginViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(LoginViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM6514H2);
                }
                BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
                c6021p.m6553p(false);
                interfaceC10459q2 = c10456n;
                featureInterstitialViewModel2 = featureInterstitialViewModel4;
                loginViewModel2 = (LoginViewModel) baseViewModel2;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                featureInterstitialViewModel2 = featureInterstitialViewModel;
                loginViewModel2 = loginViewModel;
            }
            c6021p.m6554q();
            ViewParent parent = ((View) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32829f)).getParent();
            InterfaceC9589o interfaceC9589o = parent instanceof InterfaceC9589o ? (InterfaceC9589o) parent : null;
            if (interfaceC9589o != null && (windowMo4721a = interfaceC9589o.mo4721a()) != null) {
                windowMo4721a.setGravity(80);
            }
            LoginViewModelEffectKt.m14322a(loginViewModel2, c6021p, 0);
            InterfaceC5985X interfaceC5985XM9805a = AbstractC9233X.m9805a(featureInterstitialViewModel2.f40343c, C14980e.f46638Y, c6021p, 48);
            EnumC21974X0 enumC21974X0 = (EnumC21974X0) interfaceC5985XM9805a.getValue();
            AbstractC16544l.m18094g(enumC21974X0, "<this>");
            switch (enumC21974X0.ordinal()) {
                case 0:
                    c14981f = new C14981f(R.string.interstitial_voice_title, R.string.interstitial_voice_subtitle);
                    break;
                case 1:
                    c14981f = new C14981f(R.string.interstitial_voice_title, R.string.interstitial_voice_subtitle);
                    break;
                case 2:
                    c14981f = new C14981f(R.string.interstitial_vision_title, R.string.interstitial_vision_subtitle);
                    break;
                case 3:
                    c14981f = new C14981f(R.string.interstitial_vision_and_file_title, R.string.interstitial_my_file_subtitle);
                    break;
                case 4:
                    c14981f = new C14981f(R.string.interstitial_my_file_title, R.string.interstitial_my_file_subtitle);
                    break;
                case 5:
                    c14981f = new C14981f(R.string.interstitial_read_alout_title, R.string.interstitial_read_alout_subtitle);
                    break;
                case 6:
                    c14981f = new C14981f(R.string.interstitial_welcome_back_title, R.string.interstitial_welcome_back_subtitle);
                    break;
                case 7:
                    c14981f = new C14981f(R.string.interstitial_no_auth_rate_limit_title, R.string.interstitial_no_auth_rate_limit_subtitle);
                    break;
                default:
                    throw new C0644w();
            }
            C14981f c14981f2 = c14981f;
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(AbstractC10842a.m11233k(AbstractC10844c.m11257q(interfaceC10459q2, 0.0f, AbstractC7312p.f23194k, 1), AbstractC7313q.f23199d), 1.0f);
            float f10 = AbstractC4017a.f12601a;
            AbstractC4034c4.m4725a(interfaceC10459qM11244d, AbstractC4141u3.m4770a(AbstractC5253e.f17195a, c6021p), 0L, 0L, 0.0f, 0.0f, null, AbstractC8411c.m8969c(-1746855790, c6021p, new C0350k(featureInterstitialViewModel2, c14981f2, loginViewModel2, interfaceC20904w, interfaceC5985XM9805a, 8)), c6021p, 12582912, 124);
            interfaceC10459q3 = interfaceC10459q2;
            featureInterstitialViewModel3 = featureInterstitialViewModel2;
            loginViewModel3 = loginViewModel2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(interfaceC10459q3, featureInterstitialViewModel3, loginViewModel3, i10, 13);
        }
    }
}
