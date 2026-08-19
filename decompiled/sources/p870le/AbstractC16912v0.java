package p870le;

import android.content.Context;
import androidx.compose.animation.AbstractC10831a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.google.protobuf.AbstractC12107L1;
import com.openai.feature.conversations.impl.conversation.ConversationViewModel;
import com.openai.feature.conversations.input.InputViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import gd.C13959l0;
import gd.C13963m0;
import ge.C14083j0;
import ge.C14107v0;
import ge.C14111x0;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import ni.C17632f;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p042Bf.C1281w;
import p046Bk.C1325F0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p072Ci.C1705j;
import p092Dc.C1996m;
import p098Di.InterfaceC2062k;
import p1025te.C19866Q;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p147Fh.C2744a;
import p193Hf.C3323O;
import p193Hf.C3368h0;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4160x4;
import p229J0.AbstractC4166y4;
import p229J0.C3899D4;
import p229J0.C3949M0;
import p292Lg.C5033e;
import p349O0.AbstractC6012k0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p406Qg.C6723s;
import p406Qg.C6727w;
import p478Tc.AbstractC7302f;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8190s4;
import p523V9.AbstractC8223w5;
import p528Vg.C8287f;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8741x4;
import p547Wc.C8772P;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p571X9.AbstractC9262b4;
import p587Y1.C9596v;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p706df.C13101u;
import p736f0.AbstractC13474L;
import p736f0.AbstractC13508z;
import p758g0.AbstractC13758e;
import p758g0.C13781p0;
import p774h1.C14365u;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17781r0;
import p948pi.C18418a;
import ye.EnumC21517f;

/* JADX INFO: renamed from: le.v0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16912v0 {

    /* JADX INFO: renamed from: a */
    public static final float f54326a = RCHTTPStatusCodes.SUCCESS;

    /* JADX INFO: renamed from: b */
    public static final float f54327b = 44;

    /* JADX INFO: renamed from: a */
    public static final void m18581a(boolean z6, boolean z10, boolean z11, InterfaceC1436k onUpdateExpand, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        Object next;
        Object objM19235b;
        AbstractC16544l.m18094g(onUpdateExpand, "onUpdateExpand");
        c6021p.m6526U(1485581239);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onUpdateExpand) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c6021p.m6524S(617413469);
            Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof C1996m));
            if (next != null) {
                objM19235b = (C1996m) next;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(C1996m.class);
                c6021p.m6553p(false);
            }
            C1996m c1996m = (C1996m) objM19235b;
            AbstractC8223w5.m8850b(Boolean.valueOf(z6), null, C16883h.f54200D0, null, "AttachMenuButton", null, AbstractC8411c.m8969c(-191846406, c6021p, new C16898o0(z11, z10, onUpdateExpand, c1996m != null ? c1996m.f5936a : null, c8870f, interfaceC10459q)), c6021p, (i12 & 14) | 1597824, 42);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8287f(z6, z10, z11, onUpdateExpand, interfaceC10459q, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m18582b(C14111x0 c14111x0, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(191808987);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c14111x0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1436k) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            boolean zM15499m = c14111x0.m15499m();
            C13781p0 c13781p0M15255t = AbstractC13758e.m15255t(150, 0, null, 6);
            C10451i c10451i = C10444b.f30938q0;
            AbstractC10831a.m11201d(zM15499m, null, AbstractC13508z.m15011c(c13781p0M15255t, c10451i, 12).m14995a(AbstractC13508z.m15013e(AbstractC13758e.m15255t(150, 0, null, 6), 2)), AbstractC13508z.m15019k(AbstractC13758e.m15255t(150, 0, null, 6), c10451i, 12).m14996a(AbstractC13508z.m15014f(AbstractC13758e.m15255t(150, 0, null, 6), 2)), null, AbstractC8411c.m8969c(-1344051533, c6021p, new C1281w(interfaceC1436k, c14111x0, interfaceC10459q, 23)), c6021p, 200064, 18);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C16857N(c14111x0, interfaceC1436k, interfaceC10459q, i10, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m18583c(boolean z6, EnumC21517f forceSearchMode, boolean z10, InterfaceC1426a onDismissTooltip, InterfaceC1436k onForceSearchSelect, InterfaceC1436k openExternalLink, C6021p c6021p, int i10) {
        int i11;
        long j10;
        C6021p c6021p2;
        AbstractC16544l.m18094g(forceSearchMode, "forceSearchMode");
        AbstractC16544l.m18094g(onDismissTooltip, "onDismissTooltip");
        AbstractC16544l.m18094g(onForceSearchSelect, "onForceSearchSelect");
        AbstractC16544l.m18094g(openExternalLink, "openExternalLink");
        c6021p.m6526U(-23190101);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(forceSearchMode) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onDismissTooltip) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(onForceSearchSelect) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(openExternalLink) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            boolean z11 = forceSearchMode == EnumC21517f.f68139o0;
            C3899D4 c3899d4M4790b = AbstractC4166y4.m4790b(true, c6021p);
            boolean z12 = true;
            InterfaceC5982V0 interfaceC5982V0M14999a = AbstractC13474L.m14999a(z11 ? C14365u.m15774b(0.15f, AbstractC7302f.f23128d) : C14365u.f45059i, null, "BackgroundColorAnimation", c6021p, 384, 10);
            if (!z6) {
                c6021p.m6524S(-1460061647);
                j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s;
                c6021p.m6553p(false);
            } else if (z11) {
                c6021p.m6524S(-1460060207);
                c6021p.m6553p(false);
                j10 = AbstractC7302f.f23128d;
            } else {
                c6021p.m6524S(-1460058456);
                j10 = ((C14365u) c6021p.m6548k(AbstractC4025b1.f12649a)).f45062a;
                c6021p.m6553p(false);
            }
            InterfaceC5982V0 interfaceC5982V0M14999a2 = AbstractC13474L.m14999a(j10, null, "IconColorAnimation", c6021p, 384, 10);
            InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(onDismissTooltip, c6021p);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(-1460053069);
            boolean z13 = (i11 & 896) == 256;
            if ((i11 & 14) != 4) {
                z12 = false;
            }
            boolean zM6545h = z13 | z12 | c6021p.m6545h(c3899d4M4790b) | c6021p.m6542f(interfaceC5985XM6435V);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                c6021p2 = c6021p;
                C16906s0 c16906s0 = new C16906s0(z10, z6, c3899d4M4790b, interfaceC5985XM6435V, null);
                c6021p2.m6537c0(c16906s0);
                objM6514H = c16906s0;
            } else {
                c6021p2 = c6021p;
            }
            c6021p2.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p2, c17296c);
            AbstractC4166y4.m4789a(AbstractC4160x4.m4788a(c6021p), AbstractC8411c.m8969c(-134368106, c6021p2, new C5033e(3, openExternalLink)), c3899d4M4790b, null, false, true, AbstractC8411c.m8969c(1460231920, c6021p2, new C6727w(z6, onForceSearchSelect, z11, interfaceC5982V0M14999a, interfaceC5982V0M14999a2)), c6021p, 1794096, 8);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8772P(z6, forceSearchMode, z10, onDismissTooltip, onForceSearchSelect, openExternalLink, i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m18584d(boolean z6, boolean z10, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-96259847);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6544g(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC4166y4.m4789a(AbstractC4160x4.m4788a(c6021p), AbstractC8411c.m8969c(434309486, c6021p, new C3323O(3, interfaceC1426a2)), AbstractC4166y4.m4790b(false, c6021p), null, false, true, AbstractC8411c.m8969c(-1182321068, c6021p, new C3368h0(z6, interfaceC10459q, interfaceC1426a, z10)), c6021p, 1794096, 8);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C13101u(z6, z10, interfaceC1426a, interfaceC1426a2, interfaceC10459q, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0299  */
    /* JADX WARN: Code duplicated, block: B:103:0x029c  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:123:0x0302 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0304  */
    /* JADX WARN: Code duplicated, block: B:127:0x0348  */
    /* JADX WARN: Code duplicated, block: B:128:0x034c  */
    /* JADX WARN: Code duplicated, block: B:131:0x035f  */
    /* JADX WARN: Code duplicated, block: B:133:0x036d  */
    /* JADX WARN: Code duplicated, block: B:136:0x039f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:140:0x0404 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x040a  */
    /* JADX WARN: Code duplicated, block: B:147:0x043d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:164:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:166:0x04db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:170:0x0502 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x0504  */
    /* JADX WARN: Code duplicated, block: B:175:0x0535  */
    /* JADX WARN: Code duplicated, block: B:177:0x0545 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x0547  */
    /* JADX WARN: Code duplicated, block: B:181:0x0561 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x0563  */
    /* JADX WARN: Code duplicated, block: B:185:0x0579 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x057f  */
    /* JADX WARN: Code duplicated, block: B:192:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:194:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:196:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:198:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:200:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:202:0x05de  */
    /* JADX WARN: Code duplicated, block: B:204:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:206:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:208:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:210:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0117  */
    /* JADX WARN: Code duplicated, block: B:65:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x015e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0174  */
    /* JADX WARN: Code duplicated, block: B:75:0x017f  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0230  */
    /* JADX WARN: Code duplicated, block: B:93:0x0276  */
    /* JADX WARN: Code duplicated, block: B:98:0x0282  */
    /* JADX WARN: Code duplicated, block: B:99:0x0289  */
    /* JADX INFO: renamed from: e */
    public static final void m18585e(InterfaceC10459q interfaceC10459q, boolean z6, boolean z10, C6021p c6021p, int i10, int i11) {
        InterfaceC10459q interfaceC10459q2;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        int i15;
        C10456n c10456n;
        InterfaceC10459q interfaceC10459q3;
        boolean z13;
        boolean z14;
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
        InputViewModel inputViewModel;
        Context context2;
        boolean zBooleanValue2;
        List list2;
        InterfaceC2062k interfaceC2062k2;
        ViewModelStoreOwner viewModelStoreOwnerM12165a2;
        boolean zM6542f2;
        Object objM6514H2;
        ConversationViewModel conversationViewModel;
        C14111x0 c14111x0;
        C19866Q c19866q;
        boolean zM6542f3;
        Object objM6514H3;
        InterfaceC3759g interfaceC3759g;
        boolean zM6545h;
        Object objM6514H4;
        InterfaceC3759g interfaceC3759g2;
        InterfaceC20904w interfaceC20904w;
        C8870f c8870f;
        Iterator it;
        Object next;
        Object objM19235b;
        C1996m c1996m;
        C18418a c18418a;
        boolean z15;
        boolean zM20784g;
        boolean z16;
        Object objM6514H5;
        InterfaceC5985X interfaceC5985X;
        boolean zM6545h2;
        Object objM6514H6;
        InterfaceC1436k interfaceC1436k;
        int i16;
        InterfaceC1426a interfaceC1426a;
        C21694h c21694h;
        boolean zM6542f4;
        Object objM6514H7;
        boolean z17;
        float f10;
        Object obj2;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean zM6542f5;
        Object objM6514H8;
        boolean zM13832w;
        Object objM6514H9;
        boolean z21;
        int i17;
        float f11;
        boolean z22;
        boolean zM6544g;
        Object objM6514H10;
        boolean zM6545h3;
        Object objM6514H11;
        C1705j c1705j;
        C6018n0 c6018n0M6555r;
        c6021p.m6526U(-656199188);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            interfaceC10459q2 = interfaceC10459q;
        } else if ((i10 & 6) == 0) {
            interfaceC10459q2 = interfaceC10459q;
            i12 = (c6021p.m6542f(interfaceC10459q2) ? 4 : 2) | i10;
        } else {
            interfaceC10459q2 = interfaceC10459q;
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                z11 = z6;
                i12 |= c6021p.m6544g(z11) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z12 = z10;
                    if (c6021p.m6544g(z12)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i12;
                if ((i15 & 147) == 146 || !c6021p.m6562y()) {
                    c10456n = C10456n.f30959Y;
                    if (i18 != 0) {
                        interfaceC10459q3 = c10456n;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i19 != 0) {
                        z13 = false;
                    } else {
                        z13 = z11;
                    }
                    if (i13 != 0) {
                        z14 = false;
                    } else {
                        z14 = z12;
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
                        interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19866Q.class));
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
                    Object objMo5693b = c16527d.mo5693b(InputViewModel.class);
                    Object objMo5693b2 = c16527d.mo5693b(C19866Q.class);
                    c6021p.m6524S(-1395498839);
                    zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                    objM6514H = c6021p.m6514H();
                    obj = C6013l.f19514a;
                    if (zM6542f || objM6514H == obj) {
                        if (zBooleanValue) {
                            ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19866Q.class), c16527d.mo5693b(InputViewModel.class), context, interfaceC2062k);
                            throw null;
                        }
                        if (zBooleanValue) {
                            throw new C0644w();
                        }
                        objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a, list);
                        c6021p.m6537c0(objM6514H);
                    }
                    BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                    c6021p.m6553p(false);
                    InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                    c6021p.m6553p(false);
                    inputViewModel = (InputViewModel) baseViewModel;
                    c6021p.m6524S(-1020152108);
                    context2 = (Context) c6021p.m6548k(abstractC6012k0);
                    zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                    list2 = (List) c6021p.m6548k(abstractC6012k2);
                    c6021p.m6524S(-1395507574);
                    if (zBooleanValue2) {
                        interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14111x0.class));
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
                    Object objMo5693b3 = c16527d.mo5693b(ConversationViewModel.class);
                    Object objMo5693b4 = c16527d.mo5693b(C14111x0.class);
                    c6021p.m6524S(-1395498839);
                    zM6542f2 = c6021p.m6542f(objMo5693b4) | c6021p.m6542f(objMo5693b3) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6542f2 || objM6514H2 == obj) {
                        if (zBooleanValue2) {
                            ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                            throw null;
                        }
                        if (zBooleanValue2) {
                            throw new C0644w();
                        }
                        objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                        c6021p.m6537c0(objM6514H2);
                    }
                    BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H2;
                    c6021p.m6553p(false);
                    InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
                    c6021p.m6553p(false);
                    conversationViewModel = (ConversationViewModel) baseViewModel2;
                    c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
                    c19866q = (C19866Q) AbstractC9112C3.m9642d(inputViewModel.f40343c, c6021p).getValue();
                    c6021p.m6524S(-1447087765);
                    zM6542f3 = c6021p.m6542f(conversationViewModel);
                    objM6514H3 = c6021p.m6514H();
                    if (zM6542f3 || objM6514H3 == obj) {
                        objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 2);
                        c6021p.m6537c0(objM6514H3);
                    }
                    interfaceC3759g = (InterfaceC3759g) objM6514H3;
                    c6021p.m6553p(false);
                    c6021p.m6524S(-1447085820);
                    zM6545h = c6021p.m6545h(inputViewModel);
                    objM6514H4 = c6021p.m6514H();
                    if (zM6545h || objM6514H4 == obj) {
                        objM6514H4 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                        c6021p.m6537c0(objM6514H4);
                    }
                    interfaceC3759g2 = (InterfaceC3759g) objM6514H4;
                    c6021p.m6553p(false);
                    interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                    c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                    c6021p.m6524S(617413469);
                    it = ((Iterable) c6021p.m6548k(abstractC6012k2)).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(next instanceof C1996m));
                    if (next != null) {
                        objM19235b = (C1996m) next;
                        c6021p.m6553p(false);
                    } else {
                        objM19235b = C17632f.f56419a.m19235b(C1996m.class);
                        c6021p.m6553p(false);
                    }
                    c1996m = (C1996m) objM19235b;
                    if (c1996m != null) {
                        c18418a = c1996m.f5936a;
                    } else {
                        c18418a = null;
                    }
                    if (!c14111x0.f44438z.f44212e || c19866q.m20785h()) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    zM20784g = c19866q.m20784g();
                    boolean zM20783f = c19866q.m20783f();
                    if (!c14111x0.m15495i() || (c1705j = c14111x0.f44431s) == null || c1705j.f4883p) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    c6021p.m6524S(-1447056109);
                    objM6514H5 = c6021p.m6514H();
                    if (objM6514H5 == obj) {
                        objM6514H5 = C5997d.m6430Q(Boolean.valueOf(z13), C5975S.f19448r0);
                        c6021p.m6537c0(objM6514H5);
                    }
                    interfaceC5985X = (InterfaceC5985X) objM6514H5;
                    c6021p.m6553p(false);
                    c6021p.m6524S(-1447052953);
                    zM6545h2 = c6021p.m6545h(interfaceC20904w) | c6021p.m6544g(z15) | c6021p.m6542f(c19866q);
                    objM6514H6 = c6021p.m6514H();
                    if (zM6545h2 || objM6514H6 == obj) {
                        objM6514H6 = new C1325F0(interfaceC20904w, z15, c19866q, interfaceC5985X, 5);
                        c6021p.m6537c0(objM6514H6);
                    }
                    interfaceC1436k = (InterfaceC1436k) objM6514H6;
                    c6021p.m6553p(false);
                    boolean z23 = z15;
                    C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 54);
                    i16 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                    InterfaceC21700k.f68875m0.getClass();
                    InterfaceC10459q interfaceC10459q4 = interfaceC10459q3;
                    interfaceC1426a = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(interfaceC1426a);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                        AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    boolean zBooleanValue3 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                    C9596v c9596v = new C9596v(false, 14);
                    InterfaceC10459q interfaceC10459qM11257q = AbstractC10844c.m11257q(c10456n, f54326a, 0.0f, 2);
                    c6021p.m6524S(-1376763105);
                    zM6542f4 = c6021p.m6542f(interfaceC1436k);
                    objM6514H7 = c6021p.m6514H();
                    if (zM6542f4 || objM6514H7 == obj) {
                        objM6514H7 = new C16886i0(2, interfaceC1436k);
                        c6021p.m6537c0(objM6514H7);
                    }
                    c6021p.m6553p(false);
                    AbstractC8190s4.m8770a(zBooleanValue3, (InterfaceC1426a) objM6514H7, interfaceC10459qM11257q, 0L, null, c9596v, AbstractC8411c.m8969c(1259678531, c6021p, new C16910u0(interfaceC20904w, interfaceC1436k, c18418a, c8870f, interfaceC3759g2, zM20784g, zM20783f)), c6021p, 1769856, 24);
                    boolean zBooleanValue4 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                    if (!zM20784g || zM20783f) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    m18581a(zBooleanValue4, z17, z14, interfaceC1436k, AbstractC9262b4.m9836a(c10456n, !z23), c6021p, i15 & 896);
                    f10 = f54327b;
                    m18582b(c14111x0, (InterfaceC1436k) interfaceC3759g, AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f10), f10), c6021p, 384);
                    c6021p.m6524S(-1376663560);
                    if (c19866q.f62979j || z14) {
                        obj2 = obj;
                        z18 = false;
                    } else {
                        c6021p.m6524S(-1376655065);
                        boolean zM6542f6 = c6021p.m6542f(interfaceC3759g);
                        Object objM6514H12 = c6021p.m6514H();
                        obj2 = obj;
                        if (zM6542f6 || objM6514H12 == obj2) {
                            objM6514H12 = new C16862T(interfaceC3759g, 5);
                            c6021p.m6537c0(objM6514H12);
                        }
                        InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H12;
                        boolean zM13832w2 = AbstractC12107L1.m13832w(c6021p, false, -1376651723, interfaceC3759g2);
                        Object objM6514H13 = c6021p.m6514H();
                        if (zM13832w2 || objM6514H13 == obj2) {
                            objM6514H13 = new C14107v0(interfaceC3759g2, 11);
                            c6021p.m6537c0(objM6514H13);
                        }
                        InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) objM6514H13;
                        boolean zM13832w3 = AbstractC12107L1.m13832w(c6021p, false, -1376649015, interfaceC3759g2);
                        Object objM6514H14 = c6021p.m6514H();
                        if (zM13832w3 || objM6514H14 == obj2) {
                            objM6514H14 = new C14107v0(interfaceC3759g2, 12);
                            c6021p.m6537c0(objM6514H14);
                        }
                        c6021p.m6553p(false);
                        z18 = false;
                        m18583c(c19866q.f62994y, c19866q.f62977h, z16, interfaceC1426a2, interfaceC1436k2, (InterfaceC1436k) objM6514H14, c6021p, 0);
                    }
                    c6021p.m6553p(z18);
                    c6021p.m6524S(-1376644913);
                    if (AbstractC8160o6.m8729d(C13963m0.f44015c, c6021p)) {
                        c6021p.m6524S(-1376639435);
                        boolean zM6542f7 = c6021p.m6542f(interfaceC3759g);
                        z22 = c14111x0.f44380K;
                        zM6544g = zM6542f7 | c6021p.m6544g(z22);
                        objM6514H10 = c6021p.m6514H();
                        if (zM6544g || objM6514H10 == obj2) {
                            objM6514H10 = new C6723s(2, interfaceC3759g, z22);
                            c6021p.m6537c0(objM6514H10);
                        }
                        InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H10;
                        c6021p.m6553p(z18);
                        c6021p.m6524S(-1376635408);
                        zM6545h3 = c6021p.m6545h(c8870f) | c6021p.m6542f(c14111x0);
                        objM6514H11 = c6021p.m6514H();
                        if (zM6545h3 || objM6514H11 == obj2) {
                            objM6514H11 = new C14083j0(c8870f, c14111x0, 1);
                            c6021p.m6537c0(objM6514H11);
                        }
                        c6021p.m6553p(z18);
                        m18584d(c14111x0.f44423n0, z22, interfaceC1426a3, (InterfaceC1426a) objM6514H11, AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f10), f10), c6021p, 24576);
                    }
                    c6021p.m6553p(z18);
                    c6021p.m6524S(-1376614833);
                    if (AbstractC8160o6.m8729d(C13959l0.f44012c, c6021p)) {
                        c6021p.m6524S(-1376606372);
                        zM6542f5 = c6021p.m6542f(interfaceC3759g2);
                        objM6514H8 = c6021p.m6514H();
                        if (zM6542f5 || objM6514H8 == obj2) {
                            objM6514H8 = new C14107v0(interfaceC3759g2, 13);
                            c6021p.m6537c0(objM6514H8);
                        }
                        InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) objM6514H8;
                        zM13832w = AbstractC12107L1.m13832w(c6021p, z18, -1376603531, interfaceC3759g);
                        objM6514H9 = c6021p.m6514H();
                        if (zM13832w || objM6514H9 == obj2) {
                            objM6514H9 = new C14107v0(interfaceC3759g, 14);
                            c6021p.m6537c0(objM6514H9);
                        }
                        InterfaceC1436k interfaceC1436k4 = (InterfaceC1436k) objM6514H9;
                        c6021p.m6553p(z18);
                        if (c14111x0.m15494h() || z14) {
                            z21 = z18;
                            i17 = 2;
                            f11 = 0.0f;
                        } else {
                            i17 = 2;
                            f11 = 0.0f;
                            z21 = true;
                        }
                        AbstractC8741x4.m9482f(c14111x0, c19866q.f62971b, c19866q.f62984o, interfaceC1436k3, interfaceC1436k4, z21, AbstractC10844c.m11245e(AbstractC10844c.m11257q(c10456n, f10, f11, i17), f10), c6021p, 1572864);
                    }
                    c6021p.m6553p(z18);
                    c6021p.m6553p(true);
                    z19 = z13;
                    z20 = z14;
                    interfaceC10459q2 = interfaceC10459q4;
                } else {
                    c6021p.m6517L();
                    z19 = z11;
                    z20 = z12;
                }
                c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C2744a(interfaceC10459q2, z19, z20, i10, i11, 2);
                }
            }
            i12 |= 384;
            z12 = z10;
            i15 = i12;
            if ((i15 & 147) == 146) {
                c10456n = C10456n.f30959Y;
                if (i18 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i19 != 0) {
                    z13 = false;
                } else {
                    z13 = z11;
                }
                if (i13 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
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
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19866Q.class));
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
                Object objMo5693b5 = c16527d.mo5693b(InputViewModel.class);
                Object objMo5693b6 = c16527d.mo5693b(C19866Q.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b5) | c6021p.m6542f(objMo5693b6) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                if (zM6542f) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19866Q.class), c16527d.mo5693b(InputViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19866Q.class), c16527d.mo5693b(InputViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel3 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel3, c6021p, 0);
                c6021p.m6553p(false);
                inputViewModel = (InputViewModel) baseViewModel3;
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                list2 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue2) {
                    interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14111x0.class));
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
                Object objMo5693b7 = c16527d.mo5693b(ConversationViewModel.class);
                Object objMo5693b8 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                zM6542f2 = c6021p.m6542f(objMo5693b8) | c6021p.m6542f(objMo5693b7) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM6514H2);
                }
                BaseViewModel baseViewModel4 = (BaseViewModel) objM6514H2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel4, c6021p, 0);
                c6021p.m6553p(false);
                conversationViewModel = (ConversationViewModel) baseViewModel4;
                c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
                c19866q = (C19866Q) AbstractC9112C3.m9642d(inputViewModel.f40343c, c6021p).getValue();
                c6021p.m6524S(-1447087765);
                zM6542f3 = c6021p.m6542f(conversationViewModel);
                objM6514H3 = c6021p.m6514H();
                if (zM6542f3) {
                    objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 2);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 2);
                    c6021p.m6537c0(objM6514H3);
                }
                interfaceC3759g = (InterfaceC3759g) objM6514H3;
                c6021p.m6553p(false);
                c6021p.m6524S(-1447085820);
                zM6545h = c6021p.m6545h(inputViewModel);
                objM6514H4 = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H4 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                    c6021p.m6537c0(objM6514H4);
                }
                interfaceC3759g2 = (InterfaceC3759g) objM6514H4;
                c6021p.m6553p(false);
                interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                c6021p.m6524S(617413469);
                it = ((Iterable) c6021p.m6548k(abstractC6012k2)).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof C1996m));
                if (next != null) {
                    objM19235b = (C1996m) next;
                    c6021p.m6553p(false);
                } else {
                    objM19235b = C17632f.f56419a.m19235b(C1996m.class);
                    c6021p.m6553p(false);
                }
                c1996m = (C1996m) objM19235b;
                if (c1996m != null) {
                    c18418a = c1996m.f5936a;
                } else {
                    c18418a = null;
                }
                if (c14111x0.f44438z.f44212e) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                zM20784g = c19866q.m20784g();
                boolean zM20783f2 = c19866q.m20783f();
                if (c14111x0.m15495i()) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                c6021p.m6524S(-1447056109);
                objM6514H5 = c6021p.m6514H();
                if (objM6514H5 == obj) {
                    objM6514H5 = C5997d.m6430Q(Boolean.valueOf(z13), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H5);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H5;
                c6021p.m6553p(false);
                c6021p.m6524S(-1447052953);
                zM6545h2 = c6021p.m6545h(interfaceC20904w) | c6021p.m6544g(z15) | c6021p.m6542f(c19866q);
                objM6514H6 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H6 = new C1325F0(interfaceC20904w, z15, c19866q, interfaceC5985X, 5);
                    c6021p.m6537c0(objM6514H6);
                } else {
                    objM6514H6 = new C1325F0(interfaceC20904w, z15, c19866q, interfaceC5985X, 5);
                    c6021p.m6537c0(objM6514H6);
                }
                interfaceC1436k = (InterfaceC1436k) objM6514H6;
                c6021p.m6553p(false);
                boolean z24 = z15;
                C17781r0 c17781r0M19506b2 = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 54);
                i16 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                InterfaceC21700k.f68875m0.getClass();
                InterfaceC10459q interfaceC10459q5 = interfaceC10459q3;
                interfaceC1426a = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b2);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m2);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                } else {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d2);
                boolean zBooleanValue5 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                C9596v c9596v2 = new C9596v(false, 14);
                InterfaceC10459q interfaceC10459qM11257q2 = AbstractC10844c.m11257q(c10456n, f54326a, 0.0f, 2);
                c6021p.m6524S(-1376763105);
                zM6542f4 = c6021p.m6542f(interfaceC1436k);
                objM6514H7 = c6021p.m6514H();
                if (zM6542f4) {
                    objM6514H7 = new C16886i0(2, interfaceC1436k);
                    c6021p.m6537c0(objM6514H7);
                } else {
                    objM6514H7 = new C16886i0(2, interfaceC1436k);
                    c6021p.m6537c0(objM6514H7);
                }
                c6021p.m6553p(false);
                AbstractC8190s4.m8770a(zBooleanValue5, (InterfaceC1426a) objM6514H7, interfaceC10459qM11257q2, 0L, null, c9596v2, AbstractC8411c.m8969c(1259678531, c6021p, new C16910u0(interfaceC20904w, interfaceC1436k, c18418a, c8870f, interfaceC3759g2, zM20784g, zM20783f2)), c6021p, 1769856, 24);
                boolean zBooleanValue6 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                if (zM20784g) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                m18581a(zBooleanValue6, z17, z14, interfaceC1436k, AbstractC9262b4.m9836a(c10456n, !z24), c6021p, i15 & 896);
                f10 = f54327b;
                m18582b(c14111x0, (InterfaceC1436k) interfaceC3759g, AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f10), f10), c6021p, 384);
                c6021p.m6524S(-1376663560);
                if (c19866q.f62979j) {
                    obj2 = obj;
                    z18 = false;
                } else {
                    obj2 = obj;
                    z18 = false;
                }
                c6021p.m6553p(z18);
                c6021p.m6524S(-1376644913);
                if (AbstractC8160o6.m8729d(C13963m0.f44015c, c6021p)) {
                    c6021p.m6524S(-1376639435);
                    boolean zM6542f8 = c6021p.m6542f(interfaceC3759g);
                    z22 = c14111x0.f44380K;
                    zM6544g = zM6542f8 | c6021p.m6544g(z22);
                    objM6514H10 = c6021p.m6514H();
                    if (zM6544g) {
                        objM6514H10 = new C6723s(2, interfaceC3759g, z22);
                        c6021p.m6537c0(objM6514H10);
                    } else {
                        objM6514H10 = new C6723s(2, interfaceC3759g, z22);
                        c6021p.m6537c0(objM6514H10);
                    }
                    InterfaceC1426a interfaceC1426a4 = (InterfaceC1426a) objM6514H10;
                    c6021p.m6553p(z18);
                    c6021p.m6524S(-1376635408);
                    zM6545h3 = c6021p.m6545h(c8870f) | c6021p.m6542f(c14111x0);
                    objM6514H11 = c6021p.m6514H();
                    if (zM6545h3) {
                        objM6514H11 = new C14083j0(c8870f, c14111x0, 1);
                        c6021p.m6537c0(objM6514H11);
                    } else {
                        objM6514H11 = new C14083j0(c8870f, c14111x0, 1);
                        c6021p.m6537c0(objM6514H11);
                    }
                    c6021p.m6553p(z18);
                    m18584d(c14111x0.f44423n0, z22, interfaceC1426a4, (InterfaceC1426a) objM6514H11, AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f10), f10), c6021p, 24576);
                }
                c6021p.m6553p(z18);
                c6021p.m6524S(-1376614833);
                if (AbstractC8160o6.m8729d(C13959l0.f44012c, c6021p)) {
                    c6021p.m6524S(-1376606372);
                    zM6542f5 = c6021p.m6542f(interfaceC3759g2);
                    objM6514H8 = c6021p.m6514H();
                    if (zM6542f5) {
                        objM6514H8 = new C14107v0(interfaceC3759g2, 13);
                        c6021p.m6537c0(objM6514H8);
                    } else {
                        objM6514H8 = new C14107v0(interfaceC3759g2, 13);
                        c6021p.m6537c0(objM6514H8);
                    }
                    InterfaceC1436k interfaceC1436k5 = (InterfaceC1436k) objM6514H8;
                    zM13832w = AbstractC12107L1.m13832w(c6021p, z18, -1376603531, interfaceC3759g);
                    objM6514H9 = c6021p.m6514H();
                    if (zM13832w) {
                        objM6514H9 = new C14107v0(interfaceC3759g, 14);
                        c6021p.m6537c0(objM6514H9);
                    } else {
                        objM6514H9 = new C14107v0(interfaceC3759g, 14);
                        c6021p.m6537c0(objM6514H9);
                    }
                    InterfaceC1436k interfaceC1436k6 = (InterfaceC1436k) objM6514H9;
                    c6021p.m6553p(z18);
                    if (c14111x0.m15494h()) {
                        z21 = z18;
                        i17 = 2;
                        f11 = 0.0f;
                    } else {
                        z21 = z18;
                        i17 = 2;
                        f11 = 0.0f;
                    }
                    AbstractC8741x4.m9482f(c14111x0, c19866q.f62971b, c19866q.f62984o, interfaceC1436k5, interfaceC1436k6, z21, AbstractC10844c.m11245e(AbstractC10844c.m11257q(c10456n, f10, f11, i17), f10), c6021p, 1572864);
                }
                c6021p.m6553p(z18);
                c6021p.m6553p(true);
                z19 = z13;
                z20 = z14;
                interfaceC10459q2 = interfaceC10459q5;
            } else {
                c10456n = C10456n.f30959Y;
                if (i18 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i19 != 0) {
                    z13 = false;
                } else {
                    z13 = z11;
                }
                if (i13 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
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
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19866Q.class));
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
                Object objMo5693b9 = c16527d.mo5693b(InputViewModel.class);
                Object objMo5693b10 = c16527d.mo5693b(C19866Q.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b9) | c6021p.m6542f(objMo5693b10) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                if (zM6542f) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19866Q.class), c16527d.mo5693b(InputViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19866Q.class), c16527d.mo5693b(InputViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel5 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel5, c6021p, 0);
                c6021p.m6553p(false);
                inputViewModel = (InputViewModel) baseViewModel5;
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                list2 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue2) {
                    interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14111x0.class));
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
                Object objMo5693b11 = c16527d.mo5693b(ConversationViewModel.class);
                Object objMo5693b12 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                zM6542f2 = c6021p.m6542f(objMo5693b12) | c6021p.m6542f(objMo5693b11) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM6514H2);
                }
                BaseViewModel baseViewModel6 = (BaseViewModel) objM6514H2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel6, c6021p, 0);
                c6021p.m6553p(false);
                conversationViewModel = (ConversationViewModel) baseViewModel6;
                c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
                c19866q = (C19866Q) AbstractC9112C3.m9642d(inputViewModel.f40343c, c6021p).getValue();
                c6021p.m6524S(-1447087765);
                zM6542f3 = c6021p.m6542f(conversationViewModel);
                objM6514H3 = c6021p.m6514H();
                if (zM6542f3) {
                    objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 2);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 2);
                    c6021p.m6537c0(objM6514H3);
                }
                interfaceC3759g = (InterfaceC3759g) objM6514H3;
                c6021p.m6553p(false);
                c6021p.m6524S(-1447085820);
                zM6545h = c6021p.m6545h(inputViewModel);
                objM6514H4 = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H4 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                    c6021p.m6537c0(objM6514H4);
                }
                interfaceC3759g2 = (InterfaceC3759g) objM6514H4;
                c6021p.m6553p(false);
                interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                c6021p.m6524S(617413469);
                it = ((Iterable) c6021p.m6548k(abstractC6012k2)).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof C1996m));
                if (next != null) {
                    objM19235b = (C1996m) next;
                    c6021p.m6553p(false);
                } else {
                    objM19235b = C17632f.f56419a.m19235b(C1996m.class);
                    c6021p.m6553p(false);
                }
                c1996m = (C1996m) objM19235b;
                if (c1996m != null) {
                    c18418a = c1996m.f5936a;
                } else {
                    c18418a = null;
                }
                if (c14111x0.f44438z.f44212e) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                zM20784g = c19866q.m20784g();
                boolean zM20783f3 = c19866q.m20783f();
                if (c14111x0.m15495i()) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                c6021p.m6524S(-1447056109);
                objM6514H5 = c6021p.m6514H();
                if (objM6514H5 == obj) {
                    objM6514H5 = C5997d.m6430Q(Boolean.valueOf(z13), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H5);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H5;
                c6021p.m6553p(false);
                c6021p.m6524S(-1447052953);
                zM6545h2 = c6021p.m6545h(interfaceC20904w) | c6021p.m6544g(z15) | c6021p.m6542f(c19866q);
                objM6514H6 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H6 = new C1325F0(interfaceC20904w, z15, c19866q, interfaceC5985X, 5);
                    c6021p.m6537c0(objM6514H6);
                } else {
                    objM6514H6 = new C1325F0(interfaceC20904w, z15, c19866q, interfaceC5985X, 5);
                    c6021p.m6537c0(objM6514H6);
                }
                interfaceC1436k = (InterfaceC1436k) objM6514H6;
                c6021p.m6553p(false);
                boolean z25 = z15;
                C17781r0 c17781r0M19506b3 = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 54);
                i16 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                InterfaceC21700k.f68875m0.getClass();
                InterfaceC10459q interfaceC10459q6 = interfaceC10459q3;
                interfaceC1426a = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b3);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m3);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                } else {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d3);
                boolean zBooleanValue7 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                C9596v c9596v3 = new C9596v(false, 14);
                InterfaceC10459q interfaceC10459qM11257q3 = AbstractC10844c.m11257q(c10456n, f54326a, 0.0f, 2);
                c6021p.m6524S(-1376763105);
                zM6542f4 = c6021p.m6542f(interfaceC1436k);
                objM6514H7 = c6021p.m6514H();
                if (zM6542f4) {
                    objM6514H7 = new C16886i0(2, interfaceC1436k);
                    c6021p.m6537c0(objM6514H7);
                } else {
                    objM6514H7 = new C16886i0(2, interfaceC1436k);
                    c6021p.m6537c0(objM6514H7);
                }
                c6021p.m6553p(false);
                AbstractC8190s4.m8770a(zBooleanValue7, (InterfaceC1426a) objM6514H7, interfaceC10459qM11257q3, 0L, null, c9596v3, AbstractC8411c.m8969c(1259678531, c6021p, new C16910u0(interfaceC20904w, interfaceC1436k, c18418a, c8870f, interfaceC3759g2, zM20784g, zM20783f3)), c6021p, 1769856, 24);
                boolean zBooleanValue8 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                if (zM20784g) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                m18581a(zBooleanValue8, z17, z14, interfaceC1436k, AbstractC9262b4.m9836a(c10456n, !z25), c6021p, i15 & 896);
                f10 = f54327b;
                m18582b(c14111x0, (InterfaceC1436k) interfaceC3759g, AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f10), f10), c6021p, 384);
                c6021p.m6524S(-1376663560);
                if (c19866q.f62979j) {
                    obj2 = obj;
                    z18 = false;
                } else {
                    obj2 = obj;
                    z18 = false;
                }
                c6021p.m6553p(z18);
                c6021p.m6524S(-1376644913);
                if (AbstractC8160o6.m8729d(C13963m0.f44015c, c6021p)) {
                    c6021p.m6524S(-1376639435);
                    boolean zM6542f9 = c6021p.m6542f(interfaceC3759g);
                    z22 = c14111x0.f44380K;
                    zM6544g = zM6542f9 | c6021p.m6544g(z22);
                    objM6514H10 = c6021p.m6514H();
                    if (zM6544g) {
                        objM6514H10 = new C6723s(2, interfaceC3759g, z22);
                        c6021p.m6537c0(objM6514H10);
                    } else {
                        objM6514H10 = new C6723s(2, interfaceC3759g, z22);
                        c6021p.m6537c0(objM6514H10);
                    }
                    InterfaceC1426a interfaceC1426a5 = (InterfaceC1426a) objM6514H10;
                    c6021p.m6553p(z18);
                    c6021p.m6524S(-1376635408);
                    zM6545h3 = c6021p.m6545h(c8870f) | c6021p.m6542f(c14111x0);
                    objM6514H11 = c6021p.m6514H();
                    if (zM6545h3) {
                        objM6514H11 = new C14083j0(c8870f, c14111x0, 1);
                        c6021p.m6537c0(objM6514H11);
                    } else {
                        objM6514H11 = new C14083j0(c8870f, c14111x0, 1);
                        c6021p.m6537c0(objM6514H11);
                    }
                    c6021p.m6553p(z18);
                    m18584d(c14111x0.f44423n0, z22, interfaceC1426a5, (InterfaceC1426a) objM6514H11, AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f10), f10), c6021p, 24576);
                }
                c6021p.m6553p(z18);
                c6021p.m6524S(-1376614833);
                if (AbstractC8160o6.m8729d(C13959l0.f44012c, c6021p)) {
                    c6021p.m6524S(-1376606372);
                    zM6542f5 = c6021p.m6542f(interfaceC3759g2);
                    objM6514H8 = c6021p.m6514H();
                    if (zM6542f5) {
                        objM6514H8 = new C14107v0(interfaceC3759g2, 13);
                        c6021p.m6537c0(objM6514H8);
                    } else {
                        objM6514H8 = new C14107v0(interfaceC3759g2, 13);
                        c6021p.m6537c0(objM6514H8);
                    }
                    InterfaceC1436k interfaceC1436k7 = (InterfaceC1436k) objM6514H8;
                    zM13832w = AbstractC12107L1.m13832w(c6021p, z18, -1376603531, interfaceC3759g);
                    objM6514H9 = c6021p.m6514H();
                    if (zM13832w) {
                        objM6514H9 = new C14107v0(interfaceC3759g, 14);
                        c6021p.m6537c0(objM6514H9);
                    } else {
                        objM6514H9 = new C14107v0(interfaceC3759g, 14);
                        c6021p.m6537c0(objM6514H9);
                    }
                    InterfaceC1436k interfaceC1436k8 = (InterfaceC1436k) objM6514H9;
                    c6021p.m6553p(z18);
                    if (c14111x0.m15494h()) {
                        z21 = z18;
                        i17 = 2;
                        f11 = 0.0f;
                    } else {
                        z21 = z18;
                        i17 = 2;
                        f11 = 0.0f;
                    }
                    AbstractC8741x4.m9482f(c14111x0, c19866q.f62971b, c19866q.f62984o, interfaceC1436k7, interfaceC1436k8, z21, AbstractC10844c.m11245e(AbstractC10844c.m11257q(c10456n, f10, f11, i17), f10), c6021p, 1572864);
                }
                c6021p.m6553p(z18);
                c6021p.m6553p(true);
                z19 = z13;
                z20 = z14;
                interfaceC10459q2 = interfaceC10459q6;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C2744a(interfaceC10459q2, z19, z20, i10, i11, 2);
            }
        }
        i12 |= 48;
        z11 = z6;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z12 = z10;
                if (c6021p.m6544g(z12)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i12;
            if ((i15 & 147) == 146) {
                c10456n = C10456n.f30959Y;
                if (i18 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i19 != 0) {
                    z13 = false;
                } else {
                    z13 = z11;
                }
                if (i13 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
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
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19866Q.class));
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
                Object objMo5693b13 = c16527d.mo5693b(InputViewModel.class);
                Object objMo5693b14 = c16527d.mo5693b(C19866Q.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b13) | c6021p.m6542f(objMo5693b14) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                if (zM6542f) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19866Q.class), c16527d.mo5693b(InputViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19866Q.class), c16527d.mo5693b(InputViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel7 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel7, c6021p, 0);
                c6021p.m6553p(false);
                inputViewModel = (InputViewModel) baseViewModel7;
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                list2 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue2) {
                    interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14111x0.class));
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
                Object objMo5693b15 = c16527d.mo5693b(ConversationViewModel.class);
                Object objMo5693b16 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                zM6542f2 = c6021p.m6542f(objMo5693b16) | c6021p.m6542f(objMo5693b15) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM6514H2);
                }
                BaseViewModel baseViewModel8 = (BaseViewModel) objM6514H2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel8, c6021p, 0);
                c6021p.m6553p(false);
                conversationViewModel = (ConversationViewModel) baseViewModel8;
                c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
                c19866q = (C19866Q) AbstractC9112C3.m9642d(inputViewModel.f40343c, c6021p).getValue();
                c6021p.m6524S(-1447087765);
                zM6542f3 = c6021p.m6542f(conversationViewModel);
                objM6514H3 = c6021p.m6514H();
                if (zM6542f3) {
                    objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 2);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 2);
                    c6021p.m6537c0(objM6514H3);
                }
                interfaceC3759g = (InterfaceC3759g) objM6514H3;
                c6021p.m6553p(false);
                c6021p.m6524S(-1447085820);
                zM6545h = c6021p.m6545h(inputViewModel);
                objM6514H4 = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H4 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                    c6021p.m6537c0(objM6514H4);
                }
                interfaceC3759g2 = (InterfaceC3759g) objM6514H4;
                c6021p.m6553p(false);
                interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                c6021p.m6524S(617413469);
                it = ((Iterable) c6021p.m6548k(abstractC6012k2)).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof C1996m));
                if (next != null) {
                    objM19235b = (C1996m) next;
                    c6021p.m6553p(false);
                } else {
                    objM19235b = C17632f.f56419a.m19235b(C1996m.class);
                    c6021p.m6553p(false);
                }
                c1996m = (C1996m) objM19235b;
                if (c1996m != null) {
                    c18418a = c1996m.f5936a;
                } else {
                    c18418a = null;
                }
                if (c14111x0.f44438z.f44212e) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                zM20784g = c19866q.m20784g();
                boolean zM20783f4 = c19866q.m20783f();
                if (c14111x0.m15495i()) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                c6021p.m6524S(-1447056109);
                objM6514H5 = c6021p.m6514H();
                if (objM6514H5 == obj) {
                    objM6514H5 = C5997d.m6430Q(Boolean.valueOf(z13), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H5);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H5;
                c6021p.m6553p(false);
                c6021p.m6524S(-1447052953);
                zM6545h2 = c6021p.m6545h(interfaceC20904w) | c6021p.m6544g(z15) | c6021p.m6542f(c19866q);
                objM6514H6 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H6 = new C1325F0(interfaceC20904w, z15, c19866q, interfaceC5985X, 5);
                    c6021p.m6537c0(objM6514H6);
                } else {
                    objM6514H6 = new C1325F0(interfaceC20904w, z15, c19866q, interfaceC5985X, 5);
                    c6021p.m6537c0(objM6514H6);
                }
                interfaceC1436k = (InterfaceC1436k) objM6514H6;
                c6021p.m6553p(false);
                boolean z26 = z15;
                C17781r0 c17781r0M19506b4 = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 54);
                i16 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                InterfaceC21700k.f68875m0.getClass();
                InterfaceC10459q interfaceC10459q7 = interfaceC10459q3;
                interfaceC1426a = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b4);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m4);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                } else {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d4);
                boolean zBooleanValue9 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                C9596v c9596v4 = new C9596v(false, 14);
                InterfaceC10459q interfaceC10459qM11257q4 = AbstractC10844c.m11257q(c10456n, f54326a, 0.0f, 2);
                c6021p.m6524S(-1376763105);
                zM6542f4 = c6021p.m6542f(interfaceC1436k);
                objM6514H7 = c6021p.m6514H();
                if (zM6542f4) {
                    objM6514H7 = new C16886i0(2, interfaceC1436k);
                    c6021p.m6537c0(objM6514H7);
                } else {
                    objM6514H7 = new C16886i0(2, interfaceC1436k);
                    c6021p.m6537c0(objM6514H7);
                }
                c6021p.m6553p(false);
                AbstractC8190s4.m8770a(zBooleanValue9, (InterfaceC1426a) objM6514H7, interfaceC10459qM11257q4, 0L, null, c9596v4, AbstractC8411c.m8969c(1259678531, c6021p, new C16910u0(interfaceC20904w, interfaceC1436k, c18418a, c8870f, interfaceC3759g2, zM20784g, zM20783f4)), c6021p, 1769856, 24);
                boolean zBooleanValue10 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                if (zM20784g) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                m18581a(zBooleanValue10, z17, z14, interfaceC1436k, AbstractC9262b4.m9836a(c10456n, !z26), c6021p, i15 & 896);
                f10 = f54327b;
                m18582b(c14111x0, (InterfaceC1436k) interfaceC3759g, AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f10), f10), c6021p, 384);
                c6021p.m6524S(-1376663560);
                if (c19866q.f62979j) {
                    obj2 = obj;
                    z18 = false;
                } else {
                    obj2 = obj;
                    z18 = false;
                }
                c6021p.m6553p(z18);
                c6021p.m6524S(-1376644913);
                if (AbstractC8160o6.m8729d(C13963m0.f44015c, c6021p)) {
                    c6021p.m6524S(-1376639435);
                    boolean zM6542f10 = c6021p.m6542f(interfaceC3759g);
                    z22 = c14111x0.f44380K;
                    zM6544g = zM6542f10 | c6021p.m6544g(z22);
                    objM6514H10 = c6021p.m6514H();
                    if (zM6544g) {
                        objM6514H10 = new C6723s(2, interfaceC3759g, z22);
                        c6021p.m6537c0(objM6514H10);
                    } else {
                        objM6514H10 = new C6723s(2, interfaceC3759g, z22);
                        c6021p.m6537c0(objM6514H10);
                    }
                    InterfaceC1426a interfaceC1426a6 = (InterfaceC1426a) objM6514H10;
                    c6021p.m6553p(z18);
                    c6021p.m6524S(-1376635408);
                    zM6545h3 = c6021p.m6545h(c8870f) | c6021p.m6542f(c14111x0);
                    objM6514H11 = c6021p.m6514H();
                    if (zM6545h3) {
                        objM6514H11 = new C14083j0(c8870f, c14111x0, 1);
                        c6021p.m6537c0(objM6514H11);
                    } else {
                        objM6514H11 = new C14083j0(c8870f, c14111x0, 1);
                        c6021p.m6537c0(objM6514H11);
                    }
                    c6021p.m6553p(z18);
                    m18584d(c14111x0.f44423n0, z22, interfaceC1426a6, (InterfaceC1426a) objM6514H11, AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f10), f10), c6021p, 24576);
                }
                c6021p.m6553p(z18);
                c6021p.m6524S(-1376614833);
                if (AbstractC8160o6.m8729d(C13959l0.f44012c, c6021p)) {
                    c6021p.m6524S(-1376606372);
                    zM6542f5 = c6021p.m6542f(interfaceC3759g2);
                    objM6514H8 = c6021p.m6514H();
                    if (zM6542f5) {
                        objM6514H8 = new C14107v0(interfaceC3759g2, 13);
                        c6021p.m6537c0(objM6514H8);
                    } else {
                        objM6514H8 = new C14107v0(interfaceC3759g2, 13);
                        c6021p.m6537c0(objM6514H8);
                    }
                    InterfaceC1436k interfaceC1436k9 = (InterfaceC1436k) objM6514H8;
                    zM13832w = AbstractC12107L1.m13832w(c6021p, z18, -1376603531, interfaceC3759g);
                    objM6514H9 = c6021p.m6514H();
                    if (zM13832w) {
                        objM6514H9 = new C14107v0(interfaceC3759g, 14);
                        c6021p.m6537c0(objM6514H9);
                    } else {
                        objM6514H9 = new C14107v0(interfaceC3759g, 14);
                        c6021p.m6537c0(objM6514H9);
                    }
                    InterfaceC1436k interfaceC1436k10 = (InterfaceC1436k) objM6514H9;
                    c6021p.m6553p(z18);
                    if (c14111x0.m15494h()) {
                        z21 = z18;
                        i17 = 2;
                        f11 = 0.0f;
                    } else {
                        z21 = z18;
                        i17 = 2;
                        f11 = 0.0f;
                    }
                    AbstractC8741x4.m9482f(c14111x0, c19866q.f62971b, c19866q.f62984o, interfaceC1436k9, interfaceC1436k10, z21, AbstractC10844c.m11245e(AbstractC10844c.m11257q(c10456n, f10, f11, i17), f10), c6021p, 1572864);
                }
                c6021p.m6553p(z18);
                c6021p.m6553p(true);
                z19 = z13;
                z20 = z14;
                interfaceC10459q2 = interfaceC10459q7;
            } else {
                c10456n = C10456n.f30959Y;
                if (i18 != 0) {
                    interfaceC10459q3 = c10456n;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i19 != 0) {
                    z13 = false;
                } else {
                    z13 = z11;
                }
                if (i13 != 0) {
                    z14 = false;
                } else {
                    z14 = z12;
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
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19866Q.class));
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
                Object objMo5693b17 = c16527d.mo5693b(InputViewModel.class);
                Object objMo5693b18 = c16527d.mo5693b(C19866Q.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b17) | c6021p.m6542f(objMo5693b18) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                obj = C6013l.f19514a;
                if (zM6542f) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19866Q.class), c16527d.mo5693b(InputViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19866Q.class), c16527d.mo5693b(InputViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel9 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel9, c6021p, 0);
                c6021p.m6553p(false);
                inputViewModel = (InputViewModel) baseViewModel9;
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(abstractC6012k0);
                zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
                list2 = (List) c6021p.m6548k(abstractC6012k2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue2) {
                    interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14111x0.class));
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
                Object objMo5693b19 = c16527d.mo5693b(ConversationViewModel.class);
                Object objMo5693b110 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                zM6542f2 = c6021p.m6542f(objMo5693b110) | c6021p.m6542f(objMo5693b19) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(objM6514H2);
                }
                BaseViewModel baseViewModel10 = (BaseViewModel) objM6514H2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel10, c6021p, 0);
                c6021p.m6553p(false);
                conversationViewModel = (ConversationViewModel) baseViewModel10;
                c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
                c19866q = (C19866Q) AbstractC9112C3.m9642d(inputViewModel.f40343c, c6021p).getValue();
                c6021p.m6524S(-1447087765);
                zM6542f3 = c6021p.m6542f(conversationViewModel);
                objM6514H3 = c6021p.m6514H();
                if (zM6542f3) {
                    objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 2);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 2);
                    c6021p.m6537c0(objM6514H3);
                }
                interfaceC3759g = (InterfaceC3759g) objM6514H3;
                c6021p.m6553p(false);
                c6021p.m6524S(-1447085820);
                zM6545h = c6021p.m6545h(inputViewModel);
                objM6514H4 = c6021p.m6514H();
                if (zM6545h) {
                    objM6514H4 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                    c6021p.m6537c0(objM6514H4);
                } else {
                    objM6514H4 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                    c6021p.m6537c0(objM6514H4);
                }
                interfaceC3759g2 = (InterfaceC3759g) objM6514H4;
                c6021p.m6553p(false);
                interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                c6021p.m6524S(617413469);
                it = ((Iterable) c6021p.m6548k(abstractC6012k2)).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(next instanceof C1996m));
                if (next != null) {
                    objM19235b = (C1996m) next;
                    c6021p.m6553p(false);
                } else {
                    objM19235b = C17632f.f56419a.m19235b(C1996m.class);
                    c6021p.m6553p(false);
                }
                c1996m = (C1996m) objM19235b;
                if (c1996m != null) {
                    c18418a = c1996m.f5936a;
                } else {
                    c18418a = null;
                }
                if (c14111x0.f44438z.f44212e) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                zM20784g = c19866q.m20784g();
                boolean zM20783f5 = c19866q.m20783f();
                if (c14111x0.m15495i()) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                c6021p.m6524S(-1447056109);
                objM6514H5 = c6021p.m6514H();
                if (objM6514H5 == obj) {
                    objM6514H5 = C5997d.m6430Q(Boolean.valueOf(z13), C5975S.f19448r0);
                    c6021p.m6537c0(objM6514H5);
                }
                interfaceC5985X = (InterfaceC5985X) objM6514H5;
                c6021p.m6553p(false);
                c6021p.m6524S(-1447052953);
                zM6545h2 = c6021p.m6545h(interfaceC20904w) | c6021p.m6544g(z15) | c6021p.m6542f(c19866q);
                objM6514H6 = c6021p.m6514H();
                if (zM6545h2) {
                    objM6514H6 = new C1325F0(interfaceC20904w, z15, c19866q, interfaceC5985X, 5);
                    c6021p.m6537c0(objM6514H6);
                } else {
                    objM6514H6 = new C1325F0(interfaceC20904w, z15, c19866q, interfaceC5985X, 5);
                    c6021p.m6537c0(objM6514H6);
                }
                interfaceC1436k = (InterfaceC1436k) objM6514H6;
                c6021p.m6553p(false);
                boolean z27 = z15;
                C17781r0 c17781r0M19506b5 = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 54);
                i16 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
                InterfaceC21700k.f68875m0.getClass();
                InterfaceC10459q interfaceC10459q8 = interfaceC10459q3;
                interfaceC1426a = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(interfaceC1426a);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b5);
                C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m5);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O) {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                } else {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d5);
                boolean zBooleanValue11 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                C9596v c9596v5 = new C9596v(false, 14);
                InterfaceC10459q interfaceC10459qM11257q5 = AbstractC10844c.m11257q(c10456n, f54326a, 0.0f, 2);
                c6021p.m6524S(-1376763105);
                zM6542f4 = c6021p.m6542f(interfaceC1436k);
                objM6514H7 = c6021p.m6514H();
                if (zM6542f4) {
                    objM6514H7 = new C16886i0(2, interfaceC1436k);
                    c6021p.m6537c0(objM6514H7);
                } else {
                    objM6514H7 = new C16886i0(2, interfaceC1436k);
                    c6021p.m6537c0(objM6514H7);
                }
                c6021p.m6553p(false);
                AbstractC8190s4.m8770a(zBooleanValue11, (InterfaceC1426a) objM6514H7, interfaceC10459qM11257q5, 0L, null, c9596v5, AbstractC8411c.m8969c(1259678531, c6021p, new C16910u0(interfaceC20904w, interfaceC1436k, c18418a, c8870f, interfaceC3759g2, zM20784g, zM20783f5)), c6021p, 1769856, 24);
                boolean zBooleanValue12 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
                if (zM20784g) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                m18581a(zBooleanValue12, z17, z14, interfaceC1436k, AbstractC9262b4.m9836a(c10456n, !z27), c6021p, i15 & 896);
                f10 = f54327b;
                m18582b(c14111x0, (InterfaceC1436k) interfaceC3759g, AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f10), f10), c6021p, 384);
                c6021p.m6524S(-1376663560);
                if (c19866q.f62979j) {
                    obj2 = obj;
                    z18 = false;
                } else {
                    obj2 = obj;
                    z18 = false;
                }
                c6021p.m6553p(z18);
                c6021p.m6524S(-1376644913);
                if (AbstractC8160o6.m8729d(C13963m0.f44015c, c6021p)) {
                    c6021p.m6524S(-1376639435);
                    boolean zM6542f11 = c6021p.m6542f(interfaceC3759g);
                    z22 = c14111x0.f44380K;
                    zM6544g = zM6542f11 | c6021p.m6544g(z22);
                    objM6514H10 = c6021p.m6514H();
                    if (zM6544g) {
                        objM6514H10 = new C6723s(2, interfaceC3759g, z22);
                        c6021p.m6537c0(objM6514H10);
                    } else {
                        objM6514H10 = new C6723s(2, interfaceC3759g, z22);
                        c6021p.m6537c0(objM6514H10);
                    }
                    InterfaceC1426a interfaceC1426a7 = (InterfaceC1426a) objM6514H10;
                    c6021p.m6553p(z18);
                    c6021p.m6524S(-1376635408);
                    zM6545h3 = c6021p.m6545h(c8870f) | c6021p.m6542f(c14111x0);
                    objM6514H11 = c6021p.m6514H();
                    if (zM6545h3) {
                        objM6514H11 = new C14083j0(c8870f, c14111x0, 1);
                        c6021p.m6537c0(objM6514H11);
                    } else {
                        objM6514H11 = new C14083j0(c8870f, c14111x0, 1);
                        c6021p.m6537c0(objM6514H11);
                    }
                    c6021p.m6553p(z18);
                    m18584d(c14111x0.f44423n0, z22, interfaceC1426a7, (InterfaceC1426a) objM6514H11, AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f10), f10), c6021p, 24576);
                }
                c6021p.m6553p(z18);
                c6021p.m6524S(-1376614833);
                if (AbstractC8160o6.m8729d(C13959l0.f44012c, c6021p)) {
                    c6021p.m6524S(-1376606372);
                    zM6542f5 = c6021p.m6542f(interfaceC3759g2);
                    objM6514H8 = c6021p.m6514H();
                    if (zM6542f5) {
                        objM6514H8 = new C14107v0(interfaceC3759g2, 13);
                        c6021p.m6537c0(objM6514H8);
                    } else {
                        objM6514H8 = new C14107v0(interfaceC3759g2, 13);
                        c6021p.m6537c0(objM6514H8);
                    }
                    InterfaceC1436k interfaceC1436k11 = (InterfaceC1436k) objM6514H8;
                    zM13832w = AbstractC12107L1.m13832w(c6021p, z18, -1376603531, interfaceC3759g);
                    objM6514H9 = c6021p.m6514H();
                    if (zM13832w) {
                        objM6514H9 = new C14107v0(interfaceC3759g, 14);
                        c6021p.m6537c0(objM6514H9);
                    } else {
                        objM6514H9 = new C14107v0(interfaceC3759g, 14);
                        c6021p.m6537c0(objM6514H9);
                    }
                    InterfaceC1436k interfaceC1436k12 = (InterfaceC1436k) objM6514H9;
                    c6021p.m6553p(z18);
                    if (c14111x0.m15494h()) {
                        z21 = z18;
                        i17 = 2;
                        f11 = 0.0f;
                    } else {
                        z21 = z18;
                        i17 = 2;
                        f11 = 0.0f;
                    }
                    AbstractC8741x4.m9482f(c14111x0, c19866q.f62971b, c19866q.f62984o, interfaceC1436k11, interfaceC1436k12, z21, AbstractC10844c.m11245e(AbstractC10844c.m11257q(c10456n, f10, f11, i17), f10), c6021p, 1572864);
                }
                c6021p.m6553p(z18);
                c6021p.m6553p(true);
                z19 = z13;
                z20 = z14;
                interfaceC10459q2 = interfaceC10459q8;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C2744a(interfaceC10459q2, z19, z20, i10, i11, 2);
            }
        }
        i12 |= 384;
        z12 = z10;
        i15 = i12;
        if ((i15 & 147) == 146) {
            c10456n = C10456n.f30959Y;
            if (i18 != 0) {
                interfaceC10459q3 = c10456n;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            if (i19 != 0) {
                z13 = false;
            } else {
                z13 = z11;
            }
            if (i13 != 0) {
                z14 = false;
            } else {
                z14 = z12;
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
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19866Q.class));
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
            Object objMo5693b111 = c16527d.mo5693b(InputViewModel.class);
            Object objMo5693b112 = c16527d.mo5693b(C19866Q.class);
            c6021p.m6524S(-1395498839);
            zM6542f = c6021p.m6542f(objMo5693b111) | c6021p.m6542f(objMo5693b112) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            objM6514H = c6021p.m6514H();
            obj = C6013l.f19514a;
            if (zM6542f) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19866Q.class), c16527d.mo5693b(InputViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            } else {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19866Q.class), c16527d.mo5693b(InputViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel11 = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel11, c6021p, 0);
            c6021p.m6553p(false);
            inputViewModel = (InputViewModel) baseViewModel11;
            c6021p.m6524S(-1020152108);
            context2 = (Context) c6021p.m6548k(abstractC6012k0);
            zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            list2 = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue2) {
                interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14111x0.class));
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
            Object objMo5693b113 = c16527d.mo5693b(ConversationViewModel.class);
            Object objMo5693b114 = c16527d.mo5693b(C14111x0.class);
            c6021p.m6524S(-1395498839);
            zM6542f2 = c6021p.m6542f(objMo5693b114) | c6021p.m6542f(objMo5693b113) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f2) {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H2);
            } else {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H2);
            }
            BaseViewModel baseViewModel12 = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel12, c6021p, 0);
            c6021p.m6553p(false);
            conversationViewModel = (ConversationViewModel) baseViewModel12;
            c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
            c19866q = (C19866Q) AbstractC9112C3.m9642d(inputViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(-1447087765);
            zM6542f3 = c6021p.m6542f(conversationViewModel);
            objM6514H3 = c6021p.m6514H();
            if (zM6542f3) {
                objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 2);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 2);
                c6021p.m6537c0(objM6514H3);
            }
            interfaceC3759g = (InterfaceC3759g) objM6514H3;
            c6021p.m6553p(false);
            c6021p.m6524S(-1447085820);
            zM6545h = c6021p.m6545h(inputViewModel);
            objM6514H4 = c6021p.m6514H();
            if (zM6545h) {
                objM6514H4 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                c6021p.m6537c0(objM6514H4);
            } else {
                objM6514H4 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                c6021p.m6537c0(objM6514H4);
            }
            interfaceC3759g2 = (InterfaceC3759g) objM6514H4;
            c6021p.m6553p(false);
            interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c6021p.m6524S(617413469);
            it = ((Iterable) c6021p.m6548k(abstractC6012k2)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof C1996m));
            if (next != null) {
                objM19235b = (C1996m) next;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(C1996m.class);
                c6021p.m6553p(false);
            }
            c1996m = (C1996m) objM19235b;
            if (c1996m != null) {
                c18418a = c1996m.f5936a;
            } else {
                c18418a = null;
            }
            if (c14111x0.f44438z.f44212e) {
                z15 = false;
            } else {
                z15 = false;
            }
            zM20784g = c19866q.m20784g();
            boolean zM20783f6 = c19866q.m20783f();
            if (c14111x0.m15495i()) {
                z16 = false;
            } else {
                z16 = false;
            }
            c6021p.m6524S(-1447056109);
            objM6514H5 = c6021p.m6514H();
            if (objM6514H5 == obj) {
                objM6514H5 = C5997d.m6430Q(Boolean.valueOf(z13), C5975S.f19448r0);
                c6021p.m6537c0(objM6514H5);
            }
            interfaceC5985X = (InterfaceC5985X) objM6514H5;
            c6021p.m6553p(false);
            c6021p.m6524S(-1447052953);
            zM6545h2 = c6021p.m6545h(interfaceC20904w) | c6021p.m6544g(z15) | c6021p.m6542f(c19866q);
            objM6514H6 = c6021p.m6514H();
            if (zM6545h2) {
                objM6514H6 = new C1325F0(interfaceC20904w, z15, c19866q, interfaceC5985X, 5);
                c6021p.m6537c0(objM6514H6);
            } else {
                objM6514H6 = new C1325F0(interfaceC20904w, z15, c19866q, interfaceC5985X, 5);
                c6021p.m6537c0(objM6514H6);
            }
            interfaceC1436k = (InterfaceC1436k) objM6514H6;
            c6021p.m6553p(false);
            boolean z28 = z15;
            C17781r0 c17781r0M19506b6 = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 54);
            i16 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC10459q interfaceC10459q9 = interfaceC10459q3;
            interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b6);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m6);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            } else {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d6);
            boolean zBooleanValue13 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            C9596v c9596v6 = new C9596v(false, 14);
            InterfaceC10459q interfaceC10459qM11257q6 = AbstractC10844c.m11257q(c10456n, f54326a, 0.0f, 2);
            c6021p.m6524S(-1376763105);
            zM6542f4 = c6021p.m6542f(interfaceC1436k);
            objM6514H7 = c6021p.m6514H();
            if (zM6542f4) {
                objM6514H7 = new C16886i0(2, interfaceC1436k);
                c6021p.m6537c0(objM6514H7);
            } else {
                objM6514H7 = new C16886i0(2, interfaceC1436k);
                c6021p.m6537c0(objM6514H7);
            }
            c6021p.m6553p(false);
            AbstractC8190s4.m8770a(zBooleanValue13, (InterfaceC1426a) objM6514H7, interfaceC10459qM11257q6, 0L, null, c9596v6, AbstractC8411c.m8969c(1259678531, c6021p, new C16910u0(interfaceC20904w, interfaceC1436k, c18418a, c8870f, interfaceC3759g2, zM20784g, zM20783f6)), c6021p, 1769856, 24);
            boolean zBooleanValue14 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            if (zM20784g) {
                z17 = true;
            } else {
                z17 = true;
            }
            m18581a(zBooleanValue14, z17, z14, interfaceC1436k, AbstractC9262b4.m9836a(c10456n, !z28), c6021p, i15 & 896);
            f10 = f54327b;
            m18582b(c14111x0, (InterfaceC1436k) interfaceC3759g, AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f10), f10), c6021p, 384);
            c6021p.m6524S(-1376663560);
            if (c19866q.f62979j) {
                obj2 = obj;
                z18 = false;
            } else {
                obj2 = obj;
                z18 = false;
            }
            c6021p.m6553p(z18);
            c6021p.m6524S(-1376644913);
            if (AbstractC8160o6.m8729d(C13963m0.f44015c, c6021p)) {
                c6021p.m6524S(-1376639435);
                boolean zM6542f12 = c6021p.m6542f(interfaceC3759g);
                z22 = c14111x0.f44380K;
                zM6544g = zM6542f12 | c6021p.m6544g(z22);
                objM6514H10 = c6021p.m6514H();
                if (zM6544g) {
                    objM6514H10 = new C6723s(2, interfaceC3759g, z22);
                    c6021p.m6537c0(objM6514H10);
                } else {
                    objM6514H10 = new C6723s(2, interfaceC3759g, z22);
                    c6021p.m6537c0(objM6514H10);
                }
                InterfaceC1426a interfaceC1426a8 = (InterfaceC1426a) objM6514H10;
                c6021p.m6553p(z18);
                c6021p.m6524S(-1376635408);
                zM6545h3 = c6021p.m6545h(c8870f) | c6021p.m6542f(c14111x0);
                objM6514H11 = c6021p.m6514H();
                if (zM6545h3) {
                    objM6514H11 = new C14083j0(c8870f, c14111x0, 1);
                    c6021p.m6537c0(objM6514H11);
                } else {
                    objM6514H11 = new C14083j0(c8870f, c14111x0, 1);
                    c6021p.m6537c0(objM6514H11);
                }
                c6021p.m6553p(z18);
                m18584d(c14111x0.f44423n0, z22, interfaceC1426a8, (InterfaceC1426a) objM6514H11, AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f10), f10), c6021p, 24576);
            }
            c6021p.m6553p(z18);
            c6021p.m6524S(-1376614833);
            if (AbstractC8160o6.m8729d(C13959l0.f44012c, c6021p)) {
                c6021p.m6524S(-1376606372);
                zM6542f5 = c6021p.m6542f(interfaceC3759g2);
                objM6514H8 = c6021p.m6514H();
                if (zM6542f5) {
                    objM6514H8 = new C14107v0(interfaceC3759g2, 13);
                    c6021p.m6537c0(objM6514H8);
                } else {
                    objM6514H8 = new C14107v0(interfaceC3759g2, 13);
                    c6021p.m6537c0(objM6514H8);
                }
                InterfaceC1436k interfaceC1436k13 = (InterfaceC1436k) objM6514H8;
                zM13832w = AbstractC12107L1.m13832w(c6021p, z18, -1376603531, interfaceC3759g);
                objM6514H9 = c6021p.m6514H();
                if (zM13832w) {
                    objM6514H9 = new C14107v0(interfaceC3759g, 14);
                    c6021p.m6537c0(objM6514H9);
                } else {
                    objM6514H9 = new C14107v0(interfaceC3759g, 14);
                    c6021p.m6537c0(objM6514H9);
                }
                InterfaceC1436k interfaceC1436k14 = (InterfaceC1436k) objM6514H9;
                c6021p.m6553p(z18);
                if (c14111x0.m15494h()) {
                    z21 = z18;
                    i17 = 2;
                    f11 = 0.0f;
                } else {
                    z21 = z18;
                    i17 = 2;
                    f11 = 0.0f;
                }
                AbstractC8741x4.m9482f(c14111x0, c19866q.f62971b, c19866q.f62984o, interfaceC1436k13, interfaceC1436k14, z21, AbstractC10844c.m11245e(AbstractC10844c.m11257q(c10456n, f10, f11, i17), f10), c6021p, 1572864);
            }
            c6021p.m6553p(z18);
            c6021p.m6553p(true);
            z19 = z13;
            z20 = z14;
            interfaceC10459q2 = interfaceC10459q9;
        } else {
            c10456n = C10456n.f30959Y;
            if (i18 != 0) {
                interfaceC10459q3 = c10456n;
            } else {
                interfaceC10459q3 = interfaceC10459q2;
            }
            if (i19 != 0) {
                z13 = false;
            } else {
                z13 = z11;
            }
            if (i13 != 0) {
                z14 = false;
            } else {
                z14 = z12;
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
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C19866Q.class));
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
            Object objMo5693b115 = c16527d.mo5693b(InputViewModel.class);
            Object objMo5693b116 = c16527d.mo5693b(C19866Q.class);
            c6021p.m6524S(-1395498839);
            zM6542f = c6021p.m6542f(objMo5693b115) | c6021p.m6542f(objMo5693b116) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            objM6514H = c6021p.m6514H();
            obj = C6013l.f19514a;
            if (zM6542f) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19866Q.class), c16527d.mo5693b(InputViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            } else {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C19866Q.class), c16527d.mo5693b(InputViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(InputViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel13 = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel13, c6021p, 0);
            c6021p.m6553p(false);
            inputViewModel = (InputViewModel) baseViewModel13;
            c6021p.m6524S(-1020152108);
            context2 = (Context) c6021p.m6548k(abstractC6012k0);
            zBooleanValue2 = ((Boolean) c6021p.m6548k(abstractC6012k1)).booleanValue();
            list2 = (List) c6021p.m6548k(abstractC6012k2);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue2) {
                interfaceC2062k2 = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14111x0.class));
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
            Object objMo5693b117 = c16527d.mo5693b(ConversationViewModel.class);
            Object objMo5693b118 = c16527d.mo5693b(C14111x0.class);
            c6021p.m6524S(-1395498839);
            zM6542f2 = c6021p.m6542f(objMo5693b118) | c6021p.m6542f(objMo5693b117) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f2) {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H2);
            } else {
                if (zBooleanValue2) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                    throw null;
                }
                if (zBooleanValue2) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                c6021p.m6537c0(objM6514H2);
            }
            BaseViewModel baseViewModel14 = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel14, c6021p, 0);
            c6021p.m6553p(false);
            conversationViewModel = (ConversationViewModel) baseViewModel14;
            c14111x0 = (C14111x0) AbstractC9112C3.m9642d(conversationViewModel.f40343c, c6021p).getValue();
            c19866q = (C19866Q) AbstractC9112C3.m9642d(inputViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(-1447087765);
            zM6542f3 = c6021p.m6542f(conversationViewModel);
            objM6514H3 = c6021p.m6514H();
            if (zM6542f3) {
                objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 2);
                c6021p.m6537c0(objM6514H3);
            } else {
                objM6514H3 = new C16863U(1, conversationViewModel, ConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 2);
                c6021p.m6537c0(objM6514H3);
            }
            interfaceC3759g = (InterfaceC3759g) objM6514H3;
            c6021p.m6553p(false);
            c6021p.m6524S(-1447085820);
            zM6545h = c6021p.m6545h(inputViewModel);
            objM6514H4 = c6021p.m6514H();
            if (zM6545h) {
                objM6514H4 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                c6021p.m6537c0(objM6514H4);
            } else {
                objM6514H4 = new C16863U(1, inputViewModel, InputViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 3);
                c6021p.m6537c0(objM6514H4);
            }
            interfaceC3759g2 = (InterfaceC3759g) objM6514H4;
            c6021p.m6553p(false);
            interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c6021p.m6524S(617413469);
            it = ((Iterable) c6021p.m6548k(abstractC6012k2)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof C1996m));
            if (next != null) {
                objM19235b = (C1996m) next;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(C1996m.class);
                c6021p.m6553p(false);
            }
            c1996m = (C1996m) objM19235b;
            if (c1996m != null) {
                c18418a = c1996m.f5936a;
            } else {
                c18418a = null;
            }
            if (c14111x0.f44438z.f44212e) {
                z15 = false;
            } else {
                z15 = false;
            }
            zM20784g = c19866q.m20784g();
            boolean zM20783f7 = c19866q.m20783f();
            if (c14111x0.m15495i()) {
                z16 = false;
            } else {
                z16 = false;
            }
            c6021p.m6524S(-1447056109);
            objM6514H5 = c6021p.m6514H();
            if (objM6514H5 == obj) {
                objM6514H5 = C5997d.m6430Q(Boolean.valueOf(z13), C5975S.f19448r0);
                c6021p.m6537c0(objM6514H5);
            }
            interfaceC5985X = (InterfaceC5985X) objM6514H5;
            c6021p.m6553p(false);
            c6021p.m6524S(-1447052953);
            zM6545h2 = c6021p.m6545h(interfaceC20904w) | c6021p.m6544g(z15) | c6021p.m6542f(c19866q);
            objM6514H6 = c6021p.m6514H();
            if (zM6545h2) {
                objM6514H6 = new C1325F0(interfaceC20904w, z15, c19866q, interfaceC5985X, 5);
                c6021p.m6537c0(objM6514H6);
            } else {
                objM6514H6 = new C1325F0(interfaceC20904w, z15, c19866q, interfaceC5985X, 5);
                c6021p.m6537c0(objM6514H6);
            }
            interfaceC1436k = (InterfaceC1436k) objM6514H6;
            c6021p.m6553p(false);
            boolean z29 = z15;
            C17781r0 c17781r0M19506b7 = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p, 54);
            i16 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m7 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d7 = AbstractC10443a.m10923d(c6021p, interfaceC10459q3);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC10459q interfaceC10459q10 = interfaceC10459q3;
            interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b7);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m7);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            } else {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d7);
            boolean zBooleanValue15 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            C9596v c9596v7 = new C9596v(false, 14);
            InterfaceC10459q interfaceC10459qM11257q7 = AbstractC10844c.m11257q(c10456n, f54326a, 0.0f, 2);
            c6021p.m6524S(-1376763105);
            zM6542f4 = c6021p.m6542f(interfaceC1436k);
            objM6514H7 = c6021p.m6514H();
            if (zM6542f4) {
                objM6514H7 = new C16886i0(2, interfaceC1436k);
                c6021p.m6537c0(objM6514H7);
            } else {
                objM6514H7 = new C16886i0(2, interfaceC1436k);
                c6021p.m6537c0(objM6514H7);
            }
            c6021p.m6553p(false);
            AbstractC8190s4.m8770a(zBooleanValue15, (InterfaceC1426a) objM6514H7, interfaceC10459qM11257q7, 0L, null, c9596v7, AbstractC8411c.m8969c(1259678531, c6021p, new C16910u0(interfaceC20904w, interfaceC1436k, c18418a, c8870f, interfaceC3759g2, zM20784g, zM20783f7)), c6021p, 1769856, 24);
            boolean zBooleanValue16 = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            if (zM20784g) {
                z17 = true;
            } else {
                z17 = true;
            }
            m18581a(zBooleanValue16, z17, z14, interfaceC1436k, AbstractC9262b4.m9836a(c10456n, !z29), c6021p, i15 & 896);
            f10 = f54327b;
            m18582b(c14111x0, (InterfaceC1436k) interfaceC3759g, AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f10), f10), c6021p, 384);
            c6021p.m6524S(-1376663560);
            if (c19866q.f62979j) {
                obj2 = obj;
                z18 = false;
            } else {
                obj2 = obj;
                z18 = false;
            }
            c6021p.m6553p(z18);
            c6021p.m6524S(-1376644913);
            if (AbstractC8160o6.m8729d(C13963m0.f44015c, c6021p)) {
                c6021p.m6524S(-1376639435);
                boolean zM6542f13 = c6021p.m6542f(interfaceC3759g);
                z22 = c14111x0.f44380K;
                zM6544g = zM6542f13 | c6021p.m6544g(z22);
                objM6514H10 = c6021p.m6514H();
                if (zM6544g) {
                    objM6514H10 = new C6723s(2, interfaceC3759g, z22);
                    c6021p.m6537c0(objM6514H10);
                } else {
                    objM6514H10 = new C6723s(2, interfaceC3759g, z22);
                    c6021p.m6537c0(objM6514H10);
                }
                InterfaceC1426a interfaceC1426a9 = (InterfaceC1426a) objM6514H10;
                c6021p.m6553p(z18);
                c6021p.m6524S(-1376635408);
                zM6545h3 = c6021p.m6545h(c8870f) | c6021p.m6542f(c14111x0);
                objM6514H11 = c6021p.m6514H();
                if (zM6545h3) {
                    objM6514H11 = new C14083j0(c8870f, c14111x0, 1);
                    c6021p.m6537c0(objM6514H11);
                } else {
                    objM6514H11 = new C14083j0(c8870f, c14111x0, 1);
                    c6021p.m6537c0(objM6514H11);
                }
                c6021p.m6553p(z18);
                m18584d(c14111x0.f44423n0, z22, interfaceC1426a9, (InterfaceC1426a) objM6514H11, AbstractC10844c.m11245e(AbstractC10844c.m11256p(c10456n, f10), f10), c6021p, 24576);
            }
            c6021p.m6553p(z18);
            c6021p.m6524S(-1376614833);
            if (AbstractC8160o6.m8729d(C13959l0.f44012c, c6021p)) {
                c6021p.m6524S(-1376606372);
                zM6542f5 = c6021p.m6542f(interfaceC3759g2);
                objM6514H8 = c6021p.m6514H();
                if (zM6542f5) {
                    objM6514H8 = new C14107v0(interfaceC3759g2, 13);
                    c6021p.m6537c0(objM6514H8);
                } else {
                    objM6514H8 = new C14107v0(interfaceC3759g2, 13);
                    c6021p.m6537c0(objM6514H8);
                }
                InterfaceC1436k interfaceC1436k15 = (InterfaceC1436k) objM6514H8;
                zM13832w = AbstractC12107L1.m13832w(c6021p, z18, -1376603531, interfaceC3759g);
                objM6514H9 = c6021p.m6514H();
                if (zM13832w) {
                    objM6514H9 = new C14107v0(interfaceC3759g, 14);
                    c6021p.m6537c0(objM6514H9);
                } else {
                    objM6514H9 = new C14107v0(interfaceC3759g, 14);
                    c6021p.m6537c0(objM6514H9);
                }
                InterfaceC1436k interfaceC1436k16 = (InterfaceC1436k) objM6514H9;
                c6021p.m6553p(z18);
                if (c14111x0.m15494h()) {
                    z21 = z18;
                    i17 = 2;
                    f11 = 0.0f;
                } else {
                    z21 = z18;
                    i17 = 2;
                    f11 = 0.0f;
                }
                AbstractC8741x4.m9482f(c14111x0, c19866q.f62971b, c19866q.f62984o, interfaceC1436k15, interfaceC1436k16, z21, AbstractC10844c.m11245e(AbstractC10844c.m11257q(c10456n, f10, f11, i17), f10), c6021p, 1572864);
            }
            c6021p.m6553p(z18);
            c6021p.m6553p(true);
            z19 = z13;
            z20 = z14;
            interfaceC10459q2 = interfaceC10459q10;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2744a(interfaceC10459q2, z19, z20, i10, i11, 2);
        }
    }
}
