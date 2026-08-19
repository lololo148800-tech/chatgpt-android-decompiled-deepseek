package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p830ja.AbstractC16180a;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC16180a {

    /* JADX INFO: renamed from: b */
    public boolean f36383b;

    /* JADX INFO: renamed from: d */
    public int f36385d;

    /* JADX INFO: renamed from: f */
    public VelocityTracker f36387f;

    /* JADX INFO: renamed from: c */
    public int f36384c = -1;

    /* JADX INFO: renamed from: e */
    public int f36386e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: f */
    public final boolean mo13566f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f36386e < 0) {
            this.f36386e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f36383b) {
            int i10 = this.f36384c;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y8 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y8 - this.f36385d) > this.f36386e) {
                this.f36385d = y8;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f36387f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f36384c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // p830ja.AbstractC16180a, p862l2.AbstractC16803b
    /* JADX INFO: renamed from: g */
    public final boolean mo13567g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        throw new ClassCastException();
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: h */
    public final boolean mo13568h(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        throw new ClassCastException();
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo13569j(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        throw new ClassCastException();
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: k */
    public final void mo13570k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: m */
    public final void mo13571m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: n */
    public final Parcelable mo13572n(View view) {
        throw new ClassCastException();
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: o */
    public final boolean mo13573o(View view, int i10, int i11) {
        throw new ClassCastException();
    }

    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: p */
    public final void mo13574p(View view, View view2, int i10) {
        throw new ClassCastException();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    @Override // p862l2.AbstractC16803b
    /* JADX INFO: renamed from: q */
    public final boolean mo13575q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f36384c);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                this.f36385d = (int) motionEvent.getY(iFindPointerIndex);
                view.getClass();
                throw new ClassCastException();
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i10 = motionEvent.getActionIndex() != 0 ? 0 : 1;
                    this.f36384c = motionEvent.getPointerId(i10);
                    this.f36385d = (int) (motionEvent.getY(i10) + 0.5f);
                }
            }
            velocityTracker = this.f36387f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return this.f36383b;
        }
        VelocityTracker velocityTracker2 = this.f36387f;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f36387f.computeCurrentVelocity(1000);
            this.f36387f.getYVelocity(this.f36384c);
            view.getClass();
            throw new ClassCastException();
        }
        this.f36383b = false;
        this.f36384c = -1;
        VelocityTracker velocityTracker3 = this.f36387f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f36387f = null;
        }
        velocityTracker = this.f36387f;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.f36383b;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
