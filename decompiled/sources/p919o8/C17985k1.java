package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: o8.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17985k1 {

    /* JADX INFO: renamed from: a */
    public final String f57426a;

    /* JADX INFO: renamed from: b */
    public final String f57427b;

    /* JADX INFO: renamed from: c */
    public final Boolean f57428c;

    public C17985k1(String testId, String resultId, Boolean bool) {
        AbstractC16544l.m18094g(testId, "testId");
        AbstractC16544l.m18094g(resultId, "resultId");
        this.f57426a = testId;
        this.f57427b = resultId;
        this.f57428c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17985k1)) {
            return false;
        }
        C17985k1 c17985k1 = (C17985k1) obj;
        return AbstractC16544l.m18089b(this.f57426a, c17985k1.f57426a) && AbstractC16544l.m18089b(this.f57427b, c17985k1.f57427b) && AbstractC16544l.m18089b(this.f57428c, c17985k1.f57428c);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f57426a.hashCode() * 31, 31, this.f57427b);
        Boolean bool = this.f57428c;
        return iM527p + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "Synthetics(testId=" + this.f57426a + ", resultId=" + this.f57427b + ", injected=" + this.f57428c + Separators.RPAREN;
    }
}
