package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.WWWAuthenticate;

/* JADX INFO: loaded from: classes.dex */
public class WWWAuthenticateParser extends ChallengeParser {
    public WWWAuthenticateParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("parse");
        }
        try {
            headerName(TokenTypes.WWW_AUTHENTICATE);
            WWWAuthenticate wWWAuthenticate = new WWWAuthenticate();
            super.parse(wWWAuthenticate);
            return wWWAuthenticate;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
        }
    }

    public WWWAuthenticateParser(Lexer lexer) {
        super(lexer);
    }
}
