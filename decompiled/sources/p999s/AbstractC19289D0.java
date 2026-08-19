package p999s;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: s.D0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19289D0 {
    /* JADX INFO: renamed from: a */
    public static void m20360a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    /* JADX INFO: renamed from: b */
    public static void m20361b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
