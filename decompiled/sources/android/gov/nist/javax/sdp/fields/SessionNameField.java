package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Separators;
import p571X9.AbstractC9306j0;
import p668c.C11547g;
import p668c.InterfaceC11551k;

/* JADX INFO: loaded from: classes.dex */
public class SessionNameField extends SDPField implements InterfaceC11551k {
    protected String sessionName;

    public SessionNameField() {
        super(SDPFieldNames.SESSION_NAME_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return AbstractC9306j0.m9891j(this.sessionName, Separators.NEWLINE, new StringBuilder(SDPFieldNames.SESSION_NAME_FIELD));
    }

    public String getSessionName() {
        return this.sessionName;
    }

    public String getValue() {
        return getSessionName();
    }

    public void setSessionName(String str) {
        this.sessionName = str;
    }

    public void setValue(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The value is null");
        }
        setSessionName(str);
    }
}
