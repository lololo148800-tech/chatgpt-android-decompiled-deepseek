package p193Hf;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p042Bf.C1268j;
import p045Bj.C1307e;
import p049Bm.InterfaceC1436k;
import p086D6.C1970n;
import p094De.C2025h;
import p098Di.InterfaceC2062k;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2184i;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1155zi.C22011h0;
import p124Ei.C2524l;
import p168Gd.C3034b;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8128k6;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9112C3;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import ye.C21514c;
import ye.C21522k;

/* JADX INFO: renamed from: Hf.M */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3319M {

    /* JADX INFO: renamed from: a */
    public static final float f10122a;

    static {
        float f10 = AbstractC7313q.f23196a;
        f10122a = AbstractC7313q.f23201f;
    }

    /* JADX INFO: renamed from: a */
    public static final void m4165a(String str, String messageId, C3034b c3034b, boolean z6, String str2, boolean z10, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        boolean z11;
        Object objM14398a;
        boolean z12;
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-447328164);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(messageId) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? c6021p.m6542f(c3034b) : c6021p.m6545h(c3034b) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(str2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6544g(z10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if ((i12 & 4793491) == 4793490 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C3420z0.class));
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
            Object objMo5693b = c16527d.mo5693b(CanmoreViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C3420z0.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                z11 = true;
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C3420z0.class), c16527d.mo5693b(CanmoreViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(CanmoreViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM14398a);
            } else {
                objM14398a = objM6514H;
                z11 = true;
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM14398a;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            CanmoreViewModel canmoreViewModel = (CanmoreViewModel) baseViewModel;
            Object obj2 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            String str3 = c3034b != null ? c3034b.f9128a : null;
            c6021p.m6524S(282218394);
            boolean zM6542f2 = c6021p.m6542f(str3 != null ? new C21514c(str3) : null);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                if (str3 != null) {
                    C3414w1 c3414w1 = ((CanmoreViewModelImpl) canmoreViewModel).f38869m;
                    c3414w1.getClass();
                    objM6514H2 = new C1970n(new C1970n(new C2025h(AbstractC2124C.m3210i(new C3396q1(c3414w1, str3, null)), 5), 9, str3), 8, c3414w1);
                    z12 = false;
                } else {
                    z12 = false;
                    objM6514H2 = new C2025h(new C21522k[0], 2);
                }
                c6021p.m6537c0(objM6514H2);
            } else {
                z12 = false;
            }
            c6021p.m6553p(z12);
            C21522k c21522k = (C21522k) AbstractC9112C3.m9640b((InterfaceC2184i) objM6514H2, null, c6021p, 48).getValue();
            c6021p.m6524S(282224034);
            boolean zM6542f3 = c6021p.m6542f(str3 != null ? new C21514c(str3) : null) | ((i12 & 3670016) == 1048576 ? z11 : z12) | ((i12 & 112) == 32 ? z11 : z12) | c6021p.m6545h(obj2);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f3 || objM6514H3 == obj) {
                Object c1307e = new C1307e(str3, onIntent, messageId, obj2, 6);
                c6021p.m6537c0(c1307e);
                objM6514H3 = c1307e;
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H3;
            c6021p.m6553p(z12);
            AbstractC8128k6.m8635a(interfaceC1436k, c21522k != null ? true : z12, AbstractC8411c.m8969c(671883533, c6021p, new C3313J(str2, z10, c21522k, 0)), AbstractC8411c.m8969c(1843092204, c6021p, new C3315K(onIntent, z6, 0)), interfaceC10459q, AbstractC8411c.m8969c(-109457750, c6021p, new C1268j(c21522k, str, messageId, onIntent, 6)), c6021p, ((i12 >> 9) & 57344) | 200064);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2524l(str, messageId, c3034b, z6, str2, z10, onIntent, interfaceC10459q, i10);
        }
    }
}
