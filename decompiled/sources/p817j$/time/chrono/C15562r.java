package p817j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.C15617q;
import p817j$.time.Clock;
import p817j$.time.DateTimeException;
import p817j$.time.Instant;
import p817j$.time.LocalDate;
import p817j$.time.LocalDateTime;
import p817j$.time.Month;
import p817j$.time.ZoneId;
import p817j$.time.ZonedDateTime;
import p817j$.time.format.EnumC15578E;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.r */
/* JADX INFO: loaded from: classes4.dex */
public final class C15562r extends AbstractC15545a implements Serializable {

    /* JADX INFO: renamed from: d */
    public static final C15562r f48594d = new C15562r();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: N */
    public final InterfaceC15556l mo16920N(int i10) {
        if (i10 == 0) {
            return EnumC15563s.BCE;
        }
        if (i10 == 1) {
            return EnumC15563s.f48595CE;
        }
        throw new DateTimeException("Invalid era: " + i10);
    }

    private C15562r() {
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    public final String getId() {
        return "ISO";
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: t */
    public final String mo16925t() {
        return "iso8601";
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: D */
    public final ChronoLocalDate mo16914D(int i10, int i11, int i12) {
        return LocalDate.m16800of(i10, i11, i12);
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: v */
    public final ChronoLocalDate mo16926v(int i10, int i11) {
        return LocalDate.m16798c0(i10, i11);
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: l */
    public final ChronoLocalDate mo16922l(long j10) {
        return LocalDate.ofEpochDay(j10);
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: p */
    public final ChronoLocalDate mo16924p(TemporalAccessor temporalAccessor) {
        return LocalDate.m16792R(temporalAccessor);
    }

    @Override // p817j$.time.chrono.AbstractC15545a, p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: z */
    public final ChronoLocalDateTime mo16938z(Temporal temporal) {
        return LocalDateTime.m16824Q(temporal);
    }

    @Override // p817j$.time.chrono.AbstractC15545a, p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: x */
    public final ChronoZonedDateTime mo16936x(Temporal temporal) {
        return ZonedDateTime.m16889P(temporal);
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: I */
    public final ChronoZonedDateTime mo16917I(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.m16890Q(instant, zoneId);
    }

    @Override // p817j$.time.chrono.AbstractC15545a
    /* JADX INFO: renamed from: o */
    public final ChronoLocalDate mo16923o() {
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Objects.requireNonNull(clockSystemDefaultZone, "clock");
        return LocalDate.m16792R(LocalDate.m16796a0(clockSystemDefaultZone));
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: M */
    public final boolean mo16919M(long j10) {
        return (3 & j10) == 0 && (j10 % 100 != 0 || j10 % 400 == 0);
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: g */
    public final int mo16921g(InterfaceC15556l interfaceC15556l, int i10) {
        if (interfaceC15556l instanceof EnumC15563s) {
            return interfaceC15556l == EnumC15563s.f48595CE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: K */
    public final List mo16918K() {
        return AbstractC15529a.m16747k(EnumC15563s.values());
    }

    @Override // p817j$.time.chrono.AbstractC15545a, p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: G */
    public final ChronoLocalDate mo16915G(Map map, EnumC15578E enumC15578E) {
        return (LocalDate) super.mo16915G(map, enumC15578E);
    }

    @Override // p817j$.time.chrono.AbstractC15545a
    /* JADX INFO: renamed from: y */
    final void mo16937y(Map map, EnumC15578E enumC15578E) {
        EnumC15621a enumC15621a = EnumC15621a.PROLEPTIC_MONTH;
        Long l4 = (Long) map.remove(enumC15621a);
        if (l4 != null) {
            if (enumC15578E != EnumC15578E.LENIENT) {
                enumC15621a.m17140Q(l4.longValue());
            }
            long j10 = 12;
            AbstractC15545a.m16930m(map, EnumC15621a.MONTH_OF_YEAR, ((int) AbstractC15529a.m16749m(l4.longValue(), j10)) + 1);
            AbstractC15545a.m16930m(map, EnumC15621a.YEAR, AbstractC15529a.m16750n(l4.longValue(), j10));
        }
    }

    @Override // p817j$.time.chrono.AbstractC15545a
    /* JADX INFO: renamed from: P */
    final ChronoLocalDate mo16935P(Map map, EnumC15578E enumC15578E) {
        EnumC15621a enumC15621a = EnumC15621a.YEAR_OF_ERA;
        Long l4 = (Long) map.remove(enumC15621a);
        if (l4 != null) {
            if (enumC15578E != EnumC15578E.LENIENT) {
                enumC15621a.m17140Q(l4.longValue());
            }
            Long l10 = (Long) map.remove(EnumC15621a.ERA);
            if (l10 != null) {
                if (l10.longValue() == 1) {
                    AbstractC15545a.m16930m(map, EnumC15621a.YEAR, l4.longValue());
                    return null;
                }
                if (l10.longValue() == 0) {
                    AbstractC15545a.m16930m(map, EnumC15621a.YEAR, AbstractC15529a.m16752p(1L, l4.longValue()));
                    return null;
                }
                throw new DateTimeException("Invalid value for era: " + l10);
            }
            EnumC15621a enumC15621a2 = EnumC15621a.YEAR;
            Long l11 = (Long) map.get(enumC15621a2);
            if (enumC15578E != EnumC15578E.STRICT) {
                AbstractC15545a.m16930m(map, enumC15621a2, (l11 == null || l11.longValue() > 0) ? l4.longValue() : AbstractC15529a.m16752p(1L, l4.longValue()));
                return null;
            }
            if (l11 != null) {
                long jLongValue = l11.longValue();
                long jLongValue2 = l4.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = AbstractC15529a.m16752p(1L, jLongValue2);
                }
                AbstractC15545a.m16930m(map, enumC15621a2, jLongValue2);
                return null;
            }
            map.put(enumC15621a, l4);
            return null;
        }
        EnumC15621a enumC15621a3 = EnumC15621a.ERA;
        if (!map.containsKey(enumC15621a3)) {
            return null;
        }
        enumC15621a3.m17140Q(((Long) map.get(enumC15621a3)).longValue());
        return null;
    }

    @Override // p817j$.time.chrono.AbstractC15545a
    /* JADX INFO: renamed from: A */
    final ChronoLocalDate mo16934A(Map map, EnumC15578E enumC15578E) {
        EnumC15621a enumC15621a = EnumC15621a.YEAR;
        int iM17139P = enumC15621a.m17139P(((Long) map.remove(enumC15621a)).longValue());
        boolean z6 = true;
        if (enumC15578E == EnumC15578E.LENIENT) {
            return LocalDate.m16800of(iM17139P, 1, 1).plusMonths(AbstractC15529a.m16752p(((Long) map.remove(EnumC15621a.MONTH_OF_YEAR)).longValue(), 1L)).m16814e0(AbstractC15529a.m16752p(((Long) map.remove(EnumC15621a.DAY_OF_MONTH)).longValue(), 1L));
        }
        EnumC15621a enumC15621a2 = EnumC15621a.MONTH_OF_YEAR;
        int iM17139P2 = enumC15621a2.m17139P(((Long) map.remove(enumC15621a2)).longValue());
        EnumC15621a enumC15621a3 = EnumC15621a.DAY_OF_MONTH;
        int iM17139P3 = enumC15621a3.m17139P(((Long) map.remove(enumC15621a3)).longValue());
        if (enumC15578E == EnumC15578E.SMART) {
            if (iM17139P2 == 4 || iM17139P2 == 6 || iM17139P2 == 9 || iM17139P2 == 11) {
                iM17139P3 = Math.min(iM17139P3, 30);
            } else if (iM17139P2 == 2) {
                Month month = Month.FEBRUARY;
                long j10 = iM17139P;
                int i10 = C15617q.f48744b;
                if ((3 & j10) != 0 || (j10 % 100 == 0 && j10 % 400 != 0)) {
                    z6 = false;
                }
                iM17139P3 = Math.min(iM17139P3, month.m16868Q(z6));
            }
        }
        return LocalDate.m16800of(iM17139P, iM17139P2, iM17139P3);
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: H */
    public final C15637q mo16916H(EnumC15621a enumC15621a) {
        return enumC15621a.mo17142m();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new C15539D((byte) 1, this);
    }
}
