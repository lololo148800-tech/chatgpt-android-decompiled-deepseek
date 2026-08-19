package fo;

import android.os.Handler;
import java.util.concurrent.Executor;
import p771go.AbstractC14204c;

/* JADX INFO: renamed from: fo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC13706c implements Executor {

    /* JADX INFO: renamed from: Y */
    public static final ExecutorC13706c f43253Y = new ExecutorC13706c();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (AbstractC13707d.f43255b == null) {
            throw new IllegalStateException("AppWatcher not installed");
        }
        ((Handler) AbstractC14204c.f44617a.getValue()).postDelayed(runnable, AbstractC13707d.f43254a);
    }
}
