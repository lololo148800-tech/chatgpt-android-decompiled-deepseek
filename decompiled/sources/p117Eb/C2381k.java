package p117Eb;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayDeque;
import p001A.RunnableC0074m;
import p523V9.AbstractC7845A4;
import p832jb.C16187g;
import p852kb.InterfaceC16365a;

/* JADX INFO: renamed from: Eb.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2381k implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Y */
    public final ArrayDeque f7407Y = new ArrayDeque(10);

    /* JADX INFO: renamed from: a */
    public final void m3479a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    ArrayDeque arrayDeque = this.f7407Y;
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e10) {
            AbstractC15256t.m16483u("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e10);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    C16187g c16187gM17791b = C16187g.m17791b();
                    c16187gM17791b.m17794a();
                    if (c16187gM17791b.f50238d.mo12555a(InterfaceC16365a.class) != null) {
                        throw new ClassCastException();
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    AbstractC15256t.m16482t("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            AbstractC7845A4.m8095c("_no", bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0074m(this, 15, intent));
        } else {
            m3479a(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
