package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PUserDatabase;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.ParametersParser;
import android.gov.nist.javax.sip.parser.TokenTypes;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class PUserDatabaseParser extends ParametersParser implements TokenTypes {
    public PUserDatabaseParser(String str) {
        super(str);
    }

    private void parseheader(PUserDatabase pUserDatabase) throws ParseException {
        StringBuilder sb2 = new StringBuilder();
        this.lexer.match(60);
        while (this.lexer.hasMoreChars()) {
            char nextChar = this.lexer.getNextChar();
            if (nextChar != '>' && nextChar != '\n') {
                sb2.append(nextChar);
            }
        }
        pUserDatabase.setDatabaseName(sb2.toString());
        super.parse(pUserDatabase);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("PUserDatabase.parse");
        }
        try {
            this.lexer.match(TokenTypes.P_USER_DATABASE);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            PUserDatabase pUserDatabase = new PUserDatabase();
            parseheader(pUserDatabase);
            return pUserDatabase;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("PUserDatabase.parse");
            }
        }
    }

    public PUserDatabaseParser(Lexer lexer) {
        super(lexer);
    }
}
