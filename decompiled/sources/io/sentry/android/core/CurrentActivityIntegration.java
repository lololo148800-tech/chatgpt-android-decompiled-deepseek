package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.C15524y1;
import io.sentry.InterfaceC15171W;
import java.io.Closeable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class CurrentActivityIntegration implements InterfaceC15171W, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Y */
    public final Application f47310Y;

    public CurrentActivityIntegration(Application application) {
        this.f47310Y = application;
    }

    /* JADX INFO: renamed from: a */
    public static void m16382a(Activity activity) {
        C15184B c15184b = C15184B.f47304b;
        WeakReference weakReference = (WeakReference) c15184b.f47305a;
        if (weakReference == null || weakReference.get() != activity) {
            c15184b.f47305a = new WeakReference(activity);
        }
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        this.f47310Y.registerActivityLifecycleCallbacks(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47310Y.unregisterActivityLifecycleCallbacks(this);
        C15184B.f47304b.f47305a = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m16382a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C15184B c15184b = C15184B.f47304b;
        WeakReference weakReference = (WeakReference) c15184b.f47305a;
        if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
            c15184b.f47305a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C15184B c15184b = C15184B.f47304b;
        WeakReference weakReference = (WeakReference) c15184b.f47305a;
        if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
            c15184b.f47305a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m16382a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m16382a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C15184B c15184b = C15184B.f47304b;
        WeakReference weakReference = (WeakReference) c15184b.f47305a;
        if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
            c15184b.f47305a = null;
        }
    }
}
