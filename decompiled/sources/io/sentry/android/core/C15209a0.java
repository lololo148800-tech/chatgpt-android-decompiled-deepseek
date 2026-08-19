package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;
import com.statsig.androidsdk.StatsigLoggerKt;
import io.sentry.C15109B;
import io.sentry.android.core.internal.util.C15232d;

/* JADX INFO: renamed from: io.sentry.android.core.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15209a0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final C15109B f47450a;

    /* JADX INFO: renamed from: b */
    public final SentryAndroidOptions f47451b;

    /* JADX INFO: renamed from: c */
    public final C15232d f47452c;

    public C15209a0(SentryAndroidOptions sentryAndroidOptions) {
        C15109B c15109b = C15109B.f47017a;
        this.f47452c = new C15232d(StatsigLoggerKt.FLUSH_TIMER_MS, 0);
        this.f47450a = c15109b;
        this.f47451b = sentryAndroidOptions;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("ZIS0uaHtP04hW4XX", new Object[]{this, context, intent});
    }
}
