package p230J1;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* JADX INFO: renamed from: J1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4182i {

    /* JADX INFO: renamed from: a */
    public static final C4182i f13593a = new C4182i();

    /* JADX INFO: renamed from: a */
    public final void m4866a(Canvas canvas) {
        canvas.disableZ();
    }

    /* JADX INFO: renamed from: b */
    public final void m4867b(Canvas canvas, int i10, BlendMode blendMode) {
        canvas.drawColor(i10, blendMode);
    }

    /* JADX INFO: renamed from: c */
    public final void m4868c(Canvas canvas, long j10) {
        canvas.drawColor(j10);
    }

    /* JADX INFO: renamed from: d */
    public final void m4869d(Canvas canvas, long j10, BlendMode blendMode) {
        canvas.drawColor(j10, blendMode);
    }

    /* JADX INFO: renamed from: e */
    public final void m4870e(Canvas canvas, RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
    }

    /* JADX INFO: renamed from: f */
    public final void m4871f(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    /* JADX INFO: renamed from: g */
    public final void m4872g(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    /* JADX INFO: renamed from: h */
    public final void m4873h(Canvas canvas, MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z6, Paint paint) {
        canvas.drawTextRun(measuredText, i10, i11, i12, i13, f10, f11, z6, paint);
    }

    /* JADX INFO: renamed from: i */
    public final void m4874i(Canvas canvas) {
        canvas.enableZ();
    }
}
