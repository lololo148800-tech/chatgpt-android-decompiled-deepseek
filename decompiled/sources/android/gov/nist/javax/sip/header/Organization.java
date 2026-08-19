package android.gov.nist.javax.sip.header;

import p713e.InterfaceC13199G;

/* JADX INFO: loaded from: classes.dex */
public class Organization extends SIPHeader implements InterfaceC13199G {
    private static final long serialVersionUID = -2775003113740192712L;
    protected String organization;

    public Organization() {
        super(SIPHeaderNames.ORGANIZATION);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.organization);
        return sb2;
    }

    public String getOrganization() {
        return this.organization;
    }

    public void setOrganization(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, Organization, setOrganization(), the organization parameter is null");
        }
        this.organization = str;
    }
}
