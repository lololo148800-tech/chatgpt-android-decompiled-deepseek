package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.javax.sip.C10800g;
import p713e.InterfaceC13219a0;

/* JADX INFO: loaded from: classes.dex */
public class SubscriptionState extends ParametersHeader implements InterfaceC13219a0 {
    private static final long serialVersionUID = -6673833053927258745L;
    protected int expires;
    protected String reasonCode;
    protected int retryAfter;
    protected String state;

    public SubscriptionState() {
        super(SIPHeaderNames.SUBSCRIPTION_STATE);
        this.expires = -1;
        this.retryAfter = -1;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    public int getExpires() {
        return this.expires;
    }

    public String getReasonCode() {
        return this.reasonCode;
    }

    public int getRetryAfter() {
        return this.retryAfter;
    }

    public String getState() {
        return this.state;
    }

    public void setExpires(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g("JAIN-SIP Exception, SubscriptionState, setExpires(), the expires parameter is  < 0");
        }
        this.expires = i10;
    }

    public void setReasonCode(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, SubscriptionState, setReasonCode(), the reasonCode parameter is null");
        }
        this.reasonCode = str;
    }

    public void setRetryAfter(int i10) throws C10800g {
        if (i10 <= 0) {
            throw new C10800g("JAIN-SIP Exception, SubscriptionState, setRetryAfter(), the retryAfter parameter is <=0");
        }
        this.retryAfter = i10;
    }

    public void setState(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, SubscriptionState, setState(), the state parameter is null");
        }
        this.state = str;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String str = this.state;
        if (str != null) {
            sb2.append(str);
        }
        if (this.reasonCode != null) {
            sb2.append(";reason=");
            sb2.append(this.reasonCode);
        }
        if (this.expires != -1) {
            sb2.append(";expires=");
            sb2.append(this.expires);
        }
        if (this.retryAfter != -1) {
            sb2.append(";retry-after=");
            sb2.append(this.retryAfter);
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }
}
