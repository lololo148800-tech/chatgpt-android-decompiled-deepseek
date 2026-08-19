package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedService;
import android.gov.nist.javax.sip.header.ims.ParameterNamesIms;
import android.gov.nist.javax.sip.parser.HeaderParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.javax.sip.C10800g;

/* JADX INFO: loaded from: classes.dex */
public class PAssertedServiceParser extends HeaderParser implements TokenTypes {
    public PAssertedServiceParser(Lexer lexer) {
        super(lexer);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("PAssertedServiceParser.parse");
        }
        try {
            this.lexer.match(TokenTypes.P_ASSERTED_SERVICE);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            PAssertedService pAssertedService = new PAssertedService();
            String buffer = this.lexer.getBuffer();
            if (buffer.contains(ParameterNamesIms.SERVICE_ID)) {
                if (!buffer.contains(ParameterNamesIms.SERVICE_ID_LABEL)) {
                    if (!buffer.contains(ParameterNamesIms.APPLICATION_ID_LABEL)) {
                        try {
                            throw new C10800g("URN is not well formed");
                        } catch (C10800g e10) {
                            e10.printStackTrace();
                        }
                    } else if (buffer.split("3gpp-application.")[1].trim().equals("")) {
                        try {
                            throw new C10800g("URN should atleast have one sub-application");
                        } catch (C10800g e11) {
                            e11.printStackTrace();
                        }
                    } else {
                        pAssertedService.setApplicationIdentifiers(buffer.split(ParameterNamesIms.APPLICATION_ID_LABEL)[1]);
                    }
                    if (ParserCore.debug) {
                        dbg_enter("PAssertedServiceParser.parse");
                    }
                    throw th;
                }
                if (buffer.split("3gpp-service.")[1].trim().equals("")) {
                    try {
                        throw new C10800g("URN should atleast have one sub-service");
                    } catch (C10800g e12) {
                        e12.printStackTrace();
                    }
                } else {
                    pAssertedService.setSubserviceIdentifiers(buffer.split(ParameterNamesIms.SERVICE_ID_LABEL)[1]);
                }
            }
            super.parse();
            if (ParserCore.debug) {
                dbg_enter("PAssertedServiceParser.parse");
            }
            return pAssertedService;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_enter("PAssertedServiceParser.parse");
            }
            throw th2;
        }
    }

    public PAssertedServiceParser(String str) {
        super(str);
    }
}
