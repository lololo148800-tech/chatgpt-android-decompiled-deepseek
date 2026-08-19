package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.javax.sip.C10800g;
import p713e.InterfaceC13247u;

/* JADX INFO: loaded from: classes.dex */
public class Expires extends SIPHeader implements InterfaceC13247u {
    private static final long serialVersionUID = 3134344915465784267L;
    protected int expires;

    public Expires() {
        super(SIPHeaderNames.EXPIRES);
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    public int getExpires() {
        return this.expires;
    }

    public void setExpires(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g(AbstractC10763a.m11048f(i10, "bad argument "));
        }
        this.expires = i10;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.expires);
        return sb2;
    }
}
