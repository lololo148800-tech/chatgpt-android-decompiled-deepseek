package p999s;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: s.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC19373q0 implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f61355Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractViewOnTouchListenerC19375r0 f61356Z;

    public /* synthetic */ RunnableC19373q0(AbstractViewOnTouchListenerC19375r0 abstractViewOnTouchListenerC19375r0, int i10) {
        this.f61355Y = i10;
        this.f61356Z = abstractViewOnTouchListenerC19375r0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61355Y) {
            case 0:
                ViewParent parent = this.f61356Z.f61361p0.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC19375r0 abstractViewOnTouchListenerC19375r0 = this.f61356Z;
                abstractViewOnTouchListenerC19375r0.m20478a();
                View view = abstractViewOnTouchListenerC19375r0.f61361p0;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC19375r0.mo20110c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC19375r0.f61364s0 = true;
                    break;
                }
                break;
        }
    }
}
