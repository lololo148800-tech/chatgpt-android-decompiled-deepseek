package p038Ba;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: renamed from: Ba.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0866p extends AbstractC0863m {

    /* JADX INFO: renamed from: x0 */
    public C0855e f2434x0;

    /* JADX INFO: renamed from: y0 */
    public C0858h f2435y0;

    @Override // p038Ba.AbstractC0863m
    /* JADX INFO: renamed from: d */
    public final boolean mo1922d(boolean z6, boolean z10, boolean z11) {
        ObjectAnimator objectAnimator;
        boolean zMo1922d = super.mo1922d(z6, z10, z11);
        if (!isRunning() && (objectAnimator = this.f2435y0.f2393d) != null) {
            objectAnimator.cancel();
        }
        C0851a c0851a = this.f2421o0;
        ContentResolver contentResolver = this.f2419Y.getContentResolver();
        c0851a.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z6 && z11) {
            this.f2435y0.m1921s();
        }
        return zMo1922d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.f2434x0.m1927a(canvas, getBounds(), m1924b());
        C0855e c0855e = this.f2434x0;
        Paint paint = this.f2427u0;
        c0855e.m1919d(canvas, paint);
        int i10 = 0;
        while (true) {
            C0858h c0858h = this.f2435y0;
            int[] iArr = (int[]) c0858h.f2433c;
            if (i10 >= iArr.length) {
                canvas.restore();
                return;
            }
            C0855e c0855e2 = this.f2434x0;
            float[] fArr = (float[]) c0858h.f2432b;
            int i11 = i10 * 2;
            c0855e2.m1918c(canvas, paint, fArr[i11], fArr[i11 + 1], iArr[i10]);
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f2434x0.m1920e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f2434x0.m1920e();
    }
}
