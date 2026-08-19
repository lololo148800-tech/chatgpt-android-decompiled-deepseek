package p1113xn;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p025An.C0650z;
import p030B2.C0740V;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p1091wn.AbstractC21031l;
import p200Hm.C3506e;
import p200Hm.C3508g;
import p379Pb.LVf.efyhmdM;
import p523V9.AbstractC7966P5;
import p571X9.AbstractC9393x3;
import p606Yn.C10107h;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: xn.p */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC21322p extends AbstractC21329w {
    /* JADX INFO: renamed from: A */
    public static boolean m21667A(CharSequence charSequence, CharSequence other, boolean z6) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        AbstractC16544l.m18094g(other, "other");
        if (other instanceof String) {
            if (m21679M(charSequence, (String) other, 0, z6, 2) < 0) {
                return false;
            }
        } else if (m21677K(charSequence, other, 0, charSequence.length(), z6, false) < 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m21668B(CharSequence charSequence, char c9) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        return m21678L(charSequence, c9, 0, false, 2) >= 0;
    }

    /* JADX INFO: renamed from: C */
    public static String m21669C(int i10, String str) {
        AbstractC16544l.m18094g(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(i10);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: D */
    public static String m21670D(int i10, String str) {
        AbstractC16544l.m18094g(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length() - i10;
        if (length < 0) {
            length = 0;
        }
        return m21709q0(length, str);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m21671E(CharSequence charSequence, char c9) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        return charSequence.length() > 0 && AbstractC7966P5.m8255c(charSequence.charAt(m21674H(charSequence)), c9, false);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m21672F(CharSequence charSequence, String str) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        return charSequence instanceof String ? AbstractC21329w.m21725l((String) charSequence, str, false) : m21687U(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: G */
    public static char m21673G(CharSequence charSequence) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX INFO: renamed from: H */
    public static int m21674H(CharSequence charSequence) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m21675I(int i10, CharSequence charSequence) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        return i10 >= 0 && i10 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i10)) && Character.isLowSurrogate(charSequence.charAt(i10 + 1));
    }

    /* JADX INFO: renamed from: J */
    public static final int m21676J(int i10, CharSequence charSequence, String string, boolean z6) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        AbstractC16544l.m18094g(string, "string");
        return (z6 || !(charSequence instanceof String)) ? m21677K(charSequence, string, i10, charSequence.length(), z6, false) : ((String) charSequence).indexOf(string, i10);
    }

    /* JADX INFO: renamed from: K */
    public static final int m21677K(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z6, boolean z10) {
        C3506e c3506e;
        if (z10) {
            int iM21674H = m21674H(charSequence);
            if (i10 > iM21674H) {
                i10 = iM21674H;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            c3506e = new C3506e(i10, i11, -1);
        } else {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            c3506e = new C3508g(i10, i11, 1);
        }
        boolean z11 = charSequence instanceof String;
        int i12 = c3506e.f10593o0;
        int i13 = c3506e.f10592Z;
        int i14 = c3506e.f10591Y;
        if (z11 && (charSequence2 instanceof String)) {
            if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
                while (true) {
                    String str = (String) charSequence2;
                    if (AbstractC21329w.m21728o(0, i14, str.length(), str, (String) charSequence, z6)) {
                        return i14;
                    }
                    if (i14 != i13) {
                        i14 += i12;
                    }
                }
            }
        } else if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
            while (!m21687U(charSequence2, 0, charSequence, i14, charSequence2.length(), z6)) {
                if (i14 != i13) {
                    i14 += i12;
                }
            }
            return i14;
        }
        return -1;
    }

    /* JADX INFO: renamed from: L */
    public static int m21678L(CharSequence charSequence, char c9, int i10, boolean z6, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z6 = false;
        }
        AbstractC16544l.m18094g(charSequence, "<this>");
        return (z6 || !(charSequence instanceof String)) ? m21680N(charSequence, new char[]{c9}, i10, z6) : ((String) charSequence).indexOf(c9, i10);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ int m21679M(CharSequence charSequence, String str, int i10, boolean z6, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z6 = false;
        }
        return m21676J(i10, charSequence, str, z6);
    }

    /* JADX INFO: renamed from: N */
    public static final int m21680N(CharSequence charSequence, char[] chars, int i10, boolean z6) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        AbstractC16544l.m18094g(chars, "chars");
        if (!z6 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC17678l.m19287J(chars), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iM21674H = m21674H(charSequence);
        if (i10 > iM21674H) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i10);
            for (char c9 : chars) {
                if (AbstractC7966P5.m8255c(c9, cCharAt, z6)) {
                    return i10;
                }
            }
            if (i10 == iM21674H) {
                return -1;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: O */
    public static boolean m21681O(CharSequence charSequence) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!AbstractC7966P5.m8258f(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: P */
    public static char m21682P(CharSequence charSequence) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(m21674H(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX INFO: renamed from: Q */
    public static int m21683Q(CharSequence charSequence, char c9, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = m21674H(charSequence);
        }
        AbstractC16544l.m18094g(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c9, i10);
        }
        char[] cArr = {c9};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(AbstractC17678l.m19287J(cArr), i10);
        }
        int iM21674H = m21674H(charSequence);
        if (i10 > iM21674H) {
            i10 = iM21674H;
        }
        while (-1 < i10) {
            if (AbstractC7966P5.m8255c(cArr[0], charSequence.charAt(i10), false)) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: R */
    public static int m21684R(String str, int i10, int i11, String string) {
        if ((i11 & 2) != 0) {
            i10 = m21674H(str);
        }
        AbstractC16544l.m18094g(str, "<this>");
        AbstractC16544l.m18094g(string, "string");
        return str.lastIndexOf(string, i10);
    }

    /* JADX INFO: renamed from: S */
    public static List m21685S(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        return AbstractC21031l.m21499w(new C0740V(str, 7));
    }

    /* JADX INFO: renamed from: T */
    public static String m21686T(int i10, String str) {
        CharSequence charSequenceSubSequence;
        AbstractC16544l.m18094g(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: U */
    public static final boolean m21687U(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z6) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        AbstractC16544l.m18094g(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!AbstractC7966P5.m8255c(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z6)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: V */
    public static String m21688V(String str, String str2) {
        AbstractC16544l.m18094g(str, "<this>");
        if (!m21699g0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: W */
    public static CharSequence m21689W(CharSequence charSequence, String str) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        return m21672F(charSequence, str) ? charSequence.subSequence(0, charSequence.length() - str.length()) : charSequence.subSequence(0, charSequence.length());
    }

    /* JADX INFO: renamed from: Y */
    public static String m21691Y(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        if (str.length() < 2 || !m21699g0(str, Separators.DOUBLE_QUOTE) || !m21672F(str, Separators.DOUBLE_QUOTE)) {
            return str;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: Z */
    public static StringBuilder m21692Z(CharSequence charSequence, int i10, int i11, CharSequence replacement) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        AbstractC16544l.m18094g(replacement, "replacement");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(AbstractC0168G.m532u("End index (", i11, ") is less than start index (", i10, ")."));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence, 0, i10);
        sb2.append(replacement);
        sb2.append(charSequence, i11, charSequence.length());
        return sb2;
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m21693a0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Limit must be non-negative, but was ").toString());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static char m21694b0(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        int length = str.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return str.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    /* JADX INFO: renamed from: c0 */
    public static final List m21695c0(int i10, CharSequence charSequence, String str, boolean z6) {
        m21693a0(i10);
        int length = 0;
        int iM21676J = m21676J(0, charSequence, str, z6);
        if (iM21676J == -1 || i10 == 1) {
            return AbstractC9393x3.m9974d(charSequence.toString());
        }
        boolean z10 = i10 > 0;
        int i11 = 10;
        if (z10 && i10 <= 10) {
            i11 = i10;
        }
        ArrayList arrayList = new ArrayList(i11);
        do {
            arrayList.add(charSequence.subSequence(length, iM21676J).toString());
            length = str.length() + iM21676J;
            if (z10 && arrayList.size() == i10 - 1) {
                break;
            }
            iM21676J = m21676J(length, charSequence, str, z6);
        } while (iM21676J != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: d0 */
    public static List m21696d0(CharSequence charSequence, char[] delimiters, int i10) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        AbstractC16544l.m18094g(delimiters, "delimiters");
        boolean z6 = false;
        if (delimiters.length == 1) {
            return m21695c0(0, charSequence, String.valueOf(delimiters[0]), false);
        }
        m21693a0(0);
        C21309c<C3508g> c21309c = new C21309c(charSequence, 0, 0, new C0650z(delimiters, z6, 1));
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(new C10107h(c21309c, 3), 10));
        for (C3508g range : c21309c) {
            AbstractC16544l.m18094g(range, "range");
            arrayList.add(charSequence.subSequence(range.f10591Y, range.f10592Z + 1).toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e0 */
    public static List m21697e0(CharSequence charSequence, String[] strArr, int i10, int i11) {
        boolean z6 = false;
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        AbstractC16544l.m18094g(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m21695c0(i10, charSequence, str, false);
            }
        }
        m21693a0(i10);
        C21309c<C3508g> c21309c = new C21309c(charSequence, 0, i10, new C0650z(AbstractC17678l.m19296c(strArr), z6, 2));
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(new C10107h(c21309c, 3), 10));
        for (C3508g range : c21309c) {
            AbstractC16544l.m18094g(range, "range");
            arrayList.add(charSequence.subSequence(range.f10591Y, range.f10592Z + 1).toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m21699g0(CharSequence charSequence, String str) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        return charSequence instanceof String ? AbstractC21329w.m21734u((String) charSequence, str, false) : m21687U(charSequence, 0, str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: h0 */
    public static String m21700h0(String str, C3508g range) {
        AbstractC16544l.m18094g(range, "range");
        String strSubstring = str.substring(range.f10591Y, range.f10592Z + 1);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: i0 */
    public static String m21701i0(char c9, String str, String missingDelimiterValue) {
        AbstractC16544l.m18094g(missingDelimiterValue, "missingDelimiterValue");
        int iM21678L = m21678L(str, c9, 0, false, 6);
        if (iM21678L == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM21678L + 1, str.length());
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: j0 */
    public static String m21702j0(String str, String delimiter) {
        AbstractC16544l.m18094g(delimiter, "delimiter");
        int iM21679M = m21679M(str, delimiter, 0, false, 6);
        if (iM21679M == -1) {
            return str;
        }
        String strSubstring = str.substring(delimiter.length() + iM21679M, str.length());
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: k0 */
    public static String m21703k0(char c9, String str, String missingDelimiterValue) {
        AbstractC16544l.m18094g(str, "<this>");
        AbstractC16544l.m18094g(missingDelimiterValue, "missingDelimiterValue");
        int iM21683Q = m21683Q(str, c9, 0, 6);
        if (iM21683Q == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM21683Q + 1, str.length());
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: l0 */
    public static String m21704l0(String missingDelimiterValue, String str) {
        AbstractC16544l.m18094g(missingDelimiterValue, "<this>");
        AbstractC16544l.m18094g(missingDelimiterValue, "missingDelimiterValue");
        int iM21684R = m21684R(missingDelimiterValue, 0, 6, str);
        if (iM21684R == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(str.length() + iM21684R, missingDelimiterValue.length());
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: m0 */
    public static String m21705m0(String missingDelimiterValue, char c9) {
        AbstractC16544l.m18094g(missingDelimiterValue, "<this>");
        AbstractC16544l.m18094g(missingDelimiterValue, "missingDelimiterValue");
        int iM21678L = m21678L(missingDelimiterValue, c9, 0, false, 6);
        if (iM21678L == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iM21678L);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: n0 */
    public static String m21706n0(String missingDelimiterValue, String str) {
        AbstractC16544l.m18094g(missingDelimiterValue, "<this>");
        AbstractC16544l.m18094g(missingDelimiterValue, "missingDelimiterValue");
        int iM21679M = m21679M(missingDelimiterValue, str, 0, false, 6);
        if (iM21679M == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iM21679M);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: o0 */
    public static String m21707o0(String str, String missingDelimiterValue) {
        AbstractC16544l.m18094g(str, "<this>");
        AbstractC16544l.m18094g(missingDelimiterValue, "missingDelimiterValue");
        int iM21684R = m21684R(str, 0, 6, Separators.DOT);
        if (iM21684R == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM21684R);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: p0 */
    public static String m21708p0(String missingDelimiterValue, char c9) {
        AbstractC16544l.m18094g(missingDelimiterValue, "<this>");
        AbstractC16544l.m18094g(missingDelimiterValue, "missingDelimiterValue");
        int iM21683Q = m21683Q(missingDelimiterValue, c9, 0, 6);
        if (iM21683Q == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iM21683Q);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: q0 */
    public static String m21709q0(int i10, String str) {
        AbstractC16544l.m18094g(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: r0 */
    public static String m21710r0(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(length - i10);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: s0 */
    public static CharSequence m21711s0(CharSequence charSequence) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z6 = false;
        while (i10 <= length) {
            boolean zM8258f = AbstractC7966P5.m8258f(charSequence.charAt(!z6 ? i10 : length));
            if (z6) {
                if (!zM8258f) {
                    break;
                }
                length--;
            } else if (zM8258f) {
                i10++;
            } else {
                z6 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    /* JADX INFO: renamed from: t0 */
    public static String m21712t0(String str, char... cArr) {
        AbstractC16544l.m18094g(str, "<this>");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z6 = false;
        while (i10 <= length) {
            boolean zM19299f = AbstractC17678l.m19299f(cArr, str.charAt(!z6 ? i10 : length));
            if (z6) {
                if (!zM19299f) {
                    break;
                }
                length--;
            } else if (zM19299f) {
                i10++;
            } else {
                z6 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    /* JADX INFO: renamed from: u0 */
    public static String m21713u0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (!AbstractC17678l.m19299f(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i10 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i10;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: v0 */
    public static CharSequence m21714v0(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!AbstractC7966P5.m8258f(str.charAt(i10))) {
                return str.subSequence(i10, str.length());
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: w0 */
    public static String m21715w0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        AbstractC16544l.m18094g(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!AbstractC17678l.m19299f(cArr, str.charAt(i10))) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m21716z(CharSequence charSequence) {
        return !(charSequence.length() == 0);
    }

    /* JADX INFO: renamed from: X */
    public static String m21690X(String str, String str2) {
        AbstractC16544l.m18094g(str, efyhmdM.BznozFf);
        if (!m21672F(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m21698f0(CharSequence charSequence, char c9) {
        AbstractC16544l.m18094g(charSequence, QzvfuIgrngtl.aFN);
        return charSequence.length() > 0 && AbstractC7966P5.m8255c(charSequence.charAt(0), c9, false);
    }
}
