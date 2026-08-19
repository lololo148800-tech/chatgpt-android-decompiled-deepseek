package kp;

import p998rp.C19265d;

/* JADX INFO: renamed from: kp.b */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC16647b implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f53339Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f53340Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f53341o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f53342p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C19265d f53343q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C19265d f53344r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ long f53345s0;

    public /* synthetic */ RunnableC16647b(long j10, long j11, long j12, C19265d c19265d, C19265d c19265d2, long j13, int i10) {
        this.f53339Y = i10;
        this.f53340Z = j10;
        this.f53341o0 = j11;
        this.f53342p0 = j12;
        this.f53343q0 = c19265d;
        this.f53344r0 = c19265d2;
        this.f53345s0 = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53339Y) {
            case 0:
                long j10 = this.f53340Z;
                long j11 = this.f53341o0;
                long j12 = j10 + j11;
                long j13 = this.f53342p0;
                while (j13 > 512) {
                    long j14 = j13 >> 2;
                    AbstractC16648c.m18482s(j14, j12 - j14, this.f53345s0 - (j13 >> 3), this.f53343q0, this.f53344r0);
                    j13 = j14;
                }
                AbstractC16648c.m18481r(j13, 1L, j12 - j13, this.f53345s0, this.f53343q0, this.f53344r0);
                long j15 = j10 - j13;
                long j16 = j11 - j13;
                long j17 = 0;
                for (long j18 = 0; j16 > j18; j18 = 0) {
                    long j19 = j17 + 1;
                    long j20 = this.f53345s0;
                    C19265d c19265d = this.f53344r0;
                    C19265d c19265d2 = this.f53343q0;
                    long j21 = j13;
                    AbstractC16648c.m18481r(j21, AbstractC16648c.m18456B(j13, j16, j19, this.f53340Z, j20, c19265d2, c19265d), j15 + j16, this.f53345s0, this.f53343q0, this.f53344r0);
                    j16 -= j13;
                    j17 = j19;
                }
                break;
            case 1:
                long j22 = this.f53340Z;
                long j23 = this.f53341o0;
                long j24 = j22 + j23;
                long j25 = 1;
                long j26 = this.f53342p0;
                long j27 = 1;
                while (j26 > 512) {
                    j26 >>= 2;
                    j27 <<= 2;
                    AbstractC16648c.m18484u(j26, j24 - j26, this.f53345s0 - j26, this.f53343q0, this.f53344r0);
                }
                AbstractC16648c.m18481r(j26, 0L, j24 - j26, this.f53345s0, this.f53343q0, this.f53344r0);
                long j28 = j27 >> 1;
                long j29 = j22 - j26;
                long j30 = j23 - j26;
                while (j30 > 0) {
                    j28 += j25;
                    long j31 = this.f53345s0;
                    C19265d c19265d3 = this.f53344r0;
                    C19265d c19265d4 = this.f53343q0;
                    long j32 = j26;
                    AbstractC16648c.m18481r(j32, AbstractC16648c.m18456B(j26, j30, j28, this.f53340Z, j31, c19265d4, c19265d3), j29 + j30, this.f53345s0, this.f53343q0, this.f53344r0);
                    j30 -= j26;
                    j25 = 1;
                }
                break;
            default:
                for (long j33 = this.f53340Z; j33 < this.f53341o0; j33++) {
                    this.f53343q0.m20341c(this.f53344r0.m20340b(this.f53345s0 + j33), this.f53342p0 + j33);
                }
                break;
        }
    }

    public RunnableC16647b(long j10, long j11, long j12, long j13, C19265d c19265d, C19265d c19265d2) {
        this.f53339Y = 2;
        this.f53340Z = j10;
        this.f53341o0 = j11;
        this.f53343q0 = c19265d;
        this.f53342p0 = j12;
        this.f53344r0 = c19265d2;
        this.f53345s0 = j13;
    }
}
