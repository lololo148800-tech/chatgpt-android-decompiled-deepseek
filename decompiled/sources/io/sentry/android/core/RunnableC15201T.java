package io.sentry.android.core;

import io.sentry.C15109B;
import io.sentry.C15524y1;
import io.sentry.EnumC15112C;
import io.sentry.EnumC15359h;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15118E;
import p001A.C0031P0;
import p593Y8.C9683j;
import p791hj.C14522e;

/* JADX INFO: renamed from: io.sentry.android.core.T */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15201T implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f47400Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f47401Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f47402o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f47403p0;

    public /* synthetic */ RunnableC15201T(Object obj, Object obj2, Object obj3, int i10) {
        this.f47400Y = i10;
        this.f47401Z = obj;
        this.f47402o0 = obj2;
        this.f47403p0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47400Y) {
            case 0:
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f47402o0;
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.f47401Z;
                sendCachedEnvelopeIntegration.getClass();
                try {
                    if (sendCachedEnvelopeIntegration.f47393u0.get()) {
                        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    boolean andSet = sendCachedEnvelopeIntegration.f47392t0.getAndSet(true);
                    C15109B c15109b = (C15109B) this.f47403p0;
                    if (!andSet) {
                        InterfaceC15118E connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.f47388p0 = connectionStatusProvider;
                        connectionStatusProvider.mo12532B(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.f47391s0 = sendCachedEnvelopeIntegration.f47385Y.mo10195E(c15109b, sentryAndroidOptions);
                    }
                    InterfaceC15118E interfaceC15118E = sendCachedEnvelopeIntegration.f47388p0;
                    if (interfaceC15118E != null && interfaceC15118E.mo12581z() == EnumC15112C.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    C9683j c9683jMo16244f = c15109b.mo16244f();
                    if (c9683jMo16244f != null && c9683jMo16244f.m10272P(EnumC15359h.All)) {
                        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    C0031P0 c0031p0 = sendCachedEnvelopeIntegration.f47391s0;
                    if (c0031p0 == null) {
                        sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        c0031p0.m168a();
                        return;
                    }
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed trying to send cached events.", th2);
                    return;
                }
            case 1:
                Runnable runnable = (Runnable) this.f47402o0;
                C14522e c14522e = (C14522e) this.f47401Z;
                c14522e.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    String str = (String) this.f47403p0;
                    if (str != null) {
                        ((SentryAndroidOptions) c14522e.f45762Z).getLogger().mo16298o(EnumC15375i1.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            default:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.f47401Z;
                C15524y1 c15524y1 = (C15524y1) this.f47402o0;
                String str2 = (String) this.f47403p0;
                synchronized (envelopeFileObserverIntegration.f47323p0) {
                    try {
                        if (!envelopeFileObserverIntegration.f47322o0) {
                            envelopeFileObserverIntegration.m16387e(c15524y1, str2);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
        }
    }
}
