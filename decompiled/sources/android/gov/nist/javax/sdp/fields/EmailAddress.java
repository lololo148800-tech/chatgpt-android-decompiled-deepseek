package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Separators;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes.dex */
public class EmailAddress extends SDPObject {
    protected String displayName;
    protected Email email;

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        EmailAddress emailAddress = (EmailAddress) super.clone();
        Email email = this.email;
        if (email != null) {
            emailAddress.email = (Email) email.clone();
        }
        return emailAddress;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String strM9891j;
        if (this.displayName != null) {
            strM9891j = AbstractC9306j0.m9891j(this.displayName, Separators.LESS_THAN, new StringBuilder());
        } else {
            strM9891j = "";
        }
        StringBuilder sbM9893l = AbstractC9306j0.m9893l(strM9891j);
        sbM9893l.append(this.email.encode());
        String string = sbM9893l.toString();
        return this.displayName != null ? AbstractC10763a.m11052j(string, Separators.GREATER_THAN) : string;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
