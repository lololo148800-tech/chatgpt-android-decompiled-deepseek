package p904nb;

import p604Yk.C10077b;

/* JADX INFO: renamed from: nb.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC17548e implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f56143Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ScheduledExecutorServiceC17549f f56144Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Runnable f56145o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C10077b f56146p0;

    public /* synthetic */ RunnableC17548e(ScheduledExecutorServiceC17549f scheduledExecutorServiceC17549f, Runnable runnable, C10077b c10077b, int i10) {
        this.f56143Y = i10;
        this.f56144Z = scheduledExecutorServiceC17549f;
        this.f56145o0 = runnable;
        this.f56146p0 = c10077b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f56143Y) {
            case 0:
                ScheduledExecutorServiceC17549f scheduledExecutorServiceC17549f = this.f56144Z;
                scheduledExecutorServiceC17549f.getClass();
                final C10077b c10077b = this.f56146p0;
                final Runnable runnable = this.f56145o0;
                final int i10 = 0;
                scheduledExecutorServiceC17549f.f56147Y.execute(new Runnable() { // from class: nb.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((ScheduledFutureC17551h) c10077b.f29833Z).mo10746l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((ScheduledFutureC17551h) c10077b.f29833Z).mo10746l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                ScheduledFutureC17551h scheduledFutureC17551h = (ScheduledFutureC17551h) c10077b.f29833Z;
                                try {
                                    runnable2.run();
                                    scheduledFutureC17551h.m10745k(null);
                                    return;
                                } catch (Exception e12) {
                                    scheduledFutureC17551h.mo10746l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ScheduledExecutorServiceC17549f scheduledExecutorServiceC17549f2 = this.f56144Z;
                scheduledExecutorServiceC17549f2.getClass();
                final C10077b c10077b2 = this.f56146p0;
                final Runnable runnable2 = this.f56145o0;
                final int i11 = 2;
                scheduledExecutorServiceC17549f2.f56147Y.execute(new Runnable() { // from class: nb.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((ScheduledFutureC17551h) c10077b2.f29833Z).mo10746l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((ScheduledFutureC17551h) c10077b2.f29833Z).mo10746l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                ScheduledFutureC17551h scheduledFutureC17551h = (ScheduledFutureC17551h) c10077b2.f29833Z;
                                try {
                                    runnable3.run();
                                    scheduledFutureC17551h.m10745k(null);
                                    return;
                                } catch (Exception e12) {
                                    scheduledFutureC17551h.mo10746l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ScheduledExecutorServiceC17549f scheduledExecutorServiceC17549f3 = this.f56144Z;
                scheduledExecutorServiceC17549f3.getClass();
                final C10077b c10077b3 = this.f56146p0;
                final Runnable runnable3 = this.f56145o0;
                final int i12 = 1;
                scheduledExecutorServiceC17549f3.f56147Y.execute(new Runnable() { // from class: nb.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((ScheduledFutureC17551h) c10077b3.f29833Z).mo10746l(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((ScheduledFutureC17551h) c10077b3.f29833Z).mo10746l(e11);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                ScheduledFutureC17551h scheduledFutureC17551h = (ScheduledFutureC17551h) c10077b3.f29833Z;
                                try {
                                    runnable4.run();
                                    scheduledFutureC17551h.m10745k(null);
                                    return;
                                } catch (Exception e12) {
                                    scheduledFutureC17551h.mo10746l(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
