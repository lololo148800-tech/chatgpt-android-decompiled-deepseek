package p919o8;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17922O0 {

    /* JADX INFO: renamed from: a */
    public final int f57129a;

    /* JADX INFO: renamed from: b */
    public final List f57130b;

    /* JADX INFO: renamed from: c */
    public final int f57131c;

    /* JADX INFO: renamed from: d */
    public final C17910K0 f57132d;

    public C17922O0(int i10, List list, int i11, C17910K0 c17910k0) {
        AbstractC14376f.m15825D(i10, "status");
        this.f57129a = i10;
        this.f57130b = list;
        this.f57131c = i11;
        this.f57132d = c17910k0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17922O0)) {
            return false;
        }
        C17922O0 c17922o0 = (C17922O0) obj;
        return this.f57129a == c17922o0.f57129a && AbstractC16544l.m18089b(this.f57130b, c17922o0.f57130b) && this.f57131c == c17922o0.f57131c && AbstractC16544l.m18089b(this.f57132d, c17922o0.f57132d);
    }

    public final int hashCode() {
        int iM24h = AbstractC0010F.m24h(this.f57129a) * 31;
        List list = this.f57130b;
        int iHashCode = (iM24h + (list == null ? 0 : list.hashCode())) * 31;
        int i10 = this.f57131c;
        int iM24h2 = (iHashCode + (i10 == 0 ? 0 : AbstractC0010F.m24h(i10))) * 31;
        C17910K0 c17910k0 = this.f57132d;
        return iM24h2 + (c17910k0 != null ? c17910k0.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Connectivity(status=");
        int i10 = this.f57129a;
        if (i10 == 1) {
            str = "CONNECTED";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "MAYBE";
        } else {
            str = "NOT_CONNECTED";
        }
        sb2.append(str);
        sb2.append(", interfaces=");
        sb2.append(this.f57130b);
        sb2.append(", effectiveType=");
        sb2.append(AbstractC17962d.m19629T(this.f57131c));
        sb2.append(", cellular=");
        sb2.append(this.f57132d);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
