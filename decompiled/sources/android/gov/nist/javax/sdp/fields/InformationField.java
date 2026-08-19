package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Separators;
import p571X9.AbstractC9306j0;
import p668c.C11547g;
import p668c.InterfaceC11543c;

/* JADX INFO: loaded from: classes.dex */
public class InformationField extends SDPField implements InterfaceC11543c {
    protected String information;

    public InformationField() {
        super(SDPFieldNames.INFORMATION_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return AbstractC9306j0.m9891j(this.information, Separators.NEWLINE, new StringBuilder(SDPFieldNames.INFORMATION_FIELD));
    }

    public String getInformation() {
        return this.information;
    }

    public String getValue() {
        return this.information;
    }

    public void setInformation(String str) {
        this.information = str;
    }

    public void setValue(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The value is null");
        }
        setInformation(str);
    }
}
