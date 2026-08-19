package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import p713e.InterfaceC13239m;

/* JADX INFO: loaded from: classes.dex */
public final class ContentDisposition extends ParametersHeader implements InterfaceC13239m {
    private static final long serialVersionUID = 835596496276127003L;
    protected String dispositionType;

    public ContentDisposition() {
        super(SIPHeaderNames.CONTENT_DISPOSITION);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.dispositionType);
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            sb2.append(this.parameters.encode());
        }
        return sb2;
    }

    public String getContentDisposition() {
        return encodeBody(new StringBuilder()).toString();
    }

    public String getDispositionType() {
        return this.dispositionType;
    }

    public String getHandling() {
        return getParameter(ParameterNames.HANDLING);
    }

    public void setDispositionType(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, ContentDisposition, setDispositionType(), the dispositionType parameter is null");
        }
        this.dispositionType = str;
    }

    public void setHandling(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, ContentDisposition, setHandling(), the handling parameter is null");
        }
        setParameter(ParameterNames.HANDLING, str);
    }
}
