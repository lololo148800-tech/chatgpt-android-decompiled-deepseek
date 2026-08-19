package com.openai.feature.conversations.impl.variants;

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
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p225Im.InterfaceC3759g;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p363Og.C6210n;
import p523V9.AbstractC7958O5;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p544W9.AbstractC8662k3;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p870le.C16863U;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17792x;
import p926of.C18160X;
import p964qe.C18697j;
import p964qe.C18698k;

/* JADX INFO: renamed from: com.openai.feature.conversations.impl.variants.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12346a {
    /* JADX INFO: renamed from: a */
    public static final void m14272a(C8870f appState, InterfaceC10459q interfaceC10459q, VariantsInStreamViewModel variantsInStreamViewModel, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        VariantsInStreamViewModel variantsInStreamViewModel2;
        int i12;
        InterfaceC2062k interfaceC2062k2;
        InterfaceC10459q interfaceC10459q3;
        VariantsInStreamViewModel variantsInStreamViewModel3;
        AbstractC16544l.m18094g(appState, "appState");
        c6021p.m6526U(-792637121);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(appState) : c6021p.m6545h(appState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i13 = i11 | 48;
        if ((i10 & 384) == 0) {
            i13 = i11 | 176;
        }
        if ((i13 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            variantsInStreamViewModel3 = variantsInStreamViewModel;
        } else {
            c6021p.m6519N();
            int i14 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i14 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18698k.class));
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
                Object objMo5693b = c16527d.mo5693b(VariantsInStreamViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C18698k.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18698k.class), c16527d.mo5693b(VariantsInStreamViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VariantsInStreamViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                interfaceC10459q2 = c10456n;
                variantsInStreamViewModel2 = (VariantsInStreamViewModel) baseViewModel;
                i12 = i13 & (-897);
            } else {
                c6021p.m6517L();
                i12 = i13 & (-897);
                interfaceC10459q2 = interfaceC10459q;
                variantsInStreamViewModel2 = variantsInStreamViewModel;
            }
            c6021p.m6554q();
            C18698k c18698k = (C18698k) AbstractC9112C3.m9642d(variantsInStreamViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(1444642190);
            boolean zM6542f2 = c6021p.m6542f(variantsInStreamViewModel2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C16863U(1, variantsInStreamViewModel2, VariantsInStreamViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 8);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(1444648611);
            boolean z6 = (i12 & 14) == 4 || ((i12 & 8) != 0 && c6021p.m6545h(appState));
            Object objM6514H3 = c6021p.m6514H();
            if (z6 || objM6514H3 == obj) {
                objM6514H3 = new C12345x867df3e9(appState);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H3;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context2 = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue2 = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list2 = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue2) {
                interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
            } else {
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                interfaceC2062k2 = null;
            }
            c6021p.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a2 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            C16527D c16527d2 = AbstractC16526C.f51263a;
            VariantsInStreamViewModel variantsInStreamViewModel4 = variantsInStreamViewModel2;
            Object objMo5693b3 = c16527d2.mo5693b(MessagesViewModel.class);
            Object objMo5693b4 = c16527d2.mo5693b(C18160X.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f3 = c6021p.m6542f(objMo5693b4) | c6021p.m6542f(objMo5693b3) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f3 || objM6514H4 == obj) {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d2.mo5693b(C18160X.class), c16527d2.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H4 = ViewModelFactoryProviderKt.m14398a(c16527d2.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H4);
            }
            BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H4;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            boolean zM6545h = c6021p.m6545h(baseViewModel2) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6545h || objM6514H5 == obj) {
                objM6514H5 = new C12344x1eece58c(baseViewModel2, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H5, c6021p, baseViewModel2);
            c6021p.m6553p(false);
            AbstractC8662k3.m9350a(interfaceC10459q2, null, 0L, AbstractC8411c.m8969c(-469593162, c6021p, new C6210n(interfaceC3759g, 2)), false, AbstractC8411c.m8969c(28592763, c6021p, new C18697j(c18698k, interfaceC3759g, (MessagesViewModel) baseViewModel2, 1)), c6021p, ((i12 >> 3) & 14) | 199680, 22);
            AbstractC7958O5.m8248a(0, c6021p);
            interfaceC10459q3 = interfaceC10459q2;
            variantsInStreamViewModel3 = variantsInStreamViewModel4;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(appState, interfaceC10459q3, variantsInStreamViewModel3, i10, 26);
        }
    }
}
