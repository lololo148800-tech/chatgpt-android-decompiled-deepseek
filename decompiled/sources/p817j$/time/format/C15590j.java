package p817j$.time.format;

import android.gov.nist.core.Separators;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p817j$.time.chrono.AbstractC15551g;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.util.Objects;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.format.j */
/* JADX INFO: loaded from: classes4.dex */
final class C15590j implements InterfaceC15586f {

    /* JADX INFO: renamed from: c */
    private static final ConcurrentHashMap f48668c = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: a */
    private final FormatStyle f48669a;

    /* JADX INFO: renamed from: b */
    private final FormatStyle f48670b;

    C15590j(FormatStyle formatStyle, FormatStyle formatStyle2) {
        this.f48669a = formatStyle;
        this.f48670b = formatStyle2;
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: m */
    public final boolean mo17053m(C15605y c15605y, StringBuilder sb2) {
        m17061a(c15605y.m17103c(), AbstractC15551g.m16964p(c15605y.m17104d())).m17025e().mo17053m(c15605y, sb2);
        return true;
    }

    @Override // p817j$.time.format.InterfaceC15586f
    /* JADX INFO: renamed from: o */
    public final int mo17054o(C15603w c15603w, CharSequence charSequence, int i10) {
        return m17061a(c15603w.m17089i(), c15603w.m17088h()).m17025e().mo17054o(c15603w, charSequence, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private DateTimeFormatter m17061a(Locale locale, InterfaceC15555k interfaceC15555k) {
        DateFormat dateTimeInstance;
        String id2 = interfaceC15555k.getId();
        String string = locale.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(id2);
        sb2.append("|");
        sb2.append(string);
        sb2.append("|");
        FormatStyle formatStyle = this.f48669a;
        sb2.append(formatStyle);
        FormatStyle formatStyle2 = this.f48670b;
        sb2.append(formatStyle2);
        String string2 = sb2.toString();
        ConcurrentHashMap concurrentHashMap = f48668c;
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.get(string2);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        int i10 = DateTimeFormatterBuilder.f48640j;
        Objects.requireNonNull(locale, "locale");
        Objects.requireNonNull(interfaceC15555k, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (formatStyle2 == null) {
            dateTimeInstance = DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        } else if (formatStyle == null) {
            dateTimeInstance = DateFormat.getTimeInstance(formatStyle2.ordinal(), locale);
        } else {
            dateTimeInstance = DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        }
        if (dateTimeInstance instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) dateTimeInstance).toPattern();
            if (pattern == null) {
                pattern = null;
            } else {
                int i11 = 0;
                boolean z6 = pattern.indexOf(66) != -1;
                boolean z10 = pattern.indexOf(98) != -1;
                if (z6 || z10) {
                    StringBuilder sb3 = new StringBuilder(pattern.length());
                    char c9 = ' ';
                    while (i11 < pattern.length()) {
                        char cCharAt = pattern.charAt(i11);
                        if (cCharAt != ' ') {
                            if (cCharAt != 'B' && cCharAt != 'b') {
                                sb3.append(cCharAt);
                            }
                        } else if (i11 == 0 || (c9 != 'B' && c9 != 'b')) {
                            sb3.append(cCharAt);
                        }
                        i11++;
                        c9 = cCharAt;
                    }
                    int length = sb3.length() - 1;
                    if (length >= 0 && sb3.charAt(length) == ' ') {
                        sb3.deleteCharAt(length);
                    }
                    pattern = sb3.toString();
                }
            }
            DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
            dateTimeFormatterBuilder.m17036i(pattern);
            DateTimeFormatter dateTimeFormatterM17049w = dateTimeFormatterBuilder.m17049w(locale);
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentHashMap.putIfAbsent(string2, dateTimeFormatterM17049w);
            return dateTimeFormatter2 != null ? dateTimeFormatter2 : dateTimeFormatterM17049w;
        }
        throw new UnsupportedOperationException("Can't determine pattern from " + dateTimeInstance);
    }

    public final String toString() {
        Object obj = this.f48669a;
        if (obj == null) {
            obj = "";
        }
        FormatStyle formatStyle = this.f48670b;
        return "Localized(" + obj + Separators.COMMA + (formatStyle != null ? formatStyle : "") + Separators.RPAREN;
    }
}
