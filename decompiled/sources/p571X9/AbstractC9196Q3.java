package p571X9;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.InterfaceC11110s;
import androidx.lifecycle.InterfaceC11112u;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p474T8.C7268f;
import p474T8.C7270h;
import p474T8.C7271i;
import p474T8.C7273k;
import p474T8.C7274l;
import p474T8.C7275m;
import p474T8.InterfaceC7272j;
import p914o3.AbstractC17814e;
import p919o8.C17965e;

/* JADX INFO: renamed from: X9.Q3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9196Q3 {
    /* JADX INFO: renamed from: a */
    public static final void m9759a(C7268f permissionState, EnumC11103l enumC11103l, C6021p c6021p, int i10) {
        int i11;
        AbstractC16544l.m18094g(permissionState, "permissionState");
        c6021p.m6526U(-1770945943);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(permissionState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            enumC11103l = EnumC11103l.ON_RESUME;
            c6021p.m6524S(-2101357749);
            boolean z6 = (i12 & 14) == 4;
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (z6 || objM6514H == obj) {
                objM6514H = new C7273k(enumC11103l, 0, permissionState);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC11110s interfaceC11110s = (InterfaceC11110s) objM6514H;
            c6021p.m6553p(false);
            AbstractC11105n abstractC11105nMo7809i = ((InterfaceC11112u) c6021p.m6548k(AbstractC17814e.f56807a)).mo7809i();
            c6021p.m6524S(-2101338711);
            boolean zM6545h = c6021p.m6545h(abstractC11105nMo7809i) | c6021p.m6545h(interfaceC11110s);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == obj) {
                objM6514H2 = new C7274l(abstractC11105nMo7809i, interfaceC11110s, 0);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6446d(abstractC11105nMo7809i, interfaceC11110s, (InterfaceC1436k) objM6514H2, c6021p);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C7275m(permissionState, enumC11103l, i10, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9760b(List list, EnumC11103l enumC11103l, C6021p c6021p, int i10) {
        int i11;
        c6021p.m6526U(1533427666);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6545h(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (((i11 | 48) & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            enumC11103l = EnumC11103l.ON_RESUME;
            c6021p.m6524S(-67706430);
            boolean zM6542f = c6021p.m6542f(list);
            Object objM6514H = c6021p.m6514H();
            Object obj = C6013l.f19514a;
            if (zM6542f || objM6514H == obj) {
                objM6514H = new C7273k(enumC11103l, 1, list);
                c6021p.m6537c0(objM6514H);
            }
            InterfaceC11110s interfaceC11110s = (InterfaceC11110s) objM6514H;
            c6021p.m6553p(false);
            AbstractC11105n abstractC11105nMo7809i = ((InterfaceC11112u) c6021p.m6548k(AbstractC17814e.f56807a)).mo7809i();
            c6021p.m6524S(-67685064);
            boolean zM6545h = c6021p.m6545h(abstractC11105nMo7809i) | c6021p.m6545h(interfaceC11110s);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h || objM6514H2 == obj) {
                objM6514H2 = new C7274l(abstractC11105nMo7809i, interfaceC11110s, 1);
                c6021p.m6537c0(objM6514H2);
            }
            c6021p.m6553p(false);
            C5997d.m6446d(abstractC11105nMo7809i, interfaceC11110s, (InterfaceC1436k) objM6514H2, c6021p);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C7275m(list, enumC11103l, i10, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Activity m9761c(Context context) {
        AbstractC16544l.m18094g(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        throw new IllegalStateException("Permissions should be called in the context of an Activity");
    }

    /* JADX INFO: renamed from: d */
    public static C17965e m9762d(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("referrer");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            String url = c3676s.m4395w("url").mo4384r();
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w(DiagnosticsEntry.NAME_KEY);
            String strMo4384r2 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("in_foreground");
            Boolean boolValueOf = abstractC3673pM4395w3 != null ? Boolean.valueOf(abstractC3673pM4395w3.mo4380f()) : null;
            AbstractC16544l.m18093f(id2, "id");
            AbstractC16544l.m18093f(url, "url");
            return new C17965e(boolValueOf, id2, strMo4384r, url, strMo4384r2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ActionEventView", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ActionEventView", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ActionEventView", e12);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m9763e(InterfaceC7272j interfaceC7272j) {
        AbstractC16544l.m18094g(interfaceC7272j, "<this>");
        if (interfaceC7272j.equals(C7271i.f23054a)) {
            return false;
        }
        if (interfaceC7272j instanceof C7270h) {
            return ((C7270h) interfaceC7272j).f23053a;
        }
        throw new C0644w();
    }
}
