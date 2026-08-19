package io.sentry.android.core;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.AbstractC15169V0;
import io.sentry.C15109B;
import io.sentry.C15161S1;
import io.sentry.C15164T1;
import io.sentry.C15399k1;
import io.sentry.C15402l1;
import io.sentry.C15508v;
import io.sentry.C15517w0;
import io.sentry.C15524y1;
import io.sentry.EnumC15147N1;
import io.sentry.EnumC15168V;
import io.sentry.EnumC15375i1;
import io.sentry.EnumC15401l0;
import io.sentry.InterfaceC15154Q;
import io.sentry.InterfaceC15159S;
import io.sentry.InterfaceC15171W;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC15234f;
import io.sentry.android.core.performance.C15251d;
import io.sentry.android.core.performance.C15252e;
import io.sentry.android.core.performance.EnumC15250c;
import io.sentry.protocol.EnumC15423C;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p003A1.ViewOnAttachStateChangeListenerC0171H;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8483G3;
import p544W9.AbstractC8692p3;
import p561X.C8990d;
import p741f5.RunnableC13542a;
import p791hj.C14522e;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityLifecycleIntegration implements InterfaceC15171W, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: C0 */
    public final C14522e f47272C0;

    /* JADX INFO: renamed from: Y */
    public final Application f47273Y;

    /* JADX INFO: renamed from: Z */
    public final C15184B f47274Z;

    /* JADX INFO: renamed from: o0 */
    public C15109B f47275o0;

    /* JADX INFO: renamed from: p0 */
    public SentryAndroidOptions f47276p0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f47279s0;

    /* JADX INFO: renamed from: v0 */
    public InterfaceC15154Q f47282v0;

    /* JADX INFO: renamed from: q0 */
    public boolean f47277q0 = false;

    /* JADX INFO: renamed from: r0 */
    public boolean f47278r0 = false;

    /* JADX INFO: renamed from: t0 */
    public boolean f47280t0 = false;

    /* JADX INFO: renamed from: u0 */
    public C15508v f47281u0 = null;

    /* JADX INFO: renamed from: w0 */
    public final WeakHashMap f47283w0 = new WeakHashMap();

    /* JADX INFO: renamed from: x0 */
    public final WeakHashMap f47284x0 = new WeakHashMap();

    /* JADX INFO: renamed from: y0 */
    public AbstractC15169V0 f47285y0 = new C15402l1(new Date(0), 0);

    /* JADX INFO: renamed from: z0 */
    public final Handler f47286z0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: A0 */
    public Future f47270A0 = null;

    /* JADX INFO: renamed from: B0 */
    public final WeakHashMap f47271B0 = new WeakHashMap();

    public ActivityLifecycleIntegration(Application application, C15184B c15184b, C14522e c14522e) {
        this.f47273Y = application;
        this.f47274Z = c15184b;
        this.f47272C0 = c14522e;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f47279s0 = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m16362e(InterfaceC15154Q interfaceC15154Q, InterfaceC15154Q interfaceC15154Q2) {
        if (interfaceC15154Q == null || interfaceC15154Q.mo16274e()) {
            return;
        }
        String description = interfaceC15154Q.getDescription();
        if (description == null || !description.endsWith(" - Deadline Exceeded")) {
            description = interfaceC15154Q.getDescription() + " - Deadline Exceeded";
        }
        interfaceC15154Q.mo16282m(description);
        AbstractC15169V0 abstractC15169V0Mo16289t = interfaceC15154Q2 != null ? interfaceC15154Q2.mo16289t() : null;
        if (abstractC15169V0Mo16289t == null) {
            abstractC15169V0Mo16289t = interfaceC15154Q.mo16292w();
        }
        m16363k(interfaceC15154Q, abstractC15169V0Mo16289t, EnumC15147N1.DEADLINE_EXCEEDED);
    }

    /* JADX INFO: renamed from: k */
    public static void m16363k(InterfaceC15154Q interfaceC15154Q, AbstractC15169V0 abstractC15169V0, EnumC15147N1 enumC15147N1) {
        if (interfaceC15154Q == null || interfaceC15154Q.mo16274e()) {
            return;
        }
        if (enumC15147N1 == null) {
            enumC15147N1 = interfaceC15154Q.mo16270a() != null ? interfaceC15154Q.mo16270a() : EnumC15147N1.OK;
        }
        interfaceC15154Q.mo16290u(enumC15147N1, abstractC15169V0);
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        C15109B c15109b = C15109B.f47017a;
        SentryAndroidOptions sentryAndroidOptions = c15524y1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c15524y1 : null;
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f47276p0 = sentryAndroidOptions;
        this.f47275o0 = c15109b;
        this.f47277q0 = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.f47281u0 = this.f47276p0.getFullyDisplayedReporter();
        this.f47278r0 = this.f47276p0.isEnableTimeToFullDisplayTracing();
        this.f47273Y.registerActivityLifecycleCallbacks(this);
        this.f47276p0.getLogger().mo16298o(EnumC15375i1.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        AbstractC8471E3.m9104b("ActivityLifecycle");
    }

    /* JADX INFO: renamed from: P */
    public final void m16364P(InterfaceC15154Q interfaceC15154Q, InterfaceC15154Q interfaceC15154Q2) {
        C15251d c15251dM16451b = C15251d.m16451b();
        C15252e c15252e = c15251dM16451b.f47608o0;
        if (c15252e.m16457b() && c15252e.m16456a()) {
            c15252e.f47619p0 = SystemClock.uptimeMillis();
        }
        C15252e c15252e2 = c15251dM16451b.f47609p0;
        if (c15252e2.m16457b() && c15252e2.m16456a()) {
            c15252e2.f47619p0 = SystemClock.uptimeMillis();
        }
        m16367a();
        SentryAndroidOptions sentryAndroidOptions = this.f47276p0;
        if (sentryAndroidOptions == null || interfaceC15154Q2 == null) {
            if (interfaceC15154Q2 == null || interfaceC15154Q2.mo16274e()) {
                return;
            }
            interfaceC15154Q2.mo16271b();
            return;
        }
        AbstractC15169V0 abstractC15169V0Mo16338a = sentryAndroidOptions.getDateProvider().mo16338a();
        long millis = TimeUnit.NANOSECONDS.toMillis(abstractC15169V0Mo16338a.mo16354b(interfaceC15154Q2.mo16292w()));
        Long lValueOf = Long.valueOf(millis);
        EnumC15401l0 enumC15401l0 = EnumC15401l0.MILLISECOND;
        interfaceC15154Q2.mo16287r("time_to_initial_display", lValueOf, enumC15401l0);
        if (interfaceC15154Q != null && interfaceC15154Q.mo16274e()) {
            interfaceC15154Q.mo16276g(abstractC15169V0Mo16338a);
            interfaceC15154Q2.mo16287r("time_to_full_display", Long.valueOf(millis), enumC15401l0);
        }
        m16363k(interfaceC15154Q2, abstractC15169V0Mo16338a, null);
    }

    /* JADX INFO: renamed from: S */
    public final void m16365S(Bundle bundle) {
        SentryAndroidOptions sentryAndroidOptions;
        if (this.f47275o0 != null && this.f47285y0.mo16356d() == 0) {
            this.f47285y0 = this.f47275o0.mo16246j().getDateProvider().mo16338a();
        } else if (this.f47285y0.mo16356d() == 0) {
            AbstractC15218i.f47483a.getClass();
            this.f47285y0 = new C15402l1();
        }
        if (this.f47280t0 || (sentryAndroidOptions = this.f47276p0) == null || sentryAndroidOptions.isEnablePerformanceV2()) {
            return;
        }
        C15251d.m16451b().f47606Y = bundle == null ? EnumC15250c.COLD : EnumC15250c.WARM;
    }

    /* JADX INFO: renamed from: T */
    public final void m16366T(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        Boolean boolValueOf;
        C15399k1 c15399k1;
        AbstractC15169V0 abstractC15169V0;
        WeakReference weakReference = new WeakReference(activity);
        if (this.f47275o0 != null) {
            WeakHashMap weakHashMap3 = this.f47271B0;
            if (weakHashMap3.containsKey(activity)) {
                return;
            }
            if (!this.f47277q0) {
                weakHashMap3.put(activity, C15517w0.f48472a);
                this.f47275o0.mo16253v(new C8990d(22));
                return;
            }
            Iterator it = weakHashMap3.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                weakHashMap = this.f47284x0;
                weakHashMap2 = this.f47283w0;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                m16368m((InterfaceC15159S) entry.getValue(), (InterfaceC15154Q) weakHashMap2.get(entry.getKey()), (InterfaceC15154Q) weakHashMap.get(entry.getKey()));
            }
            String simpleName = activity.getClass().getSimpleName();
            C15252e c15252eM16454a = C15251d.m16451b().m16454a(this.f47276p0);
            if (AbstractC15256t.m16473k() && c15252eM16454a.m16457b()) {
                c15399k1 = c15252eM16454a.m16457b() ? new C15399k1(c15252eM16454a.f47617Z * 1000000) : null;
                boolValueOf = Boolean.valueOf(C15251d.m16451b().f47606Y == EnumC15250c.COLD);
            } else {
                boolValueOf = null;
                c15399k1 = null;
            }
            C15164T1 c15164t1 = new C15164T1();
            c15164t1.f47223s0 = 30000L;
            if (this.f47276p0.isEnableActivityLifecycleTracingAutoFinish()) {
                c15164t1.f47222r0 = this.f47276p0.getIdleTimeout();
                c15164t1.f1278Z = true;
            }
            c15164t1.f47221q0 = true;
            c15164t1.f47224t0 = new C15216g(this, weakReference, simpleName);
            if (this.f47280t0 || c15399k1 == null || boolValueOf == null) {
                abstractC15169V0 = this.f47285y0;
            } else {
                C15251d.m16451b().getClass();
                C15251d.m16451b().getClass();
                abstractC15169V0 = c15399k1;
            }
            c15164t1.f47219o0 = abstractC15169V0;
            c15164t1.f47220p0 = false;
            InterfaceC15159S interfaceC15159SMo16251t = this.f47275o0.mo16251t(new C15161S1(simpleName, EnumC15423C.COMPONENT, "ui.load", null), c15164t1);
            if (interfaceC15159SMo16251t != null) {
                interfaceC15159SMo16251t.mo16288s().f47152u0 = "auto.ui.activity";
            }
            if (!this.f47280t0 && c15399k1 != null && boolValueOf != null) {
                InterfaceC15154Q interfaceC15154QMo16279j = interfaceC15159SMo16251t.mo16279j(boolValueOf.booleanValue() ? "app.start.cold" : "app.start.warm", boolValueOf.booleanValue() ? "Cold Start" : "Warm Start", c15399k1, EnumC15168V.SENTRY);
                this.f47282v0 = interfaceC15154QMo16279j;
                interfaceC15154QMo16279j.mo16288s().f47152u0 = "auto.ui.activity";
                m16367a();
            }
            String strConcat = simpleName.concat(" initial display");
            EnumC15168V enumC15168V = EnumC15168V.SENTRY;
            InterfaceC15154Q interfaceC15154QMo16279j2 = interfaceC15159SMo16251t.mo16279j("ui.load.initial_display", strConcat, abstractC15169V0, enumC15168V);
            weakHashMap2.put(activity, interfaceC15154QMo16279j2);
            interfaceC15154QMo16279j2.mo16288s().f47152u0 = "auto.ui.activity";
            if (this.f47278r0 && this.f47281u0 != null && this.f47276p0 != null) {
                InterfaceC15154Q interfaceC15154QMo16279j3 = interfaceC15159SMo16251t.mo16279j("ui.load.full_display", simpleName.concat(" full display"), abstractC15169V0, enumC15168V);
                interfaceC15154QMo16279j3.mo16288s().f47152u0 = "auto.ui.activity";
                try {
                    weakHashMap.put(activity, interfaceC15154QMo16279j3);
                    this.f47270A0 = this.f47276p0.getExecutorService().mo15970r(new RunnableC15214e(this, interfaceC15154QMo16279j3, interfaceC15154QMo16279j2, 2), 25000L);
                } catch (RejectedExecutionException e10) {
                    this.f47276p0.getLogger().mo16297h(EnumC15375i1.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e10);
                }
            }
            this.f47275o0.mo16253v(new C15215f(this, interfaceC15159SMo16251t, 1));
            weakHashMap3.put(activity, interfaceC15159SMo16251t);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16367a() {
        C15399k1 c15399k1;
        C15252e c15252eM16454a = C15251d.m16451b().m16454a(this.f47276p0);
        if (c15252eM16454a.m16458c()) {
            long j10 = 0;
            if (c15252eM16454a.m16457b()) {
                j10 = (c15252eM16454a.m16458c() ? c15252eM16454a.f47619p0 - c15252eM16454a.f47618o0 : 0L) + c15252eM16454a.f47617Z;
            }
            c15399k1 = new C15399k1(j10 * 1000000);
        } else {
            c15399k1 = null;
        }
        if (!this.f47277q0 || c15399k1 == null) {
            return;
        }
        m16363k(this.f47282v0, c15399k1, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47273Y.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f47276p0;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        C14522e c14522e = this.f47272C0;
        synchronized (c14522e) {
            try {
                if (c14522e.m16027u()) {
                    c14522e.m16031y(new RunnableC13542a(c14522e, 5), "FrameMetricsAggregator.stop");
                    ((FrameMetricsAggregator) c14522e.f45761Y).f32883a.mo17942m();
                }
                ((ConcurrentHashMap) c14522e.f45763o0).clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m16368m(InterfaceC15159S interfaceC15159S, InterfaceC15154Q interfaceC15154Q, InterfaceC15154Q interfaceC15154Q2) {
        if (interfaceC15159S == null || interfaceC15159S.mo16274e()) {
            return;
        }
        EnumC15147N1 enumC15147N1 = EnumC15147N1.DEADLINE_EXCEEDED;
        if (interfaceC15154Q != null && !interfaceC15154Q.mo16274e()) {
            interfaceC15154Q.mo16278i(enumC15147N1);
        }
        m16362e(interfaceC15154Q2, interfaceC15154Q);
        Future future = this.f47270A0;
        if (future != null) {
            future.cancel(false);
            this.f47270A0 = null;
        }
        EnumC15147N1 enumC15147N1Mo16270a = interfaceC15159S.mo16270a();
        if (enumC15147N1Mo16270a == null) {
            enumC15147N1Mo16270a = EnumC15147N1.OK;
        }
        interfaceC15159S.mo16278i(enumC15147N1Mo16270a);
        C15109B c15109b = this.f47275o0;
        if (c15109b != null) {
            c15109b.mo16253v(new C15215f(this, interfaceC15159S, 0));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        C15508v c15508v;
        SentryAndroidOptions sentryAndroidOptions;
        try {
            m16365S(bundle);
            if (this.f47275o0 != null && (sentryAndroidOptions = this.f47276p0) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                this.f47275o0.mo16253v(new C15213d(AbstractC8692p3.m9388a(activity), 0));
            }
            m16366T(activity);
            InterfaceC15154Q interfaceC15154Q = (InterfaceC15154Q) this.f47284x0.get(activity);
            this.f47280t0 = true;
            if (this.f47277q0 && interfaceC15154Q != null && (c15508v = this.f47281u0) != null) {
                c15508v.f48433a.add(new C8990d(19));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
        try {
            if (this.f47277q0) {
                InterfaceC15154Q interfaceC15154Q = this.f47282v0;
                EnumC15147N1 enumC15147N1 = EnumC15147N1.CANCELLED;
                if (interfaceC15154Q != null && !interfaceC15154Q.mo16274e()) {
                    interfaceC15154Q.mo16278i(enumC15147N1);
                }
                InterfaceC15154Q interfaceC15154Q2 = (InterfaceC15154Q) this.f47283w0.get(activity);
                InterfaceC15154Q interfaceC15154Q3 = (InterfaceC15154Q) this.f47284x0.get(activity);
                EnumC15147N1 enumC15147N2 = EnumC15147N1.DEADLINE_EXCEEDED;
                if (interfaceC15154Q2 != null && !interfaceC15154Q2.mo16274e()) {
                    interfaceC15154Q2.mo16278i(enumC15147N2);
                }
                m16362e(interfaceC15154Q3, interfaceC15154Q2);
                Future future = this.f47270A0;
                if (future != null) {
                    future.cancel(false);
                    this.f47270A0 = null;
                }
                if (this.f47277q0) {
                    m16368m((InterfaceC15159S) this.f47271B0.get(activity), null, null);
                }
                this.f47282v0 = null;
                this.f47283w0.remove(activity);
                this.f47284x0.remove(activity);
            }
            this.f47271B0.remove(activity);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        try {
            if (!this.f47279s0) {
                this.f47280t0 = true;
                C15109B c15109b = this.f47275o0;
                if (c15109b == null) {
                    AbstractC15218i.f47483a.getClass();
                    this.f47285y0 = new C15402l1();
                } else {
                    this.f47285y0 = c15109b.mo16246j().getDateProvider().mo16338a();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        if (this.f47279s0) {
            this.f47280t0 = true;
            C15109B c15109b = this.f47275o0;
            if (c15109b != null) {
                this.f47285y0 = c15109b.mo16246j().getDateProvider().mo16338a();
            } else {
                AbstractC15218i.f47483a.getClass();
                this.f47285y0 = new C15402l1();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f47277q0) {
                InterfaceC15154Q interfaceC15154Q = (InterfaceC15154Q) this.f47283w0.get(activity);
                InterfaceC15154Q interfaceC15154Q2 = (InterfaceC15154Q) this.f47284x0.get(activity);
                View viewFindViewById = activity.findViewById(R.id.content);
                if (viewFindViewById != null) {
                    RunnableC15214e runnableC15214e = new RunnableC15214e(this, interfaceC15154Q2, interfaceC15154Q, 0);
                    C15184B c15184b = this.f47274Z;
                    ViewTreeObserverOnDrawListenerC15234f viewTreeObserverOnDrawListenerC15234f = new ViewTreeObserverOnDrawListenerC15234f(viewFindViewById, runnableC15214e);
                    c15184b.getClass();
                    if (Build.VERSION.SDK_INT >= 26 || (viewFindViewById.getViewTreeObserver().isAlive() && viewFindViewById.isAttachedToWindow())) {
                        viewFindViewById.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC15234f);
                    } else {
                        viewFindViewById.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0171H(viewTreeObserverOnDrawListenerC15234f, 5));
                    }
                } else {
                    this.f47286z0.post(new RunnableC15214e(this, interfaceC15154Q2, interfaceC15154Q, 1));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (this.f47277q0) {
            this.f47272C0.m16011a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
    }
}
