package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Host;
import android.gov.nist.core.Separators;
import p571X9.AbstractC9306j0;
import p668c.C11547g;
import p668c.InterfaceC11541a;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionField extends SDPField implements InterfaceC11541a {
    protected ConnectionAddress address;
    protected String addrtype;
    protected String nettype;

    public ConnectionField() {
        super(SDPFieldNames.CONNECTION_FIELD);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ConnectionField connectionField = (ConnectionField) super.clone();
        ConnectionAddress connectionAddress = this.address;
        if (connectionAddress != null) {
            connectionField.address = (ConnectionAddress) connectionAddress.clone();
        }
        return connectionField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.nettype;
        String string = SDPFieldNames.CONNECTION_FIELD;
        if (str != null) {
            string = SDPFieldNames.CONNECTION_FIELD + this.nettype;
        }
        if (this.addrtype != null) {
            StringBuilder sbM9895n = AbstractC9306j0.m9895n(string, Separators.f31991SP);
            sbM9895n.append(this.addrtype);
            string = sbM9895n.toString();
        }
        if (this.address != null) {
            StringBuilder sbM9895n2 = AbstractC9306j0.m9895n(string, Separators.f31991SP);
            sbM9895n2.append(this.address.encode());
            string = sbM9895n2.toString();
        }
        return AbstractC10763a.m11052j(string, Separators.NEWLINE);
    }

    public String getAddress() {
        Host address;
        ConnectionAddress connectionAddress = getConnectionAddress();
        if (connectionAddress == null || (address = connectionAddress.getAddress()) == null) {
            return null;
        }
        return address.getAddress();
    }

    public String getAddressType() {
        return getAddrtype();
    }

    public String getAddrtype() {
        return this.addrtype;
    }

    public ConnectionAddress getConnectionAddress() {
        return this.address;
    }

    public String getNettype() {
        return this.nettype;
    }

    public String getNetworkType() {
        return getNettype();
    }

    public void setAddrType(String str) {
        this.addrtype = str;
    }

    public void setAddress(ConnectionAddress connectionAddress) {
        this.address = connectionAddress;
    }

    public void setAddressType(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("the type is null");
        }
        this.addrtype = str;
    }

    public void setNettype(String str) {
        this.nettype = str;
    }

    public void setNetworkType(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("the type is null");
        }
        setNettype(str);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject
    public String toString() {
        return encode();
    }

    public void setAddress(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("the addr is null");
        }
        ConnectionAddress connectionAddress = this.address;
        if (connectionAddress == null) {
            this.address = new ConnectionAddress();
            this.address.setAddress(new Host(str));
        } else {
            Host address = connectionAddress.getAddress();
            if (address == null) {
                this.address.setAddress(new Host(str));
            } else {
                address.setAddress(str);
            }
        }
        setAddress(this.address);
    }
}
