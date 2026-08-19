package p299Ln;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Ln.a */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC5216a implements Executor {

    /* JADX INFO: renamed from: Y */
    public static final ExecutorC5216a f16951Y = new ExecutorC5216a();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
