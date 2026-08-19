package p523V9;

import android.content.Context;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.conversations.impl.anonymous.AnonymousSidebarViewModel;
import com.openai.feature.conversations.impl.conversation.ConversationViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import ge.C14111x0;
import java.io.File;
import java.nio.charset.Charset;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0187M0;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p042Bf.C1275q;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1020t7.C19803a;
import p1020t7.C19804b;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2465M0;
import p225Im.InterfaceC3756d;
import p229J0.AbstractC3896D1;
import p229J0.AbstractC3914G1;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.C3890C1;
import p229J0.C3949M0;
import p349O0.C5975S;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p544W9.AbstractC8479G;
import p547Wc.C8775T;
import p547Wc.EnumC8776U;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p679ce.AbstractC11723n;
import p679ce.C11716g;
import p679ce.C11717h;
import p679ce.C11718i;
import p679ce.C11719j;
import p737f1.InterfaceC13515g;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17790w;
import p911o0.C17794y;
import p943p7.C18304b;

/* JADX INFO: renamed from: V9.u4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8206u4 {
    /* JADX WARN: Code duplicated, block: B:102:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:113:0x034a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x034f  */
    /* JADX WARN: Code duplicated, block: B:119:0x03b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:123:0x0407 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0409  */
    /* JADX WARN: Code duplicated, block: B:127:0x0453 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0455  */
    /* JADX WARN: Code duplicated, block: B:132:0x0477  */
    /* JADX WARN: Code duplicated, block: B:134:0x0487  */
    /* JADX WARN: Code duplicated, block: B:136:0x048d  */
    /* JADX WARN: Code duplicated, block: B:138:0x049a  */
    /* JADX WARN: Code duplicated, block: B:140:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:142:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:144:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:146:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:148:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:56:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x0168  */
    /* JADX WARN: Code duplicated, block: B:62:0x017c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x017e  */
    /* JADX WARN: Code duplicated, block: B:66:0x018c  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01be  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0208  */
    /* JADX WARN: Code duplicated, block: B:85:0x0214 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x0216  */
    /* JADX WARN: Code duplicated, block: B:89:0x0248  */
    /* JADX WARN: Code duplicated, block: B:90:0x024c  */
    /* JADX WARN: Code duplicated, block: B:93:0x025f  */
    /* JADX WARN: Code duplicated, block: B:95:0x026d  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:99:0x02aa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX INFO: renamed from: a */
    public static final void m8819a(C8775T sidebarLayoutState, InterfaceC10459q interfaceC10459q, AnonymousSidebarViewModel anonymousSidebarViewModel, ConversationViewModel conversationViewModel, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        C10456n c10456n;
        C5984W0 c5984w0;
        Context context;
        C5984W0 c5984w1;
        boolean zBooleanValue;
        C5984W0 c5984w2;
        List list;
        InterfaceC2062k interfaceC2062k;
        LocalViewModelStoreOwner localViewModelStoreOwner;
        ViewModelStoreOwner viewModelStoreOwnerM12165a;
        InterfaceC10459q interfaceC10459q3;
        C16527D c16527d;
        boolean zM6542f;
        Object objM6514H;
        Object obj;
        AnonymousSidebarViewModel anonymousSidebarViewModel2;
        Context context2;
        boolean zBooleanValue2;
        List list2;
        InterfaceC2062k interfaceC2062k2;
        ViewModelStoreOwner viewModelStoreOwnerM12165a2;
        boolean zM6542f2;
        Object objM6514H2;
        Object obj2;
        int i14;
        InterfaceC10459q interfaceC10459q4;
        ConversationViewModel conversationViewModel2;
        AnonymousSidebarViewModel anonymousSidebarViewModel3;
        InterfaceC13515g interfaceC13515g;
        boolean z6;
        boolean zM6545h;
        Object obj3;
        int i15;
        C21696i c21696i;
        C21694h c21694h;
        int i16;
        boolean zM6542f3;
        ?? r6;
        Object obj4;
        boolean zM6542f4;
        boolean z10;
        Object obj5;
        boolean zM6542f5;
        Object obj6;
        boolean zM6542f6;
        Object obj7;
        boolean zM6542f7;
        Object obj8;
        AnonymousSidebarViewModel anonymousSidebarViewModel4;
        ConversationViewModel conversationViewModel3;
        InterfaceC10459q interfaceC10459q5;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(sidebarLayoutState, "sidebarLayoutState");
        c6021p.m6526U(119418096);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c6021p.m6542f(sidebarLayoutState) : c6021p.m6545h(sidebarLayoutState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 48) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i12 |= 128;
            }
            if ((i10 & 3072) == 0) {
                i12 |= 1024;
            }
            if ((i12 & 1171) == 1170 || !c6021p.m6562y()) {
                c6021p.m6519N();
                i13 = i10 & 1;
                c10456n = C10456n.f30959Y;
                C5975S c5975s = C6013l.f19514a;
                if (i13 != 0 || c6021p.m6561x()) {
                    if (i17 != 0) {
                        interfaceC10459q2 = c10456n;
                    }
                    c6021p.m6524S(-1020152108);
                    c5984w0 = AndroidCompositionLocals_androidKt.f32825b;
                    context = (Context) c6021p.m6548k(c5984w0);
                    c5984w1 = AbstractC0233b1.f873a;
                    zBooleanValue = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
                    c5984w2 = AbstractC16421b.f50950a;
                    list = (List) c6021p.m6548k(c5984w2);
                    c6021p.m6524S(-1395507574);
                    if (zBooleanValue) {
                        interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C11719j.class));
                    } else {
                        if (zBooleanValue) {
                            throw new C0644w();
                        }
                        interfaceC2062k = null;
                    }
                    c6021p.m6553p(false);
                    localViewModelStoreOwner = LocalViewModelStoreOwner.f33491a;
                    localViewModelStoreOwner.getClass();
                    viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                    interfaceC10459q3 = interfaceC10459q2;
                    if (viewModelStoreOwnerM12165a == null) {
                        throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                    }
                    c16527d = AbstractC16526C.f51263a;
                    InterfaceC3756d interfaceC3756dMo5693b = c16527d.mo5693b(AnonymousSidebarViewModel.class);
                    InterfaceC3756d interfaceC3756dMo5693b2 = c16527d.mo5693b(C11719j.class);
                    c6021p.m6524S(-1395498839);
                    zM6542f = c6021p.m6542f(interfaceC3756dMo5693b) | c6021p.m6542f(interfaceC3756dMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                    objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == c5975s) {
                        obj = objM6514H;
                        if (zBooleanValue) {
                            ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C11719j.class), c16527d.mo5693b(AnonymousSidebarViewModel.class), context, interfaceC2062k);
                            throw null;
                        }
                        if (zBooleanValue) {
                            throw new C0644w();
                        }
                        BaseViewModel baseViewModelM14398a = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AnonymousSidebarViewModel.class), null, viewModelStoreOwnerM12165a, list);
                        c6021p.m6537c0(baseViewModelM14398a);
                        obj = baseViewModelM14398a;
                    }
                    BaseViewModel baseViewModel = (BaseViewModel) obj;
                    c6021p.m6553p(false);
                    InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                    c6021p.m6553p(false);
                    anonymousSidebarViewModel2 = (AnonymousSidebarViewModel) baseViewModel;
                    c6021p.m6524S(-1020152108);
                    context2 = (Context) c6021p.m6548k(c5984w0);
                    zBooleanValue2 = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
                    list2 = (List) c6021p.m6548k(c5984w2);
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
                    localViewModelStoreOwner.getClass();
                    viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
                    if (viewModelStoreOwnerM12165a2 == null) {
                        throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                    }
                    InterfaceC3756d interfaceC3756dMo5693b3 = c16527d.mo5693b(ConversationViewModel.class);
                    InterfaceC3756d interfaceC3756dMo5693b4 = c16527d.mo5693b(C14111x0.class);
                    c6021p.m6524S(-1395498839);
                    zM6542f2 = c6021p.m6542f(interfaceC3756dMo5693b3) | c6021p.m6542f(interfaceC3756dMo5693b4) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                    objM6514H2 = c6021p.m6514H();
                    if (zM6542f2 || objM6514H2 == c5975s) {
                        obj2 = objM6514H2;
                        if (zBooleanValue2) {
                            ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                            throw null;
                        }
                        if (zBooleanValue2) {
                            throw new C0644w();
                        }
                        BaseViewModel baseViewModelM14398a2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                        c6021p.m6537c0(baseViewModelM14398a2);
                        obj2 = baseViewModelM14398a2;
                    }
                    BaseViewModel baseViewModel2 = (BaseViewModel) obj2;
                    c6021p.m6553p(false);
                    InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
                    c6021p.m6553p(false);
                    i14 = i12 & (-8065);
                    interfaceC10459q4 = interfaceC10459q3;
                    conversationViewModel2 = (ConversationViewModel) baseViewModel2;
                    anonymousSidebarViewModel3 = anonymousSidebarViewModel2;
                } else {
                    c6021p.m6517L();
                    i14 = i12 & (-8065);
                    anonymousSidebarViewModel3 = anonymousSidebarViewModel;
                    conversationViewModel2 = conversationViewModel;
                    interfaceC10459q4 = interfaceC10459q2;
                }
                c6021p.m6554q();
                interfaceC13515g = (InterfaceC13515g) c6021p.m6548k(AbstractC0187M0.f705g);
                EnumC8776U enumC8776UM9529a = sidebarLayoutState.m9529a();
                c6021p.m6524S(1837546899);
                if ((i14 & 14) != 4 || ((i14 & 8) != 0 && c6021p.m6545h(sidebarLayoutState))) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zM6545h = z6 | c6021p.m6545h(interfaceC13515g);
                Object objM6514H3 = c6021p.m6514H();
                obj3 = objM6514H3;
                if (zM6545h || objM6514H3 == c5975s) {
                    C11716g c11716g = new C11716g(sidebarLayoutState, interfaceC13515g, null);
                    c6021p.m6537c0(c11716g);
                    obj3 = c11716g;
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) obj3, c6021p, enumC8776UM9529a);
                C17756f c17756f = AbstractC17770m.f56726c;
                C10449g c10449g = C10444b.f30946y0;
                C17790w c17790wM19515a = AbstractC17788v.m19515a(c17756f, c10449g, c6021p, 0);
                i15 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q4);
                InterfaceC21700k.f68875m0.getClass();
                c21696i = C21698j.f68869b;
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C21694h c21694h2 = C21698j.f68873f;
                C5997d.m6439Z(c21694h2, c6021p, c17790wM19515a);
                C21694h c21694h3 = C21698j.f68872e;
                C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m);
                c21694h = C21698j.f68874g;
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i15))) {
                    AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
                }
                C21694h c21694h4 = C21698j.f68871d;
                C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
                C17794y c17794y = C17794y.f56777a;
                InterfaceC10459q interfaceC10459qM9126g = AbstractC8479G.m9126g(c17794y.m19544b(AbstractC10844c.m11244d(c10456n, 1.0f), true), AbstractC8479G.m9124e(c6021p), 14);
                C17790w c17790wM19515a2 = AbstractC17788v.m19515a(c17756f, c10449g, c6021p, 0);
                i16 = c6021p.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
                InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g);
                c6021p.m6528W();
                if (c6021p.f19563O) {
                    c6021p.m6549l(c21696i);
                } else {
                    c6021p.m6543f0();
                }
                C5997d.m6439Z(c21694h2, c6021p, c17790wM19515a2);
                C5997d.m6439Z(c21694h3, c6021p, interfaceC6008i0M6550m2);
                if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i16))) {
                    AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
                }
                C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
                float f10 = AbstractC7313q.f23199d;
                AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11252l(c10456n, f10));
                c6021p.m6524S(-406842716);
                zM6542f3 = c6021p.m6542f(conversationViewModel2);
                Object objM6514H4 = c6021p.m6514H();
                if (!zM6542f3 || objM6514H4 == c5975s) {
                    r6 = 0;
                    C11717h c11717h = new C11717h(conversationViewModel2, false ? 1 : 0);
                    c6021p.m6537c0(c11717h);
                    obj4 = c11717h;
                } else {
                    r6 = 0;
                    obj4 = objM6514H4;
                }
                c6021p.m6553p(r6);
                m8821c(r6, (InterfaceC1426a) obj4, c6021p, null);
                AbstractC3984T1.m4692k(AbstractC10842a.m11234l(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC7313q.f23201f, f10), 0.0f, 0L, c6021p, 0, 6);
                float f11 = AbstractC3896D1.f11851a;
                C5984W0 c5984w3 = AbstractC3959O0.f12302a;
                ConversationViewModel conversationViewModel4 = conversationViewModel2;
                C3890C1 c3890c1M4607a = AbstractC3896D1.m4607a(0L, ((C3949M0) c6021p.m6548k(c5984w3)).f12237s, 0L, 0L, c6021p, 509);
                c6021p.m6524S(-406820272);
                zM6542f4 = c6021p.m6542f(anonymousSidebarViewModel3);
                Object objM6514H5 = c6021p.m6514H();
                if (!zM6542f4 || objM6514H5 == c5975s) {
                    z10 = false;
                    C11718i c11718i = new C11718i(anonymousSidebarViewModel3, false ? 1 : 0);
                    c6021p.m6537c0(c11718i);
                    obj5 = c11718i;
                } else {
                    z10 = false;
                    obj5 = objM6514H5;
                }
                c6021p.m6553p(z10);
                boolean z11 = z10;
                InterfaceC10459q interfaceC10459q6 = interfaceC10459q4;
                AbstractC3914G1.m4611a(AbstractC11723n.f35549a, AbstractC10833a.m11209d(c10456n, z10, null, (InterfaceC1426a) obj5, 7), null, null, null, null, c3890c1M4607a, 0.0f, 0.0f, c6021p, 6, 444);
                C3890C1 c3890c1M4607a2 = AbstractC3896D1.m4607a(0L, ((C3949M0) c6021p.m6548k(c5984w3)).f12237s, 0L, 0L, c6021p, 509);
                c6021p.m6524S(-406803918);
                zM6542f5 = c6021p.m6542f(anonymousSidebarViewModel3);
                Object objM6514H6 = c6021p.m6514H();
                obj6 = objM6514H6;
                if (zM6542f5 || objM6514H6 == c5975s) {
                    C11718i c11718i2 = new C11718i(anonymousSidebarViewModel3, 1);
                    c6021p.m6537c0(c11718i2);
                    obj6 = c11718i2;
                }
                c6021p.m6553p(z11);
                AbstractC3914G1.m4611a(AbstractC11723n.f35550b, AbstractC10833a.m11209d(c10456n, z11, null, (InterfaceC1426a) obj6, 7), null, null, null, null, c3890c1M4607a2, 0.0f, 0.0f, c6021p, 6, 444);
                C3890C1 c3890c1M4607a3 = AbstractC3896D1.m4607a(0L, ((C3949M0) c6021p.m6548k(c5984w3)).f12237s, 0L, 0L, c6021p, 509);
                c6021p.m6524S(-406787469);
                zM6542f6 = c6021p.m6542f(anonymousSidebarViewModel3);
                Object objM6514H7 = c6021p.m6514H();
                obj7 = objM6514H7;
                if (zM6542f6 || objM6514H7 == c5975s) {
                    C11718i c11718i3 = new C11718i(anonymousSidebarViewModel3, 2);
                    c6021p.m6537c0(c11718i3);
                    obj7 = c11718i3;
                }
                c6021p.m6553p(false);
                AbstractC3914G1.m4611a(AbstractC11723n.f35551c, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) obj7, 7), null, null, null, null, c3890c1M4607a3, 0.0f, 0.0f, c6021p, 6, 444);
                AbstractC17758g.m19482b(c6021p, c17794y.m19544b(c10456n, true));
                c6021p.m6553p(true);
                InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(c10456n, 1.0f);
                c6021p.m6524S(-1880401503);
                zM6542f7 = c6021p.m6542f(anonymousSidebarViewModel3);
                Object objM6514H8 = c6021p.m6514H();
                obj8 = objM6514H8;
                if (zM6542f7 || objM6514H8 == c5975s) {
                    C11718i c11718i4 = new C11718i(anonymousSidebarViewModel3, 3);
                    c6021p.m6537c0(c11718i4);
                    obj8 = c11718i4;
                }
                c6021p.m6553p(false);
                m8820b(6, (InterfaceC1426a) obj8, c6021p, interfaceC10459qM11244d);
                c6021p.m6553p(true);
                anonymousSidebarViewModel4 = anonymousSidebarViewModel3;
                conversationViewModel3 = conversationViewModel4;
                interfaceC10459q5 = interfaceC10459q6;
            } else {
                c6021p.m6517L();
                anonymousSidebarViewModel4 = anonymousSidebarViewModel;
                conversationViewModel3 = conversationViewModel;
                interfaceC10459q5 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1275q((Object) sidebarLayoutState, interfaceC10459q5, (Object) anonymousSidebarViewModel4, (Object) conversationViewModel3, i10, i11, 7);
            }
        }
        i12 |= 48;
        interfaceC10459q2 = interfaceC10459q;
        if ((i10 & 384) == 0) {
            i12 |= 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= 1024;
        }
        if ((i12 & 1171) == 1170) {
            c6021p.m6519N();
            i13 = i10 & 1;
            c10456n = C10456n.f30959Y;
            C5975S c5975s2 = C6013l.f19514a;
            if (i13 != 0) {
                if (i17 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                c6021p.m6524S(-1020152108);
                c5984w0 = AndroidCompositionLocals_androidKt.f32825b;
                context = (Context) c6021p.m6548k(c5984w0);
                c5984w1 = AbstractC0233b1.f873a;
                zBooleanValue = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
                c5984w2 = AbstractC16421b.f50950a;
                list = (List) c6021p.m6548k(c5984w2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C11719j.class));
                } else {
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    interfaceC2062k = null;
                }
                c6021p.m6553p(false);
                localViewModelStoreOwner = LocalViewModelStoreOwner.f33491a;
                localViewModelStoreOwner.getClass();
                viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                interfaceC10459q3 = interfaceC10459q2;
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                c16527d = AbstractC16526C.f51263a;
                InterfaceC3756d interfaceC3756dMo5693b5 = c16527d.mo5693b(AnonymousSidebarViewModel.class);
                InterfaceC3756d interfaceC3756dMo5693b6 = c16527d.mo5693b(C11719j.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(interfaceC3756dMo5693b5) | c6021p.m6542f(interfaceC3756dMo5693b6) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    obj = objM6514H;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C11719j.class), c16527d.mo5693b(AnonymousSidebarViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a3 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AnonymousSidebarViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(baseViewModelM14398a3);
                    obj = baseViewModelM14398a3;
                } else {
                    obj = objM6514H;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C11719j.class), c16527d.mo5693b(AnonymousSidebarViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a4 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AnonymousSidebarViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(baseViewModelM14398a4);
                    obj = baseViewModelM14398a4;
                }
                BaseViewModel baseViewModel3 = (BaseViewModel) obj;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel3, c6021p, 0);
                c6021p.m6553p(false);
                anonymousSidebarViewModel2 = (AnonymousSidebarViewModel) baseViewModel3;
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(c5984w0);
                zBooleanValue2 = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
                list2 = (List) c6021p.m6548k(c5984w2);
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
                localViewModelStoreOwner.getClass();
                viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a2 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                InterfaceC3756d interfaceC3756dMo5693b7 = c16527d.mo5693b(ConversationViewModel.class);
                InterfaceC3756d interfaceC3756dMo5693b8 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                zM6542f2 = c6021p.m6542f(interfaceC3756dMo5693b7) | c6021p.m6542f(interfaceC3756dMo5693b8) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    obj2 = objM6514H2;
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a5 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(baseViewModelM14398a5);
                    obj2 = baseViewModelM14398a5;
                } else {
                    obj2 = objM6514H2;
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a6 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(baseViewModelM14398a6);
                    obj2 = baseViewModelM14398a6;
                }
                BaseViewModel baseViewModel4 = (BaseViewModel) obj2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel4, c6021p, 0);
                c6021p.m6553p(false);
                i14 = i12 & (-8065);
                interfaceC10459q4 = interfaceC10459q3;
                conversationViewModel2 = (ConversationViewModel) baseViewModel4;
                anonymousSidebarViewModel3 = anonymousSidebarViewModel2;
            } else {
                if (i17 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                c6021p.m6524S(-1020152108);
                c5984w0 = AndroidCompositionLocals_androidKt.f32825b;
                context = (Context) c6021p.m6548k(c5984w0);
                c5984w1 = AbstractC0233b1.f873a;
                zBooleanValue = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
                c5984w2 = AbstractC16421b.f50950a;
                list = (List) c6021p.m6548k(c5984w2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C11719j.class));
                } else {
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    interfaceC2062k = null;
                }
                c6021p.m6553p(false);
                localViewModelStoreOwner = LocalViewModelStoreOwner.f33491a;
                localViewModelStoreOwner.getClass();
                viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                interfaceC10459q3 = interfaceC10459q2;
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                c16527d = AbstractC16526C.f51263a;
                InterfaceC3756d interfaceC3756dMo5693b9 = c16527d.mo5693b(AnonymousSidebarViewModel.class);
                InterfaceC3756d interfaceC3756dMo5693b10 = c16527d.mo5693b(C11719j.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(interfaceC3756dMo5693b9) | c6021p.m6542f(interfaceC3756dMo5693b10) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    obj = objM6514H;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C11719j.class), c16527d.mo5693b(AnonymousSidebarViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a7 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AnonymousSidebarViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(baseViewModelM14398a7);
                    obj = baseViewModelM14398a7;
                } else {
                    obj = objM6514H;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C11719j.class), c16527d.mo5693b(AnonymousSidebarViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a8 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AnonymousSidebarViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(baseViewModelM14398a8);
                    obj = baseViewModelM14398a8;
                }
                BaseViewModel baseViewModel5 = (BaseViewModel) obj;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel5, c6021p, 0);
                c6021p.m6553p(false);
                anonymousSidebarViewModel2 = (AnonymousSidebarViewModel) baseViewModel5;
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(c5984w0);
                zBooleanValue2 = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
                list2 = (List) c6021p.m6548k(c5984w2);
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
                localViewModelStoreOwner.getClass();
                viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a2 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                InterfaceC3756d interfaceC3756dMo5693b11 = c16527d.mo5693b(ConversationViewModel.class);
                InterfaceC3756d interfaceC3756dMo5693b12 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                zM6542f2 = c6021p.m6542f(interfaceC3756dMo5693b11) | c6021p.m6542f(interfaceC3756dMo5693b12) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    obj2 = objM6514H2;
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a9 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(baseViewModelM14398a9);
                    obj2 = baseViewModelM14398a9;
                } else {
                    obj2 = objM6514H2;
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a10 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(baseViewModelM14398a10);
                    obj2 = baseViewModelM14398a10;
                }
                BaseViewModel baseViewModel6 = (BaseViewModel) obj2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel6, c6021p, 0);
                c6021p.m6553p(false);
                i14 = i12 & (-8065);
                interfaceC10459q4 = interfaceC10459q3;
                conversationViewModel2 = (ConversationViewModel) baseViewModel6;
                anonymousSidebarViewModel3 = anonymousSidebarViewModel2;
            }
            c6021p.m6554q();
            interfaceC13515g = (InterfaceC13515g) c6021p.m6548k(AbstractC0187M0.f705g);
            EnumC8776U enumC8776UM9529a2 = sidebarLayoutState.m9529a();
            c6021p.m6524S(1837546899);
            if ((i14 & 14) != 4) {
                z6 = true;
            } else {
                z6 = true;
            }
            zM6545h = z6 | c6021p.m6545h(interfaceC13515g);
            Object objM6514H9 = c6021p.m6514H();
            obj3 = objM6514H9;
            if (zM6545h) {
                C11716g c11716g2 = new C11716g(sidebarLayoutState, interfaceC13515g, null);
                c6021p.m6537c0(c11716g2);
                obj3 = c11716g2;
            } else {
                C11716g c11716g3 = new C11716g(sidebarLayoutState, interfaceC13515g, null);
                c6021p.m6537c0(c11716g3);
                obj3 = c11716g3;
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) obj3, c6021p, enumC8776UM9529a2);
            C17756f c17756f2 = AbstractC17770m.f56726c;
            C10449g c10449g2 = C10444b.f30946y0;
            C17790w c17790wM19515a3 = AbstractC17788v.m19515a(c17756f2, c10449g2, c6021p, 0);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m3 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d3 = AbstractC10443a.m10923d(c6021p, interfaceC10459q4);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h5 = C21698j.f68873f;
            C5997d.m6439Z(c21694h5, c6021p, c17790wM19515a3);
            C21694h c21694h6 = C21698j.f68872e;
            C5997d.m6439Z(c21694h6, c6021p, interfaceC6008i0M6550m3);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            } else {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C21694h c21694h7 = C21698j.f68871d;
            C5997d.m6439Z(c21694h7, c6021p, interfaceC10459qM10923d3);
            C17794y c17794y2 = C17794y.f56777a;
            InterfaceC10459q interfaceC10459qM9126g2 = AbstractC8479G.m9126g(c17794y2.m19544b(AbstractC10844c.m11244d(c10456n, 1.0f), true), AbstractC8479G.m9124e(c6021p), 14);
            C17790w c17790wM19515a4 = AbstractC17788v.m19515a(c17756f2, c10449g2, c6021p, 0);
            i16 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m4 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d4 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g2);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h5, c6021p, c17790wM19515a4);
            C5997d.m6439Z(c21694h6, c6021p, interfaceC6008i0M6550m4);
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            } else {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            }
            C5997d.m6439Z(c21694h7, c6021p, interfaceC10459qM10923d4);
            float f12 = AbstractC7313q.f23199d;
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11252l(c10456n, f12));
            c6021p.m6524S(-406842716);
            zM6542f3 = c6021p.m6542f(conversationViewModel2);
            Object objM6514H10 = c6021p.m6514H();
            if (zM6542f3) {
                r6 = 0;
                C11717h c11717h2 = new C11717h(conversationViewModel2, false ? 1 : 0);
                c6021p.m6537c0(c11717h2);
                obj4 = c11717h2;
            } else {
                r6 = 0;
                C11717h c11717h3 = new C11717h(conversationViewModel2, false ? 1 : 0);
                c6021p.m6537c0(c11717h3);
                obj4 = c11717h3;
            }
            c6021p.m6553p(r6);
            m8821c(r6, (InterfaceC1426a) obj4, c6021p, null);
            AbstractC3984T1.m4692k(AbstractC10842a.m11234l(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC7313q.f23201f, f12), 0.0f, 0L, c6021p, 0, 6);
            float f13 = AbstractC3896D1.f11851a;
            C5984W0 c5984w4 = AbstractC3959O0.f12302a;
            ConversationViewModel conversationViewModel5 = conversationViewModel2;
            C3890C1 c3890c1M4607a4 = AbstractC3896D1.m4607a(0L, ((C3949M0) c6021p.m6548k(c5984w4)).f12237s, 0L, 0L, c6021p, 509);
            c6021p.m6524S(-406820272);
            zM6542f4 = c6021p.m6542f(anonymousSidebarViewModel3);
            Object objM6514H11 = c6021p.m6514H();
            if (zM6542f4) {
                z10 = false;
                C11718i c11718i5 = new C11718i(anonymousSidebarViewModel3, false ? 1 : 0);
                c6021p.m6537c0(c11718i5);
                obj5 = c11718i5;
            } else {
                z10 = false;
                C11718i c11718i6 = new C11718i(anonymousSidebarViewModel3, false ? 1 : 0);
                c6021p.m6537c0(c11718i6);
                obj5 = c11718i6;
            }
            c6021p.m6553p(z10);
            boolean z12 = z10;
            InterfaceC10459q interfaceC10459q7 = interfaceC10459q4;
            AbstractC3914G1.m4611a(AbstractC11723n.f35549a, AbstractC10833a.m11209d(c10456n, z10, null, (InterfaceC1426a) obj5, 7), null, null, null, null, c3890c1M4607a4, 0.0f, 0.0f, c6021p, 6, 444);
            C3890C1 c3890c1M4607a5 = AbstractC3896D1.m4607a(0L, ((C3949M0) c6021p.m6548k(c5984w4)).f12237s, 0L, 0L, c6021p, 509);
            c6021p.m6524S(-406803918);
            zM6542f5 = c6021p.m6542f(anonymousSidebarViewModel3);
            Object objM6514H12 = c6021p.m6514H();
            obj6 = objM6514H12;
            if (zM6542f5) {
                C11718i c11718i7 = new C11718i(anonymousSidebarViewModel3, 1);
                c6021p.m6537c0(c11718i7);
                obj6 = c11718i7;
            } else {
                C11718i c11718i8 = new C11718i(anonymousSidebarViewModel3, 1);
                c6021p.m6537c0(c11718i8);
                obj6 = c11718i8;
            }
            c6021p.m6553p(z12);
            AbstractC3914G1.m4611a(AbstractC11723n.f35550b, AbstractC10833a.m11209d(c10456n, z12, null, (InterfaceC1426a) obj6, 7), null, null, null, null, c3890c1M4607a5, 0.0f, 0.0f, c6021p, 6, 444);
            C3890C1 c3890c1M4607a6 = AbstractC3896D1.m4607a(0L, ((C3949M0) c6021p.m6548k(c5984w4)).f12237s, 0L, 0L, c6021p, 509);
            c6021p.m6524S(-406787469);
            zM6542f6 = c6021p.m6542f(anonymousSidebarViewModel3);
            Object objM6514H13 = c6021p.m6514H();
            obj7 = objM6514H13;
            if (zM6542f6) {
                C11718i c11718i9 = new C11718i(anonymousSidebarViewModel3, 2);
                c6021p.m6537c0(c11718i9);
                obj7 = c11718i9;
            } else {
                C11718i c11718i10 = new C11718i(anonymousSidebarViewModel3, 2);
                c6021p.m6537c0(c11718i10);
                obj7 = c11718i10;
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(AbstractC11723n.f35551c, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) obj7, 7), null, null, null, null, c3890c1M4607a6, 0.0f, 0.0f, c6021p, 6, 444);
            AbstractC17758g.m19482b(c6021p, c17794y2.m19544b(c10456n, true));
            c6021p.m6553p(true);
            InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(c10456n, 1.0f);
            c6021p.m6524S(-1880401503);
            zM6542f7 = c6021p.m6542f(anonymousSidebarViewModel3);
            Object objM6514H14 = c6021p.m6514H();
            obj8 = objM6514H14;
            if (zM6542f7) {
                C11718i c11718i11 = new C11718i(anonymousSidebarViewModel3, 3);
                c6021p.m6537c0(c11718i11);
                obj8 = c11718i11;
            } else {
                C11718i c11718i12 = new C11718i(anonymousSidebarViewModel3, 3);
                c6021p.m6537c0(c11718i12);
                obj8 = c11718i12;
            }
            c6021p.m6553p(false);
            m8820b(6, (InterfaceC1426a) obj8, c6021p, interfaceC10459qM11244d2);
            c6021p.m6553p(true);
            anonymousSidebarViewModel4 = anonymousSidebarViewModel3;
            conversationViewModel3 = conversationViewModel5;
            interfaceC10459q5 = interfaceC10459q7;
        } else {
            c6021p.m6519N();
            i13 = i10 & 1;
            c10456n = C10456n.f30959Y;
            C5975S c5975s3 = C6013l.f19514a;
            if (i13 != 0) {
                if (i17 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                c6021p.m6524S(-1020152108);
                c5984w0 = AndroidCompositionLocals_androidKt.f32825b;
                context = (Context) c6021p.m6548k(c5984w0);
                c5984w1 = AbstractC0233b1.f873a;
                zBooleanValue = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
                c5984w2 = AbstractC16421b.f50950a;
                list = (List) c6021p.m6548k(c5984w2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C11719j.class));
                } else {
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    interfaceC2062k = null;
                }
                c6021p.m6553p(false);
                localViewModelStoreOwner = LocalViewModelStoreOwner.f33491a;
                localViewModelStoreOwner.getClass();
                viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                interfaceC10459q3 = interfaceC10459q2;
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                c16527d = AbstractC16526C.f51263a;
                InterfaceC3756d interfaceC3756dMo5693b13 = c16527d.mo5693b(AnonymousSidebarViewModel.class);
                InterfaceC3756d interfaceC3756dMo5693b14 = c16527d.mo5693b(C11719j.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(interfaceC3756dMo5693b13) | c6021p.m6542f(interfaceC3756dMo5693b14) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    obj = objM6514H;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C11719j.class), c16527d.mo5693b(AnonymousSidebarViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a11 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AnonymousSidebarViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(baseViewModelM14398a11);
                    obj = baseViewModelM14398a11;
                } else {
                    obj = objM6514H;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C11719j.class), c16527d.mo5693b(AnonymousSidebarViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a12 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AnonymousSidebarViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(baseViewModelM14398a12);
                    obj = baseViewModelM14398a12;
                }
                BaseViewModel baseViewModel7 = (BaseViewModel) obj;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel7, c6021p, 0);
                c6021p.m6553p(false);
                anonymousSidebarViewModel2 = (AnonymousSidebarViewModel) baseViewModel7;
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(c5984w0);
                zBooleanValue2 = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
                list2 = (List) c6021p.m6548k(c5984w2);
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
                localViewModelStoreOwner.getClass();
                viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a2 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                InterfaceC3756d interfaceC3756dMo5693b15 = c16527d.mo5693b(ConversationViewModel.class);
                InterfaceC3756d interfaceC3756dMo5693b16 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                zM6542f2 = c6021p.m6542f(interfaceC3756dMo5693b15) | c6021p.m6542f(interfaceC3756dMo5693b16) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    obj2 = objM6514H2;
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a13 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(baseViewModelM14398a13);
                    obj2 = baseViewModelM14398a13;
                } else {
                    obj2 = objM6514H2;
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a14 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(baseViewModelM14398a14);
                    obj2 = baseViewModelM14398a14;
                }
                BaseViewModel baseViewModel8 = (BaseViewModel) obj2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel8, c6021p, 0);
                c6021p.m6553p(false);
                i14 = i12 & (-8065);
                interfaceC10459q4 = interfaceC10459q3;
                conversationViewModel2 = (ConversationViewModel) baseViewModel8;
                anonymousSidebarViewModel3 = anonymousSidebarViewModel2;
            } else {
                if (i17 != 0) {
                    interfaceC10459q2 = c10456n;
                }
                c6021p.m6524S(-1020152108);
                c5984w0 = AndroidCompositionLocals_androidKt.f32825b;
                context = (Context) c6021p.m6548k(c5984w0);
                c5984w1 = AbstractC0233b1.f873a;
                zBooleanValue = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
                c5984w2 = AbstractC16421b.f50950a;
                list = (List) c6021p.m6548k(c5984w2);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C11719j.class));
                } else {
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    interfaceC2062k = null;
                }
                c6021p.m6553p(false);
                localViewModelStoreOwner = LocalViewModelStoreOwner.f33491a;
                localViewModelStoreOwner.getClass();
                viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
                interfaceC10459q3 = interfaceC10459q2;
                if (viewModelStoreOwnerM12165a == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                c16527d = AbstractC16526C.f51263a;
                InterfaceC3756d interfaceC3756dMo5693b17 = c16527d.mo5693b(AnonymousSidebarViewModel.class);
                InterfaceC3756d interfaceC3756dMo5693b18 = c16527d.mo5693b(C11719j.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(interfaceC3756dMo5693b17) | c6021p.m6542f(interfaceC3756dMo5693b18) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    obj = objM6514H;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C11719j.class), c16527d.mo5693b(AnonymousSidebarViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a15 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AnonymousSidebarViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(baseViewModelM14398a15);
                    obj = baseViewModelM14398a15;
                } else {
                    obj = objM6514H;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C11719j.class), c16527d.mo5693b(AnonymousSidebarViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a16 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AnonymousSidebarViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(baseViewModelM14398a16);
                    obj = baseViewModelM14398a16;
                }
                BaseViewModel baseViewModel9 = (BaseViewModel) obj;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel9, c6021p, 0);
                c6021p.m6553p(false);
                anonymousSidebarViewModel2 = (AnonymousSidebarViewModel) baseViewModel9;
                c6021p.m6524S(-1020152108);
                context2 = (Context) c6021p.m6548k(c5984w0);
                zBooleanValue2 = ((Boolean) c6021p.m6548k(c5984w1)).booleanValue();
                list2 = (List) c6021p.m6548k(c5984w2);
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
                localViewModelStoreOwner.getClass();
                viewModelStoreOwnerM12165a2 = LocalViewModelStoreOwner.m12165a(c6021p);
                if (viewModelStoreOwnerM12165a2 == null) {
                    throw new IllegalStateException("Unable to find ViewModelStoreOwner");
                }
                InterfaceC3756d interfaceC3756dMo5693b19 = c16527d.mo5693b(ConversationViewModel.class);
                InterfaceC3756d interfaceC3756dMo5693b110 = c16527d.mo5693b(C14111x0.class);
                c6021p.m6524S(-1395498839);
                zM6542f2 = c6021p.m6542f(interfaceC3756dMo5693b19) | c6021p.m6542f(interfaceC3756dMo5693b110) | c6021p.m6542f(list2) | c6021p.m6544g(zBooleanValue2) | c6021p.m6542f(interfaceC2062k2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2) {
                    obj2 = objM6514H2;
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a17 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(baseViewModelM14398a17);
                    obj2 = baseViewModelM14398a17;
                } else {
                    obj2 = objM6514H2;
                    if (zBooleanValue2) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14111x0.class), c16527d.mo5693b(ConversationViewModel.class), context2, interfaceC2062k2);
                        throw null;
                    }
                    if (zBooleanValue2) {
                        throw new C0644w();
                    }
                    BaseViewModel baseViewModelM14398a18 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationViewModel.class), null, viewModelStoreOwnerM12165a2, list2);
                    c6021p.m6537c0(baseViewModelM14398a18);
                    obj2 = baseViewModelM14398a18;
                }
                BaseViewModel baseViewModel10 = (BaseViewModel) obj2;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel10, c6021p, 0);
                c6021p.m6553p(false);
                i14 = i12 & (-8065);
                interfaceC10459q4 = interfaceC10459q3;
                conversationViewModel2 = (ConversationViewModel) baseViewModel10;
                anonymousSidebarViewModel3 = anonymousSidebarViewModel2;
            }
            c6021p.m6554q();
            interfaceC13515g = (InterfaceC13515g) c6021p.m6548k(AbstractC0187M0.f705g);
            EnumC8776U enumC8776UM9529a3 = sidebarLayoutState.m9529a();
            c6021p.m6524S(1837546899);
            if ((i14 & 14) != 4) {
                z6 = true;
            } else {
                z6 = true;
            }
            zM6545h = z6 | c6021p.m6545h(interfaceC13515g);
            Object objM6514H15 = c6021p.m6514H();
            obj3 = objM6514H15;
            if (zM6545h) {
                C11716g c11716g4 = new C11716g(sidebarLayoutState, interfaceC13515g, null);
                c6021p.m6537c0(c11716g4);
                obj3 = c11716g4;
            } else {
                C11716g c11716g5 = new C11716g(sidebarLayoutState, interfaceC13515g, null);
                c6021p.m6537c0(c11716g5);
                obj3 = c11716g5;
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) obj3, c6021p, enumC8776UM9529a3);
            C17756f c17756f3 = AbstractC17770m.f56726c;
            C10449g c10449g3 = C10444b.f30946y0;
            C17790w c17790wM19515a5 = AbstractC17788v.m19515a(c17756f3, c10449g3, c6021p, 0);
            i15 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m5 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d5 = AbstractC10443a.m10923d(c6021p, interfaceC10459q4);
            InterfaceC21700k.f68875m0.getClass();
            c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C21694h c21694h8 = C21698j.f68873f;
            C5997d.m6439Z(c21694h8, c6021p, c17790wM19515a5);
            C21694h c21694h9 = C21698j.f68872e;
            C5997d.m6439Z(c21694h9, c6021p, interfaceC6008i0M6550m5);
            c21694h = C21698j.f68874g;
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            } else {
                AbstractC0168G.m537z(i15, c6021p, i15, c21694h);
            }
            C21694h c21694h10 = C21698j.f68871d;
            C5997d.m6439Z(c21694h10, c6021p, interfaceC10459qM10923d5);
            C17794y c17794y3 = C17794y.f56777a;
            InterfaceC10459q interfaceC10459qM9126g3 = AbstractC8479G.m9126g(c17794y3.m19544b(AbstractC10844c.m11244d(c10456n, 1.0f), true), AbstractC8479G.m9124e(c6021p), 14);
            C17790w c17790wM19515a6 = AbstractC17788v.m19515a(c17756f3, c10449g3, c6021p, 0);
            i16 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m6 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d6 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM9126g3);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h8, c6021p, c17790wM19515a6);
            C5997d.m6439Z(c21694h9, c6021p, interfaceC6008i0M6550m6);
            if (c6021p.f19563O) {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            } else {
                AbstractC0168G.m537z(i16, c6021p, i16, c21694h);
            }
            C5997d.m6439Z(c21694h10, c6021p, interfaceC10459qM10923d6);
            float f14 = AbstractC7313q.f23199d;
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11252l(c10456n, f14));
            c6021p.m6524S(-406842716);
            zM6542f3 = c6021p.m6542f(conversationViewModel2);
            Object objM6514H16 = c6021p.m6514H();
            if (zM6542f3) {
                r6 = 0;
                C11717h c11717h4 = new C11717h(conversationViewModel2, false ? 1 : 0);
                c6021p.m6537c0(c11717h4);
                obj4 = c11717h4;
            } else {
                r6 = 0;
                C11717h c11717h5 = new C11717h(conversationViewModel2, false ? 1 : 0);
                c6021p.m6537c0(c11717h5);
                obj4 = c11717h5;
            }
            c6021p.m6553p(r6);
            m8821c(r6, (InterfaceC1426a) obj4, c6021p, null);
            AbstractC3984T1.m4692k(AbstractC10842a.m11234l(AbstractC10844c.m11244d(c10456n, 1.0f), AbstractC7313q.f23201f, f14), 0.0f, 0L, c6021p, 0, 6);
            float f15 = AbstractC3896D1.f11851a;
            C5984W0 c5984w5 = AbstractC3959O0.f12302a;
            ConversationViewModel conversationViewModel6 = conversationViewModel2;
            C3890C1 c3890c1M4607a7 = AbstractC3896D1.m4607a(0L, ((C3949M0) c6021p.m6548k(c5984w5)).f12237s, 0L, 0L, c6021p, 509);
            c6021p.m6524S(-406820272);
            zM6542f4 = c6021p.m6542f(anonymousSidebarViewModel3);
            Object objM6514H17 = c6021p.m6514H();
            if (zM6542f4) {
                z10 = false;
                C11718i c11718i13 = new C11718i(anonymousSidebarViewModel3, false ? 1 : 0);
                c6021p.m6537c0(c11718i13);
                obj5 = c11718i13;
            } else {
                z10 = false;
                C11718i c11718i14 = new C11718i(anonymousSidebarViewModel3, false ? 1 : 0);
                c6021p.m6537c0(c11718i14);
                obj5 = c11718i14;
            }
            c6021p.m6553p(z10);
            boolean z13 = z10;
            InterfaceC10459q interfaceC10459q8 = interfaceC10459q4;
            AbstractC3914G1.m4611a(AbstractC11723n.f35549a, AbstractC10833a.m11209d(c10456n, z10, null, (InterfaceC1426a) obj5, 7), null, null, null, null, c3890c1M4607a7, 0.0f, 0.0f, c6021p, 6, 444);
            C3890C1 c3890c1M4607a8 = AbstractC3896D1.m4607a(0L, ((C3949M0) c6021p.m6548k(c5984w5)).f12237s, 0L, 0L, c6021p, 509);
            c6021p.m6524S(-406803918);
            zM6542f5 = c6021p.m6542f(anonymousSidebarViewModel3);
            Object objM6514H18 = c6021p.m6514H();
            obj6 = objM6514H18;
            if (zM6542f5) {
                C11718i c11718i15 = new C11718i(anonymousSidebarViewModel3, 1);
                c6021p.m6537c0(c11718i15);
                obj6 = c11718i15;
            } else {
                C11718i c11718i16 = new C11718i(anonymousSidebarViewModel3, 1);
                c6021p.m6537c0(c11718i16);
                obj6 = c11718i16;
            }
            c6021p.m6553p(z13);
            AbstractC3914G1.m4611a(AbstractC11723n.f35550b, AbstractC10833a.m11209d(c10456n, z13, null, (InterfaceC1426a) obj6, 7), null, null, null, null, c3890c1M4607a8, 0.0f, 0.0f, c6021p, 6, 444);
            C3890C1 c3890c1M4607a9 = AbstractC3896D1.m4607a(0L, ((C3949M0) c6021p.m6548k(c5984w5)).f12237s, 0L, 0L, c6021p, 509);
            c6021p.m6524S(-406787469);
            zM6542f6 = c6021p.m6542f(anonymousSidebarViewModel3);
            Object objM6514H19 = c6021p.m6514H();
            obj7 = objM6514H19;
            if (zM6542f6) {
                C11718i c11718i17 = new C11718i(anonymousSidebarViewModel3, 2);
                c6021p.m6537c0(c11718i17);
                obj7 = c11718i17;
            } else {
                C11718i c11718i18 = new C11718i(anonymousSidebarViewModel3, 2);
                c6021p.m6537c0(c11718i18);
                obj7 = c11718i18;
            }
            c6021p.m6553p(false);
            AbstractC3914G1.m4611a(AbstractC11723n.f35551c, AbstractC10833a.m11209d(c10456n, false, null, (InterfaceC1426a) obj7, 7), null, null, null, null, c3890c1M4607a9, 0.0f, 0.0f, c6021p, 6, 444);
            AbstractC17758g.m19482b(c6021p, c17794y3.m19544b(c10456n, true));
            c6021p.m6553p(true);
            InterfaceC10459q interfaceC10459qM11244d3 = AbstractC10844c.m11244d(c10456n, 1.0f);
            c6021p.m6524S(-1880401503);
            zM6542f7 = c6021p.m6542f(anonymousSidebarViewModel3);
            Object objM6514H110 = c6021p.m6514H();
            obj8 = objM6514H110;
            if (zM6542f7) {
                C11718i c11718i19 = new C11718i(anonymousSidebarViewModel3, 3);
                c6021p.m6537c0(c11718i19);
                obj8 = c11718i19;
            } else {
                C11718i c11718i110 = new C11718i(anonymousSidebarViewModel3, 3);
                c6021p.m6537c0(c11718i110);
                obj8 = c11718i110;
            }
            c6021p.m6553p(false);
            m8820b(6, (InterfaceC1426a) obj8, c6021p, interfaceC10459qM11244d3);
            c6021p.m6553p(true);
            anonymousSidebarViewModel4 = anonymousSidebarViewModel3;
            conversationViewModel3 = conversationViewModel6;
            interfaceC10459q5 = interfaceC10459q8;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1275q((Object) sidebarLayoutState, interfaceC10459q5, (Object) anonymousSidebarViewModel4, (Object) conversationViewModel3, i10, i11, 7);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8820b(int i10, InterfaceC1426a interfaceC1426a, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        int i11;
        c6021p.m6526U(218338914);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i13 = c6021p.f19564P;
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            float f10 = AbstractC3896D1.f11851a;
            AbstractC3914G1.m4611a(AbstractC11723n.f35554f, null, null, null, null, null, AbstractC3896D1.m4607a(0L, ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, 0L, c6021p, 509), 0.0f, 0.0f, c6021p, 6, 446);
            AbstractC3984T1.m4685d(interfaceC1426a, AbstractC10844c.m11244d(AbstractC10842a.m11234l(c10456n, AbstractC7313q.f23201f, AbstractC7313q.f23199d), 1.0f), false, null, null, null, null, null, null, AbstractC11723n.f35555g, c6021p, ((i12 >> 3) & 14) | 805306368, 508);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2465M0(interfaceC10459q, interfaceC1426a, i10, 4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8821c(int i10, InterfaceC1426a interfaceC1426a, C6021p c6021p, InterfaceC10459q interfaceC10459q) {
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(1059142163);
        int i11 = i10 | 6;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            AbstractC3914G1.m4611a(AbstractC11723n.f35552d, AbstractC10833a.m11209d(interfaceC10459q2, false, null, interfaceC1426a, 7), null, null, AbstractC11723n.f35553e, null, null, 0.0f, 0.0f, c6021p, 24582, 492);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2465M0(interfaceC10459q2, interfaceC1426a, i10, 5);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m8822d(File file, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        return ((Boolean) m8829k(file, Boolean.FALSE, internalLogger, C19803a.f62826Z)).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m8823e(File file, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(file, "<this>");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        return ((Boolean) m8829k(file, Boolean.FALSE, internalLogger, C19803a.f62828p0)).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m8824f(File file, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(file, "<this>");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        return ((Boolean) m8829k(file, Boolean.FALSE, internalLogger, C19803a.f62829q0)).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static final long m8825g(File file, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(file, "<this>");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        return ((Number) m8829k(file, 0L, internalLogger, C19803a.f62831s0)).longValue();
    }

    /* JADX INFO: renamed from: h */
    public static final File[] m8826h(File file, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(file, "<this>");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        EnumC11255b enumC11255b = EnumC11255b.f34100o0;
        EnumC11255b enumC11255b2 = EnumC11255b.f34099Z;
        try {
            return file.listFiles();
        } catch (SecurityException e10) {
            AbstractC7889G0.m8185c(internalLogger, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(file, 3), e10, 48);
            return null;
        } catch (Exception e11) {
            AbstractC7889G0.m8185c(internalLogger, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(file, 4), e11, 48);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m8827i(File file, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(file, "<this>");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        return ((Boolean) m8829k(file, Boolean.FALSE, internalLogger, C19803a.f62832t0)).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public static final String m8828j(File file, Charset charset, InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(charset, "charset");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        if (m8824f(file, internalLogger) && m8822d(file, internalLogger)) {
            return (String) m8829k(file, null, internalLogger, new C19804b(1, charset));
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static final Object m8829k(File file, Object obj, InterfaceC11256c interfaceC11256c, InterfaceC1436k interfaceC1436k) {
        EnumC11255b enumC11255b = EnumC11255b.f34100o0;
        EnumC11255b enumC11255b2 = EnumC11255b.f34099Z;
        try {
            return interfaceC1436k.invoke(file);
        } catch (SecurityException e10) {
            AbstractC7889G0.m8185c(interfaceC11256c, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(file, 3), e10, 48);
            return obj;
        } catch (Exception e11) {
            AbstractC7889G0.m8185c(interfaceC11256c, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(file, 4), e11, 48);
            return obj;
        }
    }
}
