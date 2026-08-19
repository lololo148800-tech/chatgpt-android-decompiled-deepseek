package p808ic;

import java.util.Arrays;

/* JADX INFO: renamed from: ic.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14957a implements Cloneable {

    /* JADX INFO: renamed from: o0 */
    public static final int[] f46584o0 = new int[0];

    /* JADX INFO: renamed from: Z */
    public int f46586Z = 0;

    /* JADX INFO: renamed from: Y */
    public int[] f46585Y = f46584o0;

    /* JADX INFO: renamed from: a */
    public final void m16122a(boolean z6) {
        m16124c(this.f46586Z + 1);
        if (z6) {
            int[] iArr = this.f46585Y;
            int i10 = this.f46586Z;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f46586Z++;
    }

    /* JADX INFO: renamed from: b */
    public final void m16123b(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i12 = this.f46586Z;
        m16124c(i12 + i11);
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            if (((1 << i13) & i10) != 0) {
                int[] iArr = this.f46585Y;
                int i14 = i12 / 32;
                iArr[i14] = iArr[i14] | (1 << (i12 & 31));
            }
            i12++;
        }
        this.f46586Z = i12;
    }

    /* JADX INFO: renamed from: c */
    public final void m16124c(int i10) {
        if (i10 > this.f46585Y.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i10 / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f46585Y;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f46585Y = iArr;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f46585Y.clone();
        int i10 = this.f46586Z;
        C14957a c14957a = new C14957a();
        c14957a.f46585Y = iArr;
        c14957a.f46586Z = i10;
        return c14957a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m16125d(int i10) {
        return ((1 << (i10 & 31)) & this.f46585Y[i10 / 32]) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m16126e() {
        return (this.f46586Z + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14957a)) {
            return false;
        }
        C14957a c14957a = (C14957a) obj;
        return this.f46586Z == c14957a.f46586Z && Arrays.equals(this.f46585Y, c14957a.f46585Y);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46585Y) + (this.f46586Z * 31);
    }

    public final String toString() {
        int i10 = this.f46586Z;
        StringBuilder sb2 = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.f46586Z; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(m16125d(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
