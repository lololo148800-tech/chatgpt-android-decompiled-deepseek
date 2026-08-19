package p017Af;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17311n;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0184L0;
import p025An.C0644w;
import p040Bd.C0989R0;
import p040Bd.C0995S0;
import p040Bd.C1075e4;
import p049Bm.InterfaceC1426a;
import p098Di.InterfaceC2062k;
import p1051v0.AbstractC20417e;
import p1095x1.InterfaceC21057K;
import p1113xn.AbstractC21322p;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4135t3;
import p349O0.AbstractC6012k0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8142m4;
import p544W9.AbstractC8443A;
import p544W9.AbstractC8651i4;
import p571X9.AbstractC9233X;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.C17781r0;
import p926of.C18160X;

/* JADX INFO: renamed from: Af.C */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0456C {

    /* JADX INFO: renamed from: a */
    public static final float f1469a;

    /* JADX INFO: renamed from: b */
    public static final float f1470b;

    static {
        float f10 = 20;
        f1469a = f10;
        f1470b = f10 - 4;
    }

    /* JADX INFO: renamed from: a */
    public static final void m1107a(List list, List list2, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        Object objM9806b;
        c6021p.m6526U(543036064);
        int i12 = 2;
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(list2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    objM9806b = Uri.parse(((C0989R0) it.next()).f2772b).getHost();
                } catch (Throwable th2) {
                    objM9806b = AbstractC9233X.m9806b(th2);
                }
                if (objM9806b instanceof C17311n) {
                    objM9806b = null;
                }
                String str = (String) objM9806b;
                String strM21688V = str != null ? AbstractC21322p.m21688V(str, "www.") : null;
                if (strM21688V != null && !arrayList.contains(strM21688V)) {
                    arrayList.add(strM21688V);
                }
                if (arrayList.size() >= 5) {
                    break;
                }
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String strM21688V2 = AbstractC21322p.m21688V(((C1075e4) it2.next()).f2927a, "www.");
                if (!arrayList.contains(strM21688V2)) {
                    arrayList.add(strM21688V2);
                }
                if (arrayList.size() >= 5) {
                    break;
                }
            }
            float size = arrayList.size() - 1;
            float f10 = f1470b;
            float f11 = f1469a;
            InterfaceC10459q interfaceC10459qM11256p = AbstractC10844c.m11256p(interfaceC10459q, (size * f10) + f11);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11256p);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            float size2 = (arrayList.size() - 1) * f10;
            c6021p.m6524S(-1607187755);
            Iterator it3 = AbstractC17680n.m19363m0(arrayList).iterator();
            while (it3.hasNext()) {
                float f12 = i12;
                AbstractC8651i4.m9323a(0, 4, c6021p, AbstractC10842a.m11233k(AbstractC10833a.m11207b(AbstractC8079e5.m8501a(AbstractC10844c.m11252l(AbstractC10842a.m11231i(c10456n, size2, 0.0f, i12), f11 + f12), AbstractC20417e.f64539a), ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12234p, AbstractC14334L.f44973a), f12), (String) it3.next(), false);
                size2 -= f10;
                i12 = 2;
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(list, list2, interfaceC10459q, i10, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1108b(String messageId, C0995S0 reference, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(reference, "reference");
        c6021p.m6526U(-1567418370);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6542f(messageId) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(reference) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
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
            boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            MessagesViewModel messagesViewModel = (MessagesViewModel) baseViewModel;
            C10450h c10450h = C10444b.f30944w0;
            long j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12187A;
            AbstractC6012k0 abstractC6012k0 = AbstractC4141u3.f13417a;
            InterfaceC10459q interfaceC10459qM8501a = AbstractC8079e5.m8501a(AbstractC8443A.m9045a(c10456n, 1, j10, ((C4135t3) c6021p.m6548k(abstractC6012k0)).f13379c), ((C4135t3) c6021p.m6548k(abstractC6012k0)).f13379c);
            c6021p.m6524S(-785744008);
            boolean zM6545h = c6021p.m6545h(messagesViewModel) | ((i12 & 14) == 4);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == obj) {
                objM6514H2 = new C0493x(messagesViewModel, messageId, 1);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11209d = AbstractC10833a.m11209d(interfaceC10459qM8501a, false, null, (InterfaceC1426a) objM6514H2, 7);
            float f10 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(interfaceC10459qM11209d, f10);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, c10450h, c6021p, 48);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11233k);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.message_sources, c6021p), AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, AbstractC7313q.f23198c, 0.0f, 11), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12157m, c6021p, 0, 0, 65532);
            m1107a(reference.f2784d, reference.f2785e, AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, f10, 0.0f, 11), c6021p, 0);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(messageId, reference, interfaceC10459q2, i10, 4);
        }
    }
}
