package p999s;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.revenuecat.purchases.common.UtilsKt;
import p817j$.util.Objects;
import p893n.C17384p;

/* JADX INFO: renamed from: s.S0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19318S0 {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m20406a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m20407b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C17384p(runnable, 1);
    }

    /* JADX INFO: renamed from: c */
    public static void m20408c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(UtilsKt.MICROS_MULTIPLIER, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m20409d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
