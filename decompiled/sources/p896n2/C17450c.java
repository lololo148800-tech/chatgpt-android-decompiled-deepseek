package p896n2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.android.core.RunnableC15195M;

/* JADX INFO: renamed from: n2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17450c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Y */
    public Object f55787Y;

    /* JADX INFO: renamed from: Z */
    public Activity f55788Z;

    /* JADX INFO: renamed from: o0 */
    public final int f55789o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f55790p0 = false;

    /* JADX INFO: renamed from: q0 */
    public boolean f55791q0 = false;

    /* JADX INFO: renamed from: r0 */
    public boolean f55792r0 = false;

    public C17450c(Activity activity) {
        this.f55788Z = activity;
        this.f55789o0 = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f55788Z == activity) {
            this.f55788Z = null;
            this.f55791q0 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f55791q0 || this.f55792r0 || this.f55790p0) {
            return;
        }
        Object obj = this.f55787Y;
        try {
            Object obj2 = AbstractC17451d.f55795c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f55789o0) {
                AbstractC17451d.f55799g.postAtFrontOfQueue(new RunnableC15195M(AbstractC17451d.f55794b.get(activity), obj2, false, 10));
                this.f55792r0 = true;
                this.f55787Y = null;
            }
        } catch (Throwable th2) {
            AbstractC15256t.m16466d("ActivityRecreator", "Exception while fetching field values", th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f55788Z == activity) {
            this.f55790p0 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
