package android.gov.nist.javax.sip.parser.extensions;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.extensions.References;
import android.gov.nist.javax.sip.parser.Lexer;
import android.gov.nist.javax.sip.parser.ParametersParser;
import android.gov.nist.javax.sip.parser.TokenTypes;

/* JADX INFO: loaded from: classes.dex */
public class ReferencesParser extends ParametersParser {
    public ReferencesParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("ReasonParser.parse");
        }
        try {
            headerName(TokenTypes.REFERENCES);
            References references = new References();
            this.lexer.SPorHT();
            references.setCallId(this.lexer.byteStringNoSemicolon());
            super.parse(references);
            return references;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("ReferencesParser.parse");
            }
        }
    }

    public ReferencesParser(Lexer lexer) {
        super(lexer);
    }
}
