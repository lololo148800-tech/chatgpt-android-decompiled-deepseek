package android.gov.nist.javax.sip.header;

import p691d.InterfaceC12947f;
import p713e.InterfaceC13202J;

/* JADX INFO: loaded from: classes.dex */
public class ProxyAuthenticate extends AuthenticationHeader implements InterfaceC13202J {
    private static final long serialVersionUID = 3826145955463251116L;

    public ProxyAuthenticate() {
        super(SIPHeaderNames.PROXY_AUTHENTICATE);
    }

    @Override // android.gov.nist.javax.sip.header.AuthenticationHeader
    public InterfaceC12947f getURI() {
        return null;
    }

    @Override // android.gov.nist.javax.sip.header.AuthenticationHeader
    public void setURI(InterfaceC12947f interfaceC12947f) {
    }
}
