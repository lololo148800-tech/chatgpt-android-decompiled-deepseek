package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.Server;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class ServerParser extends HeaderParser {
    public ServerParser(String str) {
        super(str);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("ServerParser.parse");
        }
        Server server = new Server();
        try {
            headerName(TokenTypes.SERVER);
            int i10 = 0;
            if (this.lexer.lookAhead(0) == '\n') {
                throw createParseException("empty header");
            }
            while (this.lexer.lookAhead(0) != '\n' && this.lexer.lookAhead(0) != 0) {
                if (this.lexer.lookAhead(0) == '(') {
                    server.addProductToken('(' + this.lexer.comment() + ')');
                } else {
                    try {
                        int iMarkInputPosition = this.lexer.markInputPosition();
                        try {
                            String string = this.lexer.getString('/');
                            if (string.charAt(string.length() - 1) == '\n') {
                                string = string.trim();
                            }
                            server.addProductToken(string);
                        } catch (ParseException unused) {
                            i10 = iMarkInputPosition;
                            this.lexer.rewindInputPosition(i10);
                            server.addProductToken(this.lexer.getRest().trim());
                            if (ParserCore.debug) {
                                dbg_leave("ServerParser.parse");
                            }
                            return server;
                        }
                    } catch (ParseException unused2) {
                    }
                }
            }
            if (ParserCore.debug) {
                dbg_leave("ServerParser.parse");
            }
            return server;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("ServerParser.parse");
            }
            throw th2;
        }
    }

    public ServerParser(Lexer lexer) {
        super(lexer);
    }
}
