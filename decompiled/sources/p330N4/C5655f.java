package p330N4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p038Ba.C0857g;
import p451Sb.C7102a;
import p544W9.AbstractC8621d4;

/* JADX INFO: renamed from: N4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5655f extends AbstractC5673x {

    /* JADX INFO: renamed from: J0 */
    public static final String[] f18369J0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: K0 */
    public static final C0857g f18370K0;

    /* JADX INFO: renamed from: L0 */
    public static final C0857g f18371L0;

    /* JADX INFO: renamed from: M0 */
    public static final C0857g f18372M0;

    /* JADX INFO: renamed from: N0 */
    public static final C0857g f18373N0;

    /* JADX INFO: renamed from: O0 */
    public static final C0857g f18374O0;

    static {
        new C5651b(PointF.class, "boundsOrigin").f18359b = new Rect();
        f18370K0 = new C0857g(PointF.class, "topLeft", 3);
        f18371L0 = new C0857g(PointF.class, "bottomRight", 4);
        f18372M0 = new C0857g(PointF.class, "bottomRight", 5);
        f18373N0 = new C0857g(PointF.class, "topLeft", 6);
        f18374O0 = new C0857g(PointF.class, "position", 7);
    }

    /* JADX INFO: renamed from: I */
    public static void m6086I(C5640F c5640f) {
        View view = c5640f.f18321b;
        WeakHashMap weakHashMap = AbstractC0738T.f2096a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = c5640f.f18320a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", c5640f.f18321b.getParent());
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: c */
    public final void mo6056c(C5640F c5640f) {
        m6086I(c5640f);
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: f */
    public final void mo6058f(C5640F c5640f) {
        m6086I(c5640f);
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: j */
    public final Animator mo6083j(ViewGroup viewGroup, C5640F c5640f, C5640F c5640f2) {
        int i10;
        C5655f c5655f;
        Animator animatorOfObject;
        if (c5640f == null || c5640f2 == null) {
            return null;
        }
        HashMap map = c5640f.f18320a;
        HashMap map2 = c5640f2.f18320a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i11 = rect.left;
        int i12 = rect2.left;
        int i13 = rect.top;
        int i14 = rect2.top;
        int i15 = rect.right;
        int i16 = rect2.right;
        int i17 = rect.bottom;
        int i18 = rect2.bottom;
        int i19 = i15 - i11;
        int i20 = i17 - i13;
        int i21 = i16 - i12;
        int i22 = i18 - i14;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
            i10 = 0;
        } else {
            i10 = (i11 == i12 && i13 == i14) ? 0 : 1;
            if (i15 != i16 || i17 != i18) {
                i10++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i10++;
        }
        if (i10 <= 0) {
            return null;
        }
        View view = c5640f2.f18321b;
        AbstractC5642H.m6071a(view, i11, i13, i15, i17);
        if (i10 != 2) {
            c5655f = this;
            if (i11 == i12 && i13 == i14) {
                c5655f.f18413F0.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, f18372M0, (TypeConverter) null, C7102a.m7513v(i15, i17, i16, i18));
            } else {
                c5655f.f18413F0.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, f18373N0, (TypeConverter) null, C7102a.m7513v(i11, i13, i12, i14));
            }
        } else if (i19 == i21 && i20 == i22) {
            c5655f = this;
            c5655f.f18413F0.getClass();
            animatorOfObject = ObjectAnimator.ofObject(view, f18374O0, (TypeConverter) null, C7102a.m7513v(i11, i13, i12, i14));
        } else {
            c5655f = this;
            C5654e c5654e = new C5654e();
            c5654e.f18366e = view;
            c5655f.f18413F0.getClass();
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(c5654e, f18370K0, (TypeConverter) null, C7102a.m7513v(i11, i13, i12, i14));
            c5655f.f18413F0.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(c5654e, f18371L0, (TypeConverter) null, C7102a.m7513v(i15, i17, i16, i18));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new C5652c(c5654e));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC8621d4.m9271b(viewGroup4, true);
            c5655f.m6098a(new C5653d(viewGroup4));
        }
        return animatorOfObject;
    }

    @Override // p330N4.AbstractC5673x
    /* JADX INFO: renamed from: q */
    public final String[] mo6084q() {
        return f18369J0;
    }
}
