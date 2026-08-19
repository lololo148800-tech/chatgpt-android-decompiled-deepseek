package p1110xk;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import kotlin.jvm.internal.AbstractC16544l;
import p1120y4.C21382i;
import p1157zk.AbstractC22213c;

/* JADX INFO: renamed from: xk.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21285h {
    /* JADX INFO: renamed from: a */
    public static final void m21629a(TextInputLayout textInputLayout, UiComponentConfig.InputSelectComponentStyle inputSelectComponentStyle) {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AbstractC16544l.m18094g(textInputLayout, "<this>");
        Integer baseBackgroundColorValue = inputSelectComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            textInputLayout.setBoxBackgroundColor(baseBackgroundColorValue.intValue());
        }
        Integer baseBorderColorValue = inputSelectComponentStyle.getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            int iIntValue = baseBorderColorValue.intValue();
            int[][] iArr = {new int[]{-16842910}, new int[0]};
            AttributeStyles.InputSelectBorderColorStyle borderColor = inputSelectComponentStyle.getBorderColor();
            textInputLayout.setBoxStrokeColorStateList(new ColorStateList(iArr, new int[]{(borderColor == null || (base = borderColor.getBase()) == null || (disabled = base.getDisabled()) == null) ? iIntValue : disabled.intValue(), iIntValue}));
        }
        Double topBorderWidthValue = inputSelectComponentStyle.getTopBorderWidthValue();
        if (topBorderWidthValue != null) {
            double dDoubleValue = topBorderWidthValue.doubleValue();
            textInputLayout.setBoxStrokeWidth((int) Math.ceil(C21382i.m21761a(dDoubleValue)));
            textInputLayout.setBoxStrokeWidthFocused((int) Math.ceil(C21382i.m21761a(dDoubleValue)));
        }
        if (textInputLayout.getBoxStrokeWidth() == 0) {
            Double bottomBorderWidthValue = inputSelectComponentStyle.getBottomBorderWidthValue();
            if ((bottomBorderWidthValue != null ? bottomBorderWidthValue.doubleValue() : 0.0d) > 0.0d) {
                Double bottomBorderWidthValue2 = inputSelectComponentStyle.getBottomBorderWidthValue();
                int iCeil = (int) Math.ceil(bottomBorderWidthValue2 != null ? C21382i.m21761a(bottomBorderWidthValue2.doubleValue()) : 0.0d);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setStroke(iCeil, textInputLayout.getBoxStrokeColor());
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
                int i10 = -iCeil;
                ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                layerDrawable.setLayerInset(0, i10, i10, i10, marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                textInputLayout.setBackground(layerDrawable);
            }
        }
        Integer chevronColor = inputSelectComponentStyle.getChevronColor();
        if (chevronColor != null) {
            int iIntValue2 = chevronColor.intValue();
            textInputLayout.setEndIconTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842908}, new int[]{R.attr.state_hovered}, new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{iIntValue2, iIntValue2, iIntValue2, iIntValue2, iIntValue2, iIntValue2}));
        }
        Double borderRadiusValue = inputSelectComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            double dDoubleValue2 = borderRadiusValue.doubleValue();
            textInputLayout.m13666l((float) C21382i.m21761a(dDoubleValue2), (float) C21382i.m21761a(dDoubleValue2), (float) C21382i.m21761a(dDoubleValue2), (float) C21382i.m21761a(dDoubleValue2));
        }
        StyleElements.DPSizeSet inputSelectBoxMargins = inputSelectComponentStyle.getInputSelectBoxMargins();
        if (inputSelectBoxMargins != null) {
            AbstractC22213c.m22403c(textInputLayout, inputSelectBoxMargins);
        }
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            AbstractC21295r.m21637c(editText, inputSelectComponentStyle.getTextBasedStyle());
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            AbstractC22213c.m22403c(editText2, new StyleElements.DPSizeSet(new StyleElements.DPSize(Double.valueOf(0.0d)), new StyleElements.DPSize(Double.valueOf(0.0d)), new StyleElements.DPSize(Double.valueOf(0.0d)), new StyleElements.DPSize(Double.valueOf(0.0d))));
        }
    }
}
