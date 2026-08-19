package android.gov.nist.javax.sip.address;

import android.gov.nist.core.Separators;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes.dex */
public class UriDecoder {
    static Charset utf8CharSet;

    static {
        try {
            utf8CharSet = Charset.forName("UTF8");
        } catch (UnsupportedCharsetException e10) {
            throw new RuntimeException("Problem in decodePath: UTF-8 charset not supported.", e10);
        }
    }

    public static String decode(String str) {
        int iIndexOf = str.indexOf(Separators.PERCENT);
        StringBuilder sb2 = new StringBuilder();
        while (iIndexOf != -1) {
            sb2.append(str.substring(0, iIndexOf));
            if (iIndexOf + 2 < str.length()) {
                String strSubstring = str.substring(iIndexOf + 1, iIndexOf + 3);
                try {
                    sb2.append(utf8CharSet.decode(ByteBuffer.wrap(new byte[]{(byte) Integer.parseInt(strSubstring, 16)})).toString());
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(AbstractC9306j0.m9889h("Illegal hex characters in pattern %", strSubstring));
                }
            }
            str = str.substring(iIndexOf + 3);
            iIndexOf = str.indexOf(Separators.PERCENT);
        }
        sb2.append(str);
        return sb2.toString();
    }
}
