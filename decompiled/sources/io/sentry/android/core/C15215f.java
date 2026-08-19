package io.sentry.android.core;

import io.sentry.C15134J0;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15137K0;
import io.sentry.InterfaceC15159S;

/* JADX INFO: renamed from: io.sentry.android.core.f */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15215f implements InterfaceC15137K0 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47467Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ActivityLifecycleIntegration f47468Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC15159S f47469o0;

    public /* synthetic */ C15215f(ActivityLifecycleIntegration activityLifecycleIntegration, InterfaceC15159S interfaceC15159S, int i10) {
        this.f47467Y = i10;
        this.f47468Z = activityLifecycleIntegration;
        this.f47469o0 = interfaceC15159S;
    }

    /* JADX INFO: renamed from: a */
    private final void m16423a(C15134J0 c15134j0) {
        ActivityLifecycleIntegration activityLifecycleIntegration = this.f47468Z;
        InterfaceC15159S interfaceC15159S = this.f47469o0;
        activityLifecycleIntegration.getClass();
        synchronized (c15134j0.f47125m) {
            if (c15134j0.f47113a == interfaceC15159S) {
                c15134j0.m16304a();
            }
        }
    }

    @Override // io.sentry.InterfaceC15137K0
    /* JADX INFO: renamed from: f */
    public final void mo390f(C15134J0 c15134j0) {
        switch (this.f47467Y) {
            case 0:
                m16423a(c15134j0);
                return;
            default:
                ActivityLifecycleIntegration activityLifecycleIntegration = this.f47468Z;
                InterfaceC15159S interfaceC15159S = this.f47469o0;
                activityLifecycleIntegration.getClass();
                synchronized (c15134j0.f47125m) {
                    if (c15134j0.f47113a == null) {
                        c15134j0.m16307d(interfaceC15159S);
                    } else {
                        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f47276p0;
                        if (sentryAndroidOptions != null) {
                            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC15159S.getName());
                        }
                    }
                    break;
                }
                return;
        }
    }
}
