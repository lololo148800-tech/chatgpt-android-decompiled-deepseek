package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.GenericURI;
import p691d.InterfaceC12947f;
import p713e.InterfaceC13245s;

/* JADX INFO: loaded from: classes.dex */
public final class ErrorInfo extends ParametersHeader implements InterfaceC13245s {
    private static final long serialVersionUID = -6347702901964436362L;
    protected GenericURI errorInfo;

    public ErrorInfo() {
        super(SIPHeaderNames.ERROR_INFO);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        ErrorInfo errorInfo = (ErrorInfo) super.clone();
        GenericURI genericURI = this.errorInfo;
        if (genericURI != null) {
            errorInfo.errorInfo = (GenericURI) genericURI.clone();
        }
        return errorInfo;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(Separators.LESS_THAN);
        this.errorInfo.encode(sb2);
        sb2.append(Separators.GREATER_THAN);
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }

    public InterfaceC12947f getErrorInfo() {
        return this.errorInfo;
    }

    public String getErrorMessage() {
        return getParameter("message");
    }

    public void setErrorInfo(InterfaceC12947f interfaceC12947f) {
        this.errorInfo = (GenericURI) interfaceC12947f;
    }

    public void setErrorMessage(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception , ErrorInfoHeader, setErrorMessage(), the message parameter is null");
        }
        setParameter("message", str);
    }

    public ErrorInfo(GenericURI genericURI) {
        this();
        this.errorInfo = genericURI;
    }
}
