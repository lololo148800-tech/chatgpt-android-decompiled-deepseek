package android.gov.nist.javax.sip.address;

import android.gov.nist.core.HostPort;
import android.gov.nist.core.Separators;
import p658b5.p659zh.MMVKXkcLpuHFDi;
import p691d.InterfaceC12942a;
import p691d.InterfaceC12947f;

/* JADX INFO: loaded from: classes.dex */
public final class AddressImpl extends NetObject implements InterfaceC12942a {
    public static final int ADDRESS_SPEC = 2;
    public static final int NAME_ADDR = 1;
    public static final int WILD_CARD = 3;
    private static final long serialVersionUID = 429592779568617259L;
    protected GenericURI address;
    protected int addressType = 1;
    protected String displayName;

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        AddressImpl addressImpl = (AddressImpl) super.clone();
        GenericURI genericURI = this.address;
        if (genericURI != null) {
            addressImpl.address = (GenericURI) genericURI.clone();
        }
        return addressImpl;
    }

    @Override // android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.address.NetObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC12942a) {
            return getURI().equals(((InterfaceC12942a) obj).getURI());
        }
        return false;
    }

    public int getAddressType() {
        return this.addressType;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public HostPort getHostPort() {
        GenericURI genericURI = this.address;
        if (genericURI instanceof SipUri) {
            return ((SipUri) genericURI).getHostPort();
        }
        throw new RuntimeException("address is not a SipUri");
    }

    public int getPort() {
        GenericURI genericURI = this.address;
        if (genericURI instanceof SipUri) {
            return ((SipUri) genericURI).getHostPort().getPort();
        }
        throw new RuntimeException("address is not a SipUri");
    }

    @Override // p691d.InterfaceC12942a
    public InterfaceC12947f getURI() {
        return this.address;
    }

    public String getUserAtHostPort() {
        GenericURI genericURI = this.address;
        return genericURI instanceof SipUri ? ((SipUri) genericURI).getUserAtHostPort() : genericURI.toString();
    }

    public boolean hasDisplayName() {
        return this.displayName != null;
    }

    public int hashCode() {
        return this.address.hashCode();
    }

    public boolean isSIPAddress() {
        return this.address instanceof SipUri;
    }

    public boolean isWildcard() {
        return this.addressType == 3;
    }

    @Override // android.gov.nist.javax.sip.address.NetObject, android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!(obj instanceof InterfaceC12942a)) {
            return false;
        }
        AddressImpl addressImpl = (AddressImpl) obj;
        if (addressImpl.getMatcher() != null) {
            return addressImpl.getMatcher().match(encode());
        }
        String str = addressImpl.displayName;
        if (str != null && this.displayName == null) {
            return false;
        }
        if (str == null) {
            return this.address.match(addressImpl.address);
        }
        return this.displayName.equalsIgnoreCase(str) && this.address.match(addressImpl.address);
    }

    public void removeDisplayName() {
        this.displayName = null;
    }

    public void removeParameter(String str) {
        GenericURI genericURI = this.address;
        if (!(genericURI instanceof SipUri)) {
            throw new RuntimeException("address is not a SipUri");
        }
        ((SipUri) genericURI).removeParameter(str);
    }

    public void setAddess(InterfaceC12947f interfaceC12947f) {
        this.address = (GenericURI) interfaceC12947f;
    }

    public void setAddressType(int i10) {
        this.addressType = i10;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
        this.addressType = 1;
    }

    public void setURI(InterfaceC12947f interfaceC12947f) {
        this.address = (GenericURI) interfaceC12947f;
    }

    public void setUser(String str) {
        ((SipUri) this.address).setUser(str);
    }

    public void setWildCardFlag() {
        this.addressType = 3;
        SipUri sipUri = new SipUri();
        this.address = sipUri;
        sipUri.setUser(Separators.STAR);
    }

    @Override // android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb2) {
        if (this.addressType == 3) {
            sb2.append('*');
        } else {
            if (this.displayName != null) {
                sb2.append(Separators.DOUBLE_QUOTE);
                sb2.append(this.displayName);
                sb2.append(Separators.DOUBLE_QUOTE);
                sb2.append(Separators.f31991SP);
            }
            if (this.address != null) {
                if (this.addressType == 1 || this.displayName != null) {
                    sb2.append(Separators.LESS_THAN);
                }
                this.address.encode(sb2);
                if (this.addressType == 1 || this.displayName != null) {
                    sb2.append(Separators.GREATER_THAN);
                }
            }
        }
        return sb2;
    }

    public String getHost() {
        GenericURI genericURI = this.address;
        if (genericURI instanceof SipUri) {
            return ((SipUri) genericURI).getHostPort().getHost().getHostname();
        }
        throw new RuntimeException(MMVKXkcLpuHFDi.WmSmuH);
    }
}
