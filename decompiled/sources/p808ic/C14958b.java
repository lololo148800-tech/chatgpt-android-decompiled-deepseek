package p808ic;

import android.gov.nist.core.Separators;
import java.util.Arrays;

/* JADX INFO: renamed from: ic.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C14958b implements Cloneable {

    /* JADX INFO: renamed from: Y */
    public int f46587Y;

    /* JADX INFO: renamed from: Z */
    public int f46588Z;

    /* JADX INFO: renamed from: o0 */
    public int f46589o0;

    /* JADX INFO: renamed from: p0 */
    public int[] f46590p0;

    /* JADX INFO: renamed from: a */
    public final boolean m16127a(int i10, int i11) {
        return ((this.f46590p0[(i10 / 32) + (i11 * this.f46589o0)] >>> (i10 & 31)) & 1) != 0;
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f46590p0.clone();
        C14958b c14958b = new C14958b();
        c14958b.f46587Y = this.f46587Y;
        c14958b.f46588Z = this.f46588Z;
        c14958b.f46589o0 = this.f46589o0;
        c14958b.f46590p0 = iArr;
        return c14958b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14958b)) {
            return false;
        }
        C14958b c14958b = (C14958b) obj;
        return this.f46587Y == c14958b.f46587Y && this.f46588Z == c14958b.f46588Z && this.f46589o0 == c14958b.f46589o0 && Arrays.equals(this.f46590p0, c14958b.f46590p0);
    }

    public final int hashCode() {
        int i10 = this.f46587Y;
        return Arrays.hashCode(this.f46590p0) + (((((((i10 * 31) + i10) * 31) + this.f46588Z) * 31) + this.f46589o0) * 31);
    }

    public final String toString() {
        int i10 = this.f46587Y;
        int i11 = this.f46588Z;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i11);
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                sb2.append(m16127a(i13, i12) ? "X " : "  ");
            }
            sb2.append(Separators.RETURN);
        }
        return sb2.toString();
    }
}
