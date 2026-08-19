package p278L0;

import com.google.protobuf.AbstractC12107L1;
import p492U1.C7544i;
import p635a1.C10450h;

/* JADX INFO: renamed from: L0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4864b implements InterfaceC4857V {

    /* JADX INFO: renamed from: a */
    public final C10450h f15836a;

    /* JADX INFO: renamed from: b */
    public final C10450h f15837b;

    /* JADX INFO: renamed from: c */
    public final int f15838c;

    public C4864b(C10450h c10450h, C10450h c10450h2, int i10) {
        this.f15836a = c10450h;
        this.f15837b = c10450h2;
        this.f15838c = i10;
    }

    @Override // p278L0.InterfaceC4857V
    /* JADX INFO: renamed from: a */
    public final int mo5504a(C7544i c7544i, long j10, int i10) {
        int iM10926a = this.f15837b.m10926a(0, c7544i.m7884a());
        return c7544i.f23900b + iM10926a + (-this.f15836a.m10926a(0, i10)) + this.f15838c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4864b)) {
            return false;
        }
        C4864b c4864b = (C4864b) obj;
        return this.f15836a.equals(c4864b.f15836a) && this.f15837b.equals(c4864b.f15837b) && this.f15838c == c4864b.f15838c;
    }

    public final int hashCode() {
        return AbstractC12107L1.m13819j(this.f15837b.f30951a, Float.floatToIntBits(this.f15836a.f30951a) * 31, 31) + this.f15838c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(menuAlignment=");
        sb2.append(this.f15836a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f15837b);
        sb2.append(", offset=");
        return AbstractC12107L1.m13826q(sb2, this.f15838c, ')');
    }
}
