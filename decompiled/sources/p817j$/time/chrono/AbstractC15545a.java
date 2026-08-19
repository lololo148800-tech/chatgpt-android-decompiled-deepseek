package p817j$.time.chrono;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.DateTimeException;
import p817j$.time.DayOfWeek;
import p817j$.time.Instant;
import p817j$.time.LocalTime;
import p817j$.time.ZoneId;
import p817j$.time.format.EnumC15578E;
import p817j$.time.temporal.C15634n;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAdjusters;
import p817j$.time.temporal.TemporalUnit;
import p817j$.util.Objects;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.chrono.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15545a implements InterfaceC15555k {

    /* JADX INFO: renamed from: a */
    private static final ConcurrentHashMap f48557a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    private static final ConcurrentHashMap f48558b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f48559c = 0;

    /* JADX INFO: renamed from: o */
    public abstract /* synthetic */ ChronoLocalDate mo16923o();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((InterfaceC15555k) obj).getId());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    /* JADX INFO: renamed from: r */
    static InterfaceC15555k m16932r(AbstractC15545a abstractC15545a, String str) {
        String strMo16925t;
        InterfaceC15555k interfaceC15555k = (InterfaceC15555k) f48557a.putIfAbsent(str, abstractC15545a);
        if (interfaceC15555k == null && (strMo16925t = abstractC15545a.mo16925t()) != null) {
            f48558b.putIfAbsent(strMo16925t, abstractC15545a);
        }
        return interfaceC15555k;
    }

    /* JADX INFO: renamed from: q */
    static InterfaceC15555k m16931q(String str) {
        Objects.requireNonNull(str, ParameterNames.f31999ID);
        while (true) {
            ConcurrentHashMap concurrentHashMap = f48557a;
            InterfaceC15555k interfaceC15555k = (InterfaceC15555k) concurrentHashMap.get(str);
            if (interfaceC15555k == null) {
                interfaceC15555k = (InterfaceC15555k) f48558b.get(str);
            }
            if (interfaceC15555k != null) {
                return interfaceC15555k;
            }
            if (concurrentHashMap.get("ISO") != null) {
                for (InterfaceC15555k interfaceC15555k2 : ServiceLoader.load(InterfaceC15555k.class)) {
                    if (str.equals(interfaceC15555k2.getId()) || str.equals(interfaceC15555k2.mo16925t())) {
                        return interfaceC15555k2;
                    }
                }
                throw new DateTimeException("Unknown chronology: " + str);
            }
            C15558n c15558n = C15558n.f48575o;
            m16932r(c15558n, c15558n.getId());
            C15565u c15565u = C15565u.f48598d;
            m16932r(c15565u, c15565u.getId());
            C15570z c15570z = C15570z.f48610d;
            m16932r(c15570z, c15570z.getId());
            C15541F c15541f = C15541F.f48552d;
            m16932r(c15541f, c15541f.getId());
            try {
                for (AbstractC15545a abstractC15545a : Arrays.asList(new AbstractC15545a[0])) {
                    if (!abstractC15545a.getId().equals("ISO")) {
                        m16932r(abstractC15545a, abstractC15545a.getId());
                    }
                }
                C15562r c15562r = C15562r.f48594d;
                m16932r(c15562r, c15562r.getId());
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    protected AbstractC15545a() {
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: G */
    public ChronoLocalDate mo16915G(Map map, EnumC15578E enumC15578E) {
        EnumC15621a enumC15621a = EnumC15621a.EPOCH_DAY;
        if (map.containsKey(enumC15621a)) {
            return mo16922l(((Long) map.remove(enumC15621a)).longValue());
        }
        mo16937y(map, enumC15578E);
        ChronoLocalDate chronoLocalDateMo16935P = mo16935P(map, enumC15578E);
        if (chronoLocalDateMo16935P != null) {
            return chronoLocalDateMo16935P;
        }
        EnumC15621a enumC15621a2 = EnumC15621a.YEAR;
        if (!map.containsKey(enumC15621a2)) {
            return null;
        }
        EnumC15621a enumC15621a3 = EnumC15621a.MONTH_OF_YEAR;
        if (map.containsKey(enumC15621a3)) {
            if (map.containsKey(EnumC15621a.DAY_OF_MONTH)) {
                return mo16934A(map, enumC15578E);
            }
            EnumC15621a enumC15621a4 = EnumC15621a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(enumC15621a4)) {
                EnumC15621a enumC15621a5 = EnumC15621a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (!map.containsKey(enumC15621a5)) {
                    EnumC15621a enumC15621a6 = EnumC15621a.DAY_OF_WEEK;
                    if (map.containsKey(enumC15621a6)) {
                        int iM17170a = mo16916H(enumC15621a2).m17170a(((Long) map.remove(enumC15621a2)).longValue(), enumC15621a2);
                        if (enumC15578E == EnumC15578E.LENIENT) {
                            return m16933u(mo16914D(iM17170a, 1, 1), AbstractC15529a.m16752p(((Long) map.remove(enumC15621a3)).longValue(), 1L), AbstractC15529a.m16752p(((Long) map.remove(enumC15621a4)).longValue(), 1L), AbstractC15529a.m16752p(((Long) map.remove(enumC15621a6)).longValue(), 1L));
                        }
                        int iM17170a2 = mo16916H(enumC15621a3).m17170a(((Long) map.remove(enumC15621a3)).longValue(), enumC15621a3);
                        ChronoLocalDate chronoLocalDateMo16790q = mo16914D(iM17170a, iM17170a2, 1).mo16788e((mo16916H(enumC15621a4).m17170a(((Long) map.remove(enumC15621a4)).longValue(), enumC15621a4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).mo16790q(TemporalAdjusters.nextOrSame(DayOfWeek.m16767of(mo16916H(enumC15621a6).m17170a(((Long) map.remove(enumC15621a6)).longValue(), enumC15621a6))));
                        if (enumC15578E != EnumC15578E.STRICT || chronoLocalDateMo16790q.mo16771o(enumC15621a3) == iM17170a2) {
                            return chronoLocalDateMo16790q;
                        }
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                } else {
                    int iM17170a3 = mo16916H(enumC15621a2).m17170a(((Long) map.remove(enumC15621a2)).longValue(), enumC15621a2);
                    if (enumC15578E == EnumC15578E.LENIENT) {
                        long jM16752p = AbstractC15529a.m16752p(((Long) map.remove(enumC15621a3)).longValue(), 1L);
                        return mo16914D(iM17170a3, 1, 1).mo16788e(jM16752p, (TemporalUnit) ChronoUnit.MONTHS).mo16788e(AbstractC15529a.m16752p(((Long) map.remove(enumC15621a4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).mo16788e(AbstractC15529a.m16752p(((Long) map.remove(enumC15621a5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iM17170a4 = mo16916H(enumC15621a3).m17170a(((Long) map.remove(enumC15621a3)).longValue(), enumC15621a3);
                    ChronoLocalDate chronoLocalDateMo16788e = mo16914D(iM17170a3, iM17170a4, 1).mo16788e((mo16916H(enumC15621a5).m17170a(((Long) map.remove(enumC15621a5)).longValue(), enumC15621a5) - 1) + ((mo16916H(enumC15621a4).m17170a(((Long) map.remove(enumC15621a4)).longValue(), enumC15621a4) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (enumC15578E != EnumC15578E.STRICT || chronoLocalDateMo16788e.mo16771o(enumC15621a3) == iM17170a4) {
                        return chronoLocalDateMo16788e;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        EnumC15621a enumC15621a7 = EnumC15621a.DAY_OF_YEAR;
        if (!map.containsKey(enumC15621a7)) {
            EnumC15621a enumC15621a8 = EnumC15621a.ALIGNED_WEEK_OF_YEAR;
            if (!map.containsKey(enumC15621a8)) {
                return null;
            }
            EnumC15621a enumC15621a9 = EnumC15621a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
            if (!map.containsKey(enumC15621a9)) {
                EnumC15621a enumC15621a10 = EnumC15621a.DAY_OF_WEEK;
                if (!map.containsKey(enumC15621a10)) {
                    return null;
                }
                int iM17170a5 = mo16916H(enumC15621a2).m17170a(((Long) map.remove(enumC15621a2)).longValue(), enumC15621a2);
                if (enumC15578E == EnumC15578E.LENIENT) {
                    return m16933u(mo16926v(iM17170a5, 1), 0L, AbstractC15529a.m16752p(((Long) map.remove(enumC15621a8)).longValue(), 1L), AbstractC15529a.m16752p(((Long) map.remove(enumC15621a10)).longValue(), 1L));
                }
                ChronoLocalDate chronoLocalDateMo16790q2 = mo16926v(iM17170a5, 1).mo16788e((mo16916H(enumC15621a8).m17170a(((Long) map.remove(enumC15621a8)).longValue(), enumC15621a8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).mo16790q(TemporalAdjusters.nextOrSame(DayOfWeek.m16767of(mo16916H(enumC15621a10).m17170a(((Long) map.remove(enumC15621a10)).longValue(), enumC15621a10))));
                if (enumC15578E != EnumC15578E.STRICT || chronoLocalDateMo16790q2.mo16771o(enumC15621a2) == iM17170a5) {
                    return chronoLocalDateMo16790q2;
                }
                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            int iM17170a6 = mo16916H(enumC15621a2).m17170a(((Long) map.remove(enumC15621a2)).longValue(), enumC15621a2);
            if (enumC15578E == EnumC15578E.LENIENT) {
                return mo16926v(iM17170a6, 1).mo16788e(AbstractC15529a.m16752p(((Long) map.remove(enumC15621a8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).mo16788e(AbstractC15529a.m16752p(((Long) map.remove(enumC15621a9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            ChronoLocalDate chronoLocalDateMo16788e2 = mo16926v(iM17170a6, 1).mo16788e((mo16916H(enumC15621a9).m17170a(((Long) map.remove(enumC15621a9)).longValue(), enumC15621a9) - 1) + ((mo16916H(enumC15621a8).m17170a(((Long) map.remove(enumC15621a8)).longValue(), enumC15621a8) - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (enumC15578E != EnumC15578E.STRICT || chronoLocalDateMo16788e2.mo16771o(enumC15621a2) == iM17170a6) {
                return chronoLocalDateMo16788e2;
            }
            throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
        }
        int iM17170a7 = mo16916H(enumC15621a2).m17170a(((Long) map.remove(enumC15621a2)).longValue(), enumC15621a2);
        if (enumC15578E == EnumC15578E.LENIENT) {
            return mo16926v(iM17170a7, 1).mo16788e(AbstractC15529a.m16752p(((Long) map.remove(enumC15621a7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        return mo16926v(iM17170a7, mo16916H(enumC15621a7).m17170a(((Long) map.remove(enumC15621a7)).longValue(), enumC15621a7));
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: z */
    public ChronoLocalDateTime mo16938z(Temporal temporal) {
        try {
            return mo16924p(temporal).mo16822w(LocalTime.m16847Q(temporal));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporal.getClass(), e10);
        }
    }

    /* JADX INFO: renamed from: y */
    void mo16937y(Map map, EnumC15578E enumC15578E) {
        EnumC15621a enumC15621a = EnumC15621a.PROLEPTIC_MONTH;
        Long l4 = (Long) map.remove(enumC15621a);
        if (l4 != null) {
            if (enumC15578E != EnumC15578E.LENIENT) {
                enumC15621a.m17140Q(l4.longValue());
            }
            ChronoLocalDate chronoLocalDateMo16787d = mo16923o().mo16787d(1L, (InterfaceC15635o) EnumC15621a.DAY_OF_MONTH).mo16787d(l4.longValue(), (InterfaceC15635o) enumC15621a);
            EnumC15621a enumC15621a2 = EnumC15621a.MONTH_OF_YEAR;
            m16930m(map, enumC15621a2, chronoLocalDateMo16787d.mo16771o(enumC15621a2));
            EnumC15621a enumC15621a3 = EnumC15621a.YEAR;
            m16930m(map, enumC15621a3, chronoLocalDateMo16787d.mo16771o(enumC15621a3));
        }
    }

    /* JADX INFO: renamed from: P */
    ChronoLocalDate mo16935P(Map map, EnumC15578E enumC15578E) {
        int iM16744h;
        EnumC15621a enumC15621a = EnumC15621a.YEAR_OF_ERA;
        Long l4 = (Long) map.remove(enumC15621a);
        if (l4 != null) {
            EnumC15621a enumC15621a2 = EnumC15621a.ERA;
            Long l10 = (Long) map.remove(enumC15621a2);
            if (enumC15578E != EnumC15578E.LENIENT) {
                iM16744h = mo16916H(enumC15621a).m17170a(l4.longValue(), enumC15621a);
            } else {
                iM16744h = AbstractC15529a.m16744h(l4.longValue());
            }
            if (l10 != null) {
                m16930m(map, EnumC15621a.YEAR, mo16921g(mo16920N(mo16916H(enumC15621a2).m17170a(l10.longValue(), enumC15621a2)), iM16744h));
                return null;
            }
            EnumC15621a enumC15621a3 = EnumC15621a.YEAR;
            if (map.containsKey(enumC15621a3)) {
                m16930m(map, enumC15621a3, mo16921g(mo16926v(mo16916H(enumC15621a3).m17170a(((Long) map.get(enumC15621a3)).longValue(), enumC15621a3), 1).mo16801B(), iM16744h));
                return null;
            }
            if (enumC15578E == EnumC15578E.STRICT) {
                map.put(enumC15621a, l4);
                return null;
            }
            List listMo16918K = mo16918K();
            if (listMo16918K.isEmpty()) {
                m16930m(map, enumC15621a3, iM16744h);
                return null;
            }
            m16930m(map, enumC15621a3, mo16921g((InterfaceC15556l) listMo16918K.get(listMo16918K.size() - 1), iM16744h));
            return null;
        }
        EnumC15621a enumC15621a4 = EnumC15621a.ERA;
        if (!map.containsKey(enumC15621a4)) {
            return null;
        }
        mo16916H(enumC15621a4).m17171b(((Long) map.get(enumC15621a4)).longValue(), enumC15621a4);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.ChronoZonedDateTime] */
    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: x */
    public ChronoZonedDateTime mo16936x(Temporal temporal) {
        try {
            ZoneId zoneIdM16877P = ZoneId.m16877P(temporal);
            try {
                temporal = mo16917I(Instant.m16781Q(temporal), zoneIdM16877P);
                return temporal;
            } catch (DateTimeException unused) {
                return C15554j.m16966P(zoneIdM16877P, null, C15549e.m16941P(this, mo16938z(temporal)));
            }
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporal.getClass(), e10);
        }
    }

    /* JADX INFO: renamed from: A */
    ChronoLocalDate mo16934A(Map map, EnumC15578E enumC15578E) {
        EnumC15621a enumC15621a = EnumC15621a.YEAR;
        int iM17170a = mo16916H(enumC15621a).m17170a(((Long) map.remove(enumC15621a)).longValue(), enumC15621a);
        if (enumC15578E == EnumC15578E.LENIENT) {
            long jM16752p = AbstractC15529a.m16752p(((Long) map.remove(EnumC15621a.MONTH_OF_YEAR)).longValue(), 1L);
            return mo16914D(iM17170a, 1, 1).mo16788e(jM16752p, (TemporalUnit) ChronoUnit.MONTHS).mo16788e(AbstractC15529a.m16752p(((Long) map.remove(EnumC15621a.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        EnumC15621a enumC15621a2 = EnumC15621a.MONTH_OF_YEAR;
        int iM17170a2 = mo16916H(enumC15621a2).m17170a(((Long) map.remove(enumC15621a2)).longValue(), enumC15621a2);
        EnumC15621a enumC15621a3 = EnumC15621a.DAY_OF_MONTH;
        int iM17170a3 = mo16916H(enumC15621a3).m17170a(((Long) map.remove(enumC15621a3)).longValue(), enumC15621a3);
        if (enumC15578E != EnumC15578E.SMART) {
            return mo16914D(iM17170a, iM17170a2, iM17170a3);
        }
        try {
            return mo16914D(iM17170a, iM17170a2, iM17170a3);
        } catch (DateTimeException unused) {
            return mo16914D(iM17170a, iM17170a2, 1).mo16790q(new C15634n(0));
        }
    }

    /* JADX INFO: renamed from: u */
    static ChronoLocalDate m16933u(ChronoLocalDate chronoLocalDate, long j10, long j11, long j12) {
        long j13;
        ChronoLocalDate chronoLocalDateMo16788e = chronoLocalDate.mo16788e(j10, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate chronoLocalDateMo16788e2 = chronoLocalDateMo16788e.mo16788e(j11, (TemporalUnit) chronoUnit);
        if (j12 > 7) {
            long j14 = j12 - 1;
            chronoLocalDateMo16788e2 = chronoLocalDateMo16788e2.mo16788e(j14 / 7, (TemporalUnit) chronoUnit);
            j13 = j14 % 7;
        } else {
            if (j12 < 1) {
                chronoLocalDateMo16788e2 = chronoLocalDateMo16788e2.mo16788e(AbstractC15529a.m16752p(j12, 7L) / 7, (TemporalUnit) chronoUnit);
                j13 = (j12 + 6) % 7;
            }
            return chronoLocalDateMo16788e2.mo16790q(TemporalAdjusters.nextOrSame(DayOfWeek.m16767of((int) j12)));
        }
        j12 = j13 + 1;
        return chronoLocalDateMo16788e2.mo16790q(TemporalAdjusters.nextOrSame(DayOfWeek.m16767of((int) j12)));
    }

    /* JADX INFO: renamed from: m */
    static void m16930m(Map map, EnumC15621a enumC15621a, long j10) {
        Long l4 = (Long) map.get(enumC15621a);
        if (l4 != null && l4.longValue() != j10) {
            throw new DateTimeException("Conflict found: " + enumC15621a + Separators.f31991SP + l4 + " differs from " + enumC15621a + Separators.f31991SP + j10);
        }
        map.put(enumC15621a, Long.valueOf(j10));
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC15545a) && getId().compareTo(((AbstractC15545a) obj).getId()) == 0;
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    public final String toString() {
        return getId();
    }
}
