package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.javax.sip.header.ContentLanguage;
import android.gov.nist.javax.sip.header.ContentLanguageList;
import android.gov.nist.javax.sip.header.SIPHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class ContentLanguageParser extends HeaderParser {
    public ContentLanguageParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() {
        if (ParserCore.debug) {
            dbg_enter("ContentLanguageParser.parse");
        }
        ContentLanguageList contentLanguageList = new ContentLanguageList();
        try {
            try {
                headerName(TokenTypes.CONTENT_LANGUAGE);
                while (this.lexer.lookAhead(0) != '\n') {
                    this.lexer.SPorHT();
                    this.lexer.match(4095);
                    ContentLanguage contentLanguage = new ContentLanguage(this.lexer.getNextToken().getTokenValue());
                    this.lexer.SPorHT();
                    contentLanguageList.add(contentLanguage);
                    while (this.lexer.lookAhead(0) == ',') {
                        this.lexer.match(44);
                        this.lexer.SPorHT();
                        this.lexer.match(4095);
                        this.lexer.SPorHT();
                        ContentLanguage contentLanguage2 = new ContentLanguage(this.lexer.getNextToken().getTokenValue());
                        this.lexer.SPorHT();
                        contentLanguageList.add(contentLanguage2);
                    }
                }
                if (ParserCore.debug) {
                    dbg_leave("ContentLanguageParser.parse");
                }
                return contentLanguageList;
            } catch (ParseException e10) {
                throw createParseException(e10.getMessage());
            }
        } catch (Throwable th2) {
            if (ParserCore.debug) {
                dbg_leave("ContentLanguageParser.parse");
            }
            throw th2;
        }
    }

    public ContentLanguageParser(Lexer lexer) {
        super(lexer);
    }
}
