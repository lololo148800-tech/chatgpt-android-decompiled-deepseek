package p482Tg;

import kotlin.jvm.internal.AbstractC16544l;
import mh.EnumC17264l;
import p020Ai.C0515d;
import p072Ci.C1705j;
import p098Di.InterfaceC2062k;
import p1155zi.C21891A;
import p172Gi.C3077j;

/* JADX INFO: renamed from: Tg.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C7439X implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final C21891A f23540a;

    /* JADX INFO: renamed from: b */
    public final C0515d f23541b;

    /* JADX INFO: renamed from: c */
    public final boolean f23542c;

    /* JADX INFO: renamed from: d */
    public final boolean f23543d;

    /* JADX INFO: renamed from: e */
    public final boolean f23544e;

    /* JADX INFO: renamed from: f */
    public final C3077j f23545f;

    /* JADX INFO: renamed from: g */
    public final boolean f23546g;

    /* JADX INFO: renamed from: h */
    public final EnumC17264l f23547h;

    /* JADX INFO: renamed from: i */
    public final boolean f23548i;

    /* JADX INFO: renamed from: j */
    public final C1705j f23549j;

    public C7439X(C21891A c21891a, C0515d c0515d, boolean z6, boolean z10, boolean z11, C3077j c3077j, boolean z12, EnumC17264l whisperLanguage, boolean z13, C1705j c1705j) {
        AbstractC16544l.m18094g(whisperLanguage, "whisperLanguage");
        this.f23540a = c21891a;
        this.f23541b = c0515d;
        this.f23542c = z6;
        this.f23543d = z10;
        this.f23544e = z11;
        this.f23545f = c3077j;
        this.f23546g = z12;
        this.f23547h = whisperLanguage;
        this.f23548i = z13;
        this.f23549j = c1705j;
    }

    /* JADX INFO: renamed from: e */
    public static C7439X m7801e(C7439X c7439x, C21891A c21891a, C0515d c0515d, boolean z6, C3077j c3077j, boolean z10, EnumC17264l enumC17264l, boolean z11, C1705j c1705j, int i10) {
        C21891A c21891a2 = (i10 & 1) != 0 ? c7439x.f23540a : c21891a;
        C0515d c0515d2 = (i10 & 2) != 0 ? c7439x.f23541b : c0515d;
        boolean z12 = c7439x.f23542c;
        boolean z13 = (i10 & 8) != 0 ? c7439x.f23543d : z6;
        boolean z14 = c7439x.f23544e;
        C3077j c3077j2 = (i10 & 32) != 0 ? c7439x.f23545f : c3077j;
        boolean z15 = (i10 & 64) != 0 ? c7439x.f23546g : z10;
        EnumC17264l whisperLanguage = (i10 & 128) != 0 ? c7439x.f23547h : enumC17264l;
        boolean z16 = (i10 & 256) != 0 ? c7439x.f23548i : z11;
        C1705j c1705j2 = (i10 & 512) != 0 ? c7439x.f23549j : c1705j;
        c7439x.getClass();
        AbstractC16544l.m18094g(whisperLanguage, "whisperLanguage");
        return new C7439X(c21891a2, c0515d2, z12, z13, z14, c3077j2, z15, whisperLanguage, z16, c1705j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7439X)) {
            return false;
        }
        C7439X c7439x = (C7439X) obj;
        return AbstractC16544l.m18089b(this.f23540a, c7439x.f23540a) && AbstractC16544l.m18089b(this.f23541b, c7439x.f23541b) && this.f23542c == c7439x.f23542c && this.f23543d == c7439x.f23543d && this.f23544e == c7439x.f23544e && AbstractC16544l.m18089b(this.f23545f, c7439x.f23545f) && this.f23546g == c7439x.f23546g && this.f23547h == c7439x.f23547h && this.f23548i == c7439x.f23548i && AbstractC16544l.m18089b(this.f23549j, c7439x.f23549j);
    }

    public final int hashCode() {
        C21891A c21891a = this.f23540a;
        int iHashCode = (c21891a == null ? 0 : c21891a.hashCode()) * 31;
        C0515d c0515d = this.f23541b;
        int iHashCode2 = (((((((iHashCode + (c0515d == null ? 0 : c0515d.hashCode())) * 31) + (this.f23542c ? 1231 : 1237)) * 31) + (this.f23543d ? 1231 : 1237)) * 31) + (this.f23544e ? 1231 : 1237)) * 31;
        C3077j c3077j = this.f23545f;
        int iHashCode3 = (((this.f23547h.hashCode() + ((((iHashCode2 + (c3077j == null ? 0 : c3077j.hashCode())) * 31) + (this.f23546g ? 1231 : 1237)) * 31)) * 31) + (this.f23548i ? 1231 : 1237)) * 31;
        C1705j c1705j = this.f23549j;
        return iHashCode3 + (c1705j != null ? c1705j.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
