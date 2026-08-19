package p1048uo;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bf.C11391s;
import com.openai.feature.gizmos.impl.settings.GizmoSettingsViewModel;
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
import p017Af.C0492w;
import p025An.C0644w;
import p042Bf.C1268j;
import p042Bf.C1282x;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2062k;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3914G1;
import p243Jf.C4334d;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p482Tg.C7445b0;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p547Wc.C8805o;
import p550We.C8829j;
import p550We.EnumC8830k;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p622Ze.AbstractC10287e;
import p622Ze.C10288f;
import p622Ze.C10290h;
import p622Ze.C10291i;
import p622Ze.C10298p;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;

/* JADX INFO: renamed from: uo.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC20397d {
    /* JADX INFO: renamed from: a */
    public static final void m21059a(InterfaceC10459q interfaceC10459q, GizmoSettingsViewModel gizmoSettingsViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        GizmoSettingsViewModel gizmoSettingsViewModel2;
        c6021p.m6526U(-141648457);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            gizmoSettingsViewModel2 = gizmoSettingsViewModel;
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
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C10298p.class));
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
                Object objMo5693b = c16527d.mo5693b(GizmoSettingsViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C10298p.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C10298p.class), c16527d.mo5693b(GizmoSettingsViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(GizmoSettingsViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                gizmoSettingsViewModel2 = (GizmoSettingsViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i11 = i12 & (-113);
                interfaceC10459q2 = interfaceC10459q;
                gizmoSettingsViewModel2 = gizmoSettingsViewModel;
            }
            c6021p.m6554q();
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            C10298p c10298p = (C10298p) AbstractC9112C3.m9642d(gizmoSettingsViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(294812434);
            boolean zM6542f2 = c6021p.m6542f(gizmoSettingsViewModel2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C7445b0(1, gizmoSettingsViewModel2, GizmoSettingsViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 9);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            int i14 = (i11 & 14) | 199680;
            AbstractC8662k3.m9350a(interfaceC10459q2, null, 0L, AbstractC8411c.m8969c(763965856, c6021p, new C4334d(c8870f, 25)), false, AbstractC8411c.m8969c(1117002235, c6021p, new C10290h(c10298p, (InterfaceC3759g) objM6514H2, 1)), c6021p, i14, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10291i(interfaceC10459q2, gizmoSettingsViewModel2, i10, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m21060b(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-186008230);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            boolean z6 = false;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i11 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                AbstractC0168G.m537z(i11, c6021p, i11, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(-1630872165);
            int i12 = 0;
            for (int i13 = 3; i12 < i13; i13 = 3) {
                AbstractC3914G1.m4611a(AbstractC10287e.f30555c, null, null, null, null, AbstractC10287e.f30556d, null, 0.0f, 0.0f, c6021p, 196614, 478);
                i12++;
                z6 = z6;
            }
            c6021p.m6553p(z6);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q2, i10, 26);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m21061c(C8829j c8829j, C11391s c11391s, EnumC8830k enumC8830k, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-1718308447);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c8829j) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c6021p.m6542f(c11391s) : c6021p.m6545h(c11391s) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(enumC8830k) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 2048 : 1024;
        }
        int i12 = i11 | 24576;
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            AbstractC3914G1.m4611a(AbstractC8411c.m8969c(674281343, c6021p, new C10288f(c11391s, 1)), c10456n, null, AbstractC8411c.m8969c(1163238402, c6021p, new C8805o(c11391s, interfaceC1436k, false, 6)), null, AbstractC8411c.m8969c(-1374101756, c6021p, new C1268j(enumC8830k, interfaceC1436k, c8829j, c11391s)), null, 0.0f, 0.0f, c6021p, ((i12 >> 9) & 112) | 199686, 468);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(c8829j, c11391s, enumC8830k, interfaceC1436k, interfaceC10459q2, i10, 9);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractActivityC17375g m21062d(Context context) {
        if (context instanceof AbstractActivityC17375g) {
            return (AbstractActivityC17375g) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        AbstractC16544l.m18093f(baseContext, "getBaseContext(...)");
        return m21062d(baseContext);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m21063e() {
        return C20398e.f64509d;
    }
}
