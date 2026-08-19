package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17898G0 {

    /* JADX INFO: renamed from: a */
    public final Number f57055a;

    /* JADX INFO: renamed from: b */
    public final Number f57056b;

    public C17898G0(Number number, Number number2) {
        this.f57055a = number;
        this.f57056b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17898G0)) {
            return false;
        }
        C17898G0 c17898g0 = (C17898G0) obj;
        return AbstractC16544l.m18089b(this.f57055a, c17898g0.f57055a) && AbstractC16544l.m18089b(this.f57056b, c17898g0.f57056b);
    }

    public final int hashCode() {
        return this.f57056b.hashCode() + (this.f57055a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewport(width=" + this.f57055a + ", height=" + this.f57056b + Separators.RPAREN;
    }
}
