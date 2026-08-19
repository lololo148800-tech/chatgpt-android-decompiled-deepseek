package p277L;

import android.os.Handler;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p003A1.C0284r0;
import p301M.ScheduledFutureC5230l;

/* JADX INFO: renamed from: L.d */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledExecutorServiceC4831d extends AbstractExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: Y */
    public final Handler f15729Y;

    static {
        new C0284r0(6);
    }

    public ScheduledExecutorServiceC4831d(Handler handler) {
        this.f15729Y = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC4831d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.f15729Y;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return schedule(new CallableC4829b(runnable, 0), j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC4831d.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC4831d.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC4831d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC4831d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        long jConvert = TimeUnit.MILLISECONDS.convert(j10, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.f15729Y;
        RunnableScheduledFutureC4830c runnableScheduledFutureC4830c = new RunnableScheduledFutureC4830c(handler, jConvert, callable);
        if (handler.postAtTime(runnableScheduledFutureC4830c, jConvert)) {
            return runnableScheduledFutureC4830c;
        }
        return new ScheduledFutureC5230l(new RejectedExecutionException(handler + " is shutting down"), 1);
    }
}
