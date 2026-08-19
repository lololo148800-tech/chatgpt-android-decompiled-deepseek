package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Separators;
import p668c.C11547g;
import p668c.InterfaceC11542b;

/* JADX INFO: loaded from: classes.dex */
public class EmailField extends SDPField implements InterfaceC11542b {
    protected EmailAddress emailAddress;

    public EmailField() {
        super(SDPFieldNames.EMAIL_FIELD);
        this.emailAddress = new EmailAddress();
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        EmailField emailField = (EmailField) super.clone();
        EmailAddress emailAddress = this.emailAddress;
        if (emailAddress != null) {
            emailField.emailAddress = (EmailAddress) emailAddress.clone();
        }
        return emailField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return SDPFieldNames.EMAIL_FIELD + this.emailAddress.encode() + Separators.NEWLINE;
    }

    public EmailAddress getEmailAddress() {
        return this.emailAddress;
    }

    public String getValue() {
        EmailAddress emailAddress = this.emailAddress;
        if (emailAddress == null) {
            return null;
        }
        return emailAddress.getDisplayName();
    }

    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setValue(String str) throws C11547g {
        if (str == null) {
            throw new C11547g("The value is null");
        }
        this.emailAddress.setDisplayName(str);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject
    public String toString() {
        return encode();
    }
}
