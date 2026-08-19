package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParametersHeader;
import java.text.ParseException;
import p713e.InterfaceC13248v;

/* JADX INFO: loaded from: classes.dex */
public class PUserDatabase extends ParametersHeader implements PUserDatabaseHeader, SIPHeaderNamesIms, InterfaceC13248v {
    private String databaseName;

    public PUserDatabase(String str) {
        super("P-User-Database");
        this.databaseName = str;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        return (PUserDatabase) super.clone();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(Separators.LESS_THAN);
        if (getDatabaseName() != null) {
            sb2.append(getDatabaseName());
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        sb2.append(Separators.GREATER_THAN);
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof PUserDatabaseHeader) && super.equals(obj);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PUserDatabaseHeader
    public String getDatabaseName() {
        return this.databaseName;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PUserDatabaseHeader
    public void setDatabaseName(String str) {
        if (str == null || str.equals(Separators.f31991SP)) {
            throw new NullPointerException("Database name is null");
        }
        if (str.contains("aaa://")) {
            this.databaseName = str;
        } else {
            this.databaseName = "aaa://".concat(str);
        }
    }

    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }

    public PUserDatabase() {
        super("P-User-Database");
    }
}
