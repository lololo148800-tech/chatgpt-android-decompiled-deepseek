package p1157zk;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p1120y4.C21382i;
import p279L1.C4911l;
import p523V9.AbstractC8138m0;
import p822j2.C16047d;

/* JADX INFO: renamed from: zk.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC22213c {
    /* JADX INFO: renamed from: a */
    public static final void m22401a(View view, StyleElements.Size size) {
        AbstractC16544l.m18094g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (size instanceof StyleElements.DPSize) {
            Double dp2 = ((StyleElements.DPSize) size).getDp();
            if (dp2 == null) {
                return;
            } else {
                layoutParams.height = (int) C21382i.m21761a(dp2.doubleValue());
            }
        } else if (size instanceof StyleElements.Size.PercentSize) {
            Object parent = view.getParent();
            if (layoutParams instanceof C16047d) {
                ((C16047d) layoutParams).f49521S = (float) ((StyleElements.Size.PercentSize) size).getPercent();
            } else if (parent instanceof View) {
                layoutParams.height = (int) (((StyleElements.Size.PercentSize) size).getPercent() * ((double) ((View) parent).getHeight()));
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public static final void m22402b(View view, StyleElements.Size size) {
        AbstractC16544l.m18094g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (size instanceof StyleElements.DPSize) {
            Double dp2 = ((StyleElements.DPSize) size).getDp();
            if (dp2 == null) {
                return;
            }
            int iM21761a = (int) C21382i.m21761a(dp2.doubleValue());
            ViewGroup.LayoutParams layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
            int width = Integer.MAX_VALUE;
            if ((layoutParams2 == null || layoutParams2.width != -2) && view2 != null) {
                width = view2.getWidth();
            }
            if (iM21761a > width) {
                iM21761a = width;
            }
            layoutParams.width = iM21761a;
        } else if (size instanceof StyleElements.Size.PercentSize) {
            if (layoutParams instanceof C16047d) {
                ((C16047d) layoutParams).f49520R = (float) ((StyleElements.Size.PercentSize) size).getPercent();
            } else if (view2 != null) {
                layoutParams.width = (int) (((StyleElements.Size.PercentSize) size).getPercent() * ((double) view2.getWidth()));
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public static final void m22403c(View view, StyleElements.DPSizeSet dPSizeSet) {
        Double dp2;
        Double dp3;
        Double dp4;
        Double dp5;
        AbstractC16544l.m18094g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            StyleElements.DPSize left = dPSizeSet.getLeft();
            marginLayoutParams.leftMargin = (left == null || (dp5 = left.getDp()) == null) ? marginLayoutParams.leftMargin : (int) C21382i.m21761a(dp5.doubleValue());
            StyleElements.DPSize right = dPSizeSet.getRight();
            marginLayoutParams.rightMargin = (right == null || (dp4 = right.getDp()) == null) ? marginLayoutParams.rightMargin : (int) C21382i.m21761a(dp4.doubleValue());
            StyleElements.DPSize top = dPSizeSet.getTop();
            marginLayoutParams.topMargin = (top == null || (dp3 = top.getDp()) == null) ? marginLayoutParams.topMargin : (int) C21382i.m21761a(dp3.doubleValue());
            StyleElements.DPSize bottom = dPSizeSet.getBottom();
            marginLayoutParams.bottomMargin = (bottom == null || (dp2 = bottom.getDp()) == null) ? marginLayoutParams.bottomMargin : (int) C21382i.m21761a(dp2.doubleValue());
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public static final void m22404d(TextInputLayout textInputLayout, String str, TextBasedComponentStyle textBasedComponentStyle) {
        if (str == null || AbstractC21322p.m21681O(str)) {
            textInputLayout.setErrorEnabled(false);
            return;
        }
        textInputLayout.setError(str);
        if (textBasedComponentStyle != null) {
            SpannableString spannableString = new SpannableString(textInputLayout.getError());
            String fontNameValue = textBasedComponentStyle.getFontNameValue();
            if (fontNameValue != null) {
                Context context = textInputLayout.getContext();
                AbstractC16544l.m18093f(context, "getContext(...)");
                Typeface typefaceM8672g = AbstractC8138m0.m8672g(context, fontNameValue);
                if (typefaceM8672g != null) {
                    spannableString.setSpan(new C4911l(typefaceM8672g, 1), 0, spannableString.length(), 33);
                }
            }
            Double fontSizeValue = textBasedComponentStyle.getFontSizeValue();
            if (fontSizeValue != null) {
                spannableString.setSpan(new AbsoluteSizeSpan((int) C21382i.m21761a(fontSizeValue.doubleValue())), 0, spannableString.length(), 33);
            }
            textInputLayout.setError(spannableString);
        }
    }
}
