package p030B2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.openai.chatgpt.R;

/* JADX INFO: renamed from: B2.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0730K {
    /* JADX INFO: renamed from: a */
    public static void m1544a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0794y0 m1545b(View view, C0794y0 c0794y0, Rect rect) {
        WindowInsets windowInsetsM1817f = c0794y0.m1817f();
        if (windowInsetsM1817f != null) {
            return C0794y0.m1812g(view, view.computeSystemWindowInsets(windowInsetsM1817f, rect));
        }
        rect.setEmpty();
        return c0794y0;
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m1546c(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m1547d(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: e */
    public static float m1548e(View view) {
        return view.getElevation();
    }

    /* JADX INFO: renamed from: f */
    public static String m1549f(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: renamed from: g */
    public static float m1550g(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1551h(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: i */
    public static void m1552i(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: renamed from: j */
    public static void m1553j(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: renamed from: k */
    public static void m1554k(View view, float f10) {
        view.setElevation(f10);
    }

    /* JADX INFO: renamed from: l */
    public static void m1555l(View view, InterfaceC0783t interfaceC0783t) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0783t);
        }
        if (interfaceC0783t == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0729J(view, interfaceC0783t));
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m1556m(View view) {
        view.stopNestedScroll();
    }
}
