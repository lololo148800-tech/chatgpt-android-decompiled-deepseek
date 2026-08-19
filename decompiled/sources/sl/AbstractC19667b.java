package sl;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p488Tn.AbstractC7527j;
import p488Tn.C7518a;
import p488Tn.C7524g;
import p544W9.AbstractC8694q;
import p544W9.AbstractC8700r;

/* JADX INFO: renamed from: sl.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC19667b {

    /* JADX INFO: renamed from: a */
    public static final int[] f62333a;

    static {
        int[] iArr = new int[256];
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = AbstractC21322p.m21678L("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i10, 0, false, 6);
        }
        f62333a = iArr;
    }

    /* JADX INFO: renamed from: a */
    public static final String m20645a(String str) {
        String strSubstring;
        int i10;
        AbstractC16544l.m18094g(str, "<this>");
        C7518a c7518a = new C7518a();
        int iM21674H = AbstractC21322p.m21674H(str);
        while (true) {
            if (-1 >= iM21674H) {
                strSubstring = "";
                break;
            }
            if (str.charAt(iM21674H) != '=') {
                strSubstring = str.substring(0, iM21674H + 1);
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                break;
            }
            iM21674H--;
        }
        AbstractC8700r.m9409e(c7518a, strSubstring);
        C7518a c7518a2 = new C7518a();
        byte[] bArr = new byte[4];
        while (AbstractC8694q.m9397d(c7518a) > 0) {
            int iMo7814N = c7518a.mo7814N(bArr, 0, 4);
            if (iMo7814N == -1) {
                iMo7814N = 0;
            }
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < 4) {
                i12 |= ((byte) (((byte) f62333a[bArr[i11] & 255]) & 63)) << ((3 - i13) * 6);
                i11++;
                i13++;
            }
            int i14 = 4 - iMo7814N;
            if (i14 <= 2) {
                while (true) {
                    C7524g c7524gM7824m = c7518a2.m7824m(1);
                    int i15 = c7524gM7824m.f23856c;
                    c7524gM7824m.f23856c = i15 + 1;
                    c7524gM7824m.f23854a[i15] = (byte) ((i12 >> (i10 * 8)) & 255);
                    c7518a2.f23841o0++;
                    i10 = i10 != i14 ? i10 - 1 : 2;
                }
            }
        }
        byte[] bArrM7841g = AbstractC7527j.m7841g(c7518a2, -1);
        return AbstractC21329w.m21724k(bArrM7841g, bArrM7841g.length, 4);
    }

    /* JADX INFO: renamed from: b */
    public static final String m20646b(String str) throws EOFException {
        int i10;
        int i11;
        AbstractC16544l.m18094g(str, "<this>");
        C7518a c7518a = new C7518a();
        AbstractC8700r.m9409e(c7518a, str);
        byte[] bArrM7841g = AbstractC7527j.m7841g(c7518a, -1);
        int i12 = 3;
        char[] cArr = new char[((bArrM7841g.length * 8) / 6) + 3];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = i13 + 3;
            if (i15 > bArrM7841g.length) {
                break;
            }
            int i16 = (bArrM7841g[i13 + 2] & 255) | ((bArrM7841g[i13] & 255) << 16) | ((bArrM7841g[i13 + 1] & 255) << 8);
            int i17 = 3;
            while (-1 < i17) {
                cArr[i14] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i16 >> (i17 * 6)) & 63);
                i17--;
                i14++;
            }
            i13 = i15;
        }
        int length = bArrM7841g.length - i13;
        if (length == 0) {
            return AbstractC21329w.m21721h(cArr, 0, i14);
        }
        if (length == 1) {
            i10 = (bArrM7841g[i13] & 255) << 16;
        } else {
            i10 = ((bArrM7841g[i13 + 1] & 255) << 8) | ((bArrM7841g[i13] & 255) << 16);
        }
        int i18 = ((3 - length) * 8) / 6;
        if (i18 <= 3) {
            while (true) {
                i11 = i14 + 1;
                cArr[i14] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i10 >> (i12 * 6)) & 63);
                if (i12 == i18) {
                    break;
                }
                i12--;
                i14 = i11;
            }
            i14 = i11;
        }
        int i19 = 0;
        while (i19 < i18) {
            cArr[i14] = '=';
            i19++;
            i14++;
        }
        return AbstractC21329w.m21721h(cArr, 0, i14);
    }
}
