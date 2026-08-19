package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import p090Da.AbstractC1982a;
import p140Fa.C2681a;
import p140Fa.C2686f;
import p140Fa.C2687g;
import p140Fa.C2690j;
import p140Fa.C2691k;
import p140Fa.InterfaceC2701u;
import p287La.AbstractC4967a;
import p523V9.AbstractC7979R3;
import p523V9.AbstractC8070d4;
import p523V9.AbstractC8151n5;
import p571X9.AbstractC9106B3;
import p783ha.AbstractC14431a;
import p913o2.AbstractC17803d;
import p921oa.C18034c;
import p921oa.InterfaceC18032a;
import za.AbstractC21828k;

/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC2701u {

    /* JADX INFO: renamed from: v0 */
    public final C18034c f36498v0;

    /* JADX INFO: renamed from: w0 */
    public final boolean f36499w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f36500x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f36501y0;

    /* JADX INFO: renamed from: z0 */
    public static final int[] f36497z0 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: A0 */
    public static final int[] f36495A0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: B0 */
    public static final int[] f36496B0 = {com.openai.chatgpt.R.attr.state_dragged};

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(AbstractC4967a.m5610a(context, attributeSet, com.openai.chatgpt.R.attr.materialCardViewStyle, com.openai.chatgpt.R.style.Widget_MaterialComponents_CardView), attributeSet, com.openai.chatgpt.R.attr.materialCardViewStyle);
        this.f36500x0 = false;
        this.f36501y0 = false;
        this.f36499w0 = true;
        TypedArray typedArrayM22311f = AbstractC21828k.m22311f(getContext(), attributeSet, AbstractC14431a.f45384q, com.openai.chatgpt.R.attr.materialCardViewStyle, com.openai.chatgpt.R.style.Widget_MaterialComponents_CardView, new int[0]);
        C18034c c18034c = new C18034c(this, attributeSet);
        this.f36498v0 = c18034c;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        C2687g c2687g = c18034c.f57561c;
        c2687g.m3682l(cardBackgroundColor);
        c18034c.f57560b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c18034c.m19692j();
        MaterialCardView materialCardView = c18034c.f57559a;
        ColorStateList colorStateListM8279c = AbstractC7979R3.m8279c(materialCardView.getContext(), typedArrayM22311f, 11);
        c18034c.f57572n = colorStateListM8279c;
        if (colorStateListM8279c == null) {
            c18034c.f57572n = ColorStateList.valueOf(-1);
        }
        c18034c.f57566h = typedArrayM22311f.getDimensionPixelSize(12, 0);
        boolean z6 = typedArrayM22311f.getBoolean(0, false);
        c18034c.f57577s = z6;
        materialCardView.setLongClickable(z6);
        c18034c.f57570l = AbstractC7979R3.m8279c(materialCardView.getContext(), typedArrayM22311f, 6);
        c18034c.m19689g(AbstractC7979R3.m8282f(materialCardView.getContext(), typedArrayM22311f, 2));
        c18034c.f57564f = typedArrayM22311f.getDimensionPixelSize(5, 0);
        c18034c.f57563e = typedArrayM22311f.getDimensionPixelSize(4, 0);
        c18034c.f57565g = typedArrayM22311f.getInteger(3, 8388661);
        ColorStateList colorStateListM8279c2 = AbstractC7979R3.m8279c(materialCardView.getContext(), typedArrayM22311f, 7);
        c18034c.f57569k = colorStateListM8279c2;
        if (colorStateListM8279c2 == null) {
            c18034c.f57569k = ColorStateList.valueOf(AbstractC8070d4.m8478e(materialCardView, com.openai.chatgpt.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListM8279c3 = AbstractC7979R3.m8279c(materialCardView.getContext(), typedArrayM22311f, 1);
        C2687g c2687g2 = c18034c.f57562d;
        c2687g2.m3682l(colorStateListM8279c3 == null ? ColorStateList.valueOf(0) : colorStateListM8279c3);
        int[] iArr = AbstractC1982a.f5854a;
        RippleDrawable rippleDrawable = c18034c.f57573o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c18034c.f57569k);
        }
        c2687g.m3681k(materialCardView.getCardElevation());
        float f10 = c18034c.f57566h;
        ColorStateList colorStateList = c18034c.f57572n;
        c2687g2.f8246Y.f8229j = f10;
        c2687g2.invalidateSelf();
        C2686f c2686f = c2687g2.f8246Y;
        if (c2686f.f8223d != colorStateList) {
            c2686f.f8223d = colorStateList;
            c2687g2.onStateChange(c2687g2.getState());
        }
        materialCardView.setBackgroundInternal(c18034c.m19686d(c2687g));
        Drawable drawableM19685c = materialCardView.isClickable() ? c18034c.m19685c() : c2687g2;
        c18034c.f57567i = drawableM19685c;
        materialCardView.setForeground(c18034c.m19686d(drawableM19685c));
        typedArrayM22311f.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f36498v0.f57561c.getBounds());
        return rectF;
    }

    /* JADX INFO: renamed from: b */
    public final void m13613b() {
        C18034c c18034c;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (c18034c = this.f36498v0).f57573o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i10 = bounds.bottom;
        c18034c.f57573o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
        c18034c.f57573o.setBounds(bounds.left, bounds.top, bounds.right, i10);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f36498v0.f57561c.f8246Y.f8222c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f36498v0.f57562d.f8246Y.f8222c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f36498v0.f57568j;
    }

    public int getCheckedIconGravity() {
        return this.f36498v0.f57565g;
    }

    public int getCheckedIconMargin() {
        return this.f36498v0.f57563e;
    }

    public int getCheckedIconSize() {
        return this.f36498v0.f57564f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f36498v0.f57570l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f36498v0.f57560b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f36498v0.f57560b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f36498v0.f57560b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f36498v0.f57560b.top;
    }

    public float getProgress() {
        return this.f36498v0.f57561c.f8246Y.f8228i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f36498v0.f57561c.m3677g();
    }

    public ColorStateList getRippleColor() {
        return this.f36498v0.f57569k;
    }

    public C2691k getShapeAppearanceModel() {
        return this.f36498v0.f57571m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f36498v0.f57572n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f36498v0.f57572n;
    }

    public int getStrokeWidth() {
        return this.f36498v0.f57566h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f36500x0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC8151n5.m8696d(this, this.f36498v0.f57561c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        C18034c c18034c = this.f36498v0;
        if (c18034c != null && c18034c.f57577s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36497z0);
        }
        if (this.f36500x0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36495A0);
        }
        if (this.f36501y0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36496B0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f36500x0);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C18034c c18034c = this.f36498v0;
        accessibilityNodeInfo.setCheckable(c18034c != null && c18034c.f57577s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f36500x0);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f36498v0.m19687e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f36499w0) {
            C18034c c18034c = this.f36498v0;
            if (!c18034c.f57576r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c18034c.f57576r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f36498v0.f57561c.m3682l(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        C18034c c18034c = this.f36498v0;
        c18034c.f57561c.m3681k(c18034c.f57559a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C2687g c2687g = this.f36498v0.f57562d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c2687g.m3682l(colorStateList);
    }

    public void setCheckable(boolean z6) {
        this.f36498v0.f57577s = z6;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (this.f36500x0 != z6) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f36498v0.m19689g(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        C18034c c18034c = this.f36498v0;
        if (c18034c.f57565g != i10) {
            c18034c.f57565g = i10;
            MaterialCardView materialCardView = c18034c.f57559a;
            c18034c.m19687e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f36498v0.f57563e = i10;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f36498v0.f57563e = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f36498v0.m19689g(AbstractC9106B3.m9636b(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f36498v0.f57564f = i10;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f36498v0.f57564f = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C18034c c18034c = this.f36498v0;
        c18034c.f57570l = colorStateList;
        Drawable drawable = c18034c.f57568j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z6) {
        super.setClickable(z6);
        C18034c c18034c = this.f36498v0;
        if (c18034c != null) {
            Drawable drawable = c18034c.f57567i;
            MaterialCardView materialCardView = c18034c.f57559a;
            Drawable drawableM19685c = materialCardView.isClickable() ? c18034c.m19685c() : c18034c.f57562d;
            c18034c.f57567i = drawableM19685c;
            if (drawable != drawableM19685c) {
                if (materialCardView.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableM19685c);
                } else {
                    materialCardView.setForeground(c18034c.m19686d(drawableM19685c));
                }
            }
        }
    }

    public void setDragged(boolean z6) {
        if (this.f36501y0 != z6) {
            this.f36501y0 = z6;
            refreshDrawableState();
            m13613b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f36498v0.m19693k();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z6) {
        super.setPreventCornerOverlap(z6);
        C18034c c18034c = this.f36498v0;
        c18034c.m19693k();
        c18034c.m19692j();
    }

    public void setProgress(float f10) {
        C18034c c18034c = this.f36498v0;
        c18034c.f57561c.m3683m(f10);
        C2687g c2687g = c18034c.f57562d;
        if (c2687g != null) {
            c2687g.m3683m(f10);
        }
        C2687g c2687g2 = c18034c.f57575q;
        if (c2687g2 != null) {
            c2687g2.m3683m(f10);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        C18034c c18034c = this.f36498v0;
        C2690j c2690jM3694e = c18034c.f57571m.m3694e();
        c2690jM3694e.f8265e = new C2681a(f10);
        c2690jM3694e.f8266f = new C2681a(f10);
        c2690jM3694e.f8267g = new C2681a(f10);
        c2690jM3694e.f8268h = new C2681a(f10);
        c18034c.m19690h(c2690jM3694e.m3689a());
        c18034c.f57567i.invalidateSelf();
        if (c18034c.m19691i() || (c18034c.f57559a.getPreventCornerOverlap() && !c18034c.f57561c.m3680j())) {
            c18034c.m19692j();
        }
        if (c18034c.m19691i()) {
            c18034c.m19693k();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C18034c c18034c = this.f36498v0;
        c18034c.f57569k = colorStateList;
        int[] iArr = AbstractC1982a.f5854a;
        RippleDrawable rippleDrawable = c18034c.f57573o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        ColorStateList colorStateListM19556c = AbstractC17803d.m19556c(getContext(), i10);
        C18034c c18034c = this.f36498v0;
        c18034c.f57569k = colorStateListM19556c;
        int[] iArr = AbstractC1982a.f5854a;
        RippleDrawable rippleDrawable = c18034c.f57573o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListM19556c);
        }
    }

    @Override // p140Fa.InterfaceC2701u
    public void setShapeAppearanceModel(C2691k c2691k) {
        setClipToOutline(c2691k.m3693d(getBoundsAsRectF()));
        this.f36498v0.m19690h(c2691k);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        C18034c c18034c = this.f36498v0;
        if (i10 != c18034c.f57566h) {
            c18034c.f57566h = i10;
            C2687g c2687g = c18034c.f57562d;
            ColorStateList colorStateList = c18034c.f57572n;
            c2687g.f8246Y.f8229j = i10;
            c2687g.invalidateSelf();
            C2686f c2686f = c2687g.f8246Y;
            if (c2686f.f8223d != colorStateList) {
                c2686f.f8223d = colorStateList;
                c2687g.onStateChange(c2687g.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z6) {
        super.setUseCompatPadding(z6);
        C18034c c18034c = this.f36498v0;
        c18034c.m19693k();
        c18034c.m19692j();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        C18034c c18034c = this.f36498v0;
        if (c18034c != null && c18034c.f57577s && isEnabled()) {
            this.f36500x0 = !this.f36500x0;
            refreshDrawableState();
            m13613b();
            c18034c.m19688f(this.f36500x0, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C18034c c18034c = this.f36498v0;
        if (c18034c.f57572n != colorStateList) {
            c18034c.f57572n = colorStateList;
            C2687g c2687g = c18034c.f57562d;
            c2687g.f8246Y.f8229j = c18034c.f57566h;
            c2687g.invalidateSelf();
            C2686f c2686f = c2687g.f8246Y;
            if (c2686f.f8223d != colorStateList) {
                c2686f.f8223d = colorStateList;
                c2687g.onStateChange(c2687g.getState());
            }
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        this.f36498v0.f57561c.m3682l(ColorStateList.valueOf(i10));
    }

    public void setOnCheckedChangeListener(InterfaceC18032a interfaceC18032a) {
    }
}
