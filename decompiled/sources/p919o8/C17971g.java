package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.g */
/* JADX INFO: loaded from: classes.dex */
public final class C17971g {

    /* JADX INFO: renamed from: a */
    public final String f57370a;

    /* JADX INFO: renamed from: b */
    public final String f57371b;

    public C17971g(String str, String str2) {
        this.f57370a = str;
        this.f57371b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17971g)) {
            return false;
        }
        C17971g c17971g = (C17971g) obj;
        return AbstractC16544l.m18089b(this.f57370a, c17971g.f57370a) && AbstractC16544l.m18089b(this.f57371b, c17971g.f57371b);
    }

    public final int hashCode() {
        String str = this.f57370a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57371b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cellular(technology=");
        sb2.append(this.f57370a);
        sb2.append(", carrierName=");
        return AbstractC9306j0.m9891j(this.f57371b, Separators.RPAREN, sb2);
    }
}
