package p449S9;

/* JADX INFO: renamed from: S9.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7039H {

    /* JADX INFO: renamed from: Y */
    public static final char[] f22491Y = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z6;
        if (obj instanceof AbstractC7039H) {
            AbstractC7039H abstractC7039H = (AbstractC7039H) obj;
            byte[] bArr = ((C7038G) this).f22490Z;
            if (bArr.length * 8 == ((C7038G) abstractC7039H).f22490Z.length * 8) {
                byte[] bArr2 = ((C7038G) abstractC7039H).f22490Z;
                if (bArr.length == bArr2.length) {
                    z6 = true;
                    for (int i10 = 0; i10 < bArr.length; i10++) {
                        z6 &= bArr[i10] == bArr2[i10];
                    }
                } else {
                    z6 = false;
                }
                if (z6) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((C7038G) this).f22490Z;
        if (bArr.length * 8 >= 32) {
            int length = bArr.length;
            if (length >= 4) {
                return (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
            }
            throw new IllegalStateException(AbstractC7057a.m7459d("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i10 = bArr[0] & 255;
        for (int i11 = 1; i11 < bArr.length; i11++) {
            i10 |= (bArr[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public final String toString() {
        byte[] bArr = ((C7038G) this).f22490Z;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b : bArr) {
            char[] cArr = f22491Y;
            sb2.append(cArr[(b >> 4) & 15]);
            sb2.append(cArr[b & 15]);
        }
        return sb2.toString();
    }
}
