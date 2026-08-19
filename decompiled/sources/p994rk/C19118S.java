package p994rk;

import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputAddressComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21293p;
import p1110xk.AbstractC21295r;
import uk.C20373c;

/* JADX INFO: renamed from: rk.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C19118S extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InputAddressComponent f60825Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20373c f60826Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19118S(InputAddressComponent inputAddressComponent, C20373c c20373c) {
        super(0);
        this.f60825Y = inputAddressComponent;
        this.f60826Z = c20373c;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        UiComponentConfig.InputTextBasedComponentStyle inputTextStyle;
        TextBasedComponentStyle expandComponentsButtonStyle;
        InputAddressComponent inputAddressComponent = this.f60825Y;
        UiComponentConfig.AddressComponentStyle styles = inputAddressComponent.f40927Y.getStyles();
        C20373c c20373c = this.f60826Z;
        if (styles != null && (expandComponentsButtonStyle = styles.getExpandComponentsButtonStyle()) != null) {
            TextView addressExpandComponentsButton = c20373c.f64415c;
            AbstractC16544l.m18093f(addressExpandComponentsButton, "addressExpandComponentsButton");
            AbstractC21295r.m21637c(addressExpandComponentsButton, expandComponentsButtonStyle);
        }
        UiComponentConfig.AddressComponentStyle styles2 = inputAddressComponent.f40927Y.getStyles();
        if (styles2 != null && (inputTextStyle = styles2.getInputTextStyle()) != null) {
            TextView addressLabel = c20373c.f64422j;
            AbstractC16544l.m18093f(addressLabel, "addressLabel");
            AbstractC21295r.m21637c(addressLabel, inputTextStyle.getLabelTextBasedStyle());
            TextInputLayout addressFieldCollapsed = c20373c.f64416d;
            AbstractC16544l.m18093f(addressFieldCollapsed, "addressFieldCollapsed");
            AbstractC21293p.m21634c(addressFieldCollapsed, inputTextStyle);
            TextInputLayout addressFieldExpanded = c20373c.f64418f;
            AbstractC16544l.m18093f(addressFieldExpanded, "addressFieldExpanded");
            AbstractC21293p.m21634c(addressFieldExpanded, inputTextStyle);
            TextInputLayout addressSuite = c20373c.f64425m;
            AbstractC16544l.m18093f(addressSuite, "addressSuite");
            AbstractC21293p.m21634c(addressSuite, inputTextStyle);
            TextInputLayout addressCity = c20373c.f64414b;
            AbstractC16544l.m18093f(addressCity, "addressCity");
            AbstractC21293p.m21634c(addressCity, inputTextStyle);
            TextInputLayout addressSubdivision = c20373c.f64424l;
            AbstractC16544l.m18093f(addressSubdivision, "addressSubdivision");
            AbstractC21293p.m21634c(addressSubdivision, inputTextStyle);
            TextInputLayout addressPostalCode = c20373c.f64423k;
            AbstractC16544l.m18093f(addressPostalCode, "addressPostalCode");
            AbstractC21293p.m21634c(addressPostalCode, inputTextStyle);
        }
        return C17296C.f55119a;
    }
}
