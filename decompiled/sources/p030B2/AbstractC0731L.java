package p030B2;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: B2.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0731L {
    /* JADX INFO: renamed from: a */
    public static C0794y0 m1557a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0794y0 c0794y0M1812g = C0794y0.m1812g(null, rootWindowInsets);
        C0790w0 c0790w0 = c0794y0M1812g.f2209a;
        c0790w0.mo1761r(c0794y0M1812g);
        c0790w0.mo1753d(view.getRootView());
        return c0794y0M1812g;
    }

    /* JADX INFO: renamed from: b */
    public static void m1558b(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
