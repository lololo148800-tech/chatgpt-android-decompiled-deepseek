package p523V9;

import af.AbstractC10574c;
import af.C10582j;
import af.C10583k;
import af.C10584l;
import af.C10585m;
import af.C10589q;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bf.C11356K;
import bf.C11359N;
import bf.C11362Q;
import bf.InterfaceC11353H;
import com.openai.feature.gizmos.impl.store.GizmoPreviewViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p006A4.C0350k;
import p025An.C0644w;
import p039Bc.C0885s;
import p042Bf.C1262d;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2062k;
import p1139z0.C21585H;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p204I1.C3582M;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6037x;
import p349O0.InterfaceC6008i0;
import p350O1.C6045C;
import p382Pf.C6401d;
import p478Tc.AbstractC7313q;
import p482Tg.C7445b0;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p537W0.C8410b;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p587Y1.C9588n;
import p594Y9.AbstractC9834X3;
import p594Y9.AbstractC9973t4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;
import p953q0.C18557O;
import p984r8.C18887a;
import p988rc.C18913a;
import p988rc.C18919g;

/* JADX INFO: renamed from: V9.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8050b0 {
    /* JADX INFO: renamed from: a */
    public static final void m8440a(C8410b c8410b, C8410b c8410b2, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(841961086);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(c8410b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(c8410b2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C17756f c17756f = AbstractC17770m.f56724a;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23198c), C10444b.f30947z0, c6021p, 48);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            C6037x c6037x = AbstractC4124r4.f13310a;
            C5984W0 c5984w0 = AbstractC3947L4.f12183a;
            C5997d.m6440a(c6037x.mo6405a(C3582M.m4274b(((C3941K4) c6021p.m6548k(c5984w0)).f12151g, 0L, 0L, null, null, 0L, null, 3, 0, 0L, null, null, 16744447)), c8410b, c6021p, ((i11 << 3) & 112) | 8);
            C5997d.m6440a(c6037x.mo6405a(C3582M.m4274b(((C3941K4) c6021p.m6548k(c5984w0)).f12157m, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12231m, 0L, null, null, 0L, null, 3, 0, 0L, null, null, 16744446)), c8410b2, c6021p, (i11 & 112) | 8);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(c8410b, c8410b2, interfaceC10459q, i10, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8441b(String currentName, InterfaceC1426a onDismiss, InterfaceC1436k onConfirm, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(currentName, "currentName");
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        AbstractC16544l.m18094g(onConfirm, "onConfirm");
        c6021p.m6526U(-634531814);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(currentName) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onDismiss) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onConfirm) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            Object[] objArr = new Object[0];
            C21585H c21585h = C6045C.f19681d;
            c6021p.m6524S(1735095430);
            boolean z6 = (i12 & 14) == 4;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C18887a(currentName, 1);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC9973t4.m10617b(onDismiss, new C9588n(3, false, false), AbstractC8411c.m8969c(1059335729, c6021p, new C0350k(c10456n, AbstractC9834X3.m10480c(objArr, c21585h, (InterfaceC1426a) objM6514H, c6021p, 0), onDismiss, onConfirm, currentName, 9)), c6021p, ((i12 >> 3) & 14) | 432, 0);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18557O(currentName, onDismiss, onConfirm, interfaceC10459q2, i10, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8442c(InterfaceC10459q interfaceC10459q, GizmoPreviewViewModel gizmoPreviewViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        GizmoPreviewViewModel gizmoPreviewViewModel2;
        c6021p.m6526U(-2015180298);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            gizmoPreviewViewModel2 = gizmoPreviewViewModel;
        } else {
            c6021p.m6519N();
            int i13 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i13 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C10589q.class));
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
                Object objMo5693b = c16527d.mo5693b(GizmoPreviewViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C10589q.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C10589q.class), c16527d.mo5693b(GizmoPreviewViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(GizmoPreviewViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                gizmoPreviewViewModel2 = (GizmoPreviewViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i11 = i12 & (-113);
                interfaceC10459q2 = interfaceC10459q;
                gizmoPreviewViewModel2 = gizmoPreviewViewModel;
            }
            c6021p.m6554q();
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            C10589q c10589q = (C10589q) AbstractC9112C3.m9642d(gizmoPreviewViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(158475391);
            boolean zM6542f2 = c6021p.m6542f(gizmoPreviewViewModel2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C7445b0(1, gizmoPreviewViewModel2, GizmoPreviewViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 11);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            int i14 = (i11 & 14) | 199680;
            InterfaceC10459q interfaceC10459q3 = interfaceC10459q2;
            AbstractC8662k3.m9350a(interfaceC10459q3, null, 0L, AbstractC8411c.m8969c(655211103, c6021p, new C10585m(c8870f, 1)), false, AbstractC8411c.m8969c(-1602680774, c6021p, new C0885s(c10589q, 19, (InterfaceC3759g) objM6514H2)), c6021p, i14, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(interfaceC10459q2, gizmoPreviewViewModel2, i10, 10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8443d(int i10, C6021p c6021p, InterfaceC10459q interfaceC10459q, List list) {
        InterfaceC10459q interfaceC10459q2;
        int i11 = 0;
        int i12 = 1;
        c6021p.m6526U(695445237);
        if (((((i10 & 6) == 0 ? (c6021p.m6545h(list) ? 4 : 2) | i10 : i10) | 48) & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            float f10 = AbstractC7313q.f23201f;
            InterfaceC10459q interfaceC10459qM11229g = AbstractC10842a.m11229g(AbstractC10842a.m11234l(interfaceC10459q2, f10, f10), 1);
            C17756f c17756f = AbstractC17770m.f56724a;
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23198c), C10444b.f30944w0, c6021p, 48);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11229g);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
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
            C17785t0 c17785t0 = C17785t0.f56761a;
            c6021p.m6524S(-601566802);
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                c6021p.m6524S(-601567163);
                if (i14 > 0) {
                    AbstractC3984T1.m4701t(null, 0.0f, 0L, c6021p, 0, 7);
                }
                c6021p.m6553p(false);
                InterfaceC11353H interfaceC11353H = (InterfaceC11353H) list.get(i14);
                if (interfaceC11353H instanceof C11359N) {
                    c6021p.m6524S(-601562042);
                    C11359N c11359n = (C11359N) interfaceC11353H;
                    m8440a(AbstractC8411c.m8969c(136531274, c6021p, new C10582j(c11359n, i11)), AbstractC8411c.m8969c(-900585303, c6021p, new C10582j(c11359n, i12)), c17785t0.m19513a(interfaceC10459q2, 1.0f, true), c6021p, 54);
                    c6021p.m6553p(false);
                } else if (interfaceC11353H instanceof C11356K) {
                    c6021p.m6524S(-601554054);
                    if (((C11356K) interfaceC11353H).f34352b != null) {
                        c6021p.m6524S(-1468290585);
                        C11356K c11356k = (C11356K) interfaceC11353H;
                        m8440a(AbstractC8411c.m8969c(-86039226, c6021p, new C10583k(c11356k, i11)), AbstractC8411c.m8969c(-2126714331, c6021p, new C10583k(c11356k, i12)), c17785t0.m19513a(interfaceC10459q2, 1.0f, true), c6021p, 54);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-1467977826);
                        m8440a(AbstractC8411c.m8969c(18795421, c6021p, new C10583k((C11356K) interfaceC11353H, 2)), AbstractC10574c.f31408g, c17785t0.m19513a(interfaceC10459q2, 1.0f, true), c6021p, 54);
                        c6021p.m6553p(false);
                    }
                    c6021p.m6553p(false);
                } else if (interfaceC11353H instanceof C11362Q) {
                    c6021p.m6524S(-601532385);
                    C11362Q c11362q = (C11362Q) interfaceC11353H;
                    m8440a(AbstractC8411c.m8969c(1420701506, c6021p, new C10584l(c11362q, i11)), AbstractC8411c.m8969c(1184083681, c6021p, new C10584l(c11362q, i12)), c17785t0.m19513a(interfaceC10459q2, 1.0f, true), c6021p, 54);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-1466796323);
                    c6021p.m6553p(false);
                }
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1262d(list, interfaceC10459q2, i10, i12);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8444e(C18919g appendInlineContent, InterfaceC1436k interfaceC1436k, int i10, C8410b c8410b) {
        AbstractC16544l.m18094g(appendInlineContent, "$this$appendInlineContent");
        C18919g.m20268b(appendInlineContent, new C18913a(interfaceC1436k, i10, c8410b, 1));
    }
}
