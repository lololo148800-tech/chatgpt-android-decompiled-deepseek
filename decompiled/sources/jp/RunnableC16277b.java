package jp;

import p998rp.C19265d;

/* JADX INFO: renamed from: jp.b */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC16277b implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ long f50411Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f50412Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f50413o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C19265d f50414p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C19265d f50415q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C16279d f50416r0;

    public RunnableC16277b(C16279d c16279d, long j10, long j11, long j12, C19265d c19265d, C19265d c19265d2) {
        this.f50416r0 = c16279d;
        this.f50411Y = j10;
        this.f50412Z = j11;
        this.f50413o0 = j12;
        this.f50414p0 = c19265d;
        this.f50415q0 = c19265d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (long j10 = this.f50411Y; j10 < this.f50412Z; j10++) {
            long j11 = 2 * j10;
            long j12 = j11 + 1;
            long j13 = this.f50413o0 + j10;
            C19265d c19265d = this.f50415q0;
            float fM20340b = c19265d.m20340b(j13);
            C16279d c16279d = this.f50416r0;
            float fM20340b2 = c16279d.f50440r.m20340b(j11) * fM20340b;
            C19265d c19265d2 = this.f50414p0;
            c19265d2.m20341c(fM20340b2, j11);
            c19265d2.m20341c(c16279d.f50440r.m20340b(j12) * (-c19265d.m20340b(j13)), j12);
        }
    }
}
