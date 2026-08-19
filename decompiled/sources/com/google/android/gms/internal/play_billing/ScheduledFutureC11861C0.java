package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledFutureC11861C0 extends AbstractC11957g1 implements ScheduledFuture, InterfaceFutureC12028y0, Future {

    /* JADX INFO: renamed from: Z */
    public final AbstractC11984n0 f36113Z;

    /* JADX INFO: renamed from: o0 */
    public final ScheduledFuture f36114o0;

    public ScheduledFutureC11861C0(AbstractC11984n0 abstractC11984n0, ScheduledFuture scheduledFuture) {
        super(4);
        this.f36113Z = abstractC11984n0;
        this.f36114o0 = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC12028y0
    /* JADX INFO: renamed from: b */
    public final void mo13259b(Runnable runnable, Executor executor) {
        this.f36113Z.mo13259b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        boolean zCancel = this.f36113Z.cancel(z6);
        if (zCancel) {
            this.f36114o0.cancel(z6);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f36114o0.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f36113Z.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f36114o0.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f36113Z.f36304Y instanceof C11944d0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f36113Z.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f36113Z.get(j10, timeUnit);
    }
}
