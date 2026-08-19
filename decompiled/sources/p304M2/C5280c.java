package p304M2;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import io.sentry.android.core.AbstractC15256t;
import java.util.Arrays;
import java.util.WeakHashMap;
import p003A1.RunnableC0153B;
import p030B2.AbstractC0738T;
import p084D4.InterpolatorC1892P;
import p544W9.AbstractC8752z3;

/* JADX INFO: renamed from: M2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5280c {

    /* JADX INFO: renamed from: v */
    public static final InterpolatorC1892P f17372v = new InterpolatorC1892P(1);

    /* JADX INFO: renamed from: a */
    public int f17373a;

    /* JADX INFO: renamed from: b */
    public final int f17374b;

    /* JADX INFO: renamed from: d */
    public float[] f17376d;

    /* JADX INFO: renamed from: e */
    public float[] f17377e;

    /* JADX INFO: renamed from: f */
    public float[] f17378f;

    /* JADX INFO: renamed from: g */
    public float[] f17379g;

    /* JADX INFO: renamed from: h */
    public int[] f17380h;

    /* JADX INFO: renamed from: i */
    public int[] f17381i;

    /* JADX INFO: renamed from: j */
    public int[] f17382j;

    /* JADX INFO: renamed from: k */
    public int f17383k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f17384l;

    /* JADX INFO: renamed from: m */
    public final float f17385m;

    /* JADX INFO: renamed from: n */
    public final float f17386n;

    /* JADX INFO: renamed from: o */
    public final int f17387o;

    /* JADX INFO: renamed from: p */
    public final OverScroller f17388p;

    /* JADX INFO: renamed from: q */
    public final AbstractC8752z3 f17389q;

    /* JADX INFO: renamed from: r */
    public View f17390r;

    /* JADX INFO: renamed from: s */
    public boolean f17391s;

    /* JADX INFO: renamed from: t */
    public final CoordinatorLayout f17392t;

    /* JADX INFO: renamed from: c */
    public int f17375c = -1;

    /* JADX INFO: renamed from: u */
    public final RunnableC0153B f17393u = new RunnableC0153B(this, 9);

    public C5280c(Context context, CoordinatorLayout coordinatorLayout, AbstractC8752z3 abstractC8752z3) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC8752z3 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f17392t = coordinatorLayout;
        this.f17389q = abstractC8752z3;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f17387o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f17374b = viewConfiguration.getScaledTouchSlop();
        this.f17385m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f17386n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f17388p = new OverScroller(context, f17372v);
    }

    /* JADX INFO: renamed from: a */
    public final void m5806a() {
        this.f17375c = -1;
        float[] fArr = this.f17376d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f17377e, 0.0f);
            Arrays.fill(this.f17378f, 0.0f);
            Arrays.fill(this.f17379g, 0.0f);
            Arrays.fill(this.f17380h, 0);
            Arrays.fill(this.f17381i, 0);
            Arrays.fill(this.f17382j, 0);
            this.f17383k = 0;
        }
        VelocityTracker velocityTracker = this.f17384l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17384l = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5807b(View view, int i10) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f17392t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + Separators.RPAREN);
        }
        this.f17390r = view;
        this.f17375c = i10;
        this.f17389q.mo9512i(view, i10);
        m5819n(1);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5808c(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        AbstractC8752z3 abstractC8752z3 = this.f17389q;
        boolean z6 = abstractC8752z3.mo3893g(view) > 0;
        boolean z10 = abstractC8752z3.mo3894h() > 0;
        if (z6 && z10) {
            float f12 = (f11 * f11) + (f10 * f10);
            int i10 = this.f17374b;
            return f12 > ((float) (i10 * i10));
        }
        if (z6) {
            return Math.abs(f10) > ((float) this.f17374b);
        }
        return z10 && Math.abs(f11) > ((float) this.f17374b);
    }

    /* JADX INFO: renamed from: d */
    public final void m5809d(int i10) {
        float[] fArr = this.f17376d;
        if (fArr != null) {
            int i11 = this.f17383k;
            int i12 = 1 << i10;
            if ((i11 & i12) != 0) {
                fArr[i10] = 0.0f;
                this.f17377e[i10] = 0.0f;
                this.f17378f[i10] = 0.0f;
                this.f17379g[i10] = 0.0f;
                this.f17380h[i10] = 0;
                this.f17381i[i10] = 0;
                this.f17382j[i10] = 0;
                this.f17383k = (~i12) & i11;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m5810e(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f17392t.getWidth();
        float f10 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * f10) + f10;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5811f() {
        if (this.f17373a == 2) {
            OverScroller overScroller = this.f17388p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f17390r.getLeft();
            int top = currY - this.f17390r.getTop();
            if (left != 0) {
                View view = this.f17390r;
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f17390r;
                WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f17389q.mo3896k(this.f17390r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f17392t.post(this.f17393u);
            }
        }
        return this.f17373a == 2;
    }

    /* JADX INFO: renamed from: g */
    public final View m5812g(int i10, int i11) {
        CoordinatorLayout coordinatorLayout = this.f17392t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f17389q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5813h(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f17390r.getLeft();
        int top = this.f17390r.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f17388p;
        int i16 = 0;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            m5819n(0);
            return false;
        }
        View view = this.f17390r;
        int i17 = (int) this.f17386n;
        int i18 = (int) this.f17385m;
        int iAbs = Math.abs(i12);
        if (iAbs < i17) {
            i12 = 0;
        } else if (iAbs > i18) {
            i12 = i12 > 0 ? i18 : -i18;
        }
        int iAbs2 = Math.abs(i13);
        if (iAbs2 < i17) {
            i13 = i16;
        } else if (iAbs2 > i18) {
            if (i13 > 0) {
                i13 = i18;
            } else {
                i16 = -i18;
                i13 = i16;
            }
        }
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int iAbs5 = Math.abs(i12);
        int iAbs6 = Math.abs(i13);
        int i19 = iAbs5 + iAbs6;
        int i20 = iAbs3 + iAbs4;
        if (i12 != 0) {
            f10 = iAbs5;
            f11 = i19;
        } else {
            f10 = iAbs3;
            f11 = i20;
        }
        float f14 = f10 / f11;
        if (i13 != 0) {
            f12 = iAbs6;
            f13 = i19;
        } else {
            f12 = iAbs4;
            f13 = i20;
        }
        float f15 = f12 / f13;
        AbstractC8752z3 abstractC8752z3 = this.f17389q;
        overScroller.startScroll(left, top, i14, i15, (int) ((m5810e(i15, i13, abstractC8752z3.mo3894h()) * f15) + (m5810e(i14, i12, abstractC8752z3.mo3893g(view)) * f14)));
        m5819n(2);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5814i(int i10) {
        if ((this.f17383k & (1 << i10)) != 0) {
            return true;
        }
        AbstractC15256t.m16465c("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m5815j(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m5806a();
        }
        if (this.f17384l == null) {
            this.f17384l = VelocityTracker.obtain();
        }
        this.f17384l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM5812g = m5812g((int) x4, (int) y8);
            m5817l(x4, y8, pointerId);
            m5822q(viewM5812g, pointerId);
            int i12 = this.f17380h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f17373a == 1) {
                m5816k();
            }
            m5806a();
            return;
        }
        AbstractC8752z3 abstractC8752z3 = this.f17389q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f17373a == 1) {
                    this.f17391s = true;
                    abstractC8752z3.mo3897l(this.f17390r, 0.0f, 0.0f);
                    this.f17391s = false;
                    if (this.f17373a == 1) {
                        m5819n(0);
                    }
                }
                m5806a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x10 = motionEvent.getX(actionIndex);
                float y9 = motionEvent.getY(actionIndex);
                m5817l(x10, y9, pointerId2);
                if (this.f17373a == 0) {
                    m5822q(m5812g((int) x10, (int) y9), pointerId2);
                    int i13 = this.f17380h[pointerId2];
                    return;
                }
                int i14 = (int) x10;
                int i15 = (int) y9;
                View view = this.f17390r;
                if (view != null) {
                    i11 = (i14 < view.getLeft() || i14 >= view.getRight() || i15 < view.getTop() || i15 >= view.getBottom()) ? 0 : 1;
                }
                if (i11 != 0) {
                    m5822q(this.f17390r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f17373a == 1 && pointerId3 == this.f17375c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i11 >= pointerCount) {
                        i10 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i11);
                    if (pointerId4 != this.f17375c) {
                        View viewM5812g2 = m5812g((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                        View view2 = this.f17390r;
                        if (viewM5812g2 == view2 && m5822q(view2, pointerId4)) {
                            i10 = this.f17375c;
                            break;
                        }
                    }
                    i11++;
                }
                if (i10 == -1) {
                    m5816k();
                }
            }
            m5809d(pointerId3);
            return;
        }
        if (this.f17373a == 1) {
            if (m5814i(this.f17375c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f17375c);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float y10 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f17378f;
                int i16 = this.f17375c;
                int i17 = (int) (x11 - fArr[i16]);
                int i18 = (int) (y10 - this.f17379g[i16]);
                int left = this.f17390r.getLeft() + i17;
                int top = this.f17390r.getTop() + i18;
                int left2 = this.f17390r.getLeft();
                int top2 = this.f17390r.getTop();
                if (i17 != 0) {
                    left = abstractC8752z3.mo3891a(this.f17390r, left);
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    this.f17390r.offsetLeftAndRight(left - left2);
                }
                if (i18 != 0) {
                    top = abstractC8752z3.mo3892b(this.f17390r, top);
                    WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                    this.f17390r.offsetTopAndBottom(top - top2);
                }
                if (i17 != 0 || i18 != 0) {
                    abstractC8752z3.mo3896k(this.f17390r, left, top);
                }
                m5818m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i11 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i11);
            if (m5814i(pointerId5)) {
                float x12 = motionEvent.getX(i11);
                float y11 = motionEvent.getY(i11);
                float f10 = x12 - this.f17376d[pointerId5];
                float f11 = y11 - this.f17377e[pointerId5];
                Math.abs(f10);
                Math.abs(f11);
                int i19 = this.f17380h[pointerId5];
                Math.abs(f11);
                Math.abs(f10);
                int i20 = this.f17380h[pointerId5];
                Math.abs(f10);
                Math.abs(f11);
                int i21 = this.f17380h[pointerId5];
                Math.abs(f11);
                Math.abs(f10);
                int i22 = this.f17380h[pointerId5];
                if (this.f17373a != 1) {
                    View viewM5812g3 = m5812g((int) x12, (int) y11);
                    if (m5808c(viewM5812g3, f10, f11) && m5822q(viewM5812g3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i11++;
        }
        m5818m(motionEvent);
    }

    /* JADX INFO: renamed from: k */
    public final void m5816k() {
        VelocityTracker velocityTracker = this.f17384l;
        float f10 = this.f17385m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f17384l.getXVelocity(this.f17375c);
        float f11 = this.f17386n;
        float fAbs = Math.abs(xVelocity);
        float f12 = 0.0f;
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f17384l.getYVelocity(this.f17375c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f11) {
            if (fAbs2 > f10) {
                if (yVelocity <= 0.0f) {
                    f10 = -f10;
                }
                f12 = f10;
            } else {
                f12 = yVelocity;
            }
        }
        this.f17391s = true;
        this.f17389q.mo3897l(this.f17390r, xVelocity, f12);
        this.f17391s = false;
        if (this.f17373a == 1) {
            m5819n(0);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5817l(float f10, float f11, int i10) {
        float[] fArr = this.f17376d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f17377e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f17378f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f17379g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f17380h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f17381i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f17382j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f17376d = fArr2;
            this.f17377e = fArr3;
            this.f17378f = fArr4;
            this.f17379g = fArr5;
            this.f17380h = iArr;
            this.f17381i = iArr2;
            this.f17382j = iArr3;
        }
        float[] fArr9 = this.f17376d;
        this.f17378f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f17377e;
        this.f17379g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f17380h;
        int i12 = (int) f10;
        int i13 = (int) f11;
        CoordinatorLayout coordinatorLayout = this.f17392t;
        int left = coordinatorLayout.getLeft();
        int i14 = this.f17387o;
        int i15 = i12 < left + i14 ? 1 : 0;
        if (i13 < coordinatorLayout.getTop() + i14) {
            i15 |= 4;
        }
        if (i12 > coordinatorLayout.getRight() - i14) {
            i15 |= 2;
        }
        if (i13 > coordinatorLayout.getBottom() - i14) {
            i15 |= 8;
        }
        iArr7[i10] = i15;
        this.f17383k |= 1 << i10;
    }

    /* JADX INFO: renamed from: m */
    public final void m5818m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (m5814i(pointerId)) {
                float x4 = motionEvent.getX(i10);
                float y8 = motionEvent.getY(i10);
                this.f17378f[pointerId] = x4;
                this.f17379g[pointerId] = y8;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5819n(int i10) {
        this.f17392t.removeCallbacks(this.f17393u);
        if (this.f17373a != i10) {
            this.f17373a = i10;
            this.f17389q.mo3895j(i10);
            if (this.f17373a == 0) {
                this.f17390r = null;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m5820o(int i10, int i11) {
        if (this.f17391s) {
            return m5813h(i10, i11, (int) this.f17384l.getXVelocity(this.f17375c), (int) this.f17384l.getYVelocity(this.f17375c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX INFO: renamed from: p */
    public final boolean m5821p(MotionEvent motionEvent) {
        View viewM5812g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m5806a();
        }
        if (this.f17384l == null) {
            this.f17384l = VelocityTracker.obtain();
        }
        this.f17384l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            m5817l(x4, y8, pointerId);
            View viewM5812g2 = m5812g((int) x4, (int) y8);
            if (viewM5812g2 == this.f17390r && this.f17373a == 2) {
                m5822q(viewM5812g2, pointerId);
            }
            int i10 = this.f17380h[pointerId];
        } else if (actionMasked == 1) {
            m5806a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m5806a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x10 = motionEvent.getX(actionIndex);
                float y9 = motionEvent.getY(actionIndex);
                m5817l(x10, y9, pointerId2);
                int i11 = this.f17373a;
                if (i11 == 0) {
                    int i12 = this.f17380h[pointerId2];
                } else if (i11 == 2 && (viewM5812g = m5812g((int) x10, (int) y9)) == this.f17390r) {
                    m5822q(viewM5812g, pointerId2);
                }
            } else if (actionMasked == 6) {
                m5809d(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f17376d != null && this.f17377e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i13 = 0; i13 < pointerCount; i13++) {
                int pointerId3 = motionEvent.getPointerId(i13);
                if (m5814i(pointerId3)) {
                    float x11 = motionEvent.getX(i13);
                    float y10 = motionEvent.getY(i13);
                    float f10 = x11 - this.f17376d[pointerId3];
                    float f11 = y10 - this.f17377e[pointerId3];
                    View viewM5812g3 = m5812g((int) x11, (int) y10);
                    boolean z6 = viewM5812g3 != null && m5808c(viewM5812g3, f10, f11);
                    if (!z6) {
                        Math.abs(f10);
                        Math.abs(f11);
                        int i14 = this.f17380h[pointerId3];
                        Math.abs(f11);
                        Math.abs(f10);
                        int i15 = this.f17380h[pointerId3];
                        Math.abs(f10);
                        Math.abs(f11);
                        int i16 = this.f17380h[pointerId3];
                        Math.abs(f11);
                        Math.abs(f10);
                        int i17 = this.f17380h[pointerId3];
                        if (this.f17373a != 1) {
                            break;
                        }
                    } else {
                        int left = viewM5812g3.getLeft();
                        AbstractC8752z3 abstractC8752z3 = this.f17389q;
                        int iMo3891a = abstractC8752z3.mo3891a(viewM5812g3, ((int) f10) + left);
                        int top = viewM5812g3.getTop();
                        int iMo3892b = abstractC8752z3.mo3892b(viewM5812g3, ((int) f11) + top);
                        int iMo3893g = abstractC8752z3.mo3893g(viewM5812g3);
                        int iMo3894h = abstractC8752z3.mo3894h();
                        if ((iMo3893g == 0 || (iMo3893g > 0 && iMo3891a == left)) && (iMo3894h == 0 || (iMo3894h > 0 && iMo3892b == top))) {
                            break;
                        }
                        Math.abs(f10);
                        Math.abs(f11);
                        int i18 = this.f17380h[pointerId3];
                        Math.abs(f11);
                        Math.abs(f10);
                        int i19 = this.f17380h[pointerId3];
                        Math.abs(f10);
                        Math.abs(f11);
                        int i110 = this.f17380h[pointerId3];
                        Math.abs(f11);
                        Math.abs(f10);
                        int i111 = this.f17380h[pointerId3];
                        if (this.f17373a != 1 || (z6 && m5822q(viewM5812g3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            m5818m(motionEvent);
        }
        return this.f17373a == 1;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5822q(View view, int i10) {
        if (view == this.f17390r && this.f17375c == i10) {
            return true;
        }
        if (view == null || !this.f17389q.mo3898m(view, i10)) {
            return false;
        }
        this.f17375c = i10;
        m5807b(view, i10);
        return true;
    }
}
