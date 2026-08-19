package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPETag;
import android.gov.nist.javax.sip.header.SIPHeader;

/* JADX INFO: loaded from: classes.dex */
public class SIPETagParser extends HeaderParser {
    public SIPETagParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("SIPEtag.parse");
        }
        SIPETag sIPETag = new SIPETag();
        try {
            headerName(TokenTypes.SIP_ETAG);
            this.lexer.SPorHT();
            this.lexer.match(4095);
            sIPETag.setETag(this.lexer.getNextToken().getTokenValue());
            this.lexer.SPorHT();
            this.lexer.match(10);
            return sIPETag;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("SIPEtag.parse");
            }
        }
    }

    public SIPETagParser(Lexer lexer) {
        super(lexer);
    }
}
