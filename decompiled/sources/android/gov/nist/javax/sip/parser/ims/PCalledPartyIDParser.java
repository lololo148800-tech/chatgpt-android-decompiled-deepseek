package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PCalledPartyID;
import android.gov.nist.javax.sip.parser.AddressParametersParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;

/* JADX INFO: loaded from: classes.dex */
public class PCalledPartyIDParser extends AddressParametersParser {
    public PCalledPartyIDParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("PCalledPartyIDParser.parse");
        }
        try {
            this.lexer.match(TokenTypes.P_CALLED_PARTY_ID);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            PCalledPartyID pCalledPartyID = new PCalledPartyID();
            super.parse((AddressParametersHeader) pCalledPartyID);
            return pCalledPartyID;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("PCalledPartyIDParser.parse");
            }
        }
    }

    public PCalledPartyIDParser(Lexer lexer) {
        super(lexer);
    }
}
