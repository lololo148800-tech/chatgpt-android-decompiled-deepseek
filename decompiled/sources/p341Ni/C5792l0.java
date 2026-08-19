package p341Ni;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1155zi.EnumC22033m2;
import p172Gi.EnumC3064F;

/* JADX INFO: renamed from: Ni.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5792l0 {

    /* JADX INFO: renamed from: a */
    public final String f18915a;

    /* JADX INFO: renamed from: b */
    public final String f18916b;

    /* JADX INFO: renamed from: c */
    public final String f18917c;

    /* JADX INFO: renamed from: d */
    public final String f18918d;

    /* JADX INFO: renamed from: e */
    public final String f18919e;

    /* JADX INFO: renamed from: f */
    public final String f18920f;

    /* JADX INFO: renamed from: g */
    public final boolean f18921g;

    /* JADX INFO: renamed from: h */
    public final boolean f18922h;

    /* JADX INFO: renamed from: i */
    public final boolean f18923i;

    /* JADX INFO: renamed from: j */
    public final String f18924j;

    /* JADX INFO: renamed from: k */
    public final EnumC22033m2 f18925k;

    /* JADX INFO: renamed from: l */
    public final EnumC3064F f18926l;

    /* JADX INFO: renamed from: m */
    public final String f18927m;

    public C5792l0(String str, String str2, String modelSlug, String str3, String str4, String str5, boolean z6, boolean z10, boolean z11, String str6, EnumC22033m2 voiceMode, EnumC3064F enumC3064F, String str7) {
        AbstractC16544l.m18094g(modelSlug, "modelSlug");
        AbstractC16544l.m18094g(voiceMode, "voiceMode");
        this.f18915a = str;
        this.f18916b = str2;
        this.f18917c = modelSlug;
        this.f18918d = str3;
        this.f18919e = str4;
        this.f18920f = str5;
        this.f18921g = z6;
        this.f18922h = z10;
        this.f18923i = z11;
        this.f18924j = str6;
        this.f18925k = voiceMode;
        this.f18926l = enumC3064F;
        this.f18927m = str7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:22:0x002c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0058  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        boolean zM18089b3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5792l0)) {
            return false;
        }
        C5792l0 c5792l0 = (C5792l0) obj;
        String str = c5792l0.f18915a;
        String str2 = this.f18915a;
        if (str2 == null) {
            if (str == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str2, str);
        }
        if (!zM18089b) {
            return false;
        }
        String str3 = this.f18916b;
        String str4 = c5792l0.f18916b;
        if (str3 == null) {
            if (str4 == null) {
                zM18089b2 = true;
            } else {
                zM18089b2 = false;
            }
        } else if (str4 == null) {
            zM18089b2 = false;
        } else {
            zM18089b2 = AbstractC16544l.m18089b(str3, str4);
        }
        if (!zM18089b2 || !AbstractC16544l.m18089b(this.f18917c, c5792l0.f18917c) || !AbstractC16544l.m18089b(this.f18918d, c5792l0.f18918d)) {
            return false;
        }
        String str5 = this.f18919e;
        String str6 = c5792l0.f18919e;
        if (str5 == null) {
            if (str6 == null) {
                zM18089b3 = true;
            } else {
                zM18089b3 = false;
            }
        } else if (str6 == null) {
            zM18089b3 = false;
        } else {
            zM18089b3 = AbstractC16544l.m18089b(str5, str6);
        }
        return zM18089b3 && AbstractC16544l.m18089b(this.f18920f, c5792l0.f18920f) && this.f18921g == c5792l0.f18921g && this.f18922h == c5792l0.f18922h && this.f18923i == c5792l0.f18923i && AbstractC16544l.m18089b(this.f18924j, c5792l0.f18924j) && this.f18925k == c5792l0.f18925k && this.f18926l == c5792l0.f18926l && AbstractC16544l.m18089b(this.f18927m, c5792l0.f18927m);
    }

    public final int hashCode() {
        String str = this.f18915a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18916b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f18917c);
        String str3 = this.f18918d;
        int iHashCode2 = (iM527p + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18919e;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18920f;
        int iHashCode4 = (((((((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31) + (this.f18921g ? 1231 : 1237)) * 31) + (this.f18922h ? 1231 : 1237)) * 31) + (this.f18923i ? 1231 : 1237)) * 31;
        String str6 = this.f18924j;
        int iHashCode5 = (this.f18926l.hashCode() + ((this.f18925k.hashCode() + ((iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31)) * 31;
        String str7 = this.f18927m;
        return iHashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
