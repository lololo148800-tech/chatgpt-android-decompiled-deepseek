package p994rk;

import android.text.StaticLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCheckboxComponent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1110xk.AbstractC21295r;
import p1120y4.C21382i;
import p822j2.C16047d;
import uk.C20376f;

/* JADX INFO: renamed from: rk.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C19127V extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InputCheckboxComponent f60834Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C20376f f60835Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19127V(InputCheckboxComponent inputCheckboxComponent, C20376f c20376f) {
        super(0);
        this.f60834Y = inputCheckboxComponent;
        this.f60835Z = c20376f;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        int width;
        TextBasedComponentStyle errorTextStyle;
        TextBasedComponentStyle descriptionTextStyle;
        TextBasedComponentStyle textBasedStyle;
        InputCheckboxComponent inputCheckboxComponent = this.f60834Y;
        UiComponentConfig.InputCheckbox.InputCheckboxComponentStyle styles = inputCheckboxComponent.f40941Y.getStyles();
        C20376f c20376f = this.f60835Z;
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView checkboxLabel = c20376f.f64439e;
            AbstractC16544l.m18093f(checkboxLabel, "checkboxLabel");
            AbstractC21295r.m21637c(checkboxLabel, textBasedStyle);
        }
        UiComponentConfig.InputCheckbox inputCheckbox = inputCheckboxComponent.f40941Y;
        UiComponentConfig.InputCheckbox.InputCheckboxComponentStyle styles2 = inputCheckbox.getStyles();
        if (styles2 != null && (descriptionTextStyle = styles2.getDescriptionTextStyle()) != null) {
            TextView checkboxDescription = c20376f.f64437c;
            AbstractC16544l.m18093f(checkboxDescription, "checkboxDescription");
            AbstractC21295r.m21637c(checkboxDescription, descriptionTextStyle);
        }
        UiComponentConfig.InputCheckbox.InputCheckboxComponentStyle styles3 = inputCheckbox.getStyles();
        if (styles3 != null && (errorTextStyle = styles3.getErrorTextStyle()) != null) {
            TextView checkboxError = c20376f.f64438d;
            AbstractC16544l.m18093f(checkboxError, "checkboxError");
            AbstractC21295r.m21637c(checkboxError, errorTextStyle);
        }
        TextView checkboxLabel2 = c20376f.f64439e;
        AbstractC16544l.m18093f(checkboxLabel2, "checkboxLabel");
        ViewGroup.LayoutParams layoutParams = checkboxLabel2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C16047d c16047d = (C16047d) layoutParams;
        TextView checkboxLabel3 = c20376f.f64439e;
        AbstractC16544l.m18093f(checkboxLabel3, "checkboxLabel");
        CharSequence text = checkboxLabel3.getText();
        int lineCount = 0;
        if (text != null && (width = checkboxLabel3.getWidth()) != 0) {
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(text, 0, text.length(), checkboxLabel3.getPaint(), width).build();
            AbstractC16544l.m18093f(staticLayoutBuild, "build(...)");
            lineCount = staticLayoutBuild.getLineCount();
        }
        if (lineCount != 0) {
            if (lineCount != 1) {
                c16047d.f49545i = R.id.checkbox;
                c16047d.f49551l = -1;
                ((ViewGroup.MarginLayoutParams) c16047d).topMargin = (int) C21382i.m21761a(4.0d);
            } else {
                c16047d.f49545i = R.id.checkbox;
                c16047d.f49551l = R.id.checkbox;
                ((ViewGroup.MarginLayoutParams) c16047d).topMargin = (int) C21382i.m21761a(0.0d);
            }
        }
        checkboxLabel2.setLayoutParams(c16047d);
        return C17296C.f55119a;
    }
}
