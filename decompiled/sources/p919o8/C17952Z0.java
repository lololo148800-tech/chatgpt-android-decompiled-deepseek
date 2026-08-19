package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p571X9.AbstractC9306j0;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.Z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17952Z0 {

    /* JADX INFO: renamed from: a */
    public final int f57285a;

    /* JADX INFO: renamed from: b */
    public final String f57286b;

    /* JADX INFO: renamed from: c */
    public final String f57287c;

    /* JADX INFO: renamed from: d */
    public final String f57288d;

    public C17952Z0(int i10, String str, String str2, String str3) {
        AbstractC14376f.m15825D(i10, "operationType");
        this.f57285a = i10;
        this.f57286b = str;
        this.f57287c = str2;
        this.f57288d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17952Z0)) {
            return false;
        }
        C17952Z0 c17952z0 = (C17952Z0) obj;
        return this.f57285a == c17952z0.f57285a && AbstractC16544l.m18089b(this.f57286b, c17952z0.f57286b) && AbstractC16544l.m18089b(this.f57287c, c17952z0.f57287c) && AbstractC16544l.m18089b(this.f57288d, c17952z0.f57288d);
    }

    public final int hashCode() {
        int iM24h = AbstractC0010F.m24h(this.f57285a) * 31;
        String str = this.f57286b;
        int iHashCode = (iM24h + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57287c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57288d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Graphql(operationType=");
        sb2.append(AbstractC17962d.m19631V(this.f57285a));
        sb2.append(", operationName=");
        sb2.append(this.f57286b);
        sb2.append(", payload=");
        sb2.append(this.f57287c);
        sb2.append(", variables=");
        return AbstractC9306j0.m9891j(this.f57288d, Separators.RPAREN, sb2);
    }
}
