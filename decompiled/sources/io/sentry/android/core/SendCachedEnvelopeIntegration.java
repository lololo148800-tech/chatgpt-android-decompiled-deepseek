package io.sentry.android.core;

import io.sentry.C15109B;
import io.sentry.C15524y1;
import io.sentry.EnumC15112C;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15115D;
import io.sentry.InterfaceC15118E;
import io.sentry.InterfaceC15143M0;
import io.sentry.InterfaceC15171W;
import io.sentry.util.C15498c;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A.C0031P0;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8483G3;

/* JADX INFO: loaded from: classes3.dex */
final class SendCachedEnvelopeIntegration implements InterfaceC15171W, InterfaceC15115D, Closeable {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC15143M0 f47385Y;

    /* JADX INFO: renamed from: Z */
    public final C15498c f47386Z;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC15118E f47388p0;

    /* JADX INFO: renamed from: q0 */
    public C15109B f47389q0;

    /* JADX INFO: renamed from: r0 */
    public SentryAndroidOptions f47390r0;

    /* JADX INFO: renamed from: s0 */
    public C0031P0 f47391s0;

    /* JADX INFO: renamed from: o0 */
    public final AtomicBoolean f47387o0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: t0 */
    public final AtomicBoolean f47392t0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u0 */
    public final AtomicBoolean f47393u0 = new AtomicBoolean(false);

    public SendCachedEnvelopeIntegration(InterfaceC15143M0 interfaceC15143M0, C15498c c15498c) {
        this.f47385Y = interfaceC15143M0;
        this.f47386Z = c15498c;
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        C15109B c15109b = C15109B.f47017a;
        this.f47389q0 = c15109b;
        SentryAndroidOptions sentryAndroidOptions = c15524y1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c15524y1 : null;
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f47390r0 = sentryAndroidOptions;
        if (!this.f47385Y.mo10198I(c15524y1.getCacheDirPath(), c15524y1.getLogger())) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            AbstractC8471E3.m9104b("SendCachedEnvelope");
            m16410a(c15109b, this.f47390r0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m16410a(C15109B c15109b, SentryAndroidOptions sentryAndroidOptions) {
        try {
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new RunnableC15201T(this, sentryAndroidOptions, c15109b, 0));
                if (((Boolean) this.f47386Z.m16684a()).booleanValue() && this.f47387o0.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e10);
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to call the executor. Cached events will not be sent", th3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47393u0.set(true);
        InterfaceC15118E interfaceC15118E = this.f47388p0;
        if (interfaceC15118E != null) {
            interfaceC15118E.mo12539G(this);
        }
    }

    @Override // io.sentry.InterfaceC15115D
    /* JADX INFO: renamed from: m */
    public final void mo16259m(EnumC15112C enumC15112C) {
        SentryAndroidOptions sentryAndroidOptions;
        C15109B c15109b = this.f47389q0;
        if (c15109b == null || (sentryAndroidOptions = this.f47390r0) == null) {
            return;
        }
        m16410a(c15109b, sentryAndroidOptions);
    }
}
