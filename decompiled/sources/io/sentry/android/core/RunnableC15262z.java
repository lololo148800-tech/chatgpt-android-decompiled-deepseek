package io.sentry.android.core;

/* JADX INFO: renamed from: io.sentry.android.core.z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15262z implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47638Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AppLifecycleIntegration f47639Z;

    public /* synthetic */ RunnableC15262z(AppLifecycleIntegration appLifecycleIntegration, int i10) {
        this.f47638Y = i10;
        this.f47639Z = appLifecycleIntegration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47638Y) {
            case 0:
                this.f47639Z.m16373e();
                break;
            default:
                this.f47639Z.m16372a();
                break;
        }
    }
}
