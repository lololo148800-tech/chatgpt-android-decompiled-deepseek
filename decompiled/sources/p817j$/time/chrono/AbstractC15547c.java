package p817j$.time.chrono;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.AbstractC15534b;
import p817j$.time.LocalTime;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAdjuster;
import p817j$.time.temporal.TemporalAmount;
import p817j$.time.temporal.TemporalQuery;
import p817j$.time.temporal.TemporalUnit;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.c */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC15547c implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* JADX INFO: renamed from: R */
    abstract ChronoLocalDate mo16910R(long j10);

    /* JADX INFO: renamed from: S */
    abstract ChronoLocalDate mo16911S(long j10);

    /* JADX INFO: renamed from: T */
    abstract ChronoLocalDate mo16912T(long j10);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoLocalDate chronoLocalDate) {
        return AbstractC15551g.m16949a(this, chronoLocalDate);
    }

    @Override // p817j$.time.chrono.ChronoLocalDate, p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        return AbstractC15551g.m16956h(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int mo16771o(InterfaceC15635o interfaceC15635o) {
        return AbstractC15632l.m17155a(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public /* synthetic */ C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        return AbstractC15632l.m17158d(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object mo16774y(TemporalQuery temporalQuery) {
        return AbstractC15551g.m16958j(this, temporalQuery);
    }

    /* JADX INFO: renamed from: P */
    static ChronoLocalDate m16939P(InterfaceC15555k interfaceC15555k, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (interfaceC15555k.equals(chronoLocalDate.mo16812a())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + interfaceC15555k.getId() + ", actual: " + chronoLocalDate.mo16812a().getId());
    }

    AbstractC15547c() {
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: e */
    public ChronoLocalDate mo16788e(long j10, TemporalUnit temporalUnit) {
        boolean z6 = temporalUnit instanceof ChronoUnit;
        if (!z6) {
            if (!z6) {
                return m16939P(mo16812a(), temporalUnit.mo17137o(this, j10));
            }
            throw new C15636p("Unsupported unit: " + temporalUnit);
        }
        switch (AbstractC15546b.f48560a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return mo16910R(j10);
            case 2:
                return mo16910R(AbstractC15529a.m16751o(j10, 7));
            case 3:
                return mo16911S(j10);
            case 4:
                return mo16912T(j10);
            case 5:
                return mo16912T(AbstractC15529a.m16751o(j10, 10));
            case 6:
                return mo16912T(AbstractC15529a.m16751o(j10, 100));
            case 7:
                return mo16912T(AbstractC15529a.m16751o(j10, 1000));
            case 8:
                EnumC15621a enumC15621a = EnumC15621a.ERA;
                return mo16787d(AbstractC15529a.m16745i(mo16773u(enumC15621a), j10), (InterfaceC15635o) enumC15621a);
            default:
                throw new C15636p("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: B */
    public InterfaceC15556l mo16801B() {
        return mo16812a().mo16920N(AbstractC15632l.m17155a(this, EnumC15621a.ERA));
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: F */
    public boolean mo16803F() {
        return mo16812a().mo16919M(mo16773u(EnumC15621a.YEAR));
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: L */
    public int mo16805L() {
        return mo16803F() ? 366 : 365;
    }

    @Override // p817j$.time.chrono.ChronoLocalDate, p817j$.time.temporal.Temporal
    public long until(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDateMo16924p = mo16812a().mo16924p(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.mo17136m(this, chronoLocalDateMo16924p);
        }
        switch (AbstractC15546b.f48560a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return chronoLocalDateMo16924p.toEpochDay() - toEpochDay();
            case 2:
                return (chronoLocalDateMo16924p.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return m16940Q(chronoLocalDateMo16924p);
            case 4:
                return m16940Q(chronoLocalDateMo16924p) / 12;
            case 5:
                return m16940Q(chronoLocalDateMo16924p) / 120;
            case 6:
                return m16940Q(chronoLocalDateMo16924p) / 1200;
            case 7:
                return m16940Q(chronoLocalDateMo16924p) / 12000;
            case 8:
                EnumC15621a enumC15621a = EnumC15621a.ERA;
                return chronoLocalDateMo16924p.mo16773u(enumC15621a) - mo16773u(enumC15621a);
            default:
                throw new C15636p("Unsupported unit: " + temporalUnit);
        }
    }

    /* JADX INFO: renamed from: Q */
    private long m16940Q(ChronoLocalDate chronoLocalDate) {
        if (mo16812a().mo16916H(EnumC15621a.MONTH_OF_YEAR).m17172d() != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        EnumC15621a enumC15621a = EnumC15621a.PROLEPTIC_MONTH;
        long jMo16773u = mo16773u(enumC15621a) * 32;
        EnumC15621a enumC15621a2 = EnumC15621a.DAY_OF_MONTH;
        return (((chronoLocalDate.mo16773u(enumC15621a) * 32) + ((long) chronoLocalDate.mo16771o(enumC15621a2))) - (jMo16773u + ((long) AbstractC15632l.m17155a(this, enumC15621a2)))) / 32;
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && AbstractC15551g.m16949a(this, (ChronoLocalDate) obj) == 0;
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ mo16812a().hashCode();
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: k */
    public ChronoLocalDate mo16790q(TemporalAdjuster temporalAdjuster) {
        return m16939P(mo16812a(), temporalAdjuster.mo16768A(this));
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    public String toString() {
        long jMo16773u = mo16773u(EnumC15621a.YEAR_OF_ERA);
        long jMo16773u2 = mo16773u(EnumC15621a.MONTH_OF_YEAR);
        long jMo16773u3 = mo16773u(EnumC15621a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(mo16812a().toString());
        sb2.append(Separators.f31991SP);
        sb2.append(mo16801B());
        sb2.append(Separators.f31991SP);
        sb2.append(jMo16773u);
        sb2.append(jMo16773u2 < 10 ? "-0" : "-");
        sb2.append(jMo16773u2);
        sb2.append(jMo16773u3 < 10 ? "-0" : "-");
        sb2.append(jMo16773u3);
        return sb2.toString();
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    public ChronoLocalDate mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
        return m16939P(mo16812a(), interfaceC15635o.mo17146u(this, j10));
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: E */
    public ChronoLocalDate mo16802E(TemporalAmount temporalAmount) {
        return m16939P(mo16812a(), temporalAmount.mo16778m(this));
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: J */
    public ChronoLocalDate mo16789m(long j10, TemporalUnit temporalUnit) {
        return m16939P(mo16812a(), AbstractC15632l.m17156b(this, j10, temporalUnit));
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        return temporal.mo16787d(toEpochDay(), EnumC15621a.EPOCH_DAY);
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: w */
    public ChronoLocalDateTime mo16822w(LocalTime localTime) {
        return C15549e.m16942Q(this, localTime);
    }

    @Override // p817j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        return mo16773u(EnumC15621a.EPOCH_DAY);
    }
}
