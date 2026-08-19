package p544W9;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.google.protobuf.AbstractC12107L1;
import com.openai.chatgpt.R;
import com.openai.feature.settings.impl.instructions.CustomInstructionsEditViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0184L0;
import p003A1.C0227a;
import p003A1.C0257i0;
import p003A1.C0292u;
import p006A4.C0339D;
import p006A4.C0349j;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2062k;
import p1000s0.AbstractC19397F;
import p1140z1.C21694h;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.EnumC22055s0;
import p145Ff.C2728f;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3949M0;
import p244Jg.C4339c;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p363Og.AbstractC6199c;
import p363Og.C6208l;
import p363Og.C6209m;
import p363Og.C6211o;
import p363Og.C6213q;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p571X9.AbstractC9112C3;
import p594Y9.AbstractC9721E3;
import p594Y9.AbstractC9834X3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p759g1.C13800b;
import p860l0.EnumC16673F0;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.C17781r0;

/* JADX INFO: renamed from: W9.G4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8484G4 {
    /* JADX INFO: renamed from: a */
    public static final void m9134a(EnumC22055s0 instruction, String value, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(instruction, "instruction");
        AbstractC16544l.m18094g(value, "value");
        c6021p.m6526U(-15804069);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(instruction) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(value) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) AbstractC9834X3.m10481d(new Object[0], null, null, C6208l.f20212Y, c6021p, 3072, 6);
            C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56729f, C10444b.f30944w0, c6021p, 54);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC21700k.f68875m0.getClass();
            InterfaceC1426a interfaceC1426a = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(interfaceC1426a);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17781r0M19506b);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            AbstractC4124r4.m4768b(value.length() + " / 1500", AbstractC10842a.m11233k(c10456n, AbstractC7313q.f23199d), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131068);
            c6021p.m6524S(-1038163956);
            boolean zM6542f = c6021p.m6542f(interfaceC5985X);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                objM6514H = new C0339D(interfaceC5985X, 28);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H, null, false, null, null, null, null, null, null, AbstractC6199c.f20195d, c6021p, 805306368, 510);
            c6021p.m6553p(true);
            if (((Boolean) interfaceC5985X.getValue()).booleanValue()) {
                c6021p.m6524S(61881454);
                boolean zM6542f2 = c6021p.m6542f(interfaceC5985X);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == obj) {
                    objM6514H2 = new C0339D(interfaceC5985X, 29);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                AbstractC3984T1.m4682a((InterfaceC1426a) objM6514H2, AbstractC8411c.m8969c(246870312, c6021p, new C2728f(interfaceC5985X, 4)), null, null, null, AbstractC6199c.f20197f, AbstractC8411c.m8969c(-2069154195, c6021p, new C0227a(instruction, 17)), null, 0L, 0L, 0L, 0L, 0.0f, null, c6021p, 1769520, 0, 16284);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0184L0(instruction, value, interfaceC10459q, i10, 22);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9135b(InterfaceC10459q interfaceC10459q, CustomInstructionsEditViewModel customInstructionsEditViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        CustomInstructionsEditViewModel customInstructionsEditViewModel2;
        InterfaceC10459q interfaceC10459q3;
        c6021p.m6526U(-2124624134);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q3 = interfaceC10459q;
            customInstructionsEditViewModel2 = customInstructionsEditViewModel;
        } else {
            c6021p.m6519N();
            int i13 = i10 & 1;
            Object obj = C6013l.f19514a;
            if (i13 == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C6213q.class));
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
                Object objMo5693b = c16527d.mo5693b(CustomInstructionsEditViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C6213q.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C6213q.class), c16527d.mo5693b(CustomInstructionsEditViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(CustomInstructionsEditViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                customInstructionsEditViewModel2 = (CustomInstructionsEditViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                interfaceC10459q2 = interfaceC10459q;
                customInstructionsEditViewModel2 = customInstructionsEditViewModel;
                i11 = i12 & (-113);
            }
            c6021p.m6554q();
            C6213q c6213q = (C6213q) AbstractC9112C3.m9642d(customInstructionsEditViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(-744656317);
            boolean zM6542f2 = c6021p.m6542f(customInstructionsEditViewModel2);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f2 || objM6514H2 == obj) {
                Object c0292u = new C0292u(1, customInstructionsEditViewModel2, CustomInstructionsEditViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 14);
                c6021p.m6537c0(c0292u);
                objM6514H2 = c0292u;
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H2;
            c6021p.m6553p(false);
            InterfaceC10459q interfaceC10459q4 = interfaceC10459q2;
            AbstractC8662k3.m9350a(interfaceC10459q2, null, 0L, AbstractC8411c.m8969c(1410050673, c6021p, new C0349j(interfaceC3759g, 24, c6213q)), false, AbstractC8411c.m8969c(-263140298, c6021p, new C6211o(c6213q, interfaceC3759g, 1)), c6021p, (i11 & 14) | 199680, 22);
            boolean zM6732f = c6213q.m6732f();
            c6021p.m6524S(-744559737);
            boolean zM6542f3 = c6021p.m6542f(interfaceC3759g);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f3 || objM6514H3 == obj) {
                objM6514H3 = new C6209m(interfaceC3759g, 2);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC8577W2.m9239a(0, 0, (InterfaceC1426a) objM6514H3, c6021p, zM6732f);
            if (c6213q.f20225e) {
                String strM8676d = AbstractC8142m4.m8676d(R.string.custom_instructions_unsaved_description, c6021p);
                String strM8676d2 = AbstractC8142m4.m8676d(R.string.custom_instructions_unsaved_title, c6021p);
                String strM8676d3 = AbstractC8142m4.m8676d(R.string.custom_instructions_unsaved_keep, c6021p);
                String strM8676d4 = AbstractC8142m4.m8676d(R.string.custom_instructions_unsaved_discard, c6021p);
                long j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12241w;
                c6021p.m6524S(-744554647);
                boolean zM6542f4 = c6021p.m6542f(interfaceC3759g);
                Object objM6514H4 = c6021p.m6514H();
                if (zM6542f4 || objM6514H4 == obj) {
                    objM6514H4 = new C4339c(interfaceC3759g, 2);
                    c6021p.m6537c0(objM6514H4);
                }
                InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H4;
                boolean zM13832w = AbstractC12107L1.m13832w(c6021p, false, -744551832, interfaceC3759g);
                Object objM6514H5 = c6021p.m6514H();
                if (zM13832w || objM6514H5 == obj) {
                    objM6514H5 = new C6209m(interfaceC3759g, 3);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(false);
                AbstractC9721E3.m10311a(interfaceC1436k, (InterfaceC1426a) objM6514H5, strM8676d, strM8676d4, j10, strM8676d2, false, strM8676d3, c6021p, 0, 64);
            }
            interfaceC10459q3 = interfaceC10459q4;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(interfaceC10459q3, customInstructionsEditViewModel2, i10, 26);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final float m9136c(AbstractC19397F abstractC19397F) {
        return abstractC19397F.m20499k().f61601e == EnumC16673F0.f53402Z ? C13800b.m15306g(abstractC19397F.m20503o()) : C13800b.m15307h(abstractC19397F.m20503o());
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m9137d(AbstractC19397F abstractC19397F) {
        boolean z6 = abstractC19397F.m20499k().f61604h;
        return (((m9136c(abstractC19397F) > 0.0f ? 1 : (m9136c(abstractC19397F) == 0.0f ? 0 : -1)) > 0) && z6) || (m9136c(abstractC19397F) <= 0.0f && !z6);
    }
}
