package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Token;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.Warning;
import android.gov.nist.javax.sip.header.WarningList;
import android.javax.sip.C10800g;

/* JADX INFO: loaded from: classes.dex */
public class WarningParser extends HeaderParser {
    public WarningParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        WarningList warningList = new WarningList();
        if (ParserCore.debug) {
            dbg_enter("WarningParser.parse");
        }
        try {
            headerName(TokenTypes.WARNING);
            while (this.lexer.lookAhead(0) != '\n') {
                Warning warning = new Warning();
                warning.setHeaderName(SIPHeaderNames.WARNING);
                this.lexer.match(4095);
                try {
                    warning.setCode(Integer.parseInt(this.lexer.getNextToken().getTokenValue()));
                    this.lexer.SPorHT();
                    this.lexer.match(4095);
                    Token nextToken = this.lexer.getNextToken();
                    if (this.lexer.lookAhead(0) == ':') {
                        this.lexer.match(58);
                        this.lexer.match(4095);
                        warning.setAgent(nextToken.getTokenValue() + ":" + this.lexer.getNextToken().getTokenValue());
                    } else {
                        warning.setAgent(nextToken.getTokenValue());
                    }
                    this.lexer.SPorHT();
                    warning.setText(this.lexer.quotedString());
                    this.lexer.SPorHT();
                    warningList.add(warning);
                    while (this.lexer.lookAhead(0) == ',') {
                        this.lexer.match(44);
                        this.lexer.SPorHT();
                        Warning warning2 = new Warning();
                        this.lexer.match(4095);
                        try {
                            warning2.setCode(Integer.parseInt(this.lexer.getNextToken().getTokenValue()));
                            this.lexer.SPorHT();
                            this.lexer.match(4095);
                            Token nextToken2 = this.lexer.getNextToken();
                            if (this.lexer.lookAhead(0) == ':') {
                                this.lexer.match(58);
                                this.lexer.match(4095);
                                warning2.setAgent(nextToken2.getTokenValue() + ":" + this.lexer.getNextToken().getTokenValue());
                            } else {
                                warning2.setAgent(nextToken2.getTokenValue());
                            }
                            this.lexer.SPorHT();
                            warning2.setText(this.lexer.quotedString());
                            this.lexer.SPorHT();
                            warningList.add(warning2);
                        } catch (C10800g e10) {
                            throw createParseException(e10.getMessage());
                        } catch (NumberFormatException e11) {
                            throw createParseException(e11.getMessage());
                        }
                    }
                } catch (C10800g e12) {
                    throw createParseException(e12.getMessage());
                } catch (NumberFormatException e13) {
                    throw createParseException(e13.getMessage());
                }
            }
            if (ParserCore.debug) {
                dbg_leave("WarningParser.parse");
            }
            return warningList;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("WarningParser.parse");
            }
            throw th2;
        }
    }

    public WarningParser(Lexer lexer) {
        super(lexer);
    }
}
