package android.gov.nist.javax.sip.address;

import android.gov.nist.core.Debug;
import android.gov.nist.core.GenericObject;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.javax.sip.C10803j;
import android.javax.sip.C10808o;
import java.text.ParseException;
import java.util.Iterator;
import p509Uk.lpqL.SfpOlmlMATQ;
import p571X9.AbstractC9306j0;
import p691d.InterfaceC12945d;
import p713e.InterfaceC13252z;

/* JADX INFO: loaded from: classes.dex */
public class SipUri extends GenericURI implements InterfaceC12945d, SipURIExt {
    private static final long serialVersionUID = 7749781076218987044L;
    protected Authority authority;
    protected NameValueList qheaders;
    protected TelephoneNumber telephoneSubscriber;
    protected NameValueList uriParms;

    public SipUri() {
        this.scheme = "sip";
        this.uriParms = new NameValueList();
        NameValueList nameValueList = new NameValueList();
        this.qheaders = nameValueList;
        nameValueList.setSeparator(Separators.AND);
    }

    public void clearPassword() {
        UserInfo userInfo;
        Authority authority = this.authority;
        if (authority == null || (userInfo = authority.getUserInfo()) == null) {
            return;
        }
        userInfo.clearPassword();
    }

    public void clearQheaders() {
        this.qheaders = new NameValueList();
    }

    public void clearUriParms() {
        this.uriParms = new NameValueList();
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        SipUri sipUri = (SipUri) super.clone();
        Authority authority = this.authority;
        if (authority != null) {
            sipUri.authority = (Authority) authority.clone();
        }
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            sipUri.uriParms = (NameValueList) nameValueList.clone();
        }
        NameValueList nameValueList2 = this.qheaders;
        if (nameValueList2 != null) {
            sipUri.qheaders = (NameValueList) nameValueList2.clone();
        }
        TelephoneNumber telephoneNumber = this.telephoneSubscriber;
        if (telephoneNumber != null) {
            sipUri.telephoneSubscriber = (TelephoneNumber) telephoneNumber.clone();
        }
        return sipUri;
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.javax.sip.address.NetObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC12945d)) {
            return false;
        }
        InterfaceC12945d interfaceC12945d = (InterfaceC12945d) obj;
        if (isSecure() ^ interfaceC12945d.isSecure()) {
            return false;
        }
        if ((getUser() == null) ^ (interfaceC12945d.getUser() == null)) {
            return false;
        }
        if ((getUserPassword() == null) ^ (interfaceC12945d.getUserPassword() == null)) {
            return false;
        }
        if (getUser() != null && !UriDecoder.decode(getUser()).equals(UriDecoder.decode(interfaceC12945d.getUser()))) {
            return false;
        }
        if (getUserPassword() != null && !UriDecoder.decode(getUserPassword()).equals(UriDecoder.decode(interfaceC12945d.getUserPassword()))) {
            return false;
        }
        if ((getHost() == null) ^ (interfaceC12945d.getHost() == null)) {
            return false;
        }
        if ((getHost() != null && !getHost().equalsIgnoreCase(interfaceC12945d.getHost())) || getPort() != interfaceC12945d.getPort()) {
            return false;
        }
        Iterator parameterNames = getParameterNames();
        while (parameterNames.hasNext()) {
            String str = (String) parameterNames.next();
            String parameter = getParameter(str);
            String parameter2 = interfaceC12945d.getParameter(str);
            if (parameter != null && parameter2 != null && !UriDecoder.decode(parameter).equalsIgnoreCase(UriDecoder.decode(parameter2))) {
                return false;
            }
        }
        if ((getTransportParam() == null) ^ (interfaceC12945d.getTransportParam() == null)) {
            return false;
        }
        if ((getUserParam() == null) ^ (interfaceC12945d.getUserParam() == null)) {
            return false;
        }
        if ((getTTLParam() == -1) ^ (interfaceC12945d.getTTLParam() == -1)) {
            return false;
        }
        if ((getMethodParam() == null) ^ (interfaceC12945d.getMethodParam() == null)) {
            return false;
        }
        if ((getMAddrParam() == null) ^ (interfaceC12945d.getMAddrParam() == null)) {
            return false;
        }
        if (getHeaderNames().hasNext() && !interfaceC12945d.getHeaderNames().hasNext()) {
            return false;
        }
        if (!getHeaderNames().hasNext() && interfaceC12945d.getHeaderNames().hasNext()) {
            return false;
        }
        if (getHeaderNames().hasNext() && interfaceC12945d.getHeaderNames().hasNext()) {
            try {
                C10808o c10808oM11071i = C10808o.m11071i();
                if (((InterfaceC13252z) c10808oM11071i.f32040Z) == null) {
                    try {
                        c10808oM11071i.f32040Z = (InterfaceC13252z) Class.forName("gov.nist.".concat("javax.sip.header.HeaderFactoryImpl")).newInstance();
                    } catch (Exception e10) {
                        throw new C10803j("The Peer Factory: gov.nist.javax.sip.header.HeaderFactoryImpl could not be instantiated. Ensure the Path Name has been set.", (Throwable) e10);
                    }
                }
                InterfaceC13252z interfaceC13252z = (InterfaceC13252z) c10808oM11071i.f32040Z;
                Iterator headerNames = getHeaderNames();
                while (headerNames.hasNext()) {
                    String str2 = (String) headerNames.next();
                    String header = getHeader(str2);
                    String header2 = interfaceC12945d.getHeader(str2);
                    if (header == null && header2 != null) {
                        return false;
                    }
                    if (header2 == null && header != null) {
                        return false;
                    }
                    if (header != null || header2 != null) {
                        try {
                            if (!interfaceC13252z.createHeader(str2, UriDecoder.decode(header)).equals(interfaceC13252z.createHeader(str2, UriDecoder.decode(header2)))) {
                                return false;
                            }
                        } catch (ParseException e11) {
                            Debug.logError("Cannot parse one of the header of the sip uris to compare " + this + Separators.f31991SP + interfaceC12945d, e11);
                            return false;
                        }
                    }
                }
            } catch (C10803j e12) {
                Debug.logError("Cannot get the header factory to parse the header of the sip uris to compare", e12);
                return false;
            }
        }
        return true;
    }

    public Authority getAuthority() {
        return this.authority;
    }

    public String getGrParam() {
        return (String) this.uriParms.getValue("gr");
    }

    @Override // p691d.InterfaceC12945d
    public String getHeader(String str) {
        if (this.qheaders.getValue(str) != null) {
            return this.qheaders.getValue(str).toString();
        }
        return null;
    }

    @Override // p691d.InterfaceC12945d
    public Iterator<String> getHeaderNames() {
        return this.qheaders.getNames();
    }

    @Override // p691d.InterfaceC12945d
    public String getHost() {
        Authority authority = this.authority;
        if (authority == null || authority.getHost() == null) {
            return null;
        }
        return this.authority.getHost().encode();
    }

    public HostPort getHostPort() {
        Authority authority = this.authority;
        if (authority == null || authority.getHost() == null) {
            return null;
        }
        return this.authority.getHostPort();
    }

    public String getLrParam() {
        if (hasParameter("lr")) {
            return "true";
        }
        return null;
    }

    @Override // p691d.InterfaceC12945d
    public String getMAddrParam() {
        NameValue nameValue = this.uriParms.getNameValue("maddr");
        if (nameValue == null) {
            return null;
        }
        return (String) nameValue.getValueAsObject();
    }

    public String getMethod() {
        return (String) getParm("method");
    }

    @Override // p691d.InterfaceC12945d
    public String getMethodParam() {
        return getParameter("method");
    }

    @Override // p713e.InterfaceC13200H
    public String getParameter(String str) {
        Object value = this.uriParms.getValue(str);
        if (value == null) {
            return null;
        }
        return value instanceof GenericObject ? ((GenericObject) value).encode() : value.toString();
    }

    @Override // p713e.InterfaceC13200H
    public Iterator<String> getParameterNames() {
        return this.uriParms.getNames();
    }

    public NameValueList getParameters() {
        return this.uriParms;
    }

    public Object getParm(String str) {
        return this.uriParms.getValue(str);
    }

    @Override // p691d.InterfaceC12945d
    public int getPort() {
        HostPort hostPort = getHostPort();
        if (hostPort == null) {
            return -1;
        }
        return hostPort.getPort();
    }

    public NameValueList getQheaders() {
        return this.qheaders;
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, p691d.InterfaceC12947f
    public String getScheme() {
        return this.scheme;
    }

    @Override // p691d.InterfaceC12945d
    public int getTTLParam() {
        Integer num = (Integer) this.uriParms.getValue("ttl");
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public TelephoneNumber getTelephoneSubscriber() {
        if (this.telephoneSubscriber == null) {
            this.telephoneSubscriber = new TelephoneNumber();
        }
        return this.telephoneSubscriber;
    }

    @Override // p691d.InterfaceC12945d
    public String getTransportParam() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            return (String) nameValueList.getValue(android.gov.nist.javax.sip.header.ParameterNames.TRANSPORT);
        }
        return null;
    }

    @Override // p691d.InterfaceC12945d
    public String getUser() {
        return this.authority.getUser();
    }

    public String getUserAtHost() {
        StringBuilder sb2;
        String user = this.authority.getUserInfo() != null ? this.authority.getUserInfo().getUser() : "";
        String strEncode = this.authority.getHost().encode();
        if (user == null || user.equals("")) {
            sb2 = new StringBuilder();
        } else {
            sb2 = new StringBuilder(user);
            sb2.append(Separators.f31989AT);
        }
        sb2.append(strEncode);
        return sb2.toString();
    }

    public String getUserAtHostPort() {
        StringBuilder sb2;
        String user = this.authority.getUserInfo() != null ? this.authority.getUserInfo().getUser() : "";
        String strEncode = this.authority.getHost().encode();
        int port = this.authority.getPort();
        if (user == null || user.equals("")) {
            sb2 = new StringBuilder();
        } else {
            sb2 = new StringBuilder(user);
            sb2.append(Separators.f31989AT);
        }
        if (port == -1) {
            sb2.append(strEncode);
            return sb2.toString();
        }
        sb2.append(strEncode);
        sb2.append(":");
        sb2.append(port);
        return sb2.toString();
    }

    @Override // p691d.InterfaceC12945d
    public String getUserParam() {
        return getParameter("user");
    }

    @Override // p691d.InterfaceC12945d
    public String getUserPassword() {
        Authority authority = this.authority;
        if (authority == null) {
            return null;
        }
        return authority.getPassword();
    }

    public String getUserType() {
        return (String) this.uriParms.getValue("user");
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public boolean hasGrParam() {
        return this.uriParms.getNameValue("gr") != null;
    }

    @Override // p691d.InterfaceC12945d
    public boolean hasLrParam() {
        return this.uriParms.getNameValue("lr") != null;
    }

    public boolean hasParameter(String str) {
        return this.uriParms.getValue(str) != null;
    }

    public boolean hasTransport() {
        return hasParameter(android.gov.nist.javax.sip.header.ParameterNames.TRANSPORT);
    }

    @Override // p691d.InterfaceC12945d
    public boolean isSecure() {
        return getScheme().equalsIgnoreCase("sips");
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, p691d.InterfaceC12947f
    public boolean isSipURI() {
        return true;
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void removeHeader(String str) {
        NameValueList nameValueList = this.qheaders;
        if (nameValueList != null) {
            nameValueList.delete(str);
        }
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void removeHeaders() {
        this.qheaders = new NameValueList();
    }

    public void removeMAddr() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete("maddr");
        }
    }

    public void removeMethod() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete("method");
        }
    }

    @Override // p713e.InterfaceC13200H
    public void removeParameter(String str) {
        this.uriParms.delete(str);
    }

    public void removeParameters() {
        this.uriParms = new NameValueList();
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void removePort() {
        this.authority.removePort();
    }

    public void removeTTL() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete("ttl");
        }
    }

    public void removeTransport() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete(android.gov.nist.javax.sip.header.ParameterNames.TRANSPORT);
        }
    }

    public void removeUser() {
        this.authority.removeUserInfo();
    }

    public void removeUserType() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete("user");
        }
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public void setDefaultParm(String str, Object obj) {
        if (this.uriParms.getValue(str) == null) {
            this.uriParms.set(new NameValue(str, obj));
        }
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setGrParam(String str) {
        this.uriParms.set("gr", str);
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setHeader(String str, String str2) {
        this.qheaders.set(new NameValue(str, str2));
    }

    public void setHost(Host host) {
        if (this.authority == null) {
            this.authority = new Authority();
        }
        this.authority.setHost(host);
    }

    public void setHostPort(HostPort hostPort) {
        if (this.authority == null) {
            this.authority = new Authority();
        }
        this.authority.setHostPort(hostPort);
    }

    public void setIsdnSubAddress(String str) {
        if (this.telephoneSubscriber == null) {
            this.telephoneSubscriber = new TelephoneNumber();
        }
        this.telephoneSubscriber.setIsdnSubaddress(str);
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setLrParam() {
        this.uriParms.set("lr", null);
    }

    public void setMAddr(String str) {
        NameValue nameValue = this.uriParms.getNameValue("maddr");
        Host host = new Host();
        host.setAddress(str);
        if (nameValue != null) {
            nameValue.setValueAsObject(host);
        } else {
            this.uriParms.set(new NameValue("maddr", host));
        }
    }

    @Override // p691d.InterfaceC12945d
    public void setMAddrParam(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("bad maddr");
        }
        setParameter("maddr", str);
    }

    public void setMethod(String str) {
        this.uriParms.set("method", str);
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setMethodParam(String str) throws ParseException {
        setParameter("method", str);
    }

    @Override // p713e.InterfaceC13200H
    public void setParameter(String str, String str2) throws ParseException {
        if (str.equalsIgnoreCase("ttl")) {
            try {
                Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                throw new ParseException(AbstractC9306j0.m9889h("bad parameter ", str2), 0);
            }
        }
        this.uriParms.set(str, str2);
    }

    @Override // p691d.InterfaceC12945d
    public void setPort(int i10) {
        if (this.authority == null) {
            this.authority = new Authority();
        }
        this.authority.setPort(i10);
    }

    public void setQHeader(NameValue nameValue) {
        this.qheaders.set(nameValue);
    }

    public void setQheaders(NameValueList nameValueList) {
        this.qheaders = nameValueList;
    }

    public void setScheme(String str) {
        if (str.compareToIgnoreCase("sip") != 0 && str.compareToIgnoreCase("sips") != 0) {
            throw new IllegalArgumentException("bad scheme ".concat(str));
        }
        this.scheme = str.toLowerCase();
    }

    @Override // p691d.InterfaceC12945d
    public void setSecure(boolean z6) {
        if (z6) {
            this.scheme = "sips";
        } else {
            this.scheme = "sip";
        }
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setTTLParam(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Bad ttl value");
        }
        if (this.uriParms != null) {
            this.uriParms.set(new NameValue("ttl", Integer.valueOf(i10)));
        }
    }

    public void setTelephoneSubscriber(TelephoneNumber telephoneNumber) {
        this.telephoneSubscriber = telephoneNumber;
    }

    @Override // p691d.InterfaceC12945d
    public void setTransportParam(String str) {
        if (str == null) {
            throw new NullPointerException("null arg");
        }
        this.uriParms.set(new NameValue(android.gov.nist.javax.sip.header.ParameterNames.TRANSPORT, str.toLowerCase()));
    }

    public void setUriParameter(NameValue nameValue) {
        this.uriParms.set(nameValue);
    }

    public void setUriParm(String str, Object obj) {
        this.uriParms.set(new NameValue(str, obj));
    }

    public void setUriParms(NameValueList nameValueList) {
        this.uriParms = nameValueList;
    }

    @Override // p691d.InterfaceC12945d
    public void setUser(String str) {
        if (this.authority == null) {
            this.authority = new Authority();
        }
        this.authority.setUser(str);
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setUserParam(String str) {
        this.uriParms.set("user", str);
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setUserPassword(String str) {
        if (this.authority == null) {
            this.authority = new Authority();
        }
        this.authority.setPassword(str);
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.javax.sip.address.NetObject, p691d.InterfaceC12947f
    public String toString() {
        return encode();
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb2) {
        sb2.append(this.scheme);
        sb2.append(":");
        Authority authority = this.authority;
        if (authority != null) {
            authority.encode(sb2);
        }
        if (!this.uriParms.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.uriParms.encode(sb2);
        }
        if (!this.qheaders.isEmpty()) {
            sb2.append(Separators.QUESTION);
            this.qheaders.encode(sb2);
        }
        return sb2;
    }

    public boolean isUserTelephoneSubscriber() {
        String str = (String) this.uriParms.getValue(SfpOlmlMATQ.IrdqTXvRkFzdiC);
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase("phone");
    }

    @Override // p691d.InterfaceC12945d
    public void setHost(String str) {
        setHost(new Host(str));
    }
}
