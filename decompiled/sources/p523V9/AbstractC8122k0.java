package p523V9;

import af.C10564U;
import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.subscriptions.access.SubscriptionAccessCheckViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p002A0.C0148y;
import p003A1.AbstractC0233b1;
import p003A1.C0178J0;
import p017Af.AbstractC0479j;
import p017Af.C0466M;
import p025An.C0644w;
import p040Bd.C0901C1;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9112C3;
import p594Y9.AbstractC9721E3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p645ah.C10607a;
import p645ah.C10609c;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: V9.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8122k0 {
    /* JADX INFO: renamed from: a */
    public static final void m8628a(SubscriptionAccessCheckViewModel subscriptionAccessCheckViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        SubscriptionAccessCheckViewModel subscriptionAccessCheckViewModel2;
        c6021p.m6526U(-1515999002);
        if ((((i10 & 6) == 0 ? i10 | 2 : i10) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            subscriptionAccessCheckViewModel2 = subscriptionAccessCheckViewModel;
        } else {
            c6021p.m6519N();
            int i11 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i11 == 0 || c6021p.m6561x()) {
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C10609c.class));
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
                Object objMo5693b = c16527d.mo5693b(SubscriptionAccessCheckViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C10609c.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C10609c.class), c16527d.mo5693b(SubscriptionAccessCheckViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SubscriptionAccessCheckViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                subscriptionAccessCheckViewModel2 = (SubscriptionAccessCheckViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                subscriptionAccessCheckViewModel2 = subscriptionAccessCheckViewModel;
            }
            c6021p.m6554q();
            InterfaceC5985X interfaceC5985XM9642d = AbstractC9112C3.m9642d(subscriptionAccessCheckViewModel2.f40343c, c6021p);
            c6021p.m6524S(-568477658);
            boolean zM6542f2 = c6021p.m6542f(subscriptionAccessCheckViewModel2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C10564U(subscriptionAccessCheckViewModel2, 2);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC9721E3.m10311a((InterfaceC1436k) objM6514H2, C10607a.f31482Y, ((C10609c) interfaceC5985XM9642d.getValue()).f31484a, AbstractC8142m4.m8676d(R.string.subscriptions_access_check_dialog_confirmation_button_text, c6021p), 0L, null, false, null, c6021p, 1572912, 176);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(subscriptionAccessCheckViewModel2, i10, 16);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8629b(C0901C1 tldr, boolean z6, InterfaceC1436k onLinkClick, InterfaceC1439n trackClick, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(tldr, "tldr");
        AbstractC16544l.m18094g(onLinkClick, "onLinkClick");
        AbstractC16544l.m18094g(trackClick, "trackClick");
        c6021p.m6526U(1033046284);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(tldr) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onLinkClick) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(trackClick) ? 2048 : 1024;
        }
        int i12 = i11 | 24576;
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            if (z6) {
                if (AbstractC16544l.m18089b(tldr.f2633f, Boolean.TRUE)) {
                    C6018n0 c6018n0M6555r = c6021p.m6555r();
                    if (c6018n0M6555r != null) {
                        c6018n0M6555r.f19536d = new C0466M(tldr, z6, onLinkClick, trackClick, c10456n, i10, 0);
                        return;
                    }
                    return;
                }
            }
            AbstractC8098h0.m8569a(c10456n, 0, AbstractC0479j.f1556b - AbstractC7313q.f23201f, AbstractC8411c.m8969c(-431014790, c6021p, new C0148y(tldr, onLinkClick, trackClick, 4)), c6021p, ((i12 >> 12) & 14) | 3120, 0);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C0466M(tldr, z6, onLinkClick, trackClick, interfaceC10459q2, i10, 1);
        }
    }
}
