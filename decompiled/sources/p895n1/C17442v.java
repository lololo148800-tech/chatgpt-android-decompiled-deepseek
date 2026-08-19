package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C17442v extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55773c;

    /* JADX INFO: renamed from: d */
    public final float f55774d;

    /* JADX INFO: renamed from: e */
    public final float f55775e;

    /* JADX INFO: renamed from: f */
    public final float f55776f;

    public C17442v(float f10, float f11, float f12, float f13) {
        super(1, false, true);
        this.f55773c = f10;
        this.f55774d = f11;
        this.f55775e = f12;
        this.f55776f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17442v)) {
            return false;
        }
        C17442v c17442v = (C17442v) obj;
        return Float.compare(this.f55773c, c17442v.f55773c) == 0 && Float.compare(this.f55774d, c17442v.f55774d) == 0 && Float.compare(this.f55775e, c17442v.f55775e) == 0 && Float.compare(this.f55776f, c17442v.f55776f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55776f) + AbstractC12107L1.m13819j(this.f55775e, AbstractC12107L1.m13819j(this.f55774d, Float.floatToIntBits(this.f55773c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f55773c);
        sb2.append(", dy1=");
        sb2.append(this.f55774d);
        sb2.append(", dx2=");
        sb2.append(this.f55775e);
        sb2.append(", dy2=");
        return AbstractC12107L1.m13825p(sb2, this.f55776f, ')');
    }
}
