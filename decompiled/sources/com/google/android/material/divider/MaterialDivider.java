package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p140Fa.C2687g;
import p287La.AbstractC4967a;
import p523V9.AbstractC7979R3;
import p783ha.AbstractC14431a;
import za.AbstractC21828k;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: o0 */
    public final C2687g f36636o0;

    /* JADX INFO: renamed from: p0 */
    public int f36637p0;

    /* JADX INFO: renamed from: q0 */
    public int f36638q0;

    /* JADX INFO: renamed from: r0 */
    public int f36639r0;

    /* JADX INFO: renamed from: s0 */
    public int f36640s0;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(AbstractC4967a.m5610a(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.f36636o0 = new C2687g();
        TypedArray typedArrayM22311f = AbstractC21828k.m22311f(context2, attributeSet, AbstractC14431a.f45386s, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f36637p0 = typedArrayM22311f.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f36639r0 = typedArrayM22311f.getDimensionPixelOffset(2, 0);
        this.f36640s0 = typedArrayM22311f.getDimensionPixelOffset(1, 0);
        setDividerColor(AbstractC7979R3.m8279c(context2, typedArrayM22311f, 0).getDefaultColor());
        typedArrayM22311f.recycle();
    }

    public int getDividerColor() {
        return this.f36638q0;
    }

    public int getDividerInsetEnd() {
        return this.f36640s0;
    }

    public int getDividerInsetStart() {
        return this.f36639r0;
    }

    public int getDividerThickness() {
        return this.f36637p0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        boolean z6 = getLayoutDirection() == 1;
        int i11 = z6 ? this.f36640s0 : this.f36639r0;
        if (z6) {
            width = getWidth();
            i10 = this.f36639r0;
        } else {
            width = getWidth();
            i10 = this.f36640s0;
        }
        int i12 = width - i10;
        C2687g c2687g = this.f36636o0;
        c2687g.setBounds(i11, 0, i12, getBottom() - getTop());
        c2687g.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f36637p0;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f36638q0 != i10) {
            this.f36638q0 = i10;
            this.f36636o0.m3682l(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(getContext().getColor(i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f36640s0 = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f36639r0 = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f36637p0 != i10) {
            this.f36637p0 = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }
}
