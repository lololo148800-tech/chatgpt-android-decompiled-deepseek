package p468T2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p283L5.AbstractC4941g;
import p493U2.C7551a;
import p658b5.C11238i;

/* JADX INFO: renamed from: T2.w */
/* JADX INFO: loaded from: classes.dex */
public final class C7231w extends ReplacementSpan {

    /* JADX INFO: renamed from: Z */
    public final C7230v f22937Z;

    /* JADX INFO: renamed from: q0 */
    public TextPaint f22940q0;

    /* JADX INFO: renamed from: Y */
    public final Paint.FontMetricsInt f22936Y = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: o0 */
    public short f22938o0 = -1;

    /* JADX INFO: renamed from: p0 */
    public float f22939p0 = 1.0f;

    public C7231w(C7230v c7230v) {
        AbstractC4941g.m5558Q(c7230v, "rasterizer cannot be null");
        this.f22937Z = c7230v;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f22940q0;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f22940q0 = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint2 instanceof TextPaint) {
                    textPaint = (TextPaint) paint2;
                }
            } else if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f10, i12, f10 + this.f22938o0, i14, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        C7218j.m7609a().getClass();
        float f11 = i13;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        C7230v c7230v = this.f22937Z;
        C11238i c11238i = c7230v.f22934b;
        Typeface typeface = (Typeface) c11238i.f34011p0;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c11238i.f34009Z, c7230v.f22933a * 2, 2, f10, f11, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f22936Y;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C7230v c7230v = this.f22937Z;
        C7551a c7551aM7633c = c7230v.m7633c();
        int iM1537a = c7551aM7633c.m1537a(14);
        this.f22939p0 = fAbs / (iM1537a != 0 ? ((ByteBuffer) c7551aM7633c.f2088p0).getShort(iM1537a + c7551aM7633c.f2085Y) : (short) 0);
        C7551a c7551aM7633c2 = c7230v.m7633c();
        int iM1537a2 = c7551aM7633c2.m1537a(14);
        if (iM1537a2 != 0) {
            ((ByteBuffer) c7551aM7633c2.f2088p0).getShort(iM1537a2 + c7551aM7633c2.f2085Y);
        }
        C7551a c7551aM7633c3 = c7230v.m7633c();
        int iM1537a3 = c7551aM7633c3.m1537a(12);
        short s10 = (short) ((iM1537a3 != 0 ? ((ByteBuffer) c7551aM7633c3.f2088p0).getShort(iM1537a3 + c7551aM7633c3.f2085Y) : (short) 0) * this.f22939p0);
        this.f22938o0 = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
