package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Token;
import android.gov.nist.javax.sip.header.AuthenticationHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ChallengeParser extends HeaderParser {
    public ChallengeParser(String str) {
        super(str);
    }

    public void parse(AuthenticationHeader authenticationHeader) throws ParseException {
        this.lexer.SPorHT();
        this.lexer.match(4095);
        Token nextToken = this.lexer.getNextToken();
        this.lexer.SPorHT();
        authenticationHeader.setScheme(nextToken.getTokenValue());
        while (this.lexer.lookAhead(0) != '\n') {
            parseParameter(authenticationHeader);
            this.lexer.SPorHT();
            char cLookAhead = this.lexer.lookAhead(0);
            if (cLookAhead == '\n' || cLookAhead == 0) {
                return;
            }
            this.lexer.match(44);
            this.lexer.SPorHT();
        }
    }

    public void parseParameter(AuthenticationHeader authenticationHeader) {
        if (ParserCore.debug) {
            dbg_enter("parseParameter");
        }
        try {
            authenticationHeader.setParameter(nameValue('='));
        } finally {
            if (ParserCore.debug) {
                dbg_leave("parseParameter");
            }
        }
    }

    public ChallengeParser(Lexer lexer) {
        super(lexer);
    }
}
