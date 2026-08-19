package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17991m1 {

    /* JADX INFO: renamed from: a */
    public final Number f57438a;

    /* JADX INFO: renamed from: b */
    public final Number f57439b;

    public C17991m1(Number number, Number number2) {
        this.f57438a = number;
        this.f57439b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17991m1)) {
            return false;
        }
        C17991m1 c17991m1 = (C17991m1) obj;
        return AbstractC16544l.m18089b(this.f57438a, c17991m1.f57438a) && AbstractC16544l.m18089b(this.f57439b, c17991m1.f57439b);
    }

    public final int hashCode() {
        return this.f57439b.hashCode() + (this.f57438a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewport(width=" + this.f57438a + ", height=" + this.f57439b + Separators.RPAREN;
    }
}
