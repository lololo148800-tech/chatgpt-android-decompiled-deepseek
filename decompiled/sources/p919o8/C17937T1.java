package p919o8;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.T1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17937T1 {

    /* JADX INFO: renamed from: a */
    public final String f57169a;

    /* JADX INFO: renamed from: b */
    public final int f57170b;

    /* JADX INFO: renamed from: c */
    public final Boolean f57171c;

    /* JADX INFO: renamed from: d */
    public final Boolean f57172d;

    /* JADX INFO: renamed from: e */
    public final Boolean f57173e;

    public C17937T1(String id2, int i10, Boolean bool, Boolean bool2, Boolean bool3) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC14376f.m15825D(i10, "type");
        this.f57169a = id2;
        this.f57170b = i10;
        this.f57171c = bool;
        this.f57172d = bool2;
        this.f57173e = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17937T1)) {
            return false;
        }
        C17937T1 c17937t1 = (C17937T1) obj;
        return AbstractC16544l.m18089b(this.f57169a, c17937t1.f57169a) && this.f57170b == c17937t1.f57170b && AbstractC16544l.m18089b(this.f57171c, c17937t1.f57171c) && AbstractC16544l.m18089b(this.f57172d, c17937t1.f57172d) && AbstractC16544l.m18089b(this.f57173e, c17937t1.f57173e);
    }

    public final int hashCode() {
        int iM13820k = AbstractC12107L1.m13820k(this.f57170b, this.f57169a.hashCode() * 31, 31);
        Boolean bool = this.f57171c;
        int iHashCode = (iM13820k + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f57172d;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f57173e;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewEventSession(id=");
        sb2.append(this.f57169a);
        sb2.append(", type=");
        int i10 = this.f57170b;
        if (i10 == 1) {
            str = "USER";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "CI_TEST";
        } else {
            str = "SYNTHETICS";
        }
        sb2.append(str);
        sb2.append(", hasReplay=");
        sb2.append(this.f57171c);
        sb2.append(", isActive=");
        sb2.append(this.f57172d);
        sb2.append(", sampledForReplay=");
        sb2.append(this.f57173e);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
