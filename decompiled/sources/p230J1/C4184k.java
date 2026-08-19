package p230J1;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;

/* JADX INFO: renamed from: J1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C4184k {

    /* JADX INFO: renamed from: a */
    public static final C4184k f13595a = new C4184k();

    /* JADX INFO: renamed from: a */
    public final void m4878a(Canvas canvas, int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i10, fArr, i11, i12, font, paint);
    }

    /* JADX INFO: renamed from: b */
    public final void m4879b(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    /* JADX INFO: renamed from: c */
    public final void m4880c(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
