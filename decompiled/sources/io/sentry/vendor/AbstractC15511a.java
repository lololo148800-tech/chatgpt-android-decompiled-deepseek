package io.sentry.vendor;

/* JADX INFO: renamed from: io.sentry.vendor.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15511a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f48439a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: a */
    public static byte[] m16690a(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = f48439a;
        int i10 = (length / 3) * 4;
        int i11 = length % 3;
        if (i11 == 1) {
            i10 += 2;
        } else if (i11 == 2) {
            i10 += 3;
        }
        byte[] bArr3 = new byte[i10];
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            int i15 = i12 + 3;
            if (i15 > length) {
                break;
            }
            int i16 = (bArr[i12 + 2] & 255) | ((bArr[i12] & 255) << 16) | ((bArr[i12 + 1] & 255) << 8);
            bArr3[i14] = bArr2[(i16 >> 18) & 63];
            bArr3[i14 + 1] = bArr2[(i16 >> 12) & 63];
            bArr3[i14 + 2] = bArr2[(i16 >> 6) & 63];
            bArr3[i14 + 3] = bArr2[i16 & 63];
            int i17 = i14 + 4;
            i13--;
            if (i13 == 0) {
                i14 += 5;
                bArr3[i17] = 10;
                i13 = 19;
            } else {
                i14 = i17;
            }
            i12 = i15;
        }
        if (i12 == length - 1) {
            int i18 = (bArr[i12] & 255) << 4;
            bArr3[i14] = bArr2[(i18 >> 6) & 63];
            bArr3[i14 + 1] = bArr2[i18 & 63];
        } else if (i12 == length - 2) {
            int i19 = ((bArr[i12 + 1] & 255) << 2) | ((bArr[i12] & 255) << 10);
            bArr3[i14] = bArr2[(i19 >> 12) & 63];
            bArr3[i14 + 1] = bArr2[(i19 >> 6) & 63];
            bArr3[i14 + 2] = bArr2[i19 & 63];
        }
        return bArr3;
    }
}
