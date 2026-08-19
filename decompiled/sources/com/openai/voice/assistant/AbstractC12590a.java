package com.openai.voice.assistant;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.C10843b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.feature.voice.impl.VoiceModeViewModelImpl;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import com.openai.voice.VoiceModeViewModel;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0155B1;
import p003A1.C0184L0;
import p003A1.C0292u;
import p006A4.C0349j;
import p017Af.C0459F;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p092Dc.C2001r;
import p098Di.InterfaceC2062k;
import p1014t1.AbstractC19744u;
import p103Dn.C2153Q0;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.AbstractC2454H;
import p124Ei.C2469O0;
import p124Ei.C2471P0;
import p124Ei.C2532n1;
import p196Hi.AbstractC3454x;
import p196Hi.C3433c;
import p196Hi.C3434d;
import p196Hi.C3447q;
import p196Hi.C3448r;
import p196Hi.C3449s;
import p196Hi.C3450t;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p349O0.AbstractC6012k0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7300d;
import p478Tc.AbstractC7308l;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC7949N4;
import p523V9.AbstractC7965P4;
import p523V9.AbstractC7973Q4;
import p523V9.AbstractC8011V4;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8645h4;
import p544W9.AbstractC8742y;
import p544W9.AbstractC8748z;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9243Y3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17790w;
import p911o0.C17794y;
import p926of.C18160X;

/* JADX INFO: renamed from: com.openai.voice.assistant.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12590a {
    /* JADX WARN: Code duplicated, block: B:100:0x033d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x033f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0370  */
    /* JADX WARN: Code duplicated, block: B:107:0x039f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:111:0x03cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:115:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:116:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:119:0x03f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:125:0x042c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0430  */
    /* JADX WARN: Code duplicated, block: B:129:0x0445  */
    /* JADX WARN: Code duplicated, block: B:131:0x0453  */
    /* JADX WARN: Code duplicated, block: B:134:0x0479 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x047b  */
    /* JADX WARN: Code duplicated, block: B:138:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:139:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:142:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:144:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:147:0x0545  */
    /* JADX WARN: Code duplicated, block: B:149:0x059a  */
    /* JADX WARN: Code duplicated, block: B:152:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:154:0x05ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x0601  */
    /* JADX WARN: Code duplicated, block: B:157:0x062c  */
    /* JADX WARN: Code duplicated, block: B:160:0x063d  */
    /* JADX WARN: Code duplicated, block: B:162:0x064f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x0651  */
    /* JADX WARN: Code duplicated, block: B:166:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x0673  */
    /* JADX WARN: Code duplicated, block: B:169:0x069c  */
    /* JADX WARN: Code duplicated, block: B:172:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:174:0x06bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:178:0x06df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:182:0x0711 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x0713  */
    /* JADX WARN: Code duplicated, block: B:188:0x073b  */
    /* JADX WARN: Code duplicated, block: B:190:0x074b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0751  */
    /* JADX WARN: Code duplicated, block: B:194:0x075e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0766  */
    /* JADX WARN: Code duplicated, block: B:198:0x076c  */
    /* JADX WARN: Code duplicated, block: B:200:0x0772  */
    /* JADX WARN: Code duplicated, block: B:202:0x0783  */
    /* JADX WARN: Code duplicated, block: B:204:0x078b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0791  */
    /* JADX WARN: Code duplicated, block: B:208:0x0797  */
    /* JADX WARN: Code duplicated, block: B:210:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:212:0x07af  */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:48:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x0130  */
    /* JADX WARN: Code duplicated, block: B:51:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:55:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0162  */
    /* JADX WARN: Code duplicated, block: B:59:0x018f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x0191  */
    /* JADX WARN: Code duplicated, block: B:63:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0223  */
    /* JADX WARN: Code duplicated, block: B:73:0x0226 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0228  */
    /* JADX WARN: Code duplicated, block: B:77:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0255  */
    /* JADX WARN: Code duplicated, block: B:81:0x027f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x0281  */
    /* JADX WARN: Code duplicated, block: B:85:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:87:0x02d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:91:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:93:0x030b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x030d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0310 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0312  */
    /* JADX INFO: renamed from: b */
    public static final void m14403b(InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        C10456n c10456n;
        InterfaceC10459q interfaceC10459q3;
        C8870f c8870f;
        AbstractActivityC17375g abstractActivityC17375g;
        AbstractC6012k0 abstractC6012k0;
        Object obj;
        int i13;
        boolean z6;
        Object objM6514H;
        Object obj2;
        InterfaceC1436k interfaceC1436k2;
        Context context;
        AbstractC6012k0 abstractC6012k1;
        boolean zBooleanValue;
        AbstractC6012k0 abstractC6012k2;
        List list;
        boolean z10;
        InterfaceC2062k interfaceC2062k;
        ViewModelStoreOwner viewModelStoreOwnerM12165a;
        C16527D c16527d;
        boolean zM6542f;
        Object objM6514H2;
        BaseViewModel baseViewModel;
        InterfaceC5985X interfaceC5985XM19531n;
        boolean zM6545h;
        Object objM6514H3;
        VoiceModeViewModel voiceModeViewModel;
        boolean zM6545h2;
        Object objM6514H4;
        InterfaceC1436k interfaceC1436k3;
        Context context2;
        boolean zBooleanValue2;
        List list2;
        boolean z11;
        InterfaceC2062k interfaceC2062k2;
        ViewModelStoreOwner viewModelStoreOwnerM12165a2;
        boolean zM6542f2;
        Object objM6514H5;
        BaseViewModel baseViewModel2;
        InterfaceC5985X interfaceC5985XM19531n2;
        boolean zM6545h3;
        Object objM6514H6;
        AssistantViewModel assistantViewModel;
        boolean zM6545h4;
        Object objM6514H7;
        InterfaceC1436k interfaceC1436k4;
        Context context3;
        boolean zBooleanValue3;
        List list3;
        InterfaceC2062k interfaceC2062k3;
        ViewModelStoreOwner viewModelStoreOwnerM12165a3;
        boolean zM6542f3;
        Object objM6514H8;
        BaseViewModel baseViewModel3;
        InterfaceC5985X interfaceC5985XM19531n3;
        boolean zM6545h5;
        Object objM6514H9;
        Object obj3;
        C2532n1 c2532n1;
        Object objM6514H10;
        InterfaceC5985X interfaceC5985X;
        boolean zM6542f4;
        Object objM6514H11;
        boolean zM6545h6;
        Object objM6514H12;
        boolean z12;
        Object objM6514H13;
        int i14;
        InterfaceC1426a interfaceC1426a;
        C21694h c21694h;
        C10843b c10843b;
        boolean zM6545h7;
        Object objM6514H14;
        int i15;
        C10456n c10456n2;
        C10456n c10456n3;
        float f10;
        InterfaceC5985X interfaceC5985XM9805a;
        Object obj4;
        Object obj5;
        VoiceModeViewModel voiceModeViewModel2;
        InterfaceC10459q interfaceC10459q4;
        boolean zM6545h8;
        Object objM6514H15;
        boolean zM6545h9;
        Object objM6514H16;
        boolean zM6545h10;
        Object objM6514H17;
        boolean zM6545h11;
        Object objM6514H18;
        boolean zM6545h12;
        Object objM6514H19;
        boolean zM6542f5;
        Object objM6514H20;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(567297786);
        if ((i10 & 6) == 0) {
            i12 = i10 | (c6021p.m6545h(interfaceC1436k) ? 4 : 2);
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 32 : 16;
            }
            if ((i12 & 19) == 18 || !c6021p.m6562y()) {
                c10456n = C10456n.f30959Y;
                if (i16 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
                abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
                obj = (Context) c6021p.m6548k(abstractC6012k0);
                c6021p.m6524S(-2034427119);
                i13 = i12 & 14;
                if (i13 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM6514H = c6021p.m6514H();
                obj2 = C6013l.f19514a;
                if (z6 || objM6514H == obj2) {
                    objM6514H = new AssistantScreenKt$AssistantScreenContent$voiceViewModel$1$1(interfaceC1436k);
                    c6021p.m6537c0(objM6514H);
                }
                interfaceC1436k2 = (InterfaceC1436k) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(189483815);
                c6021p.m6524S(-1020152108);
                context = (Context) c6021p.m6548k(abstractC6012k0);
                abstractC6012k1 = AbstractC0233b1.f873a;
                zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                abstractC6012k2 = AbstractC16421b.f50950a;
                list = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C2532n1.class));
                    z10 = false;
                } else {
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    z10 = false;
                    interfaceC2062k = null;
                }
                c6021p.m6553p(z10);
                LocalViewModelStoreOwner.f33491a.getClass();
                viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                c16527d = AbstractC16526C.f51263a;
                Object objMo5693b = c16527d.mo5693b(VoiceModeViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C2532n1.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f || objM6514H2 == obj2) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C2532n1.class), c16527d.mo5693b(VoiceModeViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceModeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H2);
                }
                baseViewModel = (BaseViewModel) objM6514H2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k2, c6021p, -1395474517);
                zM6545h = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
                objM6514H3 = c6021p.m6514H();
                if (zM6545h || objM6514H3 == obj2) {
                    objM6514H3 = new C12587x94c95487(baseViewModel, interfaceC5985XM19531n, null);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
                c6021p.m6553p(false);
                voiceModeViewModel = (VoiceModeViewModel) baseViewModel;
                c6021p.m6524S(-2034420495);
                zM6545h2 = c6021p.m6545h(abstractActivityC17375g) | c6021p.m6545h(voiceModeViewModel);
                objM6514H4 = c6021p.m6514H();
                if (zM6545h2 || objM6514H4 == obj2) {
                    objM6514H4 = new AssistantScreenKt$AssistantScreenContent$assistantViewModel$1$1(abstractActivityC17375g, voiceModeViewModel);
                    c6021p.m6537c0(objM6514H4);
                }
                interfaceC1436k3 = (InterfaceC1436k) objM6514H4;
                c6021p.m6553p(false);
                c6021p.m6524S(189483815);
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                list2 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue2) {
                    interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C3450t.class));
                    z11 = false;
                } else {
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    z11 = false;
                    interfaceC2062k2 = null;
                }
                c6021p.m6553p(z11);
                viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a2 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                Object objMo5693b3 = c16527d.mo5693b(AssistantViewModel.class);
                Object objMo5693b4 = c16527d.mo5693b(C3450t.class);
                c6021p.m6524S(-1395498839);
                zM6542f2 = c6021p.m6542f(objMo5693b3) | c6021p.m6542f(objMo5693b4) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                objM6514H5 = c6021p.m6514H();
                if (zM6542f2 || objM6514H5 == obj2) {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C3450t.class), c16527d.mo5693b(AssistantViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    objM6514H5 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AssistantViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM6514H5);
                }
                baseViewModel2 = (BaseViewModel) objM6514H5;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
                interfaceC5985XM19531n2 = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k3, c6021p, -1395474517);
                zM6545h3 = c6021p.m6545h(baseViewModel2) | c6021p.m6542f(interfaceC5985XM19531n2);
                objM6514H6 = c6021p.m6514H();
                if (zM6545h3 || objM6514H6 == obj2) {
                    objM6514H6 = new C12588x94c95488(baseViewModel2, interfaceC5985XM19531n2, null);
                    c6021p.m6537c0(objM6514H6);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p, baseViewModel2);
                c6021p.m6553p(false);
                assistantViewModel = (AssistantViewModel) baseViewModel2;
                c6021p.m6524S(-2034408137);
                zM6545h4 = c6021p.m6545h(c8870f);
                objM6514H7 = c6021p.m6514H();
                if (zM6545h4 || objM6514H7 == obj2) {
                    objM6514H7 = new AssistantScreenKt$AssistantScreenContent$messagesViewModel$1$1(c8870f);
                    c6021p.m6537c0(objM6514H7);
                }
                interfaceC1436k4 = (InterfaceC1436k) objM6514H7;
                c6021p.m6553p(false);
                c6021p.m6524S(189483815);
                c6021p.m6524S(-1020152108);
                context3 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue3 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                list3 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue3) {
                    interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
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
                Object objMo5693b5 = c16527d.mo5693b(MessagesViewModel.class);
                Object objMo5693b6 = c16527d.mo5693b(C18160X.class);
                c6021p.m6524S(-1395498839);
                zM6542f3 = c6021p.m6542f(objMo5693b5) | c6021p.m6542f(objMo5693b6) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
                objM6514H8 = c6021p.m6514H();
                if (zM6542f3 || objM6514H8 == obj2) {
                    if (zBooleanValue3) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context3, interfaceC2062k3);
                        throw null;
                    }
                    if (zBooleanValue3) {
                        throw new C0644w();
                    }
                    objM6514H8 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                    c6021p.m6537c0(objM6514H8);
                }
                baseViewModel3 = (BaseViewModel) objM6514H8;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel3, c6021p, 0);
                interfaceC5985XM19531n3 = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k4, c6021p, -1395474517);
                zM6545h5 = c6021p.m6545h(baseViewModel3) | c6021p.m6542f(interfaceC5985XM19531n3);
                objM6514H9 = c6021p.m6514H();
                if (zM6545h5 || objM6514H9 == obj2) {
                    objM6514H9 = new C12589x94c95489(baseViewModel3, interfaceC5985XM19531n3, null);
                    c6021p.m6537c0(objM6514H9);
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H9, c6021p, baseViewModel3);
                c6021p.m6553p(false);
                obj3 = (MessagesViewModel) baseViewModel3;
                C2153Q0 c2153q0 = voiceModeViewModel.f40343c;
                c2532n1 = (C2532n1) AbstractC9112C3.m9642d(c2153q0, c6021p).getValue();
                c6021p.m6524S(-2034399476);
                objM6514H10 = c6021p.m6514H();
                if (objM6514H10 == obj2) {
                    objM6514H10 = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H10);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H10;
                c6021p.m6553p(false);
                c6021p.m6524S(-2034397092);
                zM6542f4 = c6021p.m6542f(c2532n1) | c6021p.m6545h(obj) | c6021p.m6545h(abstractActivityC17375g);
                objM6514H11 = c6021p.m6514H();
                if (zM6542f4 || objM6514H11 == obj2) {
                    objM6514H11 = new C0155B1(c2532n1, obj, abstractActivityC17375g, 18);
                    c6021p.m6537c0(objM6514H11);
                }
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H11;
                c6021p.m6553p(false);
                AbstractC7965P4.m8250a(0, c6021p, c2532n1.f7917x);
                AbstractC9243Y3.m9817a(0, c6021p);
                c6021p.m6524S(-2034381641);
                zM6545h6 = c6021p.m6545h(voiceModeViewModel);
                objM6514H12 = c6021p.m6514H();
                if (zM6545h6 || objM6514H12 == obj2) {
                    objM6514H12 = new C2469O0(voiceModeViewModel, 6);
                    c6021p.m6537c0(objM6514H12);
                }
                InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H12;
                c6021p.m6553p(false);
                c6021p.m6524S(-2034378563);
                if (i13 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objM6514H13 = c6021p.m6514H();
                if (z12 || objM6514H13 == obj2) {
                    objM6514H13 = new C0459F(18, interfaceC1436k);
                    c6021p.m6537c0(objM6514H13);
                }
                c6021p.m6553p(false);
                AbstractC8011V4.m8326b(false, interfaceC1426a3, (InterfaceC1426a) objM6514H13, c6021p, 6);
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                i14 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459q5 = interfaceC10459q3;
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q5);
                InterfaceC21700k.f68875m0.getClass();
                interfaceC1426a = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C21694h c21694h2 = C21698j.f68873f;
                C5997d.m6439Z(c21694h2, c6021p, interfaceC21057KM19511e);
                C21694h c21694h3 = C21698j.f68872e;
                C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                    AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
                }
                C21694h c21694h4 = C21698j.f68871d;
                C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
                c10843b = C10843b.f32509a;
                C10449g c10449g = C10444b.f30947z0;
                FillElement fillElement = AbstractC10844c.f32512c;
                C17296C c17296c = C17296C.f55119a;
                c6021p.m6524S(-636703672);
                zM6545h7 = c6021p.m6545h(voiceModeViewModel);
                objM6514H14 = c6021p.m6514H();
                if (zM6545h7 || objM6514H14 == obj2) {
                    objM6514H14 = new C3448r(voiceModeViewModel, interfaceC5985X, null);
                    c6021p.m6537c0(objM6514H14);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(AbstractC19744u.m20694b(fillElement, c17296c, (InterfaceC1439n) objM6514H14), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23201f, 7);
                C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, c10449g, c6021p, 48);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h2, c6021p, c17790wM19515a);
                C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m2);
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                }
                C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
                C17794y c17794y = C17794y.f56777a;
                VoiceModeViewModelImpl voiceModeViewModelImpl = (VoiceModeViewModelImpl) voiceModeViewModel;
                long j10 = AbstractC7300d.f23112b;
                AbstractC8748z.m9500a(c2153q0, voiceModeViewModelImpl.f39973G, voiceModeViewModelImpl.f39972F, c17794y.m19544b(c10456n, true), j10, false, c2532n1.f7886R, 0.0f, c6021p, 0, 160);
                AbstractC8742y.m9484a(AbstractC10844c.m11256p(c10456n, 100), j10, c6021p, 6);
                AbstractC7973Q4.m8272b(c2532n1, AbstractC10842a.m11237o(c10456n, 0.0f, AbstractC7313q.f23198c, 0.0f, 0.0f, 13), j10, c6021p, 0);
                c6021p.m6524S(1466210166);
                if (c2532n1.f7905l) {
                    c10456n2 = c10456n;
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.voice_mode_poor_connection_quality, c6021p), null, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12241w, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p, 0, 0, 65530);
                } else {
                    c10456n2 = c10456n;
                }
                c6021p.m6553p(false);
                c6021p.m6553p(true);
                c10456n3 = c10456n2;
                InterfaceC10459q interfaceC10459qM11240a = c10843b.m11240a(c10456n3, C10444b.f30942u0);
                f10 = AbstractC7313q.f23199d;
                AbstractC3984T1.m4693l(interfaceC1426a2, AbstractC10842a.m11235m(interfaceC10459qM11240a, f10, 0.0f, 2), false, null, null, AbstractC3454x.f10505a, c6021p, 196608, 28);
                interfaceC5985XM9805a = AbstractC9233X.m9805a(assistantViewModel.f40343c, C3434d.f10456p0, c6021p, 48);
                c6021p.m6524S(-636624165);
                if (((Boolean) interfaceC5985XM9805a.getValue()).booleanValue()) {
                    c6021p.m6524S(-636622155);
                    zM6542f5 = c6021p.m6542f(assistantViewModel);
                    objM6514H20 = c6021p.m6514H();
                    if (zM6542f5 || objM6514H20 == obj2) {
                        objM6514H20 = new C3433c(assistantViewModel, 1);
                        c6021p.m6537c0(objM6514H20);
                    }
                    c6021p.m6553p(false);
                    obj4 = obj2;
                    AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H20, AbstractC10842a.m11235m(c10843b.m11240a(c10456n3, C10444b.f30940s0), f10, 0.0f, 2), false, null, null, AbstractC3454x.f10506b, c6021p, 196608, 28);
                } else {
                    obj4 = obj2;
                }
                c6021p.m6553p(false);
                c6021p.m6524S(-636603087);
                if (c2532n1.f7910q) {
                    c6021p.m6524S(-636598469);
                    voiceModeViewModel2 = voiceModeViewModel;
                    zM6545h11 = c6021p.m6545h(voiceModeViewModel2);
                    objM6514H18 = c6021p.m6514H();
                    if (zM6545h11 || objM6514H18 == obj4) {
                        objM6514H18 = new C2469O0(voiceModeViewModel2, 7);
                        c6021p.m6537c0(objM6514H18);
                    }
                    InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) objM6514H18;
                    c6021p.m6553p(false);
                    c6021p.m6524S(-636593719);
                    obj5 = obj3;
                    zM6545h12 = c6021p.m6545h(obj5);
                    objM6514H19 = c6021p.m6514H();
                    if (zM6545h12 || objM6514H19 == obj4) {
                        objM6514H19 = new C0292u(1, obj5, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 7);
                        c6021p.m6537c0(objM6514H19);
                    }
                    c6021p.m6553p(false);
                    AbstractC7949N4.m8237b(c2532n1, interfaceC1426a4, (InterfaceC1436k) ((InterfaceC3759g) objM6514H19), null, null, c6021p, 0);
                } else {
                    obj5 = obj3;
                    voiceModeViewModel2 = voiceModeViewModel;
                }
                c6021p.m6553p(false);
                c6021p.m6524S(-636591002);
                if (c2532n1.f7911r) {
                    c6021p.m6524S(-636588099);
                    zM6545h8 = c6021p.m6545h(voiceModeViewModel2);
                    objM6514H15 = c6021p.m6514H();
                    if (zM6545h8 || objM6514H15 == obj4) {
                        objM6514H15 = new C2469O0(voiceModeViewModel2, 8);
                        c6021p.m6537c0(objM6514H15);
                    }
                    InterfaceC1426a interfaceC1426a5 = (InterfaceC1426a) objM6514H15;
                    c6021p.m6553p(false);
                    c6021p.m6524S(-636583287);
                    zM6545h9 = c6021p.m6545h(obj5);
                    objM6514H16 = c6021p.m6514H();
                    if (zM6545h9 || objM6514H16 == obj4) {
                        objM6514H16 = new C0292u(1, obj5, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 8);
                        c6021p.m6537c0(objM6514H16);
                    }
                    c6021p.m6553p(false);
                    InterfaceC1436k interfaceC1436k5 = (InterfaceC1436k) ((InterfaceC3759g) objM6514H16);
                    c6021p.m6524S(-636580972);
                    zM6545h10 = c6021p.m6545h(voiceModeViewModel2);
                    objM6514H17 = c6021p.m6514H();
                    if (zM6545h10 || objM6514H17 == obj4) {
                        objM6514H17 = new C2471P0(voiceModeViewModel2, 3);
                        c6021p.m6537c0(objM6514H17);
                    }
                    c6021p.m6553p(false);
                    AbstractC2454H.m3583a(interfaceC1426a5, interfaceC1436k5, (InterfaceC1436k) objM6514H17, null, c2532n1.f7914u, null, c6021p, 0);
                }
                c6021p.m6553p(false);
                c6021p.m6553p(true);
                interfaceC10459q4 = interfaceC10459q5;
            } else {
                c6021p.m6517L();
                interfaceC10459q4 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C3449s(interfaceC1436k, interfaceC10459q4, i10, i11, 0);
            }
        }
        i12 |= 48;
        interfaceC10459q2 = interfaceC10459q;
        if ((i12 & 19) == 18) {
            c10456n = C10456n.f30959Y;
            if (i16 != 0) {
                interfaceC10459q3 = c10456n;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
            obj = (Context) c6021p.m6548k(abstractC6012k0);
            c6021p.m6524S(-2034427119);
            i13 = i12 & 14;
            if (i13 == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            objM6514H = c6021p.m6514H();
            obj2 = C6013l.f19514a;
            if (z6) {
                objM6514H = new AssistantScreenKt$AssistantScreenContent$voiceViewModel$1$1(interfaceC1436k);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new AssistantScreenKt$AssistantScreenContent$voiceViewModel$1$1(interfaceC1436k);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC1436k2 = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            context = (Context) c6021p.m6548k(abstractC6012k0);
            abstractC6012k1 = AbstractC0233b1.f873a;
            zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            abstractC6012k2 = AbstractC16421b.f50950a;
            list = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C2532n1.class));
                z10 = false;
            } else {
                if (zBooleanValue) {
                    throw new C0644w();
                }
                z10 = false;
                interfaceC2062k = null;
            }
            c6021p.m6553p(z10);
            LocalViewModelStoreOwner.f33491a.getClass();
            viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            c16527d = AbstractC16526C.f51263a;
            Object objMo5693b7 = c16527d.mo5693b(VoiceModeViewModel.class);
            Object objMo5693b8 = c16527d.mo5693b(C2532n1.class);
            c6021p.m6524S(-1395498839);
            zM6542f = c6021p.m6542f(objMo5693b8) | c6021p.m6542f(objMo5693b7) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C2532n1.class), c16527d.mo5693b(VoiceModeViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceModeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            } else {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C2532n1.class), c16527d.mo5693b(VoiceModeViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceModeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            }
            baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k2, c6021p, -1395474517);
            zM6545h = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            objM6514H3 = c6021p.m6514H();
            if (zM6545h) {
                objM6514H3 = new C12587x94c95487(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C12587x94c95487(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            voiceModeViewModel = (VoiceModeViewModel) baseViewModel;
            c6021p.m6524S(-2034420495);
            zM6545h2 = c6021p.m6545h(abstractActivityC17375g) | c6021p.m6545h(voiceModeViewModel);
            objM6514H4 = c6021p.m6514H();
            if (zM6545h2) {
                objM6514H4 = new AssistantScreenKt$AssistantScreenContent$assistantViewModel$1$1(abstractActivityC17375g, voiceModeViewModel);
                c6021p.m6537c0(objM6514H4);
            } else {
                objM6514H4 = new AssistantScreenKt$AssistantScreenContent$assistantViewModel$1$1(abstractActivityC17375g, voiceModeViewModel);
                c6021p.m6537c0(objM6514H4);
            }
            interfaceC1436k3 = (InterfaceC1436k) objM6514H4;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            context2 = (Context) c6021p.m6548k(abstractC6012k0);
            zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            list2 = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue2) {
                interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C3450t.class));
                z11 = false;
            } else {
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                z11 = false;
                interfaceC2062k2 = null;
            }
            c6021p.m6553p(z11);
            viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a2 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            Object objMo5693b9 = c16527d.mo5693b(AssistantViewModel.class);
            Object objMo5693b10 = c16527d.mo5693b(C3450t.class);
            c6021p.m6524S(-1395498839);
            zM6542f2 = c6021p.m6542f(objMo5693b9) | c6021p.m6542f(objMo5693b10) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            objM6514H5 = c6021p.m6514H();
            if (zM6542f2) {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C3450t.class), c16527d.mo5693b(AssistantViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H5 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AssistantViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H5);
            } else {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C3450t.class), c16527d.mo5693b(AssistantViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H5 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AssistantViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H5);
            }
            baseViewModel2 = (BaseViewModel) objM6514H5;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
            interfaceC5985XM19531n2 = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k3, c6021p, -1395474517);
            zM6545h3 = c6021p.m6545h(baseViewModel2) | c6021p.m6542f(interfaceC5985XM19531n2);
            objM6514H6 = c6021p.m6514H();
            if (zM6545h3) {
                objM6514H6 = new C12588x94c95488(baseViewModel2, interfaceC5985XM19531n2, null);
                c6021p.m6537c0(objM6514H6);
            } else {
                objM6514H6 = new C12588x94c95488(baseViewModel2, interfaceC5985XM19531n2, null);
                c6021p.m6537c0(objM6514H6);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p, baseViewModel2);
            c6021p.m6553p(false);
            assistantViewModel = (AssistantViewModel) baseViewModel2;
            c6021p.m6524S(-2034408137);
            zM6545h4 = c6021p.m6545h(c8870f);
            objM6514H7 = c6021p.m6514H();
            if (zM6545h4) {
                objM6514H7 = new AssistantScreenKt$AssistantScreenContent$messagesViewModel$1$1(c8870f);
                c6021p.m6537c0(objM6514H7);
            } else {
                objM6514H7 = new AssistantScreenKt$AssistantScreenContent$messagesViewModel$1$1(c8870f);
                c6021p.m6537c0(objM6514H7);
            }
            interfaceC1436k4 = (InterfaceC1436k) objM6514H7;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            context3 = (Context) c6021p.m6548k(abstractC6012k0);
            zBooleanValue3 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            list3 = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue3) {
                interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
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
            Object objMo5693b11 = c16527d.mo5693b(MessagesViewModel.class);
            Object objMo5693b12 = c16527d.mo5693b(C18160X.class);
            c6021p.m6524S(-1395498839);
            zM6542f3 = c6021p.m6542f(objMo5693b11) | c6021p.m6542f(objMo5693b12) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
            objM6514H8 = c6021p.m6514H();
            if (zM6542f3) {
                if (zBooleanValue3) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context3, interfaceC2062k3);
                    throw null;
                }
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                objM6514H8 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                c6021p.m6537c0(objM6514H8);
            } else {
                if (zBooleanValue3) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context3, interfaceC2062k3);
                    throw null;
                }
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                objM6514H8 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                c6021p.m6537c0(objM6514H8);
            }
            baseViewModel3 = (BaseViewModel) objM6514H8;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel3, c6021p, 0);
            interfaceC5985XM19531n3 = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k4, c6021p, -1395474517);
            zM6545h5 = c6021p.m6545h(baseViewModel3) | c6021p.m6542f(interfaceC5985XM19531n3);
            objM6514H9 = c6021p.m6514H();
            if (zM6545h5) {
                objM6514H9 = new C12589x94c95489(baseViewModel3, interfaceC5985XM19531n3, null);
                c6021p.m6537c0(objM6514H9);
            } else {
                objM6514H9 = new C12589x94c95489(baseViewModel3, interfaceC5985XM19531n3, null);
                c6021p.m6537c0(objM6514H9);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H9, c6021p, baseViewModel3);
            c6021p.m6553p(false);
            obj3 = (MessagesViewModel) baseViewModel3;
            C2153Q0 c2153q1 = voiceModeViewModel.f40343c;
            c2532n1 = (C2532n1) AbstractC9112C3.m9642d(c2153q1, c6021p).getValue();
            c6021p.m6524S(-2034399476);
            objM6514H10 = c6021p.m6514H();
            if (objM6514H10 == obj2) {
                objM6514H10 = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H10);
            }
            interfaceC5985X = (InterfaceC5985X) objM6514H10;
            c6021p.m6553p(false);
            c6021p.m6524S(-2034397092);
            zM6542f4 = c6021p.m6542f(c2532n1) | c6021p.m6545h(obj) | c6021p.m6545h(abstractActivityC17375g);
            objM6514H11 = c6021p.m6514H();
            if (zM6542f4) {
                objM6514H11 = new C0155B1(c2532n1, obj, abstractActivityC17375g, 18);
                c6021p.m6537c0(objM6514H11);
            } else {
                objM6514H11 = new C0155B1(c2532n1, obj, abstractActivityC17375g, 18);
                c6021p.m6537c0(objM6514H11);
            }
            InterfaceC1426a interfaceC1426a6 = (InterfaceC1426a) objM6514H11;
            c6021p.m6553p(false);
            AbstractC7965P4.m8250a(0, c6021p, c2532n1.f7917x);
            AbstractC9243Y3.m9817a(0, c6021p);
            c6021p.m6524S(-2034381641);
            zM6545h6 = c6021p.m6545h(voiceModeViewModel);
            objM6514H12 = c6021p.m6514H();
            if (zM6545h6) {
                objM6514H12 = new C2469O0(voiceModeViewModel, 6);
                c6021p.m6537c0(objM6514H12);
            } else {
                objM6514H12 = new C2469O0(voiceModeViewModel, 6);
                c6021p.m6537c0(objM6514H12);
            }
            InterfaceC1426a interfaceC1426a7 = (InterfaceC1426a) objM6514H12;
            c6021p.m6553p(false);
            c6021p.m6524S(-2034378563);
            if (i13 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            objM6514H13 = c6021p.m6514H();
            if (z12) {
                objM6514H13 = new C0459F(18, interfaceC1436k);
                c6021p.m6537c0(objM6514H13);
            } else {
                objM6514H13 = new C0459F(18, interfaceC1436k);
                c6021p.m6537c0(objM6514H13);
            }
            c6021p.m6553p(false);
            AbstractC8011V4.m8326b(false, interfaceC1426a7, (InterfaceC1426a) objM6514H13, c6021p, 6);
            InterfaceC21057K interfaceC21057KM19511e2 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459q6 = interfaceC10459q3;
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459q6);
            InterfaceC21700k.f68875m0.getClass();
            interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h5 = C21698j.f68873f;
            C5997d.m6439Z(c21694h5, c6021p, interfaceC21057KM19511e2);
            C21694h c21694h6 = C21698j.f68872e;
            C5997d.m6439Z(c21694h6, c6021p, interfaceC6008i0M6550m3);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            } else {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C21694h c21694h7 = C21698j.f68871d;
            C5997d.m6439Z(c21694h7, c6021p, interfaceC10459qM10923d3);
            c10843b = C10843b.f32509a;
            C10449g c10449g2 = C10444b.f30947z0;
            FillElement fillElement2 = AbstractC10844c.f32512c;
            C17296C c17296c2 = C17296C.f55119a;
            c6021p.m6524S(-636703672);
            zM6545h7 = c6021p.m6545h(voiceModeViewModel);
            objM6514H14 = c6021p.m6514H();
            if (zM6545h7) {
                objM6514H14 = new C3448r(voiceModeViewModel, interfaceC5985X, null);
                c6021p.m6537c0(objM6514H14);
            } else {
                objM6514H14 = new C3448r(voiceModeViewModel, interfaceC5985X, null);
                c6021p.m6537c0(objM6514H14);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11237o2 = AbstractC10842a.m11237o(AbstractC19744u.m20694b(fillElement2, c17296c2, (InterfaceC1439n) objM6514H14), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23201f, 7);
            C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, c10449g2, c6021p, 48);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o2);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h5, c6021p, c17790wM19515a2);
            C5997d.m6439Z(c21694h6, c6021p, interfaceC6008i0M6550m4);
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            } else {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C5997d.m6439Z(c21694h7, c6021p, interfaceC10459qM10923d4);
            C17794y c17794y2 = C17794y.f56777a;
            VoiceModeViewModelImpl voiceModeViewModelImpl2 = (VoiceModeViewModelImpl) voiceModeViewModel;
            long j11 = AbstractC7300d.f23112b;
            AbstractC8748z.m9500a(c2153q1, voiceModeViewModelImpl2.f39973G, voiceModeViewModelImpl2.f39972F, c17794y2.m19544b(c10456n, true), j11, false, c2532n1.f7886R, 0.0f, c6021p, 0, 160);
            AbstractC8742y.m9484a(AbstractC10844c.m11256p(c10456n, 100), j11, c6021p, 6);
            AbstractC7973Q4.m8272b(c2532n1, AbstractC10842a.m11237o(c10456n, 0.0f, AbstractC7313q.f23198c, 0.0f, 0.0f, 13), j11, c6021p, 0);
            c6021p.m6524S(1466210166);
            if (c2532n1.f7905l) {
                c10456n2 = c10456n;
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.voice_mode_poor_connection_quality, c6021p), null, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12241w, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p, 0, 0, 65530);
            } else {
                c10456n2 = c10456n;
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            c10456n3 = c10456n2;
            InterfaceC10459q interfaceC10459qM11240a2 = c10843b.m11240a(c10456n3, C10444b.f30942u0);
            f10 = AbstractC7313q.f23199d;
            AbstractC3984T1.m4693l(interfaceC1426a6, AbstractC10842a.m11235m(interfaceC10459qM11240a2, f10, 0.0f, 2), false, null, null, AbstractC3454x.f10505a, c6021p, 196608, 28);
            interfaceC5985XM9805a = AbstractC9233X.m9805a(assistantViewModel.f40343c, C3434d.f10456p0, c6021p, 48);
            c6021p.m6524S(-636624165);
            if (((Boolean) interfaceC5985XM9805a.getValue()).booleanValue()) {
                c6021p.m6524S(-636622155);
                zM6542f5 = c6021p.m6542f(assistantViewModel);
                objM6514H20 = c6021p.m6514H();
                if (zM6542f5) {
                    objM6514H20 = new C3433c(assistantViewModel, 1);
                    c6021p.m6537c0(objM6514H20);
                } else {
                    objM6514H20 = new C3433c(assistantViewModel, 1);
                    c6021p.m6537c0(objM6514H20);
                }
                c6021p.m6553p(false);
                obj4 = obj2;
                AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H20, AbstractC10842a.m11235m(c10843b.m11240a(c10456n3, C10444b.f30940s0), f10, 0.0f, 2), false, null, null, AbstractC3454x.f10506b, c6021p, 196608, 28);
            } else {
                obj4 = obj2;
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-636603087);
            if (c2532n1.f7910q) {
                c6021p.m6524S(-636598469);
                voiceModeViewModel2 = voiceModeViewModel;
                zM6545h11 = c6021p.m6545h(voiceModeViewModel2);
                objM6514H18 = c6021p.m6514H();
                if (zM6545h11) {
                    objM6514H18 = new C2469O0(voiceModeViewModel2, 7);
                    c6021p.m6537c0(objM6514H18);
                } else {
                    objM6514H18 = new C2469O0(voiceModeViewModel2, 7);
                    c6021p.m6537c0(objM6514H18);
                }
                InterfaceC1426a interfaceC1426a8 = (InterfaceC1426a) objM6514H18;
                c6021p.m6553p(false);
                c6021p.m6524S(-636593719);
                obj5 = obj3;
                zM6545h12 = c6021p.m6545h(obj5);
                objM6514H19 = c6021p.m6514H();
                if (zM6545h12) {
                    objM6514H19 = new C0292u(1, obj5, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 7);
                    c6021p.m6537c0(objM6514H19);
                } else {
                    objM6514H19 = new C0292u(1, obj5, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 7);
                    c6021p.m6537c0(objM6514H19);
                }
                c6021p.m6553p(false);
                AbstractC7949N4.m8237b(c2532n1, interfaceC1426a8, (InterfaceC1436k) ((InterfaceC3759g) objM6514H19), null, null, c6021p, 0);
            } else {
                obj5 = obj3;
                voiceModeViewModel2 = voiceModeViewModel;
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-636591002);
            if (c2532n1.f7911r) {
                c6021p.m6524S(-636588099);
                zM6545h8 = c6021p.m6545h(voiceModeViewModel2);
                objM6514H15 = c6021p.m6514H();
                if (zM6545h8) {
                    objM6514H15 = new C2469O0(voiceModeViewModel2, 8);
                    c6021p.m6537c0(objM6514H15);
                } else {
                    objM6514H15 = new C2469O0(voiceModeViewModel2, 8);
                    c6021p.m6537c0(objM6514H15);
                }
                InterfaceC1426a interfaceC1426a9 = (InterfaceC1426a) objM6514H15;
                c6021p.m6553p(false);
                c6021p.m6524S(-636583287);
                zM6545h9 = c6021p.m6545h(obj5);
                objM6514H16 = c6021p.m6514H();
                if (zM6545h9) {
                    objM6514H16 = new C0292u(1, obj5, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 8);
                    c6021p.m6537c0(objM6514H16);
                } else {
                    objM6514H16 = new C0292u(1, obj5, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 8);
                    c6021p.m6537c0(objM6514H16);
                }
                c6021p.m6553p(false);
                InterfaceC1436k interfaceC1436k6 = (InterfaceC1436k) ((InterfaceC3759g) objM6514H16);
                c6021p.m6524S(-636580972);
                zM6545h10 = c6021p.m6545h(voiceModeViewModel2);
                objM6514H17 = c6021p.m6514H();
                if (zM6545h10) {
                    objM6514H17 = new C2471P0(voiceModeViewModel2, 3);
                    c6021p.m6537c0(objM6514H17);
                } else {
                    objM6514H17 = new C2471P0(voiceModeViewModel2, 3);
                    c6021p.m6537c0(objM6514H17);
                }
                c6021p.m6553p(false);
                AbstractC2454H.m3583a(interfaceC1426a9, interfaceC1436k6, (InterfaceC1436k) objM6514H17, null, c2532n1.f7914u, null, c6021p, 0);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            interfaceC10459q4 = interfaceC10459q6;
        } else {
            c10456n = C10456n.f30959Y;
            if (i16 != 0) {
                interfaceC10459q3 = c10456n;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
            obj = (Context) c6021p.m6548k(abstractC6012k0);
            c6021p.m6524S(-2034427119);
            i13 = i12 & 14;
            if (i13 == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            objM6514H = c6021p.m6514H();
            obj2 = C6013l.f19514a;
            if (z6) {
                objM6514H = new AssistantScreenKt$AssistantScreenContent$voiceViewModel$1$1(interfaceC1436k);
                c6021p.m6537c0(objM6514H);
            } else {
                objM6514H = new AssistantScreenKt$AssistantScreenContent$voiceViewModel$1$1(interfaceC1436k);
                c6021p.m6537c0(objM6514H);
            }
            interfaceC1436k2 = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            context = (Context) c6021p.m6548k(abstractC6012k0);
            abstractC6012k1 = AbstractC0233b1.f873a;
            zBooleanValue = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            abstractC6012k2 = AbstractC16421b.f50950a;
            list = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C2532n1.class));
                z10 = false;
            } else {
                if (zBooleanValue) {
                    throw new C0644w();
                }
                z10 = false;
                interfaceC2062k = null;
            }
            c6021p.m6553p(z10);
            LocalViewModelStoreOwner.f33491a.getClass();
            viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            c16527d = AbstractC16526C.f51263a;
            Object objMo5693b13 = c16527d.mo5693b(VoiceModeViewModel.class);
            Object objMo5693b14 = c16527d.mo5693b(C2532n1.class);
            c6021p.m6524S(-1395498839);
            zM6542f = c6021p.m6542f(objMo5693b14) | c6021p.m6542f(objMo5693b13) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C2532n1.class), c16527d.mo5693b(VoiceModeViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceModeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            } else {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C2532n1.class), c16527d.mo5693b(VoiceModeViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VoiceModeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            }
            baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k2, c6021p, -1395474517);
            zM6545h = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            objM6514H3 = c6021p.m6514H();
            if (zM6545h) {
                objM6514H3 = new C12587x94c95487(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C12587x94c95487(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            voiceModeViewModel = (VoiceModeViewModel) baseViewModel;
            c6021p.m6524S(-2034420495);
            zM6545h2 = c6021p.m6545h(abstractActivityC17375g) | c6021p.m6545h(voiceModeViewModel);
            objM6514H4 = c6021p.m6514H();
            if (zM6545h2) {
                objM6514H4 = new AssistantScreenKt$AssistantScreenContent$assistantViewModel$1$1(abstractActivityC17375g, voiceModeViewModel);
                c6021p.m6537c0(objM6514H4);
            } else {
                objM6514H4 = new AssistantScreenKt$AssistantScreenContent$assistantViewModel$1$1(abstractActivityC17375g, voiceModeViewModel);
                c6021p.m6537c0(objM6514H4);
            }
            interfaceC1436k3 = (InterfaceC1436k) objM6514H4;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            context2 = (Context) c6021p.m6548k(abstractC6012k0);
            zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            list2 = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue2) {
                interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C3450t.class));
                z11 = false;
            } else {
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                z11 = false;
                interfaceC2062k2 = null;
            }
            c6021p.m6553p(z11);
            viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
            if (viewModelStoreOwnerM12165a2 == null) {
                throw new IllegalStateException("Unable to find ViewModelStoreOwner");
            }
            Object objMo5693b15 = c16527d.mo5693b(AssistantViewModel.class);
            Object objMo5693b16 = c16527d.mo5693b(C3450t.class);
            c6021p.m6524S(-1395498839);
            zM6542f2 = c6021p.m6542f(objMo5693b15) | c6021p.m6542f(objMo5693b16) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            objM6514H5 = c6021p.m6514H();
            if (zM6542f2) {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C3450t.class), c16527d.mo5693b(AssistantViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H5 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AssistantViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H5);
            } else {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C3450t.class), c16527d.mo5693b(AssistantViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H5 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AssistantViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H5);
            }
            baseViewModel2 = (BaseViewModel) objM6514H5;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
            interfaceC5985XM19531n2 = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k3, c6021p, -1395474517);
            zM6545h3 = c6021p.m6545h(baseViewModel2) | c6021p.m6542f(interfaceC5985XM19531n2);
            objM6514H6 = c6021p.m6514H();
            if (zM6545h3) {
                objM6514H6 = new C12588x94c95488(baseViewModel2, interfaceC5985XM19531n2, null);
                c6021p.m6537c0(objM6514H6);
            } else {
                objM6514H6 = new C12588x94c95488(baseViewModel2, interfaceC5985XM19531n2, null);
                c6021p.m6537c0(objM6514H6);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H6, c6021p, baseViewModel2);
            c6021p.m6553p(false);
            assistantViewModel = (AssistantViewModel) baseViewModel2;
            c6021p.m6524S(-2034408137);
            zM6545h4 = c6021p.m6545h(c8870f);
            objM6514H7 = c6021p.m6514H();
            if (zM6545h4) {
                objM6514H7 = new AssistantScreenKt$AssistantScreenContent$messagesViewModel$1$1(c8870f);
                c6021p.m6537c0(objM6514H7);
            } else {
                objM6514H7 = new AssistantScreenKt$AssistantScreenContent$messagesViewModel$1$1(c8870f);
                c6021p.m6537c0(objM6514H7);
            }
            interfaceC1436k4 = (InterfaceC1436k) objM6514H7;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            context3 = (Context) c6021p.m6548k(abstractC6012k0);
            zBooleanValue3 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            list3 = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue3) {
                interfaceC2062k3 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18160X.class));
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
            Object objMo5693b17 = c16527d.mo5693b(MessagesViewModel.class);
            Object objMo5693b18 = c16527d.mo5693b(C18160X.class);
            c6021p.m6524S(-1395498839);
            zM6542f3 = c6021p.m6542f(objMo5693b17) | c6021p.m6542f(objMo5693b18) | c6021p.m6542f(list3) | c6021p.m6544g(zBooleanValue3) | c6021p.m6542f(interfaceC2062k3);
            objM6514H8 = c6021p.m6514H();
            if (zM6542f3) {
                if (zBooleanValue3) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context3, interfaceC2062k3);
                    throw null;
                }
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                objM6514H8 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                c6021p.m6537c0(objM6514H8);
            } else {
                if (zBooleanValue3) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18160X.class), c16527d.mo5693b(MessagesViewModel.class), context3, interfaceC2062k3);
                    throw null;
                }
                if (zBooleanValue3) {
                    throw new C0644w();
                }
                objM6514H8 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(MessagesViewModel.class), null, viewModelStoreOwnerM12165a3, list3);
                c6021p.m6537c0(objM6514H8);
            }
            baseViewModel3 = (BaseViewModel) objM6514H8;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel3, c6021p, 0);
            interfaceC5985XM19531n3 = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k4, c6021p, -1395474517);
            zM6545h5 = c6021p.m6545h(baseViewModel3) | c6021p.m6542f(interfaceC5985XM19531n3);
            objM6514H9 = c6021p.m6514H();
            if (zM6545h5) {
                objM6514H9 = new C12589x94c95489(baseViewModel3, interfaceC5985XM19531n3, null);
                c6021p.m6537c0(objM6514H9);
            } else {
                objM6514H9 = new C12589x94c95489(baseViewModel3, interfaceC5985XM19531n3, null);
                c6021p.m6537c0(objM6514H9);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H9, c6021p, baseViewModel3);
            c6021p.m6553p(false);
            obj3 = (MessagesViewModel) baseViewModel3;
            C2153Q0 c2153q2 = voiceModeViewModel.f40343c;
            c2532n1 = (C2532n1) AbstractC9112C3.m9642d(c2153q2, c6021p).getValue();
            c6021p.m6524S(-2034399476);
            objM6514H10 = c6021p.m6514H();
            if (objM6514H10 == obj2) {
                objM6514H10 = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H10);
            }
            interfaceC5985X = (InterfaceC5985X) objM6514H10;
            c6021p.m6553p(false);
            c6021p.m6524S(-2034397092);
            zM6542f4 = c6021p.m6542f(c2532n1) | c6021p.m6545h(obj) | c6021p.m6545h(abstractActivityC17375g);
            objM6514H11 = c6021p.m6514H();
            if (zM6542f4) {
                objM6514H11 = new C0155B1(c2532n1, obj, abstractActivityC17375g, 18);
                c6021p.m6537c0(objM6514H11);
            } else {
                objM6514H11 = new C0155B1(c2532n1, obj, abstractActivityC17375g, 18);
                c6021p.m6537c0(objM6514H11);
            }
            InterfaceC1426a interfaceC1426a10 = (InterfaceC1426a) objM6514H11;
            c6021p.m6553p(false);
            AbstractC7965P4.m8250a(0, c6021p, c2532n1.f7917x);
            AbstractC9243Y3.m9817a(0, c6021p);
            c6021p.m6524S(-2034381641);
            zM6545h6 = c6021p.m6545h(voiceModeViewModel);
            objM6514H12 = c6021p.m6514H();
            if (zM6545h6) {
                objM6514H12 = new C2469O0(voiceModeViewModel, 6);
                c6021p.m6537c0(objM6514H12);
            } else {
                objM6514H12 = new C2469O0(voiceModeViewModel, 6);
                c6021p.m6537c0(objM6514H12);
            }
            InterfaceC1426a interfaceC1426a11 = (InterfaceC1426a) objM6514H12;
            c6021p.m6553p(false);
            c6021p.m6524S(-2034378563);
            if (i13 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            objM6514H13 = c6021p.m6514H();
            if (z12) {
                objM6514H13 = new C0459F(18, interfaceC1436k);
                c6021p.m6537c0(objM6514H13);
            } else {
                objM6514H13 = new C0459F(18, interfaceC1436k);
                c6021p.m6537c0(objM6514H13);
            }
            c6021p.m6553p(false);
            AbstractC8011V4.m8326b(false, interfaceC1426a11, (InterfaceC1426a) objM6514H13, c6021p, 6);
            InterfaceC21057K interfaceC21057KM19511e3 = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459q7 = interfaceC10459q3;
            InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, interfaceC10459q7);
            InterfaceC21700k.f68875m0.getClass();
            interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h8 = C21698j.f68873f;
            C5997d.m6439Z(c21694h8, c6021p, interfaceC21057KM19511e3);
            C21694h c21694h9 = C21698j.f68872e;
            C5997d.m6439Z(c21694h9, c6021p, interfaceC6008i0M6550m5);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            } else {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C21694h c21694h10 = C21698j.f68871d;
            C5997d.m6439Z(c21694h10, c6021p, interfaceC10459qM10923d5);
            c10843b = C10843b.f32509a;
            C10449g c10449g3 = C10444b.f30947z0;
            FillElement fillElement3 = AbstractC10844c.f32512c;
            C17296C c17296c3 = C17296C.f55119a;
            c6021p.m6524S(-636703672);
            zM6545h7 = c6021p.m6545h(voiceModeViewModel);
            objM6514H14 = c6021p.m6514H();
            if (zM6545h7) {
                objM6514H14 = new C3448r(voiceModeViewModel, interfaceC5985X, null);
                c6021p.m6537c0(objM6514H14);
            } else {
                objM6514H14 = new C3448r(voiceModeViewModel, interfaceC5985X, null);
                c6021p.m6537c0(objM6514H14);
            }
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459qM11237o3 = AbstractC10842a.m11237o(AbstractC19744u.m20694b(fillElement3, c17296c3, (InterfaceC1439n) objM6514H14), 0.0f, 0.0f, 0.0f, AbstractC7313q.f23201f, 7);
            C17790w c17790wM19515a3 = AbstractC17788v.m19515a(AbstractC17770m.f56726c, c10449g3, c6021p, 48);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o3);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h8, c6021p, c17790wM19515a3);
            C5997d.m6439Z(c21694h9, c6021p, interfaceC6008i0M6550m6);
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            } else {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C5997d.m6439Z(c21694h10, c6021p, interfaceC10459qM10923d6);
            C17794y c17794y3 = C17794y.f56777a;
            VoiceModeViewModelImpl voiceModeViewModelImpl3 = (VoiceModeViewModelImpl) voiceModeViewModel;
            long j12 = AbstractC7300d.f23112b;
            AbstractC8748z.m9500a(c2153q2, voiceModeViewModelImpl3.f39973G, voiceModeViewModelImpl3.f39972F, c17794y3.m19544b(c10456n, true), j12, false, c2532n1.f7886R, 0.0f, c6021p, 0, 160);
            AbstractC8742y.m9484a(AbstractC10844c.m11256p(c10456n, 100), j12, c6021p, 6);
            AbstractC7973Q4.m8272b(c2532n1, AbstractC10842a.m11237o(c10456n, 0.0f, AbstractC7313q.f23198c, 0.0f, 0.0f, 13), j12, c6021p, 0);
            c6021p.m6524S(1466210166);
            if (c2532n1.f7905l) {
                c10456n2 = c10456n;
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.voice_mode_poor_connection_quality, c6021p), null, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12241w, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p, 0, 0, 65530);
            } else {
                c10456n2 = c10456n;
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            c10456n3 = c10456n2;
            InterfaceC10459q interfaceC10459qM11240a3 = c10843b.m11240a(c10456n3, C10444b.f30942u0);
            f10 = AbstractC7313q.f23199d;
            AbstractC3984T1.m4693l(interfaceC1426a10, AbstractC10842a.m11235m(interfaceC10459qM11240a3, f10, 0.0f, 2), false, null, null, AbstractC3454x.f10505a, c6021p, 196608, 28);
            interfaceC5985XM9805a = AbstractC9233X.m9805a(assistantViewModel.f40343c, C3434d.f10456p0, c6021p, 48);
            c6021p.m6524S(-636624165);
            if (((Boolean) interfaceC5985XM9805a.getValue()).booleanValue()) {
                c6021p.m6524S(-636622155);
                zM6542f5 = c6021p.m6542f(assistantViewModel);
                objM6514H20 = c6021p.m6514H();
                if (zM6542f5) {
                    objM6514H20 = new C3433c(assistantViewModel, 1);
                    c6021p.m6537c0(objM6514H20);
                } else {
                    objM6514H20 = new C3433c(assistantViewModel, 1);
                    c6021p.m6537c0(objM6514H20);
                }
                c6021p.m6553p(false);
                obj4 = obj2;
                AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H20, AbstractC10842a.m11235m(c10843b.m11240a(c10456n3, C10444b.f30940s0), f10, 0.0f, 2), false, null, null, AbstractC3454x.f10506b, c6021p, 196608, 28);
            } else {
                obj4 = obj2;
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-636603087);
            if (c2532n1.f7910q) {
                c6021p.m6524S(-636598469);
                voiceModeViewModel2 = voiceModeViewModel;
                zM6545h11 = c6021p.m6545h(voiceModeViewModel2);
                objM6514H18 = c6021p.m6514H();
                if (zM6545h11) {
                    objM6514H18 = new C2469O0(voiceModeViewModel2, 7);
                    c6021p.m6537c0(objM6514H18);
                } else {
                    objM6514H18 = new C2469O0(voiceModeViewModel2, 7);
                    c6021p.m6537c0(objM6514H18);
                }
                InterfaceC1426a interfaceC1426a12 = (InterfaceC1426a) objM6514H18;
                c6021p.m6553p(false);
                c6021p.m6524S(-636593719);
                obj5 = obj3;
                zM6545h12 = c6021p.m6545h(obj5);
                objM6514H19 = c6021p.m6514H();
                if (zM6545h12) {
                    objM6514H19 = new C0292u(1, obj5, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 7);
                    c6021p.m6537c0(objM6514H19);
                } else {
                    objM6514H19 = new C0292u(1, obj5, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 7);
                    c6021p.m6537c0(objM6514H19);
                }
                c6021p.m6553p(false);
                AbstractC7949N4.m8237b(c2532n1, interfaceC1426a12, (InterfaceC1436k) ((InterfaceC3759g) objM6514H19), null, null, c6021p, 0);
            } else {
                obj5 = obj3;
                voiceModeViewModel2 = voiceModeViewModel;
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-636591002);
            if (c2532n1.f7911r) {
                c6021p.m6524S(-636588099);
                zM6545h8 = c6021p.m6545h(voiceModeViewModel2);
                objM6514H15 = c6021p.m6514H();
                if (zM6545h8) {
                    objM6514H15 = new C2469O0(voiceModeViewModel2, 8);
                    c6021p.m6537c0(objM6514H15);
                } else {
                    objM6514H15 = new C2469O0(voiceModeViewModel2, 8);
                    c6021p.m6537c0(objM6514H15);
                }
                InterfaceC1426a interfaceC1426a13 = (InterfaceC1426a) objM6514H15;
                c6021p.m6553p(false);
                c6021p.m6524S(-636583287);
                zM6545h9 = c6021p.m6545h(obj5);
                objM6514H16 = c6021p.m6514H();
                if (zM6545h9) {
                    objM6514H16 = new C0292u(1, obj5, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 8);
                    c6021p.m6537c0(objM6514H16);
                } else {
                    objM6514H16 = new C0292u(1, obj5, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 8);
                    c6021p.m6537c0(objM6514H16);
                }
                c6021p.m6553p(false);
                InterfaceC1436k interfaceC1436k7 = (InterfaceC1436k) ((InterfaceC3759g) objM6514H16);
                c6021p.m6524S(-636580972);
                zM6545h10 = c6021p.m6545h(voiceModeViewModel2);
                objM6514H17 = c6021p.m6514H();
                if (zM6545h10) {
                    objM6514H17 = new C2471P0(voiceModeViewModel2, 3);
                    c6021p.m6537c0(objM6514H17);
                } else {
                    objM6514H17 = new C2471P0(voiceModeViewModel2, 3);
                    c6021p.m6537c0(objM6514H17);
                }
                c6021p.m6553p(false);
                AbstractC2454H.m3583a(interfaceC1426a13, interfaceC1436k7, (InterfaceC1436k) objM6514H17, null, c2532n1.f7914u, null, c6021p, 0);
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
            interfaceC10459q4 = interfaceC10459q7;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3449s(interfaceC1436k, interfaceC10459q4, i10, i11, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m14402a(InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, AssistantViewModel assistantViewModel, C6021p c6021p, int i10) {
        int i11;
        InterfaceC2062k interfaceC2062k;
        AssistantViewModel assistantViewModel2;
        C2001r c2001rM9315d;
        AbstractC16544l.m18094g(interfaceC1436k, wNrQXvwLiB.SuBUOMnHX);
        c6021p.m6526U(-1440411807);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1436k) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
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
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                assistantViewModel2 = (AssistantViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                assistantViewModel2 = assistantViewModel;
            }
            c6021p.m6554q();
            Context context2 = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            InterfaceC5985X interfaceC5985XM9805a = AbstractC9233X.m9805a(assistantViewModel2.f40343c, C3434d.f10455o0, c6021p, 48);
            Boolean bool = (Boolean) interfaceC5985XM9805a.getValue();
            c6021p.m6524S(-1030182750);
            boolean zM6542f2 = c6021p.m6542f(interfaceC5985XM9805a) | c6021p.m6545h(context2) | c6021p.m6545h(abstractActivityC17375g);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                objM6514H2 = new C3447q(context2, abstractActivityC17375g, interfaceC5985XM9805a, null);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, bool);
            if (AbstractC16544l.m18089b((Boolean) interfaceC5985XM9805a.getValue(), Boolean.FALSE) && (c2001rM9315d = AbstractC8645h4.m9315d(null, c6021p, 1)) != null) {
                AbstractC16421b.m18008a(new Object[]{c2001rM9315d}, AbstractC8411c.m8969c(410775048, c6021p, new C0349j(interfaceC1436k, 11, interfaceC10459q)), c6021p, 48);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(interfaceC1436k, interfaceC10459q, assistantViewModel2, i10, 15);
        }
    }
}
