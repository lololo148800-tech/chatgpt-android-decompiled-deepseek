package p571X9;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.jawbone.tools.JawboneToolViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p027Ap.C0693a;
import p042Bf.C1269k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1051v0.AbstractC20417e;
import p1051v0.C20416d;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1095x1.InterfaceC21057K;
import p1113xn.AbstractC21328v;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.InterfaceC21925I1;
import p124Ei.C2494b;
import p124Ei.C2497c;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4152w2;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p229J0.C4163y1;
import p324Mn.C5551u;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p467T1.C7199i;
import p478Tc.AbstractC7313q;
import p505Uf.C7638A;
import p507Uh.C7680f;
import p507Uh.InterfaceC7678d;
import p523V9.AbstractC7854B5;
import p523V9.AbstractC8038Z3;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p537W0.C8410b;
import p594Y9.AbstractC9856b0;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10449g;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p871lf.C16934r;
import p887m7.C17176b;
import p891mf.AbstractC17241b;
import p891mf.C17247h;
import p891mf.C17249j;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17780r;
import p911o0.AbstractC17788v;
import p911o0.C17756f;
import p911o0.C17764j;
import p911o0.C17790w;

/* JADX INFO: renamed from: X9.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9168M {
    /* JADX WARN: Code duplicated, block: B:101:0x0262  */
    /* JADX WARN: Code duplicated, block: B:102:0x0273  */
    /* JADX WARN: Code duplicated, block: B:105:0x028b  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:118:0x0304  */
    /* JADX WARN: Code duplicated, block: B:120:0x030a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0317  */
    /* JADX WARN: Code duplicated, block: B:124:0x031f  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:64:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0108  */
    /* JADX WARN: Code duplicated, block: B:68:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0156  */
    /* JADX WARN: Code duplicated, block: B:79:0x019e  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d4  */
    /* JADX INFO: renamed from: a */
    public static final void m9719a(String jawboneId, boolean z6, InterfaceC10459q interfaceC10459q, C7638A c7638a, C5551u c5551u, JawboneToolViewModel jawboneToolViewModel, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        boolean zM6545h;
        int i14;
        int i15;
        int i16;
        InterfaceC10459q interfaceC10459q3;
        Context context;
        boolean zBooleanValue;
        List list;
        InterfaceC2062k interfaceC2062k;
        ViewModelStoreOwner viewModelStoreOwnerM12165a;
        C16527D c16527d;
        boolean zM6542f;
        Object objM6514H;
        boolean z10;
        C5551u c5551u2;
        C7638A c7638a2;
        InterfaceC10459q interfaceC10459q4;
        JawboneToolViewModel jawboneToolViewModel2;
        int i17;
        C5551u c5551u3;
        InterfaceC20904w interfaceC20904w;
        boolean z11;
        boolean z12;
        boolean zM6545h2;
        Object objM6514H2;
        InterfaceC5985X interfaceC5985XM9642d;
        JawboneToolViewModel jawboneToolViewModel3;
        InterfaceC7678d interfaceC7678dM10507b;
        C5551u c5551u4;
        InterfaceC10459q interfaceC10459q5;
        C7638A c7638a3;
        boolean zM6542f2;
        Object objM6514H3;
        C6018n0 c6018n0M6555r;
        C7638A c7638a4 = c7638a;
        AbstractC16544l.m18094g(jawboneId, "jawboneId");
        c6021p.m6526U(-429545250);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6542f(jawboneId) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if ((i10 & 4096) == 0) {
                    zM6545h = c6021p.m6542f(c7638a4);
                } else {
                    zM6545h = c6021p.m6545h(c7638a4);
                }
                if (zM6545h) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i12 | 24576;
            if ((i10 & 196608) == 0) {
                i15 = 90112 | i12;
            }
            if ((74899 & i15) == 74898 || !c6021p.m6562y()) {
                c6021p.m6519N();
                i16 = i10 & 1;
                Object obj = C6013l.f19514a;
                if (i16 != 0 || c6021p.m6561x()) {
                    if (i18 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    if (i13 != 0) {
                        c7638a4 = null;
                    }
                    c6021p.m6524S(-1020152108);
                    context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                    zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                    list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                    c6021p.m6524S(-1395507574);
                    if (zBooleanValue) {
                        interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C17247h.class));
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
                    Object objMo5693b = c16527d.mo5693b(JawboneToolViewModel.class);
                    C7638A c7638a5 = c7638a4;
                    Object objMo5693b2 = c16527d.mo5693b(C17247h.class);
                    InterfaceC10459q interfaceC10459q6 = interfaceC10459q3;
                    c6021p.m6524S(-1395498839);
                    zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                    objM6514H = c6021p.m6514H();
                    if (!zM6542f || objM6514H == obj) {
                        z10 = true;
                        if (zBooleanValue) {
                            ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C17247h.class), c16527d.mo5693b(JawboneToolViewModel.class), context, interfaceC2062k);
                            throw null;
                        }
                        if (zBooleanValue) {
                            throw new C0644w();
                        }
                        c5551u2 = null;
                        objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(JawboneToolViewModel.class), null, viewModelStoreOwnerM12165a, list);
                        c6021p.m6537c0(objM6514H);
                    } else {
                        z10 = true;
                        c5551u2 = null;
                    }
                    BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                    c6021p.m6553p(false);
                    InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                    c6021p.m6553p(false);
                    int i19 = i15 & (-458753);
                    c7638a2 = c7638a5;
                    interfaceC10459q4 = interfaceC10459q6;
                    jawboneToolViewModel2 = (JawboneToolViewModel) baseViewModel;
                    i17 = i19;
                    c5551u3 = c5551u2;
                } else {
                    c6021p.m6517L();
                    int i20 = i15 & (-458753);
                    jawboneToolViewModel2 = jawboneToolViewModel;
                    c7638a2 = c7638a4;
                    i17 = i20;
                    interfaceC10459q4 = interfaceC10459q2;
                    z10 = true;
                    c5551u3 = c5551u;
                }
                c6021p.m6554q();
                interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
                C16934r c16934r = new C16934r(jawboneId);
                c6021p.m6524S(-212561748);
                boolean zM6545h3 = c6021p.m6545h(interfaceC20904w) | c6021p.m6542f(jawboneToolViewModel2);
                if ((i17 & 14) == 4) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                boolean z13 = zM6545h3 | z11;
                if ((i17 & 112) == 32) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                boolean z14 = z13 | z12;
                if ((i17 & 7168) != 2048 && ((i17 & 4096) == 0 || !c6021p.m6545h(c7638a2))) {
                    z10 = false;
                }
                zM6545h2 = z10 | z14 | c6021p.m6545h(c5551u3);
                objM6514H2 = c6021p.m6514H();
                if (zM6545h2 || objM6514H2 == obj) {
                    Object c17249j = new C17249j(interfaceC20904w, jawboneToolViewModel2, jawboneId, z6, c7638a2, c5551u3, null);
                    c6021p.m6537c0(c17249j);
                    objM6514H2 = c17249j;
                }
                c6021p.m6553p(false);
                C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, c16934r);
                interfaceC5985XM9642d = AbstractC9112C3.m9642d(jawboneToolViewModel2.f40343c, c6021p);
                InterfaceC21925I1 interfaceC21925I1 = (InterfaceC21925I1) ((C17247h) interfaceC5985XM9642d.getValue()).f55026a.get(new C16934r(jawboneId));
                C20416d c20416dM21079a = AbstractC20417e.m21079a(AbstractC7313q.f23201f);
                C8410b c8410bM8969c = AbstractC8411c.m8969c(-1144486166, c6021p, new C2494b(interfaceC21925I1, interfaceC20904w, jawboneToolViewModel2, jawboneId, interfaceC5985XM9642d, 8));
                int i21 = ((i17 >> 6) & 14) | 196608;
                jawboneToolViewModel3 = jawboneToolViewModel2;
                C5551u c5551u5 = c5551u3;
                C7638A c7638a6 = c7638a2;
                AbstractC3984T1.m4697p(interfaceC10459q4, c20416dM21079a, null, null, null, c8410bM8969c, c6021p, i21, 28);
                if (Build.VERSION.SDK_INT >= 33) {
                    c6021p.m6524S(2004583762);
                    interfaceC7678dM10507b = AbstractC9856b0.m10508c("android.permission.POST_NOTIFICATIONS", null, c6021p, 6, 2);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(2004667245);
                    interfaceC7678dM10507b = AbstractC9856b0.m10507b(c6021p);
                    c6021p.m6553p(false);
                }
                if (((C17247h) interfaceC5985XM9642d.getValue()).f55029d && (interfaceC7678dM10507b.mo3586a() instanceof C7680f)) {
                    c6021p.m6524S(-212421751);
                    zM6542f2 = c6021p.m6542f(jawboneToolViewModel3);
                    objM6514H3 = c6021p.m6514H();
                    if (zM6542f2 || objM6514H3 == obj) {
                        objM6514H3 = new C17176b(jawboneToolViewModel3, 1);
                        c6021p.m6537c0(objM6514H3);
                    }
                    InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H3;
                    c6021p.m6553p(false);
                    AbstractC4152w2.m4780a(interfaceC1426a, null, AbstractC4152w2.m4785f(0, 3, c6021p, false), 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(183829222, c6021p, new C2497c(interfaceC1426a, interfaceC20904w, interfaceC7678dM10507b, interfaceC5985XM9642d)), c6021p, 0, 384, 4090);
                }
                c5551u4 = c5551u5;
                interfaceC10459q5 = interfaceC10459q4;
                c7638a3 = c7638a6;
            } else {
                c6021p.m6517L();
                jawboneToolViewModel3 = jawboneToolViewModel;
                c7638a3 = c7638a4;
                interfaceC10459q5 = interfaceC10459q2;
                c5551u4 = c5551u;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C4163y1(jawboneId, z6, interfaceC10459q5, c7638a3, c5551u4, jawboneToolViewModel3, i10, i11);
            }
        }
        i12 |= 384;
        interfaceC10459q2 = interfaceC10459q;
        i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if ((i10 & 4096) == 0) {
                zM6545h = c6021p.m6542f(c7638a4);
            } else {
                zM6545h = c6021p.m6545h(c7638a4);
            }
            if (zM6545h) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        i15 = i12 | 24576;
        if ((i10 & 196608) == 0) {
            i15 = 90112 | i12;
        }
        if ((74899 & i15) == 74898) {
            c6021p.m6519N();
            i16 = i10 & 1;
            Object obj2 = C6013l.f19514a;
            if (i16 != 0) {
                if (i18 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    c7638a4 = null;
                }
                c6021p.m6524S(-1020152108);
                context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C17247h.class));
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
                Object objMo5693b3 = c16527d.mo5693b(JawboneToolViewModel.class);
                C7638A c7638a7 = c7638a4;
                Object objMo5693b4 = c16527d.mo5693b(C17247h.class);
                InterfaceC10459q interfaceC10459q7 = interfaceC10459q3;
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b4) | c6021p.m6542f(objMo5693b3) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    z10 = true;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C17247h.class), c16527d.mo5693b(JawboneToolViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    c5551u2 = null;
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(JawboneToolViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    z10 = true;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C17247h.class), c16527d.mo5693b(JawboneToolViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    c5551u2 = null;
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(JawboneToolViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
                c6021p.m6553p(false);
                int i110 = i15 & (-458753);
                c7638a2 = c7638a7;
                interfaceC10459q4 = interfaceC10459q7;
                jawboneToolViewModel2 = (JawboneToolViewModel) baseViewModel2;
                i17 = i110;
                c5551u3 = c5551u2;
            } else {
                if (i18 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    c7638a4 = null;
                }
                c6021p.m6524S(-1020152108);
                context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C17247h.class));
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
                Object objMo5693b5 = c16527d.mo5693b(JawboneToolViewModel.class);
                C7638A c7638a8 = c7638a4;
                Object objMo5693b6 = c16527d.mo5693b(C17247h.class);
                InterfaceC10459q interfaceC10459q8 = interfaceC10459q3;
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b6) | c6021p.m6542f(objMo5693b5) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    z10 = true;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C17247h.class), c16527d.mo5693b(JawboneToolViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    c5551u2 = null;
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(JawboneToolViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    z10 = true;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C17247h.class), c16527d.mo5693b(JawboneToolViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    c5551u2 = null;
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(JawboneToolViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel3 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel3, c6021p, 0);
                c6021p.m6553p(false);
                int i111 = i15 & (-458753);
                c7638a2 = c7638a8;
                interfaceC10459q4 = interfaceC10459q8;
                jawboneToolViewModel2 = (JawboneToolViewModel) baseViewModel3;
                i17 = i111;
                c5551u3 = c5551u2;
            }
            c6021p.m6554q();
            interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C16934r c16934r2 = new C16934r(jawboneId);
            c6021p.m6524S(-212561748);
            boolean zM6545h4 = c6021p.m6545h(interfaceC20904w) | c6021p.m6542f(jawboneToolViewModel2);
            if ((i17 & 14) == 4) {
                z11 = z10;
            } else {
                z11 = false;
            }
            boolean z15 = zM6545h4 | z11;
            if ((i17 & 112) == 32) {
                z12 = z10;
            } else {
                z12 = false;
            }
            boolean z16 = z15 | z12;
            if ((i17 & 7168) != 2048) {
                z10 = false;
            }
            zM6545h2 = z10 | z16 | c6021p.m6545h(c5551u3);
            objM6514H2 = c6021p.m6514H();
            if (zM6545h2) {
                Object c17249j2 = new C17249j(interfaceC20904w, jawboneToolViewModel2, jawboneId, z6, c7638a2, c5551u3, null);
                c6021p.m6537c0(c17249j2);
                objM6514H2 = c17249j2;
            } else {
                Object c17249j3 = new C17249j(interfaceC20904w, jawboneToolViewModel2, jawboneId, z6, c7638a2, c5551u3, null);
                c6021p.m6537c0(c17249j3);
                objM6514H2 = c17249j3;
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, c16934r2);
            interfaceC5985XM9642d = AbstractC9112C3.m9642d(jawboneToolViewModel2.f40343c, c6021p);
            InterfaceC21925I1 interfaceC21925I2 = (InterfaceC21925I1) ((C17247h) interfaceC5985XM9642d.getValue()).f55026a.get(new C16934r(jawboneId));
            C20416d c20416dM21079a2 = AbstractC20417e.m21079a(AbstractC7313q.f23201f);
            C8410b c8410bM8969c2 = AbstractC8411c.m8969c(-1144486166, c6021p, new C2494b(interfaceC21925I2, interfaceC20904w, jawboneToolViewModel2, jawboneId, interfaceC5985XM9642d, 8));
            int i22 = ((i17 >> 6) & 14) | 196608;
            jawboneToolViewModel3 = jawboneToolViewModel2;
            C5551u c5551u6 = c5551u3;
            C7638A c7638a9 = c7638a2;
            AbstractC3984T1.m4697p(interfaceC10459q4, c20416dM21079a2, null, null, null, c8410bM8969c2, c6021p, i22, 28);
            if (Build.VERSION.SDK_INT >= 33) {
                c6021p.m6524S(2004583762);
                interfaceC7678dM10507b = AbstractC9856b0.m10508c("android.permission.POST_NOTIFICATIONS", null, c6021p, 6, 2);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(2004667245);
                interfaceC7678dM10507b = AbstractC9856b0.m10507b(c6021p);
                c6021p.m6553p(false);
            }
            if (((C17247h) interfaceC5985XM9642d.getValue()).f55029d) {
                c6021p.m6524S(-212421751);
                zM6542f2 = c6021p.m6542f(jawboneToolViewModel3);
                objM6514H3 = c6021p.m6514H();
                if (zM6542f2) {
                    objM6514H3 = new C17176b(jawboneToolViewModel3, 1);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    objM6514H3 = new C17176b(jawboneToolViewModel3, 1);
                    c6021p.m6537c0(objM6514H3);
                }
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H3;
                c6021p.m6553p(false);
                AbstractC4152w2.m4780a(interfaceC1426a2, null, AbstractC4152w2.m4785f(0, 3, c6021p, false), 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(183829222, c6021p, new C2497c(interfaceC1426a2, interfaceC20904w, interfaceC7678dM10507b, interfaceC5985XM9642d)), c6021p, 0, 384, 4090);
            }
            c5551u4 = c5551u6;
            interfaceC10459q5 = interfaceC10459q4;
            c7638a3 = c7638a9;
        } else {
            c6021p.m6519N();
            i16 = i10 & 1;
            Object obj3 = C6013l.f19514a;
            if (i16 != 0) {
                if (i18 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    c7638a4 = null;
                }
                c6021p.m6524S(-1020152108);
                context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C17247h.class));
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
                Object objMo5693b7 = c16527d.mo5693b(JawboneToolViewModel.class);
                C7638A c7638a10 = c7638a4;
                Object objMo5693b8 = c16527d.mo5693b(C17247h.class);
                InterfaceC10459q interfaceC10459q9 = interfaceC10459q3;
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b8) | c6021p.m6542f(objMo5693b7) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    z10 = true;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C17247h.class), c16527d.mo5693b(JawboneToolViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    c5551u2 = null;
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(JawboneToolViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    z10 = true;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C17247h.class), c16527d.mo5693b(JawboneToolViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    c5551u2 = null;
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(JawboneToolViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel4 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel4, c6021p, 0);
                c6021p.m6553p(false);
                int i112 = i15 & (-458753);
                c7638a2 = c7638a10;
                interfaceC10459q4 = interfaceC10459q9;
                jawboneToolViewModel2 = (JawboneToolViewModel) baseViewModel4;
                i17 = i112;
                c5551u3 = c5551u2;
            } else {
                if (i18 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                if (i13 != 0) {
                    c7638a4 = null;
                }
                c6021p.m6524S(-1020152108);
                context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C17247h.class));
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
                Object objMo5693b9 = c16527d.mo5693b(JawboneToolViewModel.class);
                C7638A c7638a11 = c7638a4;
                Object objMo5693b10 = c16527d.mo5693b(C17247h.class);
                InterfaceC10459q interfaceC10459q10 = interfaceC10459q3;
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b10) | c6021p.m6542f(objMo5693b9) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    z10 = true;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C17247h.class), c16527d.mo5693b(JawboneToolViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    c5551u2 = null;
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(JawboneToolViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    z10 = true;
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C17247h.class), c16527d.mo5693b(JawboneToolViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    c5551u2 = null;
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(JawboneToolViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel5 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel5, c6021p, 0);
                c6021p.m6553p(false);
                int i113 = i15 & (-458753);
                c7638a2 = c7638a11;
                interfaceC10459q4 = interfaceC10459q10;
                jawboneToolViewModel2 = (JawboneToolViewModel) baseViewModel5;
                i17 = i113;
                c5551u3 = c5551u2;
            }
            c6021p.m6554q();
            interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C16934r c16934r3 = new C16934r(jawboneId);
            c6021p.m6524S(-212561748);
            boolean zM6545h5 = c6021p.m6545h(interfaceC20904w) | c6021p.m6542f(jawboneToolViewModel2);
            if ((i17 & 14) == 4) {
                z11 = z10;
            } else {
                z11 = false;
            }
            boolean z17 = zM6545h5 | z11;
            if ((i17 & 112) == 32) {
                z12 = z10;
            } else {
                z12 = false;
            }
            boolean z18 = z17 | z12;
            if ((i17 & 7168) != 2048) {
                z10 = false;
            }
            zM6545h2 = z10 | z18 | c6021p.m6545h(c5551u3);
            objM6514H2 = c6021p.m6514H();
            if (zM6545h2) {
                Object c17249j4 = new C17249j(interfaceC20904w, jawboneToolViewModel2, jawboneId, z6, c7638a2, c5551u3, null);
                c6021p.m6537c0(c17249j4);
                objM6514H2 = c17249j4;
            } else {
                Object c17249j5 = new C17249j(interfaceC20904w, jawboneToolViewModel2, jawboneId, z6, c7638a2, c5551u3, null);
                c6021p.m6537c0(c17249j5);
                objM6514H2 = c17249j5;
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p, c16934r3);
            interfaceC5985XM9642d = AbstractC9112C3.m9642d(jawboneToolViewModel2.f40343c, c6021p);
            InterfaceC21925I1 interfaceC21925I3 = (InterfaceC21925I1) ((C17247h) interfaceC5985XM9642d.getValue()).f55026a.get(new C16934r(jawboneId));
            C20416d c20416dM21079a3 = AbstractC20417e.m21079a(AbstractC7313q.f23201f);
            C8410b c8410bM8969c3 = AbstractC8411c.m8969c(-1144486166, c6021p, new C2494b(interfaceC21925I3, interfaceC20904w, jawboneToolViewModel2, jawboneId, interfaceC5985XM9642d, 8));
            int i23 = ((i17 >> 6) & 14) | 196608;
            jawboneToolViewModel3 = jawboneToolViewModel2;
            C5551u c5551u7 = c5551u3;
            C7638A c7638a12 = c7638a2;
            AbstractC3984T1.m4697p(interfaceC10459q4, c20416dM21079a3, null, null, null, c8410bM8969c3, c6021p, i23, 28);
            if (Build.VERSION.SDK_INT >= 33) {
                c6021p.m6524S(2004583762);
                interfaceC7678dM10507b = AbstractC9856b0.m10508c("android.permission.POST_NOTIFICATIONS", null, c6021p, 6, 2);
                c6021p.m6553p(false);
            } else {
                c6021p.m6524S(2004667245);
                interfaceC7678dM10507b = AbstractC9856b0.m10507b(c6021p);
                c6021p.m6553p(false);
            }
            if (((C17247h) interfaceC5985XM9642d.getValue()).f55029d) {
                c6021p.m6524S(-212421751);
                zM6542f2 = c6021p.m6542f(jawboneToolViewModel3);
                objM6514H3 = c6021p.m6514H();
                if (zM6542f2) {
                    objM6514H3 = new C17176b(jawboneToolViewModel3, 1);
                    c6021p.m6537c0(objM6514H3);
                } else {
                    objM6514H3 = new C17176b(jawboneToolViewModel3, 1);
                    c6021p.m6537c0(objM6514H3);
                }
                InterfaceC1426a interfaceC1426a3 = (InterfaceC1426a) objM6514H3;
                c6021p.m6553p(false);
                AbstractC4152w2.m4780a(interfaceC1426a3, null, AbstractC4152w2.m4785f(0, 3, c6021p, false), 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, AbstractC8411c.m8969c(183829222, c6021p, new C2497c(interfaceC1426a3, interfaceC20904w, interfaceC7678dM10507b, interfaceC5985XM9642d)), c6021p, 0, 384, 4090);
            }
            c5551u4 = c5551u7;
            interfaceC10459q5 = interfaceC10459q4;
            c7638a3 = c7638a12;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C4163y1(jawboneId, z6, interfaceC10459q5, c7638a3, c5551u4, jawboneToolViewModel3, i10, i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9720b(InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, String str, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        InterfaceC10459q interfaceC10459q2;
        c6021p.m6526U(2070494238);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(str) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if ((i12 & 1171) == 1170 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            C10456n c10456n = C10456n.f30959Y;
            C10449g c10449g = C10444b.f30947z0;
            C17756f c17756f = AbstractC17770m.f56724a;
            float f10 = AbstractC7313q.f23201f;
            C17764j c17764jM19500g = AbstractC17770m.m19500g(f10);
            InterfaceC10459q interfaceC10459qM11235m = AbstractC10842a.m11235m(c10456n, f10, 0.0f, 2);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(c17764jM19500g, c10449g, c6021p, 48);
            int i13 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11235m);
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
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i13))) {
                AbstractC0168G.m537z(i13, c6021p, i13, c21694h3);
            }
            C21694h c21694h4 = C21698j.f68871d;
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d);
            InterfaceC10459q interfaceC10459qM11252l = AbstractC10844c.m11252l(c10456n, AbstractC7313q.f23206k);
            C5984W0 c5984w0 = AbstractC3959O0.f12302a;
            InterfaceC10459q interfaceC10459qM11207b = AbstractC10833a.m11207b(interfaceC10459qM11252l, ((C3949M0) c6021p.m6548k(c5984w0)).f12213a, AbstractC20417e.f64539a);
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30938q0, false);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11207b);
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(c21694h, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(c21694h2, c6021p, interfaceC6008i0M6550m2);
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h3);
            }
            C5997d.m6439Z(c21694h4, c6021p, interfaceC10459qM10923d2);
            AbstractC3878A1.m4597b(AbstractC7854B5.m8118f(), null, null, ((C3949M0) c6021p.m6548k(c5984w0)).f12215b, c6021p, 48, 4);
            c6021p.m6553p(true);
            AbstractC4124r4.m4768b(AbstractC8142m4.m8677e(R.string.jawbone_notifications_request_sheet_title, new Object[]{str}, c6021p), AbstractC10842a.m11233k(c10456n, f10), 0L, 0L, null, null, null, 0L, null, new C7199i(3), 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12149e, c6021p, 0, 0, 65020);
            AbstractC3984T1.m4685d(interfaceC1426a2, AbstractC10844c.m11244d(c10456n, 1.0f), false, null, null, null, null, null, null, AbstractC17241b.f55018a, c6021p, ((i12 >> 3) & 14) | 805306416, 508);
            AbstractC3984T1.m4700s(interfaceC1426a, null, false, null, null, null, null, null, null, AbstractC17241b.f55019b, c6021p, (i12 & 14) | 805306368, 510);
            AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23199d));
            c6021p.m6553p(true);
            interfaceC10459q2 = c10456n;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1269k(interfaceC1426a, interfaceC1426a2, str, interfaceC10459q2, i10, 24);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Double m9721c(Object obj) {
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            return AbstractC21328v.m21719f((String) obj);
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            if (size == 0) {
                return Double.valueOf(0.0d);
            }
            if (size == 1) {
                return m9721c(AbstractC17680n.m19341Q(list));
            }
        } else {
            if (obj instanceof Boolean) {
                return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
            }
            if (obj == null) {
                return Double.valueOf(0.0d);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m9722d(Object obj) {
        C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c0693aM8396e, 10));
        Iterator it = c0693aM8396e.f2015Y.iterator();
        while (it.hasNext()) {
            arrayList.add(m9721c(it.next()));
        }
        return arrayList;
    }
}
