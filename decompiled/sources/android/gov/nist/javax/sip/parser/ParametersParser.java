package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.NameValue;
import android.gov.nist.javax.sip.header.ParametersHeader;

/* JADX INFO: loaded from: classes.dex */
public abstract class ParametersParser extends HeaderParser {
    public ParametersParser(Lexer lexer) {
        super(lexer);
    }

    public void parse(ParametersHeader parametersHeader) {
        this.lexer.SPorHT();
        while (this.lexer.lookAhead(0) == ';') {
            this.lexer.consume(1);
            this.lexer.SPorHT();
            parametersHeader.setParameter(nameValue());
            this.lexer.SPorHT();
        }
    }

    public void parseNameValueList(ParametersHeader parametersHeader) {
        parametersHeader.removeParameters();
        while (true) {
            this.lexer.SPorHT();
            NameValue nameValue = nameValue();
            parametersHeader.setParameter(nameValue.getName(), (String) nameValue.getValueAsObject());
            this.lexer.SPorHT();
            if (this.lexer.lookAhead(0) != ';') {
                return;
            } else {
                this.lexer.consume(1);
            }
        }
    }

    public ParametersParser(String str) {
        super(str);
    }
}
