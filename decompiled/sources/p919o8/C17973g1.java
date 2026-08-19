package p919o8;

import android.gov.nist.core.Separators;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17973g1 {

    /* JADX INFO: renamed from: a */
    public final String f57375a;

    /* JADX INFO: renamed from: b */
    public final int f57376b;

    /* JADX INFO: renamed from: c */
    public final Boolean f57377c;

    public C17973g1(int i10, Boolean bool, String id2) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC14376f.m15825D(i10, "type");
        this.f57375a = id2;
        this.f57376b = i10;
        this.f57377c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17973g1)) {
            return false;
        }
        C17973g1 c17973g1 = (C17973g1) obj;
        return AbstractC16544l.m18089b(this.f57375a, c17973g1.f57375a) && this.f57376b == c17973g1.f57376b && AbstractC16544l.m18089b(this.f57377c, c17973g1.f57377c);
    }

    public final int hashCode() {
        int iM13820k = AbstractC12107L1.m13820k(this.f57376b, this.f57375a.hashCode() * 31, 31);
        Boolean bool = this.f57377c;
        return iM13820k + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ResourceEventSession(id=");
        sb2.append(this.f57375a);
        sb2.append(", type=");
        int i10 = this.f57376b;
        if (i10 == 1) {
            str = "USER";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "CI_TEST";
        } else {
            str = "SYNTHETICS";
        }
        sb2.append(str);
        sb2.append(", hasReplay=");
        sb2.append(this.f57377c);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
