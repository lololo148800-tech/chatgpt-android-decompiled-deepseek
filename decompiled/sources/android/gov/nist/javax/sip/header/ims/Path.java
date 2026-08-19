package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import java.text.ParseException;
import p713e.InterfaceC13248v;

/* JADX INFO: loaded from: classes.dex */
public class Path extends AddressParametersHeader implements PathHeader, SIPHeaderNamesIms, InterfaceC13248v {
    public Path(AddressImpl addressImpl) {
        super("Path");
        this.address = addressImpl;
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
        sb2.append(Separators.SEMICOLON);
        return this.parameters.encode(sb2);
    }

    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }

    public Path() {
        super("Path");
    }
}
