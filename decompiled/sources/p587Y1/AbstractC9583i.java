package p587Y1;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.revenuecat.purchases.common.UtilsKt;
import p049Bm.InterfaceC1426a;
import p229J0.C3989U1;

/* JADX INFO: renamed from: Y1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9583i {
    /* JADX INFO: renamed from: a */
    public static final OnBackInvokedCallback m10131a(InterfaceC1426a interfaceC1426a) {
        return new C3989U1(1, interfaceC1426a);
    }

    /* JADX INFO: renamed from: b */
    public static final void m10132b(View view, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(UtilsKt.MICROS_MULTIPLIER, (OnBackInvokedCallback) obj);
    }

    /* JADX INFO: renamed from: c */
    public static final void m10133c(View view, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
    }
}
