package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11867E0 extends C11858B0 implements InterfaceScheduledExecutorServiceC11854A0 {

    /* JADX INFO: renamed from: Z */
    public final ScheduledExecutorService f36123Z;

    public C11867E0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f36123Z = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        RunnableFutureC11882J0 runnableFutureC11882J0 = new RunnableFutureC11882J0(Executors.callable(runnable, null));
        return new ScheduledFutureC11861C0(runnableFutureC11882J0, this.f36123Z.schedule(runnableFutureC11882J0, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        RunnableC11864D0 runnableC11864D0 = new RunnableC11864D0(runnable);
        return new ScheduledFutureC11861C0(runnableC11864D0, this.f36123Z.scheduleAtFixedRate(runnableC11864D0, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        RunnableC11864D0 runnableC11864D0 = new RunnableC11864D0(runnable);
        return new ScheduledFutureC11861C0(runnableC11864D0, this.f36123Z.scheduleWithFixedDelay(runnableC11864D0, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        RunnableFutureC11882J0 runnableFutureC11882J0 = new RunnableFutureC11882J0(callable);
        return new ScheduledFutureC11861C0(runnableFutureC11882J0, this.f36123Z.schedule(runnableFutureC11882J0, j10, timeUnit));
    }
}
