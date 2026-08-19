package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import io.sentry.android.core.AbstractC15256t;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import na.C17541b;
import na.C17542c;
import na.InterfaceC17540a;
import p030B2.AbstractC0738T;
import p090Da.AbstractC1982a;
import p140Fa.C2681a;
import p140Fa.C2690j;
import p140Fa.C2691k;
import p140Fa.InterfaceC2701u;
import p228J.AbstractC3794B0;
import p287La.AbstractC4967a;
import p523V9.AbstractC7979R3;
import p523V9.AbstractC8151n5;
import p571X9.AbstractC9106B3;
import p729ej.C13414e;
import p783ha.AbstractC14431a;
import p913o2.AbstractC17803d;
import p999s.C19366n;
import za.AbstractC21828k;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C19366n implements Checkable, InterfaceC2701u {

    /* JADX INFO: renamed from: F0 */
    public static final int[] f36468F0 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: G0 */
    public static final int[] f36469G0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: A0 */
    public int f36470A0;

    /* JADX INFO: renamed from: B0 */
    public int f36471B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f36472C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f36473D0;

    /* JADX INFO: renamed from: E0 */
    public int f36474E0;

    /* JADX INFO: renamed from: r0 */
    public final C17542c f36475r0;

    /* JADX INFO: renamed from: s0 */
    public final LinkedHashSet f36476s0;

    /* JADX INFO: renamed from: t0 */
    public InterfaceC17540a f36477t0;

    /* JADX INFO: renamed from: u0 */
    public PorterDuff.Mode f36478u0;

    /* JADX INFO: renamed from: v0 */
    public ColorStateList f36479v0;

    /* JADX INFO: renamed from: w0 */
    public Drawable f36480w0;

    /* JADX INFO: renamed from: x0 */
    public String f36481x0;

    /* JADX INFO: renamed from: y0 */
    public int f36482y0;

    /* JADX INFO: renamed from: z0 */
    public int f36483z0;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.openai.chatgpt.R.attr.materialButtonStyle);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13603a() {
        C17542c c17542c = this.f36475r0;
        return c17542c != null && c17542c.f56117q;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13604b() {
        C17542c c17542c = this.f36475r0;
        return (c17542c == null || c17542c.f56115o) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final void m13605c() {
        int i10 = this.f36474E0;
        boolean z6 = true;
        if (i10 != 1 && i10 != 2) {
            z6 = false;
        }
        if (z6) {
            setCompoundDrawablesRelative(this.f36480w0, null, null, null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            setCompoundDrawablesRelative(null, null, this.f36480w0, null);
        } else if (i10 == 16 || i10 == 32) {
            setCompoundDrawablesRelative(null, this.f36480w0, null, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m13606d(boolean z6) {
        Drawable drawable = this.f36480w0;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f36480w0 = drawableMutate;
            drawableMutate.setTintList(this.f36479v0);
            PorterDuff.Mode mode = this.f36478u0;
            if (mode != null) {
                this.f36480w0.setTintMode(mode);
            }
            int intrinsicWidth = this.f36482y0;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f36480w0.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f36482y0;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f36480w0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f36480w0;
            int i10 = this.f36483z0;
            int i11 = this.f36470A0;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f36480w0.setVisible(true, z6);
        }
        if (z6) {
            m13605c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i12 = this.f36474E0;
        if (((i12 == 1 || i12 == 2) && drawable3 != this.f36480w0) || (((i12 == 3 || i12 == 4) && drawable5 != this.f36480w0) || ((i12 == 16 || i12 == 32) && drawable4 != this.f36480w0))) {
            m13605c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13607e(int i10, int i11) {
        if (this.f36480w0 == null || getLayout() == null) {
            return;
        }
        int i12 = this.f36474E0;
        if (!(i12 == 1 || i12 == 2) && i12 != 3 && i12 != 4) {
            if (i12 == 16 || i12 == 32) {
                this.f36483z0 = 0;
                if (i12 == 16) {
                    this.f36470A0 = 0;
                    m13606d(false);
                    return;
                }
                int intrinsicHeight = this.f36482y0;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f36480w0.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f36471B0) - getPaddingBottom()) / 2);
                if (this.f36470A0 != iMax) {
                    this.f36470A0 = iMax;
                    m13606d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f36470A0 = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.f36474E0;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f36483z0 = 0;
            m13606d(false);
            return;
        }
        int intrinsicWidth = this.f36482y0;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f36480w0.getIntrinsicWidth();
        }
        int textLayoutWidth = i10 - getTextLayoutWidth();
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f36471B0) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f36474E0 == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f36483z0 != paddingEnd) {
            this.f36483z0 = paddingEnd;
            m13606d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f36481x0)) {
            return (m13603a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f36481x0;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m13604b()) {
            return this.f36475r0.f56107g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f36480w0;
    }

    public int getIconGravity() {
        return this.f36474E0;
    }

    public int getIconPadding() {
        return this.f36471B0;
    }

    public int getIconSize() {
        return this.f36482y0;
    }

    public ColorStateList getIconTint() {
        return this.f36479v0;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f36478u0;
    }

    public int getInsetBottom() {
        return this.f36475r0.f56106f;
    }

    public int getInsetTop() {
        return this.f36475r0.f56105e;
    }

    public ColorStateList getRippleColor() {
        if (m13604b()) {
            return this.f36475r0.f56112l;
        }
        return null;
    }

    public C2691k getShapeAppearanceModel() {
        if (m13604b()) {
            return this.f36475r0.f56102b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m13604b()) {
            return this.f36475r0.f56111k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m13604b()) {
            return this.f36475r0.f56108h;
        }
        return 0;
    }

    @Override // p999s.C19366n
    public ColorStateList getSupportBackgroundTintList() {
        return m13604b() ? this.f36475r0.f56110j : super.getSupportBackgroundTintList();
    }

    @Override // p999s.C19366n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m13604b() ? this.f36475r0.f56109i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f36472C0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m13604b()) {
            AbstractC8151n5.m8696d(this, this.f36475r0.m19208b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (m13603a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36468F0);
        }
        if (this.f36472C0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36469G0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p999s.C19366n, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f36472C0);
    }

    @Override // p999s.C19366n, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m13603a());
        accessibilityNodeInfo.setChecked(this.f36472C0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p999s.C19366n, android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        m13607e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C17541b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C17541b c17541b = (C17541b) parcelable;
        super.onRestoreInstanceState(c17541b.f16000Y);
        setChecked(c17541b.f56100o0);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C17541b c17541b = new C17541b(super.onSaveInstanceState());
        c17541b.f56100o0 = this.f36472C0;
        return c17541b;
    }

    @Override // p999s.C19366n, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m13607e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f36475r0.f56118r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f36480w0 != null) {
            if (this.f36480w0.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f36481x0 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (!m13604b()) {
            super.setBackgroundColor(i10);
            return;
        }
        C17542c c17542c = this.f36475r0;
        if (c17542c.m19208b(false) != null) {
            c17542c.m19208b(false).setTint(i10);
        }
    }

    @Override // p999s.C19366n, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m13604b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        AbstractC15256t.m16482t("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C17542c c17542c = this.f36475r0;
        c17542c.f56115o = true;
        ColorStateList colorStateList = c17542c.f56110j;
        MaterialButton materialButton = c17542c.f56101a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c17542c.f56109i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p999s.C19366n, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? AbstractC9106B3.m9636b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z6) {
        if (m13604b()) {
            this.f36475r0.f56117q = z6;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (m13603a() && isEnabled() && this.f36472C0 != z6) {
            this.f36472C0 = z6;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z10 = this.f36472C0;
                if (!materialButtonToggleGroup.f36490t0) {
                    materialButtonToggleGroup.m13609b(getId(), z10);
                }
            }
            if (this.f36473D0) {
                return;
            }
            this.f36473D0 = true;
            Iterator it = this.f36476s0.iterator();
            if (it.hasNext()) {
                throw AbstractC3794B0.m4497v(it);
            }
            this.f36473D0 = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (m13604b()) {
            C17542c c17542c = this.f36475r0;
            if (c17542c.f56116p && c17542c.f56107g == i10) {
                return;
            }
            c17542c.f56107g = i10;
            c17542c.f56116p = true;
            float f10 = i10;
            C2690j c2690jM3694e = c17542c.f56102b.m3694e();
            c2690jM3694e.f8265e = new C2681a(f10);
            c2690jM3694e.f8266f = new C2681a(f10);
            c2690jM3694e.f8267g = new C2681a(f10);
            c2690jM3694e.f8268h = new C2681a(f10);
            c17542c.m19209c(c2690jM3694e.m3689a());
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (m13604b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (m13604b()) {
            this.f36475r0.m19208b(false).m3681k(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f36480w0 != drawable) {
            this.f36480w0 = drawable;
            m13606d(true);
            m13607e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f36474E0 != i10) {
            this.f36474E0 = i10;
            m13607e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f36471B0 != i10) {
            this.f36471B0 = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? AbstractC9106B3.m9636b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f36482y0 != i10) {
            this.f36482y0 = i10;
            m13606d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f36479v0 != colorStateList) {
            this.f36479v0 = colorStateList;
            m13606d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f36478u0 != mode) {
            this.f36478u0 = mode;
            m13606d(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(AbstractC17803d.m19556c(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        C17542c c17542c = this.f36475r0;
        c17542c.m19210d(c17542c.f56105e, i10);
    }

    public void setInsetTop(int i10) {
        C17542c c17542c = this.f36475r0;
        c17542c.m19210d(i10, c17542c.f56106f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC17540a interfaceC17540a) {
        this.f36477t0 = interfaceC17540a;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        InterfaceC17540a interfaceC17540a = this.f36477t0;
        if (interfaceC17540a != null) {
            ((MaterialButtonToggleGroup) ((C13414e) interfaceC17540a).f42490Y).invalidate();
        }
        super.setPressed(z6);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m13604b()) {
            C17542c c17542c = this.f36475r0;
            if (c17542c.f56112l != colorStateList) {
                c17542c.f56112l = colorStateList;
                MaterialButton materialButton = c17542c.f56101a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC1982a.m3155a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (m13604b()) {
            setRippleColor(AbstractC17803d.m19556c(getContext(), i10));
        }
    }

    @Override // p140Fa.InterfaceC2701u
    public void setShapeAppearanceModel(C2691k c2691k) {
        if (!m13604b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f36475r0.m19209c(c2691k);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z6) {
        if (m13604b()) {
            C17542c c17542c = this.f36475r0;
            c17542c.f56114n = z6;
            c17542c.m19212f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m13604b()) {
            C17542c c17542c = this.f36475r0;
            if (c17542c.f56111k != colorStateList) {
                c17542c.f56111k = colorStateList;
                c17542c.m19212f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (m13604b()) {
            setStrokeColor(AbstractC17803d.m19556c(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (m13604b()) {
            C17542c c17542c = this.f36475r0;
            if (c17542c.f56108h != i10) {
                c17542c.f56108h = i10;
                c17542c.m19212f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (m13604b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // p999s.C19366n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m13604b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C17542c c17542c = this.f36475r0;
        if (c17542c.f56110j != colorStateList) {
            c17542c.f56110j = colorStateList;
            if (c17542c.m19208b(false) != null) {
                c17542c.m19208b(false).setTintList(c17542c.f56110j);
            }
        }
    }

    @Override // p999s.C19366n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m13604b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C17542c c17542c = this.f36475r0;
        if (c17542c.f56109i != mode) {
            c17542c.f56109i = mode;
            if (c17542c.m19208b(false) == null || c17542c.f56109i == null) {
                return;
            }
            c17542c.m19208b(false).setTintMode(c17542c.f56109i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        m13607e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z6) {
        this.f36475r0.f56118r = z6;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f36472C0);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        super(AbstractC4967a.m5610a(context, attributeSet, i10, com.openai.chatgpt.R.style.Widget_MaterialComponents_Button), attributeSet, i10);
        this.f36476s0 = new LinkedHashSet();
        this.f36472C0 = false;
        this.f36473D0 = false;
        Context context2 = getContext();
        TypedArray typedArrayM22311f = AbstractC21828k.m22311f(context2, attributeSet, AbstractC14431a.f45380m, i10, com.openai.chatgpt.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f36471B0 = typedArrayM22311f.getDimensionPixelSize(12, 0);
        int i11 = typedArrayM22311f.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f36478u0 = AbstractC21828k.m22312g(i11, mode);
        this.f36479v0 = AbstractC7979R3.m8279c(getContext(), typedArrayM22311f, 14);
        this.f36480w0 = AbstractC7979R3.m8282f(getContext(), typedArrayM22311f, 10);
        this.f36474E0 = typedArrayM22311f.getInteger(11, 1);
        this.f36482y0 = typedArrayM22311f.getDimensionPixelSize(13, 0);
        C17542c c17542c = new C17542c(this, C2691k.m3691b(context2, attributeSet, i10, com.openai.chatgpt.R.style.Widget_MaterialComponents_Button).m3689a());
        this.f36475r0 = c17542c;
        c17542c.f56103c = typedArrayM22311f.getDimensionPixelOffset(1, 0);
        c17542c.f56104d = typedArrayM22311f.getDimensionPixelOffset(2, 0);
        c17542c.f56105e = typedArrayM22311f.getDimensionPixelOffset(3, 0);
        c17542c.f56106f = typedArrayM22311f.getDimensionPixelOffset(4, 0);
        if (typedArrayM22311f.hasValue(8)) {
            int dimensionPixelSize = typedArrayM22311f.getDimensionPixelSize(8, -1);
            c17542c.f56107g = dimensionPixelSize;
            float f10 = dimensionPixelSize;
            C2690j c2690jM3694e = c17542c.f56102b.m3694e();
            c2690jM3694e.f8265e = new C2681a(f10);
            c2690jM3694e.f8266f = new C2681a(f10);
            c2690jM3694e.f8267g = new C2681a(f10);
            c2690jM3694e.f8268h = new C2681a(f10);
            c17542c.m19209c(c2690jM3694e.m3689a());
            c17542c.f56116p = true;
        }
        c17542c.f56108h = typedArrayM22311f.getDimensionPixelSize(20, 0);
        c17542c.f56109i = AbstractC21828k.m22312g(typedArrayM22311f.getInt(7, -1), mode);
        c17542c.f56110j = AbstractC7979R3.m8279c(getContext(), typedArrayM22311f, 6);
        c17542c.f56111k = AbstractC7979R3.m8279c(getContext(), typedArrayM22311f, 19);
        c17542c.f56112l = AbstractC7979R3.m8279c(getContext(), typedArrayM22311f, 16);
        c17542c.f56117q = typedArrayM22311f.getBoolean(5, false);
        c17542c.f56120t = typedArrayM22311f.getDimensionPixelSize(9, 0);
        c17542c.f56118r = typedArrayM22311f.getBoolean(21, true);
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM22311f.hasValue(0)) {
            c17542c.f56115o = true;
            setSupportBackgroundTintList(c17542c.f56110j);
            setSupportBackgroundTintMode(c17542c.f56109i);
        } else {
            c17542c.m19211e();
        }
        setPaddingRelative(paddingStart + c17542c.f56103c, paddingTop + c17542c.f56105e, paddingEnd + c17542c.f56104d, paddingBottom + c17542c.f56106f);
        typedArrayM22311f.recycle();
        setCompoundDrawablePadding(this.f36471B0);
        m13606d(this.f36480w0 != null);
    }
}
