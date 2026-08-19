package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.javax.sip.header.SIPHeader;
import android.javax.sip.C10800g;
import java.text.ParseException;
import p713e.InterfaceC13248v;

/* JADX INFO: loaded from: classes.dex */
public class PMediaAuthorization extends SIPHeader implements PMediaAuthorizationHeader, SIPHeaderNamesIms, InterfaceC13248v {
    private static final long serialVersionUID = -6463630258703731133L;
    private String token;

    public PMediaAuthorization() {
        super("P-Media-Authorization");
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        PMediaAuthorization pMediaAuthorization = (PMediaAuthorization) super.clone();
        String str = this.token;
        if (str != null) {
            pMediaAuthorization.token = str;
        }
        return pMediaAuthorization;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.token);
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj instanceof PMediaAuthorizationHeader) {
            return getToken().equals(((PMediaAuthorizationHeader) obj).getToken());
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PMediaAuthorizationHeader
    public String getToken() {
        return this.token;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PMediaAuthorizationHeader
    public void setMediaAuthorizationToken(String str) throws C10800g {
        if (str == null || str.length() == 0) {
            throw new C10800g(" the Media-Authorization-Token parameter is null or empty");
        }
        this.token = str;
    }

    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
