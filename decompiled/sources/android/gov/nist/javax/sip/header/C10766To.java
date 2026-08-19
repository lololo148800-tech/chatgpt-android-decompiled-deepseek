package android.gov.nist.javax.sip.header;

import android.gov.nist.core.HostPort;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.parser.Parser;
import p713e.InterfaceC13225d0;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: android.gov.nist.javax.sip.header.To */
/* JADX INFO: loaded from: classes.dex */
public final class C10766To extends AddressParametersHeader implements InterfaceC13225d0 {
    private static final long serialVersionUID = -4057413800584586316L;

    public C10766To() {
        super(SIPHeaderNames.f32002TO, true);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return this.headerName + ": " + encodeBody() + Separators.NEWLINE;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC13225d0) && super.equals(obj);
    }

    public String getDisplayName() {
        AddressImpl addressImpl = this.address;
        if (addressImpl == null) {
            return null;
        }
        return addressImpl.getDisplayName();
    }

    public HostPort getHostPort() {
        AddressImpl addressImpl = this.address;
        if (addressImpl == null) {
            return null;
        }
        return addressImpl.getHostPort();
    }

    @Override // p713e.InterfaceC13225d0
    public String getTag() {
        if (this.parameters == null) {
            return null;
        }
        return getParameter(ParameterNames.TAG);
    }

    public String getUserAtHostPort() {
        AddressImpl addressImpl = this.address;
        if (addressImpl == null) {
            return null;
        }
        return addressImpl.getUserAtHostPort();
    }

    public boolean hasTag() {
        if (this.parameters == null) {
            return false;
        }
        return hasParameter(ParameterNames.TAG);
    }

    @Override // p713e.InterfaceC13225d0
    public void setTag(String str) {
        Parser.checkToken(str);
        setParameter(ParameterNames.TAG, str);
    }

    public C10766To(From from) {
        super(SIPHeaderNames.f32002TO);
        setAddress(from.address);
        setParameters(from.parameters);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        AddressImpl addressImpl = this.address;
        if (addressImpl != null) {
            if (addressImpl.getAddressType() == 2) {
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
        }
        return sb2;
    }

    public void removeTag() {
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null) {
            nameValueList.delete(sVDIzpC.dyfFlNpQ);
        }
    }
}
