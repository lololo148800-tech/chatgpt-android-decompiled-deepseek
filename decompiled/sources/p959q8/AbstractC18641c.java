package p959q8;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p523V9.AbstractC7889G0;
import p592Y7.AbstractC9667b;
import p592Y7.C9673h;
import p661b7.C11254a;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p722e8.C13340x;
import p765g7.InterfaceC13823a;

/* JADX INFO: renamed from: q8.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18641c implements Application.ActivityLifecycleCallbacks, InterfaceC18645g {

    /* JADX INFO: renamed from: Y */
    public InterfaceC13823a f59383Y;

    @Override // p959q8.InterfaceC18645g
    /* JADX INFO: renamed from: a */
    public final void mo15102a(Context context) {
        if (context instanceof Application) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC11256c m20003b() {
        InterfaceC13823a interfaceC13823a = this.f59383Y;
        if (interfaceC13823a == null) {
            InterfaceC11256c.f34102a.getClass();
            return C11254a.f34097b;
        }
        if (interfaceC13823a != null) {
            return interfaceC13823a.mo15463s();
        }
        AbstractC16544l.m18103p("sdkCore");
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final Object m20004c(InterfaceC1436k interfaceC1436k) {
        InterfaceC13823a interfaceC13823a = this.f59383Y;
        if (interfaceC13823a == null) {
            InterfaceC11256c.f34102a.getClass();
            AbstractC7889G0.m8184b(C11254a.f34097b, 3, EnumC11255b.f34098Y, C18640b.f59381o0, null, false, 56);
            return null;
        }
        if (interfaceC13823a != null) {
            return interfaceC1436k.invoke(interfaceC13823a);
        }
        AbstractC16544l.m18103p("sdkCore");
        throw null;
    }

    @Override // p959q8.InterfaceC18645g
    /* JADX INFO: renamed from: e */
    public final void mo15103e(InterfaceC13823a interfaceC13823a, Context context) {
        AbstractC16544l.m18094g(context, "context");
        if (!(context instanceof Application)) {
            AbstractC7889G0.m8184b(interfaceC13823a.mo15463s(), 5, EnumC11255b.f34098Y, C18640b.f59380Z, null, false, 56);
        } else {
            this.f59383Y = interfaceC13823a;
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle extras;
        AbstractC16544l.m18094g(activity, "activity");
        InterfaceC13823a interfaceC13823a = this.f59383Y;
        if (interfaceC13823a != null) {
            if (interfaceC13823a == null) {
                AbstractC16544l.m18103p("sdkCore");
                throw null;
            }
            C9673h c9673hMo10261q = AbstractC9667b.m10254a(interfaceC13823a).mo10261q();
            if (c9673hMo10261q != null) {
                Intent intent = activity.getIntent();
                AbstractC16544l.m18093f(intent, "activity.intent");
                try {
                    extras = intent.getExtras();
                } catch (Exception unused) {
                    extras = null;
                }
                String string = extras != null ? extras.getString("_dd.synthetics.test_id") : null;
                String string2 = extras != null ? extras.getString("_dd.synthetics.result_id") : null;
                if (c9673hMo10261q.f29161b) {
                    return;
                }
                c9673hMo10261q.f29161b = true;
                if (string == null || AbstractC21322p.m21681O(string) || string2 == null || AbstractC21322p.m21681O(string2)) {
                    return;
                }
                c9673hMo10261q.f29160a.m16110w(new C13340x(string, string2));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC16544l.m18094g(activity, HJrCuD.JlYSTqrUbaEUHx);
        AbstractC16544l.m18094g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
    }
}
