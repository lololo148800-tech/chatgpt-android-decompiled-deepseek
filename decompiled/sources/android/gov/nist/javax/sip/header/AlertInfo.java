package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.GenericURI;
import java.text.ParseException;
import p691d.InterfaceC12947f;
import p713e.InterfaceC13224d;

/* JADX INFO: loaded from: classes.dex */
public final class AlertInfo extends ParametersHeader implements InterfaceC13224d {
    private static final long serialVersionUID = 4159657362051508719L;
    protected String string;
    protected GenericURI uri;

    public AlertInfo() {
        super(SIPHeaderNames.ALERT_INFO);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        AlertInfo alertInfo = (AlertInfo) super.clone();
        GenericURI genericURI = this.uri;
        if (genericURI != null) {
            alertInfo.uri = (GenericURI) genericURI.clone();
        } else {
            String str = this.string;
            if (str != null) {
                alertInfo.string = str;
            }
        }
        return alertInfo;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        if (this.uri != null) {
            sb2.append(Separators.LESS_THAN);
            sb2.append(this.uri.encode());
            sb2.append(Separators.GREATER_THAN);
        } else {
            String str = this.string;
            if (str != null) {
                sb2.append(str);
            }
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            sb2.append(this.parameters.encode());
        }
        return sb2;
    }

    public InterfaceC12947f getAlertInfo() {
        GenericURI genericURI = this.uri;
        if (genericURI != null) {
            return genericURI;
        }
        try {
            return new GenericURI(this.string);
        } catch (ParseException unused) {
            return null;
        }
    }

    public void setAlertInfo(InterfaceC12947f interfaceC12947f) {
        this.uri = (GenericURI) interfaceC12947f;
    }

    public void setAlertInfo(String str) {
        this.string = str;
    }
}
