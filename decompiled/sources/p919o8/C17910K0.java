package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.K0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17910K0 {

    /* JADX INFO: renamed from: a */
    public final String f57104a;

    /* JADX INFO: renamed from: b */
    public final String f57105b;

    public C17910K0(String str, String str2) {
        this.f57104a = str;
        this.f57105b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17910K0)) {
            return false;
        }
        C17910K0 c17910k0 = (C17910K0) obj;
        return AbstractC16544l.m18089b(this.f57104a, c17910k0.f57104a) && AbstractC16544l.m18089b(this.f57105b, c17910k0.f57105b);
    }

    public final int hashCode() {
        String str = this.f57104a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57105b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cellular(technology=");
        sb2.append(this.f57104a);
        sb2.append(", carrierName=");
        return AbstractC9306j0.m9891j(this.f57105b, Separators.RPAREN, sb2);
    }
}
