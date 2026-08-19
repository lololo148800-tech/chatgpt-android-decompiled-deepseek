package p817j$.time.format;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.AbstractC15534b;
import p817j$.time.C15614n;
import p817j$.time.DateTimeException;
import p817j$.time.Instant;
import p817j$.time.LocalDate;
import p817j$.time.LocalTime;
import p817j$.time.ZoneId;
import p817j$.time.ZoneOffset;
import p817j$.time.chrono.ChronoLocalDate;
import p817j$.time.chrono.ChronoLocalDateTime;
import p817j$.time.chrono.ChronoZonedDateTime;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalQuery;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.format.D */
/* JADX INFO: loaded from: classes4.dex */
final class C15577D implements TemporalAccessor {

    /* JADX INFO: renamed from: b */
    ZoneId f48623b;

    /* JADX INFO: renamed from: c */
    InterfaceC15555k f48624c;

    /* JADX INFO: renamed from: d */
    boolean f48625d;

    /* JADX INFO: renamed from: e */
    private EnumC15578E f48626e;

    /* JADX INFO: renamed from: f */
    private ChronoLocalDate f48627f;

    /* JADX INFO: renamed from: g */
    private LocalTime f48628g;

    /* JADX INFO: renamed from: a */
    final HashMap f48622a = new HashMap();

    /* JADX INFO: renamed from: h */
    C15614n f48629h = C15614n.f48736d;

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int mo16771o(InterfaceC15635o interfaceC15635o) {
        return AbstractC15632l.m17155a(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        return AbstractC15632l.m17158d(this, interfaceC15635o);
    }

    C15577D() {
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        if (this.f48622a.containsKey(interfaceC15635o)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.f48627f;
        if (chronoLocalDate != null && chronoLocalDate.mo16770f(interfaceC15635o)) {
            return true;
        }
        LocalTime localTime = this.f48628g;
        if (localTime == null || !localTime.mo16770f(interfaceC15635o)) {
            return (interfaceC15635o == null || (interfaceC15635o instanceof EnumC15621a) || !interfaceC15635o.mo17145r(this)) ? false : true;
        }
        return true;
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        Objects.requireNonNull(interfaceC15635o, "field");
        Long l4 = (Long) this.f48622a.get(interfaceC15635o);
        if (l4 != null) {
            return l4.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f48627f;
        if (chronoLocalDate != null && chronoLocalDate.mo16770f(interfaceC15635o)) {
            return this.f48627f.mo16773u(interfaceC15635o);
        }
        LocalTime localTime = this.f48628g;
        if (localTime != null && localTime.mo16770f(interfaceC15635o)) {
            return this.f48628g.mo16773u(interfaceC15635o);
        }
        if (interfaceC15635o instanceof EnumC15621a) {
            throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
        return interfaceC15635o.mo17144q(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final Object mo16774y(TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17166l()) {
            return this.f48623b;
        }
        if (temporalQuery == AbstractC15632l.m17159e()) {
            return this.f48624c;
        }
        if (temporalQuery == AbstractC15632l.m17160f()) {
            ChronoLocalDate chronoLocalDate = this.f48627f;
            if (chronoLocalDate != null) {
                return LocalDate.m16792R(chronoLocalDate);
            }
            return null;
        }
        if (temporalQuery == AbstractC15632l.m17161g()) {
            return this.f48628g;
        }
        if (temporalQuery == AbstractC15632l.m17163i()) {
            Long l4 = (Long) this.f48622a.get(EnumC15621a.OFFSET_SECONDS);
            if (l4 != null) {
                return ZoneOffset.ofTotalSeconds(l4.intValue());
            }
            ZoneId zoneId = this.f48623b;
            return zoneId instanceof ZoneOffset ? zoneId : temporalQuery.queryFrom(this);
        }
        if (temporalQuery == AbstractC15632l.m17165k()) {
            return temporalQuery.queryFrom(this);
        }
        if (temporalQuery == AbstractC15632l.m17164j()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x01c6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cc  */
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
    /* JADX INFO: renamed from: l */
    final void m17020l(EnumC15578E enumC15578E) {
        InterfaceC15635o interfaceC15635o;
        InterfaceC15635o interfaceC15635o2;
        HashMap map = this.f48622a;
        this.f48626e = enumC15578E;
        m17015p();
        m17012A(this.f48624c.mo16915G(map, this.f48626e));
        m17018x();
        if (map.size() > 0) {
            int i10 = 0;
            loop0: while (i10 < 50) {
                Iterator it = map.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    interfaceC15635o2 = (InterfaceC15635o) ((Map.Entry) it.next()).getKey();
                    TemporalAccessor temporalAccessorMo17143o = interfaceC15635o2.mo17143o(map, this, this.f48626e);
                    if (temporalAccessorMo17143o != null) {
                        if (temporalAccessorMo17143o instanceof ChronoZonedDateTime) {
                            ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) temporalAccessorMo17143o;
                            ZoneId zoneId = this.f48623b;
                            if (zoneId == null) {
                                this.f48623b = chronoZonedDateTime.mo16906s();
                            } else if (!zoneId.equals(chronoZonedDateTime.mo16906s())) {
                                throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + this.f48623b);
                            }
                            temporalAccessorMo17143o = chronoZonedDateTime.mo16894C();
                        }
                        if (temporalAccessorMo17143o instanceof ChronoLocalDateTime) {
                            ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) temporalAccessorMo17143o;
                            m17019z(chronoLocalDateTime.mo16840b(), C15614n.f48736d);
                            m17012A(chronoLocalDateTime.mo16841c());
                            break;
                        } else if (temporalAccessorMo17143o instanceof ChronoLocalDate) {
                            m17012A((ChronoLocalDate) temporalAccessorMo17143o);
                            break;
                        } else {
                            if (temporalAccessorMo17143o instanceof LocalTime) {
                                m17019z((LocalTime) temporalAccessorMo17143o, C15614n.f48736d);
                                break;
                            }
                            throw new DateTimeException("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        }
                    }
                } while (map.containsKey(interfaceC15635o2));
                i10++;
            }
            if (i10 == 50) {
                throw new DateTimeException("One of the parsed fields has an incorrectly implemented resolve method");
            }
            if (i10 > 0) {
                m17015p();
                m17012A(this.f48624c.mo16915G(map, this.f48626e));
                m17018x();
            }
        }
        if (this.f48628g == null) {
            EnumC15621a enumC15621a = EnumC15621a.MILLI_OF_SECOND;
            if (map.containsKey(enumC15621a)) {
                long jLongValue = ((Long) map.remove(enumC15621a)).longValue();
                EnumC15621a enumC15621a2 = EnumC15621a.MICRO_OF_SECOND;
                if (map.containsKey(enumC15621a2)) {
                    long jLongValue2 = (((Long) map.get(enumC15621a2)).longValue() % 1000) + (jLongValue * 1000);
                    m17013D(enumC15621a, enumC15621a2, Long.valueOf(jLongValue2));
                    map.remove(enumC15621a2);
                    map.put(EnumC15621a.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                } else {
                    map.put(EnumC15621a.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                }
            } else {
                Object obj = EnumC15621a.MICRO_OF_SECOND;
                if (map.containsKey(obj)) {
                    map.put(EnumC15621a.NANO_OF_SECOND, Long.valueOf(((Long) map.remove(obj)).longValue() * 1000));
                }
            }
            Object obj2 = EnumC15621a.HOUR_OF_DAY;
            Long l4 = (Long) map.get(obj2);
            if (l4 != null) {
                Object obj3 = EnumC15621a.MINUTE_OF_HOUR;
                Long l10 = (Long) map.get(obj3);
                Object obj4 = EnumC15621a.SECOND_OF_MINUTE;
                Long l11 = (Long) map.get(obj4);
                Object obj5 = EnumC15621a.NANO_OF_SECOND;
                Long l12 = (Long) map.get(obj5);
                if ((l10 != null || (l11 == null && l12 == null)) && (l10 == null || l11 != null || l12 == null)) {
                    m17017v(l4.longValue(), l10 != null ? l10.longValue() : 0L, l11 != null ? l11.longValue() : 0L, l12 != null ? l12.longValue() : 0L);
                    map.remove(obj2);
                    map.remove(obj3);
                    map.remove(obj4);
                    map.remove(obj5);
                    if (this.f48626e != EnumC15578E.LENIENT && map.size() > 0) {
                        for (Map.Entry entry : map.entrySet()) {
                            interfaceC15635o = (InterfaceC15635o) entry.getKey();
                            if (!(interfaceC15635o instanceof EnumC15621a) && ((EnumC15621a) interfaceC15635o).m17141R()) {
                                ((EnumC15621a) interfaceC15635o).m17140Q(((Long) entry.getValue()).longValue());
                            }
                        }
                    }
                }
            } else if (this.f48626e != EnumC15578E.LENIENT) {
                while (r0.hasNext()) {
                    interfaceC15635o = (InterfaceC15635o) entry.getKey();
                    if (!(interfaceC15635o instanceof EnumC15621a)) {
                    }
                }
            }
        } else if (this.f48626e != EnumC15578E.LENIENT) {
            while (r0.hasNext()) {
                interfaceC15635o = (InterfaceC15635o) entry.getKey();
                if (!(interfaceC15635o instanceof EnumC15621a)) {
                }
            }
        }
        ChronoLocalDate chronoLocalDate = this.f48627f;
        if (chronoLocalDate != null) {
            m17014g(chronoLocalDate);
        }
        LocalTime localTime = this.f48628g;
        if (localTime != null) {
            m17014g(localTime);
            if (this.f48627f != null && map.size() > 0) {
                m17014g(this.f48627f.mo16822w(this.f48628g));
            }
        }
        if (this.f48627f != null && this.f48628g != null) {
            C15614n c15614n = this.f48629h;
            c15614n.getClass();
            C15614n c15614n2 = C15614n.f48736d;
            if (c15614n != c15614n2) {
                this.f48627f = this.f48627f.mo16802E(this.f48629h);
                this.f48629h = c15614n2;
            }
        }
        if (this.f48628g == null && (map.containsKey(EnumC15621a.INSTANT_SECONDS) || map.containsKey(EnumC15621a.SECOND_OF_DAY) || map.containsKey(EnumC15621a.SECOND_OF_MINUTE))) {
            EnumC15621a enumC15621a3 = EnumC15621a.NANO_OF_SECOND;
            if (map.containsKey(enumC15621a3)) {
                long jLongValue3 = ((Long) map.get(enumC15621a3)).longValue();
                map.put(EnumC15621a.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                map.put(EnumC15621a.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / 1000000));
            } else {
                map.put(enumC15621a3, 0L);
                map.put(EnumC15621a.MICRO_OF_SECOND, 0L);
                map.put(EnumC15621a.MILLI_OF_SECOND, 0L);
            }
        }
        if (this.f48627f == null || this.f48628g == null) {
            return;
        }
        Long l13 = (Long) map.get(EnumC15621a.OFFSET_SECONDS);
        if (l13 != null) {
            map.put(EnumC15621a.INSTANT_SECONDS, Long.valueOf(this.f48627f.mo16822w(this.f48628g).mo16845n(ZoneOffset.ofTotalSeconds(l13.intValue())).mo16895O()));
        } else if (this.f48623b != null) {
            map.put(EnumC15621a.INSTANT_SECONDS, Long.valueOf(this.f48627f.mo16822w(this.f48628g).mo16845n(this.f48623b).mo16895O()));
        }
    }

    /* JADX INFO: renamed from: D */
    private void m17013D(InterfaceC15635o interfaceC15635o, EnumC15621a enumC15621a, Long l4) {
        Long l10 = (Long) this.f48622a.put(enumC15621a, l4);
        if (l10 == null || l10.longValue() == l4.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + enumC15621a + Separators.f31991SP + l10 + " differs from " + enumC15621a + Separators.f31991SP + l4 + " while resolving  " + interfaceC15635o);
    }

    /* JADX INFO: renamed from: p */
    private void m17015p() {
        HashMap map = this.f48622a;
        if (map.containsKey(EnumC15621a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f48623b;
            if (zoneId != null) {
                m17016t(zoneId);
                return;
            }
            Long l4 = (Long) map.get(EnumC15621a.OFFSET_SECONDS);
            if (l4 != null) {
                m17016t(ZoneOffset.ofTotalSeconds(l4.intValue()));
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private void m17016t(ZoneId zoneId) {
        HashMap map = this.f48622a;
        EnumC15621a enumC15621a = EnumC15621a.INSTANT_SECONDS;
        ChronoZonedDateTime chronoZonedDateTimeMo16917I = this.f48624c.mo16917I(Instant.m16782R(((Long) map.remove(enumC15621a)).longValue()), zoneId);
        m17012A(chronoZonedDateTimeMo16917I.mo16902c());
        m17013D(enumC15621a, EnumC15621a.SECOND_OF_DAY, Long.valueOf(chronoZonedDateTimeMo16917I.mo16901b().toSecondOfDay()));
    }

    /* JADX INFO: renamed from: A */
    private void m17012A(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f48627f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + this.f48627f + Separators.f31991SP + chronoLocalDate);
        }
        if (chronoLocalDate != null) {
            if (!this.f48624c.equals(chronoLocalDate.mo16812a())) {
                throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.f48624c);
            }
            this.f48627f = chronoLocalDate;
        }
    }

    /* JADX INFO: renamed from: x */
    private void m17018x() {
        HashMap map = this.f48622a;
        EnumC15621a enumC15621a = EnumC15621a.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(enumC15621a)) {
            long jLongValue = ((Long) map.remove(enumC15621a)).longValue();
            EnumC15578E enumC15578E = this.f48626e;
            if (enumC15578E == EnumC15578E.STRICT || (enumC15578E == EnumC15578E.SMART && jLongValue != 0)) {
                enumC15621a.m17140Q(jLongValue);
            }
            EnumC15621a enumC15621a2 = EnumC15621a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            m17013D(enumC15621a, enumC15621a2, Long.valueOf(jLongValue));
        }
        EnumC15621a enumC15621a3 = EnumC15621a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(enumC15621a3)) {
            long jLongValue2 = ((Long) map.remove(enumC15621a3)).longValue();
            EnumC15578E enumC15578E2 = this.f48626e;
            if (enumC15578E2 == EnumC15578E.STRICT || (enumC15578E2 == EnumC15578E.SMART && jLongValue2 != 0)) {
                enumC15621a3.m17140Q(jLongValue2);
            }
            m17013D(enumC15621a3, EnumC15621a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        EnumC15621a enumC15621a4 = EnumC15621a.AMPM_OF_DAY;
        if (map.containsKey(enumC15621a4)) {
            EnumC15621a enumC15621a5 = EnumC15621a.HOUR_OF_AMPM;
            if (map.containsKey(enumC15621a5)) {
                long jLongValue3 = ((Long) map.remove(enumC15621a4)).longValue();
                long jLongValue4 = ((Long) map.remove(enumC15621a5)).longValue();
                if (this.f48626e == EnumC15578E.LENIENT) {
                    m17013D(enumC15621a4, EnumC15621a.HOUR_OF_DAY, Long.valueOf(AbstractC15529a.m16745i(AbstractC15529a.m16751o(jLongValue3, 12), jLongValue4)));
                } else {
                    enumC15621a4.m17140Q(jLongValue3);
                    enumC15621a5.m17140Q(jLongValue3);
                    m17013D(enumC15621a4, EnumC15621a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        EnumC15621a enumC15621a6 = EnumC15621a.NANO_OF_DAY;
        if (map.containsKey(enumC15621a6)) {
            long jLongValue5 = ((Long) map.remove(enumC15621a6)).longValue();
            if (this.f48626e != EnumC15578E.LENIENT) {
                enumC15621a6.m17140Q(jLongValue5);
            }
            m17013D(enumC15621a6, EnumC15621a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            m17013D(enumC15621a6, EnumC15621a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            m17013D(enumC15621a6, EnumC15621a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            m17013D(enumC15621a6, EnumC15621a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        EnumC15621a enumC15621a7 = EnumC15621a.MICRO_OF_DAY;
        if (map.containsKey(enumC15621a7)) {
            long jLongValue6 = ((Long) map.remove(enumC15621a7)).longValue();
            if (this.f48626e != EnumC15578E.LENIENT) {
                enumC15621a7.m17140Q(jLongValue6);
            }
            m17013D(enumC15621a7, EnumC15621a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            m17013D(enumC15621a7, EnumC15621a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        EnumC15621a enumC15621a8 = EnumC15621a.MILLI_OF_DAY;
        if (map.containsKey(enumC15621a8)) {
            long jLongValue7 = ((Long) map.remove(enumC15621a8)).longValue();
            if (this.f48626e != EnumC15578E.LENIENT) {
                enumC15621a8.m17140Q(jLongValue7);
            }
            m17013D(enumC15621a8, EnumC15621a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            m17013D(enumC15621a8, EnumC15621a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        EnumC15621a enumC15621a9 = EnumC15621a.SECOND_OF_DAY;
        if (map.containsKey(enumC15621a9)) {
            long jLongValue8 = ((Long) map.remove(enumC15621a9)).longValue();
            if (this.f48626e != EnumC15578E.LENIENT) {
                enumC15621a9.m17140Q(jLongValue8);
            }
            m17013D(enumC15621a9, EnumC15621a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            m17013D(enumC15621a9, EnumC15621a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            m17013D(enumC15621a9, EnumC15621a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        EnumC15621a enumC15621a10 = EnumC15621a.MINUTE_OF_DAY;
        if (map.containsKey(enumC15621a10)) {
            long jLongValue9 = ((Long) map.remove(enumC15621a10)).longValue();
            if (this.f48626e != EnumC15578E.LENIENT) {
                enumC15621a10.m17140Q(jLongValue9);
            }
            m17013D(enumC15621a10, EnumC15621a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            m17013D(enumC15621a10, EnumC15621a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        EnumC15621a enumC15621a11 = EnumC15621a.NANO_OF_SECOND;
        if (map.containsKey(enumC15621a11)) {
            long jLongValue10 = ((Long) map.get(enumC15621a11)).longValue();
            EnumC15578E enumC15578E3 = this.f48626e;
            EnumC15578E enumC15578E4 = EnumC15578E.LENIENT;
            if (enumC15578E3 != enumC15578E4) {
                enumC15621a11.m17140Q(jLongValue10);
            }
            EnumC15621a enumC15621a12 = EnumC15621a.MICRO_OF_SECOND;
            if (map.containsKey(enumC15621a12)) {
                long jLongValue11 = ((Long) map.remove(enumC15621a12)).longValue();
                if (this.f48626e != enumC15578E4) {
                    enumC15621a12.m17140Q(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                m17013D(enumC15621a12, enumC15621a11, Long.valueOf(jLongValue10));
            }
            EnumC15621a enumC15621a13 = EnumC15621a.MILLI_OF_SECOND;
            if (map.containsKey(enumC15621a13)) {
                long jLongValue12 = ((Long) map.remove(enumC15621a13)).longValue();
                if (this.f48626e != enumC15578E4) {
                    enumC15621a13.m17140Q(jLongValue12);
                }
                m17013D(enumC15621a13, enumC15621a11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        EnumC15621a enumC15621a14 = EnumC15621a.HOUR_OF_DAY;
        if (map.containsKey(enumC15621a14)) {
            EnumC15621a enumC15621a15 = EnumC15621a.MINUTE_OF_HOUR;
            if (map.containsKey(enumC15621a15)) {
                EnumC15621a enumC15621a16 = EnumC15621a.SECOND_OF_MINUTE;
                if (map.containsKey(enumC15621a16) && map.containsKey(enumC15621a11)) {
                    m17017v(((Long) map.remove(enumC15621a14)).longValue(), ((Long) map.remove(enumC15621a15)).longValue(), ((Long) map.remove(enumC15621a16)).longValue(), ((Long) map.remove(enumC15621a11)).longValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    private void m17017v(long j10, long j11, long j12, long j13) {
        if (this.f48626e == EnumC15578E.LENIENT) {
            long jM16745i = AbstractC15529a.m16745i(AbstractC15529a.m16745i(AbstractC15529a.m16745i(AbstractC15529a.m16751o(j10, 3600000000000L), AbstractC15529a.m16751o(j11, 60000000000L)), AbstractC15529a.m16751o(j12, 1000000000L)), j13);
            m17019z(LocalTime.m16850W(AbstractC15529a.m16749m(jM16745i, 86400000000000L)), C15614n.m17115b((int) AbstractC15529a.m16750n(jM16745i, 86400000000000L)));
            return;
        }
        int iM17139P = EnumC15621a.MINUTE_OF_HOUR.m17139P(j11);
        int iM17139P2 = EnumC15621a.NANO_OF_SECOND.m17139P(j13);
        if (this.f48626e == EnumC15578E.SMART && j10 == 24 && iM17139P == 0 && j12 == 0 && iM17139P2 == 0) {
            m17019z(LocalTime.f48522e, C15614n.m17115b(1));
        } else {
            m17019z(LocalTime.m16853of(EnumC15621a.HOUR_OF_DAY.m17139P(j10), iM17139P, EnumC15621a.SECOND_OF_MINUTE.m17139P(j12), iM17139P2), C15614n.f48736d);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m17019z(LocalTime localTime, C15614n c15614n) {
        LocalTime localTime2 = this.f48628g;
        if (localTime2 != null) {
            if (!localTime2.equals(localTime)) {
                throw new DateTimeException("Conflict found: Fields resolved to different times: " + this.f48628g + Separators.f31991SP + localTime);
            }
            C15614n c15614n2 = this.f48629h;
            c15614n2.getClass();
            C15614n c15614n3 = C15614n.f48736d;
            if (c15614n2 != c15614n3 && c15614n != c15614n3 && !this.f48629h.equals(c15614n)) {
                throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + this.f48629h + Separators.f31991SP + c15614n);
            }
            this.f48629h = c15614n;
            return;
        }
        this.f48628g = localTime;
        this.f48629h = c15614n;
    }

    /* JADX INFO: renamed from: g */
    private void m17014g(TemporalAccessor temporalAccessor) {
        Iterator it = this.f48622a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            InterfaceC15635o interfaceC15635o = (InterfaceC15635o) entry.getKey();
            if (temporalAccessor.mo16770f(interfaceC15635o)) {
                try {
                    long jMo16773u = temporalAccessor.mo16773u(interfaceC15635o);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jMo16773u != jLongValue) {
                        throw new DateTimeException("Conflict found: Field " + interfaceC15635o + Separators.f31991SP + jMo16773u + " differs from " + interfaceC15635o + Separators.f31991SP + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(this.f48622a);
        sb2.append(',');
        sb2.append(this.f48624c);
        if (this.f48623b != null) {
            sb2.append(',');
            sb2.append(this.f48623b);
        }
        if (this.f48627f != null || this.f48628g != null) {
            sb2.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f48627f;
            if (chronoLocalDate != null) {
                sb2.append(chronoLocalDate);
                if (this.f48628g != null) {
                    sb2.append('T');
                    sb2.append(this.f48628g);
                }
            } else {
                sb2.append(this.f48628g);
            }
        }
        return sb2.toString();
    }
}
