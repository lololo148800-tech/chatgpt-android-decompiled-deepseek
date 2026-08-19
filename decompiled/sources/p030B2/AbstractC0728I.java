package p030B2;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: B2.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0728I {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m1541a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: b */
    public static WindowInsets m1542b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: c */
    public static void m1543c(View view) {
        view.requestApplyInsets();
    }
}
