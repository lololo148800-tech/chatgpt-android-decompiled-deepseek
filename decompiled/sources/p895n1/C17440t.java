package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C17440t extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55769c;

    /* JADX INFO: renamed from: d */
    public final float f55770d;

    public C17440t(float f10, float f11) {
        super(3, false, false);
        this.f55769c = f10;
        this.f55770d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17440t)) {
            return false;
        }
        C17440t c17440t = (C17440t) obj;
        return Float.compare(this.f55769c, c17440t.f55769c) == 0 && Float.compare(this.f55770d, c17440t.f55770d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55770d) + (Float.floatToIntBits(this.f55769c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f55769c);
        sb2.append(", dy=");
        return AbstractC12107L1.m13825p(sb2, this.f55770d, ')');
    }
}
