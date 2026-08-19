package p998rp;

import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p413Qo.AbstractC6765c;

/* JADX INFO: renamed from: rp.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC19268g implements Serializable, Cloneable {

    /* JADX INFO: renamed from: Y */
    public EnumC19278q f61076Y;

    /* JADX INFO: renamed from: Z */
    public long f61077Z;

    /* JADX INFO: renamed from: o0 */
    public long f61078o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f61079p0 = false;

    /* JADX INFO: renamed from: q0 */
    public long f61080q0 = 0;

    /* JADX INFO: renamed from: a */
    public final void m20342a(long j10) {
        if (this.f61080q0 != 0) {
            int iM7197e = (int) AbstractC6765c.m7197e(j10, AbstractC19264c.m20337b());
            if (iM7197e <= 2 || j10 < AbstractC19264c.m20336a()) {
                AbstractC19279r.f61085a.setMemory(this.f61080q0, j10 * this.f61078o0, (byte) 0);
                return;
            }
            long j11 = j10 / ((long) iM7197e);
            Future[] futureArr = new Future[iM7197e];
            long j12 = this.f61080q0;
            int i10 = 0;
            while (i10 < iM7197e) {
                long j13 = ((long) i10) * j11;
                futureArr[i10] = AbstractC19264c.m20338c(new RunnableC19266e(this, j13, i10 == iM7197e + (-1) ? j10 : j13 + j11, j12));
                i10++;
            }
            try {
                AbstractC19264c.m20339d(futureArr);
            } catch (InterruptedException unused) {
                AbstractC19279r.f61085a.setMemory(this.f61080q0, j10 * this.f61078o0, (byte) 0);
            } catch (ExecutionException unused2) {
                AbstractC19279r.f61085a.setMemory(this.f61080q0, this.f61078o0 * j10, (byte) 0);
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AbstractC19268g)) {
            return false;
        }
        AbstractC19268g abstractC19268g = (AbstractC19268g) obj;
        return this.f61076Y == abstractC19268g.f61076Y && this.f61077Z == abstractC19268g.f61077Z && this.f61078o0 == abstractC19268g.f61078o0 && this.f61079p0 == abstractC19268g.f61079p0 && this.f61080q0 == abstractC19268g.f61080q0;
    }

    public int hashCode() {
        EnumC19278q enumC19278q = this.f61076Y;
        int iHashCode = enumC19278q != null ? enumC19278q.hashCode() : 0;
        long j10 = this.f61077Z;
        int i10 = (((203 + iHashCode) * 29) + ((int) (j10 ^ (j10 >>> 32)))) * 29;
        long j11 = this.f61078o0;
        int i11 = (((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 29) + (this.f61079p0 ? 1 : 0)) * 841;
        long j12 = this.f61080q0;
        return i11 + ((int) (j12 ^ (j12 >>> 32)));
    }
}
