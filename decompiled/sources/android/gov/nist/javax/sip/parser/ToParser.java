package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.C10766To;
import android.gov.nist.javax.sip.header.SIPHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class ToParser extends AddressParametersParser {
    public ToParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() throws ParseException {
        headerName(TokenTypes.f32027TO);
        C10766To c10766To = new C10766To();
        super.parse((AddressParametersHeader) c10766To);
        this.lexer.match(10);
        return c10766To;
    }

    public ToParser(Lexer lexer) {
        super(lexer);
    }
}
