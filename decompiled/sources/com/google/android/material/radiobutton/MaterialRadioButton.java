package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p287La.AbstractC4967a;
import p523V9.AbstractC7979R3;
import p523V9.AbstractC8070d4;
import p783ha.AbstractC14431a;
import p999s.C19390z;
import za.AbstractC21828k;

/* JADX INFO: loaded from: classes.dex */
public class MaterialRadioButton extends C19390z {

    /* JADX INFO: renamed from: u0 */
    public static final int[][] f36674u0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: s0 */
    public ColorStateList f36675s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f36676t0;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        super(AbstractC4967a.m5610a(context, attributeSet, com.openai.chatgpt.R.attr.radioButtonStyle, com.openai.chatgpt.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayM22311f = AbstractC21828k.m22311f(context2, attributeSet, AbstractC14431a.f45387t, com.openai.chatgpt.R.attr.radioButtonStyle, com.openai.chatgpt.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM22311f.hasValue(0)) {
            setButtonTintList(AbstractC7979R3.m8279c(context2, typedArrayM22311f, 0));
        }
        this.f36676t0 = typedArrayM22311f.getBoolean(1, false);
        typedArrayM22311f.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f36675s0 == null) {
            int iM8478e = AbstractC8070d4.m8478e(this, com.openai.chatgpt.R.attr.colorControlActivated);
            int iM8478e2 = AbstractC8070d4.m8478e(this, com.openai.chatgpt.R.attr.colorOnSurface);
            int iM8478e3 = AbstractC8070d4.m8478e(this, com.openai.chatgpt.R.attr.colorSurface);
            this.f36675s0 = new ColorStateList(f36674u0, new int[]{AbstractC8070d4.m8480g(1.0f, iM8478e3, iM8478e), AbstractC8070d4.m8480g(0.54f, iM8478e3, iM8478e2), AbstractC8070d4.m8480g(0.38f, iM8478e3, iM8478e2), AbstractC8070d4.m8480g(0.38f, iM8478e3, iM8478e2)});
        }
        return this.f36675s0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36676t0 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f36676t0 = z6;
        if (z6) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
