package p998rp;

import p523V9.AbstractC8178r0;

/* JADX INFO: renamed from: rp.f */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC19267f implements Runnable {

    /* JADX INFO: renamed from: Y */
    public long f61073Y;

    /* JADX INFO: renamed from: Z */
    public final long f61074Z;

    /* JADX INFO: renamed from: o0 */
    public final long f61075o0;

    public RunnableC19267f(long j10, long j11, long j12) {
        this.f61073Y = j10;
        this.f61074Z = j11;
        this.f61075o0 = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10 = this.f61073Y;
        if (j10 != 0) {
            AbstractC19279r.f61085a.freeMemory(j10);
            this.f61073Y = 0L;
            AbstractC8178r0.m8760a(this.f61074Z * this.f61075o0);
        }
    }
}
