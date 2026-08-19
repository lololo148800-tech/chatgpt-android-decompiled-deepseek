package p817j$.time.format;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import p817j$.time.LocalDate;
import p817j$.time.chrono.C15562r;
import p817j$.time.temporal.AbstractC15629i;
import p817j$.time.temporal.AbstractC15631k;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class DateTimeFormatterBuilder {

    /* JADX INFO: renamed from: h */
    private static final C15581a f48638h = new C15581a();

    /* JADX INFO: renamed from: i */
    private static final HashMap f48639i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f48640j = 0;

    /* JADX INFO: renamed from: a */
    private DateTimeFormatterBuilder f48641a;

    /* JADX INFO: renamed from: b */
    private final DateTimeFormatterBuilder f48642b;

    /* JADX INFO: renamed from: c */
    private final ArrayList f48643c;

    /* JADX INFO: renamed from: d */
    private final boolean f48644d;

    /* JADX INFO: renamed from: e */
    private int f48645e;

    /* JADX INFO: renamed from: f */
    private char f48646f;

    /* JADX INFO: renamed from: g */
    private int f48647g;

    static {
        HashMap map = new HashMap();
        f48639i = map;
        map.put('G', EnumC15621a.ERA);
        map.put('y', EnumC15621a.YEAR_OF_ERA);
        map.put('u', EnumC15621a.YEAR);
        InterfaceC15635o interfaceC15635o = AbstractC15629i.f48764a;
        map.put('Q', interfaceC15635o);
        map.put('q', interfaceC15635o);
        EnumC15621a enumC15621a = EnumC15621a.MONTH_OF_YEAR;
        map.put('M', enumC15621a);
        map.put('L', enumC15621a);
        map.put('D', EnumC15621a.DAY_OF_YEAR);
        map.put('d', EnumC15621a.DAY_OF_MONTH);
        map.put('F', EnumC15621a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC15621a enumC15621a2 = EnumC15621a.DAY_OF_WEEK;
        map.put('E', enumC15621a2);
        map.put('c', enumC15621a2);
        map.put('e', enumC15621a2);
        map.put('a', EnumC15621a.AMPM_OF_DAY);
        map.put('H', EnumC15621a.HOUR_OF_DAY);
        map.put('k', EnumC15621a.CLOCK_HOUR_OF_DAY);
        map.put('K', EnumC15621a.HOUR_OF_AMPM);
        map.put('h', EnumC15621a.CLOCK_HOUR_OF_AMPM);
        map.put('m', EnumC15621a.MINUTE_OF_HOUR);
        map.put('s', EnumC15621a.SECOND_OF_MINUTE);
        EnumC15621a enumC15621a3 = EnumC15621a.NANO_OF_SECOND;
        map.put('S', enumC15621a3);
        map.put('A', EnumC15621a.MILLI_OF_DAY);
        map.put('n', enumC15621a3);
        map.put('N', EnumC15621a.NANO_OF_DAY);
        map.put('g', AbstractC15631k.f48772a);
    }

    public DateTimeFormatterBuilder() {
        this.f48641a = this;
        this.f48643c = new ArrayList();
        this.f48647g = -1;
        this.f48642b = null;
        this.f48644d = false;
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.f48641a = this;
        this.f48643c = new ArrayList();
        this.f48647g = -1;
        this.f48642b = dateTimeFormatterBuilder;
        this.f48644d = true;
    }

    /* JADX INFO: renamed from: s */
    public final void m17045s() {
        m17026d(EnumC15598r.SENSITIVE);
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        m17026d(EnumC15598r.INSENSITIVE);
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final void m17047u() {
        m17026d(EnumC15598r.STRICT);
    }

    /* JADX INFO: renamed from: t */
    public final void m17046t() {
        m17026d(EnumC15598r.LENIENT);
    }

    /* JADX INFO: renamed from: m */
    public final void m17039m(InterfaceC15635o interfaceC15635o) {
        Objects.requireNonNull(interfaceC15635o, "field");
        m17027l(new C15591k(interfaceC15635o, 1, 19, EnumC15579F.NORMAL));
    }

    /* JADX INFO: renamed from: n */
    public final void m17040n(InterfaceC15635o interfaceC15635o, int i10) {
        Objects.requireNonNull(interfaceC15635o, "field");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
        }
        m17027l(new C15591k(interfaceC15635o, i10, i10, EnumC15579F.NOT_NEGATIVE));
    }

    /* JADX INFO: renamed from: o */
    public final void m17041o(InterfaceC15635o interfaceC15635o, int i10, int i11, EnumC15579F enumC15579F) {
        if (i10 == i11 && enumC15579F == EnumC15579F.NOT_NEGATIVE) {
            m17040n(interfaceC15635o, i11);
            return;
        }
        Objects.requireNonNull(interfaceC15635o, "field");
        Objects.requireNonNull(enumC15579F, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
        m17027l(new C15591k(interfaceC15635o, i10, i11, enumC15579F));
    }

    /* JADX INFO: renamed from: l */
    private void m17027l(C15591k c15591k) {
        C15591k c15591kMo17057e;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f48641a;
        int i10 = dateTimeFormatterBuilder.f48647g;
        if (i10 >= 0) {
            C15591k c15591k2 = (C15591k) dateTimeFormatterBuilder.f48643c.get(i10);
            int i11 = c15591k.f48673b;
            int i12 = c15591k.f48674c;
            if (i11 == i12 && c15591k.f48675d == EnumC15579F.NOT_NEGATIVE) {
                c15591kMo17057e = c15591k2.mo17058f(i12);
                m17026d(c15591k.mo17057e());
                this.f48641a.f48647g = i10;
            } else {
                c15591kMo17057e = c15591k2.mo17057e();
                this.f48641a.f48647g = m17026d(c15591k);
            }
            this.f48641a.f48643c.set(i10, c15591kMo17057e);
            return;
        }
        dateTimeFormatterBuilder.f48647g = m17026d(c15591k);
    }

    /* JADX INFO: renamed from: b */
    public final void m17030b(EnumC15621a enumC15621a, int i10, int i11, boolean z6) {
        if (i10 == i11 && !z6) {
            m17027l(new C15587g(enumC15621a, i10, i11, z6));
        } else {
            m17026d(new C15587g(enumC15621a, i10, i11, z6));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m17038k(InterfaceC15635o interfaceC15635o, TextStyle textStyle) {
        Objects.requireNonNull(interfaceC15635o, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        m17026d(new C15599s(interfaceC15635o, textStyle, C15575B.m17006d()));
    }

    /* JADX INFO: renamed from: j */
    public final void m17037j(EnumC15621a enumC15621a, HashMap map) {
        Objects.requireNonNull(enumC15621a, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        m17026d(new C15599s(enumC15621a, textStyle, new C15582b(new C15574A(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    /* JADX INFO: renamed from: c */
    public final void m17031c() {
        m17026d(new C15588h());
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        m17026d(C15592l.f48678e);
        return this;
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        m17026d(new C15592l(str, str2));
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m17035h(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        m17026d(new C15589i(0, textStyle));
    }

    /* JADX INFO: renamed from: p */
    public final void m17042p() {
        m17026d(new C15601u(f48638h, "ZoneRegionId()"));
    }

    /* JADX INFO: renamed from: g */
    public final void m17034g(FormatStyle formatStyle, FormatStyle formatStyle2) {
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either the date or time style must be non-null");
        }
        m17026d(new C15590j(formatStyle, formatStyle2));
    }

    /* JADX INFO: renamed from: e */
    public final void m17032e(char c9) {
        m17026d(new C15584d(c9));
    }

    /* JADX INFO: renamed from: f */
    public final void m17033f(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            m17026d(new C15584d(str.charAt(0)));
        } else {
            m17026d(new C15589i(1, str));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17029a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        m17026d(dateTimeFormatter.m17025e());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:149:0x0259  */
    /* JADX WARN: Code duplicated, block: B:251:0x045b  */
    /* JADX WARN: Code duplicated, block: B:253:0x0465  */
    /* JADX WARN: Code duplicated, block: B:254:0x0469  */
    /* JADX WARN: Code duplicated, block: B:286:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0474 A[SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public final void m17036i(String str) {
        String strSubstring;
        int i10;
        boolean z6;
        int i11;
        int i12;
        Objects.requireNonNull(str, "pattern");
        int i13 = 0;
        while (i13 < str.length()) {
            char cCharAt = str.charAt(i13);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i14 = i13 + 1;
                while (i14 < str.length() && str.charAt(i14) == cCharAt) {
                    i14++;
                }
                int i15 = i14 - i13;
                if (cCharAt == 'p') {
                    if (i14 >= str.length() || (((cCharAt = str.charAt(i14)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i11 = i14;
                        i12 = i15;
                        i15 = 0;
                    } else {
                        i11 = i14 + 1;
                        while (i11 < str.length() && str.charAt(i11) == cCharAt) {
                            i11++;
                        }
                        i12 = i11 - i14;
                    }
                    if (i15 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i15 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i15);
                    }
                    DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f48641a;
                    dateTimeFormatterBuilder.f48645e = i15;
                    dateTimeFormatterBuilder.f48646f = ' ';
                    dateTimeFormatterBuilder.f48647g = -1;
                    i15 = i12;
                    i10 = i11;
                } else {
                    i10 = i14;
                }
                InterfaceC15635o interfaceC15635o = (InterfaceC15635o) f48639i.get(Character.valueOf(cCharAt));
                if (interfaceC15635o != null) {
                    if (cCharAt == 'A') {
                        m17041o(interfaceC15635o, i15, 19, EnumC15579F.NOT_NEGATIVE);
                    } else {
                        if (cCharAt == 'Q') {
                            z6 = false;
                        } else if (cCharAt == 'S') {
                            m17030b(EnumC15621a.NANO_OF_SECOND, i15, i15, false);
                        } else if (cCharAt == 'a') {
                            if (i15 != 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            m17038k(interfaceC15635o, TextStyle.SHORT);
                        } else if (cCharAt == 'k') {
                            if (i15 == 1) {
                                m17039m(interfaceC15635o);
                            } else {
                                if (i15 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                m17040n(interfaceC15635o, i15);
                            }
                        } else if (cCharAt == 'q') {
                            z6 = true;
                        } else if (cCharAt == 's') {
                            if (i15 == 1) {
                                m17039m(interfaceC15635o);
                            } else {
                                if (i15 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                m17040n(interfaceC15635o, i15);
                            }
                        } else if (cCharAt == 'u' || cCharAt == 'y') {
                            if (i15 == 2) {
                                LocalDate localDate = C15597q.f48696h;
                                Objects.requireNonNull(interfaceC15635o, "field");
                                Objects.requireNonNull(localDate, "baseDate");
                                m17027l(new C15597q(interfaceC15635o, localDate));
                            } else if (i15 < 4) {
                                m17041o(interfaceC15635o, i15, 19, EnumC15579F.NORMAL);
                            } else {
                                m17041o(interfaceC15635o, i15, 19, EnumC15579F.EXCEEDS_PAD);
                            }
                        } else if (cCharAt == 'g') {
                            m17041o(interfaceC15635o, i15, 19, EnumC15579F.NORMAL);
                        } else if (cCharAt == 'h' || cCharAt == 'm') {
                            if (i15 == 1) {
                                m17039m(interfaceC15635o);
                            } else {
                                if (i15 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                m17040n(interfaceC15635o, i15);
                            }
                        } else if (cCharAt != 'n') {
                            switch (cCharAt) {
                                case 'D':
                                    if (i15 == 1) {
                                        m17039m(interfaceC15635o);
                                    } else {
                                        if (i15 != 2 && i15 != 3) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        m17041o(interfaceC15635o, i15, 3, EnumC15579F.NOT_NEGATIVE);
                                    }
                                    break;
                                case 'E':
                                    z6 = false;
                                    break;
                                case 'F':
                                    if (i15 != 1) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    m17039m(interfaceC15635o);
                                    break;
                                    break;
                                case 'G':
                                    if (i15 == 1 || i15 == 2 || i15 == 3) {
                                        m17038k(interfaceC15635o, TextStyle.SHORT);
                                    } else if (i15 == 4) {
                                        m17038k(interfaceC15635o, TextStyle.FULL);
                                    } else {
                                        if (i15 != 5) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        m17038k(interfaceC15635o, TextStyle.NARROW);
                                    }
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'K':
                                            break;
                                        case 'L':
                                            z6 = true;
                                            break;
                                        case 'M':
                                            z6 = false;
                                            break;
                                        case 'N':
                                            m17041o(interfaceC15635o, i15, 19, EnumC15579F.NOT_NEGATIVE);
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case 'c':
                                                    if (i15 == 1) {
                                                        m17027l(new C15600t(cCharAt, i15, i15, i15, 0));
                                                    } else {
                                                        if (i15 == 2) {
                                                            throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                        }
                                                        z6 = true;
                                                    }
                                                    break;
                                                case 'd':
                                                    break;
                                                case 'e':
                                                    z6 = false;
                                                    break;
                                                default:
                                                    if (i15 != 1) {
                                                        m17040n(interfaceC15635o, i15);
                                                    } else {
                                                        m17039m(interfaceC15635o);
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                case 'H':
                                    if (i15 == 1) {
                                        m17039m(interfaceC15635o);
                                    } else {
                                        if (i15 == 2) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        m17040n(interfaceC15635o, i15);
                                    }
                                    break;
                            }
                        } else {
                            m17041o(interfaceC15635o, i15, 19, EnumC15579F.NOT_NEGATIVE);
                        }
                        if (i15 == 1 || i15 == 2) {
                            if (cCharAt == 'e') {
                                m17027l(new C15600t(cCharAt, i15, i15, i15, 0));
                            } else if (cCharAt == 'E') {
                                m17038k(interfaceC15635o, TextStyle.SHORT);
                            } else if (i15 == 1) {
                                m17039m(interfaceC15635o);
                            } else {
                                m17040n(interfaceC15635o, 2);
                            }
                        } else if (i15 == 3) {
                            m17038k(interfaceC15635o, z6 ? TextStyle.SHORT_STANDALONE : TextStyle.SHORT);
                        } else if (i15 == 4) {
                            m17038k(interfaceC15635o, z6 ? TextStyle.FULL_STANDALONE : TextStyle.FULL);
                        } else {
                            if (i15 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            m17038k(interfaceC15635o, z6 ? TextStyle.NARROW_STANDALONE : TextStyle.NARROW);
                        }
                    }
                } else if (cCharAt == 'z') {
                    if (i15 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    if (i15 == 4) {
                        m17026d(new C15602v(TextStyle.FULL, false));
                    } else {
                        m17026d(new C15602v(TextStyle.SHORT, false));
                    }
                } else if (cCharAt == 'V') {
                    if (i15 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    m17026d(new C15601u(AbstractC15632l.m17166l(), "ZoneId()"));
                } else if (cCharAt != 'v') {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i15 < 4) {
                            appendOffset("+HHMM", "+0000");
                        } else if (i15 == 4) {
                            m17035h(TextStyle.FULL);
                        } else {
                            if (i15 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            appendOffset("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i15 == 1) {
                            m17035h(TextStyle.SHORT);
                        } else {
                            if (i15 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            m17035h(TextStyle.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i15 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        appendOffset(C15592l.f48677d[i15 + (i15 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i15 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i15 == 1) {
                            str2 = "+00";
                        } else if (i15 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        appendOffset(C15592l.f48677d[i15 + (i15 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt == 'W') {
                        if (i15 > 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        m17027l(new C15600t(cCharAt, i15, i15, i15, 0));
                    } else if (cCharAt == 'w') {
                        if (i15 > 2) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        m17027l(new C15600t(cCharAt, i15, i15, 2, 0));
                    } else {
                        if (cCharAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                        }
                        if (i15 == 2) {
                            m17027l(new C15600t(cCharAt, i15, i15, 2, 0));
                        } else {
                            m17027l(new C15600t(cCharAt, i15, i15, 19, 0));
                        }
                    }
                } else if (i15 == 1) {
                    m17026d(new C15602v(TextStyle.SHORT, true));
                } else {
                    if (i15 != 4) {
                        throw new IllegalArgumentException("Wrong number of  pattern letters: " + cCharAt);
                    }
                    m17026d(new C15602v(TextStyle.FULL, true));
                }
                i13 = (-1) + i10;
            } else if (cCharAt == '\'') {
                int i16 = i13 + 1;
                int i17 = i16;
                while (i17 < str.length()) {
                    if (str.charAt(i17) == '\'') {
                        int i18 = i17 + 1;
                        if (i18 < str.length() && str.charAt(i18) == '\'') {
                            i17 = i18;
                        } else {
                            if (i17 < str.length()) {
                                throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            strSubstring = str.substring(i16, i17);
                            if (strSubstring.isEmpty()) {
                                m17032e('\'');
                            } else {
                                m17033f(strSubstring.replace("''", Separators.QUOTE));
                            }
                            i13 = i17;
                        }
                    }
                    i17++;
                }
                if (i17 < str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                }
                strSubstring = str.substring(i16, i17);
                if (strSubstring.isEmpty()) {
                    m17032e('\'');
                } else {
                    m17033f(strSubstring.replace("''", Separators.QUOTE));
                }
                i13 = i17;
            } else if (cCharAt == '[') {
                m17044r();
            } else if (cCharAt == ']') {
                if (this.f48641a.f48642b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                m17043q();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + Separators.QUOTE);
                }
                m17032e(cCharAt);
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m17044r() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f48641a;
        dateTimeFormatterBuilder.f48647g = -1;
        this.f48641a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    /* JADX INFO: renamed from: q */
    public final void m17043q() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f48641a;
        if (dateTimeFormatterBuilder.f48642b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (dateTimeFormatterBuilder.f48643c.size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f48641a;
            C15585e c15585e = new C15585e(dateTimeFormatterBuilder2.f48643c, dateTimeFormatterBuilder2.f48644d);
            this.f48641a = this.f48641a.f48642b;
            m17026d(c15585e);
            return;
        }
        this.f48641a = this.f48641a.f48642b;
    }

    /* JADX INFO: renamed from: d */
    private int m17026d(InterfaceC15586f interfaceC15586f) {
        Objects.requireNonNull(interfaceC15586f, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f48641a;
        int i10 = dateTimeFormatterBuilder.f48645e;
        if (i10 > 0) {
            if (interfaceC15586f != null) {
                interfaceC15586f = new C15593m(interfaceC15586f, i10, dateTimeFormatterBuilder.f48646f);
            }
            dateTimeFormatterBuilder.f48645e = 0;
            dateTimeFormatterBuilder.f48646f = (char) 0;
        }
        dateTimeFormatterBuilder.f48643c.add(interfaceC15586f);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f48641a;
        dateTimeFormatterBuilder2.f48647g = -1;
        return dateTimeFormatterBuilder2.f48643c.size() - 1;
    }

    public DateTimeFormatter toFormatter() {
        return m17049w(Locale.getDefault());
    }

    /* JADX INFO: renamed from: w */
    public final DateTimeFormatter m17049w(Locale locale) {
        return m17028x(locale, EnumC15578E.SMART, null);
    }

    /* JADX INFO: renamed from: v */
    final DateTimeFormatter m17048v(EnumC15578E enumC15578E, C15562r c15562r) {
        return m17028x(Locale.getDefault(), enumC15578E, c15562r);
    }

    /* JADX INFO: renamed from: x */
    private DateTimeFormatter m17028x(Locale locale, EnumC15578E enumC15578E, C15562r c15562r) {
        Objects.requireNonNull(locale, "locale");
        while (this.f48641a.f48642b != null) {
            m17043q();
        }
        C15585e c15585e = new C15585e(this.f48643c, false);
        C15576C c15576c = C15576C.f48621a;
        return new DateTimeFormatter(c15585e, locale, enumC15578E, c15562r);
    }
}
