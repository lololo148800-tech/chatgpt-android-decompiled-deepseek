package com.revenuecat.purchases.utils;

import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import p571X9.AbstractC9306j0;
import p817j$.util.DesugarTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class Iso8601Utils {
    private static final String GMT_ID = "GMT";
    private static final TimeZone TIMEZONE_Z = DesugarTimeZone.getTimeZone("GMT");

    private static boolean checkOffset(String str, int i10, char c9) {
        return i10 < str.length() && str.charAt(i10) == c9;
    }

    public static String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TIMEZONE_Z, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(24);
        padInt(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        padInt(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(13), 2);
        sb2.append('.');
        padInt(sb2, gregorianCalendar.get(14), 3);
        sb2.append('Z');
        return sb2.toString();
    }

    private static int indexOfNonDigit(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb2, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d6 A[Catch: IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, blocks: (B:3:0x000a, B:6:0x0017, B:8:0x0023, B:9:0x0025, B:11:0x0034, B:13:0x003a, B:21:0x0051, B:23:0x0061, B:24:0x0063, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:33:0x0082, B:38:0x0092, B:40:0x009a, B:45:0x00d0, B:47:0x00d6, B:49:0x00de, B:70:0x0160, B:54:0x00e9, B:55:0x00ff, B:56:0x0100, B:58:0x010c, B:61:0x0115, B:63:0x012f, B:66:0x013e, B:67:0x015b, B:69:0x015e, B:72:0x018f, B:73:0x0196), top: B:76:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00de A[Catch: IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, blocks: (B:3:0x000a, B:6:0x0017, B:8:0x0023, B:9:0x0025, B:11:0x0034, B:13:0x003a, B:21:0x0051, B:23:0x0061, B:24:0x0063, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:33:0x0082, B:38:0x0092, B:40:0x009a, B:45:0x00d0, B:47:0x00d6, B:49:0x00de, B:70:0x0160, B:54:0x00e9, B:55:0x00ff, B:56:0x0100, B:58:0x010c, B:61:0x0115, B:63:0x012f, B:66:0x013e, B:67:0x015b, B:69:0x015e, B:72:0x018f, B:73:0x0196), top: B:76:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:69:0x015e A[Catch: IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, blocks: (B:3:0x000a, B:6:0x0017, B:8:0x0023, B:9:0x0025, B:11:0x0034, B:13:0x003a, B:21:0x0051, B:23:0x0061, B:24:0x0063, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:33:0x0082, B:38:0x0092, B:40:0x009a, B:45:0x00d0, B:47:0x00d6, B:49:0x00de, B:70:0x0160, B:54:0x00e9, B:55:0x00ff, B:56:0x0100, B:58:0x010c, B:61:0x0115, B:63:0x012f, B:66:0x013e, B:67:0x015b, B:69:0x015e, B:72:0x018f, B:73:0x0196), top: B:76:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:72:0x018f A[Catch: IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x0045, IndexOutOfBoundsException -> 0x0048, blocks: (B:3:0x000a, B:6:0x0017, B:8:0x0023, B:9:0x0025, B:11:0x0034, B:13:0x003a, B:21:0x0051, B:23:0x0061, B:24:0x0063, B:26:0x006f, B:27:0x0072, B:29:0x0078, B:33:0x0082, B:38:0x0092, B:40:0x009a, B:45:0x00d0, B:47:0x00d6, B:49:0x00de, B:70:0x0160, B:54:0x00e9, B:55:0x00ff, B:56:0x0100, B:58:0x010c, B:61:0x0115, B:63:0x012f, B:66:0x013e, B:67:0x015b, B:69:0x015e, B:72:0x018f, B:73:0x0196), top: B:76:0x000a }] */
    public static Date parse(String str) {
        int i10;
        int iPow;
        int i11;
        int i12;
        char cCharAt;
        String strSubstring;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int i13 = parseInt(str, 0, 4);
            int i14 = checkOffset(str, 4, '-') ? 5 : 4;
            int i15 = i14 + 2;
            int i16 = parseInt(str, i14, i15);
            if (checkOffset(str, i15, '-')) {
                i15 = i14 + 3;
            }
            int i17 = i15 + 2;
            int i18 = parseInt(str, i15, i17);
            boolean zCheckOffset = checkOffset(str, i17, 'T');
            if (!zCheckOffset && str.length() <= i17) {
                return new GregorianCalendar(i13, i16 - 1, i18).getTime();
            }
            if (zCheckOffset) {
                int i19 = i15 + 5;
                int i20 = parseInt(str, i15 + 3, i19);
                if (checkOffset(str, i19, ':')) {
                    i19 = i15 + 6;
                }
                int i21 = i19 + 2;
                int i22 = parseInt(str, i19, i21);
                if (checkOffset(str, i21, ':')) {
                    i21 = i19 + 3;
                }
                if (str.length() <= i21 || (cCharAt2 = str.charAt(i21)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i10 = i20;
                    i17 = i21;
                    i11 = i22;
                    iPow = 0;
                } else {
                    int i23 = i21 + 2;
                    i12 = parseInt(str, i21, i23);
                    if (i12 > 59 && i12 < 63) {
                        i12 = 59;
                    }
                    if (checkOffset(str, i23, '.')) {
                        int i24 = i21 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i21 + 4);
                        int iMin = Math.min(iIndexOfNonDigit, i21 + 6);
                        iPow = (int) (Math.pow(10.0d, 3 - (iMin - i24)) * ((double) parseInt(str, i24, iMin)));
                        i11 = i22;
                        i10 = i20;
                        i17 = iIndexOfNonDigit;
                    } else {
                        i10 = i20;
                        i17 = i23;
                        i11 = i22;
                        iPow = 0;
                    }
                }
                if (str.length() > i17) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i17);
                if (cCharAt == 'Z') {
                    timeZone = TIMEZONE_Z;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + Separators.QUOTE);
                    }
                    strSubstring = str.substring(i17);
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = TIMEZONE_Z;
                    } else {
                        String str2 = "GMT" + strSubstring;
                        TimeZone timeZone2 = DesugarTimeZone.getTimeZone(str2);
                        String id2 = timeZone2.getID();
                        if (!id2.equals(str2) && !id2.replace(":", "").equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i13);
                gregorianCalendar.set(2, i16 - 1);
                gregorianCalendar.set(5, i18);
                gregorianCalendar.set(11, i10);
                gregorianCalendar.set(12, i11);
                gregorianCalendar.set(13, i12);
                gregorianCalendar.set(14, iPow);
                return gregorianCalendar.getTime();
            }
            i10 = 0;
            iPow = 0;
            i11 = 0;
            i12 = 0;
            if (str.length() > i17) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i17);
            if (cCharAt == 'Z') {
                timeZone = TIMEZONE_Z;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + Separators.QUOTE);
                }
                strSubstring = str.substring(i17);
                if ("+0000".equals(strSubstring)) {
                    timeZone = TIMEZONE_Z;
                } else {
                    timeZone = TIMEZONE_Z;
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, i13);
            gregorianCalendar2.set(2, i16 - 1);
            gregorianCalendar2.set(5, i18);
            gregorianCalendar2.set(11, i10);
            gregorianCalendar2.set(12, i11);
            gregorianCalendar2.set(13, i12);
            gregorianCalendar2.set(14, iPow);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new SerializationException(AbstractC9306j0.m9889h("Not an RFC 3339 date: ", str), e);
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            throw new SerializationException(AbstractC9306j0.m9889h("Not an RFC 3339 date: ", str), e);
        }
    }

    private static int parseInt(String str, int i10, int i11) {
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
}
