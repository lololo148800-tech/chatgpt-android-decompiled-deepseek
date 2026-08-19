package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.header.ims.WWWAuthenticateHeaderIms;
import p691d.InterfaceC12947f;
import p713e.InterfaceC13233h0;

/* JADX INFO: loaded from: classes.dex */
public class WWWAuthenticate extends AuthenticationHeader implements InterfaceC13233h0, WWWAuthenticateHeaderIms {
    private static final long serialVersionUID = 115378648697363486L;

    public WWWAuthenticate() {
        super(SIPHeaderNames.WWW_AUTHENTICATE);
    }

    @Override // android.gov.nist.javax.sip.header.AuthenticationHeader
    public InterfaceC12947f getURI() {
        return null;
    }

    @Override // android.gov.nist.javax.sip.header.AuthenticationHeader
    public void setURI(InterfaceC12947f interfaceC12947f) {
    }
}
