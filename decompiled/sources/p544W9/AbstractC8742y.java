package p544W9;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p650ui.viewinterop.AbstractC10869a;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.feature.voice.impl.VoiceModeViewModelImpl;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import com.openai.voice.VoiceModeViewModel;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p000.C17363n;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2062k;
import p124Ei.C2532n1;
import p153Fn.C2925c;
import p221Ii.C3722a;
import p221Ii.C3726e;
import p221Ii.C3734m;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p588Y2.C9597A;
import p620Zc.C10279d;
import p635a1.InterfaceC10459q;
import p772h.C14215F;
import p772h.DialogC14229k;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: W9.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8742y {
    /* JADX INFO: renamed from: a */
    public static final void m9484a(InterfaceC10459q interfaceC10459q, long j10, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        boolean z6;
        c6021p.m6526U(508077359);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6540e(j10) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6519N();
            if ((i10 & 1) != 0 && !c6021p.m6561x()) {
                c6021p.m6517L();
            }
            c6021p.m6554q();
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            C2925c c2925c = ((C6035w) objM6514H).f19668Y;
            float fM9502c = AbstractC8748z.m9502c(c6021p);
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C2532n1.class));
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
            Object objMo5693b = c16527d.mo5693b(VoiceModeViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C2532n1.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                z6 = true;
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C2532n1.class), c16527d.mo5693b(VoiceModeViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceModeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            } else {
                z6 = true;
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            VoiceModeViewModel voiceModeViewModel = (VoiceModeViewModel) baseViewModel;
            c6021p.m6524S(-1824123821);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == obj) {
                VoiceModeViewModelImpl voiceModeViewModelImpl = (VoiceModeViewModelImpl) voiceModeViewModel;
                objM6514H3 = new C3734m(voiceModeViewModel.f40343c, c2925c, fM9502c, C10279d.f30528a, new C3722a(j10, j10, j10, j10), voiceModeViewModelImpl.f39973G, voiceModeViewModelImpl.f39972F);
                c6021p.m6537c0(objM6514H3);
            }
            C3734m c3734m = (C3734m) objM6514H3;
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11226d = AbstractC10842a.m11226d(interfaceC10459q, 2.0f);
            c6021p.m6524S(-1824108438);
            boolean zM6545h = c6021p.m6545h(c3734m) | (((((i12 & 112) ^ 48) <= 32 || !c6021p.m6540e(j10)) && (i12 & 48) != 32) ? false : z6);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6545h || objM6514H4 == obj) {
                objM6514H4 = new C3726e(j10, c3734m);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            AbstractC10869a.m11356b((InterfaceC1436k) objM6514H4, interfaceC10459qM11226d, null, c6021p, 0, 4);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C17363n(interfaceC10459q, j10, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9485b(C14215F c14215f, DialogC14229k dialogC14229k, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(c14215f, "<this>");
        c14215f.m15516a(dialogC14229k, new C9597A(interfaceC1436k, true));
    }
}
