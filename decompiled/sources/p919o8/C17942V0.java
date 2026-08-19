package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17942V0 {

    /* JADX INFO: renamed from: a */
    public final C17991m1 f57228a;

    public C17942V0(C17991m1 c17991m1) {
        this.f57228a = c17991m1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17942V0) && AbstractC16544l.m18089b(this.f57228a, ((C17942V0) obj).f57228a);
    }

    public final int hashCode() {
        C17991m1 c17991m1 = this.f57228a;
        if (c17991m1 == null) {
            return 0;
        }
        return c17991m1.hashCode();
    }

    public final String toString() {
        return "Display(viewport=" + this.f57228a + Separators.RPAREN;
    }
}
