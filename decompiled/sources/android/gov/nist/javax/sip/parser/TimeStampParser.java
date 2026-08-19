package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.TimeStamp;
import android.javax.sip.C10800g;

/* JADX INFO: loaded from: classes.dex */
public class TimeStampParser extends HeaderParser {
    public TimeStampParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        boolean z6 = ParserCore.debug;
        if (z6) {
            dbg_enter("TimeStampParser.parse");
        }
        TimeStamp timeStamp = new TimeStamp();
        try {
            headerName(TokenTypes.TIMESTAMP);
            timeStamp.setHeaderName(SIPHeaderNames.TIMESTAMP);
            this.lexer.SPorHT();
            String strNumber = this.lexer.number();
            try {
                try {
                    if (this.lexer.lookAhead(0) == '.') {
                        this.lexer.match(46);
                        timeStamp.setTimeStamp(Float.parseFloat(strNumber + Separators.DOT + this.lexer.number()));
                    } else {
                        timeStamp.setTime(Long.parseLong(strNumber));
                    }
                    this.lexer.SPorHT();
                    if (this.lexer.lookAhead(0) != '\n') {
                        String strNumber2 = this.lexer.number();
                        try {
                            try {
                                if (this.lexer.lookAhead(0) == '.') {
                                    this.lexer.match(46);
                                    timeStamp.setDelay(Float.parseFloat(strNumber2 + Separators.DOT + this.lexer.number()));
                                } else {
                                    timeStamp.setDelay(Integer.parseInt(strNumber2));
                                }
                            } catch (C10800g e10) {
                                throw createParseException(e10.getMessage());
                            }
                        } catch (NumberFormatException e11) {
                            throw createParseException(e11.getMessage());
                        }
                    }
                    if (z6) {
                        dbg_leave("TimeStampParser.parse");
                    }
                    return timeStamp;
                } catch (C10800g e12) {
                    throw createParseException(e12.getMessage());
                }
            } catch (NumberFormatException e13) {
                throw createParseException(e13.getMessage());
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("TimeStampParser.parse");
            }
            throw th2;
        }
    }

    public TimeStampParser(Lexer lexer) {
        super(lexer);
    }
}
