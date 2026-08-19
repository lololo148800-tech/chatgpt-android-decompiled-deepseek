package cm;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: cm.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C11786d extends MetricAffectingSpan {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35740Y;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f35740Y) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                break;
            default:
                textPaint.setFakeBoldText(true);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f35740Y) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                break;
            default:
                textPaint.setFakeBoldText(true);
                break;
        }
    }
}
