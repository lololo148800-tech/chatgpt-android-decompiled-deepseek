package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: o8.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17972g0 {

    /* JADX INFO: renamed from: a */
    public final String f57372a;

    /* JADX INFO: renamed from: b */
    public final String f57373b;

    /* JADX INFO: renamed from: c */
    public final Boolean f57374c;

    public C17972g0(String testId, String resultId, Boolean bool) {
        AbstractC16544l.m18094g(testId, "testId");
        AbstractC16544l.m18094g(resultId, "resultId");
        this.f57372a = testId;
        this.f57373b = resultId;
        this.f57374c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17972g0)) {
            return false;
        }
        C17972g0 c17972g0 = (C17972g0) obj;
        return AbstractC16544l.m18089b(this.f57372a, c17972g0.f57372a) && AbstractC16544l.m18089b(this.f57373b, c17972g0.f57373b) && AbstractC16544l.m18089b(this.f57374c, c17972g0.f57374c);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f57372a.hashCode() * 31, 31, this.f57373b);
        Boolean bool = this.f57374c;
        return iM527p + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "Synthetics(testId=" + this.f57372a + ", resultId=" + this.f57373b + ", injected=" + this.f57374c + Separators.RPAREN;
    }
}
