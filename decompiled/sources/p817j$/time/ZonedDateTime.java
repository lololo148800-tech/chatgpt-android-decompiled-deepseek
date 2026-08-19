package p817j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import p817j$.time.chrono.AbstractC15551g;
import p817j$.time.chrono.ChronoLocalDate;
import p817j$.time.chrono.ChronoLocalDateTime;
import p817j$.time.chrono.ChronoZonedDateTime;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.time.format.DateTimeFormatter;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalQuery;
import p817j$.time.temporal.TemporalUnit;
import p817j$.time.zone.C15642b;
import p817j$.time.zone.ZoneRules;
import p817j$.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a */
    private final LocalDateTime f48539a;

    /* JADX INFO: renamed from: b */
    private final ZoneOffset f48540b;

    /* JADX INFO: renamed from: c */
    private final ZoneId f48541c;

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: O */
    public final /* synthetic */ long mo16895O() {
        return AbstractC15551g.m16963o(this);
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ boolean isAfter(ChronoZonedDateTime chronoZonedDateTime) {
        return AbstractC15551g.m16955g(this, chronoZonedDateTime);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return AbstractC15551g.m16951c(this, chronoZonedDateTime);
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: C */
    public final ChronoLocalDateTime mo16894C() {
        return this.f48539a;
    }

    public static ZonedDateTime now() {
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Objects.requireNonNull(clockSystemDefaultZone, "clock");
        return m16890Q(clockSystemDefaultZone.instant(), clockSystemDefaultZone.mo16765a());
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: a */
    public final InterfaceC15555k mo16900a() {
        return ((LocalDate) mo16902c()).mo16812a();
    }

    /* JADX INFO: renamed from: R */
    public static ZonedDateTime m16891R(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List listM17208f = rules.m17208f(localDateTime);
        if (listM17208f.size() == 1) {
            zoneOffset = (ZoneOffset) listM17208f.get(0);
        } else if (listM17208f.size() == 0) {
            C15642b c15642bM17207e = rules.m17207e(localDateTime);
            localDateTime = localDateTime.m16839a0(c15642bM17207e.m17219q().m16779q());
            zoneOffset = c15642bM17207e.m17220r();
        } else if (zoneOffset == null || !listM17208f.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) listM17208f.get(0), "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    /* JADX INFO: renamed from: Q */
    public static ZonedDateTime m16890Q(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return m16888A(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    /* JADX INFO: renamed from: A */
    private static ZonedDateTime m16888A(long j10, int i10, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(Instant.ofEpochSecond(j10, i10));
        return new ZonedDateTime(LocalDateTime.m16826W(j10, i10, offset), zoneId, offset);
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.ofEpochSecond(mo16895O(), mo16901b().m16855T());
    }

    /* JADX INFO: renamed from: P */
    public static ZonedDateTime m16889P(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof ZonedDateTime) {
            return (ZonedDateTime) temporalAccessor;
        }
        try {
            ZoneId zoneIdM16877P = ZoneId.m16877P(temporalAccessor);
            EnumC15621a enumC15621a = EnumC15621a.INSTANT_SECONDS;
            if (!temporalAccessor.mo16770f(enumC15621a)) {
                return m16891R(LocalDateTime.m16830of(LocalDate.m16792R(temporalAccessor), LocalTime.m16847Q(temporalAccessor)), zoneIdM16877P, null);
            }
            return m16888A(temporalAccessor.mo16773u(enumC15621a), temporalAccessor.mo16771o(EnumC15621a.NANO_OF_SECOND), zoneIdM16877P);
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public static ZonedDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (ZonedDateTime) dateTimeFormatter.parse(charSequence, new C15571d(3));
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f48539a = localDateTime;
        this.f48540b = zoneOffset;
        this.f48541c = zoneId;
    }

    /* JADX INFO: renamed from: U */
    private ZonedDateTime m16893U(LocalDateTime localDateTime) {
        return m16891R(localDateTime, this.f48541c, this.f48540b);
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
            return this.f48539a.mo16772r(interfaceC15635o);
        }
        return interfaceC15635o.mo17147y(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final int mo16771o(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            int i10 = AbstractC15640u.f48804a[((EnumC15621a) interfaceC15635o).ordinal()];
            if (i10 == 1) {
                throw new C15636p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f48540b.getTotalSeconds();
            }
            return this.f48539a.mo16771o(interfaceC15635o);
        }
        return AbstractC15551g.m16952d(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return interfaceC15635o.mo17144q(this);
        }
        int i10 = AbstractC15640u.f48804a[((EnumC15621a) interfaceC15635o).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f48539a.mo16773u(interfaceC15635o) : this.f48540b.getTotalSeconds();
        }
        return AbstractC15551g.m16963o(this);
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: h */
    public final ZoneOffset mo16903h() {
        return this.f48540b;
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: s */
    public final ZoneId mo16906s() {
        return this.f48541c;
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: j */
    public final ChronoZonedDateTime mo16905j(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f48541c.equals(zoneId) ? this : m16891R(this.f48539a, zoneId, this.f48540b);
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime mo16904i(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.f48541c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.f48539a;
        localDateTime.getClass();
        return m16888A(AbstractC15551g.m16962n(localDateTime, this.f48540b), localDateTime.m16831R(), zoneId);
    }

    /* JADX INFO: renamed from: V */
    public final LocalDateTime m16897V() {
        return this.f48539a;
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: c */
    public final ChronoLocalDate mo16902c() {
        return this.f48539a.mo16841c();
    }

    @Override // p817j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: b */
    public final LocalTime mo16901b() {
        return this.f48539a.mo16840b();
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q */
    public final Temporal mo16790q(LocalDate localDate) {
        boolean z6 = localDate instanceof LocalDate;
        LocalDateTime localDateTime = this.f48539a;
        if (z6) {
            return m16893U(LocalDateTime.m16830of(localDate, localDateTime.mo16840b()));
        }
        return (ZonedDateTime) localDate.mo16768A(this);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    public final Temporal mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
            int i10 = AbstractC15640u.f48804a[enumC15621a.ordinal()];
            ZoneId zoneId = this.f48541c;
            LocalDateTime localDateTime = this.f48539a;
            if (i10 == 1) {
                return m16888A(j10, localDateTime.m16831R(), zoneId);
            }
            if (i10 == 2) {
                ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(enumC15621a.m17139P(j10));
                return (zoneOffsetOfTotalSeconds.equals(this.f48540b) || !zoneId.getRules().m17208f(localDateTime).contains(zoneOffsetOfTotalSeconds)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffsetOfTotalSeconds);
            }
            return m16893U(localDateTime.mo16787d(j10, interfaceC15635o));
        }
        return (ZonedDateTime) interfaceC15635o.mo17146u(this, j10);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime mo16788e(long j10, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (ZonedDateTime) temporalUnit.mo17137o(this, j10);
        }
        ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
        boolean z6 = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        LocalDateTime localDateTime = this.f48539a;
        if (z6) {
            return m16893U(localDateTime.mo16788e(j10, temporalUnit));
        }
        LocalDateTime localDateTimeMo16788e = localDateTime.mo16788e(j10, temporalUnit);
        Objects.requireNonNull(localDateTimeMo16788e, "localDateTime");
        ZoneOffset zoneOffset = this.f48540b;
        Objects.requireNonNull(zoneOffset, "offset");
        ZoneId zoneId = this.f48541c;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.getRules().m17208f(localDateTimeMo16788e).contains(zoneOffset)) {
            return new ZonedDateTime(localDateTimeMo16788e, zoneId, zoneOffset);
        }
        localDateTimeMo16788e.getClass();
        return m16888A(AbstractC15551g.m16962n(localDateTimeMo16788e, zoneOffset), localDateTimeMo16788e.m16831R(), zoneId);
    }

    public ZonedDateTime plusMonths(long j10) {
        return m16893U(this.f48539a.m16837Z(j10));
    }

    public ZonedDateTime plusDays(long j10) {
        return m16893U(this.f48539a.m16836Y(j10));
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m */
    public final Temporal mo16789m(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? mo16788e(Long.MAX_VALUE, chronoUnit).mo16788e(1L, chronoUnit) : mo16788e(-j10, chronoUnit);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final Object mo16774y(TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17160f()) {
            return this.f48539a.mo16841c();
        }
        return AbstractC15551g.m16960l(this, temporalQuery);
    }

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
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        ZonedDateTime zonedDateTimeM16889P = m16889P(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ZonedDateTime zonedDateTimeMo16904i = zonedDateTimeM16889P.mo16904i(this.f48541c);
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
            LocalDateTime localDateTime = this.f48539a;
            LocalDateTime localDateTime2 = zonedDateTimeMo16904i.f48539a;
            if (iCompareTo >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return localDateTime.until(localDateTime2, temporalUnit);
            }
            return OffsetDateTime.m16871P(localDateTime, this.f48540b).until(OffsetDateTime.m16871P(localDateTime2, zonedDateTimeMo16904i.f48540b), temporalUnit);
        }
        return temporalUnit.mo17136m(this, zonedDateTimeM16889P);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.f48539a.equals(zonedDateTime.f48539a) && this.f48540b.equals(zonedDateTime.f48540b) && this.f48541c.equals(zonedDateTime.f48541c);
    }

    public final int hashCode() {
        return (this.f48539a.hashCode() ^ this.f48540b.hashCode()) ^ Integer.rotateLeft(this.f48541c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.f48539a.toString();
        ZoneOffset zoneOffset = this.f48540b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.f48541c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new C15615o((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: X */
    final void m16899X(DataOutput dataOutput) {
        this.f48539a.m16844f0(dataOutput);
        this.f48540b.m16887Y(dataOutput);
        this.f48541c.mo16882T((ObjectOutput) dataOutput);
    }

    /* JADX INFO: renamed from: T */
    static ZonedDateTime m16892T(ObjectInput objectInput) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        LocalDate localDate = LocalDate.MIN;
        LocalDateTime localDateTimeM16830of = LocalDateTime.m16830of(LocalDate.m16800of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.m16852d0(objectInput));
        ZoneOffset zoneOffsetM16885X = ZoneOffset.m16885X(objectInput);
        ZoneId zoneId = (ZoneId) C15615o.m17119a(objectInput);
        Objects.requireNonNull(localDateTimeM16830of, "localDateTime");
        Objects.requireNonNull(zoneOffsetM16885X, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if ((zoneId instanceof ZoneOffset) && !zoneOffsetM16885X.equals(zoneId)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new ZonedDateTime(localDateTimeM16830of, zoneId, zoneOffsetM16885X);
    }
}
