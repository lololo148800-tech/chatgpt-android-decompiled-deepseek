package p1098x5;

import android.view.ViewTreeObserver;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: x5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C21131j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C21127f f67134Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ViewTreeObserver f67135Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC21132k f67136o0;

    public C21131j(C21127f c21127f, ViewTreeObserver viewTreeObserver, ViewTreeObserverOnPreDrawListenerC21132k viewTreeObserverOnPreDrawListenerC21132k) {
        this.f67134Y = c21127f;
        this.f67135Z = viewTreeObserver;
        this.f67136o0 = viewTreeObserverOnPreDrawListenerC21132k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ViewTreeObserverOnPreDrawListenerC21132k viewTreeObserverOnPreDrawListenerC21132k = this.f67136o0;
        ViewTreeObserver viewTreeObserver = this.f67135Z;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC21132k);
        } else {
            this.f67134Y.f67126Y.getViewTreeObserver().removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC21132k);
        }
        return C17296C.f55119a;
    }
}
