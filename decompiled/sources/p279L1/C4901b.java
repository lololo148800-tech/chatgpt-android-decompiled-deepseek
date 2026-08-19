package p279L1;

import am.C10752f;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import p544W9.AbstractC8730w;

/* JADX INFO: renamed from: L1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4901b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15964Y;

    /* JADX INFO: renamed from: Z */
    public final Object f15965Z;

    public /* synthetic */ C4901b(Object obj, int i10) {
        this.f15964Y = i10;
        this.f15965Z = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f15964Y) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f15965Z);
                break;
            default:
                C10752f c10752f = (C10752f) this.f15965Z;
                c10752f.getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                c10752f.getClass();
                textPaint.bgColor = AbstractC8730w.m9461a(textPaint.getColor(), 25);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f15964Y) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f15965Z);
                break;
            default:
                ((C10752f) this.f15965Z).getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                break;
        }
    }
}
