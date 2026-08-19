package android.gov.nist.javax.sip.header;

import android.gov.nist.core.HostPort;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.parser.Parser;
import p691d.InterfaceC12942a;
import p713e.InterfaceC13249w;

/* JADX INFO: loaded from: classes.dex */
public final class From extends AddressParametersHeader implements InterfaceC13249w {
    private static final long serialVersionUID = -6312727234330643892L;

    public From() {
        super(SIPHeaderNames.FROM);
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC13249w) && super.equals(obj);
    }

    public String getDisplayName() {
        return this.address.getDisplayName();
    }

    public HostPort getHostPort() {
        return this.address.getHostPort();
    }

    @Override // p713e.InterfaceC13249w
    public String getTag() {
        if (this.parameters == null) {
            return null;
        }
        return getParameter(ParameterNames.TAG);
    }

    public String getUserAtHostPort() {
        return this.address.getUserAtHostPort();
    }

    public boolean hasTag() {
        return hasParameter(ParameterNames.TAG);
    }

    public void removeTag() {
        this.parameters.delete(ParameterNames.TAG);
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader
    public void setAddress(InterfaceC12942a interfaceC12942a) {
        this.address = (AddressImpl) interfaceC12942a;
    }

    @Override // p713e.InterfaceC13249w
    public void setTag(String str) {
        Parser.checkToken(str);
        setParameter(ParameterNames.TAG, str);
    }

    public From(C10766To c10766To) {
        super(SIPHeaderNames.FROM);
        this.address = c10766To.address;
        this.parameters = c10766To.parameters;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        if (this.address.getAddressType() == 2) {
            sb2.append(Separators.LESS_THAN);
        }
        this.address.encode(sb2);
        if (this.address.getAddressType() == 2) {
            sb2.append(Separators.GREATER_THAN);
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }
}
