package p523V9;

import io.sentry.AbstractC15152P0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import li.C16964c;
import om.C18238e;
import p027Ap.C0693a;
import p195Hh.C3430e;
import p592Y7.AbstractC9667b;
import p641a7.AbstractC10516b;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: V9.p6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8168p6 {
    /* JADX INFO: renamed from: a */
    public static final void m8748a(Set set, String key, Object evaluated, C3430e logger) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(evaluated, "evaluated");
        AbstractC16544l.m18094g(logger, "logger");
        LinkedHashMap linkedHashMap = AbstractC9667b.f29147a;
        AbstractC9667b.m10254a(AbstractC10516b.m10971a(null)).mo10264t(evaluated, key);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                ((C16964c) it.next()).getClass();
                AbstractC15152P0.m16336j("feature-flag.".concat(key), evaluated.toString());
            } catch (NullPointerException e10) {
                AbstractC8160o6.m8727b(logger, "Unable to call Statsig evaluation listener", e10, 4);
                AbstractC15152P0.m16331e().mo16250s(e10);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C3430e m8749b(String str, String str2) {
        C18238e c18238e = new C18238e();
        c18238e.put("logger.name", str);
        if (str2 != null) {
            c18238e.put("logger.category", str2);
        }
        return new C3430e(c18238e.m19755b());
    }

    /* JADX INFO: renamed from: c */
    public static String m8750c(Object obj) {
        C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
        if (c0693aM8396e.f2015Y.size() > 1) {
            return null;
        }
        Object objM19343S = AbstractC17680n.m19343S(c0693aM8396e);
        if (objM19343S instanceof String) {
            return (String) objM19343S;
        }
        return null;
    }
}
