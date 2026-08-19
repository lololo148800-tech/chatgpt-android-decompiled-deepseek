package p994rk;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1120y4.C21382i;
import p1157zk.AbstractC22213c;
import p822j2.C16047d;
import p909nm.AbstractC17681o;
import uk.C20374d;

/* JADX INFO: renamed from: rk.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C19098L extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20374d f60789Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ UiComponentConfig.HorizontalStackComponentStyle f60790Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19098L(C20374d c20374d, UiComponentConfig.HorizontalStackComponentStyle horizontalStackComponentStyle) {
        super(0);
        this.f60789Y = c20374d;
        this.f60790Z = horizontalStackComponentStyle;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Object dp2;
        Object dp3;
        Object dp4;
        Object dp5;
        Object obj;
        StyleElements.DPSize right;
        Double dp6;
        StyleElements.DPSize left;
        Double dp7;
        StyleElements.DPSize bottom;
        Double dp8;
        StyleElements.DPSize top;
        Double dp9;
        Double dp10;
        StyleElements.DPSize right2;
        StyleElements.DPSize left2;
        StyleElements.DPSize bottom2;
        StyleElements.DPSize top2;
        Double dp11;
        Double dp12;
        Double dp13;
        Double dp14;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f60789Y.f64428b;
        AbstractC16544l.m18093f(constraintLayout, "getRoot(...)");
        UiComponentConfig.HorizontalStackComponentStyle styles = this.f60790Z;
        AbstractC16544l.m18094g(styles, "styles");
        StyleElements.DPSizeSet marginValue = styles.getMarginValue();
        if (marginValue != null) {
            AbstractC22213c.m22403c(constraintLayout, marginValue);
        }
        StyleElements.DPSizeSet paddingValue = styles.getPaddingValue();
        if (paddingValue != null) {
            StyleElements.DPSize left3 = paddingValue.getLeft();
            int paddingLeft = (left3 == null || (dp14 = left3.getDp()) == null) ? constraintLayout.getPaddingLeft() : (int) C21382i.m21761a(dp14.doubleValue());
            StyleElements.DPSize top3 = paddingValue.getTop();
            int paddingTop = (top3 == null || (dp13 = top3.getDp()) == null) ? constraintLayout.getPaddingTop() : (int) C21382i.m21761a(dp13.doubleValue());
            StyleElements.DPSize right3 = paddingValue.getRight();
            int paddingRight = (right3 == null || (dp12 = right3.getDp()) == null) ? constraintLayout.getPaddingRight() : (int) C21382i.m21761a(dp12.doubleValue());
            StyleElements.DPSize bottom3 = paddingValue.getBottom();
            constraintLayout.setPadding(paddingLeft, paddingTop, paddingRight, (bottom3 == null || (dp11 = bottom3.getDp()) == null) ? constraintLayout.getPaddingBottom() : (int) C21382i.m21761a(dp11.doubleValue()));
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        Object obj2 = 0;
        gradientDrawable.setShape(0);
        StyleElements.DPSizeSet borderWidthValue = styles.getBorderWidthValue();
        if (borderWidthValue == null || (top2 = borderWidthValue.getTop()) == null || (dp2 = top2.getDp()) == null) {
            dp2 = obj2;
        }
        StyleElements.DPSizeSet borderWidthValue2 = styles.getBorderWidthValue();
        if (borderWidthValue2 == null || (bottom2 = borderWidthValue2.getBottom()) == null || (dp3 = bottom2.getDp()) == null) {
            dp3 = obj2;
        }
        StyleElements.DPSizeSet borderWidthValue3 = styles.getBorderWidthValue();
        if (borderWidthValue3 == null || (left2 = borderWidthValue3.getLeft()) == null || (dp4 = left2.getDp()) == null) {
            dp4 = obj2;
        }
        StyleElements.DPSizeSet borderWidthValue4 = styles.getBorderWidthValue();
        if (borderWidthValue4 == null || (right2 = borderWidthValue4.getRight()) == null || (dp5 = right2.getDp()) == null) {
            dp5 = obj2;
        }
        Iterator it = AbstractC17681o.m19382k(dp2, dp3, dp4, dp5).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                double dCeil = Math.ceil(C21382i.m21761a(((Number) next).doubleValue()));
                do {
                    Object next2 = it.next();
                    double dCeil2 = Math.ceil(C21382i.m21761a(((Number) next2).doubleValue()));
                    if (Double.compare(dCeil, dCeil2) < 0) {
                        dCeil = dCeil2;
                        next = next2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        int iIntValue = ((Number) (obj != null ? obj : 0)).intValue();
        Integer baseBorderColorValue = styles.getBaseBorderColorValue();
        gradientDrawable.setStroke(iIntValue, baseBorderColorValue != null ? baseBorderColorValue.intValue() : 0);
        StyleElements.DPSize borderRadiusValue = styles.getBorderRadiusValue();
        if (borderRadiusValue != null && (dp10 = borderRadiusValue.getDp()) != null) {
            float fM21761a = (float) C21382i.m21761a(dp10.doubleValue());
            Drawable drawableMutate = gradientDrawable.mutate();
            AbstractC16544l.m18092e(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate).setCornerRadii(new float[]{fM21761a, fM21761a, fM21761a, fM21761a, fM21761a, fM21761a, fM21761a, fM21761a});
        }
        Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[0]}, new int[]{baseBackgroundColorValue.intValue()}));
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        StyleElements.DPSizeSet borderWidthValue5 = styles.getBorderWidthValue();
        int iCeil = (borderWidthValue5 == null || (top = borderWidthValue5.getTop()) == null || (dp9 = top.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(C21382i.m21761a(dp9.doubleValue())));
        StyleElements.DPSizeSet borderWidthValue6 = styles.getBorderWidthValue();
        int iCeil2 = (borderWidthValue6 == null || (bottom = borderWidthValue6.getBottom()) == null || (dp8 = bottom.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(C21382i.m21761a(dp8.doubleValue())));
        StyleElements.DPSizeSet borderWidthValue7 = styles.getBorderWidthValue();
        int iCeil3 = (borderWidthValue7 == null || (left = borderWidthValue7.getLeft()) == null || (dp7 = left.getDp()) == null) ? iIntValue : iIntValue - ((int) Math.ceil(C21382i.m21761a(dp7.doubleValue())));
        StyleElements.DPSizeSet borderWidthValue8 = styles.getBorderWidthValue();
        if (borderWidthValue8 != null && (right = borderWidthValue8.getRight()) != null && (dp6 = right.getDp()) != null) {
            iIntValue -= (int) Math.ceil(C21382i.m21761a(dp6.doubleValue()));
        }
        layerDrawable.setLayerInset(0, -iCeil3, -iCeil, -iIntValue, -iCeil2);
        constraintLayout.setBackground(layerDrawable);
        Double widthValue = styles.getWidthValue();
        if (widthValue != null) {
            int iM21761a = (int) C21382i.m21761a(widthValue.doubleValue());
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            C16047d c16047d = (C16047d) layoutParams;
            c16047d.f49566v = -1;
            ((ViewGroup.MarginLayoutParams) c16047d).width = iM21761a;
            constraintLayout.setLayoutParams(c16047d);
        }
        return C17296C.f55119a;
    }
}
