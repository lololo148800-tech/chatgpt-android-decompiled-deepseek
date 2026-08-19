package p817j$.time;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.temporal.ChronoUnit;
import p817j$.time.temporal.Temporal;
import p817j$.time.temporal.TemporalAmount;

/* JADX INFO: loaded from: classes4.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {

    /* JADX INFO: renamed from: c */
    public static final Duration f48512c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a */
    private final long f48513a;

    /* JADX INFO: renamed from: b */
    private final int f48514b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f48513a, duration2.f48513a);
        return iCompare != 0 ? iCompare : this.f48514b - duration2.f48514b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration ofMinutes(long j10) {
        return m16775o(AbstractC15529a.m16751o(j10, 60), 0);
    }

    /* JADX INFO: renamed from: r */
    public static Duration m16776r(long j10) {
        return m16775o(j10, 0);
    }

    /* JADX INFO: renamed from: u */
    public static Duration m16777u(long j10, long j11) {
        return m16775o(AbstractC15529a.m16745i(j10, AbstractC15529a.m16750n(j11, 1000000000L)), (int) AbstractC15529a.m16749m(j11, 1000000000L));
    }

    /* JADX INFO: renamed from: o */
    private static Duration m16775o(long j10, int i10) {
        if ((((long) i10) | j10) == 0) {
            return f48512c;
        }
        return new Duration(j10, i10);
    }

    private Duration(long j10, int i10) {
        this.f48513a = j10;
        this.f48514b = i10;
    }

    /* JADX INFO: renamed from: q */
    public final long m16779q() {
        return this.f48513a;
    }

    @Override // p817j$.time.temporal.TemporalAmount
    /* JADX INFO: renamed from: m */
    public final Temporal mo16778m(Temporal temporal) {
        long j10 = this.f48513a;
        if (j10 != 0) {
            temporal = temporal.mo16788e(j10, ChronoUnit.SECONDS);
        }
        int i10 = this.f48514b;
        return i10 != 0 ? temporal.mo16788e(i10, ChronoUnit.NANOS) : temporal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.f48513a == duration.f48513a && this.f48514b == duration.f48514b;
    }

    public final int hashCode() {
        long j10 = this.f48513a;
        return (this.f48514b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        if (this == f48512c) {
            return "PT0S";
        }
        long j10 = this.f48513a;
        int i10 = this.f48514b;
        long j11 = (j10 >= 0 || i10 <= 0) ? j10 : 1 + j10;
        long j12 = j11 / 3600;
        int i11 = (int) ((j11 % 3600) / 60);
        int i12 = (int) (j11 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j12 != 0) {
            sb2.append(j12);
            sb2.append('H');
        }
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        if (i12 == 0 && i10 == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (j10 < 0 && i10 > 0 && i12 == 0) {
            sb2.append("-0");
        } else {
            sb2.append(i12);
        }
        if (i10 > 0) {
            int length = sb2.length();
            if (j10 < 0) {
                sb2.append(2000000000 - ((long) i10));
            } else {
                sb2.append(((long) i10) + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new C15615o((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(this.f48513a);
        objectOutput.writeInt(this.f48514b);
    }
}
