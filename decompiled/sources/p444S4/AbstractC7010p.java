package p444S4;

import android.content.Context;
import androidx.work.WorkerParameters;
import p548Wd.p549VF.zakks;
import p697d5.C13027j;
import p747fb.InterfaceFutureC13608b;

/* JADX INFO: renamed from: S4.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7010p {

    /* JADX INFO: renamed from: Y */
    public final Context f22416Y;

    /* JADX INFO: renamed from: Z */
    public final WorkerParameters f22417Z;

    /* JADX INFO: renamed from: o0 */
    public volatile int f22418o0 = -256;

    /* JADX INFO: renamed from: p0 */
    public boolean f22419p0;

    /* JADX INFO: renamed from: a */
    public InterfaceFutureC13608b mo7404a() {
        C13027j c13027j = new C13027j();
        c13027j.m14770l(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c13027j;
    }

    /* JADX INFO: renamed from: d */
    public abstract C13027j mo7406d();

    /* JADX INFO: renamed from: e */
    public final void m7407e(int i10) {
        this.f22418o0 = i10;
        mo7405c();
    }

    public AbstractC7010p(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.f22416Y = context;
                this.f22417Z = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException(zakks.XTzm);
    }

    /* JADX INFO: renamed from: c */
    public void mo7405c() {
    }
}
