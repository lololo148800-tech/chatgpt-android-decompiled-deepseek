package cm;

import am.C10752f;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import p544W9.AbstractC8730w;

/* JADX INFO: renamed from: cm.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11785c extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: Y */
    public final C10752f f35737Y;

    /* JADX INFO: renamed from: Z */
    public final Rect f35738Z = AbstractC11789g.f35748a;

    /* JADX INFO: renamed from: o0 */
    public final Paint f35739o0 = AbstractC11789g.f35750c;

    public C11785c(C10752f c10752f) {
        this.f35737Y = c10752f;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z6, Layout layout) {
        int width;
        Paint paint2 = this.f35739o0;
        paint2.setStyle(Paint.Style.FILL);
        this.f35737Y.getClass();
        paint2.setColor(AbstractC8730w.m9461a(paint.getColor(), 25));
        if (i11 > 0) {
            width = canvas.getWidth();
        } else {
            i10 -= canvas.getWidth();
            width = i10;
        }
        Rect rect = this.f35738Z;
        rect.set(i10, i12, width, i14);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z6) {
        return this.f35737Y.f31952d;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f35737Y.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f35737Y.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
