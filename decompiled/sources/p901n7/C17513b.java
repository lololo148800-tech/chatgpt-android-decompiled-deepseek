package p901n7;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: n7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C17513b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC17512a f56009Y;

    /* JADX INFO: renamed from: Z */
    public final AtomicInteger f56010Z = new AtomicInteger(0);

    /* JADX INFO: renamed from: o0 */
    public final AtomicInteger f56011o0 = new AtomicInteger(0);

    /* JADX INFO: renamed from: p0 */
    public final AtomicBoolean f56012p0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: q0 */
    public final AtomicBoolean f56013q0 = new AtomicBoolean(true);

    public C17513b(InterfaceC17512a interfaceC17512a) {
        this.f56009Y = interfaceC17512a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC16544l.m18094g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        if (this.f56010Z.decrementAndGet() != 0 || this.f56012p0.getAndSet(true)) {
            return;
        }
        this.f56009Y.mo5852d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        if (this.f56010Z.incrementAndGet() == 1 && this.f56012p0.getAndSet(false)) {
            this.f56009Y.mo5854h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        if (this.f56011o0.incrementAndGet() == 1 && this.f56013q0.getAndSet(false)) {
            this.f56009Y.mo5853e();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        if (this.f56011o0.decrementAndGet() == 0 && this.f56012p0.get()) {
            this.f56009Y.mo5858m();
            this.f56013q0.set(true);
        }
    }
}
