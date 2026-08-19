package p994rk;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputTextComponent;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p174Gk.uSfJ.HpucjswO;
import p310M9.C5311e;
import p544W9.AbstractC8700r;
import p571X9.AbstractC9123E2;
import p594Y9.AbstractC9716D4;
import p658b5.C11232c;
import uk.C20378h;

/* JADX INFO: renamed from: rk.V0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19128V0 {
    /* JADX INFO: renamed from: a */
    public static final TextInputLayout m20305a(InputTextComponent inputTextComponent, C5311e c5311e, C11232c textController) {
        String str;
        AbstractC16544l.m18094g(inputTextComponent, "<this>");
        AbstractC16544l.m18094g(textController, "textController");
        String str2 = null;
        View viewInflate = ((LayoutInflater) c5311e.f17485o0).inflate(R.layout.pi2_ui_input_text, (ViewGroup) null, false);
        TextInputEditText textInputEditText = (TextInputEditText) AbstractC9123E2.m9654b(viewInflate, R.id.edit_text);
        if (textInputEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.edit_text)));
        }
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate;
        C20378h c20378h = new C20378h(textInputLayout, textInputEditText, textInputLayout, 2);
        AbstractC8700r.m9406b(textController, textInputEditText);
        UiComponentConfig.InputText.Attributes attributes = inputTextComponent.f40982Y.getAttributes();
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                textInputLayout.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                textInputLayout.setPlaceholderText(placeholder);
                AbstractC9716D4.m10309a(textInputLayout);
            }
            int i10 = AbstractC19122T0.f60827a[attributes.getInputType().ordinal()];
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 == 2) {
                    i11 = 32;
                } else if (i10 != 3) {
                    throw new C0644w();
                }
            }
            textInputEditText.setInputType(i11);
            if (Build.VERSION.SDK_INT >= 26) {
                UiComponentConfig.InputText.AutofillHint autofillHint = attributes.getAutofillHint();
                if (autofillHint != null) {
                    switch (AbstractC19122T0.f60828b[autofillHint.ordinal()]) {
                        case 1:
                            str = "personName";
                            break;
                        case 2:
                            str = "personGivenName";
                            break;
                        case 3:
                            str = "personMiddleName";
                            break;
                        case 4:
                            str = "personFamilyName";
                            break;
                        case 5:
                            str = "emailAddress";
                            break;
                        case 6:
                            str = "streetAddress";
                            break;
                        case 7:
                            str = "extendedAddress";
                            break;
                        case 8:
                            str = "addressLocality";
                            break;
                        case 9:
                            str = "addressCountry";
                            break;
                        case 10:
                            str = "postalCode";
                            break;
                        default:
                            throw new C0644w();
                    }
                    str2 = str;
                }
                textInputLayout.setAutofillHints(new String[]{str2});
            }
        }
        ((LinkedList) c5311e.f17486p0).add(new C19125U0(inputTextComponent, c20378h));
        AbstractC16544l.m18093f(textInputLayout, HpucjswO.otTxKRgRmoIfC);
        return textInputLayout;
    }
}
