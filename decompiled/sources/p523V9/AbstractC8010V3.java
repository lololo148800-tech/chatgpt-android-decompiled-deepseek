package p523V9;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bo.AbstractC11523k;
import bo.C11534v;
import com.openai.feature.serverstatus.impl.failwhale.FailwhaleViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p003A1.AbstractC0233b1;
import p003A1.C0257i0;
import p025An.C0644w;
import p070Cg.C1659g;
import p070Cg.C1660h;
import p098Di.InterfaceC2062k;
import p1008s8.C19491t;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p571X9.AbstractC9112C3;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: V9.V3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8010V3 {
    /* JADX INFO: renamed from: a */
    public static final void m8322a(InterfaceC10459q interfaceC10459q, FailwhaleViewModel failwhaleViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        FailwhaleViewModel failwhaleViewModel2;
        c6021p.m6526U(-421922077);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            failwhaleViewModel2 = failwhaleViewModel;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                C10456n c10456n = C10456n.f30959Y;
                c6021p.m6524S(-1020152108);
                Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
                boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
                List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
                c6021p.m6524S(-1395507574);
                if (zBooleanValue) {
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C1660h.class));
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
                Object objMo5693b = c16527d.mo5693b(FailwhaleViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C1660h.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == C6013l.f19514a) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C1660h.class), c16527d.mo5693b(FailwhaleViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(FailwhaleViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                failwhaleViewModel2 = (FailwhaleViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i11 = i12 & (-113);
                interfaceC10459q2 = interfaceC10459q;
                failwhaleViewModel2 = failwhaleViewModel;
            }
            c6021p.m6554q();
            int i13 = (i11 & 14) | 196608;
            AbstractC8662k3.m9350a(interfaceC10459q2, null, 0L, null, false, AbstractC8411c.m8969c(-519338721, c6021p, new C1659g((C1660h) AbstractC9112C3.m9642d(failwhaleViewModel2.f40343c, c6021p).getValue(), failwhaleViewModel2)), c6021p, i13, 30);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C0257i0(interfaceC10459q2, failwhaleViewModel2, i10, 11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C19491t m8323b(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C19491t(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Application", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Application", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Application", e12);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8324c(C11534v c11534v, String key, Boolean bool) {
        AbstractC16544l.m18094g(key, "key");
        c11534v.m12927c(key, AbstractC11523k.m12908a(bool));
    }
}
