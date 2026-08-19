package p222Ij;

import android.gov.nist.core.Separators;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Ij.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3739d {

    /* JADX INFO: renamed from: a */
    public final boolean f11385a;

    /* JADX INFO: renamed from: b */
    public final boolean f11386b;

    /* JADX INFO: renamed from: c */
    public final boolean f11387c;

    public C3739d(boolean z6, boolean z10, boolean z11) {
        this.f11385a = z6;
        this.f11386b = z10;
        this.f11387c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3739d)) {
            return false;
        }
        C3739d c3739d = (C3739d) obj;
        return this.f11385a == c3739d.f11385a && this.f11386b == c3739d.f11386b && this.f11387c == c3739d.f11387c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        boolean z6 = this.f11385a;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i10 = r6 * 31;
        boolean z10 = this.f11386b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i11 = (i10 + r10) * 31;
        boolean z11 = this.f11387c;
        return i11 + (z11 ? 1 : z11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenState(shouldShowBackButton=");
        sb2.append(this.f11385a);
        sb2.append(", shouldShowCancelButton=");
        sb2.append(this.f11386b);
        sb2.append(", isNavigationEnabled=");
        return AbstractC14376f.m15823B(sb2, this.f11387c, Separators.RPAREN);
    }
}
