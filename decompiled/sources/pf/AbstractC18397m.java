package pf;

import android.content.Context;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.messages.audio.MessageAudioViewModel;
import com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import ge.C14089m0;
import java.util.List;
import java.util.WeakHashMap;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p000.C17122m;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p017Af.C0492w;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p103Dn.C2127D0;
import p103Dn.InterfaceC2184i;
import p1051v0.AbstractC20417e;
import p1051v0.C20416d;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2465M0;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3980S2;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7306j;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p478Tc.AbstractC7314r;
import p482Tg.C7443a0;
import p492U1.C7540e;
import p523V9.AbstractC8071d5;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8103h5;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8467E;
import p547Wc.C8804n;
import p571X9.AbstractC9112C3;
import p582Xk.HXHG.TfazcFv;
import p594Y9.AbstractC9834X3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10450h;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13725A;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13764h;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p870le.C16863U;
import p882m1.AbstractC17140a;
import p894n0.InterfaceC17406l;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17724E0;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.C17718B0;
import p911o0.C17755e0;
import p911o0.C17756f;
import p911o0.C17781r0;
import p911o0.C17785t0;

/* JADX INFO: renamed from: pf.m */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18397m {

    /* JADX INFO: renamed from: a */
    public static final float f58682a = -300;

    /* JADX INFO: renamed from: b */
    public static final float f58683b = 70;

    /* JADX INFO: renamed from: c */
    public static final float f58684c;

    static {
        float f10 = AbstractC7312p.f23184a;
        f58684c = AbstractC7312p.f23188e - 12;
    }

    /* JADX INFO: renamed from: b */
    public static final void m19866b(int i10, InterfaceC1426a onHide, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        AbstractC16544l.m18094g(onHide, "onHide");
        c6021p.m6526U(123544142);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onHide) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18398n.class));
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
            Object objMo5693b = c16527d.mo5693b(MessageAudioViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C18398n.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18398n.class), c16527d.mo5693b(MessageAudioViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageAudioViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            MessageAudioViewModel messageAudioViewModel = (MessageAudioViewModel) baseViewModel;
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C18394j.f58675o0, c6021p, 3072, 6);
            InterfaceC5982V0 interfaceC5982V0M15260a = AbstractC13764h.m15260a(((Boolean) interfaceC5985X.getValue()).booleanValue() ? f58683b : f58682a, AbstractC13758e.m15255t(500, 0, AbstractC13725A.f43288a, 2), "animate player entrance", c6021p, 384, 8);
            C7540e c7540e = new C7540e(((C7540e) interfaceC5982V0M15260a.getValue()).f23894Y);
            c6021p.m6524S(-1238847899);
            boolean zM6542f2 = c6021p.m6542f(interfaceC5982V0M15260a) | c6021p.m6542f(interfaceC5985X);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C18396l(interfaceC5982V0M15260a, interfaceC5985X, null);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, c7540e);
            C18398n c18398n = (C18398n) AbstractC9112C3.m9642d(messageAudioViewModel.f40343c, c6021p).getValue();
            C2127D0 c2127d0 = ((MessageAudioViewModelImpl) messageAudioViewModel).m14309n().f65374h;
            c6021p.m6524S(-1238839739);
            boolean zM6542f3 = c6021p.m6542f(messageAudioViewModel);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f3 || objM6514H3 == obj) {
                objM6514H3 = new C16863U(1, messageAudioViewModel, MessageAudioViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 7);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) ((InterfaceC3759g) objM6514H3);
            c6021p.m6524S(-1238836558);
            boolean zM6542f4 = c6021p.m6542f(interfaceC5982V0M15260a);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f4 || objM6514H4 == obj) {
                objM6514H4 = new C17122m(interfaceC5982V0M15260a, 3);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            m19865a(c18398n, c2127d0, interfaceC1436k, onHide, AbstractC10842a.m11235m(AbstractC10842a.m11230h(interfaceC10459q2, (InterfaceC1436k) objM6514H4), AbstractC7313q.f23201f, 0.0f, 2), c6021p, (i12 << 9) & 7168);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2465M0(onHide, interfaceC10459q2, i10, 6);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m19865a(C18398n state, InterfaceC2184i progressFlow, InterfaceC1436k onIntent, InterfaceC1426a onHide, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        boolean z6;
        int i12;
        boolean z10;
        float f10;
        int i13;
        C6021p c6021p2;
        boolean z11;
        int i14;
        C10456n c10456n;
        boolean z12;
        boolean z13;
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(progressFlow, "progressFlow");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        AbstractC16544l.m18094g(onHide, "onHide");
        c6021p.m6526U(-2114889176);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(state) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(progressFlow) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onHide) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        int i15 = i11;
        if ((i15 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n2 = C10456n.f30959Y;
            boolean zM9097b = AbstractC8467E.m9097b(c6021p);
            long j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12215b;
            C20416d c20416dM21079a = AbstractC20417e.m21079a(AbstractC7313q.f23200e);
            C10450h c10450h = C10444b.f30944w0;
            WeakHashMap weakHashMap = C17718B0.f56555v;
            InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(AbstractC8103h5.m8581b(AbstractC10844c.m11244d(AbstractC17724E0.m19459a(interfaceC10459q, new C17755e0(C17756f.m19480f(c6021p).f56566k, AbstractC17758g.f56704g)), 1.0f), AbstractC7306j.f23145c, c20416dM21079a, false, 28), j10, c20416dM21079a);
            float f11 = AbstractC7313q.f23199d;
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(interfaceC10459qM11207b, f11);
            c6021p.m6524S(-129536953);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = AbstractC0168G.m536y(c6021p);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11208c = AbstractC10833a.m11208c(interfaceC10459qM11233k, (InterfaceC17406l) objM6514H, null, false, null, C18394j.f58674Z, 28);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, c10450h, c6021p, 48);
            int i16 = c6021p.f19564P;
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
            C5997d.m6439Z(c21694h, c6021p, c17781r0M19506b);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            C17785t0 c17785t0 = C17785t0.f56761a;
            C10451i c10451i = C10444b.f30938q0;
            InterfaceC10459q interfaceC10459qM11207b2 = AbstractC10833a.m11207b(AbstractC8079e5.m8501a(AbstractC10844c.m11252l(c10456n2, AbstractC7312p.f23187d), AbstractC20417e.f64539a), zM9097b ? C14365u.f45055e : C14365u.f45052b, AbstractC14334L.f44973a);
            c6021p.m6524S(-592984998);
            int i17 = i15 & 896;
            int i18 = i15 & 14;
            boolean z14 = (i17 == 256) | (i18 == 4);
            Object objM6514H2 = c6021p.m6514H();
            if (z14 || objM6514H2 == c5975s) {
                z6 = false;
                objM6514H2 = new C18395k(onIntent, state, 0);
                c6021p.m6537c0(objM6514H2);
            } else {
                z6 = false;
            }
            c6021p.m6553p(z6);
            InterfaceC10459q interfaceC10459qM11209d = AbstractC10833a.m11209d(interfaceC10459qM11207b2, z6, null, (InterfaceC1426a) objM6514H2, 7);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(c10451i, z6);
            int i19 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11209d);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i19))) {
                AbstractC0168G.m537z(i19, c6021p, i19, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            boolean z15 = state.f58695j;
            if (z15) {
                i12 = R.drawable.play_sm;
            } else {
                if (z15) {
                    throw new C0644w();
                }
                i12 = R.drawable.pause_sm;
            }
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(i12, c6021p, 0);
            float f12 = AbstractC7312p.f23186c;
            int i20 = i15;
            AbstractC3878A1.m4596a(abstractC17140aM8631b, null, AbstractC10844c.m11252l(c10456n2, f12), j10, c6021p, 48, 0);
            c6021p.m6553p(true);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11256p(c10456n2, f11));
            boolean z16 = state.f58690e;
            boolean z17 = state.f58689d;
            if (z16) {
                c6021p.m6524S(-1202048046);
                InterfaceC10459q interfaceC10459qM11229g = AbstractC10842a.m11229g(AbstractC10842a.m11239q(c10456n2, 1), 2);
                InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(c10451i, false);
                int i21 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11229g);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e2);
                C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m3);
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i21))) {
                    AbstractC0168G.m537z(i21, c6021p, i21, c21694h3);
                }
                C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d3);
                z10 = z17;
                f10 = f11;
                AbstractC4124r4.m4768b(TfazcFv.CTSjyKfiKkqo, AbstractC8071d5.m8483b(c10456n2, 0.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12158n, c6021p, 54, 0, 65532);
                AbstractC3980S2.m4668b(AbstractC10844c.m11252l(c10456n2, f12), ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a, AbstractC7314r.f23208a, 0L, 0, c6021p, 0, 24);
                c6021p.m6553p(true);
                c6021p.m6553p(false);
            } else {
                z10 = z17;
                f10 = f11;
                if (z10) {
                    c6021p.m6524S(-1201201405);
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.message_audio_error_message, c6021p), null, ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p, 0, 3120, 120826);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-1200945221);
                    AbstractC4124r4.m4768b(state.f58687b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12158n, c6021p, 0, 0, 65534);
                    c6021p.m6553p(false);
                }
            }
            float f13 = f10;
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11256p(c10456n2, f13));
            float f14 = f58684c;
            if (z10) {
                i13 = i17;
                c6021p2 = c6021p;
                i20 = i20;
                z11 = false;
                i14 = 256;
                c10456n = c10456n2;
                z12 = true;
                c6021p2.m6524S(-1199560048);
                AbstractC17758g.m19482b(c6021p2, c17785t0.m19513a(c10456n, 1.0f, true));
                c6021p2.m6553p(false);
            } else {
                c6021p.m6524S(-1200704444);
                c6021p.m6524S(-592919608);
                i14 = 256;
                boolean z18 = i17 == 256;
                Object objM6514H3 = c6021p.m6514H();
                if (z18 || objM6514H3 == c5975s) {
                    objM6514H3 = new C14089m0(10, onIntent);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                i13 = i17;
                c6021p2 = c6021p;
                AbstractC18384B.m19861a(state, progressFlow, (InterfaceC1436k) objM6514H3, AbstractC10844c.m11245e(c17785t0.m19513a(AbstractC10842a.m11237o(c10456n2, 0.0f, 0.0f, f13, 0.0f, 11), 1.0f, true), 32), c6021p, i20 & 126);
                if (state.f58694i && state.f58693h) {
                    c6021p2.m6524S(-592908694);
                    boolean z19 = (i18 == 4) | (i13 == 256);
                    Object objM6514H4 = c6021p.m6514H();
                    if (z19 || objM6514H4 == c5975s) {
                        z13 = true;
                        objM6514H4 = new C18395k(onIntent, state, 1);
                        c6021p2.m6537c0(objM6514H4);
                    } else {
                        z13 = true;
                    }
                    c6021p2.m6553p(false);
                    c10456n = c10456n2;
                    z12 = z13;
                    z11 = false;
                    AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H4, AbstractC10844c.m11252l(c10456n, f14), false, null, null, AbstractC8411c.m8969c(-785141702, c6021p2, new C7443a0(state, 24)), c6021p, 196656, 28);
                } else {
                    c10456n = c10456n2;
                    z11 = false;
                    z12 = true;
                }
                c6021p2.m6553p(z11);
            }
            c6021p2.m6524S(-592881705);
            boolean z20 = (i13 == i14 ? z12 : z11) | ((i20 & 7168) == 2048 ? z12 : z11);
            Object objM6514H5 = c6021p.m6514H();
            if (z20 || objM6514H5 == c5975s) {
                objM6514H5 = new C8804n(onIntent, onHide, 4);
                c6021p2.m6537c0(objM6514H5);
            }
            c6021p2.m6553p(z11);
            AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H5, AbstractC10844c.m11252l(c10456n, f14), false, null, null, AbstractC18386b.f58666a, c6021p, 196656, 28);
            c6021p2.m6553p(z12);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w((Object) state, (Object) progressFlow, onIntent, (Object) onHide, (Object) interfaceC10459q, i10, 20);
        }
    }
}
