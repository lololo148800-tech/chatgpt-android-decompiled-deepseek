package cm;

import am.C10752f;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import p544W9.AbstractC8730w;

/* JADX INFO: renamed from: cm.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11783a implements LeadingMarginSpan {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35727Y;

    /* JADX INFO: renamed from: Z */
    public final C10752f f35728Z;

    /* JADX INFO: renamed from: o0 */
    public final Rect f35729o0;

    /* JADX INFO: renamed from: p0 */
    public final Paint f35730p0;

    public C11783a(C10752f c10752f, int i10) {
        this.f35727Y = i10;
        switch (i10) {
            case 1:
                this.f35729o0 = AbstractC11789g.f35748a;
                this.f35730p0 = AbstractC11789g.f35750c;
                this.f35728Z = c10752f;
                break;
            default:
                this.f35729o0 = AbstractC11789g.f35748a;
                this.f35730p0 = AbstractC11789g.f35750c;
                this.f35728Z = c10752f;
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z6, Layout layout) {
        int width;
        switch (this.f35727Y) {
            case 0:
                C10752f c10752f = this.f35728Z;
                int i17 = c10752f.f31950b;
                if (i17 == 0) {
                    i17 = (int) ((c10752f.f31949a * 0.25f) + 0.5f);
                }
                Paint paint2 = this.f35730p0;
                paint2.set(paint);
                c10752f.getClass();
                int iM9461a = AbstractC8730w.m9461a(paint2.getColor(), 25);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(iM9461a);
                int i18 = i11 * i17;
                int i19 = i10 + i18;
                int i20 = i18 + i19;
                int iMin = Math.min(i19, i20);
                int iMax = Math.max(i19, i20);
                Rect rect = this.f35729o0;
                rect.set(iMin, i12, iMax, i14);
                canvas.drawRect(rect, paint2);
                break;
            default:
                int i21 = ((i14 - i12) / 2) + i12;
                Paint paint3 = this.f35730p0;
                paint3.set(paint);
                C10752f c10752f2 = this.f35728Z;
                c10752f2.getClass();
                paint3.setColor(AbstractC8730w.m9461a(paint3.getColor(), 25));
                paint3.setStyle(Paint.Style.FILL);
                int i22 = c10752f2.f31954f;
                if (i22 >= 0) {
                    paint3.setStrokeWidth(i22);
                }
                int strokeWidth = (int) ((((int) (paint3.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
                if (i11 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i10;
                    i10 -= canvas.getWidth();
                }
                int i23 = i21 - strokeWidth;
                int i24 = i21 + strokeWidth;
                Rect rect2 = this.f35729o0;
                rect2.set(i10, i23, width, i24);
                canvas.drawRect(rect2, paint3);
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z6) {
        switch (this.f35727Y) {
            case 0:
                return this.f35728Z.f31949a;
            default:
                return 0;
        }
    }
}
