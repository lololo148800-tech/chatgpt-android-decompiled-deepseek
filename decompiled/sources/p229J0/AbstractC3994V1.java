package p229J0;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: J0.V1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3994V1 {
    /* JADX INFO: renamed from: a */
    public static final OnBackInvokedCallback m4708a(InterfaceC1426a interfaceC1426a) {
        return new C3989U1(0, interfaceC1426a);
    }

    /* JADX INFO: renamed from: b */
    public static final void m4709b(View view, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj);
    }

    /* JADX INFO: renamed from: c */
    public static final void m4710c(View view, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
    }
}
