package p255K1;

import android.text.TextPaint;
import p544W9.AbstractC8524N2;

/* JADX INFO: renamed from: K1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4529c extends AbstractC8524N2 {

    /* JADX INFO: renamed from: Z */
    public final CharSequence f14806Z;

    /* JADX INFO: renamed from: o0 */
    public final TextPaint f14807o0;

    public C4529c(CharSequence charSequence, TextPaint textPaint) {
        this.f14806Z = charSequence;
        this.f14807o0 = textPaint;
    }

    @Override // p544W9.AbstractC8524N2
    /* JADX INFO: renamed from: c */
    public final int mo5269c(int i10) {
        CharSequence charSequence = this.f14806Z;
        return this.f14807o0.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    @Override // p544W9.AbstractC8524N2
    /* JADX INFO: renamed from: e */
    public final int mo5270e(int i10) {
        CharSequence charSequence = this.f14806Z;
        return this.f14807o0.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }
}
