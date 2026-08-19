package com.statsig.androidsdk;

import android.app.Activity;
import android.app.Application;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u0016J\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010%¨\u0006)"}, m18067d2 = {"Lcom/statsig/androidsdk/StatsigActivityLifecycleListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Application;", SIPServerTransaction.CONTENT_TYPE_APPLICATION, "Lcom/statsig/androidsdk/LifecycleEventListener;", "listener", "<init>", "(Landroid/app/Application;Lcom/statsig/androidsdk/LifecycleEventListener;)V", "", "isApplicationVisible", "()Z", "isApplicationInForeground", "Lmm/C;", "shutdown", "()V", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Landroid/app/Application;", "Lcom/statsig/androidsdk/LifecycleEventListener;", "currentActivity", "Landroid/app/Activity;", "", "resumed", TokenNames.f32012I, "paused", "started", "stopped", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class StatsigActivityLifecycleListener implements Application.ActivityLifecycleCallbacks {
    private final Application application;
    private Activity currentActivity;
    private final LifecycleEventListener listener;
    private int paused;
    private int resumed;
    private int started;
    private int stopped;

    public StatsigActivityLifecycleListener(Application application, LifecycleEventListener listener) {
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(listener, "listener");
        this.application = application;
        this.listener = listener;
        application.registerActivityLifecycleCallbacks(this);
    }

    private final boolean isApplicationInForeground() {
        return this.resumed > this.paused;
    }

    private final boolean isApplicationVisible() {
        return this.started > this.stopped;
    }

    public final Activity getCurrentActivity() {
        return this.currentActivity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        AbstractC16544l.m18094g(activity, "activity");
        this.currentActivity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        this.currentActivity = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        this.paused++;
        if (isApplicationInForeground()) {
            return;
        }
        this.listener.onAppBlur();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        this.currentActivity = activity;
        this.resumed++;
        this.listener.onAppFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        this.started++;
        this.currentActivity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        this.stopped++;
        this.currentActivity = null;
        if (isApplicationVisible()) {
            return;
        }
        this.listener.onAppBlur();
    }

    public final void shutdown() {
        this.application.unregisterActivityLifecycleCallbacks(this);
    }
}
