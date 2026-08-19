package p1113xn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p315Me.Myis.CxcULo;
import p523V9.AbstractC7966P5;
import p571X9.AbstractC9381v3;

/* JADX INFO: renamed from: xn.w */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC21329w extends AbstractC21328v {
    /* JADX INFO: renamed from: h */
    public static String m21721h(char[] cArr, int i10, int i11) {
        AbstractC9381v3.m9953a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m21722i(CharSequence charSequence, CharSequence charSequence2) {
        boolean z6 = charSequence instanceof String;
        if (z6 && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z6 && (charSequence2 instanceof String)) {
            return AbstractC16544l.m18089b(charSequence, charSequence2);
        }
        if (charSequence != charSequence2) {
            if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
                int length = charSequence.length();
                for (int i10 = 0; i10 < length; i10++) {
                    if (charSequence.charAt(i10) == charSequence2.charAt(i10)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m21723j(CharSequence charSequence, String str) {
        if (charSequence instanceof String) {
            return str.equalsIgnoreCase((String) charSequence);
        }
        if (str != charSequence) {
            if (charSequence != null && str.length() == charSequence.length()) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    if (AbstractC7966P5.m8255c(str.charAt(i10), charSequence.charAt(i10), true)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static String m21724k(byte[] bArr, int i10, int i11) {
        AbstractC9381v3.m9953a(0, i10, bArr.length);
        return new String(bArr, 0, i10, C21307a.f67720a);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m21725l(String str, String suffix, boolean z6) {
        AbstractC16544l.m18094g(str, "<this>");
        AbstractC16544l.m18094g(suffix, "suffix");
        return !z6 ? str.endsWith(suffix) : m21728o(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m21726m(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: n */
    public static final void m21727n(String str) {
        throw new NumberFormatException(AbstractC10763a.m11047e('\'', "Invalid number format: '", str));
    }

    /* JADX INFO: renamed from: o */
    public static boolean m21728o(int i10, int i11, int i12, String str, String other, boolean z6) {
        AbstractC16544l.m18094g(str, "<this>");
        AbstractC16544l.m18094g(other, "other");
        return !z6 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z6, i10, other, i11, i12);
    }

    /* JADX INFO: renamed from: p */
    public static String m21729p(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        AbstractC16544l.m18091d(string);
        return string;
    }

    /* JADX INFO: renamed from: q */
    public static String m21730q(String str, char c9, char c10) {
        AbstractC16544l.m18094g(str, "<this>");
        String strReplace = str.replace(c9, c10);
        AbstractC16544l.m18093f(strReplace, "replace(...)");
        return strReplace;
    }

    /* JADX INFO: renamed from: r */
    public static String m21731r(String str, String oldValue, String newValue) {
        AbstractC16544l.m18094g(str, "<this>");
        AbstractC16544l.m18094g(oldValue, "oldValue");
        AbstractC16544l.m18094g(newValue, "newValue");
        int iM21676J = AbstractC21322p.m21676J(0, str, oldValue, false);
        if (iM21676J < 0) {
            return str;
        }
        int length = oldValue.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb2.append((CharSequence) str, i11, iM21676J);
            sb2.append(newValue);
            i11 = iM21676J + length;
            if (iM21676J >= str.length()) {
                break;
            }
            iM21676J = AbstractC21322p.m21676J(iM21676J + i10, str, oldValue, false);
        } while (iM21676J > 0);
        sb2.append((CharSequence) str, i11, str.length());
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: s */
    public static String m21732s(String str, String str2, String str3) {
        AbstractC16544l.m18094g(str, "<this>");
        int iM21679M = AbstractC21322p.m21679M(str, str2, 0, false, 2);
        return iM21679M < 0 ? str : AbstractC21322p.m21692Z(str, iM21679M, str2.length() + iM21679M, str3).toString();
    }

    /* JADX INFO: renamed from: u */
    public static boolean m21734u(String str, String prefix, boolean z6) {
        AbstractC16544l.m18094g(str, "<this>");
        AbstractC16544l.m18094g(prefix, "prefix");
        return !z6 ? str.startsWith(prefix) : m21728o(0, 0, prefix.length(), str, prefix, z6);
    }

    /* JADX INFO: renamed from: v */
    public static Integer m21735v(int i10, String str) {
        boolean z6;
        int i11;
        int i12;
        AbstractC16544l.m18094g(str, "<this>");
        AbstractC7966P5.m8254b(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        int i14 = -2147483647;
        if (AbstractC16544l.m18096i(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z6 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i14 = Integer.MIN_VALUE;
                z6 = true;
            }
        } else {
            z6 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), i10);
            if (iDigit < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + iDigit) {
                return null;
            }
            i13 = i12 - iDigit;
            i11++;
        }
        return z6 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    /* JADX INFO: renamed from: w */
    public static Integer m21736w(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        return m21735v(10, str);
    }

    /* JADX INFO: renamed from: x */
    public static Long m21737x(int i10, String str) {
        boolean z6;
        AbstractC16544l.m18094g(str, "<this>");
        AbstractC7966P5.m8254b(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (AbstractC16544l.m18096i(cCharAt, 48) < 0) {
            z6 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z6 = false;
                i11 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i11 = 1;
            }
        } else {
            z6 = false;
        }
        long j11 = -256204778801521550L;
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), i10);
            if (iDigit < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 == j11) {
                    j13 = j10 / ((long) i10);
                    if (j12 < j13) {
                    }
                }
                return null;
            }
            long j14 = j12 * ((long) i10);
            long j15 = iDigit;
            if (j14 < j10 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i11++;
            j11 = -256204778801521550L;
        }
        return z6 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }

    /* JADX INFO: renamed from: y */
    public static Long m21738y(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        return m21737x(10, str);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m21733t(int i10, String str, String prefix, boolean z6) {
        AbstractC16544l.m18094g(str, CxcULo.NDRMUqcYAyFIaNr);
        AbstractC16544l.m18094g(prefix, "prefix");
        return !z6 ? str.startsWith(prefix, i10) : m21728o(i10, 0, prefix.length(), str, prefix, z6);
    }
}
