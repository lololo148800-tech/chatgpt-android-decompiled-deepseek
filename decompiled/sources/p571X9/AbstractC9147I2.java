package p571X9;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.conversationspreadsheet.impl.ConversationSpreadsheetViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import mo.C17327D;
import mo.InterfaceC17333J;
import p002A0.C0146w;
import p003A1.AbstractC0168G;
import p003A1.AbstractC0233b1;
import p003A1.C0155B1;
import p003A1.C0178J0;
import p025An.C0644w;
import p026Ao.C0678l;
import p042Bf.C1268j;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2062k;
import p1113xn.AbstractC21322p;
import p1159zo.C22221g;
import p124Ei.C2446D;
import p193Hf.C3312I0;
import p193Hf.C3321N;
import p228J.AbstractC3794B0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4025b1;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p363Og.C6207k;
import p404Qe.AbstractC6669e;
import p404Qe.C6677m;
import p404Qe.C6678n;
import p404Qe.C6679o;
import p404Qe.C6680p;
import p404Qe.C6681q;
import p404Qe.C6682r;
import p478Tc.AbstractC7308l;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p594Y9.AbstractC9769M3;
import p774h1.C14365u;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17680n;
import p968qi.C18739v;

/* JADX INFO: renamed from: X9.I2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9147I2 {
    /* JADX INFO: renamed from: a */
    public static final void m9692a(ConversationSpreadsheetViewModel conversationSpreadsheetViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        ConversationSpreadsheetViewModel conversationSpreadsheetViewModel2;
        c6021p.m6526U(-1871911119);
        if ((((i10 & 6) == 0 ? i10 | 2 : i10) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            conversationSpreadsheetViewModel2 = conversationSpreadsheetViewModel;
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
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C6682r.class));
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
                Object objMo5693b = c16527d.mo5693b(ConversationSpreadsheetViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C6682r.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C6682r.class), c16527d.mo5693b(ConversationSpreadsheetViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(ConversationSpreadsheetViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                conversationSpreadsheetViewModel2 = (ConversationSpreadsheetViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                conversationSpreadsheetViewModel2 = conversationSpreadsheetViewModel;
            }
            c6021p.m6554q();
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            InterfaceC5985X interfaceC5985XM9805a = AbstractC9233X.m9805a(conversationSpreadsheetViewModel2.f40343c, C6678n.f21475Y, c6021p, 48);
            c6021p.m6524S(1240723678);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                objM6514H2 = C5997d.m6430Q((C18739v) interfaceC5985XM9805a.getValue(), C5975S.f19448r0);
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H2;
            c6021p.m6553p(false);
            C6682r c6682r = (C6682r) AbstractC9112C3.m9642d(conversationSpreadsheetViewModel2.f40343c, c6021p).getValue();
            AbstractC8662k3.m9350a(null, null, 0L, AbstractC8411c.m8969c(-1010166232, c6021p, new C1268j(c6682r, c8870f, conversationSpreadsheetViewModel2, interfaceC5985X, 9)), false, AbstractC8411c.m8969c(-1333206419, c6021p, new C6677m(c6682r, interfaceC5985X, conversationSpreadsheetViewModel2)), c6021p, 199680, 23);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0178J0(conversationSpreadsheetViewModel2, i10, 12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9693b(String str, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(176415100);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            AbstractActivityC17375g abstractActivityC17375g = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
            c6021p.m6524S(-2079052162);
            boolean zM6545h = ((i11 & 14) == 4) | c6021p.m6545h(c8870f) | c6021p.m6545h(abstractActivityC17375g);
            Object objM6514H = c6021p.m6514H();
            if (zM6545h || objM6514H == C6013l.f19514a) {
                objM6514H = new C0155B1(str, c8870f, abstractActivityC17375g, 28);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H;
            c6021p.m6553p(false);
            AbstractC3984T1.m4693l(interfaceC1426a, null, !(str == null || AbstractC21322p.m21681O(str)), null, null, AbstractC6669e.f21443b, c6021p, 196608, 26);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6679o(str, i10, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9694c(InterfaceC1426a interfaceC1426a, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1216451262);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1426a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C5997d.m6440a(AbstractC3794B0.m4494s(C14365u.f45055e, AbstractC4025b1.f12649a), AbstractC8411c.m8969c(-500603010, c6021p, new C3321N(6, interfaceC1426a)), c6021p, 56);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3312I0(i10, 1, interfaceC1426a);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9695d(List list, int i10, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i11) {
        int i12;
        InterfaceC5985X interfaceC5985X;
        c6021p.m6526U(1054427674);
        if ((i11 & 6) == 0) {
            i12 = (c6021p.m6545h(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c6021p.m6538d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c6021p.m6545h(interfaceC1436k) ? 256 : 128;
        }
        int i13 = i12;
        if ((i13 & 147) == 146 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (list.size() <= 1) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C6680p(list, i10, interfaceC1436k, i11, 0);
                    return;
                }
                return;
            }
            c6021p.m6524S(216278609);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (objM6514H == c5975s) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) objM6514H;
            Object objM530s = AbstractC0168G.m530s(216280856, c6021p, false);
            if (objM530s == c5975s) {
                objM530s = new C6207k(interfaceC5985X2, 3);
                c6021p.m6537c0(objM530s);
            }
            c6021p.m6553p(false);
            AbstractC3984T1.m4693l((InterfaceC1426a) objM530s, null, false, null, null, AbstractC8411c.m8969c(-505302409, c6021p, new C2446D(i10, 9)), c6021p, 196614, 30);
            if (((Boolean) interfaceC5985X2.getValue()).booleanValue()) {
                C6681q c6681q = C6681q.f21484Y;
                Object objM19344T = AbstractC17680n.m19344T(i10, list);
                c6021p.m6524S(216312293);
                Object objM6514H2 = c6021p.m6514H();
                if (objM6514H2 == c5975s) {
                    interfaceC5985X = interfaceC5985X2;
                    objM6514H2 = new C6207k(interfaceC5985X, 4);
                    c6021p.m6537c0(objM6514H2);
                } else {
                    interfaceC5985X = interfaceC5985X2;
                }
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objM6514H2;
                c6021p.m6553p(false);
                c6021p.m6524S(216313904);
                boolean zM6545h = c6021p.m6545h(list) | ((i13 & 896) == 256);
                Object objM6514H3 = c6021p.m6514H();
                if (zM6545h || objM6514H3 == c5975s) {
                    objM6514H3 = new C0146w(interfaceC1436k, list, interfaceC5985X, 28);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                AbstractC9769M3.m10374a(list, c6681q, objM19344T, interfaceC1426a, (InterfaceC1436k) objM6514H3, null, AbstractC6669e.f21442a, c6021p, (i13 & 14) | 1575936, 32);
            }
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C6680p(list, i10, interfaceC1436k, i11, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo4337e(C22221g c22221g, int i10, String str);

    /* JADX INFO: renamed from: f */
    public abstract void mo4338f(C22221g c22221g, int i10, String str);

    /* JADX INFO: renamed from: g */
    public abstract void mo4339g(C22221g c22221g, Exception exc, C17327D c17327d);

    /* JADX INFO: renamed from: h */
    public abstract void mo4340h(String str, C22221g c22221g);

    /* JADX INFO: renamed from: i */
    public abstract void mo4341i(C22221g c22221g, C0678l c0678l);

    /* JADX INFO: renamed from: j */
    public void mo4342j(InterfaceC17333J interfaceC17333J, C17327D c17327d) {
    }
}
