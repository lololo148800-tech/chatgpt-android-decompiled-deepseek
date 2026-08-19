package p919o8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: o8.G */
/* JADX INFO: loaded from: classes.dex */
public final class C17897G {

    /* JADX INFO: renamed from: a */
    public final long f57035a;

    /* JADX INFO: renamed from: b */
    public final C17968f f57036b;

    /* JADX INFO: renamed from: c */
    public final String f57037c;

    /* JADX INFO: renamed from: d */
    public final String f57038d;

    /* JADX INFO: renamed from: e */
    public final String f57039e;

    /* JADX INFO: renamed from: f */
    public final String f57040f;

    /* JADX INFO: renamed from: g */
    public final C17959c f57041g;

    /* JADX INFO: renamed from: h */
    public final int f57042h;

    /* JADX INFO: renamed from: i */
    public final C17965e f57043i;

    /* JADX INFO: renamed from: j */
    public final C17891E f57044j;

    /* JADX INFO: renamed from: k */
    public final C17980j f57045k;

    /* JADX INFO: renamed from: l */
    public final C18010t f57046l;

    /* JADX INFO: renamed from: m */
    public final C17885C f57047m;

    /* JADX INFO: renamed from: n */
    public final C17974h f57048n;

    /* JADX INFO: renamed from: o */
    public final C18025y f57049o;

    /* JADX INFO: renamed from: p */
    public final C18007s f57050p;

    /* JADX INFO: renamed from: q */
    public final C17995o f57051q;

    /* JADX INFO: renamed from: r */
    public final C17989m f57052r;

    /* JADX INFO: renamed from: s */
    public final C17983k f57053s;

    /* JADX INFO: renamed from: t */
    public final C17953a f57054t;

    public C17897G(long j10, C17968f c17968f, String str, String str2, String str3, String str4, C17959c c17959c, int i10, C17965e c17965e, C17891E c17891e, C17980j c17980j, C18010t c18010t, C17885C c17885c, C17974h c17974h, C18025y c18025y, C18007s c18007s, C17995o c17995o, C17989m c17989m, C17983k c17983k, C17953a c17953a) {
        this.f57035a = j10;
        this.f57036b = c17968f;
        this.f57037c = str;
        this.f57038d = str2;
        this.f57039e = str3;
        this.f57040f = str4;
        this.f57041g = c17959c;
        this.f57042h = i10;
        this.f57043i = c17965e;
        this.f57044j = c17891e;
        this.f57045k = c17980j;
        this.f57046l = c18010t;
        this.f57047m = c17885c;
        this.f57048n = c17974h;
        this.f57049o = c18025y;
        this.f57050p = c18007s;
        this.f57051q = c17995o;
        this.f57052r = c17989m;
        this.f57053s = c17983k;
        this.f57054t = c17953a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17897G)) {
            return false;
        }
        C17897G c17897g = (C17897G) obj;
        return this.f57035a == c17897g.f57035a && AbstractC16544l.m18089b(this.f57036b, c17897g.f57036b) && AbstractC16544l.m18089b(this.f57037c, c17897g.f57037c) && AbstractC16544l.m18089b(this.f57038d, c17897g.f57038d) && AbstractC16544l.m18089b(this.f57039e, c17897g.f57039e) && AbstractC16544l.m18089b(this.f57040f, c17897g.f57040f) && AbstractC16544l.m18089b(this.f57041g, c17897g.f57041g) && this.f57042h == c17897g.f57042h && AbstractC16544l.m18089b(this.f57043i, c17897g.f57043i) && AbstractC16544l.m18089b(this.f57044j, c17897g.f57044j) && AbstractC16544l.m18089b(this.f57045k, c17897g.f57045k) && AbstractC16544l.m18089b(this.f57046l, c17897g.f57046l) && AbstractC16544l.m18089b(this.f57047m, c17897g.f57047m) && AbstractC16544l.m18089b(this.f57048n, c17897g.f57048n) && AbstractC16544l.m18089b(this.f57049o, c17897g.f57049o) && AbstractC16544l.m18089b(this.f57050p, c17897g.f57050p) && AbstractC16544l.m18089b(this.f57051q, c17897g.f57051q) && AbstractC16544l.m18089b(this.f57052r, c17897g.f57052r) && AbstractC16544l.m18089b(this.f57053s, c17897g.f57053s) && AbstractC16544l.m18089b(this.f57054t, c17897g.f57054t);
    }

    public final int hashCode() {
        long j10 = this.f57035a;
        int iM527p = AbstractC0168G.m527p(((int) (j10 ^ (j10 >>> 32))) * 31, 31, this.f57036b.f57350a);
        String str = this.f57037c;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57038d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57039e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57040f;
        int iHashCode4 = (this.f57041g.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        int i10 = this.f57042h;
        int iHashCode5 = (this.f57043i.hashCode() + ((iHashCode4 + (i10 == 0 ? 0 : AbstractC0010F.m24h(i10))) * 31)) * 31;
        C17891E c17891e = this.f57044j;
        int iHashCode6 = (iHashCode5 + (c17891e == null ? 0 : c17891e.hashCode())) * 31;
        C17980j c17980j = this.f57045k;
        int iHashCode7 = (iHashCode6 + (c17980j == null ? 0 : c17980j.hashCode())) * 31;
        C18010t c18010t = this.f57046l;
        int iHashCode8 = (iHashCode7 + (c18010t == null ? 0 : c18010t.hashCode())) * 31;
        C17885C c17885c = this.f57047m;
        int iHashCode9 = (iHashCode8 + (c17885c == null ? 0 : c17885c.hashCode())) * 31;
        C17974h c17974h = this.f57048n;
        int iHashCode10 = (iHashCode9 + (c17974h == null ? 0 : c17974h.f57378a.hashCode())) * 31;
        C18025y c18025y = this.f57049o;
        int iHashCode11 = (iHashCode10 + (c18025y == null ? 0 : c18025y.hashCode())) * 31;
        C18007s c18007s = this.f57050p;
        int iHashCode12 = (this.f57051q.hashCode() + ((iHashCode11 + (c18007s == null ? 0 : c18007s.hashCode())) * 31)) * 31;
        C17989m c17989m = this.f57052r;
        int iHashCode13 = (iHashCode12 + (c17989m == null ? 0 : c17989m.f57436a.hashCode())) * 31;
        C17983k c17983k = this.f57053s;
        return this.f57054t.hashCode() + ((iHashCode13 + (c17983k != null ? c17983k.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ActionEvent(date=" + this.f57035a + ", application=" + this.f57036b + ", service=" + this.f57037c + ", version=" + this.f57038d + ", buildVersion=" + this.f57039e + ", buildId=" + this.f57040f + ", session=" + this.f57041g + ", source=" + AbstractC17962d.m19614E(this.f57042h) + ", view=" + this.f57043i + ", usr=" + this.f57044j + ", connectivity=" + this.f57045k + ", display=" + this.f57046l + ", synthetics=" + this.f57047m + ", ciTest=" + this.f57048n + ", os=" + this.f57049o + ", device=" + this.f57050p + ", dd=" + this.f57051q + ", context=" + this.f57052r + ", container=" + this.f57053s + ", action=" + this.f57054t + Separators.RPAREN;
    }
}
