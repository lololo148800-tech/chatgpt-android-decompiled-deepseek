package android.gov.nist.javax.sip.address;

import java.text.ParseException;
import p691d.InterfaceC12947f;

/* JADX INFO: loaded from: classes.dex */
public class GenericURI extends NetObject implements InterfaceC12947f {
    public static final String ISUB = "isub";
    public static final String PHONE_CONTEXT_TAG = "context-tag";
    public static final String POSTDIAL = "postdial";
    public static final String PROVIDER_TAG = "provider-tag";
    public static final String SIP = "sip";
    public static final String SIPS = "sips";
    public static final String TEL = "tel";
    private static final long serialVersionUID = 3237685256878068790L;
    protected String scheme;
    protected String uriString;

    public GenericURI() {
    }

    @Override // android.gov.nist.core.GenericObject
    public String encode() {
        return this.uriString;
    }

    @Override // android.gov.nist.javax.sip.address.NetObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC12947f) {
            return toString().equalsIgnoreCase(((InterfaceC12947f) obj).toString());
        }
        return false;
    }

    @Override // p691d.InterfaceC12947f
    public String getScheme() {
        return this.scheme;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // p691d.InterfaceC12947f
    public boolean isSipURI() {
        return this instanceof SipUri;
    }

    @Override // android.gov.nist.javax.sip.address.NetObject, p691d.InterfaceC12947f
    public String toString() {
        return encode();
    }

    public GenericURI(String str) throws ParseException {
        try {
            this.uriString = str;
            this.scheme = str.substring(0, str.indexOf(":"));
        } catch (Exception unused) {
            throw new ParseException("GenericURI, Bad URI format", 0);
        }
    }

    @Override // android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb2) {
        sb2.append(this.uriString);
        return sb2;
    }
}
