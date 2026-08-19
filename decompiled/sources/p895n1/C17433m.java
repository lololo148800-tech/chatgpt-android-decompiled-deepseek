package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C17433m extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55743c;

    /* JADX INFO: renamed from: d */
    public final float f55744d;

    public C17433m(float f10, float f11) {
        super(3, false, false);
        this.f55743c = f10;
        this.f55744d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17433m)) {
            return false;
        }
        C17433m c17433m = (C17433m) obj;
        return Float.compare(this.f55743c, c17433m.f55743c) == 0 && Float.compare(this.f55744d, c17433m.f55744d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55744d) + (Float.floatToIntBits(this.f55743c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f55743c);
        sb2.append(", y=");
        return AbstractC12107L1.m13825p(sb2, this.f55744d, ')');
    }
}
