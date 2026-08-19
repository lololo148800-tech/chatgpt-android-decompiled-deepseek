package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.javax.sip.C10800g;
import p713e.InterfaceC13234i;

/* JADX INFO: loaded from: classes.dex */
public class CSeq extends SIPHeader implements InterfaceC13234i {
    private static final long serialVersionUID = -5405798080040422910L;
    protected String method;
    protected Long seqno;

    public CSeq() {
        super(SIPHeaderNames.CSEQ);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return this.headerName + ": " + encodeBody() + Separators.NEWLINE;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC13234i)) {
            return false;
        }
        InterfaceC13234i interfaceC13234i = (InterfaceC13234i) obj;
        return getSeqNumber() == interfaceC13234i.getSeqNumber() && getMethod().equals(interfaceC13234i.getMethod());
    }

    @Override // p713e.InterfaceC13234i
    public String getMethod() {
        return this.method;
    }

    @Override // p713e.InterfaceC13234i
    public long getSeqNumber() {
        return this.seqno.longValue();
    }

    public int getSequenceNumber() {
        Long l4 = this.seqno;
        if (l4 == null) {
            return 0;
        }
        return l4.intValue();
    }

    @Override // p713e.InterfaceC13234i
    public void setMethod(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, CSeq, setMethod(), the meth parameter is null");
        }
        this.method = SIPRequest.getCannonicalName(str);
    }

    @Override // p713e.InterfaceC13234i
    public void setSeqNumber(long j10) {
        if (j10 < 0) {
            throw new C10800g(AbstractC10763a.m11049g(j10, "JAIN-SIP Exception, CSeq, setSequenceNumber(), the sequence number parameter is < 0 : "));
        }
        if (j10 > 2147483648L) {
            throw new C10800g(AbstractC10763a.m11049g(j10, "JAIN-SIP Exception, CSeq, setSequenceNumber(), the sequence number parameter is too large : "));
        }
        this.seqno = Long.valueOf(j10);
    }

    public void setSequenceNumber(int i10) {
        setSeqNumber(i10);
    }

    public CSeq(long j10, String str) {
        this();
        this.seqno = Long.valueOf(j10);
        this.method = SIPRequest.getCannonicalName(str);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.seqno);
        sb2.append(Separators.f31991SP);
        sb2.append(this.method.toUpperCase());
        return sb2;
    }
}
