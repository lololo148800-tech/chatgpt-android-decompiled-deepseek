package io.sentry.android.core;

import io.sentry.InterfaceC15154Q;

/* JADX INFO: renamed from: io.sentry.android.core.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15214e implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47463Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ActivityLifecycleIntegration f47464Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC15154Q f47465o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC15154Q f47466p0;

    public /* synthetic */ RunnableC15214e(ActivityLifecycleIntegration activityLifecycleIntegration, InterfaceC15154Q interfaceC15154Q, InterfaceC15154Q interfaceC15154Q2, int i10) {
        this.f47463Y = i10;
        this.f47464Z = activityLifecycleIntegration;
        this.f47465o0 = interfaceC15154Q;
        this.f47466p0 = interfaceC15154Q2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47463Y) {
            case 0:
                this.f47464Z.m16364P(this.f47465o0, this.f47466p0);
                break;
            case 1:
                this.f47464Z.m16364P(this.f47465o0, this.f47466p0);
                break;
            default:
                this.f47464Z.getClass();
                ActivityLifecycleIntegration.m16362e(this.f47465o0, this.f47466p0);
                break;
        }
    }
}
