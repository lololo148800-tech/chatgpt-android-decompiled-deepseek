package p817j$.time.format;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import p817j$.time.DateTimeException;
import p817j$.time.chrono.C15562r;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.time.temporal.AbstractC15629i;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalQuery;
import p817j$.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_DATE_TIME;
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* JADX INFO: renamed from: f */
    public static final DateTimeFormatter f48630f;

    /* JADX INFO: renamed from: g */
    public static final DateTimeFormatter f48631g;

    /* JADX INFO: renamed from: h */
    public static final DateTimeFormatter f48632h;

    /* JADX INFO: renamed from: a */
    private final C15585e f48633a;

    /* JADX INFO: renamed from: b */
    private final Locale f48634b;

    /* JADX INFO: renamed from: c */
    private final C15576C f48635c;

    /* JADX INFO: renamed from: d */
    private final EnumC15578E f48636d;

    /* JADX INFO: renamed from: e */
    private final C15562r f48637e;

    public static DateTimeFormatter ofPattern(String str) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m17036i(str);
        return dateTimeFormatterBuilder.toFormatter();
    }

    public static DateTimeFormatter ofLocalizedDate(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "dateStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m17034g(formatStyle, null);
        return dateTimeFormatterBuilder.m17048v(EnumC15578E.SMART, C15562r.f48594d);
    }

    public static DateTimeFormatter ofLocalizedDateTime(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "dateTimeStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m17034g(formatStyle, formatStyle);
        return dateTimeFormatterBuilder.m17048v(EnumC15578E.SMART, C15562r.f48594d);
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        EnumC15621a enumC15621a = EnumC15621a.YEAR;
        EnumC15579F enumC15579F = EnumC15579F.EXCEEDS_PAD;
        dateTimeFormatterBuilder.m17041o(enumC15621a, 4, 10, enumC15579F);
        dateTimeFormatterBuilder.m17032e('-');
        EnumC15621a enumC15621a2 = EnumC15621a.MONTH_OF_YEAR;
        dateTimeFormatterBuilder.m17040n(enumC15621a2, 2);
        dateTimeFormatterBuilder.m17032e('-');
        EnumC15621a enumC15621a3 = EnumC15621a.DAY_OF_MONTH;
        dateTimeFormatterBuilder.m17040n(enumC15621a3, 2);
        EnumC15578E enumC15578E = EnumC15578E.STRICT;
        C15562r c15562r = C15562r.f48594d;
        DateTimeFormatter dateTimeFormatterM17048v = dateTimeFormatterBuilder.m17048v(enumC15578E, c15562r);
        ISO_LOCAL_DATE = dateTimeFormatterM17048v;
        DateTimeFormatterBuilder caseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive.m17029a(dateTimeFormatterM17048v);
        caseInsensitive.appendOffsetId().m17048v(enumC15578E, c15562r);
        DateTimeFormatterBuilder caseInsensitive2 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive2.m17029a(dateTimeFormatterM17048v);
        caseInsensitive2.m17044r();
        caseInsensitive2.appendOffsetId().m17048v(enumC15578E, c15562r);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        EnumC15621a enumC15621a4 = EnumC15621a.HOUR_OF_DAY;
        dateTimeFormatterBuilder2.m17040n(enumC15621a4, 2);
        dateTimeFormatterBuilder2.m17032e(':');
        EnumC15621a enumC15621a5 = EnumC15621a.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder2.m17040n(enumC15621a5, 2);
        dateTimeFormatterBuilder2.m17044r();
        dateTimeFormatterBuilder2.m17032e(':');
        EnumC15621a enumC15621a6 = EnumC15621a.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder2.m17040n(enumC15621a6, 2);
        dateTimeFormatterBuilder2.m17044r();
        dateTimeFormatterBuilder2.m17030b(EnumC15621a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterM17048v2 = dateTimeFormatterBuilder2.m17048v(enumC15578E, null);
        f48630f = dateTimeFormatterM17048v2;
        DateTimeFormatterBuilder caseInsensitive3 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive3.m17029a(dateTimeFormatterM17048v2);
        caseInsensitive3.appendOffsetId().m17048v(enumC15578E, null);
        DateTimeFormatterBuilder caseInsensitive4 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive4.m17029a(dateTimeFormatterM17048v2);
        caseInsensitive4.m17044r();
        caseInsensitive4.appendOffsetId().m17048v(enumC15578E, null);
        DateTimeFormatterBuilder caseInsensitive5 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive5.m17029a(dateTimeFormatterM17048v);
        caseInsensitive5.m17032e('T');
        caseInsensitive5.m17029a(dateTimeFormatterM17048v2);
        DateTimeFormatter dateTimeFormatterM17048v3 = caseInsensitive5.m17048v(enumC15578E, c15562r);
        f48631g = dateTimeFormatterM17048v3;
        DateTimeFormatterBuilder caseInsensitive6 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive6.m17029a(dateTimeFormatterM17048v3);
        caseInsensitive6.m17046t();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId = caseInsensitive6.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId.m17047u();
        DateTimeFormatter dateTimeFormatterM17048v4 = dateTimeFormatterBuilderAppendOffsetId.m17048v(enumC15578E, c15562r);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.m17029a(dateTimeFormatterM17048v4);
        dateTimeFormatterBuilder3.m17044r();
        dateTimeFormatterBuilder3.m17032e('[');
        dateTimeFormatterBuilder3.m17045s();
        dateTimeFormatterBuilder3.m17042p();
        dateTimeFormatterBuilder3.m17032e(']');
        dateTimeFormatterBuilder3.m17048v(enumC15578E, c15562r);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.m17029a(dateTimeFormatterM17048v3);
        dateTimeFormatterBuilder4.m17044r();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId2 = dateTimeFormatterBuilder4.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId2.m17044r();
        dateTimeFormatterBuilderAppendOffsetId2.m17032e('[');
        dateTimeFormatterBuilderAppendOffsetId2.m17045s();
        dateTimeFormatterBuilderAppendOffsetId2.m17042p();
        dateTimeFormatterBuilderAppendOffsetId2.m17032e(']');
        ISO_DATE_TIME = dateTimeFormatterBuilderAppendOffsetId2.m17048v(enumC15578E, c15562r);
        DateTimeFormatterBuilder caseInsensitive7 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive7.m17041o(enumC15621a, 4, 10, enumC15579F);
        caseInsensitive7.m17032e('-');
        caseInsensitive7.m17040n(EnumC15621a.DAY_OF_YEAR, 3);
        caseInsensitive7.m17044r();
        caseInsensitive7.appendOffsetId().m17048v(enumC15578E, c15562r);
        DateTimeFormatterBuilder caseInsensitive8 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive8.m17041o(AbstractC15629i.f48766c, 4, 10, enumC15579F);
        caseInsensitive8.m17033f("-W");
        caseInsensitive8.m17040n(AbstractC15629i.f48765b, 2);
        caseInsensitive8.m17032e('-');
        EnumC15621a enumC15621a7 = EnumC15621a.DAY_OF_WEEK;
        caseInsensitive8.m17040n(enumC15621a7, 1);
        caseInsensitive8.m17044r();
        caseInsensitive8.appendOffsetId().m17048v(enumC15578E, c15562r);
        DateTimeFormatterBuilder caseInsensitive9 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive9.m17031c();
        f48632h = caseInsensitive9.m17048v(enumC15578E, null);
        DateTimeFormatterBuilder caseInsensitive10 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive10.m17040n(enumC15621a, 4);
        caseInsensitive10.m17040n(enumC15621a2, 2);
        caseInsensitive10.m17040n(enumC15621a3, 2);
        caseInsensitive10.m17044r();
        caseInsensitive10.m17046t();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffset = caseInsensitive10.appendOffset("+HHMMss", "Z");
        dateTimeFormatterBuilderAppendOffset.m17047u();
        dateTimeFormatterBuilderAppendOffset.m17048v(enumC15578E, c15562r);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder caseInsensitive11 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive11.m17046t();
        caseInsensitive11.m17044r();
        caseInsensitive11.m17037j(enumC15621a7, map);
        caseInsensitive11.m17033f(", ");
        caseInsensitive11.m17043q();
        caseInsensitive11.m17041o(enumC15621a3, 1, 2, EnumC15579F.NOT_NEGATIVE);
        caseInsensitive11.m17032e(' ');
        caseInsensitive11.m17037j(enumC15621a2, map2);
        caseInsensitive11.m17032e(' ');
        caseInsensitive11.m17040n(enumC15621a, 4);
        caseInsensitive11.m17032e(' ');
        caseInsensitive11.m17040n(enumC15621a4, 2);
        caseInsensitive11.m17032e(':');
        caseInsensitive11.m17040n(enumC15621a5, 2);
        caseInsensitive11.m17044r();
        caseInsensitive11.m17032e(':');
        caseInsensitive11.m17040n(enumC15621a6, 2);
        caseInsensitive11.m17043q();
        caseInsensitive11.m17032e(' ');
        caseInsensitive11.appendOffset("+HHMM", "GMT").m17048v(EnumC15578E.SMART, c15562r);
    }

    DateTimeFormatter(C15585e c15585e, Locale locale, EnumC15578E enumC15578E, C15562r c15562r) {
        C15576C c15576c = C15576C.f48621a;
        this.f48633a = (C15585e) Objects.requireNonNull(c15585e, "printerParser");
        this.f48634b = (Locale) Objects.requireNonNull(locale, "locale");
        this.f48635c = (C15576C) Objects.requireNonNull(c15576c, "decimalStyle");
        this.f48636d = (EnumC15578E) Objects.requireNonNull(enumC15578E, "resolverStyle");
        this.f48637e = c15562r;
    }

    /* JADX INFO: renamed from: c */
    public final Locale m17024c() {
        return this.f48634b;
    }

    /* JADX INFO: renamed from: b */
    public final C15576C m17023b() {
        return this.f48635c;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC15555k m17022a() {
        return this.f48637e;
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb2 = new StringBuilder(32);
        Objects.requireNonNull(temporalAccessor, "temporal");
        Objects.requireNonNull(sb2, "appendable");
        try {
            this.f48633a.mo17053m(new C15605y(temporalAccessor, this), sb2);
            return sb2.toString();
        } catch (IOException e10) {
            throw new DateTimeException(e10.getMessage(), e10);
        }
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        String string;
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(temporalQuery, "query");
        try {
            return (T) ((C15577D) m17021d(charSequence)).mo16774y(temporalQuery);
        } catch (DateTimeParseException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e11.getMessage(), e11);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* JADX INFO: renamed from: d */
    private TemporalAccessor m17021d(CharSequence charSequence) {
        String string;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(parsePosition, "position");
        C15603w c15603w = new C15603w(this);
        int iMo17054o = this.f48633a.mo17054o(c15603w, charSequence, parsePosition.getIndex());
        if (iMo17054o < 0) {
            parsePosition.setErrorIndex(~iMo17054o);
            c15603w = null;
        } else {
            parsePosition.setIndex(iMo17054o);
        }
        if (c15603w == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            if (parsePosition.getErrorIndex() >= 0) {
                String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new DateTimeParseException(str, charSequence);
            }
            String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new DateTimeParseException(str2, charSequence);
        }
        return c15603w.m17100t(this.f48636d);
    }

    /* JADX INFO: renamed from: e */
    final C15585e m17025e() {
        return this.f48633a.m17055a();
    }

    public final String toString() {
        String string = this.f48633a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
