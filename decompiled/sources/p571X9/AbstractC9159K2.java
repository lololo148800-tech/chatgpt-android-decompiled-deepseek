package p571X9;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.settings.impl.memory.MemorySettingsViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import p003A1.AbstractC0233b1;
import p003A1.C0292u;
import p025An.C0644w;
import p039Bc.C0885s;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p225Im.InterfaceC3759g;
import p243Jf.C4334d;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p382Pf.C6401d;
import p406Qg.C6722r;
import p406Qg.C6725u;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: X9.K2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9159K2 {
    /* JADX INFO: renamed from: a */
    public static final void m9707a(InterfaceC10459q interfaceC10459q, MemorySettingsViewModel memorySettingsViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        MemorySettingsViewModel memorySettingsViewModel2;
        c6021p.m6526U(513812978);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            memorySettingsViewModel2 = memorySettingsViewModel;
        } else {
            c6021p.m6519N();
            int i13 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i13 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C6725u.class));
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
                Object objMo5693b = c16527d.mo5693b(MemorySettingsViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C6725u.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C6725u.class), c16527d.mo5693b(MemorySettingsViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    Object objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MemorySettingsViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM14398a);
                    objM6514H = objM14398a;
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                memorySettingsViewModel2 = (MemorySettingsViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i11 = i12 & (-113);
                interfaceC10459q2 = interfaceC10459q;
                memorySettingsViewModel2 = memorySettingsViewModel;
            }
            c6021p.m6554q();
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(1128907948);
            boolean zM6542f2 = c6021p.m6542f(memorySettingsViewModel2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C6722r(memorySettingsViewModel2, null);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, c17296c);
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            C6725u c6725u = (C6725u) AbstractC9112C3.m9642d(memorySettingsViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(1128914027);
            boolean zM6542f3 = c6021p.m6542f(memorySettingsViewModel2);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f3 || objM6514H3 == obj) {
                objM6514H3 = new C0292u(1, memorySettingsViewModel2, MemorySettingsViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 23);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            int i14 = (i11 & 14) | 199680;
            AbstractC8662k3.m9350a(interfaceC10459q2, null, 0L, AbstractC8411c.m8969c(-85811287, c6021p, new C4334d(c8870f, 10)), false, AbstractC8411c.m8969c(-72239058, c6021p, new C0885s((InterfaceC3759g) objM6514H3, 12, c6725u)), c6021p, i14, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(interfaceC10459q2, memorySettingsViewModel2, i10, 1);
        }
    }
}
