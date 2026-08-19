package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import p713e.InterfaceC13208P;
import sj.hJY.CsqksqyPE;

/* JADX INFO: loaded from: classes.dex */
public class RecordRoute extends AddressParametersHeader implements InterfaceC13208P {
    private static final long serialVersionUID = 2388023364181727205L;

    public RecordRoute(AddressImpl addressImpl) {
        super(SIPHeaderNames.RECORD_ROUTE);
        this.address = addressImpl;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
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
        if (!this.parameters.isEmpty()) {
            sb2.append(CsqksqyPE.wmeHuChp);
            this.parameters.encode(sb2);
        }
        return sb2;
    }

    public RecordRoute() {
        super(SIPHeaderNames.RECORD_ROUTE);
    }
}
