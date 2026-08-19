package p994rk;

import android.content.res.ColorStateList;
import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputRadioGroupComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21295r;
import p979r2.AbstractC18861b;
import uk.C20372b;

/* JADX INFO: renamed from: rk.I0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19090I0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InputRadioGroupComponent f60775Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20372b f60776Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19090I0(InputRadioGroupComponent inputRadioGroupComponent, C20372b c20372b) {
        super(0);
        this.f60775Y = inputRadioGroupComponent;
        this.f60776Z = c20372b;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        TextBasedComponentStyle descriptionTextStyle;
        TextBasedComponentStyle textBasedStyle;
        InputRadioGroupComponent inputRadioGroupComponent = this.f60775Y;
        UiComponentConfig.InputRadioGroup.InputRadioGroupComponentStyle styles = inputRadioGroupComponent.f40974Y.getStyles();
        C20372b c20372b = this.f60776Z;
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView radioButtonLabel = c20372b.f64412d;
            AbstractC16544l.m18093f(radioButtonLabel, "radioButtonLabel");
            AbstractC21295r.m21637c(radioButtonLabel, textBasedStyle);
        }
        UiComponentConfig.InputRadioGroup.InputRadioGroupComponentStyle styles2 = inputRadioGroupComponent.f40974Y.getStyles();
        if (styles2 != null && (descriptionTextStyle = styles2.getDescriptionTextStyle()) != null) {
            TextView radioButtonDescription = c20372b.f64411c;
            AbstractC16544l.m18093f(radioButtonDescription, "radioButtonDescription");
            AbstractC21295r.m21637c(radioButtonDescription, descriptionTextStyle);
        }
        c20372b.f64410b.setButtonTintList(ColorStateList.valueOf(AbstractC18861b.m20169g(c20372b.f64412d.getCurrentTextColor(), 150)));
        return C17296C.f55119a;
    }
}
