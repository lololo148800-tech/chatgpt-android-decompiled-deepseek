package p999s;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: renamed from: s.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19357i0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f61310a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f61311b = new int[0];

    static {
        new Rect();
    }

    /* JADX INFO: renamed from: a */
    public static void m20462a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f61310a);
        } else {
            drawable.setState(f61311b);
        }
        drawable.setState(state);
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m20463b(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
