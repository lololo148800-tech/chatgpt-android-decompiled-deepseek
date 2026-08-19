package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.NameValue;
import android.gov.nist.javax.sip.header.ParametersHeader;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import p713e.InterfaceC13248v;

/* JADX INFO: loaded from: classes.dex */
public class PChargingFunctionAddresses extends ParametersHeader implements PChargingFunctionAddressesHeader, SIPHeaderNamesIms, InterfaceC13248v {
    public PChargingFunctionAddresses() {
        super("P-Charging-Function-Addresses");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void addChargingCollectionFunctionAddress(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, P-Charging-Function-Addresses, setChargingCollectionFunctionAddress(), the ccfAddress parameter is null.");
        }
        this.parameters.set(ParameterNamesIms.CCF, str);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void addEventChargingFunctionAddress(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, P-Charging-Function-Addresses, setEventChargingFunctionAddress(), the ecfAddress parameter is null.");
        }
        this.parameters.set(ParameterNamesIms.ECF, str);
    }

    public boolean delete(String str, String str2) {
        Iterator<NameValue> it = this.parameters.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            NameValue next = it.next();
            if (((String) next.getValueAsObject()).equalsIgnoreCase(str) && next.getName().equalsIgnoreCase(str2)) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        if (!this.duplicates.isEmpty()) {
            this.duplicates.encode(sb2);
        }
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public ListIterator getChargingCollectionFunctionAddresses() {
        LinkedList linkedList = new LinkedList();
        for (NameValue nameValue : this.parameters) {
            if (nameValue.getName().equalsIgnoreCase(ParameterNamesIms.CCF)) {
                NameValue nameValue2 = new NameValue();
                nameValue2.setName(nameValue.getName());
                nameValue2.setValueAsObject(nameValue.getValueAsObject());
                linkedList.add(nameValue2);
            }
        }
        return linkedList.listIterator();
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public ListIterator<NameValue> getEventChargingFunctionAddresses() {
        LinkedList linkedList = new LinkedList();
        ListIterator<NameValue> listIterator = linkedList.listIterator();
        for (NameValue nameValue : this.parameters) {
            if (nameValue.getName().equalsIgnoreCase(ParameterNamesIms.ECF)) {
                NameValue nameValue2 = new NameValue();
                nameValue2.setName(nameValue.getName());
                nameValue2.setValueAsObject(nameValue.getValueAsObject());
                listIterator.add(nameValue2);
            }
        }
        return listIterator;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void removeChargingCollectionFunctionAddress(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, P-Charging-Function-Addresses, setChargingCollectionFunctionAddress(), the ccfAddress parameter is null.");
        }
        if (!delete(str, ParameterNamesIms.CCF)) {
            throw new ParseException("CCF Address Not Removed", 0);
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void removeEventChargingFunctionAddress(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, P-Charging-Function-Addresses, setEventChargingFunctionAddress(), the ecfAddress parameter is null.");
        }
        if (!delete(str, ParameterNamesIms.ECF)) {
            throw new ParseException("ECF Address Not Removed", 0);
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void setChargingCollectionFunctionAddress(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, P-Charging-Function-Addresses, setChargingCollectionFunctionAddress(), the ccfAddress parameter is null.");
        }
        setMultiParameter(ParameterNamesIms.CCF, str);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void setEventChargingFunctionAddress(String str) {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, P-Charging-Function-Addresses, setEventChargingFunctionAddress(), the ecfAddress parameter is null.");
        }
        setMultiParameter(ParameterNamesIms.ECF, str);
    }

    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
