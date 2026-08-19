package p571X9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.p650ui.input.nestedscroll.AbstractC10866a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.notification.NotificationTaskViewModel;
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
import p039Bc.C0885s;
import p098Di.InterfaceC2062k;
import p1155zi.C22072w1;
import p229J0.AbstractC3917G4;
import p229J0.C4055g1;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p455Sf.C7128m;
import p455Sf.C7129n;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p999s.C19301J0;

/* JADX INFO: renamed from: X9.B3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9106B3 {
    /* JADX INFO: renamed from: a */
    public static final void m9635a(InterfaceC10459q interfaceC10459q, NotificationTaskViewModel notificationTaskViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        NotificationTaskViewModel notificationTaskViewModel2;
        c6021p.m6526U(-1321663993);
        int i11 = i10 | 6;
        if ((i10 & 48) == 0) {
            i11 = i10 | 22;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            notificationTaskViewModel2 = notificationTaskViewModel;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C7129n.class));
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
                Object objMo5693b = c16527d.mo5693b(NotificationTaskViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C7129n.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C7129n.class), c16527d.mo5693b(NotificationTaskViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(NotificationTaskViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                interfaceC10459q2 = c10456n;
                notificationTaskViewModel2 = (NotificationTaskViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                notificationTaskViewModel2 = notificationTaskViewModel;
            }
            c6021p.m6554q();
            C22072w1 c22072w1 = ((C7129n) AbstractC9112C3.m9642d(notificationTaskViewModel2.f40343c, c6021p).getValue()).f22685a;
            if (c22072w1 == null) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C7128m(interfaceC10459q2, notificationTaskViewModel2, i10, 0);
                    return;
                }
                return;
            }
            AbstractC8662k3.m9350a(AbstractC10866a.m11313a(interfaceC10459q2, (C4055g1) AbstractC3917G4.m4618d(c6021p).f43261p0, null), null, 0L, AbstractC8411c.m8969c(1144748414, c6021p, new C0349j(c22072w1, 26, (C8870f) c6021p.m6548k(AbstractC8873i.f27157a))), false, AbstractC8411c.m8969c(76607299, c6021p, new C0885s(c22072w1, 15, notificationTaskViewModel2)), c6021p, 199680, 22);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C7128m(interfaceC10459q2, notificationTaskViewModel2, i10, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m9636b(Context context, int i10) {
        return C19301J0.m20377d().m20384f(context, i10);
    }
}
