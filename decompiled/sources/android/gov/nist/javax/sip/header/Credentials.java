package android.gov.nist.javax.sip.header;

import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes.dex */
public class Credentials extends SIPObject {
    private static String CNONCE = "cnonce";
    private static String DOMAIN = "domain";
    private static String NONCE = "nonce";
    private static String OPAQUE = "opaque";
    private static String REALM = "realm";
    private static String RESPONSE = "response";
    private static String URI = "uri";
    private static String USERNAME = "username";
    private static final long serialVersionUID = -6335592791505451524L;
    protected NameValueList parameters;
    protected String scheme;

    public Credentials() {
        NameValueList nameValueList = new NameValueList();
        this.parameters = nameValueList;
        nameValueList.setSeparator(Separators.COMMA);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        Credentials credentials = (Credentials) super.clone();
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null) {
            credentials.parameters = (NameValueList) nameValueList.clone();
        }
        return credentials;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.scheme;
        if (this.parameters.isEmpty()) {
            return str;
        }
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, Separators.f31991SP);
        sbM9895n.append(this.parameters.encode());
        return sbM9895n.toString();
    }

    public NameValueList getCredentials() {
        return this.parameters;
    }

    public String getScheme() {
        return this.scheme;
    }

    public void setCredentials(NameValueList nameValueList) {
        this.parameters = nameValueList;
    }

    public void setScheme(String str) {
        this.scheme = str;
    }
}
