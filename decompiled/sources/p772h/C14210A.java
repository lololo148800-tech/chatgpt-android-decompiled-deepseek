package p772h;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p229J0.C3989U1;

/* JADX INFO: renamed from: h.A */
/* JADX INFO: loaded from: classes.dex */
public final class C14210A {

    /* JADX INFO: renamed from: a */
    public static final C14210A f44629a = new C14210A();

    /* JADX INFO: renamed from: a */
    public final OnBackInvokedCallback m15512a(InterfaceC1426a onBackInvoked) {
        AbstractC16544l.m18094g(onBackInvoked, "onBackInvoked");
        return new C3989U1(2, onBackInvoked);
    }

    /* JADX INFO: renamed from: b */
    public final void m15513b(Object dispatcher, int i10, Object callback) {
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        AbstractC16544l.m18094g(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) callback);
    }

    /* JADX INFO: renamed from: c */
    public final void m15514c(Object dispatcher, Object callback) {
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        AbstractC16544l.m18094g(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
