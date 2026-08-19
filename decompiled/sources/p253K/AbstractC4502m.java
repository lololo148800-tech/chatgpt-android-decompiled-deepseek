package p253K;

import af.C10559O;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bf.C11349D;
import bf.C11377e;
import bf.C11391s;
import bf.InterfaceC11374b0;
import com.openai.chatgpt.R;
import com.openai.feature.conversationdetails.impl.ConversationDetailsViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import com.withpersona.sdk2.inquiry.network.HttpStatusCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p002A0.AbstractC0127d;
import p002A0.C0120T;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0178J0;
import p025An.C0644w;
import p042Bf.C1281w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p080D0.AbstractC1807h0;
import p080D0.C1811j0;
import p098Di.InterfaceC2062k;
import p1071w0.EnumC20729S;
import p1095x1.InterfaceC21098s;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21319m;
import p1139z0.AbstractC21627m;
import p1139z0.C21574A0;
import p1139z0.C21582E0;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21936L0;
import p1155zi.C22011h0;
import p193Hf.C3312I0;
import p204I1.C3578I;
import p204I1.C3581L;
import p204I1.C3599o;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p269Kh.C4688o;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p482Tg.C7443a0;
import p492U1.C7545j;
import p523V9.AbstractC8086f4;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8143m5;
import p523V9.AbstractC8150n4;
import p530Vi.AbstractC8301I;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8680n3;
import p544W9.AbstractC8693p4;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p594Y9.AbstractC9697A3;
import p594Y9.AbstractC9745I3;
import p594Y9.AbstractC9803S2;
import p594Y9.AbstractC9809T2;
import p594Y9.AbstractC9815U2;
import p604Yk.C10077b;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p759g1.C13800b;
import p789hg.C14505d;
import p857kl.AbstractC16442I;
import p857kl.C16452T;
import p857kl.C16464l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import p963qd.AbstractC18673b;
import p963qd.C18678g;
import p963qd.C18679h;
import p963qd.C18680i;
import p963qd.C18681j;
import p963qd.C18682k;
import p963qd.C18683l;
import p963qd.C18684m;
import p963qd.C18685n;
import p963qd.C18686o;
import p963qd.C18687p;
import ph.C18416d;
import sg.C19575q;
import ve.C20584h;

/* JADX INFO: renamed from: K.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4502m {

    /* JADX INFO: renamed from: a */
    public static volatile Handler f14692a;

    /* JADX INFO: renamed from: a */
    public static final void m5238a(ConversationDetailsViewModel conversationDetailsViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        ConversationDetailsViewModel conversationDetailsViewModel2;
        ConversationDetailsViewModel conversationDetailsViewModel3;
        c6021p.m6526U(1797189553);
        if ((((i10 & 6) == 0 ? i10 | 2 : i10) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            conversationDetailsViewModel3 = conversationDetailsViewModel;
        } else {
            c6021p.m6519N();
            int i11 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i11 == 0 || c6021p.m6561x()) {
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C18686o.class));
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
                Object objMo5693b = c16527d.mo5693b(ConversationDetailsViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C18686o.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C18686o.class), c16527d.mo5693b(ConversationDetailsViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationDetailsViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                conversationDetailsViewModel2 = (ConversationDetailsViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                conversationDetailsViewModel2 = conversationDetailsViewModel;
            }
            c6021p.m6554q();
            InterfaceC5985X interfaceC5985XM9642d = AbstractC9112C3.m9642d(conversationDetailsViewModel2.f40343c, c6021p);
            c6021p.m6524S(-609790330);
            if (((C18686o) interfaceC5985XM9642d.getValue()).f59492f) {
                C11349D c11349d = ((C18686o) interfaceC5985XM9642d.getValue()).f59489c;
                String str = c11349d != null ? c11349d.f34318a : null;
                C21936L0 c21936l0 = str != null ? new C21936L0(str) : null;
                C11349D c11349d2 = ((C18686o) interfaceC5985XM9642d.getValue()).f59489c;
                if (c11349d2 == null || !c11349d2.f34328k) {
                    c21936l0 = null;
                }
                String str2 = c21936l0 != null ? c21936l0.f69488a : null;
                String str3 = ((C18686o) interfaceC5985XM9642d.getValue()).f59487a;
                C22011h0 c22011h0 = str3 != null ? new C22011h0(str3) : null;
                if (!((C18686o) interfaceC5985XM9642d.getValue()).f59493g) {
                    c22011h0 = null;
                }
                String str4 = c22011h0 != null ? c22011h0.f69652a : null;
                C18687p c18687p = ((C18686o) interfaceC5985XM9642d.getValue()).f59494h;
                C19575q c19575q = new C19575q(str2, str4, c18687p != null ? c18687p.f59498c : null);
                c6021p.m6524S(-609776924);
                boolean zM6542f2 = c6021p.m6542f(conversationDetailsViewModel2);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == obj) {
                    objM6514H2 = new C18678g(conversationDetailsViewModel2, 0);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC8086f4.m8515b(c19575q, (InterfaceC1426a) objM6514H2, null, c6021p, 0, 4);
            }
            c6021p.m6553p(false);
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            AbstractC8680n3.m9368a(null, 0L, AbstractC10842a.m11223a(0.0f, 0.0f, 3), 0, null, false, null, AbstractC8411c.m8969c(190084797, c6021p, new C18416d(interfaceC5985XM9642d, 4, c8870f)), null, null, AbstractC8411c.m8969c(-281342979, c6021p, new C1281w(c8870f, conversationDetailsViewModel2, interfaceC5985XM9642d)), c6021p, 12586368, 6, 883);
            conversationDetailsViewModel3 = conversationDetailsViewModel2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(conversationDetailsViewModel3, i10, 26);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5239b(C11349D c11349d, InterfaceC11374b0 interfaceC11374b0, C4688o c4688o, C20584h c20584h, C18687p c18687p, boolean z6, InterfaceC1436k onActions, InterfaceC1436k onAccounts, InterfaceC1426a onGizmoWebsite, InterfaceC1426a onReport, InterfaceC1426a onOpenShareHelpCenter, C6021p c6021p, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        boolean z12;
        boolean z13;
        boolean z14;
        List list;
        AbstractC16544l.m18094g(onActions, "onActions");
        AbstractC16544l.m18094g(onAccounts, "onAccounts");
        AbstractC16544l.m18094g(onGizmoWebsite, "onGizmoWebsite");
        AbstractC16544l.m18094g(onReport, "onReport");
        AbstractC16544l.m18094g(onOpenShareHelpCenter, "onOpenShareHelpCenter");
        c6021p.m6526U(394248428);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(c11349d) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(interfaceC11374b0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(c4688o) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6542f(c20584h) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6545h(c18687p) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c6021p.m6544g(z6) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c6021p.m6545h(onActions) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= c6021p.m6545h(onAccounts) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= c6021p.m6545h(onGizmoWebsite) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i12 |= c6021p.m6545h(onReport) ? 536870912 : 268435456;
        }
        int i15 = i12;
        if ((i11 & 6) == 0) {
            i13 = i11 | (c6021p.m6545h(onOpenShareHelpCenter) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i15 & 306783379) == 306783378 && (i13 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i16 = c6021p.f19564P;
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
            C21694h c21694h = C21698j.f68873f;
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a);
            C21694h c21694h2 = C21698j.f68872e;
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h3 = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
            float f10 = AbstractC7313q.f23201f;
            InterfaceC10459q interfaceC10459qM11237o = AbstractC10842a.m11237o(AbstractC10842a.m11235m(interfaceC10459qM11244d, f10, 0.0f, 2), 0.0f, 0.0f, 0.0f, f10, 7);
            C17790w c17790wM19515a2 = AbstractC17788v.m19515a(AbstractC17770m.m19500g(AbstractC7313q.f23199d), C10444b.f30947z0, c6021p, 48);
            int i17 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11237o);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, c17790wM19515a2);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i17))) {
                AbstractC0168G.m537z(i17, c6021p, i17, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            c6021p.m6524S(1978342472);
            if (c11349d == null || !c11349d.f34317D) {
                AbstractC9815U2.m10443b(c11349d, AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23190g), c6021p, i15 & 14);
                String strM8676d = c11349d != null ? c11349d.f34319b : null;
                c6021p.m6524S(1978349907);
                if (strM8676d == null) {
                    strM8676d = AbstractC8142m4.m8676d(R.string.conversations_role_assistant, c6021p);
                }
                c6021p.m6553p(false);
                i14 = 67108864;
                AbstractC4124r4.m4768b(strM8676d, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12151g, c6021p, 0, 0, 65534);
                z10 = false;
            } else {
                z10 = false;
                i14 = 67108864;
            }
            c6021p.m6553p(z10);
            c6021p.m6524S(1978358072);
            C5975S c5975s = C6013l.f19514a;
            if (c11349d == null || c11349d.f34317D) {
                z11 = false;
            } else {
                c6021p.m6524S(1978361976);
                boolean z15 = (i15 & 234881024) == i14;
                Object objM6514H = c6021p.m6514H();
                if (z15 || objM6514H == c5975s) {
                    objM6514H = new C1811j0(13, onGizmoWebsite);
                    c6021p.m6537c0(objM6514H);
                }
                z11 = false;
                c6021p.m6553p(false);
                AbstractC9809T2.m10433a(i15 & 14, (InterfaceC1436k) objM6514H, c6021p, null, c11349d);
            }
            c6021p.m6553p(z11);
            c6021p.m6553p(true);
            c6021p.m6524S(-201293863);
            String str = c11349d != null ? c11349d.f34320c : null;
            if (str != null && !AbstractC21322p.m21681O(str)) {
                AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.conversation_details_description, c6021p), null, 0L, c6021p, 0, 6);
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(-338677925, c6021p, new C10559O(c11349d, 1)), null, null, null, null, null, null, 0.0f, 0.0f, c6021p, 6, 510);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-201285308);
            if (interfaceC11374b0 != null) {
                c6021p.m6524S(-201284615);
                C11349D c11349d2 = (C11349D) interfaceC11374b0;
                String str2 = c11349d2.f34322e;
                if (str2 != null && !AbstractC21322p.m21681O(str2)) {
                    AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.conversation_details_custom_instructions, c6021p), null, 0L, c6021p, 0, 6);
                    AbstractC3914G1.m4611a(AbstractC8411c.m8969c(-896456915, c6021p, new C7443a0(interfaceC11374b0, 25)), null, null, null, null, null, null, 0.0f, 0.0f, c6021p, 6, 510);
                }
                c6021p.m6553p(false);
                List list2 = c11349d2.f34316C;
                if (!list2.isEmpty()) {
                    AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.conversation_details_sources, c6021p), null, 0L, c6021p, 0, 6);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        m5240c((C11377e) it.next(), AbstractC10844c.m11244d(c10456n, 1.0f), c6021p, 48);
                    }
                }
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-201262002);
            if (c18687p != null) {
                c6021p.m6524S(-201261152);
                if (c18687p.f59496a != null) {
                    AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.conversation_details_date_shared_header, c6021p), null, 0L, c6021p, 0, 6);
                    AbstractC3914G1.m4611a(AbstractC8411c.m8969c(1682911790, c6021p, new C7443a0(c18687p, 26)), null, null, null, null, null, null, 0.0f, 0.0f, c6021p, 6, 510);
                }
                c6021p.m6553p(false);
                AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.conversation_details_shared_conversation_privacy_header, c6021p), null, 0L, c6021p, 0, 6);
                c6021p.m6524S(-201238637);
                boolean z16 = (i15 & 1879048192) == 536870912;
                Object objM6514H2 = c6021p.m6514H();
                if (z16 || objM6514H2 == c5975s) {
                    objM6514H2 = new C14505d(13, onReport);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC3914G1.m4611a(AbstractC18673b.f59442a, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H2, 7), null, null, AbstractC18673b.f59443b, null, null, 0.0f, 0.0f, c6021p, 24582, 492);
                if (c18687p.f59497b) {
                    C8410b c8410b = AbstractC18673b.f59444c;
                    c6021p.m6524S(-201227232);
                    boolean z17 = (i13 & 14) == 4;
                    Object objM6514H3 = c6021p.m6514H();
                    if (z17 || objM6514H3 == c5975s) {
                        objM6514H3 = new C14505d(14, onOpenShareHelpCenter);
                        c6021p.m6537c0(objM6514H3);
                    }
                    c6021p.m6553p(false);
                    AbstractC3914G1.m4611a(c8410b, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H3, 7), null, null, null, null, null, 0.0f, 0.0f, c6021p, 6, 508);
                }
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-201223732);
            if (c20584h != null && c20584h.f65315a) {
                AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.customization_screen_title, c6021p), null, 0L, c6021p, 0, 6);
                AbstractC3914G1.m4611a(AbstractC18673b.f59445d, null, null, AbstractC8411c.m8969c(1793391319, c6021p, new C18682k(c20584h, 0)), null, null, null, 0.0f, 0.0f, c6021p, 3078, HttpStatusCode.BAD_GATEWAY_502);
                AbstractC3914G1.m4611a(AbstractC18673b.f59446e, null, null, AbstractC8411c.m8969c(-51234674, c6021p, new C18682k(c20584h, 1)), null, null, null, 0.0f, 0.0f, c6021p, 3078, HttpStatusCode.BAD_GATEWAY_502);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-201193105);
            if (c4688o != null && c11349d == null) {
                AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.conversation_model_info, c6021p), null, 0L, c6021p, 0, 6);
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(-1932725611, c6021p, new C18679h(c4688o, 0)), null, null, AbstractC8411c.m8969c(77792728, c6021p, new C18679h(c4688o, 1)), null, null, null, 0.0f, 0.0f, c6021p, 3078, HttpStatusCode.BAD_GATEWAY_502);
            }
            c6021p.m6553p(false);
            if (c11349d == null || (list = c11349d.f34340w) == null) {
                arrayList = null;
            } else {
                List list3 = list;
                arrayList = new ArrayList(AbstractC17682p.m19389r(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C11391s) it2.next()).f34416b);
                }
            }
            List listM10426b = AbstractC9803S2.m10426b(arrayList, z6);
            c6021p.m6524S(-201178226);
            if (!listM10426b.isEmpty()) {
                AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.conversation_details_capabilities, c6021p), null, 0L, c6021p, 0, 6);
                AbstractC3914G1.m4611a(AbstractC8411c.m8969c(646643094, c6021p, new C18680i(0, listM10426b)), null, null, null, null, null, null, 0.0f, 0.0f, c6021p, 6, 510);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-201166297);
            if (c11349d == null || !((z13 = c11349d.f34328k) || c11349d.m12779c() || c11349d.m12778b())) {
                z12 = false;
            } else {
                AbstractC9745I3.m10335a(AbstractC8142m4.m8676d(R.string.conversation_details_privacy, c6021p), null, 0L, c6021p, 0, 6);
                c6021p.m6524S(-201162166);
                if (c11349d.m12779c()) {
                    C8410b c8410b2 = AbstractC18673b.f59447f;
                    c6021p.m6524S(-201153956);
                    boolean z18 = ((i15 & 3670016) == 1048576) | ((i15 & 14) == 4);
                    Object objM6514H4 = c6021p.m6514H();
                    if (z18 || objM6514H4 == c5975s) {
                        objM6514H4 = new C18681j(onActions, c11349d, 0);
                        c6021p.m6537c0(objM6514H4);
                    }
                    c6021p.m6553p(false);
                    AbstractC3914G1.m4611a(c8410b2, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) objM6514H4, 7), null, null, AbstractC18673b.f59448g, null, null, 0.0f, 0.0f, c6021p, 24582, 492);
                }
                c6021p.m6553p(false);
                c6021p.m6524S(-201148295);
                if (c11349d.m12778b()) {
                    C8410b c8410b3 = AbstractC18673b.f59449h;
                    c6021p.m6524S(-201140003);
                    boolean z19 = ((i15 & 14) == 4) | ((i15 & 29360128) == 8388608);
                    Object objM6514H5 = c6021p.m6514H();
                    if (z19 || objM6514H5 == c5975s) {
                        z14 = false;
                        objM6514H5 = new C18681j(onAccounts, c11349d, 1);
                        c6021p.m6537c0(objM6514H5);
                    } else {
                        z14 = false;
                    }
                    c6021p.m6553p(z14);
                    z12 = z14;
                    AbstractC3914G1.m4611a(c8410b3, AbstractC10833a.m11209d(c10456n, z14, null, (InterfaceC1426a) objM6514H5, 7), null, null, AbstractC18673b.f59450i, null, null, 0.0f, 0.0f, c6021p, 24582, 492);
                } else {
                    z12 = false;
                }
                c6021p.m6553p(z12);
                if (z13) {
                    C8410b c8410b4 = AbstractC18673b.f59451j;
                    c6021p.m6524S(-201126765);
                    boolean z20 = (i15 & 1879048192) == 536870912 ? true : z12;
                    Object objM6514H6 = c6021p.m6514H();
                    if (z20 || objM6514H6 == c5975s) {
                        objM6514H6 = new C14505d(12, onReport);
                        c6021p.m6537c0(objM6514H6);
                    }
                    c6021p.m6553p(z12);
                    AbstractC3914G1.m4611a(c8410b4, AbstractC10833a.m11209d(c10456n, z12, null, (InterfaceC1426a) objM6514H6, 7), null, null, AbstractC18673b.f59452k, null, null, 0.0f, 0.0f, c6021p, 24582, 492);
                }
            }
            c6021p.m6553p(z12);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18683l(c11349d, interfaceC11374b0, c4688o, c20584h, c18687p, z6, onActions, onAccounts, onGizmoWebsite, onReport, onOpenShareHelpCenter, i10, i11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m5240c(C11377e c11377e, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(666014931);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(c11377e) : c6021p.m6545h(c11377e) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC3914G1.m4611a(AbstractC8411c.m8969c(226815921, c6021p, new C18684m(c11377e, 0)), interfaceC10459q, null, AbstractC8411c.m8969c(331287732, c6021p, new C18684m(c11377e, 1)), AbstractC8411c.m8969c(366111669, c6021p, new C18684m(c11377e, 2)), null, null, 0.0f, 0.0f, c6021p, (i11 & 112) | 27654, 484);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18685n(c11377e, interfaceC10459q, i10, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m5241d(InterfaceC1426a interfaceC1426a, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1056803819);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC9697A3.m10288c(interfaceC1426a, null, AbstractC18673b.f59453l, c6021p, (i11 & 14) | 384, 2);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3312I0(i10, 2, interfaceC1426a);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final long m5242e(C21582E0 c21582e0, C0120T c0120t, C21574A0 c21574a0, long j10) {
        long j11;
        long jM409n = c0120t.m409n();
        if (!AbstractC8088f6.m8539e(jM409n) && c21582e0.m21881c().f67817Y.length() != 0) {
            long j12 = c21582e0.m21881c().f67818Z;
            EnumC20729S enumC20729SM408m = c0120t.m408m();
            int i10 = enumC20729SM408m == null ? -1 : AbstractC0127d.f540a[enumC20729SM408m.ordinal()];
            if (i10 != -1) {
                if (i10 == 1 || i10 == 2) {
                    int i11 = C3581L.f10907c;
                    j11 = j12 >> 32;
                } else {
                    if (i10 != 3) {
                        throw new C0644w();
                    }
                    int i12 = C3581L.f10907c;
                    j11 = 4294967295L & j12;
                }
                int i13 = (int) j11;
                C3578I c3578iM21849b = c21574a0.m21849b();
                if (c3578iM21849b == null) {
                    return 9205357640488583168L;
                }
                float fM15306g = C13800b.m15306g(jM409n);
                int iM4257g = c3578iM21849b.m4257g(i13);
                float fM4258h = c3578iM21849b.m4258h(iM4257g);
                float fM4259i = c3578iM21849b.m4259i(iM4257g);
                float fM8920k = AbstractC8301I.m8920k(fM15306g, Math.min(fM4258h, fM4259i), Math.max(fM4258h, fM4259i));
                if (!C7545j.m7886a(j10, 0L) && Math.abs(fM15306g - fM8920k) > ((int) (j10 >> 32)) / 2) {
                    return 9205357640488583168L;
                }
                C3599o c3599o = c3578iM21849b.f10893b;
                float fM4312d = c3599o.m4312d(iM4257g);
                long jM8536b = AbstractC8088f6.m8536b(fM8920k, ((c3599o.m4310b(iM4257g) - fM4312d) / 2) + fM4312d);
                InterfaceC21098s interfaceC21098sM21851d = c21574a0.m21851d();
                C13800b c13800b = null;
                if (interfaceC21098sM21851d != null) {
                    if (!interfaceC21098sM21851d.mo21522h()) {
                        interfaceC21098sM21851d = null;
                    }
                    if (interfaceC21098sM21851d != null) {
                        jM8536b = AbstractC21627m.m21962j(jM8536b, AbstractC1807h0.m2611F(interfaceC21098sM21851d));
                    }
                }
                InterfaceC21098s interfaceC21098sM21851d2 = c21574a0.m21851d();
                if (interfaceC21098sM21851d2 == null) {
                    return jM8536b;
                }
                if (!interfaceC21098sM21851d2.mo21522h()) {
                    interfaceC21098sM21851d2 = null;
                }
                if (interfaceC21098sM21851d2 == null) {
                    return jM8536b;
                }
                InterfaceC21098s interfaceC21098s = (InterfaceC21098s) c21574a0.f68317e.getValue();
                if (interfaceC21098s != null) {
                    if (!interfaceC21098s.mo21522h()) {
                        interfaceC21098s = null;
                    }
                    if (interfaceC21098s != null) {
                        c13800b = new C13800b(interfaceC21098s.mo21521e(interfaceC21098sM21851d2, jM8536b));
                    }
                }
                return c13800b != null ? c13800b.f43584a : jM8536b;
            }
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: f */
    public static Handler m5243f() {
        if (f14692a != null) {
            return f14692a;
        }
        synchronized (AbstractC4502m.class) {
            try {
                if (f14692a == null) {
                    f14692a = AbstractC8143m5.m8678a(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f14692a;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m5244g(C16464l c16464l, C16452T requestUrl) {
        String strM21715w0;
        AbstractC16544l.m18094g(requestUrl, "requestUrl");
        String str = c16464l.f51075f;
        if (str == null || (strM21715w0 = AbstractC21322p.m21715w0(AbstractC8150n4.m8692e(str), '.')) == null) {
            throw new IllegalStateException("Domain field should have the default value");
        }
        String strConcat = c16464l.f51076g;
        if (strConcat == null) {
            throw new IllegalStateException("Path field should have the default value");
        }
        if (!AbstractC21322p.m21671E(strConcat, '/')) {
            strConcat = strConcat.concat(Separators.SLASH);
        }
        String strM8692e = AbstractC8150n4.m8692e(requestUrl.f51035a);
        String strConcat2 = (String) requestUrl.f51044j.getValue();
        if (!AbstractC21322p.m21671E(strConcat2, '/')) {
            strConcat2 = strConcat2.concat(Separators.SLASH);
        }
        if (!strM8692e.equals(strM21715w0)) {
            C10077b c10077b = AbstractC16442I.f51015a;
            c10077b.getClass();
            if (((C21319m) c10077b.f29833Z).m21664d(strM8692e) || !AbstractC21329w.m21725l(strM8692e, Separators.DOT.concat(strM21715w0), false)) {
                return false;
            }
        }
        if (AbstractC16544l.m18089b(strConcat, Separators.SLASH) || AbstractC16544l.m18089b(strConcat2, strConcat) || AbstractC21329w.m21734u(strConcat2, strConcat, false)) {
            return !c16464l.f51077h || AbstractC8693p4.m9393e(requestUrl.f51043i);
        }
        return false;
    }
}
