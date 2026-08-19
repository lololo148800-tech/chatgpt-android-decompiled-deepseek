package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.javax.sip.C10800g;
import p713e.InterfaceC13197E;

/* JADX INFO: loaded from: classes.dex */
public class MinExpires extends SIPHeader implements InterfaceC13197E {
    private static final long serialVersionUID = 7001828209606095801L;
    protected int expires;

    public MinExpires() {
        super(SIPHeaderNames.MIN_EXPIRES);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(Integer.toString(this.expires));
        return sb2;
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
}
