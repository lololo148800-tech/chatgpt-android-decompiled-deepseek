package p817j$.time.temporal;

import java.util.HashMap;
import p817j$.time.format.EnumC15578E;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NANO_OF_SECOND' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.time.temporal.a */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC15621a implements InterfaceC15635o {
    public static final EnumC15621a ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final EnumC15621a ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final EnumC15621a ALIGNED_WEEK_OF_MONTH;
    public static final EnumC15621a ALIGNED_WEEK_OF_YEAR;
    public static final EnumC15621a AMPM_OF_DAY;
    public static final EnumC15621a CLOCK_HOUR_OF_AMPM;
    public static final EnumC15621a CLOCK_HOUR_OF_DAY;
    public static final EnumC15621a DAY_OF_MONTH;
    public static final EnumC15621a DAY_OF_WEEK;
    public static final EnumC15621a DAY_OF_YEAR;
    public static final EnumC15621a EPOCH_DAY;
    public static final EnumC15621a ERA;
    public static final EnumC15621a HOUR_OF_AMPM;
    public static final EnumC15621a HOUR_OF_DAY;
    public static final EnumC15621a INSTANT_SECONDS;
    public static final EnumC15621a MICRO_OF_DAY;
    public static final EnumC15621a MICRO_OF_SECOND;
    public static final EnumC15621a MILLI_OF_DAY;
    public static final EnumC15621a MILLI_OF_SECOND;
    public static final EnumC15621a MINUTE_OF_DAY;
    public static final EnumC15621a MINUTE_OF_HOUR;
    public static final EnumC15621a MONTH_OF_YEAR;
    public static final EnumC15621a NANO_OF_DAY;
    public static final EnumC15621a NANO_OF_SECOND;
    public static final EnumC15621a OFFSET_SECONDS;
    public static final EnumC15621a PROLEPTIC_MONTH;
    public static final EnumC15621a SECOND_OF_DAY;
    public static final EnumC15621a SECOND_OF_MINUTE;
    public static final EnumC15621a YEAR;
    public static final EnumC15621a YEAR_OF_ERA;

    /* JADX INFO: renamed from: c */
    private static final /* synthetic */ EnumC15621a[] f48756c;

    /* JADX INFO: renamed from: a */
    private final String f48757a;

    /* JADX INFO: renamed from: b */
    private final C15637q f48758b;

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ TemporalAccessor mo17143o(HashMap map, TemporalAccessor temporalAccessor, EnumC15578E enumC15578E) {
        return null;
    }

    public static EnumC15621a valueOf(String str) {
        return (EnumC15621a) Enum.valueOf(EnumC15621a.class, str);
    }

    public static EnumC15621a[] values() {
        return (EnumC15621a[]) f48756c.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        ChronoUnit chronoUnit2 = ChronoUnit.SECONDS;
        EnumC15621a enumC15621a = new EnumC15621a("NANO_OF_SECOND", 0, "NanoOfSecond", chronoUnit, chronoUnit2, C15637q.m17168j(0L, 999999999L));
        NANO_OF_SECOND = enumC15621a;
        ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
        EnumC15621a enumC15621a2 = new EnumC15621a("NANO_OF_DAY", 1, "NanoOfDay", chronoUnit, chronoUnit3, C15637q.m17168j(0L, 86399999999999L));
        NANO_OF_DAY = enumC15621a2;
        ChronoUnit chronoUnit4 = ChronoUnit.MICROS;
        EnumC15621a enumC15621a3 = new EnumC15621a("MICRO_OF_SECOND", 2, "MicroOfSecond", chronoUnit4, chronoUnit2, C15637q.m17168j(0L, 999999L));
        MICRO_OF_SECOND = enumC15621a3;
        EnumC15621a enumC15621a4 = new EnumC15621a("MICRO_OF_DAY", 3, "MicroOfDay", chronoUnit4, chronoUnit3, C15637q.m17168j(0L, 86399999999L));
        MICRO_OF_DAY = enumC15621a4;
        ChronoUnit chronoUnit5 = ChronoUnit.MILLIS;
        EnumC15621a enumC15621a5 = new EnumC15621a("MILLI_OF_SECOND", 4, "MilliOfSecond", chronoUnit5, chronoUnit2, C15637q.m17168j(0L, 999L));
        MILLI_OF_SECOND = enumC15621a5;
        EnumC15621a enumC15621a6 = new EnumC15621a("MILLI_OF_DAY", 5, "MilliOfDay", chronoUnit5, chronoUnit3, C15637q.m17168j(0L, 86399999L));
        MILLI_OF_DAY = enumC15621a6;
        ChronoUnit chronoUnit6 = ChronoUnit.MINUTES;
        EnumC15621a enumC15621a7 = new EnumC15621a("SECOND_OF_MINUTE", 6, "SecondOfMinute", chronoUnit2, chronoUnit6, C15637q.m17168j(0L, 59L), 0);
        SECOND_OF_MINUTE = enumC15621a7;
        EnumC15621a enumC15621a8 = new EnumC15621a("SECOND_OF_DAY", 7, "SecondOfDay", chronoUnit2, chronoUnit3, C15637q.m17168j(0L, 86399L));
        SECOND_OF_DAY = enumC15621a8;
        ChronoUnit chronoUnit7 = ChronoUnit.HOURS;
        EnumC15621a enumC15621a9 = new EnumC15621a("MINUTE_OF_HOUR", 8, "MinuteOfHour", chronoUnit6, chronoUnit7, C15637q.m17168j(0L, 59L), 0);
        MINUTE_OF_HOUR = enumC15621a9;
        EnumC15621a enumC15621a10 = new EnumC15621a("MINUTE_OF_DAY", 9, "MinuteOfDay", chronoUnit6, chronoUnit3, C15637q.m17168j(0L, 1439L));
        MINUTE_OF_DAY = enumC15621a10;
        ChronoUnit chronoUnit8 = ChronoUnit.HALF_DAYS;
        EnumC15621a enumC15621a11 = new EnumC15621a("HOUR_OF_AMPM", 10, "HourOfAmPm", chronoUnit7, chronoUnit8, C15637q.m17168j(0L, 11L));
        HOUR_OF_AMPM = enumC15621a11;
        EnumC15621a enumC15621a12 = new EnumC15621a("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", chronoUnit7, chronoUnit8, C15637q.m17168j(1L, 12L));
        CLOCK_HOUR_OF_AMPM = enumC15621a12;
        EnumC15621a enumC15621a13 = new EnumC15621a("HOUR_OF_DAY", 12, "HourOfDay", chronoUnit7, chronoUnit3, C15637q.m17168j(0L, 23L), 0);
        HOUR_OF_DAY = enumC15621a13;
        EnumC15621a enumC15621a14 = new EnumC15621a("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", chronoUnit7, chronoUnit3, C15637q.m17168j(1L, 24L));
        CLOCK_HOUR_OF_DAY = enumC15621a14;
        EnumC15621a enumC15621a15 = new EnumC15621a("AMPM_OF_DAY", 14, "AmPmOfDay", chronoUnit8, chronoUnit3, C15637q.m17168j(0L, 1L), 0);
        AMPM_OF_DAY = enumC15621a15;
        ChronoUnit chronoUnit9 = ChronoUnit.WEEKS;
        EnumC15621a enumC15621a16 = new EnumC15621a("DAY_OF_WEEK", 15, "DayOfWeek", chronoUnit3, chronoUnit9, C15637q.m17168j(1L, 7L), 0);
        DAY_OF_WEEK = enumC15621a16;
        EnumC15621a enumC15621a17 = new EnumC15621a("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", chronoUnit3, chronoUnit9, C15637q.m17168j(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = enumC15621a17;
        EnumC15621a enumC15621a18 = new EnumC15621a("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", chronoUnit3, chronoUnit9, C15637q.m17168j(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = enumC15621a18;
        ChronoUnit chronoUnit10 = ChronoUnit.MONTHS;
        EnumC15621a enumC15621a19 = new EnumC15621a("DAY_OF_MONTH", 18, "DayOfMonth", chronoUnit3, chronoUnit10, C15637q.m17169k(1L, 28L, 31L), 0);
        DAY_OF_MONTH = enumC15621a19;
        ChronoUnit chronoUnit11 = ChronoUnit.YEARS;
        EnumC15621a enumC15621a20 = new EnumC15621a("DAY_OF_YEAR", 19, "DayOfYear", chronoUnit3, chronoUnit11, C15637q.m17169k(1L, 365L, 366L));
        DAY_OF_YEAR = enumC15621a20;
        ChronoUnit chronoUnit12 = ChronoUnit.FOREVER;
        EnumC15621a enumC15621a21 = new EnumC15621a("EPOCH_DAY", 20, "EpochDay", chronoUnit3, chronoUnit12, C15637q.m17168j(-365243219162L, 365241780471L));
        EPOCH_DAY = enumC15621a21;
        EnumC15621a enumC15621a22 = new EnumC15621a("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", chronoUnit9, chronoUnit10, C15637q.m17169k(1L, 4L, 5L));
        ALIGNED_WEEK_OF_MONTH = enumC15621a22;
        EnumC15621a enumC15621a23 = new EnumC15621a("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", chronoUnit9, chronoUnit11, C15637q.m17168j(1L, 53L));
        ALIGNED_WEEK_OF_YEAR = enumC15621a23;
        EnumC15621a enumC15621a24 = new EnumC15621a("MONTH_OF_YEAR", 23, "MonthOfYear", chronoUnit10, chronoUnit11, C15637q.m17168j(1L, 12L), 0);
        MONTH_OF_YEAR = enumC15621a24;
        EnumC15621a enumC15621a25 = new EnumC15621a("PROLEPTIC_MONTH", 24, "ProlepticMonth", chronoUnit10, chronoUnit12, C15637q.m17168j(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = enumC15621a25;
        EnumC15621a enumC15621a26 = new EnumC15621a("YEAR_OF_ERA", 25, "YearOfEra", chronoUnit11, chronoUnit12, C15637q.m17169k(1L, 999999999L, 1000000000L));
        YEAR_OF_ERA = enumC15621a26;
        EnumC15621a enumC15621a27 = new EnumC15621a("YEAR", 26, "Year", chronoUnit11, chronoUnit12, C15637q.m17168j(-999999999L, 999999999L), 0);
        YEAR = enumC15621a27;
        EnumC15621a enumC15621a28 = new EnumC15621a("ERA", 27, "Era", ChronoUnit.ERAS, chronoUnit12, C15637q.m17168j(0L, 1L), 0);
        ERA = enumC15621a28;
        EnumC15621a enumC15621a29 = new EnumC15621a("INSTANT_SECONDS", 28, "InstantSeconds", chronoUnit2, chronoUnit12, C15637q.m17168j(Long.MIN_VALUE, Long.MAX_VALUE));
        INSTANT_SECONDS = enumC15621a29;
        EnumC15621a enumC15621a30 = new EnumC15621a("OFFSET_SECONDS", 29, "OffsetSeconds", chronoUnit2, chronoUnit12, C15637q.m17168j(-64800L, 64800L));
        OFFSET_SECONDS = enumC15621a30;
        f48756c = new EnumC15621a[]{enumC15621a, enumC15621a2, enumC15621a3, enumC15621a4, enumC15621a5, enumC15621a6, enumC15621a7, enumC15621a8, enumC15621a9, enumC15621a10, enumC15621a11, enumC15621a12, enumC15621a13, enumC15621a14, enumC15621a15, enumC15621a16, enumC15621a17, enumC15621a18, enumC15621a19, enumC15621a20, enumC15621a21, enumC15621a22, enumC15621a23, enumC15621a24, enumC15621a25, enumC15621a26, enumC15621a27, enumC15621a28, enumC15621a29, enumC15621a30};
    }

    private EnumC15621a(String str, int i10, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, C15637q c15637q) {
        super(str, i10);
        this.f48757a = str2;
        this.f48758b = c15637q;
    }

    private EnumC15621a(String str, int i10, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, C15637q c15637q, int i11) {
        super(str, i10);
        this.f48757a = str2;
        this.f48758b = c15637q;
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: m */
    public final C15637q mo17142m() {
        return this.f48758b;
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: A */
    public final boolean mo17138A() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    /* JADX INFO: renamed from: R */
    public final boolean m17141R() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    /* JADX INFO: renamed from: Q */
    public final void m17140Q(long j10) {
        this.f48758b.m17171b(j10, this);
    }

    /* JADX INFO: renamed from: P */
    public final int m17139P(long j10) {
        return this.f48758b.m17170a(j10, this);
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: r */
    public final boolean mo17145r(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo16770f(this);
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: y */
    public final C15637q mo17147y(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo16772r(this);
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: q */
    public final long mo17144q(TemporalAccessor temporalAccessor) {
        return temporalAccessor.mo16773u(this);
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: u */
    public final Temporal mo17146u(Temporal temporal, long j10) {
        return temporal.mo16787d(j10, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f48757a;
    }
}
