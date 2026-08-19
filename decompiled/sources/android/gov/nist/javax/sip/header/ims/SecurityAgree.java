package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.C10800g;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public abstract class SecurityAgree extends ParametersHeader {
    private String secMechanism;

    public SecurityAgree(String str) {
        super(str);
        this.parameters.setSeparator(Separators.SEMICOLON);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        SecurityAgree securityAgree = (SecurityAgree) super.clone();
        String str = this.secMechanism;
        if (str != null) {
            securityAgree.secMechanism = str;
        }
        return securityAgree;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.secMechanism);
        sb2.append(Separators.SEMICOLON);
        sb2.append(Separators.f31991SP);
        return this.parameters.encode(sb2);
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (!(obj instanceof SecurityAgreeHeader)) {
            return false;
        }
        SecurityAgreeHeader securityAgreeHeader = (SecurityAgreeHeader) obj;
        return getSecurityMechanism().equals(securityAgreeHeader.getSecurityMechanism()) && equalParameters(securityAgreeHeader);
    }

    public String getAlgorithm() {
        return getParameter(ParameterNamesIms.ALG);
    }

    public String getEncryptionAlgorithm() {
        return getParameter(ParameterNamesIms.EALG);
    }

    public String getMode() {
        return getParameter(ParameterNamesIms.MOD);
    }

    public int getPortClient() {
        return Integer.parseInt(getParameter(ParameterNamesIms.PORT_C));
    }

    public int getPortServer() {
        return Integer.parseInt(getParameter(ParameterNamesIms.PORT_S));
    }

    public float getPreference() {
        return Float.parseFloat(getParameter("q"));
    }

    public String getProtocol() {
        return getParameter(ParameterNamesIms.PROT);
    }

    public int getSPIClient() {
        return Integer.parseInt(getParameter(ParameterNamesIms.SPI_C));
    }

    public int getSPIServer() {
        return Integer.parseInt(getParameter(ParameterNamesIms.SPI_S));
    }

    public String getSecurityMechanism() {
        return this.secMechanism;
    }

    public void setAlgorithm(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, SecurityClient, setAlgorithm(), the algorithm parameter is null");
        }
        setParameter(ParameterNamesIms.ALG, str);
    }

    public void setEncryptionAlgorithm(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, SecurityClient, setEncryptionAlgorithm(), the encryption-algorithm parameter is null");
        }
        setParameter(ParameterNamesIms.EALG, str);
    }

    public void setMode(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, SecurityClient, setMode(), the mode parameter is null");
        }
        setParameter(ParameterNamesIms.MOD, str);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, p713e.InterfaceC13200H
    public void setParameter(String str, String str2) throws ParseException {
        if (str2 == null) {
            throw new NullPointerException("null value");
        }
        NameValue nameValue = this.parameters.getNameValue(str.toLowerCase());
        if (nameValue != null) {
            nameValue.setValueAsObject(str2);
            return;
        }
        NameValue nameValue2 = new NameValue(str, str2);
        if (str.equalsIgnoreCase(ParameterNamesIms.D_VER)) {
            nameValue2.setQuotedValue();
            if (str2.startsWith(Separators.DOUBLE_QUOTE)) {
                throw new ParseException(str2.concat(" : Unexpected DOUBLE_QUOTE"), 0);
            }
        }
        super.setParameter(nameValue2);
    }

    public void setPortClient(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g("JAIN-SIP Exception, SecurityClient, setPortClient(), the port-c parameter is <0");
        }
        setParameter(ParameterNamesIms.PORT_C, i10);
    }

    public void setPortServer(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g("JAIN-SIP Exception, SecurityClient, setPortServer(), the port-s parameter is <0");
        }
        setParameter(ParameterNamesIms.PORT_S, i10);
    }

    public void setPreference(float f10) throws C10800g {
        if (f10 < 0.0f) {
            throw new C10800g("JAIN-SIP Exception, SecurityClient, setPreference(), the preference (q) parameter is <0");
        }
        setParameter("q", f10);
    }

    public void setProtocol(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, SecurityClient, setProtocol(), the protocol parameter is null");
        }
        setParameter(ParameterNamesIms.PROT, str);
    }

    public void setSPIClient(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g("JAIN-SIP Exception, SecurityClient, setSPIClient(), the spi-c parameter is <0");
        }
        setParameter(ParameterNamesIms.SPI_C, i10);
    }

    public void setSPIServer(int i10) throws C10800g {
        if (i10 < 0) {
            throw new C10800g("JAIN-SIP Exception, SecurityClient, setSPIServer(), the spi-s parameter is <0");
        }
        setParameter(ParameterNamesIms.SPI_S, i10);
    }

    public void setSecurityMechanism(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, SecurityAgree, setSecurityMechanism(), the sec-mechanism parameter is null");
        }
        this.secMechanism = str;
    }

    public SecurityAgree() {
        this.parameters.setSeparator(Separators.SEMICOLON);
    }
}
