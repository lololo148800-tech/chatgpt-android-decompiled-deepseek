package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import p200Hm.C3507f;
import p200Hm.C3508g;

/* JADX INFO: loaded from: classes2.dex */
public final class CapitalizeDecapitalizeKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m18446a(String str, int i10, boolean z6) {
        char cCharAt = str.charAt(i10);
        if (z6) {
            return 'A' <= cCharAt && cCharAt < '[';
        }
        return Character.isUpperCase(cCharAt);
    }

    public static final String capitalizeAsciiOnly(String str) {
        char cCharAt;
        AbstractC16544l.m18094g(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(Character.toUpperCase(cCharAt));
        sb2.append((CharSequence) str, 1, str.length());
        return sb2.toString();
    }

    public static final String decapitalizeAsciiOnly(String str) {
        char cCharAt;
        AbstractC16544l.m18094g(str, "<this>");
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        String strSubstring = str.substring(1);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return lowerCase + strSubstring;
    }

    public static final String decapitalizeSmartForCompiler(String str, boolean z6) {
        Object next;
        String lowerCase;
        AbstractC16544l.m18094g(str, "<this>");
        if (str.length() == 0 || !m18446a(str, 0, z6)) {
            return str;
        }
        if (str.length() == 1 || !m18446a(str, 1, z6)) {
            if (z6) {
                return decapitalizeAsciiOnly(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase2 = Character.toLowerCase(str.charAt(0));
            String strSubstring = str.substring(1);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            return lowerCase2 + strSubstring;
        }
        C3507f it = new C3508g(0, str.length() - 1, 1).iterator();
        do {
            if (!it.f10596o0) {
                next = null;
                break;
            }
            next = it.next();
        } while (m18446a(str, ((Number) next).intValue(), z6));
        Integer num = (Integer) next;
        if (num == null) {
            if (z6) {
                return toLowerCaseAsciiOnly(str);
            }
            String lowerCase3 = str.toLowerCase(Locale.ROOT);
            AbstractC16544l.m18093f(lowerCase3, "toLowerCase(...)");
            return lowerCase3;
        }
        int iIntValue = num.intValue() - 1;
        StringBuilder sb2 = new StringBuilder();
        String strSubstring2 = str.substring(0, iIntValue);
        AbstractC16544l.m18093f(strSubstring2, "substring(...)");
        if (z6) {
            lowerCase = toLowerCaseAsciiOnly(strSubstring2);
        } else {
            lowerCase = strSubstring2.toLowerCase(Locale.ROOT);
            AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
        }
        sb2.append(lowerCase);
        String strSubstring3 = str.substring(iIntValue);
        AbstractC16544l.m18093f(strSubstring3, "substring(...)");
        sb2.append(strSubstring3);
        return sb2.toString();
    }

    public static final String toLowerCaseAsciiOnly(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
