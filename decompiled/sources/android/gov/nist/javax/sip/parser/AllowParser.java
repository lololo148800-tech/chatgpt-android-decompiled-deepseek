package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.Allow;
import android.gov.nist.javax.sip.header.AllowList;
import android.gov.nist.javax.sip.header.SIPHeader;

/* JADX INFO: loaded from: classes.dex */
public class AllowParser extends HeaderParser {
    public AllowParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("AllowParser.parse");
        }
        AllowList allowList = new AllowList();
        try {
            headerName(TokenTypes.ALLOW);
            Allow allow = new Allow();
            allowList.add(allow);
            if (this.lexer.startsId()) {
                allow.setMethod(this.lexer.match(4095).getTokenValue());
                this.lexer.SPorHT();
                while (this.lexer.lookAhead(0) == ',') {
                    this.lexer.match(44);
                    this.lexer.SPorHT();
                    Allow allow2 = new Allow();
                    allow2.setMethod(this.lexer.match(4095).getTokenValue());
                    allowList.add(allow2);
                    this.lexer.SPorHT();
                }
            }
            this.lexer.match(10);
            return allowList;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("AllowParser.parse");
            }
        }
    }

    public AllowParser(Lexer lexer) {
        super(lexer);
    }
}
