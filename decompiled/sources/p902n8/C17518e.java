package p902n8;

import android.app.Activity;
import android.app.Application;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import p1027tp.AbstractC20064h;
import p1120y4.C21380g;
import p1145z7.C21807d;
import p1145z7.InterfaceC21808e;
import p165G9.C3024j;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p858ko.C16482A;
import p896n2.WindowOnFrameMetricsAvailableListenerC17455h;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: n8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C17518e implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: w0 */
    public static final double f56031w0 = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: Y */
    public final InterfaceC17524k f56032Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC11256c f56033Z;

    /* JADX INFO: renamed from: o0 */
    public final C17519f f56034o0;

    /* JADX INFO: renamed from: p0 */
    public double f56035p0;

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC21808e f56036q0;

    /* JADX INFO: renamed from: r0 */
    public final WeakHashMap f56037r0;

    /* JADX INFO: renamed from: s0 */
    public final WeakHashMap f56038s0;

    /* JADX INFO: renamed from: t0 */
    public Display f56039t0;

    /* JADX INFO: renamed from: u0 */
    public WindowOnFrameMetricsAvailableListenerC17455h f56040u0;

    /* JADX INFO: renamed from: v0 */
    public long f56041v0;

    public C17518e(InterfaceC17524k vitalObserver, InterfaceC11256c internalLogger) {
        C17519f c17519f = C17520g.f56042a;
        InterfaceC21808e.f69170n0.getClass();
        C3024j c3024j = C21807d.f69169b;
        AbstractC16544l.m18094g(vitalObserver, "vitalObserver");
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f56032Y = vitalObserver;
        this.f56033Z = internalLogger;
        this.f56034o0 = c17519f;
        this.f56035p0 = 60.0d;
        this.f56036q0 = c3024j;
        this.f56037r0 = new WeakHashMap();
        this.f56038s0 = new WeakHashMap();
        this.f56041v0 = 16666666L;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC16544l.m18094g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        WeakHashMap weakHashMap = this.f56038s0;
        Collection collection = (Collection) weakHashMap.get(activity.getWindow());
        if (collection == null || collection.isEmpty()) {
            this.f56037r0.remove(activity.getWindow());
            weakHashMap.remove(activity.getWindow());
            if (((C3024j) this.f56036q0).f9112Z >= 31) {
                Window window = activity.getWindow();
                AbstractC16544l.m18093f(window, "activity.window");
                try {
                    window.removeOnFrameMetricsAvailableListener(AbstractC20064h.m20901e(this.f56040u0));
                } catch (IllegalArgumentException e10) {
                    AbstractC7889G0.m8184b(this.f56033Z, 5, EnumC11255b.f34099Z, C17516c.f56026u0, e10, false, 48);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        boolean z6;
        C21380g c21380g;
        AbstractC16544l.m18094g(activity, "activity");
        Window window = activity.getWindow();
        AbstractC16544l.m18093f(window, "window");
        WeakHashMap weakHashMap = this.f56038s0;
        List arrayList = (List) weakHashMap.get(window);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(new WeakReference(activity));
        weakHashMap.put(window, arrayList);
        WeakHashMap weakHashMap2 = this.f56037r0;
        boolean zContainsKey = weakHashMap2.containsKey(window);
        C21380g c21380g2 = (C21380g) weakHashMap2.get(window);
        EnumC11255b enumC11255b = EnumC11255b.f34099Z;
        if (c21380g2 != null) {
            z6 = true;
            AbstractC7889G0.m8184b(this.f56033Z, 2, enumC11255b, new C17517d(window, 1), null, false, 56);
            c21380g2.f67873b.mo21764c(true);
            c21380g2.f67874c = true;
        } else {
            z6 = true;
            AbstractC7889G0.m8184b(this.f56033Z, 2, enumC11255b, new C17517d(window, 2), null, false, 56);
            this.f56034o0.getClass();
            InterfaceC11256c internalLogger = this.f56033Z;
            AbstractC16544l.m18094g(internalLogger, "internalLogger");
            try {
                c21380g = new C21380g(window, this);
            } catch (IllegalStateException e10) {
                AbstractC7889G0.m8184b(internalLogger, 5, enumC11255b, C17516c.f56027v0, e10, false, 48);
                c21380g = null;
            }
            if (c21380g == null) {
                AbstractC7889G0.m8184b(this.f56033Z, 4, enumC11255b, C17516c.f56025t0, null, false, 56);
            } else {
                weakHashMap2.put(window, c21380g);
            }
        }
        int i10 = ((C3024j) this.f56036q0).f9112Z;
        if (i10 < 31 || zContainsKey) {
            if (this.f56039t0 == null && i10 == 30) {
                Object systemService = activity.getSystemService("display");
                AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
                this.f56039t0 = ((DisplayManager) systemService).getDisplay(0);
                return;
            }
            return;
        }
        if (this.f56040u0 == null) {
            this.f56040u0 = new WindowOnFrameMetricsAvailableListenerC17455h(this, 1);
        }
        Handler handler = new Handler(Looper.getMainLooper());
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null || viewPeekDecorView.isHardwareAccelerated() != z6) {
            AbstractC7889G0.m8184b(this.f56033Z, 4, enumC11255b, C17516c.f56024s0, null, false, 56);
            return;
        }
        WindowOnFrameMetricsAvailableListenerC17455h windowOnFrameMetricsAvailableListenerC17455h = this.f56040u0;
        if (windowOnFrameMetricsAvailableListenerC17455h != null) {
            try {
                window.addOnFrameMetricsAvailableListener(AbstractC20064h.m20901e(windowOnFrameMetricsAvailableListenerC17455h), handler);
            } catch (IllegalStateException e11) {
                AbstractC7889G0.m8184b(this.f56033Z, 5, enumC11255b, C17516c.f56023r0, e11, false, 48);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        EnumC11255b enumC11255b = EnumC11255b.f34100o0;
        AbstractC16544l.m18094g(activity, "activity");
        Window window = activity.getWindow();
        WeakHashMap weakHashMap = this.f56038s0;
        boolean zContainsKey = weakHashMap.containsKey(window);
        EnumC11255b enumC11255b2 = EnumC11255b.f34099Z;
        if (!zContainsKey) {
            AbstractC7889G0.m8184b(this.f56033Z, 4, enumC11255b2, C17516c.f56019Z, null, false, 56);
        }
        List arrayList = (List) weakHashMap.get(window);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        AbstractC17686t.m19393A(arrayList, new C16482A(activity, 12));
        weakHashMap.put(window, arrayList);
        if (arrayList.isEmpty()) {
            AbstractC7889G0.m8184b(this.f56033Z, 2, enumC11255b2, new C17517d(window, 0), null, false, 56);
            try {
                C21380g c21380g = (C21380g) this.f56037r0.get(window);
                if (c21380g != null) {
                    if (c21380g.f67874c) {
                        c21380g.f67873b.mo21764c(false);
                        c21380g.f67874c = false;
                    } else {
                        AbstractC7889G0.m8184b(this.f56033Z, 5, enumC11255b, C17516c.f56020o0, null, false, 56);
                    }
                }
            } catch (IllegalArgumentException e10) {
                AbstractC7889G0.m8184b(this.f56033Z, 5, enumC11255b, C17516c.f56021p0, e10, false, 48);
            } catch (NullPointerException e11) {
                AbstractC7889G0.m8184b(this.f56033Z, 5, enumC11255b, C17516c.f56022q0, e11, false, 48);
            }
        }
    }
}
