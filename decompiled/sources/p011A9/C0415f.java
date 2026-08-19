package p011A9;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.protobuf.AbstractC12107L1;
import com.openai.feature.conversations.impl.anonymous.AnonymousSidebarViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import ge.C14111x0;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p017Af.C0468O;
import p025An.C0644w;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p042Bf.C1269k;
import p049Bm.InterfaceC1426a;
import p098Di.InterfaceC2062k;
import p1022t9.InterfaceC19818c;
import p1022t9.InterfaceC19822g;
import p1022t9.InterfaceC19823h;
import p1036u9.C20171q;
import p1053v3.p1054lN.IGDwkYw;
import p1060v9.C20494l;
import p1102x9.C21159c;
import p111E5.C2332p;
import p135F5.C2671g;
import p193Hf.C3321N;
import p310M9.C5308b;
import p333N9.C5684e;
import p333N9.C5689j;
import p333N9.C5691l;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p356O9.C6147e;
import p449S9.C7090q0;
import p475T9.C7281d;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9274d4;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p679ce.C11719j;
import p679ce.C11720k;
import p702da.C13049a;
import p889m9.C17200b;
import p909nm.AbstractC17680n;
import p960q9.C18651e;
import p999s.C19341c1;

/* JADX INFO: renamed from: A9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0415f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1371a;

    public /* synthetic */ C0415f(int i10) {
        this.f1371a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static final void m1025a(InterfaceC1426a interfaceC1426a, C14111x0 c14111x0, InterfaceC10459q interfaceC10459q, AnonymousSidebarViewModel anonymousSidebarViewModel, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        AnonymousSidebarViewModel anonymousSidebarViewModel2;
        int i12;
        AnonymousSidebarViewModel anonymousSidebarViewModel3;
        InterfaceC10459q interfaceC10459q3;
        c6021p.m6526U(-81995315);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c14111x0) ? 32 : 16;
        }
        int i13 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i13 = i11 | 1408;
        }
        if ((i13 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            anonymousSidebarViewModel3 = anonymousSidebarViewModel;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C11719j.class));
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
                Object objMo5693b = c16527d.mo5693b(AnonymousSidebarViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C11719j.class);
                interfaceC10459q2 = c10456n;
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C11719j.class), c16527d.mo5693b(AnonymousSidebarViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AnonymousSidebarViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                anonymousSidebarViewModel2 = (AnonymousSidebarViewModel) baseViewModel;
                i12 = i13 & (-7169);
            } else {
                c6021p.m6517L();
                i12 = i13 & (-7169);
                interfaceC10459q2 = interfaceC10459q;
                anonymousSidebarViewModel2 = anonymousSidebarViewModel;
            }
            c6021p.m6554q();
            AbstractC9274d4.m9842a(AbstractC8411c.m8969c(-625031799, c6021p, new C11720k(c14111x0, 0)), interfaceC10459q2, AbstractC8411c.m8969c(898730823, c6021p, new C3321N(11, interfaceC1426a)), AbstractC8411c.m8969c(-909298306, c6021p, new C0468O(anonymousSidebarViewModel2, 23)), false, null, c6021p, ((i12 >> 3) & 112) | 3462, 48);
            anonymousSidebarViewModel3 = anonymousSidebarViewModel2;
            interfaceC10459q3 = interfaceC10459q2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(interfaceC1426a, c14111x0, interfaceC10459q3, anonymousSidebarViewModel3, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C2332p m1026b(C0654C c0654c, AbstractC0682p abstractC0682p, String str, C2671g c2671g, int i10) {
        return new C2332p(c0654c, abstractC0682p, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : c2671g, null);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC19818c m1027c(Context context, Looper looper, C19341c1 c19341c1, Object obj, InterfaceC19822g interfaceC19822g, InterfaceC19823h interfaceC19823h) {
        switch (this.f1371a) {
            case 4:
                return new C7090q0(context, looper, 148, c19341c1, interfaceC19822g, interfaceC19823h);
            case 5:
            default:
                C20171q c20171q = (C20171q) interfaceC19822g;
                C20171q c20171q2 = (C20171q) interfaceC19823h;
                switch (this.f1371a) {
                    case 0:
                        return new C0418i(context, looper, 308, c19341c1, c20171q, c20171q2);
                    case 1:
                        return new C5308b(context, looper, RCHTTPStatusCodes.UNSUCCESSFUL, c19341c1, c20171q, c20171q2);
                    case 2:
                        return new C5691l(context, looper, c19341c1, c20171q, c20171q2);
                    case 3:
                        return new C5684e(context, looper, c19341c1, c20171q, c20171q2);
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                    case 5:
                        return new C7281d(context, looper, c19341c1, c20171q, c20171q2);
                    case 10:
                        return new C6147e(context, looper, 126, c19341c1, c20171q, c20171q2);
                    case 11:
                        return new C21159c(context, looper, c19341c1, (C20494l) obj, c20171q, c20171q2);
                }
            case 6:
                c19341c1.getClass();
                Integer num = (Integer) c19341c1.f61260s0;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString(IGDwkYw.mFeOqkEePN, null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C13049a(context, looper, c19341c1, bundle, interfaceC19822g, interfaceC19823h);
            case 7:
                throw AbstractC12107L1.m13822m(obj);
            case 8:
                return new C5689j(context, looper, c19341c1, (C17200b) obj, (C20171q) interfaceC19822g, (C20171q) interfaceC19823h);
            case 9:
                return new C18651e(context, looper, c19341c1, (GoogleSignInOptions) obj, (C20171q) interfaceC19822g, (C20171q) interfaceC19823h);
        }
    }
}
