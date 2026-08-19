package p544W9;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p650ui.input.nestedscroll.AbstractC10866a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.settings.impl.anonymous.AnonymousSettingsViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import fo.C13711h;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p003A1.C0257i0;
import p003A1.C0292u;
import p025An.C0644w;
import p042Bf.C1281w;
import p098Di.InterfaceC2062k;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3917G4;
import p229J0.C4055g1;
import p244Jg.C4338b;
import p244Jg.C4340d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p637a3.InterfaceC10497n;
import p776h3.C14399m;
import p776h3.C14400n;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: W9.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8497J {
    /* JADX INFO: renamed from: a */
    public static final void m9159a(InterfaceC10459q interfaceC10459q, AnonymousSettingsViewModel anonymousSettingsViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        AnonymousSettingsViewModel anonymousSettingsViewModel2;
        AnonymousSettingsViewModel anonymousSettingsViewModel3;
        c6021p.m6526U(-1575296462);
        int i11 = i10 | 6;
        if ((i10 & 48) == 0) {
            i11 = i10 | 22;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            anonymousSettingsViewModel3 = anonymousSettingsViewModel;
        } else {
            c6021p.m6519N();
            int i12 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i12 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C4340d.class));
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
                Object objMo5693b = c16527d.mo5693b(AnonymousSettingsViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C4340d.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C4340d.class), c16527d.mo5693b(AnonymousSettingsViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    Object objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AnonymousSettingsViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM14398a);
                    objM6514H = objM14398a;
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                interfaceC10459q2 = c10456n;
                anonymousSettingsViewModel2 = (AnonymousSettingsViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                anonymousSettingsViewModel2 = anonymousSettingsViewModel;
            }
            c6021p.m6554q();
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            Context context2 = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            C13711h c13711hM4618d = AbstractC3917G4.m4618d(c6021p);
            C4340d c4340d = (C4340d) AbstractC9112C3.m9642d(anonymousSettingsViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(1882741641);
            boolean zM6542f2 = c6021p.m6542f(anonymousSettingsViewModel2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                Object c0292u = new C0292u(1, anonymousSettingsViewModel2, AnonymousSettingsViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 9);
                c6021p.m6537c0(c0292u);
                objM6514H2 = c0292u;
            }
            c6021p.m6553p(false);
            AbstractC8662k3.m9350a(AbstractC10866a.m11313a(interfaceC10459q2, (C4055g1) c13711hM4618d.f43261p0, null), null, 0L, AbstractC8411c.m8969c(-1929413271, c6021p, new C4338b(c13711hM4618d, c8870f, 0)), false, AbstractC8411c.m8969c(33355374, c6021p, new C1281w(c4340d, (InterfaceC3759g) objM6514H2, context2, 2)), c6021p, 199680, 22);
            anonymousSettingsViewModel3 = anonymousSettingsViewModel2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(interfaceC10459q2, anonymousSettingsViewModel3, i10, 21);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final float m9160b(List list, Resources resources) {
        float dimension = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dimension += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return dimension;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10497n m9161c(InterfaceC10497n interfaceC10497n, float f10) {
        return interfaceC10497n.mo10952b(new C14400n(m9162d(f10), m9162d(0), m9162d(0), m9162d(0)));
    }

    /* JADX INFO: renamed from: d */
    public static final C14399m m9162d(float f10) {
        return new C14399m(2, f10);
    }
}
