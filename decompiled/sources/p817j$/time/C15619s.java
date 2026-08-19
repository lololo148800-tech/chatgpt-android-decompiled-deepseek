package p817j$.time;

import com.statsig.androidsdk.ErrorBoundaryKt;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.chrono.AbstractC15551g;
import p817j$.time.chrono.C15562r;
import p817j$.time.format.DateTimeFormatterBuilder;
import p817j$.time.format.EnumC15579F;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAdjuster;
import p817j$.time.temporal.TemporalQuery;
import p817j$.time.temporal.TemporalUnit;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.s */
/* JADX INFO: loaded from: classes4.dex */
public final class C15619s implements Temporal, TemporalAdjuster, Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f48748c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a */
    private final int f48749a;

    /* JADX INFO: renamed from: b */
    private final int f48750b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C15619s c15619s = (C15619s) obj;
        int i10 = this.f48749a - c15619s.f48749a;
        return i10 == 0 ? this.f48750b - c15619s.f48750b : i10;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m17041o(EnumC15621a.YEAR, 4, 10, EnumC15579F.EXCEEDS_PAD);
        dateTimeFormatterBuilder.m17032e('-');
        dateTimeFormatterBuilder.m17040n(EnumC15621a.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.toFormatter();
    }

    /* JADX INFO: renamed from: Q */
    public static C15619s m17127Q(int i10, int i11) {
        EnumC15621a.YEAR.m17140Q(i10);
        EnumC15621a.MONTH_OF_YEAR.m17140Q(i11);
        return new C15619s(i10, i11);
    }

    @Override // p817j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        C15619s c15619sM17127Q;
        if (temporal instanceof C15619s) {
            c15619sM17127Q = (C15619s) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!C15562r.f48594d.equals(AbstractC15551g.m16964p(temporal))) {
                    temporal = LocalDate.m16792R(temporal);
                }
                c15619sM17127Q = m17127Q(temporal.mo16771o(EnumC15621a.YEAR), temporal.mo16771o(EnumC15621a.MONTH_OF_YEAR));
            } catch (DateTimeException e10) {
                throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e10);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long jM17126P = c15619sM17127Q.m17126P() - m17126P();
            switch (AbstractC15618r.f48747b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jM17126P;
                case 2:
                    return jM17126P / 12;
                case 3:
                    return jM17126P / 120;
                case 4:
                    return jM17126P / 1200;
                case 5:
                    return jM17126P / 12000;
                case 6:
                    EnumC15621a enumC15621a = EnumC15621a.ERA;
                    return c15619sM17127Q.mo16773u(enumC15621a) - mo16773u(enumC15621a);
                default:
                    throw new C15636p("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.mo17136m(this, c15619sM17127Q);
    }

    private C15619s(int i10, int i11) {
        this.f48749a = i10;
        this.f48750b = i11;
    }

    /* JADX INFO: renamed from: U */
    private C15619s m17128U(int i10, int i11) {
        return (this.f48749a == i10 && this.f48750b == i11) ? this : new C15619s(i10, i11);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return interfaceC15635o == EnumC15621a.YEAR || interfaceC15635o == EnumC15621a.MONTH_OF_YEAR || interfaceC15635o == EnumC15621a.PROLEPTIC_MONTH || interfaceC15635o == EnumC15621a.YEAR_OF_ERA || interfaceC15635o == EnumC15621a.ERA;
        }
        return interfaceC15635o != null && interfaceC15635o.mo17145r(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o == EnumC15621a.YEAR_OF_ERA) {
            return C15637q.m17168j(1L, this.f48749a <= 0 ? 1000000000L : 999999999L);
        }
        return AbstractC15632l.m17158d(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final int mo16771o(InterfaceC15635o interfaceC15635o) {
        return mo16772r(interfaceC15635o).m17170a(mo16773u(interfaceC15635o), interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return interfaceC15635o.mo17144q(this);
        }
        int i10 = AbstractC15618r.f48746a[((EnumC15621a) interfaceC15635o).ordinal()];
        if (i10 == 1) {
            return this.f48750b;
        }
        if (i10 == 2) {
            return m17126P();
        }
        int i11 = this.f48749a;
        if (i10 == 3) {
            if (i11 < 1) {
                i11 = 1 - i11;
            }
            return i11;
        }
        if (i10 == 4) {
            return i11;
        }
        if (i10 == 5) {
            return i11 < 1 ? 0 : 1;
        }
        throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
    }

    /* JADX INFO: renamed from: P */
    private long m17126P() {
        return ((((long) this.f48749a) * 12) + ((long) this.f48750b)) - 1;
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q */
    public final Temporal mo16790q(LocalDate localDate) {
        return (C15619s) localDate.mo16768A(this);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final C15619s mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return (C15619s) interfaceC15635o.mo17146u(this, j10);
        }
        EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
        enumC15621a.m17140Q(j10);
        int i10 = AbstractC15618r.f48746a[enumC15621a.ordinal()];
        int i11 = this.f48749a;
        if (i10 == 1) {
            int i12 = (int) j10;
            EnumC15621a.MONTH_OF_YEAR.m17140Q(i12);
            return m17128U(i11, i12);
        }
        if (i10 == 2) {
            return m17130S(j10 - m17126P());
        }
        int i13 = this.f48750b;
        if (i10 == 3) {
            if (i11 < 1) {
                j10 = 1 - j10;
            }
            int i14 = (int) j10;
            EnumC15621a.YEAR.m17140Q(i14);
            return m17128U(i14, i13);
        }
        if (i10 == 4) {
            int i15 = (int) j10;
            EnumC15621a.YEAR.m17140Q(i15);
            return m17128U(i15, i13);
        }
        if (i10 != 5) {
            throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
        if (mo16773u(EnumC15621a.ERA) == j10) {
            return this;
        }
        int i16 = 1 - i11;
        EnumC15621a.YEAR.m17140Q(i16);
        return m17128U(i16, i13);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final C15619s mo16788e(long j10, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (C15619s) temporalUnit.mo17137o(this, j10);
        }
        switch (AbstractC15618r.f48747b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return m17130S(j10);
            case 2:
                return m17131T(j10);
            case 3:
                return m17131T(AbstractC15529a.m16751o(j10, 10));
            case 4:
                return m17131T(AbstractC15529a.m16751o(j10, 100));
            case 5:
                return m17131T(AbstractC15529a.m16751o(j10, 1000));
            case 6:
                EnumC15621a enumC15621a = EnumC15621a.ERA;
                return mo16787d(AbstractC15529a.m16745i(mo16773u(enumC15621a), j10), enumC15621a);
            default:
                throw new C15636p("Unsupported unit: " + temporalUnit);
        }
    }

    /* JADX INFO: renamed from: T */
    public final C15619s m17131T(long j10) {
        return j10 == 0 ? this : m17128U(EnumC15621a.YEAR.m17139P(((long) this.f48749a) + j10), this.f48750b);
    }

    /* JADX INFO: renamed from: S */
    public final C15619s m17130S(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f48749a) * 12) + ((long) (this.f48750b - 1)) + j10;
        long j12 = 12;
        return m17128U(EnumC15621a.YEAR.m17139P(AbstractC15529a.m16750n(j11, j12)), ((int) AbstractC15529a.m16749m(j11, j12)) + 1);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m */
    public final Temporal mo16789m(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? mo16788e(Long.MAX_VALUE, chronoUnit).mo16788e(1L, chronoUnit) : mo16788e(-j10, chronoUnit);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final Object mo16774y(TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17159e()) {
            return C15562r.f48594d;
        }
        if (temporalQuery == AbstractC15632l.m17164j()) {
            return ChronoUnit.MONTHS;
        }
        return AbstractC15632l.m17157c(this, temporalQuery);
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        if (!AbstractC15551g.m16964p(temporal).equals(C15562r.f48594d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.mo16787d(m17126P(), EnumC15621a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15619s)) {
            return false;
        }
        C15619s c15619s = (C15619s) obj;
        return this.f48749a == c15619s.f48749a && this.f48750b == c15619s.f48750b;
    }

    public final int hashCode() {
        return (this.f48750b << 27) ^ this.f48749a;
    }

    public final String toString() {
        int i10 = this.f48749a;
        int iAbs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb2.append(i10);
        } else if (i10 < 0) {
            sb2.append(i10 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i10 + ErrorBoundaryKt.SAMPLING_RATE);
            sb2.deleteCharAt(0);
        }
        int i11 = this.f48750b;
        sb2.append(i11 < 10 ? "-0" : "-");
        sb2.append(i11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new C15615o((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: W */
    final void m17133W(DataOutput dataOutput) {
        dataOutput.writeInt(this.f48749a);
        dataOutput.writeByte(this.f48750b);
    }
}
