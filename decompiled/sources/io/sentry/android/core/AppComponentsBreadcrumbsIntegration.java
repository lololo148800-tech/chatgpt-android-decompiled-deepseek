package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.openai.chatgpt.app.MainApplication;
import io.sentry.C15109B;
import io.sentry.C15345d;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15171W;
import java.io.Closeable;
import p001A.RunnableC0097x0;
import p329N3.RunnableC5632v;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8483G3;

/* JADX INFO: loaded from: classes3.dex */
public final class AppComponentsBreadcrumbsIntegration implements InterfaceC15171W, Closeable, ComponentCallbacks2 {

    /* JADX INFO: renamed from: Y */
    public final Context f47297Y;

    /* JADX INFO: renamed from: Z */
    public C15109B f47298Z;

    /* JADX INFO: renamed from: o0 */
    public SentryAndroidOptions f47299o0;

    public AppComponentsBreadcrumbsIntegration(MainApplication mainApplication) {
        Context applicationContext = mainApplication.getApplicationContext();
        this.f47297Y = applicationContext != null ? applicationContext : mainApplication;
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        this.f47298Z = C15109B.f47017a;
        SentryAndroidOptions sentryAndroidOptions = c15524y1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c15524y1 : null;
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f47299o0 = sentryAndroidOptions;
        InterfaceC15127H logger = sentryAndroidOptions.getLogger();
        EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
        logger.mo16298o(enumC15375i1, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f47299o0.isEnableAppComponentBreadcrumbs()));
        if (this.f47299o0.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f47297Y.registerComponentCallbacks(this);
                c15524y1.getLogger().mo16298o(enumC15375i1, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                AbstractC8471E3.m9104b("AppComponentsBreadcrumbs");
            } catch (Throwable th2) {
                this.f47299o0.setEnableAppComponentBreadcrumbs(false);
                c15524y1.getLogger().mo16296g(EnumC15375i1.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16370a(long j10, Integer num) {
        if (this.f47298Z != null) {
            C15345d c15345d = new C15345d(j10);
            if (num != null) {
                if (num.intValue() < 40) {
                    return;
                } else {
                    c15345d.m16574b(num, "level");
                }
            }
            c15345d.f47907p0 = "system";
            c15345d.f47909r0 = "device.event";
            c15345d.f47906o0 = "Low memory";
            c15345d.m16574b("LOW_MEMORY", "action");
            c15345d.f47911t0 = EnumC15375i1.WARNING;
            this.f47298Z.mo16248l(c15345d);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f47297Y.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.f47299o0;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo16296g(EnumC15375i1.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f47299o0;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().mo16298o(EnumC15375i1.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16371e(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f47299o0;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th2) {
                this.f47299o0.getLogger().mo16296g(EnumC15375i1.ERROR, th2, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        m16371e(new RunnableC5632v(this, System.currentTimeMillis(), configuration));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        m16371e(new RunnableC0097x0(this, System.currentTimeMillis(), 4));
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        m16371e(new Runnable() { // from class: io.sentry.android.core.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f47635Y.m16370a(jCurrentTimeMillis, Integer.valueOf(i10));
            }
        });
    }
}
