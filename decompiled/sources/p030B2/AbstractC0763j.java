package p030B2;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: B2.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0763j {
    /* JADX INFO: renamed from: a */
    public static Context m1692a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    /* JADX INFO: renamed from: b */
    public static Icon m1693b(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    /* JADX INFO: renamed from: c */
    public static String m1694c(Context context) {
        return context.getAttributionTag();
    }

    /* JADX INFO: renamed from: d */
    public static void m1695d(int i10) {
        SdkExtensions.getExtensionVersion(i10);
    }

    /* JADX INFO: renamed from: e */
    public static CharSequence m1696e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* JADX INFO: renamed from: f */
    public static Insets m1697f(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    /* JADX INFO: renamed from: g */
    public static void m1698g(Window window, boolean z6) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z6);
    }

    /* JADX INFO: renamed from: h */
    public static void m1699h(Window window, boolean z6) {
        window.setDecorFitsSystemWindows(z6);
    }

    /* JADX INFO: renamed from: i */
    public static void m1700i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
