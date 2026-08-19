package p279L1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: L1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4904e extends MetricAffectingSpan {

    /* JADX INFO: renamed from: Y */
    public final float f15967Y;

    public C4904e(float f10) {
        this.f15967Y = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f15967Y);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f15967Y);
    }
}
