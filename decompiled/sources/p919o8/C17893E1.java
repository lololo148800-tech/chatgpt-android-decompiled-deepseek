package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p214Ib.C3676s;

/* JADX INFO: renamed from: o8.E1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17893E1 {

    /* JADX INFO: renamed from: a */
    public final Number f57023a;

    /* JADX INFO: renamed from: b */
    public final Number f57024b;

    /* JADX INFO: renamed from: c */
    public final Number f57025c;

    /* JADX INFO: renamed from: d */
    public final Number f57026d;

    public C17893E1(Number number, Number number2, Number number3, Number number4) {
        this.f57023a = number;
        this.f57024b = number2;
        this.f57025c = number3;
        this.f57026d = number4;
    }

    /* JADX INFO: renamed from: a */
    public final C3676s m19606a() {
        C3676s c3676s = new C3676s();
        c3676s.m4393u(this.f57023a, "min");
        c3676s.m4393u(this.f57024b, "max");
        c3676s.m4393u(this.f57025c, "average");
        Number number = this.f57026d;
        if (number != null) {
            c3676s.m4393u(number, "metric_max");
        }
        return c3676s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17893E1)) {
            return false;
        }
        C17893E1 c17893e1 = (C17893E1) obj;
        return AbstractC16544l.m18089b(this.f57023a, c17893e1.f57023a) && AbstractC16544l.m18089b(this.f57024b, c17893e1.f57024b) && AbstractC16544l.m18089b(this.f57025c, c17893e1.f57025c) && AbstractC16544l.m18089b(this.f57026d, c17893e1.f57026d);
    }

    public final int hashCode() {
        int iHashCode = (this.f57025c.hashCode() + ((this.f57024b.hashCode() + (this.f57023a.hashCode() * 31)) * 31)) * 31;
        Number number = this.f57026d;
        return iHashCode + (number == null ? 0 : number.hashCode());
    }

    public final String toString() {
        return "FlutterBuildTime(min=" + this.f57023a + ", max=" + this.f57024b + ", average=" + this.f57025c + ", metricMax=" + this.f57026d + Separators.RPAREN;
    }
}
