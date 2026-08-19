package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: o8.W1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17946W1 {

    /* JADX INFO: renamed from: a */
    public final long f57234a;

    /* JADX INFO: renamed from: b */
    public final C18000p1 f57235b;

    /* JADX INFO: renamed from: c */
    public final String f57236c;

    /* JADX INFO: renamed from: d */
    public final String f57237d;

    /* JADX INFO: renamed from: e */
    public final String f57238e;

    /* JADX INFO: renamed from: f */
    public final String f57239f;

    /* JADX INFO: renamed from: g */
    public final C17937T1 f57240g;

    /* JADX INFO: renamed from: h */
    public final int f57241h;

    /* JADX INFO: renamed from: i */
    public final C17940U1 f57242i;

    /* JADX INFO: renamed from: j */
    public final C17934S1 f57243j;

    /* JADX INFO: renamed from: k */
    public final C18012t1 f57244k;

    /* JADX INFO: renamed from: l */
    public final C17887C1 f57245l;

    /* JADX INFO: renamed from: m */
    public final C17931R1 f57246m;

    /* JADX INFO: renamed from: n */
    public final C18006r1 f57247n;

    /* JADX INFO: renamed from: o */
    public final C17911K1 f57248o;

    /* JADX INFO: renamed from: p */
    public final C17884B1 f57249p;

    /* JADX INFO: renamed from: q */
    public final C18030z1 f57250q;

    /* JADX INFO: renamed from: r */
    public final C18021w1 f57251r;

    /* JADX INFO: renamed from: s */
    public final C18015u1 f57252s;

    /* JADX INFO: renamed from: t */
    public final C18021w1 f57253t;

    /* JADX INFO: renamed from: u */
    public final C17920N1 f57254u;

    public C17946W1(long j10, C18000p1 c18000p1, String str, String str2, String str3, String str4, C17937T1 c17937t1, int i10, C17940U1 c17940u1, C17934S1 c17934s1, C18012t1 c18012t1, C17887C1 c17887c1, C17931R1 c17931r1, C18006r1 c18006r1, C17911K1 c17911k1, C17884B1 c17884b1, C18030z1 c18030z1, C18021w1 c18021w1, C18015u1 c18015u1, C18021w1 c18021w2, C17920N1 c17920n1) {
        this.f57234a = j10;
        this.f57235b = c18000p1;
        this.f57236c = str;
        this.f57237d = str2;
        this.f57238e = str3;
        this.f57239f = str4;
        this.f57240g = c17937t1;
        this.f57241h = i10;
        this.f57242i = c17940u1;
        this.f57243j = c17934s1;
        this.f57244k = c18012t1;
        this.f57245l = c17887c1;
        this.f57246m = c17931r1;
        this.f57247n = c18006r1;
        this.f57248o = c17911k1;
        this.f57249p = c17884b1;
        this.f57250q = c18030z1;
        this.f57251r = c18021w1;
        this.f57252s = c18015u1;
        this.f57253t = c18021w2;
        this.f57254u = c17920n1;
    }

    /* JADX INFO: renamed from: a */
    public static C17946W1 m19609a(C17946W1 c17946w1, C17940U1 c17940u1, C17934S1 c17934s1, C18030z1 c18030z1, C18021w1 c18021w1, int i10) {
        long j10 = c17946w1.f57234a;
        C18000p1 c18000p1 = c17946w1.f57235b;
        String str = c17946w1.f57236c;
        String str2 = c17946w1.f57237d;
        String str3 = c17946w1.f57238e;
        String str4 = c17946w1.f57239f;
        C17937T1 c17937t1 = c17946w1.f57240g;
        int i11 = c17946w1.f57241h;
        C17934S1 c17934s2 = (i10 & 512) != 0 ? c17946w1.f57243j : c17934s1;
        C18012t1 c18012t1 = c17946w1.f57244k;
        C17887C1 c17887c1 = c17946w1.f57245l;
        C17931R1 c17931r1 = c17946w1.f57246m;
        C18006r1 c18006r1 = c17946w1.f57247n;
        C17911K1 c17911k1 = c17946w1.f57248o;
        C17884B1 c17884b1 = c17946w1.f57249p;
        C18030z1 dd2 = (i10 & 65536) != 0 ? c17946w1.f57250q : c18030z1;
        C18021w1 c18021w2 = (i10 & 131072) != 0 ? c17946w1.f57251r : c18021w1;
        C18015u1 c18015u1 = c17946w1.f57252s;
        C18021w1 c18021w3 = c17946w1.f57253t;
        C17920N1 c17920n1 = c17946w1.f57254u;
        c17946w1.getClass();
        AbstractC16544l.m18094g(dd2, "dd");
        return new C17946W1(j10, c18000p1, str, str2, str3, str4, c17937t1, i11, c17940u1, c17934s2, c18012t1, c17887c1, c17931r1, c18006r1, c17911k1, c17884b1, dd2, c18021w2, c18015u1, c18021w3, c17920n1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17946W1)) {
            return false;
        }
        C17946W1 c17946w1 = (C17946W1) obj;
        return this.f57234a == c17946w1.f57234a && this.f57235b.equals(c17946w1.f57235b) && AbstractC16544l.m18089b(this.f57236c, c17946w1.f57236c) && AbstractC16544l.m18089b(this.f57237d, c17946w1.f57237d) && AbstractC16544l.m18089b(this.f57238e, c17946w1.f57238e) && AbstractC16544l.m18089b(this.f57239f, c17946w1.f57239f) && this.f57240g.equals(c17946w1.f57240g) && this.f57241h == c17946w1.f57241h && this.f57242i.equals(c17946w1.f57242i) && AbstractC16544l.m18089b(this.f57243j, c17946w1.f57243j) && AbstractC16544l.m18089b(this.f57244k, c17946w1.f57244k) && AbstractC16544l.m18089b(this.f57245l, c17946w1.f57245l) && AbstractC16544l.m18089b(this.f57246m, c17946w1.f57246m) && AbstractC16544l.m18089b(this.f57247n, c17946w1.f57247n) && AbstractC16544l.m18089b(this.f57248o, c17946w1.f57248o) && AbstractC16544l.m18089b(this.f57249p, c17946w1.f57249p) && this.f57250q.equals(c17946w1.f57250q) && AbstractC16544l.m18089b(this.f57251r, c17946w1.f57251r) && AbstractC16544l.m18089b(this.f57252s, c17946w1.f57252s) && AbstractC16544l.m18089b(this.f57253t, c17946w1.f57253t) && AbstractC16544l.m18089b(this.f57254u, c17946w1.f57254u);
    }

    public final int hashCode() {
        long j10 = this.f57234a;
        int iM527p = AbstractC0168G.m527p(((int) (j10 ^ (j10 >>> 32))) * 31, 31, this.f57235b.f57474a);
        String str = this.f57236c;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57237d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57238e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57239f;
        int iHashCode4 = (this.f57240g.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        int i10 = this.f57241h;
        int iHashCode5 = (this.f57242i.hashCode() + ((iHashCode4 + (i10 == 0 ? 0 : AbstractC0010F.m24h(i10))) * 31)) * 31;
        C17934S1 c17934s1 = this.f57243j;
        int iHashCode6 = (iHashCode5 + (c17934s1 == null ? 0 : c17934s1.hashCode())) * 31;
        C18012t1 c18012t1 = this.f57244k;
        int iHashCode7 = (iHashCode6 + (c18012t1 == null ? 0 : c18012t1.hashCode())) * 31;
        C17887C1 c17887c1 = this.f57245l;
        int iHashCode8 = (iHashCode7 + (c17887c1 == null ? 0 : c17887c1.hashCode())) * 31;
        C17931R1 c17931r1 = this.f57246m;
        int iHashCode9 = (iHashCode8 + (c17931r1 == null ? 0 : c17931r1.hashCode())) * 31;
        C18006r1 c18006r1 = this.f57247n;
        int iHashCode10 = (iHashCode9 + (c18006r1 == null ? 0 : c18006r1.f57488a.hashCode())) * 31;
        C17911K1 c17911k1 = this.f57248o;
        int iHashCode11 = (iHashCode10 + (c17911k1 == null ? 0 : c17911k1.hashCode())) * 31;
        C17884B1 c17884b1 = this.f57249p;
        int iHashCode12 = (this.f57250q.hashCode() + ((iHashCode11 + (c17884b1 == null ? 0 : c17884b1.hashCode())) * 31)) * 31;
        C18021w1 c18021w1 = this.f57251r;
        int iHashCode13 = (iHashCode12 + (c18021w1 == null ? 0 : c18021w1.f57528a.hashCode())) * 31;
        C18015u1 c18015u1 = this.f57252s;
        int iHashCode14 = (iHashCode13 + (c18015u1 == null ? 0 : c18015u1.hashCode())) * 31;
        C18021w1 c18021w2 = this.f57253t;
        int iHashCode15 = (iHashCode14 + (c18021w2 == null ? 0 : c18021w2.f57528a.hashCode())) * 31;
        C17920N1 c17920n1 = this.f57254u;
        return iHashCode15 + (c17920n1 != null ? AbstractC0010F.m24h(c17920n1.f57124a) : 0);
    }

    public final String toString() {
        return "ViewEvent(date=" + this.f57234a + ", application=" + this.f57235b + ", service=" + this.f57236c + ", version=" + this.f57237d + ", buildVersion=" + this.f57238e + ", buildId=" + this.f57239f + ", session=" + this.f57240g + ", source=" + AbstractC17976h1.m19681p(this.f57241h) + ", view=" + this.f57242i + ", usr=" + this.f57243j + ", connectivity=" + this.f57244k + ", display=" + this.f57245l + ", synthetics=" + this.f57246m + ", ciTest=" + this.f57247n + ", os=" + this.f57248o + ", device=" + this.f57249p + ", dd=" + this.f57250q + ", context=" + this.f57251r + ", container=" + this.f57252s + ", featureFlags=" + this.f57253t + ", privacy=" + this.f57254u + Separators.RPAREN;
    }
}
