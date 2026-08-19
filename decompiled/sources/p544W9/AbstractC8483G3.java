package p544W9;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import com.openai.voice.training.VoiceTrainingViewModel;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p003A1.C0178J0;
import p006A4.C0349j;
import p017Af.C0468O;
import p025An.C0644w;
import p098Di.InterfaceC2062k;
import p319Mi.C5445g;
import p319Mi.C5447i;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9112C3;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: W9.G3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8483G3 {
    /* JADX INFO: renamed from: a */
    public static final void m9131a(VoiceTrainingViewModel voiceTrainingViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        VoiceTrainingViewModel voiceTrainingViewModel2;
        VoiceTrainingViewModel voiceTrainingViewModel3;
        c6021p.m6526U(-1476669683);
        if ((((i10 & 6) == 0 ? i10 | 2 : i10) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            voiceTrainingViewModel3 = voiceTrainingViewModel;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C5447i.class));
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
                Object objMo5693b = c16527d.mo5693b(VoiceTrainingViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C5447i.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C5447i.class), c16527d.mo5693b(VoiceTrainingViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceTrainingViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                voiceTrainingViewModel2 = (VoiceTrainingViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                voiceTrainingViewModel2 = voiceTrainingViewModel;
            }
            c6021p.m6554q();
            C5447i c5447i = (C5447i) AbstractC9112C3.m9642d(voiceTrainingViewModel2.f40343c, c6021p).getValue();
            AbstractC8680n3.m9368a(null, 0L, null, 0.0f, null, false, null, null, AbstractC8411c.m8969c(-291856008, c6021p, new C5445g(c5447i, 0)), AbstractC8411c.m8969c(2060932823, c6021p, new C0349j(c5447i, 22, voiceTrainingViewModel2)), AbstractC8411c.m8969c(294003033, c6021p, new C0468O(c5447i, 14)), c6021p, 905969664, 6, 255);
            voiceTrainingViewModel3 = voiceTrainingViewModel2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(voiceTrainingViewModel3, i10, 11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9132b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: c */
    public static void m9133c(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
