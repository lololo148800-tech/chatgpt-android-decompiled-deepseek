package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.ReplyTo;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderNames;

/* JADX INFO: loaded from: classes.dex */
public class ReplyToParser extends AddressParametersParser {
    public ReplyToParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        ReplyTo replyTo = new ReplyTo();
        if (ParserCore.debug) {
            dbg_enter("ReplyTo.parse");
        }
        try {
            headerName(TokenTypes.REPLY_TO);
            replyTo.setHeaderName(SIPHeaderNames.REPLY_TO);
            super.parse((AddressParametersHeader) replyTo);
            return replyTo;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("ReplyTo.parse");
            }
        }
    }

    public ReplyToParser(Lexer lexer) {
        super(lexer);
    }
}
