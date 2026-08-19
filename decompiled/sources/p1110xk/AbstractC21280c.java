package p1110xk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0740V;
import p1091wn.AbstractC21031l;
import p1091wn.C21025f;
import p1091wn.C21027h;
import p1120y4.C21382i;
import p523V9.AbstractC8040Z5;
import p822j2.C16047d;

/* JADX INFO: renamed from: xk.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21280c {
    /* JADX INFO: renamed from: a */
    public static final void m21621a(ViewGroup viewGroup, StepStyle stepStyle, View innerView) {
        int iM8408d;
        Double dp2;
        StyleElements.DPSizeSet modalPaddingValue;
        Double dp3;
        Double dp4;
        Double dp5;
        Double dp6;
        Integer backgroundColorValue;
        AbstractC16544l.m18094g(innerView, "innerView");
        if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
            Context context = viewGroup.getContext();
            AbstractC16544l.m18093f(context, "getContext(...)");
            iM8408d = AbstractC8040Z5.m8408d(context, R.attr.colorSurface);
        } else {
            iM8408d = backgroundColorValue.intValue();
        }
        viewGroup.setBackgroundTintList(ColorStateList.valueOf(iM8408d));
        if (stepStyle != null) {
            Context context2 = viewGroup.getContext();
            AbstractC16544l.m18093f(context2, "getContext(...)");
            Drawable drawableBackgroundImageDrawable = stepStyle.backgroundImageDrawable(context2);
            if (drawableBackgroundImageDrawable != null) {
                C21027h c21027hM21487k = AbstractC21031l.m21487k(new C0740V(viewGroup, 0), C21279b.f67672Y);
                Iterator it = c21027hM21487k.f66902a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Context context3 = viewGroup.getContext();
                        AbstractC16544l.m18093f(context3, "getContext(...)");
                        View c21278a = new C21278a(context3);
                        c21278a.setBackground(drawableBackgroundImageDrawable);
                        viewGroup.addView(c21278a, 0);
                        ViewGroup.LayoutParams layoutParams = c21278a.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                        C16047d c16047d = (C16047d) layoutParams;
                        ((ViewGroup.MarginLayoutParams) c16047d).height = 0;
                        c16047d.f49564t = viewGroup.getId();
                        c16047d.f49566v = viewGroup.getId();
                        c16047d.f49545i = viewGroup.getId();
                        c16047d.f49551l = viewGroup.getId();
                        c21278a.setLayoutParams(c16047d);
                        break;
                    }
                    if (((Boolean) c21027hM21487k.f66904c.invoke(it.next())).booleanValue() == c21027hM21487k.f66903b) {
                        C21025f c21025f = (C21025f) c21027hM21487k.iterator();
                        if (!c21025f.hasNext()) {
                            throw new NoSuchElementException("Sequence is empty.");
                        }
                        ((View) c21025f.next()).setBackground(drawableBackgroundImageDrawable);
                        break;
                    }
                }
            }
        }
        if (stepStyle != null && (modalPaddingValue = stepStyle.getModalPaddingValue()) != null) {
            StyleElements.DPSize left = modalPaddingValue.getLeft();
            int paddingLeft = (left == null || (dp6 = left.getDp()) == null) ? viewGroup.getPaddingLeft() : (int) C21382i.m21761a(dp6.doubleValue());
            StyleElements.DPSize top = modalPaddingValue.getTop();
            int paddingTop = (top == null || (dp5 = top.getDp()) == null) ? viewGroup.getPaddingTop() : (int) C21382i.m21761a(dp5.doubleValue());
            StyleElements.DPSize right = modalPaddingValue.getRight();
            int paddingRight = (right == null || (dp4 = right.getDp()) == null) ? viewGroup.getPaddingRight() : (int) C21382i.m21761a(dp4.doubleValue());
            StyleElements.DPSize bottom = modalPaddingValue.getBottom();
            innerView.setPadding(paddingLeft, paddingTop, paddingRight, (bottom == null || (dp3 = bottom.getDp()) == null) ? viewGroup.getPaddingBottom() : (int) C21382i.m21761a(dp3.doubleValue()));
        }
        StyleElements.DPSize modalBorderRadiusValue = stepStyle != null ? stepStyle.getModalBorderRadiusValue() : null;
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fM21761a = (float) C21382i.m21761a((modalBorderRadiusValue == null || (dp2 = modalBorderRadiusValue.getDp()) == null) ? 12.0d : dp2.doubleValue());
        gradientDrawable.setCornerRadii(new float[]{fM21761a, fM21761a, fM21761a, fM21761a, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(ColorStateList.valueOf(-1));
        viewGroup.setBackground(gradientDrawable);
    }
}
