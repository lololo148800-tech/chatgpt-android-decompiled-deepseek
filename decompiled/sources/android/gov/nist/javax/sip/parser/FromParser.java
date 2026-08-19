package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.SIPHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class FromParser extends AddressParametersParser {
    public FromParser(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() throws ParseException {
        From from = new From();
        headerName(TokenTypes.FROM);
        super.parse((AddressParametersHeader) from);
        this.lexer.match(10);
        return from;
    }

    public FromParser(Lexer lexer) {
        super(lexer);
    }
}
