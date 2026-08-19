package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: androidx.lifecycle.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11072H {
    /* JADX INFO: renamed from: a */
    public static final void m12125a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
