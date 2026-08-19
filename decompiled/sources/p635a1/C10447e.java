package p635a1;

import com.google.protobuf.AbstractC12107L1;
import p228J.AbstractC3794B0;
import p492U1.EnumC7546k;

/* JADX INFO: renamed from: a1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10447e implements InterfaceC10445c {

    /* JADX INFO: renamed from: a */
    public final float f30948a;

    public C10447e(float f10) {
        this.f30948a = f10;
    }

    @Override // p635a1.InterfaceC10445c
    /* JADX INFO: renamed from: a */
    public final int mo10924a(int i10, int i11, EnumC7546k enumC7546k) {
        return AbstractC3794B0.m4492q(1, this.f30948a, (i11 - i10) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10447e) && Float.compare(this.f30948a, ((C10447e) obj).f30948a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f30948a);
    }

    public final String toString() {
        return AbstractC12107L1.m13825p(new StringBuilder("Horizontal(bias="), this.f30948a, ')');
    }
}
