package p038Ba;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p523V9.AbstractC8070d4;

/* JADX INFO: renamed from: Ba.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0855e extends AbstractC0864n {

    /* JADX INFO: renamed from: c */
    public int f2381c;

    /* JADX INFO: renamed from: d */
    public float f2382d;

    /* JADX INFO: renamed from: e */
    public float f2383e;

    /* JADX INFO: renamed from: f */
    public float f2384f;

    public C0855e(C0859i c0859i) {
        this.f2429a = c0859i;
        this.f2381c = 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m1917b(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        canvas.save();
        canvas.rotate(f12);
        float f13 = this.f2384f;
        float f14 = f10 / 2.0f;
        canvas.drawRoundRect(new RectF(f13 - f14, f11, f13 + f14, -f11), f11, f11, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: c */
    public final void m1918c(Canvas canvas, Paint paint, float f10, float f11, int i10) {
        if (f10 == f11) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f2382d);
        float f12 = this.f2381c;
        float f13 = f10 * 360.0f * f12;
        float f14 = (f11 >= f10 ? f11 - f10 : (1.0f + f11) - f10) * 360.0f * f12;
        float f15 = this.f2384f;
        float f16 = -f15;
        canvas.drawArc(new RectF(f16, f16, f15, f15), f13, f14, false, paint);
        if (this.f2383e <= 0.0f || Math.abs(f14) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        m1917b(canvas, paint, this.f2382d, this.f2383e, f13);
        m1917b(canvas, paint, this.f2382d, this.f2383e, f13 + f14);
    }

    /* JADX INFO: renamed from: d */
    public final void m1919d(Canvas canvas, Paint paint) {
        int iM8476c = AbstractC8070d4.m8476c(this.f2429a.f2404d, this.f2430b.f2428v0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iM8476c);
        paint.setStrokeWidth(this.f2382d);
        float f10 = this.f2384f;
        canvas.drawArc(new RectF(-f10, -f10, f10, f10), 0.0f, 360.0f, false, paint);
    }

    /* JADX INFO: renamed from: e */
    public final int m1920e() {
        C0859i c0859i = this.f2429a;
        return (c0859i.f2408h * 2) + c0859i.f2407g;
    }
}
