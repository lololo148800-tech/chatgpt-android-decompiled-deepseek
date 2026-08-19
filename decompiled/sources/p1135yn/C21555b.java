package p1135yn;

import com.revenuecat.purchases.common.UtilsKt;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p200Hm.C3511j;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8136l6;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: yn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C21555b implements Comparable {

    /* JADX INFO: renamed from: Z */
    public static final C21554a f68260Z = new C21554a();

    /* JADX INFO: renamed from: o0 */
    public static final long f68261o0;

    /* JADX INFO: renamed from: p0 */
    public static final long f68262p0;

    /* JADX INFO: renamed from: Y */
    public final long f68263Y;

    static {
        int i10 = AbstractC21556c.f68264a;
        f68261o0 = AbstractC8128k6.m8637c(4611686018427387903L);
        f68262p0 = AbstractC8128k6.m8637c(-4611686018427387903L);
    }

    /* JADX INFO: renamed from: a */
    public static final long m21831a(long j10, long j11) {
        long j12 = UtilsKt.MICROS_MULTIPLIER;
        long j13 = j11 / j12;
        long j14 = j10 + j13;
        if (-4611686018426L > j14 || j14 >= 4611686018427L) {
            return AbstractC8128k6.m8637c(AbstractC8301I.m8922m(j14, -4611686018427387903L, 4611686018427387903L));
        }
        return AbstractC8128k6.m8639e((j14 * j12) + (j11 - (j13 * j12)));
    }

    /* JADX INFO: renamed from: b */
    public static final void m21832b(StringBuilder sb2, int i10, int i11, int i12, String str, boolean z6) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strM21686T = AbstractC21322p.m21686T(i12, String.valueOf(i11));
            int i13 = -1;
            int length = strM21686T.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strM21686T.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z6 || i15 >= 3) {
                sb2.append((CharSequence) strM21686T, 0, ((i13 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) strM21686T, 0, i15);
            }
        }
        sb2.append(str);
    }

    /* JADX INFO: renamed from: c */
    public static int m21833c(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i10 = (((int) j10) & 1) - (((int) j11) & 1);
            return j10 < 0 ? -i10 : i10;
        }
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m21834d(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: e */
    public static final long m21835e(long j10) {
        return ((((int) j10) & 1) != 1 || m21838h(j10)) ? m21841k(j10, EnumC21557d.MILLISECONDS) : j10 >> 1;
    }

    /* JADX INFO: renamed from: f */
    public static final int m21836f(long j10) {
        if (m21838h(j10)) {
            return 0;
        }
        return (int) ((((int) j10) & 1) == 1 ? ((j10 >> 1) % ((long) 1000)) * ((long) UtilsKt.MICROS_MULTIPLIER) : (j10 >> 1) % ((long) 1000000000));
    }

    /* JADX INFO: renamed from: g */
    public static int m21837g(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m21838h(long j10) {
        return j10 == f68261o0 || j10 == f68262p0;
    }

    /* JADX INFO: renamed from: i */
    public static final long m21839i(long j10, long j11) {
        if (m21838h(j10)) {
            if (!m21838h(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m21838h(j11)) {
            return j11;
        }
        int i10 = ((int) j10) & 1;
        if (i10 != (((int) j11) & 1)) {
            return i10 == 1 ? m21831a(j10 >> 1, j11 >> 1) : m21831a(j11 >> 1, j10 >> 1);
        }
        long j12 = (j10 >> 1) + (j11 >> 1);
        if (i10 == 0) {
            return (-4611686018426999999L > j12 || j12 >= 4611686018427000000L) ? AbstractC8128k6.m8637c(j12 / ((long) UtilsKt.MICROS_MULTIPLIER)) : AbstractC8128k6.m8639e(j12);
        }
        return AbstractC8128k6.m8638d(j12);
    }

    /* JADX INFO: renamed from: j */
    public static final long m21840j(int i10, long j10) {
        if (m21838h(j10)) {
            if (i10 != 0) {
                return i10 > 0 ? j10 : m21843m(j10);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i10 == 0) {
            return 0L;
        }
        long j11 = j10 >> 1;
        long j12 = i10;
        long j13 = j11 * j12;
        boolean z6 = (((int) j10) & 1) == 0;
        long j14 = f68262p0;
        long j15 = f68261o0;
        if (z6) {
            if (-2147483647L <= j11 && j11 < 2147483648L) {
                return AbstractC8128k6.m8639e(j13);
            }
            if (j13 / j12 == j11) {
                return (-4611686018426999999L > j13 || j13 >= 4611686018427000000L) ? AbstractC8128k6.m8637c(j13 / ((long) UtilsKt.MICROS_MULTIPLIER)) : AbstractC8128k6.m8639e(j13);
            }
            long j16 = UtilsKt.MICROS_MULTIPLIER;
            long j17 = j11 / j16;
            long j18 = j17 * j12;
            long j19 = (((j11 - (j17 * j16)) * j12) / j16) + j18;
            if (j18 / j12 == j17 && (j19 ^ j18) >= 0) {
                return AbstractC8128k6.m8637c(AbstractC8301I.m8923n(j19, new C3511j(-4611686018427387903L, 4611686018427387903L)));
            }
            if (Integer.signum(i10) * Long.signum(j11) <= 0) {
                return j14;
            }
        } else {
            if (j13 / j12 == j11) {
                return AbstractC8128k6.m8637c(AbstractC8301I.m8923n(j13, new C3511j(-4611686018427387903L, 4611686018427387903L)));
            }
            if (Integer.signum(i10) * Long.signum(j11) <= 0) {
                return j14;
            }
        }
        return j15;
    }

    /* JADX INFO: renamed from: k */
    public static final long m21841k(long j10, EnumC21557d unit) {
        AbstractC16544l.m18094g(unit, "unit");
        if (j10 == f68261o0) {
            return Long.MAX_VALUE;
        }
        if (j10 == f68262p0) {
            return Long.MIN_VALUE;
        }
        return AbstractC8136l6.m8663d(j10 >> 1, (((int) j10) & 1) == 0 ? EnumC21557d.NANOSECONDS : EnumC21557d.MILLISECONDS, unit);
    }

    /* JADX INFO: renamed from: l */
    public static String m21842l(long j10) {
        int i10;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f68261o0) {
            return "Infinity";
        }
        if (j10 == f68262p0) {
            return "-Infinity";
        }
        boolean z6 = j10 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z6) {
            sb2.append('-');
        }
        long jM21843m = j10 < 0 ? m21843m(j10) : j10;
        long jM21841k = m21841k(jM21843m, EnumC21557d.DAYS);
        int iM21841k = m21838h(jM21843m) ? 0 : (int) (m21841k(jM21843m, EnumC21557d.HOURS) % ((long) 24));
        int iM21841k2 = m21838h(jM21843m) ? 0 : (int) (m21841k(jM21843m, EnumC21557d.MINUTES) % ((long) 60));
        int iM21841k3 = m21838h(jM21843m) ? 0 : (int) (m21841k(jM21843m, EnumC21557d.SECONDS) % ((long) 60));
        int iM21836f = m21836f(jM21843m);
        boolean z10 = jM21841k != 0;
        boolean z11 = iM21841k != 0;
        boolean z12 = iM21841k2 != 0;
        boolean z13 = (iM21841k3 == 0 && iM21836f == 0) ? false : true;
        if (z10) {
            sb2.append(jM21841k);
            sb2.append('d');
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM21841k);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iM21841k2);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iM21841k3 != 0 || z10 || z11 || z12) {
                m21832b(sb2, iM21841k3, iM21836f, 9, "s", false);
            } else if (iM21836f >= 1000000) {
                m21832b(sb2, iM21836f / UtilsKt.MICROS_MULTIPLIER, iM21836f % UtilsKt.MICROS_MULTIPLIER, 6, "ms", false);
            } else if (iM21836f >= 1000) {
                m21832b(sb2, iM21836f / 1000, iM21836f % 1000, 3, "us", false);
            } else {
                sb2.append(iM21836f);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (z6 && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: m */
    public static final long m21843m(long j10) {
        long j11 = ((-(j10 >> 1)) << 1) + ((long) (((int) j10) & 1));
        int i10 = AbstractC21556c.f68264a;
        return j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m21833c(this.f68263Y, ((C21555b) obj).f68263Y);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21555b) {
            return this.f68263Y == ((C21555b) obj).f68263Y;
        }
        return false;
    }

    public final int hashCode() {
        return m21837g(this.f68263Y);
    }

    public final String toString() {
        return m21842l(this.f68263Y);
    }
}
