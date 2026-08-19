package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p189Ha.C3271e;
import p523V9.AbstractC8194t0;
import p955q2.AbstractC18619k;
import p976r.C18816n;
import p976r.InterfaceC18827y;
import p999s.C19377s0;
import za.AbstractC21821d;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC21821d implements InterfaceC18827y {

    /* JADX INFO: renamed from: T0 */
    public static final int[] f36662T0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: J0 */
    public int f36663J0;

    /* JADX INFO: renamed from: K0 */
    public boolean f36664K0;

    /* JADX INFO: renamed from: L0 */
    public boolean f36665L0;

    /* JADX INFO: renamed from: M0 */
    public final CheckedTextView f36666M0;

    /* JADX INFO: renamed from: N0 */
    public FrameLayout f36667N0;

    /* JADX INFO: renamed from: O0 */
    public C18816n f36668O0;

    /* JADX INFO: renamed from: P0 */
    public ColorStateList f36669P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f36670Q0;

    /* JADX INFO: renamed from: R0 */
    public Drawable f36671R0;

    /* JADX INFO: renamed from: S0 */
    public final C3271e f36672S0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3271e c3271e = new C3271e(this, 4);
        this.f36672S0 = c3271e;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.openai.chatgpt.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.openai.chatgpt.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.openai.chatgpt.R.id.design_menu_item_text);
        this.f36666M0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC0738T.m1584l(checkedTextView, c3271e);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f36667N0 == null) {
                this.f36667N0 = (FrameLayout) ((ViewStub) findViewById(com.openai.chatgpt.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f36667N0.removeAllViews();
            this.f36667N0.addView(view);
        }
    }

    @Override // p976r.InterfaceC18827y
    /* JADX INFO: renamed from: c */
    public final void mo11126c(C18816n c18816n) {
        StateListDrawable stateListDrawable;
        this.f36668O0 = c18816n;
        int i10 = c18816n.f59875a;
        if (i10 > 0) {
            setId(i10);
        }
        setVisibility(c18816n.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.openai.chatgpt.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f36662T0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = AbstractC0738T.f2096a;
            setBackground(stateListDrawable);
        }
        setCheckable(c18816n.isCheckable());
        setChecked(c18816n.isChecked());
        setEnabled(c18816n.isEnabled());
        setTitle(c18816n.f59879e);
        setIcon(c18816n.getIcon());
        setActionView(c18816n.getActionView());
        setContentDescription(c18816n.f59891q);
        AbstractC8194t0.m8797c(this, c18816n.f59892r);
        C18816n c18816n2 = this.f36668O0;
        CharSequence charSequence = c18816n2.f59879e;
        CheckedTextView checkedTextView = this.f36666M0;
        if (charSequence == null && c18816n2.getIcon() == null && this.f36668O0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f36667N0;
            if (frameLayout != null) {
                C19377s0 c19377s0 = (C19377s0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c19377s0).width = -1;
                this.f36667N0.setLayoutParams(c19377s0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f36667N0;
        if (frameLayout2 != null) {
            C19377s0 c19377s1 = (C19377s0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c19377s1).width = -2;
            this.f36667N0.setLayoutParams(c19377s1);
        }
    }

    @Override // p976r.InterfaceC18827y
    public C18816n getItemData() {
        return this.f36668O0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        C18816n c18816n = this.f36668O0;
        if (c18816n != null && c18816n.isCheckable() && this.f36668O0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f36662T0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z6) {
        refreshDrawableState();
        if (this.f36665L0 != z6) {
            this.f36665L0 = z6;
            this.f36672S0.mo1594h(this.f36666M0, 2048);
        }
    }

    public void setChecked(boolean z6) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f36666M0;
        checkedTextView.setChecked(z6);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z6 ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f36670Q0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f36669P0);
            }
            int i10 = this.f36663J0;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f36664K0) {
            if (this.f36671R0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC18619k.f59299a;
                Drawable drawable2 = resources.getDrawable(com.openai.chatgpt.R.drawable.navigation_empty_icon, theme);
                this.f36671R0 = drawable2;
                if (drawable2 != null) {
                    int i11 = this.f36663J0;
                    drawable2.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f36671R0;
        }
        this.f36666M0.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f36666M0.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f36663J0 = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f36669P0 = colorStateList;
        this.f36670Q0 = colorStateList != null;
        C18816n c18816n = this.f36668O0;
        if (c18816n != null) {
            setIcon(c18816n.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f36666M0.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z6) {
        this.f36664K0 = z6;
    }

    public void setTextAppearance(int i10) {
        this.f36666M0.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f36666M0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f36666M0.setText(charSequence);
    }
}
