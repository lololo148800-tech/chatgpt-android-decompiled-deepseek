package p544W9;

import af.C10563T;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bf.AbstractC11372a0;
import com.google.protobuf.AbstractC12107L1;
import com.openai.chatgpt.R;
import com.openai.feature.conversations.impl.conversation.ConversationViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import gd.C13959l0;
import ge.AbstractC14072e;
import ge.C14099r0;
import ge.C14107v0;
import ge.C14109w0;
import ge.C14111x0;
import ge.EnumC14059W0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p002A0.C0148y;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p017Af.C0492w;
import p017Af.C0494y;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2062k;
import p1042uh.C20263a0;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1082wd.C20909b;
import p1091wn.AbstractC21031l;
import p1091wn.C21020a;
import p1091wn.InterfaceC21029j;
import p1095x1.AbstractC21076c;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1143z4.AbstractC21790t;
import p1143z4.C21772b;
import p1143z4.C21778h;
import p1143z4.C21792v;
import p121Ef.C2427d;
import p124Ei.C2452G;
import p124Ei.C2467N0;
import p124Ei.C2493a1;
import p124Ei.C2497c;
import p124Ei.C2509g;
import p169Gf.C3046j;
import p193Hf.C3347a0;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4101o;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3991U3;
import p229J0.C4120r0;
import p269Kh.C4675b;
import p269Kh.C4676c;
import p269Kh.C4679f;
import p269Kh.C4684k;
import p269Kh.C4688o;
import p293Lh.C5062h;
import p328N1.C5609y;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p482Tg.C7445b0;
import p502Uc.AbstractC7622f;
import p523V9.AbstractC8082f0;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8190s4;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p547Wc.C8805o;
import p552Wg.C8846h;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9274d4;
import p594Y9.AbstractC9821V2;
import p623Zf.C10312h;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p736f0.AbstractC13508z;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17781r0;
import p911o0.C17785t0;
import p911o0.C17790w;

/* JADX INFO: renamed from: W9.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8634g {
    /* JADX INFO: renamed from: a */
    public static final void m9287a(String text, C4679f c4679f, InterfaceC1436k onIntent, InterfaceC1426a collapse, String str, C4688o fallbackModel, C4676c models, InterfaceC10459q interfaceC10459q, boolean z6, C6021p c6021p, int i10) {
        int i11;
        C6021p c6021p2;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(text, "text");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        AbstractC16544l.m18094g(collapse, "collapse");
        AbstractC16544l.m18094g(fallbackModel, "fallbackModel");
        AbstractC16544l.m18094g(models, "models");
        c6021p.m6526U(-1731461995);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(text) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c4679f) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6538d(R.drawable.check) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(collapse) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6542f(str) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6542f(fallbackModel) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c6021p.m6542f(models) ? 8388608 : 4194304;
        }
        int i12 = i11 | 100663296;
        if ((805306368 & i10) == 0) {
            i12 |= c6021p.m6544g(z6) ? 536870912 : 268435456;
        }
        int i13 = i12;
        if ((306783379 & i13) == 306783378 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            boolean z10 = !z6;
            C8410b c8410bM8969c = AbstractC8411c.m8969c(1010638949, c6021p, new C3046j(text, 13));
            c6021p.m6524S(425450443);
            boolean z11 = ((57344 & i13) == 16384) | ((458752 & i13) == 131072);
            boolean z12 = (29360128 & i13) == 8388608;
            C4684k c4684k = c4679f.f15228a;
            boolean zM6542f = z11 | z12 | c6021p.m6542f(c4684k) | ((3670016 & i13) == 1048576) | c6021p.m6545h(interfaceC20904w) | ((i13 & 7168) == 2048) | ((i13 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                c6021p2 = c6021p;
                C14099r0 c14099r0 = new C14099r0(collapse, str, models, c4684k, fallbackModel, interfaceC20904w, onIntent, c4679f);
                c6021p2.m6537c0(c14099r0);
                objM6514H = c14099r0;
            } else {
                c6021p2 = c6021p;
            }
            c6021p2.m6553p(false);
            AbstractC4101o.m4761b(c8410bM8969c, (InterfaceC1426a) objM6514H, c10456n, null, AbstractC8411c.m8969c(1242568041, c6021p2, new C8805o(str, c4684k, false, 11)), z10, null, null, null, c6021p, ((i13 >> 18) & 896) | 24582, 456);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4120r0(text, c4679f, onIntent, collapse, str, fallbackModel, models, interfaceC10459q2, z6, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9288b(C8870f appState, InterfaceC1426a onDetailsClick, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, ConversationViewModel conversationViewModel, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        boolean z6;
        Object objM14398a;
        InterfaceC10459q interfaceC10459q2;
        ConversationViewModel conversationViewModel2;
        int i12;
        Object obj;
        ConversationViewModel conversationViewModel3;
        InterfaceC10459q interfaceC10459q3;
        AbstractC16544l.m18094g(appState, "appState");
        AbstractC16544l.m18094g(onDetailsClick, "onDetailsClick");
        c6021p.m6526U(1375803470);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(appState) : c6021p.m6545h(appState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onDetailsClick) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 256 : 128;
        }
        int i13 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i13 = i11 | 11264;
        }
        if ((i13 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            conversationViewModel3 = conversationViewModel;
        } else {
            c6021p.m6519N();
            int i14 = i10 & 1;
            Object obj2 = C6013l.f19514a;
            if (i14 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14111x0.class));
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
                Object objMo5693b = c16527d.mo5693b(ConversationViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj2) {
                    z6 = true;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM14398a);
                } else {
                    objM14398a = objM6514H;
                    z6 = true;
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM14398a;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                interfaceC10459q2 = c10456n;
                conversationViewModel2 = (ConversationViewModel) baseViewModel;
                i12 = (-57345) & i13;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                conversationViewModel2 = conversationViewModel;
                z6 = true;
                i12 = i13 & (-57345);
            }
            c6021p.m6554q();
            C14111x0 c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel2.f40343c, c6021p).getValue();
            Iterator it = AbstractC17680n.m19363m0(appState.f27149b.f33535g).iterator();
            if (it.hasNext()) {
                it.next();
            }
            Iterator it2 = ((C21020a) AbstractC21031l.m21483g(it)).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                Object next = it2.next();
                if (!(((C21778h) next).f69074Z instanceof C21792v)) {
                    obj = next;
                    break;
                }
            }
            boolean z10 = ((C21778h) obj) != null ? z6 : false;
            c6021p.m6524S(-424453942);
            boolean z11 = ((i12 & 14) == 4 || ((i12 & 8) != 0 && c6021p.m6545h(appState))) ? z6 : false;
            Object objM6514H2 = c6021p.m6514H();
            if (z11 || objM6514H2 == obj2) {
                objM6514H2 = new C10563T(appState, 4);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H2;
            Object objM530s = AbstractC0168G.m530s(-424451899, c6021p, false);
            if (objM530s == obj2) {
                objM530s = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM530s);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM530s;
            c6021p.m6553p(false);
            c6021p.m6524S(-424450169);
            boolean zM6542f2 = c6021p.m6542f(conversationViewModel2);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == obj2) {
                objM6514H3 = new C7445b0(1, conversationViewModel2, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 24);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H3;
            c6021p.m6553p(false);
            AbstractC9274d4.m9842a(AbstractC8411c.m8969c(-791214838, c6021p, new C0148y(c14111x0, interfaceC3759g, interfaceC5985X, 26)), interfaceC10459q2, AbstractC8411c.m8969c(-1039183032, c6021p, new C14109w0(interfaceC1426a, z10, interfaceC1426a2)), AbstractC8411c.m8969c(906578879, c6021p, new C2497c(c14111x0, interfaceC3759g, onDetailsClick, interfaceC5985X, 7)), c14111x0.m15496j() == EnumC14059W0.f44200Z, null, c6021p, ((i12 >> 6) & 112) | 3462, 32);
            conversationViewModel3 = conversationViewModel2;
            interfaceC10459q3 = interfaceC10459q2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0492w(appState, onDetailsClick, interfaceC1426a, interfaceC10459q3, conversationViewModel3, i10, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m9289c(InterfaceC1426a onClick, InterfaceC10459q interfaceC10459q, boolean z6, C6021p c6021p, int i10, int i11) {
        int i12;
        boolean z10;
        InterfaceC10459q interfaceC10459q2;
        boolean z11;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(onClick, "onClick");
        c6021p.m6526U(49290012);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i12 | 48;
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 384) == 0) {
                z10 = z6;
                i13 |= c6021p.m6544g(z10) ? 256 : 128;
            }
            if ((i13 & 147) == 146 || !c6021p.m6562y()) {
                C10456n c10456n = C10456n.f30959Y;
                if (i14 != 0) {
                    z10 = false;
                }
                boolean z12 = z10;
                AbstractC3984T1.m4693l(onClick, c10456n, false, null, null, AbstractC8411c.m8969c(1341577183, c6021p, new C2509g(z12, 3)), c6021p, (i13 & 14) | 196608 | (i13 & 112), 28);
                interfaceC10459q2 = c10456n;
                z11 = z12;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                z11 = z10;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C2427d(onClick, interfaceC10459q2, z11, i10, i11, 3);
            }
        }
        i13 = i12 | 432;
        z10 = z6;
        if ((i13 & 147) == 146) {
            C10456n c10456n2 = C10456n.f30959Y;
            if (i14 != 0) {
                z10 = false;
            }
            boolean z13 = z10;
            AbstractC3984T1.m4693l(onClick, c10456n2, false, null, null, AbstractC8411c.m8969c(1341577183, c6021p, new C2509g(z13, 3)), c6021p, (i13 & 14) | 196608 | (i13 & 112), 28);
            interfaceC10459q2 = c10456n2;
            z11 = z13;
        } else {
            C10456n c10456n3 = C10456n.f30959Y;
            if (i14 != 0) {
                z10 = false;
            }
            boolean z14 = z10;
            AbstractC3984T1.m4693l(onClick, c10456n3, false, null, null, AbstractC8411c.m8969c(1341577183, c6021p, new C2509g(z14, 3)), c6021p, (i13 & 14) | 196608 | (i13 & 112), 28);
            interfaceC10459q2 = c10456n3;
            z11 = z14;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2427d(onClick, interfaceC10459q2, z11, i10, i11, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x0175  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x01be  */
    /* JADX WARN: Code duplicated, block: B:65:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x0226  */
    /* JADX WARN: Code duplicated, block: B:70:0x022c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0233  */
    /* JADX WARN: Code duplicated, block: B:73:0x0235  */
    /* JADX WARN: Code duplicated, block: B:79:0x0271  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m9290d(C14111x0 state, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        C10456n c10456n;
        InterfaceC10459q interfaceC10459q3;
        C20263a0 c20263a0;
        int i13;
        C21696i c21696i;
        C21694h c21694h;
        C17785t0 c17785t0;
        boolean z6;
        String str;
        boolean z10;
        InterfaceC10459q interfaceC10459q4;
        boolean z11;
        int i14;
        C21696i c21696i2;
        C21694h c21694h2;
        String strM8676d;
        boolean z12;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(state, "state");
        c6021p.m6526U(-876473186);
        if ((i10 & 6) == 0) {
            i12 = i10 | (c6021p.m6542f(state) ? 4 : 2);
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 32 : 16;
            }
            if ((i12 & 19) == 18 || !c6021p.m6562y()) {
                c10456n = C10456n.f30959Y;
                if (i15 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                c20263a0 = state.f44411h0;
                if (c20263a0 != null) {
                    c6021p.m6524S(-143213149);
                    if (AbstractC11372a0.m12784c(c20263a0)) {
                        c6021p.m6524S(-143175174);
                        if (state.f44396a || !state.f44414j.isEmpty()) {
                            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                            i14 = c6021p.f19564P;
                            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
                            InterfaceC21700k.f68875m0.getClass();
                            c21696i2 = C21698j.f68869b;
                            c6021p.m6528W();
                            if (c6021p.f19563O) {
                                c6021p.m6549l(c21696i2);
                            } else {
                                c6021p.m6543f0();
                            }
                            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                            c21694h2 = C21698j.f68874g;
                            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                                AbstractC0168G.m537z(i14, c6021p, i14, c21694h2);
                            }
                            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                            c6021p.m6524S(2075510142);
                            strM8676d = state.f44412i;
                            if (strM8676d == null) {
                                strM8676d = AbstractC8142m4.m8676d(R.string.conversations_default_title, c6021p);
                            }
                            c6021p.m6553p(false);
                            AbstractC7622f.m7962a(strM8676d, false, AbstractC14072e.f44284s, c6021p, 432);
                            AbstractC4124r4.m4768b(AbstractC9821V2.m10463d(c20263a0, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12159o, c6021p, 0, 3120, 55294);
                            c6021p.m6553p(true);
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        c6021p.m6553p(z12);
                        z11 = z12;
                    } else {
                        interfaceC10459q3 = interfaceC10459q3;
                        c6021p.m6524S(-142246569);
                        AbstractC4124r4.m4768b(AbstractC9821V2.m10463d(c20263a0, c6021p), null, 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p, 196608, 3120, 120798);
                        z11 = false;
                        c6021p.m6553p(false);
                    }
                    c6021p.m6553p(z11);
                } else {
                    InterfaceC10459q interfaceC10459q5 = interfaceC10459q3;
                    c6021p.m6524S(-141989455);
                    C17756f c17756f = AbstractC17770m.f56724a;
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23198c), C10444b.f30945x0, c6021p, 48);
                    i13 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459q5);
                    InterfaceC21700k.f68875m0.getClass();
                    c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                        AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
                    c17785t0 = C17785t0.f56761a;
                    c6021p.m6524S(-82472922);
                    interfaceC10459q3 = interfaceC10459q5;
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_role_assistant, c6021p), new WithAlignmentLineElement(AbstractC21076c.f66994a), 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 196608, 0, 131036);
                    if (AbstractC8160o6.m8729d(C13959l0.f44012c, c6021p)) {
                        z6 = false;
                        c6021p.m6553p(false);
                    } else {
                        z6 = false;
                        str = state.f44406f.f66652c;
                        if (str != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        AbstractC10831a.m11200c(c17785t0, z10, null, AbstractC13508z.m15013e(null, 3), AbstractC13508z.m15014f(null, 3), null, AbstractC8411c.m8969c(-1632780610, c6021p, new C3991U3(str, 9)), c6021p, 1600518, 18);
                        c6021p.m6553p(false);
                    }
                    c6021p.m6553p(true);
                    c6021p.m6553p(z6);
                }
                interfaceC10459q4 = interfaceC10459q3;
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C5062h(state, interfaceC10459q4, i10, i11, 5);
            }
        }
        i12 |= 48;
        interfaceC10459q2 = interfaceC10459q;
        if ((i12 & 19) == 18) {
            c10456n = C10456n.f30959Y;
            if (i15 != 0) {
                interfaceC10459q3 = c10456n;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c20263a0 = state.f44411h0;
            if (c20263a0 != null) {
                c6021p.m6524S(-143213149);
                if (AbstractC11372a0.m12784c(c20263a0)) {
                    c6021p.m6524S(-143175174);
                    if (state.f44396a) {
                        C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                        i14 = c6021p.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, c10456n);
                        InterfaceC21700k.f68875m0.getClass();
                        c21696i2 = C21698j.f68869b;
                        c6021p.m6528W();
                        if (c6021p.f19563O) {
                            c6021p.m6549l(c21696i2);
                        } else {
                            c6021p.m6543f0();
                        }
                        C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a2);
                        C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
                        c21694h2 = C21698j.f68874g;
                        if (c6021p.f19563O) {
                            AbstractC0168G.m537z(i14, c6021p, i14, c21694h2);
                        } else {
                            AbstractC0168G.m537z(i14, c6021p, i14, c21694h2);
                        }
                        C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
                        c6021p.m6524S(2075510142);
                        strM8676d = state.f44412i;
                        if (strM8676d == null) {
                            strM8676d = AbstractC8142m4.m8676d(R.string.conversations_default_title, c6021p);
                        }
                        c6021p.m6553p(false);
                        AbstractC7622f.m7962a(strM8676d, false, AbstractC14072e.f44284s, c6021p, 432);
                        AbstractC4124r4.m4768b(AbstractC9821V2.m10463d(c20263a0, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12159o, c6021p, 0, 3120, 55294);
                        c6021p.m6553p(true);
                        z12 = false;
                    } else {
                        C17790w c17790wM19515a3 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                        i14 = c6021p.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, c10456n);
                        InterfaceC21700k.f68875m0.getClass();
                        c21696i2 = C21698j.f68869b;
                        c6021p.m6528W();
                        if (c6021p.f19563O) {
                            c6021p.m6549l(c21696i2);
                        } else {
                            c6021p.m6543f0();
                        }
                        C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a3);
                        C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m4);
                        c21694h2 = C21698j.f68874g;
                        if (c6021p.f19563O) {
                            AbstractC0168G.m537z(i14, c6021p, i14, c21694h2);
                        } else {
                            AbstractC0168G.m537z(i14, c6021p, i14, c21694h2);
                        }
                        C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d4);
                        c6021p.m6524S(2075510142);
                        strM8676d = state.f44412i;
                        if (strM8676d == null) {
                            strM8676d = AbstractC8142m4.m8676d(R.string.conversations_default_title, c6021p);
                        }
                        c6021p.m6553p(false);
                        AbstractC7622f.m7962a(strM8676d, false, AbstractC14072e.f44284s, c6021p, 432);
                        AbstractC4124r4.m4768b(AbstractC9821V2.m10463d(c20263a0, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12159o, c6021p, 0, 3120, 55294);
                        c6021p.m6553p(true);
                        z12 = false;
                    }
                    c6021p.m6553p(z12);
                    z11 = z12;
                } else {
                    interfaceC10459q3 = interfaceC10459q3;
                    c6021p.m6524S(-142246569);
                    AbstractC4124r4.m4768b(AbstractC9821V2.m10463d(c20263a0, c6021p), null, 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p, 196608, 3120, 120798);
                    z11 = false;
                    c6021p.m6553p(false);
                }
                c6021p.m6553p(z11);
            } else {
                InterfaceC10459q interfaceC10459q6 = interfaceC10459q3;
                c6021p.m6524S(-141989455);
                C17756f c17756f2 = AbstractC17770m.f56724a;
                C17781r0 c17781r0M19506b2 = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23198c), C10444b.f30945x0, c6021p, 48);
                i13 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, interfaceC10459q6);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b2);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m5);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
                } else {
                    AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d5);
                c17785t0 = C17785t0.f56761a;
                c6021p.m6524S(-82472922);
                interfaceC10459q3 = interfaceC10459q6;
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_role_assistant, c6021p), new WithAlignmentLineElement(AbstractC21076c.f66994a), 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 196608, 0, 131036);
                if (AbstractC8160o6.m8729d(C13959l0.f44012c, c6021p)) {
                    z6 = false;
                    c6021p.m6553p(false);
                } else {
                    z6 = false;
                    str = state.f44406f.f66652c;
                    if (str != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AbstractC10831a.m11200c(c17785t0, z10, null, AbstractC13508z.m15013e(null, 3), AbstractC13508z.m15014f(null, 3), null, AbstractC8411c.m8969c(-1632780610, c6021p, new C3991U3(str, 9)), c6021p, 1600518, 18);
                    c6021p.m6553p(false);
                }
                c6021p.m6553p(true);
                c6021p.m6553p(z6);
            }
            interfaceC10459q4 = interfaceC10459q3;
        } else {
            c10456n = C10456n.f30959Y;
            if (i15 != 0) {
                interfaceC10459q3 = c10456n;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c20263a0 = state.f44411h0;
            if (c20263a0 != null) {
                c6021p.m6524S(-143213149);
                if (AbstractC11372a0.m12784c(c20263a0)) {
                    c6021p.m6524S(-143175174);
                    if (state.f44396a) {
                        C17790w c17790wM19515a4 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                        i14 = c6021p.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p, c10456n);
                        InterfaceC21700k.f68875m0.getClass();
                        c21696i2 = C21698j.f68869b;
                        c6021p.m6528W();
                        if (c6021p.f19563O) {
                            c6021p.m6549l(c21696i2);
                        } else {
                            c6021p.m6543f0();
                        }
                        C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a4);
                        C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m6);
                        c21694h2 = C21698j.f68874g;
                        if (c6021p.f19563O) {
                            AbstractC0168G.m537z(i14, c6021p, i14, c21694h2);
                        } else {
                            AbstractC0168G.m537z(i14, c6021p, i14, c21694h2);
                        }
                        C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d6);
                        c6021p.m6524S(2075510142);
                        strM8676d = state.f44412i;
                        if (strM8676d == null) {
                            strM8676d = AbstractC8142m4.m8676d(R.string.conversations_default_title, c6021p);
                        }
                        c6021p.m6553p(false);
                        AbstractC7622f.m7962a(strM8676d, false, AbstractC14072e.f44284s, c6021p, 432);
                        AbstractC4124r4.m4768b(AbstractC9821V2.m10463d(c20263a0, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12159o, c6021p, 0, 3120, 55294);
                        c6021p.m6553p(true);
                        z12 = false;
                    } else {
                        C17790w c17790wM19515a5 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                        i14 = c6021p.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m7 = c6021p.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d7 = AbstractC10443a.m10923d(c6021p, c10456n);
                        InterfaceC21700k.f68875m0.getClass();
                        c21696i2 = C21698j.f68869b;
                        c6021p.m6528W();
                        if (c6021p.f19563O) {
                            c6021p.m6549l(c21696i2);
                        } else {
                            c6021p.m6543f0();
                        }
                        C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a5);
                        C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m7);
                        c21694h2 = C21698j.f68874g;
                        if (c6021p.f19563O) {
                            AbstractC0168G.m537z(i14, c6021p, i14, c21694h2);
                        } else {
                            AbstractC0168G.m537z(i14, c6021p, i14, c21694h2);
                        }
                        C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d7);
                        c6021p.m6524S(2075510142);
                        strM8676d = state.f44412i;
                        if (strM8676d == null) {
                            strM8676d = AbstractC8142m4.m8676d(R.string.conversations_default_title, c6021p);
                        }
                        c6021p.m6553p(false);
                        AbstractC7622f.m7962a(strM8676d, false, AbstractC14072e.f44284s, c6021p, 432);
                        AbstractC4124r4.m4768b(AbstractC9821V2.m10463d(c20263a0, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12159o, c6021p, 0, 3120, 55294);
                        c6021p.m6553p(true);
                        z12 = false;
                    }
                    c6021p.m6553p(z12);
                    z11 = z12;
                } else {
                    interfaceC10459q3 = interfaceC10459q3;
                    c6021p.m6524S(-142246569);
                    AbstractC4124r4.m4768b(AbstractC9821V2.m10463d(c20263a0, c6021p), null, 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c6021p, 196608, 3120, 120798);
                    z11 = false;
                    c6021p.m6553p(false);
                }
                c6021p.m6553p(z11);
            } else {
                InterfaceC10459q interfaceC10459q7 = interfaceC10459q3;
                c6021p.m6524S(-141989455);
                C17756f c17756f3 = AbstractC17770m.f56724a;
                C17781r0 c17781r0M19506b3 = AbstractC17777p0.m19506b(AbstractC17770m.m19500g(AbstractC7313q.f23198c), C10444b.f30945x0, c6021p, 48);
                i13 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m8 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d8 = AbstractC10443a.m10923d(c6021p, interfaceC10459q7);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b3);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m8);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
                } else {
                    AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d8);
                c17785t0 = C17785t0.f56761a;
                c6021p.m6524S(-82472922);
                interfaceC10459q3 = interfaceC10459q7;
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_role_assistant, c6021p), new WithAlignmentLineElement(AbstractC21076c.f66994a), 0L, 0L, null, C5609y.f18156s0, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 196608, 0, 131036);
                if (AbstractC8160o6.m8729d(C13959l0.f44012c, c6021p)) {
                    z6 = false;
                    c6021p.m6553p(false);
                } else {
                    z6 = false;
                    str = state.f44406f.f66652c;
                    if (str != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AbstractC10831a.m11200c(c17785t0, z10, null, AbstractC13508z.m15013e(null, 3), AbstractC13508z.m15014f(null, 3), null, AbstractC8411c.m8969c(-1632780610, c6021p, new C3991U3(str, 9)), c6021p, 1600518, 18);
                    c6021p.m6553p(false);
                }
                c6021p.m6553p(true);
                c6021p.m6553p(z6);
            }
            interfaceC10459q4 = interfaceC10459q3;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5062h(state, interfaceC10459q4, i10, i11, 5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9291e(boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, ConversationViewModel conversationViewModel, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        Object objM14398a;
        InterfaceC10459q interfaceC10459q2;
        ConversationViewModel conversationViewModel2;
        int i12;
        InterfaceC10459q interfaceC10459q3;
        ConversationViewModel conversationViewModel3;
        c6021p.m6526U(1583799702);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 256 : 128;
        }
        int i13 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i13 = i11 | 11264;
        }
        if ((i13 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            conversationViewModel3 = conversationViewModel;
        } else {
            c6021p.m6519N();
            int i14 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i14 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14111x0.class));
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
                Object objMo5693b = c16527d.mo5693b(ConversationViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (!zM6542f && objM6514H != obj) {
                    objM14398a = objM6514H;
                } else {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM14398a);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM14398a;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                interfaceC10459q2 = c10456n;
                conversationViewModel2 = (ConversationViewModel) baseViewModel;
                i12 = i13 & (-57345);
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                conversationViewModel2 = conversationViewModel;
                i12 = i13 & (-57345);
            }
            c6021p.m6554q();
            C14111x0 c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(-1014351716);
            boolean zM6542f2 = c6021p.m6542f(conversationViewModel2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                Object c7445b0 = new C7445b0(1, conversationViewModel2, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 23);
                c6021p.m6537c0(c7445b0);
                objM6514H2 = c7445b0;
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H2;
            c6021p.m6553p(false);
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            String str = c14111x0.f44404e;
            c6021p.m6524S(-1014347146);
            boolean zM6542f3 = c6021p.m6542f(str);
            Object objM6514H3 = c6021p.m6514H();
            C5975S c5975s = C5975S.f19448r0;
            if (zM6542f3 || objM6514H3 == obj) {
                objM6514H3 = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H3;
            c6021p.m6553p(false);
            c6021p.m6524S(-1014344618);
            boolean zM6542f4 = c6021p.m6542f(str);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f4 || objM6514H4 == obj) {
                objM6514H4 = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM6514H4);
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM6514H4;
            c6021p.m6553p(false);
            c6021p.m6524S(-1014342154);
            boolean zM6542f5 = c6021p.m6542f(str);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f5 || objM6514H5 == obj) {
                objM6514H5 = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM6514H5);
            }
            InterfaceC5985X interfaceC5985X3 = (InterfaceC5985X) objM6514H5;
            c6021p.m6553p(false);
            c6021p.m6524S(-1014339937);
            int i15 = i12 & 112;
            boolean z10 = i15 == 32;
            Object objM6514H6 = c6021p.m6514H();
            if (z10 || objM6514H6 == obj) {
                objM6514H6 = new C10312h(23, interfaceC1436k);
                c6021p.m6537c0(objM6514H6);
            }
            InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H6;
            c6021p.m6553p(false);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i16 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q2);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a3 = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a3);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(-1388860235);
            boolean zM6545h = c6021p.m6545h(interfaceC20904w) | (i15 == 32);
            Object objM6514H7 = c6021p.m6514H();
            if (zM6545h || objM6514H7 == obj) {
                objM6514H7 = new C2493a1(interfaceC20904w, interfaceC1436k, 1);
                c6021p.m6537c0(objM6514H7);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459q4 = interfaceC10459q2;
            AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H7, null, false, null, null, AbstractC14072e.f44267b, c6021p, 196608, 30);
            c6021p.m6524S(-1388847293);
            boolean zM6545h2 = c6021p.m6545h(interfaceC20904w) | (i15 == 32);
            Object objM6514H8 = c6021p.m6514H();
            if (zM6545h2 || objM6514H8 == obj) {
                objM6514H8 = new C2493a1(interfaceC20904w, interfaceC1436k, 2);
                c6021p.m6537c0(objM6514H8);
            }
            c6021p.m6553p(false);
            ConversationViewModel conversationViewModel4 = conversationViewModel2;
            AbstractC8190s4.m8770a(z6, (InterfaceC1426a) objM6514H8, null, 0L, null, null, AbstractC8411c.m8969c(-1254875267, c6021p, new C3347a0(c14111x0, interfaceC1426a2, interfaceC1426a, interfaceC3759g, str, interfaceC5985X, interfaceC5985X2, interfaceC5985X3, interfaceC1436k, interfaceC20904w)), c6021p, (i12 & 14) | 1572864, 60);
            c6021p.m6553p(true);
            boolean zBooleanValue2 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) interfaceC5985X2.getValue()).booleanValue();
            boolean zBooleanValue4 = ((Boolean) interfaceC5985X3.getValue()).booleanValue();
            c6021p.m6524S(-1014083309);
            boolean zM6542f6 = c6021p.m6542f(interfaceC5985X) | c6021p.m6542f(interfaceC5985X2) | c6021p.m6542f(interfaceC5985X3) | c6021p.m6542f(interfaceC1426a2);
            Object objM6514H9 = c6021p.m6514H();
            if (zM6542f6 || objM6514H9 == obj) {
                objM6514H9 = new C0494y(interfaceC1426a2, interfaceC5985X, interfaceC5985X2, interfaceC5985X3, 13);
                c6021p.m6537c0(objM6514H9);
            }
            InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) objM6514H9;
            boolean zM13832w = AbstractC12107L1.m13832w(c6021p, false, -1014078149, interfaceC3759g);
            Object objM6514H10 = c6021p.m6514H();
            if (zM13832w || objM6514H10 == obj) {
                objM6514H10 = new C14107v0(interfaceC3759g, 0);
                c6021p.m6537c0(objM6514H10);
            }
            InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H10;
            boolean zM13832w2 = AbstractC12107L1.m13832w(c6021p, false, -1014075721, interfaceC3759g);
            Object objM6514H11 = c6021p.m6514H();
            if (zM13832w2 || objM6514H11 == obj) {
                objM6514H11 = new C8846h(interfaceC3759g, 11);
                c6021p.m6537c0(objM6514H11);
            }
            InterfaceC1426a interfaceC1426a5 = (InterfaceC1426a) objM6514H11;
            boolean zM13832w3 = AbstractC12107L1.m13832w(c6021p, false, -1014073359, interfaceC3759g);
            Object objM6514H12 = c6021p.m6514H();
            if (zM13832w3 || objM6514H12 == obj) {
                objM6514H12 = new C8846h(interfaceC3759g, 12);
                c6021p.m6537c0(objM6514H12);
            }
            c6021p.m6553p(false);
            AbstractC8082f0.m8510b(str, c14111x0.f44412i, c14111x0.f44377H, zBooleanValue2, zBooleanValue3, zBooleanValue4, interfaceC1426a4, interfaceC1436k2, interfaceC1426a5, (InterfaceC1426a) objM6514H12, c6021p, 0);
            interfaceC10459q3 = interfaceC10459q4;
            conversationViewModel3 = conversationViewModel4;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2467N0(z6, interfaceC1436k, interfaceC1426a, interfaceC10459q3, conversationViewModel3, i10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9292f(C14111x0 c14111x0, C4676c c4676c, List list, ArrayList arrayList, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        c6021p.m6526U(276242616);
        int i11 = (i10 & 6) == 0 ? (c6021p.m6542f(c14111x0) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(c4676c) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(list) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(arrayList) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((i12 & 74899) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC3984T1.m4692k(AbstractC10842a.m11235m(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), 0.0f, AbstractC7313q.f23198c, 1), 0.0f, 0L, c6021p, 0, 6);
            for (C4679f c4679f : AbstractC17680n.m19363m0(c4676c.f15224a)) {
                C4676c.Companion.getClass();
                boolean zM5393a = C4675b.m5393a(c4679f, arrayList, list);
                String str = c4679f.f15228a.f15237b;
                C20909b c20909b = c14111x0.f44406f;
                m9287a(str, c4679f, interfaceC1436k, interfaceC1426a, c20909b.m21453a().f15252a, c20909b.f66651b, c4676c, null, zM5393a, c6021p, ((i12 >> 6) & 7168) | (i12 & 57344) | ((i12 << 18) & 29360128));
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2452G((Object) c14111x0, (Object) c4676c, (Object) list, arrayList, interfaceC1426a, interfaceC1436k, i10, 10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m9293g(String str) {
        return str != null ? "android-app://androidx.navigation/".concat(str) : "";
    }

    /* JADX INFO: renamed from: h */
    public static String m9294h(Context context, int i10) {
        String strValueOf;
        AbstractC16544l.m18094g(context, "context");
        if (i10 <= 16777215) {
            return String.valueOf(i10);
        }
        try {
            strValueOf = context.getResources().getResourceName(i10);
        } catch (Resources.NotFoundException unused) {
            strValueOf = String.valueOf(i10);
        }
        AbstractC16544l.m18093f(strValueOf, "try {\n                co….toString()\n            }");
        return strValueOf;
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC21029j m9295i(AbstractC21790t abstractC21790t) {
        AbstractC16544l.m18094g(abstractC21790t, "<this>");
        return AbstractC21031l.m21492p(C21772b.f69060s0, abstractC21790t);
    }

    /* JADX INFO: renamed from: j */
    public static Object m9296j(List list) {
        Object objM9296j;
        Object objM19343S = AbstractC17680n.m19343S(list);
        if (objM19343S instanceof List) {
            List list2 = (List) objM19343S;
            return (list2.size() <= 1 && (objM9296j = m9296j(list2)) != null) ? objM9296j : list2;
        }
        if (AbstractC17681o.m19382k(null, MMVKXkcLpuHFDi.eQXimd, C17689w.f56480Y).contains(objM19343S)) {
            return null;
        }
        return objM19343S;
    }
}
