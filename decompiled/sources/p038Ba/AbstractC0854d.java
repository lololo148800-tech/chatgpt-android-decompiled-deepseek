package p038Ba;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p287La.AbstractC4967a;
import p523V9.AbstractC7979R3;
import p523V9.AbstractC8070d4;
import p783ha.AbstractC14431a;
import za.AbstractC21828k;

/* JADX INFO: renamed from: Ba.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0854d extends ProgressBar {

    /* JADX INFO: renamed from: o0 */
    public final C0859i f2370o0;

    /* JADX INFO: renamed from: p0 */
    public int f2371p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f2372q0;

    /* JADX INFO: renamed from: r0 */
    public final int f2373r0;

    /* JADX INFO: renamed from: s0 */
    public C0851a f2374s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f2375t0;

    /* JADX INFO: renamed from: u0 */
    public int f2376u0;

    /* JADX INFO: renamed from: v0 */
    public final RunnableC0852b f2377v0;

    /* JADX INFO: renamed from: w0 */
    public final RunnableC0852b f2378w0;

    /* JADX INFO: renamed from: x0 */
    public final C0853c f2379x0;

    /* JADX INFO: renamed from: y0 */
    public final C0853c f2380y0;

    public AbstractC0854d(Context context, AttributeSet attributeSet) {
        super(AbstractC4967a.m5610a(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, R.attr.circularProgressIndicatorStyle);
        this.f2375t0 = false;
        this.f2376u0 = 4;
        this.f2377v0 = new RunnableC0852b(this, 0);
        this.f2378w0 = new RunnableC0852b(this, 1);
        this.f2379x0 = new C0853c(this, 0);
        this.f2380y0 = new C0853c(this, 1);
        Context context2 = getContext();
        C0859i c0859i = new C0859i();
        c0859i.f2403c = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        int[] iArr = AbstractC14431a.f45368a;
        AbstractC21828k.m22306a(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        AbstractC21828k.m22307b(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        c0859i.f2401a = AbstractC7979R3.m8281e(context2, typedArrayObtainStyledAttributes, 8, dimensionPixelSize);
        c0859i.f2402b = Math.min(AbstractC7979R3.m8281e(context2, typedArrayObtainStyledAttributes, 7, 0), c0859i.f2401a / 2);
        c0859i.f2405e = typedArrayObtainStyledAttributes.getInt(4, 0);
        c0859i.f2406f = typedArrayObtainStyledAttributes.getInt(1, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            c0859i.f2403c = new int[]{AbstractC8070d4.m8477d(context2, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            c0859i.f2403c = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            c0859i.f2403c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            c0859i.f2404d = typedArrayObtainStyledAttributes.getColor(6, -1);
        } else {
            c0859i.f2404d = c0859i.f2403c[0];
            TypedArray typedArrayObtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f10 = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            c0859i.f2404d = AbstractC8070d4.m8476c(c0859i.f2404d, (int) (f10 * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        int[] iArr2 = AbstractC14431a.f45372e;
        AbstractC21828k.m22306a(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        AbstractC21828k.m22307b(context2, attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        c0859i.f2407g = Math.max(AbstractC7979R3.m8281e(context2, typedArrayObtainStyledAttributes3, 2, dimensionPixelSize2), c0859i.f2401a * 2);
        c0859i.f2408h = AbstractC7979R3.m8281e(context2, typedArrayObtainStyledAttributes3, 1, dimensionPixelSize3);
        c0859i.f2409i = typedArrayObtainStyledAttributes3.getInt(0, 0);
        typedArrayObtainStyledAttributes3.recycle();
        this.f2370o0 = c0859i;
        AbstractC21828k.m22306a(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        AbstractC21828k.m22307b(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        typedArrayObtainStyledAttributes4.getInt(5, -1);
        this.f2373r0 = Math.min(typedArrayObtainStyledAttributes4.getInt(3, -1), 1000);
        typedArrayObtainStyledAttributes4.recycle();
        this.f2374s0 = new C0851a();
        this.f2372q0 = true;
    }

    private AbstractC0864n getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f2434x0;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f2413x0;
    }

    /* JADX INFO: renamed from: a */
    public final void m1915a(int i10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.f2371p0 = i10;
            this.f2375t0 = true;
            if (getIndeterminateDrawable().isVisible()) {
                C0851a c0851a = this.f2374s0;
                ContentResolver contentResolver = getContext().getContentResolver();
                c0851a.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    C0858h c0858h = getIndeterminateDrawable().f2435y0;
                    ObjectAnimator objectAnimator = c0858h.f2394e;
                    if (objectAnimator == null || objectAnimator.isRunning()) {
                        return;
                    }
                    if (((C0866p) c0858h.f2431a).isVisible()) {
                        c0858h.f2394e.start();
                        return;
                    }
                    ObjectAnimator objectAnimator2 = c0858h.f2393d;
                    if (objectAnimator2 != null) {
                        objectAnimator2.cancel();
                        return;
                    }
                    return;
                }
            }
            this.f2379x0.m1912a(getIndeterminateDrawable());
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1916b() {
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (isAttachedToWindow() && getWindowVisibility() == 0) {
            View view = this;
            while (view.getVisibility() == 0) {
                Object parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                    }
                } else if (parent instanceof View) {
                    view = (View) parent;
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f2370o0.f2406f;
    }

    public int[] getIndicatorColor() {
        return this.f2370o0.f2403c;
    }

    public int getShowAnimationBehavior() {
        return this.f2370o0.f2405e;
    }

    public int getTrackColor() {
        return this.f2370o0.f2404d;
    }

    public int getTrackCornerRadius() {
        return this.f2370o0.f2402b;
    }

    public int getTrackThickness() {
        return this.f2370o0.f2401a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f2435y0.f2400k = this.f2379x0;
        }
        C0861k progressDrawable = getProgressDrawable();
        C0853c c0853c = this.f2380y0;
        if (progressDrawable != null) {
            C0861k progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f2424r0 == null) {
                progressDrawable2.f2424r0 = new ArrayList();
            }
            if (!progressDrawable2.f2424r0.contains(c0853c)) {
                progressDrawable2.f2424r0.add(c0853c);
            }
        }
        if (getIndeterminateDrawable() != null) {
            C0866p indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f2424r0 == null) {
                indeterminateDrawable.f2424r0 = new ArrayList();
            }
            if (!indeterminateDrawable.f2424r0.contains(c0853c)) {
                indeterminateDrawable.f2424r0.add(c0853c);
            }
        }
        if (m1916b()) {
            if (this.f2373r0 > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2378w0);
        removeCallbacks(this.f2377v0);
        ((AbstractC0863m) getCurrentDrawable()).m1925c(false, false, false);
        C0866p indeterminateDrawable = getIndeterminateDrawable();
        C0853c c0853c = this.f2380y0;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().m1926e(c0853c);
            getIndeterminateDrawable().f2435y0.f2400k = null;
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().m1926e(c0853c);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        try {
            AbstractC0864n currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(((C0855e) currentDrawingDelegate).m1920e() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i10) : ((C0855e) currentDrawingDelegate).m1920e() + getPaddingLeft() + getPaddingRight(), ((C0855e) currentDrawingDelegate).m1920e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i11) : ((C0855e) currentDrawingDelegate).m1920e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        boolean z6 = i10 == 0;
        if (this.f2372q0) {
            ((AbstractC0863m) getCurrentDrawable()).m1925c(m1916b(), false, z6);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.f2372q0) {
            ((AbstractC0863m) getCurrentDrawable()).m1925c(m1916b(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(C0851a c0851a) {
        this.f2374s0 = c0851a;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f2421o0 = c0851a;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f2421o0 = c0851a;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f2370o0.f2406f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z6) {
        try {
            if (z6 == isIndeterminate()) {
                return;
            }
            AbstractC0863m abstractC0863m = (AbstractC0863m) getCurrentDrawable();
            if (abstractC0863m != null) {
                abstractC0863m.m1925c(false, false, false);
            }
            super.setIndeterminate(z6);
            AbstractC0863m abstractC0863m2 = (AbstractC0863m) getCurrentDrawable();
            if (abstractC0863m2 != null) {
                abstractC0863m2.m1925c(m1916b(), false, false);
            }
            if ((abstractC0863m2 instanceof C0866p) && m1916b()) {
                ((C0866p) abstractC0863m2).f2435y0.m1921s();
            }
            this.f2375t0 = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof C0866p)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((AbstractC0863m) drawable).m1925c(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{AbstractC8070d4.m8477d(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f2370o0.f2403c = iArr;
        C0858h c0858h = getIndeterminateDrawable().f2435y0;
        c0858h.f2397h = 0;
        ((int[]) c0858h.f2433c)[0] = AbstractC8070d4.m8476c(c0858h.f2396g.f2403c[0], ((C0866p) c0858h.f2431a).f2428v0);
        c0858h.f2399j = 0.0f;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        m1915a(i10);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof C0861k)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            C0861k c0861k = (C0861k) drawable;
            c0861k.m1925c(false, false, false);
            super.setProgressDrawable(c0861k);
            c0861k.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f2370o0.f2405e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        C0859i c0859i = this.f2370o0;
        if (c0859i.f2404d != i10) {
            c0859i.f2404d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        C0859i c0859i = this.f2370o0;
        if (c0859i.f2402b != i10) {
            c0859i.f2402b = Math.min(i10, c0859i.f2401a / 2);
        }
    }

    public void setTrackThickness(int i10) {
        C0859i c0859i = this.f2370o0;
        if (c0859i.f2401a != i10) {
            c0859i.f2401a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f2376u0 = i10;
    }

    @Override // android.widget.ProgressBar
    public C0866p getIndeterminateDrawable() {
        return (C0866p) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public C0861k getProgressDrawable() {
        return (C0861k) super.getProgressDrawable();
    }
}
