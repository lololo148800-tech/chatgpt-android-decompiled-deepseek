package p1110xk;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p1120y4.C21382i;
import p1157zk.AbstractC22213c;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: xk.j */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21287j {
    /* JADX INFO: renamed from: a */
    public static final void m21630a(ConstraintLayout constraintLayout, UiComponentConfig.ClickableStackComponentStyle clickableStackComponentStyle) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        StyleElements.DPSizeSet marginValue = clickableStackComponentStyle.getMarginValue();
        if (marginValue != null) {
            AbstractC22213c.m22403c(constraintLayout, marginValue);
        }
        StyleElements.DPSizeSet paddingValue = clickableStackComponentStyle.getPaddingValue();
        if (paddingValue != null) {
            StyleElements.DPSize left = paddingValue.getLeft();
            int paddingLeft = (left == null || (dp5 = left.getDp()) == null) ? constraintLayout.getPaddingLeft() : (int) C21382i.m21761a(dp5.doubleValue());
            StyleElements.DPSize top = paddingValue.getTop();
            int paddingTop = (top == null || (dp4 = top.getDp()) == null) ? constraintLayout.getPaddingTop() : (int) C21382i.m21761a(dp4.doubleValue());
            StyleElements.DPSize right = paddingValue.getRight();
            int paddingRight = (right == null || (dp3 = right.getDp()) == null) ? constraintLayout.getPaddingRight() : (int) C21382i.m21761a(dp3.doubleValue());
            StyleElements.DPSize bottom = paddingValue.getBottom();
            constraintLayout.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp2 = bottom.getDp()) == null) ? constraintLayout.getPaddingBottom() : (int) C21382i.m21761a(dp2.doubleValue()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX INFO: renamed from: b */
    public static final LayerDrawable m21631b(UiComponentConfig.ClickableStackComponentStyle clickableStackComponentStyle, EnumC21286i enumC21286i) {
        int iIntValue;
        Integer baseBackgroundColorValue;
        StyleElements.DPSize right;
        Double dp2;
        StyleElements.DPSize left;
        Double dp3;
        StyleElements.DPSize bottom;
        Double dp4;
        StyleElements.DPSize top;
        Double dp5;
        Double dp6;
        Integer disabledBorderColorValue;
        StyleElements.DPSize right2;
        Double dp7;
        StyleElements.DPSize left2;
        Double dp8;
        StyleElements.DPSize bottom2;
        Double dp9;
        StyleElements.DPSize top2;
        Double dp10;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        StyleElements.DPSizeSet borderWidthValue = clickableStackComponentStyle.getBorderWidthValue();
        double dDoubleValue = 0.0d;
        Double dValueOf = Double.valueOf((borderWidthValue == null || (top2 = borderWidthValue.getTop()) == null || (dp10 = top2.getDp()) == null) ? 0.0d : dp10.doubleValue());
        StyleElements.DPSizeSet borderWidthValue2 = clickableStackComponentStyle.getBorderWidthValue();
        Double dValueOf2 = Double.valueOf((borderWidthValue2 == null || (bottom2 = borderWidthValue2.getBottom()) == null || (dp9 = bottom2.getDp()) == null) ? 0.0d : dp9.doubleValue());
        StyleElements.DPSizeSet borderWidthValue3 = clickableStackComponentStyle.getBorderWidthValue();
        Double dValueOf3 = Double.valueOf((borderWidthValue3 == null || (left2 = borderWidthValue3.getLeft()) == null || (dp8 = left2.getDp()) == null) ? 0.0d : dp8.doubleValue());
        StyleElements.DPSizeSet borderWidthValue4 = clickableStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue4 != null && (right2 = borderWidthValue4.getRight()) != null && (dp7 = right2.getDp()) != null) {
            dDoubleValue = dp7.doubleValue();
        }
        List listM19382k = AbstractC17681o.m19382k(dValueOf, dValueOf2, dValueOf3, Double.valueOf(dDoubleValue));
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM19382k, 10));
        Iterator it = listM19382k.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) Math.ceil(C21382i.m21761a(((Number) it.next()).doubleValue()))));
        }
        int iIntValue2 = ((Number) AbstractC17680n.m19356f0(arrayList)).intValue();
        int iOrdinal = enumC21286i.ordinal();
        if (iOrdinal == 0) {
            Integer baseBorderColorValue = clickableStackComponentStyle.getBaseBorderColorValue();
            if (baseBorderColorValue != null) {
                iIntValue = baseBorderColorValue.intValue();
            } else {
                iIntValue = 0;
            }
        } else if (iOrdinal == 1) {
            Integer activeBorderColorValue = clickableStackComponentStyle.getActiveBorderColorValue();
            if (activeBorderColorValue != null) {
                iIntValue = activeBorderColorValue.intValue();
            } else {
                iIntValue = 0;
            }
        } else if (iOrdinal == 2 && (disabledBorderColorValue = clickableStackComponentStyle.getDisabledBorderColorValue()) != null) {
            iIntValue = disabledBorderColorValue.intValue();
        } else {
            iIntValue = 0;
        }
        gradientDrawable.setStroke(iIntValue2, iIntValue);
        StyleElements.DPSize borderRadiusValue = clickableStackComponentStyle.getBorderRadiusValue();
        if (borderRadiusValue != null && (dp6 = borderRadiusValue.getDp()) != null) {
            float fM21761a = (float) C21382i.m21761a(dp6.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            AbstractC16544l.m18092e(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{fM21761a, fM21761a, fM21761a, fM21761a, fM21761a, fM21761a, fM21761a, fM21761a});
        }
        int iOrdinal2 = enumC21286i.ordinal();
        if (iOrdinal2 == 0) {
            baseBackgroundColorValue = clickableStackComponentStyle.getBaseBackgroundColorValue();
        } else if (iOrdinal2 == 1) {
            baseBackgroundColorValue = clickableStackComponentStyle.getActiveBackgroundColorValue();
        } else {
            if (iOrdinal2 != 2) {
                throw new C0644w();
            }
            baseBackgroundColorValue = clickableStackComponentStyle.getDisabledBackgroundColorValue();
        }
        if (baseBackgroundColorValue != null) {
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[0]}, new int[]{baseBackgroundColorValue.intValue()}));
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        StyleElements.DPSizeSet borderWidthValue5 = clickableStackComponentStyle.getBorderWidthValue();
        int iCeil = (borderWidthValue5 == null || (top = borderWidthValue5.getTop()) == null || (dp5 = top.getDp()) == null) ? iIntValue2 : iIntValue2 - ((int) Math.ceil(C21382i.m21761a(dp5.doubleValue())));
        StyleElements.DPSizeSet borderWidthValue6 = clickableStackComponentStyle.getBorderWidthValue();
        int iCeil2 = (borderWidthValue6 == null || (bottom = borderWidthValue6.getBottom()) == null || (dp4 = bottom.getDp()) == null) ? iIntValue2 : iIntValue2 - ((int) Math.ceil(C21382i.m21761a(dp4.doubleValue())));
        StyleElements.DPSizeSet borderWidthValue7 = clickableStackComponentStyle.getBorderWidthValue();
        int iCeil3 = (borderWidthValue7 == null || (left = borderWidthValue7.getLeft()) == null || (dp3 = left.getDp()) == null) ? iIntValue2 : iIntValue2 - ((int) Math.ceil(C21382i.m21761a(dp3.doubleValue())));
        StyleElements.DPSizeSet borderWidthValue8 = clickableStackComponentStyle.getBorderWidthValue();
        if (borderWidthValue8 != null && (right = borderWidthValue8.getRight()) != null && (dp2 = right.getDp()) != null) {
            iIntValue2 -= (int) Math.ceil(C21382i.m21761a(dp2.doubleValue()));
        }
        layerDrawable.setLayerInset(0, -iCeil3, -iCeil, -iIntValue2, -iCeil2);
        return layerDrawable;
    }
}
