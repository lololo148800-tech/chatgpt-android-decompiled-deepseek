package p003A1;

import android.view.MotionEvent;

/* JADX INFO: renamed from: A1.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0249f1 {

    /* JADX INFO: renamed from: a */
    public static final C0249f1 f941a = new C0249f1();

    /* JADX INFO: renamed from: a */
    public final boolean m818a(MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX(i10);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            float rawY = motionEvent.getRawY(i10);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
