package p817j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
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

/* JADX INFO: renamed from: j$.time.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C15613m implements Temporal, TemporalAdjuster, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a */
    private final LocalTime f48734a;

    /* JADX INFO: renamed from: b */
    private final ZoneOffset f48735b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C15613m c15613m = (C15613m) obj;
        boolean zEquals = this.f48735b.equals(c15613m.f48735b);
        LocalTime localTime = this.f48734a;
        LocalTime localTime2 = c15613m.f48734a;
        if (zEquals) {
            return localTime.compareTo(localTime2);
        }
        int iCompare = Long.compare(m17112S(), c15613m.m17112S());
        return iCompare == 0 ? localTime.compareTo(localTime2) : iCompare;
    }

    static {
        LocalTime localTime = LocalTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.f48536g;
        localTime.getClass();
        m17110P(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f48535f;
        localTime2.getClass();
        m17110P(localTime2, zoneOffset2);
    }

    /* JADX INFO: renamed from: P */
    public static C15613m m17110P(LocalTime localTime, ZoneOffset zoneOffset) {
        return new C15613m(localTime, zoneOffset);
    }

    @Override // p817j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        C15613m c15613m;
        if (temporal instanceof C15613m) {
            c15613m = (C15613m) temporal;
        } else {
            try {
                c15613m = new C15613m(LocalTime.m16847Q(temporal), ZoneOffset.from(temporal));
            } catch (DateTimeException e10) {
                throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e10);
            }
        }
        if (temporalUnit instanceof ChronoUnit) {
            long jM17112S = c15613m.m17112S() - m17112S();
            switch (AbstractC15612l.f48733a[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jM17112S;
                case 2:
                    return jM17112S / 1000;
                case 3:
                    return jM17112S / 1000000;
                case 4:
                    return jM17112S / 1000000000;
                case 5:
                    return jM17112S / 60000000000L;
                case 6:
                    return jM17112S / 3600000000000L;
                case 7:
                    return jM17112S / 43200000000000L;
                default:
                    throw new C15636p("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.mo17136m(this, c15613m);
    }

    private C15613m(LocalTime localTime, ZoneOffset zoneOffset) {
        this.f48734a = (LocalTime) Objects.requireNonNull(localTime, "time");
        this.f48735b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    /* JADX INFO: renamed from: T */
    private C15613m m17113T(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.f48734a == localTime && this.f48735b.equals(zoneOffset)) ? this : new C15613m(localTime, zoneOffset);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return ((EnumC15621a) interfaceC15635o).m17141R() || interfaceC15635o == EnumC15621a.OFFSET_SECONDS;
        }
        return interfaceC15635o != null && interfaceC15635o.mo17145r(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            if (interfaceC15635o == EnumC15621a.OFFSET_SECONDS) {
                return ((EnumC15621a) interfaceC15635o).mo17142m();
            }
            LocalTime localTime = this.f48734a;
            localTime.getClass();
            return AbstractC15632l.m17158d(localTime, interfaceC15635o);
        }
        return interfaceC15635o.mo17147y(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final int mo16771o(InterfaceC15635o interfaceC15635o) {
        return AbstractC15632l.m17155a(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            if (interfaceC15635o == EnumC15621a.OFFSET_SECONDS) {
                return this.f48735b.getTotalSeconds();
            }
            return this.f48734a.mo16773u(interfaceC15635o);
        }
        return interfaceC15635o.mo17144q(this);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q */
    public final Temporal mo16790q(LocalDate localDate) {
        return (C15613m) localDate.mo16768A(this);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: d */
    public final Temporal mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            EnumC15621a enumC15621a = EnumC15621a.OFFSET_SECONDS;
            LocalTime localTime = this.f48734a;
            if (interfaceC15635o == enumC15621a) {
                return m17113T(localTime, ZoneOffset.ofTotalSeconds(((EnumC15621a) interfaceC15635o).m17139P(j10)));
            }
            return m17113T(localTime.mo16787d(j10, interfaceC15635o), this.f48735b);
        }
        return (C15613m) interfaceC15635o.mo17146u(this, j10);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final C15613m mo16788e(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return m17113T(this.f48734a.mo16788e(j10, temporalUnit), this.f48735b);
        }
        return (C15613m) temporalUnit.mo17137o(this, j10);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m */
    public final Temporal mo16789m(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? mo16788e(Long.MAX_VALUE, chronoUnit).mo16788e(1L, chronoUnit) : mo16788e(-j10, chronoUnit);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final Object mo16774y(TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17163i() || temporalQuery == AbstractC15632l.m17165k()) {
            return this.f48735b;
        }
        if (((temporalQuery == AbstractC15632l.m17166l()) || (temporalQuery == AbstractC15632l.m17159e())) || temporalQuery == AbstractC15632l.m17160f()) {
            return null;
        }
        if (temporalQuery == AbstractC15632l.m17161g()) {
            return this.f48734a;
        }
        if (temporalQuery == AbstractC15632l.m17164j()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        return temporal.mo16787d(this.f48734a.m16862e0(), EnumC15621a.NANO_OF_DAY).mo16787d(this.f48735b.getTotalSeconds(), EnumC15621a.OFFSET_SECONDS);
    }

    /* JADX INFO: renamed from: S */
    private long m17112S() {
        return this.f48734a.m16862e0() - (((long) this.f48735b.getTotalSeconds()) * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15613m)) {
            return false;
        }
        C15613m c15613m = (C15613m) obj;
        return this.f48734a.equals(c15613m.f48734a) && this.f48735b.equals(c15613m.f48735b);
    }

    public final int hashCode() {
        return this.f48734a.hashCode() ^ this.f48735b.hashCode();
    }

    public final String toString() {
        return this.f48734a.toString() + this.f48735b.toString();
    }

    private Object writeReplace() {
        return new C15615o((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.f48734a.m16865h0(objectOutput);
        this.f48735b.m16887Y(objectOutput);
    }

    /* JADX INFO: renamed from: R */
    static C15613m m17111R(ObjectInput objectInput) {
        return new C15613m(LocalTime.m16852d0(objectInput), ZoneOffset.m16885X(objectInput));
    }
}
