package android.gov.nist.javax.sip.header;

import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.GenericURI;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import java.text.ParseException;
import p691d.InterfaceC12947f;
import p713e.InterfaceC13237k;

/* JADX INFO: loaded from: classes.dex */
public final class CallInfo extends ParametersHeader implements InterfaceC13237k {
    private static final long serialVersionUID = -8179246487696752928L;
    protected GenericURI info;

    public CallInfo() {
        super(SIPHeaderNames.CALL_INFO);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        CallInfo callInfo = (CallInfo) super.clone();
        GenericURI genericURI = this.info;
        if (genericURI != null) {
            callInfo.info = (GenericURI) genericURI.clone();
        }
        return callInfo;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    public InterfaceC12947f getInfo() {
        return this.info;
    }

    public String getPurpose() {
        return getParameter(ParameterNames.PURPOSE);
    }

    public void setInfo(InterfaceC12947f interfaceC12947f) {
        this.info = (GenericURI) interfaceC12947f;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(Separators.LESS_THAN);
        this.info.encode(sb2);
        sb2.append(Separators.GREATER_THAN);
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null && !nameValueList.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }

    public void setPurpose(String str) {
        if (str == null) {
            throw new NullPointerException(wNrQXvwLiB.TBnXONhekRHYQ);
        }
        try {
            setParameter(ParameterNames.PURPOSE, str);
        } catch (ParseException unused) {
        }
    }
}
