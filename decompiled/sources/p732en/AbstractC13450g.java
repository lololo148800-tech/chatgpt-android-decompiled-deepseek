package p732en;

/* JADX INFO: renamed from: en.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC13450g {

    /* JADX INFO: renamed from: a */
    public static final C13448e f42584a = new C13448e();

    /* JADX INFO: renamed from: b */
    public static final C13449f f42585b = new C13449f();

    /* JADX INFO: renamed from: a */
    public static int m14975a(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* JADX INFO: renamed from: b */
    public static int m14976b(byte[] bArr, int i10, int i11) {
        byte b = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i12 == 1) {
            return m14975a(b, bArr[i10]);
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if (b > -12 || b10 > -65 || b11 > -65) {
            return -1;
        }
        return ((b10 << 8) ^ b) ^ (b11 << 16);
    }

    /* JADX INFO: renamed from: c */
    public static int m14977c(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b = bArr[i10];
            if (b < 0) {
                if (b < -32) {
                    if (i12 >= i11) {
                        return b;
                    }
                    if (b >= -62) {
                        i10 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    if (i12 >= i11 - 1) {
                        return m14976b(bArr, i12, i11);
                    }
                    int i13 = i10 + 2;
                    byte b10 = bArr[i12];
                    if (b10 <= -65 && ((b != -32 || b10 >= -96) && (b != -19 || b10 < -96))) {
                        i10 += 3;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (i12 >= i11 - 2) {
                    return m14976b(bArr, i12, i11);
                }
                int i14 = i10 + 2;
                byte b11 = bArr[i12];
                if (b11 <= -65) {
                    if ((((b11 + 112) + (b << 28)) >> 30) == 0) {
                        int i15 = i10 + 3;
                        if (bArr[i14] <= -65) {
                            i10 += 4;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i10 = i12;
        }
        return 0;
    }
}
