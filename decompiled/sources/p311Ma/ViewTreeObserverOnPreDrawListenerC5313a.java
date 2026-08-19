package p311Ma;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;
import p1079wa.InterfaceC20853a;

/* JADX INFO: renamed from: Ma.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC5313a implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ View f17490Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f17491Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC20853a f17492o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ExpandableBehavior f17493p0;

    public ViewTreeObserverOnPreDrawListenerC5313a(ExpandableBehavior expandableBehavior, View view, int i10, InterfaceC20853a interfaceC20853a) {
        this.f17493p0 = expandableBehavior;
        this.f17490Y = view;
        this.f17491Z = i10;
        this.f17492o0 = interfaceC20853a;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f17490Y;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f17493p0;
        if (expandableBehavior.f36828a == this.f17491Z) {
            Object obj = this.f17492o0;
            expandableBehavior.mo13690r((View) obj, view, ((FloatingActionButton) obj).f36643C0.f22495b, false);
        }
        return false;
    }
}
