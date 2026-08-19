package p017Af;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.ArrayList;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17314q;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p040Bd.C1191x0;
import p040Bd.C1197y0;
import p040Bd.C1203z0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8098h0;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p926of.C18160X;
import p926of.C18174k;

/* JADX INFO: renamed from: Af.u */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0490u {

    /* JADX INFO: renamed from: a */
    public static final float f1600a = 115;

    /* JADX INFO: renamed from: b */
    public static final C17314q f1601b = AbstractC9227W.m9800c(C0489t.f1597Z);

    /* JADX INFO: renamed from: a */
    public static final void m1124a(String messageId, C1203z0 reference, InterfaceC1436k onIntent, InterfaceC1439n trackClick, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(reference, "reference");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        AbstractC16544l.m18094g(trackClick, "trackClick");
        c6021p.m6526U(-376342083);
        int i11 = (i10 & 6) == 0 ? (c6021p.m6542f(messageId) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(reference) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(trackClick) ? 2048 : 1024;
        }
        if (((i11 | 24576) & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            List list = reference.f3165c;
            if (list.isEmpty()) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C0486q(messageId, reference, onIntent, trackClick, c10456n, i10, 0);
                    return;
                }
                return;
            }
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list2 = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
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
            Object objMo5693b = c16527d.mo5693b(MessagesViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C18160X.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a, list2);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
            int i12 = 0;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            InterfaceC5985X interfaceC5985XM9805a = AbstractC9233X.m9805a(((MessagesViewModel) baseViewModel).f40343c, C0481l.f1562p0, c6021p, 48);
            List<C1197y0> list3 = list;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list3, 10));
            for (C1197y0 c1197y0 : list3) {
                String value = c1197y0.f3155d;
                AbstractC16544l.m18094g(value, "value");
                C1191x0 c1191x0 = c1197y0.f3156e;
                arrayList.add(new C18174k(null, messageId, value, null, c1191x0 != null ? c1191x0.f3143a : i12, c1191x0 != null ? c1191x0.f3144b : i12, null, 448));
                i12 = i12;
            }
            AbstractC8098h0.m8569a(AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, 0.0f, AbstractC7313q.f23199d, 7), 0.0f, 0.0f, AbstractC8411c.m8969c(1704752527, c6021p, new C0488s(arrayList, trackClick, reference, messageId, interfaceC5985XM9805a, onIntent, 0)), c6021p, 3072, 6);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C0486q(messageId, reference, onIntent, trackClick, interfaceC10459q2, i10, 1);
        }
    }
}
