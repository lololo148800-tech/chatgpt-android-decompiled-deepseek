package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C18003q1 {

    /* JADX INFO: renamed from: a */
    public final String f57482a;

    /* JADX INFO: renamed from: b */
    public final String f57483b;

    public C18003q1(String str, String str2) {
        this.f57482a = str;
        this.f57483b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18003q1)) {
            return false;
        }
        C18003q1 c18003q1 = (C18003q1) obj;
        return AbstractC16544l.m18089b(this.f57482a, c18003q1.f57482a) && AbstractC16544l.m18089b(this.f57483b, c18003q1.f57483b);
    }

    public final int hashCode() {
        String str = this.f57482a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57483b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cellular(technology=");
        sb2.append(this.f57482a);
        sb2.append(", carrierName=");
        return AbstractC9306j0.m9891j(this.f57483b, Separators.RPAREN, sb2);
    }
}
