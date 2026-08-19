package p919o8;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C18012t1 {

    /* JADX INFO: renamed from: a */
    public final int f57500a;

    /* JADX INFO: renamed from: b */
    public final List f57501b;

    /* JADX INFO: renamed from: c */
    public final int f57502c;

    /* JADX INFO: renamed from: d */
    public final C18003q1 f57503d;

    public C18012t1(int i10, List list, int i11, C18003q1 c18003q1) {
        AbstractC14376f.m15825D(i10, "status");
        this.f57500a = i10;
        this.f57501b = list;
        this.f57502c = i11;
        this.f57503d = c18003q1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18012t1)) {
            return false;
        }
        C18012t1 c18012t1 = (C18012t1) obj;
        return this.f57500a == c18012t1.f57500a && AbstractC16544l.m18089b(this.f57501b, c18012t1.f57501b) && this.f57502c == c18012t1.f57502c && AbstractC16544l.m18089b(this.f57503d, c18012t1.f57503d);
    }

    public final int hashCode() {
        int iM24h = AbstractC0010F.m24h(this.f57500a) * 31;
        List list = this.f57501b;
        int iHashCode = (iM24h + (list == null ? 0 : list.hashCode())) * 31;
        int i10 = this.f57502c;
        int iM24h2 = (iHashCode + (i10 == 0 ? 0 : AbstractC0010F.m24h(i10))) * 31;
        C18003q1 c18003q1 = this.f57503d;
        return iM24h2 + (c18003q1 != null ? c18003q1.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Connectivity(status=");
        int i10 = this.f57500a;
        if (i10 == 1) {
            str = "CONNECTED";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "MAYBE";
        } else {
            str = "NOT_CONNECTED";
        }
        sb2.append(str);
        sb2.append(", interfaces=");
        sb2.append(this.f57501b);
        sb2.append(", effectiveType=");
        int i11 = this.f57502c;
        if (i11 == 1) {
            str2 = "SLOW_2G";
        } else if (i11 == 2) {
            str2 = "2G";
        } else if (i11 != 3) {
            str2 = i11 != 4 ? "null" : "4G";
        } else {
            str2 = "3G";
        }
        sb2.append(str2);
        sb2.append(", cellular=");
        sb2.append(this.f57503d);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
