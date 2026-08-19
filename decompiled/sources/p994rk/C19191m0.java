package p994rk;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: rk.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19191m0 {

    /* JADX INFO: renamed from: a */
    public final String f60915a;

    /* JADX INFO: renamed from: b */
    public final String f60916b;

    public C19191m0(String str, String str2) {
        this.f60915a = str;
        this.f60916b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19191m0)) {
            return false;
        }
        C19191m0 c19191m0 = (C19191m0) obj;
        return AbstractC16544l.m18089b(this.f60915a, c19191m0.f60915a) && AbstractC16544l.m18089b(this.f60916b, c19191m0.f60916b);
    }

    public final int hashCode() {
        return this.f60916b.hashCode() + (this.f60915a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CountryOption(countryName=");
        sb2.append(this.f60915a);
        sb2.append(", countryCode=");
        return AbstractC9306j0.m9891j(this.f60916b, Separators.RPAREN, sb2);
    }
}
