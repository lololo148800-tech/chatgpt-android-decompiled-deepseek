package p084D4;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import p1073w3.AbstractC20800b;
import p479Td.AbstractC7360k;

/* JADX INFO: renamed from: D4.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1951y0 {

    /* JADX INFO: renamed from: a */
    public int f5777a;

    /* JADX INFO: renamed from: b */
    public int f5778b;

    /* JADX INFO: renamed from: c */
    public int f5779c;

    /* JADX INFO: renamed from: d */
    public int f5780d;

    /* JADX INFO: renamed from: e */
    public int f5781e;

    /* JADX INFO: renamed from: b */
    public static C1951y0 m3131b(String str) {
        AbstractC20800b.m21316d(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), Separators.COMMA);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strM7787d = AbstractC7360k.m7787d(strArrSplit[i14].trim());
            strM7787d.getClass();
            switch (strM7787d) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i12 = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i13 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i12 == -1) {
            return null;
        }
        int length = strArrSplit.length;
        C1951y0 c1951y0 = new C1951y0();
        c1951y0.f5777a = i10;
        c1951y0.f5778b = i11;
        c1951y0.f5779c = i13;
        c1951y0.f5780d = i12;
        c1951y0.f5781e = length;
        return c1951y0;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3132a() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f5777a;
        int i14 = 2;
        if ((i13 & 7) != 0) {
            int i15 = this.f5780d;
            int i16 = this.f5778b;
            if (i15 > i16) {
                i12 = 1;
            } else {
                i12 = i15 == i16 ? 2 : 4;
            }
            if ((i12 & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 112) != 0) {
            int i17 = this.f5780d;
            int i18 = this.f5779c;
            if (i17 > i18) {
                i11 = 1;
            } else {
                i11 = i17 == i18 ? 2 : 4;
            }
            if (((i11 << 4) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 1792) != 0) {
            int i19 = this.f5781e;
            int i20 = this.f5778b;
            if (i19 > i20) {
                i10 = 1;
            } else {
                i10 = i19 == i20 ? 2 : 4;
            }
            if (((i10 << 8) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 28672) != 0) {
            int i21 = this.f5781e;
            int i22 = this.f5779c;
            if (i21 > i22) {
                i14 = 1;
            } else if (i21 != i22) {
                i14 = 4;
            }
            if ((i13 & (i14 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
