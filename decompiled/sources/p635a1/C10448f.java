package p635a1;

import p492U1.EnumC7546k;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9113C4;

/* JADX INFO: renamed from: a1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10448f implements InterfaceC10446d {

    /* JADX INFO: renamed from: a */
    public final float f30949a;

    public C10448f(float f10) {
        this.f30949a = f10;
    }

    @Override // p635a1.InterfaceC10446d
    /* JADX INFO: renamed from: a */
    public final long mo10925a(long j10, long j11, EnumC7546k enumC7546k) {
        long jM9643a = AbstractC9113C4.m9643a(((int) (j11 >> 32)) - ((int) (j10 >> 32)), ((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L)));
        float f10 = 1;
        return AbstractC9101A4.m9631a(Math.round((this.f30949a + f10) * (((int) (jM9643a >> 32)) / 2.0f)), Math.round((f10 - 1.0f) * (((int) (jM9643a & 4294967295L)) / 2.0f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10448f) {
            return Float.compare(this.f30949a, ((C10448f) obj).f30949a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(this.f30949a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f30949a + ", verticalBias=-1.0)";
    }
}
