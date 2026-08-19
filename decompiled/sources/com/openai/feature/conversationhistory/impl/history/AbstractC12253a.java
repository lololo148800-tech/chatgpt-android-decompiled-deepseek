package com.openai.feature.conversationhistory.impl.history;

import android.content.Context;
import androidx.compose.animation.AbstractC10831a;
import androidx.compose.animation.AbstractC10832b;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.p650ui.graphics.AbstractC10864a;
import androidx.compose.p650ui.layout.AbstractC10868a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.auth.SwitchAccountViewModel;
import com.openai.chatgpt.R;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import gf.C14127l;
import java.util.List;
import java.util.Map;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1039ud.C20198o;
import p1051v0.C20416d;
import p1062vd.C20545Z;
import p1062vd.C20547a0;
import p1062vd.C20549b0;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1149zc.C21838G;
import p225Im.InterfaceC3759g;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3959O0;
import p229J0.C3949M0;
import p324Mn.C5550t;
import p324Mn.C5551u;
import p349O0.AbstractC6012k0;
import p349O0.C5994b0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p381Pe.C6394e;
import p403Qd.C6636i;
import p403Qd.EnumC6624c;
import p478Tc.AbstractC7308l;
import p478Tc.AbstractC7313q;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC8063c5;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8152n6;
import p525Vb.C8258a;
import p537W0.AbstractC8411c;
import p547Wc.C8775T;
import p547Wc.EnumC8776U;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p575Xd.C9436E;
import p594Y9.AbstractC9775N3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p737f1.InterfaceC13515g;
import p774h1.C14327E;
import p774h1.C14365u;
import p823j3.C16084f;
import p870le.C16862T;
import p870le.C16863U;
import p882m1.clb.WGTYqNchEpHca;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;
import p911o0.C17794y;
import p928oh.C18194a;
import p953q0.C18557O;

/* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12253a {
    static {
        C5550t c5550t = C5551u.Companion;
        c5550t.getClass();
        C5551u c5551u = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
        c5550t.getClass();
        new C6636i("1", "1", c5551u, new C5551u(AbstractC3794B0.m4501z("instant(...)")), (String) null, "Conversation Title 1", (Map) null, (C9436E) null, (String) null, (String) null, (String) null, (String) null, (EnumC6624c) null, (String) null, false, (C6394e) null, 2097104);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:115:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:120:0x0400  */
    /* JADX WARN: Code duplicated, block: B:123:0x0425  */
    /* JADX WARN: Code duplicated, block: B:124:0x0429  */
    /* JADX WARN: Code duplicated, block: B:129:0x0444  */
    /* JADX WARN: Code duplicated, block: B:132:0x046d  */
    /* JADX WARN: Code duplicated, block: B:133:0x047c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0488  */
    /* JADX WARN: Code duplicated, block: B:137:0x048d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0492  */
    /* JADX WARN: Code duplicated, block: B:148:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:152:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:154:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:158:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:167:0x051a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0526  */
    /* JADX WARN: Code duplicated, block: B:174:0x0593  */
    /* JADX WARN: Code duplicated, block: B:175:0x0598  */
    /* JADX WARN: Code duplicated, block: B:184:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:187:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:190:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:191:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:195:0x05ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:199:0x0657  */
    /* JADX WARN: Code duplicated, block: B:201:0x06a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:205:0x06d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x06db  */
    /* JADX WARN: Code duplicated, block: B:209:0x0709 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x070b  */
    /* JADX WARN: Code duplicated, block: B:213:0x072f  */
    /* JADX INFO: renamed from: a */
    public static final void m14244a(C8775T c8775t, InterfaceC10459q interfaceC10459q, HistorySidebarViewModel historySidebarViewModel, SwitchAccountViewModel switchAccountViewModel, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        String str;
        HistorySidebarViewModel historySidebarViewModel2;
        InterfaceC2062k interfaceC2062k2;
        Object obj;
        int i12;
        InterfaceC2062k interfaceC2062k3;
        Object obj2;
        C10843b c10843b;
        C10456n c10456n;
        int i13;
        Object obj3;
        int i14;
        float f10;
        InterfaceC10459q interfaceC10459qM11237o;
        InterfaceC10459q interfaceC10459qM11237o2;
        EnumC8776U enumC8776UM9529a;
        boolean z6;
        InterfaceC1426a interfaceC1426a;
        boolean zM6542f;
        Object objM6514H;
        int i15;
        boolean z10;
        boolean z11;
        Object objM6514H2;
        EnumC8776U enumC8776UM9529a2;
        boolean z12;
        boolean zM6545h;
        Object objM6514H3;
        Object obj4;
        C20416d c20416d;
        boolean zM6542f2;
        Object objM6514H4;
        Object obj5;
        Object obj6;
        Object obj7;
        HistorySidebarViewModel historySidebarViewModel3;
        boolean zM6545h2;
        Object objM6514H5;
        boolean zM6542f3;
        Object objM6514H6;
        boolean zM6542f4;
        Object objM6514H7;
        boolean z13;
        boolean z14;
        Object objM6514H8;
        c6021p.m6526U(-1804321561);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(c8775t) : c6021p.m6545h(c8775t) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= 1024;
        }
        if ((i11 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            historySidebarViewModel3 = historySidebarViewModel;
            obj7 = switchAccountViewModel;
        } else {
            c6021p.m6519N();
            int i16 = i10 & 1;
            Object obj8 = C6013l.f19514a;
            String str2 = WGTYqNchEpHca.Dkdu;
            if (i16 == 0 || c6021p.m6561x()) {
                c6021p.m6524S(-1020152108);
                AbstractC6012k0 abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
                Context context = (Context) c6021p.m6548k(abstractC6012k0);
                AbstractC6012k0 abstractC6012k1 = AbstractC0233b1.f873a;
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                AbstractC6012k0 abstractC6012k2 = AbstractC16421b.f50950a;
                List list = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C20547a0.class));
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
                    throw new IllegalStateException(str2);
                }
                C16527D c16527d = AbstractC16526C.f51263a;
                str = str2;
                Object objMo5693b = c16527d.mo5693b(HistorySidebarViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C20547a0.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f5 = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H9 = c6021p.m6514H();
                if (zM6542f5 || objM6514H9 == obj8) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C20547a0.class), c16527d.mo5693b(HistorySidebarViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H9 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(HistorySidebarViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H9);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H9;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                historySidebarViewModel2 = (HistorySidebarViewModel) baseViewModel;
                c6021p.m6524S(-1020152108);
                Context context2 = (Context) c6021p.m6548k(abstractC6012k0);
                boolean zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                List list2 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue2) {
                    interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C21838G.class));
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
                    throw new IllegalStateException(str);
                }
                Object objMo5693b3 = c16527d.mo5693b(SwitchAccountViewModel.class);
                Object objMo5693b4 = c16527d.mo5693b(C21838G.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f6 = c6021p.m6542f(objMo5693b3) | c6021p.m6542f(objMo5693b4) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                Object objM6514H10 = c6021p.m6514H();
                if (zM6542f6 || objM6514H10 == obj8) {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C21838G.class), c16527d.mo5693b(SwitchAccountViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    objM6514H10 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SwitchAccountViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM6514H10);
                }
                BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H10;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
                c6021p.m6553p(false);
                obj = (SwitchAccountViewModel) baseViewModel2;
                i12 = i11 & (-8065);
            } else {
                c6021p.m6517L();
                historySidebarViewModel2 = historySidebarViewModel;
                obj = switchAccountViewModel;
                i12 = i11 & (-8065);
                str = str2;
            }
            c6021p.m6554q();
            c6021p.m6524S(1853951972);
            boolean zM6542f7 = c6021p.m6542f(historySidebarViewModel2);
            Object objM6514H11 = c6021p.m6514H();
            if (zM6542f7 || objM6514H11 == obj8) {
                objM6514H11 = new C16863U(1, historySidebarViewModel2, HistorySidebarViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 16);
                c6021p.m6537c0(objM6514H11);
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H11;
            c6021p.m6553p(false);
            C20547a0 c20547a0 = (C20547a0) AbstractC9112C3.m9642d(historySidebarViewModel2.f40343c, c6021p).getValue();
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c6021p.m6524S(1853958963);
            boolean zM6545h3 = c6021p.m6545h(c8870f);
            Object objM6514H12 = c6021p.m6514H();
            if (zM6545h3 || objM6514H12 == obj8) {
                objM6514H12 = new HistorySidebarKt$HistorySidebar$gizmosAndHistoryViewModel$1$1(c8870f);
                c6021p.m6537c0(objM6514H12);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H12;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context3 = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue3 = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list3 = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue3) {
                interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C20549b0.class));
            } else {
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                interfaceC2062k3 = null;
            }
            c6021p.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerM12165a3 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a3 == null) {
                throw new IllegalStateException(str);
            }
            C16527D c16527d2 = AbstractC16526C.f51263a;
            HistorySidebarViewModel historySidebarViewModel4 = historySidebarViewModel2;
            Object objMo5693b5 = c16527d2.mo5693b(GizmosAndHistoryViewModel.class);
            Object objMo5693b6 = c16527d2.mo5693b(C20549b0.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f8 = c6021p.m6542f(objMo5693b5) | c6021p.m6542f(objMo5693b6) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
            Object objM6514H13 = c6021p.m6514H();
            if (zM6542f8 || objM6514H13 == obj8) {
                if (zBooleanValue3) {
                    ViewModelFactoryProviderKt.m14399b(c16527d2.mo5693b(C20549b0.class), c16527d2.mo5693b(GizmosAndHistoryViewModel.class), context3, interfaceC2062k3);
                    throw null;
                }
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                objM6514H13 = ViewModelFactoryProviderKt.m14398a(c16527d2.mo5693b(GizmosAndHistoryViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                c6021p.m6537c0(objM6514H13);
            }
            BaseViewModel baseViewModel3 = (BaseViewModel) objM6514H13;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel3, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            boolean zM6545h4 = c6021p.m6545h(baseViewModel3) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H14 = c6021p.m6514H();
            if (zM6545h4 || objM6514H14 == obj8) {
                objM6514H14 = new HistorySidebarKt$HistorySidebar$$inlined$injectViewModel$1(baseViewModel3, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H14);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H14, c6021p, baseViewModel3);
            c6021p.m6553p(false);
            GizmosAndHistoryViewModel gizmosAndHistoryViewModel = (GizmosAndHistoryViewModel) baseViewModel3;
            C20549b0 c20549b0 = (C20549b0) AbstractC9112C3.m9642d(gizmosAndHistoryViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(1853965584);
            Object objM6514H15 = c6021p.m6514H();
            if (objM6514H15 == obj8) {
                objM6514H15 = C5997d.m6428O(0.0f);
                c6021p.m6537c0(objM6514H15);
            }
            C5994b0 c5994b0 = (C5994b0) objM6514H15;
            c6021p.m6553p(false);
            Object objM6514H16 = c6021p.m6514H();
            if (objM6514H16 == obj8) {
                objM6514H16 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            Object obj9 = ((C6035w) objM6514H16).f19668Y;
            Object obj10 = (InterfaceC13515g) c6021p.m6548k(AbstractC0187M0.f705g);
            Object obj11 = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i17 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a2 = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a2);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O) {
                obj2 = obj10;
            } else {
                obj2 = obj10;
                if (!AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i17))) {
                }
                C21694h c21694h4 = C21698j.f68871d;
                C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
                c10843b = C10843b.f32509a;
                c10456n = C10456n.f30959Y;
                C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                i13 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                obj3 = obj;
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, c10456n);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a2);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
                C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                    AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
                }
                C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
                C17794y c17794y = C17794y.f56777a;
                C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 48);
                i14 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, c10456n);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a2);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
                C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m3);
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                    AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
                }
                C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d3);
                C17785t0 c17785t0 = C17785t0.f56761a;
                InterfaceC10459q interfaceC10459qM11205a = AbstractC10832b.m11205a(c17785t0.m19513a(c10456n, 1.0f, true), null, 3);
                f10 = AbstractC7313q.f23199d;
                interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM11205a, f10, f10, 0.0f, f10, 4);
                if (c20549b0.f65231w) {
                    interfaceC10459qM11237o2 = interfaceC10459qM11237o;
                } else {
                    interfaceC10459qM11237o2 = AbstractC10842a.m11237o(interfaceC10459qM11237o, 0.0f, 0.0f, f10, 0.0f, 11);
                }
                c6021p.m6524S(-2062306339);
                if (c8775t != null) {
                    enumC8776UM9529a = c8775t.m9529a();
                } else {
                    enumC8776UM9529a = null;
                }
                if (enumC8776UM9529a == EnumC8776U.f26771o0) {
                    c6021p.m6524S(-2062303815);
                    boolean zM6545h5 = c6021p.m6545h(obj9);
                    if ((i12 & 14) != 4 || ((i12 & 8) != 0 && c6021p.m6545h(c8775t))) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM6545h5 | z13;
                    objM6514H8 = c6021p.m6514H();
                    if (z14 || objM6514H8 == obj8) {
                        objM6514H8 = new C16084f(obj9, 19, c8775t);
                        c6021p.m6537c0(objM6514H8);
                    }
                    interfaceC1426a = (InterfaceC1426a) objM6514H8;
                    z6 = false;
                    c6021p.m6553p(false);
                } else {
                    z6 = false;
                    interfaceC1426a = null;
                }
                c6021p.m6553p(z6);
                String strM8676d = AbstractC8142m4.m8676d(R.string.design_search_hint, c6021p);
                c6021p.m6524S(-2062322162);
                zM6542f = c6021p.m6542f(gizmosAndHistoryViewModel);
                objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj8) {
                    objM6514H = new C20198o(gizmosAndHistoryViewModel, 8);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(-2062292024);
                boolean zM6545h6 = c6021p.m6545h(obj9);
                i15 = i12 & 14;
                if (i15 != 4 || ((i12 & 8) != 0 && c6021p.m6545h(c8775t))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = zM6545h6 | z10;
                objM6514H2 = c6021p.m6514H();
                if (z11 || objM6514H2 == obj8) {
                    objM6514H2 = new C18194a(obj9, 21, c8775t);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                Object obj12 = obj2;
                AbstractC9775N3.m10381a(interfaceC1436k2, interfaceC10459qM11237o2, interfaceC1426a, strM8676d, c20549b0.f65230v, null, (InterfaceC1436k) objM6514H2, true, c6021p, 12582912, 32);
                AbstractC10831a.m11200c(c17785t0, c20549b0.f65231w, null, null, null, null, AbstractC8411c.m8969c(-996296417, c6021p, new C14127l(interfaceC20904w, 13, gizmosAndHistoryViewModel)), c6021p, 1572870, 30);
                c6021p.m6553p(true);
                if (c8775t != null) {
                    enumC8776UM9529a2 = c8775t.m9529a();
                } else {
                    enumC8776UM9529a2 = null;
                }
                c6021p.m6524S(-201305132);
                if (i15 != 4 || ((i12 & 8) != 0 && c6021p.m6545h(c8775t))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zM6545h = c6021p.m6545h(obj12) | z12 | c6021p.m6542f(gizmosAndHistoryViewModel);
                objM6514H3 = c6021p.m6514H();
                if (zM6545h) {
                    obj4 = obj8;
                } else {
                    obj4 = obj8;
                    if (objM6514H3 == obj4) {
                        c20416d = null;
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, enumC8776UM9529a2);
                    c6021p.m6524S(-201290382);
                    zM6542f2 = c6021p.m6542f(gizmosAndHistoryViewModel);
                    objM6514H4 = c6021p.m6514H();
                    if (zM6542f2 || objM6514H4 == obj4) {
                        objM6514H4 = new C16863U(1, gizmosAndHistoryViewModel, GizmosAndHistoryViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 15);
                        c6021p.m6537c0(objM6514H4);
                    }
                    c6021p.m6553p(false);
                    AbstractC8063c5.m8458a(c20549b0, (InterfaceC1436k) ((InterfaceC3759g) objM6514H4), AbstractC10864a.m11306b(c17794y.m19544b(c10456n, true), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 0, 126975), c5994b0.m6409g(), c6021p, 0);
                    c6021p.m6553p(true);
                    obj5 = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
                    c6021p.m6524S(-568897740);
                    if (c20547a0.f65199a != null) {
                        AbstractC6012k0 abstractC6012k3 = AbstractC3959O0.f12302a;
                        C14327E c14327eM8896j = C8258a.m8896j(AbstractC17681o.m19382k(new C14365u(C14365u.m15774b(0.93f, ((C3949M0) c6021p.m6548k(abstractC6012k3)).f12234p)), new C14365u(((C3949M0) c6021p.m6548k(abstractC6012k3)).f12234p)));
                        c6021p.m6524S(-568884886);
                        obj6 = obj3;
                        zM6545h2 = c6021p.m6545h(obj6) | c6021p.m6545h(obj11);
                        objM6514H5 = c6021p.m6514H();
                        if (zM6545h2 || objM6514H5 == obj4) {
                            objM6514H5 = new C18194a(obj6, 22, obj11);
                            c6021p.m6537c0(objM6514H5);
                        }
                        InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) objM6514H5;
                        c6021p.m6553p(false);
                        InterfaceC10459q interfaceC10459qM11206a = AbstractC10833a.m11206a(c10843b.m11240a(AbstractC10844c.m11244d(c10456n, 1.0f), C10444b.f30940s0), c14327eM8896j, c20416d, 6);
                        c6021p.m6524S(-568869257);
                        zM6542f3 = c6021p.m6542f(obj5);
                        objM6514H6 = c6021p.m6514H();
                        if (zM6542f3 || objM6514H6 == obj4) {
                            objM6514H6 = new C18194a(c5994b0, 23, obj5);
                            c6021p.m6537c0(objM6514H6);
                        }
                        c6021p.m6553p(false);
                        InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(AbstractC10868a.m11318d(interfaceC10459qM11206a, (InterfaceC1436k) objM6514H6), AbstractC7313q.f23201f);
                        c6021p.m6524S(-568864356);
                        zM6542f4 = c6021p.m6542f(interfaceC3759g);
                        objM6514H7 = c6021p.m6514H();
                        if (zM6542f4 || objM6514H7 == obj4) {
                            objM6514H7 = new C16862T(interfaceC3759g, 10);
                            c6021p.m6537c0(objM6514H7);
                        }
                        c6021p.m6553p(false);
                        AbstractC8152n6.m8697a(c20547a0.f65199a, interfaceC1436k3, interfaceC10459qM11233k, (InterfaceC1426a) objM6514H7, true, false, true, c6021p, 1597440, 32);
                    } else {
                        obj6 = obj3;
                    }
                    c6021p.m6553p(false);
                    c6021p.m6553p(true);
                    obj7 = obj6;
                    historySidebarViewModel3 = historySidebarViewModel4;
                }
                c20416d = null;
                objM6514H3 = new C20545Z(c8775t, obj12, gizmosAndHistoryViewModel, null);
                c6021p.m6537c0(objM6514H3);
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, enumC8776UM9529a2);
                c6021p.m6524S(-201290382);
                zM6542f2 = c6021p.m6542f(gizmosAndHistoryViewModel);
                objM6514H4 = c6021p.m6514H();
                if (zM6542f2) {
                    objM6514H4 = new C16863U(1, gizmosAndHistoryViewModel, GizmosAndHistoryViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 15);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C16863U(1, gizmosAndHistoryViewModel, GizmosAndHistoryViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 15);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                AbstractC8063c5.m8458a(c20549b0, (InterfaceC1436k) ((InterfaceC3759g) objM6514H4), AbstractC10864a.m11306b(c17794y.m19544b(c10456n, true), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 0, 126975), c5994b0.m6409g(), c6021p, 0);
                c6021p.m6553p(true);
                obj5 = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
                c6021p.m6524S(-568897740);
                if (c20547a0.f65199a != null) {
                    AbstractC6012k0 abstractC6012k4 = AbstractC3959O0.f12302a;
                    C14327E c14327eM8896j2 = C8258a.m8896j(AbstractC17681o.m19382k(new C14365u(C14365u.m15774b(0.93f, ((C3949M0) c6021p.m6548k(abstractC6012k4)).f12234p)), new C14365u(((C3949M0) c6021p.m6548k(abstractC6012k4)).f12234p)));
                    c6021p.m6524S(-568884886);
                    obj6 = obj3;
                    zM6545h2 = c6021p.m6545h(obj6) | c6021p.m6545h(obj11);
                    objM6514H5 = c6021p.m6514H();
                    if (zM6545h2) {
                        objM6514H5 = new C18194a(obj6, 22, obj11);
                        c6021p.m6537c0(objM6514H5);
                    } else {
                        objM6514H5 = new C18194a(obj6, 22, obj11);
                        c6021p.m6537c0(objM6514H5);
                    }
                    InterfaceC1436k interfaceC1436k4 = (InterfaceC1436k) objM6514H5;
                    c6021p.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11206a2 = AbstractC10833a.m11206a(c10843b.m11240a(AbstractC10844c.m11244d(c10456n, 1.0f), C10444b.f30940s0), c14327eM8896j2, c20416d, 6);
                    c6021p.m6524S(-568869257);
                    zM6542f3 = c6021p.m6542f(obj5);
                    objM6514H6 = c6021p.m6514H();
                    if (zM6542f3) {
                        objM6514H6 = new C18194a(c5994b0, 23, obj5);
                        c6021p.m6537c0(objM6514H6);
                    } else {
                        objM6514H6 = new C18194a(c5994b0, 23, obj5);
                        c6021p.m6537c0(objM6514H6);
                    }
                    c6021p.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11233k2 = AbstractC10842a.m11233k(AbstractC10868a.m11318d(interfaceC10459qM11206a2, (InterfaceC1436k) objM6514H6), AbstractC7313q.f23201f);
                    c6021p.m6524S(-568864356);
                    zM6542f4 = c6021p.m6542f(interfaceC3759g);
                    objM6514H7 = c6021p.m6514H();
                    if (zM6542f4) {
                        objM6514H7 = new C16862T(interfaceC3759g, 10);
                        c6021p.m6537c0(objM6514H7);
                    } else {
                        objM6514H7 = new C16862T(interfaceC3759g, 10);
                        c6021p.m6537c0(objM6514H7);
                    }
                    c6021p.m6553p(false);
                    AbstractC8152n6.m8697a(c20547a0.f65199a, interfaceC1436k4, interfaceC10459qM11233k2, (InterfaceC1426a) objM6514H7, true, false, true, c6021p, 1597440, 32);
                } else {
                    obj6 = obj3;
                }
                c6021p.m6553p(false);
                c6021p.m6553p(true);
                obj7 = obj6;
                historySidebarViewModel3 = historySidebarViewModel4;
            }
            AbstractC0168G.m537z(i17, c6021p, i17, c21694h3);
            C21694h c21694h5 = C21698j.f68871d;
            C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d);
            c10843b = C10843b.f32509a;
            c10456n = C10456n.f30959Y;
            C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
            obj3 = obj;
            InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, c10456n);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a2);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a2);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m4);
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            } else {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d4);
            C17794y c17794y2 = C17794y.f56777a;
            C17781r0 c17781r0M19506b2 = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 48);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, c10456n);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a2);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b2);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m5);
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
            } else {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
            }
            C5997d.m6439Z(c21694h5, c6021p, interfaceC10459qM10923d5);
            C17785t0 c17785t1 = C17785t0.f56761a;
            InterfaceC10459q interfaceC10459qM11205a2 = AbstractC10832b.m11205a(c17785t1.m19513a(c10456n, 1.0f, true), null, 3);
            f10 = AbstractC7313q.f23199d;
            interfaceC10459qM11237o = AbstractC10842a.m11237o(interfaceC10459qM11205a2, f10, f10, 0.0f, f10, 4);
            if (c20549b0.f65231w) {
                interfaceC10459qM11237o2 = AbstractC10842a.m11237o(interfaceC10459qM11237o, 0.0f, 0.0f, f10, 0.0f, 11);
            } else {
                interfaceC10459qM11237o2 = interfaceC10459qM11237o;
            }
            c6021p.m6524S(-2062306339);
            if (c8775t != null) {
                enumC8776UM9529a = c8775t.m9529a();
            } else {
                enumC8776UM9529a = null;
            }
            if (enumC8776UM9529a == EnumC8776U.f26771o0) {
                c6021p.m6524S(-2062303815);
                boolean zM6545h7 = c6021p.m6545h(obj9);
                if ((i12 & 14) != 4) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                z14 = zM6545h7 | z13;
                objM6514H8 = c6021p.m6514H();
                if (z14) {
                    objM6514H8 = new C16084f(obj9, 19, c8775t);
                    c6021p.m6537c0(objM6514H8);
                } else {
                    objM6514H8 = new C16084f(obj9, 19, c8775t);
                    c6021p.m6537c0(objM6514H8);
                }
                interfaceC1426a = (InterfaceC1426a) objM6514H8;
                z6 = false;
                c6021p.m6553p(false);
            } else {
                z6 = false;
                interfaceC1426a = null;
            }
            c6021p.m6553p(z6);
            String strM8676d2 = AbstractC8142m4.m8676d(R.string.design_search_hint, c6021p);
            c6021p.m6524S(-2062322162);
            zM6542f = c6021p.m6542f(gizmosAndHistoryViewModel);
            objM6514H = c6021p.m6514H();
            if (zM6542f) {
                objM6514H = new C20198o(gizmosAndHistoryViewModel, 8);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new C20198o(gizmosAndHistoryViewModel, 8);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k5 = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(-2062292024);
            boolean zM6545h8 = c6021p.m6545h(obj9);
            i15 = i12 & 14;
            if (i15 != 4) {
                z10 = true;
            } else {
                z10 = true;
            }
            z11 = zM6545h8 | z10;
            objM6514H2 = c6021p.m6514H();
            if (z11) {
                objM6514H2 = new C18194a(obj9, 21, c8775t);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C18194a(obj9, 21, c8775t);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            Object obj13 = obj2;
            AbstractC9775N3.m10381a(interfaceC1436k5, interfaceC10459qM11237o2, interfaceC1426a, strM8676d2, c20549b0.f65230v, null, (InterfaceC1436k) objM6514H2, true, c6021p, 12582912, 32);
            AbstractC10831a.m11200c(c17785t1, c20549b0.f65231w, null, null, null, null, AbstractC8411c.m8969c(-996296417, c6021p, new C14127l(interfaceC20904w, 13, gizmosAndHistoryViewModel)), c6021p, 1572870, 30);
            c6021p.m6553p(true);
            if (c8775t != null) {
                enumC8776UM9529a2 = c8775t.m9529a();
            } else {
                enumC8776UM9529a2 = null;
            }
            c6021p.m6524S(-201305132);
            if (i15 != 4) {
                z12 = true;
            } else {
                z12 = true;
            }
            zM6545h = c6021p.m6545h(obj13) | z12 | c6021p.m6542f(gizmosAndHistoryViewModel);
            objM6514H3 = c6021p.m6514H();
            if (zM6545h) {
                obj4 = obj8;
                if (objM6514H3 == obj4) {
                    c20416d = null;
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, enumC8776UM9529a2);
                c6021p.m6524S(-201290382);
                zM6542f2 = c6021p.m6542f(gizmosAndHistoryViewModel);
                objM6514H4 = c6021p.m6514H();
                if (zM6542f2) {
                    objM6514H4 = new C16863U(1, gizmosAndHistoryViewModel, GizmosAndHistoryViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 15);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C16863U(1, gizmosAndHistoryViewModel, GizmosAndHistoryViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 15);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                AbstractC8063c5.m8458a(c20549b0, (InterfaceC1436k) ((InterfaceC3759g) objM6514H4), AbstractC10864a.m11306b(c17794y2.m19544b(c10456n, true), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 0, 126975), c5994b0.m6409g(), c6021p, 0);
                c6021p.m6553p(true);
                obj5 = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
                c6021p.m6524S(-568897740);
                if (c20547a0.f65199a != null) {
                    AbstractC6012k0 abstractC6012k5 = AbstractC3959O0.f12302a;
                    C14327E c14327eM8896j3 = C8258a.m8896j(AbstractC17681o.m19382k(new C14365u(C14365u.m15774b(0.93f, ((C3949M0) c6021p.m6548k(abstractC6012k5)).f12234p)), new C14365u(((C3949M0) c6021p.m6548k(abstractC6012k5)).f12234p)));
                    c6021p.m6524S(-568884886);
                    obj6 = obj3;
                    zM6545h2 = c6021p.m6545h(obj6) | c6021p.m6545h(obj11);
                    objM6514H5 = c6021p.m6514H();
                    if (zM6545h2) {
                        objM6514H5 = new C18194a(obj6, 22, obj11);
                        c6021p.m6537c0(objM6514H5);
                    } else {
                        objM6514H5 = new C18194a(obj6, 22, obj11);
                        c6021p.m6537c0(objM6514H5);
                    }
                    InterfaceC1436k interfaceC1436k6 = (InterfaceC1436k) objM6514H5;
                    c6021p.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11206a3 = AbstractC10833a.m11206a(c10843b.m11240a(AbstractC10844c.m11244d(c10456n, 1.0f), C10444b.f30940s0), c14327eM8896j3, c20416d, 6);
                    c6021p.m6524S(-568869257);
                    zM6542f3 = c6021p.m6542f(obj5);
                    objM6514H6 = c6021p.m6514H();
                    if (zM6542f3) {
                        objM6514H6 = new C18194a(c5994b0, 23, obj5);
                        c6021p.m6537c0(objM6514H6);
                    } else {
                        objM6514H6 = new C18194a(c5994b0, 23, obj5);
                        c6021p.m6537c0(objM6514H6);
                    }
                    c6021p.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11233k3 = AbstractC10842a.m11233k(AbstractC10868a.m11318d(interfaceC10459qM11206a3, (InterfaceC1436k) objM6514H6), AbstractC7313q.f23201f);
                    c6021p.m6524S(-568864356);
                    zM6542f4 = c6021p.m6542f(interfaceC3759g);
                    objM6514H7 = c6021p.m6514H();
                    if (zM6542f4) {
                        objM6514H7 = new C16862T(interfaceC3759g, 10);
                        c6021p.m6537c0(objM6514H7);
                    } else {
                        objM6514H7 = new C16862T(interfaceC3759g, 10);
                        c6021p.m6537c0(objM6514H7);
                    }
                    c6021p.m6553p(false);
                    AbstractC8152n6.m8697a(c20547a0.f65199a, interfaceC1436k6, interfaceC10459qM11233k3, (InterfaceC1426a) objM6514H7, true, false, true, c6021p, 1597440, 32);
                } else {
                    obj6 = obj3;
                }
                c6021p.m6553p(false);
                c6021p.m6553p(true);
                obj7 = obj6;
                historySidebarViewModel3 = historySidebarViewModel4;
            } else {
                obj4 = obj8;
            }
            c20416d = null;
            objM6514H3 = new C20545Z(c8775t, obj13, gizmosAndHistoryViewModel, null);
            c6021p.m6537c0(objM6514H3);
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, enumC8776UM9529a2);
            c6021p.m6524S(-201290382);
            zM6542f2 = c6021p.m6542f(gizmosAndHistoryViewModel);
            objM6514H4 = c6021p.m6514H();
            if (zM6542f2) {
                objM6514H4 = new C16863U(1, gizmosAndHistoryViewModel, GizmosAndHistoryViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 15);
                c6021p.m6537c0(objM6514H4);
            } else {
                objM6514H4 = new C16863U(1, gizmosAndHistoryViewModel, GizmosAndHistoryViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 15);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            AbstractC8063c5.m8458a(c20549b0, (InterfaceC1436k) ((InterfaceC3759g) objM6514H4), AbstractC10864a.m11306b(c17794y2.m19544b(c10456n, true), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 0, 126975), c5994b0.m6409g(), c6021p, 0);
            c6021p.m6553p(true);
            obj5 = (InterfaceC7537b) c6021p.m6548k(AbstractC0187M0.f704f);
            c6021p.m6524S(-568897740);
            if (c20547a0.f65199a != null) {
                AbstractC6012k0 abstractC6012k6 = AbstractC3959O0.f12302a;
                C14327E c14327eM8896j4 = C8258a.m8896j(AbstractC17681o.m19382k(new C14365u(C14365u.m15774b(0.93f, ((C3949M0) c6021p.m6548k(abstractC6012k6)).f12234p)), new C14365u(((C3949M0) c6021p.m6548k(abstractC6012k6)).f12234p)));
                c6021p.m6524S(-568884886);
                obj6 = obj3;
                zM6545h2 = c6021p.m6545h(obj6) | c6021p.m6545h(obj11);
                objM6514H5 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H5 = new C18194a(obj6, 22, obj11);
                    c6021p.m6537c0(objM6514H5);
                } else {
                    objM6514H5 = new C18194a(obj6, 22, obj11);
                    c6021p.m6537c0(objM6514H5);
                }
                InterfaceC1436k interfaceC1436k7 = (InterfaceC1436k) objM6514H5;
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM11206a4 = AbstractC10833a.m11206a(c10843b.m11240a(AbstractC10844c.m11244d(c10456n, 1.0f), C10444b.f30940s0), c14327eM8896j4, c20416d, 6);
                c6021p.m6524S(-568869257);
                zM6542f3 = c6021p.m6542f(obj5);
                objM6514H6 = c6021p.m6514H();
                if (zM6542f3) {
                    objM6514H6 = new C18194a(c5994b0, 23, obj5);
                    c6021p.m6537c0(objM6514H6);
                } else {
                    objM6514H6 = new C18194a(c5994b0, 23, obj5);
                    c6021p.m6537c0(objM6514H6);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM11233k4 = AbstractC10842a.m11233k(AbstractC10868a.m11318d(interfaceC10459qM11206a4, (InterfaceC1436k) objM6514H6), AbstractC7313q.f23201f);
                c6021p.m6524S(-568864356);
                zM6542f4 = c6021p.m6542f(interfaceC3759g);
                objM6514H7 = c6021p.m6514H();
                if (zM6542f4) {
                    objM6514H7 = new C16862T(interfaceC3759g, 10);
                    c6021p.m6537c0(objM6514H7);
                } else {
                    objM6514H7 = new C16862T(interfaceC3759g, 10);
                    c6021p.m6537c0(objM6514H7);
                }
                c6021p.m6553p(false);
                AbstractC8152n6.m8697a(c20547a0.f65199a, interfaceC1436k7, interfaceC10459qM11233k4, (InterfaceC1426a) objM6514H7, true, false, true, c6021p, 1597440, 32);
            } else {
                obj6 = obj3;
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            obj7 = obj6;
            historySidebarViewModel3 = historySidebarViewModel4;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18557O(i10, 9, c8775t, interfaceC10459q, historySidebarViewModel3, obj7);
        }
    }
}
