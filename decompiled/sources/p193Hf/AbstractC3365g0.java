package p193Hf;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.layout.AbstractC10868a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import gd.C13900V0;
import gd.C13923c0;
import java.util.List;
import java.util.Locale;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0248f0;
import p003A1.C0254h0;
import p021Aj.C0523h;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1010sf.AbstractC19536b;
import p103Dn.C2153Q0;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1155zi.C22011h0;
import p168Gd.C3034b;
import p349O0.AbstractC6012k0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8144m6;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8467E;
import p571X9.AbstractC9156K;
import p571X9.AbstractC9233X;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p882m1.AbstractC17140a;
import p909nm.AbstractC17680n;
import ye.C21525n;

/* JADX INFO: renamed from: Hf.g0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3365g0 {

    /* JADX INFO: renamed from: a */
    public static final long f10274a;

    /* JADX INFO: renamed from: b */
    public static final long f10275b;

    static {
        int i10 = C14365u.f45061k;
        f10274a = C14365u.f45055e;
        f10275b = AbstractC14334L.m15626d(4281282351L);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x025b  */
    /* JADX WARN: Code duplicated, block: B:175:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m4181a(String str, String messageId, C3034b c3034b, boolean z6, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        boolean z10;
        boolean zEquals;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-1044728281);
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
            i11 |= c6021p.m6545h(onIntent) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 131072 : 65536;
        }
        if ((74899 & i11) != 74898 || !c6021p.m6562y()) {
            C10456n c10456n = C10456n.f30959Y;
            if (!AbstractC8160o6.m8729d(C13923c0.f43973c, c6021p)) {
                C6018n0 c6018n0M6555r2 = c6021p.m6555r();
                if (c6018n0M6555r2 != null) {
                    c6018n0M6555r2.f19536d = new C3359e0(str, messageId, c3034b, z6, onIntent, interfaceC10459q, i10, 0);
                    return;
                }
                return;
            }
            c6021p.m6524S(-1020152108);
            AbstractC6012k0 abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
            Context context = (Context) c6021p.m6548k(abstractC6012k0);
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
                z10 = true;
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C3420z0.class), c16527d.mo5693b(CanmoreViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(CanmoreViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            } else {
                z10 = true;
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            CanmoreViewModel canmoreViewModel = (CanmoreViewModel) baseViewModel;
            Object obj2 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            Locale localeM8334g = AbstractC8012V5.m8334g((Context) c6021p.m6548k(abstractC6012k0));
            c6021p.m6524S(-1332954244);
            int i12 = i11 & 896;
            boolean z11 = (i12 == 256 || ((i11 & 512) != 0 && c6021p.m6545h(c3034b))) ? z10 : false;
            Object objM6514H2 = c6021p.m6514H();
            if (z11 || objM6514H2 == obj) {
                objM6514H2 = new C0254h0(c3034b, 22);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C2153Q0 c2153q0 = canmoreViewModel.f40343c;
            InterfaceC5985X interfaceC5985XM9805a = AbstractC9233X.m9805a(c2153q0, (InterfaceC1436k) objM6514H2, c6021p, 0);
            InterfaceC5985X interfaceC5985XM9805a2 = AbstractC9233X.m9805a(c2153q0, C3317L.f10110r0, c6021p, 48);
            InterfaceC5985X interfaceC5985XM9805a3 = AbstractC9233X.m9805a(c2153q0, C3317L.f10109q0, c6021p, 48);
            String str2 = c3034b != null ? c3034b.f9129b : null;
            c6021p.m6524S(-1332945465);
            boolean zM6542f2 = (i12 == 256 || ((i11 & 512) != 0 && c6021p.m6545h(c3034b))) | c6021p.m6542f(canmoreViewModel);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == obj) {
                objM6514H3 = new C3362f0(c3034b, canmoreViewModel, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, str2);
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(AbstractC10844c.m11244d(c10456n, 1.0f), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23201f, 7);
            C21525n c21525n = (C21525n) interfaceC5985XM9805a3.getValue();
            String str3 = c21525n != null ? c21525n.f68168a : null;
            if (str3 == null ? false : str3.equals(messageId)) {
                C21525n c21525n2 = (C21525n) interfaceC5985XM9805a3.getValue();
                String str4 = c21525n2 != null ? c21525n2.f68169b : null;
                String str5 = c3034b != null ? c3034b.f9128a : null;
                if (str4 == null) {
                    if (str5 == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                } else if (str5 == null) {
                    zEquals = false;
                } else {
                    zEquals = str4.equals(str5);
                }
                if (zEquals) {
                    c6021p.m6524S(-1332899495);
                    boolean zM8729d = AbstractC8160o6.m8729d(C13900V0.f43949c, c6021p);
                    c6021p.m6553p(false);
                    if (zM8729d) {
                        c6021p.m6524S(1629854306);
                        AbstractC3319M.m4165a(str, messageId, c3034b, z6, (String) interfaceC5985XM9805a.getValue(), ((Boolean) interfaceC5985XM9805a2.getValue()).booleanValue(), onIntent, interfaceC10459qM11237o, c6021p, (i11 & 8190) | ((i11 << 6) & 3670016));
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(1630205970);
                        AbstractC8144m6.m8680a(messageId, c3034b, z6, (String) interfaceC5985XM9805a.getValue(), ((Boolean) interfaceC5985XM9805a2.getValue()).booleanValue(), onIntent, interfaceC10459qM11237o, c6021p, ((i11 >> 3) & 1022) | ((i11 << 3) & 458752));
                        c6021p.m6553p(false);
                    }
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C3359e0(str, messageId, c3034b, z6, onIntent, interfaceC10459q, i10, 1);
                }
            }
            c6021p.m6524S(1628720853);
            c6021p.m6524S(-1332933245);
            Object objM6514H4 = c6021p.m6514H();
            if (objM6514H4 == obj) {
                objM6514H4 = C5997d.m6430Q(null, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H4);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H4;
            c6021p.m6553p(false);
            boolean zBooleanValue2 = ((Boolean) interfaceC5985XM9805a2.getValue()).booleanValue();
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.file_document, c6021p, 0);
            String str6 = (String) interfaceC5985XM9805a.getValue();
            String strM9706b = str6 != null ? AbstractC9156K.m9706b(str6, localeM8334g) : null;
            c6021p.m6524S(-1332914233);
            if (strM9706b == null) {
                strM9706b = AbstractC8142m4.m8676d(R.string.tap_to_view, c6021p);
            }
            String str7 = strM9706b;
            c6021p.m6553p(false);
            c6021p.m6524S(-1332910074);
            boolean zM6545h = (i12 == 256 || ((i11 & 512) != 0 && c6021p.m6545h(c3034b))) | ((57344 & i11) == 16384) | ((i11 & 112) == 32) | c6021p.m6545h(obj2);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6545h || objM6514H5 == obj) {
                Object c0523h = new C0523h(c3034b, onIntent, messageId, obj2, interfaceC5985X, 3);
                c6021p.m6537c0(c0523h);
                objM6514H5 = c0523h;
            }
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H5;
            Object objM530s = AbstractC0168G.m530s(-1332901220, c6021p, false);
            if (objM530s == obj) {
                objM530s = new C0248f0(interfaceC5985X, 15);
                c6021p.m6537c0(objM530s);
            }
            c6021p.m6553p(false);
            AbstractC19536b.m20624a(zBooleanValue2, abstractC17140aM8631b, str7, null, interfaceC1426a, AbstractC10868a.m11318d(interfaceC10459q, (InterfaceC1436k) objM530s), 0L, 0L, c6021p, 3072, 192);
            c6021p.m6553p(false);
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C3359e0(str, messageId, c3034b, z6, onIntent, interfaceC10459q, i10, 1);
            }
        }
        c6021p.m6517L();
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3359e0(str, messageId, c3034b, z6, onIntent, interfaceC10459q, i10, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final long m4182b(C6021p c6021p) {
        c6021p.m6524S(-275488506);
        long j10 = AbstractC8467E.m9097b(c6021p) ? f10275b : f10274a;
        c6021p.m6553p(false);
        return j10;
    }
}
