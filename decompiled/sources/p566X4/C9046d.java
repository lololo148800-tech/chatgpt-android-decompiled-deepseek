package p566X4;

import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: X4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9046d {

    /* JADX INFO: renamed from: a */
    public final boolean f27617a;

    /* JADX INFO: renamed from: b */
    public final boolean f27618b;

    /* JADX INFO: renamed from: c */
    public final boolean f27619c;

    /* JADX INFO: renamed from: d */
    public final boolean f27620d;

    public C9046d(boolean z6, boolean z10, boolean z11, boolean z12) {
        this.f27617a = z6;
        this.f27618b = z10;
        this.f27619c = z11;
        this.f27620d = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9046d)) {
            return false;
        }
        C9046d c9046d = (C9046d) obj;
        return this.f27617a == c9046d.f27617a && this.f27618b == c9046d.f27618b && this.f27619c == c9046d.f27619c && this.f27620d == c9046d.f27620d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        boolean z6 = this.f27617a;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = r6 * 31;
        boolean z10 = this.f27618b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i11 = (i10 + r10) * 31;
        boolean z11 = this.f27619c;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i12 = (i11 + r11) * 31;
        boolean z12 = this.f27620d;
        return i12 + (z12 ? 1 : z12);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkState(isConnected=");
        sb2.append(this.f27617a);
        sb2.append(", isValidated=");
        sb2.append(this.f27618b);
        sb2.append(", isMetered=");
        sb2.append(this.f27619c);
        sb2.append(", isNotRoaming=");
        return AbstractC3794B0.m4499x(sb2, this.f27620d, ')');
    }
}
