package p994rk;

import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCheckboxGroupComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21295r;
import uk.C20377g;

/* JADX INFO: renamed from: rk.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C19139Z extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InputCheckboxGroupComponent f60841Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20377g f60842Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19139Z(InputCheckboxGroupComponent inputCheckboxGroupComponent, C20377g c20377g) {
        super(0);
        this.f60841Y = inputCheckboxGroupComponent;
        this.f60842Z = c20377g;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        TextBasedComponentStyle textBasedStyle;
        UiComponentConfig.InputCheckbox.InputCheckboxComponentStyle styles = this.f60841Y.f40945Y.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView checkboxGroupLabel = this.f60842Z.f64443d;
            AbstractC16544l.m18093f(checkboxGroupLabel, "checkboxGroupLabel");
            AbstractC21295r.m21637c(checkboxGroupLabel, textBasedStyle);
        }
        return C17296C.f55119a;
    }
}
