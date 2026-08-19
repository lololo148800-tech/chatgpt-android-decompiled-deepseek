package p523V9;

import af.C10561Q;
import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bg.AbstractC11405e;
import bg.C11407g;
import com.openai.feature.onboarding.LoginViewModel;
import com.openai.feature.onboarding.LoginViewModelEffectKt;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p002A0.C0148y;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p042Bf.C1281w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2062k;
import p1008s8.C19484m;
import p1008s8.C19485n;
import p1008s8.C19487p;
import p1149zc.C21837F;
import p145Ff.C2728f;
import p193Hf.C3321N;
import p196Hi.C3446p;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3984T1;
import p265Kb.AbstractC4620m;
import p265Kb.C4618k;
import p265Kb.C4619l;
import p265Kb.C4621n;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p363Og.C6207k;
import p537W0.AbstractC8411c;
import p537W0.C8409a;
import p544W9.AbstractC8662k3;
import p571X9.AbstractC9112C3;
import p623Zf.C10324t;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: V9.S3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7987S3 {
    /* JADX INFO: renamed from: a */
    public static final void m8288a(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        InterfaceC10459q interfaceC10459q2;
        InterfaceC2062k interfaceC2062k;
        c6021p.m6526U(1799361099);
        if (((i10 | 6) & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
        } else {
            interfaceC10459q2 = C10456n.f30959Y;
            c6021p.m6524S(-1020152108);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            boolean zBooleanValue = ((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue();
            List list = (List) c6021p.m6548k(AbstractC16421b.f50950a);
            c6021p.m6524S(-1395507574);
            if (zBooleanValue) {
                interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C10324t.class));
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
            Object objMo5693b = c16527d.mo5693b(LoginViewModel.class);
            Object objMo5693b2 = c16527d.mo5693b(C10324t.class);
            c6021p.m6524S(-1395498839);
            boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == C6013l.f19514a) {
                if (zBooleanValue) {
                    ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C10324t.class), c16527d.mo5693b(LoginViewModel.class), context, interfaceC2062k);
                    throw null;
                }
                if (zBooleanValue) {
                    throw new C0644w();
                }
                objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(LoginViewModel.class), null, viewModelStoreOwnerM12165a, list);
                c6021p.m6537c0(objM6514H);
            }
            BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
            c6021p.m6553p(false);
            InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
            c6021p.m6553p(false);
            LoginViewModel loginViewModel = (LoginViewModel) baseViewModel;
            C10324t c10324t = (C10324t) AbstractC9112C3.m9642d(loginViewModel.f40343c, c6021p).getValue();
            LoginViewModelEffectKt.m14322a(loginViewModel, c6021p, 0);
            if (c10324t.f30638b) {
                AbstractC8159o5.m8720a(AbstractC8411c.m8969c(40271899, c6021p, new C0148y(c10324t, loginViewModel, interfaceC10459q2, 20)), c6021p, 6);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q2, i10, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8289b(C10324t c10324t, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(-1277151536);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c6021p.m6542f(c10324t) : c6021p.m6545h(c10324t) ? 4 : 2) | i10;
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
            c6021p.m6524S(-57101112);
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = C5997d.m6430Q(Boolean.FALSE, C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC8662k3.m9350a(interfaceC10459q, AbstractC10844c.f32512c, 0L, null, false, AbstractC8411c.m8969c(-1870432236, c6021p, new C1281w(interfaceC1436k, c10324t, (InterfaceC5985X) objM6514H, 16)), c6021p, ((i11 >> 6) & 14) | 221232, 12);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8409a(c10324t, interfaceC1436k, interfaceC10459q, i10, 9);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8290c(int i10, InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, C6021p c6021p) {
        int i11;
        c6021p.m6526U(-1275020273);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(interfaceC1436k) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(interfaceC1426a) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-1083579542);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (objM6514H == obj) {
                objM6514H = C5997d.m6430Q("", C5975S.f19448r0);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC5985X interfaceC5985X = (InterfaceC5985X) objM6514H;
            c6021p.m6553p(false);
            InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(interfaceC1436k, c6021p);
            int i12 = (i11 >> 3) & 14;
            InterfaceC5985X interfaceC5985XM6435V2 = C5997d.m6435V(interfaceC1426a, c6021p);
            c6021p.m6524S(-1083573867);
            Object objM6514H2 = c6021p.m6514H();
            if (objM6514H2 == obj) {
                objM6514H2 = C5997d.m6421H(new C6207k(interfaceC5985X, 26));
                c6021p.m6537c0(objM6514H2);
            }
            InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) objM6514H2;
            c6021p.m6553p(false);
            C21837F c21837f = (C21837F) interfaceC5982V0.getValue();
            c6021p.m6524S(-1083570373);
            boolean zM6542f = c6021p.m6542f(interfaceC5985XM6435V) | c6021p.m6542f(interfaceC5985XM6435V2);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f || objM6514H3 == obj) {
                objM6514H3 = new C11407g(interfaceC5982V0, interfaceC5985XM6435V, interfaceC5985XM6435V2, null);
                c6021p.m6537c0(objM6514H3);
            }
            c6021p.m6553p(false);
            C5997d.m6450f((InterfaceC1439n) objM6514H3, c6021p, c21837f);
            AbstractC3984T1.m4682a(interfaceC1426a, AbstractC8411c.m8969c(1570763463, c6021p, new C3321N(10, interfaceC1426a)), null, null, null, AbstractC11405e.f34439c, AbstractC8411c.m8969c(496617698, c6021p, new C2728f(interfaceC5985X, 9)), null, 0L, 0L, 0L, 0L, 0.0f, null, c6021p, i12 | 1769520, 0, 16284);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C3446p(interfaceC1436k, interfaceC1426a, i10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C19487p m8291d(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("device");
            C19484m c19484mM8195c = abstractC3673pM4395w != null ? AbstractC7897H0.m8195c(abstractC3673pM4395w.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("os");
            C19485n c19485nM8261b = abstractC3673pM4395w2 != null ? AbstractC7972Q3.m8261b(abstractC3673pM4395w2.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("type");
            String strMo4384r = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
            String strMo4384r2 = c3676s.m4395w("status").mo4384r();
            String message = c3676s.m4395w("message").mo4384r();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((C4619l) c3676s.f11174Y.entrySet()).iterator();
            while (((AbstractC4620m) it).hasNext()) {
                C4621n c4621nM5364a = ((C4618k) it).m5364a();
                if (!AbstractC17678l.m19298e(c4621nM5364a.getKey(), C19487p.f61901e)) {
                    Object key = c4621nM5364a.getKey();
                    AbstractC16544l.m18093f(key, "entry.key");
                    linkedHashMap.put(key, c4621nM5364a.getValue());
                }
            }
            if (strMo4384r != null && !strMo4384r.equals("log")) {
                throw new IllegalStateException("Check failed.");
            }
            if (!AbstractC16544l.m18089b(strMo4384r2, "debug")) {
                throw new IllegalStateException("Check failed.");
            }
            AbstractC16544l.m18093f(message, "message");
            return new C19487p(c19484mM8195c, c19485nM8261b, message, linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Telemetry", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Telemetry", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Telemetry", e12);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo2475e(int i10);

    /* JADX INFO: renamed from: f */
    public abstract void mo2476f(Typeface typeface, boolean z6);
}
