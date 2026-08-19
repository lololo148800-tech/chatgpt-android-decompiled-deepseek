package io.sentry.util;

import android.gov.nist.core.Separators;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.util.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15503h {

    /* JADX INFO: renamed from: a */
    public static final Charset f48425a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final Pattern f48426b = Pattern.compile("[\\W_]+");

    /* JADX INFO: renamed from: a */
    public static String m16687a(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb2.append(strSubstring.toUpperCase(locale));
        sb2.append(str.substring(1).toLowerCase(locale));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m16688b(String str) {
        return (str != null && str.startsWith(Separators.DOUBLE_QUOTE) && str.endsWith(Separators.DOUBLE_QUOTE)) ? str.substring(1, str.length() - 1) : str;
    }
}
