package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p571X9.AbstractC9306j0;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17939U0 {

    /* JADX INFO: renamed from: a */
    public final int f57176a;

    /* JADX INFO: renamed from: b */
    public final String f57177b;

    /* JADX INFO: renamed from: c */
    public final String f57178c;

    /* JADX INFO: renamed from: d */
    public final String f57179d;

    /* JADX INFO: renamed from: e */
    public final String f57180e;

    public C17939U0(int i10, String str, String str2, String str3, String str4) {
        AbstractC14376f.m15825D(i10, "type");
        this.f57176a = i10;
        this.f57177b = str;
        this.f57178c = str2;
        this.f57179d = str3;
        this.f57180e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17939U0)) {
            return false;
        }
        C17939U0 c17939u0 = (C17939U0) obj;
        return this.f57176a == c17939u0.f57176a && AbstractC16544l.m18089b(this.f57177b, c17939u0.f57177b) && AbstractC16544l.m18089b(this.f57178c, c17939u0.f57178c) && AbstractC16544l.m18089b(this.f57179d, c17939u0.f57179d) && AbstractC16544l.m18089b(this.f57180e, c17939u0.f57180e);
    }

    public final int hashCode() {
        int iM24h = AbstractC0010F.m24h(this.f57176a) * 31;
        String str = this.f57177b;
        int iHashCode = (iM24h + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57178c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57179d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57180e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(type=");
        sb2.append(AbstractC17962d.m19628S(this.f57176a));
        sb2.append(", name=");
        sb2.append(this.f57177b);
        sb2.append(", model=");
        sb2.append(this.f57178c);
        sb2.append(", brand=");
        sb2.append(this.f57179d);
        sb2.append(", architecture=");
        return AbstractC9306j0.m9891j(this.f57180e, Separators.RPAREN, sb2);
    }
}
