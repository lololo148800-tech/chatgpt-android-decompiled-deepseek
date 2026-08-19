package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PProfileKey;
import android.gov.nist.javax.sip.parser.AddressParametersParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;

/* JADX INFO: loaded from: classes.dex */
public class PProfileKeyParser extends AddressParametersParser implements TokenTypes {
    public PProfileKeyParser(Lexer lexer) {
        super(lexer);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("PProfileKey.parse");
        }
        try {
            this.lexer.match(TokenTypes.P_PROFILE_KEY);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            PProfileKey pProfileKey = new PProfileKey();
            super.parse((AddressParametersHeader) pProfileKey);
            return pProfileKey;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("PProfileKey.parse");
            }
        }
    }

    public PProfileKeyParser(String str) {
        super(str);
    }
}
