package ge;

import af.C10561Q;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bf.C11349D;
import com.openai.chatgpt.R;
import com.openai.feature.conversations.impl.conversation.AbstractC12312a;
import com.openai.feature.conversations.impl.conversation.ConversationViewModel;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.messages.audio.MessageAudioViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import gf.C14127l;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0280q;
import p017Af.C0488s;
import p025An.C0644w;
import p040Bd.EnumC0940I4;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2062k;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C22020j1;
import p121Ef.C2428e;
import p124Ei.C2473Q0;
import p153Fn.C2925c;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3924I;
import p229J0.AbstractC3943L0;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4033c3;
import p229J0.C3949M0;
import p229J0.C3991U3;
import p229J0.C4156x0;
import p349O0.AbstractC6012k0;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.C6035w;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p403Qd.C6597C;
import p478Tc.AbstractC7313q;
import p478Tc.C7299c;
import p479Td.C7326L;
import p479Td.C7351f0;
import p479Td.EnumC7359j0;
import p482Tg.C7445b0;
import p523V9.AbstractC7958O5;
import p523V9.AbstractC8142m4;
import p527Ve.C8272i;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8577W2;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p563X1.C9032l;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9815U2;
import p623Zf.C10312h;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p679ce.C11717h;
import p722e8.C13298H;
import p749fd.C13628m;
import p774h1.C14365u;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17780r;
import p926of.C18160X;
import pf.AbstractC18397m;
import pf.C18398n;

/* JADX INFO: renamed from: ge.k0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14085k0 {
    static {
        C22020j1.Companion.getClass();
        new C6597C(new C7351f0("messageId", null, null, null, EnumC7359j0.f23343Z, new C7326L("Hello, world!"), "gpt-4o-mini", null, null, null, null, null, EnumC0940I4.f2702p0, null, "gpt-4o-mini", false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, -41078, 511));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:104:0x0325  */
    /* JADX WARN: Code duplicated, block: B:107:0x033d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0361 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0363  */
    /* JADX WARN: Code duplicated, block: B:114:0x0386 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x0388  */
    /* JADX WARN: Code duplicated, block: B:118:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:119:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:122:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:124:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:127:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:130:0x049a  */
    /* JADX WARN: Code duplicated, block: B:132:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:141:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:143:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:145:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:147:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:149:0x0505  */
    /* JADX WARN: Code duplicated, block: B:151:0x050b  */
    /* JADX WARN: Code duplicated, block: B:153:0x051c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0524  */
    /* JADX WARN: Code duplicated, block: B:157:0x052a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0530  */
    /* JADX WARN: Code duplicated, block: B:161:0x0541  */
    /* JADX WARN: Code duplicated, block: B:163:0x0548  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0108  */
    /* JADX WARN: Code duplicated, block: B:61:0x0149  */
    /* JADX WARN: Code duplicated, block: B:63:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x015f  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0209  */
    /* JADX WARN: Code duplicated, block: B:84:0x0237 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0239  */
    /* JADX WARN: Code duplicated, block: B:88:0x023f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0241  */
    /* JADX WARN: Code duplicated, block: B:92:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x0284  */
    /* JADX WARN: Code duplicated, block: B:96:0x02c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x02c4  */
    /* JADX INFO: renamed from: a */
    public static final void m15486a(InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k2, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        InterfaceC1436k interfaceC1436k3;
        int i14;
        C10456n c10456n;
        InterfaceC10459q interfaceC10459q3;
        InterfaceC1436k interfaceC1436k4;
        AbstractC6012k0 abstractC6012k0;
        Context context;
        AbstractC6012k0 abstractC6012k1;
        boolean zBooleanValue;
        AbstractC6012k0 abstractC6012k2;
        List list;
        InterfaceC2062k interfaceC2062k;
        ViewModelStoreOwner viewModelStoreOwnerM12165a;
        C16527D c16527d;
        boolean zM6542f;
        Object objM6514H;
        Object obj;
        ConversationViewModel conversationViewModel;
        Context context2;
        boolean zBooleanValue2;
        List list2;
        InterfaceC2062k interfaceC2062k2;
        ViewModelStoreOwner viewModelStoreOwnerM12165a2;
        boolean zM6542f2;
        Object objM6514H2;
        MessagesViewModel messagesViewModel;
        Context context3;
        boolean zBooleanValue3;
        List list3;
        InterfaceC2062k interfaceC2062k3;
        ViewModelStoreOwner viewModelStoreOwnerM12165a3;
        boolean zM6542f3;
        Object objM6514H3;
        MessageAudioViewModel messageAudioViewModel;
        C8870f c8870f;
        C14111x0 c14111x0;
        boolean zM6542f4;
        Object objM6514H4;
        boolean zM6545h;
        Object objM6514H5;
        boolean zM6545h2;
        Object objM6514H6;
        InterfaceC5985X interfaceC5985XM9805a;
        Object objM6514H7;
        Object objM6514H8;
        C7299c c7299c;
        boolean zM6545h3;
        Object objM6514H9;
        boolean zM6542f5;
        Object objM6514H10;
        int i15;
        InterfaceC1426a interfaceC1426a;
        C21694h c21694h;
        Object objM6514H11;
        InterfaceC1436k interfaceC1436k5;
        boolean zM6545h4;
        Object objM6514H12;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(1207098758);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(interfaceC1436k) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    interfaceC1436k3 = interfaceC1436k2;
                    if (c6021p.m6545h(interfaceC1436k3)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i12 & 147) == 146 || !c6021p.m6562y()) {
                    c10456n = C10456n.f30959Y;
                    if (i16 != 0) {
                        interfaceC10459q3 = c10456n;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        interfaceC1436k4 = C14060X.f44204o0;
                    } else {
                        interfaceC1436k4 = interfaceC1436k3;
                    }
                    c6021p.m6524S(-1020152108);
                    abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
                    context = (Context) c6021p.m6548k(abstractC6012k0);
                    abstractC6012k1 = AbstractC0233b1.f873a;
                    zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                    abstractC6012k2 = AbstractC16421b.f50950a;
                    list = (List) c6021p.m6548k(abstractC6012k2);
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
                    viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                    if (viewModelStoreOwnerM12165a == null) {
                        throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                    }
                    c16527d = AbstractC16526C.f51263a;
                    Object objMo5693b = c16527d.mo5693b(ConversationViewModel.class);
                    Object objMo5693b2 = c16527d.mo5693b(C14111x0.class);
                    c6021p.m6524S(-1395498839);
                    zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                    objM6514H = c6021p.m6514H();
                    obj = C6013l.f19514a;
                    if (zM6542f || objM6514H == obj) {
                        if (zBooleanValue) {
                            ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                            throw null;
                        }
                        if (zBooleanValue) {
                            throw new C0644w();
                        }
                        objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                        c6021p.m6537c0(objM6514H);
                    }
                    BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                    c6021p.m6553p(false);
                    InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                    c6021p.m6553p(false);
                    conversationViewModel = (ConversationViewModel) baseViewModel;
                    c6021p.m6524S(-1020152108);
                    context2 = (Context) c6021p.m6548k(abstractC6012k0);
                    zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                    list2 = (List) c6021p.m6548k(abstractC6012k2);
                    c6021p.m6524S(-1395507574);
                    if (zBooleanValue2) {
                        interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
                    } else {
                        if (zBooleanValue2) {
                            throw new C0644w();
                        }
                        interfaceC2062k2 = null;
                    }
                    c6021p.m6553p(false);
                    viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
                    if (viewModelStoreOwnerM12165a2 == null) {
                        throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                    }
                    Object objMo5693b3 = c16527d.mo5693b(MessagesViewModel.class);
                    Object objMo5693b4 = c16527d.mo5693b(C18160X.class);
                    c6021p.m6524S(-1395498839);
                    zM6542f2 = c6021p.m6542f(objMo5693b4) | c6021p.m6542f(objMo5693b3) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6542f2 || objM6514H2 == obj) {
                        if (zBooleanValue2) {
                            ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                            throw null;
                        }
                        if (zBooleanValue2) {
                            throw new C0644w();
                        }
                        Object objM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                        c6021p.m6537c0(objM14398a);
                        objM6514H2 = objM14398a;
                    }
                    BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H2;
                    c6021p.m6553p(false);
                    InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
                    c6021p.m6553p(false);
                    messagesViewModel = (MessagesViewModel) baseViewModel2;
                    c6021p.m6524S(-1020152108);
                    context3 = (Context) c6021p.m6548k(abstractC6012k0);
                    zBooleanValue3 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                    list3 = (List) c6021p.m6548k(abstractC6012k2);
                    c6021p.m6524S(-1395507574);
                    if (zBooleanValue3) {
                        interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18398n.class));
                    } else {
                        if (zBooleanValue3) {
                            throw new C0644w();
                        }
                        interfaceC2062k3 = null;
                    }
                    c6021p.m6553p(false);
                    viewModelStoreOwnerM12165a3 = LocalViewModelStoreOwner.m12165a(c6021p);
                    if (viewModelStoreOwnerM12165a3 == null) {
                        throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                    }
                    Object objMo5693b5 = c16527d.mo5693b(MessageAudioViewModel.class);
                    Object objMo5693b6 = c16527d.mo5693b(C18398n.class);
                    c6021p.m6524S(-1395498839);
                    zM6542f3 = c6021p.m6542f(objMo5693b5) | c6021p.m6542f(objMo5693b6) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
                    objM6514H3 = c6021p.m6514H();
                    if (zM6542f3 || objM6514H3 == obj) {
                        if (zBooleanValue3) {
                            ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18398n.class), c16527d.mo5693b(MessageAudioViewModel.class), context3, interfaceC2062k3);
                            throw null;
                        }
                        if (zBooleanValue3) {
                            throw new C0644w();
                        }
                        objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageAudioViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                        c6021p.m6537c0(objM6514H3);
                    }
                    BaseViewModel baseViewModel3 = (BaseViewModel) objM6514H3;
                    c6021p.m6553p(false);
                    InternalViewModelEffectKt.m14374a(baseViewModel3, c6021p, 0);
                    c6021p.m6553p(false);
                    messageAudioViewModel = (MessageAudioViewModel) baseViewModel3;
                    c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                    c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
                    c6021p.m6524S(1694901484);
                    zM6542f4 = c6021p.m6542f(conversationViewModel);
                    objM6514H4 = c6021p.m6514H();
                    if (zM6542f4 || objM6514H4 == obj) {
                        objM6514H4 = new C7445b0(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 20);
                        c6021p.m6537c0(objM6514H4);
                    }
                    InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H4;
                    c6021p.m6553p(false);
                    C18160X c18160x = (C18160X) AbstractC9112C3.m9642d(messagesViewModel.f40343c, c6021p).getValue();
                    c6021p.m6524S(1694906344);
                    zM6545h = c6021p.m6545h(messagesViewModel);
                    objM6514H5 = c6021p.m6514H();
                    if (zM6545h || objM6514H5 == obj) {
                        objM6514H5 = new C7445b0(1, messagesViewModel, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 22);
                        c6021p.m6537c0(objM6514H5);
                    }
                    InterfaceC3759g interfaceC3759g2 = (InterfaceC3759g) objM6514H5;
                    c6021p.m6553p(false);
                    c6021p.m6524S(1694908396);
                    zM6545h2 = c6021p.m6545h(messageAudioViewModel);
                    objM6514H6 = c6021p.m6514H();
                    if (zM6545h2 || objM6514H6 == obj) {
                        objM6514H6 = new C7445b0(1, messageAudioViewModel, MessageAudioViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 21);
                        c6021p.m6537c0(objM6514H6);
                    }
                    InterfaceC3759g interfaceC3759g3 = (InterfaceC3759g) objM6514H6;
                    c6021p.m6553p(false);
                    interfaceC5985XM9805a = AbstractC9233X.m9805a(messageAudioViewModel.f40343c, C14060X.f44205p0, c6021p, 48);
                    objM6514H7 = c6021p.m6514H();
                    if (objM6514H7 == obj) {
                        objM6514H7 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                    }
                    C2925c c2925c = ((C6035w) objM6514H7).f19668Y;
                    c6021p.m6524S(1694915025);
                    objM6514H8 = c6021p.m6514H();
                    if (objM6514H8 == obj) {
                        objM6514H8 = new C7299c();
                        c6021p.m6537c0(objM6514H8);
                    }
                    c7299c = (C7299c) objM6514H8;
                    c6021p.m6553p(false);
                    c6021p.m6524S(1694917140);
                    zM6545h3 = c6021p.m6545h(c8870f) | c6021p.m6542f(c14111x0);
                    objM6514H9 = c6021p.m6514H();
                    if (zM6545h3 || objM6514H9 == obj) {
                        objM6514H9 = new C14083j0(c8870f, c14111x0, 0);
                        c6021p.m6537c0(objM6514H9);
                    }
                    InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H9;
                    c6021p.m6553p(false);
                    boolean z6 = c14111x0.f44427p0;
                    c6021p.m6524S(1694922490);
                    zM6542f5 = c6021p.m6542f(conversationViewModel);
                    objM6514H10 = c6021p.m6514H();
                    if (zM6542f5 || objM6514H10 == obj) {
                        objM6514H10 = new C11717h(conversationViewModel, 1);
                        c6021p.m6537c0(objM6514H10);
                    }
                    c6021p.m6553p(false);
                    AbstractC8577W2.m9239a(0, 0, (InterfaceC1426a) objM6514H10, c6021p, z6);
                    InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                    InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                    i15 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                    InterfaceC21700k.f68875m0.getClass();
                    interfaceC1426a = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(interfaceC1426a);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                        AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    c6021p.m6524S(993630801);
                    objM6514H11 = c6021p.m6514H();
                    if (objM6514H11 == obj) {
                        objM6514H11 = new C13628m(c7299c, 7);
                        c6021p.m6537c0(objM6514H11);
                    }
                    c6021p.m6553p(false);
                    InterfaceC10459q interfaceC10459q4 = interfaceC10459q3;
                    AbstractC4033c3.m4723a(AbstractC10443a.m10921b(c10456n, C0280q.f1030t0, new C14127l((InterfaceC1436k) objM6514H11, 12, null)), AbstractC8411c.m8969c(-1255998256, c6021p, new C0488s(interfaceC1436k, c14111x0, c8870f, interfaceC1426a2, interfaceC20904w, c2925c)), null, null, null, 0, 0L, 0L, null, AbstractC8411c.m8969c(-1608570085, c6021p, new C2428e(c14111x0, interfaceC3759g, interfaceC3759g2, interfaceC3759g3, interfaceC1426a2, interfaceC1436k4)), c6021p, 805306416, 508);
                    AbstractC7958O5.m8248a(0, c6021p);
                    AbstractC12312a.m14259a(c14111x0, (InterfaceC1436k) interfaceC3759g, c14111x0, c18160x, (InterfaceC1436k) interfaceC3759g2, c7299c, c6021p, 196608);
                    c6021p.m6524S(993951519);
                    if (((Boolean) interfaceC5985XM9805a.getValue()).booleanValue()) {
                        c6021p.m6524S(993954377);
                        zM6545h4 = c6021p.m6545h(messageAudioViewModel);
                        objM6514H12 = c6021p.m6514H();
                        if (zM6545h4 || objM6514H12 == obj) {
                            objM6514H12 = new C13298H(messageAudioViewModel, 10);
                            c6021p.m6537c0(objM6514H12);
                        }
                        c6021p.m6553p(false);
                        AbstractC18397m.m19866b(0, (InterfaceC1426a) objM6514H12, c6021p, null);
                    }
                    c6021p.m6553p(false);
                    c6021p.m6553p(true);
                    interfaceC1436k5 = interfaceC1436k4;
                    interfaceC10459q2 = interfaceC10459q4;
                } else {
                    c6021p.m6517L();
                    interfaceC1436k5 = interfaceC1436k3;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C9032l(interfaceC1436k, interfaceC10459q2, interfaceC1436k5, i10, i11, 1);
                }
            }
            i12 |= 384;
            interfaceC1436k3 = interfaceC1436k2;
            if ((i12 & 147) == 146) {
                c10456n = C10456n.f30959Y;
                if (i16 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    interfaceC1436k4 = C14060X.f44204o0;
                } else {
                    interfaceC1436k4 = interfaceC1436k3;
                }
                c6021p.m6524S(-1020152108);
                abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
                context = (Context) c6021p.m6548k(abstractC6012k0);
                abstractC6012k1 = AbstractC0233b1.f873a;
                zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                abstractC6012k2 = AbstractC16421b.f50950a;
                list = (List) c6021p.m6548k(abstractC6012k2);
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
                viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                c16527d = AbstractC16526C.f51263a;
                Object objMo5693b7 = c16527d.mo5693b(ConversationViewModel.class);
                Object objMo5693b8 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b8) | c6021p.m6542f(objMo5693b7) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                if (zM6542f) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel4 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel4, c6021p, 0);
                c6021p.m6553p(false);
                conversationViewModel = (ConversationViewModel) baseViewModel4;
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                list2 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue2) {
                    interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
                } else {
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    interfaceC2062k2 = null;
                }
                c6021p.m6553p(false);
                viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a2 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                Object objMo5693b9 = c16527d.mo5693b(MessagesViewModel.class);
                Object objMo5693b10 = c16527d.mo5693b(C18160X.class);
                c6021p.m6524S(-1395498839);
                zM6542f2 = c6021p.m6542f(objMo5693b10) | c6021p.m6542f(objMo5693b9) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    Object objM14398a2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM14398a2);
                    objM6514H2 = objM14398a2;
                } else {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    Object objM14398a3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM14398a3);
                    objM6514H2 = objM14398a3;
                }
                BaseViewModel baseViewModel5 = (BaseViewModel) objM6514H2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel5, c6021p, 0);
                c6021p.m6553p(false);
                messagesViewModel = (MessagesViewModel) baseViewModel5;
                c6021p.m6524S(-1020152108);
                context3 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue3 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                list3 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue3) {
                    interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18398n.class));
                } else {
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    interfaceC2062k3 = null;
                }
                c6021p.m6553p(false);
                viewModelStoreOwnerM12165a3 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a3 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                Object objMo5693b11 = c16527d.mo5693b(MessageAudioViewModel.class);
                Object objMo5693b12 = c16527d.mo5693b(C18398n.class);
                c6021p.m6524S(-1395498839);
                zM6542f3 = c6021p.m6542f(objMo5693b11) | c6021p.m6542f(objMo5693b12) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
                objM6514H3 = c6021p.m6514H();
                if (zM6542f3) {
                    if (zBooleanValue3) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18398n.class), c16527d.mo5693b(MessageAudioViewModel.class), context3, interfaceC2062k3);
                        throw null;
                    }
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageAudioViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    if (zBooleanValue3) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18398n.class), c16527d.mo5693b(MessageAudioViewModel.class), context3, interfaceC2062k3);
                        throw null;
                    }
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageAudioViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                    c6021p.m6537c0(objM6514H3);
                }
                BaseViewModel baseViewModel6 = (BaseViewModel) objM6514H3;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel6, c6021p, 0);
                c6021p.m6553p(false);
                messageAudioViewModel = (MessageAudioViewModel) baseViewModel6;
                c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
                c6021p.m6524S(1694901484);
                zM6542f4 = c6021p.m6542f(conversationViewModel);
                objM6514H4 = c6021p.m6514H();
                if (zM6542f4) {
                    objM6514H4 = new C7445b0(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 20);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C7445b0(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 20);
                    c6021p.m6537c0(objM6514H4);
                }
                InterfaceC3759g interfaceC3759g4 = (InterfaceC3759g) objM6514H4;
                c6021p.m6553p(false);
                C18160X c18160x2 = (C18160X) AbstractC9112C3.m9642d(messagesViewModel.f40343c, c6021p).getValue();
                c6021p.m6524S(1694906344);
                zM6545h = c6021p.m6545h(messagesViewModel);
                objM6514H5 = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H5 = new C7445b0(1, messagesViewModel, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 22);
                    c6021p.m6537c0(objM6514H5);
                } else {
                    objM6514H5 = new C7445b0(1, messagesViewModel, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 22);
                    c6021p.m6537c0(objM6514H5);
                }
                InterfaceC3759g interfaceC3759g5 = (InterfaceC3759g) objM6514H5;
                c6021p.m6553p(false);
                c6021p.m6524S(1694908396);
                zM6545h2 = c6021p.m6545h(messageAudioViewModel);
                objM6514H6 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H6 = new C7445b0(1, messageAudioViewModel, MessageAudioViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 21);
                    c6021p.m6537c0(objM6514H6);
                } else {
                    objM6514H6 = new C7445b0(1, messageAudioViewModel, MessageAudioViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 21);
                    c6021p.m6537c0(objM6514H6);
                }
                InterfaceC3759g interfaceC3759g6 = (InterfaceC3759g) objM6514H6;
                c6021p.m6553p(false);
                interfaceC5985XM9805a = AbstractC9233X.m9805a(messageAudioViewModel.f40343c, C14060X.f44205p0, c6021p, 48);
                objM6514H7 = c6021p.m6514H();
                if (objM6514H7 == obj) {
                    objM6514H7 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                C2925c c2925c2 = ((C6035w) objM6514H7).f19668Y;
                c6021p.m6524S(1694915025);
                objM6514H8 = c6021p.m6514H();
                if (objM6514H8 == obj) {
                    objM6514H8 = new C7299c();
                    c6021p.m6537c0(objM6514H8);
                }
                c7299c = (C7299c) objM6514H8;
                c6021p.m6553p(false);
                c6021p.m6524S(1694917140);
                zM6545h3 = c6021p.m6545h(c8870f) | c6021p.m6542f(c14111x0);
                objM6514H9 = c6021p.m6514H();
                if (zM6545h3) {
                    objM6514H9 = new C14083j0(c8870f, c14111x0, 0);
                    c6021p.m6537c0(objM6514H9);
                } else {
                    objM6514H9 = new C14083j0(c8870f, c14111x0, 0);
                    c6021p.m6537c0(objM6514H9);
                }
                InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H9;
                c6021p.m6553p(false);
                boolean z10 = c14111x0.f44427p0;
                c6021p.m6524S(1694922490);
                zM6542f5 = c6021p.m6542f(conversationViewModel);
                objM6514H10 = c6021p.m6514H();
                if (zM6542f5) {
                    objM6514H10 = new C11717h(conversationViewModel, 1);
                    c6021p.m6537c0(objM6514H10);
                } else {
                    objM6514H10 = new C11717h(conversationViewModel, 1);
                    c6021p.m6537c0(objM6514H10);
                }
                c6021p.m6553p(false);
                AbstractC8577W2.m9239a(0, 0, (InterfaceC1426a) objM6514H10, c6021p, z10);
                InterfaceC20904w interfaceC20904w2 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                InterfaceC21700k.f68875m0.getClass();
                interfaceC1426a = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e2);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                } else {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
                c6021p.m6524S(993630801);
                objM6514H11 = c6021p.m6514H();
                if (objM6514H11 == obj) {
                    objM6514H11 = new C13628m(c7299c, 7);
                    c6021p.m6537c0(objM6514H11);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459q5 = interfaceC10459q3;
                AbstractC4033c3.m4723a(AbstractC10443a.m10921b(c10456n, C0280q.f1030t0, new C14127l((InterfaceC1436k) objM6514H11, 12, null)), AbstractC8411c.m8969c(-1255998256, c6021p, new C0488s(interfaceC1436k, c14111x0, c8870f, interfaceC1426a3, interfaceC20904w2, c2925c2)), null, null, null, 0, 0L, 0L, null, AbstractC8411c.m8969c(-1608570085, c6021p, new C2428e(c14111x0, interfaceC3759g4, interfaceC3759g5, interfaceC3759g6, interfaceC1426a3, interfaceC1436k4)), c6021p, 805306416, 508);
                AbstractC7958O5.m8248a(0, c6021p);
                AbstractC12312a.m14259a(c14111x0, (InterfaceC1436k) interfaceC3759g4, c14111x0, c18160x2, (InterfaceC1436k) interfaceC3759g5, c7299c, c6021p, 196608);
                c6021p.m6524S(993951519);
                if (((Boolean) interfaceC5985XM9805a.getValue()).booleanValue()) {
                    c6021p.m6524S(993954377);
                    zM6545h4 = c6021p.m6545h(messageAudioViewModel);
                    objM6514H12 = c6021p.m6514H();
                    if (zM6545h4) {
                        objM6514H12 = new C13298H(messageAudioViewModel, 10);
                        c6021p.m6537c0(objM6514H12);
                    } else {
                        objM6514H12 = new C13298H(messageAudioViewModel, 10);
                        c6021p.m6537c0(objM6514H12);
                    }
                    c6021p.m6553p(false);
                    AbstractC18397m.m19866b(0, (InterfaceC1426a) objM6514H12, c6021p, null);
                }
                c6021p.m6553p(false);
                c6021p.m6553p(true);
                interfaceC1436k5 = interfaceC1436k4;
                interfaceC10459q2 = interfaceC10459q5;
            } else {
                c10456n = C10456n.f30959Y;
                if (i16 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    interfaceC1436k4 = C14060X.f44204o0;
                } else {
                    interfaceC1436k4 = interfaceC1436k3;
                }
                c6021p.m6524S(-1020152108);
                abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
                context = (Context) c6021p.m6548k(abstractC6012k0);
                abstractC6012k1 = AbstractC0233b1.f873a;
                zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                abstractC6012k2 = AbstractC16421b.f50950a;
                list = (List) c6021p.m6548k(abstractC6012k2);
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
                viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                c16527d = AbstractC16526C.f51263a;
                Object objMo5693b13 = c16527d.mo5693b(ConversationViewModel.class);
                Object objMo5693b14 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b14) | c6021p.m6542f(objMo5693b13) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                if (zM6542f) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel7 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel7, c6021p, 0);
                c6021p.m6553p(false);
                conversationViewModel = (ConversationViewModel) baseViewModel7;
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                list2 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue2) {
                    interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
                } else {
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    interfaceC2062k2 = null;
                }
                c6021p.m6553p(false);
                viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a2 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                Object objMo5693b15 = c16527d.mo5693b(MessagesViewModel.class);
                Object objMo5693b16 = c16527d.mo5693b(C18160X.class);
                c6021p.m6524S(-1395498839);
                zM6542f2 = c6021p.m6542f(objMo5693b16) | c6021p.m6542f(objMo5693b15) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    Object objM14398a4 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM14398a4);
                    objM6514H2 = objM14398a4;
                } else {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    Object objM14398a5 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM14398a5);
                    objM6514H2 = objM14398a5;
                }
                BaseViewModel baseViewModel8 = (BaseViewModel) objM6514H2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel8, c6021p, 0);
                c6021p.m6553p(false);
                messagesViewModel = (MessagesViewModel) baseViewModel8;
                c6021p.m6524S(-1020152108);
                context3 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue3 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                list3 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue3) {
                    interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18398n.class));
                } else {
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    interfaceC2062k3 = null;
                }
                c6021p.m6553p(false);
                viewModelStoreOwnerM12165a3 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a3 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                Object objMo5693b17 = c16527d.mo5693b(MessageAudioViewModel.class);
                Object objMo5693b18 = c16527d.mo5693b(C18398n.class);
                c6021p.m6524S(-1395498839);
                zM6542f3 = c6021p.m6542f(objMo5693b17) | c6021p.m6542f(objMo5693b18) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
                objM6514H3 = c6021p.m6514H();
                if (zM6542f3) {
                    if (zBooleanValue3) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18398n.class), c16527d.mo5693b(MessageAudioViewModel.class), context3, interfaceC2062k3);
                        throw null;
                    }
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageAudioViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    if (zBooleanValue3) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18398n.class), c16527d.mo5693b(MessageAudioViewModel.class), context3, interfaceC2062k3);
                        throw null;
                    }
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageAudioViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                    c6021p.m6537c0(objM6514H3);
                }
                BaseViewModel baseViewModel9 = (BaseViewModel) objM6514H3;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel9, c6021p, 0);
                c6021p.m6553p(false);
                messageAudioViewModel = (MessageAudioViewModel) baseViewModel9;
                c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
                c6021p.m6524S(1694901484);
                zM6542f4 = c6021p.m6542f(conversationViewModel);
                objM6514H4 = c6021p.m6514H();
                if (zM6542f4) {
                    objM6514H4 = new C7445b0(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 20);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C7445b0(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 20);
                    c6021p.m6537c0(objM6514H4);
                }
                InterfaceC3759g interfaceC3759g7 = (InterfaceC3759g) objM6514H4;
                c6021p.m6553p(false);
                C18160X c18160x3 = (C18160X) AbstractC9112C3.m9642d(messagesViewModel.f40343c, c6021p).getValue();
                c6021p.m6524S(1694906344);
                zM6545h = c6021p.m6545h(messagesViewModel);
                objM6514H5 = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H5 = new C7445b0(1, messagesViewModel, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 22);
                    c6021p.m6537c0(objM6514H5);
                } else {
                    objM6514H5 = new C7445b0(1, messagesViewModel, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 22);
                    c6021p.m6537c0(objM6514H5);
                }
                InterfaceC3759g interfaceC3759g8 = (InterfaceC3759g) objM6514H5;
                c6021p.m6553p(false);
                c6021p.m6524S(1694908396);
                zM6545h2 = c6021p.m6545h(messageAudioViewModel);
                objM6514H6 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H6 = new C7445b0(1, messageAudioViewModel, MessageAudioViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 21);
                    c6021p.m6537c0(objM6514H6);
                } else {
                    objM6514H6 = new C7445b0(1, messageAudioViewModel, MessageAudioViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 21);
                    c6021p.m6537c0(objM6514H6);
                }
                InterfaceC3759g interfaceC3759g9 = (InterfaceC3759g) objM6514H6;
                c6021p.m6553p(false);
                interfaceC5985XM9805a = AbstractC9233X.m9805a(messageAudioViewModel.f40343c, C14060X.f44205p0, c6021p, 48);
                objM6514H7 = c6021p.m6514H();
                if (objM6514H7 == obj) {
                    objM6514H7 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                C2925c c2925c3 = ((C6035w) objM6514H7).f19668Y;
                c6021p.m6524S(1694915025);
                objM6514H8 = c6021p.m6514H();
                if (objM6514H8 == obj) {
                    objM6514H8 = new C7299c();
                    c6021p.m6537c0(objM6514H8);
                }
                c7299c = (C7299c) objM6514H8;
                c6021p.m6553p(false);
                c6021p.m6524S(1694917140);
                zM6545h3 = c6021p.m6545h(c8870f) | c6021p.m6542f(c14111x0);
                objM6514H9 = c6021p.m6514H();
                if (zM6545h3) {
                    objM6514H9 = new C14083j0(c8870f, c14111x0, 0);
                    c6021p.m6537c0(objM6514H9);
                } else {
                    objM6514H9 = new C14083j0(c8870f, c14111x0, 0);
                    c6021p.m6537c0(objM6514H9);
                }
                InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) objM6514H9;
                c6021p.m6553p(false);
                boolean z11 = c14111x0.f44427p0;
                c6021p.m6524S(1694922490);
                zM6542f5 = c6021p.m6542f(conversationViewModel);
                objM6514H10 = c6021p.m6514H();
                if (zM6542f5) {
                    objM6514H10 = new C11717h(conversationViewModel, 1);
                    c6021p.m6537c0(objM6514H10);
                } else {
                    objM6514H10 = new C11717h(conversationViewModel, 1);
                    c6021p.m6537c0(objM6514H10);
                }
                c6021p.m6553p(false);
                AbstractC8577W2.m9239a(0, 0, (InterfaceC1426a) objM6514H10, c6021p, z11);
                InterfaceC20904w interfaceC20904w3 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                InterfaceC21700k.f68875m0.getClass();
                interfaceC1426a = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e3);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                } else {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
                c6021p.m6524S(993630801);
                objM6514H11 = c6021p.m6514H();
                if (objM6514H11 == obj) {
                    objM6514H11 = new C13628m(c7299c, 7);
                    c6021p.m6537c0(objM6514H11);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459q6 = interfaceC10459q3;
                AbstractC4033c3.m4723a(AbstractC10443a.m10921b(c10456n, C0280q.f1030t0, new C14127l((InterfaceC1436k) objM6514H11, 12, null)), AbstractC8411c.m8969c(-1255998256, c6021p, new C0488s(interfaceC1436k, c14111x0, c8870f, interfaceC1426a4, interfaceC20904w3, c2925c3)), null, null, null, 0, 0L, 0L, null, AbstractC8411c.m8969c(-1608570085, c6021p, new C2428e(c14111x0, interfaceC3759g7, interfaceC3759g8, interfaceC3759g9, interfaceC1426a4, interfaceC1436k4)), c6021p, 805306416, 508);
                AbstractC7958O5.m8248a(0, c6021p);
                AbstractC12312a.m14259a(c14111x0, (InterfaceC1436k) interfaceC3759g7, c14111x0, c18160x3, (InterfaceC1436k) interfaceC3759g8, c7299c, c6021p, 196608);
                c6021p.m6524S(993951519);
                if (((Boolean) interfaceC5985XM9805a.getValue()).booleanValue()) {
                    c6021p.m6524S(993954377);
                    zM6545h4 = c6021p.m6545h(messageAudioViewModel);
                    objM6514H12 = c6021p.m6514H();
                    if (zM6545h4) {
                        objM6514H12 = new C13298H(messageAudioViewModel, 10);
                        c6021p.m6537c0(objM6514H12);
                    } else {
                        objM6514H12 = new C13298H(messageAudioViewModel, 10);
                        c6021p.m6537c0(objM6514H12);
                    }
                    c6021p.m6553p(false);
                    AbstractC18397m.m19866b(0, (InterfaceC1426a) objM6514H12, c6021p, null);
                }
                c6021p.m6553p(false);
                c6021p.m6553p(true);
                interfaceC1436k5 = interfaceC1436k4;
                interfaceC10459q2 = interfaceC10459q6;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C9032l(interfaceC1436k, interfaceC10459q2, interfaceC1436k5, i10, i11, 1);
            }
        }
        i12 |= 48;
        interfaceC10459q2 = interfaceC10459q;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                interfaceC1436k3 = interfaceC1436k2;
                if (c6021p.m6545h(interfaceC1436k3)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & 147) == 146) {
                c10456n = C10456n.f30959Y;
                if (i16 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    interfaceC1436k4 = C14060X.f44204o0;
                } else {
                    interfaceC1436k4 = interfaceC1436k3;
                }
                c6021p.m6524S(-1020152108);
                abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
                context = (Context) c6021p.m6548k(abstractC6012k0);
                abstractC6012k1 = AbstractC0233b1.f873a;
                zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                abstractC6012k2 = AbstractC16421b.f50950a;
                list = (List) c6021p.m6548k(abstractC6012k2);
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
                viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                c16527d = AbstractC16526C.f51263a;
                Object objMo5693b19 = c16527d.mo5693b(ConversationViewModel.class);
                Object objMo5693b110 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b110) | c6021p.m6542f(objMo5693b19) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                if (zM6542f) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel10 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel10, c6021p, 0);
                c6021p.m6553p(false);
                conversationViewModel = (ConversationViewModel) baseViewModel10;
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                list2 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue2) {
                    interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
                } else {
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    interfaceC2062k2 = null;
                }
                c6021p.m6553p(false);
                viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a2 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                Object objMo5693b111 = c16527d.mo5693b(MessagesViewModel.class);
                Object objMo5693b112 = c16527d.mo5693b(C18160X.class);
                c6021p.m6524S(-1395498839);
                zM6542f2 = c6021p.m6542f(objMo5693b112) | c6021p.m6542f(objMo5693b111) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    Object objM14398a6 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM14398a6);
                    objM6514H2 = objM14398a6;
                } else {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    Object objM14398a7 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM14398a7);
                    objM6514H2 = objM14398a7;
                }
                BaseViewModel baseViewModel11 = (BaseViewModel) objM6514H2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel11, c6021p, 0);
                c6021p.m6553p(false);
                messagesViewModel = (MessagesViewModel) baseViewModel11;
                c6021p.m6524S(-1020152108);
                context3 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue3 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                list3 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue3) {
                    interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18398n.class));
                } else {
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    interfaceC2062k3 = null;
                }
                c6021p.m6553p(false);
                viewModelStoreOwnerM12165a3 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a3 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                Object objMo5693b113 = c16527d.mo5693b(MessageAudioViewModel.class);
                Object objMo5693b114 = c16527d.mo5693b(C18398n.class);
                c6021p.m6524S(-1395498839);
                zM6542f3 = c6021p.m6542f(objMo5693b113) | c6021p.m6542f(objMo5693b114) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
                objM6514H3 = c6021p.m6514H();
                if (zM6542f3) {
                    if (zBooleanValue3) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18398n.class), c16527d.mo5693b(MessageAudioViewModel.class), context3, interfaceC2062k3);
                        throw null;
                    }
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageAudioViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    if (zBooleanValue3) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18398n.class), c16527d.mo5693b(MessageAudioViewModel.class), context3, interfaceC2062k3);
                        throw null;
                    }
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageAudioViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                    c6021p.m6537c0(objM6514H3);
                }
                BaseViewModel baseViewModel12 = (BaseViewModel) objM6514H3;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel12, c6021p, 0);
                c6021p.m6553p(false);
                messageAudioViewModel = (MessageAudioViewModel) baseViewModel12;
                c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
                c6021p.m6524S(1694901484);
                zM6542f4 = c6021p.m6542f(conversationViewModel);
                objM6514H4 = c6021p.m6514H();
                if (zM6542f4) {
                    objM6514H4 = new C7445b0(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 20);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C7445b0(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 20);
                    c6021p.m6537c0(objM6514H4);
                }
                InterfaceC3759g interfaceC3759g10 = (InterfaceC3759g) objM6514H4;
                c6021p.m6553p(false);
                C18160X c18160x4 = (C18160X) AbstractC9112C3.m9642d(messagesViewModel.f40343c, c6021p).getValue();
                c6021p.m6524S(1694906344);
                zM6545h = c6021p.m6545h(messagesViewModel);
                objM6514H5 = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H5 = new C7445b0(1, messagesViewModel, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 22);
                    c6021p.m6537c0(objM6514H5);
                } else {
                    objM6514H5 = new C7445b0(1, messagesViewModel, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 22);
                    c6021p.m6537c0(objM6514H5);
                }
                InterfaceC3759g interfaceC3759g11 = (InterfaceC3759g) objM6514H5;
                c6021p.m6553p(false);
                c6021p.m6524S(1694908396);
                zM6545h2 = c6021p.m6545h(messageAudioViewModel);
                objM6514H6 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H6 = new C7445b0(1, messageAudioViewModel, MessageAudioViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 21);
                    c6021p.m6537c0(objM6514H6);
                } else {
                    objM6514H6 = new C7445b0(1, messageAudioViewModel, MessageAudioViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 21);
                    c6021p.m6537c0(objM6514H6);
                }
                InterfaceC3759g interfaceC3759g12 = (InterfaceC3759g) objM6514H6;
                c6021p.m6553p(false);
                interfaceC5985XM9805a = AbstractC9233X.m9805a(messageAudioViewModel.f40343c, C14060X.f44205p0, c6021p, 48);
                objM6514H7 = c6021p.m6514H();
                if (objM6514H7 == obj) {
                    objM6514H7 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                C2925c c2925c4 = ((C6035w) objM6514H7).f19668Y;
                c6021p.m6524S(1694915025);
                objM6514H8 = c6021p.m6514H();
                if (objM6514H8 == obj) {
                    objM6514H8 = new C7299c();
                    c6021p.m6537c0(objM6514H8);
                }
                c7299c = (C7299c) objM6514H8;
                c6021p.m6553p(false);
                c6021p.m6524S(1694917140);
                zM6545h3 = c6021p.m6545h(c8870f) | c6021p.m6542f(c14111x0);
                objM6514H9 = c6021p.m6514H();
                if (zM6545h3) {
                    objM6514H9 = new C14083j0(c8870f, c14111x0, 0);
                    c6021p.m6537c0(objM6514H9);
                } else {
                    objM6514H9 = new C14083j0(c8870f, c14111x0, 0);
                    c6021p.m6537c0(objM6514H9);
                }
                InterfaceC1426a interfaceC1426a5 = (InterfaceC1426a) objM6514H9;
                c6021p.m6553p(false);
                boolean z12 = c14111x0.f44427p0;
                c6021p.m6524S(1694922490);
                zM6542f5 = c6021p.m6542f(conversationViewModel);
                objM6514H10 = c6021p.m6514H();
                if (zM6542f5) {
                    objM6514H10 = new C11717h(conversationViewModel, 1);
                    c6021p.m6537c0(objM6514H10);
                } else {
                    objM6514H10 = new C11717h(conversationViewModel, 1);
                    c6021p.m6537c0(objM6514H10);
                }
                c6021p.m6553p(false);
                AbstractC8577W2.m9239a(0, 0, (InterfaceC1426a) objM6514H10, c6021p, z12);
                InterfaceC20904w interfaceC20904w4 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                InterfaceC21057K interfaceC21057KM19511e4 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                InterfaceC21700k.f68875m0.getClass();
                interfaceC1426a = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e4);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m4);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                } else {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d4);
                c6021p.m6524S(993630801);
                objM6514H11 = c6021p.m6514H();
                if (objM6514H11 == obj) {
                    objM6514H11 = new C13628m(c7299c, 7);
                    c6021p.m6537c0(objM6514H11);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459q7 = interfaceC10459q3;
                AbstractC4033c3.m4723a(AbstractC10443a.m10921b(c10456n, C0280q.f1030t0, new C14127l((InterfaceC1436k) objM6514H11, 12, null)), AbstractC8411c.m8969c(-1255998256, c6021p, new C0488s(interfaceC1436k, c14111x0, c8870f, interfaceC1426a5, interfaceC20904w4, c2925c4)), null, null, null, 0, 0L, 0L, null, AbstractC8411c.m8969c(-1608570085, c6021p, new C2428e(c14111x0, interfaceC3759g10, interfaceC3759g11, interfaceC3759g12, interfaceC1426a5, interfaceC1436k4)), c6021p, 805306416, 508);
                AbstractC7958O5.m8248a(0, c6021p);
                AbstractC12312a.m14259a(c14111x0, (InterfaceC1436k) interfaceC3759g10, c14111x0, c18160x4, (InterfaceC1436k) interfaceC3759g11, c7299c, c6021p, 196608);
                c6021p.m6524S(993951519);
                if (((Boolean) interfaceC5985XM9805a.getValue()).booleanValue()) {
                    c6021p.m6524S(993954377);
                    zM6545h4 = c6021p.m6545h(messageAudioViewModel);
                    objM6514H12 = c6021p.m6514H();
                    if (zM6545h4) {
                        objM6514H12 = new C13298H(messageAudioViewModel, 10);
                        c6021p.m6537c0(objM6514H12);
                    } else {
                        objM6514H12 = new C13298H(messageAudioViewModel, 10);
                        c6021p.m6537c0(objM6514H12);
                    }
                    c6021p.m6553p(false);
                    AbstractC18397m.m19866b(0, (InterfaceC1426a) objM6514H12, c6021p, null);
                }
                c6021p.m6553p(false);
                c6021p.m6553p(true);
                interfaceC1436k5 = interfaceC1436k4;
                interfaceC10459q2 = interfaceC10459q7;
            } else {
                c10456n = C10456n.f30959Y;
                if (i16 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    interfaceC1436k4 = C14060X.f44204o0;
                } else {
                    interfaceC1436k4 = interfaceC1436k3;
                }
                c6021p.m6524S(-1020152108);
                abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
                context = (Context) c6021p.m6548k(abstractC6012k0);
                abstractC6012k1 = AbstractC0233b1.f873a;
                zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                abstractC6012k2 = AbstractC16421b.f50950a;
                list = (List) c6021p.m6548k(abstractC6012k2);
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
                viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                c16527d = AbstractC16526C.f51263a;
                Object objMo5693b115 = c16527d.mo5693b(ConversationViewModel.class);
                Object objMo5693b116 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b116) | c6021p.m6542f(objMo5693b115) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                if (zM6542f) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel13 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel13, c6021p, 0);
                c6021p.m6553p(false);
                conversationViewModel = (ConversationViewModel) baseViewModel13;
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                list2 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue2) {
                    interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
                } else {
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    interfaceC2062k2 = null;
                }
                c6021p.m6553p(false);
                viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a2 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                Object objMo5693b117 = c16527d.mo5693b(MessagesViewModel.class);
                Object objMo5693b118 = c16527d.mo5693b(C18160X.class);
                c6021p.m6524S(-1395498839);
                zM6542f2 = c6021p.m6542f(objMo5693b118) | c6021p.m6542f(objMo5693b117) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    Object objM14398a8 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM14398a8);
                    objM6514H2 = objM14398a8;
                } else {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    Object objM14398a9 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM14398a9);
                    objM6514H2 = objM14398a9;
                }
                BaseViewModel baseViewModel14 = (BaseViewModel) objM6514H2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel14, c6021p, 0);
                c6021p.m6553p(false);
                messagesViewModel = (MessagesViewModel) baseViewModel14;
                c6021p.m6524S(-1020152108);
                context3 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue3 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                list3 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue3) {
                    interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18398n.class));
                } else {
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    interfaceC2062k3 = null;
                }
                c6021p.m6553p(false);
                viewModelStoreOwnerM12165a3 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a3 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                Object objMo5693b119 = c16527d.mo5693b(MessageAudioViewModel.class);
                Object objMo5693b1110 = c16527d.mo5693b(C18398n.class);
                c6021p.m6524S(-1395498839);
                zM6542f3 = c6021p.m6542f(objMo5693b119) | c6021p.m6542f(objMo5693b1110) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
                objM6514H3 = c6021p.m6514H();
                if (zM6542f3) {
                    if (zBooleanValue3) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18398n.class), c16527d.mo5693b(MessageAudioViewModel.class), context3, interfaceC2062k3);
                        throw null;
                    }
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageAudioViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    if (zBooleanValue3) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18398n.class), c16527d.mo5693b(MessageAudioViewModel.class), context3, interfaceC2062k3);
                        throw null;
                    }
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageAudioViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                    c6021p.m6537c0(objM6514H3);
                }
                BaseViewModel baseViewModel15 = (BaseViewModel) objM6514H3;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel15, c6021p, 0);
                c6021p.m6553p(false);
                messageAudioViewModel = (MessageAudioViewModel) baseViewModel15;
                c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
                c6021p.m6524S(1694901484);
                zM6542f4 = c6021p.m6542f(conversationViewModel);
                objM6514H4 = c6021p.m6514H();
                if (zM6542f4) {
                    objM6514H4 = new C7445b0(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 20);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C7445b0(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 20);
                    c6021p.m6537c0(objM6514H4);
                }
                InterfaceC3759g interfaceC3759g13 = (InterfaceC3759g) objM6514H4;
                c6021p.m6553p(false);
                C18160X c18160x5 = (C18160X) AbstractC9112C3.m9642d(messagesViewModel.f40343c, c6021p).getValue();
                c6021p.m6524S(1694906344);
                zM6545h = c6021p.m6545h(messagesViewModel);
                objM6514H5 = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H5 = new C7445b0(1, messagesViewModel, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 22);
                    c6021p.m6537c0(objM6514H5);
                } else {
                    objM6514H5 = new C7445b0(1, messagesViewModel, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 22);
                    c6021p.m6537c0(objM6514H5);
                }
                InterfaceC3759g interfaceC3759g14 = (InterfaceC3759g) objM6514H5;
                c6021p.m6553p(false);
                c6021p.m6524S(1694908396);
                zM6545h2 = c6021p.m6545h(messageAudioViewModel);
                objM6514H6 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H6 = new C7445b0(1, messageAudioViewModel, MessageAudioViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 21);
                    c6021p.m6537c0(objM6514H6);
                } else {
                    objM6514H6 = new C7445b0(1, messageAudioViewModel, MessageAudioViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 21);
                    c6021p.m6537c0(objM6514H6);
                }
                InterfaceC3759g interfaceC3759g15 = (InterfaceC3759g) objM6514H6;
                c6021p.m6553p(false);
                interfaceC5985XM9805a = AbstractC9233X.m9805a(messageAudioViewModel.f40343c, C14060X.f44205p0, c6021p, 48);
                objM6514H7 = c6021p.m6514H();
                if (objM6514H7 == obj) {
                    objM6514H7 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
                }
                C2925c c2925c5 = ((C6035w) objM6514H7).f19668Y;
                c6021p.m6524S(1694915025);
                objM6514H8 = c6021p.m6514H();
                if (objM6514H8 == obj) {
                    objM6514H8 = new C7299c();
                    c6021p.m6537c0(objM6514H8);
                }
                c7299c = (C7299c) objM6514H8;
                c6021p.m6553p(false);
                c6021p.m6524S(1694917140);
                zM6545h3 = c6021p.m6545h(c8870f) | c6021p.m6542f(c14111x0);
                objM6514H9 = c6021p.m6514H();
                if (zM6545h3) {
                    objM6514H9 = new C14083j0(c8870f, c14111x0, 0);
                    c6021p.m6537c0(objM6514H9);
                } else {
                    objM6514H9 = new C14083j0(c8870f, c14111x0, 0);
                    c6021p.m6537c0(objM6514H9);
                }
                InterfaceC1426a interfaceC1426a6 = (InterfaceC1426a) objM6514H9;
                c6021p.m6553p(false);
                boolean z13 = c14111x0.f44427p0;
                c6021p.m6524S(1694922490);
                zM6542f5 = c6021p.m6542f(conversationViewModel);
                objM6514H10 = c6021p.m6514H();
                if (zM6542f5) {
                    objM6514H10 = new C11717h(conversationViewModel, 1);
                    c6021p.m6537c0(objM6514H10);
                } else {
                    objM6514H10 = new C11717h(conversationViewModel, 1);
                    c6021p.m6537c0(objM6514H10);
                }
                c6021p.m6553p(false);
                AbstractC8577W2.m9239a(0, 0, (InterfaceC1426a) objM6514H10, c6021p, z13);
                InterfaceC20904w interfaceC20904w5 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                InterfaceC21057K interfaceC21057KM19511e5 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                InterfaceC21700k.f68875m0.getClass();
                interfaceC1426a = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e5);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m5);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                } else {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d5);
                c6021p.m6524S(993630801);
                objM6514H11 = c6021p.m6514H();
                if (objM6514H11 == obj) {
                    objM6514H11 = new C13628m(c7299c, 7);
                    c6021p.m6537c0(objM6514H11);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459q8 = interfaceC10459q3;
                AbstractC4033c3.m4723a(AbstractC10443a.m10921b(c10456n, C0280q.f1030t0, new C14127l((InterfaceC1436k) objM6514H11, 12, null)), AbstractC8411c.m8969c(-1255998256, c6021p, new C0488s(interfaceC1436k, c14111x0, c8870f, interfaceC1426a6, interfaceC20904w5, c2925c5)), null, null, null, 0, 0L, 0L, null, AbstractC8411c.m8969c(-1608570085, c6021p, new C2428e(c14111x0, interfaceC3759g13, interfaceC3759g14, interfaceC3759g15, interfaceC1426a6, interfaceC1436k4)), c6021p, 805306416, 508);
                AbstractC7958O5.m8248a(0, c6021p);
                AbstractC12312a.m14259a(c14111x0, (InterfaceC1436k) interfaceC3759g13, c14111x0, c18160x5, (InterfaceC1436k) interfaceC3759g14, c7299c, c6021p, 196608);
                c6021p.m6524S(993951519);
                if (((Boolean) interfaceC5985XM9805a.getValue()).booleanValue()) {
                    c6021p.m6524S(993954377);
                    zM6545h4 = c6021p.m6545h(messageAudioViewModel);
                    objM6514H12 = c6021p.m6514H();
                    if (zM6545h4) {
                        objM6514H12 = new C13298H(messageAudioViewModel, 10);
                        c6021p.m6537c0(objM6514H12);
                    } else {
                        objM6514H12 = new C13298H(messageAudioViewModel, 10);
                        c6021p.m6537c0(objM6514H12);
                    }
                    c6021p.m6553p(false);
                    AbstractC18397m.m19866b(0, (InterfaceC1426a) objM6514H12, c6021p, null);
                }
                c6021p.m6553p(false);
                c6021p.m6553p(true);
                interfaceC1436k5 = interfaceC1436k4;
                interfaceC10459q2 = interfaceC10459q8;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C9032l(interfaceC1436k, interfaceC10459q2, interfaceC1436k5, i10, i11, 1);
            }
        }
        i12 |= 384;
        interfaceC1436k3 = interfaceC1436k2;
        if ((i12 & 147) == 146) {
            c10456n = C10456n.f30959Y;
            if (i16 != 0) {
                interfaceC10459q3 = c10456n;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            if (i13 != 0) {
                interfaceC1436k4 = C14060X.f44204o0;
            } else {
                interfaceC1436k4 = interfaceC1436k3;
            }
            c6021p.m6524S(-1020152108);
            abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
            context = (Context) c6021p.m6548k(abstractC6012k0);
            abstractC6012k1 = AbstractC0233b1.f873a;
            zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            abstractC6012k2 = AbstractC16421b.f50950a;
            list = (List) c6021p.m6548k(abstractC6012k2);
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
            viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            c16527d = AbstractC16526C.f51263a;
            Object objMo5693b1111 = c16527d.mo5693b(ConversationViewModel.class);
            Object objMo5693b1112 = c16527d.mo5693b(C14111x0.class);
            c6021p.m6524S(-1395498839);
            zM6542f = c6021p.m6542f(objMo5693b1112) | c6021p.m6542f(objMo5693b1111) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            objM6514H = c6021p.m6514H();
            obj = C6013l.f19514a;
            if (zM6542f) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            } else {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel16 = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel16, c6021p, 0);
            c6021p.m6553p(false);
            conversationViewModel = (ConversationViewModel) baseViewModel16;
            c6021p.m6524S(-1020152108);
            context2 = (Context) c6021p.m6548k(abstractC6012k0);
            zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            list2 = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue2) {
                interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
            } else {
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                interfaceC2062k2 = null;
            }
            c6021p.m6553p(false);
            viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a2 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            Object objMo5693b1113 = c16527d.mo5693b(MessagesViewModel.class);
            Object objMo5693b1114 = c16527d.mo5693b(C18160X.class);
            c6021p.m6524S(-1395498839);
            zM6542f2 = c6021p.m6542f(objMo5693b1114) | c6021p.m6542f(objMo5693b1113) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f2) {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                Object objM14398a10 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM14398a10);
                objM6514H2 = objM14398a10;
            } else {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                Object objM14398a11 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM14398a11);
                objM6514H2 = objM14398a11;
            }
            BaseViewModel baseViewModel17 = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel17, c6021p, 0);
            c6021p.m6553p(false);
            messagesViewModel = (MessagesViewModel) baseViewModel17;
            c6021p.m6524S(-1020152108);
            context3 = (Context) c6021p.m6548k(abstractC6012k0);
            zBooleanValue3 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            list3 = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue3) {
                interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18398n.class));
            } else {
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                interfaceC2062k3 = null;
            }
            c6021p.m6553p(false);
            viewModelStoreOwnerM12165a3 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a3 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            Object objMo5693b1115 = c16527d.mo5693b(MessageAudioViewModel.class);
            Object objMo5693b1116 = c16527d.mo5693b(C18398n.class);
            c6021p.m6524S(-1395498839);
            zM6542f3 = c6021p.m6542f(objMo5693b1115) | c6021p.m6542f(objMo5693b1116) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
            objM6514H3 = c6021p.m6514H();
            if (zM6542f3) {
                if (zBooleanValue3) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18398n.class), c16527d.mo5693b(MessageAudioViewModel.class), context3, interfaceC2062k3);
                    throw null;
                }
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageAudioViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                c6021p.m6537c0(objM6514H3);
            } else {
                if (zBooleanValue3) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18398n.class), c16527d.mo5693b(MessageAudioViewModel.class), context3, interfaceC2062k3);
                    throw null;
                }
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageAudioViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                c6021p.m6537c0(objM6514H3);
            }
            BaseViewModel baseViewModel18 = (BaseViewModel) objM6514H3;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel18, c6021p, 0);
            c6021p.m6553p(false);
            messageAudioViewModel = (MessageAudioViewModel) baseViewModel18;
            c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(1694901484);
            zM6542f4 = c6021p.m6542f(conversationViewModel);
            objM6514H4 = c6021p.m6514H();
            if (zM6542f4) {
                objM6514H4 = new C7445b0(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 20);
                c6021p.m6537c0(objM6514H4);
            } else {
                objM6514H4 = new C7445b0(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 20);
                c6021p.m6537c0(objM6514H4);
            }
            InterfaceC3759g interfaceC3759g16 = (InterfaceC3759g) objM6514H4;
            c6021p.m6553p(false);
            C18160X c18160x6 = (C18160X) AbstractC9112C3.m9642d(messagesViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(1694906344);
            zM6545h = c6021p.m6545h(messagesViewModel);
            objM6514H5 = c6021p.m6514H();
            if (zM6545h) {
                objM6514H5 = new C7445b0(1, messagesViewModel, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 22);
                c6021p.m6537c0(objM6514H5);
            } else {
                objM6514H5 = new C7445b0(1, messagesViewModel, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 22);
                c6021p.m6537c0(objM6514H5);
            }
            InterfaceC3759g interfaceC3759g17 = (InterfaceC3759g) objM6514H5;
            c6021p.m6553p(false);
            c6021p.m6524S(1694908396);
            zM6545h2 = c6021p.m6545h(messageAudioViewModel);
            objM6514H6 = c6021p.m6514H();
            if (zM6545h2) {
                objM6514H6 = new C7445b0(1, messageAudioViewModel, MessageAudioViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 21);
                c6021p.m6537c0(objM6514H6);
            } else {
                objM6514H6 = new C7445b0(1, messageAudioViewModel, MessageAudioViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 21);
                c6021p.m6537c0(objM6514H6);
            }
            InterfaceC3759g interfaceC3759g18 = (InterfaceC3759g) objM6514H6;
            c6021p.m6553p(false);
            interfaceC5985XM9805a = AbstractC9233X.m9805a(messageAudioViewModel.f40343c, C14060X.f44205p0, c6021p, 48);
            objM6514H7 = c6021p.m6514H();
            if (objM6514H7 == obj) {
                objM6514H7 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            C2925c c2925c6 = ((C6035w) objM6514H7).f19668Y;
            c6021p.m6524S(1694915025);
            objM6514H8 = c6021p.m6514H();
            if (objM6514H8 == obj) {
                objM6514H8 = new C7299c();
                c6021p.m6537c0(objM6514H8);
            }
            c7299c = (C7299c) objM6514H8;
            c6021p.m6553p(false);
            c6021p.m6524S(1694917140);
            zM6545h3 = c6021p.m6545h(c8870f) | c6021p.m6542f(c14111x0);
            objM6514H9 = c6021p.m6514H();
            if (zM6545h3) {
                objM6514H9 = new C14083j0(c8870f, c14111x0, 0);
                c6021p.m6537c0(objM6514H9);
            } else {
                objM6514H9 = new C14083j0(c8870f, c14111x0, 0);
                c6021p.m6537c0(objM6514H9);
            }
            InterfaceC1426a interfaceC1426a7 = (InterfaceC1426a) objM6514H9;
            c6021p.m6553p(false);
            boolean z14 = c14111x0.f44427p0;
            c6021p.m6524S(1694922490);
            zM6542f5 = c6021p.m6542f(conversationViewModel);
            objM6514H10 = c6021p.m6514H();
            if (zM6542f5) {
                objM6514H10 = new C11717h(conversationViewModel, 1);
                c6021p.m6537c0(objM6514H10);
            } else {
                objM6514H10 = new C11717h(conversationViewModel, 1);
                c6021p.m6537c0(objM6514H10);
            }
            c6021p.m6553p(false);
            AbstractC8577W2.m9239a(0, 0, (InterfaceC1426a) objM6514H10, c6021p, z14);
            InterfaceC20904w interfaceC20904w6 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            InterfaceC21057K interfaceC21057KM19511e6 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
            InterfaceC21700k.f68875m0.getClass();
            interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e6);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m6);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            } else {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d6);
            c6021p.m6524S(993630801);
            objM6514H11 = c6021p.m6514H();
            if (objM6514H11 == obj) {
                objM6514H11 = new C13628m(c7299c, 7);
                c6021p.m6537c0(objM6514H11);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459q9 = interfaceC10459q3;
            AbstractC4033c3.m4723a(AbstractC10443a.m10921b(c10456n, C0280q.f1030t0, new C14127l((InterfaceC1436k) objM6514H11, 12, null)), AbstractC8411c.m8969c(-1255998256, c6021p, new C0488s(interfaceC1436k, c14111x0, c8870f, interfaceC1426a7, interfaceC20904w6, c2925c6)), null, null, null, 0, 0L, 0L, null, AbstractC8411c.m8969c(-1608570085, c6021p, new C2428e(c14111x0, interfaceC3759g16, interfaceC3759g17, interfaceC3759g18, interfaceC1426a7, interfaceC1436k4)), c6021p, 805306416, 508);
            AbstractC7958O5.m8248a(0, c6021p);
            AbstractC12312a.m14259a(c14111x0, (InterfaceC1436k) interfaceC3759g16, c14111x0, c18160x6, (InterfaceC1436k) interfaceC3759g17, c7299c, c6021p, 196608);
            c6021p.m6524S(993951519);
            if (((Boolean) interfaceC5985XM9805a.getValue()).booleanValue()) {
                c6021p.m6524S(993954377);
                zM6545h4 = c6021p.m6545h(messageAudioViewModel);
                objM6514H12 = c6021p.m6514H();
                if (zM6545h4) {
                    objM6514H12 = new C13298H(messageAudioViewModel, 10);
                    c6021p.m6537c0(objM6514H12);
                } else {
                    objM6514H12 = new C13298H(messageAudioViewModel, 10);
                    c6021p.m6537c0(objM6514H12);
                }
                c6021p.m6553p(false);
                AbstractC18397m.m19866b(0, (InterfaceC1426a) objM6514H12, c6021p, null);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            interfaceC1436k5 = interfaceC1436k4;
            interfaceC10459q2 = interfaceC10459q9;
        } else {
            c10456n = C10456n.f30959Y;
            if (i16 != 0) {
                interfaceC10459q3 = c10456n;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            if (i13 != 0) {
                interfaceC1436k4 = C14060X.f44204o0;
            } else {
                interfaceC1436k4 = interfaceC1436k3;
            }
            c6021p.m6524S(-1020152108);
            abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
            context = (Context) c6021p.m6548k(abstractC6012k0);
            abstractC6012k1 = AbstractC0233b1.f873a;
            zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            abstractC6012k2 = AbstractC16421b.f50950a;
            list = (List) c6021p.m6548k(abstractC6012k2);
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
            viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            c16527d = AbstractC16526C.f51263a;
            Object objMo5693b1117 = c16527d.mo5693b(ConversationViewModel.class);
            Object objMo5693b1118 = c16527d.mo5693b(C14111x0.class);
            c6021p.m6524S(-1395498839);
            zM6542f = c6021p.m6542f(objMo5693b1118) | c6021p.m6542f(objMo5693b1117) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            objM6514H = c6021p.m6514H();
            obj = C6013l.f19514a;
            if (zM6542f) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            } else {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel19 = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel19, c6021p, 0);
            c6021p.m6553p(false);
            conversationViewModel = (ConversationViewModel) baseViewModel19;
            c6021p.m6524S(-1020152108);
            context2 = (Context) c6021p.m6548k(abstractC6012k0);
            zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            list2 = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue2) {
                interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
            } else {
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                interfaceC2062k2 = null;
            }
            c6021p.m6553p(false);
            viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a2 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            Object objMo5693b1119 = c16527d.mo5693b(MessagesViewModel.class);
            Object objMo5693b11110 = c16527d.mo5693b(C18160X.class);
            c6021p.m6524S(-1395498839);
            zM6542f2 = c6021p.m6542f(objMo5693b11110) | c6021p.m6542f(objMo5693b1119) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f2) {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                Object objM14398a12 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM14398a12);
                objM6514H2 = objM14398a12;
            } else {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                Object objM14398a13 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM14398a13);
                objM6514H2 = objM14398a13;
            }
            BaseViewModel baseViewModel110 = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel110, c6021p, 0);
            c6021p.m6553p(false);
            messagesViewModel = (MessagesViewModel) baseViewModel110;
            c6021p.m6524S(-1020152108);
            context3 = (Context) c6021p.m6548k(abstractC6012k0);
            zBooleanValue3 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            list3 = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue3) {
                interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18398n.class));
            } else {
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                interfaceC2062k3 = null;
            }
            c6021p.m6553p(false);
            viewModelStoreOwnerM12165a3 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a3 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            Object objMo5693b11111 = c16527d.mo5693b(MessageAudioViewModel.class);
            Object objMo5693b11112 = c16527d.mo5693b(C18398n.class);
            c6021p.m6524S(-1395498839);
            zM6542f3 = c6021p.m6542f(objMo5693b11111) | c6021p.m6542f(objMo5693b11112) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
            objM6514H3 = c6021p.m6514H();
            if (zM6542f3) {
                if (zBooleanValue3) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18398n.class), c16527d.mo5693b(MessageAudioViewModel.class), context3, interfaceC2062k3);
                    throw null;
                }
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageAudioViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                c6021p.m6537c0(objM6514H3);
            } else {
                if (zBooleanValue3) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18398n.class), c16527d.mo5693b(MessageAudioViewModel.class), context3, interfaceC2062k3);
                    throw null;
                }
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                objM6514H3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessageAudioViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                c6021p.m6537c0(objM6514H3);
            }
            BaseViewModel baseViewModel111 = (BaseViewModel) objM6514H3;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel111, c6021p, 0);
            c6021p.m6553p(false);
            messageAudioViewModel = (MessageAudioViewModel) baseViewModel111;
            c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(1694901484);
            zM6542f4 = c6021p.m6542f(conversationViewModel);
            objM6514H4 = c6021p.m6514H();
            if (zM6542f4) {
                objM6514H4 = new C7445b0(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 20);
                c6021p.m6537c0(objM6514H4);
            } else {
                objM6514H4 = new C7445b0(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 20);
                c6021p.m6537c0(objM6514H4);
            }
            InterfaceC3759g interfaceC3759g19 = (InterfaceC3759g) objM6514H4;
            c6021p.m6553p(false);
            C18160X c18160x7 = (C18160X) AbstractC9112C3.m9642d(messagesViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(1694906344);
            zM6545h = c6021p.m6545h(messagesViewModel);
            objM6514H5 = c6021p.m6514H();
            if (zM6545h) {
                objM6514H5 = new C7445b0(1, messagesViewModel, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 22);
                c6021p.m6537c0(objM6514H5);
            } else {
                objM6514H5 = new C7445b0(1, messagesViewModel, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 22);
                c6021p.m6537c0(objM6514H5);
            }
            InterfaceC3759g interfaceC3759g110 = (InterfaceC3759g) objM6514H5;
            c6021p.m6553p(false);
            c6021p.m6524S(1694908396);
            zM6545h2 = c6021p.m6545h(messageAudioViewModel);
            objM6514H6 = c6021p.m6514H();
            if (zM6545h2) {
                objM6514H6 = new C7445b0(1, messageAudioViewModel, MessageAudioViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 21);
                c6021p.m6537c0(objM6514H6);
            } else {
                objM6514H6 = new C7445b0(1, messageAudioViewModel, MessageAudioViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 21);
                c6021p.m6537c0(objM6514H6);
            }
            InterfaceC3759g interfaceC3759g111 = (InterfaceC3759g) objM6514H6;
            c6021p.m6553p(false);
            interfaceC5985XM9805a = AbstractC9233X.m9805a(messageAudioViewModel.f40343c, C14060X.f44205p0, c6021p, 48);
            objM6514H7 = c6021p.m6514H();
            if (objM6514H7 == obj) {
                objM6514H7 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
            }
            C2925c c2925c7 = ((C6035w) objM6514H7).f19668Y;
            c6021p.m6524S(1694915025);
            objM6514H8 = c6021p.m6514H();
            if (objM6514H8 == obj) {
                objM6514H8 = new C7299c();
                c6021p.m6537c0(objM6514H8);
            }
            c7299c = (C7299c) objM6514H8;
            c6021p.m6553p(false);
            c6021p.m6524S(1694917140);
            zM6545h3 = c6021p.m6545h(c8870f) | c6021p.m6542f(c14111x0);
            objM6514H9 = c6021p.m6514H();
            if (zM6545h3) {
                objM6514H9 = new C14083j0(c8870f, c14111x0, 0);
                c6021p.m6537c0(objM6514H9);
            } else {
                objM6514H9 = new C14083j0(c8870f, c14111x0, 0);
                c6021p.m6537c0(objM6514H9);
            }
            InterfaceC1426a interfaceC1426a8 = (InterfaceC1426a) objM6514H9;
            c6021p.m6553p(false);
            boolean z15 = c14111x0.f44427p0;
            c6021p.m6524S(1694922490);
            zM6542f5 = c6021p.m6542f(conversationViewModel);
            objM6514H10 = c6021p.m6514H();
            if (zM6542f5) {
                objM6514H10 = new C11717h(conversationViewModel, 1);
                c6021p.m6537c0(objM6514H10);
            } else {
                objM6514H10 = new C11717h(conversationViewModel, 1);
                c6021p.m6537c0(objM6514H10);
            }
            c6021p.m6553p(false);
            AbstractC8577W2.m9239a(0, 0, (InterfaceC1426a) objM6514H10, c6021p, z15);
            InterfaceC20904w interfaceC20904w7 = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            InterfaceC21057K interfaceC21057KM19511e7 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m7 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d7 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
            InterfaceC21700k.f68875m0.getClass();
            interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e7);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m7);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            } else {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d7);
            c6021p.m6524S(993630801);
            objM6514H11 = c6021p.m6514H();
            if (objM6514H11 == obj) {
                objM6514H11 = new C13628m(c7299c, 7);
                c6021p.m6537c0(objM6514H11);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459q10 = interfaceC10459q3;
            AbstractC4033c3.m4723a(AbstractC10443a.m10921b(c10456n, C0280q.f1030t0, new C14127l((InterfaceC1436k) objM6514H11, 12, null)), AbstractC8411c.m8969c(-1255998256, c6021p, new C0488s(interfaceC1436k, c14111x0, c8870f, interfaceC1426a8, interfaceC20904w7, c2925c7)), null, null, null, 0, 0L, 0L, null, AbstractC8411c.m8969c(-1608570085, c6021p, new C2428e(c14111x0, interfaceC3759g19, interfaceC3759g110, interfaceC3759g111, interfaceC1426a8, interfaceC1436k4)), c6021p, 805306416, 508);
            AbstractC7958O5.m8248a(0, c6021p);
            AbstractC12312a.m14259a(c14111x0, (InterfaceC1436k) interfaceC3759g19, c14111x0, c18160x7, (InterfaceC1436k) interfaceC3759g110, c7299c, c6021p, 196608);
            c6021p.m6524S(993951519);
            if (((Boolean) interfaceC5985XM9805a.getValue()).booleanValue()) {
                c6021p.m6524S(993954377);
                zM6545h4 = c6021p.m6545h(messageAudioViewModel);
                objM6514H12 = c6021p.m6514H();
                if (zM6545h4) {
                    objM6514H12 = new C13298H(messageAudioViewModel, 10);
                    c6021p.m6537c0(objM6514H12);
                } else {
                    objM6514H12 = new C13298H(messageAudioViewModel, 10);
                    c6021p.m6537c0(objM6514H12);
                }
                c6021p.m6553p(false);
                AbstractC18397m.m19866b(0, (InterfaceC1426a) objM6514H12, c6021p, null);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            interfaceC1436k5 = interfaceC1436k4;
            interfaceC10459q2 = interfaceC10459q10;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C9032l(interfaceC1436k, interfaceC10459q2, interfaceC1436k5, i10, i11, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m15487b(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C10843b c10843b = C10843b.f32509a;
        c6021p.m6526U(1051398472);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c10843b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC9815U2.m10447f(c10843b.m11240a(interfaceC10459q, C10444b.f30938q0), c6021p, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q, i10, 10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m15488c(int i10, InterfaceC1436k onIntent, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(1429340793);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(onIntent) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            float f10 = AbstractC3924I.f12062a;
            C5984W0 c5984w0 = AbstractC3959O0.f12302a;
            long j10 = ((C3949M0) c6021p.m6548k(c5984w0)).f12236r;
            long j11 = ((C3949M0) c6021p.m6548k(c5984w0)).f12223f;
            long j12 = ((C3949M0) c6021p.m6548k(c5984w0)).f12223f;
            long j13 = C14365u.f45060j;
            C4156x0 c4156x0M4786a = AbstractC3924I.m4627a((C3949M0) c6021p.m6548k(c5984w0)).m4786a(j10, j11, j12, j13, j13, j13, j13, j13);
            c6021p.m6524S(-1615286430);
            boolean z6 = (i12 & 14) == 4;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C10312h(10, onIntent);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3943L0.m4643a((InterfaceC1426a) objM6514H, AbstractC14070d.f44263a, c10456n, false, null, AbstractC14070d.f44264b, null, c4156x0M4786a, null, null, null, c6021p, ((i12 << 3) & 896) | 805503024, 0, 1368);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2473Q0(onIntent, interfaceC10459q2, i10, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m15489d(int i10, InterfaceC1436k onIntent, C6021p c6021p, InterfaceC10459q interfaceC10459q, C11349D c11349d) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-1229596883);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c11349d) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            String str = c11349d != null ? c11349d.f34319b : null;
            if (str == null) {
                str = "";
            }
            String strM8677e = AbstractC8142m4.m8677e(R.string.gizmo_non_plus_upsell_button, new Object[]{str}, c6021p);
            c6021p.m6524S(-1541878313);
            boolean z6 = (i12 & 112) == 32;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = new C10312h(11, onIntent);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H, AbstractC10842a.m11235m(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC7313q.f23201f, 0.0f, 2), false, null, null, null, null, null, null, AbstractC8411c.m8969c(-696883907, c6021p, new C3991U3(strM8677e, 8)), c6021p, 805306368, 508);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8272i(c11349d, onIntent, interfaceC10459q2, i10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m15490e(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        C10843b c10843b = C10843b.f32509a;
        c6021p.m6526U(-75534632);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c10843b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (((i11 | 48) & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            m15487b(c10843b.m11240a(interfaceC10459q, C10444b.f30938q0), c6021p, 0);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q, i10, 9);
        }
    }
}
