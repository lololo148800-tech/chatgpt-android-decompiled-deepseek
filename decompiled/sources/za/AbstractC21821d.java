package za;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p783ha.AbstractC14431a;
import p999s.AbstractC19379t0;

/* JADX INFO: renamed from: za.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21821d extends AbstractC19379t0 {

    /* JADX INFO: renamed from: D0 */
    public Drawable f69252D0;

    /* JADX INFO: renamed from: E0 */
    public final Rect f69253E0;

    /* JADX INFO: renamed from: F0 */
    public final Rect f69254F0;

    /* JADX INFO: renamed from: G0 */
    public int f69255G0;

    /* JADX INFO: renamed from: H0 */
    public final boolean f69256H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f69257I0;

    public AbstractC21821d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69253E0 = new Rect();
        this.f69254F0 = new Rect();
        this.f69255G0 = 119;
        this.f69256H0 = true;
        this.f69257I0 = false;
        int[] iArr = AbstractC14431a.f45378k;
        AbstractC21828k.m22306a(context, attributeSet, 0, 0);
        AbstractC21828k.m22307b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f69255G0 = typedArrayObtainStyledAttributes.getInt(1, this.f69255G0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f69256H0 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f69252D0;
        if (drawable != null) {
            if (this.f69257I0) {
                this.f69257I0 = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z6 = this.f69256H0;
                Rect rect = this.f69253E0;
                if (z6) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.f69255G0;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f69254F0;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f69252D0;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f69252D0;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f69252D0.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f69252D0;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f69255G0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f69252D0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p999s.AbstractC19379t0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        this.f69257I0 = z6 | this.f69257I0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f69257I0 = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f69252D0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f69252D0);
            }
            this.f69252D0 = drawable;
            this.f69257I0 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f69255G0 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f69255G0 != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f69255G0 = i10;
            if (i10 == 119 && this.f69252D0 != null) {
                this.f69252D0.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f69252D0;
    }
}
