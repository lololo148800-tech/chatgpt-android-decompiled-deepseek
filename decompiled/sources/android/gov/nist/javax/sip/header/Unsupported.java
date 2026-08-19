package android.gov.nist.javax.sip.header;

import p658b5.p659zh.MMVKXkcLpuHFDi;
import p713e.InterfaceC13227e0;

/* JADX INFO: loaded from: classes.dex */
public class Unsupported extends SIPHeader implements InterfaceC13227e0 {
    private static final long serialVersionUID = -2479414149440236199L;
    protected String optionTag;

    public Unsupported() {
        super(MMVKXkcLpuHFDi.ZmVeQr);
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
            throw new NullPointerException("JAIN-SIP Exception,  Unsupported, setOptionTag(), The option tag parameter is null");
        }
        this.optionTag = str;
    }

    public Unsupported(String str) {
        super(SIPHeaderNames.UNSUPPORTED);
        this.optionTag = str;
    }
}
