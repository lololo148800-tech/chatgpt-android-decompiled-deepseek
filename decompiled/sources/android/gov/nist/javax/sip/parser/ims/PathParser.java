package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.ims.Path;
import android.gov.nist.javax.sip.header.ims.PathList;
import android.gov.nist.javax.sip.parser.AddressParametersParser;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.TokenTypes;

/* JADX INFO: loaded from: classes.dex */
public class PathParser extends AddressParametersParser implements TokenTypes {
    public PathParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        char cLookAhead;
        PathList pathList = new PathList();
        if (ParserCore.debug) {
            dbg_enter("PathParser.parse");
        }
        try {
            this.lexer.match(TokenTypes.PATH);
            this.lexer.SPorHT();
            this.lexer.match(58);
            this.lexer.SPorHT();
            while (true) {
                Path path = new Path();
                super.parse((AddressParametersHeader) path);
                pathList.add(path);
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
                dbg_leave("PathParser.parse");
            }
            return pathList;
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("PathParser.parse");
            }
            throw th2;
        }
    }

    public PathParser(Lexer lexer) {
        super(lexer);
    }
}
