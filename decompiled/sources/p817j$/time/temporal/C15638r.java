package p817j$.time.temporal;

import java.util.HashMap;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.DateTimeException;
import p817j$.time.chrono.AbstractC15551g;
import p817j$.time.chrono.ChronoLocalDate;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.time.format.EnumC15578E;

/* JADX INFO: renamed from: j$.time.temporal.r */
/* JADX INFO: loaded from: classes4.dex */
final class C15638r implements InterfaceC15635o {

    /* JADX INFO: renamed from: f */
    private static final C15637q f48787f = C15637q.m17168j(1, 7);

    /* JADX INFO: renamed from: g */
    private static final C15637q f48788g = C15637q.m17169k(0, 4, 6);

    /* JADX INFO: renamed from: h */
    private static final C15637q f48789h = C15637q.m17169k(0, 52, 54);

    /* JADX INFO: renamed from: i */
    private static final C15637q f48790i = C15637q.m17169k(1, 52, 53);

    /* JADX INFO: renamed from: a */
    private final String f48791a;

    /* JADX INFO: renamed from: b */
    private final C15639s f48792b;

    /* JADX INFO: renamed from: c */
    private final Enum f48793c;

    /* JADX INFO: renamed from: d */
    private final Enum f48794d;

    /* JADX INFO: renamed from: e */
    private final C15637q f48795e;

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: A */
    public final boolean mo17138A() {
        return true;
    }

    /* JADX INFO: renamed from: e */
    static C15638r m17182e(C15639s c15639s) {
        return new C15638r("DayOfWeek", c15639s, ChronoUnit.DAYS, ChronoUnit.WEEKS, f48787f);
    }

    /* JADX INFO: renamed from: h */
    static C15638r m17185h(C15639s c15639s) {
        return new C15638r("WeekOfMonth", c15639s, ChronoUnit.WEEKS, ChronoUnit.MONTHS, f48788g);
    }

    /* JADX INFO: renamed from: i */
    static C15638r m17186i(C15639s c15639s) {
        return new C15638r("WeekOfWeekBasedYear", c15639s, ChronoUnit.WEEKS, AbstractC15629i.f48767d, f48790i);
    }

    /* JADX INFO: renamed from: g */
    static C15638r m17184g(C15639s c15639s) {
        return new C15638r("WeekBasedYear", c15639s, AbstractC15629i.f48767d, ChronoUnit.FOREVER, EnumC15621a.YEAR.mo17142m());
    }

    /* JADX INFO: renamed from: f */
    private ChronoLocalDate m17183f(InterfaceC15555k interfaceC15555k, int i10, int i11, int i12) {
        ChronoLocalDate chronoLocalDateMo16914D = interfaceC15555k.mo16914D(i10, 1, 1);
        int iM17189l = m17189l(1, m17179b(chronoLocalDateMo16914D));
        return chronoLocalDateMo16914D.mo16788e(((Math.min(i11, m17178a(iM17189l, this.f48792b.m17196f() + chronoLocalDateMo16914D.mo16805L()) - 1) - 1) * 7) + (i12 - 1) + (-iM17189l), (TemporalUnit) ChronoUnit.DAYS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C15638r(String str, C15639s c15639s, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, C15637q c15637q) {
        this.f48791a = str;
        this.f48792b = c15639s;
        this.f48793c = (Enum) temporalUnit;
        this.f48794d = (Enum) temporalUnit2;
        this.f48795e = c15637q;
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: q */
    public final long mo17144q(TemporalAccessor temporalAccessor) {
        int iM17180c;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r6 = this.f48794d;
        if (r6 == chronoUnit) {
            iM17180c = m17179b(temporalAccessor);
        } else if (r6 != ChronoUnit.MONTHS) {
            if (r6 != ChronoUnit.YEARS) {
                if (r6 == C15639s.f48797h) {
                    iM17180c = m17181d(temporalAccessor);
                } else if (r6 == ChronoUnit.FOREVER) {
                    iM17180c = m17180c(temporalAccessor);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + r6 + ", this: " + this);
                }
            } else {
                int iM17179b = m17179b(temporalAccessor);
                int iMo16771o = temporalAccessor.mo16771o(EnumC15621a.DAY_OF_YEAR);
                return m17178a(m17189l(iMo16771o, iM17179b), iMo16771o);
            }
        } else {
            int iM17179b2 = m17179b(temporalAccessor);
            int iMo16771o2 = temporalAccessor.mo16771o(EnumC15621a.DAY_OF_MONTH);
            return m17178a(m17189l(iMo16771o2, iM17179b2), iMo16771o2);
        }
        return iM17180c;
    }

    /* JADX INFO: renamed from: b */
    private int m17179b(TemporalAccessor temporalAccessor) {
        return AbstractC15632l.m17162h(temporalAccessor.mo16771o(EnumC15621a.DAY_OF_WEEK) - this.f48792b.m17195e().getValue()) + 1;
    }

    /* JADX INFO: renamed from: c */
    private int m17180c(TemporalAccessor temporalAccessor) {
        int iM17179b = m17179b(temporalAccessor);
        int iMo16771o = temporalAccessor.mo16771o(EnumC15621a.YEAR);
        EnumC15621a enumC15621a = EnumC15621a.DAY_OF_YEAR;
        int iMo16771o2 = temporalAccessor.mo16771o(enumC15621a);
        int iM17189l = m17189l(iMo16771o2, iM17179b);
        int iM17178a = m17178a(iM17189l, iMo16771o2);
        if (iM17178a == 0) {
            return iMo16771o - 1;
        }
        return iM17178a >= m17178a(iM17189l, this.f48792b.m17196f() + ((int) temporalAccessor.mo16772r(enumC15621a).m17172d())) ? iMo16771o + 1 : iMo16771o;
    }

    /* JADX INFO: renamed from: d */
    private int m17181d(TemporalAccessor temporalAccessor) {
        int iM17179b = m17179b(temporalAccessor);
        EnumC15621a enumC15621a = EnumC15621a.DAY_OF_YEAR;
        int iMo16771o = temporalAccessor.mo16771o(enumC15621a);
        int iM17189l = m17189l(iMo16771o, iM17179b);
        int iM17178a = m17178a(iM17189l, iMo16771o);
        if (iM17178a == 0) {
            return m17181d(AbstractC15551g.m16964p(temporalAccessor).mo16924p(temporalAccessor).mo16789m(iMo16771o, ChronoUnit.DAYS));
        }
        if (iM17178a <= 50) {
            return iM17178a;
        }
        int iM17178a2 = m17178a(iM17189l, this.f48792b.m17196f() + ((int) temporalAccessor.mo16772r(enumC15621a).m17172d()));
        return iM17178a >= iM17178a2 ? (iM17178a - iM17178a2) + 1 : iM17178a;
    }

    /* JADX INFO: renamed from: l */
    private int m17189l(int i10, int i11) {
        int iM17162h = AbstractC15632l.m17162h(i10 - i11);
        return iM17162h + 1 > this.f48792b.m17196f() ? 7 - iM17162h : -iM17162h;
    }

    /* JADX INFO: renamed from: a */
    private static int m17178a(int i10, int i11) {
        return ((i11 - 1) + (i10 + 7)) / 7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.TemporalUnit, java.lang.Enum] */
    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: u */
    public final Temporal mo17146u(Temporal temporal, long j10) {
        int iM17170a = this.f48795e.m17170a(j10, this);
        int iMo16771o = temporal.mo16771o(this);
        if (iM17170a == iMo16771o) {
            return temporal;
        }
        if (this.f48794d == ChronoUnit.FOREVER) {
            C15639s c15639s = this.f48792b;
            return m17183f(AbstractC15551g.m16964p(temporal), (int) j10, temporal.mo16771o(c15639s.f48802e), temporal.mo16771o(c15639s.f48800c));
        }
        return temporal.mo16788e(iM17170a - iMo16771o, this.f48793c);
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: o */
    public final TemporalAccessor mo17143o(HashMap map, TemporalAccessor temporalAccessor, EnumC15578E enumC15578E) {
        ChronoLocalDate chronoLocalDateMo16788e;
        ChronoLocalDate chronoLocalDateMo16788e2;
        EnumC15621a enumC15621a;
        ChronoLocalDate chronoLocalDateMo16788e3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int iM16744h = AbstractC15529a.m16744h(jLongValue);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r10 = this.f48794d;
        C15637q c15637q = this.f48795e;
        C15639s c15639s = this.f48792b;
        if (r10 == chronoUnit) {
            long jM17162h = AbstractC15632l.m17162h((c15637q.m17170a(jLongValue, this) - 1) + (c15639s.m17195e().getValue() - 1)) + 1;
            map.remove(this);
            map.put(EnumC15621a.DAY_OF_WEEK, Long.valueOf(jM17162h));
        } else {
            EnumC15621a enumC15621a2 = EnumC15621a.DAY_OF_WEEK;
            if (map.containsKey(enumC15621a2)) {
                int iM17162h = AbstractC15632l.m17162h(enumC15621a2.m17139P(((Long) map.get(enumC15621a2)).longValue()) - c15639s.m17195e().getValue()) + 1;
                InterfaceC15555k interfaceC15555kM16964p = AbstractC15551g.m16964p(temporalAccessor);
                EnumC15621a enumC15621a3 = EnumC15621a.YEAR;
                if (map.containsKey(enumC15621a3)) {
                    int iM17139P = enumC15621a3.m17139P(((Long) map.get(enumC15621a3)).longValue());
                    ChronoUnit chronoUnit2 = ChronoUnit.MONTHS;
                    if (r10 == chronoUnit2) {
                        EnumC15621a enumC15621a4 = EnumC15621a.MONTH_OF_YEAR;
                        if (map.containsKey(enumC15621a4)) {
                            long jLongValue2 = ((Long) map.get(enumC15621a4)).longValue();
                            long j10 = iM16744h;
                            if (enumC15578E == EnumC15578E.LENIENT) {
                                ChronoLocalDate chronoLocalDateMo16788e4 = interfaceC15555kM16964p.mo16914D(iM17139P, 1, 1).mo16788e(AbstractC15529a.m16752p(jLongValue2, 1L), (TemporalUnit) chronoUnit2);
                                int iM17179b = m17179b(chronoLocalDateMo16788e4);
                                int iMo16771o = chronoLocalDateMo16788e4.mo16771o(EnumC15621a.DAY_OF_MONTH);
                                chronoLocalDateMo16788e3 = chronoLocalDateMo16788e4.mo16788e(AbstractC15529a.m16745i(AbstractC15529a.m16751o(AbstractC15529a.m16752p(j10, m17178a(m17189l(iMo16771o, iM17179b), iMo16771o)), 7), iM17162h - m17179b(chronoLocalDateMo16788e4)), (TemporalUnit) ChronoUnit.DAYS);
                                enumC15621a = enumC15621a4;
                            } else {
                                enumC15621a = enumC15621a4;
                                ChronoLocalDate chronoLocalDateMo16914D = interfaceC15555kM16964p.mo16914D(iM17139P, enumC15621a.m17139P(jLongValue2), 1);
                                long jM17170a = c15637q.m17170a(j10, this);
                                int iM17179b2 = m17179b(chronoLocalDateMo16914D);
                                int iMo16771o2 = chronoLocalDateMo16914D.mo16771o(EnumC15621a.DAY_OF_MONTH);
                                ChronoLocalDate chronoLocalDateMo16788e5 = chronoLocalDateMo16914D.mo16788e((((int) (jM17170a - ((long) m17178a(m17189l(iMo16771o2, iM17179b2), iMo16771o2)))) * 7) + (iM17162h - m17179b(chronoLocalDateMo16914D)), (TemporalUnit) ChronoUnit.DAYS);
                                if (enumC15578E == EnumC15578E.STRICT && chronoLocalDateMo16788e5.mo16773u(enumC15621a) != jLongValue2) {
                                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                                }
                                chronoLocalDateMo16788e3 = chronoLocalDateMo16788e5;
                            }
                            map.remove(this);
                            map.remove(enumC15621a3);
                            map.remove(enumC15621a);
                            map.remove(enumC15621a2);
                            return chronoLocalDateMo16788e3;
                        }
                    }
                    if (r10 == ChronoUnit.YEARS) {
                        long j11 = iM16744h;
                        ChronoLocalDate chronoLocalDateMo16914D2 = interfaceC15555kM16964p.mo16914D(iM17139P, 1, 1);
                        if (enumC15578E == EnumC15578E.LENIENT) {
                            int iM17179b3 = m17179b(chronoLocalDateMo16914D2);
                            int iMo16771o3 = chronoLocalDateMo16914D2.mo16771o(EnumC15621a.DAY_OF_YEAR);
                            chronoLocalDateMo16788e2 = chronoLocalDateMo16914D2.mo16788e(AbstractC15529a.m16745i(AbstractC15529a.m16751o(AbstractC15529a.m16752p(j11, m17178a(m17189l(iMo16771o3, iM17179b3), iMo16771o3)), 7), iM17162h - m17179b(chronoLocalDateMo16914D2)), (TemporalUnit) ChronoUnit.DAYS);
                        } else {
                            long jM17170a2 = c15637q.m17170a(j11, this);
                            int iM17179b4 = m17179b(chronoLocalDateMo16914D2);
                            int iMo16771o4 = chronoLocalDateMo16914D2.mo16771o(EnumC15621a.DAY_OF_YEAR);
                            ChronoLocalDate chronoLocalDateMo16788e6 = chronoLocalDateMo16914D2.mo16788e((((int) (jM17170a2 - ((long) m17178a(m17189l(iMo16771o4, iM17179b4), iMo16771o4)))) * 7) + (iM17162h - m17179b(chronoLocalDateMo16914D2)), (TemporalUnit) ChronoUnit.DAYS);
                            if (enumC15578E == EnumC15578E.STRICT && chronoLocalDateMo16788e6.mo16773u(enumC15621a3) != iM17139P) {
                                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
                            }
                            chronoLocalDateMo16788e2 = chronoLocalDateMo16788e6;
                        }
                        map.remove(this);
                        map.remove(enumC15621a3);
                        map.remove(enumC15621a2);
                        return chronoLocalDateMo16788e2;
                    }
                } else if ((r10 == C15639s.f48797h || r10 == ChronoUnit.FOREVER) && map.containsKey(c15639s.f48803f) && map.containsKey(c15639s.f48802e)) {
                    int iM17170a = ((C15638r) c15639s.f48803f).f48795e.m17170a(((Long) map.get(c15639s.f48803f)).longValue(), c15639s.f48803f);
                    if (enumC15578E == EnumC15578E.LENIENT) {
                        chronoLocalDateMo16788e = m17183f(interfaceC15555kM16964p, iM17170a, 1, iM17162h).mo16788e(AbstractC15529a.m16752p(((Long) map.get(c15639s.f48802e)).longValue(), 1L), (TemporalUnit) chronoUnit);
                    } else {
                        ChronoLocalDate chronoLocalDateM17183f = m17183f(interfaceC15555kM16964p, iM17170a, ((C15638r) c15639s.f48802e).f48795e.m17170a(((Long) map.get(c15639s.f48802e)).longValue(), c15639s.f48802e), iM17162h);
                        if (enumC15578E == EnumC15578E.STRICT && m17180c(chronoLocalDateM17183f) != iM17170a) {
                            throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                        }
                        chronoLocalDateMo16788e = chronoLocalDateM17183f;
                    }
                    map.remove(this);
                    map.remove(c15639s.f48803f);
                    map.remove(c15639s.f48802e);
                    map.remove(enumC15621a2);
                    return chronoLocalDateMo16788e;
                }
            }
        }
        return null;
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: m */
    public final C15637q mo17142m() {
        return this.f48795e;
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: r */
    public final boolean mo17145r(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.mo16770f(EnumC15621a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r6 = this.f48794d;
        if (r6 == chronoUnit) {
            return true;
        }
        if (r6 == ChronoUnit.MONTHS) {
            return temporalAccessor.mo16770f(EnumC15621a.DAY_OF_MONTH);
        }
        if (r6 == ChronoUnit.YEARS) {
            return temporalAccessor.mo16770f(EnumC15621a.DAY_OF_YEAR);
        }
        if (r6 == C15639s.f48797h) {
            return temporalAccessor.mo16770f(EnumC15621a.DAY_OF_YEAR);
        }
        if (r6 == ChronoUnit.FOREVER) {
            return temporalAccessor.mo16770f(EnumC15621a.YEAR);
        }
        return false;
    }

    @Override // p817j$.time.temporal.InterfaceC15635o
    /* JADX INFO: renamed from: y */
    public final C15637q mo17147y(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r6 = this.f48794d;
        if (r6 == chronoUnit) {
            return this.f48795e;
        }
        if (r6 == ChronoUnit.MONTHS) {
            return m17187j(temporalAccessor, EnumC15621a.DAY_OF_MONTH);
        }
        if (r6 == ChronoUnit.YEARS) {
            return m17187j(temporalAccessor, EnumC15621a.DAY_OF_YEAR);
        }
        if (r6 == C15639s.f48797h) {
            return m17188k(temporalAccessor);
        }
        if (r6 == ChronoUnit.FOREVER) {
            return EnumC15621a.YEAR.mo17142m();
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + r6 + ", this: " + this);
    }

    /* JADX INFO: renamed from: j */
    private C15637q m17187j(TemporalAccessor temporalAccessor, EnumC15621a enumC15621a) {
        int iM17189l = m17189l(temporalAccessor.mo16771o(enumC15621a), m17179b(temporalAccessor));
        C15637q c15637qMo16772r = temporalAccessor.mo16772r(enumC15621a);
        return C15637q.m17168j(m17178a(iM17189l, (int) c15637qMo16772r.m17173e()), m17178a(iM17189l, (int) c15637qMo16772r.m17172d()));
    }

    /* JADX INFO: renamed from: k */
    private C15637q m17188k(TemporalAccessor temporalAccessor) {
        EnumC15621a enumC15621a = EnumC15621a.DAY_OF_YEAR;
        if (!temporalAccessor.mo16770f(enumC15621a)) {
            return f48789h;
        }
        int iM17179b = m17179b(temporalAccessor);
        int iMo16771o = temporalAccessor.mo16771o(enumC15621a);
        int iM17189l = m17189l(iMo16771o, iM17179b);
        int iM17178a = m17178a(iM17189l, iMo16771o);
        if (iM17178a == 0) {
            return m17188k(AbstractC15551g.m16964p(temporalAccessor).mo16924p(temporalAccessor).mo16789m(iMo16771o + 7, ChronoUnit.DAYS));
        }
        int iM17172d = (int) temporalAccessor.mo16772r(enumC15621a).m17172d();
        int iM17178a2 = m17178a(iM17189l, this.f48792b.m17196f() + iM17172d);
        if (iM17178a >= iM17178a2) {
            return m17188k(AbstractC15551g.m16964p(temporalAccessor).mo16924p(temporalAccessor).mo16788e((iM17172d - iMo16771o) + 8, (TemporalUnit) ChronoUnit.DAYS));
        }
        return C15637q.m17168j(1L, iM17178a2 - 1);
    }

    public final String toString() {
        return this.f48791a + "[" + this.f48792b.toString() + "]";
    }
}
