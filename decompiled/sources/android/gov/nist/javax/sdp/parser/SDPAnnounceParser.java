package android.gov.nist.javax.sdp.parser;

import android.gov.nist.core.ParserCore;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.SessionDescriptionImpl;
import java.text.ParseException;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class SDPAnnounceParser extends ParserCore {
    protected Lexer lexer;
    protected Vector sdpMessage;

    public SDPAnnounceParser(Vector vector) {
        this.sdpMessage = vector;
    }

    public SessionDescriptionImpl parse() throws ParseException {
        SessionDescriptionImpl sessionDescriptionImpl = new SessionDescriptionImpl();
        for (int i10 = 0; i10 < this.sdpMessage.size(); i10++) {
            SDPParser sDPParserCreateParser = ParserFactory.createParser((String) this.sdpMessage.elementAt(i10));
            sessionDescriptionImpl.addField(sDPParserCreateParser != null ? sDPParserCreateParser.parse() : null);
        }
        return sessionDescriptionImpl;
    }

    public SDPAnnounceParser(String str) {
        String strSubstring;
        int i10;
        int i11;
        if (str == null) {
            return;
        }
        this.sdpMessage = new Vector();
        String str2 = str.trim() + Separators.NEWLINE;
        int i12 = 0;
        String str3 = null;
        while (i12 < str2.length()) {
            int iIndexOf = str2.indexOf(Separators.RETURN, i12);
            int iIndexOf2 = str2.indexOf("\r", i12);
            if (iIndexOf >= 0 && iIndexOf2 < 0) {
                strSubstring = str2.substring(i12, iIndexOf);
            } else {
                if (iIndexOf < 0 && iIndexOf2 >= 0) {
                    strSubstring = str2.substring(i12, iIndexOf2);
                } else {
                    if (iIndexOf < 0 || iIndexOf2 < 0) {
                        if (iIndexOf < 0 && iIndexOf2 < 0) {
                            return;
                        }
                    } else if (iIndexOf > iIndexOf2) {
                        strSubstring = str2.substring(i12, iIndexOf2);
                        i11 = iIndexOf2 + 1;
                        if (iIndexOf != i11) {
                            str3 = strSubstring;
                            i12 = i11;
                        }
                    } else {
                        strSubstring = str2.substring(i12, iIndexOf);
                        i10 = iIndexOf + 1;
                        if (iIndexOf2 != i10) {
                            str3 = strSubstring;
                            i12 = i10;
                        }
                    }
                    this.sdpMessage.addElement(str3);
                }
                i11 = iIndexOf2 + 1;
                str3 = strSubstring;
                i12 = i11;
                this.sdpMessage.addElement(str3);
            }
            i10 = iIndexOf + 1;
            str3 = strSubstring;
            i12 = i10;
            this.sdpMessage.addElement(str3);
        }
    }
}
