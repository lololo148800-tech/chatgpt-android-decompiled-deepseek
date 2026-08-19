package p571X9;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.chatgpt.R;
import com.openai.feature.onboarding.viewmodel.VerifyEmailCodeViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import ng.C17618i;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p027Ap.C0693a;
import p042Bf.C1281w;
import p098Di.InterfaceC2062k;
import p1113xn.AbstractC21328v;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p382Pf.C6401d;
import p523V9.AbstractC8038Z3;
import p523V9.AbstractC8106i0;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8142m4;
import p537W0.AbstractC8411c;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p882m1.AbstractC17140a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: X9.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9174N {
    /* JADX INFO: renamed from: a */
    public static final void m9729a(InterfaceC10459q interfaceC10459q, VerifyEmailCodeViewModel verifyEmailCodeViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        VerifyEmailCodeViewModel verifyEmailCodeViewModel2;
        c6021p.m6526U(508008434);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            verifyEmailCodeViewModel2 = verifyEmailCodeViewModel;
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
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C17618i.class));
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
                Object objMo5693b = c16527d.mo5693b(VerifyEmailCodeViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C17618i.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C17618i.class), c16527d.mo5693b(VerifyEmailCodeViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(VerifyEmailCodeViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                verifyEmailCodeViewModel2 = (VerifyEmailCodeViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i11 = i12 & (-113);
                interfaceC10459q2 = interfaceC10459q;
                verifyEmailCodeViewModel2 = verifyEmailCodeViewModel;
            }
            c6021p.m6554q();
            InterfaceC5985X interfaceC5985XM9642d = AbstractC9112C3.m9642d(verifyEmailCodeViewModel2.f40343c, c6021p);
            c6021p.m6524S(1316495827);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                objM6514H2 = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.arrow_left, c6021p, 0);
            boolean z6 = false;
            VerifyEmailCodeViewModel verifyEmailCodeViewModel3 = verifyEmailCodeViewModel2;
            int i14 = (i11 & 14) | 100663296;
            InterfaceC10459q interfaceC10459q3 = interfaceC10459q2;
            AbstractC8106i0.m8586a(interfaceC10459q3, AbstractC8142m4.m8676d(R.string.onboarding_check_email_code_screen_title, c6021p), null, null, null, null, abstractC17140aM8631b, null, AbstractC8411c.m8969c(1247553903, c6021p, new C1281w(verifyEmailCodeViewModel3, interfaceC5985XM9642d, z6, (InterfaceC5985X) objM6514H2, 24)), c6021p, i14, 188);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(interfaceC10459q2, verifyEmailCodeViewModel2, i10, 22);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m9730b(Object obj) {
        Double dValueOf;
        C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c0693aM8396e, 10));
        Iterator it = c0693aM8396e.f2015Y.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            while (true) {
                if (!(next instanceof Number)) {
                    if (!(next instanceof String)) {
                        if (!(next instanceof List)) {
                            dValueOf = null;
                            break;
                        }
                        next = AbstractC17680n.m19343S((List) next);
                    } else {
                        dValueOf = AbstractC21328v.m21719f((String) next);
                        break;
                    }
                } else {
                    dValueOf = Double.valueOf(((Number) next).doubleValue());
                    break;
                }
            }
            arrayList.add(dValueOf);
        }
        return arrayList;
    }
}
