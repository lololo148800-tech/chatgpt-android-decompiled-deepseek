package p279L1;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: L1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C4911l extends MetricAffectingSpan {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15997Y;

    /* JADX INFO: renamed from: Z */
    public final Typeface f15998Z;

    public /* synthetic */ C4911l(Typeface typeface, int i10) {
        this.f15997Y = i10;
        this.f15998Z = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f15997Y) {
            case 0:
                textPaint.setTypeface(this.f15998Z);
                break;
            default:
                AbstractC16544l.m18094g(textPaint, "textPaint");
                textPaint.setTypeface(this.f15998Z);
                textPaint.setFlags(textPaint.getFlags() | 128);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint paint) {
        switch (this.f15997Y) {
            case 0:
                paint.setTypeface(this.f15998Z);
                break;
            default:
                AbstractC16544l.m18094g(paint, "paint");
                paint.setTypeface(this.f15998Z);
                paint.setFlags(paint.getFlags() | 128);
                break;
        }
    }
}
