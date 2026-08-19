package android.gov.nist.core;

import java.text.ParseException;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ParserCore {
    public static final boolean debug = Debug.parserDebug;
    static int nesting_level;
    protected LexerCore lexer;

    public void dbg_enter(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < nesting_level; i10++) {
            sb2.append(Separators.GREATER_THAN);
        }
        if (debug) {
            System.out.println(((Object) sb2) + str + "\nlexer buffer = \n" + this.lexer.getRest());
        }
        nesting_level++;
    }

    public void dbg_leave(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < nesting_level; i10++) {
            sb2.append(Separators.LESS_THAN);
        }
        if (debug) {
            System.out.println(((Object) sb2) + str + "\nlexer buffer = \n" + this.lexer.getRest());
        }
        nesting_level--;
    }

    public NameValue nameValue(char c9) {
        boolean z6;
        boolean z10 = debug;
        if (z10) {
            dbg_enter("nameValue");
        }
        try {
            this.lexer.match(4095);
            Token nextToken = this.lexer.getNextToken();
            this.lexer.SPorHT();
            try {
                String strQuotedString = "";
                boolean z11 = true;
                if (this.lexer.lookAhead(0) != c9) {
                    NameValue nameValue = new NameValue(nextToken.tokenValue, "", true);
                    if (z10) {
                        dbg_leave("nameValue");
                    }
                    return nameValue;
                }
                this.lexer.consume(1);
                this.lexer.SPorHT();
                char cLookAhead = this.lexer.lookAhead(0);
                if (cLookAhead == '\"') {
                    strQuotedString = this.lexer.quotedString();
                    z6 = true;
                    z11 = false;
                } else {
                    if (cLookAhead == '[') {
                        this.lexer.match(LexerCore.IPV6);
                        String str = this.lexer.getNextToken().tokenValue;
                        if (str != null) {
                            strQuotedString = str;
                            z11 = false;
                        }
                    } else {
                        this.lexer.match(4095);
                        String str2 = this.lexer.getNextToken().tokenValue;
                        if (str2 != null) {
                            strQuotedString = str2;
                            z6 = false;
                            z11 = false;
                        }
                    }
                    z6 = false;
                }
                NameValue nameValue2 = new NameValue(nextToken.tokenValue, strQuotedString, z11);
                if (z6) {
                    nameValue2.setQuotedValue();
                }
                if (z10) {
                    dbg_leave("nameValue");
                }
                return nameValue2;
            } catch (ParseException unused) {
                NameValue nameValue3 = new NameValue(nextToken.tokenValue, null, false);
                if (debug) {
                    dbg_leave("nameValue");
                }
                return nameValue3;
            }
        } catch (Throwable th2) {
            if (debug) {
                dbg_leave("nameValue");
            }
            throw th2;
        }
    }

    public void peekLine(String str) {
        if (debug) {
            StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, Separators.f31991SP);
            sbM9895n.append(this.lexer.peekLine());
            Debug.println(sbM9895n.toString());
        }
    }

    public NameValue nameValue() {
        return nameValue('=');
    }
}
