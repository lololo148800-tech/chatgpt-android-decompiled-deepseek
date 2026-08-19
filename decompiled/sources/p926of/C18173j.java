package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.C21954Q0;
import p1155zi.C21962T0;
import p1155zi.C21965U0;

/* JADX INFO: renamed from: of.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C18173j {

    /* JADX INFO: renamed from: a */
    public final String f57968a;

    /* JADX INFO: renamed from: b */
    public final String f57969b;

    /* JADX INFO: renamed from: c */
    public final String f57970c;

    /* JADX INFO: renamed from: d */
    public final String f57971d;

    /* JADX INFO: renamed from: e */
    public final String f57972e;

    /* JADX INFO: renamed from: f */
    public final String f57973f;

    /* JADX INFO: renamed from: g */
    public final String f57974g;

    /* JADX INFO: renamed from: h */
    public final String f57975h;

    /* JADX INFO: renamed from: i */
    public final String f57976i;

    /* JADX INFO: renamed from: j */
    public final boolean f57977j;

    public C18173j(String assetPointer, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10) {
        str = (i10 & 2) != 0 ? null : str;
        str2 = (i10 & 4) != 0 ? null : str2;
        str3 = (i10 & 8) != 0 ? null : str3;
        str4 = (i10 & 16) != 0 ? null : str4;
        str5 = (i10 & 32) != 0 ? null : str5;
        str6 = (i10 & 64) != 0 ? null : str6;
        str7 = (i10 & 128) != 0 ? null : str7;
        str8 = (i10 & 256) != 0 ? null : str8;
        AbstractC16544l.m18094g(assetPointer, "assetPointer");
        this.f57968a = assetPointer;
        this.f57969b = str;
        this.f57970c = str2;
        this.f57971d = str3;
        this.f57972e = str4;
        this.f57973f = str5;
        this.f57974g = str6;
        this.f57975h = str7;
        this.f57976i = str8;
        this.f57977j = str != null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18173j)) {
            return false;
        }
        C18173j c18173j = (C18173j) obj;
        if (!AbstractC16544l.m18089b(this.f57968a, c18173j.f57968a) || !AbstractC16544l.m18089b(this.f57969b, c18173j.f57969b) || !AbstractC16544l.m18089b(this.f57970c, c18173j.f57970c)) {
            return false;
        }
        String str = this.f57971d;
        String str2 = c18173j.f57971d;
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
        return zM18089b && AbstractC16544l.m18089b(this.f57972e, c18173j.f57972e) && AbstractC16544l.m18089b(this.f57973f, c18173j.f57973f) && AbstractC16544l.m18089b(this.f57974g, c18173j.f57974g) && AbstractC16544l.m18089b(this.f57975h, c18173j.f57975h) && AbstractC16544l.m18089b(this.f57976i, c18173j.f57976i);
    }

    public final int hashCode() {
        int iHashCode = this.f57968a.hashCode() * 31;
        String str = this.f57969b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57970c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57971d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57972e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f57973f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f57974g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f57975h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f57976i;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C18173j(C21965U0 imageAssetPointer, String str) {
        C21954Q0 c21954q0;
        C21954Q0 c21954q1;
        C21954Q0 c21954q2;
        C21954Q0 c21954q3;
        AbstractC16544l.m18094g(imageAssetPointer, "imageAssetPointer");
        String str2 = null;
        C21962T0 c21962t0 = imageAssetPointer.f69539f;
        String str3 = (c21962t0 == null || (c21954q3 = c21962t0.f69526a) == null) ? null : c21954q3.f69512a;
        String str4 = (c21962t0 == null || (c21954q2 = c21962t0.f69526a) == null) ? null : c21954q2.f69513b;
        String str5 = (c21962t0 == null || (c21954q1 = c21962t0.f69526a) == null) ? null : c21954q1.f69515d;
        if (c21962t0 != null && (c21954q0 = c21962t0.f69526a) != null) {
            str2 = c21954q0.f69514c;
        }
        this(imageAssetPointer.f69534a, str3, str4, str, str5, str2, null, null, null, 448);
    }
}
