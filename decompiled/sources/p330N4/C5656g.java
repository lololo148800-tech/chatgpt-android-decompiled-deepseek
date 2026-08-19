package p330N4;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p239Ja.C4308k;

/* JADX INFO: renamed from: N4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5656g extends AbstractC5673x {

    /* JADX INFO: renamed from: J0 */
    public static final String[] f18375J0 = {"android:clipBounds:clip"};

    /* JADX INFO: renamed from: I */
    public static void m6087I(C5640F c5640f) {
        View view = c5640f.f18321b;
        if (view.getVisibility() == 8) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        Rect clipBounds = view.getClipBounds();
        HashMap map = c5640f.f18320a;
        map.put("android:clipBounds:clip", clipBounds);
        if (clipBounds == null) {
            map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: c */
    public final void mo6056c(C5640F c5640f) {
        m6087I(c5640f);
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: f */
    public final void mo6058f(C5640F c5640f) {
        m6087I(c5640f);
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: j */
    public final Animator mo6083j(ViewGroup viewGroup, C5640F c5640f, C5640F c5640f2) {
        if (c5640f != null && c5640f2 != null) {
            HashMap map = c5640f.f18320a;
            if (map.containsKey("android:clipBounds:clip")) {
                HashMap map2 = c5640f2.f18320a;
                if (map2.containsKey("android:clipBounds:clip")) {
                    Rect rect = (Rect) map.get("android:clipBounds:clip");
                    Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
                    boolean z6 = rect2 == null;
                    if (rect == null && rect2 == null) {
                        return null;
                    }
                    if (rect == null) {
                        rect = (Rect) map.get("android:clipBounds:bounds");
                    } else if (rect2 == null) {
                        rect2 = (Rect) map2.get("android:clipBounds:bounds");
                    }
                    if (rect.equals(rect2)) {
                        return null;
                    }
                    WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                    View view = c5640f2.f18321b;
                    view.setClipBounds(rect);
                    Rect rect3 = new Rect();
                    C5664o c5664o = new C5664o(0);
                    c5664o.f18384b = rect3;
                    ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, AbstractC5642H.f18334c, c5664o, rect, rect2);
                    if (z6) {
                        objectAnimatorOfObject.addListener(new C4308k(view, 2));
                    }
                    return objectAnimatorOfObject;
                }
            }
        }
        return null;
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: q */
    public final String[] mo6084q() {
        return f18375J0;
    }
}
