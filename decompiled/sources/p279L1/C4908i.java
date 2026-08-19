package p279L1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: L1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4908i extends ReplacementSpan {

    /* JADX INFO: renamed from: Y */
    public final float f15981Y;

    /* JADX INFO: renamed from: Z */
    public final int f15982Z;

    /* JADX INFO: renamed from: o0 */
    public final float f15983o0;

    /* JADX INFO: renamed from: p0 */
    public final int f15984p0;

    /* JADX INFO: renamed from: q0 */
    public final float f15985q0;

    /* JADX INFO: renamed from: r0 */
    public final int f15986r0;

    /* JADX INFO: renamed from: s0 */
    public Paint.FontMetricsInt f15987s0;

    /* JADX INFO: renamed from: t0 */
    public int f15988t0;

    /* JADX INFO: renamed from: u0 */
    public int f15989u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f15990v0;

    public C4908i(float f10, int i10, float f11, int i11, float f12, int i12) {
        this.f15981Y = f10;
        this.f15982Z = i10;
        this.f15983o0 = f11;
        this.f15984p0 = i11;
        this.f15985q0 = f12;
        this.f15986r0 = i12;
    }

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt m5518a() {
        Paint.FontMetricsInt fontMetricsInt = this.f15987s0;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC16544l.m18103p("fontMetrics");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final int m5519b() {
        if (this.f15990v0) {
            return this.f15989u0;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        double dCeil;
        this.f15990v0 = true;
        float textSize = paint.getTextSize();
        this.f15987s0 = paint.getFontMetricsInt();
        if (m5518a().descent <= m5518a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        float f11 = this.f15985q0;
        float f12 = this.f15981Y;
        int i12 = this.f15982Z;
        if (i12 == 0) {
            f10 = f12 * f11;
        } else {
            if (i12 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f10 = f12 * textSize;
        }
        this.f15988t0 = (int) Math.ceil(f10);
        float f13 = this.f15983o0;
        int i13 = this.f15984p0;
        if (i13 == 0) {
            dCeil = Math.ceil(f13 * f11);
        } else {
            if (i13 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            dCeil = Math.ceil(f13 * textSize);
        }
        this.f15989u0 = (int) dCeil;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m5518a().ascent;
            fontMetricsInt.descent = m5518a().descent;
            fontMetricsInt.leading = m5518a().leading;
            switch (this.f15986r0) {
                case 0:
                    if (fontMetricsInt.ascent > (-m5519b())) {
                        fontMetricsInt.ascent = -m5519b();
                    }
                    break;
                case 1:
                case 4:
                    if (m5519b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = m5519b() + fontMetricsInt.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - m5519b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - m5519b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < m5519b()) {
                        int iM5519b = fontMetricsInt.ascent - ((m5519b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iM5519b;
                        fontMetricsInt.descent = m5519b() + iM5519b;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fontMetricsInt.top = Math.min(m5518a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m5518a().bottom, fontMetricsInt.descent);
        }
        if (this.f15990v0) {
            return this.f15988t0;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }
}
