package p544W9;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.onboarding.viewmodel.CollectEmailViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import gf.C14127l;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import ng.C17613d;
import p003A1.AbstractC0233b1;
import p003A1.C0178J0;
import p025An.C0644w;
import p092Dc.C2000q;
import p098Di.InterfaceC2062k;
import p248Jk.InterfaceC4478i;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8106i0;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p547Wc.C8805o;
import p571X9.AbstractC9112C3;
import p876lm.InterfaceC17068a;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: W9.B2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8452B2 {
    /* JADX INFO: renamed from: a */
    public static final void m9062a(CollectEmailViewModel collectEmailViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        CollectEmailViewModel collectEmailViewModel2;
        c6021p.m6526U(-594654281);
        if ((((i10 & 6) == 0 ? i10 | 2 : i10) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            collectEmailViewModel2 = collectEmailViewModel;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C17613d.class));
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
                Object objMo5693b = c16527d.mo5693b(CollectEmailViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C17613d.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C17613d.class), c16527d.mo5693b(CollectEmailViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(CollectEmailViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                collectEmailViewModel2 = (CollectEmailViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                collectEmailViewModel2 = collectEmailViewModel;
            }
            c6021p.m6554q();
            InterfaceC5985X interfaceC5985XM9642d = AbstractC9112C3.m9642d(collectEmailViewModel2.f40343c, c6021p);
            AbstractC8106i0.m8586a(null, AbstractC8142m4.m8676d(R.string.onboarding_collect_email_screen_title, c6021p), null, null, null, null, AbstractC8126k4.m8631b(R.drawable.arrow_left, c6021p, 0), AbstractC8411c.m8969c(-1923199477, c6021p, new C8805o(collectEmailViewModel2, 12, interfaceC5985XM9642d)), AbstractC8411c.m8969c(1121587994, c6021p, new C14127l(collectEmailViewModel2, 2, interfaceC5985XM9642d)), c6021p, 113246208, 61);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(collectEmailViewModel2, i10, 20);
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC4478i m9063b(InterfaceC17068a interfaceC17068a) {
        interfaceC17068a.getClass();
        return interfaceC17068a instanceof InterfaceC4478i ? (InterfaceC4478i) interfaceC17068a : new C2000q(interfaceC17068a, 3);
    }
}
