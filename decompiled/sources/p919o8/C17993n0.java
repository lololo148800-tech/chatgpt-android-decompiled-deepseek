package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17993n0 {

    /* JADX INFO: renamed from: a */
    public final String f57441a;

    /* JADX INFO: renamed from: b */
    public final String f57442b;

    public C17993n0(String str, String str2) {
        this.f57441a = str;
        this.f57442b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17993n0)) {
            return false;
        }
        C17993n0 c17993n0 = (C17993n0) obj;
        return AbstractC16544l.m18089b(this.f57441a, c17993n0.f57441a) && AbstractC16544l.m18089b(this.f57442b, c17993n0.f57442b);
    }

    public final int hashCode() {
        String str = this.f57441a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57442b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cellular(technology=");
        sb2.append(this.f57441a);
        sb2.append(", carrierName=");
        return AbstractC9306j0.m9891j(this.f57442b, Separators.RPAREN, sb2);
    }
}
