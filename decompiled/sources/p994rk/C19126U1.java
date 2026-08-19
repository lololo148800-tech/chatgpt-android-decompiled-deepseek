package p994rk;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: rk.U1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19126U1 extends PasswordTransformationMethod {

    /* JADX INFO: renamed from: Y */
    public final String f60833Y;

    public C19126U1(String mask) {
        AbstractC16544l.m18094g(mask, "mask");
        this.f60833Y = mask;
    }

    @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        return charSequence == null ? "" : new C19123T1(charSequence, this.f60833Y);
    }
}
