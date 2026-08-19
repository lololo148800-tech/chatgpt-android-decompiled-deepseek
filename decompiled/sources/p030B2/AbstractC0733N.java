package p030B2;

import android.view.View;

/* JADX INFO: renamed from: B2.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0733N {
    /* JADX INFO: renamed from: a */
    public static CharSequence m1561a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1562b(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1563c(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: d */
    public static void m1564d(View view, boolean z6) {
        view.setAccessibilityHeading(z6);
    }

    /* JADX INFO: renamed from: e */
    public static void m1565e(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public static void m1566f(View view, boolean z6) {
        view.setScreenReaderFocusable(z6);
    }
}
