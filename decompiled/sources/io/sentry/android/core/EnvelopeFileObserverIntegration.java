package io.sentry.android.core;

import io.sentry.C15109B;
import io.sentry.C15524y1;
import io.sentry.C15526z0;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15171W;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EnvelopeFileObserverIntegration implements InterfaceC15171W, Closeable {

    /* JADX INFO: renamed from: Y */
    public FileObserverC15189G f47320Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC15127H f47321Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f47322o0 = false;

    /* JADX INFO: renamed from: p0 */
    public final Object f47323p0 = new Object();

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        public /* synthetic */ OutboxEnvelopeFileObserverIntegration(int i10) {
            this();
        }
    }

    /* JADX INFO: renamed from: a */
    public static EnvelopeFileObserverIntegration m16386a() {
        return new OutboxEnvelopeFileObserverIntegration(0);
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        this.f47321Z = c15524y1.getLogger();
        String outboxPath = c15524y1.getOutboxPath();
        if (outboxPath == null) {
            this.f47321Z.mo16298o(EnumC15375i1.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f47321Z.mo16298o(EnumC15375i1.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            c15524y1.getExecutorService().submit(new RunnableC15201T(this, c15524y1, outboxPath, 2));
        } catch (Throwable th2) {
            this.f47321Z.mo16297h(EnumC15375i1.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f47323p0) {
            this.f47322o0 = true;
        }
        FileObserverC15189G fileObserverC15189G = this.f47320Y;
        if (fileObserverC15189G != null) {
            fileObserverC15189G.stopWatching();
            InterfaceC15127H interfaceC15127H = this.f47321Z;
            if (interfaceC15127H != null) {
                interfaceC15127H.mo16298o(EnumC15375i1.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16387e(C15524y1 c15524y1, String str) {
        FileObserverC15189G fileObserverC15189G = new FileObserverC15189G(str, new C15526z0(C15109B.f47017a, c15524y1.getEnvelopeReader(), c15524y1.getSerializer(), c15524y1.getLogger(), c15524y1.getFlushTimeoutMillis(), c15524y1.getMaxQueueSize()), c15524y1.getLogger(), c15524y1.getFlushTimeoutMillis());
        this.f47320Y = fileObserverC15189G;
        try {
            fileObserverC15189G.startWatching();
            c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th2) {
            c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th2);
        }
    }
}
