package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.javax.sip.C10800g;
import p160G5.p161rK.TVCuK;
import p713e.InterfaceC13212U;

/* JADX INFO: loaded from: classes.dex */
public class RetryAfter extends ParametersHeader implements InterfaceC13212U {
    public static final String DURATION = "duration";
    private static final long serialVersionUID = -1029458515616146140L;
    protected String comment;
    protected Integer retryAfter;

    public RetryAfter() {
        super(SIPHeaderNames.RETRY_AFTER);
        this.retryAfter = new Integer(0);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        Integer num = this.retryAfter;
        if (num != null) {
            sb2.append(num);
        }
        if (this.comment != null) {
            sb2.append(" (" + this.comment + Separators.RPAREN);
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }

    public String getComment() {
        return this.comment;
    }

    public int getDuration() {
        if (getParameter("duration") == null) {
            return -1;
        }
        return super.getParameterAsInt("duration");
    }

    public int getRetryAfter() {
        return this.retryAfter.intValue();
    }

    public boolean hasComment() {
        return this.comment != null;
    }

    public void removeComment() {
        this.comment = null;
    }

    public void removeDuration() {
        super.removeParameter("duration");
    }

    public void setComment(String str) {
        if (str == null) {
            throw new NullPointerException("the comment parameter is null");
        }
        this.comment = str;
    }

    public void setRetryAfter(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g(AbstractC10763a.m11048f(i10, "invalid parameter "));
        }
        this.retryAfter = Integer.valueOf(i10);
    }

    public void setDuration(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g("the duration parameter is <0");
        }
        setParameter(TVCuK.hWOfOVmfuFBWxq, i10);
    }
}
