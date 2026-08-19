package p817j$.time;

import com.revenuecat.purchases.common.UtilsKt;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
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
public final class Instant implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a */
    private final long f48515a;

    /* JADX INFO: renamed from: b */
    private final int f48516b;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    /* JADX INFO: renamed from: R */
    public static Instant m16782R(long j10) {
        return m16780P(j10, 0);
    }

    public static Instant ofEpochSecond(long j10, long j11) {
        return m16780P(AbstractC15529a.m16745i(j10, AbstractC15529a.m16750n(j11, 1000000000L)), (int) AbstractC15529a.m16749m(j11, 1000000000L));
    }

    public static Instant ofEpochMilli(long j10) {
        long j11 = 1000;
        return m16780P(AbstractC15529a.m16750n(j10, j11), ((int) AbstractC15529a.m16749m(j10, j11)) * UtilsKt.MICROS_MULTIPLIER);
    }

    /* JADX INFO: renamed from: Q */
    public static Instant m16781Q(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.mo16773u(EnumC15621a.INSTANT_SECONDS), temporalAccessor.mo16771o(EnumC15621a.NANO_OF_SECOND));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    /* JADX INFO: renamed from: P */
    private static Instant m16780P(long j10, int i10) {
        if ((((long) i10) | j10) == 0) {
            return EPOCH;
        }
        if (j10 < -31557014167219200L || j10 > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j10, i10);
    }

    private Instant(long j10, int i10) {
        this.f48515a = j10;
        this.f48516b = i10;
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return interfaceC15635o == EnumC15621a.INSTANT_SECONDS || interfaceC15635o == EnumC15621a.NANO_OF_SECOND || interfaceC15635o == EnumC15621a.MICRO_OF_SECOND || interfaceC15635o == EnumC15621a.MILLI_OF_SECOND;
        }
        return interfaceC15635o != null && interfaceC15635o.mo17145r(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        return AbstractC15632l.m17158d(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final int mo16771o(InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return AbstractC15632l.m17158d(this, interfaceC15635o).m17170a(interfaceC15635o.mo17144q(this), interfaceC15635o);
        }
        int i10 = AbstractC15535c.f48544a[((EnumC15621a) interfaceC15635o).ordinal()];
        int i11 = this.f48516b;
        if (i10 == 1) {
            return i11;
        }
        if (i10 == 2) {
            return i11 / 1000;
        }
        if (i10 == 3) {
            return i11 / UtilsKt.MICROS_MULTIPLIER;
        }
        if (i10 == 4) {
            EnumC15621a.INSTANT_SECONDS.m17139P(this.f48515a);
        }
        throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        int i10;
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return interfaceC15635o.mo17144q(this);
        }
        int i11 = AbstractC15535c.f48544a[((EnumC15621a) interfaceC15635o).ordinal()];
        int i12 = this.f48516b;
        if (i11 == 1) {
            return i12;
        }
        if (i11 == 2) {
            i10 = i12 / 1000;
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    return this.f48515a;
                }
                throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
            }
            i10 = i12 / UtilsKt.MICROS_MULTIPLIER;
        }
        return i10;
    }

    public long getEpochSecond() {
        return this.f48515a;
    }

    public int getNano() {
        return this.f48516b;
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q */
    public final Temporal mo16790q(LocalDate localDate) {
        return (Instant) localDate.mo16768A(this);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    public final Temporal mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return (Instant) interfaceC15635o.mo17146u(this, j10);
        }
        EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
        enumC15621a.m17140Q(j10);
        int i10 = AbstractC15535c.f48544a[enumC15621a.ordinal()];
        int i11 = this.f48516b;
        long j11 = this.f48515a;
        if (i10 != 1) {
            if (i10 == 2) {
                int i12 = ((int) j10) * 1000;
                if (i12 != i11) {
                    return m16780P(j11, i12);
                }
            } else if (i10 == 3) {
                int i13 = ((int) j10) * UtilsKt.MICROS_MULTIPLIER;
                if (i13 != i11) {
                    return m16780P(j11, i13);
                }
            } else {
                if (i10 != 4) {
                    throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
                }
                if (j10 != j11) {
                    return m16780P(j10, i11);
                }
            }
        } else if (j10 != i11) {
            return m16780P(j11, (int) j10);
        }
        return this;
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.mo16778m(this);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final Instant mo16788e(long j10, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.mo17137o(this, j10);
        }
        switch (AbstractC15535c.f48545b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return plusNanos(j10);
            case 2:
                return m16783S(j10 / 1000000, (j10 % 1000000) * 1000);
            case 3:
                return m16783S(j10 / 1000, (j10 % 1000) * 1000000);
            case 4:
                return plusSeconds(j10);
            case 5:
                return plusSeconds(AbstractC15529a.m16751o(j10, 60));
            case 6:
                return plusSeconds(AbstractC15529a.m16751o(j10, 3600));
            case 7:
                return plusSeconds(AbstractC15529a.m16751o(j10, 43200));
            case 8:
                return plusSeconds(AbstractC15529a.m16751o(j10, 86400));
            default:
                throw new C15636p("Unsupported unit: " + temporalUnit);
        }
    }

    public Instant plusSeconds(long j10) {
        return m16783S(j10, 0L);
    }

    public Instant plusNanos(long j10) {
        return m16783S(0L, j10);
    }

    /* JADX INFO: renamed from: S */
    private Instant m16783S(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return ofEpochSecond(AbstractC15529a.m16745i(AbstractC15529a.m16745i(this.f48515a, j10), j11 / 1000000000), ((long) this.f48516b) + (j11 % 1000000000));
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m */
    public final Temporal mo16789m(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? mo16788e(Long.MAX_VALUE, chronoUnit).mo16788e(1L, chronoUnit) : mo16788e(-j10, chronoUnit);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final Object mo16774y(TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17164j()) {
            return ChronoUnit.NANOS;
        }
        if (temporalQuery == AbstractC15632l.m17159e() || temporalQuery == AbstractC15632l.m17166l() || temporalQuery == AbstractC15632l.m17165k() || temporalQuery == AbstractC15632l.m17163i() || temporalQuery == AbstractC15632l.m17160f() || temporalQuery == AbstractC15632l.m17161g()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        return temporal.mo16787d(this.f48515a, EnumC15621a.INSTANT_SECONDS).mo16787d(this.f48516b, EnumC15621a.NANO_OF_SECOND);
    }

    @Override // p817j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Instant instantM16781Q = m16781Q(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            int i10 = AbstractC15535c.f48545b[((ChronoUnit) temporalUnit).ordinal()];
            int i11 = this.f48516b;
            long j10 = this.f48515a;
            switch (i10) {
                case 1:
                    return AbstractC15529a.m16745i(AbstractC15529a.m16751o(AbstractC15529a.m16752p(instantM16781Q.f48515a, j10), 1000000000L), instantM16781Q.f48516b - i11);
                case 2:
                    return AbstractC15529a.m16745i(AbstractC15529a.m16751o(AbstractC15529a.m16752p(instantM16781Q.f48515a, j10), 1000000000L), instantM16781Q.f48516b - i11) / 1000;
                case 3:
                    return AbstractC15529a.m16752p(instantM16781Q.toEpochMilli(), toEpochMilli());
                case 4:
                    return m16784U(instantM16781Q);
                case 5:
                    return m16784U(instantM16781Q) / 60;
                case 6:
                    return m16784U(instantM16781Q) / 3600;
                case 7:
                    return m16784U(instantM16781Q) / 43200;
                case 8:
                    return m16784U(instantM16781Q) / 86400;
                default:
                    throw new C15636p("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.mo17136m(this, instantM16781Q);
    }

    /* JADX INFO: renamed from: U */
    private long m16784U(Instant instant) {
        long jM16752p = AbstractC15529a.m16752p(instant.f48515a, this.f48515a);
        long j10 = instant.f48516b - this.f48516b;
        if (jM16752p <= 0 || j10 >= 0) {
            return (jM16752p >= 0 || j10 <= 0) ? jM16752p : jM16752p + 1;
        }
        return jM16752p - 1;
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.m16872Q(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.m16890Q(this, zoneId);
    }

    public long toEpochMilli() {
        long j10 = this.f48515a;
        int i10 = this.f48516b;
        return (j10 >= 0 || i10 <= 0) ? AbstractC15529a.m16745i(AbstractC15529a.m16751o(j10, 1000), i10 / UtilsKt.MICROS_MULTIPLIER) : AbstractC15529a.m16745i(AbstractC15529a.m16751o(j10 + 1, 1000), (i10 / UtilsKt.MICROS_MULTIPLIER) - 1000);
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.f48515a, instant.f48515a);
        return iCompare != 0 ? iCompare : this.f48516b - instant.f48516b;
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public boolean isBefore(Instant instant) {
        return compareTo(instant) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f48515a == instant.f48515a && this.f48516b == instant.f48516b;
    }

    public int hashCode() {
        long j10 = this.f48515a;
        return (this.f48516b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return DateTimeFormatter.f48632h.format(this);
    }

    private Object writeReplace() {
        return new C15615o((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: V */
    final void m16786V(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.f48515a);
        dataOutput.writeInt(this.f48516b);
    }
}
