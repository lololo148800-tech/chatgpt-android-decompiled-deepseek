package io.sentry.android.core.performance;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: io.sentry.android.core.performance.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15249b implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47601Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C15251d f47602Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Application f47603o0;

    public /* synthetic */ RunnableC15249b(C15251d c15251d, Application application, int i10) {
        this.f47601Y = i10;
        this.f47602Z = c15251d;
        this.f47603o0 = application;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47601Y) {
            case 0:
                C15251d c15251d = this.f47602Z;
                c15251d.getClass();
                new Handler(Looper.getMainLooper()).post(new RunnableC15249b(c15251d, this.f47603o0, 1));
                break;
            default:
                C15251d c15251d2 = this.f47602Z;
                Application application = this.f47603o0;
                if (c15251d2.f47613t0 == null) {
                    c15251d2.f47607Z = false;
                }
                application.unregisterActivityLifecycleCallbacks(C15251d.f47605x0);
                break;
        }
    }
}
