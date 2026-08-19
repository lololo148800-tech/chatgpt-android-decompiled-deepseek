package p544W9;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.auth.AuthMismatchViewModel;
import com.openai.auth.SwitchAccountViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import io.sentry.android.replay.C15298l;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1149zc.AbstractC21834C;
import p1149zc.C21838G;
import p1149zc.C21850l;
import p1149zc.C21851m;
import p1149zc.C21852n;
import p1149zc.C21855q;
import p1149zc.InterfaceC21856r;
import p204I1.C3573D;
import p204I1.C3577H;
import p204I1.C3578I;
import p204I1.C3599o;
import p229J0.AbstractC3984T1;
import p349O0.AbstractC6012k0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p467T1.C7200j;
import p467T1.C7202l;
import p467T1.InterfaceC7204n;
import p478Tc.AbstractC7308l;
import p523V9.AbstractC8096g6;
import p523V9.AbstractC8112i6;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9160K3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p759g1.C13801c;
import p774h1.AbstractC14360p;
import p774h1.C14338P;
import p774h1.C14365u;
import p774h1.InterfaceC14362r;
import p821j1.AbstractC16040e;
import p821j1.C16042g;
import p893n.AbstractActivityC17375g;
import p895n1.C17425e;
import p909nm.AbstractC17680n;
import ph.C18416d;
import td.C19843f;

/* JADX INFO: renamed from: W9.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8664l {

    /* JADX INFO: renamed from: a */
    public static C17425e f26596a;

    /* JADX INFO: renamed from: a */
    public static final void m9360a(InterfaceC10459q interfaceC10459q, SwitchAccountViewModel switchAccountViewModel, AuthMismatchViewModel authMismatchViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        InterfaceC2062k interfaceC2062k2;
        int i11;
        SwitchAccountViewModel switchAccountViewModel2;
        AuthMismatchViewModel authMismatchViewModel2;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC10459q interfaceC10459q3;
        AuthMismatchViewModel authMismatchViewModel3;
        SwitchAccountViewModel switchAccountViewModel3;
        c6021p.m6526U(-1023340407);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i10 & 384) == 0) {
            i12 |= 128;
        }
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            switchAccountViewModel3 = switchAccountViewModel;
            authMismatchViewModel3 = authMismatchViewModel;
        } else {
            c6021p.m6519N();
            int i13 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i13 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                AbstractC6012k0 abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
                Context context = (Context) c6021p.m6548k(abstractC6012k0);
                AbstractC6012k0 abstractC6012k1 = AbstractC0233b1.f873a;
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                AbstractC6012k0 abstractC6012k2 = AbstractC16421b.f50950a;
                List list = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C21838G.class));
                } else {
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    interfaceC2062k = null;
                }
                c6021p.m6553p(false);
                LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.f33491a;
                localViewModelStoreOwner.getClass();
                ViewModelStoreOwner viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                C16527D c16527d = AbstractC16526C.f51263a;
                Object objMo5693b = c16527d.mo5693b(SwitchAccountViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C21838G.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C21838G.class), c16527d.mo5693b(SwitchAccountViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SwitchAccountViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                SwitchAccountViewModel switchAccountViewModel4 = (SwitchAccountViewModel) baseViewModel;
                c6021p.m6524S(-1020152108);
                Context context2 = (Context) c6021p.m6548k(abstractC6012k0);
                boolean zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                List list2 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue2) {
                    interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), InterfaceC21856r.class));
                } else {
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    interfaceC2062k2 = null;
                }
                c6021p.m6553p(false);
                localViewModelStoreOwner.getClass();
                ViewModelStoreOwner viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a2 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                Object objMo5693b3 = c16527d.mo5693b(AuthMismatchViewModel.class);
                Object objMo5693b4 = c16527d.mo5693b(InterfaceC21856r.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f2 = c6021p.m6542f(objMo5693b3) | c6021p.m6542f(objMo5693b4) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == obj) {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(InterfaceC21856r.class), c16527d.mo5693b(AuthMismatchViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AuthMismatchViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM6514H2);
                }
                BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-1009);
                switchAccountViewModel2 = switchAccountViewModel4;
                authMismatchViewModel2 = (AuthMismatchViewModel) baseViewModel2;
                interfaceC10459q2 = c10456n;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                switchAccountViewModel2 = switchAccountViewModel;
                authMismatchViewModel2 = authMismatchViewModel;
                i11 = i12 & (-1009);
            }
            c6021p.m6554q();
            AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            InterfaceC21856r interfaceC21856r = (InterfaceC21856r) AbstractC9112C3.m9642d(authMismatchViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(-1289184715);
            boolean zM6545h = c6021p.m6545h(interfaceC21856r) | c6021p.m6542f(switchAccountViewModel2) | c6021p.m6545h(abstractActivityC17375g);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h || objM6514H3 == obj) {
                objM6514H3 = new C21850l(interfaceC21856r, switchAccountViewModel2, abstractActivityC17375g, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, interfaceC21856r);
            if (interfaceC21856r instanceof C21855q) {
                C21855q c21855q = (C21855q) interfaceC21856r;
                AbstractC3984T1.m4682a(C21851m.f69318Y, AbstractC8411c.m8969c(1756244886, c6021p, new C15298l(switchAccountViewModel2, abstractActivityC17375g, c21855q, 8)), interfaceC10459q2, AbstractC8411c.m8969c(2101073048, c6021p, new C18416d(switchAccountViewModel2, 14, abstractActivityC17375g)), AbstractC21834C.f69296c, AbstractC8411c.m8969c(-1849066086, c6021p, new C21852n(c21855q, 0)), AbstractC8411c.m8969c(-1676652005, c6021p, new C21852n(c21855q, 1)), null, 0L, 0L, 0L, 0L, 0.0f, null, c6021p, ((i11 << 6) & 896) | 1797174, 0, 16256);
            }
            interfaceC10459q3 = interfaceC10459q2;
            authMismatchViewModel3 = authMismatchViewModel2;
            switchAccountViewModel3 = switchAccountViewModel2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C19843f(interfaceC10459q3, switchAccountViewModel3, authMismatchViewModel3, i10, 8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9361b(InterfaceC14362r interfaceC14362r, C3578I c3578i) {
        boolean zM4254d = c3578i.m4254d();
        C3577H c3577h = c3578i.f10892a;
        boolean z6 = zM4254d && !AbstractC9160K3.m9708a(c3577h.f10887f, 3);
        if (z6) {
            long j10 = c3578i.f10894c;
            C13801c c13801cM8568b = AbstractC8096g6.m8568b(0L, AbstractC8112i6.m8603a((int) (j10 >> 32), (int) (j10 & 4294967295L)));
            interfaceC14362r.mo15706e();
            interfaceC14362r.mo15709h(c13801cM8568b, 1);
        }
        C3573D c3573d = c3577h.f10883b.f10910a;
        C7200j c7200j = c3573d.f10871m;
        InterfaceC7204n interfaceC7204n = c3573d.f10859a;
        if (c7200j == null) {
            c7200j = C7200j.f22863b;
        }
        C7200j c7200j2 = c7200j;
        C14338P c14338p = c3573d.f10872n;
        if (c14338p == null) {
            c14338p = C14338P.f45000d;
        }
        C14338P c14338p2 = c14338p;
        AbstractC16040e abstractC16040e = c3573d.f10874p;
        if (abstractC16040e == null) {
            abstractC16040e = C16042g.f49483a;
        }
        AbstractC16040e abstractC16040e2 = abstractC16040e;
        try {
            AbstractC14360p abstractC14360pMo7591e = interfaceC7204n.mo7591e();
            C7202l c7202l = C7202l.f22868a;
            C3599o c3599o = c3578i.f10893b;
            if (abstractC14360pMo7591e != null) {
                C3599o.m4308h(c3599o, interfaceC14362r, abstractC14360pMo7591e, interfaceC7204n != c7202l ? interfaceC7204n.mo7587a() : 1.0f, c14338p2, c7200j2, abstractC16040e2);
            } else {
                C3599o.m4307g(c3599o, interfaceC14362r, interfaceC7204n != c7202l ? interfaceC7204n.mo7588b() : C14365u.f45052b, c14338p2, c7200j2, abstractC16040e2, 0, 32);
            }
        } finally {
            if (z6) {
                interfaceC14362r.mo15719r();
            }
        }
    }
}
