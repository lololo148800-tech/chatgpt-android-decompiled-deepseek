package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15171W;
import java.io.Closeable;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8483G3;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLifecycleIntegration implements InterfaceC15171W, Closeable {

    /* JADX INFO: renamed from: Y */
    public volatile C15193K f47300Y;

    /* JADX INFO: renamed from: Z */
    public SentryAndroidOptions f47301Z;

    /* JADX INFO: renamed from: o0 */
    public final C15184B f47302o0 = new C15184B();

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        SentryAndroidOptions sentryAndroidOptions = c15524y1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c15524y1 : null;
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f47301Z = sentryAndroidOptions;
        InterfaceC15127H logger = sentryAndroidOptions.getLogger();
        EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
        logger.mo16298o(enumC15375i1, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f47301Z.isEnableAutoSessionTracking()));
        this.f47301Z.getLogger().mo16298o(enumC15375i1, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f47301Z.isEnableAppLifecycleBreadcrumbs()));
        if (this.f47301Z.isEnableAutoSessionTracking() || this.f47301Z.isEnableAppLifecycleBreadcrumbs()) {
            try {
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f33399u0;
                if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                    m16372a();
                } else {
                    ((Handler) this.f47302o0.f47305a).post(new RunnableC15262z(this, 1));
                }
            } catch (ClassNotFoundException e10) {
                c15524y1.getLogger().mo16297h(EnumC15375i1.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", e10);
            } catch (IllegalStateException e11) {
                c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "AppLifecycleIntegration could not be installed", e11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16372a() {
        SentryAndroidOptions sentryAndroidOptions = this.f47301Z;
        if (sentryAndroidOptions == null) {
            return;
        }
        this.f47300Y = new C15193K(sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.f47301Z.isEnableAutoSessionTracking(), this.f47301Z.isEnableAppLifecycleBreadcrumbs());
        try {
            ProcessLifecycleOwner.f33399u0.f33405r0.mo7806a(this.f47300Y);
            this.f47301Z.getLogger().mo16298o(EnumC15375i1.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
            AbstractC8471E3.m9104b("AppLifecycle");
        } catch (Throwable th2) {
            this.f47300Y = null;
            this.f47301Z.getLogger().mo16297h(EnumC15375i1.ERROR, "AppLifecycleIntegration failed to get Lifecycle and could not be installed.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f47300Y == null) {
            return;
        }
        if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
            m16373e();
            return;
        }
        C15184B c15184b = this.f47302o0;
        ((Handler) c15184b.f47305a).post(new RunnableC15262z(this, 0));
    }

    /* JADX INFO: renamed from: e */
    public final void m16373e() {
        C15193K c15193k = this.f47300Y;
        if (c15193k != null) {
            ProcessLifecycleOwner.f33399u0.f33405r0.mo7808c(c15193k);
            SentryAndroidOptions sentryAndroidOptions = this.f47301Z;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
        this.f47300Y = null;
    }
}
