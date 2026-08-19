package p895n1;

import com.google.protobuf.AbstractC12107L1;

/* JADX INFO: renamed from: n1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C17430j extends AbstractC17413A {

    /* JADX INFO: renamed from: c */
    public final float f55734c;

    /* JADX INFO: renamed from: d */
    public final float f55735d;

    /* JADX INFO: renamed from: e */
    public final float f55736e;

    /* JADX INFO: renamed from: f */
    public final float f55737f;

    /* JADX INFO: renamed from: g */
    public final float f55738g;

    /* JADX INFO: renamed from: h */
    public final float f55739h;

    public C17430j(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2, true, false);
        this.f55734c = f10;
        this.f55735d = f11;
        this.f55736e = f12;
        this.f55737f = f13;
        this.f55738g = f14;
        this.f55739h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17430j)) {
            return false;
        }
        C17430j c17430j = (C17430j) obj;
        return Float.compare(this.f55734c, c17430j.f55734c) == 0 && Float.compare(this.f55735d, c17430j.f55735d) == 0 && Float.compare(this.f55736e, c17430j.f55736e) == 0 && Float.compare(this.f55737f, c17430j.f55737f) == 0 && Float.compare(this.f55738g, c17430j.f55738g) == 0 && Float.compare(this.f55739h, c17430j.f55739h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f55739h) + AbstractC12107L1.m13819j(this.f55738g, AbstractC12107L1.m13819j(this.f55737f, AbstractC12107L1.m13819j(this.f55736e, AbstractC12107L1.m13819j(this.f55735d, Float.floatToIntBits(this.f55734c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f55734c);
        sb2.append(", y1=");
        sb2.append(this.f55735d);
        sb2.append(", x2=");
        sb2.append(this.f55736e);
        sb2.append(", y2=");
        sb2.append(this.f55737f);
        sb2.append(", x3=");
        sb2.append(this.f55738g);
        sb2.append(", y3=");
        return AbstractC12107L1.m13825p(sb2, this.f55739h, ')');
    }
}
