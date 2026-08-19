package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import com.auth0.android.request.internal.RunnableC11843b;
import io.sentry.EnumC15375i1;
import io.sentry.android.core.C15184B;
import io.sentry.android.core.C15198P;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C15240l implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: B0 */
    public static final /* synthetic */ int f47552B0 = 0;

    /* JADX INFO: renamed from: Y */
    public final C15184B f47554Y;

    /* JADX INFO: renamed from: Z */
    public final CopyOnWriteArraySet f47555Z;

    /* JADX INFO: renamed from: o0 */
    public final C15198P f47556o0;

    /* JADX INFO: renamed from: p0 */
    public final Handler f47557p0;

    /* JADX INFO: renamed from: q0 */
    public WeakReference f47558q0;

    /* JADX INFO: renamed from: r0 */
    public final ConcurrentHashMap f47559r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f47560s0;

    /* JADX INFO: renamed from: t0 */
    public final C15230b f47561t0;

    /* JADX INFO: renamed from: u0 */
    public final WindowOnFrameMetricsAvailableListenerC15237i f47562u0;

    /* JADX INFO: renamed from: v0 */
    public Choreographer f47563v0;

    /* JADX INFO: renamed from: w0 */
    public final Field f47564w0;

    /* JADX INFO: renamed from: x0 */
    public long f47565x0;

    /* JADX INFO: renamed from: y0 */
    public long f47566y0;

    /* JADX INFO: renamed from: z0 */
    public static final long f47553z0 = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: A0 */
    public static final long f47551A0 = TimeUnit.MILLISECONDS.toNanos(700);

    /* JADX WARN: Type inference failed for: r4v5, types: [io.sentry.android.core.internal.util.i] */
    public C15240l(Context context, final C15198P c15198p, final C15184B c15184b) {
        C15230b c15230b = new C15230b();
        this.f47555Z = new CopyOnWriteArraySet();
        this.f47559r0 = new ConcurrentHashMap();
        this.f47560s0 = false;
        this.f47565x0 = 0L;
        this.f47566y0 = 0L;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f47556o0 = c15198p;
        this.f47554Y = c15184b;
        this.f47561t0 = c15230b;
        if ((context instanceof Application) && Build.VERSION.SDK_INT >= 24) {
            this.f47560s0 = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.j
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    c15198p.mo16297h(EnumC15375i1.ERROR, "Error during frames measurements.", th2);
                }
            });
            handlerThread.start();
            this.f47557p0 = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new RunnableC11843b(this, 15, c15198p));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f47564w0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                c15198p.mo16297h(EnumC15375i1.ERROR, "Unable to get the frame timestamp from the choreographer: ", e10);
            }
            this.f47562u0 = new Window$OnFrameMetricsAvailableListener(c15184b) { // from class: io.sentry.android.core.internal.util.i
                /* JADX WARN: Code duplicated, block: B:17:0x0079  */
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                    long jLongValue;
                    Field field;
                    C15240l c15240l = this.f47549a;
                    c15240l.getClass();
                    long jNanoTime = System.nanoTime();
                    int i11 = Build.VERSION.SDK_INT;
                    float refreshRate = i11 >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
                    float f10 = C15240l.f47553z0;
                    long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
                    long jMax = Math.max(0L, metric - ((long) (f10 / refreshRate)));
                    c15240l.f47554Y.getClass();
                    if (i11 >= 26) {
                        jLongValue = frameMetrics.getMetric(10);
                    } else {
                        Choreographer choreographer = c15240l.f47563v0;
                        if (choreographer == null || (field = c15240l.f47564w0) == null) {
                            jLongValue = -1;
                        } else {
                            try {
                                Long l4 = (Long) field.get(choreographer);
                                if (l4 != null) {
                                    jLongValue = l4.longValue();
                                } else {
                                    jLongValue = -1;
                                }
                            } catch (IllegalAccessException unused) {
                            }
                        }
                    }
                    if (jLongValue < 0) {
                        jLongValue = jNanoTime - metric;
                    }
                    long jMax2 = Math.max(jLongValue, c15240l.f47566y0);
                    if (jMax2 == c15240l.f47565x0) {
                        return;
                    }
                    c15240l.f47565x0 = jMax2;
                    c15240l.f47566y0 = jMax2 + metric;
                    boolean z6 = metric > ((long) (f10 / (refreshRate - 1.0f)));
                    boolean z10 = z6 && metric > C15240l.f47551A0;
                    Iterator it = c15240l.f47559r0.values().iterator();
                    while (it.hasNext()) {
                        ((InterfaceC15239k) it.next()).mo16417b(jMax2, c15240l.f47566y0, metric, jMax, z6, z10, refreshRate);
                    }
                }
            };
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16441a(String str) {
        if (this.f47560s0) {
            ConcurrentHashMap concurrentHashMap = this.f47559r0;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.f47558q0;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            m16442b(window);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16442b(Window window) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f47555Z;
        if (copyOnWriteArraySet.contains(window)) {
            this.f47554Y.getClass();
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    C15230b c15230b = this.f47561t0;
                    WindowOnFrameMetricsAvailableListenerC15237i windowOnFrameMetricsAvailableListenerC15237i = this.f47562u0;
                    c15230b.getClass();
                    window.removeOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC15237i);
                } catch (Exception e10) {
                    this.f47556o0.mo16297h(EnumC15375i1.ERROR, "Failed to remove frameMetricsAvailableListener", e10);
                }
            }
            copyOnWriteArraySet.remove(window);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m16443c() {
        Handler handler;
        WeakReference weakReference = this.f47558q0;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.f47560s0) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.f47555Z;
        if (copyOnWriteArraySet.contains(window) || this.f47559r0.isEmpty()) {
            return;
        }
        this.f47554Y.getClass();
        if (Build.VERSION.SDK_INT < 24 || (handler = this.f47557p0) == null) {
            return;
        }
        copyOnWriteArraySet.add(window);
        WindowOnFrameMetricsAvailableListenerC15237i windowOnFrameMetricsAvailableListenerC15237i = this.f47562u0;
        this.f47561t0.getClass();
        window.addOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC15237i, handler);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.f47558q0;
        if (weakReference == null || weakReference.get() != window) {
            this.f47558q0 = new WeakReference(window);
            m16443c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m16442b(activity.getWindow());
        WeakReference weakReference = this.f47558q0;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f47558q0 = null;
    }
}
