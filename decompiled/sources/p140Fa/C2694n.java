package p140Fa;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p116Ea.C2362a;

/* JADX INFO: renamed from: Fa.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2694n extends AbstractC2699s {

    /* JADX INFO: renamed from: c */
    public final C2696p f8289c;

    public C2694n(C2696p c2696p) {
        this.f8289c = c2696p;
    }

    @Override // p140Fa.AbstractC2699s
    /* JADX INFO: renamed from: a */
    public final void mo3695a(Matrix matrix, C2362a c2362a, int i10, Canvas canvas) {
        C2696p c2696p = this.f8289c;
        float f10 = c2696p.f8298f;
        float f11 = c2696p.f8299g;
        RectF rectF = new RectF(c2696p.f8294b, c2696p.f8295c, c2696p.f8296d, c2696p.f8297e);
        c2362a.getClass();
        boolean z6 = f11 < 0.0f;
        Path path = c2362a.f7330g;
        int[] iArr = C2362a.f7322k;
        if (z6) {
            iArr[0] = 0;
            iArr[1] = c2362a.f7329f;
            iArr[2] = c2362a.f7328e;
            iArr[3] = c2362a.f7327d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = c2362a.f7327d;
            iArr[2] = c2362a.f7328e;
            iArr[3] = c2362a.f7329f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / fWidth);
        float[] fArr = C2362a.f7323l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = c2362a.f7325b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z6) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c2362a.f7331h);
        }
        canvas.drawArc(rectF, f10, f11, true, paint);
        canvas.restore();
    }
}
