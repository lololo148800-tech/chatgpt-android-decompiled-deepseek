package p254K0;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: K0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C4524u {

    /* JADX INFO: renamed from: a */
    public final int f14785a;

    /* JADX INFO: renamed from: b */
    public final int f14786b;

    /* JADX INFO: renamed from: c */
    public final float f14787c;

    public C4524u(float f10, int i10, int i11) {
        this.f14785a = i10;
        this.f14786b = i11;
        this.f14787c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4524u)) {
            return false;
        }
        C4524u c4524u = (C4524u) obj;
        return this.f14785a == c4524u.f14785a && this.f14786b == c4524u.f14786b && Float.compare(this.f14787c, c4524u.f14787c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f14787c) + (((this.f14785a * 31) + this.f14786b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShiftPointRange(fromStepIndex=");
        sb2.append(this.f14785a);
        sb2.append(", toStepIndex=");
        sb2.append(this.f14786b);
        sb2.append(", steppedInterpolation=");
        return AbstractC12107L1.m13825p(sb2, this.f14787c, ')');
    }
}
