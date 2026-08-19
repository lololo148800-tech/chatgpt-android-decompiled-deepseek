package p667bp;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p279L1.VOxZ.sVoFrD;
import p499U9.C7591u;

/* JADX INFO: renamed from: bp.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11538a {

    /* JADX INFO: renamed from: a */
    public static final Pattern f34906a = Pattern.compile("[\\\\&]");

    /* JADX INFO: renamed from: b */
    public static final Pattern f34907b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: c */
    public static final Pattern f34908c;

    /* JADX INFO: renamed from: d */
    public static final C7591u f34909d;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f34908c = Pattern.compile("[ \t\r\n]+");
        f34909d = new C7591u(23);
    }

    /* JADX INFO: renamed from: a */
    public static String m12928a(String str) {
        String str2;
        StringBuilder sb2 = null;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"') {
                str2 = "&quot;";
            } else if (cCharAt == '&') {
                str2 = "&amp;";
            } else if (cCharAt != '<') {
                if (cCharAt == '>') {
                    str2 = "&gt;";
                } else if (sb2 != null) {
                    sb2.append(cCharAt);
                }
            } else {
                str2 = "&lt;";
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
                sb2.append((CharSequence) str, 0, i10);
            }
            sb2.append(str2);
        }
        return sb2 != null ? sb2.toString() : str;
    }

    /* JADX INFO: renamed from: c */
    public static String m12930c(String str) {
        if (!f34906a.matcher(str).find()) {
            return str;
        }
        Matcher matcher = f34907b.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb2.append((CharSequence) str, iEnd, matcher.start());
            String strGroup = matcher.group();
            f34909d.getClass();
            if (strGroup.charAt(0) == '\\') {
                sb2.append((CharSequence) strGroup, 1, strGroup.length());
            } else {
                sb2.append(AbstractC11539b.m12931a(strGroup));
            }
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb2.append((CharSequence) str, iEnd, str.length());
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m12929b(String str) {
        String strTrim = str.trim();
        Locale locale = Locale.ROOT;
        return f34908c.matcher(strTrim.toLowerCase(locale).toUpperCase(locale)).replaceAll(sVoFrD.JnxuhWxjLB);
    }
}
