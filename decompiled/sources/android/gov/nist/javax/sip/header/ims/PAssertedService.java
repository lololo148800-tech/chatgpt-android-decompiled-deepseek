package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeader;
import java.text.ParseException;
import p713e.InterfaceC13248v;

/* JADX INFO: loaded from: classes.dex */
public class PAssertedService extends SIPHeader implements PAssertedServiceHeader, SIPHeaderNamesIms, InterfaceC13248v {
    private String subAppIds;
    private String subServiceIds;

    public PAssertedService(String str) {
        super("P-Asserted-Service");
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        return (PAssertedService) super.clone();
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(ParameterNamesIms.SERVICE_ID);
        if (this.subServiceIds != null) {
            sb2.append(ParameterNamesIms.SERVICE_ID_LABEL);
            sb2.append(Separators.DOT);
            sb2.append(getSubserviceIdentifiers());
        } else if (this.subAppIds != null) {
            sb2.append(ParameterNamesIms.APPLICATION_ID_LABEL);
            sb2.append(Separators.DOT);
            sb2.append(getApplicationIdentifiers());
        }
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof PAssertedServiceHeader) && super.equals(obj);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader
    public String getApplicationIdentifiers() {
        return this.subAppIds.charAt(0) == '.' ? this.subAppIds.substring(1).trim() : this.subAppIds;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader
    public String getSubserviceIdentifiers() {
        return this.subServiceIds.charAt(0) == '.' ? this.subServiceIds.substring(1).trim() : this.subServiceIds;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader
    public void setApplicationIdentifiers(String str) {
        this.subAppIds = str;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader
    public void setSubserviceIdentifiers(String str) {
        this.subServiceIds = str;
    }

    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }

    public PAssertedService() {
        super("P-Asserted-Service");
    }
}
