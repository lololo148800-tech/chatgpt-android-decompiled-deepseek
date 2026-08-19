package p278L0;

import com.google.protobuf.AbstractC12107L1;
import p492U1.C7544i;
import p492U1.EnumC7546k;
import p635a1.C10449g;

/* JADX INFO: renamed from: L0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4862a implements InterfaceC4856U {

    /* JADX INFO: renamed from: a */
    public final C10449g f15830a;

    /* JADX INFO: renamed from: b */
    public final C10449g f15831b;

    /* JADX INFO: renamed from: c */
    public final int f15832c;

    public C4862a(C10449g c10449g, C10449g c10449g2, int i10) {
        this.f15830a = c10449g;
        this.f15831b = c10449g2;
        this.f15832c = i10;
    }

    @Override // p278L0.InterfaceC4856U
    /* JADX INFO: renamed from: a */
    public final int mo5503a(C7544i c7544i, long j10, int i10, EnumC7546k enumC7546k) {
        int iMo10924a = this.f15831b.mo10924a(0, c7544i.m7885b(), enumC7546k);
        int i11 = -this.f15830a.mo10924a(0, i10, enumC7546k);
        EnumC7546k enumC7546k2 = EnumC7546k.f23904Y;
        int i12 = this.f15832c;
        if (enumC7546k != enumC7546k2) {
            i12 = -i12;
        }
        return c7544i.f23899a + iMo10924a + i11 + i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4862a)) {
            return false;
        }
        C4862a c4862a = (C4862a) obj;
        return this.f15830a.equals(c4862a.f15830a) && this.f15831b.equals(c4862a.f15831b) && this.f15832c == c4862a.f15832c;
    }

    public final int hashCode() {
        return AbstractC12107L1.m13819j(this.f15831b.f30950a, Float.floatToIntBits(this.f15830a.f30950a) * 31, 31) + this.f15832c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Horizontal(menuAlignment=");
        sb2.append(this.f15830a);
        sb2.append(", anchorAlignment=");
        sb2.append(this.f15831b);
        sb2.append(", offset=");
        return AbstractC12107L1.m13826q(sb2, this.f15832c, ')');
    }
}
