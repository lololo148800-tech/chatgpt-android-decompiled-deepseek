package p1110xk;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p001A.RunnableC0098y;
import p1113xn.AbstractC21322p;
import p1120y4.C21382i;
import p1157zk.AbstractC22213c;
import p774h1.AbstractC14357m;

/* JADX INFO: renamed from: xk.p */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21293p {
    /* JADX INFO: renamed from: a */
    public static final void m21632a(TextInputLayout textInputLayout, boolean z6, int i10, int i11, int i12) {
        if (z6) {
            textInputLayout.setBoxBackgroundColor(i11);
        } else if (textInputLayout.isEnabled()) {
            textInputLayout.setBoxBackgroundColor(i10);
        } else {
            textInputLayout.setBoxBackgroundColor(i12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m21633b(TextInputLayout textInputLayout, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            EditText editText = textInputLayout.getEditText();
            Drawable textCursorDrawable = editText != null ? editText.getTextCursorDrawable() : null;
            if (textCursorDrawable == null) {
                return;
            }
            AbstractC14357m.m15748f();
            textCursorDrawable.setColorFilter(AbstractC14357m.m15745c(i10, BlendMode.SRC_ATOP));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m21634c(final TextInputLayout textInputLayout, UiComponentConfig.InputTextBasedComponentStyle inputTextBasedComponentStyle) {
        Integer focusedBackgroundColorValue;
        Double valueLineHeightValue;
        EditText editText;
        EditText editText2;
        int i10 = 1;
        int i11 = 0;
        AbstractC16544l.m18094g(textInputLayout, "<this>");
        Integer baseBorderColorValue = inputTextBasedComponentStyle.getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            int iIntValue = baseBorderColorValue.intValue();
            Integer focusedBorderColorValue = inputTextBasedComponentStyle.getFocusedBorderColorValue();
            int iIntValue2 = focusedBorderColorValue != null ? focusedBorderColorValue.intValue() : iIntValue;
            Integer disabledBorderColorValue = inputTextBasedComponentStyle.getDisabledBorderColorValue();
            textInputLayout.setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{iIntValue, iIntValue2, disabledBorderColorValue != null ? disabledBorderColorValue.intValue() : iIntValue}));
            Integer errorBorderColorValue = inputTextBasedComponentStyle.getErrorBorderColorValue();
            if (errorBorderColorValue != null) {
                iIntValue = errorBorderColorValue.intValue();
            }
            textInputLayout.setBoxStrokeErrorColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{iIntValue, iIntValue, iIntValue}));
        }
        final C16525B c16525b = new C16525B();
        Integer baseBackgroundColorValue = inputTextBasedComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            final int iIntValue3 = baseBackgroundColorValue.intValue();
            Integer focusedBackgroundColorValue2 = inputTextBasedComponentStyle.getFocusedBackgroundColorValue();
            final int iIntValue4 = focusedBackgroundColorValue2 != null ? focusedBackgroundColorValue2.intValue() : iIntValue3;
            Integer disabledBackgroundColorValue = inputTextBasedComponentStyle.getDisabledBackgroundColorValue();
            int iIntValue5 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : iIntValue3;
            Integer errorBackgroundColorValue = inputTextBasedComponentStyle.getErrorBackgroundColorValue();
            int iIntValue6 = errorBackgroundColorValue != null ? errorBackgroundColorValue.intValue() : iIntValue3;
            textInputLayout.setBoxBackgroundMode(2);
            m21632a(textInputLayout, textInputLayout.hasFocus(), iIntValue3, iIntValue4, iIntValue5);
            c16525b.f51262Y = new C21292o(textInputLayout, iIntValue3, iIntValue4, iIntValue5);
            final int i12 = iIntValue5;
            final int i13 = iIntValue6;
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xk.k
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
                    TextInputLayout this_style = textInputLayout;
                    AbstractC16544l.m18094g(this_style, "$this_style");
                    CharSequence error = this_style.getError();
                    if (error == null || !AbstractC21322p.m21716z(error)) {
                        AbstractC21293p.m21632a(this_style, this_style.hasFocus(), iIntValue3, iIntValue4, i12);
                    } else {
                        this_style.setBoxBackgroundColor(i13);
                    }
                }
            });
        }
        Double borderWidthValue = inputTextBasedComponentStyle.getBorderWidthValue();
        if (borderWidthValue != null) {
            double dDoubleValue = borderWidthValue.doubleValue();
            textInputLayout.setBoxStrokeWidth((int) Math.ceil(C21382i.m21761a(dDoubleValue)));
            textInputLayout.setBoxStrokeWidthFocused((int) Math.ceil(C21382i.m21761a(dDoubleValue)));
        }
        Double borderRadiusValue = inputTextBasedComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            double dDoubleValue2 = borderRadiusValue.doubleValue();
            textInputLayout.m13666l((float) C21382i.m21761a(dDoubleValue2), (float) C21382i.m21761a(dDoubleValue2), (float) C21382i.m21761a(dDoubleValue2), (float) C21382i.m21761a(dDoubleValue2));
        }
        Double valueFontSizeValue = inputTextBasedComponentStyle.getValueFontSizeValue();
        if (valueFontSizeValue != null) {
            double dDoubleValue3 = valueFontSizeValue.doubleValue();
            EditText editText3 = textInputLayout.getEditText();
            if (editText3 != null) {
                editText3.setTextSize((float) dDoubleValue3);
            }
        }
        Double valueLetterSpacingValue = inputTextBasedComponentStyle.getValueLetterSpacingValue();
        if (valueLetterSpacingValue != null) {
            double dDoubleValue4 = valueLetterSpacingValue.doubleValue();
            EditText editText4 = textInputLayout.getEditText();
            double textSize = dDoubleValue4 / ((double) (editText4 != null ? editText4.getTextSize() : 12.0f));
            EditText editText5 = textInputLayout.getEditText();
            if (editText5 != null) {
                editText5.setLetterSpacing((float) textSize);
            }
        }
        String baseFontFamilyValue = inputTextBasedComponentStyle.getBaseFontFamilyValue();
        if (baseFontFamilyValue != null) {
            EditText editText6 = textInputLayout.getEditText();
            if (editText6 != null) {
                AbstractC21295r.m21636b(editText6, baseFontFamilyValue);
            }
            EditText editText7 = textInputLayout.getEditText();
            textInputLayout.setTypeface(editText7 != null ? editText7.getTypeface() : null);
        }
        String valueFontFamilyValue = inputTextBasedComponentStyle.getValueFontFamilyValue();
        if (valueFontFamilyValue != null && (editText2 = textInputLayout.getEditText()) != null) {
            AbstractC21295r.m21636b(editText2, valueFontFamilyValue);
        }
        StyleElements.FontWeight valueFontWeightValue = inputTextBasedComponentStyle.getValueFontWeightValue();
        if (valueFontWeightValue != null && Build.VERSION.SDK_INT >= 29 && (editText = textInputLayout.getEditText()) != null) {
            AbstractC21295r.m21635a(editText, valueFontWeightValue);
        }
        if (Build.VERSION.SDK_INT >= 28 && (valueLineHeightValue = inputTextBasedComponentStyle.getValueLineHeightValue()) != null) {
            double dDoubleValue5 = valueLineHeightValue.doubleValue();
            EditText editText8 = textInputLayout.getEditText();
            if (editText8 != null) {
                editText8.setLineHeight((int) C21382i.m21761a(dDoubleValue5));
            }
        }
        Integer baseTextColor = inputTextBasedComponentStyle.getBaseTextColor();
        if (baseTextColor != null) {
            int iIntValue7 = baseTextColor.intValue();
            Integer valueFocusedTextColor = inputTextBasedComponentStyle.getValueFocusedTextColor();
            final int iIntValue8 = valueFocusedTextColor != null ? valueFocusedTextColor.intValue() : iIntValue7;
            Integer valueDisabledTextColor = inputTextBasedComponentStyle.getValueDisabledTextColor();
            int iIntValue9 = valueDisabledTextColor != null ? valueDisabledTextColor.intValue() : iIntValue7;
            Integer valueErrorTextColor = inputTextBasedComponentStyle.getValueErrorTextColor();
            final int iIntValue10 = valueErrorTextColor != null ? valueErrorTextColor.intValue() : iIntValue7;
            final ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue7, iIntValue8, iIntValue9, iIntValue7});
            EditText editText9 = textInputLayout.getEditText();
            if (editText9 != null) {
                editText9.setTextColor(colorStateList);
            }
            m21633b(textInputLayout, iIntValue8);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xk.l
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
                    TextInputLayout this_style = textInputLayout;
                    AbstractC16544l.m18094g(this_style, "$this_style");
                    ColorStateList colorState = colorStateList;
                    AbstractC16544l.m18094g(colorState, "$colorState");
                    CharSequence error = this_style.getError();
                    if (error == null || !AbstractC21322p.m21716z(error)) {
                        EditText editText10 = this_style.getEditText();
                        if (editText10 != null) {
                            editText10.setTextColor(colorState);
                        }
                        AbstractC21293p.m21633b(this_style, iIntValue8);
                        return;
                    }
                    EditText editText11 = this_style.getEditText();
                    int i22 = iIntValue10;
                    if (editText11 != null) {
                        editText11.setTextColor(i22);
                    }
                    AbstractC21293p.m21633b(this_style, i22);
                }
            });
        }
        Integer errorBaseTextColor = inputTextBasedComponentStyle.getErrorBaseTextColor();
        if (errorBaseTextColor != null) {
            int iIntValue11 = errorBaseTextColor.intValue();
            Integer errorErrorTextColor = inputTextBasedComponentStyle.getErrorErrorTextColor();
            int iIntValue12 = errorErrorTextColor != null ? errorErrorTextColor.intValue() : iIntValue11;
            Integer errorFocusedTextColor = inputTextBasedComponentStyle.getErrorFocusedTextColor();
            int iIntValue13 = errorFocusedTextColor != null ? errorFocusedTextColor.intValue() : iIntValue11;
            Integer errorDisabledTextColor = inputTextBasedComponentStyle.getErrorDisabledTextColor();
            if (errorDisabledTextColor != null) {
                iIntValue11 = errorDisabledTextColor.intValue();
            }
            textInputLayout.setErrorTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue12, iIntValue13, iIntValue11, iIntValue12}));
        }
        Integer labelBaseTextColor = inputTextBasedComponentStyle.getLabelBaseTextColor();
        if (labelBaseTextColor != null) {
            int iIntValue14 = labelBaseTextColor.intValue();
            Integer labelFocusedTextColor = inputTextBasedComponentStyle.getLabelFocusedTextColor();
            int iIntValue15 = labelFocusedTextColor != null ? labelFocusedTextColor.intValue() : iIntValue14;
            Integer labelDisabledTextColor = inputTextBasedComponentStyle.getLabelDisabledTextColor();
            int iIntValue16 = labelDisabledTextColor != null ? labelDisabledTextColor.intValue() : iIntValue14;
            Integer labelErrorTextColor = inputTextBasedComponentStyle.getLabelErrorTextColor();
            int iIntValue17 = labelErrorTextColor != null ? labelErrorTextColor.intValue() : iIntValue14;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue14, iIntValue15, iIntValue16, iIntValue14});
            ColorStateList colorStateList3 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue17, iIntValue17, iIntValue17, iIntValue17});
            textInputLayout.setDefaultHintTextColor(colorStateList2);
            textInputLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC21290m(textInputLayout, colorStateList3, colorStateList2, i11));
        }
        EditText editText10 = textInputLayout.getEditText();
        MaterialAutoCompleteTextView materialAutoCompleteTextView = editText10 instanceof MaterialAutoCompleteTextView ? (MaterialAutoCompleteTextView) editText10 : null;
        if (materialAutoCompleteTextView != null && (focusedBackgroundColorValue = inputTextBasedComponentStyle.getFocusedBackgroundColorValue()) != null) {
            materialAutoCompleteTextView.setDropDownBackgroundDrawable(new ColorDrawable(focusedBackgroundColorValue.intValue()));
        }
        StyleElements.DPSizeSet inputTextBoxMargins = inputTextBasedComponentStyle.getInputTextBoxMargins();
        if (inputTextBoxMargins != null) {
            AbstractC22213c.m22403c(textInputLayout, inputTextBoxMargins);
        }
        Integer placeholderBaseTextColor = inputTextBasedComponentStyle.getPlaceholderBaseTextColor();
        if (placeholderBaseTextColor != null) {
            int iIntValue18 = placeholderBaseTextColor.intValue();
            Integer placeholderFocusedTextColor = inputTextBasedComponentStyle.getPlaceholderFocusedTextColor();
            int iIntValue19 = placeholderFocusedTextColor != null ? placeholderFocusedTextColor.intValue() : iIntValue18;
            Integer placeholderErrorTextColor = inputTextBasedComponentStyle.getPlaceholderErrorTextColor();
            int iIntValue20 = placeholderErrorTextColor != null ? placeholderErrorTextColor.intValue() : iIntValue18;
            Integer placeholderDisabledTextColor = inputTextBasedComponentStyle.getPlaceholderDisabledTextColor();
            ColorStateList colorStateList4 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue18, iIntValue19, placeholderDisabledTextColor != null ? placeholderDisabledTextColor.intValue() : iIntValue18, iIntValue18});
            ColorStateList colorStateList5 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue20, iIntValue20, iIntValue20, iIntValue20});
            textInputLayout.setPlaceholderTextColor(colorStateList4);
            textInputLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC21290m(textInputLayout, colorStateList5, colorStateList4, i10));
        }
        EditText editText11 = textInputLayout.getEditText();
        if (editText11 != null) {
            editText11.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xk.n
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z6) {
                    TextInputLayout this_style = textInputLayout;
                    AbstractC16544l.m18094g(this_style, "$this_style");
                    this_style.post(new RunnableC0098y(c16525b, z6, 3));
                }
            });
        }
        Integer baseMaskToggleColor = inputTextBasedComponentStyle.getBaseMaskToggleColor();
        if (baseMaskToggleColor != null) {
            int iIntValue21 = baseMaskToggleColor.intValue();
            Integer focusedMaskToggleColor = inputTextBasedComponentStyle.getFocusedMaskToggleColor();
            int iIntValue22 = focusedMaskToggleColor != null ? focusedMaskToggleColor.intValue() : iIntValue21;
            Integer disabledMaskToggleColor = inputTextBasedComponentStyle.getDisabledMaskToggleColor();
            textInputLayout.setEndIconTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{iIntValue21, iIntValue22, disabledMaskToggleColor != null ? disabledMaskToggleColor.intValue() : iIntValue21, iIntValue21}));
        }
    }
}
