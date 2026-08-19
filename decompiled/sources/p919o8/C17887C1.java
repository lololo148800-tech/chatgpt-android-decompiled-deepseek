package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.C1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17887C1 {

    /* JADX INFO: renamed from: a */
    public final C17943V1 f57007a;

    /* JADX INFO: renamed from: b */
    public final C17929Q1 f57008b;

    public C17887C1(C17943V1 c17943v1, C17929Q1 c17929q1) {
        this.f57007a = c17943v1;
        this.f57008b = c17929q1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17887C1)) {
            return false;
        }
        C17887C1 c17887c1 = (C17887C1) obj;
        return AbstractC16544l.m18089b(this.f57007a, c17887c1.f57007a) && AbstractC16544l.m18089b(this.f57008b, c17887c1.f57008b);
    }

    public final int hashCode() {
        C17943V1 c17943v1 = this.f57007a;
        int iHashCode = (c17943v1 == null ? 0 : c17943v1.hashCode()) * 31;
        C17929Q1 c17929q1 = this.f57008b;
        return iHashCode + (c17929q1 != null ? c17929q1.hashCode() : 0);
    }

    public final String toString() {
        return "Display(viewport=" + this.f57007a + ", scroll=" + this.f57008b + Separators.RPAREN;
    }
}
