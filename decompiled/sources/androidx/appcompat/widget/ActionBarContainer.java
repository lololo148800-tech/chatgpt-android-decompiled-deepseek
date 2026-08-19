package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.openai.chatgpt.R;
import p033B5.C0830n;
import p880m.AbstractC17123a;
import p999s.AbstractC19307M0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: o0 */
    public boolean f32174o0;

    /* JADX INFO: renamed from: p0 */
    public View f32175p0;

    /* JADX INFO: renamed from: q0 */
    public View f32176q0;

    /* JADX INFO: renamed from: r0 */
    public Drawable f32177r0;

    /* JADX INFO: renamed from: s0 */
    public Drawable f32178s0;

    /* JADX INFO: renamed from: t0 */
    public Drawable f32179t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f32180u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f32181v0;

    /* JADX INFO: renamed from: w0 */
    public final int f32182w0;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0830n(this, 1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC17123a.f54732a);
        boolean z6 = false;
        this.f32177r0 = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f32178s0 = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f32182w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f32180u0 = true;
            this.f32179t0 = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f32180u0 ? !(this.f32177r0 != null || this.f32178s0 != null) : this.f32179t0 == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f32177r0;
        if (drawable != null && drawable.isStateful()) {
            this.f32177r0.setState(getDrawableState());
        }
        Drawable drawable2 = this.f32178s0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f32178s0.setState(getDrawableState());
        }
        Drawable drawable3 = this.f32179t0;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f32179t0.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f32177r0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f32178s0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f32179t0;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f32175p0 = findViewById(R.id.action_bar);
        this.f32176q0 = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f32174o0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        boolean z10 = true;
        if (this.f32180u0) {
            Drawable drawable = this.f32179t0;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.f32177r0 == null) {
                z10 = false;
            } else if (this.f32175p0.getVisibility() == 0) {
                this.f32177r0.setBounds(this.f32175p0.getLeft(), this.f32175p0.getTop(), this.f32175p0.getRight(), this.f32175p0.getBottom());
            } else {
                View view = this.f32176q0;
                if (view == null || view.getVisibility() != 0) {
                    this.f32177r0.setBounds(0, 0, 0, 0);
                } else {
                    this.f32177r0.setBounds(this.f32176q0.getLeft(), this.f32176q0.getTop(), this.f32176q0.getRight(), this.f32176q0.getBottom());
                }
            }
            this.f32181v0 = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f32175p0 == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f32182w0) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f32175p0 == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f32177r0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f32177r0);
        }
        this.f32177r0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f32175p0;
            if (view != null) {
                this.f32177r0.setBounds(view.getLeft(), this.f32175p0.getTop(), this.f32175p0.getRight(), this.f32175p0.getBottom());
            }
        }
        boolean z6 = false;
        if (!this.f32180u0 ? !(this.f32177r0 != null || this.f32178s0 != null) : this.f32179t0 == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f32179t0;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f32179t0);
        }
        this.f32179t0 = drawable;
        boolean z6 = this.f32180u0;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z6 && (drawable2 = this.f32179t0) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z6 ? !(this.f32177r0 != null || this.f32178s0 != null) : this.f32179t0 == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f32178s0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f32178s0);
        }
        this.f32178s0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f32181v0 && this.f32178s0 != null) {
                throw null;
            }
        }
        boolean z6 = false;
        if (!this.f32180u0 ? !(this.f32177r0 != null || this.f32178s0 != null) : this.f32179t0 == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z6) {
        this.f32174o0 = z6;
        setDescendantFocusability(z6 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z6 = i10 == 0;
        Drawable drawable = this.f32177r0;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
        Drawable drawable2 = this.f32178s0;
        if (drawable2 != null) {
            drawable2.setVisible(z6, false);
        }
        Drawable drawable3 = this.f32179t0;
        if (drawable3 != null) {
            drawable3.setVisible(z6, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f32177r0;
        boolean z6 = this.f32180u0;
        return (drawable == drawable2 && !z6) || (drawable == this.f32178s0 && this.f32181v0) || ((drawable == this.f32179t0 && z6) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    public void setTabContainer(AbstractC19307M0 abstractC19307M0) {
    }
}
