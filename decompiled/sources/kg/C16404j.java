package kg;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p1113xn.AbstractC21322p;
import p324Mn.C5554x;
import p775h2.AbstractC14376f;
import p872lg.C16946f;

/* JADX INFO: renamed from: kg.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C16404j implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f50916a;

    /* JADX INFO: renamed from: b */
    public final String f50917b;

    /* JADX INFO: renamed from: c */
    public final C5554x f50918c;

    /* JADX INFO: renamed from: d */
    public final String f50919d;

    /* JADX INFO: renamed from: e */
    public final String f50920e;

    /* JADX INFO: renamed from: f */
    public final C16946f f50921f;

    /* JADX INFO: renamed from: g */
    public final List f50922g;

    /* JADX INFO: renamed from: h */
    public final boolean f50923h;

    /* JADX INFO: renamed from: i */
    public final boolean f50924i;

    /* JADX INFO: renamed from: j */
    public final boolean f50925j;

    /* JADX INFO: renamed from: k */
    public final boolean f50926k;

    /* JADX INFO: renamed from: l */
    public final boolean f50927l;

    /* JADX INFO: renamed from: m */
    public final boolean f50928m;

    /* JADX INFO: renamed from: n */
    public final boolean f50929n;

    public C16404j(String str, String str2, C5554x c5554x, String str3, String str4, C16946f c16946f, List countries, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        AbstractC16544l.m18094g(countries, "countries");
        this.f50916a = str;
        this.f50917b = str2;
        this.f50918c = c5554x;
        this.f50919d = str3;
        this.f50920e = str4;
        this.f50921f = c16946f;
        this.f50922g = countries;
        this.f50923h = z6;
        this.f50924i = z10;
        this.f50925j = z11;
        this.f50926k = z12;
        this.f50927l = z13;
        boolean z15 = false;
        boolean z16 = true;
        if (str == null) {
            z14 = true;
            break;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= str.length()) {
                z14 = true;
                break;
            } else {
                if (Character.isDigit(str.charAt(i10))) {
                    z14 = false;
                    break;
                }
                i10++;
            }
        }
        this.f50928m = z14;
        if (str2 != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= str2.length()) {
                    z15 = true;
                    break;
                } else if (Character.isDigit(str2.charAt(i11))) {
                    break;
                } else {
                    i11++;
                }
            }
            z16 = z15;
        }
        this.f50929n = z16;
    }

    /* JADX INFO: renamed from: e */
    public static C16404j m18004e(C16404j c16404j, String str, String str2, C5554x c5554x, String str3, String str4, C16946f c16946f, List list, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        String str5 = (i10 & 1) != 0 ? c16404j.f50916a : str;
        String str6 = (i10 & 2) != 0 ? c16404j.f50917b : str2;
        C5554x c5554x2 = (i10 & 4) != 0 ? c16404j.f50918c : c5554x;
        String str7 = (i10 & 8) != 0 ? c16404j.f50919d : str3;
        String str8 = (i10 & 16) != 0 ? c16404j.f50920e : str4;
        C16946f c16946f2 = (i10 & 32) != 0 ? c16404j.f50921f : c16946f;
        List countries = (i10 & 64) != 0 ? c16404j.f50922g : list;
        boolean z14 = (i10 & 128) != 0 ? c16404j.f50923h : z6;
        boolean z15 = (i10 & 256) != 0 ? c16404j.f50924i : z10;
        boolean z16 = (i10 & 512) != 0 ? c16404j.f50925j : z11;
        boolean z17 = (i10 & 1024) != 0 ? c16404j.f50926k : z12;
        boolean z18 = (i10 & 2048) != 0 ? c16404j.f50927l : z13;
        c16404j.getClass();
        AbstractC16544l.m18094g(countries, "countries");
        return new C16404j(str5, str6, c5554x2, str7, str8, c16946f2, countries, z14, z15, z16, z17, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16404j)) {
            return false;
        }
        C16404j c16404j = (C16404j) obj;
        return AbstractC16544l.m18089b(this.f50916a, c16404j.f50916a) && AbstractC16544l.m18089b(this.f50917b, c16404j.f50917b) && AbstractC16544l.m18089b(this.f50918c, c16404j.f50918c) && AbstractC16544l.m18089b(this.f50919d, c16404j.f50919d) && AbstractC16544l.m18089b(this.f50920e, c16404j.f50920e) && AbstractC16544l.m18089b(this.f50921f, c16404j.f50921f) && AbstractC16544l.m18089b(this.f50922g, c16404j.f50922g) && this.f50923h == c16404j.f50923h && this.f50924i == c16404j.f50924i && this.f50925j == c16404j.f50925j && this.f50926k == c16404j.f50926k && this.f50927l == c16404j.f50927l;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m18005f() {
        String str;
        String str2;
        return (this.f50922g.isEmpty() || this.f50921f == null || (str = this.f50916a) == null || !(AbstractC21322p.m21681O(str) ^ true) || (str2 = this.f50917b) == null || !(AbstractC21322p.m21681O(str2) ^ true) || !this.f50928m || !this.f50929n || this.f50918c == null || (this.f50919d == null && this.f50927l)) ? false : true;
    }

    public final int hashCode() {
        String str = this.f50916a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f50917b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C5554x c5554x = this.f50918c;
        int iHashCode3 = (iHashCode2 + (c5554x == null ? 0 : c5554x.f18006Y.hashCode())) * 31;
        String str3 = this.f50919d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50920e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C16946f c16946f = this.f50921f;
        return ((((((((AbstractC14376f.m15858x(this.f50922g, (iHashCode5 + (c16946f != null ? c16946f.hashCode() : 0)) * 31, 31) + (this.f50923h ? 1231 : 1237)) * 31) + (this.f50924i ? 1231 : 1237)) * 31) + (this.f50925j ? 1231 : 1237)) * 31) + (this.f50926k ? 1231 : 1237)) * 31) + (this.f50927l ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
