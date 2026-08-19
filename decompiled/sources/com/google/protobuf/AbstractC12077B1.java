package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.B1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12077B1 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC12153g f36870a;

    static {
        f36870a = (AbstractC12209y1.f37126e && AbstractC12209y1.f37125d && !AbstractC12144d.m13942a()) ? new C12212z1(1) : new C12212z1(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m13720a(byte[] bArr, int i10, int i11) {
        byte b = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b > -12) {
                b = -1;
            }
            return b;
        }
        if (i12 == 1) {
            return m13722c(b, bArr[i10]);
        }
        if (i12 == 2) {
            return m13723d(b, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: b */
    public static int m13721b(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new C12074A1(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + 4294967296L));
    }

    /* JADX INFO: renamed from: c */
    public static int m13722c(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* JADX INFO: renamed from: d */
    public static int m13723d(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m13724e(byte[] bArr, int i10, int i11) {
        return f36870a.mo13994X(bArr, i10, i11) == 0;
    }
}
