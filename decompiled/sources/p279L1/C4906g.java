package p279L1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: L1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C4906g implements LineHeightSpan {

    /* JADX INFO: renamed from: Y */
    public final float f15969Y;

    public C4906g(float f10) {
        this.f15969Y = f10;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i14 <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f15969Y);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / i14)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
