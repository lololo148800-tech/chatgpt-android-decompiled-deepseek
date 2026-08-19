package p817j$.time.chrono;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import p817j$.time.Instant;
import p817j$.time.LocalDate;
import p817j$.time.LocalDateTime;
import p817j$.time.LocalTime;
import p817j$.time.ZoneId;
import p817j$.time.ZoneOffset;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalQuery;
import p817j$.time.temporal.TemporalUnit;
import p817j$.time.zone.C15642b;
import p817j$.time.zone.ZoneRules;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.j */
/* JADX INFO: loaded from: classes4.dex */
final class C15554j implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a */
    private final transient C15549e f48571a;

    /* JADX INFO: renamed from: b */
    private final transient ZoneOffset f48572b;

    /* JADX INFO: renamed from: c */
    private final transient ZoneId f48573c;

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: O */
    public final /* synthetic */ long mo16895O() {
        return AbstractC15551g.m16963o(this);
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ boolean isAfter(ChronoZonedDateTime chronoZonedDateTime) {
        return AbstractC15551g.m16955g(this, chronoZonedDateTime);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int mo16771o(InterfaceC15635o interfaceC15635o) {
        return AbstractC15551g.m16952d(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object mo16774y(TemporalQuery temporalQuery) {
        return AbstractC15551g.m16960l(this, temporalQuery);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return AbstractC15551g.m16951c(this, chronoZonedDateTime);
    }

    /* JADX INFO: renamed from: P */
    static ChronoZonedDateTime m16966P(ZoneId zoneId, ZoneOffset zoneOffset, C15549e c15549e) {
        Objects.requireNonNull(c15549e, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new C15554j(zoneId, (ZoneOffset) zoneId, c15549e);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime localDateTimeM16824Q = LocalDateTime.m16824Q(c15549e);
        List listM17208f = rules.m17208f(localDateTimeM16824Q);
        if (listM17208f.size() == 1) {
            zoneOffset = (ZoneOffset) listM17208f.get(0);
        } else if (listM17208f.size() == 0) {
            C15642b c15642bM17207e = rules.m17207e(localDateTimeM16824Q);
            c15549e = c15549e.m16946S(c15642bM17207e.m17219q().m16779q());
            zoneOffset = c15642bM17207e.m17220r();
        } else if (zoneOffset == null || !listM17208f.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listM17208f.get(0);
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new C15554j(zoneId, zoneOffset, c15549e);
    }

    /* JADX INFO: renamed from: Q */
    static C15554j m16967Q(InterfaceC15555k interfaceC15555k, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Objects.requireNonNull(offset, "offset");
        return new C15554j(zoneId, offset, (C15549e) interfaceC15555k.mo16938z(LocalDateTime.m16826W(instant.getEpochSecond(), instant.getNano(), offset)));
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            if (interfaceC15635o == EnumC15621a.INSTANT_SECONDS || interfaceC15635o == EnumC15621a.OFFSET_SECONDS) {
                return ((EnumC15621a) interfaceC15635o).mo17142m();
            }
            return ((C15549e) mo16894C()).mo16772r(interfaceC15635o);
        }
        return interfaceC15635o.mo17147y(this);
    }

    /* JADX INFO: renamed from: A */
    static C15554j m16965A(InterfaceC15555k interfaceC15555k, Temporal temporal) {
        C15554j c15554j = (C15554j) temporal;
        if (interfaceC15555k.equals(c15554j.mo16900a())) {
            return c15554j;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC15555k.getId() + ", actual: " + c15554j.mo16900a().getId());
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            int i10 = AbstractC15552h.f48569a[((EnumC15621a) interfaceC15635o).ordinal()];
            if (i10 == 1) {
                return mo16895O();
            }
            if (i10 == 2) {
                return mo16903h().getTotalSeconds();
            }
            return ((C15549e) mo16894C()).mo16773u(interfaceC15635o);
        }
        return interfaceC15635o.mo17144q(this);
    }

    private C15554j(ZoneId zoneId, ZoneOffset zoneOffset, C15549e c15549e) {
        this.f48571a = (C15549e) Objects.requireNonNull(c15549e, "dateTime");
        this.f48572b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.f48573c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: h */
    public final ZoneOffset mo16903h() {
        return this.f48572b;
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: c */
    public final ChronoLocalDate mo16902c() {
        return ((C15549e) mo16894C()).mo16841c();
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: b */
    public final LocalTime mo16901b() {
        return ((C15549e) mo16894C()).mo16840b();
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: C */
    public final ChronoLocalDateTime mo16894C() {
        return this.f48571a;
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: s */
    public final ZoneId mo16906s() {
        return this.f48573c;
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: a */
    public final InterfaceC15555k mo16900a() {
        return mo16902c().mo16812a();
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: j */
    public final ChronoZonedDateTime mo16905j(ZoneId zoneId) {
        return m16966P(zoneId, this.f48572b, this.f48571a);
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: i */
    public final ChronoZonedDateTime mo16904i(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f48573c.equals(zoneId)) {
            return this;
        }
        return m16967Q(mo16900a(), this.f48571a.m16947U(this.f48572b), zoneId);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        return (interfaceC15635o instanceof EnumC15621a) || (interfaceC15635o != null && interfaceC15635o.mo17145r(this));
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    public final Temporal mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return m16965A(mo16900a(), interfaceC15635o.mo17146u(this, j10));
        }
        EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
        int i10 = AbstractC15553i.f48570a[enumC15621a.ordinal()];
        if (i10 == 1) {
            return mo16788e(j10 - AbstractC15551g.m16963o(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.f48573c;
        C15549e c15549e = this.f48571a;
        if (i10 != 2) {
            return m16966P(zoneId, this.f48572b, c15549e.mo16787d(j10, interfaceC15635o));
        }
        return m16967Q(mo16900a(), c15549e.m16947U(ZoneOffset.ofTotalSeconds(enumC15621a.m17139P(j10))), zoneId);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final ChronoZonedDateTime mo16788e(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return m16965A(mo16900a(), this.f48571a.mo16788e(j10, temporalUnit).mo16768A(this));
        }
        return m16965A(mo16900a(), temporalUnit.mo17137o(this, j10));
    }

    @Override // p817j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime chronoZonedDateTimeMo16936x = mo16900a().mo16936x(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.f48571a.until(chronoZonedDateTimeMo16936x.mo16904i(this.f48572b).mo16894C(), temporalUnit);
        }
        Objects.requireNonNull(temporalUnit, "unit");
        return temporalUnit.mo17136m(this, chronoZonedDateTimeMo16936x);
    }

    private Object writeReplace() {
        return new C15539D((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f48571a);
        objectOutput.writeObject(this.f48572b);
        objectOutput.writeObject(this.f48573c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && AbstractC15551g.m16951c(this, (ChronoZonedDateTime) obj) == 0;
    }

    public final int hashCode() {
        return (this.f48571a.hashCode() ^ this.f48572b.hashCode()) ^ Integer.rotateLeft(this.f48573c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.f48571a.toString();
        ZoneOffset zoneOffset = this.f48572b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.f48573c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q */
    public final Temporal mo16790q(LocalDate localDate) {
        return m16965A(mo16900a(), localDate.mo16768A(this));
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m */
    public final Temporal mo16789m(long j10, ChronoUnit chronoUnit) {
        return m16965A(mo16900a(), AbstractC15632l.m17156b(this, j10, chronoUnit));
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.ofEpochSecond(mo16895O(), mo16901b().m16855T());
    }
}
