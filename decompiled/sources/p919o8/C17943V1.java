package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.V1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17943V1 {

    /* JADX INFO: renamed from: a */
    public final Number f57229a;

    /* JADX INFO: renamed from: b */
    public final Number f57230b;

    public C17943V1(Number number, Number number2) {
        this.f57229a = number;
        this.f57230b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17943V1)) {
            return false;
        }
        C17943V1 c17943v1 = (C17943V1) obj;
        return AbstractC16544l.m18089b(this.f57229a, c17943v1.f57229a) && AbstractC16544l.m18089b(this.f57230b, c17943v1.f57230b);
    }

    public final int hashCode() {
        return this.f57230b.hashCode() + (this.f57229a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewport(width=" + this.f57229a + ", height=" + this.f57230b + Separators.RPAREN;
    }
}
