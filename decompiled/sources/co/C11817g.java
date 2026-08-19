package co;

/* JADX INFO: renamed from: co.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C11817g {

    /* JADX INFO: renamed from: a */
    public static final char[] f35820a = new char[117];

    /* JADX INFO: renamed from: b */
    public static final byte[] f35821b = new byte[126];

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
        }
        m13093a('b', 8);
        m13093a('t', 9);
        m13093a('n', 10);
        m13093a('f', 12);
        m13093a('r', 13);
        m13093a('/', 47);
        m13093a('\"', 34);
        m13093a('\\', 92);
        while (true) {
            byte[] bArr = f35821b;
            if (i10 >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i10] = 127;
            i10++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m13093a(char c9, int i10) {
        if (c9 != 'u') {
            f35820a[c9] = (char) i10;
        }
    }
}
