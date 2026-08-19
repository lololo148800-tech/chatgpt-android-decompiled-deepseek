package io.sentry;

import cn.UfGr.EhBykzn;
import com.auth0.android.request.internal.RunnableC11843b;
import io.sentry.clientreport.EnumC15337e;
import io.sentry.clientreport.InterfaceC15339g;
import io.sentry.hints.C15370i;
import io.sentry.internal.debugmeta.C15384c;
import io.sentry.protocol.C15421A;
import io.sentry.protocol.C15425E;
import io.sentry.protocol.C15430c;
import io.sentry.protocol.C15438k;
import io.sentry.protocol.C15447t;
import io.sentry.transport.InterfaceC15483f;
import io.sentry.util.C15499d;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import p117Eb.C2391u;
import p525Vb.C8258a;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8656j3;
import p561X.C8990d;
import p593Y8.C9683j;
import p604Yk.C10077b;
import p658b5.C11238i;
import p658b5.C11241l;
import p813ij.C15026j;
import p817j$.util.DesugarCollections;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C15106A implements InterfaceC15124G {

    /* JADX INFO: renamed from: a */
    public final C15524y1 f46998a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f46999b;

    /* JADX INFO: renamed from: c */
    public final C15026j f47000c;

    /* JADX INFO: renamed from: d */
    public final C10077b f47001d;

    /* JADX INFO: renamed from: e */
    public final Map f47002e = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: f */
    public final InterfaceC15167U1 f47003f;

    public C15106A(C15524y1 c15524y1, C15026j c15026j) {
        AbstractC8483G3.m9133c(c15524y1, "SentryOptions is required.");
        if (c15524y1.getDsn() == null || c15524y1.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
        }
        this.f46998a = c15524y1;
        this.f47001d = new C10077b(c15524y1);
        this.f47000c = c15026j;
        C15447t c15447t = C15447t.f48216Z;
        this.f47003f = c15524y1.getTransactionPerformanceCollector();
        this.f46999b = true;
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: A */
    public final C15447t mo16234A(C15421A c15421a, C15158R1 c15158r1, C15516w c15516w, C15113C0 c15113c0) {
        C15447t c15447t = C15447t.f48216Z;
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return c15447t;
        }
        if (c15421a.f48053D0 == null) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", c15421a.f47194Y);
            return c15447t;
        }
        Boolean bool = Boolean.TRUE;
        C15138K1 c15138k1M16660a = c15421a.f47195Z.m16660a();
        C2391u c2391u = c15138k1M16660a == null ? null : c15138k1M16660a.f47147p0;
        if (bool.equals(Boolean.valueOf(c2391u == null ? false : ((Boolean) c2391u.f7430o0).booleanValue()))) {
            try {
                C15150O1 c15150o1M16149m = this.f47000c.m16149m();
                return c15150o1M16149m.f47162b.m12559c0(c15421a, c15158r1, c15150o1M16149m.f47163c, c15516w, c15113c0);
            } catch (Throwable th2) {
                this.f46998a.getLogger().mo16297h(EnumC15375i1.ERROR, "Error while capturing transaction with id: " + c15421a.f47194Y, th2);
                return c15447t;
            }
        }
        this.f46998a.getLogger().mo16298o(EnumC15375i1.DEBUG, "Transaction %s was dropped due to sampling decision.", c15421a.f47194Y);
        if (this.f46998a.getBackpressureMonitor().mo7607a() > 0) {
            InterfaceC15339g clientReportRecorder = this.f46998a.getClientReportRecorder();
            EnumC15337e enumC15337e = EnumC15337e.BACKPRESSURE;
            clientReportRecorder.mo7942e(enumC15337e, EnumC15359h.Transaction);
            this.f46998a.getClientReportRecorder().mo7944v(enumC15337e, EnumC15359h.Span, c15421a.f48054E0.size() + 1);
            return c15447t;
        }
        InterfaceC15339g clientReportRecorder2 = this.f46998a.getClientReportRecorder();
        EnumC15337e enumC15337e2 = EnumC15337e.SAMPLE_RATE;
        clientReportRecorder2.mo7942e(enumC15337e2, EnumC15359h.Transaction);
        this.f46998a.getClientReportRecorder().mo7944v(enumC15337e2, EnumC15359h.Span, c15421a.f48054E0.size() + 1);
        return c15447t;
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: B */
    public final void mo16235B() {
        C15132I1 c15132i1;
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        C15150O1 c15150o1M16149m = this.f47000c.m16149m();
        C15134J0 c15134j0 = c15150o1M16149m.f47163c;
        synchronized (c15134j0.f47124l) {
            try {
                c15132i1 = null;
                if (c15134j0.f47123k != null) {
                    C15132I1 c15132i2 = c15134j0.f47123k;
                    c15132i2.getClass();
                    c15132i2.m16302b(AbstractC8656j3.m9340h());
                    C15132I1 c15132i1Clone = c15134j0.f47123k.clone();
                    c15134j0.f47123k = null;
                    c15132i1 = c15132i1Clone;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c15132i1 != null) {
            c15150o1M16149m.f47162b.m12558b0(c15132i1, AbstractC8465D3.m9087a(new C8258a()));
        }
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: C */
    public final void mo16236C() {
        C15384c c15384c;
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        C15150O1 c15150o1M16149m = this.f47000c.m16149m();
        C15134J0 c15134j0 = c15150o1M16149m.f47163c;
        synchronized (c15134j0.f47124l) {
            try {
                if (c15134j0.f47123k != null) {
                    C15132I1 c15132i1 = c15134j0.f47123k;
                    c15132i1.getClass();
                    c15132i1.m16302b(AbstractC8656j3.m9340h());
                }
                C15132I1 c15132i2 = c15134j0.f47123k;
                c15384c = null;
                if (c15134j0.f47122j.getRelease() != null) {
                    String distinctId = c15134j0.f47122j.getDistinctId();
                    C15425E c15425e = c15134j0.f47114b;
                    c15134j0.f47123k = new C15132I1(EnumC15129H1.Ok, AbstractC8656j3.m9340h(), AbstractC8656j3.m9340h(), 0, distinctId, UUID.randomUUID(), Boolean.TRUE, null, null, c15425e != null ? c15425e.f48066q0 : null, null, c15134j0.f47122j.getEnvironment(), c15134j0.f47122j.getRelease(), null);
                    c15384c = new C15384c(c15134j0.f47123k.clone(), c15132i2 != null ? c15132i2.clone() : null, false, 24);
                } else {
                    c15134j0.f47122j.getLogger().mo16298o(EnumC15375i1.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c15384c == null) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (((C15132I1) c15384c.f47967Z) != null) {
            c15150o1M16149m.f47162b.m12558b0((C15132I1) c15384c.f47967Z, AbstractC8465D3.m9087a(new C8258a()));
        }
        c15150o1M16149m.f47162b.m12558b0((C15132I1) c15384c.f47968o0, AbstractC8465D3.m9087a(new C15370i(0)));
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: D */
    public final C15447t mo16237D(C11241l c11241l, C15516w c15516w) {
        C15447t c15447t = C15447t.f48216Z;
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return c15447t;
        }
        try {
            C15447t c15447tM12553Y = this.f47000c.m16149m().f47162b.m12553Y(c11241l, c15516w);
            return c15447tM12553Y != null ? c15447tM12553Y : c15447t;
        } catch (Throwable th2) {
            this.f46998a.getLogger().mo16297h(EnumC15375i1.ERROR, "Error while capturing envelope.", th2);
            return c15447t;
        }
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: E */
    public final C15447t mo16238E(EnumC15375i1 enumC15375i1) {
        C15447t c15447t = C15447t.f48216Z;
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
            return c15447t;
        }
        try {
            C15150O1 c15150o1M16149m = this.f47000c.m16149m();
            C15134J0 c15134j0 = c15150o1M16149m.f47163c;
            C11238i c11238i = c15150o1M16149m.f47162b;
            c11238i.getClass();
            C15347d1 c15347d1 = new C15347d1();
            C15438k c15438k = new C15438k();
            c15438k.f48165Y = "Multiple components exist for the same conversation id";
            c15347d1.f47915C0 = c15438k;
            c15347d1.f47919G0 = enumC15375i1;
            return c11238i.m12554Z(c15347d1, c15134j0, null);
        } catch (Throwable th2) {
            this.f46998a.getLogger().mo16297h(EnumC15375i1.ERROR, "Error while capturing message: ".concat("Multiple components exist for the same conversation id"), th2);
            return c15447t;
        }
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: F */
    public final C15447t mo16239F(C15347d1 c15347d1, C15516w c15516w) {
        C15447t c15447t = C15447t.f48216Z;
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return c15447t;
        }
        try {
            m16241b(c15347d1);
            C15150O1 c15150o1M16149m = this.f47000c.m16149m();
            return c15150o1M16149m.f47162b.m12554Z(c15347d1, c15150o1M16149m.f47163c, c15516w);
        } catch (Throwable th2) {
            this.f46998a.getLogger().mo16297h(EnumC15375i1.ERROR, "Error while capturing event with id: " + c15347d1.f47194Y, th2);
            return c15447t;
        }
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: a */
    public final void mo16240a(String str, String str2) {
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
            return;
        }
        if (str == null || str2 == null) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "setTag called with null parameter.", new Object[0]);
            return;
        }
        C15134J0 c15134j0 = this.f47000c.m16149m().f47163c;
        ConcurrentHashMap concurrentHashMap = c15134j0.f47119g;
        concurrentHashMap.put(str, str2);
        for (InterfaceC15145N interfaceC15145N : c15134j0.f47122j.getScopeObservers()) {
            interfaceC15145N.mo16310a(str, str2);
            interfaceC15145N.mo16312c(concurrentHashMap);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16241b(C15347d1 c15347d1) {
        String str;
        InterfaceC15154Q interfaceC15154Q;
        if (!this.f46998a.isTracingEnabled() || c15347d1.m16339a() == null) {
            return;
        }
        Throwable thM16339a = c15347d1.m16339a();
        AbstractC8483G3.m9133c(thM16339a, "throwable cannot be null");
        while (thM16339a.getCause() != null && thM16339a.getCause() != thM16339a) {
            thM16339a = thM16339a.getCause();
        }
        C15499d c15499d = (C15499d) this.f47002e.get(thM16339a);
        if (c15499d != null) {
            WeakReference weakReference = c15499d.f48418a;
            C15430c c15430c = c15347d1.f47195Z;
            if (c15430c.m16660a() == null && (interfaceC15154Q = (InterfaceC15154Q) weakReference.get()) != null) {
                c15430c.m16662c(interfaceC15154Q.mo16288s());
            }
            if (c15347d1.f47920H0 != null || (str = c15499d.f48419b) == null) {
                return;
            }
            c15347d1.f47920H0 = str;
        }
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: d */
    public final void mo16242d(boolean z6) {
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (InterfaceC15171W interfaceC15171W : this.f46998a.getIntegrations()) {
                if (interfaceC15171W instanceof Closeable) {
                    try {
                        ((Closeable) interfaceC15171W).close();
                    } catch (IOException e10) {
                        this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Failed to close the integration {}.", interfaceC15171W, e10);
                    }
                }
            }
            mo16253v(new C8990d(14));
            this.f46998a.getTransactionProfiler().close();
            this.f46998a.getTransactionPerformanceCollector().close();
            InterfaceC15148O executorService = this.f46998a.getExecutorService();
            if (z6) {
                executorService.submit(new RunnableC11843b(this, 9, executorService));
            } else {
                executorService.mo15965d(this.f46998a.getShutdownTimeoutMillis());
            }
            this.f47000c.m16149m().f47162b.m12560d0(z6);
        } catch (Throwable th2) {
            this.f46998a.getLogger().mo16297h(EnumC15375i1.ERROR, "Error while closing the Hub.", th2);
        }
        this.f46999b = false;
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: e */
    public final InterfaceC15154Q mo16243e() {
        C15135J1 c15135j1Mo16281l;
        if (this.f46999b) {
            InterfaceC15159S interfaceC15159S = this.f47000c.m16149m().f47163c.f47113a;
            return (interfaceC15159S == null || (c15135j1Mo16281l = interfaceC15159S.mo16281l()) == null) ? interfaceC15159S : c15135j1Mo16281l;
        }
        this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: f */
    public final C9683j mo16244f() {
        return ((InterfaceC15483f) this.f47000c.m16149m().f47162b.f34009Z).mo16673f();
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: i */
    public final boolean mo16245i() {
        return ((InterfaceC15483f) this.f47000c.m16149m().f47162b.f34009Z).mo16674i();
    }

    @Override // io.sentry.InterfaceC15124G
    public final boolean isEnabled() {
        return this.f46999b;
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: j */
    public final C15524y1 mo16246j() {
        return this.f47000c.m16149m().f47161a;
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: k */
    public final void mo16247k(C15425E c15425e) {
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
            return;
        }
        C15134J0 c15134j0 = this.f47000c.m16149m().f47163c;
        c15134j0.f47114b = c15425e;
        Iterator<InterfaceC15145N> it = c15134j0.f47122j.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().mo16320k(c15425e);
        }
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: l */
    public final void mo16248l(C15345d c15345d) {
        mo16252u(c15345d, new C15516w());
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: r */
    public final void mo16249r(long j10) {
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            ((InterfaceC15483f) this.f47000c.m16149m().f47162b.f34009Z).mo16675r(j10);
        } catch (Throwable th2) {
            this.f46998a.getLogger().mo16297h(EnumC15375i1.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: s */
    public final C15447t mo16250s(Exception exc) {
        return mo16257z(exc, new C15516w());
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: t */
    public final InterfaceC15159S mo16251t(C15161S1 c15161s1, C15164T1 c15164t1) {
        C15126G1 c15126g1;
        InterfaceC15159S interfaceC15159S;
        boolean z6 = this.f46999b;
        C15517w0 c15517w0 = C15517w0.f48472a;
        if (!z6) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            interfaceC15159S = c15517w0;
        } else if (!this.f46998a.getInstrumenter().equals(c15161s1.f47209A0)) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", c15161s1.f47209A0, this.f46998a.getInstrumenter());
            interfaceC15159S = c15517w0;
        } else if (this.f46998a.isTracingEnabled()) {
            C2391u c2391uM10663K = this.f47001d.m10663K(new C10077b(c15161s1, 9));
            c15161s1.f47147p0 = c2391uM10663K;
            c15126g1 = new C15126G1(c15161s1, this, c15164t1, this.f47003f);
            if (((Boolean) c2391uM10663K.f7430o0).booleanValue() && ((Boolean) c2391uM10663K.f7431p0).booleanValue()) {
                InterfaceC15162T transactionProfiler = this.f46998a.getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    interfaceC15159S = c15126g1;
                    interfaceC15159S = c15126g1;
                    transactionProfiler.start();
                    transactionProfiler.mo16346j(c15126g1);
                    interfaceC15159S = c15126g1;
                } else if (c15164t1.f47220p0) {
                    interfaceC15159S = c15126g1;
                    interfaceC15159S = c15126g1;
                    interfaceC15159S = c15126g1;
                    transactionProfiler.mo16346j(c15126g1);
                    interfaceC15159S = c15126g1;
                }
            }
        } else {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            interfaceC15159S = c15517w0;
        }
        interfaceC15159S = c15126g1;
        interfaceC15159S = c15126g1;
        interfaceC15159S = c15126g1;
        interfaceC15159S = c15126g1;
        interfaceC15159S = c15126g1;
        interfaceC15159S = c15126g1;
        return interfaceC15159S;
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: u */
    public final void mo16252u(C15345d c15345d, C15516w c15516w) {
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
            return;
        }
        C15134J0 c15134j0 = this.f47000c.m16149m().f47163c;
        c15134j0.getClass();
        C15524y1 c15524y1 = c15134j0.f47122j;
        c15524y1.getBeforeBreadcrumb();
        C15153P1 c15153p1 = c15134j0.f47118f;
        c15153p1.add(c15345d);
        for (InterfaceC15145N interfaceC15145N : c15524y1.getScopeObservers()) {
            interfaceC15145N.mo16317l(c15345d);
            interfaceC15145N.mo16316g(c15153p1);
        }
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: v */
    public final void mo16253v(InterfaceC15137K0 interfaceC15137K0) {
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            interfaceC15137K0.mo390f(this.f47000c.m16149m().f47163c);
        } catch (Throwable th2) {
            this.f46998a.getLogger().mo16297h(EnumC15375i1.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: x */
    public final void mo16255x(String str) {
        C15345d c15345d = new C15345d();
        c15345d.f47906o0 = str;
        mo16248l(c15345d);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: y */
    public final InterfaceC15159S mo16256y() {
        if (this.f46999b) {
            return this.f47000c.m16149m().f47163c.f47113a;
        }
        this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: z */
    public final C15447t mo16257z(Exception exc, C15516w c15516w) {
        C15447t c15447t = C15447t.f48216Z;
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
            return c15447t;
        }
        try {
            C15150O1 c15150o1M16149m = this.f47000c.m16149m();
            C15347d1 c15347d1 = new C15347d1(exc);
            m16241b(c15347d1);
            return c15150o1M16149m.f47162b.m12554Z(c15347d1, c15150o1M16149m.f47163c, c15516w);
        } catch (Throwable th2) {
            this.f46998a.getLogger().mo16297h(EnumC15375i1.ERROR, "Error while capturing exception: " + exc.getMessage(), th2);
            return c15447t;
        }
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC15124G m22571clone() {
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Disabled Hub cloned.", new Object[0]);
        }
        C15524y1 c15524y1 = this.f46998a;
        C15026j c15026j = this.f47000c;
        C15026j c15026j2 = new C15026j((InterfaceC15127H) c15026j.f46725Z, new C15150O1((C15150O1) ((LinkedBlockingDeque) c15026j.f46724Y).getLast()));
        Iterator itDescendingIterator = ((LinkedBlockingDeque) c15026j.f46724Y).descendingIterator();
        if (itDescendingIterator.hasNext()) {
            itDescendingIterator.next();
        }
        while (itDescendingIterator.hasNext()) {
            ((LinkedBlockingDeque) c15026j2.f46724Y).push(new C15150O1((C15150O1) itDescendingIterator.next()));
        }
        return new C15106A(c15524y1, c15026j2);
    }

    @Override // io.sentry.InterfaceC15124G
    /* JADX INFO: renamed from: w */
    public final C15447t mo16254w(C15108A1 c15108a1, C15516w c15516w) {
        C15447t c15447t = C15447t.f48216Z;
        if (!this.f46999b) {
            this.f46998a.getLogger().mo16298o(EnumC15375i1.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return c15447t;
        }
        try {
            C15150O1 c15150o1M16149m = this.f47000c.m16149m();
            return c15150o1M16149m.f47162b.m12556a0(c15108a1, c15150o1M16149m.f47163c, c15516w);
        } catch (Throwable th2) {
            this.f46998a.getLogger().mo16297h(EnumC15375i1.ERROR, EhBykzn.mmFTgz, th2);
            return c15447t;
        }
    }
}
