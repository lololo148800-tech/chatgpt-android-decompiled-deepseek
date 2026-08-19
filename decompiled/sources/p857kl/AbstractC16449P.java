package p857kl;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p129En.C2585E;
import p523V9.AbstractC7966P5;
import p523V9.AbstractC8150n4;
import p544W9.AbstractC8663k4;
import p544W9.AbstractC8681n4;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: kl.P */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16449P {

    /* JADX INFO: renamed from: a */
    public static final List f51028a = AbstractC9393x3.m9974d("");

    /* JADX INFO: renamed from: a */
    public static final int m18025a(int i10, int i11, String str) {
        boolean z6 = false;
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ':') {
                if (cCharAt == '[') {
                    z6 = true;
                } else if (cCharAt == ']') {
                    z6 = false;
                }
            } else if (!z6) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static final void m18026b(C16447N c16447n, String urlString) {
        AbstractC16544l.m18094g(c16447n, "<this>");
        AbstractC16544l.m18094g(urlString, "urlString");
        if (AbstractC21322p.m21681O(urlString)) {
            return;
        }
        try {
            m18027c(c16447n, urlString);
        } catch (Throwable th2) {
            throw new C16448O("Fail to parse url: ".concat(urlString), th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m18027c(C16447N c16447n, String urlString) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        List listM19337M;
        int i16;
        List listM21696d0;
        int iIntValue;
        int i17;
        char c9;
        AbstractC16544l.m18094g(c16447n, "<this>");
        AbstractC16544l.m18094g(urlString, "urlString");
        int length = urlString.length();
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                i18 = -1;
                break;
            } else if (!AbstractC7966P5.m8258f(urlString.charAt(i18))) {
                break;
            } else {
                i18++;
            }
        }
        int length2 = urlString.length() - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i19 = length2 - 1;
            if (!AbstractC7966P5.m8258f(urlString.charAt(length2))) {
                break;
            }
            if (i19 < 0) {
                length2 = -1;
                break;
            }
            length2 = i19;
        }
        int i20 = length2 + 1;
        char cCharAt = urlString.charAt(i18);
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i10 = i18;
            i11 = i10;
        } else {
            i11 = -1;
            i10 = i18;
        }
        while (true) {
            if (i10 < i20) {
                char cCharAt2 = urlString.charAt(i10);
                if (cCharAt2 == ':') {
                    if (i11 != -1) {
                        throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "Illegal character in scheme at position "));
                    }
                    i12 = i10 - i18;
                    break;
                }
                if (cCharAt2 != '#' && cCharAt2 != '/' && cCharAt2 != '?') {
                    if (i11 != -1 || ('a' <= cCharAt2 && cCharAt2 < '{')) {
                        c9 = '[';
                    } else {
                        c9 = '[';
                        if (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')) {
                            i11 = i10;
                        }
                    }
                    i10++;
                }
            }
            i12 = -1;
            break;
        }
        if (i12 > 0) {
            String strSubstring = urlString.substring(i18, i18 + i12);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            C16450Q c16450q = C16450Q.f51029c;
            String strM8692e = AbstractC8150n4.m8692e(strSubstring);
            C16450Q c16450q2 = (C16450Q) C16450Q.f51030d.get(strM8692e);
            if (c16450q2 == null) {
                c16450q2 = new C16450Q(strM8692e, 0);
            }
            c16447n.f51021d = c16450q2;
            i13 = 1;
            i18 += i12 + 1;
        } else {
            i13 = 1;
        }
        int i21 = 0;
        while (true) {
            i14 = i18 + i21;
            if (i14 >= i20 || urlString.charAt(i14) != '/') {
                break;
            } else {
                i21 += i13;
            }
        }
        if (c16447n.m18023d().f51031a.equals("file")) {
            if (i21 != 2) {
                if (i21 != 3) {
                    throw new IllegalArgumentException("Invalid file url: ".concat(urlString));
                }
                c16447n.f51018a = "";
                String strSubstring2 = urlString.substring(i14, i20);
                AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                AbstractC8681n4.m9377f(c16447n, Separators.SLASH.concat(strSubstring2));
                return;
            }
            int iM21678L = AbstractC21322p.m21678L(urlString, '/', i14, false, 4);
            if (iM21678L == -1 || iM21678L == i20) {
                String strSubstring3 = urlString.substring(i14, i20);
                AbstractC16544l.m18093f(strSubstring3, "substring(...)");
                c16447n.f51018a = strSubstring3;
                return;
            } else {
                String strSubstring4 = urlString.substring(i14, iM21678L);
                AbstractC16544l.m18093f(strSubstring4, "substring(...)");
                c16447n.f51018a = strSubstring4;
                String strSubstring5 = urlString.substring(iM21678L, i20);
                AbstractC16544l.m18093f(strSubstring5, "substring(...)");
                AbstractC8681n4.m9377f(c16447n, strSubstring5);
                return;
            }
        }
        if (c16447n.m18023d().f51031a.equals("mailto")) {
            if (i21 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int iM21679M = AbstractC21322p.m21679M(urlString, Separators.f31989AT, i14, false, 4);
            if (iM21679M == -1) {
                throw new IllegalArgumentException(AbstractC10763a.m11054l("Invalid mailto url: ", urlString, ", it should contain '@'."));
            }
            String strSubstring6 = urlString.substring(i14, iM21679M);
            AbstractC16544l.m18093f(strSubstring6, "substring(...)");
            String strM18030c = AbstractC16455c.m18030c(strSubstring6);
            c16447n.f51022e = strM18030c != null ? AbstractC16455c.m18032e(strM18030c, false) : null;
            String strSubstring7 = urlString.substring(iM21679M + 1, i20);
            AbstractC16544l.m18093f(strSubstring7, "substring(...)");
            c16447n.f51018a = strSubstring7;
            return;
        }
        if (c16447n.m18023d().f51031a.equals("about")) {
            if (i21 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strSubstring8 = urlString.substring(i14, i20);
            AbstractC16544l.m18093f(strSubstring8, "substring(...)");
            c16447n.f51018a = strSubstring8;
            return;
        }
        if (i21 >= 2) {
            while (true) {
                char[] cArr = new char[5];
                int i22 = 0;
                for (int i23 = 5; i22 < i23; i23 = 5) {
                    cArr[i22] = "@/\\?#".charAt(i22);
                    i22++;
                }
                int iM21680N = AbstractC21322p.m21680N(urlString, cArr, i14, false);
                Integer numValueOf = Integer.valueOf(iM21680N);
                if (iM21680N <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i20;
                if (iIntValue >= i20 || urlString.charAt(iIntValue) != '@') {
                    break;
                }
                int iM18025a = m18025a(i14, iIntValue, urlString);
                if (iM18025a != -1) {
                    String strSubstring9 = urlString.substring(i14, iM18025a);
                    AbstractC16544l.m18093f(strSubstring9, "substring(...)");
                    c16447n.f51022e = strSubstring9;
                    String strSubstring10 = urlString.substring(iM18025a + 1, iIntValue);
                    AbstractC16544l.m18093f(strSubstring10, "substring(...)");
                    c16447n.f51023f = strSubstring10;
                } else {
                    String strSubstring11 = urlString.substring(i14, iIntValue);
                    AbstractC16544l.m18093f(strSubstring11, "substring(...)");
                    c16447n.f51022e = strSubstring11;
                }
                i14 = iIntValue + 1;
            }
            int iM18025a2 = m18025a(i14, iIntValue, urlString);
            Integer numValueOf2 = Integer.valueOf(iM18025a2);
            if (iM18025a2 <= 0) {
                numValueOf2 = null;
            }
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : iIntValue;
            String strSubstring12 = urlString.substring(i14, iIntValue2);
            AbstractC16544l.m18093f(strSubstring12, "substring(...)");
            c16447n.f51018a = strSubstring12;
            int i24 = iIntValue2 + 1;
            if (i24 < iIntValue) {
                String strSubstring13 = urlString.substring(i24, iIntValue);
                AbstractC16544l.m18093f(strSubstring13, "substring(...)");
                i17 = Integer.parseInt(strSubstring13);
            } else {
                i17 = 0;
            }
            c16447n.m18024e(i17);
            i14 = iIntValue;
        }
        List list = C17689w.f56480Y;
        List list2 = f51028a;
        if (i14 >= i20) {
            if (urlString.charAt(length2) == '/') {
                list = list2;
            }
            AbstractC16544l.m18094g(list, "<set-?>");
            c16447n.f51025h = list;
            return;
        }
        if (i21 == 0) {
            i15 = 1;
            listM19337M = AbstractC17680n.m19337M(1, c16447n.f51025h);
        } else {
            i15 = 1;
            listM19337M = list;
        }
        c16447n.f51025h = listM19337M;
        char[] cArr2 = new char[2];
        int i25 = 0;
        for (int i26 = 2; i25 < i26; i26 = 2) {
            cArr2[i25] = "?#".charAt(i25);
            i25 += i15;
        }
        int iM21680N2 = AbstractC21322p.m21680N(urlString, cArr2, i14, false);
        Integer numValueOf3 = Integer.valueOf(iM21680N2);
        if (iM21680N2 <= 0) {
            numValueOf3 = null;
        }
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : i20;
        if (iIntValue3 > i14) {
            String strSubstring14 = urlString.substring(i14, iIntValue3);
            AbstractC16544l.m18093f(strSubstring14, "substring(...)");
            List list3 = (c16447n.f51025h.size() == 1 && ((CharSequence) AbstractC17680n.m19341Q(c16447n.f51025h)).length() == 0) ? list : c16447n.f51025h;
            if (strSubstring14.equals(Separators.SLASH)) {
                listM21696d0 = list2;
                i16 = 1;
            } else {
                i16 = 1;
                listM21696d0 = AbstractC21322p.m21696d0(strSubstring14, new char[]{'/'}, 6);
            }
            if (i21 == i16) {
                list = list2;
            }
            c16447n.f51025h = AbstractC17680n.m19361k0(AbstractC17680n.m19361k0(listM21696d0, list), list3);
            i14 = iIntValue3;
        }
        if (i14 < i20 && urlString.charAt(i14) == '?') {
            int i27 = i14 + 1;
            if (i27 == i20) {
                c16447n.f51019b = true;
                i14 = i20;
            } else {
                int iM21678L2 = AbstractC21322p.m21678L(urlString, '#', i27, false, 4);
                Integer numValueOf4 = iM21678L2 > 0 ? Integer.valueOf(iM21678L2) : null;
                int iIntValue4 = numValueOf4 != null ? numValueOf4.intValue() : i20;
                String strSubstring15 = urlString.substring(i27, iIntValue4);
                AbstractC16544l.m18093f(strSubstring15, "substring(...)");
                AbstractC8663k4.m9356b(strSubstring15).mo7980e(new C2585E(c16447n, 3));
                i14 = iIntValue4;
            }
        }
        if (i14 >= i20 || urlString.charAt(i14) != '#') {
            return;
        }
        String strSubstring16 = urlString.substring(i14 + 1, i20);
        AbstractC16544l.m18093f(strSubstring16, "substring(...)");
        c16447n.f51024g = strSubstring16;
    }
}
