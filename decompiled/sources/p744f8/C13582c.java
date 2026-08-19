package p744f8;

import android.app.Activity;
import android.gov.nist.core.Separators;
import android.view.Window;
import kotlin.jvm.internal.AbstractC16544l;
import p552Wg.C8847i;
import p766g8.C13824a;
import p766g8.WindowCallbackC13827d;
import p766g8.WindowCallbackC13829f;
import p867l8.InterfaceC16832d;
import p959q8.AbstractC18641c;

/* JADX INFO: renamed from: f8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13582c extends AbstractC18641c implements InterfaceC16832d {

    /* JADX INFO: renamed from: Z */
    public final C13824a f42937Z;

    public C13582c(C13824a c13824a) {
        this.f42937Z = c13824a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13582c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyLegacy");
        return AbstractC16544l.m18089b(this.f42937Z, ((C13582c) obj).f42937Z);
    }

    public final int hashCode() {
        return this.f42937Z.hashCode();
    }

    @Override // p959q8.AbstractC18641c, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        Window window = activity.getWindow();
        this.f42937Z.getClass();
        if (window == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC13829f) {
            Window.Callback callback2 = ((WindowCallbackC13829f) callback).f43861Z;
            if (callback2 instanceof WindowCallbackC13827d) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
        }
    }

    @Override // p959q8.AbstractC18641c, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        m20004c(new C8847i(this, 25, activity));
    }

    public final String toString() {
        return "UserActionTrackingStrategyLegacy(" + this.f42937Z + Separators.RPAREN;
    }
}
