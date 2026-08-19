package p109E3;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;
import p050Bn.ChoreographerFrameCallbackC1452f;

/* JADX INFO: renamed from: E3.F */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC2265F implements Executor {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f6932Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f6933Z;

    public /* synthetic */ ExecutorC2265F(Object obj, int i10) {
        this.f6932Y = i10;
        this.f6933Z = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6932Y) {
            case 0:
                ((Handler) this.f6933Z).post(runnable);
                break;
            default:
                ((Choreographer) this.f6933Z).postFrameCallback(new ChoreographerFrameCallbackC1452f(runnable, 1));
                break;
        }
    }
}
