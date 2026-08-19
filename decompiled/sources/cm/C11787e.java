package cm;

import am.C10752f;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import java.util.Arrays;
import java.util.Locale;
import p544W9.AbstractC8730w;

/* JADX INFO: renamed from: cm.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C11787e extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: Y */
    public final C10752f f35741Y;

    /* JADX INFO: renamed from: Z */
    public final Rect f35742Z = AbstractC11789g.f35748a;

    /* JADX INFO: renamed from: o0 */
    public final Paint f35743o0 = AbstractC11789g.f35750c;

    /* JADX INFO: renamed from: p0 */
    public final int f35744p0;

    public C11787e(C10752f c10752f, int i10) {
        this.f35741Y = c10752f;
        this.f35744p0 = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m13058a(TextPaint textPaint) {
        this.f35741Y.getClass();
        textPaint.setFakeBoldText(true);
        float[] fArr = C10752f.f31948g;
        int i10 = this.f35744p0;
        if (6 >= i10) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i10 - 1]);
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalStateException("Supplied heading level: " + i10 + " is invalid, where configured heading sizes are: `" + Arrays.toString(fArr) + "`");
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z6, Layout layout) {
        int width;
        int i17 = this.f35744p0;
        if ((i17 == 1 || i17 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i16) {
            Paint paint2 = this.f35743o0;
            paint2.set(paint);
            C10752f c10752f = this.f35741Y;
            c10752f.getClass();
            paint2.setColor(AbstractC8730w.m9461a(paint2.getColor(), 75));
            paint2.setStyle(Paint.Style.FILL);
            int i18 = c10752f.f31953e;
            if (i18 >= 0) {
                paint2.setStrokeWidth(i18);
            }
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i19 = (int) ((i14 - strokeWidth) + 0.5f);
                if (i11 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i10;
                    i10 -= canvas.getWidth();
                }
                Rect rect = this.f35742Z;
                rect.set(i10, i19, width, i14);
                canvas.drawRect(rect, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z6) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        m13058a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        m13058a(textPaint);
    }
}
