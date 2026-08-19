package p406Qg;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p098Di.InterfaceC2062k;
import p1042uh.C20263a0;
import p1113xn.AbstractC21322p;
import p506Ug.C7671f;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Qg.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C6704O implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final Boolean f21537a;

    /* JADX INFO: renamed from: b */
    public final boolean f21538b;

    /* JADX INFO: renamed from: c */
    public final boolean f21539c;

    /* JADX INFO: renamed from: d */
    public final boolean f21540d;

    /* JADX INFO: renamed from: e */
    public final Float f21541e;

    /* JADX INFO: renamed from: f */
    public final List f21542f;

    /* JADX INFO: renamed from: g */
    public final String f21543g;

    /* JADX INFO: renamed from: h */
    public final boolean f21544h;

    /* JADX INFO: renamed from: i */
    public final List f21545i;

    /* JADX INFO: renamed from: j */
    public final C20263a0 f21546j;

    /* JADX INFO: renamed from: k */
    public final Object f21547k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public C6704O(Boolean bool, boolean z6, boolean z10, boolean z11, Float f10, List list, String query, boolean z12, List gizmos, C20263a0 c20263a0) {
        Object arrayList;
        AbstractC16544l.m18094g(query, "query");
        AbstractC16544l.m18094g(gizmos, "gizmos");
        this.f21537a = bool;
        this.f21538b = z6;
        this.f21539c = z10;
        this.f21540d = z11;
        this.f21541e = f10;
        this.f21542f = list;
        this.f21543g = query;
        this.f21544h = z12;
        this.f21545i = gizmos;
        this.f21546j = c20263a0;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (AbstractC21322p.m21667A(((C7671f) obj).f24192b, this.f21543g, true)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C17689w.f56480Y;
        }
        this.f21547k = arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static C6704O m7183e(C6704O c6704o, Boolean bool, boolean z6, boolean z10, Float f10, List list, String str, boolean z11, List list2, C20263a0 c20263a0, int i10) {
        Boolean bool2 = (i10 & 1) != 0 ? c6704o.f21537a : bool;
        boolean z12 = (i10 & 2) != 0 ? c6704o.f21538b : z6;
        boolean z13 = (i10 & 4) != 0 ? c6704o.f21539c : z10;
        boolean z14 = c6704o.f21540d;
        Float f11 = (i10 & 16) != 0 ? c6704o.f21541e : f10;
        List list3 = (i10 & 32) != 0 ? c6704o.f21542f : list;
        String query = (i10 & 64) != 0 ? c6704o.f21543g : str;
        boolean z15 = (i10 & 128) != 0 ? c6704o.f21544h : z11;
        List gizmos = (i10 & 256) != 0 ? c6704o.f21545i : list2;
        C20263a0 c20263a1 = (i10 & 512) != 0 ? c6704o.f21546j : c20263a0;
        c6704o.getClass();
        AbstractC16544l.m18094g(query, "query");
        AbstractC16544l.m18094g(gizmos, "gizmos");
        return new C6704O(bool2, z12, z13, z14, f11, list3, query, z15, gizmos, c20263a1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6704O)) {
            return false;
        }
        C6704O c6704o = (C6704O) obj;
        return AbstractC16544l.m18089b(this.f21537a, c6704o.f21537a) && this.f21538b == c6704o.f21538b && this.f21539c == c6704o.f21539c && this.f21540d == c6704o.f21540d && AbstractC16544l.m18089b(this.f21541e, c6704o.f21541e) && AbstractC16544l.m18089b(this.f21542f, c6704o.f21542f) && AbstractC16544l.m18089b(this.f21543g, c6704o.f21543g) && this.f21544h == c6704o.f21544h && AbstractC16544l.m18089b(this.f21545i, c6704o.f21545i) && AbstractC16544l.m18089b(this.f21546j, c6704o.f21546j);
    }

    public final int hashCode() {
        Boolean bool = this.f21537a;
        int iHashCode = (((((((bool == null ? 0 : bool.hashCode()) * 31) + (this.f21538b ? 1231 : 1237)) * 31) + (this.f21539c ? 1231 : 1237)) * 31) + (this.f21540d ? 1231 : 1237)) * 31;
        Float f10 = this.f21541e;
        int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        List list = this.f21542f;
        int iM15858x = AbstractC14376f.m15858x(this.f21545i, (AbstractC0168G.m527p((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f21543g) + (this.f21544h ? 1231 : 1237)) * 31, 31);
        C20263a0 c20263a0 = this.f21546j;
        return iM15858x + (c20263a0 != null ? c20263a0.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
