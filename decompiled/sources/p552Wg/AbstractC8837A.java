package p552Wg;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.p650ui.input.nestedscroll.AbstractC10866a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bf.AbstractC11372a0;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.sharing.C12509xf78ee5cc;
import com.openai.feature.sharing.ViewSharedConversationViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p040Bd.EnumC0940I4;
import p042Bf.C1268j;
import p042Bf.C1282x;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1042uh.C20263a0;
import p1095x1.InterfaceC21057K;
import p1107xh.EnumC21219I;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21936L0;
import p1155zi.C21966U1;
import p1155zi.C22020j1;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3917G4;
import p229J0.AbstractC3980S2;
import p229J0.C4055g1;
import p349O0.AbstractC6012k0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p403Qd.C6597C;
import p406Qg.C6703N;
import p478Tc.AbstractC7308l;
import p479Td.C7326L;
import p479Td.C7351f0;
import p479Td.EnumC7359j0;
import p482Tg.C7445b0;
import p523V9.AbstractC8086f4;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17792x;
import p926of.C18160X;
import sg.C19575q;

/* JADX INFO: renamed from: Wg.A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8837A {
    static {
        EnumC7359j0 enumC7359j0 = EnumC7359j0.f23344o0;
        C7326L c7326l = new C7326L("Hello, world!");
        C22020j1.Companion.getClass();
        EnumC0940I4 enumC0940I4 = EnumC0940I4.f2702p0;
        new C6597C(new C7351f0("messageId", null, null, null, enumC7359j0, c7326l, "gpt-4o-mini", null, null, null, null, null, enumC0940I4, null, "gpt-4o-mini", false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, -41078, 511));
        new C6597C(new C7351f0("messageUserId", null, null, null, EnumC7359j0.f23343Z, new C7326L("Hi there!"), "gpt-4o-mini", null, null, null, null, null, enumC0940I4, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, -8310, 511));
    }

    /* JADX WARN: Code duplicated, block: B:72:0x02e6  */
    /* JADX INFO: renamed from: a */
    public static final void m9544a(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        InterfaceC2062k interfaceC2062k2;
        boolean z6;
        Object objM14398a;
        String str;
        c6021p.m6526U(-148731956);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            c6021p.m6524S(775894496);
            boolean zM6545h = c6021p.m6545h(c8870f);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6545h || objM6514H == obj) {
                objM6514H = new C6703N(c8870f, 1);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            AbstractC6012k0 abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
            Context context = (Context) c6021p.m6548k(abstractC6012k0);
            AbstractC6012k0 abstractC6012k1 = AbstractC0233b1.f873a;
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            AbstractC6012k0 abstractC6012k2 = AbstractC16421b.f50950a;
            List list = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C8838B.class));
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
            Object objMo5693b = c16527d.mo5693b(ViewSharedConversationViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C8838B.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C8838B.class), c16527d.mo5693b(ViewSharedConversationViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                Object objM14398a2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ViewSharedConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM14398a2);
                objM6514H2 = objM14398a2;
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            boolean zM6545h2 = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h2 || objM6514H3 == obj) {
                objM6514H3 = new C12509xf78ee5cc(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            ViewSharedConversationViewModel viewSharedConversationViewModel = (ViewSharedConversationViewModel) baseViewModel;
            c6021p.m6524S(-1020152108);
            Context context2 = (Context) c6021p.m6548k(abstractC6012k0);
            boolean zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            List list2 = (List) c6021p.m6548k(abstractC6012k2);
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
            ViewModelStoreOwner viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a2 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            Object objMo5693b3 = c16527d.mo5693b(MessagesViewModel.class);
            Object objMo5693b4 = c16527d.mo5693b(C18160X.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f2 = c6021p.m6542f(objMo5693b3) | c6021p.m6542f(objMo5693b4) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f2 || objM6514H4 == obj) {
                z6 = true;
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM14398a);
            } else {
                objM14398a = objM6514H4;
                z6 = true;
            }
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a((BaseViewModel) objM14398a, c6021p, 0);
            c6021p.m6553p(false);
            C8838B c8838b = (C8838B) AbstractC9112C3.m9642d(viewSharedConversationViewModel.f40343c, c6021p).getValue();
            if (c8838b.f27026a) {
                c6021p.m6524S(-1716572911);
                FillElement fillElement = AbstractC10844c.f32512c;
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                int i11 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, fillElement);
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
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                    AbstractC0168G.m537z(i11, c6021p, i11, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                AbstractC3980S2.m4668b(C10843b.f32509a.m11240a(interfaceC10459q2, C10444b.f30938q0), 0L, 0.0f, 0L, 0, c6021p, 0, 30);
                c6021p.m6553p(z6);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-1716261299);
                c6021p.m6524S(775915626);
                boolean zM6542f3 = c6021p.m6542f(viewSharedConversationViewModel);
                Object objM6514H5 = c6021p.m6514H();
                if (zM6542f3 || objM6514H5 == obj) {
                    objM6514H5 = new C7445b0(1, viewSharedConversationViewModel, ViewSharedConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                    c6021p.m6537c0(objM6514H5);
                }
                InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H5;
                c6021p.m6553p(false);
                AbstractC8662k3.m9350a(AbstractC10866a.m11313a(interfaceC10459q2, (C4055g1) AbstractC3917G4.m4618d(c6021p).f43261p0, null), null, 0L, AbstractC8411c.m8969c(1734673041, c6021p, new C1268j(c8870f, abstractActivityC17375g, c8838b, interfaceC3759g, 11)), false, AbstractC8411c.m8969c(-2076215828, c6021p, new C8864z(c8838b, interfaceC3759g, 1)), c6021p, 199680, 22);
                if (c8838b.f27034i) {
                    C20263a0 c20263a0 = c8838b.f27031f;
                    if (c20263a0 != null) {
                        C21936L0 c21936l0 = new C21936L0(AbstractC11372a0.m12782a(c20263a0));
                        if (!c20263a0.f64087d.contains(EnumC21219I.REPORTABLE)) {
                            c21936l0 = null;
                        }
                        if (c21936l0 != null) {
                            str = c21936l0.f69488a;
                        } else {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                    String str2 = c8838b.f27032g;
                    C21966U1 c21966u1 = str2 != null ? new C21966U1(str2) : null;
                    if (!c8838b.f27033h) {
                        c21966u1 = null;
                    }
                    C19575q c19575q = new C19575q(str, (String) null, c21966u1 != null ? c21966u1.f69541a : null, 2);
                    c6021p.m6524S(776101424);
                    boolean zM6542f4 = c6021p.m6542f(interfaceC3759g);
                    Object objM6514H6 = c6021p.m6514H();
                    if (zM6542f4 || objM6514H6 == obj) {
                        objM6514H6 = new C8846h(interfaceC3759g, 2);
                        c6021p.m6537c0(objM6514H6);
                    }
                    c6021p.m6553p(false);
                    AbstractC8086f4.m8515b(c19575q, (InterfaceC1426a) objM6514H6, null, c6021p, 0, 4);
                }
                c6021p.m6553p(false);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q2, i10, 24);
        }
    }
}
