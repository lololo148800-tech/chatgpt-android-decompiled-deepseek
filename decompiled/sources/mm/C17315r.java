package mm;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mm.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C17315r implements Serializable {

    /* JADX INFO: renamed from: Y */
    public final Object f55146Y;

    /* JADX INFO: renamed from: Z */
    public final Object f55147Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f55148o0;

    public C17315r(Object obj, Object obj2, Object obj3) {
        this.f55146Y = obj;
        this.f55147Z = obj2;
        this.f55148o0 = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17315r)) {
            return false;
        }
        C17315r c17315r = (C17315r) obj;
        return AbstractC16544l.m18089b(this.f55146Y, c17315r.f55146Y) && AbstractC16544l.m18089b(this.f55147Z, c17315r.f55147Z) && AbstractC16544l.m18089b(this.f55148o0, c17315r.f55148o0);
    }

    public final int hashCode() {
        Object obj = this.f55146Y;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f55147Z;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f55148o0;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return Separators.LPAREN + this.f55146Y + ", " + this.f55147Z + ", " + this.f55148o0 + ')';
    }
}
