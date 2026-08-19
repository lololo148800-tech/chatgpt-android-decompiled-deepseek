package p999s;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p976r.InterfaceC18800B;

/* JADX INFO: renamed from: s.r0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC19375r0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Y */
    public final float f61358Y;

    /* JADX INFO: renamed from: Z */
    public final int f61359Z;

    /* JADX INFO: renamed from: o0 */
    public final int f61360o0;

    /* JADX INFO: renamed from: p0 */
    public final View f61361p0;

    /* JADX INFO: renamed from: q0 */
    public RunnableC19373q0 f61362q0;

    /* JADX INFO: renamed from: r0 */
    public RunnableC19373q0 f61363r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f61364s0;

    /* JADX INFO: renamed from: t0 */
    public int f61365t0;

    /* JADX INFO: renamed from: u0 */
    public final int[] f61366u0 = new int[2];

    public AbstractViewOnTouchListenerC19375r0(View view) {
        this.f61361p0 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f61358Y = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f61359Z = tapTimeout;
        this.f61360o0 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m20478a() {
        RunnableC19373q0 runnableC19373q0 = this.f61363r0;
        View view = this.f61361p0;
        if (runnableC19373q0 != null) {
            view.removeCallbacks(runnableC19373q0);
        }
        RunnableC19373q0 runnableC19373q1 = this.f61362q0;
        if (runnableC19373q1 != null) {
            view.removeCallbacks(runnableC19373q1);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC18800B mo20109b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo20110c();

    /* JADX INFO: renamed from: d */
    public boolean mo20111d() {
        InterfaceC18800B interfaceC18800BMo20109b = mo20109b();
        if (interfaceC18800BMo20109b == null || !interfaceC18800BMo20109b.mo20082a()) {
            return true;
        }
        interfaceC18800BMo20109b.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z6;
        C19369o0 c19369o0Mo20084i;
        boolean z10 = this.f61364s0;
        View view2 = this.f61361p0;
        if (z10) {
            InterfaceC18800B interfaceC18800BMo20109b = mo20109b();
            if (interfaceC18800BMo20109b != null && interfaceC18800BMo20109b.mo20082a() && (c19369o0Mo20084i = interfaceC18800BMo20109b.mo20084i()) != null && c19369o0Mo20084i.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f61366u0;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c19369o0Mo20084i.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM20472b = c19369o0Mo20084i.m20472b(motionEventObtainNoHistory, this.f61365t0);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z11 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zM20472b && z11) {
                    z6 = true;
                } else if (mo20111d()) {
                    z6 = false;
                } else {
                    z6 = true;
                }
            } else if (mo20111d()) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f61365t0 = motionEvent.getPointerId(0);
                    if (this.f61362q0 == null) {
                        this.f61362q0 = new RunnableC19373q0(this, 0);
                    }
                    view2.postDelayed(this.f61362q0, this.f61359Z);
                    if (this.f61363r0 == null) {
                        this.f61363r0 = new RunnableC19373q0(this, 1);
                    }
                    view2.postDelayed(this.f61363r0, this.f61360o0);
                } else if (actionMasked2 == 1) {
                    m20478a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f61365t0);
                    if (iFindPointerIndex >= 0) {
                        float x4 = motionEvent.getX(iFindPointerIndex);
                        float y8 = motionEvent.getY(iFindPointerIndex);
                        float f10 = this.f61358Y;
                        float f11 = -f10;
                        if (x4 < f11 || y8 < f11 || x4 >= (view2.getRight() - view2.getLeft()) + f10 || y8 >= (view2.getBottom() - view2.getTop()) + f10) {
                            m20478a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (mo20110c()) {
                                z6 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    m20478a();
                }
                z6 = false;
            } else {
                z6 = false;
            }
            if (z6) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f61364s0 = z6;
        return z6 || z10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f61364s0 = false;
        this.f61365t0 = -1;
        RunnableC19373q0 runnableC19373q0 = this.f61362q0;
        if (runnableC19373q0 != null) {
            this.f61361p0.removeCallbacks(runnableC19373q0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
