package p277L;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p310M9.C5311e;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: L.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableScheduledFutureC4830c implements RunnableScheduledFuture {

    /* JADX INFO: renamed from: Y */
    public final AtomicReference f15725Y = new AtomicReference(null);

    /* JADX INFO: renamed from: Z */
    public final long f15726Z;

    /* JADX INFO: renamed from: o0 */
    public final Callable f15727o0;

    /* JADX INFO: renamed from: p0 */
    public final C10145l f15728p0;

    public RunnableScheduledFutureC4830c(Handler handler, long j10, Callable callable) {
        this.f15726Z = j10;
        this.f15727o0 = callable;
        this.f15728p0 = AbstractC16347a.m17947b(new C5311e(this, handler, false, callable, 6));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f15728p0.cancel(z6);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f15728p0.f30070Z.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f15726Z - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15728p0.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15728p0.f30070Z.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        C10142i c10142i = (C10142i) this.f15725Y.getAndSet(null);
        if (c10142i != null) {
            try {
                c10142i.m10747a(this.f15727o0.call());
            } catch (Exception e10) {
                c10142i.m10748b(e10);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f15728p0.f30070Z.get(j10, timeUnit);
    }
}
