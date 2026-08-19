package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.Reason;
import android.gov.nist.javax.sip.header.ReasonList;
import android.gov.nist.javax.sip.header.SIPHeader;

/* JADX INFO: loaded from: classes.dex */
public class ReasonParser extends ParametersParser {
    public ReasonParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        ReasonList reasonList = new ReasonList();
        if (ParserCore.debug) {
            dbg_enter("ReasonParser.parse");
        }
        try {
            headerName(TokenTypes.REASON);
            this.lexer.SPorHT();
            while (this.lexer.lookAhead(0) != '\n') {
                Reason reason = new Reason();
                this.lexer.match(4095);
                reason.setProtocol(this.lexer.getNextToken().getTokenValue());
                super.parse(reason);
                reasonList.add(reason);
                if (this.lexer.lookAhead(0) == ',') {
                    this.lexer.match(44);
                    this.lexer.SPorHT();
                } else {
                    this.lexer.SPorHT();
                }
            }
            return reasonList;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("ReasonParser.parse");
            }
        }
    }

    public ReasonParser(Lexer lexer) {
        super(lexer);
    }
}
