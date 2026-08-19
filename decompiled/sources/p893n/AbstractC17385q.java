package p893n;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.revenuecat.purchases.common.UtilsKt;
import p053C.AbstractC1466a;
import p817j$.util.Objects;

/* JADX INFO: renamed from: n.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17385q {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m19079a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m19080b(Object obj, LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v) {
        Objects.requireNonNull(layoutInflaterFactory2C17390v);
        C17384p c17384p = new C17384p(layoutInflaterFactory2C17390v, 0);
        AbstractC1466a.m2098r(obj).registerOnBackInvokedCallback(UtilsKt.MICROS_MULTIPLIER, c17384p);
        return c17384p;
    }

    /* JADX INFO: renamed from: c */
    public static void m19081c(Object obj, Object obj2) {
        AbstractC1466a.m2098r(obj).unregisterOnBackInvokedCallback(AbstractC1466a.m2095o(obj2));
    }
}
