package p994rk;

import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputMaskedTextComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21293p;
import uk.C20374d;

/* JADX INFO: renamed from: rk.w0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19230w0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InputMaskedTextComponent f60977Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20374d f60978Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19230w0(InputMaskedTextComponent inputMaskedTextComponent, C20374d c20374d) {
        super(0);
        this.f60977Y = inputMaskedTextComponent;
        this.f60978Z = c20374d;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        UiComponentConfig.InputTextBasedComponentStyle styles = this.f60977Y.f40962Y.getStyles();
        if (styles != null) {
            TextInputLayout textInputLayout = (TextInputLayout) this.f60978Z.f64428b;
            AbstractC16544l.m18093f(textInputLayout, "getRoot(...)");
            AbstractC21293p.m21634c(textInputLayout, styles);
        }
        return C17296C.f55119a;
    }
}
