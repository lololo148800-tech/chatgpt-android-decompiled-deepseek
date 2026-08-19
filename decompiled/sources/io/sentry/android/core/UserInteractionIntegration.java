package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.C15109B;
import io.sentry.C15524y1;
import io.sentry.EnumC15147N1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15171W;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC15224f;
import io.sentry.android.core.internal.gestures.WindowCallbackC15220b;
import io.sentry.android.core.internal.gestures.WindowCallbackC15225g;
import java.io.Closeable;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8483G3;

/* JADX INFO: loaded from: classes3.dex */
public final class UserInteractionIntegration implements InterfaceC15171W, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Y */
    public final Application f47412Y;

    /* JADX INFO: renamed from: Z */
    public C15109B f47413Z;

    /* JADX INFO: renamed from: o0 */
    public SentryAndroidOptions f47414o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f47415p0 = C15198P.m16403a(this.f47414o0, "androidx.core.view.GestureDetectorCompat");

    public UserInteractionIntegration(Application application) {
        this.f47412Y = application;
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        C15109B c15109b = C15109B.f47017a;
        SentryAndroidOptions sentryAndroidOptions = c15524y1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c15524y1 : null;
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f47414o0 = sentryAndroidOptions;
        this.f47413Z = c15109b;
        boolean z6 = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.f47414o0.isEnableUserInteractionTracing();
        InterfaceC15127H logger = this.f47414o0.getLogger();
        EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
        logger.mo16298o(enumC15375i1, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z6));
        if (z6) {
            if (!this.f47415p0) {
                c15524y1.getLogger().mo16298o(EnumC15375i1.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f47412Y.registerActivityLifecycleCallbacks(this);
            this.f47414o0.getLogger().mo16298o(enumC15375i1, "UserInteractionIntegration installed.", new Object[0]);
            AbstractC8471E3.m9104b("UserInteraction");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f47412Y.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f47414o0;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f47414o0;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC15225g) {
            WindowCallbackC15225g windowCallbackC15225g = (WindowCallbackC15225g) callback;
            windowCallbackC15225g.f47500o0.m16431e(EnumC15147N1.CANCELLED);
            Window.Callback callback2 = windowCallbackC15225g.f47499Z;
            if (callback2 instanceof WindowCallbackC15220b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f47414o0;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo16298o(EnumC15375i1.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f47413Z == null || this.f47414o0 == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new WindowCallbackC15220b();
        }
        window.setCallback(new WindowCallbackC15225g(callback, activity, new GestureDetectorOnGestureListenerC15224f(activity, this.f47413Z, this.f47414o0), this.f47414o0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
