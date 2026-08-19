package android.gov.nist.javax.sip.header.extensions;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.C10800g;
import java.text.ParseException;
import p713e.InterfaceC13248v;

/* JADX INFO: loaded from: classes.dex */
public final class SessionExpires extends ParametersHeader implements InterfaceC13248v, SessionExpiresHeader {
    public static final String NAME = "Session-Expires";
    public static final String REFRESHER = "refresher";
    private static final long serialVersionUID = 8765762413224043300L;
    public int expires;

    public SessionExpires() {
        super("Session-Expires");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(Integer.toString(this.expires));
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader
    public int getExpires() {
        return this.expires;
    }

    @Override // android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader
    public String getRefresher() {
        return this.parameters.getParameter(REFRESHER);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader
    public void setExpires(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g(AbstractC10763a.m11048f(i10, "bad argument "));
        }
        this.expires = i10;
    }

    @Override // android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader
    public void setRefresher(String str) {
        this.parameters.set(REFRESHER, str);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
