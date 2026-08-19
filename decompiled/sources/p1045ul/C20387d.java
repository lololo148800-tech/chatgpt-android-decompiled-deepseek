package p1045ul;

import ao.AbstractC11153a0;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p138F8.vJO.vRJidSveZHcTw;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: ul.d */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C20387d implements Comparable<C20387d> {
    public static final C20386c Companion = new C20386c();

    /* JADX INFO: renamed from: v0 */
    public static final KSerializer[] f64471v0 = {null, null, null, AbstractC11153a0.m12383f("io.ktor.util.date.WeekDay", EnumC20390g.values()), null, null, AbstractC11153a0.m12383f("io.ktor.util.date.Month", EnumC20389f.values()), null, null};

    /* JADX INFO: renamed from: Y */
    public final int f64472Y;

    /* JADX INFO: renamed from: Z */
    public final int f64473Z;

    /* JADX INFO: renamed from: o0 */
    public final int f64474o0;

    /* JADX INFO: renamed from: p0 */
    public final EnumC20390g f64475p0;

    /* JADX INFO: renamed from: q0 */
    public final int f64476q0;

    /* JADX INFO: renamed from: r0 */
    public final int f64477r0;

    /* JADX INFO: renamed from: s0 */
    public final EnumC20389f f64478s0;

    /* JADX INFO: renamed from: t0 */
    public final int f64479t0;

    /* JADX INFO: renamed from: u0 */
    public final long f64480u0;

    static {
        Calendar calendar = Calendar.getInstance(AbstractC20384a.f64469a, Locale.ROOT);
        AbstractC16544l.m18091d(calendar);
        AbstractC20384a.m21049c(calendar, 0L);
    }

    public /* synthetic */ C20387d(int i10, int i11, int i12, int i13, EnumC20390g enumC20390g, int i14, int i15, EnumC20389f enumC20389f, int i16, long j10) {
        if (511 != (i10 & 511)) {
            AbstractC11153a0.m12389l(i10, 511, C20385b.f64470a.getDescriptor());
            throw null;
        }
        this.f64472Y = i11;
        this.f64473Z = i12;
        this.f64474o0 = i13;
        this.f64475p0 = enumC20390g;
        this.f64476q0 = i14;
        this.f64477r0 = i15;
        this.f64478s0 = enumC20389f;
        this.f64479t0 = i16;
        this.f64480u0 = j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C20387d c20387d) {
        C20387d other = c20387d;
        AbstractC16544l.m18094g(other, "other");
        long j10 = this.f64480u0;
        long j11 = other.f64480u0;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20387d)) {
            return false;
        }
        C20387d c20387d = (C20387d) obj;
        return this.f64472Y == c20387d.f64472Y && this.f64473Z == c20387d.f64473Z && this.f64474o0 == c20387d.f64474o0 && this.f64475p0 == c20387d.f64475p0 && this.f64476q0 == c20387d.f64476q0 && this.f64477r0 == c20387d.f64477r0 && this.f64478s0 == c20387d.f64478s0 && this.f64479t0 == c20387d.f64479t0 && this.f64480u0 == c20387d.f64480u0;
    }

    public final int hashCode() {
        int iHashCode = (((this.f64478s0.hashCode() + ((((((this.f64475p0.hashCode() + (((((this.f64472Y * 31) + this.f64473Z) * 31) + this.f64474o0) * 31)) * 31) + this.f64476q0) * 31) + this.f64477r0) * 31)) * 31) + this.f64479t0) * 31;
        long j10 = this.f64480u0;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public C20387d(int i10, int i11, int i12, EnumC20390g dayOfWeek, int i13, int i14, EnumC20389f month, int i15, long j10) {
        AbstractC16544l.m18094g(dayOfWeek, "dayOfWeek");
        AbstractC16544l.m18094g(month, "month");
        this.f64472Y = i10;
        this.f64473Z = i11;
        this.f64474o0 = i12;
        this.f64475p0 = dayOfWeek;
        this.f64476q0 = i13;
        this.f64477r0 = i14;
        this.f64478s0 = month;
        this.f64479t0 = i15;
        this.f64480u0 = j10;
    }

    public final String toString() {
        return "GMTDate(seconds=" + this.f64472Y + ", minutes=" + this.f64473Z + ", hours=" + this.f64474o0 + vRJidSveZHcTw.VBGmjV + this.f64475p0 + ", dayOfMonth=" + this.f64476q0 + ", dayOfYear=" + this.f64477r0 + ", month=" + this.f64478s0 + ", year=" + this.f64479t0 + ", timestamp=" + this.f64480u0 + ')';
    }
}
