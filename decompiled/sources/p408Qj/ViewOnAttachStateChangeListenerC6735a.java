package p408Qj;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.AbstractC16544l;
import p073Cj.RunnableC1713a;
import p935p.RunnableC18260f;

/* JADX INFO: renamed from: Qj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC6735a implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21627Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ BottomSheetBehavior f21628Z;

    public /* synthetic */ ViewOnAttachStateChangeListenerC6735a(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f21627Y = i10;
        this.f21628Z = bottomSheetBehavior;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f21627Y) {
            case 0:
                AbstractC16544l.m18094g(view, "view");
                view.postDelayed(new RunnableC1713a(this.f21628Z, 1), 100L);
                break;
            case 1:
                AbstractC16544l.m18094g(view, "view");
                view.postDelayed(new RunnableC1713a(this.f21628Z, 2), 100L);
                break;
            default:
                AbstractC16544l.m18094g(view, "view");
                view.postDelayed(new RunnableC18260f(this.f21628Z, 1), 100L);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f21627Y) {
            case 0:
                AbstractC16544l.m18094g(view, "view");
                break;
            case 1:
                AbstractC16544l.m18094g(view, "view");
                break;
            default:
                AbstractC16544l.m18094g(view, "view");
                break;
        }
    }
}
