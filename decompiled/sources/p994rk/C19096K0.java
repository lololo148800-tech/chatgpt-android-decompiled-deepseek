package p994rk;

import android.widget.LinearLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputRadioGroupComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1157zk.AbstractC22213c;
import uk.C20379i;

/* JADX INFO: renamed from: rk.K0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19096K0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InputRadioGroupComponent f60784Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20379i f60785Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19096K0(InputRadioGroupComponent inputRadioGroupComponent, C20379i c20379i) {
        super(0);
        this.f60784Y = inputRadioGroupComponent;
        this.f60785Z = c20379i;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        StyleElements.DPSizeSet margins;
        UiComponentConfig.InputRadioGroup.InputRadioGroupComponentStyle styles = this.f60784Y.f40974Y.getStyles();
        if (styles != null && (margins = styles.getMargins()) != null) {
            LinearLayout linearLayout = this.f60785Z.f64447a;
            AbstractC16544l.m18093f(linearLayout, "getRoot(...)");
            AbstractC22213c.m22403c(linearLayout, margins);
        }
        return C17296C.f55119a;
    }
}
