package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.SIPHeader;

/* JADX INFO: loaded from: classes.dex */
public class CallIDParser extends HeaderParser {
    public CallIDParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("parse");
        }
        try {
            this.lexer.match(TokenTypes.CALL_ID);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            CallID callID = new CallID();
            this.lexer.SPorHT();
            callID.setCallId(this.lexer.getRest().trim());
            return callID;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
        }
    }

    public CallIDParser(Lexer lexer) {
        super(lexer);
    }
}
