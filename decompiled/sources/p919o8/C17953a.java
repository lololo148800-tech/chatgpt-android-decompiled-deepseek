package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C17953a {

    /* JADX INFO: renamed from: a */
    public final int f57289a;

    /* JADX INFO: renamed from: b */
    public final String f57290b;

    /* JADX INFO: renamed from: c */
    public final Long f57291c;

    /* JADX INFO: renamed from: d */
    public final C17956b f57292d;

    /* JADX INFO: renamed from: e */
    public final C18016v f57293e;

    /* JADX INFO: renamed from: f */
    public final C18013u f57294f;

    /* JADX INFO: renamed from: g */
    public final C17992n f57295g;

    /* JADX INFO: renamed from: h */
    public final C18022x f57296h;

    /* JADX INFO: renamed from: i */
    public final C17882B f57297i;

    public C17953a(int i10, String str, Long l4, C17956b c17956b, C18016v c18016v, C18013u c18013u, C17992n c17992n, C18022x c18022x, C17882B c17882b) {
        AbstractC14376f.m15825D(i10, "type");
        this.f57289a = i10;
        this.f57290b = str;
        this.f57291c = l4;
        this.f57292d = c17956b;
        this.f57293e = c18016v;
        this.f57294f = c18013u;
        this.f57295g = c17992n;
        this.f57296h = c18022x;
        this.f57297i = c17882b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17953a)) {
            return false;
        }
        C17953a c17953a = (C17953a) obj;
        return this.f57289a == c17953a.f57289a && AbstractC16544l.m18089b(this.f57290b, c17953a.f57290b) && AbstractC16544l.m18089b(this.f57291c, c17953a.f57291c) && AbstractC16544l.m18089b(this.f57292d, c17953a.f57292d) && AbstractC16544l.m18089b(this.f57293e, c17953a.f57293e) && AbstractC16544l.m18089b(this.f57294f, c17953a.f57294f) && AbstractC16544l.m18089b(this.f57295g, c17953a.f57295g) && AbstractC16544l.m18089b(this.f57296h, c17953a.f57296h) && AbstractC16544l.m18089b(this.f57297i, c17953a.f57297i);
    }

    public final int hashCode() {
        int iM24h = AbstractC0010F.m24h(this.f57289a) * 31;
        String str = this.f57290b;
        int iHashCode = (iM24h + (str == null ? 0 : str.hashCode())) * 31;
        Long l4 = this.f57291c;
        int iHashCode2 = (iHashCode + (l4 == null ? 0 : l4.hashCode())) * 31;
        C17956b c17956b = this.f57292d;
        int iHashCode3 = (iHashCode2 + (c17956b == null ? 0 : c17956b.f57314a.hashCode())) * 31;
        C18016v c18016v = this.f57293e;
        int iHashCode4 = (iHashCode3 + (c18016v == null ? 0 : c18016v.f57511a.hashCode())) * 31;
        C18013u c18013u = this.f57294f;
        int iHashCode5 = (iHashCode4 + (c18013u == null ? 0 : c18013u.hashCode())) * 31;
        C17992n c17992n = this.f57295g;
        int iHashCode6 = (iHashCode5 + (c17992n == null ? 0 : c17992n.hashCode())) * 31;
        C18022x c18022x = this.f57296h;
        int iHashCode7 = (iHashCode6 + (c18022x == null ? 0 : c18022x.hashCode())) * 31;
        C17882B c17882b = this.f57297i;
        return iHashCode7 + (c17882b != null ? c17882b.hashCode() : 0);
    }

    public final String toString() {
        return "ActionEventAction(type=" + AbstractC17962d.m19623N(this.f57289a) + ", id=" + this.f57290b + ", loadingTime=" + this.f57291c + ", target=" + this.f57292d + ", frustration=" + this.f57293e + ", error=" + this.f57294f + ", crash=" + this.f57295g + ", longTask=" + this.f57296h + ", resource=" + this.f57297i + Separators.RPAREN;
    }
}
