package p017Af;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p040Bd.C0954L0;
import p040Bd.C0960M0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.C3949M0;
import p229J0.C4084l0;
import p291Lf.AbstractC5023t;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p523V9.AbstractC8098h0;
import p537W0.AbstractC8411c;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p926of.C18160X;

/* JADX INFO: renamed from: Af.A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0454A {

    /* JADX INFO: renamed from: a */
    public static final float f1468a = 56;

    /* JADX INFO: renamed from: a */
    public static final void m1105a(String messageId, C0960M0 navigation, InterfaceC1436k onLinkClick, InterfaceC1439n trackClick, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(navigation, "navigation");
        AbstractC16544l.m18094g(onLinkClick, "onLinkClick");
        AbstractC16544l.m18094g(trackClick, "trackClick");
        c6021p.m6526U(-2030860444);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(messageId) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(navigation) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onLinkClick) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(trackClick) ? 2048 : 1024;
        }
        if (((i11 | 24576) & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
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
            Object objMo5693b = c16527d.mo5693b(MessagesViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C18160X.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            AbstractC8098h0.m8569a(null, 0, AbstractC5023t.f16412g, AbstractC8411c.m8969c(1548859346, c6021p, new C0488s(navigation, (MessagesViewModel) baseViewModel, messageId, onLinkClick, trackClick, c10456n)), c6021p, 3120, 1);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(messageId, navigation, onLinkClick, trackClick, interfaceC10459q2, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1106b(C0960M0 c0960m0, boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, InterfaceC1439n interfaceC1439n, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1704635785);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c0960m0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6538d(0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(interfaceC1439n) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 1048576 : 524288;
        }
        if ((599187 & i11) == 599186 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C0954L0 c0954l0 = (C0954L0) c0960m0.f2728c.get(0);
            c6021p.m6524S(1052079736);
            boolean zM6545h = ((i11 & 14) == 4) | ((57344 & i11) == 16384) | c6021p.m6545h(c0954l0) | ((458752 & i11) == 131072) | ((i11 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                Object c0494y = new C0494y(interfaceC1436k, c0954l0, interfaceC1439n, c0960m0, 0);
                c6021p.m6537c0(c0494y);
                objM6514H = c0494y;
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4696o((InterfaceC1426a) objM6514H, null, false, null, C4084l0.m4752a(AbstractC3984T1.m4703v(c6021p), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12232n), null, null, null, AbstractC8411c.m8969c(2087575474, c6021p, new C0495z(interfaceC10459q, z6, interfaceC1426a, c0954l0)), c6021p, 100663296);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0470a(c0960m0, z6, interfaceC1426a, interfaceC1436k, interfaceC1439n, interfaceC10459q, i10);
        }
    }
}
