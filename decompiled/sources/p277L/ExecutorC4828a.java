package p277L;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: L.a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC4828a implements Executor {

    /* JADX INFO: renamed from: Z */
    public static volatile ExecutorC4828a f15721Z;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15722Y;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15722Y) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            default:
                new Thread(runnable).start();
                break;
        }
    }
}
