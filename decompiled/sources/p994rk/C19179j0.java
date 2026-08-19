package p994rk;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21285h;
import p1110xk.AbstractC21293p;
import p1110xk.AbstractC21295r;
import p1157zk.AbstractC22213c;
import uk.C20375e;

/* JADX INFO: renamed from: rk.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19179j0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ UiComponentConfig.InputDateComponentStyle f60896Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20375e f60897Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19179j0(UiComponentConfig.InputDateComponentStyle inputDateComponentStyle, C20375e c20375e) {
        super(0);
        this.f60896Y = inputDateComponentStyle;
        this.f60897Z = c20375e;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        UiComponentConfig.InputTextBasedComponentStyle inputTextStyle;
        UiComponentConfig.InputTextBasedComponentStyle inputTextStyle2;
        UiComponentConfig.InputSelectComponentStyle inputSelectStyle;
        UiComponentConfig.InputSelectComponentStyle inputSelectStyle2;
        TextBasedComponentStyle errorTextStyle;
        UiComponentConfig.InputSelectComponentStyle inputSelectStyle3;
        TextBasedComponentStyle labelStyle;
        AttributeStyles.InputMarginStyle margin;
        StyleElements.DPMeasurementSet base;
        StyleElements.DPSizeSet base2;
        C20375e c20375e = this.f60897Z;
        UiComponentConfig.InputDateComponentStyle inputDateComponentStyle = this.f60896Y;
        if (inputDateComponentStyle != null && (margin = inputDateComponentStyle.getMargin()) != null && (base = margin.getBase()) != null && (base2 = base.getBase()) != null) {
            ConstraintLayout constraintLayout = c20375e.f64429a;
            AbstractC16544l.m18093f(constraintLayout, "getRoot(...)");
            AbstractC22213c.m22403c(constraintLayout, base2);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle3 = inputDateComponentStyle.getInputSelectStyle()) != null && (labelStyle = inputSelectStyle3.getLabelStyle()) != null) {
            TextView dateLabel = c20375e.f64430b;
            AbstractC16544l.m18093f(dateLabel, "dateLabel");
            AbstractC21295r.m21637c(dateLabel, labelStyle);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle2 = inputDateComponentStyle.getInputSelectStyle()) != null && (errorTextStyle = inputSelectStyle2.getErrorTextStyle()) != null) {
            TextView errorLabel = c20375e.f64432d;
            AbstractC16544l.m18093f(errorLabel, "errorLabel");
            AbstractC21295r.m21637c(errorLabel, errorTextStyle);
        }
        if (inputDateComponentStyle != null && (inputSelectStyle = inputDateComponentStyle.getInputSelectStyle()) != null) {
            TextInputLayout month = c20375e.f64433e;
            AbstractC16544l.m18093f(month, "month");
            AbstractC21285h.m21629a(month, inputSelectStyle);
        }
        if (inputDateComponentStyle != null && (inputTextStyle2 = inputDateComponentStyle.getInputTextStyle()) != null) {
            TextInputLayout day = c20375e.f64431c;
            AbstractC16544l.m18093f(day, "day");
            AbstractC21293p.m21634c(day, inputTextStyle2);
        }
        if (inputDateComponentStyle != null && (inputTextStyle = inputDateComponentStyle.getInputTextStyle()) != null) {
            TextInputLayout year = c20375e.f64434f;
            AbstractC16544l.m18093f(year, "year");
            AbstractC21293p.m21634c(year, inputTextStyle);
        }
        return C17296C.f55119a;
    }
}
