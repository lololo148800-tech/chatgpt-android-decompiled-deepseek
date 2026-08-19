package p127El;

import java.util.concurrent.Executor;
import p1012t.C19711a;

/* JADX INFO: renamed from: El.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ExecutorC2575a implements Executor {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8010Y;

    /* JADX INFO: renamed from: a */
    private final void m3607a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f8010Y) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                break;
            default:
                C19711a.m20661e().f62404a.f62406b.execute(runnable);
                break;
        }
    }
}
