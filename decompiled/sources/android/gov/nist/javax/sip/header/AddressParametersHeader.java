package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.address.AddressImpl;
import p691d.InterfaceC12942a;
import p713e.InterfaceC13200H;
import p713e.InterfaceC13251y;

/* JADX INFO: loaded from: classes.dex */
public abstract class AddressParametersHeader extends ParametersHeader {
    protected AddressImpl address;

    public AddressParametersHeader(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        AddressParametersHeader addressParametersHeader = (AddressParametersHeader) super.clone();
        AddressImpl addressImpl = this.address;
        if (addressImpl != null) {
            addressParametersHeader.address = (AddressImpl) addressImpl.clone();
        }
        return addressParametersHeader;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC13251y) || !(obj instanceof InterfaceC13200H)) {
            return false;
        }
        InterfaceC13251y interfaceC13251y = (InterfaceC13251y) obj;
        return getAddress().equals(interfaceC13251y.getAddress()) && equalParameters((InterfaceC13200H) interfaceC13251y);
    }

    public InterfaceC12942a getAddress() {
        return this.address;
    }

    public void setAddress(InterfaceC12942a interfaceC12942a) {
        this.address = (AddressImpl) interfaceC12942a;
    }

    public AddressParametersHeader(String str, boolean z6) {
        super(str, z6);
    }
}
