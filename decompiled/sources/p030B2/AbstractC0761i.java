package p030B2;

import android.content.pm.PackageInfo;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import p178H.RunnableC3167r;
import p999s.C19329Y;

/* JADX INFO: renamed from: B2.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0761i {
    /* JADX INFO: renamed from: a */
    public static Handler m1669a(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* JADX INFO: renamed from: b */
    public static Handler m1670b(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* JADX INFO: renamed from: c */
    public static String[] m1671c(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* JADX INFO: renamed from: d */
    public static long m1672d(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    /* JADX INFO: renamed from: e */
    public static int m1673e(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* JADX INFO: renamed from: f */
    public static String m1674f(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    /* JADX INFO: renamed from: g */
    public static int m1675g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: h */
    public static int m1676h(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: i */
    public static int m1677i(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: j */
    public static int m1678j(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* JADX INFO: renamed from: k */
    public static int m1679k(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    /* JADX INFO: renamed from: l */
    public static PrecomputedText.Params m1680l(C19329Y c19329y) {
        return c19329y.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: m */
    public static int m1681m(Object obj) {
        return ((Icon) obj).getType();
    }

    /* JADX INFO: renamed from: n */
    public static Uri m1682n(Object obj) {
        return ((Icon) obj).getUri();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m1683o(Handler handler, RunnableC3167r runnableC3167r, long j10) {
        return handler.postDelayed(runnableC3167r, "retry_token", j10);
    }

    /* JADX INFO: renamed from: p */
    public static void m1684p(TextView textView, int i10) {
        textView.setFirstBaselineToTopHeight(i10);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m1685q(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
