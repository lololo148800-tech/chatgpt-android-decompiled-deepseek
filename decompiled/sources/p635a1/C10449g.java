package p635a1;

import com.google.protobuf.AbstractC12107L1;
import p228J.AbstractC3794B0;
import p492U1.EnumC7546k;

/* JADX INFO: renamed from: a1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10449g implements InterfaceC10445c {

    /* JADX INFO: renamed from: a */
    public final float f30950a;

    public C10449g(float f10) {
        this.f30950a = f10;
    }

    @Override // p635a1.InterfaceC10445c
    /* JADX INFO: renamed from: a */
    public final int mo10924a(int i10, int i11, EnumC7546k enumC7546k) {
        float f10 = (i11 - i10) / 2.0f;
        EnumC7546k enumC7546k2 = EnumC7546k.f23904Y;
        float f11 = this.f30950a;
        if (enumC7546k != enumC7546k2) {
            f11 *= -1;
        }
        return AbstractC3794B0.m4492q(1, f11, f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10449g) && Float.compare(this.f30950a, ((C10449g) obj).f30950a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f30950a);
    }

    public final String toString() {
        return AbstractC12107L1.m13825p(new StringBuilder("Horizontal(bias="), this.f30950a, ')');
    }
}
