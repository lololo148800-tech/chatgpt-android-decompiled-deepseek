package p544W9;

import af.C10561Q;
import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.gizmoshome.impl.snorlax.SnorlaxListViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import gf.C14125j;
import gf.C14126k;
import gf.C14130o;
import java.util.LinkedHashMap;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import p002A0.C0148y;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p039Bc.C0886t;
import p042Bf.C1275q;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1081wc.AbstractC20875V;
import p1081wc.InterfaceC20904w;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1143z4.C21770L;
import p1143z4.InterfaceC21768J;
import p124Ei.C2497c;
import p225Im.InterfaceC3759g;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3917G4;
import p324Mn.C5521B;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p324Mn.C5551u;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p482Tg.C7445b0;
import p523V9.AbstractC8128k6;
import p537W0.AbstractC8411c;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p571X9.AbstractC9112C3;
import p594Y9.AbstractC9839Y2;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: W9.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8652j {
    /* JADX INFO: renamed from: a */
    public static final void m9328a(String str, boolean z6, InterfaceC1436k onIntent, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(onIntent, "onIntent");
        c6021p.m6526U(-1310974900);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6545h(onIntent) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            AbstractC9839Y2.m10484a(null, c6021p, 0);
            InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(onIntent, c6021p);
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            Boolean boolValueOf = Boolean.valueOf(z6);
            c6021p.m6524S(2016564905);
            boolean zM6545h = ((i11 & 14) == 4) | c6021p.m6545h(interfaceC20904w) | c6021p.m6542f(interfaceC5985XM6435V);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C14125j(interfaceC20904w, interfaceC5985XM6435V, str, null);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C5997d.m6451g(str, boolValueOf, (InterfaceC1439n) objM6514H, c6021p);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0886t(str, z6, onIntent, i10, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9329b(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) throws Exception {
        c6021p.m6526U(-1626189647);
        int i11 = i10 | 6;
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            c6021p.m6524S(49104742);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                C5551u.Companion.getClass();
                objM6514H = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
                c6021p.m6537c0(objM6514H);
            }
            C5551u c5551u = (C5551u) objM6514H;
            c6021p.m6553p(false);
            c6021p.m6524S(49106427);
            boolean zM6542f = c6021p.m6542f(c5551u);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f || objM6514H2 == obj) {
                C5525F.Companion.getClass();
                objM6514H2 = AbstractC8519M3.m9187a(c5551u, C5524E.m5924a());
                c6021p.m6537c0(objM6514H2);
            }
            C5521B c5521b = (C5521B) objM6514H2;
            c6021p.m6553p(false);
            c6021p.m6524S(49109958);
            boolean zM6542f2 = c6021p.m6542f(c5551u);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f2 || objM6514H3 == obj) {
                C21554a c21554a = C21555b.f68260Z;
                long jM8644j = AbstractC8128k6.m8644j(1, EnumC21557d.DAYS);
                c5551u.getClass();
                C5551u c5551uM5947c = c5551u.m5947c(C21555b.m21843m(jM8644j));
                C5525F.Companion.getClass();
                objM6514H3 = AbstractC8519M3.m9187a(c5551uM5947c, C5524E.m5924a());
                c6021p.m6537c0(objM6514H3);
            }
            C5521B c5521b2 = (C5521B) objM6514H3;
            c6021p.m6553p(false);
            InterfaceC20904w interfaceC20904w = (InterfaceC20904w) c6021p.m6548k(AbstractC20875V.f66456a);
            C17296C c17296c = C17296C.f55119a;
            c6021p.m6524S(49115180);
            boolean zM6545h = c6021p.m6545h(interfaceC20904w);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6545h || objM6514H4 == obj) {
                objM6514H4 = new C14126k(interfaceC20904w, null);
                c6021p.m6537c0(objM6514H4);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H4, c6021p, c17296c);
            m9330c(c5521b, c5521b2, interfaceC10459q, null, c6021p, (i11 << 6) & 896, 8);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q, i10, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:55:0x0113 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x011a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0162 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m9330c(C5521B nowLocal, C5521B yesterdayLocal, InterfaceC10459q interfaceC10459q, SnorlaxListViewModel snorlaxListViewModel, C6021p c6021p, int i10, int i11) {
        int i12;
        InterfaceC10459q interfaceC10459q2;
        int i13;
        InterfaceC10459q interfaceC10459q3;
        Context context;
        boolean zBooleanValue;
        List list;
        InterfaceC2062k interfaceC2062k;
        ViewModelStoreOwner viewModelStoreOwnerM12165a;
        C16527D c16527d;
        boolean zM6542f;
        Object objM6514H;
        int i14;
        SnorlaxListViewModel snorlaxListViewModel2;
        InterfaceC10459q interfaceC10459q4;
        boolean zM6542f2;
        Object objM6514H2;
        SnorlaxListViewModel snorlaxListViewModel3;
        InterfaceC10459q interfaceC10459q5;
        C6018n0 c6018n0M6555r;
        AbstractC16544l.m18094g(nowLocal, "nowLocal");
        AbstractC16544l.m18094g(yesterdayLocal, "yesterdayLocal");
        c6021p.m6526U(1062723882);
        if ((i10 & 6) == 0) {
            i12 = (c6021p.m6545h(nowLocal) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c6021p.m6545h(yesterdayLocal) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 == 0) {
            if ((i10 & 384) == 0) {
                interfaceC10459q2 = interfaceC10459q;
                i12 |= c6021p.m6542f(interfaceC10459q2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i12 |= 1024;
            }
            if ((i12 & 1171) == 1170 || !c6021p.m6562y()) {
                c6021p.m6519N();
                i13 = i10 & 1;
                Object obj = C6013l.f19514a;
                if (i13 != 0 || c6021p.m6561x()) {
                    if (i15 != 0) {
                        interfaceC10459q3 = C10456n.f30959Y;
                    } else {
                        interfaceC10459q3 = interfaceC10459q2;
                    }
                    c6021p.m6524S(-1020152108);
                    context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                    zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                    list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                    c6021p.m6524S(-1395507574);
                    if (zBooleanValue) {
                        interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14130o.class));
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
                    Object objMo5693b = c16527d.mo5693b(SnorlaxListViewModel.class);
                    InterfaceC10459q interfaceC10459q6 = interfaceC10459q3;
                    Object objMo5693b2 = c16527d.mo5693b(C14130o.class);
                    c6021p.m6524S(-1395498839);
                    zM6542f = c6021p.m6542f(objMo5693b2) | c6021p.m6542f(objMo5693b) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                    objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == obj) {
                        if (zBooleanValue) {
                            ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14130o.class), c16527d.mo5693b(SnorlaxListViewModel.class), context, interfaceC2062k);
                            throw null;
                        }
                        if (zBooleanValue) {
                            throw new C0644w();
                        }
                        objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxListViewModel.class), null, viewModelStoreOwnerM12165a, list);
                        c6021p.m6537c0(objM6514H);
                    }
                    BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                    c6021p.m6553p(false);
                    InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                    c6021p.m6553p(false);
                    i14 = i12 & (-7169);
                    snorlaxListViewModel2 = (SnorlaxListViewModel) baseViewModel;
                    interfaceC10459q4 = interfaceC10459q6;
                } else {
                    c6021p.m6517L();
                    snorlaxListViewModel2 = snorlaxListViewModel;
                    i14 = i12 & (-7169);
                    interfaceC10459q4 = interfaceC10459q2;
                }
                c6021p.m6554q();
                C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
                C14130o c14130o = (C14130o) AbstractC9112C3.m9642d(snorlaxListViewModel2.f40343c, c6021p).getValue();
                c6021p.m6524S(-2082537561);
                zM6542f2 = c6021p.m6542f(snorlaxListViewModel2);
                objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == obj) {
                    objM6514H2 = new C7445b0(1, snorlaxListViewModel2, SnorlaxListViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 25);
                    c6021p.m6537c0(objM6514H2);
                }
                InterfaceC3759g interfaceC3759g = (InterfaceC3759g) objM6514H2;
                c6021p.m6553p(false);
                AbstractC8662k3.m9350a(interfaceC10459q4, null, 0L, AbstractC8411c.m8969c(2007011603, c6021p, new C0148y(AbstractC3917G4.m4615a(c6021p), c8870f, interfaceC3759g, 27)), false, AbstractC8411c.m8969c(582700398, c6021p, new C2497c(c14130o, interfaceC3759g, nowLocal, yesterdayLocal, 9)), c6021p, ((i14 >> 6) & 14) | 199680, 22);
                snorlaxListViewModel3 = snorlaxListViewModel2;
                interfaceC10459q5 = interfaceC10459q4;
            } else {
                c6021p.m6517L();
                snorlaxListViewModel3 = snorlaxListViewModel;
                interfaceC10459q5 = interfaceC10459q2;
            }
            c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r != null) {
                c6018n0M6555r.f19536d = new C1275q(nowLocal, yesterdayLocal, interfaceC10459q5, snorlaxListViewModel3, i10, i11, 9);
            }
        }
        i12 |= 384;
        interfaceC10459q2 = interfaceC10459q;
        if ((i10 & 3072) == 0) {
            i12 |= 1024;
        }
        if ((i12 & 1171) == 1170) {
            c6021p.m6519N();
            i13 = i10 & 1;
            Object obj2 = C6013l.f19514a;
            if (i13 != 0) {
                if (i15 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                c6021p.m6524S(-1020152108);
                context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14130o.class));
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
                Object objMo5693b3 = c16527d.mo5693b(SnorlaxListViewModel.class);
                InterfaceC10459q interfaceC10459q7 = interfaceC10459q3;
                Object objMo5693b4 = c16527d.mo5693b(C14130o.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b4) | c6021p.m6542f(objMo5693b3) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14130o.class), c16527d.mo5693b(SnorlaxListViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxListViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14130o.class), c16527d.mo5693b(SnorlaxListViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxListViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel2 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel2, c6021p, 0);
                c6021p.m6553p(false);
                i14 = i12 & (-7169);
                snorlaxListViewModel2 = (SnorlaxListViewModel) baseViewModel2;
                interfaceC10459q4 = interfaceC10459q7;
            } else {
                if (i15 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                c6021p.m6524S(-1020152108);
                context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14130o.class));
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
                Object objMo5693b5 = c16527d.mo5693b(SnorlaxListViewModel.class);
                InterfaceC10459q interfaceC10459q8 = interfaceC10459q3;
                Object objMo5693b6 = c16527d.mo5693b(C14130o.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b6) | c6021p.m6542f(objMo5693b5) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14130o.class), c16527d.mo5693b(SnorlaxListViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxListViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14130o.class), c16527d.mo5693b(SnorlaxListViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxListViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel3 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel3, c6021p, 0);
                c6021p.m6553p(false);
                i14 = i12 & (-7169);
                snorlaxListViewModel2 = (SnorlaxListViewModel) baseViewModel3;
                interfaceC10459q4 = interfaceC10459q8;
            }
            c6021p.m6554q();
            C8870f c8870f2 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            C14130o c14130o2 = (C14130o) AbstractC9112C3.m9642d(snorlaxListViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(-2082537561);
            zM6542f2 = c6021p.m6542f(snorlaxListViewModel2);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f2) {
                objM6514H2 = new C7445b0(1, snorlaxListViewModel2, SnorlaxListViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 25);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C7445b0(1, snorlaxListViewModel2, SnorlaxListViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 25);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC3759g interfaceC3759g2 = (InterfaceC3759g) objM6514H2;
            c6021p.m6553p(false);
            AbstractC8662k3.m9350a(interfaceC10459q4, null, 0L, AbstractC8411c.m8969c(2007011603, c6021p, new C0148y(AbstractC3917G4.m4615a(c6021p), c8870f2, interfaceC3759g2, 27)), false, AbstractC8411c.m8969c(582700398, c6021p, new C2497c(c14130o2, interfaceC3759g2, nowLocal, yesterdayLocal, 9)), c6021p, ((i14 >> 6) & 14) | 199680, 22);
            snorlaxListViewModel3 = snorlaxListViewModel2;
            interfaceC10459q5 = interfaceC10459q4;
        } else {
            c6021p.m6519N();
            i13 = i10 & 1;
            Object obj3 = C6013l.f19514a;
            if (i13 != 0) {
                if (i15 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                c6021p.m6524S(-1020152108);
                context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14130o.class));
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
                Object objMo5693b7 = c16527d.mo5693b(SnorlaxListViewModel.class);
                InterfaceC10459q interfaceC10459q9 = interfaceC10459q3;
                Object objMo5693b8 = c16527d.mo5693b(C14130o.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b8) | c6021p.m6542f(objMo5693b7) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14130o.class), c16527d.mo5693b(SnorlaxListViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxListViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14130o.class), c16527d.mo5693b(SnorlaxListViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxListViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel4 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel4, c6021p, 0);
                c6021p.m6553p(false);
                i14 = i12 & (-7169);
                snorlaxListViewModel2 = (SnorlaxListViewModel) baseViewModel4;
                interfaceC10459q4 = interfaceC10459q9;
            } else {
                if (i15 != 0) {
                    interfaceC10459q3 = C10456n.f30959Y;
                } else {
                    interfaceC10459q3 = interfaceC10459q2;
                }
                c6021p.m6524S(-1020152108);
                context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C14130o.class));
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
                Object objMo5693b9 = c16527d.mo5693b(SnorlaxListViewModel.class);
                InterfaceC10459q interfaceC10459q10 = interfaceC10459q3;
                Object objMo5693b10 = c16527d.mo5693b(C14130o.class);
                c6021p.m6524S(-1395498839);
                zM6542f = c6021p.m6542f(objMo5693b10) | c6021p.m6542f(objMo5693b9) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                objM6514H = c6021p.m6514H();
                if (zM6542f) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14130o.class), c16527d.mo5693b(SnorlaxListViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxListViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                } else {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C14130o.class), c16527d.mo5693b(SnorlaxListViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(SnorlaxListViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel5 = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel5, c6021p, 0);
                c6021p.m6553p(false);
                i14 = i12 & (-7169);
                snorlaxListViewModel2 = (SnorlaxListViewModel) baseViewModel5;
                interfaceC10459q4 = interfaceC10459q10;
            }
            c6021p.m6554q();
            C8870f c8870f3 = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            C14130o c14130o3 = (C14130o) AbstractC9112C3.m9642d(snorlaxListViewModel2.f40343c, c6021p).getValue();
            c6021p.m6524S(-2082537561);
            zM6542f2 = c6021p.m6542f(snorlaxListViewModel2);
            objM6514H2 = c6021p.m6514H();
            if (zM6542f2) {
                objM6514H2 = new C7445b0(1, snorlaxListViewModel2, SnorlaxListViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 25);
                c6021p.m6537c0(objM6514H2);
            } else {
                objM6514H2 = new C7445b0(1, snorlaxListViewModel2, SnorlaxListViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 25);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC3759g interfaceC3759g3 = (InterfaceC3759g) objM6514H2;
            c6021p.m6553p(false);
            AbstractC8662k3.m9350a(interfaceC10459q4, null, 0L, AbstractC8411c.m8969c(2007011603, c6021p, new C0148y(AbstractC3917G4.m4615a(c6021p), c8870f3, interfaceC3759g3, 27)), false, AbstractC8411c.m8969c(582700398, c6021p, new C2497c(c14130o3, interfaceC3759g3, nowLocal, yesterdayLocal, 9)), c6021p, ((i14 >> 6) & 14) | 199680, 22);
            snorlaxListViewModel3 = snorlaxListViewModel2;
            interfaceC10459q5 = interfaceC10459q4;
        }
        c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1275q(nowLocal, yesterdayLocal, interfaceC10459q5, snorlaxListViewModel3, i10, i11, 9);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m9331d(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: e */
    public static String m9332e(Class cls) {
        LinkedHashMap linkedHashMap = C21770L.f69053b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            InterfaceC21768J interfaceC21768J = (InterfaceC21768J) cls.getAnnotation(InterfaceC21768J.class);
            strValue = interfaceC21768J != null ? interfaceC21768J.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        AbstractC16544l.m18091d(strValue);
        return strValue;
    }
}
