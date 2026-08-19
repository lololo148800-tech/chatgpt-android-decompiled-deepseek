package p084D4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: D4.f */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1912f implements Executor {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5594Y;

    /* JADX INFO: renamed from: Z */
    public final Handler f5595Z;

    public ExecutorC1912f(Handler handler) {
        this.f5594Y = 2;
        this.f5595Z = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5594Y) {
            case 0:
                this.f5595Z.post(runnable);
                return;
            case 1:
                this.f5595Z.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.f5595Z;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public ExecutorC1912f(int i10) {
        this.f5594Y = i10;
        switch (i10) {
            case 1:
                this.f5595Z = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f5595Z = new Handler(Looper.getMainLooper());
                break;
        }
    }
}
