package p772h;

import android.app.Activity;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: h.f */
/* JADX INFO: loaded from: classes.dex */
public final class C14224f {

    /* JADX INFO: renamed from: a */
    public static final C14224f f44664a = new C14224f();

    /* JADX INFO: renamed from: a */
    public final OnBackInvokedDispatcher m15526a(Activity activity) {
        AbstractC16544l.m18094g(activity, "activity");
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        AbstractC16544l.m18093f(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }
}
