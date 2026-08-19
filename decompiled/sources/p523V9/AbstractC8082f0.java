package p523V9;

import af.C10545A;
import af.C10585m;
import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import cd.C11709i;
import com.openai.chatgpt.R;
import com.openai.feature.gizmos.impl.store.GizmoRatingScreenKt$GizmoRatingScreen$$inlined$injectViewModel$1;
import com.openai.feature.gizmos.impl.store.GizmoRatingViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import ge.C14101s0;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import ni.C17632f;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p017Af.AbstractC0454A;
import p017Af.AbstractC0456C;
import p017Af.AbstractC0462I;
import p017Af.AbstractC0490u;
import p017Af.C0470a;
import p017Af.C0471b;
import p017Af.C0494y;
import p025An.C0644w;
import p040Bd.AbstractC1142p;
import p040Bd.C0893B;
import p040Bd.C0901C1;
import p040Bd.C0924G0;
import p040Bd.C0949K1;
import p040Bd.C0960M0;
import p040Bd.C0971O;
import p040Bd.C0979P1;
import p040Bd.C0995S0;
import p040Bd.C1013V0;
import p040Bd.C1031Y0;
import p040Bd.C1065d1;
import p040Bd.C1092h0;
import p040Bd.C1131n0;
import p040Bd.C1168t1;
import p040Bd.C1203z0;
import p042Bf.AbstractC1270l;
import p042Bf.C1281w;
import p042Bf.C1282x;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p069Cf.AbstractC1652k;
import p092Dc.C1996m;
import p098Di.InterfaceC2062k;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C22011h0;
import p169Gf.C3044h;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC4101o;
import p229J0.C4081k3;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7308l;
import p482Tg.C7445b0;
import p482Tg.C7448e;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p544W9.AbstractC8680n3;
import p547Wc.C8805o;
import p552Wg.C8844f;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p789hg.C14505d;
import p853kd.C16368c;
import p870le.C16872b0;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17680n;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17790w;
import p989rd.AbstractC18942d;
import p989rd.C18944f;
import p989rd.EnumC18945g;

/* JADX INFO: renamed from: V9.f0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8082f0 {
    /* JADX INFO: renamed from: a */
    public static final void m8509a(String str, String messageId, AbstractC1142p contentReference, InterfaceC1436k onLinkClick, InterfaceC1436k onIntent, boolean z6, C6021p c6021p, int i10) {
        int i11;
        int i12 = 0;
        AbstractC16544l.m18094g(messageId, "messageId");
        AbstractC16544l.m18094g(contentReference, "contentReference");
        AbstractC16544l.m18094g(onLinkClick, "onLinkClick");
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(1288244756);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str != null ? new C22011h0(str) : null) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(messageId) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? c6021p.m6542f(contentReference) : c6021p.m6545h(contentReference) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(onLinkClick) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6544g(z6) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(378725898);
            boolean z10 = ((i11 & 14) == 4) | ((57344 & i11) == 16384) | ((i11 & 112) == 32);
            Object objM6514H = c6021p.m6514H();
            if (z10 || objM6514H == C6013l.f19514a) {
                objM6514H = new C0471b(onIntent, str, messageId, i12);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1439n interfaceC1439n = (InterfaceC1439n) objM6514H;
            c6021p.m6553p(false);
            if (contentReference instanceof C1203z0) {
                c6021p.m6524S(378732885);
                AbstractC0490u.m1124a(messageId, (C1203z0) contentReference, onIntent, interfaceC1439n, null, c6021p, ((i11 >> 3) & 14) | ((i11 >> 6) & 896));
                c6021p.m6553p(false);
            } else if (contentReference instanceof C0901C1) {
                c6021p.m6524S(378738177);
                AbstractC8122k0.m8629b((C0901C1) contentReference, z6, onLinkClick, interfaceC1439n, null, c6021p, ((i11 >> 12) & 112) | ((i11 >> 3) & 896));
                c6021p.m6553p(false);
            } else if (contentReference instanceof C0960M0) {
                c6021p.m6524S(378744027);
                AbstractC0454A.m1105a(messageId, (C0960M0) contentReference, onLinkClick, interfaceC1439n, null, c6021p, (i11 >> 3) & 910);
                c6021p.m6553p(false);
            } else if (contentReference instanceof C1092h0) {
                c6021p.m6524S(378749529);
                AbstractC7877E4.m8152a((C1092h0) contentReference, null, c6021p, 0);
                c6021p.m6553p(false);
            } else if (contentReference instanceof C0924G0) {
                c6021p.m6524S(378752084);
                AbstractC8114j0.m8610a(str, messageId, (C0924G0) contentReference, onLinkClick, interfaceC1439n, c6021p, i11 & 7294);
                c6021p.m6553p(false);
            } else if (contentReference instanceof C0971O) {
                c6021p.m6524S(378758533);
                AbstractC8090g0.m8544c((C0971O) contentReference, onLinkClick, interfaceC1439n, c6021p, (i11 >> 6) & 112);
                c6021p.m6553p(false);
            } else if (contentReference instanceof C1168t1) {
                c6021p.m6524S(378763255);
                C1065d1 c1065d1 = C1168t1.Companion;
                AbstractC0462I.m1113c((C1168t1) contentReference, null, c6021p, 0);
                c6021p.m6553p(false);
            } else if (contentReference instanceof C1013V0) {
                c6021p.m6524S(378765856);
                AbstractC8003U3.m8305a((C1013V0) contentReference, c6021p, 0);
                c6021p.m6553p(false);
            } else if (contentReference instanceof C1031Y0) {
                c6021p.m6524S(378768769);
                AbstractC1652k.m2489a((C1031Y0) contentReference, null, c6021p, 0);
                c6021p.m6553p(false);
            } else if (contentReference instanceof C0979P1) {
                c6021p.m6524S(378771396);
                C0949K1 c0949k1 = C0979P1.Companion;
                AbstractC8130l0.m8646a((C0979P1) contentReference, onLinkClick, null, c6021p, (i11 >> 6) & 112);
                c6021p.m6553p(false);
            } else if (contentReference instanceof C0995S0) {
                c6021p.m6524S(378774472);
                AbstractC0456C.m1108b(messageId, (C0995S0) contentReference, null, c6021p, (i11 >> 3) & 14);
                c6021p.m6553p(false);
            } else if (contentReference instanceof C1131n0) {
                c6021p.m6524S(378778802);
                AbstractC8106i0.m8587b((C1131n0) contentReference, onIntent, c6021p, (i11 >> 9) & 112);
                c6021p.m6553p(false);
            } else if (contentReference instanceof C0893B) {
                c6021p.m6524S(378783273);
                AbstractC1270l.m1982a(str, messageId, (C0893B) contentReference, c6021p, i11 & 126);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(-1142506839);
                c6021p.m6553p(false);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0470a(str, messageId, contentReference, onLinkClick, onIntent, z6, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8510b(String conversationId, String str, boolean z6, boolean z10, boolean z11, boolean z12, InterfaceC1426a onDismiss, InterfaceC1436k onRename, InterfaceC1426a onDelete, InterfaceC1426a onSettings, C6021p c6021p, int i10) {
        int i11;
        boolean z13;
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        AbstractC16544l.m18094g(onRename, "onRename");
        AbstractC16544l.m18094g(onDelete, "onDelete");
        AbstractC16544l.m18094g(onSettings, "onSettings");
        c6021p.m6526U(269800524);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(conversationId) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6544g(z6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6544g(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6544g(z11) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6544g(z12) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6545h(onDismiss) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c6021p.m6545h(onRename) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c6021p.m6545h(onDelete) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i11 |= c6021p.m6545h(onSettings) ? 536870912 : 268435456;
        }
        int i12 = i11;
        if ((i12 & 306783379) == 306783378 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(1509698191);
            String strM8676d = str == null ? AbstractC8142m4.m8676d(R.string.conversations_default_title, c6021p) : str;
            c6021p.m6553p(false);
            c6021p.m6524S(1509700875);
            C5975S c5975s = C6013l.f19514a;
            if (z10) {
                c6021p.m6524S(1509704309);
                int i13 = i12 & 3670016;
                boolean z14 = i13 == 1048576;
                Object objM6514H = c6021p.m6514H();
                if (z14 || objM6514H == c5975s) {
                    objM6514H = new C14505d(18, onDismiss);
                    c6021p.m6537c0(objM6514H);
                }
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H;
                c6021p.m6553p(false);
                c6021p.m6524S(1509705694);
                boolean z15 = ((i12 & 29360128) == 8388608) | (i13 == 1048576);
                Object objM6514H2 = c6021p.m6514H();
                if (z15 || objM6514H2 == c5975s) {
                    objM6514H2 = new C16872b0(onRename, onDismiss, 3);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                z13 = false;
                AbstractC8050b0.m8441b(strM8676d, interfaceC1426a, (InterfaceC1436k) objM6514H2, null, c6021p, 0);
            } else {
                z13 = false;
            }
            c6021p.m6553p(z13);
            c6021p.m6524S(1509709370);
            if (z11) {
                c6021p.m6524S(1509711765);
                boolean z16 = (i12 & 3670016) == 1048576 ? true : z13;
                Object objM6514H3 = c6021p.m6514H();
                if (z16 || objM6514H3 == c5975s) {
                    objM6514H3 = new C14505d(19, onDismiss);
                    c6021p.m6537c0(objM6514H3);
                }
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H3;
                c6021p.m6553p(z13);
                c6021p.m6524S(1509713076);
                boolean z17 = (i12 & 234881024) == 67108864 ? true : z13;
                Object objM6514H4 = c6021p.m6514H();
                if (z17 || objM6514H4 == c5975s) {
                    objM6514H4 = new C14505d(20, onDelete);
                    c6021p.m6537c0(objM6514H4);
                }
                InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H4;
                c6021p.m6553p(z13);
                c6021p.m6524S(1509714390);
                boolean z18 = (i12 & 1879048192) == 536870912 ? true : z13;
                Object objM6514H5 = c6021p.m6514H();
                if (z18 || objM6514H5 == c5975s) {
                    objM6514H5 = new C14505d(21, onSettings);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(z13);
                AbstractC8078e4.m8494a(interfaceC1426a2, interfaceC1426a3, (InterfaceC1426a) objM6514H5, z6, c6021p, (i12 << 3) & 7168);
            }
            c6021p.m6553p(z13);
            if (z12) {
                c6021p.m6524S(1509719893);
                boolean z19 = (i12 & 3670016) == 1048576 ? true : z13;
                Object objM6514H6 = c6021p.m6514H();
                if (z19 || objM6514H6 == c5975s) {
                    objM6514H6 = new C14505d(22, onDismiss);
                    c6021p.m6537c0(objM6514H6);
                }
                c6021p.m6553p(z13);
                AbstractC8238y4.m8877a((i12 << 3) & 112, (InterfaceC1426a) objM6514H6, c6021p, null, conversationId);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18944f(conversationId, str, z6, z10, z11, z12, onDismiss, onRename, onDelete, onSettings, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8511c(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        Object next;
        Object objM19235b;
        InterfaceC2062k interfaceC2062k;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(1162261892);
        int i11 = i10 | 6;
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            Object obj = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
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
            Object obj2 = c1996m != null ? (C16368c) c1996m.f5984y.get() : null;
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            c6021p.m6524S(2050092207);
            boolean zM6545h = c6021p.m6545h(c8870f) | c6021p.m6545h(obj2) | c6021p.m6545h(obj);
            Object objM6514H = c6021p.m6514H();
            Object obj3 = C6013l.f19514a;
            if (zM6545h || objM6514H == obj3) {
                objM6514H = new C7448e(c8870f, obj2, obj, 11);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(189483815);
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C10545A.class));
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
            Object objMo5693b = c16527d.mo5693b(GizmoRatingViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C10545A.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj3) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C10545A.class), c16527d.mo5693b(GizmoRatingViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H2 = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(GizmoRatingViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H2);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H2;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            InterfaceC5985X interfaceC5985XM19531n = AbstractC17792x.m19531n(c6021p, false, interfaceC1436k, c6021p, -1395474517);
            boolean zM6545h2 = c6021p.m6545h(baseViewModel) | c6021p.m6542f(interfaceC5985XM19531n);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h2 || objM6514H3 == obj3) {
                objM6514H3 = new GizmoRatingScreenKt$GizmoRatingScreen$$inlined$injectViewModel$1(baseViewModel, interfaceC5985XM19531n, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, baseViewModel);
            c6021p.m6553p(false);
            GizmoRatingViewModel gizmoRatingViewModel = (GizmoRatingViewModel) baseViewModel;
            C10545A c10545a = (C10545A) AbstractC9112C3.m9642d(gizmoRatingViewModel.f40343c, c6021p).getValue();
            c6021p.m6524S(2050105870);
            boolean zM6542f2 = c6021p.m6542f(gizmoRatingViewModel);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f2 || objM6514H4 == obj3) {
                objM6514H4 = new C7445b0(1, gizmoRatingViewModel, GizmoRatingViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 12);
                c6021p.m6537c0(objM6514H4);
            }
            InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H4;
            c6021p.m6553p(false);
            AbstractC8680n3.m9368a(c10456n, 0L, null, 0.0f, null, false, null, AbstractC8411c.m8969c(920514040, c6021p, new C10585m(c8870f, 3)), null, AbstractC8411c.m8969c(1283980538, c6021p, new C8805o(c10545a, 7, interfaceC3759g)), AbstractC8411c.m8969c(146481336, c6021p, new C1281w(c10545a, interfaceC20904w, interfaceC3759g, 15)), c6021p, (i11 & 14) | 817889280, 6, 382);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1282x(interfaceC10459q2, i10, 28);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8512d(C11709i popupMenuState, String conversationId, String str, boolean z6, EnumC18945g enumC18945g, InterfaceC1436k onRename, InterfaceC1426a onArchive, InterfaceC1426a onDelete, InterfaceC1426a onSettings, InterfaceC10459q interfaceC10459q, boolean z10, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        boolean z11;
        AbstractC16544l.m18094g(popupMenuState, "popupMenuState");
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(onRename, "onRename");
        AbstractC16544l.m18094g(onArchive, "onArchive");
        AbstractC16544l.m18094g(onDelete, "onDelete");
        AbstractC16544l.m18094g(onSettings, "onSettings");
        c6021p.m6526U(-2008307871);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c6021p.m6542f(popupMenuState) : c6021p.m6545h(popupMenuState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6542f(conversationId) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c6021p.m6542f(str) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c6021p.m6544g(z6) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c6021p.m6542f(enumC18945g) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c6021p.m6545h(onRename) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c6021p.m6545h(onArchive) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= c6021p.m6545h(onDelete) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= c6021p.m6545h(onSettings) ? 67108864 : 33554432;
        }
        int i13 = i12 | 805306368;
        int i14 = i11 | 6;
        if ((i13 & 306783379) == 306783378 && (i14 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            z11 = z10;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            c6021p.m6524S(-1609827405);
            int i15 = i13 & 112;
            boolean z12 = true;
            boolean z13 = i15 == 32;
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            C5975S c5975s = C5975S.f19448r0;
            if (z13 || objM6514H == obj) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(-1609824877);
            boolean z14 = i15 == 32;
            Object objM6514H2 = c6021p.m6514H();
            if (z14 || objM6514H2 == obj) {
                objM6514H2 = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(-1609822413);
            boolean z15 = i15 == 32;
            Object objM6514H3 = c6021p.m6514H();
            if (z15 || objM6514H3 == obj) {
                objM6514H3 = C5997d.m6430Q(Boolean.FALSE, c5975s);
                c6021p.m6537c0(objM6514H3);
            }
            InterfaceC5985X interfaceC5985X3 = (InterfaceC5985X) objM6514H3;
            c6021p.m6553p(false);
            int i16 = i13 & 14;
            AbstractC8198t4.m8798a(popupMenuState, c10456n, AbstractC8411c.m8969c(576335550, c6021p, new C8844f(conversationId, enumC18945g, interfaceC5985X, interfaceC5985X2, interfaceC5985X3, onArchive, popupMenuState, true)), c6021p, 384 | i16 | ((i13 >> 24) & 112), 0);
            boolean zBooleanValue = ((Boolean) interfaceC5985X.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) interfaceC5985X2.getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) interfaceC5985X3.getValue()).booleanValue();
            c6021p.m6524S(-1609793346);
            boolean zM6542f = c6021p.m6542f(interfaceC5985X) | c6021p.m6542f(interfaceC5985X2) | c6021p.m6542f(interfaceC5985X3);
            if (i16 != 4 && ((i13 & 8) == 0 || !c6021p.m6545h(popupMenuState))) {
                z12 = false;
            }
            boolean z16 = zM6542f | z12;
            Object objM6514H4 = c6021p.m6514H();
            if (z16 || objM6514H4 == obj) {
                Object c0494y = new C0494y(popupMenuState, interfaceC5985X, interfaceC5985X2, interfaceC5985X3, 16);
                c6021p.m6537c0(c0494y);
                objM6514H4 = c0494y;
            }
            c6021p.m6553p(false);
            int i17 = i13 << 3;
            m8510b(conversationId, str, z6, zBooleanValue, zBooleanValue2, zBooleanValue3, (InterfaceC1426a) objM6514H4, onRename, onDelete, onSettings, c6021p, ((i13 >> 3) & 1022) | (29360128 & (i13 << 6)) | (234881024 & i17) | (i17 & 1879048192));
            interfaceC10459q2 = c10456n;
            z11 = true;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4081k3(popupMenuState, conversationId, str, z6, enumC18945g, onRename, onArchive, onDelete, onSettings, interfaceC10459q2, z11, i10, i11);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8513e(String conversationId, EnumC18945g enumC18945g, InterfaceC1426a showRenameDialog, InterfaceC1426a showDeleteDialog, InterfaceC1426a showMoveDialog, InterfaceC1426a onArchive, InterfaceC1426a onDismiss, boolean z6, C6021p c6021p, int i10) {
        int i11;
        int i12;
        boolean z10;
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(showRenameDialog, "showRenameDialog");
        AbstractC16544l.m18094g(showDeleteDialog, "showDeleteDialog");
        AbstractC16544l.m18094g(showMoveDialog, "showMoveDialog");
        AbstractC16544l.m18094g(onArchive, "onArchive");
        AbstractC16544l.m18094g(onDismiss, "onDismiss");
        c6021p.m6526U(1147209364);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(conversationId) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(enumC18945g) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(showRenameDialog) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c6021p.m6545h(showDeleteDialog) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c6021p.m6545h(showMoveDialog) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c6021p.m6545h(onArchive) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c6021p.m6545h(onDismiss) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c6021p.m6544g(z6) ? 8388608 : 4194304;
        }
        if ((i11 & 4793491) == 4793490 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
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
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            C8410b c8410b = AbstractC18942d.f60470a;
            c6021p.m6524S(1673244492);
            int i14 = i11 & 3670016;
            boolean z11 = ((i11 & 896) == 256) | (i14 == 1048576);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (z11 || objM6514H == c5975s) {
                objM6514H = new C14101s0(showRenameDialog, onDismiss, 2);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            int i15 = i11;
            AbstractC4101o.m4761b(c8410b, (InterfaceC1426a) objM6514H, null, AbstractC18942d.f60471b, null, false, null, null, null, c6021p, 3078, 500);
            C8410b c8410b2 = AbstractC18942d.f60472c;
            c6021p.m6524S(1673255813);
            boolean z12 = ((i15 & 458752) == 131072) | (i14 == 1048576);
            Object objM6514H2 = c6021p.m6514H();
            if (z12 || objM6514H2 == c5975s) {
                objM6514H2 = new C14101s0(onArchive, onDismiss, 3);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC4101o.m4761b(c8410b2, (InterfaceC1426a) objM6514H2, null, AbstractC18942d.f60473d, null, false, null, null, null, c6021p, 3078, 500);
            C8410b c8410b3 = AbstractC18942d.f60474e;
            c6021p.m6524S(1673267084);
            boolean z13 = ((i15 & 7168) == 2048) | (i14 == 1048576);
            Object objM6514H3 = c6021p.m6514H();
            if (z13 || objM6514H3 == c5975s) {
                objM6514H3 = new C14101s0(showDeleteDialog, onDismiss, 4);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            AbstractC4101o.m4761b(c8410b3, (InterfaceC1426a) objM6514H3, null, AbstractC18942d.f60475f, null, z6, null, null, null, c6021p, ((i15 >> 6) & 458752) | 3078, 468);
            if (enumC18945g == EnumC18945g.f60490Y) {
                c6021p.m6524S(331989556);
                C8410b c8410b4 = AbstractC18942d.f60476g;
                c6021p.m6524S(1673281590);
                if ((i15 & 57344) == 16384) {
                    i12 = 1048576;
                    z10 = true;
                } else {
                    i12 = 1048576;
                    z10 = false;
                }
                boolean z14 = (i14 == i12) | z10;
                Object objM6514H4 = c6021p.m6514H();
                if (z14 || objM6514H4 == c5975s) {
                    objM6514H4 = new C14101s0(showMoveDialog, onDismiss, 5);
                    c6021p.m6537c0(objM6514H4);
                }
                c6021p.m6553p(false);
                AbstractC4101o.m4761b(c8410b4, (InterfaceC1426a) objM6514H4, null, AbstractC18942d.f60477h, null, false, null, null, null, c6021p, 3078, 500);
                c6021p.m6553p(false);
            } else if (enumC18945g == EnumC18945g.f60491Z) {
                c6021p.m6524S(332429601);
                c6021p.m6524S(1673293741);
                boolean z15 = i14 == 1048576;
                Object objM6514H5 = c6021p.m6514H();
                if (z15 || objM6514H5 == c5975s) {
                    objM6514H5 = new C14505d(23, onDismiss);
                    c6021p.m6537c0(objM6514H5);
                }
                c6021p.m6553p(false);
                AbstractC8238y4.m8878b((i15 << 3) & 112, (InterfaceC1426a) objM6514H5, c6021p, null, conversationId);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(332586244);
                c6021p.m6553p(false);
            }
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3044h(conversationId, enumC18945g, showRenameDialog, showDeleteDialog, showMoveDialog, onArchive, onDismiss, z6, i10);
        }
    }
}
