package io.sentry;

import java.io.Closeable;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8483G3;

/* JADX INFO: loaded from: classes3.dex */
public final class ShutdownHookIntegration implements InterfaceC15171W, Closeable {

    /* JADX INFO: renamed from: Y */
    public final Runtime f47214Y;

    /* JADX INFO: renamed from: Z */
    public Thread f47215Z;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        AbstractC8483G3.m9133c(runtime, "Runtime is required");
        this.f47214Y = runtime;
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        if (!c15524y1.isEnableShutdownHook()) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.f47215Z = new Thread(new RunnableC15146N0(c15524y1, 3));
        try {
            this.f47214Y.addShutdownHook(this.f47215Z);
            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            AbstractC8471E3.m9104b("ShutdownHook");
        } catch (IllegalStateException e10) {
            String message = e10.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e10;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f47215Z != null) {
            try {
                this.f47214Y.removeShutdownHook(this.f47215Z);
            } catch (IllegalStateException e10) {
                String message = e10.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e10;
                }
            }
        }
    }
}
