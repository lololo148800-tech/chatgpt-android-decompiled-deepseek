package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredService;
import android.gov.nist.javax.sip.header.ims.ParameterNamesIms;
import android.gov.nist.javax.sip.parser.HeaderParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.javax.sip.C10800g;

/* JADX INFO: loaded from: classes.dex */
public class PPreferredServiceParser extends HeaderParser implements TokenTypes {
    public PPreferredServiceParser(Lexer lexer) {
        super(lexer);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("PPreferredServiceParser.parse");
        }
        try {
            this.lexer.match(TokenTypes.P_PREFERRED_SERVICE);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            PPreferredService pPreferredService = new PPreferredService();
            String buffer = this.lexer.getBuffer();
            if (buffer.contains(ParameterNamesIms.SERVICE_ID)) {
                if (!buffer.contains(ParameterNamesIms.SERVICE_ID_LABEL)) {
                    if (buffer.contains(ParameterNamesIms.APPLICATION_ID_LABEL)) {
                        String str = buffer.split(ParameterNamesIms.APPLICATION_ID_LABEL)[1];
                        if (str.trim().equals("")) {
                            try {
                                throw new C10800g("URN should atleast have one sub-application");
                            } catch (C10800g e10) {
                                e10.printStackTrace();
                            }
                        } else {
                            pPreferredService.setApplicationIdentifiers(str);
                        }
                    } else {
                        try {
                            throw new C10800g("URN is not well formed");
                        } catch (C10800g e11) {
                            e11.printStackTrace();
                        }
                    }
                    if (ParserCore.debug) {
                        dbg_enter("PPreferredServiceParser.parse");
                    }
                    throw th;
                }
                String str2 = buffer.split("3gpp-service.")[1];
                if (str2.trim().equals("")) {
                    try {
                        throw new C10800g("URN should atleast have one sub-service");
                    } catch (C10800g e12) {
                        e12.printStackTrace();
                    }
                } else {
                    pPreferredService.setSubserviceIdentifiers(str2);
                }
            }
            super.parse();
            if (ParserCore.debug) {
                dbg_enter("PPreferredServiceParser.parse");
            }
            return pPreferredService;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_enter("PPreferredServiceParser.parse");
            }
            throw th2;
        }
    }

    public PPreferredServiceParser(String str) {
        super(str);
    }
}
