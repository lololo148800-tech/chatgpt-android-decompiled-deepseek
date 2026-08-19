package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1155zi.C21954Q0;
import p1155zi.C21962T0;
import p1155zi.C21965U0;

/* JADX INFO: renamed from: of.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C18174k extends AbstractC18176m {

    /* JADX INFO: renamed from: a */
    public final String f57978a;

    /* JADX INFO: renamed from: b */
    public final String f57979b;

    /* JADX INFO: renamed from: c */
    public final String f57980c;

    /* JADX INFO: renamed from: d */
    public final String f57981d;

    /* JADX INFO: renamed from: e */
    public final int f57982e;

    /* JADX INFO: renamed from: f */
    public final int f57983f;

    /* JADX INFO: renamed from: g */
    public final String f57984g;

    /* JADX INFO: renamed from: h */
    public final String f57985h;

    /* JADX INFO: renamed from: i */
    public final String f57986i;

    public C18174k(String str, String str2, String assetPointer, String str3, int i10, int i11, String str4, String str5, String str6) {
        AbstractC16544l.m18094g(assetPointer, "assetPointer");
        this.f57978a = str;
        this.f57979b = str2;
        this.f57980c = assetPointer;
        this.f57981d = str3;
        this.f57982e = i10;
        this.f57983f = i11;
        this.f57984g = str4;
        this.f57985h = str5;
        this.f57986i = str6;
    }

    @Override // p926of.AbstractC18176m
    /* JADX INFO: renamed from: a */
    public final int mo19718a() {
        return this.f57983f;
    }

    @Override // p926of.AbstractC18176m
    /* JADX INFO: renamed from: b */
    public final int mo19719b() {
        return this.f57982e;
    }

    @Override // p926of.AbstractC18176m
    /* JADX INFO: renamed from: c */
    public final String mo19720c() {
        return this.f57981d;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:22:0x002c  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18174k)) {
            return false;
        }
        C18174k c18174k = (C18174k) obj;
        String str = c18174k.f57978a;
        String str2 = this.f57978a;
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
        String str3 = this.f57979b;
        String str4 = c18174k.f57979b;
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
        return zM18089b2 && AbstractC16544l.m18089b(this.f57980c, c18174k.f57980c) && AbstractC16544l.m18089b(this.f57981d, c18174k.f57981d) && this.f57982e == c18174k.f57982e && this.f57983f == c18174k.f57983f && AbstractC16544l.m18089b(this.f57984g, c18174k.f57984g) && AbstractC16544l.m18089b(this.f57985h, c18174k.f57985h) && AbstractC16544l.m18089b(this.f57986i, c18174k.f57986i);
    }

    public final int hashCode() {
        String str = this.f57978a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57979b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f57980c);
        String str3 = this.f57981d;
        int iHashCode2 = (((((iM527p + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f57982e) * 31) + this.f57983f) * 31;
        String str4 = this.f57984g;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f57985h;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f57986i;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C18174k(String str, String str2, C21965U0 imageAssetPointer) {
        C21954Q0 c21954q0;
        C21954Q0 c21954q1;
        C21954Q0 c21954q2;
        C21954Q0 c21954q3;
        AbstractC16544l.m18094g(imageAssetPointer, "imageAssetPointer");
        String str3 = null;
        C21962T0 c21962t0 = imageAssetPointer.f69539f;
        String str4 = (c21962t0 == null || (c21954q3 = c21962t0.f69526a) == null) ? null : c21954q3.f69515d;
        String str5 = (c21962t0 == null || (c21954q2 = c21962t0.f69526a) == null) ? null : c21954q2.f69512a;
        String str6 = (c21962t0 == null || (c21954q1 = c21962t0.f69526a) == null) ? null : c21954q1.f69513b;
        if (c21962t0 != null && (c21954q0 = c21962t0.f69526a) != null) {
            str3 = c21954q0.f69514c;
        }
        this(str, str2, imageAssetPointer.f69534a, str4, imageAssetPointer.f69536c, imageAssetPointer.f69537d, str5, str6, str3);
    }

    public /* synthetic */ C18174k(String str, String str2, String str3, String str4, int i10, int i11, String str5, int i12) {
        this(str, str2, str3, str4, i10, i11, (i12 & 64) != 0 ? null : str5, null, null);
    }
}
