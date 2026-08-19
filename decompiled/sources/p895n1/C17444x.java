package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.x */
/* JADX INFO: loaded from: classes.dex */
public final class C17444x extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55781c;

    /* JADX INFO: renamed from: d */
    public final float f55782d;

    public C17444x(float f10, float f11) {
        super(1, false, true);
        this.f55781c = f10;
        this.f55782d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17444x)) {
            return false;
        }
        C17444x c17444x = (C17444x) obj;
        return Float.compare(this.f55781c, c17444x.f55781c) == 0 && Float.compare(this.f55782d, c17444x.f55782d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55782d) + (Float.floatToIntBits(this.f55781c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f55781c);
        sb2.append(", dy=");
        return AbstractC12107L1.m13825p(sb2, this.f55782d, ')');
    }
}
