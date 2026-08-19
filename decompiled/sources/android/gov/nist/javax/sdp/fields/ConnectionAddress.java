package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Host;
import android.gov.nist.core.Separators;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionAddress extends SDPObject {
    protected Host address;
    protected int port;
    protected int ttl;

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ConnectionAddress connectionAddress = (ConnectionAddress) super.clone();
        Host host = this.address;
        if (host != null) {
            connectionAddress.address = (Host) host.clone();
        }
        return connectionAddress;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String strEncode;
        Host host = this.address;
        if (host != null) {
            strEncode = host.encode();
            if (Host.isIPv6Reference(strEncode)) {
                strEncode = strEncode.substring(1, strEncode.length() - 1);
            }
        } else {
            strEncode = "";
        }
        int i10 = this.ttl;
        if (i10 == 0 || this.port == 0) {
            if (i10 == 0) {
                return strEncode;
            }
            StringBuilder sbM9895n = AbstractC9306j0.m9895n(strEncode, Separators.SLASH);
            sbM9895n.append(this.ttl);
            return sbM9895n.toString();
        }
        StringBuilder sbM9895n2 = AbstractC9306j0.m9895n(strEncode, Separators.SLASH);
        sbM9895n2.append(this.ttl);
        sbM9895n2.append(Separators.SLASH);
        sbM9895n2.append(this.port);
        return sbM9895n2.toString();
    }

    public Host getAddress() {
        return this.address;
    }

    public int getPort() {
        return this.port;
    }

    public int getTtl() {
        return this.ttl;
    }

    public void setAddress(Host host) {
        this.address = host;
    }

    public void setPort(int i10) {
        this.port = i10;
    }

    public void setTtl(int i10) {
        this.ttl = i10;
    }
}
