package p744f8;

import android.app.Activity;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC16544l;
import p552Wg.C8847i;
import p766g8.C13824a;
import p867l8.InterfaceC16832d;
import p959q8.AbstractC18641c;

/* JADX INFO: renamed from: f8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13581b extends AbstractC18641c implements InterfaceC16832d {

    /* JADX INFO: renamed from: Z */
    public final C13824a f42936Z;

    public C13581b(C13824a c13824a) {
        this.f42936Z = c13824a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13581b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyApi29");
        return AbstractC16544l.m18089b(this.f42936Z, ((C13581b) obj).f42936Z);
    }

    public final int hashCode() {
        return this.f42936Z.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC16544l.m18094g(activity, "activity");
        m20004c(new C8847i(this, 24, activity));
        super.onActivityPreCreated(activity, bundle);
    }

    public final String toString() {
        return "UserActionTrackingStrategyApi29(" + this.f42936Z + Separators.RPAREN;
    }
}
