package io.sentry.android.core;

import android.content.Context;
import com.auth0.android.request.internal.RunnableC11843b;
import com.openai.chatgpt.app.MainApplication;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15171W;
import java.io.Closeable;
import p544W9.AbstractC8471E3;

/* JADX INFO: loaded from: classes3.dex */
public final class AnrIntegration implements InterfaceC15171W, Closeable {

    /* JADX INFO: renamed from: q0 */
    public static C15208a f47287q0;

    /* JADX INFO: renamed from: r0 */
    public static final Object f47288r0 = new Object();

    /* JADX INFO: renamed from: Y */
    public final Context f47289Y;

    /* JADX INFO: renamed from: Z */
    public boolean f47290Z = false;

    /* JADX INFO: renamed from: o0 */
    public final Object f47291o0 = new Object();

    /* JADX INFO: renamed from: p0 */
    public C15524y1 f47292p0;

    public AnrIntegration(MainApplication mainApplication) {
        Context applicationContext = mainApplication.getApplicationContext();
        this.f47289Y = applicationContext != null ? applicationContext : mainApplication;
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        this.f47292p0 = c15524y1;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c15524y1;
        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            AbstractC8471E3.m9104b("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new RunnableC11843b(this, 11, sentryAndroidOptions));
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.DEBUG, "Failed to start AnrIntegration on executor thread.", th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16369a(SentryAndroidOptions sentryAndroidOptions) {
        int i10 = 0;
        synchronized (f47288r0) {
            try {
                if (f47287q0 == null) {
                    InterfaceC15127H logger = sentryAndroidOptions.getLogger();
                    EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
                    logger.mo16298o(enumC15375i1, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                    C15208a c15208a = new C15208a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C15254r(this, i10, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.f47289Y);
                    f47287q0 = c15208a;
                    c15208a.start();
                    sentryAndroidOptions.getLogger().mo16298o(enumC15375i1, "AnrIntegration installed.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f47291o0) {
            this.f47290Z = true;
        }
        synchronized (f47288r0) {
            try {
                C15208a c15208a = f47287q0;
                if (c15208a != null) {
                    c15208a.interrupt();
                    f47287q0 = null;
                    C15524y1 c15524y1 = this.f47292p0;
                    if (c15524y1 != null) {
                        c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
