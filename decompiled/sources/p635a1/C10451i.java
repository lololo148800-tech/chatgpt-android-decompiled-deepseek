package p635a1;

import com.google.protobuf.AbstractC12107L1;
import p492U1.EnumC7546k;
import p571X9.AbstractC9101A4;

/* JADX INFO: renamed from: a1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10451i implements InterfaceC10446d {

    /* JADX INFO: renamed from: a */
    public final float f30952a;

    /* JADX INFO: renamed from: b */
    public final float f30953b;

    public C10451i(float f10, float f11) {
        this.f30952a = f10;
        this.f30953b = f11;
    }

    @Override // p635a1.InterfaceC10446d
    /* JADX INFO: renamed from: a */
    public final long mo10925a(long j10, long j11, EnumC7546k enumC7546k) {
        float f10 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        EnumC7546k enumC7546k2 = EnumC7546k.f23904Y;
        float f12 = this.f30952a;
        if (enumC7546k != enumC7546k2) {
            f12 *= -1;
        }
        float f13 = 1;
        return AbstractC9101A4.m9631a(Math.round((f12 + f13) * f10), Math.round((f13 + this.f30953b) * f11));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10451i)) {
            return false;
        }
        C10451i c10451i = (C10451i) obj;
        return Float.compare(this.f30952a, c10451i.f30952a) == 0 && Float.compare(this.f30953b, c10451i.f30953b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f30953b) + (Float.floatToIntBits(this.f30952a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f30952a);
        sb2.append(", verticalBias=");
        return AbstractC12107L1.m13825p(sb2, this.f30953b, ')');
    }
}
