package p1110xk;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import com.withpersona.sdk2.inquiry.network.dto.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.p687ui.ButtonWithLoadingIndicator;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0201R0;
import p025An.C0644w;
import p1120y4.C21382i;
import p1157zk.AbstractC22213c;
import p594Y9.AbstractC9722E4;
import p822j2.C16047d;

/* JADX INFO: renamed from: xk.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21282e {
    /* JADX INFO: renamed from: a */
    public static final void m21622a(ButtonWithLoadingIndicator buttonWithLoadingIndicator, BaseButtonComponentStyle baseButtonComponentStyle) {
        m21624c(buttonWithLoadingIndicator.getButton(), baseButtonComponentStyle, false, 6);
        Integer activeTextColorValue = baseButtonComponentStyle.getActiveTextColorValue();
        if (activeTextColorValue != null) {
            buttonWithLoadingIndicator.getProgressBar().setIndeterminateTintList(new ColorStateList(new int[][]{new int[0]}, new int[]{activeTextColorValue.intValue()}));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m21623b(BaseButtonComponentStyle baseButtonComponentStyle, Button button, boolean z6) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        Double dp6;
        Double dp7;
        Double dp8;
        Double dp9;
        Integer baseTextColorValue = baseButtonComponentStyle.getBaseTextColorValue();
        if (baseTextColorValue != null) {
            int iIntValue = baseTextColorValue.intValue();
            Integer activeTextColorValue = baseButtonComponentStyle.getActiveTextColorValue();
            int iIntValue2 = activeTextColorValue != null ? activeTextColorValue.intValue() : iIntValue;
            Integer disabledTextColorValue = baseButtonComponentStyle.getDisabledTextColorValue();
            button.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue2, disabledTextColorValue != null ? disabledTextColorValue.intValue() : iIntValue, iIntValue}));
        }
        Double fontSizeValue = baseButtonComponentStyle.getFontSizeValue();
        if (fontSizeValue != null) {
            button.setTextSize((float) fontSizeValue.doubleValue());
        }
        Double letterSpacingValue = baseButtonComponentStyle.getLetterSpacingValue();
        if (letterSpacingValue != null) {
            button.setLetterSpacing((float) (letterSpacingValue.doubleValue() / ((double) button.getTextSize())));
        }
        String fontNameValue = baseButtonComponentStyle.getFontNameValue();
        if (fontNameValue != null) {
            AbstractC21295r.m21636b(button, fontNameValue);
        }
        StyleElements.FontWeight fontWeightValue = baseButtonComponentStyle.getFontWeightValue();
        if (fontWeightValue != null && Build.VERSION.SDK_INT >= 29) {
            AbstractC21295r.m21635a(button, fontWeightValue);
        }
        Double lineHeightValue = baseButtonComponentStyle.getLineHeightValue();
        if (lineHeightValue != null) {
            double dDoubleValue = lineHeightValue.doubleValue();
            if (Build.VERSION.SDK_INT >= 28) {
                button.setLineHeight((int) C21382i.m21761a(dDoubleValue));
            }
        }
        button.isEnabled();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Double borderWidthValue = baseButtonComponentStyle.getBorderWidthValue();
        int iM21761a = borderWidthValue != null ? (int) C21382i.m21761a(borderWidthValue.doubleValue()) : 0;
        Integer baseBorderColorValue = baseButtonComponentStyle.getBaseBorderColorValue();
        int iIntValue3 = baseBorderColorValue != null ? baseBorderColorValue.intValue() : 0;
        Integer activeTextColorValue2 = baseButtonComponentStyle.getActiveTextColorValue();
        int iIntValue4 = activeTextColorValue2 != null ? activeTextColorValue2.intValue() : iIntValue3;
        Integer disabledTextColorValue2 = baseButtonComponentStyle.getDisabledTextColorValue();
        gradientDrawable.setStroke(iM21761a, new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue4, disabledTextColorValue2 != null ? disabledTextColorValue2.intValue() : iIntValue3, iIntValue3}));
        Double borderRadiusValue = baseButtonComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            float fM21761a = (float) C21382i.m21761a(borderRadiusValue.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            AbstractC16544l.m18092e(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{fM21761a, fM21761a, fM21761a, fM21761a, fM21761a, fM21761a, fM21761a, fM21761a});
        }
        Integer baseBackgroundColorValue = baseButtonComponentStyle.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            Integer activeBackgroundColorValue = baseButtonComponentStyle.getActiveBackgroundColorValue();
            int iIntValue5 = activeBackgroundColorValue != null ? activeBackgroundColorValue.intValue() : baseBackgroundColorValue.intValue();
            Integer disabledBackgroundColorValue = baseButtonComponentStyle.getDisabledBackgroundColorValue();
            int iIntValue6 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : baseBackgroundColorValue.intValue();
            new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue5, iIntValue6, baseBackgroundColorValue.intValue()});
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[]{R.attr.state_activated}, new int[]{-16842910}, new int[0]}, new int[]{iIntValue5, iIntValue6, baseBackgroundColorValue.intValue()}));
        }
        button.setBackground(gradientDrawable);
        button.setBackgroundTintList(null);
        float f10 = 0.0f;
        button.setElevation(0.0f);
        button.setStateListAnimator(null);
        button.setAllCaps(false);
        Object parent = button.getParent();
        View view = parent instanceof ButtonWithLoadingIndicator ? (View) parent : button;
        StyleElements.DPSizeSet marginValue = baseButtonComponentStyle.getMarginValue();
        if (marginValue != null) {
            AbstractC22213c.m22403c(button, marginValue);
            if (view instanceof ButtonWithLoadingIndicator) {
                ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) view;
                ProgressBar progressBar = buttonWithLoadingIndicator.getProgressBar();
                StyleElements.DPSize left = marginValue.getLeft();
                int paddingLeft = (left == null || (dp9 = left.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingLeft() : (int) C21382i.m21761a(dp9.doubleValue());
                StyleElements.DPSize top = marginValue.getTop();
                int paddingTop = (top == null || (dp8 = top.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingTop() : (int) C21382i.m21761a(dp8.doubleValue());
                StyleElements.DPSize right = marginValue.getRight();
                int paddingRight = (right == null || (dp7 = right.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingRight() : (int) C21382i.m21761a(dp7.doubleValue());
                StyleElements.DPSize bottom = marginValue.getBottom();
                progressBar.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp6 = bottom.getDp()) == null) ? buttonWithLoadingIndicator.getProgressBar().getPaddingBottom() : (int) C21382i.m21761a(dp6.doubleValue()));
            }
        }
        StyleElements.DPSizeSet paddingValue = baseButtonComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            StyleElements.DPSize left2 = paddingValue.getLeft();
            int paddingLeft2 = (left2 == null || (dp5 = left2.getDp()) == null) ? button.getPaddingLeft() : (int) C21382i.m21761a(dp5.doubleValue());
            StyleElements.DPSize top2 = paddingValue.getTop();
            int paddingTop2 = (top2 == null || (dp4 = top2.getDp()) == null) ? button.getPaddingTop() : (int) C21382i.m21761a(dp4.doubleValue());
            StyleElements.DPSize right2 = paddingValue.getRight();
            int paddingRight2 = (right2 == null || (dp3 = right2.getDp()) == null) ? button.getPaddingRight() : (int) C21382i.m21761a(dp3.doubleValue());
            StyleElements.DPSize bottom2 = paddingValue.getBottom();
            button.setPadding(paddingLeft2, paddingTop2, paddingRight2, (bottom2 == null || (dp2 = bottom2.getDp()) == null) ? button.getPaddingBottom() : (int) C21382i.m21761a(dp2.doubleValue()));
        }
        int measuredWidth = view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Double widthValue = baseButtonComponentStyle.getWidthValue();
        if (widthValue != null) {
            double dDoubleValue2 = widthValue.doubleValue();
            if (z6) {
                int iM21761a2 = (int) C21382i.m21761a(dDoubleValue2);
                if (iM21761a2 <= measuredWidth) {
                    measuredWidth = iM21761a2;
                }
                layoutParams.width = measuredWidth;
            }
        }
        Double heightValue = baseButtonComponentStyle.getHeightValue();
        if (heightValue != null) {
            double dDoubleValue3 = heightValue.doubleValue();
            if (z6) {
                layoutParams.height = (int) C21382i.m21761a(dDoubleValue3);
            }
        }
        if (view instanceof ButtonWithLoadingIndicator) {
            int i10 = layoutParams.height;
            ViewGroup.LayoutParams layoutParams2 = button.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i11 = i10 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            ViewGroup.LayoutParams layoutParams3 = button.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            layoutParams.height = i11 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
        }
        StyleElements.PositionType justificationValue = baseButtonComponentStyle.getJustificationValue();
        if (justificationValue != null && (layoutParams instanceof C16047d)) {
            C16047d c16047d = (C16047d) layoutParams;
            int i12 = AbstractC21281d.f67673a[justificationValue.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = 0.5f;
                } else {
                    if (i12 != 3) {
                        throw new C0644w();
                    }
                    f10 = 1.0f;
                }
            }
            c16047d.f49507E = f10;
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public static void m21624c(Button button, BaseButtonComponentStyle baseButtonComponentStyle, boolean z6, int i10) {
        if ((i10 & 4) != 0) {
            z6 = true;
        }
        AbstractC16544l.m18094g(button, "<this>");
        if (button.isLaidOut()) {
            m21623b(baseButtonComponentStyle, button, z6);
        } else {
            AbstractC9722E4.m10313a(new C0201R0(baseButtonComponentStyle, button, false, z6), button);
        }
    }
}
