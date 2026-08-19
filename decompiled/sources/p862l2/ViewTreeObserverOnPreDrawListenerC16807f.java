package p862l2;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p1103xa.AbstractC21167h;

/* JADX INFO: renamed from: l2.f */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC16807f implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f53933Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f53934Z;

    public /* synthetic */ ViewTreeObserverOnPreDrawListenerC16807f(Object obj, int i10) {
        this.f53933Y = i10;
        this.f53934Z = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f53933Y) {
            case 0:
                ((CoordinatorLayout) this.f53934Z).m11377p(0);
                break;
            default:
                AbstractC21167h abstractC21167h = (AbstractC21167h) this.f53934Z;
                float rotation = abstractC21167h.f67299s.getRotation();
                if (abstractC21167h.f67295o != rotation) {
                    abstractC21167h.f67295o = rotation;
                    abstractC21167h.mo21610p();
                }
                break;
        }
        return true;
    }
}
