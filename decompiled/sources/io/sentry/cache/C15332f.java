package io.sentry.cache;

import com.auth0.android.request.internal.RunnableC11843b;
import io.sentry.AbstractC15140L0;
import io.sentry.C15134J0;
import io.sentry.C15138K1;
import io.sentry.C15153P1;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.protocol.C15425E;
import io.sentry.protocol.C15430c;
import io.sentry.protocol.C15447t;
import p001A.RunnableC0066i;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.cache.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C15332f extends AbstractC15140L0 {

    /* JADX INFO: renamed from: a */
    public final C15524y1 f47884a;

    public C15332f(C15524y1 c15524y1) {
        this.f47884a = c15524y1;
    }

    /* JADX INFO: renamed from: h */
    public static Object m16547h(C15524y1 c15524y1, String str, Class cls) {
        return AbstractC15327a.m16536b(c15524y1, ".scope-cache", str, cls, null);
    }

    @Override // io.sentry.AbstractC15140L0, io.sentry.InterfaceC15145N
    /* JADX INFO: renamed from: b */
    public final void mo16311b(C15447t c15447t) {
        m16548i(new RunnableC11843b(this, 24, c15447t));
    }

    @Override // io.sentry.AbstractC15140L0, io.sentry.InterfaceC15145N
    /* JADX INFO: renamed from: c */
    public final void mo16312c(ConcurrentHashMap concurrentHashMap) {
        m16548i(new RunnableC11843b(this, 19, concurrentHashMap));
    }

    @Override // io.sentry.AbstractC15140L0, io.sentry.InterfaceC15145N
    /* JADX INFO: renamed from: d */
    public final void mo16313d(C15138K1 c15138k1, C15134J0 c15134j0) {
        m16548i(new RunnableC0066i(this, c15138k1, c15134j0, 24));
    }

    @Override // io.sentry.AbstractC15140L0, io.sentry.InterfaceC15145N
    /* JADX INFO: renamed from: e */
    public final void mo16314e(C15430c c15430c) {
        m16548i(new RunnableC11843b(this, 20, c15430c));
    }

    @Override // io.sentry.AbstractC15140L0, io.sentry.InterfaceC15145N
    /* JADX INFO: renamed from: f */
    public final void mo16315f(String str) {
        m16548i(new RunnableC11843b(this, 22, str));
    }

    @Override // io.sentry.AbstractC15140L0, io.sentry.InterfaceC15145N
    /* JADX INFO: renamed from: g */
    public final void mo16316g(C15153P1 c15153p1) {
        m16548i(new RunnableC11843b(this, 21, c15153p1));
    }

    /* JADX INFO: renamed from: i */
    public final void m16548i(Runnable runnable) {
        C15524y1 c15524y1 = this.f47884a;
        if (Thread.currentThread().getName().contains("SentryExecutor")) {
            runnable.run();
            return;
        }
        try {
            c15524y1.getExecutorService().submit(new RunnableC11843b(this, 23, runnable));
        } catch (Throwable th2) {
            c15524y1.getLogger().mo16297h(EnumC15375i1.ERROR, "Serialization task could not be scheduled", th2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m16549j(Object obj, String str) {
        AbstractC15327a.m16537c(this.f47884a, obj, ".scope-cache", str);
    }

    @Override // io.sentry.InterfaceC15145N
    /* JADX INFO: renamed from: k */
    public final void mo16320k(C15425E c15425e) {
        m16548i(new RunnableC11843b(this, 18, c15425e));
    }
}
