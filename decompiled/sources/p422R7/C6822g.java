package p422R7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: R7.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6822g {

    /* JADX INFO: renamed from: a */
    public final String f21883a;

    /* JADX INFO: renamed from: b */
    public final String f21884b;

    public C6822g(String str, String str2) {
        this.f21883a = str;
        this.f21884b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6822g)) {
            return false;
        }
        C6822g c6822g = (C6822g) obj;
        return AbstractC16544l.m18089b(this.f21883a, c6822g.f21883a) && AbstractC16544l.m18089b(this.f21884b, c6822g.f21884b);
    }

    public final int hashCode() {
        String str = this.f21883a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21884b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimCarrier(id=");
        sb2.append(this.f21883a);
        sb2.append(", name=");
        return AbstractC9306j0.m9891j(this.f21884b, Separators.RPAREN, sb2);
    }
}
