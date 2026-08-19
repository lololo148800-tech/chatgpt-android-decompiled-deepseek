package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C17436p extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55753c;

    /* JADX INFO: renamed from: d */
    public final float f55754d;

    public C17436p(float f10, float f11) {
        super(1, false, true);
        this.f55753c = f10;
        this.f55754d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17436p)) {
            return false;
        }
        C17436p c17436p = (C17436p) obj;
        return Float.compare(this.f55753c, c17436p.f55753c) == 0 && Float.compare(this.f55754d, c17436p.f55754d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55754d) + (Float.floatToIntBits(this.f55753c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f55753c);
        sb2.append(", y=");
        return AbstractC12107L1.m13825p(sb2, this.f55754d, ')');
    }
}
