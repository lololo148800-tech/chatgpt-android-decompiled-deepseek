package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C17435o extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55749c;

    /* JADX INFO: renamed from: d */
    public final float f55750d;

    /* JADX INFO: renamed from: e */
    public final float f55751e;

    /* JADX INFO: renamed from: f */
    public final float f55752f;

    public C17435o(float f10, float f11, float f12, float f13) {
        super(2, true, false);
        this.f55749c = f10;
        this.f55750d = f11;
        this.f55751e = f12;
        this.f55752f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17435o)) {
            return false;
        }
        C17435o c17435o = (C17435o) obj;
        return Float.compare(this.f55749c, c17435o.f55749c) == 0 && Float.compare(this.f55750d, c17435o.f55750d) == 0 && Float.compare(this.f55751e, c17435o.f55751e) == 0 && Float.compare(this.f55752f, c17435o.f55752f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55752f) + AbstractC12107L1.m13819j(this.f55751e, AbstractC12107L1.m13819j(this.f55750d, Float.floatToIntBits(this.f55749c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f55749c);
        sb2.append(", y1=");
        sb2.append(this.f55750d);
        sb2.append(", x2=");
        sb2.append(this.f55751e);
        sb2.append(", y2=");
        return AbstractC12107L1.m13825p(sb2, this.f55752f, ')');
    }
}
