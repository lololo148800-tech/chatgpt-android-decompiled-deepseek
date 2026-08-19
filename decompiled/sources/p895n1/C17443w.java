package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C17443w extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55777c;

    /* JADX INFO: renamed from: d */
    public final float f55778d;

    /* JADX INFO: renamed from: e */
    public final float f55779e;

    /* JADX INFO: renamed from: f */
    public final float f55780f;

    public C17443w(float f10, float f11, float f12, float f13) {
        super(2, true, false);
        this.f55777c = f10;
        this.f55778d = f11;
        this.f55779e = f12;
        this.f55780f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17443w)) {
            return false;
        }
        C17443w c17443w = (C17443w) obj;
        return Float.compare(this.f55777c, c17443w.f55777c) == 0 && Float.compare(this.f55778d, c17443w.f55778d) == 0 && Float.compare(this.f55779e, c17443w.f55779e) == 0 && Float.compare(this.f55780f, c17443w.f55780f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55780f) + AbstractC12107L1.m13819j(this.f55779e, AbstractC12107L1.m13819j(this.f55778d, Float.floatToIntBits(this.f55777c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f55777c);
        sb2.append(", dy1=");
        sb2.append(this.f55778d);
        sb2.append(", dx2=");
        sb2.append(this.f55779e);
        sb2.append(", dy2=");
        return AbstractC12107L1.m13825p(sb2, this.f55780f, ')');
    }
}
