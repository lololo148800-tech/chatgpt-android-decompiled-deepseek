package p140Fa;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p116Ea.C2362a;

/* JADX INFO: renamed from: Fa.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2695o extends AbstractC2699s {

    /* JADX INFO: renamed from: c */
    public final C2697q f8290c;

    /* JADX INFO: renamed from: d */
    public final float f8291d;

    /* JADX INFO: renamed from: e */
    public final float f8292e;

    public C2695o(C2697q c2697q, float f10, float f11) {
        this.f8290c = c2697q;
        this.f8291d = f10;
        this.f8292e = f11;
    }

    @Override // p140Fa.AbstractC2699s
    /* JADX INFO: renamed from: a */
    public final void mo3695a(Matrix matrix, C2362a c2362a, int i10, Canvas canvas) {
        C2697q c2697q = this.f8290c;
        float f10 = c2697q.f8301c;
        float f11 = this.f8292e;
        float f12 = c2697q.f8300b;
        float f13 = this.f8291d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
        Matrix matrix2 = this.f8304a;
        matrix2.set(matrix);
        matrix2.preTranslate(f13, f11);
        matrix2.preRotate(m3696b());
        c2362a.getClass();
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = C2362a.f7320i;
        iArr[0] = c2362a.f7329f;
        iArr[1] = c2362a.f7328e;
        iArr[2] = c2362a.f7327d;
        Paint paint = c2362a.f7326c;
        float f14 = rectF.left;
        paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, C2362a.f7321j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public final float m3696b() {
        C2697q c2697q = this.f8290c;
        return (float) Math.toDegrees(Math.atan((c2697q.f8301c - this.f8292e) / (c2697q.f8300b - this.f8291d)));
    }
}
