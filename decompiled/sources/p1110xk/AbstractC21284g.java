package p1110xk;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.p687ui.ThemeableLottieAnimationView;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p021Aj.C0523h;
import p025An.C0644w;
import p1157zk.AbstractC22213c;
import p523V9.AbstractC8040Z5;
import p594Y9.AbstractC9722E4;
import p822j2.C16047d;

/* JADX INFO: renamed from: xk.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21284g {
    /* JADX INFO: renamed from: a */
    public static final void m21625a(ThemeableLottieAnimationView themeableLottieAnimationView, LocalImageComponentStyle localImageComponentStyle, String[] strArr, String[] strArr2, String[] strArr3) {
        AbstractC16544l.m18094g(themeableLottieAnimationView, "<this>");
        if (themeableLottieAnimationView.isLaidOut()) {
            m21626b(themeableLottieAnimationView, localImageComponentStyle, strArr, strArr2, strArr3);
        } else {
            AbstractC9722E4.m10313a(new C0523h(themeableLottieAnimationView, localImageComponentStyle, strArr, strArr2, strArr3, 7), themeableLottieAnimationView);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m21626b(ThemeableLottieAnimationView themeableLottieAnimationView, LocalImageComponentStyle localImageComponentStyle, String[] strArr, String[] strArr2, String[] strArr3) {
        AttributeStyles.LocalImageJustifyStyle justify;
        StyleElements.Position base;
        StyleElements.PositionType base2;
        float f10;
        StyleElements.DPSizeSet marginValue;
        m21628d(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getStrokeColorValue() : null, localImageComponentStyle != null ? localImageComponentStyle.getFillColorValue() : null, localImageComponentStyle != null ? localImageComponentStyle.getBackgroundColorValue() : null, strArr, strArr2, strArr3);
        if (localImageComponentStyle != null && (marginValue = localImageComponentStyle.getMarginValue()) != null) {
            AbstractC22213c.m22403c(themeableLottieAnimationView, marginValue);
        }
        AbstractC22213c.m22402b(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getWidthValue() : null);
        AbstractC22213c.m22401a(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getHeightValue() : null);
        ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView.getLayoutParams();
        if (localImageComponentStyle != null && (justify = localImageComponentStyle.getJustify()) != null && (base = justify.getBase()) != null && (base2 = base.getBase()) != null && (layoutParams instanceof C16047d)) {
            C16047d c16047d = (C16047d) layoutParams;
            int i10 = AbstractC21283f.f67674a[base2.ordinal()];
            if (i10 == 1) {
                f10 = 0.0f;
            } else if (i10 == 2) {
                f10 = 0.5f;
            } else {
                if (i10 != 3) {
                    throw new C0644w();
                }
                f10 = 1.0f;
            }
            c16047d.f49507E = f10;
        }
        themeableLottieAnimationView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public static final void m21627c(ImageView imageView, UiComponentConfig.RemoteImage component) {
        C17296C c17296c;
        float f10;
        AbstractC16544l.m18094g(imageView, "<this>");
        AbstractC16544l.m18094g(component, "component");
        StyleElements.DPSizeSet margin = component.getMargin();
        if (margin != null) {
            AbstractC22213c.m22403c(imageView, margin);
        }
        AbstractC22213c.m22402b(imageView, component.getWidth());
        AbstractC22213c.m22401a(imageView, component.getHeight());
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        StyleElements.PositionType justification = component.getJustification();
        if (justification != null) {
            if (layoutParams instanceof C16047d) {
                C16047d c16047d = (C16047d) layoutParams;
                int i10 = AbstractC21283f.f67674a[justification.ordinal()];
                if (i10 == 1) {
                    f10 = 0.0f;
                } else if (i10 == 2) {
                    f10 = 0.5f;
                } else {
                    if (i10 != 3) {
                        throw new C0644w();
                    }
                    f10 = 1.0f;
                }
                c16047d.f49507E = f10;
            }
            c17296c = C17296C.f55119a;
        } else {
            c17296c = null;
        }
        if (c17296c == null && (layoutParams instanceof C16047d)) {
            C16047d c16047d2 = (C16047d) layoutParams;
            Context context = imageView.getContext();
            AbstractC16544l.m18093f(context, "getContext(...)");
            c16047d2.f49507E = AbstractC8040Z5.m8406b(context, R.attr.personaCenterAlignRemoteAsset) ? 0.5f : 0.0f;
        }
        imageView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public static final void m21628d(ThemeableLottieAnimationView themeableLottieAnimationView, Integer num, Integer num2, Integer num3, String[] strArr, String[] strArr2, String[] strArr3) {
        AbstractC16544l.m18094g(themeableLottieAnimationView, "<this>");
        if (num != null) {
            int iIntValue = num.intValue();
            for (String str : strArr) {
                themeableLottieAnimationView.m14575i(Color.parseColor(str), iIntValue);
            }
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            for (String str2 : strArr2) {
                themeableLottieAnimationView.m14575i(Color.parseColor(str2), iIntValue2);
            }
        }
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            for (String str3 : strArr3) {
                themeableLottieAnimationView.m14575i(Color.parseColor(str3), iIntValue3);
            }
        }
    }
}
