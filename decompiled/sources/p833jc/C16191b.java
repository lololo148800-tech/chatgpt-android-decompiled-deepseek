package p833jc;

import livekit.org.webrtc.WebrtcBuildVersion;

/* JADX INFO: renamed from: jc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16191b {

    /* JADX INFO: renamed from: a */
    public final C16190a f50263a;

    /* JADX INFO: renamed from: b */
    public final int[] f50264b;

    public C16191b(C16190a c16190a, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f50263a = c16190a;
        int length = iArr.length;
        int i10 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f50264b = iArr;
            return;
        }
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f50264b = new int[]{0};
            return;
        }
        int i11 = length - i10;
        int[] iArr2 = new int[i11];
        this.f50264b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
    }

    /* JADX INFO: renamed from: a */
    public final C16191b m17800a(C16191b c16191b) {
        C16190a c16190a = c16191b.f50263a;
        C16190a c16190a2 = this.f50263a;
        if (!c16190a2.equals(c16190a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m17802c()) {
            return c16191b;
        }
        if (c16191b.m17802c()) {
            return this;
        }
        int[] iArr = this.f50264b;
        int length = iArr.length;
        int[] iArr2 = c16191b.f50264b;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i10 = length2; i10 < iArr.length; i10++) {
            iArr3[i10] = iArr2[i10 - length2] ^ iArr[i10];
        }
        return new C16191b(c16190a2, iArr3);
    }

    /* JADX INFO: renamed from: b */
    public final int m17801b() {
        return this.f50264b.length - 1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17802c() {
        return this.f50264b[0] == 0;
    }

    public final String toString() {
        if (m17802c()) {
            return WebrtcBuildVersion.maint_version;
        }
        StringBuilder sb2 = new StringBuilder(m17801b() * 8);
        for (int iM17801b = m17801b(); iM17801b >= 0; iM17801b--) {
            int[] iArr = this.f50264b;
            int i10 = iArr[(iArr.length - 1) - iM17801b];
            if (i10 != 0) {
                if (i10 < 0) {
                    if (iM17801b == m17801b()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    i10 = -i10;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iM17801b == 0 || i10 != 1) {
                    C16190a c16190a = this.f50263a;
                    if (i10 == 0) {
                        c16190a.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i11 = c16190a.f50258b[i10];
                    if (i11 == 0) {
                        sb2.append('1');
                    } else if (i11 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i11);
                    }
                }
                if (iM17801b != 0) {
                    if (iM17801b == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iM17801b);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
