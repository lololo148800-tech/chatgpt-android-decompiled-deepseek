package p038Ba;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: renamed from: Ba.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0864n {

    /* JADX INFO: renamed from: a */
    public C0859i f2429a;

    /* JADX INFO: renamed from: b */
    public AbstractC0863m f2430b;

    /* JADX INFO: renamed from: a */
    public final void m1927a(Canvas canvas, Rect rect, float f10) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        this.f2429a.getClass();
        C0855e c0855e = (C0855e) this;
        float fWidth = rect.width() / c0855e.m1920e();
        float fHeight = rect.height() / c0855e.m1920e();
        C0859i c0859i = c0855e.f2429a;
        float f11 = (c0859i.f2407g / 2.0f) + c0859i.f2408h;
        canvas.translate((f11 * fWidth) + rect.left, (f11 * fHeight) + rect.top);
        canvas.scale(fWidth, fHeight);
        canvas.rotate(-90.0f);
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        c0855e.f2381c = c0859i.f2409i == 0 ? 1 : -1;
        int i10 = c0859i.f2401a;
        c0855e.f2382d = i10 * f10;
        c0855e.f2383e = c0859i.f2402b * f10;
        c0855e.f2384f = (c0859i.f2407g - i10) / 2.0f;
        ObjectAnimator objectAnimator3 = c0855e.f2430b.f2422p0;
        if (((objectAnimator3 != null && objectAnimator3.isRunning()) && c0859i.f2405e == 2) || ((objectAnimator = c0855e.f2430b.f2423q0) != null && objectAnimator.isRunning() && c0859i.f2406f == 1)) {
            c0855e.f2384f = (((1.0f - f10) * c0859i.f2401a) / 2.0f) + c0855e.f2384f;
            return;
        }
        ObjectAnimator objectAnimator4 = c0855e.f2430b.f2422p0;
        if ((objectAnimator4 != null && objectAnimator4.isRunning() && c0859i.f2405e == 1) || ((objectAnimator2 = c0855e.f2430b.f2423q0) != null && objectAnimator2.isRunning() && c0859i.f2406f == 2)) {
            c0855e.f2384f -= ((1.0f - f10) * c0859i.f2401a) / 2.0f;
        }
    }
}
