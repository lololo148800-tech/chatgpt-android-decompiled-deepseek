package p279L1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: L1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C4907h implements LineHeightSpan {

    /* JADX INFO: renamed from: Y */
    public final float f15970Y;

    /* JADX INFO: renamed from: Z */
    public final int f15971Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f15972o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f15973p0;

    /* JADX INFO: renamed from: q0 */
    public final float f15974q0;

    /* JADX INFO: renamed from: r0 */
    public int f15975r0 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: s0 */
    public int f15976s0 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: t0 */
    public int f15977t0 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: u0 */
    public int f15978u0 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: v0 */
    public int f15979v0;

    /* JADX INFO: renamed from: w0 */
    public int f15980w0;

    public C4907h(float f10, int i10, boolean z6, boolean z10, float f11) {
        this.f15970Y = f10;
        this.f15971Z = i10;
        this.f15972o0 = z6;
        this.f15973p0 = z10;
        this.f15974q0 = f11;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent;
        int i15 = fontMetricsInt.ascent;
        if (i14 - i15 <= 0) {
            return;
        }
        boolean z6 = i10 == 0;
        boolean z10 = i11 == this.f15971Z;
        boolean z11 = this.f15973p0;
        boolean z12 = this.f15972o0;
        if (z6 && z10 && z12 && z11) {
            return;
        }
        if (this.f15975r0 == Integer.MIN_VALUE) {
            int i16 = i14 - i15;
            int iCeil = (int) Math.ceil(this.f15970Y);
            int i17 = iCeil - i16;
            float fAbs = this.f15974q0;
            if (fAbs == -1.0f) {
                fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int iCeil2 = (int) (i17 <= 0 ? Math.ceil(i17 * fAbs) : Math.ceil((1.0f - fAbs) * i17));
            int i18 = fontMetricsInt.descent;
            int i19 = iCeil2 + i18;
            this.f15977t0 = i19;
            int i20 = i19 - iCeil;
            this.f15976s0 = i20;
            if (z12) {
                i20 = fontMetricsInt.ascent;
            }
            this.f15975r0 = i20;
            if (z11) {
                i19 = i18;
            }
            this.f15978u0 = i19;
            this.f15979v0 = fontMetricsInt.ascent - i20;
            this.f15980w0 = i19 - i18;
        }
        fontMetricsInt.ascent = z6 ? this.f15975r0 : this.f15976s0;
        fontMetricsInt.descent = z10 ? this.f15978u0 : this.f15977t0;
    }
}
