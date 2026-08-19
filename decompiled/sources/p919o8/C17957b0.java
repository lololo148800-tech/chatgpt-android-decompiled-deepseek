package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: o8.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17957b0 {

    /* JADX INFO: renamed from: a */
    public final String f57315a;

    /* JADX INFO: renamed from: b */
    public final String f57316b;

    /* JADX INFO: renamed from: c */
    public final String f57317c;

    /* JADX INFO: renamed from: d */
    public final String f57318d;

    /* JADX INFO: renamed from: e */
    public final String f57319e;

    /* JADX INFO: renamed from: f */
    public final String f57320f;

    /* JADX INFO: renamed from: g */
    public final String f57321g;

    public C17957b0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f57315a = str;
        this.f57316b = str2;
        this.f57317c = str3;
        this.f57318d = str4;
        this.f57319e = str5;
        this.f57320f = str6;
        this.f57321g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17957b0)) {
            return false;
        }
        C17957b0 c17957b0 = (C17957b0) obj;
        return AbstractC16544l.m18089b(this.f57315a, c17957b0.f57315a) && AbstractC16544l.m18089b(this.f57316b, c17957b0.f57316b) && AbstractC16544l.m18089b(this.f57317c, c17957b0.f57317c) && AbstractC16544l.m18089b(this.f57318d, c17957b0.f57318d) && AbstractC16544l.m18089b(this.f57319e, c17957b0.f57319e) && AbstractC16544l.m18089b(this.f57320f, c17957b0.f57320f) && AbstractC16544l.m18089b(this.f57321g, c17957b0.f57321g);
    }

    public final int hashCode() {
        String str = this.f57315a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57316b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57317c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57318d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f57319e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f57320f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f57321g;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Meta(codeType=");
        sb2.append(this.f57315a);
        sb2.append(", parentProcess=");
        sb2.append(this.f57316b);
        sb2.append(", incidentIdentifier=");
        sb2.append(this.f57317c);
        sb2.append(", process=");
        sb2.append(this.f57318d);
        sb2.append(", exceptionType=");
        sb2.append(this.f57319e);
        sb2.append(", exceptionCodes=");
        sb2.append(this.f57320f);
        sb2.append(", path=");
        return AbstractC9306j0.m9891j(this.f57321g, Separators.RPAREN, sb2);
    }
}
