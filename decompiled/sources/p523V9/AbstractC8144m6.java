package p523V9;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import ga.C13834b;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0155B1;
import p017Af.C0488s;
import p025An.C0644w;
import p045Bj.C1307e;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2062k;
import p103Dn.C2153Q0;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21057K;
import p109E3.C2292p;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2476S0;
import p168Gd.C3034b;
import p193Hf.AbstractC3351b1;
import p193Hf.C3310H0;
import p193Hf.C3312I0;
import p193Hf.C3315K;
import p193Hf.C3317L;
import p193Hf.C3420z0;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9233X;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import ye.C21514c;

/* JADX INFO: renamed from: V9.m6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8144m6 {
    /* JADX INFO: renamed from: a */
    public static final void m8680a(String messageId, C3034b c3034b, boolean z6, String str, boolean z10, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        boolean z11;
        Object objM14398a;
        boolean z12;
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(178936810);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(messageId) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(c3034b) : c6021p.m6545h(c3034b) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6542f(str) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6544g(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 1048576 : 524288;
        }
        int i12 = i11;
        if ((i12 & 599187) == 599186 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C3420z0.class));
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
            Object objMo5693b = c16527d.mo5693b(CanmoreViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C3420z0.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                z11 = true;
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C3420z0.class), c16527d.mo5693b(CanmoreViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(CanmoreViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM14398a);
            } else {
                objM14398a = objM6514H;
                z11 = true;
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM14398a;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            CanmoreViewModel canmoreViewModel = (CanmoreViewModel) baseViewModel;
            Object obj2 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C3317L c3317l = C3317L.f10112t0;
            C2153Q0 c2153q0 = canmoreViewModel.f40343c;
            InterfaceC5985X interfaceC5985XM9805a = AbstractC9233X.m9805a(c2153q0, c3317l, c6021p, 48);
            InterfaceC5985X interfaceC5985XM9805a2 = AbstractC9233X.m9805a(c2153q0, C3317L.f10113u0, c6021p, 48);
            InterfaceC5985X interfaceC5985XM9805a3 = AbstractC9233X.m9805a(c2153q0, C3317L.f10111s0, c6021p, 48);
            String str2 = c3034b != null ? c3034b.f9128a : null;
            c6021p.m6524S(-389437383);
            int i13 = i12 & 14;
            boolean zM6542f2 = c6021p.m6542f(str2 != null ? new C21514c(str2) : null) | (i13 == 4 ? z11 : false);
            Object objM6514H2 = c6021p.m6514H();
            C5975S c5975s = C5975S.f19448r0;
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H2;
            c6021p.m6553p(false);
            String str3 = c3034b != null ? c3034b.f9128a : null;
            c6021p.m6524S(-389434546);
            boolean zM6542f3 = c6021p.m6542f(str3 != null ? new C21514c(str3) : null);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f3 || objM6514H3 == obj) {
                objM6514H3 = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM6514H3;
            c6021p.m6553p(false);
            c6021p.m6524S(-389432090);
            boolean z13 = i13 == 4;
            Object objM6514H4 = c6021p.m6514H();
            if (z13 || objM6514H4 == obj) {
                objM6514H4 = C5997d.m6421H(new C0155B1(messageId, interfaceC5985XM9805a3, interfaceC5985XM9805a, 17));
                c6021p.m6537c0(objM6514H4);
            }
            InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) objM6514H4;
            c6021p.m6553p(false);
            c6021p.m6524S(-389427060);
            boolean zM6545h = ((i12 & 458752) == 131072) | ((i12 & 112) == 32 || ((i12 & 64) != 0 && c6021p.m6545h(c3034b))) | (i13 == 4) | c6021p.m6545h(obj2);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6545h || objM6514H5 == obj) {
                z12 = true;
                Object c1307e = new C1307e(c3034b, onIntent, messageId, obj2, 7);
                c6021p.m6537c0(c1307e);
                objM6514H5 = c1307e;
            } else {
                z12 = true;
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H5;
            c6021p.m6553p(false);
            AbstractC8128k6.m8635a(interfaceC1436k, (!((Boolean) interfaceC5982V0.getValue()).booleanValue() || ((Boolean) interfaceC5985X.getValue()).booleanValue()) ? false : z12, AbstractC8411c.m8969c(-1894490471, c6021p, new C2476S0(str, z10, interfaceC5985X2, interfaceC5985X)), AbstractC8411c.m8969c(-676210854, c6021p, new C3315K(onIntent, z6, 1)), interfaceC10459q, AbstractC8411c.m8969c(1760348380, c6021p, new C0488s(interfaceC5985X, interfaceC5985X2, c3034b, canmoreViewModel, interfaceC5982V0, interfaceC5985XM9805a2)), c6021p, (57344 & (i12 >> 6)) | 200064);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3310H0(messageId, c3034b, z6, str, z10, onIntent, interfaceC10459q, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8681b(InterfaceC1426a interfaceC1426a, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(859283922);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10451i c10451i = C10444b.f30938q0;
            C10456n c10456n = C10456n.f30959Y;
            FillElement fillElement = AbstractC10844c.f32512c;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, fillElement);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30947z0, c6021p, 48);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, c10456n);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.canmore_load_failed, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12158n, c6021p, 0, 0, 65534);
            AbstractC3984T1.m4685d(interfaceC1426a, null, false, null, null, null, null, null, null, AbstractC3351b1.f10240a, c6021p, (i11 & 14) | 805306368, 510);
            c6021p.m6553p(true);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3312I0(i10, 0, interfaceC1426a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C13834b m8682c(Bundle bundle) throws C2292p {
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            AbstractC16544l.m18091d(string);
            AbstractC16544l.m18091d(string2);
            return new C13834b(string, string2, string3, string4, string5, uri, string6);
        } catch (Exception e10) {
            throw new C2292p(e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final long m8683d(long j10) {
        if (j10 < 0) {
            C21554a c21554a = C21555b.f68260Z;
            return C21555b.f68262p0;
        }
        C21554a c21554a2 = C21555b.f68260Z;
        return C21555b.f68261o0;
    }
}
