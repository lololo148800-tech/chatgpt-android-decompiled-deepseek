package p611Z2;

import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC11000a;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Z2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10151d {

    /* JADX INFO: renamed from: a */
    public static final C10150c f30080a = C10150c.f30079a;

    /* JADX INFO: renamed from: a */
    public static C10150c m10749a(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        while (abstractComponentCallbacksC11000a != null) {
            if (abstractComponentCallbacksC11000a.m11757t()) {
                abstractComponentCallbacksC11000a.m11754q();
            }
            abstractComponentCallbacksC11000a = abstractComponentCallbacksC11000a.f33125G0;
        }
        return f30080a;
    }

    /* JADX INFO: renamed from: b */
    public static void m10750b(C10148a c10148a) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(c10148a.f30073Y.getClass().getName()), c10148a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m10751c(AbstractComponentCallbacksC11000a fragment, String previousFragmentId) {
        AbstractC16544l.m18094g(fragment, "fragment");
        AbstractC16544l.m18094g(previousFragmentId, "previousFragmentId");
        m10750b(new C10148a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        m10749a(fragment).getClass();
    }
}
