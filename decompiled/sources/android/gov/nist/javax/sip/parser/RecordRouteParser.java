package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.RecordRoute;
import android.gov.nist.javax.sip.header.RecordRouteList;
import android.gov.nist.javax.sip.header.SIPHeader;

/* JADX INFO: loaded from: classes.dex */
public class RecordRouteParser extends AddressParametersParser {
    public RecordRouteParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        char cLookAhead;
        RecordRouteList recordRouteList = new RecordRouteList();
        if (ParserCore.debug) {
            dbg_enter("RecordRouteParser.parse");
        }
        try {
            this.lexer.match(TokenTypes.RECORD_ROUTE);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            while (true) {
                RecordRoute recordRoute = new RecordRoute();
                super.parse((AddressParametersHeader) recordRoute);
                recordRouteList.add(recordRoute);
                this.lexer.SPorHT();
                cLookAhead = this.lexer.lookAhead(0);
                if (cLookAhead != ',') {
                    break;
                }
                this.lexer.match(44);
                this.lexer.SPorHT();
            }
            if (cLookAhead != '\n') {
                throw createParseException("unexpected char");
            }
            if (ParserCore.debug) {
                dbg_leave("RecordRouteParser.parse");
            }
            return recordRouteList;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("RecordRouteParser.parse");
            }
            throw th2;
        }
    }

    public RecordRouteParser(Lexer lexer) {
        super(lexer);
    }
}
