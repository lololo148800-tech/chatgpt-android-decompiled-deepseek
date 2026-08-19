package p998rp;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import jp.RunnableC16278c;
import p413Qo.AbstractC6765c;
import p523V9.AbstractC8178r0;
import sun.misc.Cleaner;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: rp.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C19280s extends AbstractC19268g {

    /* JADX INFO: renamed from: r0 */
    public long[] f61086r0;

    public C19280s(long j10, boolean z6) {
        this.f61076Y = EnumC19278q.f61081Y;
        this.f61078o0 = 8L;
        if (j10 <= 0) {
            throw new IllegalArgumentException(j10 + " is not a positive long value");
        }
        this.f61077Z = j10;
        if (j10 <= 1073741824) {
            this.f61086r0 = new long[(int) j10];
            return;
        }
        this.f61080q0 = AbstractC19279r.f61085a.allocateMemory(8 * j10);
        if (z6) {
            m20342a(j10);
        }
        Cleaner.create(this, new RunnableC19267f(this.f61080q0, this.f61077Z, this.f61078o0));
        AbstractC8178r0.m8761b(this.f61077Z * this.f61078o0);
    }

    /* JADX INFO: renamed from: b */
    public final long m20344b(long j10) {
        long j11 = this.f61080q0;
        if (j11 != 0) {
            return AbstractC19279r.f61085a.getLong((this.f61078o0 * j10) + j11);
        }
        boolean z6 = this.f61079p0;
        long[] jArr = this.f61086r0;
        return z6 ? jArr[0] : jArr[(int) j10];
    }

    /* JADX INFO: renamed from: c */
    public final void m20345c(long j10, long j11) {
        long j12 = this.f61080q0;
        if (j12 != 0) {
            AbstractC19279r.f61085a.putLong((this.f61078o0 * j10) + j12, j11);
        } else {
            if (this.f61079p0) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.f61086r0[(int) j10] = j11;
        }
    }

    public final Object clone() {
        long j10 = 0;
        if (this.f61079p0) {
            long j11 = this.f61077Z;
            long jM20344b = m20344b(0L);
            C19280s c19280s = new C19280s();
            c19280s.f61076Y = EnumC19278q.f61083o0;
            c19280s.f61078o0 = 8L;
            if (j11 > 0) {
                c19280s.f61077Z = j11;
                c19280s.f61079p0 = true;
                c19280s.f61086r0 = new long[]{jM20344b};
                return c19280s;
            }
            throw new IllegalArgumentException(j11 + " is not a positive long value");
        }
        C19280s c19280s2 = new C19280s(this.f61077Z, false);
        long j12 = this.f61077Z;
        Unsafe unsafe = AbstractC19279r.f61085a;
        if (0 >= j12) {
            throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
        }
        if (0 >= c19280s2.f61077Z) {
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        if (j12 < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        if (c19280s2.f61079p0) {
            throw new IllegalArgumentException("Constant arrays cannot be modified.");
        }
        int iM7197e = (int) AbstractC6765c.m7197e(j12, AbstractC19264c.f61066c);
        if (iM7197e < 2 || j12 < AbstractC19264c.f61067d) {
            long j13 = 0;
            while (j10 < j12) {
                c19280s2.m20345c(j13, m20344b(j10));
                j10++;
                j13++;
            }
        } else {
            long j14 = j12 / ((long) iM7197e);
            Future[] futureArr = new Future[iM7197e];
            int i10 = 0;
            while (i10 < iM7197e) {
                long j15 = ((long) i10) * j14;
                int i11 = i10;
                Future[] futureArr2 = futureArr;
                futureArr2[i11] = AbstractC19264c.m20338c(new RunnableC16278c(j15, i10 == iM7197e + (-1) ? j12 : j15 + j14, c19280s2, this));
                i10 = i11 + 1;
                futureArr = futureArr2;
            }
            try {
                AbstractC19264c.m20339d(futureArr);
            } catch (InterruptedException unused) {
                long j16 = 0;
                while (j10 < j12) {
                    c19280s2.m20345c(j16, m20344b(j10));
                    j10++;
                    j16++;
                }
            } catch (ExecutionException unused2) {
                long j17 = 0;
                while (j10 < j12) {
                    c19280s2.m20345c(j17, m20344b(j10));
                    j10++;
                    j17++;
                }
            }
        }
        return c19280s2;
    }

    @Override // p998rp.AbstractC19268g
    public final boolean equals(Object obj) {
        return super.equals(obj) && this.f61086r0 == ((C19280s) obj).f61086r0;
    }

    @Override // p998rp.AbstractC19268g
    public final int hashCode() {
        int iHashCode = super.hashCode() * 29;
        long[] jArr = this.f61086r0;
        return iHashCode + (jArr != null ? jArr.hashCode() : 0);
    }
}
