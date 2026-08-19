package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.openai.chatgpt.R;
import java.util.Locale;
import p239Ja.C4318u;
import p239Ja.C4319v;
import p287La.AbstractC4967a;
import p523V9.AbstractC7979R3;
import p783ha.AbstractC14431a;
import p999s.C19285B0;
import p999s.C19364m;
import za.AbstractC21828k;

/* JADX INFO: loaded from: classes.dex */
public class MaterialAutoCompleteTextView extends C19364m {

    /* JADX INFO: renamed from: s0 */
    public final C19285B0 f36703s0;

    /* JADX INFO: renamed from: t0 */
    public final AccessibilityManager f36704t0;

    /* JADX INFO: renamed from: u0 */
    public final Rect f36705u0;

    /* JADX INFO: renamed from: v0 */
    public final int f36706v0;

    /* JADX INFO: renamed from: w0 */
    public final float f36707w0;

    /* JADX INFO: renamed from: x0 */
    public int f36708x0;

    /* JADX INFO: renamed from: y0 */
    public ColorStateList f36709y0;

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(AbstractC4967a.m5610a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f36705u0 = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM22311f = AbstractC21828k.m22311f(context2, attributeSet, AbstractC14431a.f45379l, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM22311f.hasValue(0) && typedArrayM22311f.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f36706v0 = typedArrayM22311f.getResourceId(2, R.layout.mtrl_auto_complete_simple_item);
        this.f36707w0 = typedArrayM22311f.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f36708x0 = typedArrayM22311f.getColor(3, 0);
        this.f36709y0 = AbstractC7979R3.m8279c(context2, typedArrayM22311f, 4);
        this.f36704t0 = (AccessibilityManager) context2.getSystemService("accessibility");
        C19285B0 c19285b0 = new C19285B0(context2, null, R.attr.listPopupWindowStyle);
        this.f36703s0 = c19285b0;
        c19285b0.f61105K0 = true;
        c19285b0.f61106L0.setFocusable(true);
        c19285b0.f61095A0 = this;
        c19285b0.f61106L0.setInputMethodMode(2);
        c19285b0.mo20354n(getAdapter());
        c19285b0.f61096B0 = new C4318u(this, 0);
        if (typedArrayM22311f.hasValue(5)) {
            setSimpleItems(typedArrayM22311f.getResourceId(5, 0));
        }
        typedArrayM22311f.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static void m13653a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    /* JADX INFO: renamed from: b */
    public final TextInputLayout m13654b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f36704t0;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.f36703s0.dismiss();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM13654b = m13654b();
        return (textInputLayoutM13654b == null || !textInputLayoutM13654b.f36738Q0) ? super.getHint() : textInputLayoutM13654b.getHint();
    }

    public float getPopupElevation() {
        return this.f36707w0;
    }

    public int getSimpleItemSelectedColor() {
        return this.f36708x0;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f36709y0;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM13654b = m13654b();
        if (textInputLayoutM13654b != null && textInputLayoutM13654b.f36738Q0 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36703s0.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM13654b = m13654b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM13654b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C19285B0 c19285b0 = this.f36703s0;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c19285b0.f61106L0.isShowing() ? -1 : c19285b0.f61109o0.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM13654b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c19285b0.f61106L0.getBackground();
                if (background != null) {
                    Rect rect = this.f36705u0;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM13654b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        AccessibilityManager accessibilityManager = this.f36704t0;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z6);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f36703s0.mo20354n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C19285B0 c19285b0 = this.f36703s0;
        if (c19285b0 != null) {
            c19285b0.m20351h(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f36703s0.f61097C0 = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout textInputLayoutM13654b = m13654b();
        if (textInputLayoutM13654b != null) {
            textInputLayoutM13654b.m13673s();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f36708x0 = i10;
        if (getAdapter() instanceof C4319v) {
            ((C4319v) getAdapter()).m5132a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f36709y0 = colorStateList;
        if (getAdapter() instanceof C4319v) {
            ((C4319v) getAdapter()).m5132a();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f36704t0;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f36703s0.mo20083f();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C4319v(this, getContext(), this.f36706v0, strArr));
    }
}
