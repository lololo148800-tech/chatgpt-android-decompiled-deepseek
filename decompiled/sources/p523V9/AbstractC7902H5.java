package p523V9;

import af.C10561Q;
import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import cd.C11709i;
import com.openai.chatgpt.R;
import com.openai.feature.gizmoshome.impl.edit.SnorlaxEditViewModel;
import com.openai.feature.messages.impl.listitem.MessageListItemContextMenuViewModel;
import com.openai.feature.messages.messagefeedback.MessageFeedbackViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.ArrayList;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.AbstractC0233b1;
import p003A1.InterfaceC0172H0;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p067Cd.C1632f;
import p098Di.InterfaceC2062k;
import p1071w0.C20720L0;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21057K;
import p1106xf.AbstractC21195c;
import p1106xf.C21203k;
import p1106xf.C21204l;
import p1106xf.C21205m;
import p1106xf.C21206n;
import p1113xn.AbstractC21329w;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.C21658D;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1140z1.InterfaceC21701k0;
import p121Ef.C2428e;
import p124Ei.C2447D0;
import p124Ei.C2467N0;
import p124Ei.C2486X0;
import p156G1.C2963j;
import p156G1.C2968o;
import p193Hf.C3323O;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4101o;
import p269Kh.C4676c;
import p269Kh.C4684k;
import p269Kh.C4688o;
import p291Lf.C5014k;
import p293Lh.C5062h;
import p316Mf.AbstractC5349p;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p392Q0.C6546d;
import p479Td.C7320F;
import p479Td.C7351f0;
import p482Tg.C7445b0;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9721E3;
import p635a1.AbstractC10443a;
import p635a1.AbstractC10458p;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p690cp.AbstractC12935u;
import p690cp.C12924j;
import p751ff.AbstractC13631b;
import p751ff.C13637h;
import p751ff.C13638i;
import p751ff.C13641l;
import p823j3.C16084f;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17780r;
import p926of.C18168e;
import p963qd.C18685n;
import tf.C19941z;

/* JADX INFO: renamed from: V9.H5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7902H5 {
    /* JADX WARN: Code duplicated, block: B:151:0x02d5  */
    /* JADX INFO: renamed from: a */
    public static final void m8196a(C11709i popupMenuState, C7351f0 message, C4684k c4684k, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC1436k onIntent, InterfaceC1436k onAudioMessageIntent, InterfaceC10459q interfaceC10459q, MessageFeedbackViewModel messageFeedbackViewModel, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        MessageFeedbackViewModel messageFeedbackViewModel2;
        int i13;
        InterfaceC2062k interfaceC2062k2;
        boolean z14;
        boolean z15;
        MessageFeedbackViewModel messageFeedbackViewModel3;
        InterfaceC10459q interfaceC10459q3;
        AbstractC16544l.m18094g(popupMenuState, "popupMenuState");
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        AbstractC16544l.m18094g(onAudioMessageIntent, "onAudioMessageIntent");
        c6021p.m6526U(350542122);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c6021p.m6542f(popupMenuState) : c6021p.m6545h(popupMenuState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(message) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(c4684k) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6544g(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c6021p.m6544g(z11) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c6021p.m6544g(z12) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= c6021p.m6544g(z13) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= c6021p.m6545h(onIntent) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i12 |= c6021p.m6545h(onAudioMessageIntent) ? 536870912 : 268435456;
        }
        int i14 = i11 | 6;
        if ((i11 & 48) == 0) {
            i14 = i11 | 22;
        }
        if ((i12 & 306783379) == 306783378 && (i14 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            messageFeedbackViewModel3 = messageFeedbackViewModel;
            interfaceC10459q3 = interfaceC10459q;
        } else {
            c6021p.m6519N();
            int i15 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i15 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
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
                boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
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
                interfaceC10459q2 = c10456n;
                messageFeedbackViewModel2 = (MessageFeedbackViewModel) baseViewModel;
                i13 = i14 & (-113);
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                messageFeedbackViewModel2 = messageFeedbackViewModel;
                i13 = i14 & (-113);
            }
            c6021p.m6554q();
            c6021p.m6524S(-1020152108);
            Context context2 = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue2 = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list2 = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue2) {
                interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C21206n.class));
            } else {
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                interfaceC2062k2 = null;
            }
            c6021p.m6553p(false);
            LocalViewModelStoreOwner.f33491a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a2 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            C16527D c16527d2 = AbstractC16526C.f51263a;
            Object objMo5693b3 = c16527d2.mo5693b(MessageListItemContextMenuViewModel.class);
            Object objMo5693b4 = c16527d2.mo5693b(C21206n.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f2 = c6021p.m6542f(objMo5693b4) | c6021p.m6542f(objMo5693b3) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                z14 = true;
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d2.mo5693b(C21206n.class), c16527d2.mo5693b(MessageListItemContextMenuViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d2.mo5693b(MessageListItemContextMenuViewModel.class), message.f23286a, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H2);
            } else {
                z14 = true;
            }
            BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
            c6021p.m6553p(false);
            C4676c c4676c = (C4676c) AbstractC9233X.m9805a(((MessageListItemContextMenuViewModel) baseViewModel2).f40343c, C21205m.f67440Y, c6021p, 48).getValue();
            C4688o c4688oM5395b = c4676c != null ? c4676c.m5395b(message.f23292g) : null;
            if ((message.f23282R || message.f23283S) ? z14 : false) {
                z15 = z14;
            } else {
                C1632f c1632f = message.f23298m;
                List list3 = c1632f != null ? c1632f.f4625d : null;
                if ((list3 == null || list3.isEmpty()) ? z14 : false) {
                    z15 = false;
                } else {
                    z15 = z14;
                }
            }
            c6021p.m6524S(-1762959493);
            int i16 = i12 & 14;
            boolean z16 = ((234881024 & i12) == 67108864 ? z14 : false) | ((i16 == 4 || ((i12 & 8) != 0 && c6021p.m6545h(popupMenuState))) ? z14 : false);
            Object objM6514H3 = c6021p.m6514H();
            if (z16 || objM6514H3 == obj) {
                objM6514H3 = new C18168e(onIntent, popupMenuState, 1);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H3;
            c6021p.m6553p(false);
            c6021p.m6524S(-1762955456);
            boolean zM6545h = c6021p.m6545h(messageFeedbackViewModel2);
            if (i16 != 4 && ((i12 & 8) == 0 || !c6021p.m6545h(popupMenuState))) {
                z14 = false;
            }
            boolean z17 = zM6545h | z14;
            Object objM6514H4 = c6021p.m6514H();
            if (z17 || objM6514H4 == obj) {
                objM6514H4 = new C5014k(messageFeedbackViewModel2, popupMenuState, 1);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            AbstractC8198t4.m8798a(popupMenuState, interfaceC10459q2, AbstractC8411c.m8969c(1662671239, c6021p, new C21203k(interfaceC1436k, message, z15, popupMenuState, z6, (InterfaceC1436k) objM6514H4, z12, z13, onAudioMessageIntent, z11, z10, c4688oM5395b, c4684k)), c6021p, 384 | i16 | ((i13 << 3) & 112), 0);
            messageFeedbackViewModel3 = messageFeedbackViewModel2;
            interfaceC10459q3 = interfaceC10459q2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C21204l(popupMenuState, message, c4684k, z6, z10, z11, z12, z13, onIntent, onAudioMessageIntent, interfaceC10459q3, messageFeedbackViewModel3, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0066 A[EDGE_INSN: B:40:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final C2968o m8197b(C21658D c21658d, boolean z6) {
        AbstractC10458p abstractC10458p = (AbstractC10458p) c21658d.f68638I0.f3471f;
        Object obj = null;
        if ((abstractC10458p.f30963p0 & 8) != 0) {
            loop0: while (abstractC10458p != null) {
                if ((abstractC10458p.f30962o0 & 8) == 0) {
                    if ((abstractC10458p.f30963p0 & 8) != 0) {
                        break;
                        break;
                    }
                    abstractC10458p = abstractC10458p.f30965r0;
                } else {
                    AbstractC10458p abstractC10458pM22201f = abstractC10458p;
                    C6546d c6546d = null;
                    while (abstractC10458pM22201f != null) {
                        if (abstractC10458pM22201f instanceof InterfaceC21701k0) {
                            obj = abstractC10458pM22201f;
                            break loop0;
                        }
                        if ((abstractC10458pM22201f.f30962o0 & 8) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                            int i10 = 0;
                            for (AbstractC10458p abstractC10458p2 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p2 != null; abstractC10458p2 = abstractC10458p2.f30965r0) {
                                if ((abstractC10458p2.f30962o0 & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        abstractC10458pM22201f = abstractC10458p2;
                                    } else {
                                        if (c6546d == null) {
                                            c6546d = new C6546d(new AbstractC10458p[16]);
                                        }
                                        if (abstractC10458pM22201f != null) {
                                            c6546d.m7099c(abstractC10458pM22201f);
                                            abstractC10458pM22201f = null;
                                        }
                                        c6546d.m7099c(abstractC10458p2);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d);
                    }
                    if ((abstractC10458p.f30963p0 & 8) != 0) {
                        break;
                    }
                    abstractC10458p = abstractC10458p.f30965r0;
                }
            }
        }
        AbstractC16544l.m18091d(obj);
        AbstractC10458p abstractC10458p3 = ((AbstractC10458p) ((InterfaceC21701k0) obj)).f30960Y;
        C2963j c2963jM22056q = c21658d.m22056q();
        AbstractC16544l.m18091d(c2963jM22056q);
        return new C2968o(abstractC10458p3, z6, c21658d, c2963jM22056q);
    }

    /* JADX INFO: renamed from: c */
    public static final void m8198c(boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1262117044);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
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
            AbstractC8190s4.m8770a(z6, interfaceC1426a, null, 0L, null, null, AbstractC8411c.m8969c(-1901208903, c6021p, new C3323O(2, interfaceC1426a2)), c6021p, (i11 & 14) | 1572864 | (i11 & 112), 60);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2447D0(z6, interfaceC1426a, interfaceC1426a2, i10, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8199d(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        c6021p.m6526U(-1609046446);
        int i11 = i10 | 6;
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(1068157915);
            boolean zM6545h = c6021p.m6545h(interfaceC20904w);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C13638i(interfaceC20904w, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c17296c);
            m8200e(interfaceC10459q, null, c6021p, i11 & 14, 2);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q, i10, 6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8200e(InterfaceC10459q interfaceC10459q, SnorlaxEditViewModel snorlaxEditViewModel, C6021p c6021p, int i10, int i11) {
        InterfaceC10459q interfaceC10459q2;
        int i12;
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q3;
        SnorlaxEditViewModel snorlaxEditViewModel2;
        int i13;
        SnorlaxEditViewModel snorlaxEditViewModel3;
        c6021p.m6526U(1135845401);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            interfaceC10459q2 = interfaceC10459q;
        } else if ((i10 & 6) == 0) {
            interfaceC10459q2 = interfaceC10459q;
            i12 = i10 | (c6021p.m6542f(interfaceC10459q2) ? 4 : 2);
        } else {
            interfaceC10459q2 = interfaceC10459q;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= 16;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            snorlaxEditViewModel3 = snorlaxEditViewModel;
        } else {
            c6021p.m6519N();
            int i15 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i15 == 0 || c6021p.m6561x()) {
                InterfaceC10459q interfaceC10459q4 = i14 != 0 ? C10456n.f30959Y : interfaceC10459q2;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C13641l.class));
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
                Object objMo5693b = c16527d.mo5693b(SnorlaxEditViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C13641l.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C13641l.class), c16527d.mo5693b(SnorlaxEditViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxEditViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                interfaceC10459q3 = interfaceC10459q4;
                snorlaxEditViewModel2 = (SnorlaxEditViewModel) baseViewModel;
                i13 = i12 & (-113);
            } else {
                c6021p.m6517L();
                i13 = i12 & (-113);
                snorlaxEditViewModel2 = snorlaxEditViewModel;
                interfaceC10459q3 = interfaceC10459q2;
            }
            c6021p.m6554q();
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            InterfaceC5985X interfaceC5985XM9642d = AbstractC9112C3.m9642d(snorlaxEditViewModel2.f40343c, c6021p);
            c6021p.m6524S(-1106322312);
            boolean zM6542f2 = c6021p.m6542f(snorlaxEditViewModel2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C7445b0(1, snorlaxEditViewModel2, SnorlaxEditViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 18);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H2;
            Object objM530s = AbstractC0168G.m530s(-1106320350, c6021p, false);
            C5975S c5975s = C5975S.f19448r0;
            if (objM530s == obj) {
                objM530s = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM530s);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM530s;
            Object objM530s2 = AbstractC0168G.m530s(-1106317950, c6021p, false);
            if (objM530s2 == obj) {
                objM530s2 = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM530s2);
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM530s2;
            Object objM530s3 = AbstractC0168G.m530s(-1106316190, c6021p, false);
            if (objM530s3 == obj) {
                objM530s3 = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM530s3);
            }
            c6021p.m6553p(false);
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            AbstractC8662k3.m9350a(interfaceC10459q3, null, 0L, AbstractC8411c.m8969c(-854881968, c6021p, new C2486X0(interfaceC5985XM9642d, c8870f, interfaceC5985X, interfaceC20904w, interfaceC3759g, (InterfaceC5985X) objM530s3, interfaceC5985X2, 3)), false, AbstractC8411c.m8969c(1499311189, c6021p, new C2428e(c8870f, interfaceC20904w, interfaceC3759g, interfaceC5985XM9642d, interfaceC5985X, interfaceC5985X2, 1)), c6021p, (i13 & 14) | 199680, 22);
            interfaceC10459q2 = interfaceC10459q3;
            snorlaxEditViewModel3 = snorlaxEditViewModel2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C5062h(interfaceC10459q2, snorlaxEditViewModel3, i10, i11, 4);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8201f(C7320F c7320f, InterfaceC1426a interfaceC1426a, C6021p c6021p, int i10) {
        c6021p.m6526U(981199944);
        int i11 = (i10 & 6) == 0 ? (c6021p.m6542f(c7320f) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC0172H0 interfaceC0172H0 = (InterfaceC0172H0) c6021p.m6548k(AbstractC0187M0.f702d);
            c6021p.m6524S(278967078);
            boolean z6 = false;
            boolean zM6545h = ((i11 & 112) == 32) | c6021p.m6545h(interfaceC0172H0);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6545h || objM6514H == c5975s) {
                objM6514H = new C20720L0(interfaceC0172H0, 1, interfaceC1426a);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            ArrayList arrayListM8205j = m8205j(c7320f.m7778d(), true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListM8205j) {
                if (obj instanceof C12924j) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (AbstractC21329w.m21726m(((C12924j) obj2).f41078k, "latex")) {
                    arrayList2.add(obj2);
                }
            }
            int i12 = 0;
            for (Object obj3 : arrayList2) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                C12924j c12924j = (C12924j) obj3;
                C8410b c8410bM8969c = AbstractC8411c.m8969c(1669464830, c6021p, new C19941z(arrayList2, i12, 3));
                c6021p.m6524S(-832419461);
                boolean zM6542f = c6021p.m6542f(interfaceC1436k) | c6021p.m6545h(c12924j);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f || objM6514H2 == c5975s) {
                    objM6514H2 = new C16084f(interfaceC1436k, 25, c12924j);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(z6);
                AbstractC4101o.m4761b(c8410bM8969c, (InterfaceC1426a) objM6514H2, null, AbstractC21195c.f67396r, null, false, null, null, null, c6021p, 3078, 500);
                i12 = i13;
                z6 = z6;
                interfaceC1436k = interfaceC1436k;
                arrayList2 = arrayList2;
                c5975s = c5975s;
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18685n(c7320f, interfaceC1426a, i10, 8);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8202g(boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1261863157);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (!z6) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C13637h(z6, interfaceC1426a, interfaceC1436k, i10, 0);
                    return;
                }
                return;
            }
            AbstractC9721E3.m10311a(interfaceC1436k, interfaceC1426a, AbstractC8142m4.m8676d(R.string.snorlax_delete_confirmation, c6021p), AbstractC8142m4.m8676d(R.string.design_selection_dialog_ok, c6021p), 0L, null, true, null, c6021p, ((i11 >> 6) & 14) | 1572864 | (i11 & 112), 176);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C13637h(z6, interfaceC1426a, interfaceC1436k, i10, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m8203h(boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC1426a interfaceC1426a3, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(1331262631);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a3) ? 2048 : 1024;
        }
        int i12 = i11 | 24576;
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
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
            int i14 = i12 >> 3;
            AbstractC3984T1.m4693l(interfaceC1426a, null, false, null, null, AbstractC13631b.f43075e, c6021p, (i14 & 14) | 196608, 30);
            m8198c(z6, interfaceC1426a2, interfaceC1426a3, c6021p, (i12 & 14) | (i14 & 112) | (i14 & 896));
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2467N0(z6, interfaceC1426a, interfaceC1426a2, interfaceC1426a3, interfaceC10459q2, i10, 4);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m8204i(boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1101885888);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (!z6) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C13637h(z6, interfaceC1426a, interfaceC1436k, i10, 2);
                    return;
                }
                return;
            }
            AbstractC9721E3.m10311a(interfaceC1436k, interfaceC1426a, AbstractC8142m4.m8676d(R.string.snorlax_unsaved_changes_message, c6021p), AbstractC8142m4.m8676d(R.string.design_selection_dialog_ok, c6021p), 0L, null, true, null, c6021p, ((i11 >> 6) & 14) | 1572864 | (i11 & 112), 176);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C13637h(z6, interfaceC1426a, interfaceC1436k, i10, 3);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final ArrayList m8205j(AbstractC12935u abstractC12935u, boolean z6) {
        ArrayList arrayList = new ArrayList();
        if (!z6) {
            arrayList.add(abstractC12935u);
        }
        for (AbstractC12935u abstractC12935u2 = abstractC12935u.f41093b; abstractC12935u2 != null; abstractC12935u2 = abstractC12935u2.f41096e) {
            arrayList.add(abstractC12935u2);
            AbstractC12935u abstractC12935u3 = abstractC12935u2.f41093b;
            if (abstractC12935u3 != null) {
                arrayList.addAll(m8205j(abstractC12935u3, false));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006c A[LOOP:0: B:4:0x000d->B:37:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x006f A[EDGE_INSN: B:42:0x006f->B:38:0x006f BREAK  A[LOOP:0: B:4:0x000d->B:37:0x006c], SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC21701k0 m8206k(C21658D c21658d) {
        AbstractC10458p abstractC10458p = (AbstractC10458p) c21658d.f68638I0.f3471f;
        Object obj = null;
        if ((abstractC10458p.f30963p0 & 8) != 0) {
            loop0: while (abstractC10458p != null) {
                if ((abstractC10458p.f30962o0 & 8) == 0) {
                    if ((abstractC10458p.f30963p0 & 8) != 0) {
                        break;
                        break;
                    }
                    abstractC10458p = abstractC10458p.f30965r0;
                } else {
                    AbstractC10458p abstractC10458pM22201f = abstractC10458p;
                    C6546d c6546d = null;
                    while (abstractC10458pM22201f != null) {
                        if (abstractC10458pM22201f instanceof InterfaceC21701k0) {
                            if (((InterfaceC21701k0) abstractC10458pM22201f).mo432u0()) {
                                obj = abstractC10458pM22201f;
                                break loop0;
                            }
                        } else if ((abstractC10458pM22201f.f30962o0 & 8) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                            int i10 = 0;
                            for (AbstractC10458p abstractC10458p2 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p2 != null; abstractC10458p2 = abstractC10458p2.f30965r0) {
                                if ((abstractC10458p2.f30962o0 & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        abstractC10458pM22201f = abstractC10458p2;
                                    } else {
                                        if (c6546d == null) {
                                            c6546d = new C6546d(new AbstractC10458p[16]);
                                        }
                                        if (abstractC10458pM22201f != null) {
                                            c6546d.m7099c(abstractC10458pM22201f);
                                            abstractC10458pM22201f = null;
                                        }
                                        c6546d.m7099c(abstractC10458p2);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d);
                    }
                    if ((abstractC10458p.f30963p0 & 8) != 0) {
                        break;
                    }
                    abstractC10458p = abstractC10458p.f30965r0;
                }
            }
        }
        return (InterfaceC21701k0) obj;
    }
}
