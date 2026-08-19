package p520V5;

import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import p1003s3.RunnableC19440a;
import p277L.CallableC4829b;

/* JADX INFO: renamed from: V5.C */
/* JADX INFO: loaded from: classes.dex */
public final class C7765C extends FutureTask {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24541Y = 0;

    /* JADX INFO: renamed from: Z */
    public Object f24542Z;

    public /* synthetic */ C7765C(Callable callable) {
        super(callable);
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.f24541Y) {
            case 0:
                try {
                    if (!isCancelled()) {
                        try {
                            ((C7766D) this.f24542Z).m8037f((C7764B) get());
                        } catch (InterruptedException | ExecutionException e10) {
                            ((C7766D) this.f24542Z).m8037f(new C7764B(e10));
                        }
                        break;
                    }
                    return;
                } finally {
                    this.f24542Z = null;
                }
            default:
                RunnableC19440a runnableC19440a = (RunnableC19440a) this.f24542Z;
                try {
                    Object obj = get();
                    if (runnableC19440a.f61644p0.get()) {
                        return;
                    }
                    runnableC19440a.m20517a(obj);
                    return;
                } catch (InterruptedException e11) {
                    AbstractC15256t.m16484v("AsyncTask", e11);
                    return;
                } catch (CancellationException unused) {
                    if (runnableC19440a.f61644p0.get()) {
                        return;
                    }
                    runnableC19440a.m20517a(null);
                    return;
                } catch (ExecutionException e12) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e12.getCause());
                } catch (Throwable th2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th2);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7765C(RunnableC19440a runnableC19440a, CallableC4829b callableC4829b) {
        super(callableC4829b);
        this.f24542Z = runnableC19440a;
    }
}
