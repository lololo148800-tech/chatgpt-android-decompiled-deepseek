package p817j$.time.chrono;

import android.gov.nist.core.Separators;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.Clock;
import p817j$.time.DateTimeException;
import p817j$.time.Instant;
import p817j$.time.LocalDate;
import p817j$.time.ZoneId;
import p817j$.time.format.EnumC15578E;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15634n;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.u */
/* JADX INFO: loaded from: classes4.dex */
public final class C15565u extends AbstractC15545a implements Serializable {

    /* JADX INFO: renamed from: d */
    public static final C15565u f48598d = new C15565u();
    private static final long serialVersionUID = 459996390165777884L;

    private C15565u() {
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    public final String getId() {
        return "Japanese";
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: t */
    public final String mo16925t() {
        return "japanese";
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: D */
    public final ChronoLocalDate mo16914D(int i10, int i11, int i12) {
        return new C15567w(LocalDate.m16800of(i10, i11, i12));
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: v */
    public final ChronoLocalDate mo16926v(int i10, int i11) {
        return new C15567w(LocalDate.m16798c0(i10, i11));
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: l */
    public final ChronoLocalDate mo16922l(long j10) {
        return new C15567w(LocalDate.ofEpochDay(j10));
    }

    @Override // p817j$.time.chrono.AbstractC15545a
    /* JADX INFO: renamed from: o */
    public final ChronoLocalDate mo16923o() {
        return new C15567w(LocalDate.m16792R(LocalDate.m16796a0(Clock.systemDefaultZone())));
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: p */
    public final ChronoLocalDate mo16924p(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof C15567w) {
            return (C15567w) temporalAccessor;
        }
        return new C15567w(LocalDate.m16792R(temporalAccessor));
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: M */
    public final boolean mo16919M(long j10) {
        return C15562r.f48594d.mo16919M(j10);
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: g */
    public final int mo16921g(InterfaceC15556l interfaceC15556l, int i10) {
        if (!(interfaceC15556l instanceof C15568x)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        C15568x c15568x = (C15568x) interfaceC15556l;
        int year = (c15568x.m16999p().getYear() + i10) - 1;
        if (i10 == 1) {
            return year;
        }
        if (year < -999999999 || year > 999999999 || year < c15568x.m16999p().getYear() || interfaceC15556l != C15568x.m16993g(LocalDate.m16800of(year, 1, 1))) {
            throw new DateTimeException("Invalid yearOfEra value");
        }
        return year;
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: N */
    public final InterfaceC15556l mo16920N(int i10) {
        return C15568x.m16995v(i10);
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: K */
    public final List mo16918K() {
        return AbstractC15529a.m16747k(C15568x.m16992D());
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: H */
    public final C15637q mo16916H(EnumC15621a enumC15621a) {
        switch (AbstractC15564t.f48597a[enumC15621a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new C15636p("Unsupported field: " + enumC15621a);
            case 5:
                return C15637q.m17169k(1L, C15568x.m16997z(), 999999999 - C15568x.m16994l().m16999p().getYear());
            case 6:
                return C15637q.m17169k(1L, C15568x.m16996x(), EnumC15621a.DAY_OF_YEAR.mo17142m().m17172d());
            case 7:
                return C15637q.m17168j(C15567w.f48600d.getYear(), 999999999L);
            case 8:
                return C15637q.m17168j(C15568x.f48604d.getValue(), C15568x.m16994l().getValue());
            default:
                return enumC15621a.mo17142m();
        }
    }

    @Override // p817j$.time.chrono.AbstractC15545a, p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: G */
    public final ChronoLocalDate mo16915G(Map map, EnumC15578E enumC15578E) {
        return (C15567w) super.mo16915G(map, enumC15578E);
    }

    @Override // p817j$.time.chrono.AbstractC15545a
    /* JADX INFO: renamed from: P */
    final ChronoLocalDate mo16935P(Map map, EnumC15578E enumC15578E) {
        C15567w c15567wM16991Y;
        EnumC15621a enumC15621a = EnumC15621a.ERA;
        Long l4 = (Long) map.get(enumC15621a);
        C15568x c15568xM16995v = l4 != null ? C15568x.m16995v(mo16916H(enumC15621a).m17170a(l4.longValue(), enumC15621a)) : null;
        EnumC15621a enumC15621a2 = EnumC15621a.YEAR_OF_ERA;
        Long l10 = (Long) map.get(enumC15621a2);
        int iM17170a = l10 != null ? mo16916H(enumC15621a2).m17170a(l10.longValue(), enumC15621a2) : 0;
        if (c15568xM16995v == null && l10 != null && !map.containsKey(EnumC15621a.YEAR) && enumC15578E != EnumC15578E.STRICT) {
            c15568xM16995v = C15568x.m16992D()[C15568x.m16992D().length - 1];
        }
        if (l10 != null && c15568xM16995v != null) {
            EnumC15621a enumC15621a3 = EnumC15621a.MONTH_OF_YEAR;
            if (map.containsKey(enumC15621a3)) {
                EnumC15621a enumC15621a4 = EnumC15621a.DAY_OF_MONTH;
                if (map.containsKey(enumC15621a4)) {
                    map.remove(enumC15621a);
                    map.remove(enumC15621a2);
                    if (enumC15578E == EnumC15578E.LENIENT) {
                        return new C15567w(LocalDate.m16800of((c15568xM16995v.m16999p().getYear() + iM17170a) - 1, 1, 1)).m16989V(AbstractC15529a.m16752p(((Long) map.remove(enumC15621a3)).longValue(), 1L), ChronoUnit.MONTHS).m16989V(AbstractC15529a.m16752p(((Long) map.remove(enumC15621a4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iM17170a2 = mo16916H(enumC15621a3).m17170a(((Long) map.remove(enumC15621a3)).longValue(), enumC15621a3);
                    int iM17170a3 = mo16916H(enumC15621a4).m17170a(((Long) map.remove(enumC15621a4)).longValue(), enumC15621a4);
                    if (enumC15578E != EnumC15578E.SMART) {
                        LocalDate localDate = C15567w.f48600d;
                        Objects.requireNonNull(c15568xM16995v, "era");
                        LocalDate localDateM16800of = LocalDate.m16800of((c15568xM16995v.m16999p().getYear() + iM17170a) - 1, iM17170a2, iM17170a3);
                        if (localDateM16800of.m16809W(c15568xM16995v.m16999p()) || c15568xM16995v != C15568x.m16993g(localDateM16800of)) {
                            throw new DateTimeException("year, month, and day not valid for Era");
                        }
                        return new C15567w(c15568xM16995v, iM17170a, localDateM16800of);
                    }
                    if (iM17170a < 1) {
                        throw new DateTimeException("Invalid YearOfEra: " + iM17170a);
                    }
                    int year = (c15568xM16995v.m16999p().getYear() + iM17170a) - 1;
                    try {
                        c15567wM16991Y = new C15567w(LocalDate.m16800of(year, iM17170a2, iM17170a3));
                    } catch (DateTimeException unused) {
                        c15567wM16991Y = new C15567w(LocalDate.m16800of(year, iM17170a2, 1)).m16991Y(new C15634n(0));
                    }
                    if (c15567wM16991Y.m16988U() == c15568xM16995v || AbstractC15632l.m17155a(c15567wM16991Y, EnumC15621a.YEAR_OF_ERA) <= 1 || iM17170a <= 1) {
                        return c15567wM16991Y;
                    }
                    throw new DateTimeException("Invalid YearOfEra for Era: " + c15568xM16995v + Separators.f31991SP + iM17170a);
                }
            }
            EnumC15621a enumC15621a5 = EnumC15621a.DAY_OF_YEAR;
            if (map.containsKey(enumC15621a5)) {
                map.remove(enumC15621a);
                map.remove(enumC15621a2);
                if (enumC15578E == EnumC15578E.LENIENT) {
                    return new C15567w(LocalDate.m16798c0((c15568xM16995v.m16999p().getYear() + iM17170a) - 1, 1)).m16989V(AbstractC15529a.m16752p(((Long) map.remove(enumC15621a5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iM17170a4 = mo16916H(enumC15621a5).m17170a(((Long) map.remove(enumC15621a5)).longValue(), enumC15621a5);
                LocalDate localDate2 = C15567w.f48600d;
                Objects.requireNonNull(c15568xM16995v, "era");
                LocalDate localDateM16798c0 = iM17170a == 1 ? LocalDate.m16798c0(c15568xM16995v.m16999p().getYear(), (c15568xM16995v.m16999p().m16807T() + iM17170a4) - 1) : LocalDate.m16798c0((c15568xM16995v.m16999p().getYear() + iM17170a) - 1, iM17170a4);
                if (localDateM16798c0.m16809W(c15568xM16995v.m16999p()) || c15568xM16995v != C15568x.m16993g(localDateM16798c0)) {
                    throw new DateTimeException("Invalid parameters");
                }
                return new C15567w(c15568xM16995v, iM17170a, localDateM16798c0);
            }
        }
        return null;
    }

    @Override // p817j$.time.chrono.InterfaceC15555k
    /* JADX INFO: renamed from: I */
    public final ChronoZonedDateTime mo16917I(Instant instant, ZoneId zoneId) {
        return C15554j.m16967Q(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new C15539D((byte) 1, this);
    }
}
