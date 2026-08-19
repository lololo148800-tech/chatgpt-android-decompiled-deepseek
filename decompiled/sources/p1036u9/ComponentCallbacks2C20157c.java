package p1036u9;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: u9.c */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C20157c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: q0 */
    public static final ComponentCallbacks2C20157c f63847q0 = new ComponentCallbacks2C20157c();

    /* JADX INFO: renamed from: Y */
    public final AtomicBoolean f63848Y = new AtomicBoolean();

    /* JADX INFO: renamed from: Z */
    public final AtomicBoolean f63849Z = new AtomicBoolean();

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f63850o0 = new ArrayList();

    /* JADX INFO: renamed from: p0 */
    public boolean f63851p0 = false;

    /* JADX INFO: renamed from: b */
    public static void m20974b(Application application) {
        ComponentCallbacks2C20157c componentCallbacks2C20157c = f63847q0;
        synchronized (componentCallbacks2C20157c) {
            try {
                if (!componentCallbacks2C20157c.f63851p0) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C20157c);
                    application.registerComponentCallbacks(componentCallbacks2C20157c);
                    componentCallbacks2C20157c.f63851p0 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20975a(InterfaceC20156b interfaceC20156b) {
        synchronized (f63847q0) {
            this.f63850o0.add(interfaceC20156b);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20976c(boolean z6) {
        synchronized (f63847q0) {
            try {
                Iterator it = this.f63850o0.iterator();
                while (it.hasNext()) {
                    ((InterfaceC20156b) it.next()).mo17790a(z6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f63849Z;
        boolean zCompareAndSet = this.f63848Y.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            m20976c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f63849Z;
        boolean zCompareAndSet = this.f63848Y.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            m20976c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f63848Y.compareAndSet(false, true)) {
            this.f63849Z.set(true);
            m20976c(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
