package p725eb;

import java.util.Arrays;

/* JADX INFO: renamed from: eb.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13358c {

    /* JADX INFO: renamed from: a */
    public static final byte[] f42399a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < 10; i10++) {
            bArr[i10 + 48] = (byte) i10;
        }
        for (int i11 = 0; i11 < 26; i11++) {
            byte b = (byte) (i11 + 10);
            bArr[i11 + 65] = b;
            bArr[i11 + 97] = b;
        }
        f42399a = bArr;
    }
}
