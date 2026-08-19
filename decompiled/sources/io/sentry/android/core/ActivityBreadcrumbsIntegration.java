package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.C15109B;
import io.sentry.C15345d;
import io.sentry.C15516w;
import io.sentry.C15524y1;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import io.sentry.InterfaceC15171W;
import java.io.Closeable;
import p544W9.AbstractC8471E3;
import p544W9.AbstractC8483G3;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityBreadcrumbsIntegration implements InterfaceC15171W, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Y */
    public final Application f47267Y;

    /* JADX INFO: renamed from: Z */
    public C15109B f47268Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f47269o0;

    public ActivityBreadcrumbsIntegration(Application application) {
        this.f47267Y = application;
    }

    @Override // io.sentry.InterfaceC15171W
    /* JADX INFO: renamed from: E */
    public final void mo16343E(C15524y1 c15524y1) {
        C15109B c15109b = C15109B.f47017a;
        SentryAndroidOptions sentryAndroidOptions = c15524y1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c15524y1 : null;
        AbstractC8483G3.m9133c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f47268Z = c15109b;
        this.f47269o0 = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        InterfaceC15127H logger = c15524y1.getLogger();
        EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
        logger.mo16298o(enumC15375i1, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f47269o0));
        if (this.f47269o0) {
            this.f47267Y.registerActivityLifecycleCallbacks(this);
            c15524y1.getLogger().mo16298o(enumC15375i1, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            AbstractC8471E3.m9104b("ActivityBreadcrumbs");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16361a(Activity activity, String str) {
        if (this.f47268Z == null) {
            return;
        }
        C15345d c15345d = new C15345d();
        c15345d.f47907p0 = "navigation";
        c15345d.m16574b(str, "state");
        c15345d.m16574b(activity.getClass().getSimpleName(), "screen");
        c15345d.f47909r0 = "ui.lifecycle";
        c15345d.f47911t0 = EnumC15375i1.INFO;
        C15516w c15516w = new C15516w();
        c15516w.m16729c("android:activity", activity);
        this.f47268Z.mo16252u(c15345d, c15516w);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f47269o0) {
            this.f47267Y.unregisterActivityLifecycleCallbacks(this);
            C15109B c15109b = this.f47268Z;
            if (c15109b != null) {
                c15109b.mo16246j().getLogger().mo16298o(EnumC15375i1.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        m16361a(activity, "created");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
        m16361a(activity, "destroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        m16361a(activity, "paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        m16361a(activity, "resumed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m16361a(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        m16361a(activity, "started");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        m16361a(activity, "stopped");
    }
}
