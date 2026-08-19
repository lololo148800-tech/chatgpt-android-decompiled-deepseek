package p1016t3;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Arrays;
import p1073w3.AbstractC20817s;
import p571X9.AbstractC9306j0;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: t3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C19781h {

    /* JADX INFO: renamed from: h */
    public static final C19781h f62674h = new C19781h(1, 2, 3, -1, -1, null);

    /* JADX INFO: renamed from: a */
    public final int f62675a;

    /* JADX INFO: renamed from: b */
    public final int f62676b;

    /* JADX INFO: renamed from: c */
    public final int f62677c;

    /* JADX INFO: renamed from: d */
    public final byte[] f62678d;

    /* JADX INFO: renamed from: e */
    public final int f62679e;

    /* JADX INFO: renamed from: f */
    public final int f62680f;

    /* JADX INFO: renamed from: g */
    public int f62681g;

    static {
        AbstractC17792x.m19540w(0, 1, 2, 3, 4);
        AbstractC20817s.m21425z(5);
    }

    public C19781h(int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f62675a = i10;
        this.f62676b = i11;
        this.f62677c = i12;
        this.f62678d = bArr;
        this.f62679e = i13;
        this.f62680f = i14;
    }

    /* JADX INFO: renamed from: a */
    public static String m20737a(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 != 1) {
            return i10 != 2 ? AbstractC10763a.m11048f(i10, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    /* JADX INFO: renamed from: b */
    public static String m20738b(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 != 1) {
            return i10 != 2 ? AbstractC10763a.m11048f(i10, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    /* JADX INFO: renamed from: c */
    public static String m20739c(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 != 6) {
            return i10 != 7 ? AbstractC10763a.m11048f(i10, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    /* JADX INFO: renamed from: e */
    public static boolean m20740e(C19781h c19781h) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (c19781h == null) {
            return true;
        }
        int i14 = c19781h.f62675a;
        return (i14 == -1 || i14 == 1 || i14 == 2) && ((i10 = c19781h.f62676b) == -1 || i10 == 2) && (((i11 = c19781h.f62677c) == -1 || i11 == 3) && c19781h.f62678d == null && (((i12 = c19781h.f62680f) == -1 || i12 == 8) && ((i13 = c19781h.f62679e) == -1 || i13 == 8)));
    }

    /* JADX INFO: renamed from: f */
    public static int m20741f(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    /* JADX INFO: renamed from: g */
    public static int m20742g(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m20743d() {
        return (this.f62675a == -1 || this.f62676b == -1 || this.f62677c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19781h.class != obj.getClass()) {
            return false;
        }
        C19781h c19781h = (C19781h) obj;
        return this.f62675a == c19781h.f62675a && this.f62676b == c19781h.f62676b && this.f62677c == c19781h.f62677c && Arrays.equals(this.f62678d, c19781h.f62678d) && this.f62679e == c19781h.f62679e && this.f62680f == c19781h.f62680f;
    }

    public final int hashCode() {
        if (this.f62681g == 0) {
            this.f62681g = ((((Arrays.hashCode(this.f62678d) + ((((((527 + this.f62675a) * 31) + this.f62676b) * 31) + this.f62677c) * 31)) * 31) + this.f62679e) * 31) + this.f62680f;
        }
        return this.f62681g;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(m20738b(this.f62675a));
        sb2.append(", ");
        sb2.append(m20737a(this.f62676b));
        sb2.append(", ");
        sb2.append(m20739c(this.f62677c));
        sb2.append(", ");
        sb2.append(this.f62678d != null);
        sb2.append(", ");
        String str2 = "NA";
        int i10 = this.f62679e;
        if (i10 != -1) {
            str = i10 + "bit Luma";
        } else {
            str = "NA";
        }
        sb2.append(str);
        sb2.append(", ");
        int i11 = this.f62680f;
        if (i11 != -1) {
            str2 = i11 + "bit Chroma";
        }
        return AbstractC9306j0.m9891j(str2, Separators.RPAREN, sb2);
    }
}
