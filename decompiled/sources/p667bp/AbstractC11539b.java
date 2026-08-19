package p667bp;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: renamed from: bp.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11539b {

    /* JADX INFO: renamed from: a */
    public static final HashMap f34910a;

    static {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(AbstractC11539b.class.getResourceAsStream("/org/commonmark/internal/util/entities.txt"), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        map.put("NewLine", Separators.RETURN);
                        f34910a = map;
                        return;
                    } else if (line.length() != 0) {
                        int iIndexOf = line.indexOf(Separators.EQUALS);
                        map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
                throw new IllegalStateException("Failed reading data for HTML named character references", e);
            }
        } catch (IOException e10) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m12931a(String str) {
        int i10;
        if (str.startsWith(Separators.AND) && str.endsWith(Separators.SEMICOLON)) {
            String strSubstring = str.substring(1, str.length() - 1);
            if (strSubstring.startsWith(Separators.POUND)) {
                String strSubstring2 = strSubstring.substring(1);
                if (strSubstring2.startsWith("x") || strSubstring2.startsWith(TokenNames.f32022X)) {
                    strSubstring2 = strSubstring2.substring(1);
                    i10 = 16;
                } else {
                    i10 = 10;
                }
                try {
                    int i11 = Integer.parseInt(strSubstring2, i10);
                    return i11 == 0 ? "�" : new String(Character.toChars(i11));
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            }
            String str2 = (String) f34910a.get(strSubstring);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }
}
