package p849k7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: k7.j */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledExecutorServiceC16357j implements ScheduledExecutorService {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f50804Y;

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        switch (this.f50804Y) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f50804Y;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        switch (this.f50804Y) {
            case 0:
                return new ArrayList();
            default:
                return null;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        switch (this.f50804Y) {
        }
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f50804Y) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f50804Y) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        switch (this.f50804Y) {
            case 0:
                return new ScheduledFutureC16358k();
            default:
                return null;
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        switch (this.f50804Y) {
            case 0:
                return new ScheduledFutureC16358k();
            default:
                return null;
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        switch (this.f50804Y) {
            case 0:
                return new ScheduledFutureC16358k();
            default:
                return null;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        int i10 = this.f50804Y;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f50804Y) {
            case 0:
                return new ArrayList();
            default:
                return null;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        switch (this.f50804Y) {
        }
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        switch (this.f50804Y) {
            case 0:
                return new ArrayList();
            default:
                return null;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        switch (this.f50804Y) {
        }
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        switch (this.f50804Y) {
        }
        return null;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        switch (this.f50804Y) {
            case 0:
                return new ScheduledFutureC16358k();
            default:
                return null;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        switch (this.f50804Y) {
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final void m17958c() {
    }

    /* JADX INFO: renamed from: d */
    private final void m17959d() {
    }

    /* JADX INFO: renamed from: a */
    private final void m17956a(Runnable runnable) {
    }

    /* JADX INFO: renamed from: b */
    private final void m17957b(Runnable runnable) {
    }
}
