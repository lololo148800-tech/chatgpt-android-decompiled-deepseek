package p994rk;

import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputTextAreaComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21293p;
import uk.C20378h;

/* JADX INFO: renamed from: rk.Q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19114Q0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InputTextAreaComponent f60818Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20378h f60819Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19114Q0(InputTextAreaComponent inputTextAreaComponent, C20378h c20378h) {
        super(0);
        this.f60818Y = inputTextAreaComponent;
        this.f60819Z = c20378h;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        UiComponentConfig.InputTextBasedComponentStyle styles = this.f60818Y.f40978Y.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = this.f60819Z.f64446c;
            AbstractC16544l.m18093f(inputLayout, "inputLayout");
            AbstractC21293p.m21634c(inputLayout, styles);
        }
        return C17296C.f55119a;
    }
}
