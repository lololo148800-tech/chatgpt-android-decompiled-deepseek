package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: o8.C */
/* JADX INFO: loaded from: classes.dex */
public final class C17885C {

    /* JADX INFO: renamed from: a */
    public final String f57000a;

    /* JADX INFO: renamed from: b */
    public final String f57001b;

    /* JADX INFO: renamed from: c */
    public final Boolean f57002c;

    public C17885C(String testId, String resultId, Boolean bool) {
        AbstractC16544l.m18094g(testId, "testId");
        AbstractC16544l.m18094g(resultId, "resultId");
        this.f57000a = testId;
        this.f57001b = resultId;
        this.f57002c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17885C)) {
            return false;
        }
        C17885C c17885c = (C17885C) obj;
        return AbstractC16544l.m18089b(this.f57000a, c17885c.f57000a) && AbstractC16544l.m18089b(this.f57001b, c17885c.f57001b) && AbstractC16544l.m18089b(this.f57002c, c17885c.f57002c);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f57000a.hashCode() * 31, 31, this.f57001b);
        Boolean bool = this.f57002c;
        return iM527p + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "Synthetics(testId=" + this.f57000a + ", resultId=" + this.f57001b + ", injected=" + this.f57002c + Separators.RPAREN;
    }
}
