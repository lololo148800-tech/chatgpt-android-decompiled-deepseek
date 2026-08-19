package p998rp;

import p523V9.AbstractC8178r0;
import sun.misc.Cleaner;

/* JADX INFO: renamed from: rp.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C19265d extends AbstractC19268g {

    /* JADX INFO: renamed from: r0 */
    public float[] f61068r0;

    public C19265d(long j10, boolean z6) {
        this.f61076Y = EnumC19278q.f61082Z;
        this.f61078o0 = 4L;
        if (j10 <= 0) {
            throw new IllegalArgumentException(j10 + " is not a positive long value");
        }
        this.f61077Z = j10;
        if (j10 <= 1073741824) {
            this.f61068r0 = new float[(int) j10];
            return;
        }
        this.f61080q0 = AbstractC19279r.f61085a.allocateMemory(4 * j10);
        if (z6) {
            m20342a(j10);
        }
        Cleaner.create(this, new RunnableC19267f(this.f61080q0, this.f61077Z, this.f61078o0));
        AbstractC8178r0.m8761b(this.f61077Z * this.f61078o0);
    }

    /* JADX INFO: renamed from: b */
    public final float m20340b(long j10) {
        long j11 = this.f61080q0;
        if (j11 != 0) {
            return AbstractC19279r.f61085a.getFloat((this.f61078o0 * j10) + j11);
        }
        boolean z6 = this.f61079p0;
        float[] fArr = this.f61068r0;
        return z6 ? fArr[0] : fArr[(int) j10];
    }

    /* JADX INFO: renamed from: c */
    public final void m20341c(float f10, long j10) {
        long j11 = this.f61080q0;
        if (j11 != 0) {
            AbstractC19279r.f61085a.putFloat((this.f61078o0 * j10) + j11, f10);
        } else {
            if (this.f61079p0) {
                throw new IllegalAccessError("Constant arrays cannot be modified.");
            }
            this.f61068r0[(int) j10] = f10;
        }
    }

    public final Object clone() {
        if (!this.f61079p0) {
            C19265d c19265d = new C19265d(this.f61077Z, false);
            AbstractC19279r.m20343a(0L, 0L, this.f61077Z, this, c19265d);
            return c19265d;
        }
        long j10 = this.f61077Z;
        float fM20340b = m20340b(0L);
        C19265d c19265d2 = new C19265d();
        c19265d2.f61076Y = EnumC19278q.f61082Z;
        c19265d2.f61078o0 = 4L;
        if (j10 > 0) {
            c19265d2.f61077Z = j10;
            c19265d2.f61079p0 = true;
            c19265d2.f61068r0 = new float[]{fM20340b};
            return c19265d2;
        }
        throw new IllegalArgumentException(j10 + " is not a positive long value");
    }

    @Override // p998rp.AbstractC19268g
    public final boolean equals(Object obj) {
        return super.equals(obj) && this.f61068r0 == ((C19265d) obj).f61068r0;
    }

    @Override // p998rp.AbstractC19268g
    public final int hashCode() {
        int iHashCode = super.hashCode() * 29;
        float[] fArr = this.f61068r0;
        return iHashCode + (fArr != null ? fArr.hashCode() : 0);
    }
}
