package mc;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import lc.C16842b;
import lc.EnumC16841a;
import p001A.AbstractC0010F;
import p030B2.C0781s;
import p785hc.C14443b;
import p808ic.AbstractC14961e;
import p808ic.C14957a;
import p826j6.C16137F;

/* JADX INFO: renamed from: mc.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17223b {

    /* JADX INFO: renamed from: a */
    public static final int[] f54962a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b */
    public static final Charset f54963b = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: a */
    public static void m18954a(String str, EnumC16841a enumC16841a, C14957a c14957a, Charset charset) {
        int i10;
        int iOrdinal = enumC16841a.ordinal();
        int i11 = 0;
        if (iOrdinal == 1) {
            int length = str.length();
            while (i11 < length) {
                int iCharAt = str.charAt(i11) - '0';
                int i12 = i11 + 2;
                if (i12 < length) {
                    c14957a.m16123b(((str.charAt(i11 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i12) - '0'), 10);
                    i11 += 3;
                } else {
                    i11++;
                    if (i11 < length) {
                        c14957a.m16123b((iCharAt * 10) + (str.charAt(i11) - '0'), 7);
                        i11 = i12;
                    } else {
                        c14957a.m16123b(iCharAt, 4);
                    }
                }
            }
            return;
        }
        if (iOrdinal == 2) {
            int length2 = str.length();
            while (i11 < length2) {
                char cCharAt = str.charAt(i11);
                int[] iArr = f54962a;
                int i13 = cCharAt < '`' ? iArr[cCharAt] : -1;
                if (i13 == -1) {
                    throw new C14443b();
                }
                int i14 = i11 + 1;
                if (i14 < length2) {
                    char cCharAt2 = str.charAt(i14);
                    int i15 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                    if (i15 == -1) {
                        throw new C14443b();
                    }
                    c14957a.m16123b((i13 * 45) + i15, 11);
                    i11 += 2;
                } else {
                    c14957a.m16123b(i13, 6);
                    i11 = i14;
                }
            }
            return;
        }
        if (iOrdinal == 4) {
            byte[] bytes = str.getBytes(charset);
            int length3 = bytes.length;
            while (i11 < length3) {
                c14957a.m16123b(bytes[i11], 8);
                i11++;
            }
            return;
        }
        if (iOrdinal != 6) {
            throw new C14443b("Invalid mode: " + enumC16841a);
        }
        byte[] bytes2 = str.getBytes(AbstractC14961e.f46600b);
        if (bytes2.length % 2 != 0) {
            throw new C14443b("Kanji byte size not even");
        }
        int length4 = bytes2.length - 1;
        while (i11 < length4) {
            int i16 = ((bytes2[i11] & 255) << 8) | (bytes2[i11 + 1] & 255);
            int i17 = 33088;
            if (i16 >= 33088 && i16 <= 40956) {
                i10 = i16 - i17;
            } else if (i16 < 57408 || i16 > 60351) {
                i10 = -1;
            } else {
                i17 = 49472;
                i10 = i16 - i17;
            }
            if (i10 == -1) {
                throw new C14443b("Invalid byte sequence");
            }
            c14957a.m16123b(((i10 >> 8) * 192) + (i10 & 255), 13);
            i11 += 2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18955b(String str) {
        byte[] bytes = str.getBytes(AbstractC14961e.f46600b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10 += 2) {
            int i11 = bytes[i10] & 255;
            if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m18956c(int i10, C16842b c16842b, int i11) {
        int i12 = c16842b.f54023c;
        C16137F c16137f = c16842b.f54022b[AbstractC0010F.m24h(i11)];
        int i13 = 0;
        for (C0781s c0781s : (C0781s[]) c16137f.f50064o0) {
            i13 += c0781s.f2192b;
        }
        return i12 - (i13 * c16137f.f50063Z) >= (i10 + 7) / 8;
    }
}
