package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: o8.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17984k0 {

    /* JADX INFO: renamed from: a */
    public final long f57404a;

    /* JADX INFO: renamed from: b */
    public final C17903I f57405b;

    /* JADX INFO: renamed from: c */
    public final String f57406c;

    /* JADX INFO: renamed from: d */
    public final String f57407d;

    /* JADX INFO: renamed from: e */
    public final String f57408e;

    /* JADX INFO: renamed from: f */
    public final String f57409f;

    /* JADX INFO: renamed from: g */
    public final C17949Y f57410g;

    /* JADX INFO: renamed from: h */
    public final int f57411h;

    /* JADX INFO: renamed from: i */
    public final C17951Z f57412i;

    /* JADX INFO: renamed from: j */
    public final C17978i0 f57413j;

    /* JADX INFO: renamed from: k */
    public final C17921O f57414k;

    /* JADX INFO: renamed from: l */
    public final C17944W f57415l;

    /* JADX INFO: renamed from: m */
    public final C17972g0 f57416m;

    /* JADX INFO: renamed from: n */
    public final C17915M f57417n;

    /* JADX INFO: renamed from: o */
    public final C17960c0 f57418o;

    /* JADX INFO: renamed from: p */
    public final C17941V f57419p;

    /* JADX INFO: renamed from: q */
    public final C17935T f57420q;

    /* JADX INFO: renamed from: r */
    public final C17932S f57421r;

    /* JADX INFO: renamed from: s */
    public final C17900H f57422s;

    /* JADX INFO: renamed from: t */
    public final C17924P f57423t;

    /* JADX INFO: renamed from: u */
    public final C17947X f57424u;

    /* JADX INFO: renamed from: v */
    public final C17932S f57425v;

    public C17984k0(long j10, C17903I c17903i, String str, String str2, String str3, String str4, C17949Y c17949y, int i10, C17951Z c17951z, C17978i0 c17978i0, C17921O c17921o, C17944W c17944w, C17972g0 c17972g0, C17915M c17915m, C17960c0 c17960c0, C17941V c17941v, C17935T c17935t, C17932S c17932s, C17900H c17900h, C17924P c17924p, C17947X c17947x, C17932S c17932s2) {
        this.f57404a = j10;
        this.f57405b = c17903i;
        this.f57406c = str;
        this.f57407d = str2;
        this.f57408e = str3;
        this.f57409f = str4;
        this.f57410g = c17949y;
        this.f57411h = i10;
        this.f57412i = c17951z;
        this.f57413j = c17978i0;
        this.f57414k = c17921o;
        this.f57415l = c17944w;
        this.f57416m = c17972g0;
        this.f57417n = c17915m;
        this.f57418o = c17960c0;
        this.f57419p = c17941v;
        this.f57420q = c17935t;
        this.f57421r = c17932s;
        this.f57422s = c17900h;
        this.f57423t = c17924p;
        this.f57424u = c17947x;
        this.f57425v = c17932s2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17984k0)) {
            return false;
        }
        C17984k0 c17984k0 = (C17984k0) obj;
        return this.f57404a == c17984k0.f57404a && AbstractC16544l.m18089b(this.f57405b, c17984k0.f57405b) && AbstractC16544l.m18089b(this.f57406c, c17984k0.f57406c) && AbstractC16544l.m18089b(this.f57407d, c17984k0.f57407d) && AbstractC16544l.m18089b(this.f57408e, c17984k0.f57408e) && AbstractC16544l.m18089b(this.f57409f, c17984k0.f57409f) && AbstractC16544l.m18089b(this.f57410g, c17984k0.f57410g) && this.f57411h == c17984k0.f57411h && AbstractC16544l.m18089b(this.f57412i, c17984k0.f57412i) && AbstractC16544l.m18089b(this.f57413j, c17984k0.f57413j) && AbstractC16544l.m18089b(this.f57414k, c17984k0.f57414k) && AbstractC16544l.m18089b(this.f57415l, c17984k0.f57415l) && AbstractC16544l.m18089b(this.f57416m, c17984k0.f57416m) && AbstractC16544l.m18089b(this.f57417n, c17984k0.f57417n) && AbstractC16544l.m18089b(this.f57418o, c17984k0.f57418o) && AbstractC16544l.m18089b(this.f57419p, c17984k0.f57419p) && AbstractC16544l.m18089b(this.f57420q, c17984k0.f57420q) && AbstractC16544l.m18089b(this.f57421r, c17984k0.f57421r) && AbstractC16544l.m18089b(this.f57422s, c17984k0.f57422s) && AbstractC16544l.m18089b(this.f57423t, c17984k0.f57423t) && AbstractC16544l.m18089b(this.f57424u, c17984k0.f57424u) && AbstractC16544l.m18089b(this.f57425v, c17984k0.f57425v);
    }

    public final int hashCode() {
        long j10 = this.f57404a;
        int iM527p = AbstractC0168G.m527p(((int) (j10 ^ (j10 >>> 32))) * 31, 31, this.f57405b.f57082a);
        String str = this.f57406c;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57407d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57408e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57409f;
        int iHashCode4 = (this.f57410g.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        int i10 = this.f57411h;
        int iHashCode5 = (this.f57412i.hashCode() + ((iHashCode4 + (i10 == 0 ? 0 : AbstractC0010F.m24h(i10))) * 31)) * 31;
        C17978i0 c17978i0 = this.f57413j;
        int iHashCode6 = (iHashCode5 + (c17978i0 == null ? 0 : c17978i0.hashCode())) * 31;
        C17921O c17921o = this.f57414k;
        int iHashCode7 = (iHashCode6 + (c17921o == null ? 0 : c17921o.hashCode())) * 31;
        C17944W c17944w = this.f57415l;
        int iHashCode8 = (iHashCode7 + (c17944w == null ? 0 : c17944w.hashCode())) * 31;
        C17972g0 c17972g0 = this.f57416m;
        int iHashCode9 = (iHashCode8 + (c17972g0 == null ? 0 : c17972g0.hashCode())) * 31;
        C17915M c17915m = this.f57417n;
        int iHashCode10 = (iHashCode9 + (c17915m == null ? 0 : c17915m.f57115a.hashCode())) * 31;
        C17960c0 c17960c0 = this.f57418o;
        int iHashCode11 = (iHashCode10 + (c17960c0 == null ? 0 : c17960c0.hashCode())) * 31;
        C17941V c17941v = this.f57419p;
        int iHashCode12 = (this.f57420q.hashCode() + ((iHashCode11 + (c17941v == null ? 0 : c17941v.hashCode())) * 31)) * 31;
        C17932S c17932s = this.f57421r;
        int iHashCode13 = (iHashCode12 + (c17932s == null ? 0 : c17932s.f57151a.hashCode())) * 31;
        C17900H c17900h = this.f57422s;
        int iHashCode14 = (iHashCode13 + (c17900h == null ? 0 : c17900h.f57058a.hashCode())) * 31;
        C17924P c17924p = this.f57423t;
        int iHashCode15 = (this.f57424u.hashCode() + ((iHashCode14 + (c17924p == null ? 0 : c17924p.hashCode())) * 31)) * 31;
        C17932S c17932s2 = this.f57425v;
        return iHashCode15 + (c17932s2 != null ? c17932s2.f57151a.hashCode() : 0);
    }

    public final String toString() {
        return "ErrorEvent(date=" + this.f57404a + ", application=" + this.f57405b + ", service=" + this.f57406c + ", version=" + this.f57407d + ", buildVersion=" + this.f57408e + ", buildId=" + this.f57409f + ", session=" + this.f57410g + ", source=" + AbstractC17962d.m19615F(this.f57411h) + ", view=" + this.f57412i + ", usr=" + this.f57413j + ", connectivity=" + this.f57414k + ", display=" + this.f57415l + ", synthetics=" + this.f57416m + ", ciTest=" + this.f57417n + ", os=" + this.f57418o + ", device=" + this.f57419p + ", dd=" + this.f57420q + ", context=" + this.f57421r + ", action=" + this.f57422s + ", container=" + this.f57423t + ", error=" + this.f57424u + ", featureFlags=" + this.f57425v + Separators.RPAREN;
    }

    public /* synthetic */ C17984k0(long j10, C17903I c17903i, String str, String str2, String str3, C17949Y c17949y, int i10, C17951Z c17951z, C17978i0 c17978i0, C17921O c17921o, C17972g0 c17972g0, C17960c0 c17960c0, C17941V c17941v, C17935T c17935t, C17932S c17932s, C17900H c17900h, C17947X c17947x, C17932S c17932s2, int i11) {
        this(j10, c17903i, str, str2, null, str3, c17949y, i10, c17951z, c17978i0, c17921o, null, (i11 & 4096) != 0 ? null : c17972g0, null, c17960c0, c17941v, c17935t, c17932s, (262144 & i11) != 0 ? null : c17900h, null, c17947x, (i11 & 2097152) != 0 ? null : c17932s2);
    }
}
