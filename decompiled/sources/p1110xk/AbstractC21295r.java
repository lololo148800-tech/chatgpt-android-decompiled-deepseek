package p1110xk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextViewStyle;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p030B2.AbstractC0773o;
import p108E2.InterfaceC2243b;
import p1120y4.C21382i;
import p1157zk.AbstractC22213c;
import p523V9.AbstractC8138m0;

/* JADX INFO: renamed from: xk.r */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21295r {
    /* JADX INFO: renamed from: a */
    public static final void m21635a(TextView textView, StyleElements.FontWeight fontWeight) {
        int i10;
        AbstractC16544l.m18094g(textView, "<this>");
        int i11 = AbstractC21294q.f67698a[fontWeight.ordinal()];
        if (i11 == 1) {
            i10 = RCHTTPStatusCodes.UNSUCCESSFUL;
        } else if (i11 == 2) {
            i10 = RCHTTPStatusCodes.BAD_REQUEST;
        } else if (i11 == 3) {
            i10 = 500;
        } else if (i11 == 4) {
            i10 = 700;
        } else {
            if (i11 != 5) {
                throw new C0644w();
            }
            i10 = 800;
        }
        Typeface typefaceCreate = Typeface.create(textView.getTypeface(), i10, false);
        AbstractC16544l.m18093f(typefaceCreate, "create(...)");
        textView.setTypeface(typefaceCreate);
    }

    /* JADX INFO: renamed from: b */
    public static final void m21636b(TextView textView, String str) {
        AbstractC16544l.m18094g(textView, "<this>");
        Context context = textView.getContext();
        AbstractC16544l.m18093f(context, "getContext(...)");
        Typeface typefaceM8672g = AbstractC8138m0.m8672g(context, str);
        if (typefaceM8672g != null) {
            textView.setTypeface(typefaceM8672g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final void m21637c(TextView textView, TextViewStyle styles) {
        int autoSizeTextType;
        int autoSizeMinTextSize;
        AbstractC16544l.m18094g(textView, "<this>");
        AbstractC16544l.m18094g(styles, "styles");
        StyleElements.DPSizeSet marginValue = styles.getMarginValue();
        if (marginValue != null) {
            AbstractC22213c.m22403c(textView, marginValue);
        }
        Integer textColorValue = styles.getTextColorValue();
        if (textColorValue != null) {
            textView.setTextColor(textColorValue.intValue());
        }
        Integer textColorHighlightValue = styles.getTextColorHighlightValue();
        if (textColorHighlightValue != null) {
            textView.setLinkTextColor(textColorHighlightValue.intValue());
        }
        Double fontSizeValue = styles.getFontSizeValue();
        int i10 = 1;
        if (fontSizeValue != null) {
            double dDoubleValue = fontSizeValue.doubleValue();
            textView.setTextSize((float) dDoubleValue);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 27) {
                autoSizeTextType = AbstractC0773o.m1720d(textView);
            } else {
                autoSizeTextType = textView instanceof InterfaceC2243b ? ((InterfaceC2243b) textView).getAutoSizeTextType() : 0;
            }
            if (autoSizeTextType == 1) {
                int autoSizeStepGranularity = -1;
                if (i11 >= 27) {
                    autoSizeMinTextSize = AbstractC0773o.m1718b(textView);
                } else {
                    autoSizeMinTextSize = textView instanceof InterfaceC2243b ? ((InterfaceC2243b) textView).getAutoSizeMinTextSize() : -1;
                }
                if (i11 >= 27) {
                    autoSizeStepGranularity = AbstractC0773o.m1719c(textView);
                } else if (textView instanceof InterfaceC2243b) {
                    autoSizeStepGranularity = ((InterfaceC2243b) textView).getAutoSizeStepGranularity();
                }
                int i12 = (int) (((double) Resources.getSystem().getDisplayMetrics().scaledDensity) * dDoubleValue);
                if (autoSizeMinTextSize <= 0) {
                    autoSizeMinTextSize = (int) (12.0d * ((double) Resources.getSystem().getDisplayMetrics().scaledDensity));
                }
                if (autoSizeStepGranularity <= 0) {
                    autoSizeStepGranularity = 1;
                }
                if (autoSizeMinTextSize > i12) {
                    autoSizeMinTextSize = i12;
                }
                if (i11 >= 27) {
                    AbstractC0773o.m1724h(textView, autoSizeMinTextSize, i12, autoSizeStepGranularity);
                } else if (textView instanceof InterfaceC2243b) {
                    ((InterfaceC2243b) textView).setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, i12, autoSizeStepGranularity, 0);
                }
            }
            Double lineHeightValue = styles.getLineHeightValue();
            if (lineHeightValue != null) {
                double dDoubleValue2 = lineHeightValue.doubleValue();
                if (i11 >= 28) {
                    textView.setLineSpacing((float) (C21382i.m21761a(dDoubleValue2) - C21382i.m21761a(dDoubleValue)), 1.0f);
                }
            }
        }
        Double letterSpacingValue = styles.getLetterSpacingValue();
        if (letterSpacingValue != null) {
            textView.setLetterSpacing((float) (letterSpacingValue.doubleValue() / ((double) textView.getTextSize())));
        }
        String fontNameValue = styles.getFontNameValue();
        if (fontNameValue != null) {
            m21636b(textView, fontNameValue);
        }
        StyleElements.FontWeight fontWeightValue = styles.getFontWeightValue();
        if (fontWeightValue != null && Build.VERSION.SDK_INT >= 29) {
            m21635a(textView, fontWeightValue);
        }
        StyleElements.PositionType justificationValue = styles.getJustificationValue();
        if (justificationValue != null) {
            int gravity = textView.getGravity() & 112;
            int i13 = AbstractC21294q.f67699b[justificationValue.ordinal()];
            if (i13 == 1) {
                i10 = 8388611;
            } else if (i13 != 2) {
                if (i13 != 3) {
                    throw new C0644w();
                }
                i10 = 8388613;
            }
            textView.setGravity(i10);
            textView.setGravity((textView.getGravity() & (-113)) | gravity);
        }
    }
}
