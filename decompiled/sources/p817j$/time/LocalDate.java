package p817j$.time;

import android.gov.nist.core.Separators;
import com.statsig.androidsdk.ErrorBoundaryKt;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.chrono.AbstractC15551g;
import p817j$.time.chrono.C15562r;
import p817j$.time.chrono.ChronoLocalDate;
import p817j$.time.chrono.ChronoLocalDateTime;
import p817j$.time.chrono.EnumC15563s;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.time.chrono.InterfaceC15556l;
import p817j$.time.format.DateTimeFormatter;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalAdjuster;
import p817j$.time.temporal.TemporalAmount;
import p817j$.time.temporal.TemporalQuery;
import p817j$.time.temporal.TemporalUnit;
import p817j$.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalDate implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a */
    private final int f48517a;

    /* JADX INFO: renamed from: b */
    private final short f48518b;

    /* JADX INFO: renamed from: c */
    private final short f48519c;
    public static final LocalDate MIN = m16800of(-999999999, 1, 1);
    public static final LocalDate MAX = m16800of(999999999, 12, 31);

    static {
        m16800of(1970, 1, 1);
    }

    /* JADX INFO: renamed from: a0 */
    public static LocalDate m16796a0(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        Instant instant = clock.instant();
        ZoneId zoneIdMo16765a = clock.mo16765a();
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneIdMo16765a, "zone");
        return ofEpochDay(AbstractC15529a.m16750n(instant.getEpochSecond() + ((long) zoneIdMo16765a.getRules().getOffset(instant).getTotalSeconds()), 86400));
    }

    /* JADX INFO: renamed from: b0 */
    public static LocalDate m16797b0(int i10, Month month, int i11) {
        EnumC15621a.YEAR.m17140Q(i10);
        Objects.requireNonNull(month, "month");
        EnumC15621a.DAY_OF_MONTH.m17140Q(i11);
        return m16791Q(i10, month.getValue(), i11);
    }

    /* JADX INFO: renamed from: of */
    public static LocalDate m16800of(int i10, int i11, int i12) {
        EnumC15621a.YEAR.m17140Q(i10);
        EnumC15621a.MONTH_OF_YEAR.m17140Q(i11);
        EnumC15621a.DAY_OF_MONTH.m17140Q(i12);
        return m16791Q(i10, i11, i12);
    }

    /* JADX INFO: renamed from: c0 */
    public static LocalDate m16798c0(int i10, int i11) {
        long j10 = i10;
        EnumC15621a.YEAR.m17140Q(j10);
        EnumC15621a.DAY_OF_YEAR.m17140Q(i11);
        boolean zMo16919M = C15562r.f48594d.mo16919M(j10);
        if (i11 == 366 && !zMo16919M) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
        }
        Month monthM16866S = Month.m16866S(((i11 - 1) / 31) + 1);
        if (i11 > (monthM16866S.m16868Q(zMo16919M) + monthM16866S.m16867P(zMo16919M)) - 1) {
            monthM16866S = monthM16866S.m16870T();
        }
        return new LocalDate(i10, monthM16866S.getValue(), (i11 - monthM16866S.m16867P(zMo16919M)) + 1);
    }

    public static LocalDate ofEpochDay(long j10) {
        long j11;
        EnumC15621a.EPOCH_DAY.m17140Q(j10);
        long j12 = 719468 + j10;
        if (j12 < 0) {
            long j13 = ((j10 + 719469) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((j14 / 400) + (((j14 / 4) + (j14 * 365)) - (j14 / 100)));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((j14 / 400) + (((j14 / 4) + (365 * j14)) - (j14 / 100)));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / 153;
        return new LocalDate(EnumC15621a.YEAR.m17139P(j14 + j11 + ((long) (i11 / 10))), ((i11 + 2) % 12) + 1, (i10 - (((i11 * 306) + 5) / 10)) + 1);
    }

    /* JADX INFO: renamed from: R */
    public static LocalDate m16792R(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.mo16774y(AbstractC15632l.m17160f());
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalDate parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.parse(charSequence, new C15571d(0));
    }

    /* JADX INFO: renamed from: Q */
    private static LocalDate m16791Q(int i10, int i11, int i12) {
        int i13 = 28;
        if (i12 > 28) {
            if (i11 != 2) {
                i13 = (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31;
            } else if (C15562r.f48594d.mo16919M(i10)) {
                i13 = 29;
            }
            if (i12 > i13) {
                if (i12 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + Month.m16866S(i11).name() + Separators.f31991SP + i12 + Separators.QUOTE);
            }
        }
        return new LocalDate(i10, i11, i12);
    }

    /* JADX INFO: renamed from: h0 */
    private static LocalDate m16799h0(int i10, int i11, int i12) {
        if (i11 == 2) {
            i12 = Math.min(i12, C15562r.f48594d.mo16919M((long) i10) ? 29 : 28);
        } else if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
            i12 = Math.min(i12, 30);
        }
        return new LocalDate(i10, i11, i12);
    }

    private LocalDate(int i10, int i11, int i12) {
        this.f48517a = i10;
        this.f48518b = (short) i11;
        this.f48519c = (short) i12;
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        return AbstractC15551g.m16956h(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        return temporal.mo16787d(toEpochDay(), EnumC15621a.EPOCH_DAY);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return interfaceC15635o.mo17147y(this);
        }
        EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
        if (!enumC15621a.mo17138A()) {
            throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
        int i10 = AbstractC15572e.f48612a[enumC15621a.ordinal()];
        if (i10 == 1) {
            return C15637q.m17168j(1L, m16810X());
        }
        if (i10 == 2) {
            return C15637q.m17168j(1L, mo16805L());
        }
        if (i10 == 3) {
            return C15637q.m17168j(1L, (Month.m16866S(this.f48518b) != Month.FEBRUARY || mo16803F()) ? 5L : 4L);
        }
        if (i10 != 4) {
            return ((EnumC15621a) interfaceC15635o).mo17142m();
        }
        return C15637q.m17168j(1L, getYear() <= 0 ? 1000000000L : 999999999L);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final int mo16771o(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return m16793S(interfaceC15635o);
        }
        return AbstractC15632l.m17155a(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            if (interfaceC15635o == EnumC15621a.EPOCH_DAY) {
                return toEpochDay();
            }
            if (interfaceC15635o == EnumC15621a.PROLEPTIC_MONTH) {
                return m16794V();
            }
            return m16793S(interfaceC15635o);
        }
        return interfaceC15635o.mo17144q(this);
    }

    /* JADX INFO: renamed from: S */
    private int m16793S(InterfaceC15635o interfaceC15635o) {
        int i10;
        int i11 = AbstractC15572e.f48612a[((EnumC15621a) interfaceC15635o).ordinal()];
        short s10 = this.f48519c;
        int i12 = this.f48517a;
        switch (i11) {
            case 1:
                return s10;
            case 2:
                return m16807T();
            case 3:
                i10 = (s10 - 1) / 7;
                break;
            case 4:
                return i12 >= 1 ? i12 : 1 - i12;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                i10 = (s10 - 1) % 7;
                break;
            case 7:
                return ((m16807T() - 1) % 7) + 1;
            case 8:
                throw new C15636p("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((m16807T() - 1) / 7) + 1;
            case 10:
                return this.f48518b;
            case 11:
                throw new C15636p("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i12;
            case 13:
                return i12 >= 1 ? 1 : 0;
            default:
                throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
        return i10 + 1;
    }

    /* JADX INFO: renamed from: V */
    private long m16794V() {
        return ((((long) this.f48517a) * 12) + ((long) this.f48518b)) - 1;
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: a */
    public final InterfaceC15555k mo16812a() {
        return C15562r.f48594d;
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: B */
    public final InterfaceC15556l mo16801B() {
        return getYear() >= 1 ? EnumC15563s.f48595CE : EnumC15563s.BCE;
    }

    public int getYear() {
        return this.f48517a;
    }

    public int getMonthValue() {
        return this.f48518b;
    }

    /* JADX INFO: renamed from: T */
    public final int m16807T() {
        return (Month.m16866S(this.f48518b).m16867P(mo16803F()) + this.f48519c) - 1;
    }

    /* JADX INFO: renamed from: U */
    public final Month m16808U() {
        return Month.m16866S(this.f48518b);
    }

    public int getDayOfMonth() {
        return this.f48519c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.m16767of(((int) AbstractC15529a.m16749m(toEpochDay() + 3, 7)) + 1);
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: F */
    public final boolean mo16803F() {
        return C15562r.f48594d.mo16919M(this.f48517a);
    }

    /* JADX INFO: renamed from: X */
    public final int m16810X() {
        short s10 = this.f48518b;
        if (s10 != 2) {
            return (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31;
        }
        return mo16803F() ? 29 : 28;
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: L */
    public final int mo16805L() {
        return mo16803F() ? 366 : 365;
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: with, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LocalDate mo16790q(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalDate) {
            return (LocalDate) temporalAdjuster;
        }
        return (LocalDate) temporalAdjuster.mo16768A(this);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final LocalDate mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return (LocalDate) interfaceC15635o.mo17146u(this, j10);
        }
        EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
        enumC15621a.m17140Q(j10);
        int i10 = AbstractC15572e.f48612a[enumC15621a.ordinal()];
        short s10 = this.f48519c;
        short s11 = this.f48518b;
        int i11 = this.f48517a;
        switch (i10) {
            case 1:
                int i12 = (int) j10;
                return s10 == i12 ? this : m16800of(i11, s11, i12);
            case 2:
                return m16818j0((int) j10);
            case 3:
                return m16815f0(j10 - mo16773u(EnumC15621a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i11 < 1) {
                    j10 = 1 - j10;
                }
                return m16820k0((int) j10);
            case 5:
                return m16814e0(j10 - ((long) getDayOfWeek().getValue()));
            case 6:
                return m16814e0(j10 - mo16773u(EnumC15621a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return m16814e0(j10 - mo16773u(EnumC15621a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j10);
            case 9:
                return m16815f0(j10 - mo16773u(EnumC15621a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i13 = (int) j10;
                if (s11 == i13) {
                    return this;
                }
                EnumC15621a.MONTH_OF_YEAR.m17140Q(i13);
                return m16799h0(i11, i13, s10);
            case 11:
                return plusMonths(j10 - m16794V());
            case 12:
                return m16820k0((int) j10);
            case 13:
                return mo16773u(EnumC15621a.ERA) == j10 ? this : m16820k0(1 - i11);
            default:
                throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final LocalDate m16820k0(int i10) {
        if (this.f48517a == i10) {
            return this;
        }
        EnumC15621a.YEAR.m17140Q(i10);
        return m16799h0(i10, this.f48518b, this.f48519c);
    }

    /* JADX INFO: renamed from: j0 */
    public final LocalDate m16818j0(int i10) {
        return m16807T() == i10 ? this : m16798c0(this.f48517a, i10);
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: E */
    public final ChronoLocalDate mo16802E(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof C15614n) {
            C15614n c15614n = (C15614n) temporalAmount;
            return plusMonths(c15614n.m17118d()).m16814e0(c15614n.m17117a());
        }
        Objects.requireNonNull(temporalAmount, "amountToAdd");
        return (LocalDate) temporalAmount.mo16778m(this);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final LocalDate mo16788e(long j10, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.mo17137o(this, j10);
        }
        switch (AbstractC15572e.f48613b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m16814e0(j10);
            case 2:
                return m16815f0(j10);
            case 3:
                return plusMonths(j10);
            case 4:
                return m16816g0(j10);
            case 5:
                return m16816g0(AbstractC15529a.m16751o(j10, 10));
            case 6:
                return m16816g0(AbstractC15529a.m16751o(j10, 100));
            case 7:
                return m16816g0(AbstractC15529a.m16751o(j10, 1000));
            case 8:
                EnumC15621a enumC15621a = EnumC15621a.ERA;
                return mo16787d(AbstractC15529a.m16745i(mo16773u(enumC15621a), j10), enumC15621a);
            default:
                throw new C15636p("Unsupported unit: " + temporalUnit);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final LocalDate m16816g0(long j10) {
        return j10 == 0 ? this : m16799h0(EnumC15621a.YEAR.m17139P(((long) this.f48517a) + j10), this.f48518b, this.f48519c);
    }

    public LocalDate plusMonths(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f48517a) * 12) + ((long) (this.f48518b - 1)) + j10;
        long j12 = 12;
        return m16799h0(EnumC15621a.YEAR.m17139P(AbstractC15529a.m16750n(j11, j12)), ((int) AbstractC15529a.m16749m(j11, j12)) + 1, this.f48519c);
    }

    /* JADX INFO: renamed from: f0 */
    public final LocalDate m16815f0(long j10) {
        return m16814e0(AbstractC15529a.m16751o(j10, 7));
    }

    /* JADX INFO: renamed from: e0 */
    public final LocalDate m16814e0(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = ((long) this.f48519c) + j10;
        if (j11 > 0) {
            short s10 = this.f48518b;
            int i10 = this.f48517a;
            if (j11 <= 28) {
                return new LocalDate(i10, s10, (int) j11);
            }
            if (j11 <= 59) {
                long jM16810X = m16810X();
                if (j11 <= jM16810X) {
                    return new LocalDate(i10, s10, (int) j11);
                }
                if (s10 < 12) {
                    return new LocalDate(i10, s10 + 1, (int) (j11 - jM16810X));
                }
                int i11 = i10 + 1;
                EnumC15621a.YEAR.m17140Q(i11);
                return new LocalDate(i11, 1, (int) (j11 - jM16810X));
            }
        }
        return ofEpochDay(AbstractC15529a.m16745i(toEpochDay(), j10));
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate mo16789m(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? mo16788e(Long.MAX_VALUE, chronoUnit).mo16788e(1L, chronoUnit) : mo16788e(-j10, chronoUnit);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final Object mo16774y(TemporalQuery temporalQuery) {
        return temporalQuery == AbstractC15632l.m17160f() ? this : AbstractC15551g.m16958j(this, temporalQuery);
    }

    @Override // p817j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalDate localDateM16792R = m16792R(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo17136m(this, localDateM16792R);
        }
        switch (AbstractC15572e.f48613b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return localDateM16792R.toEpochDay() - toEpochDay();
            case 2:
                return (localDateM16792R.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return m16795Z(localDateM16792R);
            case 4:
                return m16795Z(localDateM16792R) / 12;
            case 5:
                return m16795Z(localDateM16792R) / 120;
            case 6:
                return m16795Z(localDateM16792R) / 1200;
            case 7:
                return m16795Z(localDateM16792R) / 12000;
            case 8:
                EnumC15621a enumC15621a = EnumC15621a.ERA;
                return localDateM16792R.mo16773u(enumC15621a) - mo16773u(enumC15621a);
            default:
                throw new C15636p("Unsupported unit: " + temporalUnit);
        }
    }

    /* JADX INFO: renamed from: Z */
    private long m16795Z(LocalDate localDate) {
        return (((localDate.m16794V() * 32) + ((long) localDate.getDayOfMonth())) - ((m16794V() * 32) + ((long) getDayOfMonth()))) / 32;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: w */
    public final ChronoLocalDateTime mo16822w(LocalTime localTime) {
        return LocalDateTime.m16830of(this, localTime);
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j10;
        long j11 = this.f48517a;
        long j12 = this.f48518b;
        long j13 = 365 * j11;
        if (j11 >= 0) {
            j10 = ((j11 + 399) / 400) + (((3 + j11) / 4) - ((99 + j11) / 100)) + j13;
        } else {
            j10 = j13 - ((j11 / (-400)) + ((j11 / (-4)) - (j11 / (-100))));
        }
        long j14 = (((367 * j12) - 362) / 12) + j10 + ((long) (this.f48519c - 1));
        if (j12 > 2) {
            j14 = !mo16803F() ? j14 - 2 : j14 - 1;
        }
        return j14 - 719528;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return m16806P((LocalDate) chronoLocalDate);
        }
        return AbstractC15551g.m16949a(this, chronoLocalDate);
    }

    /* JADX INFO: renamed from: P */
    final int m16806P(LocalDate localDate) {
        int i10 = this.f48517a - localDate.f48517a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f48518b - localDate.f48518b;
        return i11 == 0 ? this.f48519c - localDate.f48519c : i11;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m16809W(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return m16806P((LocalDate) chronoLocalDate) < 0;
        }
        return toEpochDay() < chronoLocalDate.toEpochDay();
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && m16806P((LocalDate) obj) == 0;
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i10 = this.f48517a;
        return (((i10 << 11) + (this.f48518b << 6)) + this.f48519c) ^ (i10 & (-2048));
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i10 = this.f48517a;
        int iAbs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i10 > 9999) {
                sb2.append('+');
            }
            sb2.append(i10);
        } else if (i10 < 0) {
            sb2.append(i10 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i10 + ErrorBoundaryKt.SAMPLING_RATE);
            sb2.deleteCharAt(0);
        }
        short s10 = this.f48518b;
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        short s11 = this.f48519c;
        sb2.append(s11 < 10 ? "-0" : "-");
        sb2.append((int) s11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new C15615o((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: l0 */
    final void m16821l0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f48517a);
        dataOutput.writeByte(this.f48518b);
        dataOutput.writeByte(this.f48519c);
    }
}
