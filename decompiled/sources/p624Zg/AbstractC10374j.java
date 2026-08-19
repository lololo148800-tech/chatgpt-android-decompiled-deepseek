package p624Zg;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.input.nestedscroll.AbstractC10866a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.subscriptions.ChoosePlanViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import p002A0.C0148y;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p042Bf.C1281w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p080D0.C1834v;
import p098Di.InterfaceC2062k;
import p1051v0.AbstractC20417e;
import p124Ei.C2446D;
import p229J0.AbstractC3917G4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4034c4;
import p229J0.C3949M0;
import p229J0.C4055g1;
import p229J0.C4108p0;
import p243Jf.C4334d;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p382Pf.C6401d;
import p478Tc.AbstractC7308l;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p537W0.C8410b;
import p544W9.AbstractC8449B;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Zg.j */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10374j {

    /* JADX INFO: renamed from: a */
    public static final long f30743a = AbstractC14334L.m15626d(4287598479L);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f30744b = 0;

    /* JADX INFO: renamed from: a */
    public static final void m10887a(InterfaceC10459q interfaceC10459q, ChoosePlanViewModel choosePlanViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        ChoosePlanViewModel choosePlanViewModel2;
        c6021p.m6526U(-1393277350);
        int i11 = i10 | 6;
        if ((i10 & 48) == 0) {
            i11 = i10 | 22;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            choosePlanViewModel2 = choosePlanViewModel;
        } else {
            c6021p.m6519N();
            int i12 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i12 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C10378l.class));
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
                Object objMo5693b = c16527d.mo5693b(ChoosePlanViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C10378l.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C10378l.class), c16527d.mo5693b(ChoosePlanViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    Object objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ChoosePlanViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM14398a);
                    objM6514H = objM14398a;
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                interfaceC10459q2 = c10456n;
                choosePlanViewModel2 = (ChoosePlanViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                choosePlanViewModel2 = choosePlanViewModel;
            }
            c6021p.m6554q();
            AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            c6021p.m6524S(-1411499905);
            boolean zM6542f2 = c6021p.m6542f(choosePlanViewModel2) | c6021p.m6545h(abstractActivityC17375g);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C10368g(choosePlanViewModel2, abstractActivityC17375g, null);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, choosePlanViewModel2);
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            AbstractC8662k3.m9350a(AbstractC10866a.m11313a(interfaceC10459q2, (C4055g1) AbstractC3917G4.m4618d(c6021p).f43261p0, null), null, 0L, AbstractC8411c.m8969c(1303639555, c6021p, new C4334d(c8870f, 27)), false, AbstractC8411c.m8969c(1859307934, c6021p, new C1281w(AbstractC9112C3.m9642d(choosePlanViewModel2.f40343c, c6021p), (Object) choosePlanViewModel2, (Object) abstractActivityC17375g, 14)), c6021p, 199680, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(interfaceC10459q2, choosePlanViewModel2, i10, 9);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10888b(C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-787463845);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c8410b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC4034c4.m4725a(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), AbstractC20417e.m21079a(16), 0L, 0L, 0.0f, 0.0f, AbstractC8449B.m9060a(1, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12217c), AbstractC8411c.m8969c(2132022240, c6021p, new C4108p0(c8410b, 9)), c6021p, 12582918, 60);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1834v(c8410b, i10, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m10889c(C10390v c10390v, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-507224125);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c10390v) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a2) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            m10888b(AbstractC8411c.m8969c(1988292370, c6021p, new C0148y(c10390v, interfaceC1426a2, interfaceC1426a, 18)), c6021p, 6);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(c10390v, interfaceC1426a, interfaceC1426a2, i10, 4);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m10890d(int i10, C6021p c6021p) {
        c6021p.m6526U(305058660);
        if (i10 == 0 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            m10888b(AbstractC10383o.f30773d, c6021p, 6);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2446D(i10, 13);
        }
    }
}
