package p441S1;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p349O0.C5944C;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p393Q1.AbstractC6559k;
import p437Rn.C6949g;
import p759g1.C13803e;
import p774h1.AbstractC14337O;

/* JADX INFO: renamed from: S1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6986b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: Y */
    public final AbstractC14337O f22333Y;

    /* JADX INFO: renamed from: Z */
    public final float f22334Z;

    /* JADX INFO: renamed from: o0 */
    public final C6002f0 f22335o0 = C5997d.m6430Q(new C13803e(9205357640488583168L), C5975S.f19448r0);

    /* JADX INFO: renamed from: p0 */
    public final C5944C f22336p0 = C5997d.m6421H(new C6949g(this, 2));

    public C6986b(AbstractC14337O abstractC14337O, float f10) {
        this.f22333Y = abstractC14337O;
        this.f22334Z = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC6559k.m7125b(textPaint, this.f22334Z);
        textPaint.setShader((Shader) this.f22336p0.getValue());
    }
}
