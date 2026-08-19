package p994rk;

import android.text.Editable;
import android.view.LayoutInflater;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCurrencyComponent;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p271Kj.C4706a;
import p310M9.C5311e;
import p594Y9.AbstractC9716D4;

/* JADX INFO: renamed from: rk.h0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19171h0 {
    /* JADX INFO: renamed from: a */
    public static final TextInputLayout m20314a(InputCurrencyComponent inputCurrencyComponent, C5311e c5311e) {
        AbstractC16544l.m18094g(inputCurrencyComponent, "<this>");
        C4706a c4706aM5402a = C4706a.m5402a((LayoutInflater) c5311e.f17485o0);
        UiComponentConfig.InputCurrency.Attributes attributes = inputCurrencyComponent.f40954Y.getAttributes();
        String str = "USD";
        if (attributes != null) {
            String label = attributes.getLabel();
            TextInputLayout textInputLayout = (TextInputLayout) c4706aM5402a.f15302d;
            if (label != null) {
                textInputLayout.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                textInputLayout.setPlaceholderText(placeholder);
                AbstractC9716D4.m10309a(textInputLayout);
            }
            String currencyCode = attributes.getCurrencyCode();
            if (currencyCode != null) {
                str = currencyCode;
            }
        }
        Currency currency = Currency.getInstance(str);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(currency);
        NumberFormat numberFormat = NumberFormat.getInstance();
        C16525B c16525b = new C16525B();
        TextInputEditText textInputEditText = (TextInputEditText) c4706aM5402a.f15301c;
        Editable text = textInputEditText.getText();
        c16525b.f51262Y = text != null ? text.toString() : null;
        C19167g0 c19167g0 = new C19167g0(c16525b, c4706aM5402a, currency, numberFormat, currencyInstance, inputCurrencyComponent);
        Number number = inputCurrencyComponent.f40955Z;
        if (number != null) {
            try {
                textInputEditText.setText(currencyInstance.format(number.doubleValue()));
            } catch (Exception unused) {
            }
        }
        textInputEditText.addTextChangedListener(c19167g0);
        ((LinkedList) c5311e.f17486p0).add(new C19163f0(inputCurrencyComponent, c4706aM5402a));
        TextInputLayout textInputLayout2 = (TextInputLayout) c4706aM5402a.f15300b;
        AbstractC16544l.m18093f(textInputLayout2, "getRoot(...)");
        return textInputLayout2;
    }
}
