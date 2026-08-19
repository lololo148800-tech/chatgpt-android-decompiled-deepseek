package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: o8.H0 */
/* JADX INFO: loaded from: classes.dex */
public final class C17901H0 {

    /* JADX INFO: renamed from: a */
    public final long f57059a;

    /* JADX INFO: renamed from: b */
    public final C17990m0 f57060b;

    /* JADX INFO: renamed from: c */
    public final String f57061c;

    /* JADX INFO: renamed from: d */
    public final String f57062d;

    /* JADX INFO: renamed from: e */
    public final String f57063e;

    /* JADX INFO: renamed from: f */
    public final String f57064f;

    /* JADX INFO: renamed from: g */
    public final C17880A0 f57065g;

    /* JADX INFO: renamed from: h */
    public final int f57066h;

    /* JADX INFO: renamed from: i */
    public final C17883B0 f57067i;

    /* JADX INFO: renamed from: j */
    public final C17895F0 f57068j;

    /* JADX INFO: renamed from: k */
    public final C18002q0 f57069k;

    /* JADX INFO: renamed from: l */
    public final C18023x0 f57070l;

    /* JADX INFO: renamed from: m */
    public final C17892E0 f57071m;

    /* JADX INFO: renamed from: n */
    public final C17996o0 f57072n;

    /* JADX INFO: renamed from: o */
    public final C17886C0 f57073o;

    /* JADX INFO: renamed from: p */
    public final C18020w0 f57074p;

    /* JADX INFO: renamed from: q */
    public final C18014u0 f57075q;

    /* JADX INFO: renamed from: r */
    public final C18011t0 f57076r;

    /* JADX INFO: renamed from: s */
    public final C17987l0 f57077s;

    /* JADX INFO: renamed from: t */
    public final C18005r0 f57078t;

    /* JADX INFO: renamed from: u */
    public final C18029z0 f57079u;

    public C17901H0(long j10, C17990m0 c17990m0, String str, String str2, String str3, String str4, C17880A0 c17880a0, int i10, C17883B0 c17883b0, C17895F0 c17895f0, C18002q0 c18002q0, C18023x0 c18023x0, C17892E0 c17892e0, C17996o0 c17996o0, C17886C0 c17886c0, C18020w0 c18020w0, C18014u0 c18014u0, C18011t0 c18011t0, C17987l0 c17987l0, C18005r0 c18005r0, C18029z0 c18029z0) {
        this.f57059a = j10;
        this.f57060b = c17990m0;
        this.f57061c = str;
        this.f57062d = str2;
        this.f57063e = str3;
        this.f57064f = str4;
        this.f57065g = c17880a0;
        this.f57066h = i10;
        this.f57067i = c17883b0;
        this.f57068j = c17895f0;
        this.f57069k = c18002q0;
        this.f57070l = c18023x0;
        this.f57071m = c17892e0;
        this.f57072n = c17996o0;
        this.f57073o = c17886c0;
        this.f57074p = c18020w0;
        this.f57075q = c18014u0;
        this.f57076r = c18011t0;
        this.f57077s = c17987l0;
        this.f57078t = c18005r0;
        this.f57079u = c18029z0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17901H0)) {
            return false;
        }
        C17901H0 c17901h0 = (C17901H0) obj;
        return this.f57059a == c17901h0.f57059a && this.f57060b.equals(c17901h0.f57060b) && AbstractC16544l.m18089b(this.f57061c, c17901h0.f57061c) && AbstractC16544l.m18089b(this.f57062d, c17901h0.f57062d) && AbstractC16544l.m18089b(this.f57063e, c17901h0.f57063e) && AbstractC16544l.m18089b(this.f57064f, c17901h0.f57064f) && this.f57065g.equals(c17901h0.f57065g) && this.f57066h == c17901h0.f57066h && this.f57067i.equals(c17901h0.f57067i) && AbstractC16544l.m18089b(this.f57068j, c17901h0.f57068j) && AbstractC16544l.m18089b(this.f57069k, c17901h0.f57069k) && AbstractC16544l.m18089b(this.f57070l, c17901h0.f57070l) && AbstractC16544l.m18089b(this.f57071m, c17901h0.f57071m) && AbstractC16544l.m18089b(this.f57072n, c17901h0.f57072n) && AbstractC16544l.m18089b(this.f57073o, c17901h0.f57073o) && AbstractC16544l.m18089b(this.f57074p, c17901h0.f57074p) && this.f57075q.equals(c17901h0.f57075q) && AbstractC16544l.m18089b(this.f57076r, c17901h0.f57076r) && AbstractC16544l.m18089b(this.f57077s, c17901h0.f57077s) && AbstractC16544l.m18089b(this.f57078t, c17901h0.f57078t) && this.f57079u.equals(c17901h0.f57079u);
    }

    public final int hashCode() {
        long j10 = this.f57059a;
        int iM527p = AbstractC0168G.m527p(((int) (j10 ^ (j10 >>> 32))) * 31, 31, this.f57060b.f57437a);
        String str = this.f57061c;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57062d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57063e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57064f;
        int iHashCode4 = (this.f57065g.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        int i10 = this.f57066h;
        int iHashCode5 = (this.f57067i.hashCode() + ((iHashCode4 + (i10 == 0 ? 0 : AbstractC0010F.m24h(i10))) * 31)) * 31;
        C17895F0 c17895f0 = this.f57068j;
        int iHashCode6 = (iHashCode5 + (c17895f0 == null ? 0 : c17895f0.hashCode())) * 31;
        C18002q0 c18002q0 = this.f57069k;
        int iHashCode7 = (iHashCode6 + (c18002q0 == null ? 0 : c18002q0.hashCode())) * 31;
        C18023x0 c18023x0 = this.f57070l;
        int iHashCode8 = (iHashCode7 + (c18023x0 == null ? 0 : c18023x0.hashCode())) * 31;
        C17892E0 c17892e0 = this.f57071m;
        int iHashCode9 = (iHashCode8 + (c17892e0 == null ? 0 : c17892e0.hashCode())) * 31;
        C17996o0 c17996o0 = this.f57072n;
        int iHashCode10 = (iHashCode9 + (c17996o0 == null ? 0 : c17996o0.f57468a.hashCode())) * 31;
        C17886C0 c17886c0 = this.f57073o;
        int iHashCode11 = (iHashCode10 + (c17886c0 == null ? 0 : c17886c0.hashCode())) * 31;
        C18020w0 c18020w0 = this.f57074p;
        int iHashCode12 = (this.f57075q.hashCode() + ((iHashCode11 + (c18020w0 == null ? 0 : c18020w0.hashCode())) * 31)) * 31;
        C18011t0 c18011t0 = this.f57076r;
        int iHashCode13 = (iHashCode12 + (c18011t0 == null ? 0 : c18011t0.f57499a.hashCode())) * 31;
        C17987l0 c17987l0 = this.f57077s;
        int iHashCode14 = (iHashCode13 + (c17987l0 == null ? 0 : c17987l0.f57430a.hashCode())) * 31;
        C18005r0 c18005r0 = this.f57078t;
        return this.f57079u.hashCode() + ((iHashCode14 + (c18005r0 != null ? c18005r0.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LongTaskEvent(date=" + this.f57059a + ", application=" + this.f57060b + ", service=" + this.f57061c + ", version=" + this.f57062d + ", buildVersion=" + this.f57063e + ", buildId=" + this.f57064f + ", session=" + this.f57065g + ", source=" + AbstractC17962d.m19625P(this.f57066h) + ", view=" + this.f57067i + ", usr=" + this.f57068j + ", connectivity=" + this.f57069k + ", display=" + this.f57070l + ", synthetics=" + this.f57071m + ", ciTest=" + this.f57072n + ", os=" + this.f57073o + ", device=" + this.f57074p + ", dd=" + this.f57075q + ", context=" + this.f57076r + ", action=" + this.f57077s + ", container=" + this.f57078t + ", longTask=" + this.f57079u + Separators.RPAREN;
    }
}
