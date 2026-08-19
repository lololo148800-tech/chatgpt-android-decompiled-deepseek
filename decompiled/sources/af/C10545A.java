package af;

import bf.C11349D;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: af.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C10545A implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f31301a;

    /* JADX INFO: renamed from: b */
    public final C11349D f31302b;

    /* JADX INFO: renamed from: c */
    public final Integer f31303c;

    /* JADX INFO: renamed from: d */
    public final Integer f31304d;

    /* JADX INFO: renamed from: e */
    public final String f31305e;

    /* JADX INFO: renamed from: f */
    public final boolean f31306f;

    /* JADX INFO: renamed from: g */
    public final String f31307g;

    /* JADX INFO: renamed from: h */
    public final boolean f31308h;

    /* JADX INFO: renamed from: i */
    public final boolean f31309i;

    public C10545A(String gizmoId, C11349D c11349d, Integer num, Integer num2, String str, boolean z6, String str2, boolean z10, boolean z11) {
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        this.f31301a = gizmoId;
        this.f31302b = c11349d;
        this.f31303c = num;
        this.f31304d = num2;
        this.f31305e = str;
        this.f31306f = z6;
        this.f31307g = str2;
        this.f31308h = z10;
        this.f31309i = z11;
    }

    /* JADX INFO: renamed from: e */
    public static C10545A m10981e(C10545A c10545a, C11349D c11349d, Integer num, Integer num2, String str, boolean z6, String str2, boolean z10, boolean z11, int i10) {
        String gizmoId = c10545a.f31301a;
        C11349D c11349d2 = (i10 & 2) != 0 ? c10545a.f31302b : c11349d;
        Integer num3 = (i10 & 4) != 0 ? c10545a.f31303c : num;
        Integer num4 = (i10 & 8) != 0 ? c10545a.f31304d : num2;
        String str3 = (i10 & 16) != 0 ? c10545a.f31305e : str;
        boolean z12 = (i10 & 32) != 0 ? c10545a.f31306f : z6;
        String str4 = (i10 & 64) != 0 ? c10545a.f31307g : str2;
        boolean z13 = (i10 & 128) != 0 ? c10545a.f31308h : z10;
        boolean z14 = (i10 & 256) != 0 ? c10545a.f31309i : z11;
        c10545a.getClass();
        AbstractC16544l.m18094g(gizmoId, "gizmoId");
        return new C10545A(gizmoId, c11349d2, num3, num4, str3, z12, str4, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10545A)) {
            return false;
        }
        C10545A c10545a = (C10545A) obj;
        return AbstractC16544l.m18089b(this.f31301a, c10545a.f31301a) && AbstractC16544l.m18089b(this.f31302b, c10545a.f31302b) && AbstractC16544l.m18089b(this.f31303c, c10545a.f31303c) && AbstractC16544l.m18089b(this.f31304d, c10545a.f31304d) && AbstractC16544l.m18089b(this.f31305e, c10545a.f31305e) && this.f31306f == c10545a.f31306f && AbstractC16544l.m18089b(this.f31307g, c10545a.f31307g) && this.f31308h == c10545a.f31308h && this.f31309i == c10545a.f31309i;
    }

    public final int hashCode() {
        int iHashCode = this.f31301a.hashCode() * 31;
        C11349D c11349d = this.f31302b;
        int iHashCode2 = (iHashCode + (c11349d == null ? 0 : c11349d.hashCode())) * 31;
        Integer num = this.f31303c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f31304d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f31305e;
        int iHashCode5 = (((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + (this.f31306f ? 1231 : 1237)) * 31;
        String str2 = this.f31307g;
        return ((((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f31308h ? 1231 : 1237)) * 31) + (this.f31309i ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
