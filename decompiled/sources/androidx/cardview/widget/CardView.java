package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import io.sentry.hints.C15370i;
import p653b0.AbstractC11206a;
import p658b5.C11241l;
import p669c0.C11555a;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: t0 */
    public static final int[] f32359t0 = {R.attr.colorBackground};

    /* JADX INFO: renamed from: u0 */
    public static final C15370i f32360u0 = new C15370i(23);

    /* JADX INFO: renamed from: o0 */
    public boolean f32361o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f32362p0;

    /* JADX INFO: renamed from: q0 */
    public final Rect f32363q0;

    /* JADX INFO: renamed from: r0 */
    public final Rect f32364r0;

    /* JADX INFO: renamed from: s0 */
    public final C11241l f32365s0;

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.openai.chatgpt.R.attr.cardViewStyle);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C11555a) ((Drawable) this.f32365s0.f34016Y)).f34927h;
    }

    public float getCardElevation() {
        return ((CardView) this.f32365s0.f34017Z).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f32363q0.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f32363q0.left;
    }

    public int getContentPaddingRight() {
        return this.f32363q0.right;
    }

    public int getContentPaddingTop() {
        return this.f32363q0.top;
    }

    public float getMaxCardElevation() {
        return ((C11555a) ((Drawable) this.f32365s0.f34016Y)).f34924e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f32362p0;
    }

    public float getRadius() {
        return ((C11555a) ((Drawable) this.f32365s0.f34016Y)).f34920a;
    }

    public boolean getUseCompatPadding() {
        return this.f32361o0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
        C11555a c11555a = (C11555a) ((Drawable) this.f32365s0.f34016Y);
        if (colorStateListValueOf == null) {
            c11555a.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c11555a.f34927h = colorStateListValueOf;
        c11555a.f34921b.setColor(colorStateListValueOf.getColorForState(c11555a.getState(), c11555a.f34927h.getDefaultColor()));
        c11555a.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        ((CardView) this.f32365s0.f34017Z).setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f32360u0.m16629q(this.f32365s0, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z6) {
        if (z6 != this.f32362p0) {
            this.f32362p0 = z6;
            C15370i c15370i = f32360u0;
            C11241l c11241l = this.f32365s0;
            c15370i.m16629q(c11241l, ((C11555a) ((Drawable) c11241l.f34016Y)).f34924e);
        }
    }

    public void setRadius(float f10) {
        C11555a c11555a = (C11555a) ((Drawable) this.f32365s0.f34016Y);
        if (f10 == c11555a.f34920a) {
            return;
        }
        c11555a.f34920a = f10;
        c11555a.m12933b(null);
        c11555a.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z6) {
        if (this.f32361o0 != z6) {
            this.f32361o0 = z6;
            C15370i c15370i = f32360u0;
            C11241l c11241l = this.f32365s0;
            c15370i.m16629q(c11241l, ((C11555a) ((Drawable) c11241l.f34016Y)).f34924e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f32363q0 = rect;
        this.f32364r0 = new Rect();
        C11241l c11241l = new C11241l();
        c11241l.f34017Z = this;
        this.f32365s0 = c11241l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC11206a.f33879a, i10, com.openai.chatgpt.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f32359t0);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.openai.chatgpt.R.color.cardview_light_background) : getResources().getColor(com.openai.chatgpt.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f32361o0 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f32362p0 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C15370i c15370i = f32360u0;
        C11555a c11555a = new C11555a(colorStateListValueOf, dimension);
        c11241l.f34016Y = c11555a;
        setBackgroundDrawable(c11555a);
        setClipToOutline(true);
        setElevation(dimension2);
        c15370i.m16629q(c11241l, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C11555a c11555a = (C11555a) ((Drawable) this.f32365s0.f34016Y);
        if (colorStateList == null) {
            c11555a.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c11555a.f34927h = colorStateList;
        c11555a.f34921b.setColor(colorStateList.getColorForState(c11555a.getState(), c11555a.f34927h.getDefaultColor()));
        c11555a.invalidateSelf();
    }
}
