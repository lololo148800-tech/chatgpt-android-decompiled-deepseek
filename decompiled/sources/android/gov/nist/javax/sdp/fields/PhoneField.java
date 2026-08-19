package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Separators;
import p571X9.AbstractC9306j0;
import p668c.C11547g;
import p668c.InterfaceC11542b;

/* JADX INFO: loaded from: classes.dex */
public class PhoneField extends SDPField implements InterfaceC11542b {
    protected String name;
    protected String phoneNumber;

    public PhoneField() {
        super(SDPFieldNames.PHONE_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.name;
        String strM9891j = SDPFieldNames.PHONE_FIELD;
        if (str != null) {
            strM9891j = AbstractC9306j0.m9891j(this.name, Separators.LESS_THAN, new StringBuilder(SDPFieldNames.PHONE_FIELD));
        }
        StringBuilder sbM9893l = AbstractC9306j0.m9893l(strM9891j);
        sbM9893l.append(this.phoneNumber);
        String string = sbM9893l.toString();
        if (this.name != null) {
            string = AbstractC10763a.m11052j(string, Separators.GREATER_THAN);
        }
        return AbstractC10763a.m11052j(string, Separators.NEWLINE);
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getValue() {
        return getName();
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setValue(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The value parameter is null");
        }
        setName(str);
    }
}
