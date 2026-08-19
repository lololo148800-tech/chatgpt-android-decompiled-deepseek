package p817j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import livekit.org.webrtc.WebrtcBuildVersion;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.C15636p;
import p817j$.time.temporal.C15637q;
import p817j$.time.temporal.EnumC15621a;
import p817j$.time.temporal.InterfaceC15635o;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAccessor;
import p817j$.time.temporal.TemporalAdjuster;
import p817j$.time.temporal.TemporalQuery;
import p817j$.time.zone.ZoneRules;
import p817j$.util.Objects;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, TemporalAdjuster, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: b */
    private final int f48537b;

    /* JADX INFO: renamed from: c */
    private final transient String f48538c;

    /* JADX INFO: renamed from: d */
    private static final ConcurrentHashMap f48533d = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e */
    private static final ConcurrentHashMap f48534e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = ofTotalSeconds(0);

    /* JADX INFO: renamed from: f */
    public static final ZoneOffset f48535f = ofTotalSeconds(-64800);

    /* JADX INFO: renamed from: g */
    public static final ZoneOffset f48536g = ofTotalSeconds(64800);

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public static ZoneOffset m16883V(String str) {
        int iM16884W;
        int iM16884W2;
        int iM16884W3;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) f48534e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + WebrtcBuildVersion.maint_version + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iM16884W = m16884W(str, 1, false);
                    iM16884W2 = m16884W(str, 3, false);
                } else if (length == 6) {
                    iM16884W = m16884W(str, 1, false);
                    iM16884W2 = m16884W(str, 4, true);
                } else if (length == 7) {
                    iM16884W = m16884W(str, 1, false);
                    iM16884W2 = m16884W(str, 3, false);
                    iM16884W3 = m16884W(str, 5, false);
                } else if (length == 9) {
                    iM16884W = m16884W(str, 1, false);
                    iM16884W2 = m16884W(str, 4, true);
                    iM16884W3 = m16884W(str, 7, true);
                } else {
                    throw new DateTimeException("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                iM16884W3 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt == '+' && cCharAt != '-') {
                throw new DateTimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            }
            if (cCharAt == '-') {
                return ofHoursMinutesSeconds(-iM16884W, -iM16884W2, -iM16884W3);
            }
            return ofHoursMinutesSeconds(iM16884W, iM16884W2, iM16884W3);
        }
        iM16884W = m16884W(str, 1, false);
        iM16884W2 = 0;
        iM16884W3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt == '-') {
            return ofHoursMinutesSeconds(-iM16884W, -iM16884W2, -iM16884W3);
        }
        return ofHoursMinutesSeconds(iM16884W, iM16884W2, iM16884W3);
    }

    /* JADX INFO: renamed from: W */
    private static int m16884W(String str, int i10, boolean z6) {
        if (z6 && str.charAt(i10 - 1) != ':') {
            throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char cCharAt = str.charAt(i10);
        char cCharAt2 = str.charAt(i10 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    public static ZoneOffset from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.mo16774y(AbstractC15632l.m17163i());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static ZoneOffset ofHoursMinutesSeconds(int i10, int i11, int i12) {
        if (i10 < -18 || i10 > 18) {
            throw new DateTimeException("Zone offset hours not in valid range: value " + i10 + " is not in the range -18 to 18");
        }
        if (i10 > 0) {
            if (i11 < 0 || i12 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i10 < 0) {
            if (i11 > 0 || i12 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i11 < -59 || i11 > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: value " + i11 + " is not in the range -59 to 59");
        }
        if (i12 < -59 || i12 > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: value " + i12 + " is not in the range -59 to 59");
        }
        if (Math.abs(i10) != 18 || (i11 | i12) == 0) {
            return ofTotalSeconds((i11 * 60) + (i10 * 3600) + i12);
        }
        throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset ofTotalSeconds(int i10) {
        if (i10 < -64800 || i10 > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i10 % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i10);
            ConcurrentHashMap concurrentHashMap = f48533d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i10));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
            f48534e.putIfAbsent(zoneOffset2.f48538c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i10);
    }

    private ZoneOffset(int i10) {
        String string;
        this.f48537b = i10;
        if (i10 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i10);
            StringBuilder sb2 = new StringBuilder();
            int i11 = iAbs / 3600;
            int i12 = (iAbs / 60) % 60;
            sb2.append(i10 < 0 ? "-" : "+");
            sb2.append(i11 < 10 ? WebrtcBuildVersion.maint_version : "");
            sb2.append(i11);
            sb2.append(i12 < 10 ? ":0" : ":");
            sb2.append(i12);
            int i13 = iAbs % 60;
            if (i13 != 0) {
                sb2.append(i13 < 10 ? ":0" : ":");
                sb2.append(i13);
            }
            string = sb2.toString();
        }
        this.f48538c = string;
    }

    public int getTotalSeconds() {
        return this.f48537b;
    }

    @Override // p817j$.time.ZoneId
    public final String getId() {
        return this.f48538c;
    }

    @Override // p817j$.time.ZoneId
    public final ZoneRules getRules() {
        return ZoneRules.m17204h(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: f */
    public final boolean mo16770f(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o instanceof EnumC15621a) {
            return interfaceC15635o == EnumC15621a.OFFSET_SECONDS;
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
        if (interfaceC15635o == EnumC15621a.OFFSET_SECONDS) {
            return this.f48537b;
        }
        if (interfaceC15635o instanceof EnumC15621a) {
            throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
        return AbstractC15632l.m17158d(this, interfaceC15635o).m17170a(mo16773u(interfaceC15635o), interfaceC15635o);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: u */
    public final long mo16773u(InterfaceC15635o interfaceC15635o) {
        if (interfaceC15635o == EnumC15621a.OFFSET_SECONDS) {
            return this.f48537b;
        }
        if (interfaceC15635o instanceof EnumC15621a) {
            throw new C15636p(AbstractC15534b.m16907a("Unsupported field: ", interfaceC15635o));
        }
        return interfaceC15635o.mo17144q(this);
    }

    @Override // p817j$.time.temporal.TemporalAccessor
    /* JADX INFO: renamed from: y */
    public final Object mo16774y(TemporalQuery temporalQuery) {
        return (temporalQuery == AbstractC15632l.m17163i() || temporalQuery == AbstractC15632l.m17165k()) ? this : AbstractC15632l.m17157c(this, temporalQuery);
    }

    @Override // p817j$.time.temporal.TemporalAdjuster
    /* JADX INFO: renamed from: A */
    public final Temporal mo16768A(Temporal temporal) {
        return temporal.mo16787d(this.f48537b, EnumC15621a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f48537b - this.f48537b;
    }

    @Override // p817j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.f48537b == ((ZoneOffset) obj).f48537b;
        }
        return false;
    }

    @Override // p817j$.time.ZoneId
    public int hashCode() {
        return this.f48537b;
    }

    @Override // p817j$.time.ZoneId
    public String toString() {
        return this.f48538c;
    }

    private Object writeReplace() {
        return new C15615o((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // p817j$.time.ZoneId
    /* JADX INFO: renamed from: T */
    final void mo16882T(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        m16887Y(objectOutput);
    }

    /* JADX INFO: renamed from: Y */
    final void m16887Y(DataOutput dataOutput) {
        int i10 = this.f48537b;
        int i11 = i10 % 900 == 0 ? i10 / 900 : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(i10);
        }
    }

    /* JADX INFO: renamed from: X */
    static ZoneOffset m16885X(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        return b == 127 ? ofTotalSeconds(objectInput.readInt()) : ofTotalSeconds(b * 900);
    }
}
