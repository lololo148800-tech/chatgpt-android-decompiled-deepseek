package p817j$.time;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.chrono.AbstractC15551g;
import p817j$.time.chrono.ChronoLocalDate;
import p817j$.time.chrono.ChronoLocalDateTime;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.time.format.DateTimeFormatter;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalAdjuster;
import p817j$.time.temporal.TemporalQuery;
import p817j$.time.temporal.TemporalUnit;
import p817j$.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalDateTime implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a */
    private final LocalDate f48520a;

    /* JADX INFO: renamed from: b */
    private final LocalTime f48521b;
    public static final LocalDateTime MIN = m16830of(LocalDate.MIN, LocalTime.MIN);
    public static final LocalDateTime MAX = m16830of(LocalDate.MAX, LocalTime.MAX);

    @Override // p817j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: a */
    public final InterfaceC15555k mo16838a() {
        return ((LocalDate) mo16841c()).mo16812a();
    }

    public static LocalDateTime now(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        Instant instant = clock.instant();
        return m16826W(instant.getEpochSecond(), instant.getNano(), clock.mo16765a().getRules().getOffset(instant));
    }

    @Override // p817j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: atZone, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime mo16845n(ZoneId zoneId) {
        return ZonedDateTime.m16891R(this, zoneId, null);
    }

    /* JADX INFO: renamed from: V */
    public static LocalDateTime m16825V(int i10) {
        return new LocalDateTime(LocalDate.m16800of(i10, 12, 31), LocalTime.m16849V(0));
    }

    /* JADX INFO: renamed from: of */
    public static LocalDateTime m16829of(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new LocalDateTime(LocalDate.m16800of(i10, i11, i12), LocalTime.m16853of(i13, i14, i15, i16));
    }

    /* JADX INFO: renamed from: of */
    public static LocalDateTime m16830of(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        return temporal.mo16787d(mo16841c().toEpochDay(), EnumC15621a.EPOCH_DAY).mo16787d(mo16840b().m16862e0(), EnumC15621a.NANO_OF_DAY);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return m16826W(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().getOffset(instant));
    }

    /* JADX INFO: renamed from: W */
    public static LocalDateTime m16826W(long j10, int i10, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j11 = i10;
        EnumC15621a.NANO_OF_SECOND.m17140Q(j11);
        long totalSeconds = j10 + ((long) zoneOffset.getTotalSeconds());
        long j12 = 86400;
        return new LocalDateTime(LocalDate.ofEpochDay(AbstractC15529a.m16750n(totalSeconds, j12)), LocalTime.m16850W((((long) ((int) AbstractC15529a.m16749m(totalSeconds, j12))) * 1000000000) + j11));
    }

    /* JADX INFO: renamed from: Q */
    public static LocalDateTime m16824Q(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).m16897V();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.m16792R(temporalAccessor), LocalTime.m16847Q(temporalAccessor));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f48631g;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.parse(charSequence, new C15571d(1));
    }

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.f48520a = localDate;
        this.f48521b = localTime;
    }

    /* JADX INFO: renamed from: e0 */
    private LocalDateTime m16828e0(LocalDate localDate, LocalTime localTime) {
        return (this.f48520a == localDate && this.f48521b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return interfaceC15635o != null && interfaceC15635o.mo17145r(this);
        }
        EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
        return enumC15621a.mo17138A() || enumC15621a.m17141R();
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            if (((EnumC15621a) interfaceC15635o).m17141R()) {
                LocalTime localTime = this.f48521b;
                localTime.getClass();
                return AbstractC15632l.m17158d(localTime, interfaceC15635o);
            }
            return this.f48520a.mo16772r(interfaceC15635o);
        }
        return interfaceC15635o.mo17147y(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final int mo16771o(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return ((EnumC15621a) interfaceC15635o).m17141R() ? this.f48521b.mo16771o(interfaceC15635o) : this.f48520a.mo16771o(interfaceC15635o);
        }
        return AbstractC15632l.m17155a(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return ((EnumC15621a) interfaceC15635o).m17141R() ? this.f48521b.mo16773u(interfaceC15635o) : this.f48520a.mo16773u(interfaceC15635o);
        }
        return interfaceC15635o.mo17144q(this);
    }

    @Override // p817j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate mo16841c() {
        return this.f48520a;
    }

    public int getYear() {
        return this.f48520a.getYear();
    }

    public Month getMonth() {
        return this.f48520a.m16808U();
    }

    public int getDayOfMonth() {
        return this.f48520a.getDayOfMonth();
    }

    public DayOfWeek getDayOfWeek() {
        return this.f48520a.getDayOfWeek();
    }

    @Override // p817j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: b */
    public final LocalTime mo16840b() {
        return this.f48521b;
    }

    public int getHour() {
        return this.f48521b.m16854S();
    }

    /* JADX INFO: renamed from: S */
    public final int m16832S() {
        return this.f48521b.m16856U();
    }

    /* JADX INFO: renamed from: R */
    public final int m16831R() {
        return this.f48521b.m16855T();
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime mo16790q(LocalDate localDate) {
        if (localDate instanceof LocalDate) {
            return m16828e0(localDate, this.f48521b);
        }
        return (LocalDateTime) localDate.mo16768A(this);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            boolean zM17141R = ((EnumC15621a) interfaceC15635o).m17141R();
            LocalTime localTime = this.f48521b;
            LocalDate localDate = this.f48520a;
            if (zM17141R) {
                return m16828e0(localDate, localTime.mo16787d(j10, interfaceC15635o));
            }
            return m16828e0(localDate.mo16787d(j10, interfaceC15635o), localTime);
        }
        return (LocalDateTime) interfaceC15635o.mo17146u(this, j10);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime mo16788e(long j10, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDateTime) temporalUnit.mo17137o(this, j10);
        }
        switch (AbstractC15573f.f48614a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m16827b0(this.f48520a, 0L, 0L, 0L, j10);
            case 2:
                LocalDateTime localDateTimeM16836Y = m16836Y(j10 / 86400000000L);
                return localDateTimeM16836Y.m16827b0(localDateTimeM16836Y.f48520a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeM16836Y2 = m16836Y(j10 / 86400000);
                return localDateTimeM16836Y2.m16827b0(localDateTimeM16836Y2.f48520a, 0L, 0L, 0L, (j10 % 86400000) * 1000000);
            case 4:
                return m16839a0(j10);
            case 5:
                return m16827b0(this.f48520a, 0L, j10, 0L, 0L);
            case 6:
                return m16827b0(this.f48520a, j10, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeM16836Y3 = m16836Y(j10 / 256);
                return localDateTimeM16836Y3.m16827b0(localDateTimeM16836Y3.f48520a, (j10 % 256) * 12, 0L, 0L, 0L);
            default:
                return m16828e0(this.f48520a.mo16788e(j10, temporalUnit), this.f48521b);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final LocalDateTime m16837Z(long j10) {
        return m16828e0(this.f48520a.plusMonths(j10), this.f48521b);
    }

    /* JADX INFO: renamed from: Y */
    public final LocalDateTime m16836Y(long j10) {
        return m16828e0(this.f48520a.m16814e0(j10), this.f48521b);
    }

    /* JADX INFO: renamed from: a0 */
    public final LocalDateTime m16839a0(long j10) {
        return m16827b0(this.f48520a, 0L, 0L, j10, 0L);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m */
    public final Temporal mo16789m(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? mo16788e(Long.MAX_VALUE, chronoUnit).mo16788e(1L, chronoUnit) : mo16788e(-j10, chronoUnit);
    }

    /* JADX INFO: renamed from: b0 */
    private LocalDateTime m16827b0(LocalDate localDate, long j10, long j11, long j12, long j13) {
        long j14 = j10 | j11 | j12 | j13;
        LocalTime localTimeM16850W = this.f48521b;
        if (j14 == 0) {
            return m16828e0(localDate, localTimeM16850W);
        }
        long j15 = j10 / 24;
        long j16 = j15 + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L);
        long j17 = 1;
        long j18 = ((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
        long jM16862e0 = localTimeM16850W.m16862e0();
        long j19 = (j18 * j17) + jM16862e0;
        long jM16750n = AbstractC15529a.m16750n(j19, 86400000000000L) + (j16 * j17);
        long jM16749m = AbstractC15529a.m16749m(j19, 86400000000000L);
        if (jM16749m != jM16862e0) {
            localTimeM16850W = LocalTime.m16850W(jM16749m);
        }
        return m16828e0(localDate.m16814e0(jM16750n), localTimeM16850W);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final Object mo16774y(TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17160f()) {
            return this.f48520a;
        }
        return AbstractC15551g.m16959k(this, temporalQuery);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p817j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        ChronoLocalDate chronoLocalDateM16814e0;
        boolean zM16809W;
        long jM16751o;
        long j10;
        LocalDateTime localDateTimeM16824Q = m16824Q(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            return temporalUnit.mo17136m(this, localDateTimeM16824Q);
        }
        boolean z6 = ((ChronoUnit) temporalUnit).compareTo(ChronoUnit.DAYS) < 0;
        LocalTime localTime = this.f48521b;
        LocalDate localDate = this.f48520a;
        if (!z6) {
            LocalDate localDate2 = localDateTimeM16824Q.f48520a;
            localDate2.getClass();
            boolean z10 = localDate instanceof LocalDate;
            LocalTime localTime2 = localDateTimeM16824Q.f48521b;
            if (!z10 ? localDate2.toEpochDay() > localDate.toEpochDay() : localDate2.m16806P(localDate) > 0) {
                zM16809W = localDate2.m16809W(localDate);
                chronoLocalDateM16814e0 = localDate2;
                if (zM16809W && localTime2.compareTo(localTime) > 0) {
                    chronoLocalDateM16814e0 = localDate2;
                    chronoLocalDateM16814e0 = localDate2.m16814e0(1L);
                }
            } else if (localTime2.compareTo(localTime) < 0) {
                chronoLocalDateM16814e0 = localDate2.m16814e0(-1L);
            } else {
                zM16809W = localDate2.m16809W(localDate);
                chronoLocalDateM16814e0 = localDate2;
                if (zM16809W) {
                    chronoLocalDateM16814e0 = localDate2;
                    chronoLocalDateM16814e0 = localDate2.m16814e0(1L);
                }
            }
            chronoLocalDateM16814e0 = localDate2;
            return localDate.until(chronoLocalDateM16814e0, temporalUnit);
        }
        LocalDate localDate3 = localDateTimeM16824Q.f48520a;
        localDate.getClass();
        long epochDay = localDate3.toEpochDay() - localDate.toEpochDay();
        LocalTime localTime3 = localDateTimeM16824Q.f48521b;
        if (epochDay == 0) {
            return localTime.until(localTime3, temporalUnit);
        }
        long jM16862e0 = localTime3.m16862e0() - localTime.m16862e0();
        if (epochDay > 0) {
            jM16751o = epochDay - 1;
            j10 = jM16862e0 + 86400000000000L;
        } else {
            jM16751o = epochDay + 1;
            j10 = jM16862e0 - 86400000000000L;
        }
        switch (AbstractC15573f.f48614a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jM16751o = AbstractC15529a.m16751o(jM16751o, 86400000000000L);
                break;
            case 2:
                jM16751o = AbstractC15529a.m16751o(jM16751o, 86400000000L);
                j10 /= 1000;
                break;
            case 3:
                jM16751o = AbstractC15529a.m16751o(jM16751o, 86400000L);
                j10 /= 1000000;
                break;
            case 4:
                jM16751o = AbstractC15529a.m16751o(jM16751o, 86400);
                j10 /= 1000000000;
                break;
            case 5:
                jM16751o = AbstractC15529a.m16751o(jM16751o, 1440);
                j10 /= 60000000000L;
                break;
            case 6:
                jM16751o = AbstractC15529a.m16751o(jM16751o, 24);
                j10 /= 3600000000000L;
                break;
            case 7:
                jM16751o = AbstractC15529a.m16751o(jM16751o, 2);
                j10 /= 43200000000000L;
                break;
        }
        return AbstractC15529a.m16745i(jM16751o, j10);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return m16823P((LocalDateTime) chronoLocalDateTime);
        }
        return AbstractC15551g.m16950b(this, chronoLocalDateTime);
    }

    /* JADX INFO: renamed from: P */
    private int m16823P(LocalDateTime localDateTime) {
        int iM16806P = this.f48520a.m16806P(localDateTime.mo16841c());
        return iM16806P == 0 ? this.f48521b.compareTo(localDateTime.f48521b) : iM16806P;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m16833T(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return m16823P(localDateTime) > 0;
        }
        long epochDay = mo16841c().toEpochDay();
        long epochDay2 = localDateTime.mo16841c().toEpochDay();
        return epochDay > epochDay2 || (epochDay == epochDay2 && this.f48521b.m16862e0() > localDateTime.f48521b.m16862e0());
    }

    /* JADX INFO: renamed from: U */
    public final boolean m16834U(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return m16823P(localDateTime) < 0;
        }
        long epochDay = mo16841c().toEpochDay();
        long epochDay2 = localDateTime.mo16841c().toEpochDay();
        return epochDay < epochDay2 || (epochDay == epochDay2 && this.f48521b.m16862e0() < localDateTime.f48521b.m16862e0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f48520a.equals(localDateTime.f48520a) && this.f48521b.equals(localDateTime.f48521b);
    }

    public int hashCode() {
        return this.f48520a.hashCode() ^ this.f48521b.hashCode();
    }

    public String toString() {
        return this.f48520a.toString() + TokenNames.f32019T + this.f48521b.toString();
    }

    private Object writeReplace() {
        return new C15615o((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: f0 */
    final void m16844f0(DataOutput dataOutput) {
        this.f48520a.m16821l0(dataOutput);
        this.f48521b.m16865h0(dataOutput);
    }
}
