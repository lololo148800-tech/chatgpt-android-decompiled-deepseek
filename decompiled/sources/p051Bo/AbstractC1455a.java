package p051Bo;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0653B;
import p026Ao.C0658G;
import p026Ao.C0675i;
import p1113xn.C21307a;

/* JADX INFO: renamed from: Bo.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1455a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f3825a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(C21307a.f67720a);
        AbstractC16544l.m18093f(bytes, "getBytes(...)");
        f3825a = bytes;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m2058a(C0658G c0658g, int i10, byte[] bArr, int i11) {
        int i12 = c0658g.f1926c;
        byte[] bArr2 = c0658g.f1924a;
        for (int i13 = 1; i13 < i11; i13++) {
            if (i10 == i12) {
                c0658g = c0658g.f1929f;
                AbstractC16544l.m18091d(c0658g);
                i10 = c0658g.f1925b;
                i12 = c0658g.f1926c;
                bArr2 = c0658g.f1924a;
            }
            if (bArr2[i10] != bArr[i13]) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final String m2059b(C0675i c0675i, long j10) throws EOFException {
        AbstractC16544l.m18094g(c0675i, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c0675i.m1422T(j11) == 13) {
                String strM1427Y0 = c0675i.m1427Y0(j11, C21307a.f67720a);
                c0675i.skip(2L);
                return strM1427Y0;
            }
        }
        String strM1427Y1 = c0675i.m1427Y0(j10, C21307a.f67720a);
        c0675i.skip(1L);
        return strM1427Y1;
    }

    /* JADX INFO: renamed from: c */
    public static final int m2060c(C0675i c0675i, C0653B options, boolean z6) {
        int i10;
        int i11;
        C0658G c0658g;
        byte[] bArr;
        int i12;
        AbstractC16544l.m18094g(c0675i, "<this>");
        AbstractC16544l.m18094g(options, "options");
        C0658G c0658g2 = c0675i.f1969Y;
        int i13 = -2;
        if (c0658g2 == null) {
            return z6 ? -2 : -1;
        }
        int i14 = c0658g2.f1925b;
        int i15 = c0658g2.f1926c;
        byte[] bArr2 = c0658g2.f1924a;
        C0658G c0658g3 = c0658g2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int[] iArr = options.f1909Z;
            int i19 = iArr[i17];
            int i20 = i17 + 2;
            int i21 = iArr[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (c0658g3 == null) {
                break;
            }
            if (i19 >= 0) {
                int i22 = i14 + 1;
                int i23 = bArr2[i14] & 255;
                int i24 = i20 + i19;
                while (i20 != i24) {
                    if (i23 == iArr[i20]) {
                        i10 = iArr[i20 + i19];
                        if (i22 == i15) {
                            c0658g3 = c0658g3.f1929f;
                            AbstractC16544l.m18091d(c0658g3);
                            i11 = c0658g3.f1925b;
                            i15 = c0658g3.f1926c;
                            bArr2 = c0658g3.f1924a;
                            if (c0658g3 == c0658g2) {
                                c0658g3 = null;
                            }
                        } else {
                            i11 = i22;
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i25 = (i19 * (-1)) + i20;
            while (true) {
                int i26 = i14 + 1;
                int i27 = i20 + 1;
                if ((bArr2[i14] & 255) != iArr[i20]) {
                    return i16;
                }
                boolean z10 = i27 == i25;
                if (i26 == i15) {
                    AbstractC16544l.m18091d(c0658g3);
                    C0658G c0658g4 = c0658g3.f1929f;
                    AbstractC16544l.m18091d(c0658g4);
                    i12 = c0658g4.f1925b;
                    int i28 = c0658g4.f1926c;
                    bArr = c0658g4.f1924a;
                    if (c0658g4 != c0658g2) {
                        c0658g = c0658g4;
                        i15 = i28;
                    } else {
                        if (!z10) {
                            break loop0;
                        }
                        i15 = i28;
                        c0658g = null;
                    }
                } else {
                    c0658g = c0658g3;
                    bArr = bArr2;
                    i12 = i26;
                }
                if (z10) {
                    i10 = iArr[i27];
                    i11 = i12;
                    bArr2 = bArr;
                    c0658g3 = c0658g;
                    break;
                }
                i14 = i12;
                bArr2 = bArr;
                c0658g3 = c0658g;
                i20 = i27;
            }
            if (i10 >= 0) {
                return i10;
            }
            i17 = -i10;
            i14 = i11;
            i13 = -2;
        }
        return z6 ? i13 : i16;
    }
}
