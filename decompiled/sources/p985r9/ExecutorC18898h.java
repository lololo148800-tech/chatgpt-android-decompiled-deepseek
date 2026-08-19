package p985r9;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: r9.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC18898h implements Executor {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ ExecutorC18898h f60245Z = new ExecutorC18898h(0);

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ ExecutorC18898h f60246o0 = new ExecutorC18898h(1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f60247Y;

    public /* synthetic */ ExecutorC18898h(int i10) {
        this.f60247Y = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f60247Y) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
