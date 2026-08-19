package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.Subject;

/* JADX INFO: loaded from: classes.dex */
public class SubjectParser extends HeaderParser {
    public SubjectParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        Subject subject = new Subject();
        if (ParserCore.debug) {
            dbg_enter("SubjectParser.parse");
        }
        try {
            headerName(TokenTypes.SUBJECT);
            subject.setSubject(this.lexer.getRest().trim());
            return subject;
        } finally {
            if (ParserCore.debug) {
                dbg_leave("SubjectParser.parse");
            }
        }
    }

    public SubjectParser(Lexer lexer) {
        super(lexer);
    }
}
