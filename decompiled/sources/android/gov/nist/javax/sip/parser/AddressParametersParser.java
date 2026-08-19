package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.gov.nist.javax.sip.header.ParametersHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class AddressParametersParser extends ParametersParser {
    protected boolean allowParameters;

    public AddressParametersParser(Lexer lexer) {
        super(lexer);
        this.allowParameters = true;
    }

    public void parse(AddressParametersHeader addressParametersHeader) {
        dbg_enter("AddressParametersParser.parse");
        try {
            try {
                addressParametersHeader.setAddress(new AddressParser(getLexer()).address(false));
                this.lexer.SPorHT();
                char cLookAhead = this.lexer.lookAhead(0);
                if (!this.lexer.hasMoreChars() || cLookAhead == 0 || cLookAhead == '\n' || !this.lexer.startsId()) {
                    if (!this.allowParameters) {
                        this.lexer.SPorHT();
                        if (this.lexer.lookAhead(0) == ';') {
                            throw new ParseException(this.lexer.getBuffer() + "is not valid. This header doesn't allow parameters", this.lexer.getPtr());
                        }
                    }
                    super.parse((ParametersHeader) addressParametersHeader);
                } else {
                    super.parseNameValueList(addressParametersHeader);
                }
                dbg_leave("AddressParametersParser.parse");
            } catch (ParseException e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            dbg_leave("AddressParametersParser.parse");
            throw th2;
        }
    }

    public AddressParametersParser(String str) {
        super(str);
        this.allowParameters = true;
    }
}
