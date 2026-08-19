package p1116y0;

import com.google.protobuf.AbstractC12107L1;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: y0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C21355d implements InterfaceC21357f {

    /* JADX INFO: renamed from: Y */
    public final int f67821Y;

    /* JADX INFO: renamed from: Z */
    public final int f67822Z;

    public C21355d(int i10, int i11) {
        i10 = (i11 & 2) != 0 ? Integer.MAX_VALUE : i10;
        this.f67821Y = 1;
        this.f67822Z = i10;
        if (1 > i10) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were ", 1, i10, ", ").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21355d.class != obj.getClass()) {
            return false;
        }
        C21355d c21355d = (C21355d) obj;
        return this.f67821Y == c21355d.f67821Y && this.f67822Z == c21355d.f67822Z;
    }

    public final int hashCode() {
        return (this.f67821Y * 31) + this.f67822Z;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiLine(minHeightInLines=");
        sb2.append(this.f67821Y);
        sb2.append(", maxHeightInLines=");
        return AbstractC12107L1.m13826q(sb2, this.f67822Z, ')');
    }
}
