package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.StatusLine;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class StatusLineParser extends Parser {
    public StatusLineParser(String str) {
        this.lexer = new Lexer("status_lineLexer", str);
    }

    public StatusLine parse() {
        try {
            if (ParserCore.debug) {
                dbg_enter("parse");
            }
            StatusLine statusLine = new StatusLine();
            statusLine.setSipVersion(sipVersion());
            this.lexer.SPorHT();
            statusLine.setStatusCode(statusCode());
            this.lexer.SPorHT();
            statusLine.setReasonPhrase(reasonPhrase());
            this.lexer.SPorHT();
            return statusLine;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("parse");
            }
        }
    }

    public String reasonPhrase() {
        return this.lexer.getRest().trim();
    }

    public int statusCode() {
        String strNumber = this.lexer.number();
        boolean z6 = ParserCore.debug;
        if (z6) {
            dbg_enter("statusCode");
        }
        try {
            try {
                int i10 = Integer.parseInt(strNumber);
                if (z6) {
                    dbg_leave("statusCode");
                }
                return i10;
            } catch (NumberFormatException e10) {
                throw new ParseException(this.lexer.getBuffer() + ":" + e10.getMessage(), this.lexer.getPtr());
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("statusCode");
            }
            throw th2;
        }
    }

    public StatusLineParser(Lexer lexer) {
        this.lexer = lexer;
        lexer.selectLexer("status_lineLexer");
    }
}
