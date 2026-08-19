package p193Hf;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p650ui.viewinterop.AbstractC10869a;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.auth0.android.result.Credentials;
import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import gd.C13838A0;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17314q;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p103Dn.C2153Q0;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21952P1;
import p1155zi.C22011h0;
import p179H0.C3190h;
import p225Im.InterfaceC3756d;
import p229J0.AbstractC3980S2;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p911o0.AbstractC17780r;
import ye.C21514c;

/* JADX INFO: renamed from: Hf.T0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3333T0 {

    /* JADX INFO: renamed from: a */
    public static final C17314q f10184a = AbstractC9227W.m9800c(C3367h.f10283s0);

    /* JADX INFO: renamed from: a */
    public static final void m4170a(C3337V0 webViewState, boolean z6, String canmoreId, InterfaceC1436k onMessage, InterfaceC1436k onError, InterfaceC10459q interfaceC10459q, boolean z10, C6021p c6021p, int i10, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        InterfaceC2062k interfaceC2062k;
        boolean z13;
        Object objM14398a;
        boolean z14;
        boolean z15;
        int i13;
        boolean z16;
        AbstractC16544l.m18094g(webViewState, "webViewState");
        AbstractC16544l.m18094g(canmoreId, "canmoreId");
        AbstractC16544l.m18094g(onMessage, "onMessage");
        AbstractC16544l.m18094g(onError, "onError");
        c6021p.m6526U(1257336847);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(webViewState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(canmoreId) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(onMessage) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6545h(onError) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 131072 : 65536;
        }
        int i14 = i11 & 64;
        if (i14 != 0) {
            i12 |= 1572864;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i10 & 1572864) == 0) {
                i12 |= c6021p.m6544g(z11) ? 1048576 : 524288;
            }
        }
        if ((i12 & 599187) == 599186 && c6021p.m6562y()) {
            c6021p.m6517L();
            z12 = z11;
        } else {
            z12 = i14 != 0 ? false : z11;
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
            InterfaceC3756d interfaceC3756dMo5693b = c16527d.mo5693b(CanmoreViewModel.class);
            InterfaceC3756d interfaceC3756dMo5693b2 = c16527d.mo5693b(C3420z0.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(interfaceC3756dMo5693b) | c6021p.m6542f(interfaceC3756dMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6542f || objM6514H == c5975s) {
                z13 = true;
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
                z13 = true;
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM14398a;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            CanmoreViewModel canmoreViewModel = (CanmoreViewModel) baseViewModel;
            C3317L c3317l = C3317L.f10105D0;
            C2153Q0 c2153q0 = canmoreViewModel.f40343c;
            AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) AbstractC9233X.m9805a(c2153q0, c3317l, c6021p, 48).getValue();
            c6021p.m6524S(-1342449192);
            if (abstractC21955Q1 == null) {
                C10451i c10451i = C10444b.f30938q0;
                InterfaceC10459q interfaceC10459qMo428M = interfaceC10459q.mo428M(AbstractC10844c.f32512c);
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
                int i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qMo428M);
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
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                AbstractC3980S2.m4668b(C10843b.f32509a.m11240a(C10456n.f30959Y, c10451i), 0L, 0.0f, 0L, 0, c6021p, 0, 30);
                c6021p.m6553p(z13);
                c6021p.m6553p(false);
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C3326P0(webViewState, z6, canmoreId, onMessage, onError, interfaceC10459q, z12, i10, i11, 0);
                    return;
                }
                return;
            }
            C6021p c6021p2 = c6021p;
            c6021p2.m6553p(false);
            Credentials credentials = (Credentials) AbstractC9233X.m9805a(c2153q0, C3317L.f10104C0, c6021p2, 48).getValue();
            String str = ((C22011h0) AbstractC9233X.m9805a(c2153q0, C3317L.f10103B0, c6021p2, 48).getValue()).f69652a;
            boolean zM8729d = AbstractC8160o6.m8729d(C13838A0.f43874c, c6021p2);
            List list2 = (List) (abstractC21955Q1 instanceof C21952P1 ? ((C21952P1) abstractC21955Q1).f69511a : null);
            if (list2 == null) {
                list2 = C17689w.f56480Y;
            }
            List list3 = list2;
            Object[] objArr = {credentials, new C22011h0(str), new C21514c(canmoreId), list3};
            c6021p2.m6524S(-1342428107);
            int i16 = i12 & 112;
            int i17 = i12 & 14;
            boolean zM6545h = c6021p2.m6545h(credentials) | c6021p2.m6542f(str) | ((i12 & 896) == 256) | c6021p2.m6544g(zM8729d) | (i16 == 32) | ((i12 & 3670016) == 1048576) | (i17 == 4) | c6021p2.m6542f(canmoreViewModel) | c6021p2.m6545h(list3);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == c5975s) {
                z14 = false;
                C3329R0 c3329r0 = new C3329R0(credentials, str, canmoreId, zM8729d, z6, z12, webViewState, canmoreViewModel, list3, null);
                c6021p2 = c6021p;
                c6021p2.m6537c0(c3329r0);
                objM6514H2 = c3329r0;
            } else {
                z14 = false;
            }
            c6021p2.m6553p(z14);
            C5997d.m6453i(objArr, (InterfaceC1439n) objM6514H2, c6021p2);
            c6021p2.m6524S(-1342400609);
            if (i16 == 32) {
                i13 = 4;
                z15 = true;
            } else {
                z15 = z14;
                i13 = 4;
            }
            boolean z17 = (i17 == i13 ? true : z14) | z15;
            Object objM6514H3 = c6021p.m6514H();
            if (z17 || objM6514H3 == c5975s) {
                z16 = true;
                objM6514H3 = new C3190h(z6, webViewState, true ? 1 : 0);
                c6021p2.m6537c0(objM6514H3);
            } else {
                z16 = true;
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H3;
            c6021p2.m6553p(z14);
            C3317L c3317l2 = C3317L.f10102A0;
            c6021p2.m6524S(-1342389490);
            int i18 = i12;
            boolean z18 = (i18 & 7168) == 2048 ? z16 ? 1 : 0 : z14;
            boolean z19 = z16;
            if ((57344 & i18) != 16384) {
                z19 = z14;
            }
            boolean z20 = z19 | z18;
            Object objM6514H4 = c6021p.m6514H();
            if (z20 != 0 || objM6514H4 == c5975s) {
                objM6514H4 = new C3331S0(onMessage, onError, z14);
                c6021p2.m6537c0(objM6514H4);
            }
            c6021p2.m6553p(z14);
            AbstractC10869a.m11355a(interfaceC1436k, interfaceC10459q, null, c3317l2, (InterfaceC1436k) objM6514H4, c6021p, ((i18 >> 12) & 112) | 3072);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C3326P0(webViewState, z6, canmoreId, onMessage, onError, interfaceC10459q, z12, i10, i11, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C3337V0 m4171b(C6021p c6021p) {
        c6021p.m6524S(-1002328284);
        c6021p.m6524S(815532631);
        Object objM6514H = c6021p.m6514H();
        if (objM6514H == C6013l.f19514a) {
            objM6514H = new C3337V0();
            c6021p.m6537c0(objM6514H);
        }
        C3337V0 c3337v0 = (C3337V0) objM6514H;
        c6021p.m6553p(false);
        c6021p.m6553p(false);
        return c3337v0;
    }
}
