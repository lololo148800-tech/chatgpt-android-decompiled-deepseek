package p926of;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p098Di.InterfaceC2062k;
import p1071w0.AbstractC20734X;
import p403Qd.AbstractC6601G;
import p403Qd.AbstractC6659u;
import p479Td.C7351f0;

/* JADX INFO: renamed from: of.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C18160X implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f57910a;

    /* JADX INFO: renamed from: b */
    public final C17309l f57911b;

    /* JADX INFO: renamed from: c */
    public final boolean f57912c;

    /* JADX INFO: renamed from: d */
    public final String f57913d;

    /* JADX INFO: renamed from: e */
    public final C18162Z f57914e;

    /* JADX INFO: renamed from: f */
    public final boolean f57915f;

    /* JADX INFO: renamed from: g */
    public final boolean f57916g;

    /* JADX INFO: renamed from: h */
    public final C7351f0 f57917h;

    /* JADX INFO: renamed from: i */
    public final AbstractC6601G f57918i;

    /* JADX INFO: renamed from: j */
    public final Map f57919j;

    /* JADX INFO: renamed from: k */
    public final AbstractC6659u f57920k;

    public C18160X(String str, C17309l c17309l, boolean z6, String str2, C18162Z c18162z, boolean z10, boolean z11, C7351f0 c7351f0, AbstractC6601G abstractC6601G, Map webpageAttributions, AbstractC6659u abstractC6659u) {
        AbstractC16544l.m18094g(webpageAttributions, "webpageAttributions");
        this.f57910a = str;
        this.f57911b = c17309l;
        this.f57912c = z6;
        this.f57913d = str2;
        this.f57914e = c18162z;
        this.f57915f = z10;
        this.f57916g = z11;
        this.f57917h = c7351f0;
        this.f57918i = abstractC6601G;
        this.f57919j = webpageAttributions;
        this.f57920k = abstractC6659u;
    }

    /* JADX INFO: renamed from: e */
    public static C18160X m19717e(C18160X c18160x, boolean z6, String str, C18162Z c18162z, boolean z10, C7351f0 c7351f0, AbstractC6601G abstractC6601G, Map map, AbstractC6659u abstractC6659u, int i10) {
        String str2 = c18160x.f57910a;
        C17309l c17309l = (i10 & 2) != 0 ? c18160x.f57911b : null;
        boolean z11 = (i10 & 4) != 0 ? c18160x.f57912c : z6;
        String str3 = (i10 & 8) != 0 ? c18160x.f57913d : str;
        C18162Z c18162z2 = (i10 & 16) != 0 ? c18160x.f57914e : c18162z;
        boolean z12 = c18160x.f57915f;
        boolean z13 = (i10 & 64) != 0 ? c18160x.f57916g : z10;
        C7351f0 c7351f1 = (i10 & 128) != 0 ? c18160x.f57917h : c7351f0;
        AbstractC6601G abstractC6601G2 = (i10 & 256) != 0 ? c18160x.f57918i : abstractC6601G;
        Map webpageAttributions = (i10 & 512) != 0 ? c18160x.f57919j : map;
        AbstractC6659u abstractC6659u2 = (i10 & 1024) != 0 ? c18160x.f57920k : abstractC6659u;
        c18160x.getClass();
        AbstractC16544l.m18094g(webpageAttributions, "webpageAttributions");
        return new C18160X(str2, c17309l, z11, str3, c18162z2, z12, z13, c7351f1, abstractC6601G2, webpageAttributions, abstractC6659u2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18160X)) {
            return false;
        }
        C18160X c18160x = (C18160X) obj;
        return AbstractC16544l.m18089b(this.f57910a, c18160x.f57910a) && AbstractC16544l.m18089b(this.f57911b, c18160x.f57911b) && this.f57912c == c18160x.f57912c && AbstractC16544l.m18089b(this.f57913d, c18160x.f57913d) && AbstractC16544l.m18089b(this.f57914e, c18160x.f57914e) && this.f57915f == c18160x.f57915f && this.f57916g == c18160x.f57916g && AbstractC16544l.m18089b(this.f57917h, c18160x.f57917h) && AbstractC16544l.m18089b(this.f57918i, c18160x.f57918i) && AbstractC16544l.m18089b(this.f57919j, c18160x.f57919j) && AbstractC16544l.m18089b(this.f57920k, c18160x.f57920k);
    }

    public final int hashCode() {
        String str = this.f57910a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C17309l c17309l = this.f57911b;
        int iHashCode2 = (((iHashCode + (c17309l == null ? 0 : c17309l.hashCode())) * 31) + (this.f57912c ? 1231 : 1237)) * 31;
        String str2 = this.f57913d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C18162Z c18162z = this.f57914e;
        int iHashCode4 = (((((iHashCode3 + (c18162z == null ? 0 : c18162z.hashCode())) * 31) + (this.f57915f ? 1231 : 1237)) * 31) + (this.f57916g ? 1231 : 1237)) * 31;
        C7351f0 c7351f0 = this.f57917h;
        int iHashCode5 = (iHashCode4 + (c7351f0 == null ? 0 : c7351f0.hashCode())) * 31;
        AbstractC6601G abstractC6601G = this.f57918i;
        int iM21250u = AbstractC20734X.m21250u((iHashCode5 + (abstractC6601G == null ? 0 : abstractC6601G.hashCode())) * 31, 31, this.f57919j);
        AbstractC6659u abstractC6659u = this.f57920k;
        return iM21250u + (abstractC6659u != null ? abstractC6659u.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
