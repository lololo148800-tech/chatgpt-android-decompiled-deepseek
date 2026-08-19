package p1113xn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17321x;
import p571X9.AbstractC9381v3;

/* JADX INFO: renamed from: xn.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC21311e {

    /* JADX INFO: renamed from: a */
    public static final int[] f67734a;

    /* JADX INFO: renamed from: b */
    public static final int[] f67735b;

    /* JADX INFO: renamed from: c */
    public static final long[] f67736c;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f67734a = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        f67735b = iArr2;
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f67736c = jArr;
    }

    /* JADX INFO: renamed from: a */
    public static final int m21649a(long j10) {
        if (0 <= j10 && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) C17321x.m18982b(j10)));
    }

    /* JADX INFO: renamed from: b */
    public static final void m21650b(int i10, int i11, String str) {
        int i12 = i11 - i10;
        if (i12 < 1) {
            String strSubstring = str.substring(i10, i11);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i10 + ", but was \"" + strSubstring + "\" of length " + i12);
        }
        if (i12 > 16) {
            int i13 = (i12 + i10) - 16;
            while (i10 < i13) {
                if (str.charAt(i10) != '0') {
                    StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbM11057o.append(str.charAt(i10));
                    sbM11057o.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbM11057o.toString());
                }
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m21651c(byte[] bArr, int i10, int[] iArr, char[] cArr, int i11) {
        int i12 = iArr[bArr[i10] & 255];
        cArr[i11] = (char) (i12 >> 8);
        cArr[i11 + 1] = (char) (i12 & 255);
        return i11 + 2;
    }

    /* JADX INFO: renamed from: d */
    public static long m21652d(int i10, int i11, String str) {
        C21314h format = C21314h.f67742d;
        AbstractC16544l.m18094g(format, "format");
        AbstractC9381v3.m9953a(i10, i11, str.length());
        if (format.f67745c.f67741a) {
            m21650b(i10, i11, str);
            return m21653e(i10, i11, str);
        }
        if (i11 - i10 > 0) {
            m21650b(i10, i11, str);
            return m21653e(i10, i11, str);
        }
        String strSubstring = str.substring(i10, i11);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    /* JADX INFO: renamed from: e */
    public static final long m21653e(int i10, int i11, String str) {
        long j10 = 0;
        while (i10 < i11) {
            long j11 = j10 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j12 = f67736c[cCharAt];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                    i10++;
                }
            }
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Expected a hexadecimal digit at index ", ", but was ");
            sbM11057o.append(str.charAt(i10));
            throw new NumberFormatException(sbM11057o.toString());
        }
        return j10;
    }

    /* JADX INFO: renamed from: f */
    public static final int m21654f(String str, char[] cArr, int i10) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i10);
            } else {
                cArr[i10] = str.charAt(0);
            }
        }
        return str.length() + i10;
    }
}
