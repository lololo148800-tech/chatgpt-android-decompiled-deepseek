package cm;

import am.C10752f;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: cm.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C11784b implements LeadingMarginSpan {

    /* JADX INFO: renamed from: r0 */
    public static final boolean f35731r0;

    /* JADX INFO: renamed from: Y */
    public final C10752f f35732Y;

    /* JADX INFO: renamed from: Z */
    public final Paint f35733Z = AbstractC11789g.f35750c;

    /* JADX INFO: renamed from: o0 */
    public final RectF f35734o0 = AbstractC11789g.f35749b;

    /* JADX INFO: renamed from: p0 */
    public final Rect f35735p0 = AbstractC11789g.f35748a;

    /* JADX INFO: renamed from: q0 */
    public final int f35736q0;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f35731r0 = 24 == i10 || 25 == i10;
    }

    public C11784b(C10752f c10752f, int i10) {
        this.f35732Y = c10752f;
        this.f35736q0 = i10;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z6, Layout layout) {
        int iMin;
        int iMax;
        Rect rect = this.f35735p0;
        if (z6 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i15) {
            Paint paint2 = this.f35733Z;
            paint2.set(paint);
            C10752f c10752f = this.f35732Y;
            c10752f.getClass();
            int i17 = c10752f.f31949a;
            paint2.setColor(paint2.getColor());
            int i18 = c10752f.f31951c;
            if (i18 != 0) {
                paint2.setStrokeWidth(i18);
            }
            int iSave = canvas.save();
            try {
                int iMin2 = Math.min(i17, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                int i19 = (i17 - iMin2) / 2;
                boolean z10 = f35731r0;
                int i20 = this.f35736q0;
                if (z10) {
                    int width = i11 < 0 ? i10 - (layout.getWidth() - (i17 * i20)) : (i17 * i20) - i10;
                    int i21 = (i19 * i11) + i10;
                    int i22 = (i11 * iMin2) + i21;
                    int i23 = i11 * width;
                    iMin = Math.min(i21, i22) + i23;
                    iMax = Math.max(i21, i22) + i23;
                } else {
                    if (i11 <= 0) {
                        i10 -= i17;
                    }
                    iMin = i10 + i19;
                    iMax = iMin + iMin2;
                }
                int iDescent = (i13 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (iMin2 / 2);
                int i24 = iMin2 + iDescent;
                if (i20 == 0 || i20 == 1) {
                    RectF rectF = this.f35734o0;
                    rectF.set(iMin, iDescent, iMax, i24);
                    paint2.setStyle(i20 == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(iMin, iDescent, iMax, i24);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z6) {
        return this.f35732Y.f31949a;
    }
}
