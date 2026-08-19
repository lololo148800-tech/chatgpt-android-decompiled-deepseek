package tf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p749fd.EnumC13617b;
import p909nm.AbstractC17680n;
import p926of.C18173j;

/* JADX INFO: renamed from: tf.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C19906K implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final List f63076a;

    /* JADX INFO: renamed from: b */
    public final int f63077b;

    /* JADX INFO: renamed from: c */
    public final int f63078c;

    /* JADX INFO: renamed from: d */
    public final boolean f63079d;

    /* JADX INFO: renamed from: e */
    public final boolean f63080e;

    /* JADX INFO: renamed from: f */
    public final boolean f63081f;

    /* JADX INFO: renamed from: g */
    public final EnumC13617b f63082g;

    /* JADX INFO: renamed from: h */
    public final boolean f63083h;

    /* JADX INFO: renamed from: i */
    public final boolean f63084i;

    /* JADX INFO: renamed from: j */
    public final boolean f63085j;

    /* JADX INFO: renamed from: k */
    public final boolean f63086k;

    /* JADX INFO: renamed from: l */
    public final String f63087l;

    /* JADX INFO: renamed from: m */
    public final String f63088m;

    /* JADX INFO: renamed from: n */
    public final boolean f63089n;

    /* JADX INFO: renamed from: o */
    public final String f63090o;

    /* JADX INFO: renamed from: p */
    public final boolean f63091p;

    /* JADX INFO: renamed from: q */
    public final C18173j f63092q;

    /* JADX INFO: renamed from: r */
    public final String f63093r;

    /* JADX INFO: renamed from: s */
    public final String f63094s;

    /* JADX INFO: renamed from: t */
    public final boolean f63095t;

    /* JADX INFO: renamed from: u */
    public final boolean f63096u;

    /* JADX INFO: renamed from: v */
    public final boolean f63097v;

    /* JADX INFO: renamed from: w */
    public final boolean f63098w;

    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    public C19906K(List list, int i10, int i11, boolean z6, boolean z10, boolean z11, EnumC13617b mode, boolean z12, boolean z13, boolean z14, boolean z15, String str, String str2, boolean z16, String str3, boolean z17) {
        boolean z18;
        boolean z19;
        String str4 = str;
        AbstractC16544l.m18094g(mode, "mode");
        this.f63076a = list;
        this.f63077b = i10;
        this.f63078c = i11;
        this.f63079d = z6;
        this.f63080e = z10;
        this.f63081f = z11;
        this.f63082g = mode;
        this.f63083h = z12;
        this.f63084i = z13;
        this.f63085j = z14;
        this.f63086k = z15;
        this.f63087l = str4;
        this.f63088m = str2;
        this.f63089n = z16;
        this.f63090o = str3;
        this.f63091p = z17;
        C18173j c18173j = list != null ? (C18173j) AbstractC17680n.m19344T(i11, list) : null;
        this.f63092q = c18173j;
        String str5 = c18173j != null ? c18173j.f57969b : null;
        this.f63093r = str5;
        String str6 = c18173j != null ? c18173j.f57968a : null;
        this.f63094s = str6 == null ? "" : str6;
        boolean z20 = false;
        boolean z21 = str5 != null;
        this.f63095t = z21;
        if (z21 && z12 && z14) {
            if (!z15) {
                if (!AbstractC16544l.m18089b(str4 == null ? null : str4, "g-2fkFE8rbu")) {
                    if ((str4 == null ? null : str4) != null) {
                        z18 = false;
                    }
                }
            }
            z18 = true;
        } else {
            z18 = false;
        }
        this.f63096u = z18;
        if (str5 == null) {
            z19 = false;
        } else {
            if ((c18173j != null ? c18173j.f57971d : null) != null) {
                z19 = true;
            } else {
                z19 = false;
            }
        }
        this.f63097v = z19;
        if (z14) {
            if ((c18173j != null ? c18173j.f57972e : null) != null || z19) {
                z20 = true;
            }
        }
        this.f63098w = z20;
    }

    /* JADX INFO: renamed from: e */
    public static C19906K m20796e(C19906K c19906k, List list, int i10, int i11, boolean z6, boolean z10, boolean z11, EnumC13617b enumC13617b, boolean z12, boolean z13, String str, boolean z14, String str2, boolean z15, int i12) {
        List list2 = (i12 & 1) != 0 ? c19906k.f63076a : list;
        int i13 = (i12 & 2) != 0 ? c19906k.f63077b : i10;
        int i14 = (i12 & 4) != 0 ? c19906k.f63078c : i11;
        boolean z16 = (i12 & 8) != 0 ? c19906k.f63079d : z6;
        boolean z17 = (i12 & 16) != 0 ? c19906k.f63080e : z10;
        boolean z18 = (i12 & 32) != 0 ? c19906k.f63081f : z11;
        EnumC13617b mode = (i12 & 64) != 0 ? c19906k.f63082g : enumC13617b;
        boolean z19 = (i12 & 128) != 0 ? c19906k.f63083h : z12;
        boolean z20 = (i12 & 256) != 0 ? c19906k.f63084i : z13;
        boolean z21 = c19906k.f63085j;
        boolean z22 = c19906k.f63086k;
        String str3 = c19906k.f63087l;
        String str4 = (i12 & 4096) != 0 ? c19906k.f63088m : str;
        boolean z23 = (i12 & 8192) != 0 ? c19906k.f63089n : z14;
        String str5 = (i12 & 16384) != 0 ? c19906k.f63090o : str2;
        boolean z24 = (i12 & 32768) != 0 ? c19906k.f63091p : z15;
        c19906k.getClass();
        AbstractC16544l.m18094g(mode, "mode");
        return new C19906K(list2, i13, i14, z16, z17, z18, mode, z19, z20, z21, z22, str3, str4, z23, str5, z24);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0067  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19906K)) {
            return false;
        }
        C19906K c19906k = (C19906K) obj;
        if (!AbstractC16544l.m18089b(this.f63076a, c19906k.f63076a) || this.f63077b != c19906k.f63077b || this.f63078c != c19906k.f63078c || this.f63079d != c19906k.f63079d || this.f63080e != c19906k.f63080e || this.f63081f != c19906k.f63081f || this.f63082g != c19906k.f63082g || this.f63083h != c19906k.f63083h || this.f63084i != c19906k.f63084i || this.f63085j != c19906k.f63085j || this.f63086k != c19906k.f63086k) {
            return false;
        }
        String str = this.f63087l;
        String str2 = c19906k.f63087l;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f63088m, c19906k.f63088m) && this.f63089n == c19906k.f63089n && AbstractC16544l.m18089b(this.f63090o, c19906k.f63090o) && this.f63091p == c19906k.f63091p;
    }

    public final int hashCode() {
        List list = this.f63076a;
        int iHashCode = (((((((((this.f63082g.hashCode() + ((((((((((((list == null ? 0 : list.hashCode()) * 31) + this.f63077b) * 31) + this.f63078c) * 31) + (this.f63079d ? 1231 : 1237)) * 31) + (this.f63080e ? 1231 : 1237)) * 31) + (this.f63081f ? 1231 : 1237)) * 31)) * 31) + (this.f63083h ? 1231 : 1237)) * 31) + (this.f63084i ? 1231 : 1237)) * 31) + (this.f63085j ? 1231 : 1237)) * 31) + (this.f63086k ? 1231 : 1237)) * 31;
        String str = this.f63087l;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f63088m;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.f63089n ? 1231 : 1237)) * 31;
        String str3 = this.f63090o;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f63091p ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
