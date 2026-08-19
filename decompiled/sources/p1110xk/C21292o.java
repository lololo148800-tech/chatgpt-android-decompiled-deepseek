package p1110xk;

import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: xk.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C21292o extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ TextInputLayout f67694Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f67695Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f67696o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f67697p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21292o(TextInputLayout textInputLayout, int i10, int i11, int i12) {
        super(1);
        this.f67694Y = textInputLayout;
        this.f67695Z = i10;
        this.f67696o0 = i11;
        this.f67697p0 = i12;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        TextInputLayout textInputLayout = this.f67694Y;
        CharSequence error = textInputLayout.getError();
        if (error == null || !AbstractC21322p.m21716z(error)) {
            AbstractC21293p.m21632a(textInputLayout, zBooleanValue, this.f67695Z, this.f67696o0, this.f67697p0);
        }
        return C17296C.f55119a;
    }
}
