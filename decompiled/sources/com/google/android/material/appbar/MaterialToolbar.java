package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p030B2.AbstractC0730K;
import p030B2.AbstractC0738T;
import p033B5.C0842z;
import p140Fa.C2687g;
import p287La.AbstractC4967a;
import p523V9.AbstractC8151n5;
import p783ha.AbstractC14431a;
import p976r.MenuC18814l;
import za.AbstractC21828k;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: l1 */
    public static final ImageView.ScaleType[] f36389l1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: g1 */
    public Integer f36390g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f36391h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f36392i1;

    /* JADX INFO: renamed from: j1 */
    public ImageView.ScaleType f36393j1;

    /* JADX INFO: renamed from: k1 */
    public Boolean f36394k1;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC4967a.m5610a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM22311f = AbstractC21828k.m22311f(context2, attributeSet, AbstractC14431a.f45391x, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM22311f.hasValue(2)) {
            setNavigationIconTint(typedArrayM22311f.getColor(2, -1));
        }
        this.f36391h1 = typedArrayM22311f.getBoolean(4, false);
        this.f36392i1 = typedArrayM22311f.getBoolean(3, false);
        int i10 = typedArrayM22311f.getInt(1, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f36389l1;
            if (i10 < scaleTypeArr.length) {
                this.f36393j1 = scaleTypeArr[i10];
            }
        }
        if (typedArrayM22311f.hasValue(0)) {
            this.f36394k1 = Boolean.valueOf(typedArrayM22311f.getBoolean(0, false));
        }
        typedArrayM22311f.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C2687g c2687g = new C2687g();
            c2687g.m3682l(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c2687g.m3679i(context2);
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            c2687g.m3681k(AbstractC0730K.m1548e(this));
            setBackground(c2687g);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f36393j1;
    }

    public Integer getNavigationIconTint() {
        return this.f36390g1;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: m */
    public final void mo11165m(int i10) {
        Menu menu = getMenu();
        boolean z6 = menu instanceof MenuC18814l;
        if (z6) {
            ((MenuC18814l) menu).m20134w();
        }
        super.mo11165m(i10);
        if (z6) {
            ((MenuC18814l) menu).m20133v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C2687g) {
            AbstractC8151n5.m8696d(this, (C2687g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z6, i10, i11, i12, i13);
        ImageView imageView2 = null;
        if (this.f36391h1 || this.f36392i1) {
            ArrayList arrayListM22309d = AbstractC21828k.m22309d(this, getTitle());
            boolean zIsEmpty = arrayListM22309d.isEmpty();
            C0842z c0842z = AbstractC21828k.f69277c;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListM22309d, c0842z);
            ArrayList arrayListM22309d2 = AbstractC21828k.m22309d(this, getSubtitle());
            TextView textView2 = arrayListM22309d2.isEmpty() ? null : (TextView) Collections.max(arrayListM22309d2, c0842z);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f36391h1 && textView != null) {
                    m13581v(textView, pair);
                }
                if (this.f36392i1 && textView2 != null) {
                    m13581v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                View childAt2 = getChildAt(i16);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f36394k1;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f36393j1;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof C2687g) {
            ((C2687g) background).m3681k(f10);
        }
    }

    public void setLogoAdjustViewBounds(boolean z6) {
        Boolean bool = this.f36394k1;
        if (bool == null || bool.booleanValue() != z6) {
            this.f36394k1 = Boolean.valueOf(z6);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f36393j1 != scaleType) {
            this.f36393j1 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f36390g1 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f36390g1.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f36390g1 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z6) {
        if (this.f36392i1 != z6) {
            this.f36392i1 = z6;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z6) {
        if (this.f36391h1 != z6) {
            this.f36391h1 = z6;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m13581v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }
}
