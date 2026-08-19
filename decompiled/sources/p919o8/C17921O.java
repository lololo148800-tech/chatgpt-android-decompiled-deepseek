package p919o8;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.O */
/* JADX INFO: loaded from: classes.dex */
public final class C17921O {

    /* JADX INFO: renamed from: a */
    public final int f57125a;

    /* JADX INFO: renamed from: b */
    public final List f57126b;

    /* JADX INFO: renamed from: c */
    public final int f57127c;

    /* JADX INFO: renamed from: d */
    public final C17912L f57128d;

    public C17921O(int i10, List list, int i11, C17912L c17912l) {
        AbstractC14376f.m15825D(i10, "status");
        this.f57125a = i10;
        this.f57126b = list;
        this.f57127c = i11;
        this.f57128d = c17912l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17921O)) {
            return false;
        }
        C17921O c17921o = (C17921O) obj;
        return this.f57125a == c17921o.f57125a && AbstractC16544l.m18089b(this.f57126b, c17921o.f57126b) && this.f57127c == c17921o.f57127c && AbstractC16544l.m18089b(this.f57128d, c17921o.f57128d);
    }

    public final int hashCode() {
        int iM24h = AbstractC0010F.m24h(this.f57125a) * 31;
        List list = this.f57126b;
        int iHashCode = (iM24h + (list == null ? 0 : list.hashCode())) * 31;
        int i10 = this.f57127c;
        int iM24h2 = (iHashCode + (i10 == 0 ? 0 : AbstractC0010F.m24h(i10))) * 31;
        C17912L c17912l = this.f57128d;
        return iM24h2 + (c17912l != null ? c17912l.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Connectivity(status=");
        sb2.append(AbstractC17962d.m19621L(this.f57125a));
        sb2.append(", interfaces=");
        sb2.append(this.f57126b);
        sb2.append(", effectiveType=");
        int i10 = this.f57127c;
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
        sb2.append(this.f57128d);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
