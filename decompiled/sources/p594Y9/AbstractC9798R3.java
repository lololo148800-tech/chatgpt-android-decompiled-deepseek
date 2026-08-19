package p594Y9;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.p650ui.input.nestedscroll.AbstractC10866a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import com.openai.feature.sharing.C12508xdba9de6;
import com.openai.feature.sharing.ShareConversationViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import java.util.NoSuchElementException;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p039Bc.C0885s;
import p042Bf.C1282x;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2478T0;
import p124Ei.C2497c;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3917G4;
import p229J0.AbstractC3984T1;
import p229J0.C4055g1;
import p324Mn.C5551u;
import p349O0.AbstractC6012k0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p363Og.C6207k;
import p478Tc.AbstractC7313q;
import p482Tg.C7445b0;
import p523V9.AbstractC8050b0;
import p523V9.AbstractC8190s4;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p537W0.C8410b;
import p544W9.AbstractC8662k3;
import p547Wc.C8805o;
import p552Wg.AbstractC8840b;
import p552Wg.C8844f;
import p552Wg.C8845g;
import p552Wg.C8847i;
import p552Wg.C8848j;
import p552Wg.C8856r;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p621Zd.C10282c;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17792x;
import p919o8.AbstractC17976h1;
import p919o8.C17881A1;
import p919o8.EnumC17917M1;
import p936p0.AbstractC18283w;

/* JADX INFO: renamed from: Y9.R3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9798R3 {
    /* JADX WARN: Code duplicated, block: B:54:0x0095 A[PHI: r5
      0x0095: PHI (r5v20 int) = (r5v0 int), (r5v6 int), (r5v7 int) binds: [B:53:0x0093, B:63:0x00ad, B:62:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x0123  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m10415a(List conversationItems, C10282c c10282c, String str, C5551u c5551u, InterfaceC10459q interfaceC10459q, boolean z6, C10282c c10282c2, C8410b c8410b, C6021p c6021p, int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        boolean zM6545h;
        boolean z11;
        boolean z12;
        C10282c c10282c3;
        C6018n0 c6018n0M6555r;
        int i15;
        C10282c c10282c4 = c10282c2;
        AbstractC16544l.m18094g(conversationItems, "conversationItems");
        c6021p.m6526U(-28429415);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(conversationItems) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? c6021p.m6542f(c10282c) : c6021p.m6545h(c10282c) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(str) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6545h(c5551u) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6542f(interfaceC10459q) ? 16384 : 8192;
        }
        int i16 = i11 & 32;
        if (i16 == 0) {
            if ((196608 & i10) == 0) {
                z10 = z6;
                i12 |= c6021p.m6544g(z10) ? 131072 : 65536;
            }
            i13 = i11 & 64;
            i14 = 1572864;
            if (i13 == 0) {
                i12 |= i14;
            } else if ((1572864 & i10) == 0) {
                if ((2097152 & i10) == 0) {
                    zM6545h = c6021p.m6542f(c10282c4);
                } else {
                    zM6545h = c6021p.m6545h(c10282c4);
                }
                if (zM6545h) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
            if ((12582912 & i10) == 0) {
                if (c6021p.m6545h(c8410b)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i12 |= i15;
            }
            if ((i12 & 4793491) == 4793490 || !c6021p.m6562y()) {
                if (i16 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if (i13 != 0) {
                    c10282c4 = null;
                }
                C10282c c10282c5 = c10282c4;
                AbstractC3984T1.m4688g(AbstractC10842a.m11233k(interfaceC10459q, AbstractC7313q.f23201f), null, null, null, AbstractC8411c.m8969c(-1094836930, c6021p, new C8844f(conversationItems, AbstractC18283w.m19827a(0, c6021p, 0, 3), c10282c5, c10282c, c8410b, str, z11, c5551u)), c6021p, 24576);
                z12 = z11;
                c10282c3 = c10282c5;
            } else {
                c6021p.m6517L();
                c10282c3 = c10282c4;
                z12 = z10;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C8845g(conversationItems, c10282c, str, c5551u, interfaceC10459q, z12, c10282c3, c8410b, i10, i11);
            }
        }
        i12 |= 196608;
        z10 = z6;
        i13 = i11 & 64;
        i14 = 1572864;
        if (i13 == 0) {
            i12 |= i14;
        } else if ((1572864 & i10) == 0) {
            if ((2097152 & i10) == 0) {
                zM6545h = c6021p.m6542f(c10282c4);
            } else {
                zM6545h = c6021p.m6545h(c10282c4);
            }
            if (zM6545h) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i12 |= i14;
        }
        if ((12582912 & i10) == 0) {
            if (c6021p.m6545h(c8410b)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i12 |= i15;
        }
        if ((i12 & 4793491) == 4793490) {
            if (i16 != 0) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (i13 != 0) {
                c10282c4 = null;
            }
            C10282c c10282c6 = c10282c4;
            AbstractC3984T1.m4688g(AbstractC10842a.m11233k(interfaceC10459q, AbstractC7313q.f23201f), null, null, null, AbstractC8411c.m8969c(-1094836930, c6021p, new C8844f(conversationItems, AbstractC18283w.m19827a(0, c6021p, 0, 3), c10282c6, c10282c, c8410b, str, z11, c5551u)), c6021p, 24576);
            z12 = z11;
            c10282c3 = c10282c6;
        } else {
            if (i16 != 0) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (i13 != 0) {
                c10282c4 = null;
            }
            C10282c c10282c7 = c10282c4;
            AbstractC3984T1.m4688g(AbstractC10842a.m11233k(interfaceC10459q, AbstractC7313q.f23201f), null, null, null, AbstractC8411c.m8969c(-1094836930, c6021p, new C8844f(conversationItems, AbstractC18283w.m19827a(0, c6021p, 0, 3), c10282c7, c10282c, c8410b, str, z11, c5551u)), c6021p, 24576);
            z12 = z11;
            c10282c3 = c10282c7;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8845g(conversationItems, c10282c, str, c5551u, interfaceC10459q, z12, c10282c3, c8410b, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10416b(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        c6021p.m6526U(-1774663454);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            Object obj = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            AbstractC6012k0 abstractC6012k0 = AndroidCompositionLocals_androidKt.f32825b;
            Object obj2 = (Context) c6021p.m6548k(abstractC6012k0);
            c6021p.m6524S(-1742129680);
            boolean zM6545h = c6021p.m6545h(obj) | c6021p.m6545h(obj2);
            Object objM6514H = c6021p.m6514H();
            Object obj3 = C6013l.f19514a;
            if (zM6545h || objM6514H == obj3) {
                objM6514H = new C8847i(obj, 0, obj2);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(abstractC6012k0);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C8856r.class));
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
            Object objMo5693b = c16527d.mo5693b(ShareConversationViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C8856r.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj3) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C8856r.class), c16527d.mo5693b(ShareConversationViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ShareConversationViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            boolean zM6545h2 = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h2 || objM6514H3 == obj3) {
                objM6514H3 = new C12508xdba9de6(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            ShareConversationViewModel shareConversationViewModel = (ShareConversationViewModel) baseViewModel;
            C8856r c8856r = (C8856r) AbstractC9112C3.m9642d(shareConversationViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(-1742117939);
            boolean zM6542f2 = c6021p.m6542f(shareConversationViewModel);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f2 || objM6514H4 == obj3) {
                objM6514H4 = new C7445b0(1, shareConversationViewModel, ShareConversationViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 2);
                c6021p.m6537c0(objM6514H4);
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H4;
            c6021p.m6553p(false);
            AbstractC8662k3.m9350a(AbstractC10866a.m11313a(interfaceC10459q2, (C4055g1) AbstractC3917G4.m4618d(c6021p).f43261p0, null), null, 0L, AbstractC8411c.m8969c(-125047285, c6021p, new C8805o(obj, 2, interfaceC3759g)), false, AbstractC8411c.m8969c(-1049685466, c6021p, new C0885s(c8856r, 17, interfaceC3759g)), c6021p, 199680, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q2, i10, 23);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C17881A1 m10418d(C3676s c3676s) {
        EnumC17917M1 enumC17917M1;
        String strMo4384r;
        String strMo4384r2;
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("plan");
            int i10 = 0;
            if (abstractC3673pM4395w == null || (strMo4384r2 = abstractC3673pM4395w.mo4384r()) == null) {
                enumC17917M1 = null;
            } else {
                EnumC17917M1[] enumC17917M1ArrValues = EnumC17917M1.values();
                int length = enumC17917M1ArrValues.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    enumC17917M1 = enumC17917M1ArrValues[i11];
                    if (AbstractC16544l.m18089b(enumC17917M1.f57119Y.toString(), strMo4384r2)) {
                        break;
                    }
                    i11++;
                }
            }
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("session_precondition");
            if (abstractC3673pM4395w2 != null && (strMo4384r = abstractC3673pM4395w2.mo4384r()) != null) {
                int[] iArrM27k = AbstractC0010F.m27k(7);
                int length2 = iArrM27k.length;
                while (i10 < length2) {
                    int i12 = iArrM27k[i10];
                    if (AbstractC17976h1.m19679n(i12).equals(strMo4384r)) {
                        i10 = i12;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new C17881A1(enumC17917M1, i10);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type DdSession", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type DdSession", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type DdSession", e12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m10417c(C10282c c10282c, String str, InterfaceC1436k onIntent, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-210639252);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(c10282c) : c6021p.m6545h(c10282c) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-61723611);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C8848j.f27103Y, c6021p, 3072, 6);
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, c10456n);
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
            c6021p.m6524S(1868297162);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                objM6514H2 = new C6207k(interfaceC5985X, 16);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4693l((InterfaceC1426a) objM6514H2, null, false, null, null, AbstractC8840b.f27061e, c6021p, 196614, 30);
            boolean zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            c6021p.m6524S(1868308862);
            Object objM6514H3 = c6021p.m6514H();
            if (objM6514H3 == obj) {
                objM6514H3 = new C6207k(interfaceC5985X, 17);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC8190s4.m8770a(zBooleanValue, (InterfaceC1426a) objM6514H3, null, 0L, null, null, AbstractC8411c.m8969c(441608467, c6021p, new C2497c(onIntent, (Object) interfaceC5985X2, (Object) c10282c, interfaceC5985X, 3)), c6021p, 1572912, 60);
            c6021p.m6524S(1868354748);
            if (((Boolean) interfaceC5985X2.getValue()).booleanValue()) {
                String str2 = str == null ? YladLSetV.YYQQCW : str;
                c6021p.m6524S(1868358782);
                boolean zM6542f = c6021p.m6542f(interfaceC5985X2);
                Object objM6514H4 = c6021p.m6514H();
                if (zM6542f || objM6514H4 == obj) {
                    objM6514H4 = new C6207k(interfaceC5985X2, 18);
                    c6021p.m6537c0(objM6514H4);
                }
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H4;
                c6021p.m6553p(false);
                c6021p.m6524S(1868360768);
                boolean zM6542f2 = ((i12 & 896) == 256) | c6021p.m6542f(interfaceC5985X2);
                Object objM6514H5 = c6021p.m6514H();
                if (zM6542f2 || objM6514H5 == obj) {
                    objM6514H5 = new C2478T0(onIntent, interfaceC5985X2, 3);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(false);
                AbstractC8050b0.m8441b(str2, interfaceC1426a2, (InterfaceC1436k) objM6514H5, null, c6021p, 0);
            }
            r5.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(c10282c, str, onIntent, i10, 2);
        }
    }
}
