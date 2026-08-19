package p817j$.time;

import com.revenuecat.purchases.common.UtilsKt;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import livekit.org.webrtc.WebrtcBuildVersion;
import p817j$.time.format.DateTimeFormatter;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalAdjuster;
import p817j$.time.temporal.TemporalQuery;
import p817j$.time.temporal.TemporalUnit;
import p817j$.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class LocalTime implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX;
    public static final LocalTime MIN;

    /* JADX INFO: renamed from: e */
    public static final LocalTime f48522e;

    /* JADX INFO: renamed from: f */
    private static final LocalTime[] f48523f = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a */
    private final byte f48524a;

    /* JADX INFO: renamed from: b */
    private final byte f48525b;

    /* JADX INFO: renamed from: c */
    private final byte f48526c;

    /* JADX INFO: renamed from: d */
    private final int f48527d;

    static {
        int i10 = 0;
        while (true) {
            LocalTime[] localTimeArr = f48523f;
            if (i10 < localTimeArr.length) {
                localTimeArr[i10] = new LocalTime(i10, 0, 0, 0);
                i10++;
            } else {
                LocalTime localTime = localTimeArr[0];
                f48522e = localTime;
                LocalTime localTime2 = localTimeArr[12];
                MIN = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public static LocalTime m16849V(int i10) {
        EnumC15621a.HOUR_OF_DAY.m17140Q(i10);
        return f48523f[i10];
    }

    /* JADX INFO: renamed from: of */
    public static LocalTime m16853of(int i10, int i11, int i12, int i13) {
        EnumC15621a.HOUR_OF_DAY.m17140Q(i10);
        EnumC15621a.MINUTE_OF_HOUR.m17140Q(i11);
        EnumC15621a.SECOND_OF_MINUTE.m17140Q(i12);
        EnumC15621a.NANO_OF_SECOND.m17140Q(i13);
        return m16846P(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: X */
    public static LocalTime m16851X(long j10) {
        EnumC15621a.SECOND_OF_DAY.m17140Q(j10);
        int i10 = (int) (j10 / 3600);
        long j11 = j10 - ((long) (i10 * 3600));
        int i11 = (int) (j11 / 60);
        return m16846P(i10, i11, (int) (j11 - ((long) (i11 * 60))), 0);
    }

    /* JADX INFO: renamed from: W */
    public static LocalTime m16850W(long j10) {
        EnumC15621a.NANO_OF_DAY.m17140Q(j10);
        int i10 = (int) (j10 / 3600000000000L);
        long j11 = j10 - (((long) i10) * 3600000000000L);
        int i11 = (int) (j11 / 60000000000L);
        long j12 = j11 - (((long) i11) * 60000000000L);
        int i12 = (int) (j12 / 1000000000);
        return m16846P(i10, i11, i12, (int) (j12 - (((long) i12) * 1000000000)));
    }

    /* JADX INFO: renamed from: Q */
    public static LocalTime m16847Q(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.mo16774y(AbstractC15632l.m17161g());
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalTime parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.f48630f);
    }

    public static LocalTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalTime) dateTimeFormatter.parse(charSequence, new C15571d(2));
    }

    /* JADX INFO: renamed from: P */
    private static LocalTime m16846P(int i10, int i11, int i12, int i13) {
        if ((i11 | i12 | i13) == 0) {
            return f48523f[i10];
        }
        return new LocalTime(i10, i11, i12, i13);
    }

    private LocalTime(int i10, int i11, int i12, int i13) {
        this.f48524a = (byte) i10;
        this.f48525b = (byte) i11;
        this.f48526c = (byte) i12;
        this.f48527d = i13;
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return ((EnumC15621a) interfaceC15635o).m17141R();
        }
        return interfaceC15635o != null && interfaceC15635o.mo17145r(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: r */
    public final C15637q mo16772r(InterfaceC15635o interfaceC15635o) {
        return AbstractC15632l.m17158d(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: o */
    public final int mo16771o(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return m16848R(interfaceC15635o);
        }
        return AbstractC15632l.m17155a(this, interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            if (interfaceC15635o == EnumC15621a.NANO_OF_DAY) {
                return m16862e0();
            }
            if (interfaceC15635o == EnumC15621a.MICRO_OF_DAY) {
                return m16862e0() / 1000;
            }
            return m16848R(interfaceC15635o);
        }
        return interfaceC15635o.mo17144q(this);
    }

    /* JADX INFO: renamed from: R */
    private int m16848R(InterfaceC15635o interfaceC15635o) {
        int i10 = AbstractC15607g.f48726a[((EnumC15621a) interfaceC15635o).ordinal()];
        byte b = this.f48525b;
        int i11 = this.f48527d;
        byte b10 = this.f48524a;
        switch (i10) {
            case 1:
                return i11;
            case 2:
                throw new C15636p("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i11 / 1000;
            case 4:
                throw new C15636p("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i11 / UtilsKt.MICROS_MULTIPLIER;
            case 6:
                return (int) (m16862e0() / 1000000);
            case 7:
                return this.f48526c;
            case 8:
                return toSecondOfDay();
            case 9:
                return b;
            case 10:
                return (b10 * 60) + b;
            case 11:
                return b10 % 12;
            case 12:
                int i12 = b10 % 12;
                if (i12 % 12 == 0) {
                    return 12;
                }
                return i12;
            case 13:
                return b10;
            case 14:
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return b10 / 12;
            default:
                throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
    }

    /* JADX INFO: renamed from: S */
    public final int m16854S() {
        return this.f48524a;
    }

    /* JADX INFO: renamed from: U */
    public final int m16856U() {
        return this.f48526c;
    }

    /* JADX INFO: renamed from: T */
    public final int m16855T() {
        return this.f48527d;
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: q */
    public final Temporal mo16790q(LocalDate localDate) {
        return (LocalTime) localDate.mo16768A(this);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final LocalTime mo16787d(long j10, InterfaceC15635o interfaceC15635o) {
        if (!(interfaceC15635o instanceof EnumC15621a)) {
            return (LocalTime) interfaceC15635o.mo17146u(this, j10);
        }
        EnumC15621a enumC15621a = (EnumC15621a) interfaceC15635o;
        enumC15621a.m17140Q(j10);
        int i10 = AbstractC15607g.f48726a[enumC15621a.ordinal()];
        byte b = this.f48525b;
        byte b10 = this.f48526c;
        int i11 = this.f48527d;
        byte b11 = this.f48524a;
        switch (i10) {
            case 1:
                return m16864g0((int) j10);
            case 2:
                return m16850W(j10);
            case 3:
                return m16864g0(((int) j10) * 1000);
            case 4:
                return m16850W(j10 * 1000);
            case 5:
                return m16864g0(((int) j10) * UtilsKt.MICROS_MULTIPLIER);
            case 6:
                return m16850W(j10 * 1000000);
            case 7:
                int i12 = (int) j10;
                if (b10 == i12) {
                    return this;
                }
                EnumC15621a.SECOND_OF_MINUTE.m17140Q(i12);
                return m16846P(b11, b, i12, i11);
            case 8:
                return m16861c0(j10 - ((long) toSecondOfDay()));
            case 9:
                int i13 = (int) j10;
                if (b == i13) {
                    return this;
                }
                EnumC15621a.MINUTE_OF_HOUR.m17140Q(i13);
                return m16846P(b11, i13, b10, i11);
            case 10:
                return m16859a0(j10 - ((long) ((b11 * 60) + b)));
            case 11:
                return m16858Z(j10 - ((long) (b11 % 12)));
            case 12:
                if (j10 == 12) {
                    j10 = 0;
                }
                return m16858Z(j10 - ((long) (b11 % 12)));
            case 13:
                int i14 = (int) j10;
                if (b11 == i14) {
                    return this;
                }
                EnumC15621a.HOUR_OF_DAY.m17140Q(i14);
                return m16846P(i14, b, b10, i11);
            case 14:
                if (j10 == 24) {
                    j10 = 0;
                }
                int i15 = (int) j10;
                if (b11 == i15) {
                    return this;
                }
                EnumC15621a.HOUR_OF_DAY.m17140Q(i15);
                return m16846P(i15, b, b10, i11);
            case 15:
                return m16858Z((j10 - ((long) (b11 / 12))) * 12);
            default:
                throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final LocalTime m16864g0(int i10) {
        if (this.f48527d == i10) {
            return this;
        }
        EnumC15621a.NANO_OF_SECOND.m17140Q(i10);
        return m16846P(this.f48524a, this.f48525b, this.f48526c, i10);
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final LocalTime mo16788e(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (AbstractC15607g.f48727b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return m16860b0(j10);
                case 2:
                    return m16860b0((j10 % 86400000000L) * 1000);
                case 3:
                    return m16860b0((j10 % 86400000) * 1000000);
                case 4:
                    return m16861c0(j10);
                case 5:
                    return m16859a0(j10);
                case 6:
                    return m16858Z(j10);
                case 7:
                    return m16858Z((j10 % 2) * 12);
                default:
                    throw new C15636p("Unsupported unit: " + temporalUnit);
            }
        }
        return (LocalTime) temporalUnit.mo17137o(this, j10);
    }

    /* JADX INFO: renamed from: Z */
    public final LocalTime m16858Z(long j10) {
        if (j10 == 0) {
            return this;
        }
        return m16846P(((((int) (j10 % 24)) + this.f48524a) + 24) % 24, this.f48525b, this.f48526c, this.f48527d);
    }

    /* JADX INFO: renamed from: a0 */
    public final LocalTime m16859a0(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f48524a * 60) + this.f48525b;
        int i11 = ((((int) (j10 % 1440)) + i10) + 1440) % 1440;
        return i10 == i11 ? this : m16846P(i11 / 60, i11 % 60, this.f48526c, this.f48527d);
    }

    /* JADX INFO: renamed from: c0 */
    public final LocalTime m16861c0(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f48525b * 60) + (this.f48524a * 3600) + this.f48526c;
        int i11 = ((((int) (j10 % 86400)) + i10) + 86400) % 86400;
        return i10 == i11 ? this : m16846P(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.f48527d);
    }

    /* JADX INFO: renamed from: b0 */
    public final LocalTime m16860b0(long j10) {
        if (j10 == 0) {
            return this;
        }
        long jM16862e0 = m16862e0();
        long j11 = (((j10 % 86400000000000L) + jM16862e0) + 86400000000000L) % 86400000000000L;
        return jM16862e0 == j11 ? this : m16846P((int) (j11 / 3600000000000L), (int) ((j11 / 60000000000L) % 60), (int) ((j11 / 1000000000) % 60), (int) (j11 % 1000000000));
    }

    @Override // p817j$.time.temporal.Temporal
    /* JADX INFO: renamed from: m */
    public final Temporal mo16789m(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? mo16788e(Long.MAX_VALUE, chronoUnit).mo16788e(1L, chronoUnit) : mo16788e(-j10, chronoUnit);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final Object mo16774y(TemporalQuery temporalQuery) {
        if (temporalQuery == AbstractC15632l.m17159e() || temporalQuery == AbstractC15632l.m17166l() || temporalQuery == AbstractC15632l.m17165k() || temporalQuery == AbstractC15632l.m17163i()) {
            return null;
        }
        if (temporalQuery == AbstractC15632l.m17161g()) {
            return this;
        }
        if (temporalQuery == AbstractC15632l.m17160f()) {
            return null;
        }
        if (temporalQuery == AbstractC15632l.m17164j()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        return temporal.mo16787d(m16862e0(), EnumC15621a.NANO_OF_DAY);
    }

    @Override // p817j$.time.temporal.Temporal
    public final long until(Temporal temporal, TemporalUnit temporalUnit) {
        LocalTime localTimeM16847Q = m16847Q(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            long jM16862e0 = localTimeM16847Q.m16862e0() - m16862e0();
            switch (AbstractC15607g.f48727b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return jM16862e0;
                case 2:
                    return jM16862e0 / 1000;
                case 3:
                    return jM16862e0 / 1000000;
                case 4:
                    return jM16862e0 / 1000000000;
                case 5:
                    return jM16862e0 / 60000000000L;
                case 6:
                    return jM16862e0 / 3600000000000L;
                case 7:
                    return jM16862e0 / 43200000000000L;
                default:
                    throw new C15636p("Unsupported unit: " + temporalUnit);
            }
        }
        return temporalUnit.mo17136m(this, localTimeM16847Q);
    }

    public int toSecondOfDay() {
        return (this.f48525b * 60) + (this.f48524a * 3600) + this.f48526c;
    }

    /* JADX INFO: renamed from: e0 */
    public final long m16862e0() {
        return (((long) this.f48526c) * 1000000000) + (((long) this.f48525b) * 60000000000L) + (((long) this.f48524a) * 3600000000000L) + ((long) this.f48527d);
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.f48524a, localTime.f48524a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.f48525b, localTime.f48525b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(this.f48526c, localTime.f48526c);
        return iCompare3 == 0 ? Integer.compare(this.f48527d, localTime.f48527d) : iCompare3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalTime)) {
            return false;
        }
        LocalTime localTime = (LocalTime) obj;
        return this.f48524a == localTime.f48524a && this.f48525b == localTime.f48525b && this.f48526c == localTime.f48526c && this.f48527d == localTime.f48527d;
    }

    public int hashCode() {
        long jM16862e0 = m16862e0();
        return (int) (jM16862e0 ^ (jM16862e0 >>> 32));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b = this.f48524a;
        sb2.append(b < 10 ? WebrtcBuildVersion.maint_version : "");
        sb2.append((int) b);
        byte b10 = this.f48525b;
        sb2.append(b10 < 10 ? ":0" : ":");
        sb2.append((int) b10);
        byte b11 = this.f48526c;
        int i10 = this.f48527d;
        if (b11 > 0 || i10 > 0) {
            sb2.append(b11 < 10 ? ":0" : ":");
            sb2.append((int) b11);
            if (i10 > 0) {
                sb2.append('.');
                if (i10 % UtilsKt.MICROS_MULTIPLIER == 0) {
                    sb2.append(Integer.toString((i10 / UtilsKt.MICROS_MULTIPLIER) + 1000).substring(1));
                } else if (i10 % 1000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000) + UtilsKt.MICROS_MULTIPLIER).substring(1));
                } else {
                    sb2.append(Integer.toString(i10 + 1000000000).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new C15615o((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: h0 */
    final void m16865h0(DataOutput dataOutput) throws IOException {
        byte b = this.f48526c;
        byte b10 = this.f48524a;
        byte b11 = this.f48525b;
        int i10 = this.f48527d;
        if (i10 != 0) {
            dataOutput.writeByte(b10);
            dataOutput.writeByte(b11);
            dataOutput.writeByte(b);
            dataOutput.writeInt(i10);
            return;
        }
        if (b != 0) {
            dataOutput.writeByte(b10);
            dataOutput.writeByte(b11);
            dataOutput.writeByte(~b);
        } else if (b11 == 0) {
            dataOutput.writeByte(~b10);
        } else {
            dataOutput.writeByte(b10);
            dataOutput.writeByte(~b11);
        }
    }

    /* JADX INFO: renamed from: d0 */
    static LocalTime m16852d0(ObjectInput objectInput) throws IOException {
        int i10;
        int i11;
        int i12 = objectInput.readByte();
        int i13 = 0;
        if (i12 < 0) {
            i12 = ~i12;
            i10 = 0;
            i11 = 0;
        } else {
            byte b = objectInput.readByte();
            if (b < 0) {
                int i14 = ~b;
                i11 = 0;
                i13 = i14;
                i10 = 0;
            } else {
                byte b10 = objectInput.readByte();
                if (b10 < 0) {
                    i10 = ~b10;
                } else {
                    i13 = objectInput.readInt();
                    i10 = b10;
                }
                i11 = i13;
                i13 = b;
            }
        }
        return m16853of(i12, i13, i10, i11);
    }
}
