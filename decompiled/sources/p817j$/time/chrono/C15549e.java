package p817j$.time.chrono;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.Instant;
import p817j$.time.LocalDate;
import p817j$.time.LocalTime;
import p817j$.time.ZoneId;
import p817j$.time.ZoneOffset;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAdjuster;
import p817j$.time.temporal.TemporalQuery;
import p817j$.time.temporal.TemporalUnit;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.e */
/* JADX INFO: loaded from: classes4.dex */
final class C15549e implements ChronoLocalDateTime, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a */
    private final transient ChronoLocalDate f48562a;

    /* JADX INFO: renamed from: b */
    private final transient LocalTime f48563b;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p817j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return AbstractC15551g.m16950b(this, chronoLocalDateTime);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object mo16774y(TemporalQuery temporalQuery) {
        return AbstractC15551g.m16959k(this, temporalQuery);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return compareTo((ChronoLocalDateTime) chronoLocalDateTime);
    }

    /* JADX INFO: renamed from: Q */
    static C15549e m16942Q(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        return new C15549e(chronoLocalDate, localTime);
    }

    /* JADX INFO: renamed from: P */
    static C15549e m16941P(InterfaceC15555k interfaceC15555k, Temporal temporal) {
        C15549e c15549e = (C15549e) temporal;
        if (interfaceC15555k.equals(c15549e.f48562a.mo16812a())) {
            return c15549e;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC15555k.getId() + ", actual: " + c15549e.f48562a.mo16812a().getId());
    }

    @Override // p817j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: a */
    public final InterfaceC15555k mo16838a() {
        return this.f48562a.mo16812a();
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m */
    public final Temporal mo16789m(long j10, ChronoUnit chronoUnit) {
        return m16941P(this.f48562a.mo16812a(), AbstractC15632l.m17156b(this, j10, chronoUnit));
    }

    private C15549e(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(chronoLocalDate, "date");
        Objects.requireNonNull(localTime, "time");
        this.f48562a = chronoLocalDate;
        this.f48563b = localTime;
    }

    /* JADX INFO: renamed from: W */
    private C15549e m16944W(Temporal temporal, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.f48562a;
        return (chronoLocalDate == temporal && this.f48563b == localTime) ? this : new C15549e(AbstractC15547c.m16939P(chronoLocalDate.mo16812a(), temporal), localTime);
    }

    @Override // p817j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: c */
    public final ChronoLocalDate mo16841c() {
        return this.f48562a;
    }

    @Override // p817j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: b */
    public final LocalTime mo16840b() {
        return this.f48563b;
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
            if (!((EnumC15621a) interfaceC15635o).m17141R()) {
                return this.f48562a.mo16772r(interfaceC15635o);
            }
            LocalTime localTime = this.f48563b;
            localTime.getClass();
            return AbstractC15632l.m17158d(localTime, interfaceC15635o);
        }
        return interfaceC15635o.mo17147y(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final int mo16771o(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return ((EnumC15621a) interfaceC15635o).m17141R() ? this.f48563b.mo16771o(interfaceC15635o) : this.f48562a.mo16771o(interfaceC15635o);
        }
        return mo16772r(interfaceC15635o).m17170a(mo16773u(interfaceC15635o), interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return ((EnumC15621a) interfaceC15635o).m17141R() ? this.f48563b.mo16773u(interfaceC15635o) : this.f48562a.mo16773u(interfaceC15635o);
        }
        return interfaceC15635o.mo17144q(this);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q */
    public final Temporal mo16790q(LocalDate localDate) {
        if (localDate instanceof ChronoLocalDate) {
            return m16944W(localDate, this.f48563b);
        }
        return m16941P(this.f48562a.mo16812a(), (C15549e) localDate.mo16768A(this));
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final C15549e mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        boolean z6 = interfaceC15635o instanceof EnumC15621a;
        ChronoLocalDate chronoLocalDate = this.f48562a;
        if (z6) {
            boolean zM17141R = ((EnumC15621a) interfaceC15635o).m17141R();
            LocalTime localTime = this.f48563b;
            if (zM17141R) {
                return m16944W(chronoLocalDate, localTime.mo16787d(j10, interfaceC15635o));
            }
            return m16944W(chronoLocalDate.mo16787d(j10, interfaceC15635o), localTime);
        }
        return m16941P(chronoLocalDate.mo16812a(), interfaceC15635o.mo17146u(this, j10));
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final C15549e mo16788e(long j10, TemporalUnit temporalUnit) {
        boolean z6 = temporalUnit instanceof ChronoUnit;
        ChronoLocalDate chronoLocalDate = this.f48562a;
        if (z6) {
            int i10 = AbstractC15548d.f48561a[((ChronoUnit) temporalUnit).ordinal()];
            LocalTime localTime = this.f48563b;
            switch (i10) {
                case 1:
                    return m16943T(this.f48562a, 0L, 0L, 0L, j10);
                case 2:
                    C15549e c15549eM16944W = m16944W(chronoLocalDate.mo16788e(j10 / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), localTime);
                    return c15549eM16944W.m16943T(c15549eM16944W.f48562a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
                case 3:
                    C15549e c15549eM16944W2 = m16944W(chronoLocalDate.mo16788e(j10 / 86400000, (TemporalUnit) ChronoUnit.DAYS), localTime);
                    return c15549eM16944W2.m16943T(c15549eM16944W2.f48562a, 0L, 0L, 0L, (j10 % 86400000) * 1000000);
                case 4:
                    return m16946S(j10);
                case 5:
                    return m16943T(this.f48562a, 0L, j10, 0L, 0L);
                case 6:
                    return m16943T(this.f48562a, j10, 0L, 0L, 0L);
                case 7:
                    C15549e c15549eM16944W3 = m16944W(chronoLocalDate.mo16788e(j10 / 256, (TemporalUnit) ChronoUnit.DAYS), localTime);
                    return c15549eM16944W3.m16943T(c15549eM16944W3.f48562a, (j10 % 256) * 12, 0L, 0L, 0L);
                default:
                    return m16944W(chronoLocalDate.mo16788e(j10, temporalUnit), localTime);
            }
        }
        return m16941P(chronoLocalDate.mo16812a(), temporalUnit.mo17137o(this, j10));
    }

    /* JADX INFO: renamed from: S */
    final C15549e m16946S(long j10) {
        return m16943T(this.f48562a, 0L, 0L, j10, 0L);
    }

    /* JADX INFO: renamed from: T */
    private C15549e m16943T(ChronoLocalDate chronoLocalDate, long j10, long j11, long j12, long j13) {
        long j14 = j10 | j11 | j12 | j13;
        LocalTime localTimeM16850W = this.f48563b;
        if (j14 == 0) {
            return m16944W(chronoLocalDate, localTimeM16850W);
        }
        long j15 = j11 / 1440;
        long j16 = j10 / 24;
        long j17 = (j11 % 1440) * 60000000000L;
        long j18 = ((j10 % 24) * 3600000000000L) + j17 + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
        long jM16862e0 = localTimeM16850W.m16862e0();
        long j19 = j18 + jM16862e0;
        long jM16750n = AbstractC15529a.m16750n(j19, 86400000000000L) + j16 + j15 + (j12 / 86400) + (j13 / 86400000000000L);
        long jM16749m = AbstractC15529a.m16749m(j19, 86400000000000L);
        if (jM16749m != jM16862e0) {
            localTimeM16850W = LocalTime.m16850W(jM16749m);
        }
        return m16944W(chronoLocalDate.mo16788e(jM16750n, (TemporalUnit) ChronoUnit.DAYS), localTimeM16850W);
    }

    @Override // p817j$.time.chrono.ChronoLocalDateTime
    /* JADX INFO: renamed from: n */
    public final ChronoZonedDateTime mo16845n(ZoneId zoneId) {
        return C15554j.m16966P(zoneId, null, this);
    }

    @Override // p817j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDate = this.f48562a;
        ChronoLocalDateTime chronoLocalDateTimeMo16938z = chronoLocalDate.mo16812a().mo16938z(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.mo17136m(this, chronoLocalDateTimeMo16938z);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        boolean z6 = ((ChronoUnit) temporalUnit).compareTo(chronoUnit) < 0;
        LocalTime localTime = this.f48563b;
        if (!z6) {
            ChronoLocalDate chronoLocalDateMo16841c = chronoLocalDateTimeMo16938z.mo16841c();
            if (chronoLocalDateTimeMo16938z.mo16840b().compareTo(localTime) < 0) {
                chronoLocalDateMo16841c = chronoLocalDateMo16841c.mo16789m(1L, chronoUnit);
            }
            return chronoLocalDate.until(chronoLocalDateMo16841c, temporalUnit);
        }
        EnumC15621a enumC15621a = EnumC15621a.EPOCH_DAY;
        long jMo16773u = chronoLocalDateTimeMo16938z.mo16773u(enumC15621a) - chronoLocalDate.mo16773u(enumC15621a);
        switch (AbstractC15548d.f48561a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jMo16773u = AbstractC15529a.m16751o(jMo16773u, 86400000000000L);
                break;
            case 2:
                jMo16773u = AbstractC15529a.m16751o(jMo16773u, 86400000000L);
                break;
            case 3:
                jMo16773u = AbstractC15529a.m16751o(jMo16773u, 86400000L);
                break;
            case 4:
                jMo16773u = AbstractC15529a.m16751o(jMo16773u, 86400);
                break;
            case 5:
                jMo16773u = AbstractC15529a.m16751o(jMo16773u, 1440);
                break;
            case 6:
                jMo16773u = AbstractC15529a.m16751o(jMo16773u, 24);
                break;
            case 7:
                jMo16773u = AbstractC15529a.m16751o(jMo16773u, 2);
                break;
        }
        return AbstractC15529a.m16745i(jMo16773u, localTime.until(chronoLocalDateTimeMo16938z.mo16840b(), temporalUnit));
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        return temporal.mo16787d(mo16841c().toEpochDay(), EnumC15621a.EPOCH_DAY).mo16787d(mo16840b().m16862e0(), EnumC15621a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new C15539D((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f48562a);
        objectOutput.writeObject(this.f48563b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && AbstractC15551g.m16950b(this, (ChronoLocalDateTime) obj) == 0;
    }

    public final int hashCode() {
        return this.f48562a.hashCode() ^ this.f48563b.hashCode();
    }

    /* JADX INFO: renamed from: U */
    public final Instant m16947U(ZoneOffset zoneOffset) {
        return Instant.ofEpochSecond(AbstractC15551g.m16962n(this, zoneOffset), this.f48563b.m16855T());
    }

    public final String toString() {
        return this.f48562a.toString() + TokenNames.f32019T + this.f48563b.toString();
    }
}
