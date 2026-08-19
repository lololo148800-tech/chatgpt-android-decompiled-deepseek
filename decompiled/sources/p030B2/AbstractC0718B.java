package p030B2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* JADX INFO: renamed from: B2.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0718B {
    /* JADX INFO: renamed from: a */
    public static Context m1490a(Context context, int i10) {
        return context.createDeviceContext(i10);
    }

    /* JADX INFO: renamed from: b */
    public static AccessibilityNodeInfo.AccessibilityAction m1491b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* JADX INFO: renamed from: c */
    public static float m1492c(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getAxisVelocity(i10);
    }

    /* JADX INFO: renamed from: d */
    public static void m1493d(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    /* JADX INFO: renamed from: e */
    public static CharSequence m1494e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* JADX INFO: renamed from: f */
    public static int m1495f(Context context) {
        return context.getDeviceId();
    }

    /* JADX INFO: renamed from: g */
    public static int m1496g(Context context) {
        return context.getDeviceId();
    }

    /* JADX INFO: renamed from: h */
    public static int m1497h(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i10, i11, i12);
    }

    /* JADX INFO: renamed from: i */
    public static int m1498i(ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i10, i11, i12);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1499j(Bitmap bitmap) {
        return bitmap.hasGainmap();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1500k(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    /* JADX INFO: renamed from: l */
    public static void m1501l(TextView textView, int i10, float f10) {
        textView.setLineHeight(i10, f10);
    }
}
