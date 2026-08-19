package p316Mf;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.messages.messagefeedback.MessageFeedbackViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p000.C13721g;
import p003A1.AbstractC0233b1;
import p003A1.C0178J0;
import p006A4.C0349j;
import p025An.C0644w;
import p042Bf.C1281w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1139z0.C21585H;
import p124Ei.C2535p;
import p197Hj.C3457c;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p537W0.AbstractC8411c;
import p547Wc.AbstractC8757A;
import p562X0.AbstractC9020o;
import p571X9.AbstractC9112C3;
import p586Y0.C9566r;
import p594Y9.AbstractC9834X3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Mf.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5340g {

    /* JADX INFO: renamed from: a */
    public static final C21585H f17559a;

    static {
        C5334a c5334a = C5334a.f17547o0;
        C5339f c5339f = C5339f.f17558Y;
        C21585H c21585h = AbstractC9020o.f27518a;
        f17559a = new C21585H(c5334a, 10, c5339f);
    }

    /* JADX INFO: renamed from: a */
    public static final void m5881a(int i10, InterfaceC1426a onDialogDismiss, InterfaceC1439n onFeedbackSubmit, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        AbstractC16544l.m18094g(onFeedbackSubmit, "onFeedbackSubmit");
        AbstractC16544l.m18094g(onDialogDismiss, "onDialogDismiss");
        c6021p.m6526U(-689701670);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onFeedbackSubmit) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onDialogDismiss) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C5338e.f17555Z, c6021p, 3072, 6);
            C9566r c9566r = (C9566r) AbstractC9834X3.m10481d(new Object[0], f17559a, null, C5338e.f17556o0, c6021p, 3072, 4);
            c6021p.m6524S(-1148367024);
            boolean z6 = (i12 & 112) == 32;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C2535p(12, onDialogDismiss);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC8757A.m9523d((InterfaceC1426a) objM6514H, interfaceC10459q, AbstractC8411c.m8969c(-63964945, c6021p, new C1281w(interfaceC5985X, (Object) c9566r, (Object) onFeedbackSubmit, 5)), c6021p, ((i12 >> 3) & 112) | 384);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C13721g(onFeedbackSubmit, onDialogDismiss, interfaceC10459q, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5882b(MessageFeedbackViewModel messageFeedbackViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        MessageFeedbackViewModel messageFeedbackViewModel2;
        c6021p.m6526U(-2003094111);
        if ((((i10 & 6) == 0 ? i10 | 2 : i10) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            messageFeedbackViewModel2 = messageFeedbackViewModel;
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
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), AbstractC5349p.class));
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
                Object objMo5693b = c16527d.mo5693b(MessageFeedbackViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(AbstractC5349p.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(AbstractC5349p.class), c16527d.mo5693b(MessageFeedbackViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageFeedbackViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                messageFeedbackViewModel2 = (MessageFeedbackViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                messageFeedbackViewModel2 = messageFeedbackViewModel;
            }
            c6021p.m6554q();
            Object obj2 = (AbstractC5349p) AbstractC9112C3.m9642d(messageFeedbackViewModel2.f40343c, c6021p).getValue();
            if (obj2 instanceof C5347n) {
                c6021p.m6524S(-839092523);
                boolean zM6542f2 = c6021p.m6542f(messageFeedbackViewModel2) | c6021p.m6542f(obj2);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == obj) {
                    objM6514H2 = new C0349j(messageFeedbackViewModel2, 21, (C5347n) obj2);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC1439n interfaceC1439n = (InterfaceC1439n) objM6514H2;
                c6021p.m6553p(false);
                c6021p.m6524S(-839087739);
                boolean zM6542f3 = c6021p.m6542f(messageFeedbackViewModel2);
                Object objM6514H3 = c6021p.m6514H();
                if (zM6542f3 || objM6514H3 == obj) {
                    objM6514H3 = new C3457c(messageFeedbackViewModel2, 18);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                m5881a(0, (InterfaceC1426a) objM6514H3, interfaceC1439n, c6021p, null);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(messageFeedbackViewModel2, i10, 10);
        }
    }
}
