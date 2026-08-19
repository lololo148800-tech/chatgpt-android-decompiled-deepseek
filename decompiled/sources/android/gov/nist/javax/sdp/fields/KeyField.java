package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Separators;
import p571X9.AbstractC9306j0;
import p668c.C11547g;
import p668c.InterfaceC11544d;

/* JADX INFO: loaded from: classes.dex */
public class KeyField extends SDPField implements InterfaceC11544d {
    protected String keyData;
    protected String type;

    public KeyField() {
        super(SDPFieldNames.KEY_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String string = SDPFieldNames.KEY_FIELD + this.type;
        if (this.keyData != null) {
            StringBuilder sbM9893l = AbstractC9306j0.m9893l(AbstractC10763a.m11052j(string, ":"));
            sbM9893l.append(this.keyData);
            string = sbM9893l.toString();
        }
        return AbstractC10763a.m11052j(string, Separators.NEWLINE);
    }

    public String getKey() {
        return getKeyData();
    }

    public String getKeyData() {
        return this.keyData;
    }

    public String getMethod() {
        return this.type;
    }

    public String getType() {
        return this.type;
    }

    public boolean hasKey() {
        return getKeyData() != null;
    }

    public void setKey(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The key is null");
        }
        setKeyData(str);
    }

    public void setKeyData(String str) {
        this.keyData = str;
    }

    public void setMethod(String str) {
        this.type = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
