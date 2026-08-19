package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import p713e.InterfaceC13232h;

/* JADX INFO: loaded from: classes.dex */
public class Authorization extends AuthenticationHeader implements InterfaceC13232h, AuthorizationHeaderIms {
    private static final long serialVersionUID = -8897770321892281348L;

    public Authorization() {
        super(SIPHeaderNames.AUTHORIZATION);
    }
}
