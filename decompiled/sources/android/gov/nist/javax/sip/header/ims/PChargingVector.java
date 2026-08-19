package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.C10807n;
import java.text.ParseException;
import p713e.InterfaceC13248v;
import p926of.yRae.sVDIzpC;

/* JADX INFO: loaded from: classes.dex */
public class PChargingVector extends ParametersHeader implements PChargingVectorHeader, SIPHeaderNamesIms, InterfaceC13248v {
    public PChargingVector() {
        super("P-Charging-Vector");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        if (getNameValue(ParameterNamesIms.ICID_VALUE) != null) {
            this.parameters.encode(sb2);
        } else {
            try {
                throw new C10807n("icid-value is mandatory");
            } catch (C10807n e10) {
                e10.printStackTrace();
            }
        }
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getICID() {
        return getParameter(ParameterNamesIms.ICID_VALUE);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getOriginatingIOI() {
        return getParameter(ParameterNamesIms.ORIG_IOI);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getTerminatingIOI() {
        return getParameter(ParameterNamesIms.TERM_IOI);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setICID(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, P-Charging-Vector, setICID(), the icid parameter is null.");
        }
        setParameter(ParameterNamesIms.ICID_VALUE, str);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setICIDGeneratedAt(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, P-Charging-Vector, setICIDGeneratedAt(), the host parameter is null.");
        }
        setParameter(ParameterNamesIms.ICID_GENERATED_AT, str);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setOriginatingIOI(String str) {
        if (str == null || str.length() == 0) {
            removeParameter(ParameterNamesIms.ORIG_IOI);
        } else {
            this.parameters.set(ParameterNamesIms.ORIG_IOI, str);
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setTerminatingIOI(String str) {
        if (str == null || str.length() == 0) {
            removeParameter(ParameterNamesIms.TERM_IOI);
        } else {
            this.parameters.set(ParameterNamesIms.TERM_IOI, str);
        }
    }

    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getICIDGeneratedAt() {
        return getParameter(sVDIzpC.ZkwQo);
    }
}
