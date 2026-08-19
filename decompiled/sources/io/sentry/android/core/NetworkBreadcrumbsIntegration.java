package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import com.openai.chatgpt.app.MainApplication;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15171W;
import java.io.Closeable;
import p544W9.AbstractC8483G3;
import p741f5.RunnableC13542a;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkBreadcrumbsIntegration implements InterfaceC15171W, Closeable {

    /* JADX INFO: renamed from: Y */
    public final Context f47358Y;

    /* JADX INFO: renamed from: Z */
    public final C15184B f47359Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC15127H f47360o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f47361p0 = new Object();

    /* JADX INFO: renamed from: q0 */
    public volatile boolean f47362q0;

    /* JADX INFO: renamed from: r0 */
    public C15524y1 f47363r0;

    /* JADX INFO: renamed from: s0 */
    public volatile C15197O f47364s0;

    public NetworkBreadcrumbsIntegration(MainApplication mainApplication, C15184B c15184b, InterfaceC15127H interfaceC15127H) {
        Context applicationContext = mainApplication.getApplicationContext();
        this.f47358Y = applicationContext != null ? applicationContext : mainApplication;
        this.f47359Z = c15184b;
        AbstractC8483G3.m9133c(interfaceC15127H, "ILogger is required");
        this.f47360o0 = interfaceC15127H;
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        SentryAndroidOptions sentryAndroidOptions = c15524y1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c15524y1 : null;
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
        Object[] objArr = {Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs())};
        InterfaceC15127H interfaceC15127H = this.f47360o0;
        interfaceC15127H.mo16298o(enumC15375i1, "NetworkBreadcrumbsIntegration enabled: %s", objArr);
        this.f47363r0 = c15524y1;
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            this.f47359Z.getClass();
            if (Build.VERSION.SDK_INT < 24) {
                interfaceC15127H.mo16298o(enumC15375i1, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            try {
                c15524y1.getExecutorService().submit(new RunnableC15195M(this, 0, c15524y1));
            } catch (Throwable th2) {
                interfaceC15127H.mo16297h(EnumC15375i1.ERROR, "Error submitting NetworkBreadcrumbsIntegration task.", th2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47362q0 = true;
        try {
            C15524y1 c15524y1 = this.f47363r0;
            AbstractC8483G3.m9133c(c15524y1, "Options is required");
            c15524y1.getExecutorService().submit(new RunnableC13542a(this, 7));
        } catch (Throwable th2) {
            this.f47360o0.mo16297h(EnumC15375i1.ERROR, "Error submitting NetworkBreadcrumbsIntegration task.", th2);
        }
    }
}
