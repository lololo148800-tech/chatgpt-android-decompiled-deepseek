package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C17434n extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55745c;

    /* JADX INFO: renamed from: d */
    public final float f55746d;

    /* JADX INFO: renamed from: e */
    public final float f55747e;

    /* JADX INFO: renamed from: f */
    public final float f55748f;

    public C17434n(float f10, float f11, float f12, float f13) {
        super(1, false, true);
        this.f55745c = f10;
        this.f55746d = f11;
        this.f55747e = f12;
        this.f55748f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17434n)) {
            return false;
        }
        C17434n c17434n = (C17434n) obj;
        return Float.compare(this.f55745c, c17434n.f55745c) == 0 && Float.compare(this.f55746d, c17434n.f55746d) == 0 && Float.compare(this.f55747e, c17434n.f55747e) == 0 && Float.compare(this.f55748f, c17434n.f55748f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55748f) + AbstractC12107L1.m13819j(this.f55747e, AbstractC12107L1.m13819j(this.f55746d, Float.floatToIntBits(this.f55745c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f55745c);
        sb2.append(", y1=");
        sb2.append(this.f55746d);
        sb2.append(", x2=");
        sb2.append(this.f55747e);
        sb2.append(", y2=");
        return AbstractC12107L1.m13825p(sb2, this.f55748f, ')');
    }
}
