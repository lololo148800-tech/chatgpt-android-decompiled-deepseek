package p594Y9;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.openai.feature.oauth.impl.AipOauthViewModel;
import com.openai.feature.viewmodel.InternalViewModelEffectKt;
import com.openai.viewmodel.BaseViewModel;
import com.openai.viewmodel.LocalViewModelStateKt;
import com.openai.viewmodel.ViewModelFactoryProviderKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import p001A.AbstractC0010F;
import p003A1.AbstractC0233b1;
import p025An.C0644w;
import p039Bc.C0876j;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2062k;
import p1053v3.p1054lN.IGDwkYw;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p382Pf.C6401d;
import p406Qg.C6703N;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p577Xf.AbstractC9512k;
import p577Xf.C9509h;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17680n;
import p919o8.AbstractC17976h1;
import p919o8.C17890D1;
import p919o8.C17893E1;
import p919o8.C17896F1;
import p919o8.C17899G1;
import p919o8.C17908J1;
import p919o8.C17926P1;
import p919o8.C17940U1;
import p919o8.C17997o1;
import p919o8.C18024x1;
import p919o8.C18027y1;

/* JADX INFO: renamed from: Y9.o4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9943o4 {
    /* JADX INFO: renamed from: a */
    public static final void m10602a(InterfaceC10459q interfaceC10459q, AipOauthViewModel aipOauthViewModel, C6021p c6021p, int i10) {
        InterfaceC2062k interfaceC2062k;
        int i11;
        InterfaceC10459q interfaceC10459q2;
        AipOauthViewModel aipOauthViewModel2;
        c6021p.m6526U(-391047586);
        int i12 = i10 | 6;
        if ((i10 & 48) == 0) {
            i12 = i10 | 22;
        }
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
            interfaceC10459q2 = interfaceC10459q;
            aipOauthViewModel2 = aipOauthViewModel;
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
                    interfaceC2062k = (InterfaceC2062k) AbstractC17680n.m19343S(AbstractC17680n.m19338N((Iterable) c6021p.m6548k(LocalViewModelStateKt.f40364a), C9509h.class));
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
                Object objMo5693b = c16527d.mo5693b(AipOauthViewModel.class);
                Object objMo5693b2 = c16527d.mo5693b(C9509h.class);
                c6021p.m6524S(-1395498839);
                boolean zM6542f = c6021p.m6542f(objMo5693b) | c6021p.m6542f(objMo5693b2) | c6021p.m6542f(list) | c6021p.m6544g(zBooleanValue) | c6021p.m6542f(interfaceC2062k);
                Object objM6514H = c6021p.m6514H();
                if (zM6542f || objM6514H == obj) {
                    if (zBooleanValue) {
                        ViewModelFactoryProviderKt.m14399b(c16527d.mo5693b(C9509h.class), c16527d.mo5693b(AipOauthViewModel.class), context, interfaceC2062k);
                        throw null;
                    }
                    if (zBooleanValue) {
                        throw new C0644w();
                    }
                    objM6514H = ViewModelFactoryProviderKt.m14398a(c16527d.mo5693b(AipOauthViewModel.class), null, viewModelStoreOwnerM12165a, list);
                    c6021p.m6537c0(objM6514H);
                }
                BaseViewModel baseViewModel = (BaseViewModel) objM6514H;
                c6021p.m6553p(false);
                InternalViewModelEffectKt.m14374a(baseViewModel, c6021p, 0);
                c6021p.m6553p(false);
                i11 = i12 & (-113);
                interfaceC10459q2 = c10456n;
                aipOauthViewModel2 = (AipOauthViewModel) baseViewModel;
            } else {
                c6021p.m6517L();
                i11 = i12 & (-113);
                interfaceC10459q2 = interfaceC10459q;
                aipOauthViewModel2 = aipOauthViewModel;
            }
            c6021p.m6554q();
            C8870f c8870f = (C8870f) c6021p.m6548k(AbstractC8873i.f27157a);
            c6021p.m6524S(810955546);
            boolean zM6545h = c6021p.m6545h(c8870f);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == obj) {
                objM6514H2 = new C6703N(c8870f, 2);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            int i14 = 12779520 | ((i11 << 6) & 896);
            AbstractC8662k3.m9351b(aipOauthViewModel2, (InterfaceC1436k) objM6514H2, interfaceC10459q2, null, 0L, AbstractC8411c.m8969c(-748040386, c6021p, new C0876j(c8870f, 1)), false, AbstractC9512k.f28634b, c6021p, i14);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6401d(interfaceC10459q2, aipOauthViewModel2, i10, 8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17940U1 m10603b(C3676s c3676s) {
        ArrayList arrayList;
        String strMo4384r;
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("referrer");
            String strMo4384r2 = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            String url = c3676s.m4395w("url").mo4384r();
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w(DiagnosticsEntry.NAME_KEY);
            String strMo4384r3 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("loading_time");
            Long lValueOf = abstractC3673pM4395w3 != null ? Long.valueOf(abstractC3673pM4395w3.mo4382p()) : null;
            AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("loading_type");
            int i10 = 0;
            if (abstractC3673pM4395w4 != null && (strMo4384r = abstractC3673pM4395w4.mo4384r()) != null) {
                int[] iArrM27k = AbstractC0010F.m27k(8);
                int length = iArrM27k.length;
                while (true) {
                    if (i10 >= length) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    int i11 = iArrM27k[i10];
                    if (AbstractC17976h1.m19677l(i11).equals(strMo4384r)) {
                        i10 = i11;
                        break;
                    }
                    i10++;
                }
            }
            long jMo4382p = c3676s.m4395w("time_spent").mo4382p();
            AbstractC3673p abstractC3673pM4395w5 = c3676s.m4395w("first_contentful_paint");
            Long lValueOf2 = abstractC3673pM4395w5 != null ? Long.valueOf(abstractC3673pM4395w5.mo4382p()) : null;
            AbstractC3673p abstractC3673pM4395w6 = c3676s.m4395w("largest_contentful_paint");
            Long lValueOf3 = abstractC3673pM4395w6 != null ? Long.valueOf(abstractC3673pM4395w6.mo4382p()) : null;
            AbstractC3673p abstractC3673pM4395w7 = c3676s.m4395w("largest_contentful_paint_target_selector");
            String strMo4384r4 = abstractC3673pM4395w7 != null ? abstractC3673pM4395w7.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w8 = c3676s.m4395w("first_input_delay");
            Long lValueOf4 = abstractC3673pM4395w8 != null ? Long.valueOf(abstractC3673pM4395w8.mo4382p()) : null;
            AbstractC3673p abstractC3673pM4395w9 = c3676s.m4395w("first_input_time");
            Long lValueOf5 = abstractC3673pM4395w9 != null ? Long.valueOf(abstractC3673pM4395w9.mo4382p()) : null;
            AbstractC3673p abstractC3673pM4395w10 = c3676s.m4395w("first_input_target_selector");
            String strMo4384r5 = abstractC3673pM4395w10 != null ? abstractC3673pM4395w10.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w11 = c3676s.m4395w("interaction_to_next_paint");
            Long lValueOf6 = abstractC3673pM4395w11 != null ? Long.valueOf(abstractC3673pM4395w11.mo4382p()) : null;
            AbstractC3673p abstractC3673pM4395w12 = c3676s.m4395w("interaction_to_next_paint_target_selector");
            String strMo4384r6 = abstractC3673pM4395w12 != null ? abstractC3673pM4395w12.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w13 = c3676s.m4395w("cumulative_layout_shift");
            Number numberMo4383q = abstractC3673pM4395w13 != null ? abstractC3673pM4395w13.mo4383q() : null;
            AbstractC3673p abstractC3673pM4395w14 = c3676s.m4395w("cumulative_layout_shift_target_selector");
            String strMo4384r7 = abstractC3673pM4395w14 != null ? abstractC3673pM4395w14.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w15 = c3676s.m4395w("dom_complete");
            Long lValueOf7 = abstractC3673pM4395w15 != null ? Long.valueOf(abstractC3673pM4395w15.mo4382p()) : null;
            AbstractC3673p abstractC3673pM4395w16 = c3676s.m4395w("dom_content_loaded");
            Long lValueOf8 = abstractC3673pM4395w16 != null ? Long.valueOf(abstractC3673pM4395w16.mo4382p()) : null;
            AbstractC3673p abstractC3673pM4395w17 = c3676s.m4395w("dom_interactive");
            Long lValueOf9 = abstractC3673pM4395w17 != null ? Long.valueOf(abstractC3673pM4395w17.mo4382p()) : null;
            AbstractC3673p abstractC3673pM4395w18 = c3676s.m4395w("load_event");
            Long lValueOf10 = abstractC3673pM4395w18 != null ? Long.valueOf(abstractC3673pM4395w18.mo4382p()) : null;
            AbstractC3673p abstractC3673pM4395w19 = c3676s.m4395w("first_byte");
            Long lValueOf11 = abstractC3673pM4395w19 != null ? Long.valueOf(abstractC3673pM4395w19.mo4382p()) : null;
            AbstractC3673p abstractC3673pM4395w20 = c3676s.m4395w("custom_timings");
            C18027y1 c18027y1M10402b = abstractC3673pM4395w20 != null ? AbstractC9787P3.m10402b(abstractC3673pM4395w20.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w21 = c3676s.m4395w("is_active");
            Boolean boolValueOf = abstractC3673pM4395w21 != null ? Boolean.valueOf(abstractC3673pM4395w21.mo4380f()) : null;
            AbstractC3673p abstractC3673pM4395w22 = c3676s.m4395w("is_slow_rendered");
            Boolean boolValueOf2 = abstractC3673pM4395w22 != null ? Boolean.valueOf(abstractC3673pM4395w22.mo4380f()) : null;
            C17997o1 c17997o1M10312b = AbstractC9721E3.m10312b(c3676s.m4395w("action").m4390m());
            C17890D1 c17890d1M10450a = AbstractC9816U3.m10450a(c3676s.m4395w("error").m4390m());
            AbstractC3673p abstractC3673pM4395w23 = c3676s.m4395w("crash");
            C18024x1 c18024x1M10396d = abstractC3673pM4395w23 != null ? AbstractC9781O3.m10396d(abstractC3673pM4395w23.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w24 = c3676s.m4395w("long_task");
            C17908J1 c17908j1M10494a = abstractC3673pM4395w24 != null ? AbstractC9846Z3.m10494a(abstractC3673pM4395w24.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w25 = c3676s.m4395w("frozen_frame");
            C17896F1 c17896f1M10470a = abstractC3673pM4395w25 != null ? AbstractC9828W3.m10470a(abstractC3673pM4395w25.m4390m()) : null;
            C17926P1 c17926p1M10534a = AbstractC9881e4.m10534a(c3676s.m4395w("resource").m4390m());
            AbstractC3673p abstractC3673pM4395w26 = c3676s.m4395w("frustration");
            C17899G1 c17899g1M10478a = abstractC3673pM4395w26 != null ? AbstractC9834X3.m10478a(abstractC3673pM4395w26.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w27 = c3676s.m4395w("in_foreground_periods");
            if (abstractC3673pM4395w27 != null) {
                ArrayList arrayList2 = abstractC3673pM4395w27.m4389j().f11172Y;
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(AbstractC9840Y3.m10487a(((AbstractC3673p) it.next()).m4390m()));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            AbstractC3673p abstractC3673pM4395w28 = c3676s.m4395w("memory_average");
            Number numberMo4383q2 = abstractC3673pM4395w28 != null ? abstractC3673pM4395w28.mo4383q() : null;
            AbstractC3673p abstractC3673pM4395w29 = c3676s.m4395w("memory_max");
            Number numberMo4383q3 = abstractC3673pM4395w29 != null ? abstractC3673pM4395w29.mo4383q() : null;
            AbstractC3673p abstractC3673pM4395w30 = c3676s.m4395w("cpu_ticks_count");
            Number numberMo4383q4 = abstractC3673pM4395w30 != null ? abstractC3673pM4395w30.mo4383q() : null;
            AbstractC3673p abstractC3673pM4395w31 = c3676s.m4395w("cpu_ticks_per_second");
            Number numberMo4383q5 = abstractC3673pM4395w31 != null ? abstractC3673pM4395w31.mo4383q() : null;
            AbstractC3673p abstractC3673pM4395w32 = c3676s.m4395w("refresh_rate_average");
            Number numberMo4383q6 = abstractC3673pM4395w32 != null ? abstractC3673pM4395w32.mo4383q() : null;
            AbstractC3673p abstractC3673pM4395w33 = c3676s.m4395w("refresh_rate_min");
            Number numberMo4383q7 = abstractC3673pM4395w33 != null ? abstractC3673pM4395w33.mo4383q() : null;
            AbstractC3673p abstractC3673pM4395w34 = c3676s.m4395w("flutter_build_time");
            C17893E1 c17893e1M10464a = abstractC3673pM4395w34 != null ? AbstractC9822V3.m10464a(abstractC3673pM4395w34.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w35 = c3676s.m4395w(IGDwkYw.osGJPYy);
            C17893E1 c17893e1M10464a2 = abstractC3673pM4395w35 != null ? AbstractC9822V3.m10464a(abstractC3673pM4395w35.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w36 = c3676s.m4395w("js_refresh_rate");
            C17893E1 c17893e1M10464a3 = abstractC3673pM4395w36 != null ? AbstractC9822V3.m10464a(abstractC3673pM4395w36.m4390m()) : null;
            AbstractC16544l.m18093f(id2, "id");
            AbstractC16544l.m18093f(url, "url");
            return new C17940U1(id2, strMo4384r2, url, strMo4384r3, lValueOf, i10, jMo4382p, lValueOf2, lValueOf3, strMo4384r4, lValueOf4, lValueOf5, strMo4384r5, lValueOf6, strMo4384r6, numberMo4383q, strMo4384r7, lValueOf7, lValueOf8, lValueOf9, lValueOf10, lValueOf11, c18027y1M10402b, boolValueOf, boolValueOf2, c17997o1M10312b, c17890d1M10450a, c18024x1M10396d, c17908j1M10494a, c17896f1M10470a, c17926p1M10534a, c17899g1M10478a, arrayList, numberMo4383q2, numberMo4383q3, numberMo4383q4, numberMo4383q5, numberMo4383q6, numberMo4383q7, c17893e1M10464a, c17893e1M10464a2, c17893e1M10464a3);
        } catch (IllegalStateException e10) {
            throw new C3677t(e10);
        } catch (NullPointerException e11) {
            throw new C3677t(e11);
        } catch (NumberFormatException e12) {
            throw new C3677t(e12);
        }
    }
}
