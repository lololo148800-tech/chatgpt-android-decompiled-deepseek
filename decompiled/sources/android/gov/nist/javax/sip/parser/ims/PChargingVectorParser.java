package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.PChargingVector;
import android.gov.nist.javax.sip.header.ims.ParameterNamesIms;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.ParametersParser;
import android.gov.nist.javax.sip.parser.TokenTypes;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class PChargingVectorParser extends ParametersParser implements TokenTypes {
    public PChargingVectorParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("parse");
        }
        try {
            headerName(TokenTypes.P_VECTOR_CHARGING);
            PChargingVector pChargingVector = new PChargingVector();
            while (this.lexer.lookAhead(0) != '\n') {
                try {
                    parseParameter(pChargingVector);
                    this.lexer.SPorHT();
                    char cLookAhead = this.lexer.lookAhead(0);
                    if (cLookAhead == '\n' || cLookAhead == 0) {
                        break;
                        break;
                    }
                    this.lexer.match(59);
                    this.lexer.SPorHT();
                } catch (ParseException e10) {
                    throw e10;
                }
            }
            super.parse(pChargingVector);
            if (pChargingVector.getParameter(ParameterNamesIms.ICID_VALUE) == null) {
                throw new ParseException("Missing a required Parameter : icid-value", 0);
            }
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
            return pChargingVector;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
            throw th2;
        }
    }

    public void parseParameter(PChargingVector pChargingVector) {
        if (ParserCore.debug) {
            dbg_enter("parseParameter");
        }
        try {
            pChargingVector.setParameter(nameValue('='));
        } finally {
            if (ParserCore.debug) {
                dbg_leave("parseParameter");
            }
        }
    }

    public PChargingVectorParser(Lexer lexer) {
        super(lexer);
    }
}
