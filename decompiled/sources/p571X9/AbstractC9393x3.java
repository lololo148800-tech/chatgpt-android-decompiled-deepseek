package p571X9;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import om.C18235b;
import p214Ib.AbstractC3673p;
import p214Ib.C3675r;
import p214Ib.C3676s;
import p447S7.C7028d;
import p544W9.AbstractC8712t;

/* JADX INFO: renamed from: X9.x3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9393x3 {
    /* JADX INFO: renamed from: a */
    public static C18235b m9971a(C18235b c18235b) {
        c18235b.m19748r();
        c18235b.f58105o0 = true;
        return c18235b.f58104Z > 0 ? c18235b : C18235b.f58102p0;
    }

    /* JADX INFO: renamed from: b */
    public static C18235b m9972b() {
        return new C18235b(10);
    }

    /* JADX INFO: renamed from: c */
    public static C7028d m9973c(String jsonString) {
        AbstractC16544l.m18094g(jsonString, "jsonString");
        C3676s c3676sM4390m = AbstractC8712t.m9423e(jsonString).m4390m();
        int iMo4381i = c3676sM4390m.m4395w("signal").mo4381i();
        long jMo4382p = c3676sM4390m.m4395w(DiagnosticsEntry.TIMESTAMP_KEY).mo4382p();
        AbstractC3673p abstractC3673pM4395w = c3676sM4390m.m4395w("time_since_app_start_ms");
        Long lValueOf = null;
        if (abstractC3673pM4395w != null && !(abstractC3673pM4395w instanceof C3675r)) {
            lValueOf = Long.valueOf(abstractC3673pM4395w.mo4382p());
        }
        String strMo4384r = c3676sM4390m.m4395w("signal_name").mo4384r();
        AbstractC16544l.m18093f(strMo4384r, "jsonObject.get(SIGNAL_NAME_KEY_NAME).asString");
        String strMo4384r2 = c3676sM4390m.m4395w("message").mo4384r();
        AbstractC16544l.m18093f(strMo4384r2, "jsonObject.get(MESSAGE_KEY_NAME).asString");
        String strMo4384r3 = c3676sM4390m.m4395w("stacktrace").mo4384r();
        AbstractC16544l.m18093f(strMo4384r3, "jsonObject.get(STACKTRACE_KEY_NAME).asString");
        return new C7028d(iMo4381i, jMo4382p, lValueOf, strMo4384r, strMo4384r2, strMo4384r3);
    }

    /* JADX INFO: renamed from: d */
    public static List m9974d(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC16544l.m18093f(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX INFO: renamed from: e */
    public static void m9975e(int i10, Object[] array) {
        AbstractC16544l.m18094g(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
    }
}
