package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import java.text.ParseException;
import p691d.InterfaceC12947f;
import p713e.InterfaceC13248v;

/* JADX INFO: loaded from: classes.dex */
public class PAssociatedURI extends AddressParametersHeader implements PAssociatedURIHeader, SIPHeaderNamesIms, InterfaceC13248v {
    public PAssociatedURI() {
        super("P-Associated-URI");
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        PAssociatedURI pAssociatedURI = (PAssociatedURI) super.clone();
        AddressImpl addressImpl = this.address;
        if (addressImpl != null) {
            pAssociatedURI.address = (AddressImpl) addressImpl.clone();
        }
        return pAssociatedURI;
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

    @Override // android.gov.nist.javax.sip.header.ims.PAssociatedURIHeader
    public InterfaceC12947f getAssociatedURI() {
        return this.address.getURI();
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssociatedURIHeader
    public void setAssociatedURI(InterfaceC12947f interfaceC12947f) {
        if (interfaceC12947f == null) {
            throw new NullPointerException("null URI");
        }
        this.address.setURI(interfaceC12947f);
    }

    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }

    public PAssociatedURI(AddressImpl addressImpl) {
        super("P-Associated-URI");
        this.address = addressImpl;
    }

    public PAssociatedURI(GenericURI genericURI) {
        super("P-Associated-URI");
        AddressImpl addressImpl = new AddressImpl();
        this.address = addressImpl;
        addressImpl.setURI(genericURI);
    }
}
