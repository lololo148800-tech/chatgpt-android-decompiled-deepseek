package p279L1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: L1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4900a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15962Y;

    /* JADX INFO: renamed from: Z */
    public final float f15963Z;

    public /* synthetic */ C4900a(int i10, float f10) {
        this.f15962Y = i10;
        this.f15963Z = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f15962Y) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f15963Z);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f15963Z);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f15962Y) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f15963Z);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f15963Z);
                break;
        }
    }
}
