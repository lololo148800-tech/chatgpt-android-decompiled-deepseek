package p552Wg;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p1155zi.C22013h2;
import p324Mn.C5551u;
import p621Zd.C10282c;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Wg.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C8856r implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f27110a;

    /* JADX INFO: renamed from: b */
    public final String f27111b;

    /* JADX INFO: renamed from: c */
    public final boolean f27112c;

    /* JADX INFO: renamed from: d */
    public final List f27113d;

    /* JADX INFO: renamed from: e */
    public final C22013h2 f27114e;

    /* JADX INFO: renamed from: f */
    public final C5551u f27115f;

    /* JADX INFO: renamed from: g */
    public final C10282c f27116g;

    /* JADX INFO: renamed from: h */
    public final boolean f27117h;

    /* JADX INFO: renamed from: i */
    public final String f27118i;

    /* JADX INFO: renamed from: j */
    public final boolean f27119j;

    public C8856r(String str, String str2, boolean z6, List conversationItems, C22013h2 c22013h2, C5551u c5551u, C10282c c10282c, boolean z10, String str3, boolean z11) {
        AbstractC16544l.m18094g(conversationItems, "conversationItems");
        this.f27110a = str;
        this.f27111b = str2;
        this.f27112c = z6;
        this.f27113d = conversationItems;
        this.f27114e = c22013h2;
        this.f27115f = c5551u;
        this.f27116g = c10282c;
        this.f27117h = z10;
        this.f27118i = str3;
        this.f27119j = z11;
    }

    /* JADX INFO: renamed from: e */
    public static C8856r m9546e(C8856r c8856r, String str, String str2, boolean z6, ArrayList arrayList, C22013h2 c22013h2, C5551u c5551u, C10282c c10282c, boolean z10, String str3, boolean z11, int i10) {
        String str4 = (i10 & 1) != 0 ? c8856r.f27110a : str;
        String str5 = (i10 & 2) != 0 ? c8856r.f27111b : str2;
        boolean z12 = (i10 & 4) != 0 ? c8856r.f27112c : z6;
        List conversationItems = (i10 & 8) != 0 ? c8856r.f27113d : arrayList;
        C22013h2 c22013h3 = (i10 & 16) != 0 ? c8856r.f27114e : c22013h2;
        C5551u c5551u2 = (i10 & 32) != 0 ? c8856r.f27115f : c5551u;
        C10282c c10282c2 = (i10 & 64) != 0 ? c8856r.f27116g : c10282c;
        boolean z13 = (i10 & 128) != 0 ? c8856r.f27117h : z10;
        String str6 = (i10 & 256) != 0 ? c8856r.f27118i : str3;
        boolean z14 = (i10 & 512) != 0 ? c8856r.f27119j : z11;
        c8856r.getClass();
        AbstractC16544l.m18094g(conversationItems, "conversationItems");
        return new C8856r(str4, str5, z12, conversationItems, c22013h3, c5551u2, c10282c2, z13, str6, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8856r)) {
            return false;
        }
        C8856r c8856r = (C8856r) obj;
        return AbstractC16544l.m18089b(this.f27110a, c8856r.f27110a) && AbstractC16544l.m18089b(this.f27111b, c8856r.f27111b) && this.f27112c == c8856r.f27112c && AbstractC16544l.m18089b(this.f27113d, c8856r.f27113d) && AbstractC16544l.m18089b(this.f27114e, c8856r.f27114e) && AbstractC16544l.m18089b(this.f27115f, c8856r.f27115f) && AbstractC16544l.m18089b(this.f27116g, c8856r.f27116g) && this.f27117h == c8856r.f27117h && AbstractC16544l.m18089b(this.f27118i, c8856r.f27118i) && this.f27119j == c8856r.f27119j;
    }

    public final int hashCode() {
        String str = this.f27110a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f27111b;
        int iM15858x = AbstractC14376f.m15858x(this.f27113d, (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.f27112c ? 1231 : 1237)) * 31, 31);
        C22013h2 c22013h2 = this.f27114e;
        int iHashCode2 = (iM15858x + (c22013h2 == null ? 0 : c22013h2.hashCode())) * 31;
        C5551u c5551u = this.f27115f;
        int iHashCode3 = (iHashCode2 + (c5551u == null ? 0 : c5551u.f18004Y.hashCode())) * 31;
        C10282c c10282c = this.f27116g;
        int iHashCode4 = (((iHashCode3 + (c10282c == null ? 0 : c10282c.hashCode())) * 31) + (this.f27117h ? 1231 : 1237)) * 31;
        String str3 = this.f27118i;
        return ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f27119j ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
