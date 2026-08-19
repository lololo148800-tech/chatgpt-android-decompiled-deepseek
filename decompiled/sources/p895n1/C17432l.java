package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C17432l extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55741c;

    /* JADX INFO: renamed from: d */
    public final float f55742d;

    public C17432l(float f10, float f11) {
        super(3, false, false);
        this.f55741c = f10;
        this.f55742d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17432l)) {
            return false;
        }
        C17432l c17432l = (C17432l) obj;
        return Float.compare(this.f55741c, c17432l.f55741c) == 0 && Float.compare(this.f55742d, c17432l.f55742d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55742d) + (Float.floatToIntBits(this.f55741c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f55741c);
        sb2.append(", y=");
        return AbstractC12107L1.m13825p(sb2, this.f55742d, ')');
    }
}
