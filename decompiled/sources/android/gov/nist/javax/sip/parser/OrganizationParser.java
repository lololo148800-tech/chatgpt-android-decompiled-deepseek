package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.Organization;
import android.gov.nist.javax.sip.header.SIPHeader;

/* JADX INFO: loaded from: classes.dex */
public class OrganizationParser extends HeaderParser {
    public OrganizationParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("OrganizationParser.parse");
        }
        Organization organization = new Organization();
        try {
            headerName(TokenTypes.ORGANIZATION);
            organization.setOrganization(this.lexer.getRest().trim());
            return organization;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("OrganizationParser.parse");
            }
        }
    }

    public OrganizationParser(Lexer lexer) {
        super(lexer);
    }
}
