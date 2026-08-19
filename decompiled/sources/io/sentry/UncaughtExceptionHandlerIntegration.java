package io.sentry;

import android.gov.nist.core.Separators;
import io.sentry.exception.C15351a;
import io.sentry.hints.EnumC15366e;
import io.sentry.protocol.C15437j;
import io.sentry.protocol.C15447t;
import java.io.Closeable;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8471E3;

/* JADX INFO: loaded from: classes3.dex */
public final class UncaughtExceptionHandlerIntegration implements InterfaceC15171W, Thread.UncaughtExceptionHandler, Closeable {

    /* JADX INFO: renamed from: Y */
    public Thread.UncaughtExceptionHandler f47228Y;

    /* JADX INFO: renamed from: Z */
    public C15109B f47229Z;

    /* JADX INFO: renamed from: o0 */
    public C15524y1 f47230o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f47231p0 = false;

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        C15109B c15109b = C15109B.f47017a;
        if (this.f47231p0) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f47231p0 = true;
        this.f47229Z = c15109b;
        this.f47230o0 = c15524y1;
        InterfaceC15127H logger = c15524y1.getLogger();
        EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
        logger.mo16298o(enumC15375i1, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f47230o0.isEnableUncaughtExceptionHandler()));
        if (this.f47230o0.isEnableUncaughtExceptionHandler()) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                this.f47230o0.getLogger().mo16298o(enumC15375i1, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + Separators.QUOTE, new Object[0]);
                if (defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
                    this.f47228Y = ((UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).f47228Y;
                } else {
                    this.f47228Y = defaultUncaughtExceptionHandler;
                }
            }
            Thread.setDefaultUncaughtExceptionHandler(this);
            this.f47230o0.getLogger().mo16298o(enumC15375i1, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
            AbstractC8471E3.m9104b("UncaughtExceptionHandler");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this == Thread.getDefaultUncaughtExceptionHandler()) {
            Thread.setDefaultUncaughtExceptionHandler(this.f47228Y);
            C15524y1 c15524y1 = this.f47230o0;
            if (c15524y1 != null) {
                c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        C15447t c15447t;
        C15524y1 c15524y1 = this.f47230o0;
        if (c15524y1 == null || this.f47229Z == null) {
            return;
        }
        c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "Uncaught exception received.", new Object[0]);
        try {
            C15170V1 c15170v1 = new C15170V1(this.f47230o0.getFlushTimeoutMillis(), this.f47230o0.getLogger());
            C15437j c15437j = new C15437j();
            c15437j.f48160p0 = Boolean.FALSE;
            c15437j.f48157Y = "UncaughtExceptionHandler";
            C15347d1 c15347d1 = new C15347d1(new C15351a(c15437j, th2, thread, false));
            c15347d1.f47919G0 = EnumC15375i1.FATAL;
            if (this.f47229Z.mo16256y() == null && (c15447t = c15347d1.f47194Y) != null) {
                c15170v1.mo16358g(c15447t);
            }
            C15516w c15516wM9087a = AbstractC8465D3.m9087a(c15170v1);
            boolean zEquals = this.f47229Z.mo16239F(c15347d1, c15516wM9087a).equals(C15447t.f48216Z);
            EnumC15366e enumC15366e = (EnumC15366e) c15516wM9087a.m16728b(EnumC15366e.class, "sentry:eventDropReason");
            if ((!zEquals || EnumC15366e.MULTITHREADED_DEDUPLICATION.equals(enumC15366e)) && !c15170v1.mo16391d()) {
                this.f47230o0.getLogger().mo16298o(EnumC15375i1.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", c15347d1.f47194Y);
            }
        } catch (Throwable th3) {
            this.f47230o0.getLogger().mo16297h(EnumC15375i1.ERROR, "Error sending uncaught exception to Sentry.", th3);
        }
        if (this.f47228Y != null) {
            this.f47230o0.getLogger().mo16298o(EnumC15375i1.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f47228Y.uncaughtException(thread, th2);
        } else if (this.f47230o0.isPrintUncaughtStackTrace()) {
            th2.printStackTrace();
        }
    }
}
