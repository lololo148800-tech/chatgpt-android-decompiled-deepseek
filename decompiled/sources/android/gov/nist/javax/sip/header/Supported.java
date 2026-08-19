package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p571X9.AbstractC9306j0;
import p713e.InterfaceC13221b0;

/* JADX INFO: loaded from: classes.dex */
public class Supported extends SIPHeader implements InterfaceC13221b0 {
    private static final long serialVersionUID = -7679667592702854542L;
    protected String optionTag;

    public Supported() {
        super(SIPHeaderNames.SUPPORTED);
        this.optionTag = null;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String strM9891j = AbstractC9306j0.m9891j(this.headerName, ":", new StringBuilder());
        if (this.optionTag != null) {
            StringBuilder sbM9895n = AbstractC9306j0.m9895n(strM9891j, Separators.f31991SP);
            sbM9895n.append(this.optionTag);
            strM9891j = sbM9895n.toString();
        }
        return AbstractC10763a.m11052j(strM9891j, Separators.NEWLINE);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String str = this.optionTag;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        return sb2;
    }

    @Override // p713e.InterfaceC13198F
    public String getOptionTag() {
        return this.optionTag;
    }

    public void setOptionTag(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, Supported, setOptionTag(), the optionTag parameter is null");
        }
        this.optionTag = str;
    }

    public Supported(String str) {
        super(SIPHeaderNames.SUPPORTED);
        this.optionTag = str;
    }
}
