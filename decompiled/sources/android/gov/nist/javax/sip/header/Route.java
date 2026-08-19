package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import p713e.InterfaceC13213V;

/* JADX INFO: loaded from: classes.dex */
public class Route extends AddressParametersHeader implements InterfaceC13213V {
    private static final long serialVersionUID = 5683577362998368846L;

    public Route() {
        super(SIPHeaderNames.ROUTE);
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC13213V) && super.equals(obj);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public int hashCode() {
        return this.address.getHostPort().encode().toLowerCase().hashCode();
    }

    public Route(AddressImpl addressImpl) {
        super(SIPHeaderNames.ROUTE);
        this.address = addressImpl;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        if (this.address.getAddressType() == 1) {
            this.address.encode(sb2);
        } else {
            sb2.append('<');
            this.address.encode(sb2);
            sb2.append('>');
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }
}
