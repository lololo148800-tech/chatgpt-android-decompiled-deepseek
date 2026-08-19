package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Host;
import android.gov.nist.core.Separators;
import p668c.C11547g;
import p668c.InterfaceC11546f;

/* JADX INFO: loaded from: classes.dex */
public class OriginField extends SDPField implements InterfaceC11546f {
    protected Host address;
    protected String addrtype;
    protected String nettype;
    private String sessIdString;
    private String sessVersionString;
    protected String username;

    public OriginField() {
        super(SDPFieldNames.ORIGIN_FIELD);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        OriginField originField = (OriginField) super.clone();
        Host host = this.address;
        if (host != null) {
            originField.address = (Host) host.clone();
        }
        return originField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String strEncode;
        Host host = this.address;
        if (host != null) {
            strEncode = host.encode();
            if (Host.isIPv6Reference(strEncode)) {
                strEncode = strEncode.substring(1, strEncode.length() - 1);
            }
        } else {
            strEncode = null;
        }
        return SDPFieldNames.ORIGIN_FIELD + this.username + Separators.f31991SP + this.sessIdString + Separators.f31991SP + this.sessVersionString + Separators.f31991SP + this.nettype + Separators.f31991SP + this.addrtype + Separators.f31991SP + strEncode + Separators.NEWLINE;
    }

    public String getAddress() {
        Host host = getHost();
        if (host == null) {
            return null;
        }
        return host.getAddress();
    }

    public String getAddressType() {
        return getAddrtype();
    }

    public String getAddrtype() {
        return this.addrtype;
    }

    public Host getHost() {
        return this.address;
    }

    public String getNettype() {
        return this.nettype;
    }

    public String getNetworkType() {
        return getNettype();
    }

    public long getSessId() {
        return Long.valueOf(this.sessIdString).longValue();
    }

    public String getSessIdAsString() {
        return this.sessIdString;
    }

    public long getSessVersion() {
        return Long.valueOf(this.sessVersionString).longValue();
    }

    public String getSessVersionAsString() {
        return this.sessVersionString;
    }

    public long getSessionId() {
        return getSessId();
    }

    public long getSessionVersion() {
        return getSessVersion();
    }

    public String getUsername() {
        return this.username;
    }

    public void setAddress(Host host) {
        this.address = host;
    }

    public void setAddressType(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The type parameter is <0");
        }
        setAddrtype(str);
    }

    public void setAddrtype(String str) {
        this.addrtype = str;
    }

    public void setNettype(String str) {
        this.nettype = str;
    }

    public void setNetworkType(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The type parameter is <0");
        }
        setNettype(str);
    }

    public void setSessId(long j10) {
        this.sessIdString = Long.toString(j10);
    }

    public void setSessVersion(long j10) {
        this.sessVersionString = Long.toString(j10);
    }

    public void setSessionId(String str) {
        this.sessIdString = str;
    }

    public void setSessionVersion(long j10) throws C11547g {
        if (j10 < 0) {
            throw new C11547g("The version parameter is <0");
        }
        setSessVersion(j10);
    }

    public void setUsername(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The user parameter is null");
        }
        this.username = str;
    }

    public void setAddress(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The addr parameter is null");
        }
        Host host = getHost();
        if (host == null) {
            host = new Host();
        }
        host.setAddress(str);
        setAddress(host);
    }

    public void setSessVersion(String str) {
        this.sessVersionString = str;
    }

    public void setSessionId(long j10) throws C11547g {
        if (j10 < 0) {
            throw new C11547g("The is parameter is <0");
        }
        setSessId(j10);
    }
}
