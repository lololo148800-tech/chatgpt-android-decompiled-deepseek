package p817j$.time;

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

/* JADX INFO: renamed from: j$.time.q */
/* JADX INFO: loaded from: classes4.dex */
public final class C15617q implements Temporal, TemporalAdjuster, Comparable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f48744b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a */
    private final int f48745a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f48745a - ((C15617q) obj).f48745a;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.m17041o(EnumC15621a.YEAR, 4, 10, EnumC15579F.EXCEEDS_PAD);
        dateTimeFormatterBuilder.toFormatter();
    }

    /* JADX INFO: renamed from: P */
    public static C15617q m17121P(int i10) {
        EnumC15621a.YEAR.m17140Q(i10);
        return new C15617q(i10);
    }

    @Override // p817j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        C15617q c15617qM17121P;
        if (temporal instanceof C15617q) {
            c15617qM17121P = (C15617q) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!C15562r.f48594d.equals(AbstractC15551g.m16964p(temporal))) {
                    temporal = LocalDate.m16792R(temporal);
                }
                c15617qM17121P = m17121P(temporal.mo16771o(EnumC15621a.YEAR));
            } catch (DateTimeException e10) {
                throw new DateTimeException("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e10);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long j10 = ((long) c15617qM17121P.f48745a) - ((long) this.f48745a);
            int i10 = AbstractC15616p.f48743b[((ChronoUnit) temporalUnit).ordinal()];
            if (i10 == 1) {
                return j10;
            }
            if (i10 == 2) {
                return j10 / 10;
            }
            if (i10 == 3) {
                return j10 / 100;
            }
            if (i10 == 4) {
                return j10 / 1000;
            }
            if (i10 == 5) {
                EnumC15621a enumC15621a = EnumC15621a.ERA;
                return c15617qM17121P.mo16773u(enumC15621a) - mo16773u(enumC15621a);
            }
            throw new C15636p("Unsupported unit: " + temporalUnit);
        }
        return temporalUnit.mo17136m(this, c15617qM17121P);
    }

    private C15617q(int i10) {
        this.f48745a = i10;
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return interfaceC15635o == EnumC15621a.YEAR || interfaceC15635o == EnumC15621a.YEAR_OF_ERA || interfaceC15635o == EnumC15621a.ERA;
        }
        return interfaceC15635o != null && interfaceC15635o.mo17145r(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o == EnumC15621a.YEAR_OF_ERA) {
            return C15637q.m17168j(1L, this.f48745a <= 0 ? 1000000000L : 999999999L);
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
        int i10 = AbstractC15616p.f48742a[((EnumC15621a) interfaceC15635o).ordinal()];
        int i11 = this.f48745a;
        if (i10 == 1) {
            if (i11 < 1) {
                i11 = 1 - i11;
            }
            return i11;
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 3) {
            return i11 < 1 ? 0 : 1;
        }
        throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q */
    public final Temporal mo16790q(LocalDate localDate) {
        return (C15617q) localDate.mo16768A(this);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final C15617q mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return (C15617q) interfaceC15635o.mo17146u(this, j10);
        }
        EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
        enumC15621a.m17140Q(j10);
        int i10 = AbstractC15616p.f48742a[enumC15621a.ordinal()];
        int i11 = this.f48745a;
        if (i10 == 1) {
            if (i11 < 1) {
                j10 = 1 - j10;
            }
            return m17121P((int) j10);
        }
        if (i10 == 2) {
            return m17121P((int) j10);
        }
        if (i10 == 3) {
            return mo16773u(EnumC15621a.ERA) == j10 ? this : m17121P(1 - i11);
        }
        throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final C15617q mo16788e(long j10, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (C15617q) temporalUnit.mo17137o(this, j10);
        }
        int i10 = AbstractC15616p.f48743b[((ChronoUnit) temporalUnit).ordinal()];
        if (i10 == 1) {
            return m17123R(j10);
        }
        if (i10 == 2) {
            return m17123R(AbstractC15529a.m16751o(j10, 10));
        }
        if (i10 == 3) {
            return m17123R(AbstractC15529a.m16751o(j10, 100));
        }
        if (i10 == 4) {
            return m17123R(AbstractC15529a.m16751o(j10, 1000));
        }
        if (i10 == 5) {
            EnumC15621a enumC15621a = EnumC15621a.ERA;
            return mo16787d(AbstractC15529a.m16745i(mo16773u(enumC15621a), j10), enumC15621a);
        }
        throw new C15636p("Unsupported unit: " + temporalUnit);
    }

    /* JADX INFO: renamed from: R */
    public final C15617q m17123R(long j10) {
        return j10 == 0 ? this : m17121P(EnumC15621a.YEAR.m17139P(((long) this.f48745a) + j10));
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
            return ChronoUnit.YEARS;
        }
        return AbstractC15632l.m17157c(this, temporalQuery);
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        if (!AbstractC15551g.m16964p(temporal).equals(C15562r.f48594d)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.mo16787d(this.f48745a, EnumC15621a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15617q) {
            return this.f48745a == ((C15617q) obj).f48745a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48745a;
    }

    public final String toString() {
        return Integer.toString(this.f48745a);
    }

    private Object writeReplace() {
        return new C15615o((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: T */
    final void m17125T(DataOutput dataOutput) {
        dataOutput.writeInt(this.f48745a);
    }
}
