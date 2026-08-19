package cm;

import am.C10752f;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: cm.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C11790h implements LeadingMarginSpan {

    /* JADX INFO: renamed from: Y */
    public final C10752f f35751Y;

    /* JADX INFO: renamed from: Z */
    public final String f35752Z;

    /* JADX INFO: renamed from: o0 */
    public final Paint f35753o0 = AbstractC11789g.f35750c;

    /* JADX INFO: renamed from: p0 */
    public int f35754p0;

    public C11790h(C10752f c10752f, String str) {
        this.f35751Y = c10752f;
        this.f35752Z = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z6, Layout layout) {
        int i17;
        if (z6 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i15) {
            Paint paint2 = this.f35753o0;
            paint2.set(paint);
            C10752f c10752f = this.f35751Y;
            c10752f.getClass();
            paint2.setColor(paint2.getColor());
            int i18 = c10752f.f31951c;
            if (i18 != 0) {
                paint2.setStrokeWidth(i18);
            }
            String str = this.f35752Z;
            int iMeasureText = (int) (paint2.measureText(str) + 0.5f);
            int i19 = c10752f.f31949a;
            if (iMeasureText > i19) {
                this.f35754p0 = iMeasureText;
                i19 = iMeasureText;
            } else {
                this.f35754p0 = 0;
            }
            if (i11 > 0) {
                i17 = ((i19 * i11) + i10) - iMeasureText;
            } else {
                i17 = (i19 - iMeasureText) + (i11 * i19) + i10;
            }
            canvas.drawText(str, i17, i13, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z6) {
        return Math.max(this.f35754p0, this.f35751Y.f31949a);
    }
}
