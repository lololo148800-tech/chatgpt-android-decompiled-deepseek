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
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import fo.C13711h;
import java.util.List;
import java.util.NoSuchElementException;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p001A.AbstractC0010F;
import p003A1.AbstractC0233b1;
import p003A1.C0292u;
import p025An.C0644w;
import p098Di.InterfaceC2062k;
import p124Ei.C2497c;
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
import p482Tg.C7444b;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p919o8.AbstractC17962d;
import p919o8.C18007s;

/* JADX INFO: renamed from: X9.g4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9292g4 {
    /* JADX INFO: renamed from: a */
    public static final void m9868a(String str, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(1346259151);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (((i11 | 48) & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
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
            boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
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
            c6021p.m6524S(-191728717);
            boolean zM6542f2 = c6021p.m6542f(settingsViewModel);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C0292u(1, settingsViewModel, SettingsViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 26);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11313a = AbstractC10866a.m11313a(c10456n, (C4055g1) c13711hM4618d.f43261p0, null);
            C8410b c8410bM8969c = AbstractC8411c.m8969c(-1076841928, c6021p, new C4338b(c13711hM4618d, c8870f, 1));
            C8410b c8410bM8969c2 = AbstractC8411c.m8969c(344525587, c6021p, new C2497c((InterfaceC3759g) objM6514H2, c7439x, c8870f, str, 2));
            interfaceC10459q2 = c10456n;
            AbstractC8662k3.m9350a(interfaceC10459qM11313a, null, 0L, c8410bM8969c, false, c8410bM8969c2, c6021p, 199680, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C7444b(str, interfaceC10459q2, i10, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C18007s m9869b(C3676s c3676s) {
        try {
            String strMo4384r = c3676s.m4395w("type").mo4384r();
            AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(\"type\").asString");
            for (int i10 : AbstractC0010F.m27k(7)) {
                if (AbstractC17962d.m19664y(i10).equals(strMo4384r)) {
                    AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(DiagnosticsEntry.NAME_KEY);
                    String strMo4384r2 = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("model");
                    String strMo4384r3 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("brand");
                    String strMo4384r4 = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
                    AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("architecture");
                    return new C18007s(i10, strMo4384r2, strMo4384r3, strMo4384r4, abstractC3673pM4395w4 != null ? abstractC3673pM4395w4.mo4384r() : null);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Device", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Device", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Device", e12);
        }
    }
}
