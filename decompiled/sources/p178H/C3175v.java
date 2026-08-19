package p178H;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: H.v */
/* JADX INFO: loaded from: classes.dex */
public final class C3175v {

    /* JADX INFO: renamed from: c */
    public static final C3175v f9574c = new C3175v(0, 0);

    /* JADX INFO: renamed from: d */
    public static final C3175v f9575d = new C3175v(1, 8);

    /* JADX INFO: renamed from: e */
    public static final C3175v f9576e = new C3175v(3, 10);

    /* JADX INFO: renamed from: f */
    public static final C3175v f9577f = new C3175v(4, 10);

    /* JADX INFO: renamed from: g */
    public static final C3175v f9578g = new C3175v(5, 10);

    /* JADX INFO: renamed from: h */
    public static final C3175v f9579h = new C3175v(6, 10);

    /* JADX INFO: renamed from: i */
    public static final C3175v f9580i = new C3175v(6, 8);

    /* JADX INFO: renamed from: a */
    public final int f9581a;

    /* JADX INFO: renamed from: b */
    public final int f9582b;

    public C3175v(int i10, int i11) {
        this.f9581a = i10;
        this.f9582b = i11;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4022a() {
        return m4023b() && this.f9581a != 1 && this.f9582b == 10;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4023b() {
        int i10 = this.f9581a;
        return (i10 == 0 || i10 == 2 || this.f9582b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3175v)) {
            return false;
        }
        C3175v c3175v = (C3175v) obj;
        return this.f9581a == c3175v.f9581a && this.f9582b == c3175v.f9582b;
    }

    public final int hashCode() {
        return ((this.f9581a ^ 1000003) * 1000003) ^ this.f9582b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DynamicRange@");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("{encoding=");
        switch (this.f9581a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb2.append(str);
        sb2.append(", bitDepth=");
        return AbstractC10763a.m11056n(sb2, this.f9582b, "}");
    }
}
