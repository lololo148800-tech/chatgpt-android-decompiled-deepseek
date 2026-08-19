package io.sentry.android.replay;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import com.auth0.android.request.internal.RunnableC11843b;
import com.openai.chatgpt.app.MainApplication;
import io.sentry.C15109B;
import io.sentry.C15114C1;
import io.sentry.C15358g1;
import io.sentry.C15476t0;
import io.sentry.C15524y1;
import io.sentry.EnumC15112C;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15115D;
import io.sentry.InterfaceC15119E0;
import io.sentry.InterfaceC15122F0;
import io.sentry.InterfaceC15148O;
import io.sentry.InterfaceC15171W;
import io.sentry.android.replay.capture.AbstractC15275f;
import io.sentry.android.replay.capture.C15278i;
import io.sentry.android.replay.capture.C15287r;
import io.sentry.android.replay.capture.InterfaceC15284o;
import io.sentry.android.replay.gestures.C15293b;
import io.sentry.protocol.C15447t;
import io.sentry.transport.C15481d;
import io.sentry.util.C15501f;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import livekit.LivekitInternal$NodeStats;
import mm.C17314q;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p544W9.AbstractC8459C3;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8656j3;
import p544W9.AbstractC8704r3;
import p544W9.AbstractC8716t3;
import p571X9.AbstractC9227W;
import p593Y8.C9683j;
import p741f5.RunnableC13542a;
import p749fd.C13628m;
import p784hb.C14437f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0007\b¨\u0006\t"}, m18067d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/W;", "Ljava/io/Closeable;", "", "Lio/sentry/F0;", "Landroid/content/ComponentCallbacks;", "Lio/sentry/D;", "io/sentry/android/replay/k", "io/sentry/y", "sentry-android-replay_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ReplayIntegration implements InterfaceC15171W, Closeable, InterfaceC15122F0, ComponentCallbacks, InterfaceC15115D {

    /* JADX INFO: renamed from: Y */
    public final Context f47655Y;

    /* JADX INFO: renamed from: Z */
    public final C15481d f47656Z;

    /* JADX INFO: renamed from: o0 */
    public C15524y1 f47657o0;

    /* JADX INFO: renamed from: p0 */
    public C15109B f47658p0;

    /* JADX INFO: renamed from: q0 */
    public C15317w f47659q0;

    /* JADX INFO: renamed from: r0 */
    public C15293b f47660r0;

    /* JADX INFO: renamed from: s0 */
    public final C17314q f47661s0;

    /* JADX INFO: renamed from: t0 */
    public final C17314q f47662t0;

    /* JADX INFO: renamed from: u0 */
    public final C17314q f47663u0;

    /* JADX INFO: renamed from: v0 */
    public final AtomicBoolean f47664v0;

    /* JADX INFO: renamed from: w0 */
    public final AtomicBoolean f47665w0;

    /* JADX INFO: renamed from: x0 */
    public InterfaceC15284o f47666x0;

    /* JADX INFO: renamed from: y0 */
    public InterfaceC15119E0 f47667y0;

    /* JADX INFO: renamed from: z0 */
    public final C14437f f47668z0;

    public ReplayIntegration(MainApplication mainApplication) {
        C15481d c15481d = C15481d.f48366a;
        Context applicationContext = mainApplication.getApplicationContext();
        this.f47655Y = applicationContext != null ? applicationContext : mainApplication;
        this.f47656Z = c15481d;
        this.f47661s0 = AbstractC9227W.m9800c(C15267a.f47670o0);
        this.f47662t0 = AbstractC9227W.m9800c(C15267a.f47672q0);
        this.f47663u0 = AbstractC9227W.m9800c(C15267a.f47671p0);
        this.f47664v0 = new AtomicBoolean(false);
        this.f47665w0 = new AtomicBoolean(false);
        this.f47667y0 = C15476t0.f48341Z;
        this.f47668z0 = new C14437f(2);
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        Double d10;
        C15109B c15109b = C15109B.f47017a;
        this.f47657o0 = c15524y1;
        if (Build.VERSION.SDK_INT < 26) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        Double d11 = c15524y1.getExperimental().f48340a.f47049a;
        if ((d11 == null || d11.doubleValue() <= 0.0d) && ((d10 = c15524y1.getExperimental().f48340a.f47050b) == null || d10.doubleValue() <= 0.0d)) {
            c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.f47658p0 = c15109b;
        ScheduledExecutorService replayExecutor = (ScheduledExecutorService) this.f47663u0.getValue();
        AbstractC16544l.m18093f(replayExecutor, "replayExecutor");
        this.f47659q0 = new C15317w(c15524y1, this, this.f47668z0, replayExecutor);
        this.f47660r0 = new C15293b(c15524y1, this);
        this.f47664v0.set(true);
        c15524y1.getConnectionStatusProvider().mo12532B(this);
        C9683j c9683jMo16244f = c15109b.mo16244f();
        if (c9683jMo16244f != null) {
            ((CopyOnWriteArrayList) c9683jMo16244f.f29195q0).add(this);
        }
        if (c15524y1.getExperimental().f48340a.f47058j) {
            try {
                this.f47655Y.registerComponentCallbacks(this);
            } catch (Throwable th2) {
                c15524y1.getLogger().mo16297h(EnumC15375i1.INFO, "ComponentCallbacks is not available, orientation changes won't be handled by Session replay", th2);
            }
        }
        AbstractC8471E3.m9104b("Replay");
        C15358g1.m16578n().m16580f("maven:io.sentry:sentry-android-replay");
        C15524y1 c15524y2 = this.f47657o0;
        if (c15524y2 == null) {
            AbstractC16544l.m18103p("options");
            throw null;
        }
        InterfaceC15148O executorService = c15524y2.getExecutorService();
        AbstractC16544l.m18093f(executorService, "options.executorService");
        C15524y1 c15524y3 = this.f47657o0;
        if (c15524y3 == null) {
            AbstractC16544l.m18103p("options");
            throw null;
        }
        try {
            executorService.submit(new RunnableC11843b(new RunnableC13542a(this, 8), 17, c15524y3));
        } catch (Throwable th3) {
            c15524y3.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th3);
        }
    }

    @Override // io.sentry.InterfaceC15122F0
    /* JADX INFO: renamed from: P, reason: from getter */
    public final InterfaceC15119E0 getF47667y0() {
        return this.f47667y0;
    }

    /* JADX INFO: renamed from: S */
    public final void m16491S(String str) {
        File[] fileArrListFiles;
        C15447t EMPTY_ID;
        C15524y1 c15524y1 = this.f47657o0;
        if (c15524y1 == null) {
            AbstractC16544l.m18103p("options");
            throw null;
        }
        String cacheDirPath = c15524y1.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            AbstractC16544l.m18093f(name, "name");
            if (AbstractC21329w.m21734u(name, "replay_", false)) {
                InterfaceC15284o interfaceC15284o = this.f47666x0;
                if (interfaceC15284o == null || (EMPTY_ID = ((AbstractC15275f) interfaceC15284o).m16498j()) == null) {
                    EMPTY_ID = C15447t.f48216Z;
                    AbstractC16544l.m18093f(EMPTY_ID, "EMPTY_ID");
                }
                String string = EMPTY_ID.toString();
                AbstractC16544l.m18093f(string, "replayId.toString()");
                if (!AbstractC21322p.m21667A(name, string, false) && (AbstractC21322p.m21681O(str) || !AbstractC21322p.m21667A(name, str, false))) {
                    AbstractC8459C3.m9077a(file);
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m16492T(Bitmap bitmap) {
        C16525B c16525b = new C16525B();
        C15109B c15109b = this.f47658p0;
        if (c15109b != null) {
            c15109b.mo16253v(new C15296j(c16525b, 0));
        }
        InterfaceC15284o interfaceC15284o = this.f47666x0;
        if (interfaceC15284o != null) {
            interfaceC15284o.mo16508g(new C15298l(bitmap, c16525b, this, 0));
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m16493W(C15269c c15269c) {
        this.f47667y0 = c15269c;
    }

    @Override // io.sentry.InterfaceC15122F0
    /* JADX INFO: renamed from: a */
    public final void mo16264a() {
        ViewTreeObserverOnDrawListenerC15303q viewTreeObserverOnDrawListenerC15303q;
        View view;
        if (this.f47664v0.get() && this.f47665w0.get()) {
            InterfaceC15284o interfaceC15284o = this.f47666x0;
            if (interfaceC15284o != null) {
                ((AbstractC15275f) interfaceC15284o).m16503o(AbstractC8656j3.m9340h());
            }
            C15317w c15317w = this.f47659q0;
            if (c15317w == null || (viewTreeObserverOnDrawListenerC15303q = c15317w.f47856t0) == null) {
                return;
            }
            WeakReference weakReference = viewTreeObserverOnDrawListenerC15303q.f47805r0;
            if (weakReference != null && (view = (View) weakReference.get()) != null && view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
                view.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC15303q);
            }
            viewTreeObserverOnDrawListenerC15303q.f47811x0.set(true);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C9683j c9683jMo16244f;
        if (this.f47664v0.get()) {
            C15524y1 c15524y1 = this.f47657o0;
            if (c15524y1 == null) {
                AbstractC16544l.m18103p("options");
                throw null;
            }
            c15524y1.getConnectionStatusProvider().mo12539G(this);
            C15109B c15109b = this.f47658p0;
            if (c15109b != null && (c9683jMo16244f = c15109b.mo16244f()) != null) {
                ((CopyOnWriteArrayList) c9683jMo16244f.f29195q0).remove(this);
            }
            C15524y1 c15524y2 = this.f47657o0;
            if (c15524y2 == null) {
                AbstractC16544l.m18103p("options");
                throw null;
            }
            if (c15524y2.getExperimental().f48340a.f47058j) {
                try {
                    this.f47655Y.unregisterComponentCallbacks(this);
                } catch (Throwable unused) {
                }
            }
            stop();
            C15317w c15317w = this.f47659q0;
            if (c15317w != null) {
                c15317w.close();
            }
            this.f47659q0 = null;
            ((C15300n) this.f47662t0.getValue()).close();
            ScheduledExecutorService replayExecutor = (ScheduledExecutorService) this.f47663u0.getValue();
            AbstractC16544l.m18093f(replayExecutor, "replayExecutor");
            C15524y1 c15524y3 = this.f47657o0;
            if (c15524y3 != null) {
                AbstractC8716t3.m9424a(replayExecutor, c15524y3);
            } else {
                AbstractC16544l.m18103p("options");
                throw null;
            }
        }
    }

    @Override // io.sentry.InterfaceC15122F0
    /* JADX INFO: renamed from: e */
    public final void mo16265e() {
        ViewTreeObserverOnDrawListenerC15303q viewTreeObserverOnDrawListenerC15303q;
        if (this.f47664v0.get() && this.f47665w0.get()) {
            C15317w c15317w = this.f47659q0;
            if (c15317w != null && (viewTreeObserverOnDrawListenerC15303q = c15317w.f47856t0) != null) {
                viewTreeObserverOnDrawListenerC15303q.f47811x0.set(false);
                WeakReference weakReference = viewTreeObserverOnDrawListenerC15303q.f47805r0;
                viewTreeObserverOnDrawListenerC15303q.m16521b(weakReference != null ? (View) weakReference.get() : null);
            }
            InterfaceC15284o interfaceC15284o = this.f47666x0;
            if (interfaceC15284o != null) {
                interfaceC15284o.mo16506e();
            }
        }
    }

    @Override // io.sentry.InterfaceC15122F0
    /* JADX INFO: renamed from: k */
    public final void mo16266k(Boolean bool) {
        if (this.f47664v0.get() && this.f47665w0.get()) {
            C15447t c15447t = C15447t.f48216Z;
            InterfaceC15284o interfaceC15284o = this.f47666x0;
            if (c15447t.equals(interfaceC15284o != null ? ((AbstractC15275f) interfaceC15284o).m16498j() : null)) {
                C15524y1 c15524y1 = this.f47657o0;
                if (c15524y1 != null) {
                    c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    return;
                } else {
                    AbstractC16544l.m18103p("options");
                    throw null;
                }
            }
            InterfaceC15284o interfaceC15284o2 = this.f47666x0;
            if (interfaceC15284o2 != null) {
                interfaceC15284o2.mo16507f(bool.equals(Boolean.TRUE), new C13628m(this, 20));
            }
            InterfaceC15284o interfaceC15284o3 = this.f47666x0;
            this.f47666x0 = interfaceC15284o3 != null ? interfaceC15284o3.mo16505d() : null;
        }
    }

    @Override // io.sentry.InterfaceC15115D
    /* JADX INFO: renamed from: m */
    public final void mo16259m(EnumC15112C status) {
        AbstractC16544l.m18094g(status, "status");
        if (this.f47666x0 instanceof C15287r) {
            if (status == EnumC15112C.DISCONNECTED) {
                mo16265e();
            } else {
                mo16264a();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        AbstractC16544l.m18094g(newConfig, "newConfig");
        if (this.f47664v0.get() && this.f47665w0.get()) {
            C15317w c15317w = this.f47659q0;
            if (c15317w != null) {
                c15317w.m16524k();
            }
            C15524y1 c15524y1 = this.f47657o0;
            if (c15524y1 == null) {
                AbstractC16544l.m18103p("options");
                throw null;
            }
            C15114C1 c15114c1 = c15524y1.getExperimental().f48340a;
            AbstractC16544l.m18093f(c15114c1, "options.experimental.sessionReplay");
            C15304r c15304rM9410b = AbstractC8704r3.m9410b(this.f47655Y, c15114c1);
            InterfaceC15284o interfaceC15284o = this.f47666x0;
            if (interfaceC15284o != null) {
                interfaceC15284o.mo16504b(c15304rM9410b);
            }
            C15317w c15317w2 = this.f47659q0;
            if (c15317w2 != null) {
                c15317w2.m16523e(c15304rM9410b);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // io.sentry.InterfaceC15122F0
    public final void start() {
        InterfaceC15284o c15278i;
        if (this.f47664v0.get()) {
            if (this.f47665w0.getAndSet(true)) {
                C15524y1 c15524y1 = this.f47657o0;
                if (c15524y1 != null) {
                    c15524y1.getLogger().mo16298o(EnumC15375i1.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                    return;
                } else {
                    AbstractC16544l.m18103p("options");
                    throw null;
                }
            }
            C17314q c17314q = this.f47661s0;
            C15501f c15501f = (C15501f) c17314q.getValue();
            C15524y1 c15524y2 = this.f47657o0;
            if (c15524y2 == null) {
                AbstractC16544l.m18103p("options");
                throw null;
            }
            Double d10 = c15524y2.getExperimental().f48340a.f47049a;
            AbstractC16544l.m18094g(c15501f, "<this>");
            boolean z6 = d10 != null && d10.doubleValue() >= c15501f.m16686b();
            if (!z6) {
                C15524y1 c15524y3 = this.f47657o0;
                if (c15524y3 == null) {
                    AbstractC16544l.m18103p("options");
                    throw null;
                }
                Double d11 = c15524y3.getExperimental().f48340a.f47050b;
                if (d11 == null || d11.doubleValue() <= 0.0d) {
                    C15524y1 c15524y4 = this.f47657o0;
                    if (c15524y4 != null) {
                        c15524y4.getLogger().mo16298o(EnumC15375i1.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                        return;
                    } else {
                        AbstractC16544l.m18103p("options");
                        throw null;
                    }
                }
            }
            C15524y1 c15524y5 = this.f47657o0;
            if (c15524y5 == null) {
                AbstractC16544l.m18103p("options");
                throw null;
            }
            C15114C1 c15114c1 = c15524y5.getExperimental().f48340a;
            AbstractC16544l.m18093f(c15114c1, "options.experimental.sessionReplay");
            C15304r c15304rM9410b = AbstractC8704r3.m9410b(this.f47655Y, c15114c1);
            C17314q c17314q2 = this.f47663u0;
            if (z6) {
                C15524y1 c15524y6 = this.f47657o0;
                if (c15524y6 == null) {
                    AbstractC16544l.m18103p("options");
                    throw null;
                }
                C15109B c15109b = this.f47658p0;
                ScheduledExecutorService replayExecutor = (ScheduledExecutorService) c17314q2.getValue();
                AbstractC16544l.m18093f(replayExecutor, "replayExecutor");
                c15278i = new C15287r(c15524y6, c15109b, this.f47656Z, replayExecutor, null);
            } else {
                C15524y1 c15524y7 = this.f47657o0;
                if (c15524y7 == null) {
                    AbstractC16544l.m18103p("options");
                    throw null;
                }
                C15109B c15109b2 = this.f47658p0;
                C15501f c15501f2 = (C15501f) c17314q.getValue();
                ScheduledExecutorService replayExecutor2 = (ScheduledExecutorService) c17314q2.getValue();
                AbstractC16544l.m18093f(replayExecutor2, "replayExecutor");
                c15278i = new C15278i(c15524y7, c15109b2, this.f47656Z, c15501f2, replayExecutor2);
            }
            this.f47666x0 = c15278i;
            c15278i.mo16497c(c15304rM9410b, 0, new C15447t((UUID) null), null);
            C15317w c15317w = this.f47659q0;
            if (c15317w != null) {
                c15317w.m16523e(c15304rM9410b);
            }
            boolean z10 = this.f47659q0 instanceof InterfaceC15290f;
            C17314q c17314q3 = this.f47662t0;
            if (z10) {
                C15299m c15299m = ((C15300n) c17314q3.getValue()).f47793o0;
                C15317w c15317w2 = this.f47659q0;
                AbstractC16544l.m18092e(c15317w2, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                c15299m.add(c15317w2);
            }
            ((C15300n) c17314q3.getValue()).f47793o0.add(this.f47660r0);
        }
    }

    @Override // io.sentry.InterfaceC15122F0
    public final void stop() {
        if (this.f47664v0.get() && this.f47665w0.get()) {
            if (this.f47659q0 instanceof InterfaceC15290f) {
                C15299m c15299m = ((C15300n) this.f47662t0.getValue()).f47793o0;
                C15317w c15317w = this.f47659q0;
                AbstractC16544l.m18092e(c15317w, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
                c15299m.remove(c15317w);
            }
            ((C15300n) this.f47662t0.getValue()).f47793o0.remove(this.f47660r0);
            C15317w c15317w2 = this.f47659q0;
            if (c15317w2 != null) {
                c15317w2.m16524k();
            }
            C15293b c15293b = this.f47660r0;
            if (c15293b != null) {
                synchronized (c15293b.f47771p0) {
                    try {
                        Iterator it = c15293b.f47770o0.iterator();
                        while (it.hasNext()) {
                            View view = (View) ((WeakReference) it.next()).get();
                            if (view != null) {
                                c15293b.m16515b(view);
                            }
                        }
                        c15293b.f47770o0.clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            InterfaceC15284o interfaceC15284o = this.f47666x0;
            if (interfaceC15284o != null) {
                interfaceC15284o.stop();
            }
            this.f47665w0.set(false);
            this.f47666x0 = null;
        }
    }
}
