package p196Hi;

import android.content.Context;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import com.openai.voice.assistant.AssistantViewModel;
import java.util.List;
import java.util.WeakHashMap;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0254h0;
import p003A1.C0257i0;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2062k;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2535p;
import p193Hf.C3321N;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7300d;
import p523V9.AbstractC8192s6;
import p525Vb.C8258a;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p571X9.AbstractC9233X;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14327E;
import p774h1.C14365u;
import p894n0.InterfaceC17406l;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17724E0;
import p911o0.AbstractC17780r;
import p911o0.C17718B0;
import p911o0.C17756f;

/* JADX INFO: renamed from: Hi.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3437g {

    /* JADX INFO: renamed from: a */
    public static final C14327E f10466a;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        long j10 = AbstractC7300d.f23111a;
        f10466a = C8258a.m8897k(new C17309l[]{new C17309l(fValueOf, new C14365u(C14365u.m15774b(0.0f, j10))), new C17309l(Float.valueOf(0.3f), new C14365u(C14365u.m15774b(0.1f, j10))), new C17309l(Float.valueOf(1.0f), new C14365u(j10))});
    }

    /* JADX INFO: renamed from: a */
    public static final void m4190a(InterfaceC1426a onFinish, AssistantViewModel assistantViewModel, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        boolean z6;
        AssistantViewModel assistantViewModel2;
        boolean z10;
        AbstractC16544l.m18094g(onFinish, "onFinish");
        c6021p.m6526U(-125263990);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onFinish) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            assistantViewModel2 = assistantViewModel;
        } else {
            c6021p.m6519N();
            int i12 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i12 == 0 || c6021p.m6561x()) {
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C3450t.class));
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
                Object objMo5693b = c16527d.mo5693b(AssistantViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C3450t.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C3450t.class), c16527d.mo5693b(AssistantViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AssistantViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                z6 = false;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                assistantViewModel2 = (AssistantViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                assistantViewModel2 = assistantViewModel;
                z6 = false;
            }
            c6021p.m6554q();
            FillElement fillElement = AbstractC10844c.f32512c;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, z6);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, fillElement);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
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
            InterfaceC5985X interfaceC5985XM9805a = AbstractC9233X.m9805a(assistantViewModel2.f40343c, C3434d.f10454Z, c6021p, 48);
            c6021p.m6524S(-791329284);
            boolean zM6542f2 = c6021p.m6542f(assistantViewModel2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C3433c(assistantViewModel2, 0);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            m4191b((InterfaceC1426a) objM6514H2, null, AbstractC8411c.m8969c(-1126056063, c6021p, new C3321N(1, onFinish)), c6021p, 384);
            c6021p.m6524S(-791320280);
            if (((Boolean) interfaceC5985XM9805a.getValue()).booleanValue()) {
                c6021p.m6524S(-791317112);
                boolean zM6542f3 = c6021p.m6542f(assistantViewModel2);
                Object objM6514H3 = c6021p.m6514H();
                if (zM6542f3 || objM6514H3 == obj) {
                    objM6514H3 = new C0254h0(assistantViewModel2, 23);
                    c6021p.m6537c0(objM6514H3);
                }
                z10 = false;
                c6021p.m6553p(false);
                AbstractC8192s6.m8792a(0, null, (InterfaceC1436k) objM6514H3, c6021p);
            } else {
                z10 = false;
            }
            c6021p.m6553p(z10);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(onFinish, assistantViewModel2, i10, 17);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4191b(InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C8410b c8410b, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(-2050300079);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6545h(c8410b) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C10451i c10451i = C10444b.f30941t0;
            FillElement fillElement = AbstractC10844c.f32512c;
            c6021p.m6524S(1222260676);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = AbstractC0168G.m536y(c6021p);
            }
            InterfaceC17406l interfaceC17406l = (InterfaceC17406l) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(1222262418);
            boolean z6 = (i12 & 14) == 4;
            Object objM6514H2 = c6021p.m6514H();
            if (z6 || objM6514H2 == c5975s) {
                objM6514H2 = new C2535p(3, interfaceC1426a);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11208c = AbstractC10833a.m11208c(fillElement, interfaceC17406l, null, false, null, (InterfaceC1426a) objM6514H2, 28);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11208c);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            InterfaceC10459q interfaceC10459qM11243c = AbstractC10844c.m11243c(AbstractC10844c.m11244d(c10456n, 1.0f), 0.33f);
            c6021p.m6524S(1580744451);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == c5975s) {
                objM6514H3 = AbstractC0168G.m536y(c6021p);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11208c2 = AbstractC10833a.m11208c(interfaceC10459qM11243c, (InterfaceC17406l) objM6514H3, null, false, null, C3435e.f10458Z, 28);
            C10451i c10451i2 = C10444b.f30934Y;
            InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(c10451i2, false);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11208c2);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e2);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            InterfaceC10459q interfaceC10459qM11206a = AbstractC10833a.m11206a(c10456n, f10466a, null, 6);
            WeakHashMap weakHashMap = C17718B0.f56555v;
            InterfaceC10459q interfaceC10459qM19459a = AbstractC17724E0.m19459a(interfaceC10459qM11206a, C17756f.m19480f(c6021p).f56566k);
            InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(c10451i2, false);
            int i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM19459a);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e3);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m3);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d3);
            c8410b.invoke(c6021p, Integer.valueOf((i12 >> 6) & 14));
            c6021p.m6553p(true);
            c6021p.m6553p(true);
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3436f(interfaceC1426a, interfaceC10459q2, c8410b, i10, 0);
        }
    }
}
