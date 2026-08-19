package android.gov.nist.javax.sip.header;

import p713e.InterfaceC13211T;

/* JADX INFO: loaded from: classes.dex */
public class Require extends SIPHeader implements InterfaceC13211T {
    private static final long serialVersionUID = -3743425404884053281L;
    protected String optionTag;

    public Require() {
        super(SIPHeaderNames.REQUIRE);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.optionTag);
        return sb2;
    }

    @Override // p713e.InterfaceC13198F
    public String getOptionTag() {
        return this.optionTag;
    }

    public void setOptionTag(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, Require, setOptionTag(), the optionTag parameter is null");
        }
        this.optionTag = str;
    }

    public Require(String str) {
        super(SIPHeaderNames.REQUIRE);
        this.optionTag = str;
    }
}
