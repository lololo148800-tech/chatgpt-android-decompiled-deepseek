package android.gov.nist.javax.sip.header;

import p713e.InterfaceC13228f;

/* JADX INFO: loaded from: classes.dex */
public final class Allow extends SIPHeader implements InterfaceC13228f {
    private static final long serialVersionUID = -3105079479020693930L;
    protected String method;

    public Allow() {
        super(SIPHeaderNames.ALLOW);
        this.method = "";
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.method);
        return sb2;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, Allow, setMethod(), the method parameter is null.");
        }
        this.method = str;
    }

    public Allow(String str) {
        super(SIPHeaderNames.ALLOW);
        this.method = str;
    }
}
