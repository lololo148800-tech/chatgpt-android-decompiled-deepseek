package p200Hm;

import java.util.Iterator;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: Hm.h */
/* JADX INFO: loaded from: classes3.dex */
public class C3509h implements Iterable, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final long f10599Y;

    /* JADX INFO: renamed from: Z */
    public final long f10600Z;

    /* JADX INFO: renamed from: o0 */
    public final long f10601o0;

    public C3509h(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f10599Y = j10;
        if (j12 > 0) {
            if (j10 < j11) {
                long j13 = j11 % j12;
                long j14 = j10 % j12;
                long j15 = ((j13 < 0 ? j13 + j12 : j13) - (j14 < 0 ? j14 + j12 : j14)) % j12;
                j11 -= j15 < 0 ? j15 + j12 : j15;
            }
        } else {
            if (j12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j10 > j11) {
                long j16 = -j12;
                long j17 = j10 % j16;
                long j18 = j11 % j16;
                long j19 = ((j17 < 0 ? j17 + j16 : j17) - (j18 < 0 ? j18 + j16 : j18)) % j16;
                j11 += j19 < 0 ? j19 + j16 : j19;
            }
        }
        this.f10600Z = j11;
        this.f10601o0 = j12;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3509h) {
            if (!isEmpty() || !((C3509h) obj).isEmpty()) {
                C3509h c3509h = (C3509h) obj;
                if (this.f10599Y != c3509h.f10599Y || this.f10600Z != c3509h.f10600Z || this.f10601o0 != c3509h.f10601o0) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = 31;
        long j11 = this.f10599Y;
        long j12 = this.f10600Z;
        long j13 = (((j11 ^ (j11 >>> 32)) * j10) + (j12 ^ (j12 >>> 32))) * j10;
        long j14 = this.f10601o0;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    public boolean isEmpty() {
        long j10 = this.f10601o0;
        long j11 = this.f10600Z;
        long j12 = this.f10599Y;
        if (j10 > 0) {
            if (j12 <= j11) {
                return false;
            }
        } else if (j12 >= j11) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3510i(this.f10599Y, this.f10600Z, this.f10601o0);
    }

    public String toString() {
        StringBuilder sb2;
        long j10 = this.f10601o0;
        long j11 = this.f10600Z;
        long j12 = this.f10599Y;
        if (j10 > 0) {
            sb2 = new StringBuilder();
            sb2.append(j12);
            sb2.append("..");
            sb2.append(j11);
            sb2.append(" step ");
            sb2.append(j10);
        } else {
            sb2 = new StringBuilder();
            sb2.append(j12);
            sb2.append(" downTo ");
            sb2.append(j11);
            sb2.append(" step ");
            sb2.append(-j10);
        }
        return sb2.toString();
    }
}
