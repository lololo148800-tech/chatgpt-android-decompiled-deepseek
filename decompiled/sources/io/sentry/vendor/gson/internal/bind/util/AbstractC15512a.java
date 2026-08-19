package io.sentry.vendor.gson.internal.bind.util;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import p174Gk.uSfJ.HpucjswO;
import p817j$.util.DesugarTimeZone;

/* JADX INFO: renamed from: io.sentry.vendor.gson.internal.bind.util.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15512a {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f48440a = DesugarTimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: a */
    public static boolean m16691a(String str, int i10, char c9) {
        return i10 < str.length() && str.charAt(i10) == c9;
    }

    /* JADX INFO: renamed from: b */
    public static void m16692b(StringBuilder sb2, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }

    /* JADX INFO: renamed from: d */
    public static int m16694d(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f6  */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x01fc, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public static Date m16693c(String str, ParsePosition parsePosition) throws ParseException {
        String strM11047e;
        String message;
        int i10;
        int iM16694d;
        int i11;
        int iM16694d2;
        int length;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i12 = index + 4;
            int iM16694d3 = m16694d(str, index, i12);
            if (m16691a(str, i12, '-')) {
                i12 = index + 5;
            }
            int i13 = i12 + 2;
            int iM16694d4 = m16694d(str, i12, i13);
            if (m16691a(str, i13, '-')) {
                i13 = i12 + 3;
            }
            int i14 = i13 + 2;
            int iM16694d5 = m16694d(str, i13, i14);
            boolean zM16691a = m16691a(str, i14, 'T');
            if (!zM16691a && str.length() <= i14) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iM16694d3, iM16694d4 - 1, iM16694d5);
                parsePosition.setIndex(i14);
                return gregorianCalendar.getTime();
            }
            if (zM16691a) {
                int i15 = i13 + 5;
                int iM16694d6 = m16694d(str, i13 + 3, i15);
                if (m16691a(str, i15, ':')) {
                    i15 = i13 + 6;
                }
                int i16 = i15 + 2;
                int iM16694d7 = m16694d(str, i15, i16);
                if (m16691a(str, i16, ':')) {
                    i16 = i15 + 3;
                }
                if (str.length() <= i16 || (cCharAt = str.charAt(i16)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i11 = iM16694d7;
                    iM16694d = 0;
                    iM16694d2 = 0;
                    i14 = i16;
                    i10 = iM16694d6;
                } else {
                    int i17 = i16 + 2;
                    iM16694d2 = m16694d(str, i16, i17);
                    if (iM16694d2 > 59 && iM16694d2 < 63) {
                        iM16694d2 = 59;
                    }
                    if (m16691a(str, i17, '.')) {
                        int i18 = i16 + 3;
                        int length2 = i16 + 4;
                        while (true) {
                            if (length2 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt2 = str.charAt(length2);
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                break;
                                break;
                            }
                            length2++;
                        }
                        int iMin = Math.min(length2, i16 + 6);
                        iM16694d = m16694d(str, i18, iMin);
                        int i19 = iMin - i18;
                        if (i19 == 1) {
                            iM16694d *= 100;
                        } else if (i19 == 2) {
                            iM16694d *= 10;
                        }
                        i10 = iM16694d6;
                        i14 = length2;
                        i11 = iM16694d7;
                    } else {
                        i10 = iM16694d6;
                        i14 = i17;
                        i11 = iM16694d7;
                        iM16694d = 0;
                    }
                }
            } else {
                i10 = 0;
                iM16694d = 0;
                i11 = 0;
                iM16694d2 = 0;
            }
            if (str.length() <= i14) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt3 = str.charAt(i14);
            TimeZone timeZone = f48440a;
            if (cCharAt3 == 'Z') {
                length = i14 + 1;
            } else {
                if (cCharAt3 != '+' && cCharAt3 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt3 + HpucjswO.sYJlSvspU);
                }
                String strSubstring = str.substring(i14);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i14 + strSubstring.length();
                if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                    String str2 = "GMT" + strSubstring;
                    timeZone = DesugarTimeZone.getTimeZone(str2);
                    String id2 = timeZone.getID();
                    if (!id2.equals(str2) && !id2.replace(":", "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, iM16694d3);
            gregorianCalendar2.set(2, iM16694d4 - 1);
            gregorianCalendar2.set(5, iM16694d5);
            gregorianCalendar2.set(11, i10);
            gregorianCalendar2.set(12, i11);
            gregorianCalendar2.set(13, iM16694d2);
            gregorianCalendar2.set(14, iM16694d);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException e10) {
            e = e10;
            if (str == null) {
                strM11047e = null;
            } else {
                strM11047e = AbstractC10763a.m11047e('\"', Separators.DOUBLE_QUOTE, str);
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = Separators.LPAREN + e.getClass().getName() + Separators.RPAREN;
            }
            ParseException parseException = new ParseException(AbstractC10763a.m11055m("Failed to parse date [", strM11047e, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            if (str == null) {
                strM11047e = null;
            } else {
                strM11047e = AbstractC10763a.m11047e('\"', Separators.DOUBLE_QUOTE, str);
            }
            message = e.getMessage();
            if (message != null) {
                message = Separators.LPAREN + e.getClass().getName() + Separators.RPAREN;
            } else {
                message = Separators.LPAREN + e.getClass().getName() + Separators.RPAREN;
            }
            ParseException parseException2 = new ParseException(AbstractC10763a.m11055m("Failed to parse date [", strM11047e, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e12) {
            e = e12;
            if (str == null) {
                strM11047e = null;
            } else {
                strM11047e = AbstractC10763a.m11047e('\"', Separators.DOUBLE_QUOTE, str);
            }
            message = e.getMessage();
            if (message != null) {
                message = Separators.LPAREN + e.getClass().getName() + Separators.RPAREN;
            } else {
                message = Separators.LPAREN + e.getClass().getName() + Separators.RPAREN;
            }
            ParseException parseException3 = new ParseException(AbstractC10763a.m11055m("Failed to parse date [", strM11047e, "]: ", message), parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }
}
