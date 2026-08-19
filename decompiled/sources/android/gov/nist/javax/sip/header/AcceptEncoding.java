package android.gov.nist.javax.sip.header;

import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.javax.sip.C10800g;
import p713e.InterfaceC13218a;

/* JADX INFO: loaded from: classes.dex */
public final class AcceptEncoding extends ParametersHeader implements InterfaceC13218a {
    private static final long serialVersionUID = -1476807565552873525L;
    protected String contentCoding;

    public AcceptEncoding() {
        super(SIPHeaderNames.ACCEPT_ENCODING);
    }

    public String encodeBody() {
        return encode(new StringBuilder()).toString();
    }

    public String getEncoding() {
        return this.contentCoding;
    }

    public float getQValue() {
        return getParameterAsFloat("q");
    }

    public void setEncoding(String str) {
        if (str == null) {
            throw new NullPointerException(" encoding parameter is null");
        }
        this.contentCoding = str;
    }

    public void setQValue(float f10) throws C10800g {
        double d10 = f10;
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new C10800g("qvalue out of range!");
        }
        super.setParameter("q", f10);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String str = this.contentCoding;
        if (str != null) {
            sb2.append(str);
        }
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null && !nameValueList.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            sb2.append(this.parameters.encode());
        }
        return sb2;
    }
}
