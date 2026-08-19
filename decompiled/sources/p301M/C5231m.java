package p301M;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p523V9.AbstractC8072d6;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: M.m */
/* JADX INFO: loaded from: classes.dex */
public class C5231m implements InterfaceFutureC13608b {

    /* JADX INFO: renamed from: o0 */
    public static final C5231m f16977o0 = new C5231m(null, 0);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16978Y;

    /* JADX INFO: renamed from: Z */
    public final Object f16979Z;

    public /* synthetic */ C5231m(Object obj, int i10) {
        this.f16978Y = i10;
        this.f16979Z = obj;
    }

    @Override // p747fb.InterfaceFutureC13608b
    /* JADX INFO: renamed from: a */
    public final void mo5766a(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            AbstractC8072d6.m8488e("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        switch (this.f16978Y) {
            case 0:
                return this.f16979Z;
            default:
                throw new ExecutionException((Throwable) this.f16979Z);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        switch (this.f16978Y) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + this.f16979Z + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.f16979Z) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
