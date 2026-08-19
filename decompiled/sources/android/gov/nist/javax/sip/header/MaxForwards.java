package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.javax.sip.C10796c;
import android.javax.sip.C10800g;
import p713e.InterfaceC13194B;

/* JADX INFO: loaded from: classes.dex */
public class MaxForwards extends SIPHeader implements InterfaceC13194B {
    private static final long serialVersionUID = -3096874323347175943L;
    protected int maxForwards;

    public MaxForwards() {
        super(SIPHeaderNames.MAX_FORWARDS);
    }

    public void decrementMaxForwards() throws C10796c {
        int i10 = this.maxForwards;
        if (i10 <= 0) {
            throw new C10796c("has already reached 0!");
        }
        this.maxForwards = i10 - 1;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC13194B) && getMaxForwards() == ((InterfaceC13194B) obj).getMaxForwards();
    }

    @Override // p713e.InterfaceC13194B
    public int getMaxForwards() {
        return this.maxForwards;
    }

    public boolean hasReachedZero() {
        return this.maxForwards == 0;
    }

    public void setMaxForwards(int i10) throws C10800g {
        if (i10 < 0 || i10 > 255) {
            throw new C10800g(AbstractC10763a.m11048f(i10, "bad max forwards value "));
        }
        this.maxForwards = i10;
    }

    public MaxForwards(int i10) throws C10800g {
        super(SIPHeaderNames.MAX_FORWARDS);
        setMaxForwards(i10);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.maxForwards);
        return sb2;
    }
}
