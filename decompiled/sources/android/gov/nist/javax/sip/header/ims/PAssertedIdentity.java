package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import java.text.ParseException;
import p713e.InterfaceC13248v;

/* JADX INFO: loaded from: classes.dex */
public class PAssertedIdentity extends AddressParametersHeader implements PAssertedIdentityHeader, SIPHeaderNamesIms, InterfaceC13248v {
    public PAssertedIdentity(AddressImpl addressImpl) {
        super("P-Asserted-Identity");
        this.address = addressImpl;
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        return (PAssertedIdentity) super.clone();
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
        if (this.parameters.isEmpty()) {
            return sb2;
        }
        sb2.append(Separators.COMMA);
        return this.parameters.encode(sb2);
    }

    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }

    public PAssertedIdentity() {
        super("P-Asserted-Identity");
    }
}
