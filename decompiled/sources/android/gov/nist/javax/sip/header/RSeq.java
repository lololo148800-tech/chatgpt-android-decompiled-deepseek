package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.javax.sip.C10800g;
import p713e.InterfaceC13206N;

/* JADX INFO: loaded from: classes.dex */
public class RSeq extends SIPHeader implements InterfaceC13206N {
    private static final long serialVersionUID = 8765762413224043394L;
    protected long sequenceNumber;

    public RSeq() {
        super(SIPHeaderNames.RSEQ);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(Long.toString(this.sequenceNumber));
        return sb2;
    }

    public long getSeqNumber() {
        return this.sequenceNumber;
    }

    public int getSequenceNumber() {
        return (int) this.sequenceNumber;
    }

    public void setSeqNumber(long j10) {
        if (j10 <= 0 || j10 > 2147483648L) {
            throw new C10800g(AbstractC10763a.m11049g(j10, "Bad seq number "));
        }
        this.sequenceNumber = j10;
    }

    public void setSequenceNumber(int i10) {
        setSeqNumber(i10);
    }
}
