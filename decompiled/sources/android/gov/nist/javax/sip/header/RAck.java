package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.javax.sip.C10800g;
import p713e.InterfaceC13205M;

/* JADX INFO: loaded from: classes.dex */
public class RAck extends SIPHeader implements InterfaceC13205M {
    private static final long serialVersionUID = 743999286077404118L;
    protected long cSeqNumber;
    protected String method;
    protected long rSeqNumber;

    public RAck() {
        super(SIPHeaderNames.RACK);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.rSeqNumber);
        sb2.append(Separators.f31991SP);
        sb2.append(this.cSeqNumber);
        sb2.append(Separators.f31991SP);
        sb2.append(this.method);
        return sb2;
    }

    public int getCSeqNumber() {
        return (int) this.cSeqNumber;
    }

    public long getCSeqNumberLong() {
        return this.cSeqNumber;
    }

    public long getCSequenceNumber() {
        return this.cSeqNumber;
    }

    public String getMethod() {
        return this.method;
    }

    public int getRSeqNumber() {
        return (int) this.rSeqNumber;
    }

    public long getRSequenceNumber() {
        return this.rSeqNumber;
    }

    public void setCSeqNumber(int i10) {
        setCSequenceNumber(i10);
    }

    public void setCSequenceNumber(long j10) {
        if (j10 <= 0 || j10 > 2147483648L) {
            throw new C10800g(AbstractC10763a.m11049g(j10, "Bad CSeq # "));
        }
        this.cSeqNumber = j10;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setRSeqNumber(int i10) {
        setRSequenceNumber(i10);
    }

    public void setRSequenceNumber(long j10) {
        if (j10 <= 0 || this.cSeqNumber > 2147483648L) {
            throw new C10800g(AbstractC10763a.m11049g(j10, "Bad rSeq # "));
        }
        this.rSeqNumber = j10;
    }
}
