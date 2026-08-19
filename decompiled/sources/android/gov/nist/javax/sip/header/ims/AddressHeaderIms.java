package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.SIPHeader;
import p691d.InterfaceC12942a;

/* JADX INFO: loaded from: classes.dex */
public abstract class AddressHeaderIms extends SIPHeader {
    protected AddressImpl address;

    public AddressHeaderIms(String str) {
        super(str);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        AddressHeaderIms addressHeaderIms = (AddressHeaderIms) super.clone();
        AddressImpl addressImpl = this.address;
        if (addressImpl != null) {
            addressHeaderIms.address = (AddressImpl) addressImpl.clone();
        }
        return addressHeaderIms;
    }

    public abstract String encodeBody();

    public InterfaceC12942a getAddress() {
        return this.address;
    }

    public void setAddress(InterfaceC12942a interfaceC12942a) {
        this.address = (AddressImpl) interfaceC12942a;
    }
}
