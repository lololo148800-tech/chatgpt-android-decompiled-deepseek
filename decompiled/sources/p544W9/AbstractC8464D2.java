package p544W9;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.onboarding.impl.viewmodel.FinishAccountViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import gf.C14127l;
import java.util.List;
import kg.C16404j;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p003A1.C0178J0;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p098Di.InterfaceC2062k;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p523V9.AbstractC8106i0;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p547Wc.C8805o;
import p547Wc.C8816z;
import p571X9.AbstractC9112C3;
import p789hg.C14505d;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: W9.D2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8464D2 {
    /* JADX INFO: renamed from: a */
    public static final void m9086a(FinishAccountViewModel finishAccountViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        FinishAccountViewModel finishAccountViewModel2;
        c6021p.m6526U(-879143953);
        if ((((i10 & 6) == 0 ? i10 | 2 : i10) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            finishAccountViewModel2 = finishAccountViewModel;
        } else {
            c6021p.m6519N();
            int i11 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i11 == 0 || c6021p.m6561x()) {
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C16404j.class));
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
                Object objMo5693b = c16527d.mo5693b(FinishAccountViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C16404j.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C16404j.class), c16527d.mo5693b(FinishAccountViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(FinishAccountViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                finishAccountViewModel2 = (FinishAccountViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                finishAccountViewModel2 = finishAccountViewModel;
            }
            c6021p.m6554q();
            Object obj2 = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            C16404j c16404j = (C16404j) AbstractC9112C3.m9642d(finishAccountViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(481146958);
            boolean zM6542f2 = c6021p.m6542f(finishAccountViewModel2) | c6021p.m6545h(obj2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C8816z(finishAccountViewModel2, 28, obj2);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(481148419);
            boolean zM6542f3 = c6021p.m6542f(interfaceC1426a);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f3 || objM6514H3 == obj) {
                objM6514H3 = new C14505d(0, interfaceC1426a);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC8577W2.m9239a(0, 1, (InterfaceC1426a) objM6514H3, c6021p, false);
            AbstractC8106i0.m8586a(null, AbstractC8142m4.m8676d(R.string.onboarding_finish_account_subtitle, c6021p), null, null, null, interfaceC1426a, AbstractC8126k4.m8631b(R.drawable.close_lg, c6021p, 0), AbstractC8411c.m8969c(-1445445349, c6021p, new C8805o(c16404j, 13, finishAccountViewModel2)), AbstractC8411c.m8969c(403778988, c6021p, new C14127l(c16404j, 3, finishAccountViewModel2)), c6021p, 113246208, 29);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(finishAccountViewModel2, i10, 21);
        }
    }
}
