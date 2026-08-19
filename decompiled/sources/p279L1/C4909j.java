package p279L1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: L1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C4909j extends CharacterStyle {

    /* JADX INFO: renamed from: a */
    public final int f15991a;

    /* JADX INFO: renamed from: b */
    public final float f15992b;

    /* JADX INFO: renamed from: c */
    public final float f15993c;

    /* JADX INFO: renamed from: d */
    public final float f15994d;

    public C4909j(float f10, float f11, float f12, int i10) {
        this.f15991a = i10;
        this.f15992b = f10;
        this.f15993c = f11;
        this.f15994d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f15994d, this.f15992b, this.f15993c, this.f15991a);
    }
}
