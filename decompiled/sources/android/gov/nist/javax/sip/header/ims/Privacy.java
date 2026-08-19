package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.javax.sip.header.SIPHeader;
import java.text.ParseException;
import p713e.InterfaceC13248v;

/* JADX INFO: loaded from: classes.dex */
public class Privacy extends SIPHeader implements PrivacyHeader, SIPHeaderNamesIms, InterfaceC13248v {
    private String privacy;

    public Privacy() {
        super("Privacy");
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        Privacy privacy = (Privacy) super.clone();
        String str = this.privacy;
        if (str != null) {
            privacy.privacy = str;
        }
        return privacy;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.privacy);
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj instanceof PrivacyHeader) {
            return getPrivacy().equals(((PrivacyHeader) obj).getPrivacy());
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PrivacyHeader
    public String getPrivacy() {
        return this.privacy;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PrivacyHeader
    public void setPrivacy(String str) {
        if (str == null || str == "") {
            throw new NullPointerException("JAIN-SIP Exception,  Privacy, setPrivacy(), privacy value is null or empty");
        }
        this.privacy = str;
    }

    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }

    public Privacy(String str) {
        this();
        this.privacy = str;
    }
}
