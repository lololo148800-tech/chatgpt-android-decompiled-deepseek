package fo;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17316s;
import p771go.C14207f;

/* JADX INFO: renamed from: fo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C13704a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Application.ActivityLifecycleCallbacks f43248Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13705b f43249Z;

    public C13704a(C13705b c13705b) {
        this.f43249Z = c13705b;
        Object objNewProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, C14207f.f44620a);
        if (objNewProxyInstance == null) {
            throw new C17316s("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
        }
        this.f43248Y = (Application.ActivityLifecycleCallbacks) objNewProxyInstance;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity p10, Bundle bundle) {
        AbstractC16544l.m18095h(p10, "p0");
        this.f43248Y.onActivityCreated(p10, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC16544l.m18095h(activity, "activity");
        this.f43249Z.f43252c.m15194i(activity, activity.getClass().getName().concat(" received Activity#onDestroy() callback"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity p10) {
        AbstractC16544l.m18095h(p10, "p0");
        this.f43248Y.onActivityPaused(p10);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity p10) {
        AbstractC16544l.m18095h(p10, "p0");
        this.f43248Y.onActivityResumed(p10);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity p10, Bundle p11) {
        AbstractC16544l.m18095h(p10, "p0");
        AbstractC16544l.m18095h(p11, "p1");
        this.f43248Y.onActivitySaveInstanceState(p10, p11);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity p10) {
        AbstractC16544l.m18095h(p10, "p0");
        this.f43248Y.onActivityStarted(p10);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity p10) {
        AbstractC16544l.m18095h(p10, "p0");
        this.f43248Y.onActivityStopped(p10);
    }
}
