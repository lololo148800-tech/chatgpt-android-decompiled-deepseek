package android.gov.nist.javax.sip.parser.ims;

import android.gov.nist.javax.sip.header.ims.AddressHeaderIms;
import android.gov.nist.javax.sip.parser.AddressParser;
import android.gov.nist.javax.sip.parser.HeaderParser;
import android.gov.nist.javax.sip.parser.Lexer;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
abstract class AddressHeaderParser extends HeaderParser {
    public AddressHeaderParser(Lexer lexer) {
        super(lexer);
    }

    public void parse(AddressHeaderIms addressHeaderIms) {
        dbg_enter("AddressHeaderParser.parse");
        try {
            try {
                addressHeaderIms.setAddress(new AddressParser(getLexer()).address(true));
                dbg_leave("AddressParametersParser.parse");
            } catch (ParseException e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            dbg_leave("AddressParametersParser.parse");
            throw th2;
        }
    }

    public AddressHeaderParser(String str) {
        super(str);
    }
}
