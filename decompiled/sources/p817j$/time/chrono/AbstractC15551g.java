package p817j$.time.chrono;

import p817j$.time.AbstractC15534b;
import p817j$.time.ZoneOffset;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalQuery;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.g */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC15551g {
    /* JADX INFO: renamed from: i */
    public static boolean m16957i(InterfaceC15556l interfaceC15556l, InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return interfaceC15635o == EnumC15621a.ERA;
        }
        return interfaceC15635o != null && interfaceC15635o.mo17145r(interfaceC15556l);
    }

    /* JADX INFO: renamed from: p */
    public static InterfaceC15555k m16964p(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Object objRequireNonNull = (InterfaceC15555k) temporalAccessor.mo16774y(AbstractC15632l.m17159e());
        C15562r c15562r = C15562r.f48594d;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(c15562r, "defaultObj");
        }
        return (InterfaceC15555k) objRequireNonNull;
    }

    /* JADX INFO: renamed from: d */
    public static int m16952d(ChronoZonedDateTime chronoZonedDateTime, InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            int i10 = AbstractC15552h.f48569a[((EnumC15621a) interfaceC15635o).ordinal()];
            if (i10 == 1) {
                throw new C15636p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return chronoZonedDateTime.mo16903h().getTotalSeconds();
            }
            return chronoZonedDateTime.mo16894C().mo16771o(interfaceC15635o);
        }
        return AbstractC15632l.m17155a(chronoZonedDateTime, interfaceC15635o);
    }

    /* JADX INFO: renamed from: e */
    public static int m16953e(InterfaceC15556l interfaceC15556l, EnumC15621a enumC15621a) {
        if (enumC15621a == EnumC15621a.ERA) {
            return interfaceC15556l.getValue();
        }
        return AbstractC15632l.m17155a(interfaceC15556l, enumC15621a);
    }

    /* JADX INFO: renamed from: f */
    public static long m16954f(InterfaceC15556l interfaceC15556l, InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o == EnumC15621a.ERA) {
            return interfaceC15556l.getValue();
        }
        if (interfaceC15635o instanceof EnumC15621a) {
            throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
        return interfaceC15635o.mo17144q(interfaceC15556l);
    }

    /* JADX INFO: renamed from: m */
    public static Object m16961m(InterfaceC15556l interfaceC15556l, TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17164j()) {
            return ChronoUnit.ERAS;
        }
        return AbstractC15632l.m17157c(interfaceC15556l, temporalQuery);
    }

    /* JADX INFO: renamed from: k */
    public static Object m16959k(ChronoLocalDateTime chronoLocalDateTime, TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17166l() || temporalQuery == AbstractC15632l.m17165k() || temporalQuery == AbstractC15632l.m17163i()) {
            return null;
        }
        if (temporalQuery == AbstractC15632l.m17161g()) {
            return chronoLocalDateTime.mo16840b();
        }
        if (temporalQuery == AbstractC15632l.m17159e()) {
            return chronoLocalDateTime.mo16838a();
        }
        if (temporalQuery == AbstractC15632l.m17164j()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(chronoLocalDateTime);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m16956h(ChronoLocalDate chronoLocalDate, InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return ((EnumC15621a) interfaceC15635o).mo17138A();
        }
        return interfaceC15635o != null && interfaceC15635o.mo17145r(chronoLocalDate);
    }

    /* JADX INFO: renamed from: n */
    public static long m16962n(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((chronoLocalDateTime.mo16841c().toEpochDay() * 86400) + ((long) chronoLocalDateTime.mo16840b().toSecondOfDay())) - ((long) zoneOffset.getTotalSeconds());
    }

    /* JADX INFO: renamed from: l */
    public static Object m16960l(ChronoZonedDateTime chronoZonedDateTime, TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17165k() || temporalQuery == AbstractC15632l.m17166l()) {
            return chronoZonedDateTime.mo16906s();
        }
        if (temporalQuery == AbstractC15632l.m17163i()) {
            return chronoZonedDateTime.mo16903h();
        }
        if (temporalQuery == AbstractC15632l.m17161g()) {
            return chronoZonedDateTime.mo16901b();
        }
        if (temporalQuery == AbstractC15632l.m17159e()) {
            return chronoZonedDateTime.mo16900a();
        }
        if (temporalQuery == AbstractC15632l.m17164j()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(chronoZonedDateTime);
    }

    /* JADX INFO: renamed from: b */
    public static int m16950b(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int iCompareTo = chronoLocalDateTime.mo16841c().compareTo(chronoLocalDateTime2.mo16841c());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = chronoLocalDateTime.mo16840b().compareTo(chronoLocalDateTime2.mo16840b());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        return ((AbstractC15545a) chronoLocalDateTime.mo16838a()).getId().compareTo(chronoLocalDateTime2.mo16838a().getId());
    }

    /* JADX INFO: renamed from: j */
    public static Object m16958j(ChronoLocalDate chronoLocalDate, TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17166l() || temporalQuery == AbstractC15632l.m17165k() || temporalQuery == AbstractC15632l.m17163i() || temporalQuery == AbstractC15632l.m17161g()) {
            return null;
        }
        if (temporalQuery == AbstractC15632l.m17159e()) {
            return chronoLocalDate.mo16812a();
        }
        if (temporalQuery == AbstractC15632l.m17164j()) {
            return ChronoUnit.DAYS;
        }
        return temporalQuery.queryFrom(chronoLocalDate);
    }

    /* JADX INFO: renamed from: o */
    public static long m16963o(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.mo16902c().toEpochDay() * 86400) + ((long) chronoZonedDateTime.mo16901b().toSecondOfDay())) - ((long) chronoZonedDateTime.mo16903h().getTotalSeconds());
    }

    /* JADX INFO: renamed from: c */
    public static int m16951c(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int iCompare = Long.compare(chronoZonedDateTime.mo16895O(), chronoZonedDateTime2.mo16895O());
        if (iCompare != 0) {
            return iCompare;
        }
        int iM16855T = chronoZonedDateTime.mo16901b().m16855T() - chronoZonedDateTime2.mo16901b().m16855T();
        if (iM16855T != 0) {
            return iM16855T;
        }
        int iCompareTo = chronoZonedDateTime.mo16894C().compareTo(chronoZonedDateTime2.mo16894C());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = chronoZonedDateTime.mo16906s().getId().compareTo(chronoZonedDateTime2.mo16906s().getId());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        return ((AbstractC15545a) chronoZonedDateTime.mo16900a()).getId().compareTo(chronoZonedDateTime2.mo16900a().getId());
    }

    /* JADX INFO: renamed from: g */
    public static boolean m16955g(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        long jMo16895O = chronoZonedDateTime.mo16895O();
        long jMo16895O2 = chronoZonedDateTime2.mo16895O();
        return jMo16895O > jMo16895O2 || (jMo16895O == jMo16895O2 && chronoZonedDateTime.mo16901b().m16855T() > chronoZonedDateTime2.mo16901b().m16855T());
    }

    /* JADX INFO: renamed from: a */
    public static int m16949a(ChronoLocalDate chronoLocalDate, ChronoLocalDate chronoLocalDate2) {
        int iCompare = Long.compare(chronoLocalDate.toEpochDay(), chronoLocalDate2.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC15545a) chronoLocalDate.mo16812a()).getId().compareTo(chronoLocalDate2.mo16812a().getId());
    }
}
