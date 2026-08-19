package p994rk;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import com.withpersona.sdk2.inquiry.steps.p688ui.components.InputCurrencyComponent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p103Dn.C2153Q0;
import p1113xn.AbstractC21322p;
import p228J.AbstractC3794B0;
import p271Kj.C4706a;
import p658b5.C11248s;

/* JADX INFO: renamed from: rk.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C19167g0 implements TextWatcher {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16525B f60879Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4706a f60880Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Currency f60881o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ NumberFormat f60882p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ NumberFormat f60883q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InputCurrencyComponent f60884r0;

    public C19167g0(C16525B c16525b, C4706a c4706a, Currency currency, NumberFormat numberFormat, NumberFormat numberFormat2, InputCurrencyComponent inputCurrencyComponent) {
        this.f60879Y = c16525b;
        this.f60880Z = c4706a;
        this.f60881o0 = currency;
        this.f60882p0 = numberFormat;
        this.f60883q0 = numberFormat2;
        this.f60884r0 = inputCurrencyComponent;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws ParseException {
        String strValueOf = String.valueOf(editable);
        C16525B c16525b = this.f60879Y;
        if (strValueOf.equals(c16525b.f51262Y) || editable == null || AbstractC21322p.m21681O(editable)) {
            return;
        }
        TextInputEditText textInputEditText = (TextInputEditText) this.f60880Z.f15301c;
        textInputEditText.removeTextChangedListener(this);
        String strQuote = Pattern.quote(this.f60881o0.getSymbol());
        AbstractC16544l.m18093f(strQuote, "quote(...)");
        Pattern patternCompile = Pattern.compile(strQuote);
        AbstractC16544l.m18093f(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(editable).replaceAll("");
        StringBuilder sbM4500y = AbstractC3794B0.m4500y(strReplaceAll, "replaceAll(...)");
        int length = strReplaceAll.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = strReplaceAll.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                sbM4500y.append(cCharAt);
            }
        }
        String string = sbM4500y.toString();
        AbstractC16544l.m18093f(string, "filterTo(StringBuilder(), predicate).toString()");
        Number number = this.f60882p0.parse(string);
        if (number != null) {
            double dDoubleValue = number.doubleValue() / 100.0d;
            String str = this.f60883q0.format(dDoubleValue);
            c16525b.f51262Y = str;
            textInputEditText.setText(str);
            textInputEditText.setSelection(str.length());
            textInputEditText.addTextChangedListener(this);
            C11248s c11248s = this.f60884r0.numberController;
            ((C2153Q0) c11248s.f34081Z).setValue(Double.valueOf(dDoubleValue));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
