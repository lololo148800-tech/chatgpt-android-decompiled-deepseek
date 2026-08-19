package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: o8.R1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17931R1 {

    /* JADX INFO: renamed from: a */
    public final String f57148a;

    /* JADX INFO: renamed from: b */
    public final String f57149b;

    /* JADX INFO: renamed from: c */
    public final Boolean f57150c;

    public C17931R1(String testId, String resultId, Boolean bool) {
        AbstractC16544l.m18094g(testId, "testId");
        AbstractC16544l.m18094g(resultId, "resultId");
        this.f57148a = testId;
        this.f57149b = resultId;
        this.f57150c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17931R1)) {
            return false;
        }
        C17931R1 c17931r1 = (C17931R1) obj;
        return AbstractC16544l.m18089b(this.f57148a, c17931r1.f57148a) && AbstractC16544l.m18089b(this.f57149b, c17931r1.f57149b) && AbstractC16544l.m18089b(this.f57150c, c17931r1.f57150c);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f57148a.hashCode() * 31, 31, this.f57149b);
        Boolean bool = this.f57150c;
        return iM527p + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "Synthetics(testId=" + this.f57148a + ", resultId=" + this.f57149b + ", injected=" + this.f57150c + Separators.RPAREN;
    }
}
