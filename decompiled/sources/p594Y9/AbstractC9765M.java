package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.AbstractC16544l;
import p033B5.InterfaceC0829m;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p374P5.C6350c;
import p374P5.C6352e;
import p374P5.C6354g;
import p374P5.C6360m;
import p919o8.C17951Z;

/* JADX INFO: renamed from: Y9.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9765M {
    /* JADX INFO: renamed from: a */
    public static final C6350c m10368a(C6354g c6354g, Throwable th2) {
        InterfaceC0829m interfaceC0829m;
        if (th2 instanceof C6360m) {
            interfaceC0829m = (InterfaceC0829m) c6354g.f20675o.invoke(c6354g);
            C6352e c6352e = c6354g.f20681u;
            if (interfaceC0829m == null) {
                interfaceC0829m = (InterfaceC0829m) c6352e.f20647j.invoke(c6354g);
            }
            if (interfaceC0829m == null && (interfaceC0829m = (InterfaceC0829m) c6354g.f20674n.invoke(c6354g)) == null) {
                interfaceC0829m = (InterfaceC0829m) c6352e.f20646i.invoke(c6354g);
            }
        } else {
            interfaceC0829m = (InterfaceC0829m) c6354g.f20674n.invoke(c6354g);
            if (interfaceC0829m == null) {
                interfaceC0829m = (InterfaceC0829m) c6354g.f20681u.f20646i.invoke(c6354g);
            }
        }
        return new C6350c(interfaceC0829m, c6354g, th2);
    }

    /* JADX INFO: renamed from: b */
    public static C17951Z m10369b(C3676s c3676s) {
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
            return new C17951Z(boolValueOf, id2, strMo4384r, url, strMo4384r2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ErrorEventView", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ErrorEventView", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ErrorEventView", e12);
        }
    }
}
