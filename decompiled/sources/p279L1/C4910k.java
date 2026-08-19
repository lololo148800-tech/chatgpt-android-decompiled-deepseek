package p279L1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: L1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C4910k extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final boolean f15995a;

    /* JADX INFO: renamed from: b */
    public final boolean f15996b;

    public C4910k(boolean z6, boolean z10) {
        this.f15995a = z6;
        this.f15996b = z10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f15995a);
        textPaint.setStrikeThruText(this.f15996b);
    }
}
