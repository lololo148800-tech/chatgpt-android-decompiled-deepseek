package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C17441u extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55771c;

    /* JADX INFO: renamed from: d */
    public final float f55772d;

    public C17441u(float f10, float f11) {
        super(3, false, false);
        this.f55771c = f10;
        this.f55772d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17441u)) {
            return false;
        }
        C17441u c17441u = (C17441u) obj;
        return Float.compare(this.f55771c, c17441u.f55771c) == 0 && Float.compare(this.f55772d, c17441u.f55772d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55772d) + (Float.floatToIntBits(this.f55771c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f55771c);
        sb2.append(", dy=");
        return AbstractC12107L1.m13825p(sb2, this.f55772d, ')');
    }
}
