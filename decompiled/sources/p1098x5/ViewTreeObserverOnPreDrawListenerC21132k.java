package p1098x5;

import android.view.ViewTreeObserver;
import p025An.C0624m;
import p1071w0.AbstractC20734X;

/* JADX INFO: renamed from: x5.k */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC21132k implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: Y */
    public boolean f67137Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21127f f67138Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ViewTreeObserver f67139o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C0624m f67140p0;

    public ViewTreeObserverOnPreDrawListenerC21132k(C21127f c21127f, ViewTreeObserver viewTreeObserver, C0624m c0624m) {
        this.f67138Z = c21127f;
        this.f67139o0 = viewTreeObserver;
        this.f67140p0 = c0624m;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C21127f c21127f = this.f67138Z;
        C21129h c21129hM21248s = AbstractC20734X.m21248s(c21127f);
        if (c21129hM21248s != null) {
            ViewTreeObserver viewTreeObserver = this.f67139o0;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                c21127f.f67126Y.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f67137Y) {
                this.f67137Y = true;
                this.f67140p0.resumeWith(c21129hM21248s);
            }
        }
        return true;
    }
}
