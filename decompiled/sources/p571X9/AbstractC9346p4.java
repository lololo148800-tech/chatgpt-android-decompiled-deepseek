package p571X9;

import android.content.Context;
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
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p042Bf.C1282x;
import p098Di.InterfaceC2062k;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3917G4;
import p229J0.C4055g1;
import p244Jg.C4338b;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p482Tg.C7439X;
import p482Tg.C7445b0;
import p482Tg.C7447d;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p919o8.C17885C;

/* JADX INFO: renamed from: X9.p4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9346p4 {
    /* JADX INFO: renamed from: a */
    public static final void m9938a(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        c6021p.m6526U(1025204986);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
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
            c6021p.m6524S(195898794);
            boolean zM6542f2 = c6021p.m6542f(settingsViewModel);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C7445b0(1, settingsViewModel, SettingsViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 0);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC8662k3.m9350a(AbstractC10866a.m11313a(interfaceC10459q2, (C4055g1) c13711hM4618d.f43261p0, null), null, 0L, AbstractC8411c.m8969c(-2059076623, c6021p, new C4338b(c13711hM4618d, c8870f, 5)), false, AbstractC8411c.m8969c(594101814, c6021p, new C7447d(c7439x, (InterfaceC3759g) objM6514H2, 9)), c6021p, 199680, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q2, i10, 19);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17885C m9939b(C3676s c3676s) {
        try {
            String testId = c3676s.m4395w("test_id").mo4384r();
            String resultId = c3676s.m4395w("result_id").mo4384r();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("injected");
            Boolean boolValueOf = abstractC3673pM4395w != null ? Boolean.valueOf(abstractC3673pM4395w.mo4380f()) : null;
            AbstractC16544l.m18093f(testId, "testId");
            AbstractC16544l.m18093f(resultId, "resultId");
            return new C17885C(testId, resultId, boolValueOf);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Synthetics", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Synthetics", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Synthetics", e12);
        }
    }
}
