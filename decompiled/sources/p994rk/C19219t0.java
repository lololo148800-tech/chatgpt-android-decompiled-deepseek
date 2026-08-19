package p994rk;

import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21285h;
import p1110xk.AbstractC21293p;
import p1110xk.AbstractC21295r;
import uk.C20380j;

/* JADX INFO: renamed from: rk.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19219t0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C19207q0 f60967Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20380j f60968Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19219t0(C19207q0 c19207q0, C20380j c20380j) {
        super(0);
        this.f60967Y = c19207q0;
        this.f60968Z = c20380j;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        UiComponentConfig.InputInternationalDbComponentStyle styles = this.f60967Y.f60934Y.getStyles();
        if (styles != null) {
            UiComponentConfig.InputSelectComponentStyle inputSelectStyle = styles.getInputSelectStyle();
            C20380j c20380j = this.f60968Z;
            if (inputSelectStyle != null) {
                TextInputLayout idbCountryInput = c20380j.f64452b;
                AbstractC16544l.m18093f(idbCountryInput, "idbCountryInput");
                AbstractC21285h.m21629a(idbCountryInput, inputSelectStyle);
                TextInputLayout idbIdTypeInput = c20380j.f64454d;
                AbstractC16544l.m18093f(idbIdTypeInput, "idbIdTypeInput");
                AbstractC21285h.m21629a(idbIdTypeInput, inputSelectStyle);
            }
            UiComponentConfig.InputTextBasedComponentStyle inputTextStyle = styles.getInputTextStyle();
            if (inputTextStyle != null) {
                TextInputLayout idbValueInput = c20380j.f64455e;
                AbstractC16544l.m18093f(idbValueInput, "idbValueInput");
                AbstractC21293p.m21634c(idbValueInput, inputTextStyle);
            }
            TextBasedComponentStyle textStyle = styles.getTextStyle();
            if (textStyle != null) {
                TextView idbDescription = c20380j.f64453c;
                AbstractC16544l.m18093f(idbDescription, "idbDescription");
                AbstractC21295r.m21637c(idbDescription, textStyle);
            }
        }
        return C17296C.f55119a;
    }
}
