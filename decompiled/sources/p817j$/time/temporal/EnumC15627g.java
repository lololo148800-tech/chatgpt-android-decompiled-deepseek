package p817j$.time.temporal;

import java.util.HashMap;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.DateTimeException;
import p817j$.time.DayOfWeek;
import p817j$.time.LocalDate;
import p817j$.time.chrono.AbstractC15551g;
import p817j$.time.chrono.C15562r;
import p817j$.time.format.EnumC15578E;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.time.temporal.g */
/* JADX INFO: loaded from: classes4.dex */
abstract class EnumC15627g implements InterfaceC15635o {
    public static final EnumC15627g DAY_OF_QUARTER;
    public static final EnumC15627g QUARTER_OF_YEAR;
    public static final EnumC15627g WEEK_BASED_YEAR;
    public static final EnumC15627g WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a */
    private static final int[] f48760a;

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ EnumC15627g[] f48761b;

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: A */
    public final boolean mo17138A() {
        return true;
    }

    /* JADX INFO: renamed from: o */
    public /* synthetic */ TemporalAccessor mo17143o(HashMap map, TemporalAccessor temporalAccessor, EnumC15578E enumC15578E) {
        return null;
    }

    public static EnumC15627g valueOf(String str) {
        return (EnumC15627g) Enum.valueOf(EnumC15627g.class, str);
    }

    public static EnumC15627g[] values() {
        return (EnumC15627g[]) f48761b.clone();
    }

    static {
        EnumC15627g enumC15627g = new EnumC15627g() { // from class: j$.time.temporal.c
            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: m */
            public final C15637q mo17142m() {
                return C15637q.m17169k(1L, 90L, 92L);
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: r */
            public final boolean mo17145r(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.mo16770f(EnumC15621a.DAY_OF_YEAR) && temporalAccessor.mo16770f(EnumC15621a.MONTH_OF_YEAR) && temporalAccessor.mo16770f(EnumC15621a.YEAR)) {
                    InterfaceC15635o interfaceC15635o = AbstractC15629i.f48764a;
                    if (AbstractC15551g.m16964p(temporalAccessor).equals(C15562r.f48594d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: y */
            public final C15637q mo17147y(TemporalAccessor temporalAccessor) {
                if (!mo17145r(temporalAccessor)) {
                    throw new C15636p("Unsupported field: DayOfQuarter");
                }
                long jMo16773u = temporalAccessor.mo16773u(EnumC15627g.QUARTER_OF_YEAR);
                if (jMo16773u == 1) {
                    return C15562r.f48594d.mo16919M(temporalAccessor.mo16773u(EnumC15621a.YEAR)) ? C15637q.m17168j(1L, 91L) : C15637q.m17168j(1L, 90L);
                }
                if (jMo16773u == 2) {
                    return C15637q.m17168j(1L, 91L);
                }
                if (jMo16773u == 3 || jMo16773u == 4) {
                    return C15637q.m17168j(1L, 92L);
                }
                return mo17142m();
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: q */
            public final long mo17144q(TemporalAccessor temporalAccessor) {
                if (!mo17145r(temporalAccessor)) {
                    throw new C15636p("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.mo16771o(EnumC15621a.DAY_OF_YEAR) - EnumC15627g.f48760a[((temporalAccessor.mo16771o(EnumC15621a.MONTH_OF_YEAR) - 1) / 3) + (C15562r.f48594d.mo16919M(temporalAccessor.mo16773u(EnumC15621a.YEAR)) ? 4 : 0)];
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: u */
            public final Temporal mo17146u(Temporal temporal, long j10) {
                long jMo17144q = mo17144q(temporal);
                mo17142m().m17171b(j10, this);
                EnumC15621a enumC15621a = EnumC15621a.DAY_OF_YEAR;
                return temporal.mo16787d((j10 - jMo17144q) + temporal.mo16773u(enumC15621a), enumC15621a);
            }

            @Override // p817j$.time.temporal.EnumC15627g, p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: o */
            public final TemporalAccessor mo17143o(HashMap map, TemporalAccessor temporalAccessor, EnumC15578E enumC15578E) {
                long jM16752p;
                LocalDate localDatePlusMonths;
                EnumC15621a enumC15621a = EnumC15621a.YEAR;
                Long l4 = (Long) map.get(enumC15621a);
                InterfaceC15635o interfaceC15635o = EnumC15627g.QUARTER_OF_YEAR;
                Long l10 = (Long) map.get(interfaceC15635o);
                if (l4 == null || l10 == null) {
                    return null;
                }
                int iM17139P = enumC15621a.m17139P(l4.longValue());
                long jLongValue = ((Long) map.get(EnumC15627g.DAY_OF_QUARTER)).longValue();
                InterfaceC15635o interfaceC15635o2 = AbstractC15629i.f48764a;
                if (!AbstractC15551g.m16964p(temporalAccessor).equals(C15562r.f48594d)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                if (enumC15578E == EnumC15578E.LENIENT) {
                    localDatePlusMonths = LocalDate.m16800of(iM17139P, 1, 1).plusMonths(AbstractC15529a.m16751o(AbstractC15529a.m16752p(l10.longValue(), 1L), 3));
                    jM16752p = AbstractC15529a.m16752p(jLongValue, 1L);
                } else {
                    LocalDate localDateM16800of = LocalDate.m16800of(iM17139P, ((interfaceC15635o.mo17142m().m17170a(l10.longValue(), interfaceC15635o) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (enumC15578E == EnumC15578E.STRICT) {
                            mo17147y(localDateM16800of).m17171b(jLongValue, this);
                        } else {
                            mo17142m().m17171b(jLongValue, this);
                        }
                    }
                    jM16752p = jLongValue - 1;
                    localDatePlusMonths = localDateM16800of;
                }
                map.remove(this);
                map.remove(enumC15621a);
                map.remove(interfaceC15635o);
                return localDatePlusMonths.m16814e0(jM16752p);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = enumC15627g;
        EnumC15627g enumC15627g2 = new EnumC15627g() { // from class: j$.time.temporal.d
            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: m */
            public final C15637q mo17142m() {
                return C15637q.m17168j(1L, 4L);
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: r */
            public final boolean mo17145r(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.mo16770f(EnumC15621a.MONTH_OF_YEAR)) {
                    InterfaceC15635o interfaceC15635o = AbstractC15629i.f48764a;
                    if (AbstractC15551g.m16964p(temporalAccessor).equals(C15562r.f48594d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: q */
            public final long mo17144q(TemporalAccessor temporalAccessor) {
                if (!mo17145r(temporalAccessor)) {
                    throw new C15636p("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.mo16773u(EnumC15621a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: y */
            public final C15637q mo17147y(TemporalAccessor temporalAccessor) {
                if (!mo17145r(temporalAccessor)) {
                    throw new C15636p("Unsupported field: QuarterOfYear");
                }
                return mo17142m();
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: u */
            public final Temporal mo17146u(Temporal temporal, long j10) {
                long jMo17144q = mo17144q(temporal);
                mo17142m().m17171b(j10, this);
                EnumC15621a enumC15621a = EnumC15621a.MONTH_OF_YEAR;
                return temporal.mo16787d(((j10 - jMo17144q) * 3) + temporal.mo16773u(enumC15621a), enumC15621a);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = enumC15627g2;
        EnumC15627g enumC15627g3 = new EnumC15627g() { // from class: j$.time.temporal.e
            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: m */
            public final C15637q mo17142m() {
                return C15637q.m17169k(1L, 52L, 53L);
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: r */
            public final boolean mo17145r(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.mo16770f(EnumC15621a.EPOCH_DAY)) {
                    InterfaceC15635o interfaceC15635o = AbstractC15629i.f48764a;
                    if (AbstractC15551g.m16964p(temporalAccessor).equals(C15562r.f48594d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: y */
            public final C15637q mo17147y(TemporalAccessor temporalAccessor) {
                if (!mo17145r(temporalAccessor)) {
                    throw new C15636p("Unsupported field: WeekOfWeekBasedYear");
                }
                return EnumC15627g.m17152T(LocalDate.m16792R(temporalAccessor));
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: q */
            public final long mo17144q(TemporalAccessor temporalAccessor) {
                if (!mo17145r(temporalAccessor)) {
                    throw new C15636p("Unsupported field: WeekOfWeekBasedYear");
                }
                return EnumC15627g.m17149Q(LocalDate.m16792R(temporalAccessor));
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: u */
            public final Temporal mo17146u(Temporal temporal, long j10) {
                mo17142m().m17171b(j10, this);
                return temporal.mo16788e(AbstractC15529a.m16752p(j10, mo17144q(temporal)), ChronoUnit.WEEKS);
            }

            @Override // p817j$.time.temporal.EnumC15627g, p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: o */
            public final TemporalAccessor mo17143o(HashMap map, TemporalAccessor temporalAccessor, EnumC15578E enumC15578E) {
                LocalDate localDateMo16787d;
                long j10;
                long j11;
                InterfaceC15635o interfaceC15635o = EnumC15627g.WEEK_BASED_YEAR;
                Long l4 = (Long) map.get(interfaceC15635o);
                EnumC15621a enumC15621a = EnumC15621a.DAY_OF_WEEK;
                Long l10 = (Long) map.get(enumC15621a);
                if (l4 == null || l10 == null) {
                    return null;
                }
                int iM17170a = interfaceC15635o.mo17142m().m17170a(l4.longValue(), interfaceC15635o);
                long jLongValue = ((Long) map.get(EnumC15627g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                InterfaceC15635o interfaceC15635o2 = AbstractC15629i.f48764a;
                if (AbstractC15551g.m16964p(temporalAccessor).equals(C15562r.f48594d)) {
                    LocalDate localDateM16800of = LocalDate.m16800of(iM17170a, 1, 4);
                    if (enumC15578E == EnumC15578E.LENIENT) {
                        long jLongValue2 = l10.longValue();
                        if (jLongValue2 > 7) {
                            long j12 = jLongValue2 - 1;
                            localDateM16800of = localDateM16800of.m16815f0(j12 / 7);
                            j11 = j12 % 7;
                        } else {
                            j10 = 1;
                            if (jLongValue2 < 1) {
                                localDateM16800of = localDateM16800of.m16815f0(AbstractC15529a.m16752p(jLongValue2, 7L) / 7);
                                j11 = (jLongValue2 + 6) % 7;
                            }
                            localDateMo16787d = localDateM16800of.m16815f0(AbstractC15529a.m16752p(jLongValue, j10)).mo16787d(jLongValue2, enumC15621a);
                        }
                        j10 = 1;
                        jLongValue2 = j11 + 1;
                        localDateMo16787d = localDateM16800of.m16815f0(AbstractC15529a.m16752p(jLongValue, j10)).mo16787d(jLongValue2, enumC15621a);
                    } else {
                        int iM17139P = enumC15621a.m17139P(l10.longValue());
                        if (jLongValue < 1 || jLongValue > 52) {
                            if (enumC15578E == EnumC15578E.STRICT) {
                                EnumC15627g.m17152T(localDateM16800of).m17171b(jLongValue, this);
                            } else {
                                mo17142m().m17171b(jLongValue, this);
                            }
                        }
                        localDateMo16787d = localDateM16800of.m16815f0(jLongValue - 1).mo16787d(iM17139P, enumC15621a);
                    }
                    map.remove(this);
                    map.remove(interfaceC15635o);
                    map.remove(enumC15621a);
                    return localDateMo16787d;
                }
                throw new DateTimeException("Resolve requires IsoChronology");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = enumC15627g3;
        EnumC15627g enumC15627g4 = new EnumC15627g() { // from class: j$.time.temporal.f
            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: m */
            public final C15637q mo17142m() {
                return EnumC15621a.YEAR.mo17142m();
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: r */
            public final boolean mo17145r(TemporalAccessor temporalAccessor) {
                if (temporalAccessor.mo16770f(EnumC15621a.EPOCH_DAY)) {
                    InterfaceC15635o interfaceC15635o = AbstractC15629i.f48764a;
                    if (AbstractC15551g.m16964p(temporalAccessor).equals(C15562r.f48594d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: q */
            public final long mo17144q(TemporalAccessor temporalAccessor) {
                if (!mo17145r(temporalAccessor)) {
                    throw new C15636p("Unsupported field: WeekBasedYear");
                }
                return EnumC15627g.m17153U(LocalDate.m16792R(temporalAccessor));
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: y */
            public final C15637q mo17147y(TemporalAccessor temporalAccessor) {
                if (!mo17145r(temporalAccessor)) {
                    throw new C15636p("Unsupported field: WeekBasedYear");
                }
                return mo17142m();
            }

            @Override // p817j$.time.temporal.InterfaceC15635o
            /* JADX INFO: renamed from: u */
            public final Temporal mo17146u(Temporal temporal, long j10) {
                if (!mo17145r(temporal)) {
                    throw new C15636p("Unsupported field: WeekBasedYear");
                }
                int iM17170a = EnumC15621a.YEAR.mo17142m().m17170a(j10, EnumC15627g.WEEK_BASED_YEAR);
                LocalDate localDateM16792R = LocalDate.m16792R(temporal);
                EnumC15621a enumC15621a = EnumC15621a.DAY_OF_WEEK;
                int iMo16771o = localDateM16792R.mo16771o(enumC15621a);
                int iM17149Q = EnumC15627g.m17149Q(localDateM16792R);
                if (iM17149Q == 53 && EnumC15627g.m17154V(iM17170a) == 52) {
                    iM17149Q = 52;
                }
                LocalDate localDateM16800of = LocalDate.m16800of(iM17170a, 1, 4);
                return temporal.mo16790q(localDateM16800of.m16814e0(((iM17149Q - 1) * 7) + (iMo16771o - localDateM16800of.mo16771o(enumC15621a))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = enumC15627g4;
        f48761b = new EnumC15627g[]{enumC15627g, enumC15627g2, enumC15627g3, enumC15627g4};
        f48760a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX INFO: renamed from: T */
    static C15637q m17152T(LocalDate localDate) {
        return C15637q.m17168j(1L, m17154V(m17153U(localDate)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static int m17154V(int i10) {
        LocalDate localDateM16800of = LocalDate.m16800of(i10, 1, 1);
        if (localDateM16800of.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateM16800of.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateM16800of.mo16803F()) ? 53 : 52;
        }
        return 53;
    }

    /* JADX INFO: renamed from: Q */
    static int m17149Q(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int i10 = 1;
        int iM16807T = localDate.m16807T() - 1;
        int i11 = (3 - iOrdinal) + iM16807T;
        int i12 = i11 - ((i11 / 7) * 7);
        int i13 = i12 - 3;
        if (i13 < -3) {
            i13 = i12 + 4;
        }
        if (iM16807T < i13) {
            return (int) C15637q.m17168j(1L, m17154V(m17153U(localDate.m16818j0(180).m16816g0(-1L)))).m17172d();
        }
        int i14 = ((iM16807T - i13) / 7) + 1;
        if (i14 != 53 || i13 == -3 || (i13 == -2 && localDate.mo16803F())) {
            i10 = i14;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static int m17153U(LocalDate localDate) {
        int year = localDate.getYear();
        int iM16807T = localDate.m16807T();
        if (iM16807T <= 3) {
            return iM16807T - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (iM16807T >= 363) {
            return ((iM16807T - 363) - (localDate.mo16803F() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
