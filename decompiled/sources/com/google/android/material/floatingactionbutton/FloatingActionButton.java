package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p013Ab.C0420b;
import p030B2.AbstractC0738T;
import p084D4.C1950y;
import p1079wa.InterfaceC20853a;
import p1103xa.AbstractC21167h;
import p1103xa.C21160a;
import p1103xa.C21169j;
import p140Fa.C2687g;
import p140Fa.C2688h;
import p140Fa.C2691k;
import p140Fa.InterfaceC2701u;
import p213Ia.C3654a;
import p239Ja.C4308k;
import p287La.AbstractC4967a;
import p449S9.C7042K;
import p523V9.AbstractC7979R3;
import p523V9.AbstractC8151n5;
import p692d0.C12959L;
import p783ha.AbstractC14431a;
import p784hb.C14437f;
import p806ia.C14954d;
import p862l2.AbstractC16803b;
import p862l2.C16806e;
import p862l2.InterfaceC16802a;
import p862l2.ViewTreeObserverOnPreDrawListenerC16807f;
import p999s.C19372q;
import za.AbstractC21828k;
import za.AbstractC21829l;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends AbstractC21829l implements InterfaceC20853a, InterfaceC2701u, InterfaceC16802a {

    /* JADX INFO: renamed from: A0 */
    public final Rect f36641A0;

    /* JADX INFO: renamed from: B0 */
    public final C0420b f36642B0;

    /* JADX INFO: renamed from: C0 */
    public final C7042K f36643C0;

    /* JADX INFO: renamed from: D0 */
    public C21169j f36644D0;

    /* JADX INFO: renamed from: p0 */
    public ColorStateList f36645p0;

    /* JADX INFO: renamed from: q0 */
    public PorterDuff.Mode f36646q0;

    /* JADX INFO: renamed from: r0 */
    public ColorStateList f36647r0;

    /* JADX INFO: renamed from: s0 */
    public PorterDuff.Mode f36648s0;

    /* JADX INFO: renamed from: t0 */
    public ColorStateList f36649t0;

    /* JADX INFO: renamed from: u0 */
    public int f36650u0;

    /* JADX INFO: renamed from: v0 */
    public int f36651v0;

    /* JADX INFO: renamed from: w0 */
    public int f36652w0;

    /* JADX INFO: renamed from: x0 */
    public int f36653x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f36654y0;

    /* JADX INFO: renamed from: z0 */
    public final Rect f36655z0;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(AbstractC4967a.m5610a(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        this.f69279o0 = getVisibility();
        this.f36655z0 = new Rect();
        this.f36641A0 = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM22311f = AbstractC21828k.m22311f(context2, attributeSet, AbstractC14431a.f45376i, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f36645p0 = AbstractC7979R3.m8279c(context2, typedArrayM22311f, 1);
        this.f36646q0 = AbstractC21828k.m22312g(typedArrayM22311f.getInt(2, -1), null);
        this.f36649t0 = AbstractC7979R3.m8279c(context2, typedArrayM22311f, 12);
        this.f36650u0 = typedArrayM22311f.getInt(7, -1);
        this.f36651v0 = typedArrayM22311f.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayM22311f.getDimensionPixelSize(3, 0);
        float dimension = typedArrayM22311f.getDimension(4, 0.0f);
        float dimension2 = typedArrayM22311f.getDimension(9, 0.0f);
        float dimension3 = typedArrayM22311f.getDimension(11, 0.0f);
        this.f36654y0 = typedArrayM22311f.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayM22311f.getDimensionPixelSize(10, 0));
        C14954d c14954dM16116a = C14954d.m16116a(context2, typedArrayM22311f, 15);
        C14954d c14954dM16116a2 = C14954d.m16116a(context2, typedArrayM22311f, 8);
        C2688h c2688h = C2691k.f8273m;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC14431a.f45388u, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C2691k c2691kM3689a = C2691k.m3690a(context2, resourceId, resourceId2, c2688h).m3689a();
        boolean z6 = typedArrayM22311f.getBoolean(5, false);
        setEnabled(typedArrayM22311f.getBoolean(0, true));
        typedArrayM22311f.recycle();
        C0420b c0420b = new C0420b(this);
        this.f36642B0 = c0420b;
        c0420b.m1069y(attributeSet, R.attr.floatingActionButtonStyle);
        C7042K c7042k = new C7042K();
        c7042k.f22495b = false;
        c7042k.f22494a = 0;
        c7042k.f22496c = this;
        this.f36643C0 = c7042k;
        getImpl().m21608n(c2691kM3689a);
        getImpl().mo21601g(this.f36645p0, this.f36646q0, this.f36649t0, dimensionPixelSize);
        getImpl().f67291k = dimensionPixelSize2;
        AbstractC21167h impl = getImpl();
        if (impl.f67288h != dimension) {
            impl.f67288h = dimension;
            impl.mo21605k(dimension, impl.f67289i, impl.f67290j);
        }
        AbstractC21167h impl2 = getImpl();
        if (impl2.f67289i != dimension2) {
            impl2.f67289i = dimension2;
            impl2.mo21605k(impl2.f67288h, dimension2, impl2.f67290j);
        }
        AbstractC21167h impl3 = getImpl();
        if (impl3.f67290j != dimension3) {
            impl3.f67290j = dimension3;
            impl3.mo21605k(impl3.f67288h, impl3.f67289i, dimension3);
        }
        getImpl().f67293m = c14954dM16116a;
        getImpl().f67294n = c14954dM16116a2;
        getImpl().f67286f = z6;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private AbstractC21167h getImpl() {
        if (this.f36644D0 == null) {
            this.f36644D0 = new C21169j(this, new C14437f(this));
        }
        return this.f36644D0;
    }

    /* JADX INFO: renamed from: c */
    public final int m13643c(int i10) {
        int i11 = this.f36651v0;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return i10 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m13643c(1) : m13643c(0);
    }

    /* JADX INFO: renamed from: d */
    public final void m13644d() {
        AbstractC21167h impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f67299s;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f67298r == 1) {
                return;
            }
        } else if (impl.f67298r != 2) {
            return;
        }
        Animator animator = impl.f67292l;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        FloatingActionButton floatingActionButton2 = impl.f67299s;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.m22313a(4, false);
            return;
        }
        C14954d c14954d = impl.f67294n;
        AnimatorSet animatorSetM21597b = c14954d != null ? impl.m21597b(c14954d, 0.0f, 0.0f, 0.0f) : impl.m21598c(0.0f, 0.4f, 0.4f, AbstractC21167h.f67272C, AbstractC21167h.f67273D);
        animatorSetM21597b.addListener(new C1950y(impl));
        animatorSetM21597b.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo21604j(getDrawableState());
    }

    /* JADX INFO: renamed from: e */
    public final void m13645e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f36647r0;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f36648s0;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C19372q.m20474c(colorForState, mode));
    }

    /* JADX INFO: renamed from: f */
    public final void m13646f() {
        AbstractC21167h impl = getImpl();
        if (impl.f67299s.getVisibility() != 0) {
            if (impl.f67298r == 2) {
                return;
            }
        } else if (impl.f67298r != 1) {
            return;
        }
        Animator animator = impl.f67292l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z6 = impl.f67293m == null;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        FloatingActionButton floatingActionButton = impl.f67299s;
        boolean z10 = floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
        Matrix matrix = impl.f67304x;
        if (!z10) {
            floatingActionButton.m22313a(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f67296p = 1.0f;
            impl.m21596a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z6 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z6 ? 0.4f : 0.0f);
            float f10 = z6 ? 0.4f : 0.0f;
            impl.f67296p = f10;
            impl.m21596a(f10, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        C14954d c14954d = impl.f67293m;
        AnimatorSet animatorSetM21597b = c14954d != null ? impl.m21597b(c14954d, 1.0f, 1.0f, 1.0f) : impl.m21598c(1.0f, 1.0f, 1.0f, AbstractC21167h.f67270A, AbstractC21167h.f67271B);
        animatorSetM21597b.addListener(new C4308k(impl, 8));
        animatorSetM21597b.start();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f36645p0;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f36646q0;
    }

    @Override // p862l2.InterfaceC16802a
    public AbstractC16803b getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo21599e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f67289i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f67290j;
    }

    public Drawable getContentBackground() {
        return getImpl().f67285e;
    }

    public int getCustomSize() {
        return this.f36651v0;
    }

    public int getExpandedComponentIdHint() {
        return this.f36643C0.f22494a;
    }

    public C14954d getHideMotionSpec() {
        return getImpl().f67294n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f36649t0;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f36649t0;
    }

    public C2691k getShapeAppearanceModel() {
        C2691k c2691k = getImpl().f67281a;
        c2691k.getClass();
        return c2691k;
    }

    public C14954d getShowMotionSpec() {
        return getImpl().f67293m;
    }

    public int getSize() {
        return this.f36650u0;
    }

    public int getSizeDimension() {
        return m13643c(this.f36650u0);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f36647r0;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f36648s0;
    }

    public boolean getUseCompatPadding() {
        return this.f36654y0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo21602h();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC21167h impl = getImpl();
        C2687g c2687g = impl.f67282b;
        FloatingActionButton floatingActionButton = impl.f67299s;
        if (c2687g != null) {
            AbstractC8151n5.m8696d(floatingActionButton, c2687g);
        }
        if (impl instanceof C21169j) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (impl.f67305y == null) {
            impl.f67305y = new ViewTreeObserverOnPreDrawListenerC16807f(impl, 1);
        }
        viewTreeObserver.addOnPreDrawListener(impl.f67305y);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC21167h impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f67299s.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC16807f viewTreeObserverOnPreDrawListenerC16807f = impl.f67305y;
        if (viewTreeObserverOnPreDrawListenerC16807f != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC16807f);
            impl.f67305y = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f36652w0 = (sizeDimension - this.f36653x0) / 2;
        getImpl().m21611q();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f36655z0;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3654a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3654a c3654a = (C3654a) parcelable;
        super.onRestoreInstanceState(c3654a.f16000Y);
        Bundle bundle = (Bundle) c3654a.f11137o0.get("expandableWidgetHelper");
        bundle.getClass();
        C7042K c7042k = this.f36643C0;
        c7042k.getClass();
        c7042k.f22495b = bundle.getBoolean("expanded", false);
        c7042k.f22494a = bundle.getInt("expandedComponentIdHint", 0);
        if (c7042k.f22495b) {
            View view = (View) c7042k.f22496c;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                List list = (List) ((C12959L) coordinatorLayout.f32872p0.f7430o0).get(view);
                if (list == null || list.isEmpty()) {
                    return;
                }
                for (int i10 = 0; i10 < list.size(); i10++) {
                    View view2 = (View) list.get(i10);
                    AbstractC16803b abstractC16803b = ((C16806e) view2.getLayoutParams()).f53917a;
                    if (abstractC16803b != null) {
                        abstractC16803b.mo13578d(coordinatorLayout, view2, view);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        C3654a c3654a = new C3654a(parcelableOnSaveInstanceState);
        C12959L c12959l = c3654a.f11137o0;
        C7042K c7042k = this.f36643C0;
        c7042k.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", c7042k.f22495b);
        bundle.putInt("expandedComponentIdHint", c7042k.f22494a);
        c12959l.put("expandableWidgetHelper", bundle);
        return c3654a;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            if (isLaidOut()) {
                int width = getWidth();
                int height = getHeight();
                Rect rect = this.f36641A0;
                rect.set(0, 0, width, height);
                int i10 = rect.left;
                Rect rect2 = this.f36655z0;
                rect.left = i10 + rect2.left;
                rect.top += rect2.top;
                rect.right -= rect2.right;
                rect.bottom -= rect2.bottom;
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f36645p0 != colorStateList) {
            this.f36645p0 = colorStateList;
            AbstractC21167h impl = getImpl();
            C2687g c2687g = impl.f67282b;
            if (c2687g != null) {
                c2687g.setTintList(colorStateList);
            }
            C21160a c21160a = impl.f67284d;
            if (c21160a != null) {
                if (colorStateList != null) {
                    c21160a.f67247m = colorStateList.getColorForState(c21160a.getState(), c21160a.f67247m);
                }
                c21160a.f67250p = colorStateList;
                c21160a.f67248n = true;
                c21160a.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f36646q0 != mode) {
            this.f36646q0 = mode;
            C2687g c2687g = getImpl().f67282b;
            if (c2687g != null) {
                c2687g.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        AbstractC21167h impl = getImpl();
        if (impl.f67288h != f10) {
            impl.f67288h = f10;
            impl.mo21605k(f10, impl.f67289i, impl.f67290j);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        AbstractC21167h impl = getImpl();
        if (impl.f67289i != f10) {
            impl.f67289i = f10;
            impl.mo21605k(impl.f67288h, f10, impl.f67290j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        AbstractC21167h impl = getImpl();
        if (impl.f67290j != f10) {
            impl.f67290j = f10;
            impl.mo21605k(impl.f67288h, impl.f67289i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f36651v0) {
            this.f36651v0 = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C2687g c2687g = getImpl().f67282b;
        if (c2687g != null) {
            c2687g.m3681k(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z6) {
        if (z6 != getImpl().f67286f) {
            getImpl().f67286f = z6;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f36643C0.f22494a = i10;
    }

    public void setHideMotionSpec(C14954d c14954d) {
        getImpl().f67294n = c14954d;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(C14954d.m16117b(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            AbstractC21167h impl = getImpl();
            float f10 = impl.f67296p;
            impl.f67296p = f10;
            Matrix matrix = impl.f67304x;
            impl.m21596a(f10, matrix);
            impl.f67299s.setImageMatrix(matrix);
            if (this.f36647r0 != null) {
                m13645e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f36642B0.m1040C(i10);
        m13645e();
    }

    public void setMaxImageSize(int i10) {
        this.f36653x0 = i10;
        AbstractC21167h impl = getImpl();
        if (impl.f67297q != i10) {
            impl.f67297q = i10;
            float f10 = impl.f67296p;
            impl.f67296p = f10;
            Matrix matrix = impl.f67304x;
            impl.m21596a(f10, matrix);
            impl.f67299s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z6) {
        AbstractC21167h impl = getImpl();
        impl.f67287g = z6;
        impl.m21611q();
    }

    @Override // p140Fa.InterfaceC2701u
    public void setShapeAppearanceModel(C2691k c2691k) {
        getImpl().m21608n(c2691k);
    }

    public void setShowMotionSpec(C14954d c14954d) {
        getImpl().f67293m = c14954d;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(C14954d.m16117b(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f36651v0 = 0;
        if (i10 != this.f36650u0) {
            this.f36650u0 = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f36647r0 != colorStateList) {
            this.f36647r0 = colorStateList;
            m13645e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f36648s0 != mode) {
            this.f36648s0 = mode;
            m13645e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().m21606l();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().m21606l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().m21606l();
    }

    public void setUseCompatPadding(boolean z6) {
        if (this.f36654y0 != z6) {
            this.f36654y0 = z6;
            getImpl().mo21603i();
        }
    }

    @Override // za.AbstractC21829l, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends AbstractC16803b {

        /* JADX INFO: renamed from: a */
        public final boolean f36656a;

        public BaseBehavior() {
            this.f36656a = true;
        }

        @Override // p862l2.AbstractC16803b
        /* JADX INFO: renamed from: a */
        public final boolean mo13641a(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int left = floatingActionButton.getLeft();
            Rect rect2 = floatingActionButton.f36655z0;
            rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // p862l2.AbstractC16803b
        /* JADX INFO: renamed from: c */
        public final void mo13594c(C16806e c16806e) {
            if (c16806e.f53924h == 0) {
                c16806e.f53924h = 80;
            }
        }

        @Override // p862l2.AbstractC16803b
        /* JADX INFO: renamed from: d */
        public final boolean mo13578d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof C16806e ? ((C16806e) layoutParams).f53917a instanceof BottomSheetBehavior : false) {
                m13647r(view2, floatingActionButton);
            }
            return false;
        }

        @Override // p862l2.AbstractC16803b
        /* JADX INFO: renamed from: g */
        public final boolean mo13567g(CoordinatorLayout coordinatorLayout, View view, int i10) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListM11373j = coordinatorLayout.m11373j(floatingActionButton);
            int size = arrayListM11373j.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                View view2 = (View) arrayListM11373j.get(i12);
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof C16806e ? ((C16806e) layoutParams).f53917a instanceof BottomSheetBehavior : false) && m13647r(view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m11378q(floatingActionButton, i10);
            Rect rect = floatingActionButton.f36655z0;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C16806e c16806e = (C16806e) floatingActionButton.getLayoutParams();
                int i13 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c16806e).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c16806e).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c16806e).bottomMargin) {
                    i11 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c16806e).topMargin) {
                    i11 = -rect.top;
                }
                if (i11 != 0) {
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    floatingActionButton.offsetTopAndBottom(i11);
                }
                if (i13 != 0) {
                    WeakHashMap weakHashMap2 = AbstractC0738T.f2096a;
                    floatingActionButton.offsetLeftAndRight(i13);
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: r */
        public final boolean m13647r(View view, FloatingActionButton floatingActionButton) {
            if (!(this.f36656a && ((C16806e) floatingActionButton.getLayoutParams()).f53922f == view.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((C16806e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m13644d();
            } else {
                floatingActionButton.m13646f();
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14431a.f45377j);
            this.f36656a = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f36649t0 != colorStateList) {
            this.f36649t0 = colorStateList;
            getImpl().mo21607m(this.f36649t0);
        }
    }
}
