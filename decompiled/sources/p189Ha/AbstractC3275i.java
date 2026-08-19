package p189Ha;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import p030B2.AbstractC0728I;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p140Fa.C2687g;
import p140Fa.C2691k;
import p287La.AbstractC4967a;
import p523V9.AbstractC7979R3;
import p523V9.AbstractC8070d4;
import p658b5.C11238i;
import p783ha.AbstractC14431a;
import p897n3.C17474a;
import za.AbstractC21828k;

/* JADX INFO: renamed from: Ha.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3275i extends FrameLayout {

    /* JADX INFO: renamed from: z0 */
    public static final ViewOnTouchListenerC3274h f9952z0 = new ViewOnTouchListenerC3274h();

    /* JADX INFO: renamed from: o0 */
    public AbstractC3276j f9953o0;

    /* JADX INFO: renamed from: p0 */
    public final C2691k f9954p0;

    /* JADX INFO: renamed from: q0 */
    public int f9955q0;

    /* JADX INFO: renamed from: r0 */
    public final float f9956r0;

    /* JADX INFO: renamed from: s0 */
    public final float f9957s0;

    /* JADX INFO: renamed from: t0 */
    public final int f9958t0;

    /* JADX INFO: renamed from: u0 */
    public final int f9959u0;

    /* JADX INFO: renamed from: v0 */
    public ColorStateList f9960v0;

    /* JADX INFO: renamed from: w0 */
    public PorterDuff.Mode f9961w0;

    /* JADX INFO: renamed from: x0 */
    public Rect f9962x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f9963y0;

    public AbstractC3275i(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(AbstractC4967a.m5610a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC14431a.f45363D);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            AbstractC0730K.m1554k(this, dimensionPixelSize);
        }
        this.f9955q0 = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f9954p0 = C2691k.m3691b(context2, attributeSet, 0, 0).m3689a();
        }
        this.f9956r0 = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC7979R3.m8279c(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC21828k.m22312g(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f9957s0 = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f9958t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f9959u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f9952z0);
        setFocusable(true);
        if (getBackground() == null) {
            int iM8480g = AbstractC8070d4.m8480g(getBackgroundOverlayColorAlpha(), AbstractC8070d4.m8478e(this, R.attr.colorSurface), AbstractC8070d4.m8478e(this, R.attr.colorOnSurface));
            C2691k c2691k = this.f9954p0;
            if (c2691k != null) {
                C17474a c17474a = AbstractC3276j.f9967x;
                C2687g c2687g = new C2687g(c2691k);
                c2687g.m3682l(ColorStateList.valueOf(iM8480g));
                drawable = c2687g;
            } else {
                Resources resources = getResources();
                C17474a c17474a2 = AbstractC3276j.f9967x;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iM8480g);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f9960v0;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
            setBackground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(AbstractC3276j abstractC3276j) {
        this.f9953o0 = abstractC3276j;
    }

    public float getActionTextColorAlpha() {
        return this.f9957s0;
    }

    public int getAnimationMode() {
        return this.f9955q0;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f9956r0;
    }

    public int getMaxInlineActionWidth() {
        return this.f9959u0;
    }

    public int getMaxWidth() {
        return this.f9958t0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        AbstractC3276j abstractC3276j = this.f9953o0;
        if (abstractC3276j != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = abstractC3276j.f9978i.getRootWindowInsets()) != null) {
            abstractC3276j.f9987r = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            abstractC3276j.m4155f();
        }
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        AbstractC0728I.m1543c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z6;
        super.onDetachedFromWindow();
        AbstractC3276j abstractC3276j = this.f9953o0;
        if (abstractC3276j != null) {
            C11238i c11238iM12530k0 = C11238i.m12530k0();
            C3272f c3272f = abstractC3276j.f9992w;
            synchronized (c11238iM12530k0.f34008Y) {
                z6 = true;
                if (!c11238iM12530k0.m12571p0(c3272f)) {
                    C3279m c3279m = (C3279m) c11238iM12530k0.f34011p0;
                    if (!(c3279m != null && c3279m.f9997a.get() == c3272f)) {
                        z6 = false;
                    }
                }
            }
            if (z6) {
                AbstractC3276j.f9964A.post(new RunnableC3270d(abstractC3276j, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        AbstractC3276j abstractC3276j = this.f9953o0;
        if (abstractC3276j == null || !abstractC3276j.f9989t) {
            return;
        }
        abstractC3276j.m4154e();
        abstractC3276j.f9989t = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f9958t0;
        if (i12 <= 0 || getMeasuredWidth() <= i12) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
    }

    public void setAnimationMode(int i10) {
        this.f9955q0 = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f9960v0 != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f9960v0);
            drawable.setTintMode(this.f9961w0);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f9960v0 = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f9961w0);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f9961w0 = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.f9963y0 || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f9962x0 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        AbstractC3276j abstractC3276j = this.f9953o0;
        if (abstractC3276j != null) {
            C17474a c17474a = AbstractC3276j.f9967x;
            abstractC3276j.m4155f();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f9952z0);
        super.setOnClickListener(onClickListener);
    }
}
