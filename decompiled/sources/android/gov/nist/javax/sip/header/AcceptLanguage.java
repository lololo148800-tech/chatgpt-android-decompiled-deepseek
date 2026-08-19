package android.gov.nist.javax.sip.header;

import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import android.javax.sip.C10800g;
import java.util.Locale;
import p713e.InterfaceC13222c;

/* JADX INFO: loaded from: classes.dex */
public final class AcceptLanguage extends ParametersHeader implements InterfaceC13222c {
    private static final long serialVersionUID = -4473982069737324919L;
    protected String languageRange;

    public AcceptLanguage() {
        super(SIPHeaderNames.ACCEPT_LANGUAGE);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String str = this.languageRange;
        if (str != null) {
            sb2.append(str);
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            sb2.append(this.parameters.encode());
        }
        return sb2;
    }

    public Locale getAcceptLanguage() {
        String str = this.languageRange;
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(45);
        return iIndexOf >= 0 ? new Locale(this.languageRange.substring(0, iIndexOf), this.languageRange.substring(iIndexOf + 1)) : new Locale(this.languageRange);
    }

    public String getLanguageRange() {
        return this.languageRange;
    }

    public float getQValue() {
        if (hasParameter("q")) {
            return ((Float) this.parameters.getValue("q")).floatValue();
        }
        return -1.0f;
    }

    public boolean hasQValue() {
        return hasParameter("q");
    }

    public void removeQValue() {
        removeParameter("q");
    }

    public void setAcceptLanguage(Locale locale) {
        if ("".equals(locale.getCountry())) {
            this.languageRange = locale.getLanguage();
            return;
        }
        this.languageRange = locale.getLanguage() + '-' + locale.getCountry();
    }

    public void setLanguageRange(String str) {
        this.languageRange = str.trim();
    }

    public void setQValue(float f10) throws C10800g {
        double d10 = f10;
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new C10800g("qvalue out of range!");
        }
        if (f10 == -1.0f) {
            removeParameter("q");
        } else {
            setParameter(new NameValue("q", Float.valueOf(f10)));
        }
    }
}
