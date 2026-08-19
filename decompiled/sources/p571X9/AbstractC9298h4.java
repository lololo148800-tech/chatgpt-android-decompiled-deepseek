package p571X9;

import android.content.Context;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.AbstractC10839g;
import androidx.compose.p650ui.input.nestedscroll.AbstractC10866a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.settings.impl.settings.SettingsViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import fo.C13711h;
import gd.C13867K;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p003A1.C0292u;
import p025An.C0644w;
import p042Bf.C1281w;
import p042Bf.C1282x;
import p049Bm.InterfaceC1426a;
import p098Di.InterfaceC2062k;
import p1155zi.EnumC21895B;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3917G4;
import p229J0.C4055g1;
import p244Jg.C4338b;
import p349O0.AbstractC6012k0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p363Og.C6209m;
import p482Tg.C7439X;
import p482Tg.C7449f;
import p523V9.AbstractC8160o6;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p773h0.InterfaceC14267W;
import p909nm.AbstractC17680n;
import p919o8.C18010t;

/* JADX INFO: renamed from: X9.h4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9298h4 {
    /* JADX INFO: renamed from: a */
    public static final void m9876a(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        c6021p.m6526U(-731287978);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            AbstractC6012k0 abstractC6012k0 = AbstractC8873i.f27157a;
            C8870f c8870f = (C8870f) c6021p.m6548k(abstractC6012k0);
            boolean z6 = AbstractC8160o6.m8729d(C13867K.f43905c, c6021p) && ((C8870f) c6021p.m6548k(abstractC6012k0)).f27148a != EnumC21895B.f69419Z;
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C7439X.class));
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
            Object objMo5693b = c16527d.mo5693b(SettingsViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C7439X.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C7439X.class), c16527d.mo5693b(SettingsViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SettingsViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            SettingsViewModel settingsViewModel = (SettingsViewModel) baseViewModel;
            C13711h c13711hM4618d = AbstractC3917G4.m4618d(c6021p);
            C7439X c7439x = (C7439X) AbstractC9112C3.m9642d(settingsViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(1728533939);
            boolean zM6542f2 = c6021p.m6542f(settingsViewModel);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C0292u(1, settingsViewModel, SettingsViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 27);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H2;
            c6021p.m6553p(false);
            InterfaceC14267W interfaceC14267W = (InterfaceC14267W) c6021p.m6548k(AbstractC10839g.f32446a);
            c6021p.m6524S(1728543143);
            boolean zM6542f3 = c6021p.m6542f(interfaceC3759g);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f3 || objM6514H3 == obj) {
                objM6514H3 = new C6209m(interfaceC3759g, 15);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC8662k3.m9350a(AbstractC10866a.m11313a(interfaceC10459q2, (C4055g1) c13711hM4618d.f43261p0, null), null, 0L, AbstractC8411c.m8969c(-1198479987, c6021p, new C4338b(c13711hM4618d, c8870f, 2)), false, AbstractC8411c.m8969c(1590391442, c6021p, new C1281w(c7439x, AbstractC10833a.m11210e(interfaceC10459q2, null, interfaceC14267W, z6, (InterfaceC1426a) objM6514H3, C7449f.f23575Z, 184), interfaceC3759g, 8)), c6021p, 199680, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q2, i10, 14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C18010t m9877b(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("viewport");
            return new C18010t(abstractC3673pM4395w != null ? AbstractC9358r4.m9947a(abstractC3673pM4395w.m4390m()) : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Display", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Display", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Display", e12);
        }
    }
}
