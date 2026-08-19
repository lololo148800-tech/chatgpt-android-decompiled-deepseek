package p278L0;

import com.google.protobuf.AbstractC12107L1;
import p228J.AbstractC3794B0;
import p492U1.C7544i;
import p530Vi.AbstractC8301I;
import p635a1.C10450h;

/* JADX INFO: renamed from: L0.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4885l0 implements InterfaceC4857V {

    /* JADX INFO: renamed from: a */
    public final C10450h f15924a;

    /* JADX INFO: renamed from: b */
    public final int f15925b;

    public C4885l0(C10450h c10450h, int i10) {
        this.f15924a = c10450h;
        this.f15925b = i10;
    }

    @Override // p278L0.InterfaceC4857V
    /* JADX INFO: renamed from: a */
    public final int mo5504a(C7544i c7544i, long j10, int i10) {
        int i11 = (int) (j10 & 4294967295L);
        int i12 = this.f15925b;
        if (i10 < i11 - (i12 * 2)) {
            return AbstractC8301I.m8921l(this.f15924a.m10926a(i10, i11), i12, (i11 - i12) - i10);
        }
        return AbstractC3794B0.m4492q(1, 0.0f, (i11 - i10) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4885l0)) {
            return false;
        }
        C4885l0 c4885l0 = (C4885l0) obj;
        return this.f15924a.equals(c4885l0.f15924a) && this.f15925b == c4885l0.f15925b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f15924a.f30951a) * 31) + this.f15925b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(alignment=");
        sb2.append(this.f15924a);
        sb2.append(", margin=");
        return AbstractC12107L1.m13826q(sb2, this.f15925b, ')');
    }
}
