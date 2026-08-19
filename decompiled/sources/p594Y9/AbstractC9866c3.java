package p594Y9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p1113xn.AbstractC21322p;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p919o8.C17916M0;
import p919o8.C17933S0;
import p919o8.C17936T0;

/* JADX INFO: renamed from: Y9.c3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9866c3 {
    /* JADX INFO: renamed from: a */
    public static C17933S0 m10519a(C3676s c3676s) {
        try {
            long jMo4382p = c3676s.m4395w("format_version").mo4382p();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(ParameterNames.SESSION);
            C17936T0 c17936t0M10528b = abstractC3673pM4395w != null ? AbstractC9873d3.m10528b(abstractC3673pM4395w.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("configuration");
            C17916M0 c17916m0M10469b = abstractC3673pM4395w2 != null ? AbstractC9827W2.m10469b(abstractC3673pM4395w2.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("browser_sdk_version");
            String strMo4384r = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("span_id");
            String strMo4384r2 = abstractC3673pM4395w4 != null ? abstractC3673pM4395w4.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w5 = c3676s.m4395w("trace_id");
            String strMo4384r3 = abstractC3673pM4395w5 != null ? abstractC3673pM4395w5.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w6 = c3676s.m4395w("rule_psr");
            Number numberMo4383q = abstractC3673pM4395w6 != null ? abstractC3673pM4395w6.mo4383q() : null;
            AbstractC3673p abstractC3673pM4395w7 = c3676s.m4395w("discarded");
            Boolean boolValueOf = abstractC3673pM4395w7 != null ? Boolean.valueOf(abstractC3673pM4395w7.mo4380f()) : null;
            if (jMo4382p == 2) {
                return new C17933S0(c17936t0M10528b, c17916m0M10469b, strMo4384r, strMo4384r2, strMo4384r3, numberMo4383q, boolValueOf);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Dd", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Dd", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Dd", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final List m10520b(String str) {
        if (str == null || str.length() == 0) {
            return C17689w.f56480Y;
        }
        List listM21697e0 = AbstractC21322p.m21697e0(str, new String[]{Separators.COMMA}, 0, 6);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM21697e0, 10));
        Iterator it = listM21697e0.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC21322p.m21711s0((String) it.next()).toString());
        }
        return arrayList;
    }
}
