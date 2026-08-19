package p030B2;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* JADX INFO: renamed from: B2.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0773o {
    /* JADX INFO: renamed from: a */
    public static Icon m1717a(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    /* JADX INFO: renamed from: b */
    public static int m1718b(TextView textView) {
        return textView.getAutoSizeMinTextSize();
    }

    /* JADX INFO: renamed from: c */
    public static int m1719c(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: d */
    public static int m1720d(TextView textView) {
        return textView.getAutoSizeTextType();
    }

    /* JADX INFO: renamed from: e */
    public static float m1721e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    /* JADX INFO: renamed from: f */
    public static float m1722f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    /* JADX INFO: renamed from: g */
    public static void m1723g(MenuItem menuItem, char c9, int i10) {
        menuItem.setAlphabeticShortcut(c9, i10);
    }

    /* JADX INFO: renamed from: h */
    public static void m1724h(TextView textView, int i10, int i11, int i12) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, 0);
    }

    /* JADX INFO: renamed from: i */
    public static void m1725i(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: j */
    public static void m1726j(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    /* JADX INFO: renamed from: k */
    public static void m1727k(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    /* JADX INFO: renamed from: l */
    public static void m1728l(MenuItem menuItem, char c9, int i10) {
        menuItem.setNumericShortcut(c9, i10);
    }

    /* JADX INFO: renamed from: m */
    public static void m1729m(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
