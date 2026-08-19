package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.header.ExtensionHeaderImpl;
import android.gov.nist.javax.sip.header.SIPHeader;
import java.text.ParseException;
import java.util.Calendar;
import p817j$.util.DesugarTimeZone;

/* JADX INFO: loaded from: classes.dex */
public class HeaderParser extends Parser {
    public HeaderParser(String str) {
        this.lexer = new Lexer("command_keywordLexer", str);
    }

    public Calendar date() throws ParseException {
        try {
            Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("GMT"));
            int i10 = Integer.parseInt(this.lexer.number());
            if (i10 <= 0 || i10 > 31) {
                throw createParseException("Bad day ");
            }
            calendar.set(5, i10);
            this.lexer.match(32);
            String lowerCase = this.lexer.ttoken().toLowerCase();
            if (lowerCase.equals("jan")) {
                calendar.set(2, 0);
            } else if (lowerCase.equals("feb")) {
                calendar.set(2, 1);
            } else if (lowerCase.equals("mar")) {
                calendar.set(2, 2);
            } else if (lowerCase.equals("apr")) {
                calendar.set(2, 3);
            } else if (lowerCase.equals("may")) {
                calendar.set(2, 4);
            } else if (lowerCase.equals("jun")) {
                calendar.set(2, 5);
            } else if (lowerCase.equals("jul")) {
                calendar.set(2, 6);
            } else if (lowerCase.equals("aug")) {
                calendar.set(2, 7);
            } else if (lowerCase.equals("sep")) {
                calendar.set(2, 8);
            } else if (lowerCase.equals("oct")) {
                calendar.set(2, 9);
            } else if (lowerCase.equals("nov")) {
                calendar.set(2, 10);
            } else if (lowerCase.equals("dec")) {
                calendar.set(2, 11);
            }
            this.lexer.match(32);
            calendar.set(1, Integer.parseInt(this.lexer.number()));
            return calendar;
        } catch (Exception unused) {
            throw createParseException("bad date field");
        }
    }

    public void headerName(int i10) throws ParseException {
        this.lexer.match(i10);
        this.lexer.SPorHT();
        this.lexer.match(58);
        this.lexer.SPorHT();
    }

    public SIPHeader parse() throws ParseException {
        String nextToken = this.lexer.getNextToken(':');
        this.lexer.consume(1);
        String strTrim = this.lexer.getLine().trim();
        ExtensionHeaderImpl extensionHeaderImpl = new ExtensionHeaderImpl(nextToken);
        extensionHeaderImpl.setValue(strTrim);
        return extensionHeaderImpl;
    }

    public void time(Calendar calendar) throws ParseException {
        try {
            calendar.set(11, Integer.parseInt(this.lexer.number()));
            this.lexer.match(58);
            calendar.set(12, Integer.parseInt(this.lexer.number()));
            this.lexer.match(58);
            calendar.set(13, Integer.parseInt(this.lexer.number()));
        } catch (Exception unused) {
            throw createParseException("error processing time ");
        }
    }

    public int wkday() {
        dbg_enter("wkday");
        try {
            String lowerCase = this.lexer.ttoken().toLowerCase();
            if ("Mon".equalsIgnoreCase(lowerCase)) {
                dbg_leave("wkday");
                return 2;
            }
            if ("Tue".equalsIgnoreCase(lowerCase)) {
                dbg_leave("wkday");
                return 3;
            }
            if ("Wed".equalsIgnoreCase(lowerCase)) {
                dbg_leave("wkday");
                return 4;
            }
            if ("Thu".equalsIgnoreCase(lowerCase)) {
                dbg_leave("wkday");
                return 5;
            }
            if ("Fri".equalsIgnoreCase(lowerCase)) {
                dbg_leave("wkday");
                return 6;
            }
            if ("Sat".equalsIgnoreCase(lowerCase)) {
                dbg_leave("wkday");
                return 7;
            }
            if (!"Sun".equalsIgnoreCase(lowerCase)) {
                throw createParseException("bad wkday");
            }
            dbg_leave("wkday");
            return 1;
        } catch (Throwable th2) {
            dbg_leave("wkday");
            throw th2;
        }
    }

    public HeaderParser(Lexer lexer) {
        this.lexer = lexer;
        lexer.selectLexer("command_keywordLexer");
    }
}
