package p230J1;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import cn.UfGr.EhBykzn;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: J1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C4198y extends Canvas {

    /* JADX INFO: renamed from: a */
    public Canvas f13634a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        C4180g c4180g = C4180g.f13592a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return c4180g.m4831a(canvas, path);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        C4180g c4180g = C4180g.f13592a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return c4180g.m4835e(canvas, rectF);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op2) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.clipPath(path, op2);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op2) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op2);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        C4182i c4182i = C4182i.f13593a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            c4182i.m4866a(canvas);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawARGB(i10, i11, i12, i13);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f10, float f11, boolean z6, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawArc(rectF, f10, f11, z6, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f10, f11, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawCircle(f10, f11, f12, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawColor(i10);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        C4182i c4182i = C4182i.f13593a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            c4182i.m4870e(canvas, rectF, f10, f11, rectF2, f12, f13, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        C4184k c4184k = C4184k.f13595a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            c4184k.m4878a(canvas, iArr, i10, fArr, i11, i12, font, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawLine(f10, f11, f12, f13, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawLines(fArr, i10, i11, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        C4184k c4184k = C4184k.f13595a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            c4184k.m4879b(canvas, ninePatch, rect, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f10, float f11, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawPoint(f10, f11, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i10, i11, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i10, i11, fArr, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i10, int i11, int i12) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawRGB(i10, i11, i12);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        C4182i c4182i = C4182i.f13593a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            c4182i.m4872g(canvas, renderNode);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f10, f11, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawText(cArr, i10, i11, f10, f11, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f10, float f11, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i10, i11, path, f10, f11, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z6, Paint paint) {
        C4178e c4178e = C4178e.f13591a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            c4178e.m4800b(canvas, cArr, i10, i11, i12, i13, f10, f11, z6, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        C4182i c4182i = C4182i.f13593a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            c4182i.m4874i(canvas);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f13634a;
        if (canvas == null) {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.restore();
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i10) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.restoreToCount(i10);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f10) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.rotate(f10);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.save();
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i10) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i10);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10, int i11) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i10, i11);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f10, float f11) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.scale(f10, f11);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i10) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.setDensity(i10);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f10, float f11) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.skew(f10, f11);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f10, float f11) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.translate(f10, f11);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        C4180g c4180g = C4180g.f13592a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return c4180g.m4834d(canvas, rect);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op2) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.clipRect(rect, op2);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z6, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawArc(f10, f11, f12, f13, f14, f15, z6, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j10) {
        C4182i c4182i = C4182i.f13593a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            c4182i.m4868c(canvas, j10);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawOval(f10, f11, f12, f13, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        C4184k c4184k = C4184k.f13595a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            c4184k.m4880c(canvas, ninePatch, rectF, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f10, float f11, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawText(str, f10, f11, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f10, f11, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        C4183j c4183j = C4183j.f13594a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return c4183j.m4877c(canvas, rectF);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i10);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f10, float f11, float f12, float f13) {
        C4180g c4180g = C4180g.f13592a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return c4180g.m4832b(canvas, f10, f11, f12, f13);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, PorterDuff.Mode mode) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawColor(i10, mode);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawRect(f10, f11, f12, f13, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawText(str, i10, i11, f10, f11, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        AbstractC16544l.m18103p(EhBykzn.EOseKvoJtCsF);
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i10) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.saveLayer(f10, f11, f12, f13, paint, i10);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10, int i11) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f10, f11, f12, f13, i10, i11);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i10, int i11, int i12, int i13) {
        C4180g c4180g = C4180g.f13592a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return c4180g.m4833c(canvas, i10, i11, i12, i13);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, float f10, float f11, int i12, int i13, boolean z6, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i10, i11, f10, f11, i12, i13, z6, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, BlendMode blendMode) {
        C4182i c4182i = C4182i.f13593a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            c4182i.m4867b(canvas, i10, blendMode);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawText(charSequence, i10, i11, f10, f11, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        C4183j c4183j = C4183j.f13594a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return c4183j.m4876b(canvas, path);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.saveLayer(f10, f11, f12, f13, paint);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op2) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.clipRect(f10, f11, f12, f13, op2);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z6, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z6, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j10, BlendMode blendMode) {
        C4182i c4182i = C4182i.f13593a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            c4182i.m4869d(canvas, j10, blendMode);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        C4182i c4182i = C4182i.f13593a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            c4182i.m4871f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z6, Paint paint) {
        C4178e c4178e = C4178e.f13591a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            c4178e.m4799a(canvas, charSequence, i10, i11, i12, i13, f10, f11, z6, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.quickReject(f10, f11, f12, f13, edgeType);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.clipRect(f10, f11, f12, f13);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f10, float f11, float f12, float f13) {
        C4183j c4183j = C4183j.f13594a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return c4183j.m4875a(canvas, f10, f11, f12, f13);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            return canvas.clipRect(i10, i11, i12, i13);
        }
        AbstractC16544l.m18103p("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z6, Paint paint) {
        C4182i c4182i = C4182i.f13593a;
        Canvas canvas = this.f13634a;
        if (canvas != null) {
            c4182i.m4873h(canvas, measuredText, i10, i11, i12, i13, f10, f11, z6, paint);
        } else {
            AbstractC16544l.m18103p("nativeCanvas");
            throw null;
        }
    }
}
