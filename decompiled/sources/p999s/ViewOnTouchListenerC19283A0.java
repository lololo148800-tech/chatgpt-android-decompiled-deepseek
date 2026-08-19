package p999s;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: s.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC19283A0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19285B0 f61091Y;

    public ViewOnTouchListenerC19283A0(C19285B0 c19285b0) {
        this.f61091Y = c19285b0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C19386x c19386x;
        int action = motionEvent.getAction();
        int x4 = (int) motionEvent.getX();
        int y8 = (int) motionEvent.getY();
        C19285B0 c19285b0 = this.f61091Y;
        if (action == 0 && (c19386x = c19285b0.f61106L0) != null && c19386x.isShowing() && x4 >= 0 && x4 < c19285b0.f61106L0.getWidth() && y8 >= 0 && y8 < c19285b0.f61106L0.getHeight()) {
            c19285b0.f61102H0.postDelayed(c19285b0.f61098D0, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c19285b0.f61102H0.removeCallbacks(c19285b0.f61098D0);
        return false;
    }
}
