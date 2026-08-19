package p994rk;

import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputRadioGroupComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21295r;
import uk.C20379i;

/* JADX INFO: renamed from: rk.J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19093J0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InputRadioGroupComponent f60777Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20379i f60778Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19093J0(InputRadioGroupComponent inputRadioGroupComponent, C20379i c20379i) {
        super(0);
        this.f60777Y = inputRadioGroupComponent;
        this.f60778Z = c20379i;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        TextBasedComponentStyle textBasedStyle;
        UiComponentConfig.InputRadioGroup.InputRadioGroupComponentStyle styles = this.f60777Y.f40974Y.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView radioGroupLabel = this.f60778Z.f64450d;
            AbstractC16544l.m18093f(radioGroupLabel, "radioGroupLabel");
            AbstractC21295r.m21637c(radioGroupLabel, textBasedStyle);
        }
        return C17296C.f55119a;
    }
}
