package p746fa;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p377P9.HandlerC6378d;

/* JADX INFO: renamed from: fa.n */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC13605n implements Executor {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42980Y;

    /* JADX INFO: renamed from: Z */
    public final Handler f42981Z;

    public /* synthetic */ ExecutorC13605n(Handler handler, int i10) {
        this.f42980Y = i10;
        this.f42981Z = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f42980Y) {
            case 0:
                ((HandlerC6378d) this.f42981Z).post(runnable);
                return;
            case 1:
                ((HandlerC6378d) this.f42981Z).post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.f42981Z;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public ExecutorC13605n() {
        this.f42980Y = 0;
        HandlerC6378d handlerC6378d = new HandlerC6378d(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f42981Z = handlerC6378d;
    }
}
