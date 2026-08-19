package p817j$.time.zone;

import android.gov.nist.core.Separators;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import p817j$.time.DayOfWeek;
import p817j$.time.LocalDate;
import p817j$.time.LocalDateTime;
import p817j$.time.LocalTime;
import p817j$.time.Month;
import p817j$.time.ZoneOffset;
import p817j$.time.chrono.C15562r;
import p817j$.time.temporal.C15633m;
import p817j$.time.temporal.TemporalAdjusters;
import p817j$.util.Objects;

/* JADX INFO: renamed from: j$.time.zone.e */
/* JADX INFO: loaded from: classes4.dex */
public final class C15645e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a */
    private final Month f48825a;

    /* JADX INFO: renamed from: b */
    private final byte f48826b;

    /* JADX INFO: renamed from: c */
    private final DayOfWeek f48827c;

    /* JADX INFO: renamed from: d */
    private final LocalTime f48828d;

    /* JADX INFO: renamed from: e */
    private final boolean f48829e;

    /* JADX INFO: renamed from: f */
    private final EnumC15644d f48830f;

    /* JADX INFO: renamed from: g */
    private final ZoneOffset f48831g;

    /* JADX INFO: renamed from: h */
    private final ZoneOffset f48832h;

    /* JADX INFO: renamed from: i */
    private final ZoneOffset f48833i;

    C15645e(Month month, int i10, DayOfWeek dayOfWeek, LocalTime localTime, boolean z6, EnumC15644d enumC15644d, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f48825a = month;
        this.f48826b = (byte) i10;
        this.f48827c = dayOfWeek;
        this.f48828d = localTime;
        this.f48829e = z6;
        this.f48830f = enumC15644d;
        this.f48831g = zoneOffset;
        this.f48832h = zoneOffset2;
        this.f48833i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C15641a((byte) 3, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        int iM16854S;
        LocalTime localTime = this.f48828d;
        boolean z6 = this.f48829e;
        int secondOfDay = z6 ? 86400 : localTime.toSecondOfDay();
        int totalSeconds = this.f48831g.getTotalSeconds();
        ZoneOffset zoneOffset = this.f48832h;
        int totalSeconds2 = zoneOffset.getTotalSeconds() - totalSeconds;
        ZoneOffset zoneOffset2 = this.f48833i;
        int totalSeconds3 = zoneOffset2.getTotalSeconds() - totalSeconds;
        if (secondOfDay % 3600 == 0) {
            iM16854S = z6 ? 24 : localTime.m16854S();
        } else {
            iM16854S = 31;
        }
        int i10 = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i11 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i12 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f48827c;
        objectOutput.writeInt((this.f48825a.getValue() << 28) + ((this.f48826b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (iM16854S << 14) + (this.f48830f.ordinal() << 12) + (i10 << 4) + (i11 << 2) + i12);
        if (iM16854S == 31) {
            objectOutput.writeInt(secondOfDay);
        }
        if (i10 == 255) {
            objectOutput.writeInt(totalSeconds);
        }
        if (i11 == 3) {
            objectOutput.writeInt(zoneOffset.getTotalSeconds());
        }
        if (i12 == 3) {
            objectOutput.writeInt(zoneOffset2.getTotalSeconds());
        }
    }

    /* JADX INFO: renamed from: b */
    static C15645e m17223b(ObjectInput objectInput) {
        ZoneOffset zoneOffsetOfTotalSeconds;
        ZoneOffset zoneOffsetOfTotalSeconds2;
        int i10 = objectInput.readInt();
        Month monthM16866S = Month.m16866S(i10 >>> 28);
        int i11 = ((264241152 & i10) >>> 22) - 32;
        int i12 = (3670016 & i10) >>> 19;
        DayOfWeek dayOfWeekM16767of = i12 == 0 ? null : DayOfWeek.m16767of(i12);
        int i13 = (507904 & i10) >>> 14;
        EnumC15644d enumC15644d = EnumC15644d.values()[(i10 & 12288) >>> 12];
        int i14 = (i10 & 4080) >>> 4;
        int i15 = (i10 & 12) >>> 2;
        int i16 = i10 & 3;
        LocalTime localTimeM16851X = i13 == 31 ? LocalTime.m16851X(objectInput.readInt()) : LocalTime.m16849V(i13 % 24);
        ZoneOffset zoneOffsetOfTotalSeconds3 = ZoneOffset.ofTotalSeconds(i14 == 255 ? objectInput.readInt() : (i14 - 128) * 900);
        if (i15 == 3) {
            zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(objectInput.readInt());
        } else {
            zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds((i15 * 1800) + zoneOffsetOfTotalSeconds3.getTotalSeconds());
        }
        ZoneOffset zoneOffset = zoneOffsetOfTotalSeconds;
        if (i16 == 3) {
            zoneOffsetOfTotalSeconds2 = ZoneOffset.ofTotalSeconds(objectInput.readInt());
        } else {
            zoneOffsetOfTotalSeconds2 = ZoneOffset.ofTotalSeconds((i16 * 1800) + zoneOffsetOfTotalSeconds3.getTotalSeconds());
        }
        boolean z6 = i13 == 24;
        Objects.requireNonNull(monthM16866S, "month");
        Objects.requireNonNull(localTimeM16851X, "time");
        Objects.requireNonNull(enumC15644d, "timeDefnition");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds3, "standardOffset");
        Objects.requireNonNull(zoneOffset, "offsetBefore");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds2, "offsetAfter");
        if (i11 < -28 || i11 > 31 || i11 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z6 && !localTimeM16851X.equals(LocalTime.f48522e)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeM16851X.m16855T() != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new C15645e(monthM16866S, i11, dayOfWeekM16767of, localTimeM16851X, z6, enumC15644d, zoneOffsetOfTotalSeconds3, zoneOffset, zoneOffsetOfTotalSeconds2);
    }

    /* JADX INFO: renamed from: a */
    public final C15642b m17224a(int i10) {
        LocalDate localDateM16797b0;
        DayOfWeek dayOfWeek = this.f48827c;
        Month month = this.f48825a;
        byte b = this.f48826b;
        if (b < 0) {
            localDateM16797b0 = LocalDate.m16797b0(i10, month, month.m16868Q(C15562r.f48594d.mo16919M(i10)) + 1 + b);
            if (dayOfWeek != null) {
                localDateM16797b0 = localDateM16797b0.mo16819k(new C15633m(dayOfWeek.getValue(), 1));
            }
        } else {
            localDateM16797b0 = LocalDate.m16797b0(i10, month, b);
            if (dayOfWeek != null) {
                localDateM16797b0 = localDateM16797b0.mo16819k(TemporalAdjusters.nextOrSame(dayOfWeek));
            }
        }
        if (this.f48829e) {
            localDateM16797b0 = localDateM16797b0.m16814e0(1L);
        }
        LocalDateTime localDateTimeM16830of = LocalDateTime.m16830of(localDateM16797b0, this.f48828d);
        EnumC15644d enumC15644d = this.f48830f;
        enumC15644d.getClass();
        int i11 = AbstractC15643c.f48823a[enumC15644d.ordinal()];
        ZoneOffset zoneOffset = this.f48832h;
        if (i11 == 1) {
            localDateTimeM16830of = localDateTimeM16830of.m16839a0(zoneOffset.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
        } else if (i11 == 2) {
            localDateTimeM16830of = localDateTimeM16830of.m16839a0(zoneOffset.getTotalSeconds() - this.f48831g.getTotalSeconds());
        }
        return new C15642b(localDateTimeM16830of, zoneOffset, this.f48833i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15645e)) {
            return false;
        }
        C15645e c15645e = (C15645e) obj;
        return this.f48825a == c15645e.f48825a && this.f48826b == c15645e.f48826b && this.f48827c == c15645e.f48827c && this.f48830f == c15645e.f48830f && this.f48828d.equals(c15645e.f48828d) && this.f48829e == c15645e.f48829e && this.f48831g.equals(c15645e.f48831g) && this.f48832h.equals(c15645e.f48832h) && this.f48833i.equals(c15645e.f48833i);
    }

    public final int hashCode() {
        int secondOfDay = ((this.f48828d.toSecondOfDay() + (this.f48829e ? 1 : 0)) << 15) + (this.f48825a.ordinal() << 11) + ((this.f48826b + 32) << 5);
        DayOfWeek dayOfWeek = this.f48827c;
        return ((this.f48831g.hashCode() ^ (this.f48830f.ordinal() + (secondOfDay + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f48832h.hashCode()) ^ this.f48833i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f48832h;
        ZoneOffset zoneOffset2 = this.f48833i;
        sb2.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb2.append(zoneOffset);
        sb2.append(" to ");
        sb2.append(zoneOffset2);
        sb2.append(", ");
        Month month = this.f48825a;
        byte b = this.f48826b;
        DayOfWeek dayOfWeek = this.f48827c;
        if (dayOfWeek == null) {
            sb2.append(month.name());
            sb2.append(' ');
            sb2.append((int) b);
        } else if (b == -1) {
            sb2.append(dayOfWeek.name());
            sb2.append(" on or before last day of ");
            sb2.append(month.name());
        } else if (b < 0) {
            sb2.append(dayOfWeek.name());
            sb2.append(" on or before last day minus ");
            sb2.append((-b) - 1);
            sb2.append(" of ");
            sb2.append(month.name());
        } else {
            sb2.append(dayOfWeek.name());
            sb2.append(" on or after ");
            sb2.append(month.name());
            sb2.append(' ');
            sb2.append((int) b);
        }
        sb2.append(" at ");
        sb2.append(this.f48829e ? "24:00" : this.f48828d.toString());
        sb2.append(Separators.f31991SP);
        sb2.append(this.f48830f);
        sb2.append(", standard offset ");
        sb2.append(this.f48831g);
        sb2.append(']');
        return sb2.toString();
    }
}
