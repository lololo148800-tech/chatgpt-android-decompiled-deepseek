package p994rk;

import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputNumberComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21293p;
import p271Kj.C4706a;

/* JADX INFO: renamed from: rk.C0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19072C0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InputNumberComponent f60748Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4706a f60749Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19072C0(InputNumberComponent inputNumberComponent, C4706a c4706a) {
        super(0);
        this.f60748Y = inputNumberComponent;
        this.f60749Z = c4706a;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        UiComponentConfig.InputTextBasedComponentStyle styles = this.f60748Y.f40966Y.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = (TextInputLayout) this.f60749Z.f15302d;
            AbstractC16544l.m18093f(inputLayout, "inputLayout");
            AbstractC21293p.m21634c(inputLayout, styles);
        }
        return C17296C.f55119a;
    }
}
