package p817j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import p817j$.time.chrono.AbstractC15551g;
import p817j$.time.chrono.C15562r;
import p817j$.time.chrono.ChronoLocalDateTime;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAdjuster;
import p817j$.time.temporal.TemporalQuery;
import p817j$.time.temporal.TemporalUnit;
import p817j$.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class OffsetDateTime implements Temporal, TemporalAdjuster, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a */
    private final LocalDateTime f48530a;

    /* JADX INFO: renamed from: b */
    private final ZoneOffset f48531b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iM16855T;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f48531b;
        ZoneOffset zoneOffset2 = this.f48531b;
        if (zoneOffset2.equals(zoneOffset)) {
            iM16855T = toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.f48530a;
            localDateTime.getClass();
            long jM16962n = AbstractC15551g.m16962n(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.f48530a;
            localDateTime2.getClass();
            int iCompare = Long.compare(jM16962n, AbstractC15551g.m16962n(localDateTime2, offsetDateTime2.f48531b));
            iM16855T = iCompare == 0 ? localDateTime.mo16840b().m16855T() - localDateTime2.mo16840b().m16855T() : iCompare;
        }
        return iM16855T == 0 ? toLocalDateTime().compareTo((ChronoLocalDateTime<?>) offsetDateTime2.toLocalDateTime()) : iM16855T;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.f48536g;
        localDateTime.getClass();
        m16871P(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f48535f;
        localDateTime2.getClass();
        m16871P(localDateTime2, zoneOffset2);
    }

    /* JADX INFO: renamed from: P */
    public static OffsetDateTime m16871P(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    /* JADX INFO: renamed from: Q */
    public static OffsetDateTime m16872Q(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        return new OffsetDateTime(LocalDateTime.m16826W(instant.getEpochSecond(), instant.getNano(), offset), offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // p817j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        OffsetDateTime offsetDateTime;
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset zoneOffsetFrom = ZoneOffset.from(temporal);
                LocalDate localDate = (LocalDate) temporal.mo16774y(AbstractC15632l.m17160f());
                LocalTime localTime = (LocalTime) temporal.mo16774y(AbstractC15632l.m17161g());
                if (localDate != null && localTime != null) {
                    temporal = new OffsetDateTime(LocalDateTime.m16830of(localDate, localTime), zoneOffsetFrom);
                } else {
                    temporal = m16872Q(Instant.m16781Q(temporal), zoneOffsetFrom);
                }
            } catch (DateTimeException e10) {
                throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e10);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            ZoneOffset zoneOffset = temporal.f48531b;
            ZoneOffset zoneOffset2 = this.f48531b;
            if (!zoneOffset2.equals(zoneOffset)) {
                offsetDateTime = temporal;
                offsetDateTime = new OffsetDateTime(temporal.f48530a.m16839a0(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()), zoneOffset2);
            }
            offsetDateTime = temporal;
            return this.f48530a.until(offsetDateTime.f48530a, temporalUnit);
        }
        return temporalUnit.mo17136m(this, temporal);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f48530a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.f48531b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    /* JADX INFO: renamed from: T */
    private OffsetDateTime m16874T(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f48530a == localDateTime && this.f48531b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        return (interfaceC15635o instanceof EnumC15621a) || (interfaceC15635o != null && interfaceC15635o.mo17145r(this));
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            if (interfaceC15635o == EnumC15621a.INSTANT_SECONDS || interfaceC15635o == EnumC15621a.OFFSET_SECONDS) {
                return ((EnumC15621a) interfaceC15635o).mo17142m();
            }
            return this.f48530a.mo16772r(interfaceC15635o);
        }
        return interfaceC15635o.mo17147y(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final int mo16771o(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            int i10 = AbstractC15611k.f48732a[((EnumC15621a) interfaceC15635o).ordinal()];
            if (i10 == 1) {
                throw new C15636p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f48531b.getTotalSeconds();
            }
            return this.f48530a.mo16771o(interfaceC15635o);
        }
        return AbstractC15632l.m17155a(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return interfaceC15635o.mo17144q(this);
        }
        int i10 = AbstractC15611k.f48732a[((EnumC15621a) interfaceC15635o).ordinal()];
        ZoneOffset zoneOffset = this.f48531b;
        LocalDateTime localDateTime = this.f48530a;
        if (i10 != 1) {
            return i10 != 2 ? localDateTime.mo16773u(interfaceC15635o) : zoneOffset.getTotalSeconds();
        }
        localDateTime.getClass();
        return AbstractC15551g.m16962n(localDateTime, zoneOffset);
    }

    /* JADX INFO: renamed from: h */
    public final ZoneOffset m16876h() {
        return this.f48531b;
    }

    public LocalDateTime toLocalDateTime() {
        return this.f48530a;
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q */
    public final Temporal mo16790q(LocalDate localDate) {
        boolean z6 = localDate instanceof LocalDate;
        LocalDateTime localDateTime = this.f48530a;
        ZoneOffset zoneOffset = this.f48531b;
        if (z6) {
            return m16874T(localDateTime.mo16790q(localDate), zoneOffset);
        }
        return (OffsetDateTime) localDate.mo16768A(this);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    public final Temporal mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
            int i10 = AbstractC15611k.f48732a[enumC15621a.ordinal()];
            ZoneOffset zoneOffset = this.f48531b;
            LocalDateTime localDateTime = this.f48530a;
            if (i10 == 1) {
                return m16872Q(Instant.ofEpochSecond(j10, localDateTime.m16831R()), zoneOffset);
            }
            if (i10 == 2) {
                return m16874T(localDateTime, ZoneOffset.ofTotalSeconds(enumC15621a.m17139P(j10)));
            }
            return m16874T(localDateTime.mo16787d(j10, interfaceC15635o), zoneOffset);
        }
        return (OffsetDateTime) interfaceC15635o.mo17146u(this, j10);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime mo16788e(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return m16874T(this.f48530a.mo16788e(j10, temporalUnit), this.f48531b);
        }
        return (OffsetDateTime) temporalUnit.mo17137o(this, j10);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m */
    public final Temporal mo16789m(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? mo16788e(Long.MAX_VALUE, chronoUnit).mo16788e(1L, chronoUnit) : mo16788e(-j10, chronoUnit);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final Object mo16774y(TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17163i() || temporalQuery == AbstractC15632l.m17165k()) {
            return this.f48531b;
        }
        if (temporalQuery == AbstractC15632l.m17166l()) {
            return null;
        }
        TemporalQuery temporalQueryM17160f = AbstractC15632l.m17160f();
        LocalDateTime localDateTime = this.f48530a;
        if (temporalQuery == temporalQueryM17160f) {
            return localDateTime.mo16841c();
        }
        if (temporalQuery == AbstractC15632l.m17161g()) {
            return localDateTime.mo16840b();
        }
        if (temporalQuery == AbstractC15632l.m17159e()) {
            return C15562r.f48594d;
        }
        if (temporalQuery == AbstractC15632l.m17164j()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        EnumC15621a enumC15621a = EnumC15621a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f48530a;
        return temporal.mo16787d(localDateTime.mo16841c().toEpochDay(), enumC15621a).mo16787d(localDateTime.mo16840b().m16862e0(), EnumC15621a.NANO_OF_DAY).mo16787d(this.f48531b.getTotalSeconds(), EnumC15621a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.f48530a.equals(offsetDateTime.f48530a) && this.f48531b.equals(offsetDateTime.f48531b);
    }

    public final int hashCode() {
        return this.f48530a.hashCode() ^ this.f48531b.hashCode();
    }

    public final String toString() {
        return this.f48530a.toString() + this.f48531b.toString();
    }

    private Object writeReplace() {
        return new C15615o((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.f48530a.m16844f0(objectOutput);
        this.f48531b.m16887Y(objectOutput);
    }

    /* JADX INFO: renamed from: S */
    static OffsetDateTime m16873S(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        LocalDate localDate = LocalDate.MIN;
        return new OffsetDateTime(LocalDateTime.m16830of(LocalDate.m16800of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.m16852d0(objectInput)), ZoneOffset.m16885X(objectInput));
    }
}
