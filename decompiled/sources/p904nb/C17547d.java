package p904nb;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p604Yk.C10077b;

/* JADX INFO: renamed from: nb.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17547d implements InterfaceC17550g {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56137Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ScheduledExecutorServiceC17549f f56138Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Runnable f56139o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ long f56140p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f56141q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ TimeUnit f56142r0;

    public /* synthetic */ C17547d(ScheduledExecutorServiceC17549f scheduledExecutorServiceC17549f, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f56137Y = i10;
        this.f56138Z = scheduledExecutorServiceC17549f;
        this.f56139o0 = runnable;
        this.f56140p0 = j10;
        this.f56141q0 = j11;
        this.f56142r0 = timeUnit;
    }

    @Override // p904nb.InterfaceC17550g
    /* JADX INFO: renamed from: b */
    public final ScheduledFuture mo14939b(C10077b c10077b) {
        switch (this.f56137Y) {
            case 0:
                ScheduledExecutorServiceC17549f scheduledExecutorServiceC17549f = this.f56138Z;
                scheduledExecutorServiceC17549f.getClass();
                return scheduledExecutorServiceC17549f.f56148Z.scheduleAtFixedRate(new RunnableC17548e(scheduledExecutorServiceC17549f, this.f56139o0, c10077b, 0), this.f56140p0, this.f56141q0, this.f56142r0);
            default:
                ScheduledExecutorServiceC17549f scheduledExecutorServiceC17549f2 = this.f56138Z;
                scheduledExecutorServiceC17549f2.getClass();
                return scheduledExecutorServiceC17549f2.f56148Z.scheduleWithFixedDelay(new RunnableC17548e(scheduledExecutorServiceC17549f2, this.f56139o0, c10077b, 2), this.f56140p0, this.f56141q0, this.f56142r0);
        }
    }
}
