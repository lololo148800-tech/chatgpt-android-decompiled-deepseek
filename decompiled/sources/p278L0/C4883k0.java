package p278L0;

import p228J.AbstractC3794B0;
import p492U1.C7544i;
import p492U1.EnumC7546k;
import p530Vi.AbstractC8301I;
import p635a1.C10447e;

/* JADX INFO: renamed from: L0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4883k0 implements InterfaceC4856U {

    /* JADX INFO: renamed from: a */
    public final C10447e f15919a;

    public C4883k0(C10447e c10447e) {
        this.f15919a = c10447e;
    }

    @Override // p278L0.InterfaceC4856U
    /* JADX INFO: renamed from: a */
    public final int mo5503a(C7544i c7544i, long j10, int i10, EnumC7546k enumC7546k) {
        int i11 = (int) (j10 >> 32);
        if (i10 < i11) {
            return AbstractC8301I.m8921l(this.f15919a.mo10924a(i10, i11, enumC7546k), 0, i11 - i10);
        }
        return AbstractC3794B0.m4492q(1, enumC7546k != EnumC7546k.f23904Y ? 0.0f * (-1) : 0.0f, (i11 - i10) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4883k0) {
            return this.f15919a.equals(((C4883k0) obj).f15919a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f15919a.f30948a) * 31;
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.f15919a + ", margin=0)";
    }
}
