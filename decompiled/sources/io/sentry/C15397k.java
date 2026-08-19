package io.sentry;

import com.auth0.android.request.internal.RunnableC11843b;
import io.sentry.android.core.C15206Y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p544W9.AbstractC8483G3;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C15397k implements InterfaceC15167U1 {

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f47999p0;

    /* JADX INFO: renamed from: q0 */
    public final ArrayList f48000q0;

    /* JADX INFO: renamed from: r0 */
    public final boolean f48001r0;

    /* JADX INFO: renamed from: s0 */
    public final C15524y1 f48002s0;

    /* JADX INFO: renamed from: Y */
    public final Object f47996Y = new Object();

    /* JADX INFO: renamed from: Z */
    public volatile Timer f47997Z = null;

    /* JADX INFO: renamed from: o0 */
    public final ConcurrentHashMap f47998o0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: t0 */
    public final AtomicBoolean f48003t0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u0 */
    public long f48004u0 = 0;

    public C15397k(C15524y1 c15524y1) {
        boolean z6 = false;
        AbstractC8483G3.m9133c(c15524y1, "The options object is required.");
        this.f48002s0 = c15524y1;
        this.f47999p0 = new ArrayList();
        this.f48000q0 = new ArrayList();
        for (InterfaceC15136K interfaceC15136K : c15524y1.getPerformanceCollectors()) {
            if (interfaceC15136K instanceof InterfaceC15142M) {
                this.f47999p0.add((InterfaceC15142M) interfaceC15136K);
            }
            if (interfaceC15136K instanceof InterfaceC15139L) {
                this.f48000q0.add((InterfaceC15139L) interfaceC15136K);
            }
        }
        if (this.f47999p0.isEmpty() && this.f48000q0.isEmpty()) {
            z6 = true;
        }
        this.f48001r0 = z6;
    }

    @Override // io.sentry.InterfaceC15167U1
    /* JADX INFO: renamed from: c */
    public final void mo16349c(C15135J1 c15135j1) throws Throwable {
        Iterator it = this.f48000q0.iterator();
        while (it.hasNext()) {
            ((C15206Y) ((InterfaceC15139L) it.next())).m16420f(c15135j1);
        }
    }

    @Override // io.sentry.InterfaceC15167U1
    public final void close() {
        this.f48002s0.getLogger().mo16298o(EnumC15375i1.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f47998o0.clear();
        Iterator it = this.f48000q0.iterator();
        while (it.hasNext()) {
            ((C15206Y) ((InterfaceC15139L) it.next())).m16419e();
        }
        if (this.f48003t0.getAndSet(false)) {
            synchronized (this.f47996Y) {
                try {
                    if (this.f47997Z != null) {
                        this.f47997Z.cancel();
                        this.f47997Z = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC15167U1
    /* JADX INFO: renamed from: f */
    public final void mo16350f(C15135J1 c15135j1) {
        Iterator it = this.f48000q0.iterator();
        while (it.hasNext()) {
            ((C15206Y) ((InterfaceC15139L) it.next())).m16421g(c15135j1);
        }
    }

    @Override // io.sentry.InterfaceC15167U1
    /* JADX INFO: renamed from: i */
    public final void mo16351i(C15126G1 c15126g1) {
        if (this.f48001r0) {
            this.f48002s0.getLogger().mo16298o(EnumC15375i1.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.f48000q0.iterator();
        while (it.hasNext()) {
            ((C15206Y) ((InterfaceC15139L) it.next())).m16421g(c15126g1);
        }
        if (!this.f47998o0.containsKey(c15126g1.f47075a.toString())) {
            this.f47998o0.put(c15126g1.f47075a.toString(), new ArrayList());
            try {
                this.f48002s0.getExecutorService().mo15970r(new RunnableC11843b(this, 8, c15126g1), 30000L);
            } catch (RejectedExecutionException e10) {
                this.f48002s0.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e10);
            }
        }
        if (this.f48003t0.getAndSet(true)) {
            return;
        }
        synchronized (this.f47996Y) {
            try {
                if (this.f47997Z == null) {
                    this.f47997Z = new Timer(true);
                }
                this.f47997Z.schedule(new C15394j(this, 0), 0L);
                this.f47997Z.scheduleAtFixedRate(new C15394j(this, 1), 100L, 100L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.sentry.InterfaceC15167U1
    /* JADX INFO: renamed from: n */
    public final List mo16352n(InterfaceC15159S interfaceC15159S) {
        this.f48002s0.getLogger().mo16298o(EnumC15375i1.DEBUG, "stop collecting performance info for transactions %s (%s)", interfaceC15159S.getName(), interfaceC15159S.mo16288s().f47144Y.toString());
        ConcurrentHashMap concurrentHashMap = this.f47998o0;
        List list = (List) concurrentHashMap.remove(interfaceC15159S.mo16283n().toString());
        Iterator it = this.f48000q0.iterator();
        while (it.hasNext()) {
            ((C15206Y) ((InterfaceC15139L) it.next())).m16420f(interfaceC15159S);
        }
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        return list;
    }
}
