package p1158zn;

import java.io.Serializable;
import p1113xn.C21307a;
import p544W9.AbstractC8712t;

/* JADX INFO: renamed from: zn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C22214a implements Serializable {

    /* JADX INFO: renamed from: o0 */
    public static final C22214a f70399o0 = new C22214a(0, 0);

    /* JADX INFO: renamed from: Y */
    public final long f70400Y;

    /* JADX INFO: renamed from: Z */
    public final long f70401Z;

    public C22214a(long j10, long j11) {
        this.f70400Y = j10;
        this.f70401Z = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22214a)) {
            return false;
        }
        C22214a c22214a = (C22214a) obj;
        return this.f70400Y == c22214a.f70400Y && this.f70401Z == c22214a.f70401Z;
    }

    public final int hashCode() {
        long j10 = this.f70400Y ^ this.f70401Z;
        return ((int) j10) ^ ((int) (j10 >> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        long j10 = this.f70401Z;
        AbstractC8712t.m9420b(j10, bArr, 24, 6);
        bArr[23] = 45;
        AbstractC8712t.m9420b(j10 >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        long j11 = this.f70400Y;
        AbstractC8712t.m9420b(j11, bArr, 14, 2);
        bArr[13] = 45;
        AbstractC8712t.m9420b(j11 >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        AbstractC8712t.m9420b(j11 >>> 32, bArr, 0, 4);
        return new String(bArr, C21307a.f67720a);
    }
}
