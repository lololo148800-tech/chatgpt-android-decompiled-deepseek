package p003A1;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C11003d;
import p349O0.C6032u0;
import p588Y2.C9624h;
import p588Y2.LayoutInflaterFactory2C9640x;

/* JADX INFO: renamed from: A1.Q1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0200Q1 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f743Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f744Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f745o0;

    public ViewOnAttachStateChangeListenerC0200Q1(LayoutInflaterFactory2C9640x layoutInflaterFactory2C9640x, C11003d c11003d) {
        this.f745o0 = layoutInflaterFactory2C9640x;
        this.f744Z = c11003d;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f743Y) {
            case 0:
                break;
            default:
                C11003d c11003d = (C11003d) this.f744Z;
                c11003d.m11827k();
                C9624h.m10165g((ViewGroup) c11003d.f33212c.f33135Q0.getParent(), ((LayoutInflaterFactory2C9640x) this.f745o0).f29060Y).m10171f();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f743Y) {
            case 0:
                ((View) this.f744Z).removeOnAttachStateChangeListener(this);
                ((C6032u0) this.f745o0).m6607w();
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC0200Q1(View view, C6032u0 c6032u0) {
        this.f744Z = view;
        this.f745o0 = c6032u0;
    }

    /* JADX INFO: renamed from: a */
    private final void m613a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m614b(View view) {
    }
}
