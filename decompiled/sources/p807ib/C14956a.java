package p807ib;

import android.gov.nist.core.Separators;
import java.util.Arrays;

/* JADX INFO: renamed from: ib.a */
/* JADX INFO: loaded from: classes.dex */
public final class C14956a {

    /* JADX INFO: renamed from: a */
    public final byte[] f46583a;

    public C14956a(int i10, byte[] bArr) {
        byte[] bArr2 = new byte[i10];
        this.f46583a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14956a) {
            return Arrays.equals(((C14956a) obj).f46583a, this.f46583a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46583a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Bytes(");
        byte[] bArr = this.f46583a;
        StringBuilder sb3 = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i10 = b & 255;
            sb3.append("0123456789abcdef".charAt(i10 / 16));
            sb3.append("0123456789abcdef".charAt(i10 % 16));
        }
        sb2.append(sb3.toString());
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
