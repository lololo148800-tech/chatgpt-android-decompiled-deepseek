package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p509Uk.lpqL.SfpOlmlMATQ;

/* JADX INFO: renamed from: o8.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17892E0 {

    /* JADX INFO: renamed from: a */
    public final String f57020a;

    /* JADX INFO: renamed from: b */
    public final String f57021b;

    /* JADX INFO: renamed from: c */
    public final Boolean f57022c;

    public C17892E0(String testId, String resultId, Boolean bool) {
        AbstractC16544l.m18094g(testId, "testId");
        AbstractC16544l.m18094g(resultId, "resultId");
        this.f57020a = testId;
        this.f57021b = resultId;
        this.f57022c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17892E0)) {
            return false;
        }
        C17892E0 c17892e0 = (C17892E0) obj;
        return AbstractC16544l.m18089b(this.f57020a, c17892e0.f57020a) && AbstractC16544l.m18089b(this.f57021b, c17892e0.f57021b) && AbstractC16544l.m18089b(this.f57022c, c17892e0.f57022c);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f57020a.hashCode() * 31, 31, this.f57021b);
        Boolean bool = this.f57022c;
        return iM527p + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return SfpOlmlMATQ.dJfAUOl + this.f57020a + ", resultId=" + this.f57021b + ", injected=" + this.f57022c + Separators.RPAREN;
    }
}
