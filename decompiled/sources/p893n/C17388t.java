package p893n;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.view.C10820c;
import androidx.appcompat.widget.ContentFrameLayout;
import p571X9.AbstractC9106B3;

/* JADX INFO: renamed from: n.t */
/* JADX INFO: loaded from: classes.dex */
public final class C17388t extends ContentFrameLayout {

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ LayoutInflaterFactory2C17390v f55506w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17388t(LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v, C10820c c10820c) {
        super(c10820c, null);
        this.f55506w0 = layoutInflaterFactory2C17390v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f55506w0.m19103w(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x4 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if (x4 < -5 || y8 < -5 || x4 > getWidth() + 5 || y8 > getHeight() + 5) {
                LayoutInflaterFactory2C17390v layoutInflaterFactory2C17390v = this.f55506w0;
                layoutInflaterFactory2C17390v.m19102u(layoutInflaterFactory2C17390v.m19088D(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(AbstractC9106B3.m9636b(getContext(), i10));
    }
}
