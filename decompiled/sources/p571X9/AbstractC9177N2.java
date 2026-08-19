package p571X9;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.settings.impl.memory.ViewMemoryScreenKt$ViewMemoryScreen$$inlined$injectViewModel$1;
import com.openai.feature.settings.impl.memory.ViewMemoryViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p002A0.C0148y;
import p003A1.AbstractC0233b1;
import p003A1.C0184L0;
import p003A1.C0227a;
import p003A1.C0292u;
import p017Af.C0459F;
import p025An.C0644w;
import p042Bf.C1282x;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4048f0;
import p229J0.C3949M0;
import p349O0.AbstractC6012k0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p362Of.C6194i;
import p363Og.C6207k;
import p406Qg.C6700K;
import p406Qg.C6701L;
import p406Qg.C6703N;
import p406Qg.C6704O;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p594Y9.AbstractC9721E3;
import p594Y9.AbstractC9751J3;
import p594Y9.AbstractC9821V2;
import p594Y9.AbstractC9834X3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p894n0.C17401g;
import p894n0.InterfaceC17406l;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17792x;
import p911o0.C17767k0;

/* JADX INFO: renamed from: X9.N2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9177N2 {
    /* JADX INFO: renamed from: a */
    public static final void m9731a(C6704O state, InterfaceC1436k onIntent, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        int i12 = 5;
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-1191827135);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c6021p.m6542f(state) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 32 : 16;
        }
        int i13 = i11 | 384;
        if ((i13 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C6700K.f21527Z, c6021p, 3072, 6);
            c6021p.m6524S(-1290039016);
            boolean zM6542f = c6021p.m6542f(interfaceC5985X);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                objM6514H = new C6207k(interfaceC5985X, 5);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H;
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC7313q.f23201f, AbstractC7313q.f23199d);
            C17767k0 c17767k0 = AbstractC4048f0.f12769a;
            AbstractC6012k0 abstractC6012k0 = AbstractC3959O0.f12302a;
            AbstractC9751J3.m10348a(interfaceC1426a, interfaceC10459qM11234l, AbstractC4048f0.m4737f(((C3949M0) c6021p.m6548k(abstractC6012k0)).f12241w, c6021p), state.f21544h, false, AbstractC8411c.m8969c(-735343602, c6021p, new C0227a(state, 24)), c6021p, 196608, 16);
            if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                c6021p.m6524S(-1290016455);
                boolean zM6542f2 = c6021p.m6542f(interfaceC5985X);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == obj) {
                    objM6514H2 = new C6194i(interfaceC5985X, i12);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H2;
                c6021p.m6553p(false);
                c6021p.m6524S(-1290014558);
                boolean z6 = (i13 & 112) == 32;
                Object objM6514H3 = c6021p.m6514H();
                if (z6 || objM6514H3 == obj) {
                    objM6514H3 = new C0459F(27, onIntent);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                AbstractC9721E3.m10311a(interfaceC1436k, (InterfaceC1426a) objM6514H3, AbstractC8142m4.m8677e(R.string.settings_memory_reset_details, new Object[]{AbstractC9821V2.m10463d(state.f21546j, c6021p)}, c6021p), AbstractC8142m4.m8676d(R.string.settings_memory_reset_confirm, c6021p), ((C3949M0) c6021p.m6548k(abstractC6012k0)).f12241w, null, false, null, c6021p, 0, 224);
            }
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(state, onIntent, interfaceC10459q2, i10, 24);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9732b(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        c6021p.m6526U(169131930);
        int i11 = i10 | 6;
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c6021p.m6524S(217375812);
            boolean zM6545h = c6021p.m6545h(c8870f);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6545h || objM6514H == obj) {
                objM6514H = new C6703N(c8870f, 0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C6704O.class));
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
            Object objMo5693b = c16527d.mo5693b(ViewMemoryViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C6704O.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C6704O.class), c16527d.mo5693b(ViewMemoryViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ViewMemoryViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            boolean zM6545h2 = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h2 || objM6514H3 == obj) {
                objM6514H3 = new ViewMemoryScreenKt$ViewMemoryScreen$$inlined$injectViewModel$1(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            ViewMemoryViewModel viewMemoryViewModel = (ViewMemoryViewModel) baseViewModel;
            C6704O c6704o = (C6704O) AbstractC9112C3.m9642d(viewMemoryViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(217385197);
            boolean zM6542f2 = c6021p.m6542f(viewMemoryViewModel);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f2 || objM6514H4 == obj) {
                objM6514H4 = new C0292u(1, viewMemoryViewModel, ViewMemoryViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 24);
                c6021p.m6537c0(objM6514H4);
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H4;
            c6021p.m6553p(false);
            AbstractC8662k3.m9350a(interfaceC10459q2, null, 0L, AbstractC8411c.m8969c(-1717317295, c6021p, new C0148y(c8870f, c6704o, interfaceC3759g, 16)), false, AbstractC8411c.m8969c(1577991638, c6021p, new C6701L(c6704o, interfaceC3759g, 1)), c6021p, (i11 & 14) | 199680, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q2, i10, 13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC5985X m9733c(InterfaceC17406l interfaceC17406l, C6021p c6021p, int i10) {
        Object objM6514H = c6021p.m6514H();
        C5975S c5975s = C6013l.f19514a;
        if (objM6514H == c5975s) {
            objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
            c6021p.m6537c0(objM6514H);
        }
        InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
        boolean z6 = (((i10 & 14) ^ 6) > 4 && c6021p.m6542f(interfaceC17406l)) || (i10 & 6) == 4;
        Object objM6514H2 = c6021p.m6514H();
        if (z6 || objM6514H2 == c5975s) {
            objM6514H2 = new C17401g(interfaceC17406l, interfaceC5985X, null);
            c6021p.m6537c0(objM6514H2);
        }
        C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, interfaceC17406l);
        return interfaceC5985X;
    }
}
