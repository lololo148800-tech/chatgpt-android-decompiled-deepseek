package p523V9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p895n1.C17425e;

/* JADX INFO: renamed from: V9.L5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7934L5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25159a;

    /* JADX INFO: renamed from: a */
    public static void m8227a(InputStream inputStream, OutputStream out) throws IOException {
        AbstractC16544l.m18094g(out, "out");
        byte[] bArr = new byte[8192];
        int i10 = inputStream.read(bArr);
        while (i10 >= 0) {
            out.write(bArr, 0, i10);
            i10 = inputStream.read(bArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8228b(String current, String str) {
        AbstractC16544l.m18094g(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < current.length()) {
                char cCharAt = current.charAt(i10);
                int i13 = i12 + 1;
                if (i12 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt != ')' || (i11 = i11 - 1) != 0 || i12 == current.length() - 1) {
                    }
                    i10++;
                    i12 = i13;
                }
            }
            if (i11 == 0) {
                String strSubstring = current.substring(1, current.length() - 1);
                AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return AbstractC16544l.m18089b(AbstractC21322p.m21711s0(strSubstring).toString(), str);
            }
        }
        return false;
    }
}
