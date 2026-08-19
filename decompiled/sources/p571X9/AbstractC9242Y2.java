package p571X9;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.disclosure.DisclosureViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p006A4.C0349j;
import p025An.C0644w;
import p098Di.InterfaceC2062k;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p382Pf.C6401d;
import p429Re.C6869c;
import p429Re.C6873g;
import p429Re.C6877k;
import p429Re.C6878l;
import p478Tc.AbstractC7313q;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8680n3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: X9.Y2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9242Y2 {
    /* JADX INFO: renamed from: a */
    public static final void m9816a(InterfaceC10459q interfaceC10459q, DisclosureViewModel disclosureViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        DisclosureViewModel disclosureViewModel2;
        InterfaceC10459q interfaceC10459q3;
        DisclosureViewModel disclosureViewModel3;
        c6021p.m6526U(2013458510);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            disclosureViewModel3 = disclosureViewModel;
        } else {
            c6021p.m6519N();
            int i13 = 0;
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C6878l.class));
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
                Object objMo5693b = c16527d.mo5693b(DisclosureViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C6878l.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C6878l.class), c16527d.mo5693b(DisclosureViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(DisclosureViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                i13 = 0;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                disclosureViewModel2 = (DisclosureViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i11 = i12 & (-113);
                interfaceC10459q2 = interfaceC10459q;
                disclosureViewModel2 = disclosureViewModel;
            }
            c6021p.m6554q();
            AbstractC9237X3.m9812a(i13, c6021p);
            C6877k c6877k = ((C6878l) AbstractC9112C3.m9642d(disclosureViewModel2.f40343c, c6021p).getValue()).f22062b;
            int i14 = (i11 & 14) | 906166272;
            AbstractC8680n3.m9368a(interfaceC10459q2, 0L, null, AbstractC7313q.f23199d, null, true, null, null, AbstractC8411c.m8969c(-724789959, c6021p, new C6873g(c6877k, 1)), AbstractC8411c.m8969c(-555646184, c6021p, new C0349j(c6877k, 25, disclosureViewModel2)), AbstractC8411c.m8969c(-1807532902, c6021p, new C6869c(c6877k, 4)), c6021p, i14, 6, 214);
            interfaceC10459q3 = interfaceC10459q2;
            disclosureViewModel3 = disclosureViewModel2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(interfaceC10459q3, disclosureViewModel3, i10, 2);
        }
    }
}
