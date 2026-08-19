package p817j$.time.zone;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import p817j$.com.android.tools.p818r8.AbstractC15529a;
import p817j$.time.Clock;
import p817j$.time.Instant;
import p817j$.time.LocalDate;
import p817j$.time.LocalDateTime;
import p817j$.time.ZoneOffset;
import p817j$.time.chrono.AbstractC15551g;
import p817j$.util.Objects;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ZoneRules implements Serializable {

    /* JADX INFO: renamed from: i */
    private static final long[] f48805i = new long[0];

    /* JADX INFO: renamed from: j */
    private static final C15645e[] f48806j = new C15645e[0];

    /* JADX INFO: renamed from: k */
    private static final LocalDateTime[] f48807k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l */
    private static final C15642b[] f48808l = new C15642b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a */
    private final long[] f48809a;

    /* JADX INFO: renamed from: b */
    private final ZoneOffset[] f48810b;

    /* JADX INFO: renamed from: c */
    private final long[] f48811c;

    /* JADX INFO: renamed from: d */
    private final LocalDateTime[] f48812d;

    /* JADX INFO: renamed from: e */
    private final ZoneOffset[] f48813e;

    /* JADX INFO: renamed from: f */
    private final C15645e[] f48814f;

    /* JADX INFO: renamed from: g */
    private final TimeZone f48815g;

    /* JADX INFO: renamed from: h */
    private final transient ConcurrentHashMap f48816h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    public static ZoneRules m17204h(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return new ZoneRules(zoneOffset);
    }

    private ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, C15645e[] c15645eArr) {
        this.f48809a = jArr;
        this.f48810b = zoneOffsetArr;
        this.f48811c = jArr2;
        this.f48813e = zoneOffsetArr2;
        this.f48814f = c15645eArr;
        if (jArr2.length == 0) {
            this.f48812d = f48807k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < jArr2.length) {
                int i11 = i10 + 1;
                C15642b c15642b = new C15642b(jArr2[i10], zoneOffsetArr2[i10], zoneOffsetArr2[i11]);
                if (c15642b.m17215A()) {
                    arrayList.add(c15642b.m17218o());
                    arrayList.add(c15642b.m17217m());
                } else {
                    arrayList.add(c15642b.m17217m());
                    arrayList.add(c15642b.m17218o());
                }
                i10 = i11;
            }
            this.f48812d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f48815g = null;
    }

    private ZoneRules(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f48810b = zoneOffsetArr;
        long[] jArr = f48805i;
        this.f48809a = jArr;
        this.f48811c = jArr;
        this.f48812d = f48807k;
        this.f48813e = zoneOffsetArr;
        this.f48814f = f48806j;
        this.f48815g = null;
    }

    ZoneRules(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {m17205i(timeZone.getRawOffset())};
        this.f48810b = zoneOffsetArr;
        long[] jArr = f48805i;
        this.f48809a = jArr;
        this.f48811c = jArr;
        this.f48812d = f48807k;
        this.f48813e = zoneOffsetArr;
        this.f48814f = f48806j;
        this.f48815g = timeZone;
    }

    /* JADX INFO: renamed from: i */
    private static ZoneOffset m17205i(int i10) {
        return ZoneOffset.ofTotalSeconds(i10 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C15641a(this.f48815g != null ? (byte) 100 : (byte) 1, this);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        long[] jArr = this.f48809a;
        objectOutput.writeInt(jArr.length);
        for (long j10 : jArr) {
            C15641a.m17213c(j10, objectOutput);
        }
        for (ZoneOffset zoneOffset : this.f48810b) {
            C15641a.m17214d(zoneOffset, objectOutput);
        }
        long[] jArr2 = this.f48811c;
        objectOutput.writeInt(jArr2.length);
        for (long j11 : jArr2) {
            C15641a.m17213c(j11, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : this.f48813e) {
            C15641a.m17214d(zoneOffset2, objectOutput);
        }
        C15645e[] c15645eArr = this.f48814f;
        objectOutput.writeByte(c15645eArr.length);
        for (C15645e c15645e : c15645eArr) {
            c15645e.writeExternal(objectOutput);
        }
    }

    /* JADX INFO: renamed from: k */
    final void m17210k(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f48815g.getID());
    }

    /* JADX INFO: renamed from: j */
    static ZoneRules m17206j(ObjectInput objectInput) throws IOException {
        int i10 = objectInput.readInt();
        long[] jArr = f48805i;
        long[] jArr2 = i10 == 0 ? jArr : new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jArr2[i11] = C15641a.m17211a(objectInput);
        }
        int i12 = i10 + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            zoneOffsetArr[i13] = C15641a.m17212b(objectInput);
        }
        int i14 = objectInput.readInt();
        if (i14 != 0) {
            jArr = new long[i14];
        }
        long[] jArr3 = jArr;
        for (int i15 = 0; i15 < i14; i15++) {
            jArr3[i15] = C15641a.m17211a(objectInput);
        }
        int i16 = i14 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            zoneOffsetArr2[i17] = C15641a.m17212b(objectInput);
        }
        int i18 = objectInput.readByte();
        C15645e[] c15645eArr = i18 == 0 ? f48806j : new C15645e[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            c15645eArr[i19] = C15645e.m17223b(objectInput);
        }
        return new ZoneRules(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, c15645eArr);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public boolean isFixedOffset() {
        C15642b c15642b;
        TimeZone timeZone = this.f48815g;
        if (timeZone == null) {
            return this.f48811c.length == 0;
        }
        if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
            return false;
        }
        Instant instantNow = Instant.now();
        long epochSecond = instantNow.getEpochSecond();
        if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
            epochSecond++;
        }
        int iM17202c = m17202c(epochSecond, getOffset(instantNow));
        C15642b[] c15642bArrM17201b = m17201b(iM17202c);
        for (int length = c15642bArrM17201b.length - 1; length >= 0; length--) {
            if (epochSecond > c15642bArrM17201b[length].m17216O()) {
                c15642b = c15642bArrM17201b[length];
                if (c15642b == null) {
                    return true;
                }
                return false;
            }
        }
        if (iM17202c > 1800) {
            C15642b[] c15642bArrM17201b2 = m17201b(iM17202c - 1);
            for (int length2 = c15642bArrM17201b2.length - 1; length2 >= 0; length2--) {
                if (epochSecond > c15642bArrM17201b2[length2].m17216O()) {
                    c15642b = c15642bArrM17201b2[length2];
                }
            }
            int offset = timeZone.getOffset((epochSecond - 1) * 1000);
            long epochDay = LocalDate.m16800of(1800, 1, 1).toEpochDay() * 86400;
            for (long jMin = Math.min(epochSecond - 31104000, (Clock.systemUTC().mo16766b() / 1000) + 31968000); epochDay <= jMin; jMin -= 7776000) {
                int offset2 = timeZone.getOffset(jMin * 1000);
                if (offset != offset2) {
                    int iM17202c2 = m17202c(jMin, m17205i(offset2));
                    C15642b[] c15642bArrM17201b3 = m17201b(iM17202c2 + 1);
                    for (int length3 = c15642bArrM17201b3.length - 1; length3 >= 0; length3--) {
                        if (epochSecond > c15642bArrM17201b3[length3].m17216O()) {
                            c15642b = c15642bArrM17201b3[length3];
                        }
                    }
                    C15642b[] c15642bArrM17201b4 = m17201b(iM17202c2);
                    c15642b = c15642bArrM17201b4[c15642bArrM17201b4.length - 1];
                }
            }
            c15642b = null;
        } else {
            c15642b = null;
        }
        if (c15642b == null) {
            return true;
        }
        return false;
    }

    public ZoneOffset getOffset(Instant instant) {
        TimeZone timeZone = this.f48815g;
        if (timeZone != null) {
            return m17205i(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f48811c;
        if (jArr.length == 0) {
            return this.f48810b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f48814f.length;
        ZoneOffset[] zoneOffsetArr = this.f48813e;
        if (length > 0 && epochSecond > jArr[jArr.length - 1]) {
            C15642b[] c15642bArrM17201b = m17201b(m17202c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
            C15642b c15642b = null;
            for (int i10 = 0; i10 < c15642bArrM17201b.length; i10++) {
                c15642b = c15642bArrM17201b[i10];
                if (epochSecond < c15642b.m17216O()) {
                    return c15642b.m17221u();
                }
            }
            return c15642b.m17220r();
        }
        int iBinarySearch = Arrays.binarySearch(jArr, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return zoneOffsetArr[iBinarySearch + 1];
    }

    /* JADX INFO: renamed from: f */
    public final List m17208f(LocalDateTime localDateTime) {
        Object objM17203d = m17203d(localDateTime);
        if (objM17203d instanceof C15642b) {
            return ((C15642b) objM17203d).m17222y();
        }
        return Collections.singletonList((ZoneOffset) objM17203d);
    }

    /* JADX INFO: renamed from: e */
    public final C15642b m17207e(LocalDateTime localDateTime) {
        Object objM17203d = m17203d(localDateTime);
        if (objM17203d instanceof C15642b) {
            return (C15642b) objM17203d;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private Object m17203d(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f48810b;
        int i10 = 0;
        TimeZone timeZone = this.f48815g;
        if (timeZone != null) {
            C15642b[] c15642bArrM17201b = m17201b(localDateTime.getYear());
            if (c15642bArrM17201b.length == 0) {
                return m17205i(timeZone.getOffset(AbstractC15551g.m16962n(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = c15642bArrM17201b.length;
            while (i10 < length) {
                C15642b c15642b = c15642bArrM17201b[i10];
                Object objM17200a = m17200a(localDateTime, c15642b);
                if ((objM17200a instanceof C15642b) || objM17200a.equals(c15642b.m17221u())) {
                    return objM17200a;
                }
                i10++;
                obj = objM17200a;
            }
            return obj;
        }
        if (this.f48811c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f48814f.length;
        LocalDateTime[] localDateTimeArr = this.f48812d;
        if (length2 > 0 && localDateTime.m16833T(localDateTimeArr[localDateTimeArr.length - 1])) {
            C15642b[] c15642bArrM17201b2 = m17201b(localDateTime.getYear());
            int length3 = c15642bArrM17201b2.length;
            while (i10 < length3) {
                C15642b c15642b2 = c15642bArrM17201b2[i10];
                Object objM17200a2 = m17200a(localDateTime, c15642b2);
                if ((objM17200a2 instanceof C15642b) || objM17200a2.equals(c15642b2.m17221u())) {
                    return objM17200a2;
                }
                i10++;
                obj = objM17200a2;
            }
            return obj;
        }
        int iBinarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.f48813e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < localDateTimeArr.length - 1) {
            int i11 = iBinarySearch + 1;
            if (localDateTimeArr[iBinarySearch].equals(localDateTimeArr[i11])) {
                iBinarySearch = i11;
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return zoneOffsetArr2[(iBinarySearch / 2) + 1];
        }
        LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
        LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
        int i12 = iBinarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr2[i12];
        ZoneOffset zoneOffset2 = zoneOffsetArr2[i12 + 1];
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new C15642b(localDateTime2, zoneOffset, zoneOffset2) : new C15642b(localDateTime3, zoneOffset, zoneOffset2);
    }

    /* JADX INFO: renamed from: a */
    private static Object m17200a(LocalDateTime localDateTime, C15642b c15642b) {
        LocalDateTime localDateTimeM17218o = c15642b.m17218o();
        if (c15642b.m17215A()) {
            if (localDateTime.m16834U(localDateTimeM17218o)) {
                return c15642b.m17221u();
            }
            return localDateTime.m16834U(c15642b.m17217m()) ? c15642b : c15642b.m17220r();
        }
        if (localDateTime.m16834U(localDateTimeM17218o)) {
            return localDateTime.m16834U(c15642b.m17217m()) ? c15642b.m17221u() : c15642b;
        }
        return c15642b.m17220r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private C15642b[] m17201b(int i10) {
        long j10;
        Integer numValueOf = Integer.valueOf(i10);
        ConcurrentHashMap concurrentHashMap = this.f48816h;
        C15642b[] c15642bArr = (C15642b[]) concurrentHashMap.get(numValueOf);
        if (c15642bArr != null) {
            return c15642bArr;
        }
        TimeZone timeZone = this.f48815g;
        if (timeZone == null) {
            C15645e[] c15645eArr = this.f48814f;
            C15642b[] c15642bArr2 = new C15642b[c15645eArr.length];
            for (int i11 = 0; i11 < c15645eArr.length; i11++) {
                c15642bArr2[i11] = c15645eArr[i11].m17224a(i10);
            }
            if (i10 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, c15642bArr2);
            }
            return c15642bArr2;
        }
        C15642b[] c15642bArr3 = f48808l;
        if (i10 < 1800) {
            return c15642bArr3;
        }
        long jM16962n = AbstractC15551g.m16962n(LocalDateTime.m16825V(i10 - 1), this.f48810b[0]);
        int offset = timeZone.getOffset(jM16962n * 1000);
        long j11 = 31968000 + jM16962n;
        while (jM16962n < j11) {
            long j12 = 7776000 + jM16962n;
            long j13 = jM16962n;
            if (offset != timeZone.getOffset(j12 * 1000)) {
                jM16962n = j13;
                while (j12 - jM16962n > 1) {
                    int i12 = offset;
                    long j14 = j11;
                    long jM16750n = AbstractC15529a.m16750n(j12 + jM16962n, 2L);
                    if (timeZone.getOffset(jM16750n * 1000) == i12) {
                        jM16962n = jM16750n;
                    } else {
                        j12 = jM16750n;
                    }
                    offset = i12;
                    j11 = j14;
                }
                j10 = j11;
                int i13 = offset;
                if (timeZone.getOffset(jM16962n * 1000) == i13) {
                    jM16962n = j12;
                }
                ZoneOffset zoneOffsetM17205i = m17205i(i13);
                offset = timeZone.getOffset(jM16962n * 1000);
                ZoneOffset zoneOffsetM17205i2 = m17205i(offset);
                if (m17202c(jM16962n, zoneOffsetM17205i2) == i10) {
                    c15642bArr3 = (C15642b[]) Arrays.copyOf(c15642bArr3, c15642bArr3.length + 1);
                    c15642bArr3[c15642bArr3.length - 1] = new C15642b(jM16962n, zoneOffsetM17205i, zoneOffsetM17205i2);
                }
            } else {
                j10 = j11;
                jM16962n = j12;
            }
            j11 = j10;
        }
        if (1916 <= i10 && i10 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, c15642bArr3);
        }
        return c15642bArr3;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m17209g(Instant instant) {
        ZoneOffset zoneOffsetM17205i;
        TimeZone timeZone = this.f48815g;
        if (timeZone != null) {
            zoneOffsetM17205i = m17205i(timeZone.getRawOffset());
        } else {
            int length = this.f48811c.length;
            ZoneOffset[] zoneOffsetArr = this.f48810b;
            if (length == 0) {
                zoneOffsetM17205i = zoneOffsetArr[0];
            } else {
                int iBinarySearch = Arrays.binarySearch(this.f48809a, instant.getEpochSecond());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                zoneOffsetM17205i = zoneOffsetArr[iBinarySearch + 1];
            }
        }
        return !zoneOffsetM17205i.equals(getOffset(instant));
    }

    /* JADX INFO: renamed from: c */
    private static int m17202c(long j10, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(AbstractC15529a.m16750n(j10 + ((long) zoneOffset.getTotalSeconds()), 86400)).getYear();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneRules)) {
            return false;
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        return Objects.equals(this.f48815g, zoneRules.f48815g) && Arrays.equals(this.f48809a, zoneRules.f48809a) && Arrays.equals(this.f48810b, zoneRules.f48810b) && Arrays.equals(this.f48811c, zoneRules.f48811c) && Arrays.equals(this.f48813e, zoneRules.f48813e) && Arrays.equals(this.f48814f, zoneRules.f48814f);
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f48815g) ^ Arrays.hashCode(this.f48809a)) ^ Arrays.hashCode(this.f48810b)) ^ Arrays.hashCode(this.f48811c)) ^ Arrays.hashCode(this.f48813e)) ^ Arrays.hashCode(this.f48814f);
    }

    public final String toString() {
        TimeZone timeZone = this.f48815g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        ZoneOffset[] zoneOffsetArr = this.f48810b;
        return "ZoneRules[currentStandardOffset=" + zoneOffsetArr[zoneOffsetArr.length - 1] + "]";
    }
}
