package p1023ta;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: ta.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC19829a implements View.OnTouchListener {

    /* JADX INFO: renamed from: Y */
    public final Dialog f62886Y;

    /* JADX INFO: renamed from: Z */
    public final int f62887Z;

    /* JADX INFO: renamed from: o0 */
    public final int f62888o0;

    /* JADX INFO: renamed from: p0 */
    public final int f62889p0;

    public ViewOnTouchListenerC19829a(Dialog dialog, Rect rect) {
        this.f62886Y = dialog;
        this.f62887Z = rect.left;
        this.f62888o0 = rect.top;
        this.f62889p0 = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f62887Z;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f62888o0;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f62889p0;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f62886Y.onTouchEvent(motionEventObtain);
    }
}
