package p919o8;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18002q0 {

    /* JADX INFO: renamed from: a */
    public final int f57478a;

    /* JADX INFO: renamed from: b */
    public final List f57479b;

    /* JADX INFO: renamed from: c */
    public final int f57480c;

    /* JADX INFO: renamed from: d */
    public final C17993n0 f57481d;

    public C18002q0(int i10, List list, int i11, C17993n0 c17993n0) {
        AbstractC14376f.m15825D(i10, "status");
        this.f57478a = i10;
        this.f57479b = list;
        this.f57480c = i11;
        this.f57481d = c17993n0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18002q0)) {
            return false;
        }
        C18002q0 c18002q0 = (C18002q0) obj;
        return this.f57478a == c18002q0.f57478a && AbstractC16544l.m18089b(this.f57479b, c18002q0.f57479b) && this.f57480c == c18002q0.f57480c && AbstractC16544l.m18089b(this.f57481d, c18002q0.f57481d);
    }

    public final int hashCode() {
        int iM24h = AbstractC0010F.m24h(this.f57478a) * 31;
        List list = this.f57479b;
        int iHashCode = (iM24h + (list == null ? 0 : list.hashCode())) * 31;
        int i10 = this.f57480c;
        int iM24h2 = (iHashCode + (i10 == 0 ? 0 : AbstractC0010F.m24h(i10))) * 31;
        C17993n0 c17993n0 = this.f57481d;
        return iM24h2 + (c17993n0 != null ? c17993n0.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Connectivity(status=");
        sb2.append(AbstractC17962d.m19627R(this.f57478a));
        sb2.append(", interfaces=");
        sb2.append(this.f57479b);
        sb2.append(", effectiveType=");
        int i10 = this.f57480c;
        if (i10 == 1) {
            str = "SLOW_2G";
        } else if (i10 == 2) {
            str = "2G";
        } else if (i10 != 3) {
            str = i10 != 4 ? "null" : "4G";
        } else {
            str = "3G";
        }
        sb2.append(str);
        sb2.append(", cellular=");
        sb2.append(this.f57481d);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
