package android.gov.nist.javax.sip.header;

import p713e.InterfaceC13215X;
import p713e.InterfaceC13248v;

/* JADX INFO: loaded from: classes.dex */
public class SIPIfMatch extends SIPHeader implements InterfaceC13215X, InterfaceC13248v {
    private static final long serialVersionUID = 3833745477828359730L;
    protected String entityTag;

    public SIPIfMatch() {
        super(SIPHeaderNames.SIP_IF_MATCH);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.entityTag);
        return sb2;
    }

    public String getETag() {
        return this.entityTag;
    }

    public void setETag(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception,SIP-If-Match, setETag(), the etag parameter is null");
        }
        this.entityTag = str;
    }

    public void setValue(String str) {
        setETag(str);
    }

    public SIPIfMatch(String str) {
        this();
        setETag(str);
    }
}
