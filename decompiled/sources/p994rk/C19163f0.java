package p994rk;

import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCurrencyComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21293p;
import p271Kj.C4706a;

/* JADX INFO: renamed from: rk.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19163f0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InputCurrencyComponent f60875Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4706a f60876Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19163f0(InputCurrencyComponent inputCurrencyComponent, C4706a c4706a) {
        super(0);
        this.f60875Y = inputCurrencyComponent;
        this.f60876Z = c4706a;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        UiComponentConfig.InputTextBasedComponentStyle styles = this.f60875Y.f40954Y.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = (TextInputLayout) this.f60876Z.f15302d;
            AbstractC16544l.m18093f(inputLayout, "inputLayout");
            AbstractC21293p.m21634c(inputLayout, styles);
        }
        return C17296C.f55119a;
    }
}
