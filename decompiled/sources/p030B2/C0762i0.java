package p030B2;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.openai.chatgpt.R;
import java.util.List;
import p658b5.C11248s;
import p897n3.C17474a;

/* JADX INFO: renamed from: B2.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0762i0 extends AbstractC0768l0 {

    /* JADX INFO: renamed from: e */
    public static final PathInterpolator f2153e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final C17474a f2154f = new C17474a(0);

    /* JADX INFO: renamed from: g */
    public static final DecelerateInterpolator f2155g = new DecelerateInterpolator();

    /* JADX INFO: renamed from: e */
    public static void m1686e(View view, C0770m0 c0770m0) {
        AbstractC0754e0 abstractC0754e0M1691j = m1691j(view);
        if (abstractC0754e0M1691j != null) {
            abstractC0754e0M1691j.mo1615d(c0770m0);
            if (abstractC0754e0M1691j.f2130Y == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                m1686e(viewGroup.getChildAt(i10), c0770m0);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1687f(View view, C0770m0 c0770m0, WindowInsets windowInsets, boolean z6) {
        AbstractC0754e0 abstractC0754e0M1691j = m1691j(view);
        if (abstractC0754e0M1691j != null) {
            abstractC0754e0M1691j.f2131Z = windowInsets;
            if (!z6) {
                abstractC0754e0M1691j.mo1616e();
                z6 = abstractC0754e0M1691j.f2130Y == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                m1687f(viewGroup.getChildAt(i10), c0770m0, windowInsets, z6);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1688g(View view, C0794y0 c0794y0, List list) {
        AbstractC0754e0 abstractC0754e0M1691j = m1691j(view);
        if (abstractC0754e0M1691j != null) {
            c0794y0 = abstractC0754e0M1691j.mo1617f(c0794y0, list);
            if (abstractC0754e0M1691j.f2130Y == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                m1688g(viewGroup.getChildAt(i10), c0794y0, list);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m1689h(View view, C0770m0 c0770m0, C11248s c11248s) {
        AbstractC0754e0 abstractC0754e0M1691j = m1691j(view);
        if (abstractC0754e0M1691j != null) {
            abstractC0754e0M1691j.mo1618g(c11248s);
            if (abstractC0754e0M1691j.f2130Y == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                m1689h(viewGroup.getChildAt(i10), c0770m0, c11248s);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static WindowInsets m1690i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC0754e0 m1691j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0760h0) {
            return ((ViewOnApplyWindowInsetsListenerC0760h0) tag).f2151a;
        }
        return null;
    }
}
